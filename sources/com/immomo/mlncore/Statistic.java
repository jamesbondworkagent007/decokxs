package com.immomo.mlncore;

import o.C7318aha;
import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class Statistic {
    public static C7318aha.Application copydefault;

    @InterfaceC60044zuT
    public static void onBridgeCallback(String str) {
        C7318aha.Application application = copydefault;
        if (application != null) {
            application.EZpvd(str);
        }
    }

    @InterfaceC60044zuT
    public static void onRequireCallback(String str) {
        C7318aha.Application application = copydefault;
        if (application != null) {
            application.OLrzqt(str);
        }
    }
}
