package o;

import aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C22899ho {
    public static final void EZpvd(HumanLoopQuotaExceededException.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Code"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Logref"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("Message"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("QuotaCode"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("ResourceType"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("ServiceCode"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                application.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    application.AYXKKw(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else if (numOLrzqt == null) {
                                    return;
                                } else {
                                    stateListAnimatorEZpvd.copydefault();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
