package com.onesignal;

import o.C57763yoZ;

/* JADX INFO: loaded from: classes12.dex */
class OSSubscriptionChangedInternalObserver {
    public void changed(OSSubscriptionState oSSubscriptionState) {
        KWHzl(oSSubscriptionState);
    }

    public static void KWHzl(OSSubscriptionState oSSubscriptionState) {
        if (OneSignal.RcXXUw().KWHzl(new C57763yoZ(OneSignal.sSMYrx, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            OneSignal.sSMYrx = oSSubscriptionState2;
            oSSubscriptionState2.djBIcL();
        }
    }
}
