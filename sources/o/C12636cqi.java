package o;

import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C11010bzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12636cqi extends AbstractC12633cqf {
    public java.lang.String AhwBna;
    public final java.lang.String valueOf = "SpeedUpTxBiz";

    @Override // o.AbstractC12413cmV
    public int values() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String zuBGHE() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.AbstractC12633cqf, o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> getNewProxyInstance() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> newProxyInstance = super.getNewProxyInstance();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFZBcTu = fZBcTu();
        final Function2 function2 = new Function2() { // from class: o.cqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12636cqi.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(newProxyInstance, abstractC58185ywXFZBcTu, new InterfaceC58223yxI() { // from class: o.cqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12636cqi.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> fZBcTu() {
        java.lang.String strIsConnected;
        java.lang.String from;
        CustomChainMeta customChainMetaOLrzqt;
        C10734btz c10734btz = C10734btz.KWHzl;
        CustomChainCoinMeta customChainCoinMetaOcIXYQ = OcIXYQ();
        if (customChainCoinMetaOcIXYQ == null || (customChainMetaOLrzqt = customChainCoinMetaOcIXYQ.OLrzqt()) == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
            strIsConnected = "";
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG == null || (from = evmSpeedUpInfoBeanFJNWhG.getFrom()) == null) {
            from = "";
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = c10734btz.copydefault(strIsConnected, from, fFgQHt(), QbewEr(), AxsJAY());
        final Function1 function1 = new Function1() { // from class: o.cqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12636cqi.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12636cqi.QKVWgx(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C12636cqi c12636cqi, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c12636cqi.AhwBna = C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, java.lang.Float.valueOf(1.5f)), false, (RoundingMode) null, 3, (java.lang.Object) null);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
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
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasPrice() : null, java.lang.Double.valueOf(1.2d), null, null, null, 14, null);
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
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AhwBna)) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
            if (C33129mqd.gEmmrt(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasLimit() : null, this.AhwBna) && !QVAiDq()) {
                java.lang.String str = this.AhwBna;
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

    @Override // o.AbstractC12413cmV
    public boolean AubY() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        return ((evmSpeedUpInfoBeanFJNWhG3 != null && evmSpeedUpInfoBeanFJNWhG3.getTxType() == 1) || (((evmSpeedUpInfoBeanFJNWhG = fJNWhG()) != null && evmSpeedUpInfoBeanFJNWhG.getTxType() == 2) || ((evmSpeedUpInfoBeanFJNWhG2 = fJNWhG()) != null && evmSpeedUpInfoBeanFJNWhG2.getTxType() == 9))) && !(wlaJM() && dNCPSb());
    }

    public final boolean dNCPSb() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getInputData() : null))) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            if (!Intrinsics.EZpvd((java.lang.Object) (evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getInputData() : null), (java.lang.Object) EIP1271Verifier.hexPrefix)) {
                return true;
            }
        }
        return false;
    }

    private final boolean dvKsVJ() {
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

    private final java.lang.String fFgQHt() {
        java.lang.String strOLrzqt;
        C10854bwM c10854bwMDjBIcL = djBIcL();
        if (c10854bwMDjBIcL != null && c10854bwMDjBIcL.DCUTEIddSDPG()) {
            C10854bwM c10854bwMDjBIcL2 = djBIcL();
            return (c10854bwMDjBIcL2 == null || (strOLrzqt = c10854bwMDjBIcL2.OLrzqt()) == null) ? "" : strOLrzqt;
        }
        return fARcdN();
    }

    @Override // o.AbstractC12413cmV
    public int AuCTel() {
        return AubY() ? 5 : 3;
    }

    private final long djSkpj() {
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        return -(c10854bwMOLrzqt != null ? c10854bwMOLrzqt.fetchVPNInfo() : 1L);
    }

    /* JADX DEBUG: Type inference failed for r10v6. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
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
        if (abstractC12782ctVDbNXlk.gHZMYf()) {
            AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        AbstractC12782ctV abstractC12782ctVEjfBZ = ejfBZ();
        if (abstractC12782ctVEjfBZ != null && abstractC12782ctVEjfBZ.ORxRYg()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd = EZpvd(str);
            final Function1 function1 = new Function1() { // from class: o.cqE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12636cqi.EZpvd(this.copydefault, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cqG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12636cqi.ORxRYg(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
        final Function1 function12 = new Function1() { // from class: o.cqD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12636cqi.KWHzl((PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12636cqi.DTwDnp(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12636cqi.KWHzl(this.KWHzl, str, ((java.lang.Integer) obj).intValue());
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12636cqi.wlaJM(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12636cqi.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXEZpvd2 = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.cqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12636cqi.zuBGHE(function14, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return KWHzl(abstractC58185ywXEZpvd2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C12636cqi c12636cqi, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12636cqi.KWHzl(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public static final InterfaceC58261yxu wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C12636cqi c12636cqi, java.lang.String str, final int i) {
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        if (i == -5001) {
            AbstractC12782ctV abstractC12782ctVDbNXlk = c12636cqi.DbNXlk();
            if (abstractC12782ctVDbNXlk != null) {
                if (abstractC12782ctVDbNXlk.AubY()) {
                    if (c12636cqi.AubY()) {
                        AbstractC58260yxt<java.lang.String> abstractC58260yxtValues = abstractC12782ctVDbNXlk.values(str);
                        final Function1 function1 = new Function1() { // from class: o.cqm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C12636cqi.djBIcL(i, (java.lang.String) obj);
                            }
                        };
                        interfaceC58261yxuCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.cql
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C12636cqi.zLjUOn(function1, obj);
                            }
                        });
                    } else if (c12636cqi.dvKsVJ()) {
                        C10854bwM c10854bwMAkhnZx = c12636cqi.AkhnZx();
                        AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default(abstractC12782ctVDbNXlk, str, c10854bwMAkhnZx != null ? c10854bwMAkhnZx.AEQbTJ() : -1L, 0, 4, null);
                        final Function1 function12 = new Function1() { // from class: o.cqu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C12636cqi.OLrzqt(i, (java.lang.String) obj);
                            }
                        };
                        interfaceC58261yxuCopydefault = abstractC58260yxtPrivateKeyForChainId$default.copydefault(new InterfaceC58229yxO() { // from class: o.cqy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C12636cqi.AubY(function12, obj);
                            }
                        });
                    } else {
                        interfaceC58261yxuCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-5004, new java.lang.String[]{""}));
                    }
                } else {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtEjfBZ = abstractC12782ctVDbNXlk.ejfBZ(str);
                    final Function1 function13 = new Function1() { // from class: o.cqx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C12636cqi.EZpvd(i, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.cqC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C12636cqi.zsXlph(function13, obj);
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

    public static final kotlin.Pair zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair djBIcL(int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{str, ""});
    }

    public static final kotlin.Pair AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{"", str});
    }

    public static final kotlin.Pair zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), new java.lang.String[]{"", str});
    }

    public static final kotlin.Pair zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C12636cqi c12636cqi, kotlin.Pair pair) {
        java.lang.String strSubstring;
        C10854bwM c10854bwMDjBIcL;
        java.lang.String strEZpvd = "";
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Integer num = (java.lang.Integer) pair.getFirst();
        if (num != null && num.intValue() == -5001) {
            if (((java.lang.Object[]) pair.getSecond()).length == 2) {
                java.lang.Object first = pair.getFirst();
                if (c12636cqi.AubY()) {
                    C10854bwM c10854bwMOLrzqt = c12636cqi.OLrzqt();
                    long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L;
                    long jDjSkpj = c12636cqi.djSkpj();
                    C10854bwM c10854bwMDjBIcL2 = c12636cqi.djBIcL();
                    java.lang.String strFJNWhG = ((c10854bwMDjBIcL2 == null || !c10854bwMDjBIcL2.AuCTel()) && (c10854bwMDjBIcL = c12636cqi.djBIcL()) != null) ? c10854bwMDjBIcL.fJNWhG() : null;
                    java.lang.String str = ((java.lang.String[]) pair.getSecond())[1];
                    java.lang.String str2 = ((java.lang.String[]) pair.getSecond())[0];
                    AbstractC12782ctV abstractC12782ctVEjfBZ = c12636cqi.ejfBZ();
                    strEZpvd = xYZ.KWHzl.OLrzqt(new SignParams(jQKVWgx, jDjSkpj, strFJNWhG, str, str2, abstractC12782ctVEjfBZ != null ? java.lang.Integer.valueOf(abstractC12782ctVEjfBZ.finit()) : null, 0, null, false, false, null, 1984, null), c12636cqi.zsXlph());
                } else if (c12636cqi.dvKsVJ()) {
                    if (C59449zhJ.startsWith$default(((java.lang.String[]) pair.getSecond())[1], EIP1271Verifier.hexPrefix, false, 2, null)) {
                        strSubstring = ((java.lang.String[]) pair.getSecond())[1].substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    } else {
                        strSubstring = ((java.lang.String[]) pair.getSecond())[1];
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strSubstring)) {
                        strEZpvd = xYZ.KWHzl.EZpvd(strSubstring, c12636cqi.djSkpj(), c12636cqi.aKErDB());
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
            java.lang.String strFARcdN = fARcdN();
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
            return new AccountTransaction(strFARcdN, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), (java.lang.String) null, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), C33129mqd.gEmmrt(java.lang.Long.valueOf(djSkpj())), (java.lang.String) null, 1024, (DefaultConstructorMarker) null);
        }
        java.lang.String strFARcdN2 = fARcdN();
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        C10854bwM c10854bwMDjBIcL = djBIcL();
        java.lang.String strConvertToBigIntegerString$default2 = (c10854bwMDjBIcL == null || !Intrinsics.EZpvd(c10854bwMDjBIcL.WS(), java.lang.Boolean.TRUE)) ? "0" : C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        C10854bwM c10854bwMDjBIcL2 = djBIcL();
        java.lang.String str = (c10854bwMDjBIcL2 == null || (strOLrzqt = c10854bwMDjBIcL2.OLrzqt()) == null) ? "" : strOLrzqt;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        return new AccountTokenTransaction(strFARcdN2, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strConvertToBigIntegerString$default2, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), C33129mqd.gEmmrt(java.lang.Long.valueOf(djSkpj())), (java.lang.String) null, str, C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), (evmSpeedUpInfoBeanFJNWhG3 == null || (from = evmSpeedUpInfoBeanFJNWhG3.getFrom()) == null) ? "" : from, 512, (DefaultConstructorMarker) null);
    }

    private final SigData aKErDB() {
        java.lang.String nonce;
        java.lang.String strFARcdN = fARcdN();
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
        return new SigData(strFARcdN, strCopydefault, str2, strCopydefault2, strCopydefault3, C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null)), C33491mxU.copydefault(java.lang.String.valueOf(QUSxYX())), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null)), C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null)), (java.util.List) null, 512, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AuCTelauCTel() {
        C10854bwM c10854bwMDjBIcL;
        if (!AubY()) {
            return dvKsVJ() ? xYZ.KWHzl.OLrzqt(djSkpj(), aKErDB()) : "";
        }
        xYZ xyz = xYZ.KWHzl;
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        return xyz.AEQbTJ(c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : 0L, djSkpj(), (wlaJM() || (c10854bwMDjBIcL = djBIcL()) == null) ? null : c10854bwMDjBIcL.fJNWhG(), zsXlph());
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    private final AbstractC58185ywX<ResponseData<DappTxResultBean>> KWHzl(AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.cqB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12636cqi.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58229yxO() { // from class: o.cqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12636cqi.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C12636cqi c12636cqi, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() == -5001) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) pair.getSecond();
            if (charSequence == null || charSequence.length() == 0) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            xYW xyw = xYW.AEQbTJ;
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            C10854bwM c10854bwMAkhnZx = c12636cqi.AkhnZx();
            java.lang.String strAEQbTJ = xyw.AEQbTJ(str, -(c10854bwMAkhnZx != null ? c10854bwMAkhnZx.fetchVPNInfo() : 0L));
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            return c12636cqi.AEQbTJ(str2 != null ? str2 : "", strAEQbTJ);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(((java.lang.Number) pair.getFirst()).intValue(), null, null, null, new DappTxResultBean((java.lang.String) pair.getSecond(), "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Type inference failed for r0v12. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    private final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(final java.lang.String str) {
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
        long j = -c10854bwMAkhnZx.fetchVPNInfo();
        final long jDjSkpj = djSkpj();
        if (AubY()) {
            if (wlaJM()) {
                C8379bBc c8379bBc = C8379bBc.AEQbTJ;
                EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
                txMessageCopydefault = c8379bBc.copydefault(jQKVWgx, j, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), fARcdN(), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 128) != 0 ? 0 : QUSxYX(), (2048 & 256) != 0 ? null : C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 512) != 0 ? null : C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 1024) != 0 ? null : java.lang.String.valueOf(jDjSkpj), (2048 & 2048) != 0 ? null : null);
            } else {
                C8379bBc c8379bBc2 = C8379bBc.AEQbTJ;
                C10854bwM c10854bwMDjBIcL = djBIcL();
                java.lang.String strFJNWhG = c10854bwMDjBIcL != null ? c10854bwMDjBIcL.fJNWhG() : null;
                EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
                java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG2 != null ? evmSpeedUpInfoBeanFJNWhG2.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strFARcdN = fARcdN();
                java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                C10854bwM c10854bwMDjBIcL2 = djBIcL();
                java.lang.String str2 = (c10854bwMDjBIcL2 == null || (strOLrzqt = c10854bwMDjBIcL2.OLrzqt()) == null) ? "" : strOLrzqt;
                EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
                java.lang.String str3 = (evmSpeedUpInfoBeanFJNWhG3 == null || (from = evmSpeedUpInfoBeanFJNWhG3.getFrom()) == null) ? "" : from;
                int iQUSxYX = QUSxYX();
                java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String strConvertToBigIntegerString$default6 = C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                C10854bwM c10854bwMDjBIcL3 = djBIcL();
                txMessageCopydefault = c8379bBc2.OLrzqt(jQKVWgx, j, strFJNWhG, strConvertToBigIntegerString$default, strFARcdN, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, str2, str3, iQUSxYX, strConvertToBigIntegerString$default5, strConvertToBigIntegerString$default6, java.lang.String.valueOf(jDjSkpj), c10854bwMDjBIcL3 != null ? c10854bwMDjBIcL3.WS() : null);
            }
        } else if (dvKsVJ()) {
            txMessageCopydefault = xYZ.KWHzl.copydefault(jDjSkpj, aKErDB());
        } else {
            txMessage = null;
            if (txMessage != null || !txMessage.isValid()) {
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
                return abstractC58185ywXKWHzl2;
            }
            AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.cqw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12636cqi.EZpvd(str, this, txMessage, c10854bwMAkhnZx, jQKVWgx, jDjSkpj, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cqs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12636cqi.AuCTelauCTel(function1, obj);
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

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, final C12636cqi c12636cqi, final TxMessage txMessage, C10854bwM c10854bwM, final long j, final long j2, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC12782ctV abstractC12782ctVEjfBZ = c12636cqi.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctVEjfBZ.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
        C10965byR c10965byR = C10965byR.OLrzqt;
        java.lang.String message = txMessage.getMessage();
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = c12636cqi.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ2);
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c10965byR.copydefault(message, c10854bwM, mpcWalletDecodeInfoOLrzqt, abstractC12782ctVEjfBZ2.finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12636cqi.OLrzqt(this.KWHzl, j, j2, txMessage, (java.lang.String) obj);
            }
        };
        return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cqt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12636cqi.iwGUEr(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
    }

    public static final ResponseData iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(C12636cqi c12636cqi, long j, long j2, TxMessage txMessage, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        RSV rsv = (RSV) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str));
        if (rsv == null) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.String strOLrzqt = C8379bBc.AEQbTJ.OLrzqt(c12636cqi.QUSxYX(), j, java.lang.String.valueOf(j2), txMessage.getTx(), rsv.getR(), rsv.getS(), rsv.getV());
        if (strOLrzqt.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
    }

    public final java.lang.String AxsJAY() {
        C10854bwM c10854bwMDjBIcL = djBIcL();
        return (c10854bwMDjBIcL == null || !c10854bwMDjBIcL.AuCTel()) ? "" : C33491mxU.copydefault(EZpvd());
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
}
