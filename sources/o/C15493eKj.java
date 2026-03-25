package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15493eKj extends C15489eKf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15493eKj(@NotNull TxRecord txRecord) {
        super(txRecord);
        Intrinsics.checkNotNullParameter(txRecord, "");
    }

    @Override // o.C15489eKf
    public java.lang.String fetchVPNInfo() {
        int txType = AuCTel().getTxType();
        if (txType == 32 || txType == 35) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.tIwhY);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.tIwhY);
    }

    @Override // o.C15489eKf
    public java.lang.String values() {
        if (AuCTel().getTxType() == 35) {
            return C14079deg.EZpvd.copydefault(AuCTel().getPoolId());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel().getContractName())) {
            java.lang.String contractName = AuCTel().getContractName();
            return contractName == null ? "" : contractName;
        }
        return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
    }
}
