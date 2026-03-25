package com.onesignal;

import o.C57766yoc;
import o.C57769yof;

/* JADX INFO: loaded from: classes12.dex */
class OSEmailSubscriptionChangedInternalObserver {
    public void changed(C57766yoc c57766yoc) {
        EZpvd(c57766yoc);
    }

    public static void EZpvd(C57766yoc c57766yoc) {
        if (OneSignal.AubY().KWHzl(new C57769yof(OneSignal.zLjUOn, (C57766yoc) c57766yoc.clone()))) {
            C57766yoc c57766yoc2 = (C57766yoc) c57766yoc.clone();
            OneSignal.zLjUOn = c57766yoc2;
            c57766yoc2.copydefault();
        }
    }
}
