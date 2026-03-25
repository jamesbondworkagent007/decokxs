package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5239Kb implements Logger {
    public static final Application Companion = new Application(null);
    public static final C5239Kb KWHzl = new C5239Kb();
    public Logger.LogMode copydefault = Logger.LogMode.INFO;
    public final java.lang.String OLrzqt = "Amplitude";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Logger.LogMode AEQbTJ() {
        return this.copydefault;
    }

    @Override // com.amplitude.common.Logger
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().compareTo(Logger.LogMode.DEBUG);
    }

    @Override // com.amplitude.common.Logger
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().compareTo(Logger.LogMode.ERROR);
    }

    @Override // com.amplitude.common.Logger
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().compareTo(Logger.LogMode.INFO);
    }

    @Override // com.amplitude.common.Logger
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().compareTo(Logger.LogMode.WARN);
    }

    /* JADX INFO: renamed from: o.Kb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Kb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C5239Kb KWHzl() {
            return C5239Kb.KWHzl;
        }
    }
}
