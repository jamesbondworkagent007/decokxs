package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.ParcelUuid;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DateKeyListener {
    public static final ParcelUuid KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        ParcelUuid.Activity activity = new ParcelUuid.Activity();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Annotations"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("AugmentedManifests"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DataFormat"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("Documents"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("EntityList"));
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("EntityTypes"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        activity2.EZpvd(c5101Et6);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.copydefault(ArrowKeyMovementMethod.AEQbTJ(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.EZpvd(Messenger.copydefault.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.AEQbTJ(BaseKeyListener.copydefault(interfaceC5095En));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.AEQbTJ(HideReturnsTransformationMethod.AEQbTJ(interfaceC5095En));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et6);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    while (actionBarKWHzl.EZpvd()) {
                                        if (!actionBarKWHzl.copydefault()) {
                                            actionBarKWHzl.gEmmrt();
                                        } else {
                                            arrayList.add(SingleLineTransformationMethod.EZpvd(interfaceC5095En));
                                        }
                                    }
                                    activity.AEQbTJ(arrayList);
                                } else if (numOLrzqt != null) {
                                    stateListAnimatorEZpvd.copydefault();
                                } else {
                                    activity.OLrzqt();
                                    return activity.KWHzl();
                                }
                            }
                        }
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (actionBarKWHzl2.EZpvd()) {
                        if (!actionBarKWHzl2.copydefault()) {
                            actionBarKWHzl2.gEmmrt();
                        } else {
                            arrayList2.add(Downloads.KWHzl(interfaceC5095En));
                        }
                    }
                    activity.copydefault(arrayList2);
                }
            }
        }
    }
}
