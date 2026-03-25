package o;

import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSpeedUpSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMTransferSpeedUpSignData;
import com.okinc.business.defi.api.model.tx.signdata.SpeedUpSignData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.BTCSpeedUpSignData;
import com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.Address;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8490bDh {
    public static final C8490bDh AEQbTJ = new C8490bDh();

    private C8490bDh() {
    }

    public final AbstractC58260yxt<Triple<C10854bwM, BaseSignData, java.lang.String>> OLrzqt(@NotNull final java.lang.String str, final boolean z, final boolean z2, final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, final TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, final TxRecord txRecord, final WalletTxDetailBean walletTxDetailBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final CustomChainCoinMeta customChainCoinMetaOLrzqt = coinAndAddressHistoryDetail != null ? C10598brV.AEQbTJ.OLrzqt(coinAndAddressHistoryDetail.getCoinId()) : null;
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8490bDh.KWHzl(customChainCoinMetaOLrzqt, coinAndAddressHistoryDetail, str, walletTxDetailBean, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8490bDh.AYXKKw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8490bDh.copydefault(z, z2, coinAndAddressHistoryDetail, txIdOrHashHistoryDetail, txRecord, (Triple) obj);
            }
        };
        AbstractC58260yxt<Triple<C10854bwM, BaseSignData, java.lang.String>> abstractC58260yxtValueOf = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.bDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8490bDh.KWHzl(function12, obj);
            }
        }).valueOf();
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtValueOf, "");
        return abstractC58260yxtValueOf;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(CustomChainCoinMeta customChainCoinMeta, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, java.lang.String str, WalletTxDetailBean walletTxDetailBean, final AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (customChainCoinMeta != null) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Triple(abstractC12782ctV, null, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        if (abstractC12782ctV.getFieldNames()) {
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new Triple(abstractC12782ctV, null, C10857bwP.AEQbTJ("SpeedUpTxHelper", "AA not support")));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        if (coinAndAddressHistoryDetail != null && coinAndAddressHistoryDetail.getTxType() != 1 && coinAndAddressHistoryDetail.getTxType() != 2 && coinAndAddressHistoryDetail.getTxType() != 9) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(coinAndAddressHistoryDetail.getCoinId()));
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L, null, 2, null);
            AbstractC58185ywX<ResponseData<TxIdOrHashHistoryDetail>> abstractC58185ywXCopydefault = new C13934dbu().copydefault(str, coinAndAddressHistoryDetail.getOrderType(), coinAndAddressHistoryDetail.getOrderId(), coinAndAddressHistoryDetail.getCoinId(), (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) ? "" : address, coinAndAddressHistoryDetail.getTxId(), coinAndAddressHistoryDetail.getTxhash(), coinAndAddressHistoryDetail.getUOpHash());
            final Function1 function1 = new Function1() { // from class: o.bDf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8490bDh.EZpvd(abstractC12782ctV, (ResponseData) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bDe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8490bDh.valueOf(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
            return interfaceC60096zvdAEQbTJ;
        }
        if (walletTxDetailBean != null) {
            C10954byG c10954byG = C10954byG.EZpvd;
            C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(walletTxDetailBean.getCoinId()));
            ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AEQbTJ() : -1L, null, 2, null);
            java.lang.String address2 = chainAddressAddressFromChainId$default2 != null ? chainAddressAddressFromChainId$default2.getAddress() : null;
            C13934dbu c13934dbu = new C13934dbu();
            java.lang.String orderType = walletTxDetailBean.getOrderType();
            java.lang.String str2 = orderType == null ? "" : orderType;
            java.lang.String orderId = walletTxDetailBean.getOrderId();
            java.lang.String str3 = orderId == null ? "" : orderId;
            C10854bwM c10854bwMKWHzl3 = c10954byG.valueOf().KWHzl(walletTxDetailBean.getCoinId());
            long jAEQbTJ = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.AEQbTJ() : 0L;
            java.lang.String str4 = address2 == null ? "" : address2;
            java.lang.String txId = walletTxDetailBean.getTxId();
            java.lang.String txHash = walletTxDetailBean.getTxHash();
            AbstractC58185ywX<ResponseData<TxIdOrHashHistoryDetail>> abstractC58185ywXCopydefault2 = c13934dbu.copydefault(str, str2, str3, jAEQbTJ, str4, txId, txHash == null ? "" : txHash, null);
            final Function1 function12 = new Function1() { // from class: o.bDg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8490bDh.copydefault(abstractC12782ctV, (ResponseData) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ2 = abstractC58185ywXCopydefault2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bDl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8490bDh.djBIcL(function12, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ2);
            return interfaceC60096zvdAEQbTJ2;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new Triple(abstractC12782ctV, null, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public static final Triple valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple copydefault(boolean z, boolean z2, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, TxRecord txRecord, Triple triple) {
        C10854bwM c10854bwMKWHzl;
        BaseSignData baseSignDataKWHzl;
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        C10854bwM c10854bwMKWHzl2;
        CustomChainCoinMeta customChainCoinMetaEZpvd2;
        C10854bwM c10854bwMKWHzl3;
        CustomChainCoinMeta customChainCoinMetaEZpvd3;
        CustomChainCoinMeta customChainCoinMetaEZpvd4;
        Intrinsics.checkNotNullParameter(triple, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird())) {
            return new Triple(null, null, triple.getThird());
        }
        if (triple.getSecond() != null) {
            C10598brV c10598brV = C10598brV.AEQbTJ;
            java.lang.Object second = triple.getSecond();
            Intrinsics.copydefault(second);
            CustomChainCoinMeta customChainCoinMetaOLrzqt = c10598brV.OLrzqt(((TxIdOrHashHistoryDetail) second).getMainCoinId());
            if (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd4 = customChainCoinMetaOLrzqt.EZpvd()) == null || (c10854bwMKWHzl = customChainCoinMetaEZpvd4.AEQbTJ()) == null) {
                C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                java.lang.Object second2 = triple.getSecond();
                Intrinsics.copydefault(second2);
                c10854bwMKWHzl = c10948byAValueOf.KWHzl(((TxIdOrHashHistoryDetail) second2).getMainCoinId());
            }
            if (c10854bwMKWHzl == null) {
                return new Triple(null, null, C10857bwP.AEQbTJ("SpeedUpTxHelper", "mainCoinId not found"));
            }
            C8490bDh c8490bDh = AEQbTJ;
            java.lang.Object second3 = triple.getSecond();
            Intrinsics.copydefault(second3);
            baseSignDataKWHzl = c8490bDh.EZpvd(c10854bwMKWHzl, z, z2, (TxIdOrHashHistoryDetail) second3);
        } else if (coinAndAddressHistoryDetail != null) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt2 = C10598brV.AEQbTJ.OLrzqt(coinAndAddressHistoryDetail.getMainCoinId());
            if (customChainCoinMetaOLrzqt2 == null || (customChainCoinMetaEZpvd3 = customChainCoinMetaOLrzqt2.EZpvd()) == null || (c10854bwMKWHzl3 = customChainCoinMetaEZpvd3.AEQbTJ()) == null) {
                c10854bwMKWHzl3 = C10954byG.EZpvd.valueOf().KWHzl(coinAndAddressHistoryDetail.getMainCoinId());
            }
            C10854bwM c10854bwM = c10854bwMKWHzl3;
            if (c10854bwM == null) {
                return new Triple(null, null, C10857bwP.AEQbTJ("SpeedUpTxHelper", "mainCoinId not found"));
            }
            baseSignDataKWHzl = AEQbTJ.copydefault(c10854bwM, z, z2, (AbstractC12782ctV) triple.getFirst(), coinAndAddressHistoryDetail, c10854bwM.DarRvM());
            c10854bwMKWHzl = c10854bwM;
        } else if (txIdOrHashHistoryDetail != null) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt3 = C10598brV.AEQbTJ.OLrzqt(txIdOrHashHistoryDetail.getMainCoinId());
            if (customChainCoinMetaOLrzqt3 == null || (customChainCoinMetaEZpvd2 = customChainCoinMetaOLrzqt3.EZpvd()) == null || (c10854bwMKWHzl2 = customChainCoinMetaEZpvd2.AEQbTJ()) == null) {
                c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(txIdOrHashHistoryDetail.getMainCoinId());
            }
            if (c10854bwMKWHzl2 == null) {
                return new Triple(null, null, C10857bwP.AEQbTJ("SpeedUpTxHelper", "mainCoinId not found"));
            }
            C10854bwM c10854bwM2 = c10854bwMKWHzl2;
            baseSignDataKWHzl = AEQbTJ.EZpvd(c10854bwMKWHzl2, z, z2, txIdOrHashHistoryDetail);
            c10854bwMKWHzl = c10854bwM2;
        } else if (txRecord != null) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt4 = C10598brV.AEQbTJ.OLrzqt(txRecord.getMainCoinId());
            if (customChainCoinMetaOLrzqt4 == null || (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt4.EZpvd()) == null || (c10854bwMKWHzl = customChainCoinMetaEZpvd.AEQbTJ()) == null) {
                c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txRecord.getMainCoinId());
            }
            if (c10854bwMKWHzl == null) {
                return new Triple(null, null, C10857bwP.AEQbTJ("SpeedUpTxHelper", "mainCoinId not found"));
            }
            baseSignDataKWHzl = AEQbTJ.KWHzl(c10854bwMKWHzl, z, z2, txRecord);
        } else {
            return new Triple(null, null, null);
        }
        return new Triple(c10854bwMKWHzl, baseSignDataKWHzl, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BaseSignData copydefault(C10854bwM c10854bwM, boolean z, boolean z2, AbstractC12782ctV abstractC12782ctV, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, boolean z3) {
        ChainAddress chainAddressAddressFromChainId$default;
        java.lang.String str;
        java.lang.String to;
        if (z3) {
            chainAddressAddressFromChainId$default = abstractC12782ctV != null ? abstractC12782ctV.OLrzqt(java.lang.Long.valueOf(coinAndAddressHistoryDetail.getMainCoinId())) : null;
        } else if (abstractC12782ctV != null) {
            chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, coinAndAddressHistoryDetail.getMainCoinId(), null, 2, null);
        }
        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        if (Intrinsics.EZpvd((java.lang.Object) coinAndAddressHistoryDetail.getDirection(), (java.lang.Object) "1")) {
            java.lang.String from = coinAndAddressHistoryDetail.getFrom();
            if (address == null) {
                address = "";
            }
            to = address;
            str = from;
        } else {
            if (address == null) {
                address = "";
            }
            str = address;
            to = coinAndAddressHistoryDetail.getTo();
        }
        java.lang.String orderId = coinAndAddressHistoryDetail.getOrderId();
        java.lang.String txId = coinAndAddressHistoryDetail.getTxId();
        java.lang.String txhash = coinAndAddressHistoryDetail.getTxhash();
        java.lang.String str2 = txhash == null ? "" : txhash;
        int txType = coinAndAddressHistoryDetail.getTxType();
        java.lang.Integer txSource = coinAndAddressHistoryDetail.getTxSource();
        int txStatus = coinAndAddressHistoryDetail.getTxStatus();
        long coinId = coinAndAddressHistoryDetail.getCoinId();
        java.lang.String coinSymbol = coinAndAddressHistoryDetail.getCoinSymbol();
        java.lang.String coinAmountNum = coinAndAddressHistoryDetail.getCoinAmountNum();
        java.lang.String serviceCharge = coinAndAddressHistoryDetail.getServiceCharge();
        long mainCoinId = coinAndAddressHistoryDetail.getMainCoinId();
        java.lang.String okexAccount = coinAndAddressHistoryDetail.getOkexAccount();
        SpeedUpSignData speedUpSignData = new SpeedUpSignData(orderId, txId, str2, txType, txSource, txStatus, str, to, coinId, coinSymbol, coinAmountNum, serviceCharge, mainCoinId, okexAccount == null ? "" : okexAccount);
        if (!c10854bwM.QkdxfA()) {
            return null;
        }
        if (z || z2) {
            speedUpSignData.setCoinId(speedUpSignData.getMainCoinId());
            speedUpSignData.setCoinAmount("0");
            speedUpSignData.setTo(speedUpSignData.getFrom());
            java.lang.String gasPrice = coinAndAddressHistoryDetail.getGasPrice();
            java.lang.String priorityFee = coinAndAddressHistoryDetail.getPriorityFee();
            return new EVMTransferSpeedUpSignData(speedUpSignData, gasPrice, priorityFee == null ? "" : priorityFee, coinAndAddressHistoryDetail.getGasLimit(), coinAndAddressHistoryDetail.getNonce(), null);
        }
        if (AEQbTJ(java.lang.Integer.valueOf(coinAndAddressHistoryDetail.getTxType()))) {
            java.lang.String gasPrice2 = coinAndAddressHistoryDetail.getGasPrice();
            java.lang.String priorityFee2 = coinAndAddressHistoryDetail.getPriorityFee();
            return new EVMTransferSpeedUpSignData(speedUpSignData, gasPrice2, priorityFee2 == null ? "" : priorityFee2, coinAndAddressHistoryDetail.getGasLimit(), coinAndAddressHistoryDetail.getNonce(), coinAndAddressHistoryDetail.getInputData());
        }
        java.lang.String gasPrice3 = coinAndAddressHistoryDetail.getGasPrice();
        java.lang.String priorityFee3 = coinAndAddressHistoryDetail.getPriorityFee();
        return new EVMContractSpeedUpSignData(speedUpSignData, gasPrice3, priorityFee3 == null ? "" : priorityFee3, coinAndAddressHistoryDetail.getGasLimit(), coinAndAddressHistoryDetail.getNonce(), coinAndAddressHistoryDetail.getInputData());
    }

    public final BaseSignData EZpvd(C10854bwM c10854bwM, boolean z, boolean z2, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        BaseSignData bTCSpeedUpSignData;
        java.lang.String address;
        java.lang.String address2;
        java.lang.String orderId = txIdOrHashHistoryDetail.getOrderId();
        java.lang.String txId = txIdOrHashHistoryDetail.getTxId();
        java.lang.String txHash = txIdOrHashHistoryDetail.getTxHash();
        int txType = txIdOrHashHistoryDetail.getTxType();
        java.lang.Integer txSource = txIdOrHashHistoryDetail.getTxSource();
        int txStatus = txIdOrHashHistoryDetail.getTxStatus();
        Address address3 = (Address) CollectionsKt___CollectionsKt.firstOrNull(txIdOrHashHistoryDetail.getInAdrList());
        java.lang.String str = (address3 == null || (address2 = address3.getAddress()) == null) ? "" : address2;
        Address address4 = (Address) CollectionsKt___CollectionsKt.firstOrNull(txIdOrHashHistoryDetail.getOutAdrList());
        java.lang.String str2 = (address4 == null || (address = address4.getAddress()) == null) ? "" : address;
        long coinId = txIdOrHashHistoryDetail.getCoinId();
        java.lang.String coinSymbol = txIdOrHashHistoryDetail.getCoinSymbol();
        java.lang.String coinAmount = txIdOrHashHistoryDetail.getCoinAmount();
        java.lang.String serviceCharge = txIdOrHashHistoryDetail.getServiceCharge();
        long mainCoinId = txIdOrHashHistoryDetail.getMainCoinId();
        java.lang.String okexAccount = txIdOrHashHistoryDetail.getOkexAccount();
        SpeedUpSignData speedUpSignData = new SpeedUpSignData(orderId, txId, txHash, txType, txSource, txStatus, str, str2, coinId, coinSymbol, coinAmount, serviceCharge, mainCoinId, okexAccount == null ? "" : okexAccount);
        if (!c10854bwM.QkdxfA()) {
            if (!c10854bwM.iRxXKY()) {
                return null;
            }
            UTXOSpeedUpInfoJsonBean btcSpeedUpInfo = txIdOrHashHistoryDetail.getBtcSpeedUpInfo();
            bTCSpeedUpSignData = new BTCSpeedUpSignData(btcSpeedUpInfo != null ? btcSpeedUpInfo.getCpfpSpeedUpUtxo() : null, speedUpSignData);
        } else if (z || z2) {
            speedUpSignData.setCoinId(speedUpSignData.getMainCoinId());
            speedUpSignData.setCoinAmount("0");
            speedUpSignData.setTo(speedUpSignData.getFrom());
            java.lang.String gasPrice = txIdOrHashHistoryDetail.getGasPrice();
            java.lang.String priorityFee = txIdOrHashHistoryDetail.getPriorityFee();
            bTCSpeedUpSignData = new EVMTransferSpeedUpSignData(speedUpSignData, gasPrice, priorityFee == null ? "" : priorityFee, txIdOrHashHistoryDetail.getGasLimit(), txIdOrHashHistoryDetail.getNonce(), txIdOrHashHistoryDetail.getInputData());
        } else {
            if (AEQbTJ(java.lang.Integer.valueOf(txIdOrHashHistoryDetail.getTxType()))) {
                java.lang.String gasPrice2 = txIdOrHashHistoryDetail.getGasPrice();
                java.lang.String priorityFee2 = txIdOrHashHistoryDetail.getPriorityFee();
                return new EVMTransferSpeedUpSignData(speedUpSignData, gasPrice2, priorityFee2 == null ? "" : priorityFee2, txIdOrHashHistoryDetail.getGasLimit(), txIdOrHashHistoryDetail.getNonce(), txIdOrHashHistoryDetail.getInputData());
            }
            java.lang.String gasPrice3 = txIdOrHashHistoryDetail.getGasPrice();
            java.lang.String priorityFee3 = txIdOrHashHistoryDetail.getPriorityFee();
            return new EVMContractSpeedUpSignData(speedUpSignData, gasPrice3, priorityFee3 == null ? "" : priorityFee3, txIdOrHashHistoryDetail.getGasLimit(), txIdOrHashHistoryDetail.getNonce(), txIdOrHashHistoryDetail.getInputData());
        }
        return bTCSpeedUpSignData;
    }

    public final BaseSignData KWHzl(C10854bwM c10854bwM, boolean z, boolean z2, TxRecord txRecord) {
        java.lang.String orderId = txRecord.getOrderId();
        java.lang.String txId = txRecord.getTxId();
        java.lang.String txhash = txRecord.getTxhash();
        int txType = txRecord.getTxType();
        java.lang.Integer txSource = txRecord.getTxSource();
        int txStatus = txRecord.getTxStatus();
        java.lang.String from = txRecord.getFrom();
        java.lang.String to = txRecord.getTo();
        long coinId = txRecord.getCoinId();
        java.lang.String coinSymbol = txRecord.getCoinSymbol();
        java.lang.String coinAmountNum = txRecord.getCoinAmountNum();
        java.lang.String serviceCharge = txRecord.getServiceCharge();
        long mainCoinId = txRecord.getMainCoinId();
        java.lang.String okexAccount = txRecord.getOkexAccount();
        SpeedUpSignData speedUpSignData = new SpeedUpSignData(orderId, txId, txhash, txType, txSource, txStatus, from, to, coinId, coinSymbol, coinAmountNum, serviceCharge, mainCoinId, okexAccount == null ? "" : okexAccount);
        if (!c10854bwM.QkdxfA()) {
            return null;
        }
        if (z || z2) {
            speedUpSignData.setCoinId(speedUpSignData.getMainCoinId());
            speedUpSignData.setCoinAmount("0");
            speedUpSignData.setTo(speedUpSignData.getFrom());
            java.lang.String gasPrice = txRecord.getGasPrice();
            java.lang.String priorityFee = txRecord.getPriorityFee();
            return new EVMTransferSpeedUpSignData(speedUpSignData, gasPrice, priorityFee == null ? "" : priorityFee, txRecord.getGasLimit(), txRecord.getNonce(), txRecord.getInputData());
        }
        if (AEQbTJ(java.lang.Integer.valueOf(txRecord.getTxType()))) {
            java.lang.String gasPrice2 = txRecord.getGasPrice();
            java.lang.String priorityFee2 = txRecord.getPriorityFee();
            return new EVMTransferSpeedUpSignData(speedUpSignData, gasPrice2, priorityFee2 == null ? "" : priorityFee2, txRecord.getGasLimit(), txRecord.getNonce(), txRecord.getInputData());
        }
        java.lang.String gasPrice3 = txRecord.getGasPrice();
        java.lang.String priorityFee3 = txRecord.getPriorityFee();
        return new EVMContractSpeedUpSignData(speedUpSignData, gasPrice3, priorityFee3 == null ? "" : priorityFee3, txRecord.getGasLimit(), txRecord.getNonce(), txRecord.getInputData());
    }

    public final boolean AEQbTJ(java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return num != null && num.intValue() == 9;
    }

    public static final Triple EZpvd(AbstractC12782ctV abstractC12782ctV, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return new Triple(abstractC12782ctV, responseData.getData(), "");
        }
        return new Triple(abstractC12782ctV, null, responseData.getMsg());
    }

    public static final Triple copydefault(AbstractC12782ctV abstractC12782ctV, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return new Triple(abstractC12782ctV, responseData.getData(), "");
        }
        return new Triple(abstractC12782ctV, null, responseData.getMsg());
    }
}
