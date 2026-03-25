package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.eos.bean.EosSignInfo;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.EosTxAction;
import com.okinc.business.defi.biz.net.bean.EosTxReq;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8851bKX extends AbstractC8664bGw<C8483bDa, TransferSignData> implements InterfaceC9747bbS {
    public EosSignInfo AEQbTJ;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.bLc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8851bKX.EZpvd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.bLb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8851bKX.copydefault(this.AEQbTJ);
        }
    });
    public java.lang.String OLrzqt = "";

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return false;
    }

    @Override // o.InterfaceC9747bbS
    public int KWHzl() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9747bbS
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull EosSignInfo eosSignInfo) {
        Intrinsics.checkNotNullParameter(eosSignInfo, "");
        this.AEQbTJ = eosSignInfo;
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C8483bDa DXXBbs() {
        return (C8483bDa) this.copydefault.getValue();
    }

    public static final C8483bDa EZpvd(C8851bKX c8851bKX) {
        return new C8483bDa(c8851bKX);
    }

    public final C8914bLh zuBGHE() {
        return (C8914bLh) this.KWHzl.getValue();
    }

    public static final C8914bLh copydefault(C8851bKX c8851bKX) {
        return new C8914bLh(c8851bKX);
    }

    public final EosSignInfo ORxRYg() {
        EosSignInfo eosSignInfo = this.AEQbTJ;
        if (eosSignInfo != null) {
            return eosSignInfo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public boolean q_() {
        super.q_();
        java.lang.String memo = ((TransferSignData) QVsKAR()).getMemo();
        if (memo == null) {
            memo = "";
        }
        KWHzl(memo);
        return true;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQKVWgx = QKVWgx();
        final Function1 function1 = new Function1() { // from class: o.bKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8851bKX.copydefault(this.EZpvd, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQKVWgx.KWHzl(new InterfaceC58229yxO() { // from class: o.bLf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8851bKX.fvQaOB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd copydefault(C8851bKX c8851bKX, java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            java.lang.String strAEQbTJ = c8851bKX.zuBGHE().AEQbTJ(str);
            if (strAEQbTJ.length() == 0) {
                return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            }
            return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(c8851bKX, strAEQbTJ, null, null, null, 12, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(-5000, (java.lang.String) pair.getSecond(), null, null, null, null, 60, null));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(@NotNull final BroadcastBean broadcastBean, java.lang.String str, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd = ixgjPv().EZpvd(Dmq(), OxVOHk(), QCjLjM(), new EosTxReq(broadcastBean.getSignedTx(), C33129mqd.valueOf(java.lang.Long.valueOf(DGOPHZ())), C56402yEa.EZpvd(new EosTxAction(ExtJson.BRC20TYPE_TRANSFER, htlTjW(), zLjUOn(), C33129mqd.KWHzl(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null)), copydefault(), "")), copydefault()));
        final Function1 function1 = new Function1() { // from class: o.bLe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8851bKX.copydefault(broadcastBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8851bKX.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(BroadcastBean broadcastBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean(broadcastBean.getSignedTx(), (java.lang.String) responseData.getData(), broadcastBean.getTxHash(), broadcastBean.getOriginData(), (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null), null, 44, null);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QKVWgx() {
        C13934dbu c13934dbuIxgjPv = ixgjPv();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDGOPHZ = DGOPHZ();
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(strOxVOHk, strDmq, new SignInfoReq(java.lang.String.valueOf(jDGOPHZ), htlTjW(), zLjUOn(), DWgRXt(), (java.lang.String) null, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.bLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8851bKX.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bKZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8851bKX.fFgQHt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.InterfaceC9747bbS
    public void EZpvd(@NotNull java.lang.String str) {
        DataInputModuleModel.DataInputItem data;
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str);
        java.util.List<BaseModel<?>> listUSBtdM = USBtdM();
        if (listUSBtdM != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listUSBtdM) {
                if (obj instanceof DataInputModuleModel) {
                    arrayList.add(obj);
                }
            }
            DataInputModuleModel dataInputModuleModel = (DataInputModuleModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (dataInputModuleModel == null || (data = dataInputModuleModel.getData()) == null) {
                return;
            }
            data.setContent(str);
        }
    }

    public static final kotlin.Pair AEQbTJ(C8851bKX c8851bKX, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            KSerializer<EosSignInfo> kSerializerSerializer = EosSignInfo.Companion.serializer();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            JsonObject info = ((SignInfo) data).getInfo();
            Intrinsics.copydefault(info);
            c8851bKX.copydefault((EosSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
