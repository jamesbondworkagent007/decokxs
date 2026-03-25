package com.bytedance.bdtracker;

import com.bytedance.applog.ILogger;
import com.bytedance.applog.log.ILogProcessor;
import com.bytedance.applog.log.LogInfo;

/* JADX INFO: loaded from: classes2.dex */
public class m1 implements ILogProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILogger f221a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public m1(ILogger iLogger) {
        this.f221a = iLogger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.log.ILogProcessor
    public void onLog(LogInfo logInfo) {
        ILogger iLogger = this.f221a;
        if (iLogger != null) {
            iLogger.log(logInfo.getMessage(), logInfo.getThrowable());
        }
    }
}
