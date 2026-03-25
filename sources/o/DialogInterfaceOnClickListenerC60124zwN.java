package o;

import android.content.DialogInterface;
import o.C60121zwJ;

/* JADX INFO: renamed from: o.zwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnClickListenerC60124zwN implements DialogInterface.OnClickListener {
    public C60121zwJ.StateListAnimator EZpvd;
    public C60121zwJ.Activity KWHzl;
    public C60126zwP OLrzqt;
    public java.lang.Object copydefault;

    public DialogInterfaceOnClickListenerC60124zwN(C60130zwT c60130zwT, C60126zwP c60126zwP, C60121zwJ.Activity activity, C60121zwJ.StateListAnimator stateListAnimator) {
        java.lang.Object activity2;
        if (c60130zwT.getParentFragment() != null) {
            activity2 = c60130zwT.getParentFragment();
        } else {
            activity2 = c60130zwT.getActivity();
        }
        this.copydefault = activity2;
        this.OLrzqt = c60126zwP;
        this.KWHzl = activity;
        this.EZpvd = stateListAnimator;
    }

    public DialogInterfaceOnClickListenerC60124zwN(DialogFragmentC60127zwQ dialogFragmentC60127zwQ, C60126zwP c60126zwP, C60121zwJ.Activity activity, C60121zwJ.StateListAnimator stateListAnimator) {
        this.copydefault = dialogFragmentC60127zwQ.getActivity();
        this.OLrzqt = c60126zwP;
        this.KWHzl = activity;
        this.EZpvd = stateListAnimator;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        C60126zwP c60126zwP = this.OLrzqt;
        int i2 = c60126zwP.AEQbTJ;
        if (i == -1) {
            java.lang.String[] strArr = c60126zwP.EZpvd;
            C60121zwJ.StateListAnimator stateListAnimator = this.EZpvd;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault(i2);
            }
            java.lang.Object obj = this.copydefault;
            if (obj instanceof androidx.fragment.app.Fragment) {
                AbstractC60132zwV.OLrzqt((androidx.fragment.app.Fragment) obj).AEQbTJ(i2, strArr);
                return;
            } else {
                if (obj instanceof android.app.Activity) {
                    AbstractC60132zwV.AEQbTJ((android.app.Activity) obj).AEQbTJ(i2, strArr);
                    return;
                }
                throw new java.lang.RuntimeException("Host must be an Activity or Fragment!");
            }
        }
        C60121zwJ.StateListAnimator stateListAnimator2 = this.EZpvd;
        if (stateListAnimator2 != null) {
            stateListAnimator2.EZpvd(i2);
        }
        EZpvd();
    }

    public final void EZpvd() {
        C60121zwJ.Activity activity = this.KWHzl;
        if (activity != null) {
            C60126zwP c60126zwP = this.OLrzqt;
            activity.onPermissionsDenied(c60126zwP.AEQbTJ, java.util.Arrays.asList(c60126zwP.EZpvd));
        }
    }
}
