package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.PatternMatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LinkMovementMethod {
    public static final PatternMatcher OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        PatternMatcher.StateListAnimator stateListAnimator;
        C5101Et c5101Et;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        PatternMatcher.StateListAnimator stateListAnimator2 = new PatternMatcher.StateListAnimator();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DataAccessRoleArn"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et3 = new C5101Et(sharedElementCallback, new EX("EndTime"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("EntityRecognizerArn"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("FlywheelArn"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("InputDataConfig"));
        AbstractC5105Ex.StateListAnimator stateListAnimator3 = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et7 = new C5101Et(stateListAnimator3, new EX("LanguageCode"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("Message"));
        PatternMatcher.StateListAnimator stateListAnimator4 = stateListAnimator2;
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("ModelKmsKeyId"));
        C5101Et c5101Et10 = new C5101Et(pictureInPictureParams, new EX("OutputDataConfig"));
        C5101Et c5101Et11 = new C5101Et(pictureInPictureParams, new EX("RecognizerMetadata"));
        C5101Et c5101Et12 = new C5101Et(loaderManager, new EX("SourceModelArn"));
        C5101Et c5101Et13 = new C5101Et(stateListAnimator3, new EX("Status"));
        C5101Et c5101Et14 = new C5101Et(sharedElementCallback, new EX("SubmitTime"));
        C5101Et c5101Et15 = new C5101Et(sharedElementCallback, new EX("TrainingEndTime"));
        C5101Et c5101Et16 = new C5101Et(sharedElementCallback, new EX("TrainingStartTime"));
        C5101Et c5101Et17 = new C5101Et(loaderManager, new EX("VersionName"));
        C5101Et c5101Et18 = new C5101Et(loaderManager, new EX("VolumeKmsKeyId"));
        C5101Et c5101Et19 = new C5101Et(pictureInPictureParams, new EX("VpcConfig"));
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
        activity.EZpvd(c5101Et15);
        activity.EZpvd(c5101Et16);
        activity.EZpvd(c5101Et17);
        activity.EZpvd(c5101Et18);
        activity.EZpvd(c5101Et19);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et2.copydefault();
            C5101Et c5101Et20 = c5101Et2;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator = stateListAnimator4;
                stateListAnimator.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                c5101Et = c5101Et3;
            } else {
                stateListAnimator = stateListAnimator4;
                int iCopydefault2 = c5101Et3.copydefault();
                c5101Et = c5101Et3;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et4.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et5.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et6.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.EZpvd(DateKeyListener.KWHzl(interfaceC5095En));
                            } else {
                                int iCopydefault6 = c5101Et7.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    stateListAnimator.OLrzqt(SynchronousResultReceiver.EZpvd.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                                } else {
                                    int iCopydefault7 = c5101Et8.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        stateListAnimator.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else {
                                        int iCopydefault8 = c5101Et9.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else {
                                            int iCopydefault9 = c5101Et10.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                stateListAnimator.KWHzl(PasswordTransformationMethod.copydefault(interfaceC5095En));
                                            } else {
                                                int iCopydefault10 = c5101Et11.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    stateListAnimator.AEQbTJ(NumberKeyListener.OLrzqt(interfaceC5095En));
                                                } else {
                                                    int iCopydefault11 = c5101Et12.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        stateListAnimator.valueOf(stateListAnimatorEZpvd.fetchVPNInfo());
                                                    } else {
                                                        int iCopydefault12 = c5101Et13.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            stateListAnimator.copydefault(OnObbStateChangeListener.OLrzqt.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                        } else {
                                                            int iCopydefault13 = c5101Et14.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                stateListAnimator.OLrzqt(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                            } else {
                                                                int iCopydefault14 = c5101Et15.copydefault();
                                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault14) {
                                                                    stateListAnimator.AEQbTJ(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                } else {
                                                                    int iCopydefault15 = c5101Et16.copydefault();
                                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault15) {
                                                                        stateListAnimator.copydefault(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                    } else {
                                                                        int iCopydefault16 = c5101Et17.copydefault();
                                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault16) {
                                                                            stateListAnimator.djBIcL(stateListAnimatorEZpvd.fetchVPNInfo());
                                                                        } else {
                                                                            int iCopydefault17 = c5101Et18.copydefault();
                                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault17) {
                                                                                stateListAnimator.AhwBna(stateListAnimatorEZpvd.fetchVPNInfo());
                                                                            } else {
                                                                                int iCopydefault18 = c5101Et19.copydefault();
                                                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault18) {
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
                            }
                        }
                    }
                }
            }
            c5101Et3 = c5101Et;
            c5101Et2 = c5101Et20;
            stateListAnimator4 = stateListAnimator;
        }
    }
}
