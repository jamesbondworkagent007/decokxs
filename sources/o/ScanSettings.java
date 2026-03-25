package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.CantAddAccountActivity;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScanSettings {
    public static final CantAddAccountActivity EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        CantAddAccountActivity.Activity activity = new CantAddAccountActivity.Activity();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("ChallengeResponses"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("CreationDate"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("EventContextData"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("EventFeedback"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("EventId"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et6 = new C5101Et(stateListAnimator, new EX("EventResponse"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("EventRisk"));
        C5101Et c5101Et8 = new C5101Et(stateListAnimator, new EX("EventType"));
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
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.AEQbTJ(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.AEQbTJ(FontResourcesParser.KWHzl(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.EZpvd(ThemedResourceCache.KWHzl(interfaceC5095En));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity.KWHzl(StyleRes.OLrzqt.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        activity.EZpvd(ResourcesKey.EZpvd(interfaceC5095En));
                                    } else {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            activity.KWHzl(SystemApi.OLrzqt.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                                        } else if (numOLrzqt != null) {
                                            stateListAnimatorEZpvd.copydefault();
                                        } else {
                                            activity.EZpvd();
                                            return activity.OLrzqt();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(TruncatedFilter.EZpvd(interfaceC5095En));
                    }
                }
                activity.OLrzqt(arrayList);
            }
        }
    }
}
