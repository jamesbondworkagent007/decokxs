package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.RecommendationInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HandlerActionQueue {
    public static final RecommendationInfo KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        RecommendationInfo.StateListAnimator stateListAnimator;
        C5101Et c5101Et;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        RecommendationInfo.StateListAnimator stateListAnimator2 = new RecommendationInfo.StateListAnimator();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DataAccessRoleArn"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et3 = new C5101Et(sharedElementCallback, new EX("EndTime"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("InputDataConfig"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("JobArn"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("JobId"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("JobName"));
        AbstractC5105Ex.StateListAnimator stateListAnimator3 = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et8 = new C5101Et(stateListAnimator3, new EX("JobStatus"));
        RecommendationInfo.StateListAnimator stateListAnimator4 = stateListAnimator2;
        C5101Et c5101Et9 = new C5101Et(stateListAnimator3, new EX("LanguageCode"));
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("Message"));
        C5101Et c5101Et11 = new C5101Et(pictureInPictureParams, new EX("OutputDataConfig"));
        C5101Et c5101Et12 = new C5101Et(sharedElementCallback, new EX("SubmitTime"));
        C5101Et c5101Et13 = new C5101Et(loaderManager, new EX("VolumeKmsKeyId"));
        C5101Et c5101Et14 = new C5101Et(pictureInPictureParams, new EX("VpcConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
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
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et2.copydefault();
            C5101Et c5101Et15 = c5101Et2;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator = stateListAnimator4;
                stateListAnimator.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                c5101Et = c5101Et3;
            } else {
                stateListAnimator = stateListAnimator4;
                int iCopydefault2 = c5101Et3.copydefault();
                c5101Et = c5101Et3;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.KWHzl(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et4.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.copydefault(EasyEditSpan.AEQbTJ(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et5.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et6.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et7.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et8.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        stateListAnimator.copydefault(StatsDimensionsValue.AEQbTJ.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                                    } else {
                                        int iCopydefault8 = c5101Et9.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            stateListAnimator.OLrzqt(SynchronousResultReceiver.EZpvd.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                                        } else {
                                            int iCopydefault9 = c5101Et10.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                stateListAnimator.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                                            } else {
                                                int iCopydefault10 = c5101Et11.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    stateListAnimator.AEQbTJ(IntProperty.AEQbTJ(interfaceC5095En));
                                                } else {
                                                    int iCopydefault11 = c5101Et12.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                    } else {
                                                        int iCopydefault12 = c5101Et13.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            stateListAnimator.djBIcL(stateListAnimatorEZpvd.fetchVPNInfo());
                                                        } else {
                                                            int iCopydefault13 = c5101Et14.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                stateListAnimator.AEQbTJ(TextureLayer.copydefault(interfaceC5095En));
                                                            } else if (numOLrzqt != null) {
                                                                stateListAnimatorEZpvd.copydefault();
                                                            } else {
                                                                stateListAnimator.EZpvd();
                                                                return stateListAnimator.KWHzl();
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
            c5101Et2 = c5101Et15;
            c5101Et3 = c5101Et;
            stateListAnimator4 = stateListAnimator;
        }
    }
}
