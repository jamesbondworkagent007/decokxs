package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC27520jwj {
    void AEQbTJ(@NotNull java.lang.String str, @NotNull InvestTokenWithAmount investTokenWithAmount, boolean z);

    void uzCIH();

    void wlaJM();

    static /* synthetic */ void onInputChange$default(InterfaceC27520jwj interfaceC27520jwj, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInputChange");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        interfaceC27520jwj.AEQbTJ(str, investTokenWithAmount, z);
    }
}
