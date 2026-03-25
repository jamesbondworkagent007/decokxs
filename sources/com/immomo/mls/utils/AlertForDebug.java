package com.immomo.mls.utils;

/* JADX INFO: loaded from: classes17.dex */
public class AlertForDebug extends RuntimeException {
    public static AlertForDebug showInDebug(String str) {
        return new AlertForDebug(str);
    }

    public AlertForDebug(String str) {
        super(str);
    }
}
