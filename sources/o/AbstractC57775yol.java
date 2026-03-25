package o;

import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.yol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57775yol {
    public void AEQbTJ(C57771yoh c57771yoh) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSInAppMessageLifecycleHandler: IAM Will Display: " + c57771yoh.KWHzl());
    }

    public void EZpvd(C57771yoh c57771yoh) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSInAppMessageLifecycleHandler: IAM Did Display: " + c57771yoh.KWHzl());
    }

    public void OLrzqt(C57771yoh c57771yoh) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSInAppMessageLifecycleHandler: IAM Will Dismiss: " + c57771yoh.KWHzl());
    }

    public void KWHzl(C57771yoh c57771yoh) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSInAppMessageLifecycleHandler: IAM Did Dismiss: " + c57771yoh.KWHzl());
    }
}
