package o;

import androidx.fragment.app.FragmentActivity;
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
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.AccountTokenTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C11010bzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.coW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12519coW extends AbstractC12521coY {
    public java.lang.String fetchVPNInfo;
    public final java.lang.String AhwBna = "SpeedUpTxBiz";
    public java.lang.String valueOf = EIP1271Verifier.hexPrefix;

    @Override // o.AbstractC12413cmV
    public int values() {
        return 1;
    }

    public static final kotlin.Pair sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> getNewProxyInstance() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> newProxyInstance = super.getNewProxyInstance();
        final Function1 function1 = new Function1() { // from class: o.cpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.copydefault((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = newProxyInstance.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.sSMYrx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.AxsJAY(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond());
    }

    public static final InterfaceC60096zvd AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C12519coW c12519coW, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c12519coW.dNCPSb();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dNCPSb() {
        java.lang.String from;
        C13934dbu c13934dbuIwGUEr = iwGUEr();
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG == null || (from = evmSpeedUpInfoBeanFJNWhG.getFrom()) == null) {
            from = "";
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c13934dbuIwGUEr.copydefault(from, QbewEr(), aKErDB(), (496 & 8) != 0 ? null : AYXKKw(), (496 & 16) != 0 ? null : C54862xYb.convertToBigIntegerString$default(EZpvd(), true, (RoundingMode) null, 2, (java.lang.Object) null), (496 & 32) != 0, (java.util.List<EVMAuthorization>) ((496 & 64) != 0 ? null : null), (496 & 128) != 0 ? null : null, (java.util.List<EVMStateOverride>) ((496 & 256) != 0 ? null : null));
        final Function1 function1 = new Function1() { // from class: o.cpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.EZpvd(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cpu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.gHZMYf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC12413cmV
    public java.lang.Long AYXKKw() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG != null) {
            return java.lang.Long.valueOf(evmSpeedUpInfoBeanFJNWhG.getCoinId());
        }
        return null;
    }

    @Override // o.AbstractC12521coY
    public java.lang.String sSMYrx() {
        java.lang.String strMulS$default;
        EvmSignInfoGasPrice gasPrice;
        java.lang.String max;
        java.lang.String gasPrice2;
        EvmSignInfoGasPrice gasPrice3;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String gasPrice4 = evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasPrice() : null;
        EvmSignInfo evmSignInfoQfsBiF = QfsBiF();
        if (C33129mqd.gEmmrt(gasPrice4, (evmSignInfoQfsBiF == null || (gasPrice3 = evmSignInfoQfsBiF.getGasPrice()) == null) ? null : gasPrice3.getMax())) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            java.lang.String str = (evmSpeedUpInfoBeanFJNWhG2 == null || (gasPrice2 = evmSpeedUpInfoBeanFJNWhG2.getGasPrice()) == null) ? "" : gasPrice2;
            EvmSignInfo evmSignInfoQfsBiF2 = QfsBiF();
            strMulS$default = AbstractC12521coY.checkGasThreshold$default(this, str, (evmSignInfoQfsBiF2 == null || (gasPrice = evmSignInfoQfsBiF2.getGasPrice()) == null || (max = gasPrice.getMax()) == null) ? "" : max, null, 4, null);
        } else {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
            strMulS$default = C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getGasPrice() : null, java.lang.Double.valueOf(1.2d), null, null, null, 14, null);
        }
        if (!RcXXUw()) {
            return strMulS$default;
        }
        java.lang.String strZuBGHE = zuBGHE();
        if (!C33129mqd.gEmmrt(strMulS$default, strZuBGHE)) {
            return strMulS$default;
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG4 = fJNWhG();
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(strMulS$default, C54862xYb.AEQbTJ(strZuBGHE, evmSpeedUpInfoBeanFJNWhG4 != null ? evmSpeedUpInfoBeanFJNWhG4.getPriorityFee() : null)), false, null, null, 7, null);
    }

    public java.lang.String zuBGHE() {
        EvmSignInfoGasPrice gasPrice;
        java.lang.String fastPriorityFee;
        java.lang.String priorityFee;
        EvmSignInfoGasPrice gasPrice2;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String priorityFee2 = evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getPriorityFee() : null;
        EvmSignInfo evmSignInfoQfsBiF = QfsBiF();
        if (C33129mqd.gEmmrt(priorityFee2, (evmSignInfoQfsBiF == null || (gasPrice2 = evmSignInfoQfsBiF.getGasPrice()) == null) ? null : gasPrice2.getFastPriorityFee())) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            java.lang.String str = (evmSpeedUpInfoBeanFJNWhG2 == null || (priorityFee = evmSpeedUpInfoBeanFJNWhG2.getPriorityFee()) == null) ? "" : priorityFee;
            EvmSignInfo evmSignInfoQfsBiF2 = QfsBiF();
            return AbstractC12521coY.checkGasThreshold$default(this, str, (evmSignInfoQfsBiF2 == null || (gasPrice = evmSignInfoQfsBiF2.getGasPrice()) == null || (fastPriorityFee = gasPrice.getFastPriorityFee()) == null) ? "" : fastPriorityFee, null, 4, null);
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        return C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getPriorityFee() : null, java.lang.Double.valueOf(1.2d), null, null, null, 14, null);
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AwvSrB() {
        java.lang.String gasLimit;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (gasLimit = evmSpeedUpInfoBeanFJNWhG.getGasLimit()) == null) ? "" : gasLimit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @Override // o.AbstractC12521coY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String gHZMYf() {
        java.lang.String gasLimit;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.fetchVPNInfo)) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
            if (C33129mqd.gEmmrt(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasLimit() : null, this.fetchVPNInfo) && !QVAiDq()) {
                java.lang.String str = this.fetchVPNInfo;
                if (str != null) {
                    return str;
                }
            }
        } else {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            if (evmSpeedUpInfoBeanFJNWhG2 != null && (gasLimit = evmSpeedUpInfoBeanFJNWhG2.getGasLimit()) != null) {
                return gasLimit;
            }
        }
        return "";
    }

    public final boolean djSkpj() {
        return !AubY();
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String gEmmrt() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG != null) {
            return evmSpeedUpInfoBeanFJNWhG.getInputData();
        }
        return null;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String EZpvd() {
        java.lang.String coinAmount;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (coinAmount = evmSpeedUpInfoBeanFJNWhG.getCoinAmount()) == null) ? "" : coinAmount;
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String fARcdN() {
        java.lang.String to;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (to = evmSpeedUpInfoBeanFJNWhG.getTo()) == null) ? "" : to;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // o.AbstractC12521coY, o.AbstractC12413cmV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull SignInfo signInfo) {
        java.lang.String facetBlackHoleAddress;
        Intrinsics.checkNotNullParameter(signInfo, "");
        super.copydefault(signInfo);
        EvmSignInfo evmSignInfoQfsBiF = QfsBiF();
        if (evmSignInfoQfsBiF == null || !Intrinsics.EZpvd(evmSignInfoQfsBiF.isFacet(), java.lang.Boolean.TRUE)) {
            facetBlackHoleAddress = EIP1271Verifier.hexPrefix;
        } else {
            EvmSignInfo evmSignInfoQfsBiF2 = QfsBiF();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (evmSignInfoQfsBiF2 != null ? evmSignInfoQfsBiF2.getFacetBlackHoleAddress() : null))) {
                EvmSignInfo evmSignInfoQfsBiF3 = QfsBiF();
                facetBlackHoleAddress = evmSignInfoQfsBiF3 != null ? evmSignInfoQfsBiF3.getFacetBlackHoleAddress() : null;
                Intrinsics.copydefault((java.lang.Object) facetBlackHoleAddress);
            }
        }
        this.valueOf = facetBlackHoleAddress;
    }

    public final java.lang.String DTwDnp() {
        C10854bwM c10854bwMDjBIcL;
        return (AubY() && (c10854bwMDjBIcL = djBIcL()) != null && c10854bwMDjBIcL.QHmsKR()) ? this.valueOf : fARcdN();
    }

    public final java.lang.String aKErDB() {
        java.lang.String strOLrzqt;
        C10854bwM c10854bwMDjBIcL;
        if (AubY() && (c10854bwMDjBIcL = djBIcL()) != null && c10854bwMDjBIcL.QHmsKR()) {
            return this.valueOf;
        }
        C10854bwM c10854bwMDjBIcL2 = djBIcL();
        if (c10854bwMDjBIcL2 != null && c10854bwMDjBIcL2.DCUTEIddSDPG()) {
            C10854bwM c10854bwMDjBIcL3 = djBIcL();
            return (c10854bwMDjBIcL3 == null || (strOLrzqt = c10854bwMDjBIcL3.OLrzqt()) == null) ? "" : strOLrzqt;
        }
        return fARcdN();
    }

    @Override // o.AbstractC12413cmV
    public int AuCTel() {
        return AubY() ? 5 : 3;
    }

    /* JADX DEBUG: Type inference failed for r1v13. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
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
        C10854bwM c10854bwMAkhnZx = AkhnZx();
        if (c10854bwMAkhnZx == null) {
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        if (abstractC12782ctVDbNXlk.AxsJAY()) {
            if (str2 == null || str2.length() == 0) {
                AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5013, null, null, null, null, null, 62, null));
                Intrinsics.copydefault(abstractC58185ywXKWHzl3);
                return abstractC58185ywXKWHzl3;
            }
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(-5001, str2));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
            return EZpvd(abstractC58185ywXKWHzl4);
        }
        if (abstractC12782ctVDbNXlk.zuBGHE()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXUeEOUB = UeEOUB();
            final Function1 function1 = new Function1() { // from class: o.cph
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12519coW.AYXKKw(this.KWHzl, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl5 = abstractC58185ywXUeEOUB.KWHzl(new InterfaceC58229yxO() { // from class: o.cpf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12519coW.QUSxYX(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl5, "");
            return abstractC58185ywXKWHzl5;
        }
        if (abstractC12782ctVDbNXlk.gHZMYf()) {
            LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
            ChainAddress chainAddressHDKMBd = hDKMBd();
            if (chainAddressHDKMBd != null) {
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl6 = ledgerSignHelper.KWHzl(new LedgerSignHelper.StateListAnimator(c10854bwMAkhnZx, chainAddressHDKMBd, false, QUSxYX(), RJOkX(), AuCTelauCTel()));
                final Function1 function12 = new Function1() { // from class: o.cpi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C12519coW.AhwBna(this.KWHzl, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXKWHzl7 = abstractC58185ywXKWHzl6.KWHzl(new InterfaceC58229yxO() { // from class: o.cpn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C12519coW.RJOkX(function12, obj);
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
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl9 = KWHzl(str);
            final Function1 function13 = new Function1() { // from class: o.cpk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12519coW.djBIcL(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl10 = abstractC58185ywXKWHzl9.KWHzl(new InterfaceC58229yxO() { // from class: o.cpm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12519coW.DTwDnp(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl10, "");
            return abstractC58185ywXKWHzl10;
        }
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
        final Function1 function14 = new Function1() { // from class: o.cpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.AEQbTJ((PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.QOLQEE(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.cpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.AEQbTJ(this.EZpvd, str, ((java.lang.Integer) obj).intValue());
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.QbewEr(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: o.cpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.AhwBna(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.cpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.QVAiDq(function16, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return EZpvd(abstractC58185ywXEZpvd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AYXKKw(C12519coW c12519coW, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12519coW.EZpvd(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(C12519coW c12519coW, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12519coW.EZpvd(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(C12519coW c12519coW, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12519coW.EZpvd(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final java.lang.Integer QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer AEQbTJ(PasswordCheckResult passwordCheckResult) {
        int i;
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            i = -5001;
        } else {
            i = passwordCheckResult.isLocked() ? -5003 : -5002;
        }
        return java.lang.Integer.valueOf(i);
    }

    public static final InterfaceC58261yxu QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C12519coW c12519coW, java.lang.String str, final int i) {
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        if (i == -5001) {
            AbstractC12782ctV abstractC12782ctVDbNXlk = c12519coW.DbNXlk();
            if (abstractC12782ctVDbNXlk != null) {
                if (abstractC12782ctVDbNXlk.AubY()) {
                    if (c12519coW.AubY()) {
                        AbstractC58260yxt<java.lang.String> abstractC58260yxtValues = abstractC12782ctVDbNXlk.values(str);
                        final Function1 function1 = new Function1() { // from class: o.coV
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C12519coW.AEQbTJ(i, (java.lang.String) obj);
                            }
                        };
                        interfaceC58261yxuCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.cpd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C12519coW.ORxRYg(function1, obj);
                            }
                        });
                    } else if (c12519coW.djSkpj()) {
                        C10854bwM c10854bwMAkhnZx = c12519coW.AkhnZx();
                        AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default(abstractC12782ctVDbNXlk, str, c10854bwMAkhnZx != null ? c10854bwMAkhnZx.AEQbTJ() : -1L, 0, 4, null);
                        final Function1 function12 = new Function1() { // from class: o.cpo
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C12519coW.EZpvd(i, (java.lang.String) obj);
                            }
                        };
                        interfaceC58261yxuCopydefault = abstractC58260yxtPrivateKeyForChainId$default.copydefault(new InterfaceC58229yxO() { // from class: o.cpy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C12519coW.QKVWgx(function12, obj);
                            }
                        });
                    } else {
                        interfaceC58261yxuCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5004, new java.lang.String[]{""}));
                    }
                } else {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtEjfBZ = abstractC12782ctVDbNXlk.ejfBZ(str);
                    final Function1 function13 = new Function1() { // from class: o.cpB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C12519coW.AYXKKw(i, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.cpA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C12519coW.OcIXYQ(function13, obj);
                        }
                    });
                }
                if (interfaceC58261yxuCopydefault != null) {
                    return interfaceC58261yxuCopydefault;
                }
            }
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{""}));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{""}));
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{str, ""});
    }

    public static final kotlin.Pair QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{"", str});
    }

    public static final kotlin.Pair OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AYXKKw(int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{"", str});
    }

    public static final kotlin.Pair QVAiDq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AhwBna(C12519coW c12519coW, kotlin.Pair pair) {
        java.lang.String strSubstring;
        C10854bwM c10854bwMDjBIcL;
        C10854bwM c10854bwMDjBIcL2;
        java.lang.String strEZpvd = "";
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Integer num = (java.lang.Integer) pair.getFirst();
        if (num != null && num.intValue() == -5001) {
            if (((java.lang.Object[]) pair.getSecond()).length == 2) {
                java.lang.Object first = pair.getFirst();
                if (c12519coW.AubY()) {
                    C10854bwM c10854bwMOLrzqt = c12519coW.OLrzqt();
                    long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L;
                    C10854bwM c10854bwMOLrzqt2 = c12519coW.OLrzqt();
                    long jFetchVPNInfo = c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.fetchVPNInfo() : -1L;
                    C10854bwM c10854bwMDjBIcL3 = c12519coW.djBIcL();
                    java.lang.String strFJNWhG = ((c10854bwMDjBIcL3 == null || !c10854bwMDjBIcL3.AuCTel()) && ((c10854bwMDjBIcL = c12519coW.djBIcL()) == null || !c10854bwMDjBIcL.QHmsKR()) && (c10854bwMDjBIcL2 = c12519coW.djBIcL()) != null) ? c10854bwMDjBIcL2.fJNWhG() : null;
                    java.lang.String str = ((java.lang.String[]) pair.getSecond())[1];
                    java.lang.String str2 = ((java.lang.String[]) pair.getSecond())[0];
                    AbstractC12782ctV abstractC12782ctVEjfBZ = c12519coW.ejfBZ();
                    strEZpvd = xYZ.KWHzl.OLrzqt(new SignParams(jQKVWgx, jFetchVPNInfo, strFJNWhG, str, str2, abstractC12782ctVEjfBZ != null ? java.lang.Integer.valueOf(abstractC12782ctVEjfBZ.finit()) : null, 0, null, false, false, null, 1984, null), c12519coW.zsXlph());
                } else if (c12519coW.djSkpj()) {
                    if (C59449zhJ.startsWith$default(((java.lang.String[]) pair.getSecond())[1], EIP1271Verifier.hexPrefix, false, 2, null)) {
                        strSubstring = ((java.lang.String[]) pair.getSecond())[1].substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    } else {
                        strSubstring = ((java.lang.String[]) pair.getSecond())[1];
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strSubstring)) {
                        strEZpvd = xYZ.KWHzl.EZpvd(strSubstring, C33129mqd.valueOf(c12519coW.RJOkX()), c12519coW.OcIXYQ());
                    }
                }
                return C56390yDp.OLrzqt(first, strEZpvd);
            }
            return C56390yDp.OLrzqt(pair.getFirst(), "");
        }
        return C56390yDp.OLrzqt(pair.getFirst(), "");
    }

    public BaseAccountTransaction zsXlph() {
        java.lang.String from;
        java.lang.String strOLrzqt;
        if (wlaJM()) {
            java.lang.String strDTwDnp = DTwDnp();
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
            return new AccountTransaction(strDTwDnp, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), null, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), RJOkX(), AxsJAY());
        }
        C10854bwM c10854bwMDjBIcL = djBIcL();
        if (c10854bwMDjBIcL != null && c10854bwMDjBIcL.QHmsKR()) {
            java.lang.String strDTwDnp2 = DTwDnp();
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            return new AccountTransaction(strDTwDnp2, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), "0", null, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), RJOkX(), AxsJAY());
        }
        java.lang.String strDTwDnp3 = DTwDnp();
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        C10854bwM c10854bwMDjBIcL2 = djBIcL();
        java.lang.String strConvertToBigIntegerString$default2 = (c10854bwMDjBIcL2 == null || !Intrinsics.EZpvd(c10854bwMDjBIcL2.WS(), java.lang.Boolean.TRUE)) ? "0" : C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        C10854bwM c10854bwMDjBIcL3 = djBIcL();
        java.lang.String str = (c10854bwMDjBIcL3 == null || (strOLrzqt = c10854bwMDjBIcL3.OLrzqt()) == null) ? "" : strOLrzqt;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG4 = fJNWhG();
        return new AccountTokenTransaction(strDTwDnp3, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strConvertToBigIntegerString$default2, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), RJOkX(), AxsJAY(), str, C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), (evmSpeedUpInfoBeanFJNWhG4 == null || (from = evmSpeedUpInfoBeanFJNWhG4.getFrom()) == null) ? "" : from);
    }

    public final SigData OcIXYQ() {
        java.lang.String nonce;
        java.lang.String strDTwDnp = DTwDnp();
        java.lang.String strCopydefault = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strGEmmrt = gEmmrt();
        java.lang.String str = "";
        java.lang.String str2 = strGEmmrt == null ? "" : strGEmmrt;
        java.lang.String strCopydefault2 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault3 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG != null && (nonce = evmSpeedUpInfoBeanFJNWhG.getNonce()) != null) {
            str = nonce;
        }
        return new SigData(strDTwDnp, strCopydefault, str2, strCopydefault2, strCopydefault3, C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null)), C33491mxU.copydefault(java.lang.String.valueOf(QUSxYX())), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null)), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null)), (java.util.List) null, 512, (DefaultConstructorMarker) null);
    }

    private final AbstractC58185ywX<ResponseData<java.lang.String>> UeEOUB() {
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

    public final java.lang.String AxsJAY() {
        C10854bwM c10854bwMDjBIcL;
        C10854bwM c10854bwMDjBIcL2;
        if (AubY() && (c10854bwMDjBIcL = djBIcL()) != null && c10854bwMDjBIcL.DCUTEIddSDPG() && ((c10854bwMDjBIcL2 = djBIcL()) == null || !c10854bwMDjBIcL2.QHmsKR())) {
            java.lang.String strCopydefault = xYW.AEQbTJ.copydefault(DTwDnp(), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null));
            if (C59449zhJ.AYXKKw(strCopydefault, EIP1271Verifier.hexPrefix, true)) {
                return strCopydefault;
            }
            return EIP1271Verifier.hexPrefix + strCopydefault;
        }
        return gEmmrt();
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AuCTelauCTel() {
        C10854bwM c10854bwMDjBIcL;
        C10854bwM c10854bwMDjBIcL2;
        if (AubY()) {
            xYZ xyz = xYZ.KWHzl;
            C10854bwM c10854bwMOLrzqt = OLrzqt();
            long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : 0L;
            C10854bwM c10854bwMOLrzqt2 = OLrzqt();
            return xyz.AEQbTJ(jQKVWgx, c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.fetchVPNInfo() : 0L, (wlaJM() || ((c10854bwMDjBIcL = djBIcL()) != null && c10854bwMDjBIcL.QHmsKR()) || (c10854bwMDjBIcL2 = djBIcL()) == null) ? null : c10854bwMDjBIcL2.fJNWhG(), zsXlph());
        }
        if (!djSkpj()) {
            return "";
        }
        xYZ xyz2 = xYZ.KWHzl;
        C10854bwM c10854bwMOLrzqt3 = OLrzqt();
        return xyz2.OLrzqt(c10854bwMOLrzqt3 != null ? c10854bwMOLrzqt3.fetchVPNInfo() : 0L, OcIXYQ());
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    private final AbstractC58185ywX<ResponseData<DappTxResultBean>> EZpvd(AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.cpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58229yxO() { // from class: o.cpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C12519coW c12519coW, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() == -5001) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) pair.getSecond();
            if (charSequence == null || charSequence.length() == 0) {
                return AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            }
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = c12519coW.fJNWhG();
            java.math.BigInteger bigIntegerKWHzl = C33129mqd.KWHzl(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null);
            java.math.BigInteger bigIntegerKWHzl2 = C33129mqd.KWHzl(c12519coW.gHZMYf());
            java.math.BigInteger bigIntegerKWHzl3 = C33129mqd.KWHzl(c12519coW.sSMYrx());
            java.math.BigInteger bigIntegerKWHzl4 = C33129mqd.KWHzl(c12519coW.zuBGHE());
            int iValues = c12519coW.values();
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = c12519coW.fJNWhG();
            java.lang.String txHash = evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getTxHash() : null;
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = c12519coW.fJNWhG();
            ExtJson extJson = new ExtJson(bigIntegerKWHzl, bigIntegerKWHzl2, bigIntegerKWHzl3, bigIntegerKWHzl4, 18, iValues, (java.lang.String) null, txHash, evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getOkexAccount() : null, (java.lang.String) null);
            xYW xyw = xYW.AEQbTJ;
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            C10854bwM c10854bwMAkhnZx = c12519coW.AkhnZx();
            final java.lang.String strAEQbTJ = xyw.AEQbTJ(str, c10854bwMAkhnZx != null ? c10854bwMAkhnZx.fetchVPNInfo() : 0L);
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String strCopydefault = c12519coW.copydefault();
            java.lang.String json = new Gson().toJson(extJson);
            Intrinsics.checkNotNullExpressionValue(json, "");
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = c12519coW.OLrzqt(str3, strAEQbTJ, strCopydefault, json, c12519coW.gEmmrt(), (java.lang.String) null);
            final Function1 function1 = new Function1() { // from class: o.cpz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12519coW.KWHzl(pair, strAEQbTJ, (ResponseData) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cpC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12519coW.AubY(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(((java.lang.Number) pair.getFirst()).intValue(), null, null, null, new DappTxResultBean((java.lang.String) pair.getSecond(), "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), null, 46, null));
    }

    public static final ResponseData AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(kotlin.Pair pair, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, new DappTxResultBean((java.lang.String) pair.getSecond(), (java.lang.String) responseData.getData(), str, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), null, 44, null);
    }

    /* JADX DEBUG: Type inference failed for r0v11. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    private final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(final java.lang.String str) {
        final TxMessage txMessage;
        TxMessage txMessageCopydefault;
        java.lang.String from;
        java.lang.String strOLrzqt;
        final C10854bwM c10854bwMAkhnZx = AkhnZx();
        if (c10854bwMAkhnZx == null) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final long jQKVWgx = c10854bwMAkhnZx.QKVWgx();
        long jFetchVPNInfo = c10854bwMAkhnZx.fetchVPNInfo();
        if (AubY()) {
            if (wlaJM()) {
                C8379bBc c8379bBc = C8379bBc.AEQbTJ;
                EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
                txMessageCopydefault = c8379bBc.copydefault(jQKVWgx, jFetchVPNInfo, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), DTwDnp(), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), RJOkX(), gEmmrt());
            } else {
                C10854bwM c10854bwMDjBIcL = djBIcL();
                if (c10854bwMDjBIcL != null && c10854bwMDjBIcL.QHmsKR()) {
                    C8379bBc c8379bBc2 = C8379bBc.AEQbTJ;
                    EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
                    txMessageCopydefault = c8379bBc2.copydefault(jQKVWgx, jFetchVPNInfo, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), DTwDnp(), "0", C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), RJOkX(), gEmmrt());
                } else {
                    C8379bBc c8379bBc3 = C8379bBc.AEQbTJ;
                    C10854bwM c10854bwMDjBIcL2 = djBIcL();
                    java.lang.String strFJNWhG = c10854bwMDjBIcL2 != null ? c10854bwMDjBIcL2.fJNWhG() : null;
                    EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
                    java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strDTwDnp = DTwDnp();
                    java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    C10854bwM c10854bwMDjBIcL3 = djBIcL();
                    java.lang.String str2 = (c10854bwMDjBIcL3 == null || (strOLrzqt = c10854bwMDjBIcL3.OLrzqt()) == null) ? "" : strOLrzqt;
                    EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG4 = fJNWhG();
                    java.lang.String str3 = (evmSpeedUpInfoBeanFJNWhG4 == null || (from = evmSpeedUpInfoBeanFJNWhG4.getFrom()) == null) ? "" : from;
                    int iQUSxYX = QUSxYX();
                    java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strConvertToBigIntegerString$default6 = C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strRJOkX = RJOkX();
                    C10854bwM c10854bwMDjBIcL4 = djBIcL();
                    txMessageCopydefault = c8379bBc3.OLrzqt(jQKVWgx, jFetchVPNInfo, strFJNWhG, strConvertToBigIntegerString$default, strDTwDnp, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, str2, str3, iQUSxYX, strConvertToBigIntegerString$default5, strConvertToBigIntegerString$default6, strRJOkX, c10854bwMDjBIcL4 != null ? c10854bwMDjBIcL4.WS() : null);
                }
            }
        } else if (djSkpj()) {
            txMessageCopydefault = xYZ.KWHzl.copydefault(C33129mqd.valueOf(RJOkX()), OcIXYQ());
        } else {
            txMessage = null;
            if (txMessage != null || !txMessage.isValid()) {
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
                return abstractC58185ywXKWHzl2;
            }
            AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.cpb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12519coW.AEQbTJ(str, this, txMessage, c10854bwMAkhnZx, jQKVWgx, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cpa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12519coW.AwvSrB(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        txMessage = txMessageCopydefault;
        if (txMessage != null) {
        }
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl22 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl22, "");
        return abstractC58185ywXKWHzl22;
    }

    public static final InterfaceC60096zvd AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(java.lang.String str, final C12519coW c12519coW, final TxMessage txMessage, C10854bwM c10854bwM, final long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC12782ctV abstractC12782ctVEjfBZ = c12519coW.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctVEjfBZ.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
        C10965byR c10965byR = C10965byR.OLrzqt;
        java.lang.String message = txMessage.getMessage();
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = c12519coW.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ2);
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c10965byR.copydefault(message, c10854bwM, mpcWalletDecodeInfoOLrzqt, abstractC12782ctVEjfBZ2.finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12519coW.AEQbTJ(this.AEQbTJ, j, txMessage, (java.lang.String) obj);
            }
        };
        return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12519coW.zuBGHE(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
    }

    public static final ResponseData zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(C12519coW c12519coW, long j, TxMessage txMessage, java.lang.String str) {
        RSV rsv;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str);
        if (list == null || (rsv = (RSV) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.String strOLrzqt = C8379bBc.AEQbTJ.OLrzqt(c12519coW.QUSxYX(), j, c12519coW.RJOkX(), txMessage.getTx(), rsv.getR(), rsv.getS(), rsv.getV());
        if (strOLrzqt.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
    }

    @Override // o.AbstractC12413cmV
    public int fIwbmz() {
        java.lang.Integer txSource;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG == null || (txSource = evmSpeedUpInfoBeanFJNWhG.getTxSource()) == null) {
            return 0;
        }
        return txSource.intValue();
    }

    public static final kotlin.Pair EZpvd(C12519coW c12519coW, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            WalletGasLimitRes walletGasLimitRes = (WalletGasLimitRes) responseData.getData();
            c12519coW.fetchVPNInfo = walletGasLimitRes != null ? walletGasLimitRes.getGas_limit() : null;
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
