package com.okinc.business.appupdate.api;

/* JADX INFO: loaded from: classes3.dex */
public interface IUpdateStateChange {
    void onDownLoadStart();

    void onDownloadCanceled();

    void onDownloadFailed();

    void onDownloadProgressChange(int i);

    void onDownloadSuccess();
}
