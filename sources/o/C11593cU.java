package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.WebViewProviderResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11593cU {
    public static final WebViewProviderResponse OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        WebViewProviderResponse.TaskDescription taskDescription = new WebViewProviderResponse.TaskDescription();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("BoundingBox"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("Face"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Id"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("KnownGender"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et7 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Urls"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
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
                taskDescription.KWHzl(C11647cW.copydefault(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.KWHzl(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.OLrzqt(C20341gf.KWHzl(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.OLrzqt(C22022hV.EZpvd(interfaceC5095En));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    taskDescription.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et7);
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        while (actionBarKWHzl.EZpvd()) {
                                            if (!actionBarKWHzl.copydefault()) {
                                                actionBarKWHzl.gEmmrt();
                                            } else {
                                                arrayList.add(actionBarKWHzl.fetchVPNInfo());
                                            }
                                        }
                                        taskDescription.EZpvd(arrayList);
                                    } else if (numOLrzqt != null) {
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        taskDescription.KWHzl();
                                        return taskDescription.EZpvd();
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
