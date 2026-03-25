package com.bytedance.applog.log;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NativeLoggerImpl extends LoggerImpl {
    private String tag;

    public NativeLoggerImpl() {
        this.tag = "NativeLoggerImpl";
    }

    public NativeLoggerImpl(String str) {
        this.tag = str;
    }

    @Override // com.bytedance.applog.log.AbstractAppLogLogger
    public void process(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
        LogInfo logInfoBuild = LogInfo.builder().category(i).level(i2).thread(Thread.currentThread().getName()).throwable(th).tags(getTags(list)).message(format(str, objArr)).build();
        int level = logInfoBuild.getLevel();
        if (level == 0) {
            logInfoBuild.toMessage();
            logInfoBuild.getThrowable();
            return;
        }
        if (level == 2) {
            logInfoBuild.toMessage();
            logInfoBuild.getThrowable();
            return;
        }
        if (level == 3) {
            logInfoBuild.toMessage();
            logInfoBuild.getThrowable();
        } else if (level == 4 || level == 5) {
            logInfoBuild.toMessage();
            logInfoBuild.getThrowable();
        } else {
            logInfoBuild.toMessage();
            logInfoBuild.getThrowable();
        }
    }
}
