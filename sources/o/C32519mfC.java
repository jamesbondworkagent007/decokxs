package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.experiment.AbTestInstance;

/* JADX INFO: renamed from: o.mfC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32519mfC implements InterfaceC32861mla {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.mfC$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AmplitudeName.values().length];
            try {
                iArr[AmplitudeName.CEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AmplitudeName.WEB3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32861mla
    public void EZpvd(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
    }

    /* JADX INFO: renamed from: o.mfC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mfC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC32861mla
    public void KWHzl(@NotNull AmplitudeName amplitudeName) {
        AbTestInstance abTestInstance;
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        try {
            int i = Application.KWHzl[amplitudeName.ordinal()];
            if (i == 1) {
                abTestInstance = AbTestInstance.CEFI;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                abTestInstance = AbTestInstance.WEB3;
            }
            C2348AIh.notifyAbtestUpdated(abTestInstance);
            pUU.EZpvd("OKCoreABTestCallback", "Notified Rust layer about ABTest change for " + amplitudeName);
        } catch (java.lang.Exception e) {
            pUU.valueOf("OKCoreABTestCallback", "Failed to notify Rust layer about change: " + e.getMessage());
        }
    }
}
