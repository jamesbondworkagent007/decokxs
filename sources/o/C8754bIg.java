package o;

import com.okinc.business.defi.biz.net.bean.CardanoAssetInfo;
import com.okinc.business.defi.biz.net.bean.CardanoMultiAssetInfo;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOResp;
import com.okinc.wallet.core.sign.cardano.CardanoAsset;
import com.okinc.wallet.core.sign.cardano.CardanoMinAdaTransaction;
import com.okinc.wallet.core.sign.cardano.CardanoMultiAsset;
import com.okinc.wallet.core.sign.cardano.CardanoSignedMinFee;
import com.okinc.wallet.core.sign.cardano.CardanoTransaction;
import com.okinc.wallet.core.sign.cardano.CardanoTxIn;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8754bIg extends AbstractC12442cmy {
    public final AbstractC8752bIe KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8754bIg(@NotNull AbstractC8752bIe abstractC8752bIe) {
        super(abstractC8752bIe);
        Intrinsics.checkNotNullParameter(abstractC8752bIe, "");
        this.KWHzl = abstractC8752bIe;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.util.List<CardanoUTXOResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYY.copydefault.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, null, str, false, 4, null), copydefault(OLrzqt(list)));
    }

    public final java.lang.String copydefault() {
        return xYY.copydefault.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, null, null, true, 2, null), KWHzl());
    }

    public final CardanoSignedMinFee KWHzl(java.util.List<CardanoUTXOResp> list) {
        return xYY.copydefault.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, null, null, true, 2, null), copydefault(OLrzqt(list)));
    }

    public final CardanoTransaction copydefault(java.util.List<CardanoTxIn> list) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        java.util.List<CardanoTxIn> list2 = list;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.KWHzl.OcIXYQ(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        return new CardanoTransaction(list2, this.KWHzl.zLjUOn(), strConvertToBigIntegerString$default, this.KWHzl.QVAiDq(), this.KWHzl.htlTjW(), this.KWHzl.QUSxYX());
    }

    public final CardanoMinAdaTransaction KWHzl() {
        return new CardanoMinAdaTransaction(this.KWHzl.htlTjW(), this.KWHzl.QVAiDq());
    }

    public final java.util.List<CardanoTxIn> OLrzqt(java.util.List<CardanoUTXOResp> list) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CardanoUTXOResp cardanoUTXOResp : list) {
            java.lang.String txId = cardanoUTXOResp.getTxId();
            if (txId == null) {
                txId = "";
            }
            java.lang.String index = cardanoUTXOResp.getIndex();
            if (index == null) {
                index = "";
            }
            java.lang.String amount = cardanoUTXOResp.getAmount();
            if (amount == null) {
                amount = "";
            }
            java.util.ArrayList<CardanoMultiAssetInfo> multiAsset = cardanoUTXOResp.getMultiAsset();
            if (multiAsset != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(multiAsset, 10));
                for (CardanoMultiAssetInfo cardanoMultiAssetInfo : multiAsset) {
                    java.lang.String policyId = cardanoMultiAssetInfo.getPolicyId();
                    if (policyId == null) {
                        policyId = "";
                    }
                    java.util.ArrayList<CardanoAssetInfo> assets = cardanoMultiAssetInfo.getAssets();
                    if (assets != null) {
                        arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(assets, 10));
                        for (CardanoAssetInfo cardanoAssetInfo : assets) {
                            java.lang.String assetName = cardanoAssetInfo.getAssetName();
                            if (assetName == null) {
                                assetName = "";
                            }
                            java.lang.String amount2 = cardanoAssetInfo.getAmount();
                            if (amount2 == null) {
                                amount2 = "";
                            }
                            arrayList2.add(new CardanoAsset(assetName, amount2));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    arrayList.add(new CardanoMultiAsset(policyId, arrayList2));
                }
            } else {
                arrayList = null;
            }
            arrayList3.add(new CardanoTxIn(txId, index, amount, arrayList));
        }
        return arrayList3;
    }
}
