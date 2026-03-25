package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.FullBackupAgent;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ExtractEditLayout {
    public static final FullBackupAgent EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        C5101Et c5101Et;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        FullBackupAgent.Activity activity = new FullBackupAgent.Activity();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("CloudWatchLogsRoleArn"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et3 = new C5101Et(sharedElementCallback, new EX("CompletionDate"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("CompletionMessage"));
        C5101Et c5101Et5 = new C5101Et(sharedElementCallback, new EX("CreationDate"));
        AbstractC5105Ex.PendingIntent pendingIntent = AbstractC5105Ex.PendingIntent.copydefault;
        C5101Et c5101Et6 = new C5101Et(pendingIntent, new EX("FailedUsers"));
        C5101Et c5101Et7 = new C5101Et(pendingIntent, new EX("ImportedUsers"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("JobId"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("JobName"));
        FullBackupAgent.Activity activity2 = activity;
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("PreSignedUrl"));
        C5101Et c5101Et11 = new C5101Et(pendingIntent, new EX("SkippedUsers"));
        C5101Et c5101Et12 = new C5101Et(sharedElementCallback, new EX("StartDate"));
        C5101Et c5101Et13 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Status"));
        C5101Et c5101Et14 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity3 = new C5098Eq.Activity();
        activity3.EZpvd(c5101Et2);
        activity3.EZpvd(c5101Et3);
        activity3.EZpvd(c5101Et4);
        activity3.EZpvd(c5101Et5);
        activity3.EZpvd(c5101Et6);
        activity3.EZpvd(c5101Et7);
        activity3.EZpvd(c5101Et8);
        activity3.EZpvd(c5101Et9);
        activity3.EZpvd(c5101Et10);
        activity3.EZpvd(c5101Et11);
        activity3.EZpvd(c5101Et12);
        activity3.EZpvd(c5101Et13);
        activity3.EZpvd(c5101Et14);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity3.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et2.copydefault();
            C5101Et c5101Et15 = c5101Et2;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity2.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                c5101Et2 = c5101Et15;
            } else {
                FullBackupAgent.Activity activity4 = activity2;
                int iCopydefault2 = c5101Et3.copydefault();
                C5101Et c5101Et16 = c5101Et3;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity4.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et4.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity4.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et5.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity4.copydefault(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et6.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                c5101Et = c5101Et4;
                                activity4.OLrzqt(stateListAnimatorEZpvd.AYXKKw());
                            } else {
                                c5101Et = c5101Et4;
                                int iCopydefault6 = c5101Et7.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity4.EZpvd(stateListAnimatorEZpvd.AYXKKw());
                                } else {
                                    int iCopydefault7 = c5101Et8.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        activity4.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else {
                                        int iCopydefault8 = c5101Et9.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            activity4.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else {
                                            int iCopydefault9 = c5101Et10.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                activity4.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                                            } else {
                                                int iCopydefault10 = c5101Et11.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    activity4.AEQbTJ(stateListAnimatorEZpvd.AYXKKw());
                                                } else {
                                                    int iCopydefault11 = c5101Et12.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        activity4.KWHzl(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                    } else {
                                                        int iCopydefault12 = c5101Et13.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            activity4.AEQbTJ(FullBackupDataOutput.copydefault.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                        } else {
                                                            int iCopydefault13 = c5101Et14.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                activity4.djBIcL(stateListAnimatorEZpvd.fetchVPNInfo());
                                                            } else if (numOLrzqt != null) {
                                                                stateListAnimatorEZpvd.copydefault();
                                                            } else {
                                                                activity4.KWHzl();
                                                                return activity4.EZpvd();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            c5101Et4 = c5101Et;
                            c5101Et2 = c5101Et15;
                            c5101Et3 = c5101Et16;
                            activity2 = activity4;
                        }
                    }
                }
                c5101Et = c5101Et4;
                c5101Et4 = c5101Et;
                c5101Et2 = c5101Et15;
                c5101Et3 = c5101Et16;
                activity2 = activity4;
            }
        }
    }
}
