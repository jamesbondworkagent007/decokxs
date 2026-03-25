package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignMessageData;
import com.okinc.business.defi.api.model.tx.signdata.CosmosMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.SignType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import com.okinc.wallet.core.sign.cosmos.RSVSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.RSV;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8857bKd extends AbstractC8610bFv<CosmosMessageSignData> {
    public CosmosContractSignMessageData AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bKi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8857bKd.OLrzqt(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull CosmosContractSignMessageData cosmosContractSignMessageData) {
        Intrinsics.checkNotNullParameter(cosmosContractSignMessageData, "");
        this.AEQbTJ = cosmosContractSignMessageData;
    }

    public final CosmosContractSignMessageData OLrzqt() {
        CosmosContractSignMessageData cosmosContractSignMessageData = this.AEQbTJ;
        if (cosmosContractSignMessageData != null) {
            return cosmosContractSignMessageData;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C8848bKU KWHzl() {
        return (C8848bKU) this.EZpvd.getValue();
    }

    public static final C8848bKU OLrzqt(C8857bKd c8857bKd) {
        return new C8848bKU(c8857bKd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<CosmosMessageSignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        java.lang.Object objEZpvd = C33490mxT.EZpvd(((CosmosMessageSignData) QVsKAR()).getData(), (java.lang.Class<java.lang.Object>) CosmosContractSignMessageData.class);
        Intrinsics.copydefault(objEZpvd);
        copydefault((CosmosContractSignMessageData) objEZpvd);
        return zKWHzl;
    }

    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) {
        java.lang.Object value;
        CosmosContractSignMessageData.Message message;
        java.util.List<CosmosContractSignMessageData.Message> msgs = OLrzqt().getMsgs();
        if (msgs == null || (message = (CosmosContractSignMessageData.Message) CollectionsKt___CollectionsKt.firstOrNull(msgs)) == null || (value = message.getValue()) == null) {
            value = "";
        }
        byte[] bArrDecode = android.util.Base64.decode(C33490mxT.copydefault(value).getAsJsonObject().get("data").getAsString(), 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        java.nio.charset.Charset charsetDefaultCharset = java.nio.charset.Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
        return new java.lang.String(bArrDecode, charsetDefaultCharset);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<CosmosContractSignMessageData.Message> msgs = OLrzqt().getMsgs();
        if (msgs == null || msgs.isEmpty()) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.lang.String strCopydefault = KWHzl().copydefault(str);
        if (strCopydefault.length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AEQbTJ(KWHzl().EZpvd(strCopydefault), "")), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.bKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C8857bKd.AEQbTJ(this.copydefault);
            }
        }, new Function2() { // from class: o.bKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C8857bKd.KWHzl(this.copydefault, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.bKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C8857bKd.OLrzqt((CosmosSignedTx) obj));
            }
        }));
    }

    public static final TxMessage AEQbTJ(C8857bKd c8857bKd) {
        return c8857bKd.KWHzl().AEQbTJ();
    }

    public static final CosmosSignedTx KWHzl(C8857bKd c8857bKd, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return xYV.copydefault.EZpvd(c8857bKd.dHguZz().QKVWgx(), new RSVSignatureRawValue(rsv.getR(), rsv.getS(), rsv.getV(), str, java.lang.Integer.valueOf(SignType.SignTypeAminoMsg.getType())));
    }

    public static final boolean OLrzqt(CosmosSignedTx cosmosSignedTx) {
        Intrinsics.checkNotNullParameter(cosmosSignedTx, "");
        java.lang.String signature = cosmosSignedTx.getSignature();
        return !(signature == null || signature.length() == 0);
    }

    public static final ResponseData OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(AbstractC58185ywX<ResponseData<CosmosSignedTx>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8857bKd.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8857bKd.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData OLrzqt(C8857bKd c8857bKd, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            C8848bKU c8848bKUKWHzl = c8857bKd.KWHzl();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.String signature = ((CosmosSignedTx) data).getSignature();
            Intrinsics.copydefault((java.lang.Object) signature);
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(c8857bKd, c8848bKUKWHzl.EZpvd(signature), null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }
}
