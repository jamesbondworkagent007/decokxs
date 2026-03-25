package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonInputData;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonMintlessJettonInfo;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.ton.TonSignedTx;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
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
import o.C13754dXa;
import o.InterfaceC11834cbZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11892cce extends OKWBaseMultiTransfer<C11920cdF, MultiTransferSignData> implements InterfaceC11834cbZ {
    public java.lang.String QVAiDq;
    public java.lang.String QfsBiF;
    public TonSignInfo RcXXUw;
    public InterfaceC60094zvb dNCPSb;
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.ccm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11892cce.KWHzl(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm aKErDB = C56392yDr.copydefault(new Function0() { // from class: o.ccn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11892cce.OLrzqt(this.copydefault);
        }
    });
    public java.lang.String RJOkX = "";
    public java.lang.String OcIXYQ = "";
    public final java.util.Map<java.lang.String, TonMintlessJettonInfo> QbewEr = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull TonSignInfo tonSignInfo) {
        Intrinsics.checkNotNullParameter(tonSignInfo, "");
        this.RcXXUw = tonSignInfo;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11891ccd
    public java.lang.String EZpvd() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9747bbS
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Possible override for method com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.KWHzl()Ljava/lang/String; */
    @Override // o.InterfaceC9747bbS
    public int KWHzl() {
        return 250;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC11891ccd
    public java.lang.String OLrzqt() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9747bbS
    public java.lang.String copydefault() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fARcdN(java.lang.String str) {
        this.QVAiDq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fIwbmz(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.RJOkX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fJNWhG(java.lang.String str) {
        this.QfsBiF = str;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public boolean fvQaOB() {
        return false;
    }

    @Override // o.InterfaceC11834cbZ
    public boolean DbNXlk() {
        return InterfaceC11834cbZ.StateListAnimator.OLrzqt(this);
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OTwTPd() {
        return InterfaceC11834cbZ.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC11834cbZ
    public java.lang.String djBIcL() {
        return InterfaceC11834cbZ.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC11834cbZ
    public java.lang.String gEmmrt() {
        return InterfaceC11834cbZ.StateListAnimator.EZpvd(this);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: DGUQLI, reason: merged with bridge method [inline-methods] */
    public C11920cdF DXXBbs() {
        return (C11920cdF) this.QUSxYX.getValue();
    }

    public static final C11920cdF KWHzl(C11892cce c11892cce) {
        return new C11920cdF(c11892cce, c11892cce);
    }

    public final C11919cdE DBxZfM() {
        return (C11919cdE) this.aKErDB.getValue();
    }

    public static final C11919cdE OLrzqt(C11892cce c11892cce) {
        return new C11919cdE(c11892cce, c11892cce);
    }

    @Override // o.InterfaceC11891ccd
    public TonSignInfo AEQbTJ() {
        TonSignInfo tonSignInfo = this.RcXXUw;
        if (tonSignInfo != null) {
            return tonSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC11834cbZ
    public boolean isConnected() {
        if (U_()) {
            return ((MultiTransferSignData) QVsKAR()).getCurTXIndex() == AwvSrB() - 1 && ORxRYg();
        }
        return ORxRYg();
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXHCLrkq = hCLrkq();
        final Function2 function2 = new Function2() { // from class: o.ccq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11892cce.KWHzl(this.AEQbTJ, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXHCLrkq, new InterfaceC58223yxI() { // from class: o.ccs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11892cce.AhwBna(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(C11892cce c11892cce, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        c11892cce.DXXBbs().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final kotlin.Pair DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXHCLrkq = hCLrkq();
        final Function1 function1 = new Function1() { // from class: o.ccu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.valueOf(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXHCLrkq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair valueOf(C11892cce c11892cce, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11892cce.DXXBbs().KWHzl(1);
        }
        return pair;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public OKWBaseMultiTransfer.BroadcastStrategy valueOf() {
        if (U_()) {
            return OKWBaseMultiTransfer.BroadcastStrategy.ON_CHAIN_FINISH;
        }
        return OKWBaseMultiTransfer.BroadcastStrategy.CALL_API_FINISH;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public long QUSxYX() {
        return C33129mqd.valueOf(C54862xYb.OLrzqt(AEQbTJ().getTtl(), 1000));
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QbewEr() {
        return DsrFlB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QfsBiF() {
        TransferAddressData transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(((MultiTransferSignData) QVsKAR()).getToAddress(), ((MultiTransferSignData) QVsKAR()).getCurTXIndex());
        java.lang.String memo = transferAddressData != null ? transferAddressData.getMemo() : null;
        if (memo == null) {
            memo = "";
        }
        fIwbmz(memo);
        if (!AYXKKw(((MultiTransferSignData) QVsKAR()).getCurTXIndex())) {
            return hCLrkq();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXHCLrkq = hCLrkq();
        AbstractC58185ywX<java.util.List<TXCoinAssetManager.CoinAsset>> abstractC58185ywXOLrzqt = DarRvM().OLrzqt(af_(), yED.AEQbTJ(java.lang.Long.valueOf(dmfpNf())));
        final Function1 function1 = new Function1() { // from class: o.ccl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.gkJEwt(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.cck
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11892cce.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXHCLrkq, interfaceC60096zvdAEQbTJ, new InterfaceC58223yxI() { // from class: o.cco
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11892cce.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C11892cce c11892cce, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((TXCoinAssetManager.CoinAsset) next).getCoinId() == c11892cce.dmfpNf()) {
                    break;
                }
            }
            TXCoinAssetManager.CoinAsset coinAsset = (TXCoinAssetManager.CoinAsset) next;
            c11892cce.OcIXYQ = C33129mqd.AYXKKw(coinAsset != null ? coinAsset.getAsset() : null);
            if (C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(c11892cce, false, false, 3, null), "0")) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final Unit AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXHCLrkq = hCLrkq();
        final Function1 function1 = new Function1() { // from class: o.ccE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.AYXKKw(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXHCLrkq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.AxsJAYsNCnLh(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AYXKKw(C11892cce c11892cce, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11892cce.DXXBbs().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd QKudOq(Function1 function1, java.lang.Object obj) {
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
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(tonSignInfoAEQbTJ, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.cct
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.OLrzqt(this.AEQbTJ, (TonSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ccA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd OLrzqt(C11892cce c11892cce, TonSignInfo tonSignInfo) {
        Intrinsics.checkNotNullParameter(tonSignInfo, "");
        c11892cce.AEQbTJ(tonSignInfo);
        return c11892cce.DNMMPQ();
    }

    public final boolean AYXKKw(int i) {
        return U_() && heceqZ() && AwvSrB() > 1 && ORxRYg() && i == AwvSrB() - 1;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer
    public java.lang.String KWHzl(int i) {
        return (!AYXKKw(i) || this.OcIXYQ.length() <= 0) ? super.KWHzl(i) : this.OcIXYQ;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        TonSignedTx tonSignedTxEZpvd = DBxZfM().EZpvd(str);
        if (tonSignedTxEZpvd == null || tonSignedTxEZpvd.getTx().length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(OKWBaseMultiTransfer.generateBroadcastModel$default(this, tonSignedTxEZpvd.getTx(), tonSignedTxEZpvd.getTxHash(), null, new TonExtJson(C54862xYb.convertToBigIntegerString$default(AEQbTJ().getNonce(), true, (RoundingMode) null, 2, (java.lang.Object) null), DbNXlk() ? java.lang.Boolean.TRUE : null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> hCLrkq() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDaRZkR = DaRZkR();
        final Function1 function1 = new Function1() { // from class: o.ccp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDaRZkR.KWHzl(new InterfaceC58229yxO() { // from class: o.ccr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C11892cce c11892cce, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c11892cce.DNMMPQ();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DsrFlB() {
        InterfaceC60094zvb interfaceC60094zvb = this.dNCPSb;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXHCLrkq = hCLrkq();
        final Function1 function1 = new Function1() { // from class: o.ccy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.djBIcL(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXHCLrkq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ccz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.RlQdEF(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ccC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.OLrzqt(this.copydefault, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.ccB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11892cce.accept(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair djBIcL(C11892cce c11892cce, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c11892cce.DXXBbs().KWHzl(2);
        }
        return pair;
    }

    public static final void accept(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C11892cce c11892cce, InterfaceC60094zvb interfaceC60094zvb) {
        c11892cce.dNCPSb = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer, o.AbstractC8564bFB
    public void AhwBna() {
        super.AhwBna();
        DLWbHP().AEQbTJ(new C9862bdb(DGOPHZDGOPHZ()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<C9861bda> DGOPHZDGOPHZ() {
        if (!fHqPtx().DCUTEIddSDPG()) {
            java.util.ArrayList<java.lang.String> walletId = ((MultiTransferSignData) QVsKAR()).getWalletId();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(walletId, 10));
            java.util.Iterator<T> it = walletId.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9861bda((java.lang.String) it.next(), true, ""));
            }
            return arrayList;
        }
        int i = 0;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(AEQbTJ().getMinTonLimit(), DXXBbs().AEQbTJ()), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.util.ArrayList<java.lang.String> walletId2 = ((MultiTransferSignData) QVsKAR()).getWalletId();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(walletId2, 10));
        for (java.lang.Object obj : walletId2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList2.add(new C9861bda((java.lang.String) obj, C33129mqd.copydefault(copydefault(i), strConvertToBigIntegerString$default), C33070mpX.AYXKKw(C13754dXa.FragmentManager.dispatchOnContextAvailable)));
            i++;
        }
        return arrayList2;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DaRZkR() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), fERRXa().getAddress(), zLjUOn(), DWgRXt(), (java.lang.String) null, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.ccv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.ccx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.InterfaceC11834cbZ
    public TonMintlessJettonInfo AYXKKw() {
        return this.QbewEr.get(htlTjW());
    }

    @Override // o.InterfaceC11834cbZ
    public void OLrzqt(@NotNull TonMintlessJettonInfo tonMintlessJettonInfo) {
        Intrinsics.checkNotNullParameter(tonMintlessJettonInfo, "");
        this.QbewEr.put(htlTjW(), tonMintlessJettonInfo);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DNMMPQ() {
        TonSignedTx tonSignedTxCopydefault = DBxZfM().copydefault();
        if (tonSignedTxCopydefault == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = ixgjPv().copydefault(fERRXa().getAddress(), C54907xZt.encodeToString$default(TonInputData.Companion.serializer(), new TonInputData(tonSignedTxCopydefault.getAddress(), tonSignedTxCopydefault.getTx(), tonSignedTxCopydefault.getCode(), tonSignedTxCopydefault.getData(), true), false, 2, null), "", (496 & 8) != 0 ? null : java.lang.Long.valueOf(DGOPHZ()), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.cci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11892cce.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cch
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11892cce.iRxXKY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: renamed from: o.cce$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<TonSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.AEQbTJ;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.cce.Activity.1
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.cce.Activity.4
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.cce.Activity.3
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

    public static final kotlin.Pair iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C11892cce c11892cce, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c11892cce.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<TonSignInfo> kSerializerSerializer = TonSignInfo.Companion.serializer();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            kotlinx.serialization.json.JsonObject info = ((SignInfo) data).getInfo();
            Intrinsics.copydefault(info);
            c11892cce.AEQbTJ((TonSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            return c11892cce.OTwTPd();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair AEQbTJ(C11892cce c11892cce, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c11892cce.fARcdN(((WalletGasLimitRes) data).getGasLimit());
            if (c11892cce.fHqPtx().DCUTEIddSDPG()) {
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                c11892cce.fJNWhG(((WalletGasLimitRes) data2).getInvokeNotificationFee());
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
