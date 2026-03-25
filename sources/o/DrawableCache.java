package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.RequiresPermission;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DrawableCache {
    public static final RequiresPermission AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        RequiresPermission.TaskDescription taskDescription = new RequiresPermission.TaskDescription();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AWSAccountId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("CloudFrontDistribution"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("CustomDomainConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Domain"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("S3Bucket"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Status"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("Version"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.copydefault(ChangedPackages.EZpvd(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    taskDescription.KWHzl(SdkConstant.EZpvd.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        taskDescription.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            taskDescription.gEmmrt(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else if (numOLrzqt != null) {
                                            stateListAnimatorEZpvd.copydefault();
                                        } else {
                                            taskDescription.OLrzqt();
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
