package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SELinux;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AlignmentSpan {
    public static final SELinux AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        SELinux.Activity activity = new SELinux.Activity();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ActiveModelArn"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("CreationTime"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("DataLakeS3Uri"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("FlywheelArn"));
        C5101Et c5101Et5 = new C5101Et(sharedElementCallback, new EX("LastModifiedTime"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("LatestFlywheelIteration"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("Message"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et8 = new C5101Et(stateListAnimator, new EX("ModelType"));
        C5101Et c5101Et9 = new C5101Et(stateListAnimator, new EX("Status"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        activity2.EZpvd(c5101Et6);
        activity2.EZpvd(c5101Et7);
        activity2.EZpvd(c5101Et8);
        activity2.EZpvd(c5101Et9);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.AEQbTJ(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        activity.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            activity.copydefault(TimerStat.KWHzl.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                                        } else {
                                            int iCopydefault9 = c5101Et9.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                activity.OLrzqt(RemoteMailException.KWHzl.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                                            } else if (numOLrzqt != null) {
                                                stateListAnimatorEZpvd.copydefault();
                                            } else {
                                                activity.OLrzqt();
                                                return activity.EZpvd();
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
