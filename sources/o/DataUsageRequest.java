package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.RestoreObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DataUsageRequest {
    public static final RestoreObserver copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        RestoreObserver.ActionBar actionBar;
        C5101Et c5101Et;
        C5101Et c5101Et2;
        C5101Et c5101Et3;
        C5101Et c5101Et4;
        C5101Et c5101Et5;
        C5101Et c5101Et6;
        C5101Et c5101Et7;
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        RestoreObserver.ActionBar actionBar2 = new RestoreObserver.ActionBar();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et8 = new C5101Et(fragmentManager, new EX("AccessTokenValidity"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et9 = new C5101Et(fragment, new EX("AllowedOAuthFlows"));
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et10 = new C5101Et(taskDescription, new EX("AllowedOAuthFlowsUserPoolClient"));
        C5101Et c5101Et11 = new C5101Et(fragment, new EX("AllowedOAuthScopes"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et12 = new C5101Et(pictureInPictureParams, new EX("AnalyticsConfiguration"));
        C5101Et c5101Et13 = new C5101Et(fragmentManager, new EX("AuthSessionValidity"));
        C5101Et c5101Et14 = new C5101Et(fragment, new EX("CallbackURLs"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        RestoreObserver.ActionBar actionBar3 = actionBar2;
        C5101Et c5101Et15 = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et16 = new C5101Et(loaderManager, new EX("ClientName"));
        C5101Et c5101Et17 = new C5101Et(loaderManager, new EX("ClientSecret"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et18 = new C5101Et(sharedElementCallback, new EX("CreationDate"));
        C5101Et c5101Et19 = new C5101Et(loaderManager, new EX("DefaultRedirectURI"));
        C5101Et c5101Et20 = new C5101Et(taskDescription, new EX("EnablePropagateAdditionalUserContextData"));
        C5101Et c5101Et21 = new C5101Et(taskDescription, new EX("EnableTokenRevocation"));
        C5101Et c5101Et22 = new C5101Et(fragment, new EX("ExplicitAuthFlows"));
        C5101Et c5101Et23 = new C5101Et(fragmentManager, new EX("IdTokenValidity"));
        C5101Et c5101Et24 = new C5101Et(sharedElementCallback, new EX("LastModifiedDate"));
        C5101Et c5101Et25 = new C5101Et(fragment, new EX("LogoutURLs"));
        C5101Et c5101Et26 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("PreventUserExistenceErrors"));
        C5101Et c5101Et27 = new C5101Et(fragment, new EX("ReadAttributes"));
        C5101Et c5101Et28 = new C5101Et(fragmentManager, new EX("RefreshTokenValidity"));
        C5101Et c5101Et29 = new C5101Et(fragment, new EX("SupportedIdentityProviders"));
        C5101Et c5101Et30 = new C5101Et(pictureInPictureParams, new EX("TokenValidityUnits"));
        C5101Et c5101Et31 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et32 = new C5101Et(fragment, new EX("WriteAttributes"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
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
        activity.EZpvd(c5101Et22);
        activity.EZpvd(c5101Et23);
        activity.EZpvd(c5101Et24);
        activity.EZpvd(c5101Et25);
        activity.EZpvd(c5101Et26);
        C5101Et c5101Et33 = c5101Et27;
        activity.EZpvd(c5101Et33);
        activity.EZpvd(c5101Et28);
        C5101Et c5101Et34 = c5101Et29;
        activity.EZpvd(c5101Et34);
        activity.EZpvd(c5101Et30);
        activity.EZpvd(c5101Et31);
        activity.EZpvd(c5101Et32);
        C5101Et c5101Et35 = c5101Et32;
        InterfaceC5095En interfaceC5095En2 = interfaceC5095En;
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En2.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            C5101Et c5101Et36 = c5101Et31;
            int iCopydefault = c5101Et8.copydefault();
            C5101Et c5101Et37 = c5101Et8;
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar = actionBar3;
                actionBar.OLrzqt(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                c5101Et = c5101Et30;
                c5101Et2 = c5101Et34;
                c5101Et3 = c5101Et9;
                c5101Et4 = c5101Et25;
                c5101Et5 = c5101Et33;
            } else {
                actionBar = actionBar3;
                int iCopydefault2 = c5101Et9.copydefault();
                c5101Et = c5101Et30;
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    c5101Et7 = c5101Et34;
                    c5101Et3 = c5101Et9;
                    int iCopydefault3 = c5101Et10.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.EZpvd(java.lang.Boolean.valueOf(stateListAnimatorEZpvd.AEQbTJ()));
                    } else {
                        int iCopydefault4 = c5101Et11.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et12.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                actionBar.OLrzqt(BluetoothLeUtils.copydefault(interfaceC5095En));
                            } else {
                                int iCopydefault6 = c5101Et13.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    actionBar.copydefault(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                                } else {
                                    int iCopydefault7 = c5101Et14.copydefault();
                                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault7) {
                                        int iCopydefault8 = c5101Et15.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                        } else {
                                            int iCopydefault9 = c5101Et16.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                actionBar.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                                            } else {
                                                int iCopydefault10 = c5101Et17.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    actionBar.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                                } else {
                                                    int iCopydefault11 = c5101Et18.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        actionBar.copydefault(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                    } else {
                                                        int iCopydefault12 = c5101Et19.copydefault();
                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault12) {
                                                            actionBar.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                                                        } else {
                                                            int iCopydefault13 = c5101Et20.copydefault();
                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault13) {
                                                                actionBar.OLrzqt(java.lang.Boolean.valueOf(stateListAnimatorEZpvd.AEQbTJ()));
                                                            } else {
                                                                int iCopydefault14 = c5101Et21.copydefault();
                                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault14) {
                                                                    actionBar.AEQbTJ(java.lang.Boolean.valueOf(stateListAnimatorEZpvd.AEQbTJ()));
                                                                } else {
                                                                    int iCopydefault15 = c5101Et22.copydefault();
                                                                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault15) {
                                                                        int iCopydefault16 = c5101Et23.copydefault();
                                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault16) {
                                                                            actionBar.EZpvd(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                                                                        } else {
                                                                            int iCopydefault17 = c5101Et24.copydefault();
                                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault17) {
                                                                                actionBar.OLrzqt(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                            } else {
                                                                                int iCopydefault18 = c5101Et25.copydefault();
                                                                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault18) {
                                                                                    c5101Et4 = c5101Et25;
                                                                                    int iCopydefault19 = c5101Et26.copydefault();
                                                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault19) {
                                                                                        actionBar.AEQbTJ(PictureInPictureArgs.copydefault.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                                                                                    } else {
                                                                                        int iCopydefault20 = c5101Et33.copydefault();
                                                                                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault20) {
                                                                                            int iCopydefault21 = c5101Et28.copydefault();
                                                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault21) {
                                                                                                actionBar.KWHzl(stateListAnimatorEZpvd.djBIcL());
                                                                                            } else {
                                                                                                int iCopydefault22 = c5101Et7.copydefault();
                                                                                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault22) {
                                                                                                    c5101Et5 = c5101Et33;
                                                                                                    c5101Et2 = c5101Et7;
                                                                                                    int iCopydefault23 = c5101Et.copydefault();
                                                                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault23) {
                                                                                                        actionBar.copydefault(HdmiRecordSources.EZpvd(interfaceC5095En));
                                                                                                    } else {
                                                                                                        int iCopydefault24 = c5101Et36.copydefault();
                                                                                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault24) {
                                                                                                            actionBar.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                                                                                                        } else {
                                                                                                            int iCopydefault25 = c5101Et35.copydefault();
                                                                                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault25) {
                                                                                                                c5101Et6 = c5101Et35;
                                                                                                                InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En2.KWHzl(c5101Et6);
                                                                                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                                                                                while (actionBarKWHzl.EZpvd()) {
                                                                                                                    if (!actionBarKWHzl.copydefault()) {
                                                                                                                        actionBarKWHzl.gEmmrt();
                                                                                                                    } else {
                                                                                                                        arrayList.add(actionBarKWHzl.fetchVPNInfo());
                                                                                                                    }
                                                                                                                }
                                                                                                                actionBar.valueOf(arrayList);
                                                                                                            } else {
                                                                                                                c5101Et6 = c5101Et35;
                                                                                                                if (numOLrzqt != null) {
                                                                                                                    stateListAnimatorEZpvd.copydefault();
                                                                                                                } else {
                                                                                                                    actionBar.AEQbTJ();
                                                                                                                    return actionBar.OLrzqt();
                                                                                                                }
                                                                                                            }
                                                                                                            interfaceC5095En2 = interfaceC5095En;
                                                                                                            c5101Et35 = c5101Et6;
                                                                                                            c5101Et34 = c5101Et2;
                                                                                                            c5101Et33 = c5101Et5;
                                                                                                            c5101Et8 = c5101Et37;
                                                                                                            c5101Et9 = c5101Et3;
                                                                                                            c5101Et25 = c5101Et4;
                                                                                                            c5101Et30 = c5101Et;
                                                                                                            actionBar3 = actionBar;
                                                                                                            c5101Et31 = c5101Et36;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    c5101Et2 = c5101Et7;
                                                                                                    InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En2.KWHzl(c5101Et2);
                                                                                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                                                    while (actionBarKWHzl2.EZpvd()) {
                                                                                                        C5101Et c5101Et38 = c5101Et33;
                                                                                                        if (!actionBarKWHzl2.copydefault()) {
                                                                                                            actionBarKWHzl2.gEmmrt();
                                                                                                        } else {
                                                                                                            arrayList2.add(actionBarKWHzl2.fetchVPNInfo());
                                                                                                            c5101Et33 = c5101Et38;
                                                                                                        }
                                                                                                    }
                                                                                                    c5101Et5 = c5101Et33;
                                                                                                    actionBar.djBIcL(arrayList2);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            InterfaceC5095En.ActionBar actionBarKWHzl3 = interfaceC5095En2.KWHzl(c5101Et33);
                                                                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                            while (actionBarKWHzl3.EZpvd()) {
                                                                                                if (!actionBarKWHzl3.copydefault()) {
                                                                                                    actionBarKWHzl3.gEmmrt();
                                                                                                } else {
                                                                                                    arrayList3.add(actionBarKWHzl3.fetchVPNInfo());
                                                                                                }
                                                                                            }
                                                                                            actionBar.AhwBna(arrayList3);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    c5101Et4 = c5101Et25;
                                                                                    InterfaceC5095En.ActionBar actionBarKWHzl4 = interfaceC5095En2.KWHzl(c5101Et4);
                                                                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                                                    while (actionBarKWHzl4.EZpvd()) {
                                                                                        if (!actionBarKWHzl4.copydefault()) {
                                                                                            actionBarKWHzl4.gEmmrt();
                                                                                        } else {
                                                                                            arrayList4.add(actionBarKWHzl4.fetchVPNInfo());
                                                                                        }
                                                                                    }
                                                                                    actionBar.OLrzqt(arrayList4);
                                                                                }
                                                                                c5101Et25 = c5101Et4;
                                                                                c5101Et30 = c5101Et;
                                                                                c5101Et8 = c5101Et37;
                                                                                c5101Et9 = c5101Et3;
                                                                                c5101Et34 = c5101Et7;
                                                                                actionBar3 = actionBar;
                                                                                c5101Et31 = c5101Et36;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        C5101Et c5101Et39 = c5101Et22;
                                                                        InterfaceC5095En.ActionBar actionBarKWHzl5 = interfaceC5095En2.KWHzl(c5101Et39);
                                                                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                                                        while (actionBarKWHzl5.EZpvd()) {
                                                                            if (!actionBarKWHzl5.copydefault()) {
                                                                                actionBarKWHzl5.gEmmrt();
                                                                            } else {
                                                                                arrayList5.add(TransitionRes.KWHzl.OLrzqt(actionBarKWHzl5.fetchVPNInfo()));
                                                                                c5101Et39 = c5101Et39;
                                                                            }
                                                                        }
                                                                        c5101Et22 = c5101Et39;
                                                                        actionBar.copydefault(arrayList5);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        InterfaceC5095En.ActionBar actionBarKWHzl6 = interfaceC5095En2.KWHzl(c5101Et14);
                                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                        while (actionBarKWHzl6.EZpvd()) {
                                            if (!actionBarKWHzl6.copydefault()) {
                                                actionBarKWHzl6.gEmmrt();
                                            } else {
                                                arrayList6.add(actionBarKWHzl6.fetchVPNInfo());
                                            }
                                        }
                                        actionBar.AEQbTJ(arrayList6);
                                    }
                                }
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl7 = interfaceC5095En2.KWHzl(c5101Et11);
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            while (actionBarKWHzl7.EZpvd()) {
                                if (!actionBarKWHzl7.copydefault()) {
                                    actionBarKWHzl7.gEmmrt();
                                } else {
                                    arrayList7.add(actionBarKWHzl7.fetchVPNInfo());
                                }
                            }
                            actionBar.EZpvd(arrayList7);
                        }
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl8 = interfaceC5095En2.KWHzl(c5101Et9);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    while (actionBarKWHzl8.EZpvd()) {
                        if (!actionBarKWHzl8.copydefault()) {
                            actionBarKWHzl8.gEmmrt();
                        } else {
                            arrayList8.add(NotificationManager.EZpvd.AEQbTJ(actionBarKWHzl8.fetchVPNInfo()));
                            c5101Et9 = c5101Et9;
                            c5101Et34 = c5101Et34;
                        }
                    }
                    c5101Et7 = c5101Et34;
                    c5101Et3 = c5101Et9;
                    actionBar.KWHzl(arrayList8);
                }
                c5101Et4 = c5101Et25;
                c5101Et25 = c5101Et4;
                c5101Et30 = c5101Et;
                c5101Et8 = c5101Et37;
                c5101Et9 = c5101Et3;
                c5101Et34 = c5101Et7;
                actionBar3 = actionBar;
                c5101Et31 = c5101Et36;
            }
            c5101Et6 = c5101Et35;
            interfaceC5095En2 = interfaceC5095En;
            c5101Et35 = c5101Et6;
            c5101Et34 = c5101Et2;
            c5101Et33 = c5101Et5;
            c5101Et8 = c5101Et37;
            c5101Et9 = c5101Et3;
            c5101Et25 = c5101Et4;
            c5101Et30 = c5101Et;
            actionBar3 = actionBar;
            c5101Et31 = c5101Et36;
        }
    }
}
