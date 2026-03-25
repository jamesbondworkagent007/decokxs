package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AuthenticationRequiredException;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SQLiteQueryBuilder {
    public static final AuthenticationRequiredException AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        AuthenticationRequiredException.Activity activity = new AuthenticationRequiredException.Activity();
        AbstractC5105Ex.Dialog dialog = AbstractC5105Ex.Dialog.KWHzl;
        C5101Et c5101Et = new C5101Et(dialog, new EX("AttributeMapping"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("CreationDate"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("IdpIdentifiers"));
        C5101Et c5101Et4 = new C5101Et(sharedElementCallback, new EX("LastModifiedDate"));
        C5101Et c5101Et5 = new C5101Et(dialog, new EX("ProviderDetails"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("ProviderName"));
        C5101Et c5101Et7 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("ProviderType"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("UserPoolId"));
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
                    activity.OLrzqt(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault5) {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        activity.KWHzl(ClientTransactionHandler.EZpvd.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                                    } else {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else if (numOLrzqt != null) {
                                            stateListAnimatorEZpvd.copydefault();
                                        } else {
                                            activity.AEQbTJ();
                                            return activity.OLrzqt();
                                        }
                                    }
                                }
                            } else {
                                InterfaceC5095En.Activity activityAEQbTJ = interfaceC5095En.AEQbTJ(c5101Et5);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                while (activityAEQbTJ.OLrzqt()) {
                                    java.lang.String strKWHzl = activityAEQbTJ.KWHzl();
                                    if (!activityAEQbTJ.copydefault()) {
                                        activityAEQbTJ.gEmmrt();
                                    } else {
                                        linkedHashMap.put(strKWHzl, activityAEQbTJ.fetchVPNInfo());
                                    }
                                }
                                activity.EZpvd(linkedHashMap);
                            }
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (actionBarKWHzl.EZpvd()) {
                            if (!actionBarKWHzl.copydefault()) {
                                actionBarKWHzl.gEmmrt();
                            } else {
                                arrayList.add(actionBarKWHzl.fetchVPNInfo());
                            }
                        }
                        activity.copydefault(arrayList);
                    }
                }
            } else {
                InterfaceC5095En.Activity activityAEQbTJ2 = interfaceC5095En.AEQbTJ(c5101Et);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (activityAEQbTJ2.OLrzqt()) {
                    java.lang.String strKWHzl2 = activityAEQbTJ2.KWHzl();
                    if (!activityAEQbTJ2.copydefault()) {
                        activityAEQbTJ2.gEmmrt();
                    } else {
                        linkedHashMap2.put(strKWHzl2, activityAEQbTJ2.fetchVPNInfo());
                    }
                }
                activity.OLrzqt(linkedHashMap2);
            }
        }
    }
}
