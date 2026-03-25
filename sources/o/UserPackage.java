package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.TranslateXAnimation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UserPackage {
    public static final TranslateXAnimation OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        TranslateXAnimation.ActionBar actionBar = new TranslateXAnimation.ActionBar();
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("AdditionalLanguageCodes"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("Gender"));
        C5101Et c5101Et3 = new C5101Et(stateListAnimator, new EX("Id"));
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("LanguageCode"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("LanguageName"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("SupportedEngines"));
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
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.copydefault(AccessibilityWindowInfo.EZpvd.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.copydefault(TranslateYAnimation.copydefault.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            actionBar.AEQbTJ(AccelerateInterpolator.EZpvd.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                actionBar.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    actionBar.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et7);
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        while (actionBarKWHzl.EZpvd()) {
                                            if (!actionBarKWHzl.copydefault()) {
                                                actionBarKWHzl.gEmmrt();
                                            } else {
                                                arrayList.add(AccessibilityCache.copydefault.copydefault(actionBarKWHzl.fetchVPNInfo()));
                                            }
                                        }
                                        actionBar.EZpvd(arrayList);
                                    } else if (numOLrzqt != null) {
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        actionBar.EZpvd();
                                        return actionBar.AEQbTJ();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (actionBarKWHzl2.EZpvd()) {
                    if (!actionBarKWHzl2.copydefault()) {
                        actionBarKWHzl2.gEmmrt();
                    } else {
                        arrayList2.add(AccelerateInterpolator.EZpvd.AEQbTJ(actionBarKWHzl2.fetchVPNInfo()));
                    }
                }
                actionBar.OLrzqt(arrayList2);
            }
        }
    }
}
