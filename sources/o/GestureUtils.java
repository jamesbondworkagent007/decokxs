package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.ContextImpl;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GestureUtils {
    public static final ContextImpl OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        ContextImpl.TaskDescription taskDescription;
        C5101Et c5101Et;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        ContextImpl.TaskDescription taskDescription2 = new ContextImpl.TaskDescription();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("CreateAuthChallenge"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("CustomEmailSender"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("CustomMessage"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("CustomSMSSender"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("DefineAuthChallenge"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("KMSKeyID"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("PostAuthentication"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("PostConfirmation"));
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("PreAuthentication"));
        ContextImpl.TaskDescription taskDescription3 = taskDescription2;
        C5101Et c5101Et11 = new C5101Et(loaderManager, new EX("PreSignUp"));
        C5101Et c5101Et12 = new C5101Et(loaderManager, new EX("PreTokenGeneration"));
        C5101Et c5101Et13 = new C5101Et(pictureInPictureParams, new EX("PreTokenGenerationConfig"));
        C5101Et c5101Et14 = new C5101Et(loaderManager, new EX("UserMigration"));
        C5101Et c5101Et15 = new C5101Et(loaderManager, new EX("VerifyAuthChallengeResponse"));
        C5098Eq.TaskDescription taskDescription4 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
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
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et2.copydefault();
            C5101Et c5101Et16 = c5101Et2;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription = taskDescription3;
                taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                c5101Et = c5101Et3;
            } else {
                taskDescription = taskDescription3;
                int iCopydefault2 = c5101Et3.copydefault();
                c5101Et = c5101Et3;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.EZpvd(BaseParceledListSlice.AEQbTJ(interfaceC5095En));
                } else {
                    int iCopydefault3 = c5101Et4.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et5.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.copydefault(FallbackCategoryProvider.copydefault(interfaceC5095En));
                        } else {
                            int iCopydefault5 = c5101Et6.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et7.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    taskDescription.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et8.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        taskDescription.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else {
                                        int iCopydefault8 = c5101Et9.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            taskDescription.AhwBna(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else {
                                            int iCopydefault9 = c5101Et10.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                taskDescription.valueOf(stateListAnimatorEZpvd.fetchVPNInfo());
                                            } else {
                                                int iCopydefault10 = c5101Et11.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    taskDescription.djBIcL(stateListAnimatorEZpvd.fetchVPNInfo());
                                                } else {
                                                    int iCopydefault11 = c5101Et12.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        taskDescription.gEmmrt(stateListAnimatorEZpvd.fetchVPNInfo());
                                                    } else {
                                                        int iCopydefault12 = c5101Et13.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            taskDescription.copydefault(LegacyRequest.OLrzqt(interfaceC5095En));
                                                        } else {
                                                            int iCopydefault13 = c5101Et14.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                taskDescription.AYXKKw(stateListAnimatorEZpvd.fetchVPNInfo());
                                                            } else {
                                                                int iCopydefault14 = c5101Et15.copydefault();
                                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault14) {
                                                                    taskDescription.values(stateListAnimatorEZpvd.fetchVPNInfo());
                                                                } else if (numOLrzqt != null) {
                                                                    stateListAnimatorEZpvd.copydefault();
                                                                } else {
                                                                    taskDescription.EZpvd();
                                                                    return taskDescription.KWHzl();
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
            c5101Et3 = c5101Et;
            c5101Et2 = c5101Et16;
            taskDescription3 = taskDescription;
        }
    }
}
