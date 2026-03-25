package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.DifferentialPrivacyConfig;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InputEventReceiver {
    public static final DifferentialPrivacyConfig OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        DifferentialPrivacyConfig.ActionBar actionBar = new DifferentialPrivacyConfig.ActionBar();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("BeginOffset"));
        C5101Et c5101Et2 = new C5101Et(fragmentManager, new EX("EndOffset"));
        AbstractC5105Ex.ActionBar actionBar2 = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et3 = new C5101Et(actionBar2, new EX("GroupScore"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("MentionSentiment"));
        C5101Et c5101Et5 = new C5101Et(actionBar2, new EX("Score"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Text"));
        C5101Et c5101Et7 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Type"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.OLrzqt(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.AEQbTJ(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.OLrzqt(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            actionBar.KWHzl(JsonToken.AEQbTJ(interfaceC5095En));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                actionBar.EZpvd(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        actionBar.copydefault(CustomPrinterIconCallback.OLrzqt.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                                    } else if (numOLrzqt != null) {
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        actionBar.KWHzl();
                                        return actionBar.AEQbTJ();
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
