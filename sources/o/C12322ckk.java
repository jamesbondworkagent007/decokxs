package o;

import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ckk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12322ckk extends AbstractC12388clx<UTXOTransferSignData> {
    public final InterfaceC56387yDm QVAiDq = C56392yDr.copydefault(new Function0() { // from class: o.ckp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12322ckk.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Possible override for method o.clw.DNMMPQ()Z */
    public final C12354clP DNMMPQ() {
        return (C12354clP) this.QVAiDq.getValue();
    }

    public static final C12354clP copydefault(C12322ckk c12322ckk) {
        return new C12354clP(c12322ckk);
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> AhwBna(@NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DNMMPQ().copydefault(list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12340clB
    public boolean OTwTPd() {
        XRC20TransactionResult xRC20TransactionResultRKcVTr = RKcVTr();
        return Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr != null ? xRC20TransactionResultRKcVTr.getErrCode() : null), (java.lang.Object) "1000001");
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DNMMPQ().AEQbTJ(str, str2, list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
