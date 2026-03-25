package o;

import com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfo;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.EvmSignInfoGasPrice;
import com.okinc.business.defi.biz.core.tx.speedup.bean.EvmSpeedUpInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.web3.security.bridge.MnemonicKt;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.coY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12521coY extends AbstractC12413cmV<EvmSpeedUpInfoBean> {
    public boolean AYXKKw;
    public EvmSignInfo isConnected;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.coZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC12521coY.QKVWgx();
        }
    });

    public abstract java.lang.String AuCTelauCTel();

    public abstract java.lang.String AwvSrB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QVAiDq() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignInfo QfsBiF() {
        return this.isConnected;
    }

    public abstract java.lang.String gHZMYf();

    public abstract java.lang.String sSMYrx();

    public static final java.lang.String QKVWgx() {
        return xYS.copydefault.KWHzl(MnemonicKt.MnemonicLanguageEnglish);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/ctV;Lcom/okinc/business/defi/biz/net/bean/CoinAndAddressHistoryDetail;)Lcom/okinc/business/defi/biz/core/tx/speedup/bean/SpeedUpInfoBean; */
    @Override // o.AbstractC12413cmV
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public EvmSpeedUpInfoBean EZpvd(AbstractC12782ctV abstractC12782ctV, @NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        EvmSpeedUpInfoBean evmSpeedUpInfoBean = new EvmSpeedUpInfoBean();
        evmSpeedUpInfoBean.setGasPrice(coinAndAddressHistoryDetail.getGasPrice());
        java.lang.String priorityFee = coinAndAddressHistoryDetail.getPriorityFee();
        evmSpeedUpInfoBean.setPriorityFee(priorityFee != null ? priorityFee : "");
        evmSpeedUpInfoBean.setGasLimit(coinAndAddressHistoryDetail.getGasLimit());
        evmSpeedUpInfoBean.setNonce(coinAndAddressHistoryDetail.getNonce());
        evmSpeedUpInfoBean.setInputData(coinAndAddressHistoryDetail.getInputData());
        return evmSpeedUpInfoBean;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lcom/okinc/business/defi/biz/net/bean/TxIdOrHashHistoryDetail;)Lcom/okinc/business/defi/biz/core/tx/speedup/bean/SpeedUpInfoBean; */
    @Override // o.AbstractC12413cmV
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public EvmSpeedUpInfoBean KWHzl(@NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
        EvmSpeedUpInfoBean evmSpeedUpInfoBean = new EvmSpeedUpInfoBean();
        evmSpeedUpInfoBean.setGasPrice(txIdOrHashHistoryDetail.getGasPrice());
        java.lang.String priorityFee = txIdOrHashHistoryDetail.getPriorityFee();
        evmSpeedUpInfoBean.setPriorityFee(priorityFee != null ? priorityFee : "");
        evmSpeedUpInfoBean.setGasLimit(txIdOrHashHistoryDetail.getGasLimit());
        evmSpeedUpInfoBean.setNonce(txIdOrHashHistoryDetail.getNonce());
        evmSpeedUpInfoBean.setInputData(txIdOrHashHistoryDetail.getInputData());
        return evmSpeedUpInfoBean;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lcom/okinc/business/defi/biz/net/bean/TxRecord;)Lcom/okinc/business/defi/biz/core/tx/speedup/bean/SpeedUpInfoBean; */
    @Override // o.AbstractC12413cmV
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public EvmSpeedUpInfoBean AEQbTJ(@NotNull TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        EvmSpeedUpInfoBean evmSpeedUpInfoBean = new EvmSpeedUpInfoBean();
        evmSpeedUpInfoBean.setGasPrice(txRecord.getGasPrice());
        java.lang.String priorityFee = txRecord.getPriorityFee();
        evmSpeedUpInfoBean.setPriorityFee(priorityFee != null ? priorityFee : "");
        evmSpeedUpInfoBean.setGasLimit(txRecord.getGasLimit());
        evmSpeedUpInfoBean.setNonce(txRecord.getNonce());
        evmSpeedUpInfoBean.setInputData(txRecord.getInputData());
        return evmSpeedUpInfoBean;
    }

    @Override // o.AbstractC12413cmV
    public void copydefault(@NotNull SignInfo signInfo) {
        Intrinsics.checkNotNullParameter(signInfo, "");
        Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
        KSerializer<EvmSignInfo> kSerializerSerializer = EvmSignInfo.Companion.serializer();
        JsonObject info = signInfo.getInfo();
        if (info == null) {
            return;
        }
        this.isConnected = (EvmSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info);
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String KWHzl() {
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return C33129mqd.mulS$default(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getGasPrice() : null, AwvSrB(), null, null, null, 14, null);
    }

    @Override // o.AbstractC12413cmV
    public java.lang.String copydefault() {
        return C33129mqd.mulS$default(sSMYrx(), gHZMYf(), null, null, null, 14, null);
    }

    public final java.lang.String ORxRYg() {
        java.lang.String gasPrice;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return (evmSpeedUpInfoBeanFJNWhG == null || (gasPrice = evmSpeedUpInfoBeanFJNWhG.getGasPrice()) == null) ? "" : gasPrice;
    }

    public final java.lang.String RJOkX() {
        java.lang.String strGEmmrt;
        C10854bwM c10854bwMOLrzqt = OLrzqt();
        if (c10854bwMOLrzqt != null && c10854bwMOLrzqt.dmfpNf()) {
            C10854bwM c10854bwMOLrzqt2 = OLrzqt();
            strGEmmrt = C33129mqd.gEmmrt(c10854bwMOLrzqt2 != null ? java.lang.Long.valueOf(c10854bwMOLrzqt2.fetchVPNInfo()) : null);
        } else {
            C10854bwM c10854bwMOLrzqt3 = OLrzqt();
            strGEmmrt = C33129mqd.gEmmrt(c10854bwMOLrzqt3 != null ? java.lang.Long.valueOf(c10854bwMOLrzqt3.isConnected()) : null);
        }
        EvmSignInfo evmSignInfo = this.isConnected;
        java.lang.String chainId = evmSignInfo != null ? evmSignInfo.getChainId() : null;
        if (chainId == null || chainId.length() == 0) {
            return strGEmmrt;
        }
        EvmSignInfo evmSignInfo2 = this.isConnected;
        java.lang.String chainId2 = evmSignInfo2 != null ? evmSignInfo2.getChainId() : null;
        return chainId2 == null ? "" : chainId2;
    }

    public boolean RcXXUw() {
        EvmSignInfo evmSignInfo;
        EvmSignInfoGasPrice gasPrice;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        return C33129mqd.AEQbTJ(evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getPriorityFee() : null, 0) && (evmSignInfo = this.isConnected) != null && (gasPrice = evmSignInfo.getGasPrice()) != null && Intrinsics.EZpvd(gasPrice.getSupportEip1559(), java.lang.Boolean.TRUE);
    }

    public final int QUSxYX() {
        return RcXXUw() ? 2 : 0;
    }

    public static /* synthetic */ java.lang.String checkGasThreshold$default(AbstractC12521coY abstractC12521coY, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkGasThreshold");
        }
        if ((i & 4) != 0) {
            str3 = "0.1";
        }
        return abstractC12521coY.OLrzqt(str, str2, str3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33129mqd.gEmmrt(C33129mqd.subS$default(str2, str, null, null, null, 14, null), C33129mqd.mulS$default(str, str3, null, null, null, 14, null)) ? C33129mqd.mulS$default(str, C33129mqd.addS$default(1, str3, null, null, null, 14, null), null, null, null, 14, null) : str2;
    }

    public final java.lang.String QbewEr() {
        java.lang.String lowerCase;
        java.lang.String inputData;
        java.lang.String inputData2;
        this.AYXKKw = false;
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG = fJNWhG();
        java.lang.String inputData3 = evmSpeedUpInfoBeanFJNWhG != null ? evmSpeedUpInfoBeanFJNWhG.getInputData() : null;
        if (inputData3 == null || inputData3.length() == 0) {
            return "";
        }
        EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG2 = fJNWhG();
        if (evmSpeedUpInfoBeanFJNWhG2 == null || (inputData2 = evmSpeedUpInfoBeanFJNWhG2.getInputData()) == null) {
            lowerCase = null;
        } else {
            lowerCase = inputData2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) EIP1271Verifier.hexPrefix)) {
            EvmSpeedUpInfoBean evmSpeedUpInfoBeanFJNWhG3 = fJNWhG();
            return (evmSpeedUpInfoBeanFJNWhG3 == null || (inputData = evmSpeedUpInfoBeanFJNWhG3.getInputData()) == null) ? "" : inputData;
        }
        C10854bwM c10854bwMDjBIcL = djBIcL();
        if (c10854bwMDjBIcL != null && c10854bwMDjBIcL.AuCTel()) {
            return "";
        }
        java.lang.String strCopydefault = xYW.AEQbTJ.copydefault(fARcdN(), C54862xYb.convertToBigIntegerString$default(EZpvd(), true, (RoundingMode) null, 2, (java.lang.Object) null));
        this.AYXKKw = strCopydefault.length() == 0;
        return strCopydefault;
    }
}
