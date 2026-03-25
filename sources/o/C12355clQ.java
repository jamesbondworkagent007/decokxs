package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.IRegisterTransaction;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.ZKSyncRegisterSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.CoinFee;
import com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.ZkTransferFeeResp;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12355clQ extends AbstractC8601bFm<C8429bCZ, ZKSyncRegisterSignData> implements IRegisterTransaction {
    public ZKSyncSignInfo AYXKKw;
    public C12441cmx AhwBna;
    public OKWBaseTransaction.TransactionType fetchVPNInfo = OKWBaseTransaction.TransactionType.Register;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.cmh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12355clQ.copydefault(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.cmg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12355clQ.EZpvd(this.KWHzl);
        }
    });
    public final IRegisterTransaction.RegisterType ORxRYg = IRegisterTransaction.RegisterType.RegisterAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12441cmx AEQbTJ() {
        return this.AhwBna;
    }

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    @Override // com.okinc.business.defi.api.model.IRegisterTransaction
    public IRegisterTransaction.TaskDescription EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm
    public void OLrzqt(@NotNull OKWBaseTransaction.TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.fetchVPNInfo = transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String aKErDB() {
        return "ChangePubKey";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.IRegisterTransaction
    public IRegisterTransaction.RegisterType copydefault() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncSignInfo fARcdN() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        return "7";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        return "";
    }

    public final C12439cmv djBIcL() {
        return (C12439cmv) this.valueOf.getValue();
    }

    public static final C12439cmv copydefault(C12355clQ c12355clQ) {
        return new C12439cmv(c12355clQ);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C8429bCZ fJNWhG() {
        return (C8429bCZ) this.djBIcL.getValue();
    }

    public static final C8429bCZ EZpvd(C12355clQ c12355clQ) {
        return new C8429bCZ(c12355clQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
        final Function2 function2 = new Function2() { // from class: o.clU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12355clQ.EZpvd(this.copydefault, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXUeEOUB, new InterfaceC58223yxI() { // from class: o.clV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12355clQ.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair EZpvd(C12355clQ c12355clQ, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        C12441cmx c12441cmx = c12355clQ.AhwBna;
        if (c12441cmx != null) {
            c12355clQ.fJNWhG().OLrzqt(c12441cmx.KWHzl().AhwBna());
            c12355clQ.fJNWhG().EZpvd(c12441cmx.EZpvd());
            c12355clQ.fJNWhG().KWHzl(0);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final C12355clQ c12355clQ, ZKSyncSignInfo zKSyncSignInfo) {
        CoinFee coinFee;
        Intrinsics.checkNotNullParameter(zKSyncSignInfo, "");
        c12355clQ.AYXKKw = zKSyncSignInfo;
        java.util.List<CoinFee> listAEQbTJ = zKSyncSignInfo.AEQbTJ();
        if (listAEQbTJ == null || (coinFee = (CoinFee) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ)) == null) {
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = c12355clQ.AEQbTJ(coinFee);
        final Function1 function1 = new Function1() { // from class: o.cmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12355clQ.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12355clQ.valueOf(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(C12355clQ c12355clQ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C12441cmx c12441cmx = c12355clQ.AhwBna;
        if (c12441cmx != null) {
            c12355clQ.fJNWhG().OLrzqt(c12441cmx.KWHzl().AhwBna());
            c12355clQ.fJNWhG().EZpvd(c12441cmx.EZpvd());
        }
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        hashSetJ_.add(java.lang.Long.valueOf(C33129mqd.valueOf(((ZKSyncRegisterSignData) QVsKAR()).getCoinId())));
        return hashSetJ_;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UeEOUB() {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(OFhtUX().copydefault(OxVOHk(), Dmq(), new SignInfoReq(C33129mqd.gEmmrt(((ZKSyncRegisterSignData) QVsKAR()).getCoinId()), htlTjW(), "", 5, (java.lang.String) null, "0", (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.clZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12355clQ.KWHzl(this.EZpvd, (SignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.cmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12355clQ.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C12355clQ c12355clQ, SignInfo signInfo) {
        java.util.List<CoinFee> listAEQbTJ;
        CoinFee coinFee;
        Intrinsics.checkNotNullParameter(signInfo, "");
        c12355clQ.copydefault(signInfo.getSupportPush());
        KSerializer<ZKSyncSignInfo> kSerializerSerializer = ZKSyncSignInfo.Companion.serializer();
        JsonObject info = signInfo.getInfo();
        java.lang.String string = info != null ? info.toString() : null;
        if (string == null) {
            string = "";
        }
        ZKSyncSignInfo zKSyncSignInfo = (ZKSyncSignInfo) C54907xZt.OLrzqt(kSerializerSerializer, string);
        c12355clQ.AYXKKw = zKSyncSignInfo;
        if (zKSyncSignInfo == null || (listAEQbTJ = zKSyncSignInfo.AEQbTJ()) == null || (coinFee = (CoinFee) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ)) == null) {
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
        }
        return c12355clQ.AEQbTJ(coinFee);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(final CoinFee coinFee) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(OFhtUX().EZpvd(C11600cUg.copydefault(coinFee.KWHzl()), htlTjW(), aKErDB()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12355clQ.EZpvd(coinFee, this, (ZkTransferFeeResp) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12355clQ.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(CoinFee coinFee, C12355clQ c12355clQ, ZkTransferFeeResp zkTransferFeeResp) {
        Intrinsics.checkNotNullParameter(zkTransferFeeResp, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(coinFee.KWHzl());
        if (c10854bwMKWHzl == null) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
        }
        java.lang.String strEZpvd = coinFee.EZpvd();
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strOLrzqt = coinFee.OLrzqt();
        c12355clQ.AhwBna = new C12441cmx(c10854bwMKWHzl, str, strOLrzqt == null ? "" : strOLrzqt, C54862xYb.convertToBigIntegerString$default(coinFee.copydefault(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zkTransferFeeResp.getFee(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC8601bFm
    public boolean ae_() {
        return QwvEab() == 3;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = UeEOUB();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final Application application = new Application(str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12355clQ.fFgQHt(application, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.clQ$Application */
    public static final class Application implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            C10854bwM c10854bwMKWHzl;
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                C12441cmx c12441cmxAEQbTJ = C12355clQ.this.AEQbTJ();
                java.lang.String strEZpvd = c12441cmxAEQbTJ != null ? c12441cmxAEQbTJ.EZpvd() : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                C12441cmx c12441cmxAEQbTJ2 = C12355clQ.this.AEQbTJ();
                long jAhwBna = (c12441cmxAEQbTJ2 == null || (c10854bwMKWHzl = c12441cmxAEQbTJ2.KWHzl()) == null) ? 0L : c10854bwMKWHzl.AhwBna();
                C12355clQ.this.fJNWhG().OLrzqt(jAhwBna);
                C12355clQ.this.fJNWhG().EZpvd(strEZpvd);
                SignedTx signedTxSignChangePubKey$default = C12439cmv.signChangePubKey$default(C12355clQ.this.djBIcL(), this.EZpvd, null, 2, null);
                java.lang.String tx = signedTxSignChangePubKey$default.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                C12355clQ c12355clQ = C12355clQ.this;
                java.lang.String tx2 = signedTxSignChangePubKey$default.getTx();
                java.lang.String str = tx2 == null ? "" : tx2;
                java.lang.String txHash = signedTxSignChangePubKey$default.getTxHash();
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8601bFm.generateBroadcastModel$default(c12355clQ, str, txHash == null ? "" : txHash, null, new ZKSyncExtJson(java.lang.Long.valueOf(jAhwBna), "ChangePubKey"), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            java.lang.String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.api.model.IRegisterTransaction
    public java.lang.String KWHzl() {
        ZKSyncSignInfo zKSyncSignInfo = this.AYXKKw;
        if (zKSyncSignInfo != null) {
            return zKSyncSignInfo.EZpvd();
        }
        return null;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        ZKSyncSignInfo zKSyncSignInfo = this.AYXKKw;
        if (zKSyncSignInfo == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(zKSyncSignInfo);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ActionBar(zKSyncSignInfo, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.clW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12355clQ.KWHzl(this.EZpvd, (ZKSyncSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.clX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12355clQ.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.clQ$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.Object obj, java.lang.String str) {
            this.KWHzl = obj;
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<ZKSyncSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.AEQbTJ;
            java.lang.Object obj = this.KWHzl;
            try {
                Result.Application application = Result.Companion;
                com.google.gson.JsonObject asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.clQ.ActionBar.4
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.clQ.ActionBar.3
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<com.google.gson.JsonObject>() { // from class: o.clQ.ActionBar.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) ZKSyncSignInfo.class));
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
}
