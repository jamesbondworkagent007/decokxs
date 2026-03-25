package o;

import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.network.okg.response.ResponseData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bFv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8610bFv<SignData extends MessageSignData> extends OKWBaseTransaction<SignData> {
    public OKWBaseTransaction.TransactionType KWHzl = OKWBaseTransaction.TransactionType.Message;

    public abstract java.lang.String AEQbTJ(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.KWHzl;
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> s_() {
        AbstractC58185ywX abstractC58185ywXPreCheck$default = OKWBaseTransaction.preCheck$default(this, false, 1, null);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = EZpvd();
        final Function2 function2 = new Function2() { // from class: o.bFx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8610bFv.AEQbTJ((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXPreCheck$default, abstractC58185ywXEZpvd, new InterfaceC58223yxI() { // from class: o.bFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8610bFv.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8610bFv.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd2.KWHzl(new InterfaceC58229yxO() { // from class: o.bFA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8610bFv.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair AEQbTJ(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC8610bFv abstractC8610bFv, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.dxcTrN();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z) {
        if (!OJuSTm().isTeeMode()) {
            return super.KWHzl(z);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(@NotNull BaseSignData baseSignData) {
        Intrinsics.checkNotNullParameter(baseSignData, "");
        OJuSTm().setSignData((MessageSignData) baseSignData);
        AbstractC58185ywX abstractC58185ywXPreCheck$default = OKWBaseTransaction.preCheck$default(this, false, 1, null);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = AEQbTJ();
        final Function2 function2 = new Function2() { // from class: o.bFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8610bFv.KWHzl((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXPreCheck$default, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.bFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8610bFv.AEQbTJ(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return new java.util.ArrayList<>();
    }

    public static /* synthetic */ java.lang.String getData$default(AbstractC8610bFv abstractC8610bFv, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getData");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC8610bFv.AEQbTJ(z);
    }

    public static /* synthetic */ BroadcastBean generateCommonBroadcastModel$default(AbstractC8610bFv abstractC8610bFv, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateCommonBroadcastModel");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return abstractC8610bFv.AEQbTJ(str, str2);
    }

    public final BroadcastBean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BroadcastBean(Dmq(), WalletType.Companion.OLrzqt(dUDNAs()), str, str2, fERRXa().getAddress(), "", dHguZz().AhwBna(), "", "", QwvEab(), "", "", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (UserOperation) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (EVM5792SendCallsParams) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, -4096, 7, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull BatchBroadcastModel batchBroadcastModel, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        BroadcastBean broadcastBean = (BroadcastBean) CollectionsKt___CollectionsKt.firstOrNull(batchBroadcastModel.getTxList());
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, new DappTxResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, broadcastBean != null ? broadcastBean.getSignedTx() : null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 119, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 9) {
                java.util.List<java.lang.String> causeRiskItem = OHqIaq().AEQbTJ(txToastCheckRes).getCauseRiskItem();
                if (causeRiskItem == null) {
                    causeRiskItem = yDY.AhwBna();
                }
                if (causeRiskItem.contains(TxToastCheckRes.NOT_SAME_PARAMS)) {
                    z = false;
                }
                if (causeRiskItem.contains(TxToastCheckRes.PURCHASE_MALICIOUS_TOKEN)) {
                    z4 = false;
                }
                if (causeRiskItem.contains(TxToastCheckRes.BASIC_RISK_REJECT)) {
                    z2 = false;
                }
                if (causeRiskItem.contains(TxToastCheckRes.BASIC_RISK_ALERT)) {
                    z3 = false;
                }
                UlJrfe().OLrzqt(yDY.gEmmrt(new C9866bdf(z), new C9875bdo(z4), new C9824bcq(z2), new C9823bcp(z3)));
            }
        }
    }
}
