package o;

import com.amplitude.core.platform.Plugin;
import com.amplitude.eventbridge.EventChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KF implements com.amplitude.core.platform.Plugin {
    public JZ KWHzl;
    public final Plugin.Type OLrzqt = Plugin.Type.Before;
    public InterfaceC5277Ln copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.KWHzl = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.OLrzqt;
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        this.copydefault = C5278Lo.Companion.OLrzqt(jz.djBIcL().fetchVPNInfo()).KWHzl();
    }

    @Override // com.amplitude.core.platform.Plugin
    public C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        if (c5242Ke.OLrzqt() != null) {
            InterfaceC5277Ln interfaceC5277Ln = this.copydefault;
            if (interfaceC5277Ln == null) {
                Intrinsics.gEmmrt("");
                interfaceC5277Ln = null;
            }
            interfaceC5277Ln.AEQbTJ(EventChannel.IDENTIFY, KG.AEQbTJ(c5242Ke));
        }
        return c5242Ke;
    }
}
