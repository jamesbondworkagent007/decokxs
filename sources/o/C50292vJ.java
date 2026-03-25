package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C46159tK;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50292vJ {
    public static final C46159tK KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        C46159tK.StateListAnimator stateListAnimator;
        C5101Et c5101Et;
        C5101Et c5101Et2;
        C5101Et c5101Et3;
        C5101Et c5101Et4;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C46159tK.StateListAnimator stateListAnimator2 = new C46159tK.StateListAnimator();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Arn"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et6 = new C5101Et(sharedElementCallback, new EX("CreatedAt"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("Description"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et8 = new C5101Et(pictureInPictureParams, new EX("EncryptionKey"));
        AbstractC5105Ex.PendingIntent pendingIntent = AbstractC5105Ex.PendingIntent.copydefault;
        C5101Et c5101Et9 = new C5101Et(pendingIntent, new EX("FailedRecordCount"));
        C5101Et c5101Et10 = new C5101Et(pendingIntent, new EX("ImportedDataSize"));
        C5101Et c5101Et11 = new C5101Et(pendingIntent, new EX("ImportedRecordCount"));
        C46159tK.StateListAnimator stateListAnimator3 = stateListAnimator2;
        C5101Et c5101Et12 = new C5101Et(sharedElementCallback, new EX("LastUpdatedAt"));
        C5101Et c5101Et13 = new C5101Et(sharedElementCallback, new EX("LatestUpdateAttemptAt"));
        AbstractC5105Ex.StateListAnimator stateListAnimator4 = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et14 = new C5101Et(stateListAnimator4, new EX("LatestUpdateAttemptStatus"));
        C5101Et c5101Et15 = new C5101Et(loaderManager, new EX("Message"));
        C5101Et c5101Et16 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et17 = new C5101Et(pictureInPictureParams, new EX("ParallelDataConfig"));
        C5101Et c5101Et18 = new C5101Et(pendingIntent, new EX("SkippedRecordCount"));
        C5101Et c5101Et19 = new C5101Et(loaderManager, new EX("SourceLanguageCode"));
        C5101Et c5101Et20 = new C5101Et(stateListAnimator4, new EX("Status"));
        C5101Et c5101Et21 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("TargetLanguageCodes"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        activity.EZpvd(c5101Et9);
        activity.EZpvd(c5101Et10);
        activity.EZpvd(c5101Et11);
        activity.EZpvd(c5101Et12);
        activity.EZpvd(c5101Et13);
        activity.EZpvd(c5101Et14);
        activity.EZpvd(c5101Et15);
        activity.EZpvd(c5101Et16);
        activity.EZpvd(c5101Et17);
        activity.EZpvd(c5101Et18);
        activity.EZpvd(c5101Et19);
        activity.EZpvd(c5101Et20);
        activity.EZpvd(c5101Et21);
        C5101Et c5101Et22 = c5101Et21;
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et5.copydefault();
            C5101Et c5101Et23 = c5101Et5;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator = stateListAnimator3;
                stateListAnimator.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                c5101Et = c5101Et6;
            } else {
                stateListAnimator = stateListAnimator3;
                int iCopydefault2 = c5101Et6.copydefault();
                c5101Et = c5101Et6;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et7.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et8.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.AEQbTJ(C48101uF.AEQbTJ(interfaceC5095En));
                        } else {
                            int iCopydefault5 = c5101Et9.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.AEQbTJ(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                            } else {
                                int iCopydefault6 = c5101Et10.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    stateListAnimator.KWHzl(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                                } else {
                                    int iCopydefault7 = c5101Et11.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        stateListAnimator.OLrzqt(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                                    } else {
                                        int iCopydefault8 = c5101Et12.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            stateListAnimator.AEQbTJ(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                        } else {
                                            int iCopydefault9 = c5101Et13.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                stateListAnimator.copydefault(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                            } else {
                                                int iCopydefault10 = c5101Et14.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    stateListAnimator.KWHzl(AbstractC46078tH.KWHzl.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                } else {
                                                    int iCopydefault11 = c5101Et15.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        stateListAnimator.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                                    } else {
                                                        int iCopydefault12 = c5101Et16.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                                        } else {
                                                            int iCopydefault13 = c5101Et17.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                stateListAnimator.KWHzl(C50211vG.KWHzl(interfaceC5095En));
                                                            } else {
                                                                int iCopydefault14 = c5101Et18.copydefault();
                                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault14) {
                                                                    stateListAnimator.EZpvd(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                                                                } else {
                                                                    int iCopydefault15 = c5101Et19.copydefault();
                                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault15) {
                                                                        stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                                                    } else {
                                                                        int iCopydefault16 = c5101Et20.copydefault();
                                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault16) {
                                                                            stateListAnimator.AEQbTJ(AbstractC46078tH.KWHzl.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                        } else {
                                                                            int iCopydefault17 = c5101Et22.copydefault();
                                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault17) {
                                                                                c5101Et2 = c5101Et22;
                                                                                InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et2);
                                                                                c5101Et3 = c5101Et17;
                                                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                                                while (actionBarKWHzl.EZpvd()) {
                                                                                    C5101Et c5101Et24 = c5101Et12;
                                                                                    if (!actionBarKWHzl.copydefault()) {
                                                                                        actionBarKWHzl.gEmmrt();
                                                                                    } else {
                                                                                        arrayList.add(actionBarKWHzl.fetchVPNInfo());
                                                                                        c5101Et12 = c5101Et24;
                                                                                    }
                                                                                }
                                                                                c5101Et4 = c5101Et12;
                                                                                stateListAnimator.OLrzqt(arrayList);
                                                                            } else {
                                                                                c5101Et3 = c5101Et17;
                                                                                c5101Et4 = c5101Et12;
                                                                                c5101Et2 = c5101Et22;
                                                                                if (numOLrzqt != null) {
                                                                                    stateListAnimatorEZpvd.copydefault();
                                                                                } else {
                                                                                    stateListAnimator.AEQbTJ();
                                                                                    return stateListAnimator.copydefault();
                                                                                }
                                                                            }
                                                                            c5101Et22 = c5101Et2;
                                                                            c5101Et6 = c5101Et;
                                                                            c5101Et17 = c5101Et3;
                                                                            c5101Et12 = c5101Et4;
                                                                            stateListAnimator3 = stateListAnimator;
                                                                            c5101Et5 = c5101Et23;
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
                    }
                }
            }
            c5101Et6 = c5101Et;
            stateListAnimator3 = stateListAnimator;
            c5101Et5 = c5101Et23;
        }
    }
}
