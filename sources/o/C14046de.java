package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.ActionMenuView;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C14046de {
    public static final ActionMenuView AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        ActionMenuView.TaskDescription taskDescription = new ActionMenuView.TaskDescription();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("BoundingBox"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("Emotions"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("Landmarks"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("Pose"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("Quality"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("Smile"));
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
                taskDescription.AEQbTJ(C11647cW.copydefault(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.copydefault(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.copydefault(C27007jn.OLrzqt(interfaceC5095En));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    taskDescription.EZpvd(C23111hs.copydefault(interfaceC5095En));
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        taskDescription.AEQbTJ(C29619kx.copydefault(interfaceC5095En));
                                    } else if (numOLrzqt != null) {
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        taskDescription.AEQbTJ();
                                        return taskDescription.KWHzl();
                                    }
                                }
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            while (actionBarKWHzl.EZpvd()) {
                                if (!actionBarKWHzl.copydefault()) {
                                    actionBarKWHzl.gEmmrt();
                                } else {
                                    arrayList.add(C24397id.AEQbTJ(interfaceC5095En));
                                }
                            }
                            taskDescription.OLrzqt(arrayList);
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        while (actionBarKWHzl2.EZpvd()) {
                            if (!actionBarKWHzl2.copydefault()) {
                                actionBarKWHzl2.gEmmrt();
                            } else {
                                arrayList2.add(C20182gc.copydefault(interfaceC5095En));
                            }
                        }
                        taskDescription.copydefault(arrayList2);
                    }
                }
            }
        }
    }
}
