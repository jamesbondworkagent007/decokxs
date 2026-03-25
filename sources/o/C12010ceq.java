package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.tron.bean.TronSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.tron.SignedTransaction;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
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
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12010ceq extends AbstractC8664bGw<C8429bCZ, TransferSignData> {
    public InterfaceC60094zvb AEQbTJ;
    public TronSignInfo OLrzqt;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ceG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12010ceq.EZpvd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ceH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12010ceq.gEmmrt(this.copydefault);
        }
    });
    public java.lang.String copydefault = "0";

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull TronSignInfo tronSignInfo) {
        Intrinsics.checkNotNullParameter(tronSignInfo, "");
        this.OLrzqt = tronSignInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C8429bCZ fJNWhG() {
        return (C8429bCZ) this.KWHzl.getValue();
    }

    public static final C8429bCZ EZpvd(C12010ceq c12010ceq) {
        return new C8429bCZ(c12010ceq);
    }

    public final C11991ceX QKVWgx() {
        return (C11991ceX) this.EZpvd.getValue();
    }

    public static final C11991ceX gEmmrt(C12010ceq c12010ceq) {
        return new C11991ceX(c12010ceq);
    }

    public final TronSignInfo OcIXYQ() {
        TronSignInfo tronSignInfo = this.OLrzqt;
        if (tronSignInfo != null) {
            return tronSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
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
        final Function2 function2 = new Function2() { // from class: o.ceQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12010ceq.EZpvd(this.copydefault, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXORxRYg, new InterfaceC58223yxI() { // from class: o.ceO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12010ceq.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair EZpvd(C12010ceq c12010ceq, kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return pair;
        }
        if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return pair2;
        }
        C8429bCZ c8429bCZFJNWhG = c12010ceq.fJNWhG();
        java.lang.String fee = c12010ceq.OcIXYQ().getFee();
        c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
        c12010ceq.fJNWhG().KWHzl(0);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(9);
        return newProxyInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXORxRYg = ORxRYg();
        final Function1 function1 = new Function1() { // from class: o.ceK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXORxRYg.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ceL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(C12010ceq c12010ceq, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            C8429bCZ c8429bCZFJNWhG = c12010ceq.fJNWhG();
            java.lang.String fee = c12010ceq.OcIXYQ().getFee();
            c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
            c12010ceq.fJNWhG().KWHzl(1);
        }
        return pair;
    }

    public static final Unit hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXORxRYg = ORxRYg();
        final Function1 function1 = new Function1() { // from class: o.ceu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXORxRYg.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.hUfVAv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit copydefault(C12010ceq c12010ceq, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            C8429bCZ c8429bCZFJNWhG = c12010ceq.fJNWhG();
            java.lang.String fee = c12010ceq.OcIXYQ().getFee();
            c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
            c12010ceq.fJNWhG().KWHzl(3);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull final java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        TronSignInfo tronSignInfoOcIXYQ = OcIXYQ();
        if (tronSignInfoOcIXYQ == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(tronSignInfoOcIXYQ);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ActionBar(tronSignInfoOcIXYQ, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.ceE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.KWHzl(this.copydefault, str, (TronSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ceF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(C12010ceq c12010ceq, java.lang.String str, TronSignInfo tronSignInfo) {
        Intrinsics.checkNotNullParameter(tronSignInfo, "");
        c12010ceq.copydefault(tronSignInfo);
        C8429bCZ c8429bCZFJNWhG = c12010ceq.fJNWhG();
        java.lang.String fee = c12010ceq.OcIXYQ().getFee();
        c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
        return super.DbNXlk(str);
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        if (C33129mqd.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0")) {
            return QUSxYX();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QUSxYX() {
        InterfaceC60094zvb interfaceC60094zvb = this.AEQbTJ;
        if (interfaceC60094zvb != null) {
            interfaceC60094zvb.cancel();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXORxRYg = ORxRYg();
        final Function1 function1 = new Function1() { // from class: o.ceM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.AYXKKw(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXORxRYg.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ceN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.gkJEwt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ceJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.KWHzl(this.EZpvd, (InterfaceC60094zvb) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.ceR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12010ceq.iRxXKY(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AYXKKw(C12010ceq c12010ceq, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            C8429bCZ c8429bCZFJNWhG = c12010ceq.fJNWhG();
            java.lang.String fee = c12010ceq.OcIXYQ().getFee();
            c8429bCZFJNWhG.EZpvd(fee != null ? fee : "");
            c12010ceq.fJNWhG().KWHzl(2);
        }
        return pair;
    }

    public static final void iRxXKY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C12010ceq c12010ceq, InterfaceC60094zvb interfaceC60094zvb) {
        c12010ceq.AEQbTJ = interfaceC60094zvb;
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public void OLrzqt(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.OLrzqt(list);
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 1) {
                java.lang.Integer trxPermissionId = txToastCheckRes.getTrxPermissionId();
                this.copydefault = java.lang.String.valueOf(trxPermissionId != null ? trxPermissionId.intValue() : 0);
            }
        }
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        java.util.ArrayList<java.lang.Integer> arrayListAuCTelauCTel = super.AuCTelauCTel();
        arrayListAuCTelauCTel.add(1);
        return arrayListAuCTelauCTel;
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
        final Application application = new Application(str);
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.DAIeex(application, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.ceq$Application */
    public static final class Application implements Function1<?, InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>>> {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<BatchBroadcastModel>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst().booleanValue()) {
                C8429bCZ c8429bCZFJNWhG = C12010ceq.this.fJNWhG();
                java.lang.String fee = C12010ceq.this.OcIXYQ().getFee();
                if (fee == null) {
                    fee = "";
                }
                c8429bCZFJNWhG.EZpvd(fee);
                SignedTx signedTxKWHzl = C12010ceq.this.QKVWgx().KWHzl(this.AEQbTJ);
                java.lang.String tx = signedTxKWHzl.getTx();
                if (tx == null || tx.length() == 0) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                }
                C12010ceq c12010ceq = C12010ceq.this;
                java.lang.String tx2 = signedTxKWHzl.getTx();
                java.lang.String str = tx2 == null ? "" : tx2;
                java.lang.String txHash = signedTxKWHzl.getTxHash();
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(c12010ceq, str, txHash == null ? "" : txHash, null, null, 12, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            }
            java.lang.String second = pair.getSecond();
            return AbstractC58185ywX.KWHzl(new ResponseData(-5000, second == null ? "" : second, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        LedgerSignHelper.TronTransactionParam.StateListAnimator stateListAnimator;
        C10854bwM c10854bwMDHguZz = dHguZz();
        LedgerSignHelper.TronTransactionParam.Activity activity = null;
        if (fHqPtx().AuCTel()) {
            java.lang.String address = fERRXa().getAddress();
            java.lang.String strZLjUOn = zLjUOn();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String str = this.copydefault;
            java.lang.String ref_block_bytes = OcIXYQ().getRef_block_bytes();
            java.lang.String str2 = ref_block_bytes == null ? "" : ref_block_bytes;
            java.lang.String ref_block_hash = OcIXYQ().getRef_block_hash();
            java.lang.String str3 = ref_block_hash == null ? "" : ref_block_hash;
            java.lang.String ref_block_number = OcIXYQ().getRef_block_number();
            java.lang.String str4 = ref_block_number == null ? "" : ref_block_number;
            java.lang.String timestamp = OcIXYQ().getTimestamp();
            java.lang.String str5 = timestamp == null ? "" : timestamp;
            java.lang.String expiration = OcIXYQ().getExpiration();
            activity = new LedgerSignHelper.TronTransactionParam.Activity(strZLjUOn, address, strConvertToBigIntegerString$default, str2, str, str3, str4, str5, expiration == null ? "" : expiration, OcIXYQ().getFee());
            stateListAnimator = null;
        } else {
            java.lang.String strFJNWhG = fHqPtx().fJNWhG();
            java.lang.String address2 = fERRXa().getAddress();
            java.lang.String strZLjUOn2 = zLjUOn();
            java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String ref_block_bytes2 = OcIXYQ().getRef_block_bytes();
            java.lang.String str6 = ref_block_bytes2 == null ? "" : ref_block_bytes2;
            java.lang.String str7 = this.copydefault;
            java.lang.String ref_block_hash2 = OcIXYQ().getRef_block_hash();
            java.lang.String str8 = ref_block_hash2 == null ? "" : ref_block_hash2;
            java.lang.String ref_block_number2 = OcIXYQ().getRef_block_number();
            java.lang.String str9 = ref_block_number2 == null ? "" : ref_block_number2;
            java.lang.String timestamp2 = OcIXYQ().getTimestamp();
            java.lang.String str10 = timestamp2 == null ? "" : timestamp2;
            java.lang.String expiration2 = OcIXYQ().getExpiration();
            java.lang.String str11 = expiration2 == null ? "" : expiration2;
            java.lang.String asset = OcIXYQ().getAsset();
            java.lang.String contractAddress = OcIXYQ().getContractAddress();
            java.lang.String fee = OcIXYQ().getFee();
            java.lang.String feelimit = OcIXYQ().getFeelimit();
            java.lang.String trc = OcIXYQ().getTrc();
            stateListAnimator = new LedgerSignHelper.TronTransactionParam.StateListAnimator(strFJNWhG, address2, strZLjUOn2, strConvertToBigIntegerString$default2, str6, str7, str8, str9, str10, str11, asset, contractAddress, fee, feelimit, trc == null ? "" : trc);
        }
        AbstractC58185ywX<ResponseData<LedgerSignHelper.TronTransactionParam.TronSignedTx>> abstractC58185ywXKWHzl = LedgerSignHelper.AEQbTJ.KWHzl(new LedgerSignHelper.TronTransactionParam(c10854bwMDHguZz, fERRXa(), activity, stateListAnimator));
        final Function1 function1 = new Function1() { // from class: o.ceS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.AhwBna((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<SignedTransaction>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.AxsJAYaxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return OLrzqt(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AhwBna(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        LedgerSignHelper.TronTransactionParam.TronSignedTx tronSignedTx = (LedgerSignHelper.TronTransactionParam.TronSignedTx) responseData.getData();
        if (tronSignedTx == null) {
            tronSignedTx = new LedgerSignHelper.TronTransactionParam.TronSignedTx((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
        }
        return new ResponseData(responseData.getCode(), null, null, null, new SignedTransaction(tronSignedTx.getRawTx(), tronSignedTx.getTxHash(), (java.lang.String) null, 4, (DefaultConstructorMarker) null), responseData.getError_code(), 14, null);
    }

    public final LedgerSignHelper.TronTransactionParam.TronUnsignedTx KWHzl() {
        return QKVWgx().AEQbTJ();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        ResponseData responseData;
        java.lang.String keystoneSignTx = submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null;
        if (keystoneSignTx == null) {
            keystoneSignTx = "";
        }
        if (keystoneSignTx.length() == 0) {
            responseData = new ResponseData(-5013, null, null, null, null, null, 62, null);
        } else {
            if (!C59449zhJ.AYXKKw(keystoneSignTx, EIP1271Verifier.hexPrefix, true)) {
                keystoneSignTx = EIP1271Verifier.hexPrefix + keystoneSignTx;
            }
            responseData = new ResponseData(-5001, null, null, null, new SignedTransaction(keystoneSignTx, "", (java.lang.String) null, 4, (DefaultConstructorMarker) null), null, 46, null);
        }
        AbstractC58185ywX<ResponseData<SignedTransaction>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(responseData);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return OLrzqt(abstractC58185ywXKWHzl);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(C10965byR.OLrzqt.OLrzqt(str, dUDNAs(), dHguZz(), new Function0() { // from class: o.cez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12010ceq.valueOf(this.copydefault);
            }
        }, new Function2() { // from class: o.ceB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12010ceq.EZpvd(this.AEQbTJ, (java.lang.String) obj, (RSV) obj2);
            }
        }, new Function1() { // from class: o.ceD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12010ceq.KWHzl((SignedTransaction) obj));
            }
        }));
    }

    public static final TxMessage valueOf(C12010ceq c12010ceq) {
        return c12010ceq.QKVWgx().copydefault();
    }

    public static final SignedTransaction EZpvd(C12010ceq c12010ceq, java.lang.String str, RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return c12010ceq.QKVWgx().EZpvd(str, rsv);
    }

    public static final boolean KWHzl(SignedTransaction signedTransaction) {
        Intrinsics.checkNotNullParameter(signedTransaction, "");
        return signedTransaction.isValid();
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(AbstractC58185ywX<ResponseData<SignedTransaction>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.ceA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ceC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.RlQdEF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(C12010ceq c12010ceq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            SignedTransaction signedTransaction = (SignedTransaction) responseData.getData();
            if (signedTransaction == null) {
                signedTransaction = new SignedTransaction((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
            }
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(c12010ceq, signedTransaction.getRawTx(), signedTransaction.getTxHash(), null, null, 12, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    /* JADX INFO: renamed from: o.ceq$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.Object OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.Object obj, java.lang.String str) {
            this.OLrzqt = obj;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.tron.bean.TronSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<TronSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.KWHzl;
            java.lang.Object obj = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                JsonObject asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.ceq.ActionBar.4
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((JsonObject) new Gson().fromJson(str, new TypeToken<JsonObject>() { // from class: o.ceq.ActionBar.2
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                JsonObject jsonObject = (JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<JsonObject>() { // from class: o.ceq.ActionBar.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) TronSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.OLrzqt;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    /* JADX DEBUG: Type inference failed for r1v9. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ORxRYg() {
        java.lang.String strConvertToBigIntegerString$default;
        if (fHqPtx().AuCTel()) {
            strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
        } else {
            strEZpvd = zLjUOn().length() > 0 ? xYW.AEQbTJ.EZpvd(zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), "transfer(address,uint256)") : null;
            strConvertToBigIntegerString$default = "0";
        }
        java.lang.String str = strConvertToBigIntegerString$default;
        java.lang.String str2 = strEZpvd;
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = OFhtUX().copydefault(OxVOHk(), Dmq(), new SignInfoReq(java.lang.String.valueOf(fHqPtx().AhwBna()), fERRXa().getAddress(), zLjUOn(), 5, str2, str, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12010ceq.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ceI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12010ceq.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(C12010ceq c12010ceq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c12010ceq.copydefault(signInfo != null ? signInfo.getSupportPush() : false);
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<TronSignInfo> kSerializerSerializer = TronSignInfo.Companion.serializer();
            SignInfo signInfo2 = (SignInfo) responseData.getData();
            kotlinx.serialization.json.JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
            Intrinsics.copydefault(info);
            c12010ceq.copydefault((TronSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
