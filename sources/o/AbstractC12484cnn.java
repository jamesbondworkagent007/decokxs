package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateReq;
import com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateResp;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyModule;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC12484cnn;
import o.C11010bzJ;
import o.C12797ctk;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cnn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12484cnn extends AbstractC12413cmV<UTXOSpeedUpInfoBean> {
    public java.lang.String AYXKKw;
    public int AkhnZx;
    public int DbNXlk;
    public final C12797ctk ejfBZ;
    public java.lang.String fetchVPNInfo;
    public UtxoInfo isConnected;
    public BTCSpeedUpFeeRateResp values;
    public final java.lang.String AhwBna = "UTXOSpeedUpTxBaseBiz";
    public final java.lang.String valueOf = "4292967296";

    @Override // o.AbstractC12413cmV
    public int AuCTel() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AxsJAY() {
        return this.AkhnZx;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String gEmmrt() {
        return null;
    }

    public AbstractC12484cnn() {
        C12797ctk c12797ctk = new C12797ctk();
        this.ejfBZ = c12797ctk;
        this.AkhnZx = -5000;
        this.DbNXlk = c12797ctk.AEQbTJ();
    }

    @Override // o.AbstractC12413cmV
    public ChainAddress uzCIH() throws java.lang.Exception {
        java.util.List<ChainAddress> listAhwBna;
        UtxoInfo utxoInfo;
        java.util.List<UtxoInfo> cpfpSpeedUpUtxo;
        java.lang.Object next;
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        java.lang.Object obj = null;
        if (abstractC12782ctVEjfBZ != null) {
            C10854bwM c10854bwMOLrzqt = OLrzqt();
            listAhwBna = abstractC12782ctVEjfBZ.DbNXlk(C11600cUg.copydefault(c10854bwMOLrzqt != null ? java.lang.Long.valueOf(c10854bwMOLrzqt.fetchVPNInfo()) : null));
        } else {
            listAhwBna = null;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        UTXOSpeedUpInfoBean uTXOSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (uTXOSpeedUpInfoBeanFJNWhG == null || (cpfpSpeedUpUtxo = uTXOSpeedUpInfoBeanFJNWhG.getCpfpSpeedUpUtxo()) == null) {
            utxoInfo = null;
        } else {
            java.util.Iterator<T> it = cpfpSpeedUpUtxo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                UtxoInfo utxoInfo2 = (UtxoInfo) next;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                java.util.Iterator<T> it2 = listAhwBna.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((ChainAddress) it2.next()).getAddress());
                }
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList), utxoInfo2.getAddress())) {
                    break;
                }
            }
            utxoInfo = (UtxoInfo) next;
        }
        this.isConnected = utxoInfo;
        java.util.Iterator<T> it3 = listAhwBna.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next2 = it3.next();
            java.lang.String address = ((ChainAddress) next2).getAddress();
            UtxoInfo utxoInfo3 = this.isConnected;
            if (Intrinsics.EZpvd((java.lang.Object) address, (java.lang.Object) (utxoInfo3 != null ? utxoInfo3.getAddress() : null))) {
                obj = next2;
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) obj;
        if (chainAddress != null) {
            return chainAddress;
        }
        throw new java.lang.Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.UscePu));
    }

    public static final InterfaceC60096zvd QVAiDq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> getNewProxyInstance() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> newProxyInstance = super.getNewProxyInstance();
        final Function1 function1 = new Function1() { // from class: o.coe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = newProxyInstance.KWHzl(new InterfaceC58229yxO() { // from class: o.cob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.QVAiDq(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.coa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.dNCPSb(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC12484cnn abstractC12484cnn, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return abstractC12484cnn.AwvSrB();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd dNCPSb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final AbstractC12484cnn abstractC12484cnn, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58185ywX abstractC58185ywXLoopRequestUTXO$default = loopRequestUTXO$default(abstractC12484cnn, 0, 1, null);
            final Function1 function1 = new Function1() { // from class: o.cno
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12484cnn.values(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXLoopRequestUTXO$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12484cnn.aKErDB(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair aKErDB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair values(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC12484cnn.AkhnZx = responseData.getCode();
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(responseData.getCode() == -5001), responseData.getMsg());
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/ctV;Lcom/okinc/business/defi/biz/net/bean/CoinAndAddressHistoryDetail;)Lcom/okinc/business/defi/biz/core/tx/speedup/bean/SpeedUpInfoBean; */
    @Override // o.AbstractC12413cmV
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UTXOSpeedUpInfoBean EZpvd(AbstractC12782ctV abstractC12782ctV, @NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        return copydefault(coinAndAddressHistoryDetail.getBtcSpeedUpInfo());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lcom/okinc/business/defi/biz/net/bean/TxIdOrHashHistoryDetail;)Lcom/okinc/business/defi/biz/core/tx/speedup/bean/SpeedUpInfoBean; */
    @Override // o.AbstractC12413cmV
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UTXOSpeedUpInfoBean KWHzl(@NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
        return copydefault(txIdOrHashHistoryDetail.getBtcSpeedUpInfo());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lcom/okinc/business/defi/biz/net/bean/TxRecord;)Lcom/okinc/business/defi/biz/core/tx/speedup/bean/SpeedUpInfoBean; */
    @Override // o.AbstractC12413cmV
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public UTXOSpeedUpInfoBean AEQbTJ(@NotNull TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return copydefault(txRecord.getBtcSpeedUpInfo());
    }

    public final UTXOSpeedUpInfoBean copydefault(UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean) {
        UTXOSpeedUpInfoBean uTXOSpeedUpInfoBean = new UTXOSpeedUpInfoBean();
        uTXOSpeedUpInfoBean.setCpfpSpeedUpUtxo(uTXOSpeedUpInfoJsonBean != null ? uTXOSpeedUpInfoJsonBean.getCpfpSpeedUpUtxo() : null);
        return uTXOSpeedUpInfoBean;
    }

    @Override // o.AbstractC12413cmV
    public void copydefault(@NotNull SignInfo signInfo) {
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        java.lang.String contentOrNull;
        Intrinsics.checkNotNullParameter(signInfo, "");
        JsonObject info = signInfo.getInfo();
        this.fetchVPNInfo = (info == null || (jsonElement = (JsonElement) info.get("minOutput")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null || (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive)) == null) ? null : C33129mqd.formatS$default(contentOrNull, 0, null, null, 6, null);
    }

    public final AbstractC58185ywX<java.lang.Integer> copydefault(java.util.List<UTXOInfoResp> list) {
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null);
        C12797ctk.StateListAnimator stateListAnimatorCopydefault = copydefault(list, strConvertToBigIntegerString$default);
        C12797ctk c12797ctk = this.ejfBZ;
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        if (abstractC12782ctVEjfBZ == null) {
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(0);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        if (c10854bwMOLrzqt == null) {
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(0);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        java.lang.String strCopydefault = stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.copydefault() : null;
        java.lang.String str = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strOLrzqt = stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.OLrzqt() : null;
        return C12797ctk.getSignLength$default(c12797ctk, stateListAnimatorCopydefault, abstractC12782ctVEjfBZ, c10854bwMOLrzqt, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default, str, strOLrzqt == null ? "" : strOLrzqt, AhwBna(), fARcdN(), AhwBna(), null, null, null, 7168, null);
    }

    public final C12797ctk.StateListAnimator copydefault(java.util.List<UTXOInfoResp> list, java.lang.String str) {
        C10854bwM c10854bwMOLrzqt;
        C12797ctk c12797ctk = this.ejfBZ;
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        if (abstractC12782ctVEjfBZ == null || (c10854bwMOLrzqt = OLrzqt()) == null) {
            return null;
        }
        return c12797ctk.copydefault(abstractC12782ctVEjfBZ, c10854bwMOLrzqt, str, copydefault(), ORxRYg(), C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null), list);
    }

    public final java.lang.String ORxRYg() {
        return this.ejfBZ.KWHzl();
    }

    public final int zsXlph() {
        ChainAddress chainAddressHDKMBd = hDKMBd();
        return chainAddressHDKMBd != null ? chainAddressHDKMBd.getAddressType() : AddressType.Legacy.getValue();
    }

    @Override // o.AbstractC12413cmV
    public java.lang.Long AYXKKw() {
        UTXOSpeedUpInfoBean uTXOSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (uTXOSpeedUpInfoBeanFJNWhG != null) {
            return java.lang.Long.valueOf(uTXOSpeedUpInfoBeanFJNWhG.getMainCoinId());
        }
        return null;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String EZpvd() {
        return C33129mqd.gEmmrt(java.lang.Integer.valueOf(java.lang.Math.max(C33129mqd.AhwBna(C54862xYb.convertToBigIntegerString$default(C54862xYb.AEQbTJ(this.AYXKKw, copydefault()), false, (RoundingMode) null, 3, (java.lang.Object) null)), C33129mqd.AhwBna(this.fetchVPNInfo))));
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String KWHzl() {
        java.lang.String strGHZMYf = gHZMYf();
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.values;
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(strGHZMYf, bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getCurrentTxSize() : null), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String copydefault() {
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(AuCTelauCTel(), java.lang.Integer.valueOf(this.DbNXlk));
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.values;
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(bigDecimalOLrzqt, bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getIncreaseFee() : null), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    public final java.lang.String gHZMYf() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.values;
        java.lang.String currentAvgFeeRate = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getCurrentAvgFeeRate() : null;
        return currentAvgFeeRate == null ? "" : currentAvgFeeRate;
    }

    public final java.lang.String AuCTelauCTel() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.values;
        java.lang.String expectedFeeRate = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getExpectedFeeRate() : null;
        return expectedFeeRate == null ? "" : expectedFeeRate;
    }

    public final java.lang.String zuBGHE() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.values;
        java.lang.String ancestorsTxSize = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getAncestorsTxSize() : null;
        return ancestorsTxSize == null ? "" : ancestorsTxSize;
    }

    public final java.lang.String sSMYrx() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.values;
        java.lang.String currentTxSize = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getCurrentTxSize() : null;
        return currentTxSize == null ? "" : currentTxSize;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String AhwBna() {
        ChainAddress chainAddressHDKMBd = hDKMBd();
        java.lang.String address = chainAddressHDKMBd != null ? chainAddressHDKMBd.getAddress() : null;
        return address == null ? "" : address;
    }

    public static final InterfaceC60096zvd iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> KWHzl(final FragmentActivity fragmentActivity) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAwvSrB = AwvSrB();
        final Function1 function1 = new Function1() { // from class: o.coc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.gEmmrt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAwvSrB.KWHzl(new InterfaceC58229yxO() { // from class: o.coh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.iRxXKY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.coj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.KWHzl(this.copydefault, fragmentActivity, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.coi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.iZzfmt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd gEmmrt(AbstractC12484cnn abstractC12484cnn, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return loopRequestUTXO$default(abstractC12484cnn, 0, 1, null);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, (java.lang.String) pair.getSecond(), null, null, null, null, 61, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ctk.checkUtxoConflict$default(o.ctk, com.okinc.network.okg.response.ResponseData, java.lang.String, java.util.List, long, int, java.lang.String, java.util.List, boolean, androidx.fragment.app.FragmentActivity, int, java.lang.Object):o.ywX */
    public static final InterfaceC60096zvd KWHzl(AbstractC12484cnn abstractC12484cnn, FragmentActivity fragmentActivity, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            C12797ctk c12797ctk = abstractC12484cnn.ejfBZ;
            java.lang.String strAhwBna = abstractC12484cnn.AhwBna();
            java.util.List list = (java.util.List) responseData.getData();
            long jCopydefault = C11600cUg.copydefault(abstractC12484cnn.AYXKKw());
            C10854bwM c10854bwMOLrzqt = abstractC12484cnn.OLrzqt();
            java.lang.String strDbNXlk = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.DbNXlk() : null;
            return C12797ctk.checkUtxoConflict$default(c12797ctk, responseData, strAhwBna, list, jCopydefault, -1, strDbNXlk == null ? "" : strDbNXlk, null, false, fragmentActivity, 192, null);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(responseData);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AwvSrB() {
        C13934dbu c13934dbuIwGUEr = iwGUEr();
        java.lang.String strFetchVPNInfo = fetchVPNInfo();
        java.lang.String fieldNames = getFieldNames();
        long jCopydefault = C11600cUg.copydefault(AYXKKw());
        java.lang.String strAhwBna = AhwBna();
        UTXOSpeedUpInfoBean uTXOSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String txHash = uTXOSpeedUpInfoBeanFJNWhG != null ? uTXOSpeedUpInfoBeanFJNWhG.getTxHash() : null;
        if (txHash == null) {
            txHash = "";
        }
        AbstractC58185ywX<ResponseData<BTCSpeedUpFeeRateResp>> abstractC58185ywXAEQbTJ = c13934dbuIwGUEr.AEQbTJ(strFetchVPNInfo, fieldNames, new BTCSpeedUpFeeRateReq(jCopydefault, strAhwBna, txHash));
        final Function1 function1 = new Function1() { // from class: o.cny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.AhwBna(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.DTwDnp(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AhwBna(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC12484cnn.values = (BTCSpeedUpFeeRateResp) responseData.getData();
        abstractC12484cnn.AkhnZx = responseData.getCode();
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(responseData.getCode() == 0 && responseData.getData() != null), abstractC12484cnn.copydefault(java.lang.Integer.valueOf(responseData.getCode())));
    }

    public static /* synthetic */ AbstractC58185ywX loopRequestUTXO$default(AbstractC12484cnn abstractC12484cnn, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loopRequestUTXO");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return abstractC12484cnn.EZpvd(i);
    }

    public static final InterfaceC60096zvd djSkpj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> EZpvd(final int i) {
        AbstractC58185ywX abstractC58185ywXEZpvd = C11607cUn.EZpvd(QKVWgx());
        final Function1 function1 = new Function1() { // from class: o.cnW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.OLrzqt(i, this, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cog
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.djSkpj(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(int i, AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && i < abstractC12484cnn.ejfBZ.OLrzqt()) {
            if (abstractC12484cnn.AEQbTJ((java.util.List<UTXOInfoResp>) responseData.getData())) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(responseData);
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            return abstractC12484cnn.EZpvd(i + 1);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(responseData);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public final boolean AEQbTJ(java.util.List<UTXOInfoResp> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return C33129mqd.copydefault(EZpvd(list), C54862xYb.KWHzl(this.fetchVPNInfo, copydefault()));
    }

    public final java.lang.String EZpvd(java.util.List<UTXOInfoResp> list) {
        BigDecimal bigDecimal = new BigDecimal("0");
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    java.util.Iterator<T> it2 = utxoList.iterator();
                    while (it2.hasNext()) {
                        bigDecimal = C54862xYb.KWHzl(bigDecimal, ((UtxoInfo) it2.next()).getCoinAmount());
                    }
                }
            }
        }
        return C54862xYb.convertToBigIntegerString$default(bigDecimal, false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    /* JADX DEBUG: Type inference failed for r1v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.business.defi.biz.net.bean.UTXOInfoResp>>> */
    public final AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> QKVWgx() {
        UtxoInfo utxoInfo = this.isConnected;
        if (utxoInfo == null) {
            AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(UTXOAddressInfoReq.SPEED_UP_NOT_SUPPORTED_ERROR_CODE, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl2 = iwGUEr().KWHzl(fetchVPNInfo(), getFieldNames(), new UTXOInfoReq(java.lang.Long.valueOf(C11600cUg.copydefault(AYXKKw())), C56402yEa.EZpvd(new UTXOAddressInfoReq(utxoInfo.getAddress(), C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null), copydefault(), (java.lang.Integer) 15, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, java.lang.Integer.valueOf(C33129mqd.AhwBna(AuCTelauCTel())), (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, C56402yEa.EZpvd(utxoInfo.getTxHash() + "-" + utxoInfo.getVout()), 30704, (DefaultConstructorMarker) null)), 0, 4, null));
        final Function1 function1 = new Function1() { // from class: o.cnq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.gEmmrt(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.cnm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.QUSxYX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final ResponseData RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(AbstractC12484cnn abstractC12484cnn, ResponseData responseData, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        int iIntValue = num.intValue();
        abstractC12484cnn.DbNXlk = iIntValue;
        C43296rmc.KWHzl(abstractC12484cnn.AhwBna, "balance=" + abstractC12484cnn.AYXKKw + ",signLength=" + iIntValue + ",amount=" + abstractC12484cnn.EZpvd() + ",feeRate=" + abstractC12484cnn.AuCTelauCTel());
        return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
    }

    public final java.lang.String copydefault(java.lang.Integer num) {
        if ((num != null && num.intValue() == 400002) || (num != null && num.intValue() == 10001)) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DBxZfM);
        }
        if ((num != null && num.intValue() == 10004) || (num != null && num.intValue() == 100041)) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.QIZEnU);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.UscePu);
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> KWHzl(@NotNull final java.lang.String str, java.lang.String str2, @NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        AbstractC12782ctV abstractC12782ctVDbNXlk = DbNXlk();
        if (abstractC12782ctVDbNXlk != null && abstractC12782ctVDbNXlk.zuBGHE()) {
            if (OneKeyModule.OLrzqt.AEQbTJ(AkhnZx())) {
                AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(fragmentActivity);
                final Function1 function1 = new Function1() { // from class: o.cnD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.isConnected(this.EZpvd, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cnP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.dxcTrN(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.cnO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.AkhnZx(this.AEQbTJ, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cnT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.dvKsVJ(function12, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXKWHzl3);
                return abstractC58185ywXKWHzl3;
            }
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl4);
            return abstractC58185ywXKWHzl4;
        }
        AbstractC12782ctV abstractC12782ctVDbNXlk2 = DbNXlk();
        if (abstractC12782ctVDbNXlk2 != null && abstractC12782ctVDbNXlk2.gHZMYf()) {
            if (LedgerSignHelper.AEQbTJ.KWHzl(AkhnZx())) {
                AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl5 = KWHzl(fragmentActivity);
                final Function1 function13 = new Function1() { // from class: o.cnS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.fetchVPNInfo(this.AEQbTJ, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<R> abstractC58185ywXKWHzl6 = abstractC58185ywXKWHzl5.KWHzl(new InterfaceC58229yxO() { // from class: o.cnR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.fFgQHt(function13, obj);
                    }
                });
                final Function1 function14 = new Function1() { // from class: o.cnQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.DbNXlk(this.copydefault, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl7 = abstractC58185ywXKWHzl6.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cnU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.fZBcTu(function14, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXKWHzl7);
                return abstractC58185ywXKWHzl7;
            }
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl8 = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl8);
            return abstractC58185ywXKWHzl8;
        }
        AbstractC12782ctV abstractC12782ctVDbNXlk3 = DbNXlk();
        if (abstractC12782ctVDbNXlk3 != null && abstractC12782ctVDbNXlk3.ORxRYg()) {
            C10854bwM c10854bwMAkhnZx = AkhnZx();
            if (c10854bwMAkhnZx != null && c10854bwMAkhnZx.hrNTAI()) {
                AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl9 = KWHzl(fragmentActivity);
                final Function1 function15 = new Function1() { // from class: o.cnY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.OLrzqt(this.EZpvd, str, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<R> abstractC58185ywXKWHzl10 = abstractC58185ywXKWHzl9.KWHzl(new InterfaceC58229yxO() { // from class: o.cnV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.finit(function15, obj);
                    }
                });
                final Function1 function16 = new Function1() { // from class: o.cnF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.fIwbmz(this.KWHzl, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl11 = abstractC58185ywXKWHzl10.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cnC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.gasjUx(function16, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXKWHzl11);
                return abstractC58185ywXKWHzl11;
            }
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl12 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl12);
            return abstractC58185ywXKWHzl12;
        }
        AbstractC58185ywX<PasswordCheckResult> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str).EZpvd();
        final Function1 function17 = new Function1() { // from class: o.cnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.EZpvd((PasswordCheckResult) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.giSNqX(function17, obj);
            }
        });
        final Function1 function18 = new Function1() { // from class: o.cnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.AEQbTJ(this.OLrzqt, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl13 = abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.fvQaOB(function18, obj);
            }
        });
        final Function1 function19 = new Function1() { // from class: o.cnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.copydefault(this.OLrzqt, fragmentActivity, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl14 = abstractC58185ywXKWHzl13.KWHzl(new InterfaceC58229yxO() { // from class: o.cnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.hUfVAv(function19, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl14, "");
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = C11607cUn.AEQbTJ(abstractC58185ywXKWHzl14);
        final Function1 function110 = new Function1() { // from class: o.cnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.KWHzl(this.OLrzqt, (AbstractC12484cnn.TaskDescription) obj);
            }
        };
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl15 = abstractC58185ywXAEQbTJ2.KWHzl(new InterfaceC58229yxO() { // from class: o.cnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.gkJEwt(function110, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl15, "");
        return abstractC58185ywXKWHzl15;
    }

    public static final InterfaceC60096zvd dxcTrN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd isConnected(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.util.List<UTXOInfoResp> listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            return abstractC12484cnn.OLrzqt(listAhwBna);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AkhnZx(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return abstractC12484cnn.AEQbTJ((TaskDescription) data);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean("", "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), responseData.getError_code(), 12, 0 == true ? 1 : 0));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd fetchVPNInfo(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.util.List<UTXOInfoResp> listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            return abstractC12484cnn.KWHzl(listAhwBna);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd fZBcTu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd DbNXlk(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return abstractC12484cnn.AEQbTJ((TaskDescription) data);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean("", "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), responseData.getError_code(), 12, 0 == true ? 1 : 0));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC12484cnn abstractC12484cnn, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.util.List<UTXOInfoResp> listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            return abstractC12484cnn.EZpvd(str, listAhwBna);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd fIwbmz(AbstractC12484cnn abstractC12484cnn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return abstractC12484cnn.AEQbTJ((TaskDescription) data);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean("", "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), responseData.getError_code(), 12, 0 == true ? 1 : 0));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final java.lang.Integer giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer EZpvd(PasswordCheckResult passwordCheckResult) {
        int i;
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            i = -5001;
        } else {
            i = passwordCheckResult.isLocked() ? -5003 : -5002;
        }
        return java.lang.Integer.valueOf(i);
    }

    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(AbstractC12484cnn abstractC12484cnn, java.lang.String str, final java.lang.Integer num) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == -5001) {
            AbstractC12782ctV abstractC12782ctVDbNXlk = abstractC12484cnn.DbNXlk();
            if (abstractC12782ctVDbNXlk != null) {
                if (abstractC12782ctVDbNXlk.AubY()) {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtValues = abstractC12782ctVDbNXlk.values(str);
                    final Function1 function1 = new Function1() { // from class: o.col
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC12484cnn.OLrzqt(num, (java.lang.String) obj);
                        }
                    };
                    abstractC58260yxtCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.coo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return AbstractC12484cnn.flVtFt(function1, obj);
                        }
                    });
                } else {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtEjfBZ = abstractC12782ctVDbNXlk.ejfBZ(str);
                    final Function1 function12 = new Function1() { // from class: o.cok
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC12484cnn.AEQbTJ(num, (java.lang.String) obj);
                        }
                    };
                    abstractC58260yxtCopydefault = abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.com
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return AbstractC12484cnn.gGvvIC(function12, obj);
                        }
                    });
                }
                AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.EZpvd();
                if (abstractC58185ywXEZpvd != null) {
                    return abstractC58185ywXEZpvd;
                }
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(-5004, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(num, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final kotlin.Pair flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, C56424yEw.AYXKKw(C56390yDp.OLrzqt("mnemonic", str)));
    }

    public static final kotlin.Pair gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, C56424yEw.AYXKKw(C56390yDp.OLrzqt("privateKey", str)));
    }

    public static final InterfaceC60096zvd hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final AbstractC12484cnn abstractC12484cnn, FragmentActivity fragmentActivity, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Integer num = (java.lang.Integer) pair.getFirst();
        if (num != null && num.intValue() == -5001) {
            if (pair.getSecond() == null) {
                return AbstractC58185ywX.KWHzl(new TaskDescription(-5004, null, null, null, 8, null));
            }
            AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = abstractC12484cnn.KWHzl(fragmentActivity);
            final Function1 function1 = new Function1() { // from class: o.cof
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12484cnn.AEQbTJ(this.KWHzl, pair, (ResponseData) obj);
                }
            };
            return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cop
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12484cnn.AxsJAYaxsJAY(function1, obj);
                }
            });
        }
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        return AbstractC58185ywX.KWHzl(new TaskDescription(((java.lang.Number) first).intValue(), null, null, null, 8, null));
    }

    public static final TaskDescription AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (TaskDescription) function1.invoke(obj);
    }

    public static final TaskDescription AEQbTJ(AbstractC12484cnn abstractC12484cnn, kotlin.Pair pair, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            return abstractC12484cnn.copydefault((java.util.HashMap<java.lang.String, java.lang.String>) pair.getSecond(), (java.util.List<UTXOInfoResp>) responseData.getData());
        }
        return new TaskDescription(responseData.getCode(), null, null, responseData.getMsg());
    }

    public static final InterfaceC60096zvd gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(AbstractC12484cnn abstractC12484cnn, TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return abstractC12484cnn.AEQbTJ(taskDescription);
    }

    public final AbstractC58185ywX<ResponseData<DappTxResultBean>> AEQbTJ(final TaskDescription taskDescription) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        if (taskDescription.EZpvd() == -5001) {
            java.lang.String strKWHzl = taskDescription.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                java.lang.String str = null;
                java.lang.String str2 = null;
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, str, str2, new DappTxResultBean("", "", str, str2, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), false ? 1 : 0, 46, null));
            } else {
                xYW xyw = xYW.AEQbTJ;
                java.lang.String strKWHzl2 = taskDescription.KWHzl();
                C10854bwM c10854bwMAkhnZx = AkhnZx();
                java.lang.String strOLrzqt = xyw.OLrzqt(strKWHzl2, c10854bwMAkhnZx != null ? c10854bwMAkhnZx.QKVWgx() : -1L);
                java.lang.String strKWHzl3 = taskDescription.KWHzl();
                java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
                Gson gson = new Gson();
                C10854bwM c10854bwMOLrzqt = OLrzqt();
                int iCopydefault = C11600cUg.copydefault(c10854bwMOLrzqt != null ? java.lang.Integer.valueOf(c10854bwMOLrzqt.valueOf()) : null);
                java.lang.String strAhwBna = AhwBna();
                C10854bwM c10854bwMOLrzqt2 = OLrzqt();
                java.lang.String json = gson.toJson(new ExtJson(iCopydefault, 0, 1, strAhwBna, null, null, null, null, null, null, null, null, null, 0, C11600cUg.copydefault(c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.QbewEr() : null)));
                Intrinsics.checkNotNullExpressionValue(json, "");
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = OLrzqt(strKWHzl3, strOLrzqt, strAEQbTJ, json, (java.lang.String) null, (java.lang.String) null);
                final Function1 function1 = new Function1() { // from class: o.cnw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC12484cnn.AEQbTJ(taskDescription, (ResponseData) obj);
                    }
                };
                abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return AbstractC12484cnn.AxsJAYsNCnLh(function1, obj);
                    }
                });
            }
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        java.lang.String str3 = null;
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(taskDescription.EZpvd(), taskDescription.copydefault(), null, null, new DappTxResultBean("", "", str3, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), str3, 44, false ? 1 : 0));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final ResponseData AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(TaskDescription taskDescription, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String str = null;
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean(taskDescription.KWHzl(), (java.lang.String) responseData.getData(), (java.lang.String) null, str, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), str, 44, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.cnn$TaskDescription>> */
    public final AbstractC58185ywX<ResponseData<TaskDescription>> KWHzl(java.util.List<UTXOInfoResp> list) {
        java.util.List listAhwBna;
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        if (c10854bwMOLrzqt == null) {
            AbstractC58185ywX<ResponseData<TaskDescription>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ChainAddress chainAddressHDKMBd = hDKMBd();
        if (chainAddressHDKMBd == null) {
            AbstractC58185ywX<ResponseData<TaskDescription>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        final C12797ctk.StateListAnimator stateListAnimatorCopydefault = copydefault(list, EZpvd());
        LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
        java.lang.String strKWHzl = this.ejfBZ.KWHzl(OLrzqt());
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.OLrzqt() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAhwBna = AhwBna();
        java.lang.String strFARcdN = fARcdN();
        java.lang.String strEZpvd = EZpvd();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.copydefault() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        if (stateListAnimatorCopydefault == null || (listAhwBna = stateListAnimatorCopydefault.KWHzl()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = ledgerSignHelper.AEQbTJ(new LedgerSignHelper.ActionBar(c10854bwMOLrzqt, chainAddressHDKMBd, strKWHzl, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strAhwBna, strFARcdN, strEZpvd, strConvertToBigIntegerString$default3, listAhwBna, zsXlph(), AhwBna()));
        final Function1 function1 = new Function1() { // from class: o.cnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.AEQbTJ(stateListAnimatorCopydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.QbewEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData AEQbTJ(C12797ctk.StateListAnimator stateListAnimator, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            taskDescription = new TaskDescription(responseData.getCode(), (java.lang.String) responseData.getData(), stateListAnimator != null ? stateListAnimator.copydefault() : null, null, 8, null);
        }
        return new ResponseData(responseData.getCode(), null, null, null, taskDescription, responseData.getError_code(), 14, null);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.cnn$TaskDescription>> */
    public final AbstractC58185ywX<ResponseData<TaskDescription>> OLrzqt(java.util.List<UTXOInfoResp> list) {
        java.util.List listAhwBna;
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String derivePath;
        java.lang.String publicKey;
        final C12797ctk.StateListAnimator stateListAnimatorCopydefault = copydefault(list, EZpvd());
        OneKeySignHelper oneKeySignHelper = OneKeySignHelper.copydefault;
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        java.lang.String strCopydefault = null;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.OLrzqt() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAhwBna = AhwBna();
        java.lang.String strFARcdN = fARcdN();
        java.lang.String strEZpvd = EZpvd();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.copydefault() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        if (stateListAnimatorCopydefault == null || (listAhwBna = stateListAnimatorCopydefault.KWHzl()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List list2 = listAhwBna;
        ChainAddress chainAddressHDKMBd = hDKMBd();
        java.lang.String str = (chainAddressHDKMBd == null || (publicKey = chainAddressHDKMBd.getPublicKey()) == null) ? "" : publicKey;
        java.lang.String strAhwBna2 = AhwBna();
        ChainAddress chainAddressHDKMBd2 = hDKMBd();
        java.lang.String str2 = (chainAddressHDKMBd2 == null || (derivePath = chainAddressHDKMBd2.getDerivePath()) == null) ? "" : derivePath;
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = ejfBZ();
        if (abstractC12782ctVEjfBZ2 != null && (abstractC12784ctXGwTjWJ = abstractC12782ctVEjfBZ2.gwTjWJ()) != null && (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) != null) {
            strCopydefault = c13854daTFetchVPNInfo.copydefault();
        }
        java.lang.String str3 = strCopydefault;
        C8322bAY c8322bAY = C8322bAY.KWHzl;
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = oneKeySignHelper.copydefault(abstractC12782ctVEjfBZ, new UTXOTransaction(strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strAhwBna, strFARcdN, strEZpvd, strConvertToBigIntegerString$default3, list2, str, strAhwBna2, str2, str3, (DummyInfo) null, (java.lang.String) null, java.lang.Integer.valueOf(c8322bAY.KWHzl(c10854bwMOLrzqt != null ? c10854bwMOLrzqt.fetchVPNInfo() : 0L, AhwBna())), this.ejfBZ.KWHzl(OLrzqt()), (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 497664, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cnr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.EZpvd(stateListAnimatorCopydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.QfsBiF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData EZpvd(C12797ctk.StateListAnimator stateListAnimator, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            taskDescription = new TaskDescription(responseData.getCode(), (java.lang.String) responseData.getData(), stateListAnimator != null ? stateListAnimator.copydefault() : null, null, 8, null);
        }
        return new ResponseData(responseData.getCode(), null, null, null, taskDescription, responseData.getError_code(), 14, null);
    }

    /* JADX DEBUG: Type inference failed for r0v14. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<o.cnn$TaskDescription>> */
    public final AbstractC58185ywX<ResponseData<TaskDescription>> EZpvd(final java.lang.String str, java.util.List<UTXOInfoResp> list) {
        final java.lang.String publicKey;
        java.util.List<UTXOTxIn> listAhwBna;
        final C10854bwM c10854bwMOLrzqt = OLrzqt();
        if (c10854bwMOLrzqt == null) {
            AbstractC58185ywX<ResponseData<TaskDescription>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final C12797ctk.StateListAnimator stateListAnimatorCopydefault = copydefault(list, EZpvd());
        C10854bwM c10854bwMOLrzqt2 = OLrzqt();
        final long jQKVWgx = c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.QKVWgx() : -1L;
        ChainAddress chainAddressHDKMBd = hDKMBd();
        if (chainAddressHDKMBd == null || (publicKey = chainAddressHDKMBd.getPublicKey()) == null) {
            AbstractC58185ywX<ResponseData<TaskDescription>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        C8379bBc c8379bBc = C8379bBc.AEQbTJ;
        java.lang.String strKWHzl = this.ejfBZ.KWHzl(OLrzqt());
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.OLrzqt() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAhwBna = AhwBna();
        java.lang.String strFARcdN = fARcdN();
        java.lang.String strEZpvd = EZpvd();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.copydefault() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        if (stateListAnimatorCopydefault == null || (listAhwBna = stateListAnimatorCopydefault.KWHzl()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        final TxMessage txMessageKWHzl = c8379bBc.KWHzl(jQKVWgx, strKWHzl, publicKey, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strAhwBna, strFARcdN, strEZpvd, strConvertToBigIntegerString$default3, listAhwBna, zsXlph(), AhwBna());
        if (txMessageKWHzl == null || !txMessageKWHzl.isValid()) {
            AbstractC58185ywX<ResponseData<TaskDescription>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cns
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.OLrzqt(str, this, txMessageKWHzl, c10854bwMOLrzqt, jQKVWgx, publicKey, stateListAnimatorCopydefault, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.RcXXUw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
        return abstractC58185ywXKWHzl4;
    }

    public static final InterfaceC60096zvd RcXXUw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(java.lang.String str, final AbstractC12484cnn abstractC12484cnn, final TxMessage txMessage, C10854bwM c10854bwM, final long j, final java.lang.String str2, final C12797ctk.StateListAnimator stateListAnimator, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC12782ctV abstractC12782ctVEjfBZ = abstractC12484cnn.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctVEjfBZ.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str3, mpcWalletEncodeInfoQSBOWP);
        C10965byR c10965byR = C10965byR.OLrzqt;
        java.lang.String message = txMessage.getMessage();
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = abstractC12484cnn.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ2);
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c10965byR.copydefault(message, c10854bwM, mpcWalletDecodeInfoOLrzqt, abstractC12782ctVEjfBZ2.finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12484cnn.AEQbTJ(j, txMessage, str2, stateListAnimator, abstractC12484cnn, (java.lang.String) obj);
            }
        };
        return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12484cnn.UeEOUB(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
    }

    public static final ResponseData UeEOUB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(long j, TxMessage txMessage, java.lang.String str, C12797ctk.StateListAnimator stateListAnimator, AbstractC12484cnn abstractC12484cnn, java.lang.String str2) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str2);
        if (list.isEmpty()) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        C8379bBc c8379bBc = C8379bBc.AEQbTJ;
        java.lang.String tx = txMessage.getTx();
        if (stateListAnimator == null || (listAhwBna = stateListAnimator.KWHzl()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.lang.String strCopydefault = c8379bBc.copydefault(j, tx, str, C12800ctn.copydefault(list, listAhwBna), abstractC12484cnn.zsXlph());
        if (strCopydefault.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, 0 == true ? 1 : 0, null, new TaskDescription(-5001, strCopydefault, stateListAnimator != null ? stateListAnimator.copydefault() : null, null, 8, null), null, 46, null);
    }

    public final TaskDescription copydefault(java.util.HashMap<java.lang.String, java.lang.String> map, java.util.List<UTXOInfoResp> list) {
        java.util.List listAhwBna;
        C12797ctk.StateListAnimator stateListAnimatorCopydefault = copydefault(list, EZpvd());
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L;
        C10854bwM c10854bwMOLrzqt2 = OLrzqt();
        long jFetchVPNInfo = c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.fetchVPNInfo() : -1L;
        java.lang.String strKWHzl = this.ejfBZ.KWHzl(OLrzqt());
        java.lang.String str = map != null ? map.get("mnemonic") : null;
        java.lang.String str2 = map != null ? map.get("privateKey") : null;
        AbstractC12782ctV abstractC12782ctVDbNXlk = DbNXlk();
        SignParams signParams = new SignParams(jQKVWgx, jFetchVPNInfo, strKWHzl, str2, str, abstractC12782ctVDbNXlk != null ? java.lang.Integer.valueOf(abstractC12782ctVDbNXlk.finit()) : null, zsXlph(), null, false, false, null, 1920, null);
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.OLrzqt() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.fetchVPNInfo, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAhwBna = AhwBna();
        java.lang.String strFARcdN = fARcdN();
        java.lang.String strEZpvd = EZpvd();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.copydefault() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        if (stateListAnimatorCopydefault == null || (listAhwBna = stateListAnimatorCopydefault.KWHzl()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new TaskDescription(-5001, C54904xZq.copydefault.copydefault(signParams, new UTXOTransaction(strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strAhwBna, strFARcdN, strEZpvd, strConvertToBigIntegerString$default3, listAhwBna, (java.lang.String) null, AhwBna(), (java.lang.String) null, (java.lang.String) null, (DummyInfo) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 523904, (DefaultConstructorMarker) null)), stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.copydefault() : null, null, 8, null);
    }

    /* JADX INFO: renamed from: o.cnn$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i2 & 4) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            if ((i2 & 8) != 0) {
                str3 = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(i, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            return new TaskDescription(i, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.OLrzqt == taskDescription.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
            java.lang.String str = this.KWHzl;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UTXOSignResult(code=" + this.OLrzqt + ", signedTx=" + this.KWHzl + ", fee=" + this.AEQbTJ + ", msg=" + this.copydefault + ")";
        }

        public TaskDescription(int i, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            this.OLrzqt = i;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.copydefault = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:716) call: o.cnn.TaskDescription.<init>(int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? "" : str3);
        }
    }

    public static final InterfaceC60096zvd gEmmrt(final AbstractC12484cnn abstractC12484cnn, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            abstractC12484cnn.AYXKKw = abstractC12484cnn.EZpvd((java.util.List<UTXOInfoResp>) responseData.getData());
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXCopydefault = abstractC12484cnn.copydefault((java.util.List<UTXOInfoResp>) responseData.getData());
            final Function1 function1 = new Function1() { // from class: o.cnZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12484cnn.OLrzqt(this.EZpvd, responseData, (java.lang.Integer) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12484cnn.RJOkX(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), abstractC12484cnn.copydefault(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, null, 60, null));
    }
}
