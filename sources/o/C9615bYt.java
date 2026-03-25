package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo;
import com.okinc.business.defi.biz.net.bean.JitoInfoResult;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.SimulateTransactionParam;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
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
import kotlinx.serialization.json.Json;
import o.InterfaceC9462bVz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bYt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9615bYt extends AbstractC8664bGw<C9592bYW, TransferSignData> implements InterfaceC9462bVz {
    public SolanaSignInfo AYXKKw;
    public JitoInfoResult EZpvd;
    public int gEmmrt;
    public final java.util.ArrayList<java.lang.String> copydefault = new java.util.ArrayList<>();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bYI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9615bYt.KWHzl(this.copydefault);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.bYM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9615bYt.EZpvd(this.KWHzl);
        }
    });
    public boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public SolanaSignInfo AkhnZx() {
        return this.AYXKKw;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(SolanaSignInfo solanaSignInfo) {
        this.AYXKKw = solanaSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoInfoResult QKVWgx() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public int isConnected() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public java.util.ArrayList<java.lang.String> valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9462bVz
    public java.lang.String values() {
        return "1";
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String AEQbTJ() {
        return InterfaceC9462bVz.Application.KWHzl(this);
    }

    @Override // o.InterfaceC9462bVz
    public boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.copydefault(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.KWHzl(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public BigDecimal EZpvd(java.lang.String str) {
        return InterfaceC9462bVz.Application.copydefault(this, str);
    }

    public void EZpvd(int i) {
        InterfaceC9462bVz.Application.copydefault(this, i);
    }

    public C9785bcD KWHzl(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        return InterfaceC9462bVz.Application.copydefault(this, abstractC8564bFB, txToastCheckRes);
    }

    @Override // o.InterfaceC9462bVz
    public boolean KWHzl() {
        return InterfaceC9462bVz.Application.copydefault(this);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String OLrzqt(boolean z, boolean z2) {
        return InterfaceC9462bVz.Application.EZpvd(this, z, z2);
    }

    @Override // o.InterfaceC9462bVz
    public java.util.List<java.lang.String> OLrzqt() {
        return InterfaceC9462bVz.Application.EZpvd(this);
    }

    public SolanaExtJson ORxRYg() {
        return InterfaceC9462bVz.Application.AEQbTJ(this);
    }

    public void RcXXUw() {
        InterfaceC9462bVz.Application.valueOf(this);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String copydefault(boolean z, boolean z2) {
        return InterfaceC9462bVz.Application.KWHzl(this, z, z2);
    }

    @Override // o.InterfaceC9462bVz
    public void copydefault(@NotNull java.util.List<java.lang.String> list) {
        InterfaceC9462bVz.Application.EZpvd(this, list);
    }

    @Override // o.InterfaceC9462bVz
    public boolean copydefault(java.lang.String str, java.lang.String str2) {
        return InterfaceC9462bVz.Application.AEQbTJ(this, str, str2);
    }

    @Override // o.InterfaceC9462bVz
    public boolean copydefault(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
        return InterfaceC9462bVz.Application.OLrzqt(this, abstractC8564bFB, txToastCheckRes);
    }

    public boolean gEmmrt(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        return InterfaceC9462bVz.Application.KWHzl(this, abstractC8564bFB);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: djBIcL */
    public C9592bYW DXXBbs() {
        return (C9592bYW) this.OLrzqt.getValue();
    }

    public static final C9592bYW KWHzl(C9615bYt c9615bYt) {
        return new C9592bYW(c9615bYt, c9615bYt);
    }

    public final C9659bZk QVAiDq() {
        return (C9659bZk) this.KWHzl.getValue();
    }

    public static final C9659bZk EZpvd(C9615bYt c9615bYt) {
        return new C9659bZk(c9615bYt);
    }

    public static /* synthetic */ void setSolanaTxMode$default(C9615bYt c9615bYt, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        c9615bYt.OLrzqt(i);
    }

    public final void OLrzqt(int i) {
        copydefault(i);
        C17948fYf.copydefault.KWHzl(i);
    }

    @Override // o.InterfaceC9462bVz
    public java.lang.String zuBGHE() {
        return AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void x_() {
        super.x_();
        gEmmrt(this);
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<TransferSignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        checkSOLTxMode$default(this, false, 1, null);
        return zKWHzl;
    }

    public static /* synthetic */ void checkSOLTxMode$default(C9615bYt c9615bYt, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c9615bYt.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        int iCopydefault;
        SolanaSignInfo solanaSignInfoAkhnZx;
        if (!dUDNAs().sSMYrx() && (!z || (((solanaSignInfoAkhnZx = AkhnZx()) == null || !Intrinsics.EZpvd(solanaSignInfoAkhnZx.getSupportJito(), java.lang.Boolean.FALSE)) && !(this.EZpvd == null && isConnected() == 2)))) {
            C17948fYf c17948fYf = C17948fYf.copydefault;
            if (c17948fYf.copydefault() == 0) {
                c17948fYf.KWHzl(1);
                iCopydefault = 1;
            } else {
                iCopydefault = c17948fYf.copydefault();
            }
        } else {
            iCopydefault = 0;
        }
        copydefault(iCopydefault);
    }

    public AbstractC58185ywX<ResponseData<java.lang.String>> QUSxYX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAKErDB = aKErDB();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final Function2 function2 = new Function2() { // from class: o.bYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.copydefault(this.EZpvd, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXAKErDB, abstractC58185ywXDjSkpj, new InterfaceC58223yxI() { // from class: o.bYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.gEmmrt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final ResponseData gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final ResponseData copydefault(C9615bYt c9615bYt, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            if (c9615bYt.AkhnZx() != null) {
                c9615bYt.EZpvd(2);
            }
            return new ResponseData(-5001, null, null, null, "", null, 46, null);
        }
        return new ResponseData(0, (java.lang.String) pair.getSecond(), null, null, "", null, 45, null);
    }

    public static final InterfaceC60096zvd gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull final java.lang.String str, final SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXQUSxYX = QUSxYX();
        final Function1 function1 = new Function1() { // from class: o.bYA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9615bYt.AEQbTJ(this.AEQbTJ, str, submitTxExpandBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQUSxYX.KWHzl(new InterfaceC58229yxO() { // from class: o.bYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9615bYt.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(C9615bYt c9615bYt, java.lang.String str, SubmitTxExpandBean submitTxExpandBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return super.AEQbTJ(str, submitTxExpandBean);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // o.InterfaceC9462bVz
    public boolean DbNXlk() {
        return !fHqPtx().AuCTel();
    }

    public final java.lang.String OcIXYQ() {
        return fHqPtx().AuCTel() ? C54862xYb.convertToString$default(C54862xYb.AEQbTJ(AbstractC8704bHj.getCoinBalance$default(this, null, 1, null), InterfaceC9462bVz.Application.getRentSelf$default(this, false, false, 3, null)), false, null, null, 7, null) : AbstractC8704bHj.getCoinBalance$default(this, null, 1, null);
    }

    @Override // o.InterfaceC9462bVz
    public java.util.List<SolUnitLimitAndPrice> EZpvd() {
        RcXXUw();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(OLrzqt());
        SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
        return C56402yEa.EZpvd(new SolUnitLimitAndPrice(true, str, solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getComputeUnitPrice() : null));
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAKErDB = aKErDB();
        final Function1 function1 = new Function1() { // from class: o.bYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9615bYt.EZpvd(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdKWHzl = abstractC58185ywXAKErDB.KWHzl(new InterfaceC58229yxO() { // from class: o.bYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9615bYt.gasjUx(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.bYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.AYXKKw(this.OLrzqt, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, interfaceC60096zvdKWHzl, new InterfaceC58223yxI() { // from class: o.bYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.fetchVPNInfo(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final InterfaceC60096zvd gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C9615bYt c9615bYt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        SolanaSignInfo solanaSignInfoAkhnZx = c9615bYt.AkhnZx();
        if (solanaSignInfoAkhnZx != null && Intrinsics.EZpvd(solanaSignInfoAkhnZx.getSupportJito(), java.lang.Boolean.TRUE)) {
            return c9615bYt.djSkpj();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair fetchVPNInfo(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair AYXKKw(C9615bYt c9615bYt, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9615bYt.OLrzqt(true);
        c9615bYt.EZpvd(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setSimulateTransactionParamList(yDY.copydefault(new SimulateTransactionParam("", false, false, 6, null)));
        return txToastCheckReqI_;
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(8);
        newProxyInstance.add(9);
        return newProxyInstance;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public PreExecTransactionReq RdAHlO() {
        PreExecTransactionReq preExecTransactionReqRdAHlO = super.RdAHlO();
        preExecTransactionReqRdAHlO.setTo(zLjUOn());
        preExecTransactionReqRdAHlO.setDappData(new Gson().toJson(C56402yEa.EZpvd(new SimulateTransactionParam("", false, false, 6, null))));
        preExecTransactionReqRdAHlO.setMethod("wallet_inner_transfer");
        return preExecTransactionReqRdAHlO;
    }

    public static final kotlin.Pair isConnected(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAKErDB = aKErDB();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final Function2 function2 = new Function2() { // from class: o.bYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.djBIcL(this.AEQbTJ, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXAKErDB, abstractC58185ywXDjSkpj, new InterfaceC58223yxI() { // from class: o.bYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.isConnected(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair djBIcL(C9615bYt c9615bYt, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            c9615bYt.EZpvd(1);
        }
        return pair;
    }

    public static final Unit AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Unit) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAKErDB = aKErDB();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        final Function2 function2 = new Function2() { // from class: o.bYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.AhwBna(this.copydefault, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXAKErDB, abstractC58185ywXDjSkpj, new InterfaceC58223yxI() { // from class: o.bYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9615bYt.AhwBna(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final Unit AhwBna(C9615bYt c9615bYt, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            c9615bYt.EZpvd(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
        if (solanaSignInfoAkhnZx == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(solanaSignInfoAkhnZx);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Application(solanaSignInfoAkhnZx, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9615bYt.OLrzqt(this.KWHzl, (SolanaSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9615bYt.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd OLrzqt(C9615bYt c9615bYt, SolanaSignInfo solanaSignInfo) {
        Intrinsics.checkNotNullParameter(solanaSignInfo, "");
        c9615bYt.KWHzl(solanaSignInfo);
        return c9615bYt.djSkpj();
    }

    @Override // o.AbstractC8664bGw
    public java.lang.String D_() {
        java.lang.String rentSelf$default;
        java.lang.String rentSelf$default2;
        int iIsConnected = isConnected();
        if (iIsConnected == 1 || iIsConnected == 2) {
            if (!DbNXlk() && (rentSelf$default = InterfaceC9462bVz.Application.getRentSelf$default(this, false, false, 3, null)) != null) {
                return rentSelf$default;
            }
        } else if (!DbNXlk() && dHguZz().zblBkD() && (rentSelf$default2 = InterfaceC9462bVz.Application.getRentSelf$default(this, false, false, 3, null)) != null) {
            return rentSelf$default2;
        }
        return "0";
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.util.List<java.lang.String> causeRiskItem;
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(list);
        boolean z = true;
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 8) {
                KWHzl(this, txToastCheckRes);
            } else if (checkType != null && checkType.intValue() == 9 && (causeRiskItem = OHqIaq().AEQbTJ(txToastCheckRes).getCauseRiskItem()) != null && causeRiskItem.contains(TxToastCheckRes.SEND_TOKEN_TO_CONTRACT) && aUsmxb().isTransfer() && QwvEab() == 1) {
                z = false;
            }
        }
        if (AkhnZx() != null) {
            EZpvd(2);
        }
        DLWbHP().OLrzqt(C56402yEa.EZpvd(new C9874bdn(z)));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        java.util.List<java.lang.String> listAhwBna;
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        TxInfoItem txInfo = preExecTransactionRes.getTxInfo();
        if (txInfo == null || (listAhwBna = txInfo.getUnitGasLimitList()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        copydefault(listAhwBna);
        EZpvd();
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: renamed from: o.bYt$Application */
    public static final class Application<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.copydefault = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<SolanaSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.copydefault;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bYt.Application.2
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bYt.Application.3
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bYt.Application.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) SolanaSignInfo.class));
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

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        java.lang.String tx;
        Intrinsics.checkNotNullParameter(str, "");
        SignedTx signedTxKWHzl = QVAiDq().KWHzl(str);
        if (signedTxKWHzl == null || (tx = signedTxKWHzl.getTx()) == null || tx.length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        java.lang.String tx2 = signedTxKWHzl.getTx();
        java.lang.String str2 = tx2 == null ? "" : tx2;
        java.lang.String txHash = signedTxKWHzl.getTxHash();
        java.lang.String str3 = txHash == null ? "" : txHash;
        C9659bZk c9659bZkQVAiDq = QVAiDq();
        java.lang.String jitoTxHash = signedTxKWHzl.getJitoTxHash();
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(this, str2, str3, null, c9659bZkQVAiDq.OLrzqt(jitoTxHash != null ? jitoTxHash : ""), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        LedgerSignHelper.TaskDescription.ActionBar actionBar;
        C10854bwM c10854bwMDHguZz = dHguZz();
        SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
        if (solanaSignInfoAkhnZx == null) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        LedgerSignHelper.TaskDescription.StateListAnimator stateListAnimator = null;
        if (fHqPtx().AuCTel()) {
            java.lang.String address = fERRXa().getAddress();
            java.lang.String strZLjUOn = zLjUOn();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String recentBlockhash = solanaSignInfoAkhnZx.getRecentBlockhash();
            if (recentBlockhash != null) {
                stateListAnimator = new LedgerSignHelper.TaskDescription.StateListAnimator(address, strZLjUOn, strConvertToBigIntegerString$default, recentBlockhash, (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(OLrzqt()), solanaSignInfoAkhnZx.getComputeUnitPrice());
                actionBar = null;
            } else {
                AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
                return abstractC58185ywXKWHzl2;
            }
        } else {
            java.lang.String address2 = fERRXa().getAddress();
            java.lang.String strFJNWhG = fHqPtx().fJNWhG();
            java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String recentBlockhash2 = solanaSignInfoAkhnZx.getRecentBlockhash();
            if (recentBlockhash2 == null) {
                AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
                return abstractC58185ywXKWHzl3;
            }
            java.lang.String decimal = solanaSignInfoAkhnZx.getDecimal();
            if (decimal == null) {
                AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
                return abstractC58185ywXKWHzl4;
            }
            java.lang.String address3 = fERRXa().getAddress();
            java.lang.String tokenAccountAddress = solanaSignInfoAkhnZx.getTokenAccountAddress();
            if (tokenAccountAddress == null) {
                AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl5 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl5, "");
                return abstractC58185ywXKWHzl5;
            }
            java.lang.Boolean toAddressLegal = solanaSignInfoAkhnZx.getToAddressLegal();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String tokenAccountToAddress = Intrinsics.EZpvd(toAddressLegal, bool) ? solanaSignInfoAkhnZx.getTokenAccountToAddress() : null;
            java.lang.String mintAddress = solanaSignInfoAkhnZx.getMintAddress();
            if (mintAddress != null) {
                actionBar = new LedgerSignHelper.TaskDescription.ActionBar(address2, strFJNWhG, strConvertToBigIntegerString$default2, recentBlockhash2, decimal, address3, tokenAccountAddress, tokenAccountToAddress, mintAddress, Intrinsics.EZpvd(solanaSignInfoAkhnZx.getToAddressLegal(), bool) ? null : zLjUOn(), fHqPtx().fERRXa(), (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(OLrzqt()), solanaSignInfoAkhnZx.getComputeUnitPrice());
            } else {
                AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl6 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl6, "");
                return abstractC58185ywXKWHzl6;
            }
        }
        return copydefault(LedgerSignHelper.AEQbTJ.KWHzl(new LedgerSignHelper.TaskDescription(c10854bwMDHguZz, fERRXa(), stateListAnimator, actionBar)));
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> aKErDB() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), DWgRXt(), (java.lang.String) null, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9615bYt.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9615bYt.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djSkpj() {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        SolanaSignInfo solanaSignInfoAkhnZx = AkhnZx();
        if (solanaSignInfoAkhnZx != null && Intrinsics.EZpvd(solanaSignInfoAkhnZx.getSupportJito(), java.lang.Boolean.TRUE)) {
            AbstractC58185ywX<ResponseData<JitoInfoResult>> abstractC58185ywXCopydefault = ixgjPv().copydefault(fERRXa().getAddress(), dHguZz().fetchVPNInfo());
            final Function1 function1 = new Function1() { // from class: o.bYB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9615bYt.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<ResponseData<JitoInfoResult>> abstractC58185ywXDjBIcL = abstractC58185ywXCopydefault.djBIcL(new InterfaceC58229yxO() { // from class: o.bYE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9615bYt.iZzfmt(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.bYC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9615bYt.AYXKKw(this.copydefault, (ResponseData) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bYD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9615bYt.iRxXKY(function12, obj);
                }
            });
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        }
        final Function1 function13 = new Function1() { // from class: o.bYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9615bYt.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bYK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9615bYt.AxsJAYaxsJAY(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(-1, null, null, null, null, null, 62, null);
    }

    public static final kotlin.Pair iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C9615bYt c9615bYt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c9615bYt.UlJrfe().AEQbTJ(new C9881bdu(((java.lang.Boolean) pair.getFirst()).booleanValue(), ""));
        return pair;
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(AbstractC58185ywX<ResponseData<SignedTx>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9615bYt.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9615bYt.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(C9615bYt c9615bYt, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            SignedTx signedTx = (SignedTx) responseData.getData();
            java.lang.String tx = signedTx != null ? signedTx.getTx() : null;
            java.lang.String str = tx == null ? "" : tx;
            SignedTx signedTx2 = (SignedTx) responseData.getData();
            java.lang.String txHash = signedTx2 != null ? signedTx2.getTxHash() : null;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(c9615bYt, str, txHash == null ? "" : txHash, null, c9615bYt.ORxRYg(), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public static final kotlin.Pair EZpvd(C9615bYt c9615bYt, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c9615bYt.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<SolanaSignInfo> kSerializerSerializer = SolanaSignInfo.Companion.serializer();
            SignInfo signInfo2 = (SignInfo) responseData.getData();
            kotlinx.serialization.json.JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
            Intrinsics.copydefault(info);
            c9615bYt.KWHzl((SolanaSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair AYXKKw(C9615bYt c9615bYt, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c9615bYt.EZpvd = (JitoInfoResult) responseData.getData();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }
}
