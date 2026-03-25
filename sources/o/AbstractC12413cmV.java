package o;

import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.SpeedUpInfoBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.Address;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.business.defi.biz.net.bean.WalletTxJavaReq;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12413cmV<B extends SpeedUpInfoBean> {
    public ChainAddress AEQbTJ;
    public C10854bwM EZpvd;
    public B OLrzqt;
    public AbstractC12782ctV djBIcL;
    public final java.lang.String KWHzl = "SpeedUpTxBaseBiz";
    public final C13934dbu gEmmrt = new C13934dbu();
    public C12804ctr copydefault = new C12804ctr();

    public abstract B AEQbTJ(@NotNull TxRecord txRecord);

    public abstract java.lang.Long AYXKKw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM AkhnZx() {
        return this.EZpvd;
    }

    public abstract int AuCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV DbNXlk() {
        return this.djBIcL;
    }

    public abstract B EZpvd(AbstractC12782ctV abstractC12782ctV, @NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail);

    public abstract java.lang.String EZpvd();

    public abstract B KWHzl(@NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail);

    public abstract java.lang.String KWHzl();

    public abstract AbstractC58185ywX<ResponseData<DappTxResultBean>> KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull FragmentActivity fragmentActivity);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM OLrzqt() {
        return this.EZpvd;
    }

    public abstract java.lang.String copydefault();

    public abstract void copydefault(@NotNull SignInfo signInfo);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV ejfBZ() {
        return this.djBIcL;
    }

    public abstract java.lang.String fARcdN();

    public abstract int fIwbmz();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B fJNWhG() {
        return this.OLrzqt;
    }

    public abstract java.lang.String gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainAddress hDKMBd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13934dbu iwGUEr() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12804ctr valueOf() {
        return this.copydefault;
    }

    public abstract int values();

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(@NotNull final java.lang.String str, final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, final TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, final TxRecord txRecord, final WalletTxDetailBean walletTxDetailBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final CustomChainCoinMeta customChainCoinMetaOLrzqt = coinAndAddressHistoryDetail != null ? C10598brV.AEQbTJ.OLrzqt(coinAndAddressHistoryDetail.getCoinId()) : null;
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true).EZpvd();
        final CustomChainCoinMeta customChainCoinMeta = customChainCoinMetaOLrzqt;
        final Function1 function1 = new Function1() { // from class: o.cni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12413cmV.EZpvd(customChainCoinMeta, coinAndAddressHistoryDetail, this, str, walletTxDetailBean, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12413cmV.AYXKKw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12413cmV.AEQbTJ(this.copydefault, coinAndAddressHistoryDetail, customChainCoinMetaOLrzqt, txIdOrHashHistoryDetail, txRecord, (Triple) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12413cmV.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(CustomChainCoinMeta customChainCoinMeta, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12413cmV abstractC12413cmV, java.lang.String str, WalletTxDetailBean walletTxDetailBean, final AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (customChainCoinMeta != null) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Triple(abstractC12782ctV, null, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        if (abstractC12782ctV.getFieldNames()) {
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new Triple(abstractC12782ctV, null, C10857bwP.AEQbTJ("SpeedUpTxBaseBiz", "AA not support")));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        if (coinAndAddressHistoryDetail != null && coinAndAddressHistoryDetail.getTxType() != 1 && coinAndAddressHistoryDetail.getTxType() != 2 && coinAndAddressHistoryDetail.getTxType() != 9) {
            C10954byG c10954byG = C10954byG.EZpvd;
            C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(coinAndAddressHistoryDetail.getCoinId()));
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L, null, 2, null);
            java.lang.String str2 = (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) ? "" : address;
            C13934dbu c13934dbu = abstractC12413cmV.gEmmrt;
            java.lang.String orderType = coinAndAddressHistoryDetail.getOrderType();
            java.lang.String orderId = coinAndAddressHistoryDetail.getOrderId();
            C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(coinAndAddressHistoryDetail.getCoinId());
            AbstractC58185ywX<ResponseData<TxIdOrHashHistoryDetail>> abstractC58185ywXCopydefault = c13934dbu.copydefault(str, orderType, orderId, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AEQbTJ() : 0L, str2, coinAndAddressHistoryDetail.getTxId(), coinAndAddressHistoryDetail.getTxhash(), coinAndAddressHistoryDetail.getUOpHash());
            final Function1 function1 = new Function1() { // from class: o.cne
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12413cmV.EZpvd(abstractC12782ctV, (ResponseData) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12413cmV.djBIcL(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
            return interfaceC60096zvdAEQbTJ;
        }
        if (walletTxDetailBean != null) {
            C10954byG c10954byG2 = C10954byG.EZpvd;
            C10854bwM c10854bwMKWHzl3 = c10954byG2.valueOf().KWHzl(java.lang.Long.valueOf(walletTxDetailBean.getCoinId()));
            ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.AEQbTJ() : -1L, null, 2, null);
            java.lang.String address2 = chainAddressAddressFromChainId$default2 != null ? chainAddressAddressFromChainId$default2.getAddress() : null;
            C13934dbu c13934dbu2 = abstractC12413cmV.gEmmrt;
            java.lang.String orderType2 = walletTxDetailBean.getOrderType();
            java.lang.String str3 = orderType2 == null ? "" : orderType2;
            java.lang.String orderId2 = walletTxDetailBean.getOrderId();
            java.lang.String str4 = orderId2 == null ? "" : orderId2;
            C10854bwM c10854bwMKWHzl4 = c10954byG2.valueOf().KWHzl(walletTxDetailBean.getCoinId());
            long jAEQbTJ = c10854bwMKWHzl4 != null ? c10854bwMKWHzl4.AEQbTJ() : 0L;
            java.lang.String str5 = address2 == null ? "" : address2;
            java.lang.String txId = walletTxDetailBean.getTxId();
            java.lang.String txHash = walletTxDetailBean.getTxHash();
            AbstractC58185ywX<ResponseData<TxIdOrHashHistoryDetail>> abstractC58185ywXCopydefault2 = c13934dbu2.copydefault(str, str3, str4, jAEQbTJ, str5, txId, txHash == null ? "" : txHash, null);
            final Function1 function12 = new Function1() { // from class: o.cnc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12413cmV.OLrzqt(abstractC12782ctV, (ResponseData) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ2 = abstractC58185ywXCopydefault2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cng
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12413cmV.valueOf(function12, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ2);
            return interfaceC60096zvdAEQbTJ2;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new Triple(abstractC12782ctV, null, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public static final Triple djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(AbstractC12413cmV abstractC12413cmV, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, CustomChainCoinMeta customChainCoinMeta, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, TxRecord txRecord, Triple triple) {
        B b;
        C10854bwM c10854bwMKWHzl;
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        Intrinsics.checkNotNullParameter(triple, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird())) {
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, triple.getThird()));
        }
        abstractC12413cmV.djBIcL = (AbstractC12782ctV) triple.getFirst();
        if (triple.getSecond() != null) {
            java.lang.Object second = triple.getSecond();
            Intrinsics.copydefault(second);
            b = (B) abstractC12413cmV.AEQbTJ((TxIdOrHashHistoryDetail) second);
        } else if (coinAndAddressHistoryDetail != null) {
            b = (B) abstractC12413cmV.AEQbTJ(abstractC12413cmV.djBIcL, coinAndAddressHistoryDetail, customChainCoinMeta != null);
        } else if (txIdOrHashHistoryDetail != null) {
            b = (B) abstractC12413cmV.AEQbTJ(txIdOrHashHistoryDetail);
        } else {
            b = txRecord != null ? (B) abstractC12413cmV.OLrzqt(txRecord) : null;
        }
        abstractC12413cmV.OLrzqt = b;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(b != null ? b.getMainCoinId() : 0L);
        if (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt.EZpvd()) == null || (c10854bwMKWHzl = customChainCoinMetaEZpvd.AEQbTJ()) == null) {
            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
            B b2 = abstractC12413cmV.OLrzqt;
            c10854bwMKWHzl = c10948byAValueOf.KWHzl(b2 != null ? b2.getMainCoinId() : 0L);
        }
        abstractC12413cmV.EZpvd = c10854bwMKWHzl;
        abstractC12413cmV.AEQbTJ = abstractC12413cmV.uzCIH();
        return abstractC12413cmV.getNewProxyInstance();
    }

    public ChainAddress uzCIH() {
        AbstractC12782ctV abstractC12782ctV = this.djBIcL;
        if (abstractC12782ctV == null) {
            return null;
        }
        C10854bwM c10854bwM = this.EZpvd;
        return AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, null, 2, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ctr.init$default(o.ctr, o.bwM, java.util.List, int, java.lang.Object):o.ywX */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> getNewProxyInstance() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = AEQbTJ();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXZLjUOn = zLjUOn();
        C12804ctr c12804ctr = this.copydefault;
        C10854bwM c10854bwM = this.EZpvd;
        if (c10854bwM != null) {
            AbstractC58185ywX abstractC58185ywXInit$default = C12804ctr.init$default(c12804ctr, c10854bwM, null, 2, null);
            final yHO yho = new yHO() { // from class: o.cmY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC12413cmV.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
                }
            };
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXAEQbTJ, abstractC58185ywXZLjUOn, abstractC58185ywXInit$default, new InterfaceC58228yxN() { // from class: o.cmZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58228yxN
                public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC12413cmV.copydefault(yho, obj, obj2, obj3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            return abstractC58185ywXEZpvd;
        }
        throw new java.lang.IllegalArgumentException("not support chain");
    }

    public static final kotlin.Pair copydefault(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        return (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue() && ((java.lang.Boolean) pair3.getFirst()).booleanValue()) ? C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "") : !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair3.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B AEQbTJ(AbstractC12782ctV abstractC12782ctV, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, boolean z) {
        ChainAddress chainAddressAddressFromChainId$default;
        B b = (B) EZpvd(abstractC12782ctV, coinAndAddressHistoryDetail);
        b.setOrderId(coinAndAddressHistoryDetail.getOrderId());
        b.setTxId(coinAndAddressHistoryDetail.getTxId());
        java.lang.String txhash = coinAndAddressHistoryDetail.getTxhash();
        if (txhash == null) {
            txhash = "";
        }
        b.setTxHash(txhash);
        b.setTxType(coinAndAddressHistoryDetail.getTxType());
        b.setTxSource(coinAndAddressHistoryDetail.getTxSource());
        b.setTxStatus(coinAndAddressHistoryDetail.getTxStatus());
        java.lang.String okexAccount = coinAndAddressHistoryDetail.getOkexAccount();
        if (okexAccount == null) {
            okexAccount = "";
        }
        b.setOkexAccount(okexAccount);
        if (z) {
            chainAddressAddressFromChainId$default = abstractC12782ctV != null ? abstractC12782ctV.OLrzqt(java.lang.Long.valueOf(coinAndAddressHistoryDetail.getMainCoinId())) : null;
        } else if (abstractC12782ctV != null) {
            chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, coinAndAddressHistoryDetail.getMainCoinId(), null, 2, null);
        }
        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        if (Intrinsics.EZpvd((java.lang.Object) coinAndAddressHistoryDetail.getDirection(), (java.lang.Object) "1")) {
            b.setFrom(coinAndAddressHistoryDetail.getFrom());
            b.setTo(address != null ? address : "");
        } else {
            b.setFrom(address != null ? address : "");
            b.setTo(coinAndAddressHistoryDetail.getTo());
        }
        b.setCoinId(coinAndAddressHistoryDetail.getCoinId());
        b.setCoinSymbol(coinAndAddressHistoryDetail.getCoinSymbol());
        b.setCoinAmount(coinAndAddressHistoryDetail.getCoinAmountNum());
        b.setServiceCharge(coinAndAddressHistoryDetail.getServiceCharge());
        b.setMainCoinId(coinAndAddressHistoryDetail.getMainCoinId());
        b.setOrderType(coinAndAddressHistoryDetail.getOrderType());
        return b;
    }

    public final B AEQbTJ(TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        java.lang.String address;
        java.lang.String address2;
        B b = (B) KWHzl(txIdOrHashHistoryDetail);
        b.setOrderId(txIdOrHashHistoryDetail.getOrderId());
        b.setTxId(txIdOrHashHistoryDetail.getTxId());
        b.setTxHash(txIdOrHashHistoryDetail.getTxHash());
        b.setTxType(txIdOrHashHistoryDetail.getTxType());
        b.setTxSource(txIdOrHashHistoryDetail.getTxSource());
        b.setTxStatus(txIdOrHashHistoryDetail.getTxStatus());
        Address address3 = (Address) CollectionsKt___CollectionsKt.firstOrNull(txIdOrHashHistoryDetail.getInAdrList());
        if (address3 == null || (address = address3.getAddress()) == null) {
            address = "";
        }
        b.setFrom(address);
        Address address4 = (Address) CollectionsKt___CollectionsKt.firstOrNull(txIdOrHashHistoryDetail.getOutAdrList());
        if (address4 == null || (address2 = address4.getAddress()) == null) {
            address2 = "";
        }
        b.setTo(address2);
        b.setCoinId(txIdOrHashHistoryDetail.getCoinId());
        b.setCoinSymbol(txIdOrHashHistoryDetail.getCoinSymbol());
        b.setCoinAmount(txIdOrHashHistoryDetail.getCoinAmount());
        b.setServiceCharge(txIdOrHashHistoryDetail.getServiceCharge());
        b.setMainCoinId(txIdOrHashHistoryDetail.getMainCoinId());
        java.lang.String okexAccount = txIdOrHashHistoryDetail.getOkexAccount();
        b.setOkexAccount(okexAccount != null ? okexAccount : "");
        return b;
    }

    public final B OLrzqt(TxRecord txRecord) {
        B b = (B) AEQbTJ(txRecord);
        b.setOrderId(txRecord.getOrderId());
        b.setTxId(txRecord.getTxId());
        b.setTxHash(txRecord.getTxhash());
        b.setTxType(txRecord.getTxType());
        b.setTxSource(txRecord.getTxSource());
        b.setTxStatus(txRecord.getTxStatus());
        b.setFrom(txRecord.getFrom());
        b.setTo(txRecord.getTo());
        b.setCoinId(txRecord.getCoinId());
        b.setCoinSymbol(txRecord.getCoinSymbol());
        b.setCoinAmount(txRecord.getCoinAmountNum());
        b.setServiceCharge(txRecord.getServiceCharge());
        b.setMainCoinId(txRecord.getMainCoinId());
        java.lang.String okexAccount = txRecord.getOkexAccount();
        if (okexAccount == null) {
            okexAccount = "";
        }
        b.setOkexAccount(okexAccount);
        b.setOrderType(txRecord.getOrderType());
        return b;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        java.lang.String address;
        C13934dbu c13934dbu = this.gEmmrt;
        java.lang.String strFetchVPNInfo = fetchVPNInfo();
        java.lang.String fieldNames = getFieldNames();
        java.lang.Long lAYXKKw = AYXKKw();
        long jLongValue = lAYXKKw != null ? lAYXKKw.longValue() : -1L;
        ChainAddress chainAddressHDKMBd = hDKMBd();
        if (chainAddressHDKMBd == null || (address = chainAddressHDKMBd.getAddress()) == null) {
            address = "";
        }
        AbstractC58185ywX<ResponseData<ChainInfo>> abstractC58185ywXAEQbTJ = c13934dbu.AEQbTJ(strFetchVPNInfo, fieldNames, jLongValue, address, fIwbmz());
        final Function1 function1 = new Function1() { // from class: o.cnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12413cmV.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12413cmV.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> zLjUOn() {
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = this.gEmmrt.copydefault(fetchVPNInfo(), getFieldNames(), new SignInfoReq(java.lang.String.valueOf(AYXKKw()), AhwBna(), fARcdN(), AuCTel(), gEmmrt(), C54862xYb.convertToBigIntegerString$default(EZpvd(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8128, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12413cmV.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12413cmV.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static /* synthetic */ AbstractC58185ywX speedUp$default(AbstractC12413cmV abstractC12413cmV, java.lang.String str, java.lang.String str2, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: speedUp");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC12413cmV.KWHzl(str, str2, fragmentActivity);
    }

    public java.lang.String AhwBna() {
        SpeedUpInfoBean speedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String from = speedUpInfoBeanFJNWhG != null ? speedUpInfoBeanFJNWhG.getFrom() : null;
        return from == null ? "" : from;
    }

    public C10854bwM djBIcL() {
        return C10954byG.EZpvd.valueOf().KWHzl(AYXKKw());
    }

    public final boolean wlaJM() {
        java.lang.Long lAYXKKw = AYXKKw();
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        return Intrinsics.EZpvd(lAYXKKw, c10854bwMOLrzqt != null ? java.lang.Long.valueOf(c10854bwMOLrzqt.AhwBna()) : null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.String strValueOf;
        C10854bwM c10854bwMDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        int iFIwbmz = fIwbmz();
        java.lang.Long lAYXKKw = AYXKKw();
        long jLongValue = lAYXKKw != null ? lAYXKKw.longValue() : 0L;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(EZpvd(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String strAhwBna = AhwBna();
        java.lang.String strFARcdN = fARcdN();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(str3, true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String fieldNames = getFieldNames();
        AbstractC12782ctV abstractC12782ctV = this.djBIcL;
        int iOLrzqt = abstractC12782ctV != null ? WalletType.Companion.OLrzqt(abstractC12782ctV) : -1;
        if (AubY() && (c10854bwMDjBIcL = djBIcL()) != null && c10854bwMDjBIcL.QHmsKR()) {
            SpeedUpInfoBean speedUpInfoBeanFJNWhG = fJNWhG();
            strValueOf = java.lang.String.valueOf(speedUpInfoBeanFJNWhG != null ? speedUpInfoBeanFJNWhG.getTxType() : 2);
        } else {
            strValueOf = null;
        }
        return this.gEmmrt.EZpvd(getFieldNames(), fetchVPNInfo(), isConnected(), new WalletTxJavaReq(str, str2, iFIwbmz, jLongValue, strConvertToBigIntegerString$default, strAhwBna, strFARcdN, strConvertToBigIntegerString$default2, str4, null, null, null, null, str5, str6, fieldNames, iOLrzqt, null, null, null, strValueOf, null, null, null, null, null));
    }

    public boolean AubY() {
        SpeedUpInfoBean speedUpInfoBeanFJNWhG = fJNWhG();
        if (speedUpInfoBeanFJNWhG != null && speedUpInfoBeanFJNWhG.getTxType() == 1) {
            return true;
        }
        SpeedUpInfoBean speedUpInfoBeanFJNWhG2 = fJNWhG();
        if (speedUpInfoBeanFJNWhG2 != null && speedUpInfoBeanFJNWhG2.getTxType() == 2) {
            return true;
        }
        SpeedUpInfoBean speedUpInfoBeanFJNWhG3 = fJNWhG();
        return speedUpInfoBeanFJNWhG3 != null && speedUpInfoBeanFJNWhG3.getTxType() == 9;
    }

    public final java.lang.String fetchVPNInfo() {
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        java.lang.String strUSBtdM = abstractC12782ctVEjfBZ != null ? abstractC12782ctVEjfBZ.USBtdM() : null;
        return strUSBtdM == null ? "" : strUSBtdM;
    }

    public final java.lang.String isConnected() {
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        java.lang.String strAUsmxb = abstractC12782ctVEjfBZ != null ? abstractC12782ctVEjfBZ.aUsmxb() : null;
        return strAUsmxb == null ? "" : strAUsmxb;
    }

    public final java.lang.String getFieldNames() {
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        java.lang.String strDbNXlk = abstractC12782ctVEjfBZ != null ? abstractC12782ctVEjfBZ.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public static final Triple EZpvd(AbstractC12782ctV abstractC12782ctV, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return new Triple(abstractC12782ctV, responseData.getData(), "");
        }
        return new Triple(abstractC12782ctV, null, responseData.getMsg());
    }

    public static final Triple OLrzqt(AbstractC12782ctV abstractC12782ctV, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return new Triple(abstractC12782ctV, responseData.getData(), "");
        }
        return new Triple(abstractC12782ctV, null, responseData.getMsg());
    }

    public static final kotlin.Pair KWHzl(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ChainInfo chainInfo = (ChainInfo) responseData.getData();
            if (chainInfo != null && chainInfo.getCanWithdraw()) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ChainInfo chainInfo2 = (ChainInfo) responseData.getData();
            return C56390yDp.OLrzqt(bool, chainInfo2 != null ? chainInfo2.getWithdrawMsg() : null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(AbstractC12413cmV abstractC12413cmV, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            if (signInfo == null) {
                return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            }
            abstractC12413cmV.copydefault(signInfo);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
