package o;

import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfo;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.utxo.RSV;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C11010bzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12539cor extends AbstractC12521coY {
    public final java.lang.String AhwBna = "CancelTxBiz";
    public java.lang.String valueOf;

    @Override // o.AbstractC12413cmV
    public int AuCTel() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12413cmV
    public java.lang.String EZpvd() {
        return "0";
    }

    @Override // o.AbstractC12413cmV
    public int fIwbmz() {
        return 1;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String gEmmrt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12521coY
    public java.lang.String gHZMYf() {
        java.lang.String str = this.valueOf;
        return str == null ? "" : str;
    }

    @Override // o.AbstractC12413cmV
    public int values() {
        return 2;
    }

    public static final kotlin.Pair OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> getNewProxyInstance() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> newProxyInstance = super.getNewProxyInstance();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOcIXYQ = OcIXYQ();
        final Function2 function2 = new Function2() { // from class: o.coD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12539cor.AEQbTJ((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(newProxyInstance, abstractC58185ywXOcIXYQ, new InterfaceC58223yxI() { // from class: o.coO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12539cor.OLrzqt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair AEQbTJ(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OcIXYQ() {
        java.lang.String from;
        C13934dbu c13934dbuIwGUEr = iwGUEr();
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG == null || (from = evmSpeedUpInfoBeanFJNWhG.getFrom()) == null) {
            from = "";
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c13934dbuIwGUEr.copydefault(from, (java.lang.String) null, fARcdN(), (496 & 8) != 0 ? null : AYXKKw(), (496 & 16) != 0 ? null : null, (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.coK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.OLrzqt(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.coL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC12413cmV
    public java.lang.Long AYXKKw() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG != null) {
            return java.lang.Long.valueOf(evmSpeedUpInfoBeanFJNWhG.getMainCoinId());
        }
        return null;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String fARcdN() {
        java.lang.String from;
        if (DTwDnp()) {
            return "0x0000000000000000000000000000000000000000";
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (from = evmSpeedUpInfoBeanFJNWhG.getFrom()) == null) ? "" : from;
    }

    public final boolean DTwDnp() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG2 != null && evmSpeedUpInfoBeanFJNWhG2.getTxType() == 81) || ((evmSpeedUpInfoBeanFJNWhG = fJNWhG()) != null && evmSpeedUpInfoBeanFJNWhG.getTxType() == 82);
    }

    @Override // o.AbstractC12521coY
    public java.lang.String sSMYrx() {
        java.lang.String strMulS$default;
        EvmSignInfoGasPrice gasPrice;
        java.lang.String max;
        java.lang.String gasPrice2;
        EvmSignInfoGasPrice gasPrice3;
        EvmSignInfoGasPrice gasPrice4;
        java.lang.String normal;
        java.lang.String gasPrice5;
        EvmSignInfoGasPrice gasPrice6;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String gasPrice7 = evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasPrice() : null;
        EvmSignInfo evmSignInfoQfsBiF = QfsBiF();
        if (C33129mqd.gEmmrt(gasPrice7, (evmSignInfoQfsBiF == null || (gasPrice6 = evmSignInfoQfsBiF.getGasPrice()) == null) ? null : gasPrice6.getNormal())) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            java.lang.String str = (evmSpeedUpInfoBeanFJNWhG2 == null || (gasPrice5 = evmSpeedUpInfoBeanFJNWhG2.getGasPrice()) == null) ? "" : gasPrice5;
            EvmSignInfo evmSignInfoQfsBiF2 = QfsBiF();
            strMulS$default = AbstractC12521coY.checkGasThreshold$default(this, str, (evmSignInfoQfsBiF2 == null || (gasPrice4 = evmSignInfoQfsBiF2.getGasPrice()) == null || (normal = gasPrice4.getNormal()) == null) ? "" : normal, null, 4, null);
        } else {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
            java.lang.String gasPrice8 = evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getGasPrice() : null;
            EvmSignInfo evmSignInfoQfsBiF3 = QfsBiF();
            if (C33129mqd.gEmmrt(gasPrice8, (evmSignInfoQfsBiF3 == null || (gasPrice3 = evmSignInfoQfsBiF3.getGasPrice()) == null) ? null : gasPrice3.getMax())) {
                EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG4 = fJNWhG();
                java.lang.String str2 = (evmSpeedUpInfoBeanFJNWhG4 == null || (gasPrice2 = evmSpeedUpInfoBeanFJNWhG4.getGasPrice()) == null) ? "" : gasPrice2;
                EvmSignInfo evmSignInfoQfsBiF4 = QfsBiF();
                strMulS$default = AbstractC12521coY.checkGasThreshold$default(this, str2, (evmSignInfoQfsBiF4 == null || (gasPrice = evmSignInfoQfsBiF4.getGasPrice()) == null || (max = gasPrice.getMax()) == null) ? "" : max, null, 4, null);
            } else {
                EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG5 = fJNWhG();
                strMulS$default = C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG5 != null ? evmSpeedUpInfoBeanFJNWhG5.getGasPrice() : null, java.lang.Double.valueOf(1.2d), null, null, null, 14, null);
            }
        }
        if (!RcXXUw()) {
            return strMulS$default;
        }
        java.lang.String strZuBGHE = zuBGHE();
        if (!C33129mqd.gEmmrt(strMulS$default, strZuBGHE)) {
            return strMulS$default;
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG6 = fJNWhG();
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(strMulS$default, C54862xYb.AEQbTJ(strZuBGHE, evmSpeedUpInfoBeanFJNWhG6 != null ? evmSpeedUpInfoBeanFJNWhG6.getPriorityFee() : null)), false, null, null, 7, null);
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AwvSrB() {
        java.lang.String gasLimit;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (gasLimit = evmSpeedUpInfoBeanFJNWhG.getGasLimit()) == null) ? "" : gasLimit;
    }

    public java.lang.String zuBGHE() {
        EvmSignInfoGasPrice gasPrice;
        java.lang.String fastPriorityFee;
        java.lang.String priorityFee;
        EvmSignInfoGasPrice gasPrice2;
        EvmSignInfoGasPrice gasPrice3;
        java.lang.String proposePriorityFee;
        java.lang.String priorityFee2;
        EvmSignInfoGasPrice gasPrice4;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String priorityFee3 = evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getPriorityFee() : null;
        EvmSignInfo evmSignInfoQfsBiF = QfsBiF();
        if (C33129mqd.gEmmrt(priorityFee3, (evmSignInfoQfsBiF == null || (gasPrice4 = evmSignInfoQfsBiF.getGasPrice()) == null) ? null : gasPrice4.getProposePriorityFee())) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            java.lang.String str = (evmSpeedUpInfoBeanFJNWhG2 == null || (priorityFee2 = evmSpeedUpInfoBeanFJNWhG2.getPriorityFee()) == null) ? "" : priorityFee2;
            EvmSignInfo evmSignInfoQfsBiF2 = QfsBiF();
            return AbstractC12521coY.checkGasThreshold$default(this, str, (evmSignInfoQfsBiF2 == null || (gasPrice3 = evmSignInfoQfsBiF2.getGasPrice()) == null || (proposePriorityFee = gasPrice3.getProposePriorityFee()) == null) ? "" : proposePriorityFee, null, 4, null);
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        java.lang.String priorityFee4 = evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getPriorityFee() : null;
        EvmSignInfo evmSignInfoQfsBiF3 = QfsBiF();
        if (C33129mqd.gEmmrt(priorityFee4, (evmSignInfoQfsBiF3 == null || (gasPrice2 = evmSignInfoQfsBiF3.getGasPrice()) == null) ? null : gasPrice2.getFastPriorityFee())) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG4 = fJNWhG();
            java.lang.String str2 = (evmSpeedUpInfoBeanFJNWhG4 == null || (priorityFee = evmSpeedUpInfoBeanFJNWhG4.getPriorityFee()) == null) ? "" : priorityFee;
            EvmSignInfo evmSignInfoQfsBiF4 = QfsBiF();
            return AbstractC12521coY.checkGasThreshold$default(this, str2, (evmSignInfoQfsBiF4 == null || (gasPrice = evmSignInfoQfsBiF4.getGasPrice()) == null || (fastPriorityFee = gasPrice.getFastPriorityFee()) == null) ? "" : fastPriorityFee, null, 4, null);
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG5 = fJNWhG();
        return C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG5 != null ? evmSpeedUpInfoBeanFJNWhG5.getPriorityFee() : null, java.lang.Double.valueOf(1.2d), null, null, null, 14, null);
    }

    /* JADX DEBUG: Type inference failed for r1v15. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    /* JADX DEBUG: Type inference failed for r1v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    /* JADX DEBUG: Type inference failed for r1v9. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> KWHzl(@NotNull final java.lang.String str, java.lang.String str2, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        AbstractC12782ctV abstractC12782ctVDbNXlk = DbNXlk();
        if (abstractC12782ctVDbNXlk == null) {
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (abstractC12782ctVDbNXlk.AxsJAY()) {
            if (str2 == null || str2.length() == 0) {
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5013, null, null, null, null, null, 62, null));
                Intrinsics.copydefault(abstractC58185ywXKWHzl2);
                return abstractC58185ywXKWHzl2;
            }
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(-5001, str2));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return KWHzl(abstractC58185ywXKWHzl3);
        }
        if (abstractC12782ctVDbNXlk.zuBGHE()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAxsJAY = AxsJAY();
            final Function1 function1 = new Function1() { // from class: o.coT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12539cor.AYXKKw(this.KWHzl, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXAxsJAY.KWHzl(new InterfaceC58229yxO() { // from class: o.cox
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12539cor.OcIXYQ(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
            return abstractC58185ywXKWHzl4;
        }
        if (abstractC12782ctVDbNXlk.gHZMYf()) {
            C10854bwM c10854bwMOLrzqt = OLrzqt();
            if (c10854bwMOLrzqt == null) {
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl5 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl5, "");
                return abstractC58185ywXKWHzl5;
            }
            LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
            ChainAddress chainAddressHDKMBd = hDKMBd();
            if (chainAddressHDKMBd != null) {
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl6 = ledgerSignHelper.KWHzl(new LedgerSignHelper.StateListAnimator(c10854bwMOLrzqt, chainAddressHDKMBd, false, QUSxYX(), RJOkX(), AuCTelauCTel()));
                final Function1 function12 = new Function1() { // from class: o.coy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C12539cor.gEmmrt(this.KWHzl, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXKWHzl7 = abstractC58185ywXKWHzl6.KWHzl(new InterfaceC58229yxO() { // from class: o.coz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C12539cor.QKVWgx(function12, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl7, "");
                return abstractC58185ywXKWHzl7;
            }
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl8 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl8, "");
            return abstractC58185ywXKWHzl8;
        }
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        if (abstractC12782ctVEjfBZ != null && abstractC12782ctVEjfBZ.ORxRYg()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = copydefault(str);
            final Function1 function13 = new Function1() { // from class: o.cov
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12539cor.AhwBna(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl9 = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.cow
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12539cor.sSMYrx(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl9, "");
            return abstractC58185ywXKWHzl9;
        }
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
        final Function1 function14 = new Function1() { // from class: o.coE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.KWHzl((PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.coC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.zuBGHE(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.coB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.KWHzl(this.OLrzqt, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.coA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.AxsJAY(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: o.coU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.EZpvd(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.coq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.DTwDnp(function16, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return KWHzl(abstractC58185ywXEZpvd);
    }

    public static final InterfaceC60096zvd OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AYXKKw(C12539cor c12539cor, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12539cor.KWHzl(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd gEmmrt(C12539cor c12539cor, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12539cor.KWHzl(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(C12539cor c12539cor, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12539cor.KWHzl(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final java.lang.Integer zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer KWHzl(PasswordCheckResult passwordCheckResult) {
        int i;
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            i = -5001;
        } else {
            i = passwordCheckResult.isLocked() ? -5003 : -5002;
        }
        return java.lang.Integer.valueOf(i);
    }

    public static final InterfaceC58261yxu AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C12539cor c12539cor, java.lang.String str, final java.lang.Integer num) {
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == -5001) {
            AbstractC12782ctV abstractC12782ctVDbNXlk = c12539cor.DbNXlk();
            if (abstractC12782ctVDbNXlk != null) {
                if (abstractC12782ctVDbNXlk.AubY()) {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtValues = abstractC12782ctVDbNXlk.values(str);
                    final Function1 function1 = new Function1() { // from class: o.coI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C12539cor.OLrzqt(num, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.coH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C12539cor.gHZMYf(function1, obj);
                        }
                    });
                } else {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtEjfBZ = abstractC12782ctVDbNXlk.ejfBZ(str);
                    final Function1 function12 = new Function1() { // from class: o.coG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C12539cor.EZpvd(num, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.coP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C12539cor.AwvSrB(function12, obj);
                        }
                    });
                }
                if (interfaceC58261yxuCopydefault != null) {
                    return interfaceC58261yxuCopydefault;
                }
            }
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5004, new java.lang.String[]{""}));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(num, new java.lang.String[]{""}));
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, new java.lang.String[]{str, ""});
    }

    public static final kotlin.Pair AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, new java.lang.String[]{"", str});
    }

    public static final kotlin.Pair DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C12539cor c12539cor, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Integer num = (java.lang.Integer) pair.getFirst();
        if (num != null && num.intValue() == -5001) {
            if (((java.lang.Object[]) pair.getSecond()).length == 2) {
                C10854bwM c10854bwMOLrzqt = c12539cor.OLrzqt();
                long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L;
                C10854bwM c10854bwMOLrzqt2 = c12539cor.OLrzqt();
                long jFetchVPNInfo = c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.fetchVPNInfo() : -1L;
                java.lang.String str = ((java.lang.String[]) pair.getSecond())[1];
                java.lang.String str2 = ((java.lang.String[]) pair.getSecond())[0];
                AbstractC12782ctV abstractC12782ctVEjfBZ = c12539cor.ejfBZ();
                return C56390yDp.OLrzqt(pair.getFirst(), xYZ.KWHzl.OLrzqt(new SignParams(jQKVWgx, jFetchVPNInfo, null, str, str2, abstractC12782ctVEjfBZ != null ? java.lang.Integer.valueOf(abstractC12782ctVEjfBZ.finit()) : null, 0, null, false, false, null, 1988, null), c12539cor.zsXlph()));
            }
            return C56390yDp.OLrzqt(-5004, "");
        }
        return C56390yDp.OLrzqt(pair.getFirst(), "");
    }

    public BaseAccountTransaction zsXlph() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return new AccountTransaction(fARcdN(), C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), null, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), RJOkX(), gEmmrt());
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AuCTelauCTel() {
        xYZ xyz = xYZ.KWHzl;
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : 0L;
        C10854bwM c10854bwMOLrzqt2 = OLrzqt();
        return xyz.AEQbTJ(jQKVWgx, c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.fetchVPNInfo() : 0L, null, zsXlph());
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AxsJAY() {
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        if (c10854bwMOLrzqt == null) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        OneKeySignHelper oneKeySignHelper = OneKeySignHelper.copydefault;
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        ChainAddress chainAddressHDKMBd = hDKMBd();
        if (chainAddressHDKMBd != null) {
            return oneKeySignHelper.KWHzl(abstractC12782ctVEjfBZ, chainAddressHDKMBd, new EvmTransactionData(QUSxYX(), c10854bwMOLrzqt.QKVWgx(), RJOkX(), AuCTelauCTel(), zsXlph(), null));
        }
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    public final AbstractC58185ywX<ResponseData<DappTxResultBean>> KWHzl(AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.cou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.KWHzl(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58229yxO() { // from class: o.cot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(C12539cor c12539cor, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() == -5001) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) pair.getSecond();
            if (charSequence == null || charSequence.length() == 0) {
                return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, new DappTxResultBean("", "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), null, 46, null));
            }
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = c12539cor.fJNWhG();
            java.math.BigInteger bigIntegerKWHzl = C33129mqd.KWHzl(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null);
            java.math.BigInteger bigIntegerKWHzl2 = C33129mqd.KWHzl(c12539cor.gHZMYf());
            java.math.BigInteger bigIntegerKWHzl3 = C33129mqd.KWHzl(c12539cor.sSMYrx());
            java.math.BigInteger bigIntegerKWHzl4 = C33129mqd.KWHzl(c12539cor.zuBGHE());
            int iValues = c12539cor.values();
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = c12539cor.fJNWhG();
            java.lang.String txHash = evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getTxHash() : null;
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = c12539cor.fJNWhG();
            ExtJson extJson = new ExtJson(bigIntegerKWHzl, bigIntegerKWHzl2, bigIntegerKWHzl3, bigIntegerKWHzl4, 18, iValues, (java.lang.String) null, txHash, evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getOkexAccount() : null, (java.lang.String) null);
            xYW xyw = xYW.AEQbTJ;
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            C10854bwM c10854bwMAkhnZx = c12539cor.AkhnZx();
            final java.lang.String strAEQbTJ = xyw.AEQbTJ(str, c10854bwMAkhnZx != null ? c10854bwMAkhnZx.fetchVPNInfo() : 0L);
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String strCopydefault = c12539cor.copydefault();
            java.lang.String json = new Gson().toJson(extJson);
            Intrinsics.checkNotNullExpressionValue(json, "");
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = c12539cor.OLrzqt(str3, strAEQbTJ, strCopydefault, json, null, null);
            final Function1 function1 = new Function1() { // from class: o.coM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12539cor.OLrzqt(pair, strAEQbTJ, (ResponseData) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.coR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12539cor.zsXlph(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(((java.lang.Number) pair.getFirst()).intValue(), null, null, null, new DappTxResultBean((java.lang.String) pair.getSecond(), "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), null, 46, null));
    }

    public static final ResponseData zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(kotlin.Pair pair, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean((java.lang.String) pair.getSecond(), (java.lang.String) responseData.getData(), str, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), null, 44, null);
    }

    /* JADX DEBUG: Type inference failed for r0v16. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(final java.lang.String str) {
        final C10854bwM c10854bwMAkhnZx = AkhnZx();
        if (c10854bwMAkhnZx == null) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final long jQKVWgx = c10854bwMAkhnZx.QKVWgx();
        long jFetchVPNInfo = c10854bwMAkhnZx.fetchVPNInfo();
        C8379bBc c8379bBc = C8379bBc.AEQbTJ;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        final TxMessage txMessageCopydefault = c8379bBc.copydefault(jQKVWgx, jFetchVPNInfo, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), fARcdN(), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 128) != 0 ? 0 : QUSxYX(), (2048 & 256) != 0 ? null : C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 512) != 0 ? null : C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 1024) != 0 ? null : RJOkX(), (2048 & 2048) != 0 ? null : null);
        if (txMessageCopydefault == null || !txMessageCopydefault.isValid()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.coQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.AEQbTJ(str, this, txMessageCopydefault, c10854bwMAkhnZx, jQKVWgx, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.coS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.AuCTelauCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(java.lang.String str, final C12539cor c12539cor, final TxMessage txMessage, C10854bwM c10854bwM, final long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC12782ctV abstractC12782ctVEjfBZ = c12539cor.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctVEjfBZ.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
        C10965byR c10965byR = C10965byR.OLrzqt;
        java.lang.String message = txMessage.getMessage();
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = c12539cor.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ2);
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c10965byR.copydefault(message, c10854bwM, mpcWalletDecodeInfoOLrzqt, abstractC12782ctVEjfBZ2.finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.coF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12539cor.AEQbTJ(this.AEQbTJ, j, txMessage, (java.lang.String) obj);
            }
        };
        return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.coJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12539cor.AubY(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
    }

    public static final ResponseData AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(C12539cor c12539cor, long j, TxMessage txMessage, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        RSV rsv = (RSV) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str));
        if (rsv == null) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.String strOLrzqt = C8379bBc.AEQbTJ.OLrzqt(c12539cor.QUSxYX(), j, c12539cor.RJOkX(), txMessage.getTx(), rsv.getR(), rsv.getS(), rsv.getV());
        if (strOLrzqt.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
    }

    public static final kotlin.Pair OLrzqt(C12539cor c12539cor, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            WalletGasLimitRes walletGasLimitRes = (WalletGasLimitRes) responseData.getData();
            c12539cor.valueOf = walletGasLimitRes != null ? walletGasLimitRes.getGas_limit() : null;
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
