package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.AptosSignType;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.AptosContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData;
import com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosSignInfo;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.aptos.AptosPayloadTransaction;
import com.okinc.wallet.core.sign.aptos.AptosSignedTx;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import o.InterfaceC8702bHh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bHg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8701bHg<SignData extends AptosContractSignData> extends AbstractC8601bFm<C8748bIa, SignData> implements InterfaceC8702bHh {
    public java.lang.String AYXKKw;
    public AptosSignInfo OcIXYQ;
    public java.lang.String fetchVPNInfo;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.bHr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8701bHg.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.bHq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8701bHg.EZpvd(this.KWHzl);
        }
    });
    public boolean AhwBna = true;
    public boolean valueOf = true;

    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull AptosSignInfo aptosSignInfo) {
        Intrinsics.checkNotNullParameter(aptosSignInfo, "");
        this.OcIXYQ = aptosSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AhwBna = z;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8702bHh
    public java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC8702bHh
    public java.lang.String KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.valueOf;
    }

    @Override // o.InterfaceC8702bHh
    public java.lang.String OLrzqt() {
        return InterfaceC8702bHh.ActionBar.OLrzqt(this);
    }

    @Override // o.InterfaceC8702bHh
    public java.lang.String copydefault() {
        return InterfaceC8702bHh.ActionBar.copydefault(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: fARcdN, reason: merged with bridge method [inline-methods] */
    public C8748bIa DXXBbs() {
        return (C8748bIa) this.djBIcL.getValue();
    }

    public static final C8748bIa copydefault(C8701bHg c8701bHg) {
        return new C8748bIa(c8701bHg, c8701bHg);
    }

    public final C8749bIb djSkpj() {
        return (C8749bIb) this.ORxRYg.getValue();
    }

    public static final C8749bIb EZpvd(C8701bHg c8701bHg) {
        return new C8749bIb(c8701bHg);
    }

    public AptosSignInfo aKErDB() {
        AptosSignInfo aptosSignInfo = this.OcIXYQ;
        if (aptosSignInfo != null) {
            return aptosSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        if (giSNqX()) {
            AEQbTJ(QVsKAR().getMaxGasAmount());
        }
        if (gasjUx()) {
            KWHzl(QVsKAR().getGasUnitPrice());
        }
        return super.q_();
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFlVtFt = flVtFt();
        final Function1 function1 = new Function1() { // from class: o.bHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.djBIcL(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdKWHzl = abstractC58185ywXFlVtFt.KWHzl(new InterfaceC58229yxO() { // from class: o.bHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.fvQaOB(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.bHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8701bHg.EZpvd(this.EZpvd, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, interfaceC60096zvdKWHzl, new InterfaceC58223yxI() { // from class: o.bHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C8701bHg.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(C8701bHg c8701bHg, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            if (c8701bHg.ODXsMY()) {
                return OKWBaseTransaction.preExecTransaction$default(c8701bHg, null, 1, null);
            }
            if (!c8701bHg.giSNqX()) {
                return c8701bHg.fvQaOB();
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(C8701bHg c8701bHg, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c8701bHg.DXXBbs().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (!ODXsMY()) {
            return super.KWHzl(z);
        }
        if (!z) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return super.KWHzl(true);
    }

    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return C54862xYb.convertToBigIntegerString$default(QVsKAR().getValue(), true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        java.lang.String to = QVsKAR().getTo();
        return to == null ? "" : to;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        final Function1 function1 = new Function1() { // from class: o.bHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.valueOf(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFZBcTu.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit valueOf(C8701bHg c8701bHg, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8701bHg.DXXBbs().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        AptosSignInfo aptosSignInfoAKErDB = aKErDB();
        if (aptosSignInfoAKErDB == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(aptosSignInfoAKErDB);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(aptosSignInfoAKErDB, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.copydefault(this.copydefault, (AptosSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.gasjUx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(C8701bHg c8701bHg, AptosSignInfo aptosSignInfo) {
        Intrinsics.checkNotNullParameter(aptosSignInfo, "");
        c8701bHg.AEQbTJ(aptosSignInfo);
        return c8701bHg.UeEOUB();
    }

    public static final kotlin.Pair giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        final Function1 function1 = new Function1() { // from class: o.bHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.AhwBna(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFZBcTu.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(C8701bHg c8701bHg, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c8701bHg.DXXBbs().KWHzl(1);
        }
        return pair;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        java.lang.String from = QVsKAR().getFrom();
        return from == null ? "" : from;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        java.util.List list;
        java.lang.Object objM7377constructorimpl;
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setTo(zLjUOn());
        preExecTransactionReqRdAHlO.setMethod("signTransaction");
        AptosPayloadTransaction aptosPayloadTransactionCopydefault = djSkpj().copydefault();
        java.lang.String amount = aptosPayloadTransactionCopydefault.getAmount();
        java.lang.String publicKey = fERRXa().getPublicKey();
        java.lang.String sequenceNumber = aptosPayloadTransactionCopydefault.getSequenceNumber();
        java.lang.String gasUnitPrice = aKErDB().getGasUnitPrice();
        java.lang.String str = gasUnitPrice == null ? "" : gasUnitPrice;
        java.lang.String expirationTimestampSecs = aptosPayloadTransactionCopydefault.getExpirationTimestampSecs();
        java.lang.String str2 = expirationTimestampSecs == null ? "" : expirationTimestampSecs;
        java.lang.String secondarySignerAddresses = QVsKAR().getSecondarySignerAddresses();
        if (secondarySignerAddresses == null || secondarySignerAddresses.length() == 0) {
            list = null;
        } else {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl)), secondarySignerAddresses));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            list = (java.util.List) objM7377constructorimpl;
        }
        AptosPreExecDappData.Transaction transaction = new AptosPreExecDappData.Transaction(amount, (java.lang.String) null, (java.lang.String) null, publicKey, sequenceNumber, (java.lang.String) null, str, str2, list, 6, (DefaultConstructorMarker) null);
        java.lang.String aptosPayload = QVsKAR().getAptosPayload();
        java.lang.String payload = aptosPayload != null ? aptosPayload : "";
        if (payload.length() == 0) {
            payload = aptosPayloadTransactionCopydefault.getPayload();
        }
        preExecTransactionReqRdAHlO.setDappData(C33488mxR.EZpvd(new AptosPreExecDappData(transaction, new AptosPreExecDappData.Data(payload, aptosPayloadTransactionCopydefault.getAbi(), new AptosPreExecDappData.Data.Options(giSNqX() ? QVsKAR().getMaxGasAmount() : null, gasjUx() ? QVsKAR().getGasUnitPrice() : null), aptosPayloadTransactionCopydefault.isRawType()))));
        return preExecTransactionReqRdAHlO;
    }

    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        WalletGasLimitRes gasFee;
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        if (giSNqX()) {
            return;
        }
        TxInfoItem txInfo = preExecTransactionRes.getTxInfo();
        AEQbTJ((txInfo == null || (gasFee = txInfo.getGasFee()) == null) ? null : gasFee.getGasLimit());
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = fZBcTu();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final ActionBar actionBar = new ActionBar(this, str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.gGvvIC(actionBar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.bHg$ActionBar */
    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ C8701bHg<SignData> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C8701bHg<SignData> c8701bHg, java.lang.String str) {
            this.copydefault = c8701bHg;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            kotlin.Pair pairOLrzqt;
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                SignedTx signedTxOLrzqt = this.copydefault.OLrzqt(this.EZpvd);
                java.lang.String tx = signedTxOLrzqt.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                if (this.copydefault.RcXXUw().isSignRaw() && this.copydefault.OJuSTm().getBroadcastDelegate() == null) {
                    try {
                        Result.Application application = Result.Companion;
                        KSerializer<AptosSignedTx> kSerializerSerializer = AptosSignedTx.Companion.serializer();
                        java.lang.String tx2 = signedTxOLrzqt.getTx();
                        Intrinsics.copydefault((java.lang.Object) tx2);
                        objM7377constructorimpl = Result.m7377constructorimpl((AptosSignedTx) C54907xZt.OLrzqt(kSerializerSerializer, tx2));
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    AptosSignedTx aptosSignedTx = new AptosSignedTx((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = aptosSignedTx;
                    }
                    AptosSignedTx aptosSignedTx2 = (AptosSignedTx) objM7377constructorimpl;
                    pairOLrzqt = C56390yDp.OLrzqt(aptosSignedTx2.getRawTxn(), aptosSignedTx2.getTxHash());
                } else {
                    java.lang.String tx3 = signedTxOLrzqt.getTx();
                    Intrinsics.copydefault((java.lang.Object) tx3);
                    java.lang.String txHash = signedTxOLrzqt.getTxHash();
                    pairOLrzqt = C56390yDp.OLrzqt(tx3, txHash != null ? txHash : "");
                }
                java.lang.String str = (java.lang.String) pairOLrzqt.component1();
                java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
                C8701bHg<SignData> c8701bHg = this.copydefault;
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c8701bHg, str, str2, null, c8701bHg.djBIcL(), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            java.lang.String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    public static final InterfaceC60096zvd gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public AptosExtJson djBIcL() {
        return new AptosExtJson(C54862xYb.convertToBigIntegerString$default(aKErDB().getSequenceNumber(), false, (RoundingMode) null, 3, (java.lang.Object) null), null);
    }

    public long AEQbTJ() {
        return dHguZz().AhwBna();
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fZBcTu() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFlVtFt = flVtFt();
        final Function1 function1 = new Function1() { // from class: o.bHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.copydefault(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXFlVtFt.KWHzl(new InterfaceC58229yxO() { // from class: o.bHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.dvKsVJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C8701bHg c8701bHg, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c8701bHg.UeEOUB();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> flVtFt() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jAEQbTJ = AEQbTJ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jAEQbTJ), fERRXa().getAddress(), zLjUOn(), ai_(), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.fFgQHt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public java.lang.String dvKsVJ() {
        return djSkpj().AEQbTJ();
    }

    public SignedTx OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return djSkpj().OLrzqt(str);
    }

    public final AptosSignType RcXXUw() {
        return QVsKAR().getSignType();
    }

    public final boolean giSNqX() {
        return RcXXUw().isSignRaw() && C33129mqd.AEQbTJ(QVsKAR().getMaxGasAmount(), 0);
    }

    public final boolean gasjUx() {
        return RcXXUw().isSignRaw() && C33129mqd.AEQbTJ(QVsKAR().getGasUnitPrice(), 0);
    }

    /* JADX INFO: renamed from: o.bHg$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<AptosSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bHg.Activity.4
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bHg.Activity.1
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bHg.Activity.5
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) AptosSignInfo.class));
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

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        if (giSNqX()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (ODXsMY()) {
            return OKWBaseTransaction.preExecTransaction$default(this, null, 1, null);
        }
        return fvQaOB();
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fvQaOB() {
        AbstractC58185ywX abstractC58185ywXCopydefault = ixgjPv().copydefault(fERRXa().getAddress(), dvKsVJ(), "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(AEQbTJ()), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.bHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8701bHg.copydefault(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8701bHg.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C8701bHg c8701bHg, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8701bHg.copydefault(((SignInfo) data).getSupportPush());
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<AptosSignInfo> kSerializerSerializer = AptosSignInfo.Companion.serializer();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            kotlinx.serialization.json.JsonObject info = ((SignInfo) data2).getInfo();
            Intrinsics.copydefault(info);
            c8701bHg.AEQbTJ((AptosSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            if (!c8701bHg.gasjUx()) {
                c8701bHg.KWHzl(c8701bHg.aKErDB().getGasUnitPrice());
            }
            c8701bHg.ac_().OLrzqt(c8701bHg.aKErDB().getReserveFeeRatio());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair copydefault(C8701bHg c8701bHg, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8701bHg.AEQbTJ(((WalletGasLimitRes) data).getGasLimit());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
