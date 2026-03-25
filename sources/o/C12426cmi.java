package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12426cmi extends AbstractC8664bGw<C8429bCZ, TransferSignData> {
    public C12441cmx AEQbTJ;
    public ZKSyncSignInfo KWHzl;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.cmp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12426cmi.AEQbTJ(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.cms
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12426cmi.copydefault(this.OLrzqt);
        }
    });

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12441cmx KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncSignInfo OcIXYQ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QKVWgx() {
        return "Transfer";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.lang.String l_() {
        return "2";
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C8429bCZ fJNWhG() {
        return (C8429bCZ) this.copydefault.getValue();
    }

    public static final C8429bCZ AEQbTJ(C12426cmi c12426cmi) {
        return new C8429bCZ(c12426cmi);
    }

    public final C12438cmu zuBGHE() {
        return (C12438cmu) this.EZpvd.getValue();
    }

    public static final C12438cmu copydefault(C12426cmi c12426cmi) {
        return new C12438cmu(c12426cmi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXORxRYg = ORxRYg();
        final Function2 function2 = new Function2() { // from class: o.cmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12426cmi.KWHzl(this.AEQbTJ, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXORxRYg, new InterfaceC58223yxI() { // from class: o.cmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12426cmi.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair KWHzl(C12426cmi c12426cmi, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        C12441cmx c12441cmx = c12426cmi.AEQbTJ;
        if (c12441cmx != null) {
            c12426cmi.fJNWhG().OLrzqt(c12441cmx.KWHzl().AhwBna());
            c12426cmi.fJNWhG().EZpvd(c12441cmx.EZpvd());
            c12426cmi.fJNWhG().KWHzl(0);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C12426cmi c12426cmi, ZKSyncSignInfo zKSyncSignInfo) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(zKSyncSignInfo, "");
        c12426cmi.KWHzl = zKSyncSignInfo;
        java.util.List<CoinFee> listAEQbTJ = zKSyncSignInfo.AEQbTJ();
        if (listAEQbTJ != null) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                java.lang.Long lKWHzl = ((CoinFee) next).KWHzl();
                long jDGOPHZ = c12426cmi.DGOPHZ();
                if (lKWHzl != null && lKWHzl.longValue() == jDGOPHZ) {
                    break;
                }
            }
            CoinFee coinFee = (CoinFee) next;
            if (coinFee != null) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = c12426cmi.OLrzqt(coinFee);
                final Function1 function1 = new Function1() { // from class: o.cmo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C12426cmi.KWHzl(this.EZpvd, (kotlin.Pair) obj);
                    }
                };
                return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cmq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C12426cmi.gasjUx(function1, obj);
                    }
                });
            }
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
    }

    public static final kotlin.Pair gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C12426cmi c12426cmi, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C12441cmx c12441cmx = c12426cmi.AEQbTJ;
        if (c12441cmx != null) {
            c12426cmi.fJNWhG().OLrzqt(c12441cmx.KWHzl().AhwBna());
            c12426cmi.fJNWhG().EZpvd(c12441cmx.EZpvd());
        }
        return pair;
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ORxRYg() {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(OFhtUX().copydefault(OxVOHk(), Dmq(), new SignInfoReq(C33129mqd.gEmmrt(java.lang.Long.valueOf(DGOPHZ())), htlTjW(), zLjUOn(), 5, (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12426cmi.KWHzl(this.copydefault, (SignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.cml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12426cmi.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C12426cmi c12426cmi, SignInfo signInfo) {
        java.util.List<CoinFee> listAEQbTJ;
        Intrinsics.checkNotNullParameter(signInfo, "");
        c12426cmi.copydefault(signInfo.getSupportPush());
        KSerializer<ZKSyncSignInfo> kSerializerSerializer = ZKSyncSignInfo.Companion.serializer();
        JsonObject info = signInfo.getInfo();
        java.lang.Object obj = null;
        java.lang.String string = info != null ? info.toString() : null;
        if (string == null) {
            string = "";
        }
        ZKSyncSignInfo zKSyncSignInfo = (ZKSyncSignInfo) C54907xZt.OLrzqt(kSerializerSerializer, string);
        c12426cmi.KWHzl = zKSyncSignInfo;
        if (zKSyncSignInfo != null && (listAEQbTJ = zKSyncSignInfo.AEQbTJ()) != null) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.Long lKWHzl = ((CoinFee) next).KWHzl();
                long jDGOPHZ = c12426cmi.DGOPHZ();
                if (lKWHzl != null && lKWHzl.longValue() == jDGOPHZ) {
                    obj = next;
                    break;
                }
            }
            CoinFee coinFee = (CoinFee) obj;
            if (coinFee != null) {
                return c12426cmi.OLrzqt(coinFee);
            }
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(final CoinFee coinFee) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(OFhtUX().EZpvd(C11600cUg.copydefault(coinFee.KWHzl()), zLjUOn(), QKVWgx()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12426cmi.copydefault(coinFee, this, (ZkTransferFeeResp) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12426cmi.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(CoinFee coinFee, C12426cmi c12426cmi, ZkTransferFeeResp zkTransferFeeResp) {
        Intrinsics.checkNotNullParameter(zkTransferFeeResp, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(coinFee.KWHzl());
        if (c10854bwMKWHzl == null) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
        }
        java.lang.String strEZpvd = coinFee.EZpvd();
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strOLrzqt = coinFee.OLrzqt();
        c12426cmi.AEQbTJ = new C12441cmx(c10854bwMKWHzl, str, strOLrzqt == null ? "" : strOLrzqt, C54862xYb.convertToBigIntegerString$default(coinFee.copydefault(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zkTransferFeeResp.getFee(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (OuxcSI()) {
            abstractC58185ywXKWHzl = ORxRYg();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final TaskDescription taskDescription = new TaskDescription(str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12426cmi.flVtFt(taskDescription, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.cmi$TaskDescription */
    public static final class TaskDescription implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            C10854bwM c10854bwMKWHzl;
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                C12441cmx c12441cmxKWHzl = C12426cmi.this.KWHzl();
                java.lang.String strEZpvd = c12441cmxKWHzl != null ? c12441cmxKWHzl.EZpvd() : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                C12441cmx c12441cmxKWHzl2 = C12426cmi.this.KWHzl();
                long jAhwBna = (c12441cmxKWHzl2 == null || (c10854bwMKWHzl = c12441cmxKWHzl2.KWHzl()) == null) ? 0L : c10854bwMKWHzl.AhwBna();
                C12426cmi.this.fJNWhG().OLrzqt(jAhwBna);
                C12426cmi.this.fJNWhG().EZpvd(strEZpvd);
                SignedTx signedTxSignTransfer$default = C12438cmu.signTransfer$default(C12426cmi.this.zuBGHE(), this.EZpvd, null, 2, null);
                java.lang.String tx = signedTxSignTransfer$default.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                C12426cmi c12426cmi = C12426cmi.this;
                java.lang.String tx2 = signedTxSignTransfer$default.getTx();
                java.lang.String str = tx2 == null ? "" : tx2;
                java.lang.String txHash = signedTxSignTransfer$default.getTxHash();
                BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(c12426cmi, str, txHash == null ? "" : txHash, null, new ZKSyncExtJson(java.lang.Long.valueOf(jAhwBna), null, 2, null), 4, null);
                broadcastBeanGenerateBroadcastModel$default.setServiceCharge(strEZpvd);
                Unit unit = Unit.INSTANCE;
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            java.lang.String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        ZKSyncSignInfo zKSyncSignInfo = this.KWHzl;
        if (zKSyncSignInfo == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(zKSyncSignInfo);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(zKSyncSignInfo, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.cmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12426cmi.copydefault(this.EZpvd, (ZKSyncSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12426cmi.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.cmi$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.AEQbTJ = obj;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<ZKSyncSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.EZpvd;
            java.lang.Object obj = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                com.google.gson.JsonObject asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cmi.Activity.5
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cmi.Activity.4
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<com.google.gson.JsonObject>() { // from class: o.cmi.Activity.3
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
                obj2 = this.AEQbTJ;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }
}
