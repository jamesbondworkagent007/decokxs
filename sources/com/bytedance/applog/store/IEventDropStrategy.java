package com.bytedance.applog.store;

/* JADX INFO: loaded from: classes2.dex */
public interface IEventDropStrategy {
    int eventDBCacheSize();

    int reportMaxRetryTimes();

    int reportTimeoutInDay();
}
