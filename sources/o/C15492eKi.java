package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15492eKi extends C15489eKf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15492eKi(@NotNull TxRecord txRecord) {
        super(txRecord);
        Intrinsics.checkNotNullParameter(txRecord, "");
    }

    @Override // o.C15489eKf
    public java.lang.String fetchVPNInfo() {
        switch (AuCTel().getTxType()) {
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zAEkPU);
    }

    @Override // o.C15489eKf
    public java.lang.String values() {
        if (AuCTel().getTxType() == 34 || AuCTel().getTxType() == 33) {
            return C14079deg.EZpvd.copydefault(AuCTel().getPoolId());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel().getContractName())) {
            java.lang.String contractName = AuCTel().getContractName();
            return contractName == null ? "" : contractName;
        }
        return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
    }
}
