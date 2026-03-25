package o;

import aws.sdk.kotlin.runtime.auth.credentials.InvalidJsonCredentialsException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.LocaleList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Creator {
    public static final java.lang.Object KWHzl(@NotNull InterfaceC5095En interfaceC5095En, @NotNull Continuation<? super LocaleList> continuation) {
        C5101Et c5101Et;
        java.lang.String lowerCase;
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Code"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("AccessKeyId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("SecretAccessKey"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Token"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("Expiration"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("AccountId"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("Message"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        try {
            InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
            java.lang.String strFetchVPNInfo = null;
            java.lang.String strFetchVPNInfo2 = null;
            java.lang.String strFetchVPNInfo3 = null;
            java.lang.String strFetchVPNInfo4 = null;
            java.lang.String strFetchVPNInfo5 = null;
            C5173Hn c5173HnCopydefault = null;
            java.lang.String strFetchVPNInfo6 = null;
            while (true) {
                java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
                int iCopydefault = c5101Et2.copydefault();
                if (numOLrzqt == null) {
                    c5101Et = c5101Et2;
                } else {
                    c5101Et = c5101Et2;
                    if (numOLrzqt.intValue() == iCopydefault) {
                        strFetchVPNInfo = stateListAnimatorEZpvd.fetchVPNInfo();
                    }
                    c5101Et2 = c5101Et;
                }
                int iCopydefault2 = c5101Et3.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et4.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et5.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et6.copydefault();
                            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault5) {
                                int iCopydefault6 = c5101Et7.copydefault();
                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault6) {
                                    int iCopydefault7 = c5101Et8.copydefault();
                                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault7) {
                                        if (numOLrzqt == null) {
                                            break;
                                        }
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        strFetchVPNInfo2 = stateListAnimatorEZpvd.fetchVPNInfo();
                                    }
                                } else {
                                    strFetchVPNInfo6 = stateListAnimatorEZpvd.fetchVPNInfo();
                                }
                            } else {
                                c5173HnCopydefault = C5173Hn.AEQbTJ.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                            }
                        } else {
                            strFetchVPNInfo5 = stateListAnimatorEZpvd.fetchVPNInfo();
                        }
                    } else {
                        strFetchVPNInfo4 = stateListAnimatorEZpvd.fetchVPNInfo();
                    }
                } else {
                    strFetchVPNInfo3 = stateListAnimatorEZpvd.fetchVPNInfo();
                }
                c5101Et2 = c5101Et;
            }
            if (strFetchVPNInfo != null) {
                lowerCase = strFetchVPNInfo.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "success") && lowerCase != null) {
                return new LocaleList.Application(strFetchVPNInfo, strFetchVPNInfo2);
            }
            if (strFetchVPNInfo3 == null) {
                throw new InvalidJsonCredentialsException("missing field `AccessKeyId`", null, 2, null);
            }
            if (strFetchVPNInfo4 == null) {
                throw new InvalidJsonCredentialsException("missing field `SecretAccessKey`", null, 2, null);
            }
            if (strFetchVPNInfo5 == null) {
                throw new InvalidJsonCredentialsException("missing field `Token`", null, 2, null);
            }
            if (c5173HnCopydefault == null) {
                throw new InvalidJsonCredentialsException("missing field `Expiration`", null, 2, null);
            }
            return new LocaleList.TaskDescription(strFetchVPNInfo3, strFetchVPNInfo4, strFetchVPNInfo5, c5173HnCopydefault, strFetchVPNInfo6);
        } catch (DeserializationException e) {
            throw new InvalidJsonCredentialsException("invalid JSON credentials response", e);
        }
    }

    public static final LocaleList EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AccessKeyId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("SecretAccessKey"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("SessionToken"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("Expiration"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Version"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("AccountId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        try {
            InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
            java.lang.Integer numValueOf = null;
            java.lang.String strFetchVPNInfo = null;
            java.lang.String strFetchVPNInfo2 = null;
            java.lang.String strFetchVPNInfo3 = null;
            C5173Hn c5173HnCopydefault = null;
            java.lang.String strFetchVPNInfo4 = null;
            while (true) {
                java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
                int iCopydefault = c5101Et.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                    int iCopydefault2 = c5101Et2.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                        int iCopydefault3 = c5101Et3.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                            int iCopydefault4 = c5101Et4.copydefault();
                            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                                int iCopydefault5 = c5101Et5.copydefault();
                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault5) {
                                    int iCopydefault6 = c5101Et6.copydefault();
                                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault6) {
                                        if (numOLrzqt == null) {
                                            break;
                                        }
                                        stateListAnimatorEZpvd.copydefault();
                                    } else {
                                        strFetchVPNInfo4 = stateListAnimatorEZpvd.fetchVPNInfo();
                                    }
                                } else {
                                    numValueOf = java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL());
                                }
                            } else {
                                c5173HnCopydefault = C5173Hn.AEQbTJ.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                            }
                        } else {
                            strFetchVPNInfo3 = stateListAnimatorEZpvd.fetchVPNInfo();
                        }
                    } else {
                        strFetchVPNInfo2 = stateListAnimatorEZpvd.fetchVPNInfo();
                    }
                } else {
                    strFetchVPNInfo = stateListAnimatorEZpvd.fetchVPNInfo();
                }
            }
            if (strFetchVPNInfo == null) {
                throw new InvalidJsonCredentialsException("missing field `" + EQ.KWHzl(c5101Et) + '`', null, 2, null);
            }
            if (strFetchVPNInfo2 == null) {
                throw new InvalidJsonCredentialsException("missing field `" + EQ.KWHzl(c5101Et2) + '`', null, 2, null);
            }
            if (strFetchVPNInfo3 == null) {
                throw new InvalidJsonCredentialsException("missing field `" + EQ.KWHzl(c5101Et3) + '`', null, 2, null);
            }
            if (numValueOf == null) {
                throw new InvalidJsonCredentialsException("missing field `" + EQ.KWHzl(c5101Et5) + '`', null, 2, null);
            }
            if (numValueOf.intValue() != 1) {
                throw new InvalidJsonCredentialsException("version " + numValueOf + " is not supported", null, 2, null);
            }
            return new LocaleList.TaskDescription(strFetchVPNInfo, strFetchVPNInfo2, strFetchVPNInfo3, c5173HnCopydefault, strFetchVPNInfo4);
        } catch (DeserializationException e) {
            throw new InvalidJsonCredentialsException("invalid JSON credentials response", e);
        }
    }
}
