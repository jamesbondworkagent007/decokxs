package com.immomo.mls;

/* JADX INFO: loaded from: classes3.dex */
public interface ScriptStateListener {

    public enum Reason {
        LOAD_FAILED,
        EXCUTE_FAILED,
        PREPARE_FAILED,
        DOWNLOAD_FAILED
    }

    void OLrzqt();

    void copydefault(Reason reason, String str);
}
