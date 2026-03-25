package o;

import com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.starknet.StarknetCall;
import com.okinc.wallet.core.sign.starknet.StarknetContractTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11845cbk extends AbstractC12442cmy {
    public final C11796cao<?> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11845cbk(@NotNull C11796cao<?> c11796cao) {
        super(c11796cao);
        Intrinsics.checkNotNullParameter(c11796cao, "");
        this.OLrzqt = c11796cao;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String tx = C54897xZj.EZpvd.KWHzl(AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null), copydefault()).getTx();
        return tx == null ? "" : tx;
    }

    public final SignedTx OLrzqt(java.lang.String str) {
        return C54897xZj.EZpvd.KWHzl(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), copydefault());
    }

    public final StarknetContractTransaction copydefault() {
        java.util.List<StarkNetContractSignData.StarkNetCall> calls;
        java.lang.String strHtlTjW = this.OLrzqt.htlTjW();
        StarkNetSignInfo starkNetSignInfoRcXXUw = this.OLrzqt.RcXXUw();
        java.util.ArrayList arrayList = null;
        java.lang.String strCopydefault = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(starkNetSignInfoRcXXUw != null ? starkNetSignInfoRcXXUw.getNonce() : null, true, (RoundingMode) null, 2, (java.lang.Object) null));
        java.lang.String strOLrzqt = this.OLrzqt.AEQbTJ().OLrzqt();
        java.lang.String strKWHzl = this.OLrzqt.AEQbTJ().KWHzl();
        java.lang.String strAEQbTJ = this.OLrzqt.AEQbTJ().AEQbTJ();
        java.lang.String strCopydefault2 = this.OLrzqt.AEQbTJ().copydefault();
        java.lang.String strValueOf = this.OLrzqt.AEQbTJ().valueOf();
        java.lang.String strEZpvd = this.OLrzqt.AEQbTJ().EZpvd();
        StarkNetContractSignData.StarkNetExecutionRequest executionRequest = this.OLrzqt.fARcdN().getExecutionRequest();
        if (executionRequest != null && (calls = executionRequest.getCalls()) != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(calls, 10));
            for (StarkNetContractSignData.StarkNetCall starkNetCall : calls) {
                java.lang.String contractAddress = starkNetCall.getContractAddress();
                if (contractAddress == null) {
                    contractAddress = "";
                }
                java.lang.String entrypoint = starkNetCall.getEntrypoint();
                java.lang.String str = entrypoint != null ? entrypoint : "";
                java.util.List<java.lang.String> calldata = starkNetCall.getCalldata();
                if (calldata == null) {
                    calldata = yDY.AhwBna();
                }
                arrayList.add(new StarknetCall(contractAddress, str, calldata));
            }
        }
        return new StarknetContractTransaction(strHtlTjW, strCopydefault, strOLrzqt, strKWHzl, strAEQbTJ, strCopydefault2, strValueOf, strEZpvd, arrayList == null ? yDY.AhwBna() : arrayList);
    }
}
