package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C27696k;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23111hs {
    public static final C27696k copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C27696k.ActionBar actionBar = new C27696k.ActionBar();
        AbstractC5105Ex.ActionBar actionBar2 = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar2, new EX("Brightness"));
        C5101Et c5101Et2 = new C5101Et(actionBar2, new EX(ExifInterface.TAG_SHARPNESS));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.AEQbTJ(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.EZpvd(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    actionBar.OLrzqt();
                    return actionBar.EZpvd();
                }
            }
        }
    }
}
