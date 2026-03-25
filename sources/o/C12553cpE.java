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
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
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

/* JADX INFO: renamed from: o.cpE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12553cpE extends AbstractC12633cqf {
    public java.lang.String AhwBna;
    public final java.lang.String valueOf = "CancelTxBiz";

    @Override // o.AbstractC12413cmV
    public int AuCTel() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AxsJAY() {
        return "";
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
        java.lang.String str = this.AhwBna;
        return str == null ? "" : str;
    }

    @Override // o.AbstractC12413cmV
    public int values() {
        return 2;
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
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAKErDB = aKErDB();
        final Function2 function2 = new Function2() { // from class: o.cqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12553cpE.copydefault((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(newProxyInstance, abstractC58185ywXAKErDB, new InterfaceC58223yxI() { // from class: o.cqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12553cpE.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> aKErDB() {
        java.lang.String strIsConnected;
        java.lang.String from;
        java.lang.String from2;
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
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG2 == null || (from2 = evmSpeedUpInfoBeanFJNWhG2.getFrom()) == null) {
            from2 = "";
        }
        java.lang.String strGEmmrt = gEmmrt();
        if (strGEmmrt == null) {
            strGEmmrt = EIP1271Verifier.hexPrefix;
        }
        AbstractC58260yxt gasLimit$default = C10734btz.getGasLimit$default(c10734btz, strIsConnected, from, from2, strGEmmrt, null, 16, null);
        final Function1 function1 = new Function1() { // from class: o.cpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = gasLimit$default.copydefault(new InterfaceC58229yxO() { // from class: o.cpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.DTwDnp(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C12553cpE c12553cpE, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c12553cpE.AhwBna = str;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public final long zuBGHE() {
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        return -(c10854bwMOLrzqt != null ? c10854bwMOLrzqt.fetchVPNInfo() : 1L);
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
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (from = evmSpeedUpInfoBeanFJNWhG.getFrom()) == null) ? "" : from;
    }

    @Override // o.AbstractC12521coY
    public java.lang.String sSMYrx() {
        java.lang.String gasPrice;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (C33129mqd.gEmmrt(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasPrice() : null, DTwDnp())) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
            java.lang.String str = (evmSpeedUpInfoBeanFJNWhG2 == null || (gasPrice = evmSpeedUpInfoBeanFJNWhG2.getGasPrice()) == null) ? "" : gasPrice;
            java.lang.String strDTwDnp = DTwDnp();
            return AbstractC12521coY.checkGasThreshold$default(this, str, strDTwDnp == null ? "" : strDTwDnp, null, 4, null);
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        return C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG3 != null ? evmSpeedUpInfoBeanFJNWhG3.getGasPrice() : null, java.lang.Double.valueOf(1.2d), null, null, null, 14, null);
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AwvSrB() {
        java.lang.String gasLimit;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (gasLimit = evmSpeedUpInfoBeanFJNWhG.getGasLimit()) == null) ? "" : gasLimit;
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
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = copydefault(str);
            final Function1 function1 = new Function1() { // from class: o.cpL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12553cpE.AEQbTJ(this.KWHzl, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.cpK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12553cpE.wlaJM(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
        final Function1 function12 = new Function1() { // from class: o.cpR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.EZpvd((PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.zuBGHE(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cpQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.copydefault(this.AEQbTJ, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.zLjUOn(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.cpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.AubY(function14, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return copydefault(abstractC58185ywXEZpvd);
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C12553cpE c12553cpE, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(responseData.getCode()), responseData.getData()));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return c12553cpE.copydefault(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final java.lang.Integer zuBGHE(Function1 function1, java.lang.Object obj) {
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

    public static final InterfaceC58261yxu zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C12553cpE c12553cpE, java.lang.String str, final java.lang.Integer num) {
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == -5001) {
            AbstractC12782ctV abstractC12782ctVDbNXlk = c12553cpE.DbNXlk();
            if (abstractC12782ctVDbNXlk != null) {
                if (abstractC12782ctVDbNXlk.AubY()) {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtValues = abstractC12782ctVDbNXlk.values(str);
                    final Function1 function1 = new Function1() { // from class: o.cpF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C12553cpE.KWHzl(num, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.cpM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C12553cpE.AuCTelauCTel(function1, obj);
                        }
                    });
                } else {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtEjfBZ = abstractC12782ctVDbNXlk.ejfBZ(str);
                    final Function1 function12 = new Function1() { // from class: o.cpJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C12553cpE.EZpvd(num, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.cpN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C12553cpE.zsXlph(function12, obj);
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

    public static final kotlin.Pair AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, new java.lang.String[]{str, ""});
    }

    public static final kotlin.Pair zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, new java.lang.String[]{"", str});
    }

    public static final kotlin.Pair AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C12553cpE c12553cpE, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Integer num = (java.lang.Integer) pair.getFirst();
        if (num != null && num.intValue() == -5001) {
            if (((java.lang.Object[]) pair.getSecond()).length == 2) {
                C10854bwM c10854bwMOLrzqt = c12553cpE.OLrzqt();
                long jQKVWgx = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L;
                long jZuBGHE = c12553cpE.zuBGHE();
                java.lang.String str = ((java.lang.String[]) pair.getSecond())[1];
                java.lang.String str2 = ((java.lang.String[]) pair.getSecond())[0];
                AbstractC12782ctV abstractC12782ctVEjfBZ = c12553cpE.ejfBZ();
                return C56390yDp.OLrzqt(pair.getFirst(), xYZ.KWHzl.OLrzqt(new SignParams(jQKVWgx, jZuBGHE, null, str, str2, abstractC12782ctVEjfBZ != null ? java.lang.Integer.valueOf(abstractC12782ctVEjfBZ.finit()) : null, 0, null, false, false, null, 1988, null), c12553cpE.zsXlph()));
            }
            return C56390yDp.OLrzqt(-5004, "");
        }
        return C56390yDp.OLrzqt(pair.getFirst(), "");
    }

    public BaseAccountTransaction zsXlph() {
        java.lang.String from;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG2 == null || (from = evmSpeedUpInfoBeanFJNWhG2.getFrom()) == null) {
            from = "";
        }
        return new AccountTransaction(from, strConvertToBigIntegerString$default, C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), (java.lang.String) null, QUSxYX(), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AxsJAY(), false, (RoundingMode) null, 3, (java.lang.Object) null), C33129mqd.gEmmrt(java.lang.Long.valueOf(zuBGHE())), (java.lang.String) null, 1024, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC12521coY
    public java.lang.String AuCTelauCTel() {
        xYZ xyz = xYZ.KWHzl;
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        return xyz.AEQbTJ(c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : 0L, zuBGHE(), null, zsXlph());
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    private final AbstractC58185ywX<ResponseData<DappTxResultBean>> copydefault(AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.String>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.cpG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(new InterfaceC58229yxO() { // from class: o.cpH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C12553cpE c12553cpE, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() == -5001) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) pair.getSecond();
            if (charSequence == null || charSequence.length() == 0) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, new DappTxResultBean("", "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), null, 46, null));
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            xYW xyw = xYW.AEQbTJ;
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            C10854bwM c10854bwMAkhnZx = c12553cpE.AkhnZx();
            java.lang.String strAEQbTJ = xyw.AEQbTJ(str, -(c10854bwMAkhnZx != null ? c10854bwMAkhnZx.fetchVPNInfo() : 0L));
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            return c12553cpE.AEQbTJ(str2 != null ? str2 : "", strAEQbTJ);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(((java.lang.Number) pair.getFirst()).intValue(), null, null, null, new DappTxResultBean((java.lang.String) pair.getSecond(), "", (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 124, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Type inference failed for r0v17. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    private final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(final java.lang.String str) {
        final C10854bwM c10854bwMAkhnZx = AkhnZx();
        if (c10854bwMAkhnZx == null) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final long jQKVWgx = c10854bwMAkhnZx.QKVWgx();
        long j = -c10854bwMAkhnZx.fetchVPNInfo();
        final long jZuBGHE = zuBGHE();
        C8379bBc c8379bBc = C8379bBc.AEQbTJ;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        final TxMessage txMessageCopydefault = c8379bBc.copydefault(jQKVWgx, j, C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), fARcdN(), C54862xYb.convertToBigIntegerString$default(EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 128) != 0 ? 0 : QUSxYX(), (2048 & 256) != 0 ? null : C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 512) != 0 ? null : C54862xYb.convertToBigIntegerString$default(AxsJAY(), false, (RoundingMode) null, 3, (java.lang.Object) null), (2048 & 1024) != 0 ? null : java.lang.String.valueOf(jZuBGHE), (2048 & 2048) != 0 ? null : null);
        if (txMessageCopydefault == null || !txMessageCopydefault.isValid()) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.KWHzl(str, this, txMessageCopydefault, c10854bwMAkhnZx, jQKVWgx, jZuBGHE, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, final C12553cpE c12553cpE, final TxMessage txMessage, C10854bwM c10854bwM, final long j, final long j2, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC12782ctV abstractC12782ctVEjfBZ = c12553cpE.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctVEjfBZ.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
        C10965byR c10965byR = C10965byR.OLrzqt;
        java.lang.String message = txMessage.getMessage();
        AbstractC12782ctV abstractC12782ctVEjfBZ2 = c12553cpE.ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ2);
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c10965byR.copydefault(message, c10854bwM, mpcWalletDecodeInfoOLrzqt, abstractC12782ctVEjfBZ2.finit()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cpP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12553cpE.KWHzl(this.copydefault, j, j2, txMessage, (java.lang.String) obj);
            }
        };
        return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12553cpE.hDKMBd(function1, obj);
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null)));
    }

    public static final ResponseData hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(C12553cpE c12553cpE, long j, long j2, TxMessage txMessage, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        RSV rsv = (RSV) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str));
        if (rsv == null) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.String strOLrzqt = C8379bBc.AEQbTJ.OLrzqt(c12553cpE.QUSxYX(), j, java.lang.String.valueOf(j2), txMessage.getTx(), rsv.getR(), rsv.getS(), rsv.getV());
        if (strOLrzqt.length() == 0) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
    }
}
