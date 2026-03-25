package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.TonContractSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonInputData;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.ton.TonSignedTx;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ccD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11865ccD extends AbstractC8601bFm<C11917cdC, TonContractSignData> implements InterfaceC11891ccd {
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public TonSignInfo fetchVPNInfo;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ccT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11865ccD.KWHzl(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ccV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11865ccD.OLrzqt(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.AhwBna = str;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11891ccd
    public java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11891ccd
    public java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull TonSignInfo tonSignInfo) {
        Intrinsics.checkNotNullParameter(tonSignInfo, "");
        this.fetchVPNInfo = tonSignInfo;
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C11917cdC fJNWhG() {
        return (C11917cdC) this.valueOf.getValue();
    }

    public static final C11917cdC KWHzl(C11865ccD c11865ccD) {
        return new C11917cdC(c11865ccD, c11865ccD);
    }

    public final C11916cdB fARcdN() {
        return (C11916cdB) this.djBIcL.getValue();
    }

    public static final C11916cdB OLrzqt(C11865ccD c11865ccD) {
        return new C11916cdB(c11865ccD);
    }

    @Override // o.InterfaceC11891ccd
    public TonSignInfo AEQbTJ() {
        TonSignInfo tonSignInfo = this.fetchVPNInfo;
        if (tonSignInfo != null) {
            return tonSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final Function1 function1 = new Function1() { // from class: o.ccP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.gEmmrt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdKWHzl = abstractC58185ywXRcXXUw.KWHzl(new InterfaceC58229yxO() { // from class: o.ccR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.giSNqX(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.ccN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11865ccD.KWHzl(this.copydefault, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, interfaceC60096zvdKWHzl, new InterfaceC58223yxI() { // from class: o.ccQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11865ccD.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final InterfaceC60096zvd giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd gEmmrt(C11865ccD c11865ccD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11865ccD.KWHzl(true);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(C11865ccD c11865ccD, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c11865ccD.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        boolean zEZpvd;
        super.q_();
        TonContractSignData.Payload payloadKWHzl = KWHzl();
        java.lang.String from = payloadKWHzl != null ? payloadKWHzl.getFrom() : null;
        if (from == null || from.length() == 0) {
            zEZpvd = false;
        } else {
            C14079deg c14079deg = C14079deg.EZpvd;
            zEZpvd = Intrinsics.EZpvd((java.lang.Object) c14079deg.EZpvd(htlTjW(), 1), (java.lang.Object) c14079deg.EZpvd(from, 1));
        }
        UlJrfe().AEQbTJ(new C9882bdv(zEZpvd));
        C8497bDo c8497bDoUlJrfe = UlJrfe();
        TonContractSignData.Payload payloadKWHzl2 = KWHzl();
        c8497bDoUlJrfe.AEQbTJ(new C9886bdz(Intrinsics.EZpvd((java.lang.Object) (payloadKWHzl2 != null ? payloadKWHzl2.getNetwork() : null), (java.lang.Object) "-239")));
        return true;
    }

    public static final kotlin.Pair flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final Function1 function1 = new Function1() { // from class: o.cdb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.djBIcL(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRcXXUw.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair djBIcL(C11865ccD c11865ccD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11865ccD.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.util.List<TonContractSignData.Message> messages;
        java.lang.Object next;
        java.lang.String address;
        TonContractSignData.Payload payloadKWHzl = KWHzl();
        java.lang.String strEZpvd = null;
        if (payloadKWHzl != null && (messages = payloadKWHzl.getMessages()) != null) {
            java.util.Iterator<T> it = messages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TonContractSignData.Message) next).getAddress())) {
                    break;
                }
            }
            TonContractSignData.Message message = (TonContractSignData.Message) next;
            if (message != null && (address = message.getAddress()) != null) {
                strEZpvd = C14079deg.EZpvd.EZpvd(address, 2);
            }
        }
        return strEZpvd == null ? "" : strEZpvd;
    }

    public static final Unit fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRcXXUw = RcXXUw();
        final Function1 function1 = new Function1() { // from class: o.ccK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.valueOf(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRcXXUw.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit valueOf(C11865ccD c11865ccD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11865ccD.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (!z) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return super.KWHzl(true);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        java.lang.String strEncodeToString$default;
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setInputData(djSkpj());
        TonContractSignData.Payload payloadKWHzl = KWHzl();
        if (payloadKWHzl == null || (strEncodeToString$default = C54907xZt.encodeToString$default(TonContractSignData.Payload.Companion.serializer(), payloadKWHzl, false, 2, null)) == null) {
            strEncodeToString$default = "";
        }
        txToastCheckReqI_.setAdditionalData(C56423yEv.EZpvd(C56390yDp.OLrzqt("tonSignData", strEncodeToString$default)));
        return txToastCheckReqI_;
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        int iQwvEab = QwvEab();
        if (iQwvEab == 2 || iQwvEab == 3 || iQwvEab == 5 || iQwvEab == 7) {
            if (newProxyInstance.contains(2)) {
                newProxyInstance.remove((java.lang.Object) 2);
            }
            newProxyInstance.add(9);
        }
        return newProxyInstance;
    }

    public static final InterfaceC60096zvd gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        TonSignInfo tonSignInfoAEQbTJ = AEQbTJ();
        if (tonSignInfoAEQbTJ == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(tonSignInfoAEQbTJ);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ActionBar(tonSignInfoAEQbTJ, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.ccH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.copydefault(this.OLrzqt, (TonSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ccG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(C11865ccD c11865ccD, TonSignInfo tonSignInfo) {
        Intrinsics.checkNotNullParameter(tonSignInfo, "");
        c11865ccD.copydefault(tonSignInfo);
        return c11865ccD.aKErDB();
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        TonContractSignData.Payload payloadKWHzl;
        java.util.List<TonContractSignData.Message> messages;
        if (!z || (payloadKWHzl = KWHzl()) == null || (messages = payloadKWHzl.getMessages()) == null) {
            return null;
        }
        return C54907xZt.encodeToString$default(BuiltinSerializersKt.ListSerializer(TonContractSignData.Message.Companion.serializer()), messages, false, 2, null);
    }

    /* JADX DEBUG: Type inference failed for r11v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        if (KWHzl() == null) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.ccW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.AEQbTJ(this.copydefault, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXUeEOUB.KWHzl(new InterfaceC58229yxO() { // from class: o.ccS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.gasjUx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C11865ccD c11865ccD, java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
        }
        C11916cdB c11916cdBFARcdN = c11865ccD.fARcdN();
        TonContractSignData.Payload payloadKWHzl = c11865ccD.KWHzl();
        Intrinsics.copydefault(payloadKWHzl);
        TonSignedTx tonSignedTxEZpvd = c11916cdBFARcdN.EZpvd(str, payloadKWHzl);
        if (tonSignedTxEZpvd == null || tonSignedTxEZpvd.getTx().length() == 0) {
            return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
        }
        java.lang.String tx = tonSignedTxEZpvd.getTx();
        java.lang.String txHash = tonSignedTxEZpvd.getTxHash();
        return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c11865ccD, tx, txHash == null ? "" : txHash, null, new TonExtJson(C54862xYb.convertToBigIntegerString$default(c11865ccD.AEQbTJ().getNonce(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.Boolean) null, 2, (DefaultConstructorMarker) null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RcXXUw() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function1 function1 = new Function1() { // from class: o.ccU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUeEOUB.KWHzl(new InterfaceC58229yxO() { // from class: o.ccX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.dvKsVJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C11865ccD c11865ccD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11865ccD.aKErDB();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDmfpNf = dmfpNf();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDmfpNf), fERRXa().getAddress(), zLjUOn(), ai_(), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.ccM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> aKErDB() {
        if (djSkpj().length() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = ixgjPv().copydefault(fERRXa().getAddress(), djSkpj(), "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(dmfpNf()), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.ccI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11865ccD.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11865ccD.fFgQHt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final java.lang.String djSkpj() {
        if (KWHzl() != null) {
            C11916cdB c11916cdBFARcdN = fARcdN();
            TonContractSignData.Payload payloadKWHzl = KWHzl();
            Intrinsics.copydefault(payloadKWHzl);
            TonSignedTx tonSignedTxOLrzqt = c11916cdBFARcdN.OLrzqt(payloadKWHzl);
            java.lang.String strEncodeToString$default = tonSignedTxOLrzqt != null ? C54907xZt.encodeToString$default(TonInputData.Companion.serializer(), new TonInputData(tonSignedTxOLrzqt.getAddress(), tonSignedTxOLrzqt.getTx(), tonSignedTxOLrzqt.getCode(), tonSignedTxOLrzqt.getData(), true), false, 2, null) : null;
            if (strEncodeToString$default != null) {
                return strEncodeToString$default;
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final TonContractSignData.Payload KWHzl() {
        return (TonContractSignData.Payload) CollectionsKt___CollectionsKt.firstOrNull(((TonContractSignData) QVsKAR()).getParams());
    }

    /* JADX INFO: renamed from: o.ccD$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<TonSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.EZpvd;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.ccD.ActionBar.2
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.ccD.ActionBar.1
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.ccD.ActionBar.4
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) TonSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.KWHzl;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    public static final kotlin.Pair OLrzqt(C11865ccD c11865ccD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c11865ccD.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<TonSignInfo> kSerializerSerializer = TonSignInfo.Companion.serializer();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            kotlinx.serialization.json.JsonObject info = ((SignInfo) data).getInfo();
            Intrinsics.copydefault(info);
            c11865ccD.copydefault((TonSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(C11865ccD c11865ccD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11865ccD.AEQbTJ(((WalletGasLimitRes) data).getGasLimit());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
