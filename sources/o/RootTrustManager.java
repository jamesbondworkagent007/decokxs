package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.RaEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RootTrustManager {
    public static final RaEvent OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        RaEvent.StateListAnimator stateListAnimator = new RaEvent.StateListAnimator();
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et = new C5101Et(sharedElementCallback, new EX("CreationTime"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DatasetArn"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("DatasetName"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("DatasetS3Uri"));
        AbstractC5105Ex.StateListAnimator stateListAnimator2 = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et5 = new C5101Et(stateListAnimator2, new EX("DatasetType"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("Description"));
        C5101Et c5101Et7 = new C5101Et(sharedElementCallback, new EX("EndTime"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("Message"));
        C5101Et c5101Et9 = new C5101Et(AbstractC5105Ex.PendingIntent.copydefault, new EX("NumberOfDocuments"));
        C5101Et c5101Et10 = new C5101Et(stateListAnimator2, new EX("Status"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        activity.EZpvd(c5101Et9);
        activity.EZpvd(c5101Et10);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.AEQbTJ(ValidationProbeEvent.EZpvd.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    stateListAnimator.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        stateListAnimator.OLrzqt(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                    } else {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else {
                                            int iCopydefault9 = c5101Et9.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                stateListAnimator.EZpvd(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                                            } else {
                                                int iCopydefault10 = c5101Et10.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    stateListAnimator.AEQbTJ(NetworkMetrics.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                } else if (numOLrzqt != null) {
                                                    stateListAnimatorEZpvd.copydefault();
                                                } else {
                                                    stateListAnimator.EZpvd();
                                                    return stateListAnimator.AEQbTJ();
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
    }
}
