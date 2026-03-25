package o;

import com.okinc.components.security.api.RiskLevel;
import com.okinc.components.security.scanner.DeviceScanner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32803mkV extends AbstractC43215rlA implements InterfaceC32807mkZ {
    @yCM
    public C32803mkV() {
    }

    @Override // o.InterfaceC32807mkZ
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        DeviceScanner.Companion.KWHzl(context, str);
    }

    @Override // o.InterfaceC32807mkZ
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        DeviceScanner.StateListAnimator.checkDeviceSecurityStatus$default(DeviceScanner.Companion, context, null, 2, null);
    }

    @Override // o.InterfaceC32807mkZ
    public void EZpvd() {
        ServiceC32756mjb.Companion.KWHzl();
    }

    @Override // o.InterfaceC32807mkZ
    public boolean KWHzl(java.util.List<java.lang.String> list) {
        return C32757mjc.Companion.OLrzqt(list);
    }

    @Override // o.InterfaceC32807mkZ
    public RiskLevel EZpvd(java.util.List<java.lang.String> list) {
        return C32757mjc.Companion.copydefault(list);
    }

    @Override // o.InterfaceC32807mkZ
    public boolean KWHzl() {
        return new C32687miL().KWHzl();
    }

    @Override // o.InterfaceC32807mkZ
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return DeviceScanner.Companion.KWHzl(str);
    }
}
