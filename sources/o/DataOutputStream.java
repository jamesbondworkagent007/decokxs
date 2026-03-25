package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DataOutputStream {
    public static final void KWHzl(@NotNull PackedPolicyTooLargeException.TaskDescription taskDescription, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        C5116Fi c5116Fi = new C5116Fi(bArr, false, 2, null);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new C5128Fu("message"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new C5128Fu("Error"));
        activity.KWHzl(C5117Fj.EZpvd);
        activity.KWHzl(new C5127Ft("https://sts.amazonaws.com/doc/2011-06-15/", null, 2, null));
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = c5116Fi.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
