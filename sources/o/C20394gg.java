package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SpellChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C20394gg {
    public static final SpellChecker copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        SpellChecker.Application application = new SpellChecker.Application();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("BoundingBox"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ExternalImageId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("FaceId"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("ImageId"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("IndexFacesModelVersion"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("UserId"));
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
                application.OLrzqt(C11647cW.copydefault(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.OLrzqt(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                application.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    application.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        application.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else if (numOLrzqt != null) {
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        application.AEQbTJ();
                                        return application.copydefault();
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
