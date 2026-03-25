package o;

import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.web3.security.bridge.MnemonicKt;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9024bNl<T extends EVMContractSignData> extends C8972bMm<T> {
    public final InterfaceC56387yDm djBIcL;
    public java.util.List<EVMStateOverride> gasjUx;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    @Override // o.C8972bMm, o.InterfaceC8931bLy
    public boolean getFieldNames() {
        return true;
    }

    public C9024bNl() {
        super(null, 1, 0 == true ? 1 : 0);
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.bNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9024bNl.RKcVTr();
            }
        });
    }

    /* JADX INFO: renamed from: o.bNl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bNl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean OLrzqt(@NotNull EVMContractSignData eVMContractSignData) {
            java.lang.String chainId;
            Intrinsics.checkNotNullParameter(eVMContractSignData, "");
            java.util.List<EVMAuthorization> authorizationList = eVMContractSignData.getAuthorizationList();
            if (authorizationList == null || authorizationList.isEmpty()) {
                return false;
            }
            for (EVMAuthorization eVMAuthorization : authorizationList) {
                java.lang.String address = eVMAuthorization.getAddress();
                if (address == null || address.length() == 0 || (chainId = eVMAuthorization.getChainId()) == null || chainId.length() == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public final java.lang.String QIZEnU() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String RKcVTr() {
        return xYS.copydefault.KWHzl(MnemonicKt.MnemonicLanguageEnglish);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.api.model.tx.signdata.SignDataArgs<T extends com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C8972bMm, o.AbstractC8913bLg, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<T> signDataArgs) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        OLrzqt(OKWBaseTransaction.TransactionType.Contract);
        java.lang.String strHtlTjW = htlTjW();
        if (QXDzTk()) {
            str = EIP1271Verifier.hexPrefix;
        } else {
            java.lang.String lowerCase = C54910xZw.EZpvd(RVsVBY()).toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            str = "0xef0100" + lowerCase;
        }
        this.gasjUx = C56402yEa.EZpvd(new EVMStateOverride(strHtlTjW, str));
        return zKWHzl;
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDNMMPQ = DNMMPQ();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        final Function2 function2 = new Function2() { // from class: o.bNk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9024bNl.gEmmrt((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDNMMPQ, abstractC58185ywXDaRZkR, new InterfaceC58223yxI() { // from class: o.bNn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9024bNl.AYXKKw(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9024bNl.copydefault(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bNo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9024bNl.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bNq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9024bNl.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9024bNl.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair gEmmrt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C9024bNl c9024bNl, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c9024bNl.OTwTPd();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C9024bNl c9024bNl, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9024bNl.DXXBbs().EZpvd(c9024bNl.fHqPtx(), c9024bNl.DWgRXt(), c9024bNl.KDccX(), c9024bNl.DGUQLI(), c9024bNl.DGOPHZDGOPHZ(), c9024bNl.DcqEDu());
        }
        return pair;
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.remove((java.lang.Object) 6);
        return newProxyInstance;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setAuthorizationList(QVsKAR().getAuthorizationList());
        txToastCheckReqI_.setStateOverrideList(this.gasjUx);
        return txToastCheckReqI_;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setAuthorizationList(QVsKAR().getAuthorizationList());
        preExecTransactionReqRdAHlO.setStateOverrideList(this.gasjUx);
        return preExecTransactionReqRdAHlO;
    }

    @Override // o.C8972bMm
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OTwTPd() {
        AbstractC58185ywX abstractC58185ywXCopydefault = OFhtUX().copydefault(htlTjW(), AbstractC8601bFm.getInputData$default(this, false, 1, null), htlTjW(), (496 & 8) != 0 ? null : java.lang.Long.valueOf(dHguZz().AhwBna()), (496 & 16) != 0 ? null : zuBGHE(), (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : fIwbmz(QIZEnU())), (496 & 128) != 0 ? null : htlTjW(), (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : this.gasjUx));
        final Function1 function1 = new Function1() { // from class: o.bNr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9024bNl.EZpvd(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9024bNl.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final java.util.List<EVMAuthorization> fIwbmz(java.lang.String str) {
        java.util.List<EVMAuthorization> authorizationList = QVsKAR().getAuthorizationList();
        if (authorizationList == null) {
            return null;
        }
        SignParams signParams = signParams;
        SignParams signParams2 = new SignParams(dHguZz().QKVWgx(), dHguZz().fetchVPNInfo(), null, null, str, java.lang.Integer.valueOf(fjfviF()), 0, null, false, false, null, MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED, null);
        java.util.ArrayList<com.okinc.wallet.core.sign.evm.EVMAuthorization> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(authorizationList, 10));
        int i = 0;
        for (java.lang.Object obj : authorizationList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SignParams signParams3 = signParams;
            com.okinc.wallet.core.sign.evm.EVMAuthorization eVMAuthorizationKWHzl = xYZ.KWHzl.KWHzl(signParams3, new com.okinc.wallet.core.sign.evm.EVMAuthorization(C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl("1", java.lang.Integer.valueOf(i)), false, (RoundingMode) null, 3, (java.lang.Object) null)), ((EVMAuthorization) obj).getAddress(), C33491mxU.copydefault(QKVWgx()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null));
            if (eVMAuthorizationKWHzl == null) {
                return null;
            }
            arrayList.add(eVMAuthorizationKWHzl);
            i++;
            signParams = signParams3;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (com.okinc.wallet.core.sign.evm.EVMAuthorization eVMAuthorization : arrayList) {
            arrayList2.add(new EVMAuthorization(eVMAuthorization.getChainId(), eVMAuthorization.getAddress(), eVMAuthorization.getNonce(), eVMAuthorization.getYParity(), eVMAuthorization.getR(), eVMAuthorization.getS()));
        }
        return arrayList2;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5004, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        Application applicationFetchVPNInfo = fetchVPNInfo(str);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) applicationFetchVPNInfo.KWHzl()) && C33129mqd.KWHzl((java.util.Collection) applicationFetchVPNInfo.OLrzqt())) {
            java.lang.String strKWHzl = applicationFetchVPNInfo.KWHzl();
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, strKWHzl == null ? "" : strKWHzl, null, 46, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return AEQbTJ(abstractC58185ywXKWHzl2, applicationFetchVPNInfo.OLrzqt());
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public final java.util.List<com.okinc.wallet.core.sign.evm.EVMAuthorization> values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<EVMAuthorization> authorizationList = QVsKAR().getAuthorizationList();
        if (authorizationList == null) {
            return null;
        }
        SignParams signParams = signParams;
        SignParams signParams2 = new SignParams(dHguZz().QKVWgx(), dHguZz().fetchVPNInfo(), null, str, null, null, 0, null, false, false, null, 2036, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(authorizationList, 10));
        int i = 0;
        for (java.lang.Object obj : authorizationList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SignParams signParams3 = signParams;
            com.okinc.wallet.core.sign.evm.EVMAuthorization eVMAuthorizationCopydefault = xYZ.KWHzl.copydefault(signParams3, new com.okinc.wallet.core.sign.evm.EVMAuthorization(C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(V_(), "1"), java.lang.Integer.valueOf(i)), false, (RoundingMode) null, 3, (java.lang.Object) null)), ((EVMAuthorization) obj).getAddress(), C33491mxU.copydefault(QKVWgx()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null));
            if (eVMAuthorizationCopydefault == null) {
                return null;
            }
            arrayList.add(eVMAuthorizationCopydefault);
            i++;
            signParams = signParams3;
        }
        return arrayList;
    }

    public final Application fetchVPNInfo(java.lang.String str) {
        java.util.List<com.okinc.wallet.core.sign.evm.EVMAuthorization> listValues = values(str);
        if (listValues == null) {
            return new Application(null, null);
        }
        xYZ xyz = xYZ.KWHzl;
        long jValueOf = C33129mqd.valueOf(QKVWgx());
        SigData sigDataUeEOUB = UeEOUB();
        sigDataUeEOUB.setAuthorizationList(listValues);
        Unit unit = Unit.INSTANCE;
        java.lang.String strEZpvd = xyz.EZpvd(str, jValueOf, sigDataUeEOUB);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
        for (com.okinc.wallet.core.sign.evm.EVMAuthorization eVMAuthorization : listValues) {
            arrayList.add(new EVMAuthorization(eVMAuthorization.getChainId(), eVMAuthorization.getAddress(), eVMAuthorization.getNonce(), eVMAuthorization.getYParity(), eVMAuthorization.getR(), eVMAuthorization.getS()));
        }
        return new Application(strEZpvd, arrayList);
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm
    public java.lang.String dvKsVJ() {
        return RVsVBY();
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        return QXDzTk() ? "82" : "81";
    }

    public final boolean QXDzTk() {
        java.lang.String strRVsVBY = RVsVBY();
        if (strRVsVBY == null) {
            strRVsVBY = "";
        }
        java.lang.String lowerCase = strRVsVBY.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return Intrinsics.EZpvd((java.lang.Object) "0x0000000000000000000000000000000000000000", (java.lang.Object) C54910xZw.OLrzqt(lowerCase));
    }

    public final java.lang.String RVsVBY() {
        EVMAuthorization eVMAuthorization;
        java.util.List<EVMAuthorization> authorizationList = QVsKAR().getAuthorizationList();
        if (authorizationList == null || (eVMAuthorization = (EVMAuthorization) CollectionsKt___CollectionsKt.wlaJM(authorizationList)) == null) {
            return null;
        }
        return eVMAuthorization.getAddress();
    }

    /* JADX INFO: renamed from: o.bNl$Application */
    public static final class Application {
        public final java.lang.String KWHzl;
        public final java.util.List<EVMAuthorization> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bNl$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                list = application.copydefault;
            }
            return application.KWHzl(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(java.lang.String str, java.util.List<EVMAuthorization> list) {
            return new Application(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<EVMAuthorization> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.util.List<EVMAuthorization> list = this.copydefault;
            return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignResult(signedTx=" + this.KWHzl + ", authorizationList=" + this.copydefault + ")";
        }

        public Application(java.lang.String str, java.util.List<EVMAuthorization> list) {
            this.KWHzl = str;
            this.copydefault = list;
        }
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData] */
    public static final kotlin.Pair EZpvd(C9024bNl c9024bNl, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c9024bNl.KWHzl((WalletGasLimitRes) data);
            java.lang.String gasLimitRate = c9024bNl.QVsKAR().getGasLimitRate();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) gasLimitRate) && C33129mqd.OLrzqt((java.lang.CharSequence) c9024bNl.AkhnZx().getOriginGasLimit())) {
                c9024bNl.AkhnZx().setGasLimit(C54862xYb.convertToString$default(C54862xYb.OLrzqt(c9024bNl.AkhnZx().getOriginGasLimit(), gasLimitRate), false, 0, RoundingMode.UP, 1, null));
            } else if (c9024bNl.DcqEDu() != null && c9024bNl.QwvEab() != 2 && c9024bNl.QwvEab() != 5) {
                c9024bNl.AkhnZx().setGasLimit(c9024bNl.DcqEDu());
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
