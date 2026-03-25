package o;

import com.okinc.account.api.model.passkey.PasskeyCrossDeviceVerificationStatus;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: renamed from: o.sco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44751sco extends AbstractC43215rlA implements InterfaceC8166axc {
    public final java.lang.String EZpvd = C44751sco.class.getSimpleName();

    @yCM
    public C44751sco() {
    }

    @Override // o.InterfaceC8166axc
    public Flow<PasskeyCrossDeviceVerificationStatus> AEQbTJ() {
        java.lang.String str = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return FlowKt.flowOf((java.lang.Object[]) new PasskeyCrossDeviceVerificationStatus[0]);
    }
}
