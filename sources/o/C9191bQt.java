package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean.AAExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.AAEvmSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.net.bean.AAAccountInfo;
import com.okinc.business.defi.biz.net.bean.ApproveAAItemParam;
import com.okinc.business.defi.biz.net.bean.ApproveAASubRequest;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import com.okinc.wallet.core.sign.evm.ExecuteParams;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.InterfaceC9041bOB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9191bQt extends AbstractC8664bGw<C9225bRa, TransferSignData> implements InterfaceC9041bOB {
    public AAAccountInfo AEQbTJ;
    public FreeGasManager.UserFreeGasInfo AhwBna;
    public InterfaceC60094zvb EZpvd;
    public AbstractC9226bRb QUSxYX;
    public java.util.List<C9168bQW> copydefault;
    public final boolean djBIcL;
    public final AbstractC8564bFB<?, ?> OcIXYQ = this;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.bQS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9191bQt.KWHzl(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bQV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9191bQt.QUSxYX();
        }
    });
    public final FreeGasManager KWHzl = new FreeGasManager();
    public AAEvmSignInfo fetchVPNInfo = new AAEvmSignInfo((java.lang.String) null, (java.lang.String) null, (EvmSignInfoGasPrice) null, 7, (DefaultConstructorMarker) null);
    public final java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<java.lang.String>> valueOf = new LinkedHashMap();
    public java.util.List<PaymasterToken> gEmmrt = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData KWHzl(ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData2, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair OLrzqt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull AAEvmSignInfo aAEvmSignInfo) {
        Intrinsics.checkNotNullParameter(aAEvmSignInfo, "");
        this.fetchVPNInfo = aAEvmSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void AEQbTJ(@NotNull AAAccountInfo aAAccountInfo) {
        Intrinsics.checkNotNullParameter(aAAccountInfo, "");
        this.AEQbTJ = aAAccountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public java.util.List<PaymasterToken> AuCTel() {
        return this.gEmmrt;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void EZpvd(@NotNull java.util.List<PaymasterToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean H_() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void KWHzl(@NotNull java.util.List<C9168bQW> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void OLrzqt(@NotNull AbstractC9226bRb abstractC9226bRb) {
        Intrinsics.checkNotNullParameter(abstractC9226bRb, "");
        this.QUSxYX = abstractC9226bRb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public void copydefault(@NotNull FreeGasManager.UserFreeGasInfo userFreeGasInfo) {
        Intrinsics.checkNotNullParameter(userFreeGasInfo, "");
        this.AhwBna = userFreeGasInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<java.lang.String>> fJNWhG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public AbstractC8564bFB<?, ?> getFieldNames() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public AAEvmSignInfo hDKMBd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9041bOB
    public FreeGasManager valueOf() {
        return this.KWHzl;
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> AEQbTJ(SubmitTxExpandBean submitTxExpandBean) {
        return InterfaceC9041bOB.Application.copydefault(this, submitTxExpandBean);
    }

    public AbstractC58185ywX<ResponseData<UserOperation>> AEQbTJ(@NotNull TxToastCheckReq txToastCheckReq, @NotNull java.util.List<ExecuteParams> list, @NotNull Function1<? super java.lang.String, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        return InterfaceC9041bOB.Application.KWHzl(this, txToastCheckReq, list, function1);
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AubY() {
        return InterfaceC9041bOB.Application.values(this);
    }

    public AbstractC58185ywX<Unit> ORxRYg() {
        return InterfaceC9041bOB.Application.fetchVPNInfo(this);
    }

    public boolean QKVWgx() {
        return InterfaceC9041bOB.Application.AkhnZx(this);
    }

    @Override // o.InterfaceC9729bbA
    public java.lang.String copydefault() {
        return InterfaceC9041bOB.Application.KWHzl(this);
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        return InterfaceC9041bOB.Application.AEQbTJ(this, str, submitTxExpandBean);
    }

    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> djBIcL(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        return InterfaceC9041bOB.Application.OLrzqt(this, str, submitTxExpandBean);
    }

    @Override // o.InterfaceC9041bOB
    public Function1<PaymasterToken, Unit> ejfBZ() {
        return InterfaceC9041bOB.Application.valueOf(this);
    }

    @Override // o.InterfaceC9041bOB
    public java.lang.String fetchVPNInfo() {
        return InterfaceC9041bOB.Application.OLrzqt(this);
    }

    @Override // o.InterfaceC9041bOB
    public boolean gHZMYf() {
        return InterfaceC9041bOB.Application.DbNXlk(this);
    }

    @Override // o.InterfaceC9041bOB
    public boolean sSMYrx() {
        return InterfaceC9041bOB.Application.fARcdN(this);
    }

    @Override // o.InterfaceC9041bOB
    public int uzCIH() {
        return InterfaceC9041bOB.Application.gEmmrt(this);
    }

    @Override // o.InterfaceC9041bOB
    public int zsXlph() {
        return InterfaceC9041bOB.Application.AYXKKw(this);
    }

    public boolean zuBGHE() {
        return InterfaceC9041bOB.Application.copydefault(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: isConnected */
    public C9225bRa fJNWhG() {
        return (C9225bRa) this.AYXKKw.getValue();
    }

    public static final C9225bRa KWHzl(C9191bQt c9191bQt) {
        return new C9225bRa(c9191bQt, c9191bQt);
    }

    @Override // o.InterfaceC9041bOB
    public xYJ AkhnZx() {
        return (xYJ) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xYJ QUSxYX() {
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        java.lang.String strOLrzqt = WalletJsBridge.AEQbTJ.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        return new xYJ(applicationAEQbTJ, strOLrzqt);
    }

    @Override // o.InterfaceC9041bOB
    public FreeGasManager.UserFreeGasInfo fARcdN() {
        FreeGasManager.UserFreeGasInfo userFreeGasInfo = this.AhwBna;
        if (userFreeGasInfo != null) {
            return userFreeGasInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC9041bOB
    public java.util.List<C9168bQW> DbNXlk() {
        java.util.List<C9168bQW> list = this.copydefault;
        if (list != null) {
            return list;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC9041bOB
    public AAAccountInfo AYXKKw() {
        AAAccountInfo aAAccountInfo = this.AEQbTJ;
        if (aAAccountInfo != null) {
            return aAAccountInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC9226bRb iwGUEr() {
        AbstractC9226bRb abstractC9226bRb = this.QUSxYX;
        if (abstractC9226bRb != null) {
            return abstractC9226bRb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXIsConnected = InterfaceC9041bOB.Application.isConnected(this);
        final Function2 function2 = new Function2() { // from class: o.bQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9191bQt.copydefault(this.KWHzl, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXIsConnected, new InterfaceC58223yxI() { // from class: o.bQU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9191bQt.AhwBna(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(C9191bQt c9191bQt, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c9191bQt.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QHmsKR() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAY() {
        return super.QHmsKR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAwvSrB = AwvSrB();
        final Function1 function1 = new Function1() { // from class: o.bQB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.EZpvd(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAwvSrB.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.RlQdEF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit EZpvd(C9191bQt c9191bQt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9191bQt.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        EvmSignInfoGasPrice gasPrice = hDKMBd().getGasPrice();
        if (gasPrice == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(gasPrice);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Application(gasPrice, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.bQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.AEQbTJ(this.EZpvd, (EvmSignInfoGasPrice) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd AEQbTJ(C9191bQt c9191bQt, EvmSignInfoGasPrice evmSignInfoGasPrice) {
        Intrinsics.checkNotNullParameter(evmSignInfoGasPrice, "");
        c9191bQt.hDKMBd().setGasPrice(evmSignInfoGasPrice);
        return c9191bQt.OcIXYQ();
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OcIXYQ() {
        AbstractC58185ywX<Unit> abstractC58185ywXORxRYg = ORxRYg();
        final Function1 function1 = new Function1() { // from class: o.bQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.OLrzqt((Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXORxRYg.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.iRxXKY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        java.util.Iterator<T> it = AuCTel().iterator();
        while (it.hasNext()) {
            java.lang.Long coinId = ((PaymasterToken) it.next()).getCoinId();
            if (coinId != null) {
                hashSetJ_.add(java.lang.Long.valueOf(coinId.longValue()));
            }
        }
        return hashSetJ_;
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        if (C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0")) {
            C8475bDS c8475bDSDCJXGO = DCJXGO();
            long jDGOPHZ = DGOPHZ();
            if (C33129mqd.copydefault(c8475bDSDCJXGO.KWHzl(java.lang.Long.valueOf(jDGOPHZ), htlTjW()), AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null))) {
                return QVAiDq();
            }
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QVAiDq() {
        InterfaceC60094zvb interfaceC60094zvb = this.EZpvd;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAubY = AubY();
        final Function1 function1 = new Function1() { // from class: o.bQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.EZpvd(this.EZpvd, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58185ywXAubY.EZpvd(new InterfaceC58227yxM() { // from class: o.bQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9191bQt.DAIeex(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.djBIcL(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.iZzfmt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DAIeex(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C9191bQt c9191bQt, InterfaceC60094zvb interfaceC60094zvb) {
        c9191bQt.EZpvd = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    public static final kotlin.Pair iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair djBIcL(C9191bQt c9191bQt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9191bQt.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AwvSrB() {
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strUSBtdM = dUDNAs().USBtdM();
        java.lang.String strDbNXlk = dUDNAs().DbNXlk();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuOFhtUX.copydefault(strUSBtdM, strDbNXlk, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), 5, KWHzl(C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null)), fHqPtx().AuCTel() ? C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null) : "0", (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.KWHzl(this.copydefault, (ResponseData) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.AxsJAYaxsJAY(function1, obj);
            }
        });
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOcIXYQ = OcIXYQ();
        final Function2 function2 = new Function2() { // from class: o.bQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C9191bQt.OLrzqt((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(interfaceC60096zvdAEQbTJ, abstractC58185ywXOcIXYQ, new InterfaceC58223yxI() { // from class: o.bQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C9191bQt.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (!fHqPtx().DCUTEIddSDPG() || zLjUOn().length() <= 0) {
            return null;
        }
        return xYW.AEQbTJ.copydefault(zLjUOn(), str);
    }

    public static final kotlin.Pair hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAubY = AubY();
        final Function1 function1 = new Function1() { // from class: o.bQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAubY.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair OLrzqt(C9191bQt c9191bQt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c9191bQt.fJNWhG().KWHzl(1);
            c9191bQt.fJNWhG().AwvSrB();
        }
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8664bGw, o.AbstractC8704bHj
    public java.lang.String AEQbTJ(boolean z, boolean z2) {
        if (!((TransferSignData) QVsKAR()).isTransferMaxAmount()) {
            return super.AEQbTJ(z, z2);
        }
        C9165bQT c9165bQTKWHzl = fJNWhG().KWHzl();
        java.lang.Object feeAmount = c9165bQTKWHzl.AEQbTJ() ? "0" : c9165bQTKWHzl.getFeeAmount();
        if (heceqZ()) {
            if (UrRBLY()) {
                feeAmount = C54862xYb.AEQbTJ(feeAmount, AYXKKw().getDepositAmount());
                if (C33129mqd.gEmmrt(feeAmount, "0")) {
                    feeAmount = "0";
                }
            }
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(DCJXGO().KWHzl(java.lang.Long.valueOf(DGOPHZ()), htlTjW()), feeAmount);
            return C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
        }
        java.lang.String strKWHzl = DCJXGO().KWHzl(java.lang.Long.valueOf(DGOPHZ()), htlTjW());
        return (strKWHzl == null || strKWHzl.length() == 0) ? "0" : strKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x_() {
        boolean z;
        boolean z2;
        java.lang.Object feeAmount;
        java.lang.String strConvertToString$default = null;
        java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
        if (C33129mqd.gEmmrt(DCJXGO().KWHzl(java.lang.Long.valueOf(DGOPHZ()), htlTjW()), transferAmount$default)) {
            z = false;
            z2 = true;
        } else {
            long jAhwBna = fJNWhG().AYXKKw().AhwBna();
            if (DGOPHZ() == jAhwBna) {
                C9165bQT c9165bQTKWHzl = fJNWhG().KWHzl();
                if (!c9165bQTKWHzl.AEQbTJ()) {
                    if (jAhwBna == dHguZz().AhwBna()) {
                        feeAmount = C54862xYb.AEQbTJ(c9165bQTKWHzl.getFeeAmount(), AYXKKw().getDepositAmount());
                        if (C33129mqd.gEmmrt(feeAmount, "0")) {
                            feeAmount = "0";
                        }
                    } else {
                        feeAmount = c9165bQTKWHzl.getFeeAmount();
                    }
                    java.lang.String strKWHzl = DCJXGO().KWHzl(java.lang.Long.valueOf(jAhwBna), htlTjW());
                    if (C33129mqd.gEmmrt(strKWHzl, C54862xYb.KWHzl(feeAmount, transferAmount$default))) {
                        BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(strKWHzl, feeAmount);
                        strConvertToString$default = C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
                        z2 = false;
                        z = true;
                    } else {
                        z = true;
                        z2 = true;
                    }
                }
            }
        }
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9808bca(z, fHqPtx()), new C9754bbZ(z2, strConvertToString$default)));
    }

    /* JADX INFO: renamed from: o.bQt$Application */
    public static final class Application<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.Object obj, java.lang.String str) {
            this.copydefault = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<EvmSignInfoGasPrice> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.copydefault;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bQt.Application.5
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.bQt.Application.2
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.bQt.Application.4
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) EvmSignInfoGasPrice.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.copydefault;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9750bbV(zuBGHE()), new C9784bcC(AEQbTJ(), fJNWhG().AYXKKw(), null, 4, null), new C9751bbW(true ^ QKVWgx())));
    }

    public final boolean AEQbTJ() {
        java.lang.Object feeAmount;
        C9165bQT c9165bQTKWHzl = fJNWhG().KWHzl();
        if (!c9165bQTKWHzl.AEQbTJ()) {
            long jAhwBna = fJNWhG().AYXKKw().AhwBna();
            if (jAhwBna == dHguZz().AhwBna()) {
                feeAmount = C54862xYb.AEQbTJ(c9165bQTKWHzl.getFeeAmount(), AYXKKw().getDepositAmount());
                if (C33129mqd.gEmmrt(feeAmount, "0")) {
                    feeAmount = "0";
                }
            } else {
                feeAmount = c9165bQTKWHzl.getFeeAmount();
            }
            if (C33129mqd.gEmmrt(DCJXGO().KWHzl(java.lang.Long.valueOf(jAhwBna), htlTjW()), feeAmount)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        return new java.util.ArrayList<>();
    }

    public final java.util.List<ExecuteParams> EZpvd(@NotNull java.lang.String str) {
        java.lang.String str2;
        java.lang.String strZLjUOn;
        Intrinsics.checkNotNullParameter(str, "");
        if (fHqPtx().DCUTEIddSDPG()) {
            strZLjUOn = fHqPtx().OLrzqt();
            str2 = "0";
        } else {
            str2 = str;
            strZLjUOn = zLjUOn();
        }
        java.lang.String strKWHzl = KWHzl(str);
        if (strKWHzl == null) {
            strKWHzl = EIP1271Verifier.hexPrefix;
        }
        return C56402yEa.EZpvd(new ExecuteParams(java.lang.Boolean.FALSE, strZLjUOn, str2, strKWHzl, (java.util.List) null, 16, (DefaultConstructorMarker) null));
    }

    public final TxToastCheckReq OLrzqt(java.lang.String str) {
        java.util.List listEZpvd = C56402yEa.EZpvd(7);
        long jDGOPHZ = DGOPHZ();
        long jFetchVPNInfo = dHguZz().fetchVPNInfo();
        int toastCheckTxType$default = OKWBaseTransaction.getToastCheckTxType$default(this, null, 1, null);
        return new TxToastCheckReq(listEZpvd, java.lang.Long.valueOf(jDGOPHZ), java.lang.Integer.valueOf(toastCheckTxType$default), null, fERRXa().getAddress(), zLjUOn(), str, C9225bRa.getGasPrice$default(fJNWhG(), 0, 1, null), KWHzl(str), null, null, null, null, OJuSTm().getTxToastCheckBizLine(), OJuSTm().getTxToastCheckPayload(), null, jFetchVPNInfo, null, null, null, null, null, 4103168, null);
    }

    @Override // o.InterfaceC9041bOB
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull Function1<? super java.lang.String, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
        return EZpvd(AEQbTJ(OLrzqt(strConvertToBigIntegerString$default), EZpvd(strConvertToBigIntegerString$default), function1), strConvertToBigIntegerString$default);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL(str, submitTxExpandBean);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        return AEQbTJ(submitTxExpandBean);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str, submitTxExpandBean);
    }

    public static final ResponseData gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    public final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(AbstractC58185ywX<ResponseData<UserOperation>> abstractC58185ywX, final java.lang.String str) {
        final Function1 function1 = new Function1() { // from class: o.bQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.EZpvd(this.KWHzl, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.gkJEwt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData EZpvd(C9191bQt c9191bQt, java.lang.String str, ResponseData responseData) throws CoinMetaError {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            UserOperation userOperation = (UserOperation) data;
            java.lang.String uopHash = userOperation.getUopHash();
            C10854bwM c10854bwMAYXKKw = c9191bQt.fJNWhG().AYXKKw();
            java.lang.String strOLrzqt = c10854bwMAYXKKw.AuCTel() ? null : c10854bwMAYXKKw.OLrzqt();
            C9165bQT c9165bQTKWHzl = c9191bQt.fJNWhG().KWHzl();
            java.lang.String signature = userOperation.getSignature();
            java.lang.String str2 = signature == null ? "" : signature;
            java.lang.String strFetchVPNInfo = c9191bQt.fetchVPNInfo();
            java.lang.String gasPrice$default = C9225bRa.getGasPrice$default(c9191bQt.fJNWhG(), 0, 1, null);
            java.lang.String strIwGUEr = c9191bQt.fJNWhG().iwGUEr();
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(c9191bQt, str2, uopHash, null, new AAExtJson(strFetchVPNInfo, gasPrice$default, strIwGUEr == null ? "" : strIwGUEr, c9191bQt.dHguZz().valueOf(), 0, c9191bQt.fJNWhG().fetchVPNInfo()), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setCoinAmount(C54862xYb.convertToBigIntegerString$default(str, true, (RoundingMode) null, 2, (java.lang.Object) null));
            broadcastBeanGenerateBroadcastModel$default.setUop(userOperation);
            broadcastBeanGenerateBroadcastModel$default.setAaFeeToken(strOLrzqt);
            Unit unit = Unit.INSTANCE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, c9165bQTKWHzl.getCost(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 246, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<C9748bbT>> AEQbTJ(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(super.AEQbTJ(str, submitTxExpandBean));
    }

    public static final InterfaceC60096zvd AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.bbT>> */
    private final AbstractC58185ywX<ResponseData<C9748bbT>> EZpvd(AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9191bQt.OLrzqt(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58229yxO() { // from class: o.bQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9191bQt.AxsJAYsNCnLh(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(C9191bQt c9191bQt, final ResponseData responseData) {
        java.lang.String strKWHzl;
        java.lang.String strGEmmrt;
        java.lang.String realPaymasterAddress;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            if (c9191bQt.QKVWgx()) {
                C9170bQY c9170bQYHDKMBd = c9191bQt.fJNWhG().hDKMBd();
                Paymaster paymasterValueOf = c9170bQYHDKMBd.valueOf();
                java.lang.String str = (paymasterValueOf == null || (realPaymasterAddress = paymasterValueOf.getRealPaymasterAddress()) == null) ? "" : realPaymasterAddress;
                java.lang.String strDjBIcL = c9170bQYHDKMBd.djBIcL();
                java.lang.String str2 = strDjBIcL == null ? "" : strDjBIcL;
                java.lang.String address = c9191bQt.fERRXa().getAddress();
                C9748bbT c9748bbT = (C9748bbT) responseData.getData();
                java.lang.String str3 = (c9748bbT == null || (strGEmmrt = c9748bbT.gEmmrt()) == null) ? "" : strGEmmrt;
                C9748bbT c9748bbT2 = (C9748bbT) responseData.getData();
                AbstractC58185ywX<ResponseData<Unit>> abstractC58185ywXOLrzqt = c9191bQt.ixgjPv().OLrzqt(c9191bQt.dUDNAs().USBtdM(), c9191bQt.dUDNAs().DbNXlk(), new ApproveAASubRequest(C56402yEa.EZpvd(new ApproveAAItemParam(address, str2, str, java.lang.Long.valueOf(c9191bQt.dHguZz().fetchVPNInfo()), str3, "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", (java.lang.String) null, (c9748bbT2 == null || (strKWHzl = c9748bbT2.KWHzl()) == null) ? "" : strKWHzl, 64, (DefaultConstructorMarker) null))));
                final Function1 function1 = new Function1() { // from class: o.bQH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C9191bQt.KWHzl(responseData, (ResponseData) obj);
                    }
                };
                return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bQI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C9191bQt.accept(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(responseData);
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public void EZpvd(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        super.EZpvd(jsonObject);
        InterfaceC9041bOB.Application.EZpvd(this, jsonObject);
    }

    public static final kotlin.Pair KWHzl(C9191bQt c9191bQt, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((SignInfo) data).getInfo() != null) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                c9191bQt.copydefault(((SignInfo) data2).getSupportPush());
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<AAEvmSignInfo> kSerializerSerializer = AAEvmSignInfo.Companion.serializer();
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                kotlinx.serialization.json.JsonObject info = ((SignInfo) data3).getInfo();
                Intrinsics.copydefault(info);
                c9191bQt.AEQbTJ((AAEvmSignInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, info.toString()));
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
