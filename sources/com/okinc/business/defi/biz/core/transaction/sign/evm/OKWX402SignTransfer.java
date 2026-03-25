package com.okinc.business.defi.biz.core.transaction.sign.evm;

import android.webkit.ValueCallback;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.evm.OKWX402SignTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EVMExtJson;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.AbstractC8664bGw;
import o.C54910xZw;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C57259yez;
import o.C59449zhJ;
import o.C8998bNL;
import o.C9313bTI;
import o.InterfaceC56387yDm;
import o.InterfaceC58257yxq;
import o.InterfaceC58259yxs;
import o.pUU;
import o.xYZ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWX402SignTransfer extends C8998bNL {
    public boolean KWHzl = true;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bOE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKWX402SignTransfer.KWHzl(this.OLrzqt);
        }
    });
    public JsonElement OcIXYQ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.KWHzl = z;
    }

    @Override // o.C8998bNL, o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lo/bTG; */
    /* JADX DEBUG: Possible override for method o.bNL.flVtFt()Lo/ywX; */
    @Override // o.C8998bNL, o.InterfaceC8931bLy
    /* JADX INFO: renamed from: flVtFt, reason: merged with bridge method [inline-methods] */
    public C9313bTI fJNWhG() {
        return (C9313bTI) this.OLrzqt.getValue();
    }

    public static final C9313bTI KWHzl(OKWX402SignTransfer oKWX402SignTransfer) {
        return new C9313bTI(oKWX402SignTransfer, oKWX402SignTransfer);
    }

    @Override // o.C8998bNL
    public AbstractC58185ywX<Pair<Boolean, String>> fZBcTu() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8998bNL
    public AbstractC58185ywX<Pair<Boolean, String>> djSkpj() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setMethod("wallet_x402_transfer");
        return preExecTransactionReqRdAHlO;
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        TxInfoItem txInfo = preExecTransactionRes.getTxInfo();
        this.OcIXYQ = txInfo != null ? txInfo.getX402Message() : null;
    }

    @Override // o.C8998bNL, o.AbstractC8664bGw, o.AbstractC8564bFB
    public ArrayList<Integer> AuCTelauCTel() {
        return new ArrayList<>();
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final JsonElement jsonElement = this.OcIXYQ;
        if (jsonElement == null) {
            pUU.copydefault("OKWX402SignTransfer", "x402Message is null");
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXEZpvd = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                OKWX402SignTransfer.EZpvd(jsonElement, str, this, interfaceC58257yxq);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final void EZpvd(final JsonElement jsonElement, final String str, final OKWX402SignTransfer oKWX402SignTransfer, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        final Gson gson = new Gson();
        final String json = gson.toJson(jsonElement);
        C57259yez.copydefault.copydefault("okCalTypedDataVersioned", gson.toJson(yDY.gEmmrt(json, "V4")), new ValueCallback() { // from class: o.bOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                OKWX402SignTransfer.EZpvd(json, interfaceC58257yxq, str, oKWX402SignTransfer, gson, jsonElement, (java.lang.String) obj);
            }
        });
    }

    public static final void EZpvd(String str, InterfaceC58257yxq interfaceC58257yxq, String str2, OKWX402SignTransfer oKWX402SignTransfer, Gson gson, JsonElement jsonElement, String str3) {
        String strReplace$default;
        Object objM7377constructorimpl;
        if (str3 == null || (strReplace$default = C59449zhJ.replace$default(str3, "\\", "", false, 4, (Object) null)) == null) {
            strReplace$default = "";
        }
        if (Intrinsics.EZpvd((Object) strReplace$default, (Object) AbstractJsonLexerKt.NULL) || strReplace$default.length() == 0) {
            pUU.copydefault("OKWX402SignTransfer", "okCalTypedDataVersioned, x402MessageString: " + str);
            interfaceC58257yxq.onSuccess(new ResponseData(-5005, null, null, null, null, null, 62, null));
            return;
        }
        String strOLrzqt = C54910xZw.OLrzqt(xYZ.KWHzl.AEQbTJ(C54910xZw.EZpvd(str2), strReplace$default, false));
        try {
            Result.Application application = Result.Companion;
            JsonObject asJsonObject = jsonElement.getAsJsonObject().getAsJsonObject("message");
            Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
            objM7377constructorimpl = Result.m7377constructorimpl(gson.toJson(new X402SignedTx(strOLrzqt, asJsonObject)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("OKWX402SignTransfer", "message, x402MessageString: " + str, thM7380exceptionOrNullimpl);
            objM7377constructorimpl = "";
        }
        Intrinsics.checkNotNullExpressionValue(objM7377constructorimpl, "");
        BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(oKWX402SignTransfer, (String) objM7377constructorimpl, null, null, new EVMExtJson(null, null, null, null, oKWX402SignTransfer.dHguZz().valueOf(), oKWX402SignTransfer.aKErDB(), null, null, null, null, 512, null), 4, null);
        broadcastBeanGenerateBroadcastModel$default.setX402transfer(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        interfaceC58257yxq.onSuccess(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (List) null, (Boolean) null, (String) null, (Boolean) null, (Integer) null, (String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
    }

    public static final class X402SignedTx {
        private final JsonElement authorization;
        private final String signature;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ X402SignedTx copy$default(X402SignedTx x402SignedTx, String str, JsonElement jsonElement, int i, Object obj) {
            if ((i & 1) != 0) {
                str = x402SignedTx.signature;
            }
            if ((i & 2) != 0) {
                jsonElement = x402SignedTx.authorization;
            }
            return x402SignedTx.copy(str, jsonElement);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonElement component2() {
            return this.authorization;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final X402SignedTx copy(@NotNull String str, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            return new X402SignedTx(str, jsonElement);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof X402SignedTx)) {
                return false;
            }
            X402SignedTx x402SignedTx = (X402SignedTx) obj;
            return Intrinsics.EZpvd((Object) this.signature, (Object) x402SignedTx.signature) && Intrinsics.EZpvd(this.authorization, x402SignedTx.authorization);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonElement getAuthorization() {
            return this.authorization;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignature() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.signature.hashCode() * 31) + this.authorization.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "X402SignedTx(signature=" + this.signature + ", authorization=" + this.authorization + ")";
        }

        public X402SignedTx(@NotNull String str, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.signature = str;
            this.authorization = jsonElement;
        }
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
