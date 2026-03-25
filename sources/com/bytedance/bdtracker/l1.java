package com.bytedance.bdtracker;

import com.bytedance.applog.log.ILogProcessor;
import com.bytedance.applog.log.LogInfo;
import com.bytedance.applog.log.LogInfoBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class l1 implements ILogProcessor {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l1(d dVar) {
        LogInfoBuilder logInfoBuilderThread = LogInfo.builder().appId(dVar.m).level(1).thread(Thread.currentThread().getName());
        StringBuilder sbA = a.a("Console logger debug is:");
        sbA.append(dVar.G);
        onLog(logInfoBuilderThread.message(sbA.toString()).build());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.log.ILogProcessor
    public void onLog(LogInfo logInfo) {
        int level = logInfo.getLevel();
        if (level == 2 || !(level == 3 || level == 4 || level == 5)) {
            logInfo.toLiteString();
        } else {
            logInfo.toLiteString();
            logInfo.getThrowable();
        }
    }
}
