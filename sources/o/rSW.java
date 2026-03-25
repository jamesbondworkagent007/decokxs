package o;

import com.okinc.core.util.SPUtils;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignCheckResponseBean;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignRequestBean;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rSW {
    public static final rSW KWHzl = new rSW();
    public static final java.lang.String EZpvd = "wallet_travel_rule";

    private rSW() {
    }

    public final java.lang.String EZpvd() {
        return SPUtils.getString("SP_WALLET_TRAVEL_RULE_WALLET_ID", "");
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        SPUtils.put("SP_WALLET_TRAVEL_RULE_WALLET_ID", str);
    }

    public final InterfaceC58217yxC copydefault(int i, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = ((rSF) C43251rlk.copydefault(rSF.class)).OLrzqt(i);
        final Function1 function12 = new Function1() { // from class: o.rTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSW.AEQbTJ(function1, (java.lang.Integer) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSW.djBIcL(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Integer num) {
        pUU.KWHzl(EZpvd, "ensureWalletInitialized=" + num);
        if (num != null && num.intValue() == 0) {
            Intrinsics.copydefault(num);
            function1.invoke(num);
        } else {
            KWHzl.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C55326xho.toastWithFailedIcon$default(C43662rtX.Dialog.OuxcSI, 0, 1, (java.lang.Object) null);
    }

    public final void KWHzl(InnerSignCheckResponseBean innerSignCheckResponseBean, Function0<Unit> function0, Function0<Unit> function02) {
        java.lang.Integer numValueOf = innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            function0.invoke();
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            AEQbTJ();
        } else {
            function02.invoke();
        }
    }

    public final InterfaceC58217yxC KWHzl(@NotNull final android.content.Context context, @NotNull final VerificationPayload verificationPayload, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.util.Map<java.lang.String, java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(verificationPayload, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
        java.lang.String address = verificationPayload.getAddress();
        if (address == null) {
            address = "";
        }
        java.lang.String subCurrencyId = verificationPayload.getSubCurrencyId();
        AbstractC58185ywX<InnerSignCheckResponseBean> abstractC58185ywXCopydefault = rsf.copydefault(address, subCurrencyId != null ? C33129mqd.AhwBna(subCurrencyId) : -1);
        final Function1 function12 = new Function1() { // from class: o.rSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSW.EZpvd(function0, context, verificationPayload, function1, (InnerSignCheckResponseBean) obj);
            }
        };
        InterfaceC58227yxM<? super InnerSignCheckResponseBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSW.copydefault(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.rTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSW.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rSW.EZpvd(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final Function0 function0, final android.content.Context context, final VerificationPayload verificationPayload, final Function1 function1, final InnerSignCheckResponseBean innerSignCheckResponseBean) {
        pUU.KWHzl(EZpvd, "checkStatusBeforeSign=" + (innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        rSW rsw = KWHzl;
        rsw.AEQbTJ(innerSignCheckResponseBean.getWalletId());
        rsw.KWHzl(innerSignCheckResponseBean, (Function0<Unit>) function0, new Function0() { // from class: o.rTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rSW.OLrzqt(innerSignCheckResponseBean, context, verificationPayload, function1, function0);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InnerSignCheckResponseBean innerSignCheckResponseBean, android.content.Context context, VerificationPayload verificationPayload, final Function1 function1, final Function0 function0) {
        if (innerSignCheckResponseBean.getSignErrorCode() == 0) {
            rSW rsw = KWHzl;
            java.lang.String title = verificationPayload.getTitle();
            java.lang.String str = title == null ? "" : title;
            java.lang.String url = verificationPayload.getUrl();
            java.lang.String str2 = url == null ? "" : url;
            java.lang.String darkLogoUrl = C33492mxV.OLrzqt() ? verificationPayload.getDarkLogoUrl() : verificationPayload.getLogoUrl();
            java.lang.String str3 = darkLogoUrl == null ? "" : darkLogoUrl;
            java.lang.String messageModel = verificationPayload.getMessageModel();
            java.lang.String str4 = messageModel == null ? "" : messageModel;
            java.lang.String address = verificationPayload.getAddress();
            java.lang.String str5 = address == null ? "" : address;
            java.lang.String strEZpvd = rsw.EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
            java.lang.String subCurrencyId = verificationPayload.getSubCurrencyId();
            rsw.OLrzqt(context, new InnerSignRequestBean(str, str2, str3, str4, str5, strEZpvd, subCurrencyId != null ? C33129mqd.AhwBna(subCurrencyId) : -1), new Function1() { // from class: o.rTf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rSW.OLrzqt(function0, function1, (InnerSignCheckResponseBean) obj);
                }
            });
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("walletStatusCode", java.lang.String.valueOf(innerSignCheckResponseBean.getSignErrorCode()));
            linkedHashMap.put("walletId", KWHzl.EZpvd());
            function1.invoke(linkedHashMap);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, final Function1 function1, final InnerSignCheckResponseBean innerSignCheckResponseBean) {
        pUU.KWHzl(EZpvd, "signData=" + (innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        rSW rsw = KWHzl;
        rsw.AEQbTJ(innerSignCheckResponseBean != null ? innerSignCheckResponseBean.getWalletId() : null);
        rsw.KWHzl(innerSignCheckResponseBean, (Function0<Unit>) function0, new Function0() { // from class: o.rTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rSW.copydefault(innerSignCheckResponseBean, function1);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InnerSignCheckResponseBean innerSignCheckResponseBean, Function1 function1) {
        java.lang.String publicKey;
        InnerSignDataResultBean signDataResultBean;
        java.lang.String fullMessage;
        InnerSignDataResultBean signDataResultBean2;
        InnerSignDataResultBean signDataResultBean3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String signature = null;
        linkedHashMap.put("walletStatusCode", C33129mqd.gEmmrt(innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        linkedHashMap.put("walletId", KWHzl.EZpvd());
        if (innerSignCheckResponseBean != null && (signDataResultBean3 = innerSignCheckResponseBean.getSignDataResultBean()) != null) {
            signature = signDataResultBean3.getSignature();
        }
        linkedHashMap.put("signature", C33129mqd.gEmmrt(signature));
        java.lang.String str = "";
        if (innerSignCheckResponseBean == null || (signDataResultBean2 = innerSignCheckResponseBean.getSignDataResultBean()) == null || (publicKey = signDataResultBean2.getPublicKey()) == null) {
            publicKey = "";
        }
        linkedHashMap.put("publicKey", publicKey);
        if (innerSignCheckResponseBean != null && (signDataResultBean = innerSignCheckResponseBean.getSignDataResultBean()) != null && (fullMessage = signDataResultBean.getFullMessage()) != null) {
            str = fullMessage;
        }
        linkedHashMap.put("fullMessage", str);
        function1.invoke(linkedHashMap);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.copydefault(EZpvd, "checkStatusBeforeSign exception = " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull VerificationPayload verificationPayload, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.util.Map<java.lang.String, java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(verificationPayload, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
        java.lang.String title = verificationPayload.getTitle();
        java.lang.String str = title == null ? "" : title;
        java.lang.String url = verificationPayload.getUrl();
        java.lang.String str2 = url == null ? "" : url;
        java.lang.String darkLogoUrl = C33492mxV.OLrzqt() ? verificationPayload.getDarkLogoUrl() : verificationPayload.getLogoUrl();
        java.lang.String str3 = darkLogoUrl == null ? "" : darkLogoUrl;
        java.lang.String messageModel = verificationPayload.getMessageModel();
        java.lang.String str4 = messageModel == null ? "" : messageModel;
        java.lang.String address = verificationPayload.getAddress();
        java.lang.String str5 = address == null ? "" : address;
        java.lang.String strEZpvd = EZpvd();
        Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
        java.lang.String subCurrencyId = verificationPayload.getSubCurrencyId();
        rsf.KWHzl(context, new InnerSignRequestBean(str, str2, str3, str4, str5, strEZpvd, subCurrencyId != null ? C33129mqd.AhwBna(subCurrencyId) : -1), new Function1() { // from class: o.rTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSW.AhwBna(function0, function1, (InnerSignCheckResponseBean) obj);
            }
        });
    }

    public static final Unit AhwBna(Function0 function0, final Function1 function1, final InnerSignCheckResponseBean innerSignCheckResponseBean) {
        pUU.KWHzl(EZpvd, "importWalletAndSign=" + (innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        rSW rsw = KWHzl;
        rsw.AEQbTJ(innerSignCheckResponseBean != null ? innerSignCheckResponseBean.getWalletId() : null);
        rsw.KWHzl(innerSignCheckResponseBean, (Function0<Unit>) function0, new Function0() { // from class: o.rTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rSW.AYXKKw(innerSignCheckResponseBean, function1);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InnerSignCheckResponseBean innerSignCheckResponseBean, Function1 function1) {
        java.lang.String publicKey;
        InnerSignDataResultBean signDataResultBean;
        java.lang.String fullMessage;
        InnerSignDataResultBean signDataResultBean2;
        InnerSignDataResultBean signDataResultBean3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String signature = null;
        linkedHashMap.put("walletStatusCode", C33129mqd.gEmmrt(innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        linkedHashMap.put("walletId", KWHzl.EZpvd());
        if (innerSignCheckResponseBean != null && (signDataResultBean3 = innerSignCheckResponseBean.getSignDataResultBean()) != null) {
            signature = signDataResultBean3.getSignature();
        }
        linkedHashMap.put("signature", C33129mqd.gEmmrt(signature));
        java.lang.String str = "";
        if (innerSignCheckResponseBean == null || (signDataResultBean2 = innerSignCheckResponseBean.getSignDataResultBean()) == null || (publicKey = signDataResultBean2.getPublicKey()) == null) {
            publicKey = "";
        }
        linkedHashMap.put("publicKey", publicKey);
        if (innerSignCheckResponseBean != null && (signDataResultBean = innerSignCheckResponseBean.getSignDataResultBean()) != null && (fullMessage = signDataResultBean.getFullMessage()) != null) {
            str = fullMessage;
        }
        linkedHashMap.put("fullMessage", str);
        function1.invoke(linkedHashMap);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull VerificationPayload verificationPayload, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.util.Map<java.lang.String, java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(verificationPayload, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
        java.lang.String title = verificationPayload.getTitle();
        java.lang.String str = title == null ? "" : title;
        java.lang.String url = verificationPayload.getUrl();
        java.lang.String str2 = url == null ? "" : url;
        java.lang.String darkLogoUrl = C33492mxV.OLrzqt() ? verificationPayload.getDarkLogoUrl() : verificationPayload.getLogoUrl();
        java.lang.String str3 = darkLogoUrl == null ? "" : darkLogoUrl;
        java.lang.String messageModel = verificationPayload.getMessageModel();
        java.lang.String str4 = messageModel == null ? "" : messageModel;
        java.lang.String address = verificationPayload.getAddress();
        java.lang.String str5 = address == null ? "" : address;
        java.lang.String strEZpvd = EZpvd();
        Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
        java.lang.String subCurrencyId = verificationPayload.getSubCurrencyId();
        rsf.AEQbTJ(context, new InnerSignRequestBean(str, str2, str3, str4, str5, strEZpvd, subCurrencyId != null ? C33129mqd.AhwBna(subCurrencyId) : -1), new Function1() { // from class: o.rTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rSW.copydefault(function0, function1, (InnerSignCheckResponseBean) obj);
            }
        });
    }

    public static final Unit copydefault(Function0 function0, final Function1 function1, final InnerSignCheckResponseBean innerSignCheckResponseBean) {
        pUU.KWHzl(EZpvd, "backupWalletIfNeedAndSign=" + (innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        rSW rsw = KWHzl;
        rsw.AEQbTJ(innerSignCheckResponseBean != null ? innerSignCheckResponseBean.getWalletId() : null);
        rsw.KWHzl(innerSignCheckResponseBean, (Function0<Unit>) function0, new Function0() { // from class: o.rTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rSW.EZpvd(innerSignCheckResponseBean, function1);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InnerSignCheckResponseBean innerSignCheckResponseBean, Function1 function1) {
        java.lang.String publicKey;
        InnerSignDataResultBean signDataResultBean;
        java.lang.String fullMessage;
        InnerSignDataResultBean signDataResultBean2;
        InnerSignDataResultBean signDataResultBean3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String signature = null;
        linkedHashMap.put("walletStatusCode", C33129mqd.gEmmrt(innerSignCheckResponseBean != null ? java.lang.Integer.valueOf(innerSignCheckResponseBean.getSignErrorCode()) : null));
        linkedHashMap.put("walletId", KWHzl.EZpvd());
        if (innerSignCheckResponseBean != null && (signDataResultBean3 = innerSignCheckResponseBean.getSignDataResultBean()) != null) {
            signature = signDataResultBean3.getSignature();
        }
        linkedHashMap.put("signature", C33129mqd.gEmmrt(signature));
        java.lang.String str = "";
        if (innerSignCheckResponseBean == null || (signDataResultBean2 = innerSignCheckResponseBean.getSignDataResultBean()) == null || (publicKey = signDataResultBean2.getPublicKey()) == null) {
            publicKey = "";
        }
        linkedHashMap.put("publicKey", publicKey);
        if (innerSignCheckResponseBean != null && (signDataResultBean = innerSignCheckResponseBean.getSignDataResultBean()) != null && (fullMessage = signDataResultBean.getFullMessage()) != null) {
            str = fullMessage;
        }
        linkedHashMap.put("fullMessage", str);
        function1.invoke(linkedHashMap);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context, InnerSignRequestBean innerSignRequestBean, Function1<? super InnerSignCheckResponseBean, Unit> function1) {
        ((rSF) C43251rlk.copydefault(rSF.class)).copydefault(context, innerSignRequestBean, function1);
    }
}
