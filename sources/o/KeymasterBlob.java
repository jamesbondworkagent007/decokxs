package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SSLSessionCache;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class KeymasterBlob {
    public static final SSLSessionCache KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        SSLSessionCache.Activity activity = new SSLSessionCache.Activity();
        AbstractC5105Ex.Activity activity2 = AbstractC5105Ex.Activity.OLrzqt;
        C5101Et c5101Et = new C5101Et(activity2, new EX("Accuracy"));
        C5101Et c5101Et2 = new C5101Et(activity2, new EX("F1Score"));
        C5101Et c5101Et3 = new C5101Et(activity2, new EX("HammingLoss"));
        C5101Et c5101Et4 = new C5101Et(activity2, new EX("MicroF1Score"));
        C5101Et c5101Et5 = new C5101Et(activity2, new EX("MicroPrecision"));
        C5101Et c5101Et6 = new C5101Et(activity2, new EX("MicroRecall"));
        C5101Et c5101Et7 = new C5101Et(activity2, new EX("Precision"));
        C5101Et c5101Et8 = new C5101Et(activity2, new EX("Recall"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity3 = new C5098Eq.Activity();
        activity3.EZpvd(c5101Et);
        activity3.EZpvd(c5101Et2);
        activity3.EZpvd(c5101Et3);
        activity3.EZpvd(c5101Et4);
        activity3.EZpvd(c5101Et5);
        activity3.EZpvd(c5101Et6);
        activity3.EZpvd(c5101Et7);
        activity3.EZpvd(c5101Et8);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity3.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.OLrzqt(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.KWHzl(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.AEQbTJ(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.copydefault(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.EZpvd(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity.valueOf(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        activity.gEmmrt(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                                    } else {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            activity.AhwBna(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                                        } else if (numOLrzqt != null) {
                                            stateListAnimatorEZpvd.copydefault();
                                        } else {
                                            activity.copydefault();
                                            return activity.OLrzqt();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
