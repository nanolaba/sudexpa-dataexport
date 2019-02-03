package ru.sudexpa.workflow.dataexport.impl;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Assert;
import org.junit.Test;
import ru.sudexpa.workflow.dataexport.ExportData;
import ru.sudexpa.workflow.dataexport.FileData;

import java.io.IOException;

public class FileDataManagerImplTest {

    @Test
    public void testStart() throws IOException {

        System.err.println(System.getProperty("sw.email.queue"));
        System.err.println(System.getenv("sw.email.queue"));
//        System.err.println(System.getenv());
//        System.err.println(System.getProperties());

        ExportData data = createNewData();

        FileExportManagerImpl importManager = new FileExportManagerImpl();
        importManager.setFolder("/opt/test/export_import");
        importManager.init();

        FileImportManagerImpl exportManager = new FileImportManagerImpl() {
            @Override
            public void importData(ExportData d) {
                System.out.println(ToStringBuilder.reflectionToString(d, ToStringStyle.MULTI_LINE_STYLE, true));
                Assert.assertEquals(data, d);
            }
        };
        exportManager.setInterval(1000);
        exportManager.setFolder("/opt/test/export_import");
        exportManager.init();

        importManager.exportData(data);

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private ExportData createNewData() throws IOException {
        ExportData exportData = new ExportData();
        exportData.setFiles(new FileData[]{new FileData("test", "plain", IOUtils.toByteArray(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.txt")))});
        return exportData;
    }
}
