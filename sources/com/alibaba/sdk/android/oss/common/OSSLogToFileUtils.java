package com.alibaba.sdk.android.oss.common;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class OSSLogToFileUtils {
    private static final String LOG_DIR_NAME = "OSSLog";
    private static OSSLogToFileUtils instance;
    private static Context sContext;
    private static File sLogFile;
    private boolean useSdCard = true;
    private static LogThreadPoolManager logService = LogThreadPoolManager.newInstance();
    private static SimpleDateFormat sLogSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static long LOG_MAX_SIZE = CacheDataSink.DEFAULT_FRAGMENT_SIZE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void reset() {
        sContext = null;
        instance = null;
        sLogFile = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUseSdCard(boolean z) {
        this.useSdCard = z;
    }

    private OSSLogToFileUtils() {
    }

    public static void init(Context context, ClientConfiguration clientConfiguration) {
        File file;
        OSSLog.logDebug("init ...", false);
        if (clientConfiguration != null) {
            LOG_MAX_SIZE = clientConfiguration.getMaxLogSize();
        }
        if (sContext == null || instance == null || (file = sLogFile) == null || !file.exists()) {
            sContext = context.getApplicationContext();
            instance = getInstance();
            logService.addExecuteTask(new Runnable() { // from class: com.alibaba.sdk.android.oss.common.OSSLogToFileUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    File unused = OSSLogToFileUtils.sLogFile = OSSLogToFileUtils.instance.getLogFile();
                    if (OSSLogToFileUtils.sLogFile != null) {
                        OSSLog.logInfo("LogFilePath is: " + OSSLogToFileUtils.sLogFile.getPath(), false);
                        if (OSSLogToFileUtils.LOG_MAX_SIZE < OSSLogToFileUtils.getLogFileSize(OSSLogToFileUtils.sLogFile)) {
                            OSSLog.logInfo("init reset log file", false);
                            OSSLogToFileUtils.instance.resetLogFile();
                        }
                    }
                }
            });
            return;
        }
        OSSLog.logDebug("LogToFileUtils has been init ...", false);
    }

    public static OSSLogToFileUtils getInstance() {
        if (instance == null) {
            synchronized (OSSLogToFileUtils.class) {
                if (instance == null) {
                    instance = new OSSLogToFileUtils();
                }
            }
        }
        return instance;
    }

    public static long getLogFileSize(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public static long getLocalLogFileSize() {
        return getLogFileSize(sLogFile);
    }

    private long readSDCardSpace() {
        long availableBlocks;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } else {
            availableBlocks = 0;
        }
        OSSLog.logDebug("sd卡存储空间:" + String.valueOf(availableBlocks) + "kb", false);
        return availableBlocks;
    }

    private long readSystemSpace() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
        long availableBlocks = (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1024;
        OSSLog.logDebug("内部存储空间:" + String.valueOf(availableBlocks) + "kb", false);
        return availableBlocks;
    }

    public void resetLogFile() {
        OSSLog.logDebug("Reset Log File ... ", false);
        if (!sLogFile.getParentFile().exists()) {
            OSSLog.logDebug("Reset Log make File dir ... ", false);
            sLogFile.getParentFile().mkdir();
        }
        File file = new File(sLogFile.getParent() + "/logs.csv");
        if (file.exists()) {
            file.delete();
        }
        createNewFile(file);
    }

    public void deleteLogFile() {
        File file = new File(sLogFile.getParent() + "/logs.csv");
        if (file.exists()) {
            OSSLog.logDebug("delete Log File ... ", false);
            file.delete();
        }
    }

    public void deleteLogFileDir() {
        deleteLogFile();
        File file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + LOG_DIR_NAME);
        if (file.exists()) {
            OSSLog.logDebug("delete Log FileDir ... ", false);
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getLogFile() {
        boolean z;
        File file;
        if (this.useSdCard && Environment.getExternalStorageState().equals("mounted")) {
            z = readSDCardSpace() > LOG_MAX_SIZE / 1024;
            file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + LOG_DIR_NAME);
        } else {
            z = readSystemSpace() > LOG_MAX_SIZE / 1024;
            file = new File(sContext.getFilesDir().getPath() + File.separator + LOG_DIR_NAME);
        }
        if (!z) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file.getPath() + "/logs.csv");
        if (file2.exists()) {
            return file2;
        }
        createNewFile(file2);
        return file2;
    }

    public void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {
            OSSLog.logError("Create log file failure !!! " + e.toString(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFunctionInfo(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            return null;
        }
        return "[" + sLogSDF.format(new Date()) + "]";
    }

    public void write(Object obj) {
        File file;
        synchronized (this) {
            if (OSSLog.isEnableLog()) {
                if (sContext != null && instance != null && (file = sLogFile) != null) {
                    if (!file.exists()) {
                        resetLogFile();
                    }
                    logService.addExecuteTask(new WriteCall(obj));
                }
            }
        }
    }

    public static class WriteCall implements Runnable {
        private Object mStr;

        public WriteCall(Object obj) {
            this.mStr = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OSSLogToFileUtils.sLogFile != null) {
                OSSLogToFileUtils.getInstance();
                if (OSSLogToFileUtils.getLogFileSize(OSSLogToFileUtils.sLogFile) > OSSLogToFileUtils.LOG_MAX_SIZE) {
                    OSSLogToFileUtils.getInstance().resetLogFile();
                }
                try {
                    PrintWriter printWriter = new PrintWriter((Writer) new FileWriter(OSSLogToFileUtils.sLogFile, true), true);
                    if (this.mStr instanceof Throwable) {
                        printEx(printWriter);
                    } else {
                        printWriter.println(OSSLogToFileUtils.getInstance().getFunctionInfo(null) + " - " + this.mStr.toString());
                    }
                    printWriter.println("------>end of log");
                    printWriter.println();
                    printWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private PrintWriter printEx(PrintWriter printWriter) {
            printWriter.println("crash_time：" + OSSLogToFileUtils.sLogSDF.format(new Date()));
            ((Throwable) this.mStr).printStackTrace(printWriter);
            return printWriter;
        }
    }
}
