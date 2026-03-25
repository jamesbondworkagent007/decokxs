package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.LayoutAnimationController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PermissionRequest {
    public static final LayoutAnimationController EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        C5101Et c5101Et;
        C5101Et c5101Et2;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        LayoutAnimationController.TaskDescription taskDescription = new LayoutAnimationController.TaskDescription();
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("CreationTime"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("Engine"));
        C5101Et c5101Et5 = new C5101Et(stateListAnimator, new EX("LanguageCode"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("LexiconNames"));
        C5101Et c5101Et7 = new C5101Et(stateListAnimator, new EX("OutputFormat"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("OutputUri"));
        C5101Et c5101Et9 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("RequestCharacters"));
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("SampleRate"));
        LayoutAnimationController.TaskDescription taskDescription2 = taskDescription;
        C5101Et c5101Et11 = new C5101Et(loaderManager, new EX("SnsTopicArn"));
        C5101Et c5101Et12 = new C5101Et(fragment, new EX("SpeechMarkTypes"));
        C5101Et c5101Et13 = new C5101Et(loaderManager, new EX("TaskId"));
        C5101Et c5101Et14 = new C5101Et(stateListAnimator, new EX("TaskStatus"));
        C5101Et c5101Et15 = new C5101Et(loaderManager, new EX("TaskStatusReason"));
        C5101Et c5101Et16 = new C5101Et(stateListAnimator, new EX("TextType"));
        C5101Et c5101Et17 = new C5101Et(stateListAnimator, new EX("VoiceId"));
        C5098Eq.TaskDescription taskDescription3 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
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
        C5101Et c5101Et18 = c5101Et16;
        activity.EZpvd(c5101Et18);
        activity.EZpvd(c5101Et17);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            C5101Et c5101Et19 = c5101Et18;
            int iCopydefault = c5101Et3.copydefault();
            C5101Et c5101Et20 = c5101Et3;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription2.copydefault(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                c5101Et18 = c5101Et19;
                c5101Et3 = c5101Et20;
            } else {
                LayoutAnimationController.TaskDescription taskDescription4 = taskDescription2;
                int iCopydefault2 = c5101Et4.copydefault();
                C5101Et c5101Et21 = c5101Et4;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription4.EZpvd(AccessibilityCache.copydefault.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et5.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription4.OLrzqt(AccelerateInterpolator.EZpvd.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et6.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            c5101Et = c5101Et5;
                            int iCopydefault5 = c5101Et7.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription4.AEQbTJ(DecelerateInterpolator.AEQbTJ.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                            } else {
                                int iCopydefault6 = c5101Et8.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    taskDescription4.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et9.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        taskDescription4.OLrzqt(stateListAnimatorEZpvd.djBIcL());
                                    } else {
                                        int iCopydefault8 = c5101Et10.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            taskDescription4.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else {
                                            int iCopydefault9 = c5101Et11.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                taskDescription4.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                            } else {
                                                int iCopydefault10 = c5101Et12.copydefault();
                                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault10) {
                                                    c5101Et2 = c5101Et12;
                                                    int iCopydefault11 = c5101Et13.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        taskDescription4.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                                    } else {
                                                        int iCopydefault12 = c5101Et14.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            taskDescription4.OLrzqt(RotateAnimation.EZpvd.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                        } else {
                                                            int iCopydefault13 = c5101Et15.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                taskDescription4.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                                            } else {
                                                                int iCopydefault14 = c5101Et19.copydefault();
                                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault14) {
                                                                    taskDescription4.KWHzl(AutofillManager.KWHzl.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                } else {
                                                                    int iCopydefault15 = c5101Et17.copydefault();
                                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault15) {
                                                                        taskDescription4.AEQbTJ(TranslateYAnimation.copydefault.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                    } else if (numOLrzqt != null) {
                                                                        stateListAnimatorEZpvd.copydefault();
                                                                    } else {
                                                                        taskDescription4.AEQbTJ();
                                                                        return taskDescription4.KWHzl();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et12);
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    while (actionBarKWHzl.EZpvd()) {
                                                        if (!actionBarKWHzl.copydefault()) {
                                                            actionBarKWHzl.gEmmrt();
                                                        } else {
                                                            arrayList.add(CycleInterpolator.KWHzl.KWHzl(actionBarKWHzl.fetchVPNInfo()));
                                                            c5101Et12 = c5101Et12;
                                                        }
                                                    }
                                                    c5101Et2 = c5101Et12;
                                                    taskDescription4.OLrzqt(arrayList);
                                                }
                                                c5101Et4 = c5101Et21;
                                                c5101Et3 = c5101Et20;
                                                c5101Et5 = c5101Et;
                                                c5101Et12 = c5101Et2;
                                                taskDescription2 = taskDescription4;
                                                c5101Et18 = c5101Et19;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et6);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (actionBarKWHzl2.EZpvd()) {
                                C5101Et c5101Et22 = c5101Et5;
                                if (!actionBarKWHzl2.copydefault()) {
                                    actionBarKWHzl2.gEmmrt();
                                } else {
                                    arrayList2.add(actionBarKWHzl2.fetchVPNInfo());
                                    c5101Et5 = c5101Et22;
                                }
                            }
                            c5101Et = c5101Et5;
                            taskDescription4.KWHzl(arrayList2);
                        }
                        c5101Et2 = c5101Et12;
                        c5101Et4 = c5101Et21;
                        c5101Et3 = c5101Et20;
                        c5101Et5 = c5101Et;
                        c5101Et12 = c5101Et2;
                        taskDescription2 = taskDescription4;
                        c5101Et18 = c5101Et19;
                    }
                }
                c5101Et2 = c5101Et12;
                c5101Et = c5101Et5;
                c5101Et4 = c5101Et21;
                c5101Et3 = c5101Et20;
                c5101Et5 = c5101Et;
                c5101Et12 = c5101Et2;
                taskDescription2 = taskDescription4;
                c5101Et18 = c5101Et19;
            }
        }
    }
}
