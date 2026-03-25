package com.onesignal;

import o.C57753yoP;
import o.C57758yoU;

/* JADX INFO: loaded from: classes12.dex */
class OSSMSSubscriptionChangedInternalObserver {
    public void changed(C57753yoP c57753yoP) {
        AEQbTJ(c57753yoP);
    }

    public static void AEQbTJ(C57753yoP c57753yoP) {
        if (OneSignal.QVAiDq().KWHzl(new C57758yoU(OneSignal.wlaJM, (C57753yoP) c57753yoP.clone()))) {
            C57753yoP c57753yoP2 = (C57753yoP) c57753yoP.clone();
            OneSignal.wlaJM = c57753yoP2;
            c57753yoP2.copydefault();
        }
    }
}
