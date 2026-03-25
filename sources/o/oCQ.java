package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCQ {
    public final oGM EZpvd;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oCQ(@NotNull oGM ogm) {
        Intrinsics.checkNotNullParameter(ogm, "");
        this.EZpvd = ogm;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strAEQbTJ = this.EZpvd.AEQbTJ();
        if (strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            return null;
        }
        return "leave_this_chat_dialog_do_not_show_next_time_" + strAEQbTJ;
    }
}
