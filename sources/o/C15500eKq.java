package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15500eKq extends C15489eKf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15500eKq(@NotNull TxRecord txRecord) {
        super(txRecord);
        Intrinsics.checkNotNullParameter(txRecord, "");
    }

    @Override // o.C15489eKf
    public java.lang.String fetchVPNInfo() {
        switch (AuCTel().getTxType()) {
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
    }

    @Override // o.C15489eKf
    public java.lang.String values() {
        int txType = AuCTel().getTxType();
        if (txType == 20) {
            return isConnected();
        }
        if (txType == 21) {
            return EZpvd();
        }
        java.lang.String contractName = AuCTel().getContractName();
        if (contractName != null && C33129mqd.OLrzqt((java.lang.CharSequence) contractName)) {
            java.lang.String contractName2 = AuCTel().getContractName();
            return contractName2 == null ? "" : contractName2;
        }
        return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
    }
}
