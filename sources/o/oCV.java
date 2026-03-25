package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCV {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final oGM EZpvd;

    @yCM
    public oCV(@NotNull oGM ogm) {
        Intrinsics.checkNotNullParameter(ogm, "");
        this.EZpvd = ogm;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.String KWHzl() {
        java.lang.String strAEQbTJ = this.EZpvd.AEQbTJ();
        if (strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            return null;
        }
        return "send_confirmation_dialog_do_not_show_next_time_" + strAEQbTJ;
    }
}
