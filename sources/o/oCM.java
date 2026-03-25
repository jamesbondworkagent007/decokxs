package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCM {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final sMW KWHzl;

    @yCM
    public oCM(@NotNull sMW smw) {
        Intrinsics.checkNotNullParameter(smw, "");
        this.KWHzl = smw;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("CacheCurrentConversationUseCase", "cache current conversation for notification: " + str);
        this.KWHzl.KWHzl(str);
    }
}
