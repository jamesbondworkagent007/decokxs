package o;

import com.okinc.business.defi.api.bean.GasLimitBean;
import com.okinc.business.defi.api.bean.GasPriceBean;
import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.GasPrice;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.javascript.WalletJsBridge;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cYe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11706cYe extends AbstractC43215rlA implements InterfaceC9852bdR {
    @Override // o.InterfaceC9852bdR
    public InterfaceC9739bbK AhwBna() {
        return C10337bmZ.KWHzl;
    }

    @Override // o.InterfaceC9852bdR
    public InterfaceC9737bbI copydefault() {
        return C11627cVg.KWHzl;
    }

    @Override // o.InterfaceC9852bdR
    public InterfaceC9732bbD EZpvd() {
        return C10598brV.AEQbTJ;
    }

    @Override // o.InterfaceC9852bdR
    public InterfaceC9733bbE KWHzl() {
        return C10954byG.EZpvd.valueOf();
    }

    @Override // o.InterfaceC9852bdR
    public InterfaceC9741bbM gEmmrt() {
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
    }

    @Override // o.InterfaceC9852bdR
    public InterfaceC9740bbL AEQbTJ() {
        return C8396bBt.AEQbTJ;
    }

    public static final Unit AhwBna(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> AYXKKw() {
        AbstractC58185ywX abstractC58185ywXRefreshAllWalletAsset$default = C10407bnq.refreshAllWalletAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), 0, null, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.cYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.AhwBna((java.util.List) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXRefreshAllWalletAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXRefreshWalletAsset$default = C10407bnq.refreshWalletAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), str, 0, null, false, false, 6, null);
        final Function1 function1 = new Function1() { // from class: o.cYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.OLrzqt((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXRefreshWalletAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.fJNWhG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit OLrzqt(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> valueOf() {
        AbstractC58185ywX abstractC58185ywXRefreshAllWalletAsset$default = C10407bnq.refreshAllWalletAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), 1, null, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.valueOf((java.util.List) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXRefreshAllWalletAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> OLrzqt(@NotNull java.lang.String str, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        if (l == null) {
            AbstractC58185ywX abstractC58185ywXRefreshWalletAsset$default = C10407bnq.refreshWalletAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), str, 1, null, false, false, 4, null);
            final Function1 function1 = new Function1() { // from class: o.cYz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11706cYe.AEQbTJ((kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXRefreshWalletAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11706cYe.fIwbmz(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXRefreshWalletSingleCoinAsset$default = C10407bnq.refreshWalletSingleCoinAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), str, l.longValue(), null, false, false, 4, null);
        final Function1 function12 = new Function1() { // from class: o.cYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.OLrzqt((C10404bnn) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ2 = abstractC58185ywXRefreshWalletSingleCoinAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.ejfBZ(function12, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final Unit AEQbTJ(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit OLrzqt(C10404bnn c10404bnn) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<Unit> copydefault(@NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return valueOf();
        }
        AbstractC58185ywX abstractC58185ywXRefreshAllWalletsCoinAsset$default = C10407bnq.refreshAllWalletsCoinAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), list, null, false, false, 10, null);
        final Function1 function1 = new Function1() { // from class: o.cYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.AEQbTJ((java.util.List) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXRefreshAllWalletsCoinAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.AkhnZx(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    @Override // o.InterfaceC9852bdR
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xYW.AEQbTJ.OLrzqt(str, str2, str3);
    }

    @Override // o.InterfaceC9852bdR
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        WalletJsBridge.AEQbTJ.copydefault(C9678baC.Companion.AEQbTJ(), str, str2, str3, valueCallback);
    }

    @Override // o.InterfaceC9852bdR
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xYZ.KWHzl.KWHzl(str, str2, z);
    }

    @Override // o.InterfaceC9852bdR
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xYW.AEQbTJ.KWHzl(str, str2, str3);
    }

    @Override // o.InterfaceC9852bdR
    public java.lang.String djBIcL() {
        return WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
    }

    public static final ResponseData values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<ResponseData<GasLimitBean>> KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX abstractC58185ywXCopydefault = new C13934dbu().copydefault(str, str2, str3, (496 & 8) != 0 ? null : l, (496 & 16) != 0 ? null : str4, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.cYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<GasLimitBean>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData copydefault(ResponseData responseData) {
        GasLimitBean gasLimitBean;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getData() == null) {
            gasLimitBean = null;
        } else {
            WalletGasLimitRes walletGasLimitRes = (WalletGasLimitRes) responseData.getData();
            java.lang.String gas_limit = walletGasLimitRes != null ? walletGasLimitRes.getGas_limit() : null;
            WalletGasLimitRes walletGasLimitRes2 = (WalletGasLimitRes) responseData.getData();
            java.lang.String minGasLimit = walletGasLimitRes2 != null ? walletGasLimitRes2.getMinGasLimit() : null;
            WalletGasLimitRes walletGasLimitRes3 = (WalletGasLimitRes) responseData.getData();
            gasLimitBean = new GasLimitBean(gas_limit, minGasLimit, walletGasLimitRes3 != null ? walletGasLimitRes3.getMaxGasLimit() : null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), gasLimitBean, responseData.getError_code());
    }

    public static final ResponseData AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.api.bean.GasPriceBean>> */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<ResponseData<GasPriceBean>> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<GasPrice>> abstractC58185ywXAhwBna = new C13934dbu().AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.AEQbTJ((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAhwBna.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getData() != null) {
            GasPrice gasPrice = (GasPrice) responseData.getData();
            java.lang.String slow = gasPrice != null ? gasPrice.getSlow() : null;
            GasPrice gasPrice2 = (GasPrice) responseData.getData();
            java.lang.String average = gasPrice2 != null ? gasPrice2.getAverage() : null;
            GasPrice gasPrice3 = (GasPrice) responseData.getData();
            java.lang.String fast = gasPrice3 != null ? gasPrice3.getFast() : null;
            GasPrice gasPrice4 = (GasPrice) responseData.getData();
            java.lang.String slowCost = gasPrice4 != null ? gasPrice4.getSlowCost() : null;
            GasPrice gasPrice5 = (GasPrice) responseData.getData();
            java.lang.String averageCost = gasPrice5 != null ? gasPrice5.getAverageCost() : null;
            GasPrice gasPrice6 = (GasPrice) responseData.getData();
            java.lang.String fastCost = gasPrice6 != null ? gasPrice6.getFastCost() : null;
            GasPrice gasPrice7 = (GasPrice) responseData.getData();
            java.lang.String usdLow = gasPrice7 != null ? gasPrice7.getUsdLow() : null;
            GasPrice gasPrice8 = (GasPrice) responseData.getData();
            java.lang.String usdAverage = gasPrice8 != null ? gasPrice8.getUsdAverage() : null;
            GasPrice gasPrice9 = (GasPrice) responseData.getData();
            java.lang.String usdFast = gasPrice9 != null ? gasPrice9.getUsdFast() : null;
            GasPrice gasPrice10 = (GasPrice) responseData.getData();
            gasPriceBean = new GasPriceBean(slow, average, fast, slowCost, averageCost, fastCost, usdLow, usdAverage, usdFast, gasPrice10 != null ? gasPrice10.getGweiPrecision() : null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), gasPriceBean, responseData.getError_code());
    }

    public static final ResponseData fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.api.bean.GasPriceBean>> */
    @Override // o.InterfaceC9852bdR
    public AbstractC58185ywX<ResponseData<GasPriceBean>> KWHzl(long j) {
        AbstractC58185ywX<ResponseData<GasPrice>> abstractC58185ywXCopydefault = new C13934dbu().copydefault(j);
        final Function1 function1 = new Function1() { // from class: o.cYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.AhwBna((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.lang.Integer */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ResponseData AhwBna(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getData() != null) {
            GasPrice gasPrice = (GasPrice) responseData.getData();
            java.lang.String strConvertToBigDecimalString$default = C54862xYb.convertToBigDecimalString$default(gasPrice != null ? gasPrice.getSlow() : null, false, 1, null);
            GasPrice gasPrice2 = (GasPrice) responseData.getData();
            java.lang.String strConvertToBigDecimalString$default2 = C54862xYb.convertToBigDecimalString$default(gasPrice2 != null ? gasPrice2.getAverage() : null, false, 1, null);
            GasPrice gasPrice3 = (GasPrice) responseData.getData();
            java.lang.String strConvertToBigDecimalString$default3 = C54862xYb.convertToBigDecimalString$default(gasPrice3 != null ? gasPrice3.getFast() : null, false, 1, null);
            GasPrice gasPrice4 = (GasPrice) responseData.getData();
            java.lang.String slowCost = gasPrice4 != null ? gasPrice4.getSlowCost() : null;
            GasPrice gasPrice5 = (GasPrice) responseData.getData();
            java.lang.String averageCost = gasPrice5 != null ? gasPrice5.getAverageCost() : null;
            GasPrice gasPrice6 = (GasPrice) responseData.getData();
            java.lang.String fastCost = gasPrice6 != null ? gasPrice6.getFastCost() : null;
            GasPrice gasPrice7 = (GasPrice) responseData.getData();
            java.lang.String strConvertToBigDecimalString$default4 = C54862xYb.convertToBigDecimalString$default(gasPrice7 != null ? gasPrice7.getUsdLow() : null, false, 1, null);
            GasPrice gasPrice8 = (GasPrice) responseData.getData();
            java.lang.String strConvertToBigDecimalString$default5 = C54862xYb.convertToBigDecimalString$default(gasPrice8 != null ? gasPrice8.getUsdAverage() : null, false, 1, null);
            GasPrice gasPrice9 = (GasPrice) responseData.getData();
            java.lang.String strConvertToBigDecimalString$default6 = C54862xYb.convertToBigDecimalString$default(gasPrice9 != null ? gasPrice9.getUsdFast() : null, false, 1, null);
            GasPrice gasPrice10 = (GasPrice) responseData.getData();
            gasPriceBean = new GasPriceBean(strConvertToBigDecimalString$default, strConvertToBigDecimalString$default2, strConvertToBigDecimalString$default3, slowCost, averageCost, fastCost, strConvertToBigDecimalString$default4, strConvertToBigDecimalString$default5, strConvertToBigDecimalString$default6, gasPrice10 != null ? gasPrice10.getGweiPrecision() : null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), gasPriceBean, responseData.getError_code());
    }

    @Override // o.InterfaceC9852bdR
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54880xYt.formatValuationFromAsset$default(str, null, false, 0, false, 15, null);
    }

    @Override // o.InterfaceC9852bdR
    public OKWalletHiddenSmallAssetTokenModel OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        xWV xwv = (xWV) C43251rlk.copydefault(xWV.class);
        java.lang.String strAEQbTJ = xwv.AEQbTJ();
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C33129mqd.EZpvd("1"), false, 2, null, 5, null);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(strAEQbTJ.length() == 0 ? strConvertToString$default : C54862xYb.convertToString$default(C33129mqd.EZpvd(strAEQbTJ), false, 2, null, 5, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) objM7377constructorimpl;
        if (str != null && str.length() != 0) {
            strConvertToString$default = str;
        }
        return new OKWalletHiddenSmallAssetTokenModel(xwv.KWHzl(), strConvertToString$default);
    }

    public static final java.util.List DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.business.defi.api.bean.OKWalletCloseTokenModel>> */
    @Override // o.InterfaceC9852bdR
    public AbstractC58260yxt<java.util.List<OKWalletCloseTokenModel>> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.cYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11706cYe.copydefault((AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11706cYe.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List copydefault(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.List<C10854bwM> listIZzfmt = abstractC12782ctV.iZzfmt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listIZzfmt, 10));
        for (C10854bwM c10854bwM : listIZzfmt) {
            arrayList.add(new OKWalletCloseTokenModel(c10854bwM.fetchVPNInfo(), c10854bwM.OLrzqt()));
        }
        return arrayList;
    }
}
