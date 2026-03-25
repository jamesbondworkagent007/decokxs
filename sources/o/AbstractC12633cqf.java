package o;

import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10614brl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12633cqf extends AbstractC12521coY {
    public CustomChainCoinMeta AkhnZx;
    public java.lang.String fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DTwDnp() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMeta OcIXYQ() {
        return this.AkhnZx;
    }

    @Override // o.AbstractC12521coY
    public boolean RcXXUw() {
        return false;
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> getNewProxyInstance() {
        C10598brV c10598brV = C10598brV.AEQbTJ;
        java.lang.Long lAYXKKw = AYXKKw();
        if (lAYXKKw != null) {
            this.AkhnZx = c10598brV.OLrzqt(lAYXKKw.longValue());
            return super.getNewProxyInstance();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, Constants.IPC_BUNDLE_KEY_SEND_ERROR));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12413cmV
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> zLjUOn() {
        java.lang.String strIsConnected;
        CustomChainMeta customChainMetaOLrzqt;
        C10734btz c10734btz = C10734btz.KWHzl;
        CustomChainCoinMeta customChainCoinMeta = this.AkhnZx;
        if (customChainCoinMeta == null || (customChainMetaOLrzqt = customChainCoinMeta.OLrzqt()) == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
            strIsConnected = "";
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAuCTelauCTel = c10734btz.AuCTelauCTel(strIsConnected);
        final Function1 function1 = new Function1() { // from class: o.cqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12633cqf.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtAuCTelauCTel.copydefault(new InterfaceC58229yxO() { // from class: o.cqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12633cqf.sSMYrx(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(AbstractC12633cqf abstractC12633cqf, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        abstractC12633cqf.fetchVPNInfo = str;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC12413cmV
    public C10854bwM djBIcL() {
        CustomChainCoinMeta customChainCoinMetaOLrzqt;
        C10598brV c10598brV = C10598brV.AEQbTJ;
        java.lang.Long lAYXKKw = AYXKKw();
        if (lAYXKKw == null || (customChainCoinMetaOLrzqt = c10598brV.OLrzqt(lAYXKKw.longValue())) == null) {
            return null;
        }
        return customChainCoinMetaOLrzqt.AEQbTJ();
    }

    public java.lang.Integer UeEOUB() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG != null) {
            return java.lang.Integer.valueOf(evmSpeedUpInfoBeanFJNWhG.getTxType());
        }
        return null;
    }

    public final AbstractC58185ywX<ResponseData<DappTxResultBean>> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        java.lang.String string;
        java.lang.String from;
        java.lang.String txHash;
        java.lang.String txId;
        CustomChainMeta customChainMetaOLrzqt;
        CustomChainCoinMeta customChainCoinMeta;
        CustomChainMeta customChainMetaOLrzqt2;
        CustomChainMeta customChainMetaOLrzqt3;
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC12782ctV abstractC12782ctVDbNXlk = DbNXlk();
        java.lang.String str3 = (abstractC12782ctVDbNXlk == null || (strDbNXlk = abstractC12782ctVDbNXlk.DbNXlk()) == null) ? "" : strDbNXlk;
        C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
        CustomChainCoinMeta customChainCoinMeta2 = this.AkhnZx;
        if (customChainCoinMeta2 == null || (customChainMetaOLrzqt3 = customChainCoinMeta2.OLrzqt()) == null || (string = java.lang.Long.valueOf(customChainMetaOLrzqt3.EZpvd()).toString()) == null) {
            string = "";
        }
        java.lang.String strEZpvd = instance$default.EZpvd(str3, string);
        java.lang.String str4 = (strEZpvd.length() == 0 && ((customChainCoinMeta = this.AkhnZx) == null || (customChainMetaOLrzqt2 = customChainCoinMeta.OLrzqt()) == null || (strEZpvd = customChainMetaOLrzqt2.isConnected()) == null)) ? "" : strEZpvd;
        CustomChainCoinMeta customChainCoinMeta3 = this.AkhnZx;
        long jValueOf = customChainCoinMeta3 != null ? customChainCoinMeta3.valueOf() : 0L;
        CustomChainCoinMeta customChainCoinMeta4 = this.AkhnZx;
        pUU.copydefault("CustomNetworkSpeedUpTxBaseBiz", "selectedRpcUrl = " + str4 + " coinId = " + jValueOf + " chainId = " + ((customChainCoinMeta4 == null || (customChainMetaOLrzqt = customChainCoinMeta4.OLrzqt()) == null) ? null : java.lang.Long.valueOf(customChainMetaOLrzqt.EZpvd())));
        C10747buL c10747buL = C10747buL.AEQbTJ;
        CustomChainCoinMeta customChainCoinMeta5 = this.AkhnZx;
        long jValueOf2 = customChainCoinMeta5 != null ? customChainCoinMeta5.valueOf() : 0L;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String str5 = (evmSpeedUpInfoBeanFJNWhG == null || (txId = evmSpeedUpInfoBeanFJNWhG.getTxId()) == null) ? "" : txId;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
        java.lang.String str6 = (evmSpeedUpInfoBeanFJNWhG2 == null || (txHash = evmSpeedUpInfoBeanFJNWhG2.getTxHash()) == null) ? "" : txHash;
        CustomChainCoinMeta customChainCoinMeta6 = this.AkhnZx;
        long jCopydefault = customChainCoinMeta6 != null ? customChainCoinMeta6.copydefault() : -1L;
        java.lang.Integer numUeEOUB = UeEOUB();
        int iIntValue = numUeEOUB != null ? numUeEOUB.intValue() : 3;
        int iValues = values();
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
        java.lang.String str7 = (evmSpeedUpInfoBeanFJNWhG3 == null || (from = evmSpeedUpInfoBeanFJNWhG3.getFrom()) == null) ? "" : from;
        java.lang.String strFARcdN = fARcdN();
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG4 = fJNWhG();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(evmSpeedUpInfoBeanFJNWhG4 != null ? evmSpeedUpInfoBeanFJNWhG4.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(sSMYrx(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(gHZMYf(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(EZpvd(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String strGEmmrt = gEmmrt();
        if (strGEmmrt == null) {
            strGEmmrt = EIP1271Verifier.hexPrefix;
        }
        AbstractC58260yxt<java.lang.String> abstractC58260yxtCopydefault = c10747buL.copydefault(str4, new C10746buK(str3, jValueOf2, str2, str5, str6, jCopydefault, iIntValue, iValues, 1, str7, strFARcdN, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strGEmmrt, str, null, java.lang.System.currentTimeMillis(), 0L, null, 1703936, null));
        final Function1 function1 = new Function1() { // from class: o.cqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12633cqf.OLrzqt(str, this, str2, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12633cqf.AxsJAY(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final ResponseData AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(java.lang.String str, AbstractC12633cqf abstractC12633cqf, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = abstractC12633cqf.fJNWhG();
        return new ResponseData(0, null, null, null, new DappTxResultBean(str, evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getTxId() : null, str2, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), null, 46, null);
    }
}
