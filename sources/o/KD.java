package o;

import com.amplitude.core.platform.Plugin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KD implements com.amplitude.core.platform.Plugin {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public JZ KWHzl;
    public final Plugin.Type OLrzqt = Plugin.Type.Enrichment;

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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
    }

    @Override // com.amplitude.core.platform.Plugin
    public C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        java.util.Map<java.lang.String, java.lang.Object> newProxyInstance = c5242Ke.getNewProxyInstance();
        if (newProxyInstance != null && (obj = newProxyInstance.get("ampli")) != null) {
            try {
                java.lang.Object obj2 = ((java.util.Map) obj).get("ingestionMetadata");
                Intrinsics.copydefault(obj2, "");
                java.util.Map map = (java.util.Map) obj2;
                c5242Ke.copydefault(new C5246Ki((java.lang.String) map.get("sourceName"), (java.lang.String) map.get("sourceVersion")));
            } catch (java.lang.Throwable unused) {
            }
        }
        return c5242Ke;
    }
}
