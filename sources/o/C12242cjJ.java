package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.api.model.tx.signdata.RunesMainMintSignData;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionParams;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesTxIn;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cjJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12242cjJ extends AbstractC12442cmy {
    public final C12282cjx OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12242cjJ(@NotNull C12282cjx c12282cjx) {
        super(c12282cjx);
        Intrinsics.checkNotNullParameter(c12282cjx, "");
        this.OLrzqt = c12282cjx;
    }

    public final RuneMainMintTransactionResult KWHzl(java.lang.String str, java.lang.String str2, java.util.List<UTXOInfoResp> list) {
        C54904xZq c54904xZq = C54904xZq.copydefault;
        SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null);
        if (list == null) {
            list = yDY.AhwBna();
        }
        return c54904xZq.copydefault(signParamsGenerateSignParams$default, AEQbTJ(list));
    }

    public final RuneMainMintTransactionResult EZpvd(java.util.List<UTXOInfoResp> list) {
        C54904xZq c54904xZq = C54904xZq.copydefault;
        SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null);
        if (list == null) {
            list = yDY.AhwBna();
        }
        return c54904xZq.copydefault(signParamsGenerateSignParams$default, AEQbTJ(list));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final RuneMainMintTransactionParams AEQbTJ(java.util.List<UTXOInfoResp> list) {
        java.util.ArrayList<UtxoInfo> arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList == null) {
                utxoList = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, utxoList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (UtxoInfo utxoInfo : arrayList) {
            java.lang.String txHash = utxoInfo.getTxHash();
            if (txHash == null) {
                txHash = "";
            }
            arrayList2.add(new RunesTxIn(txHash, utxoInfo.getVout(), utxoInfo.getCoinAmount(), this.OLrzqt.htlTjW(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
        }
        java.lang.String strHtlTjW = this.OLrzqt.htlTjW();
        java.lang.String strZLjUOn = this.OLrzqt.zLjUOn();
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.OLrzqt.QKudOq(), 0, 1, null);
        java.lang.String strTarCU = this.OLrzqt.TarCU();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "id", ((RunesMainMintSignData) this.OLrzqt.QVsKAR()).getTokenId());
        Unit unit = Unit.INSTANCE;
        return new RuneMainMintTransactionParams(RuneMainMintTransactionParams.TYPE_MINT, arrayList2, strHtlTjW, strZLjUOn, feeRate$default, strTarCU, null, jsonObjectBuilder.build().toString(), this.OLrzqt.RKcVTr());
    }
}
