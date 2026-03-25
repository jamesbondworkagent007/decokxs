package com.onesignal;

import o.C57719yni;
import o.C57751yoN;
import o.C57755yoR;

/* JADX INFO: loaded from: classes12.dex */
class OSPermissionChangedInternalObserver {
    public void changed(C57751yoN c57751yoN) {
        copydefault(c57751yoN);
        OLrzqt(c57751yoN);
    }

    public static void copydefault(C57751yoN c57751yoN) {
        if (!c57751yoN.EZpvd()) {
            C57719yni.AEQbTJ(0, OneSignal.AEQbTJ);
        }
        OneSignalStateSynchronizer.AEQbTJ(OneSignal.AkhnZx());
    }

    public static void OLrzqt(C57751yoN c57751yoN) {
        if (OneSignal.OcIXYQ().KWHzl(new C57755yoR(OneSignal.zsXlph, (C57751yoN) c57751yoN.clone()))) {
            C57751yoN c57751yoN2 = (C57751yoN) c57751yoN.clone();
            OneSignal.zsXlph = c57751yoN2;
            c57751yoN2.OLrzqt();
        }
    }
}
