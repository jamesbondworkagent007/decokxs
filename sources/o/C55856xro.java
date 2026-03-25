package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55856xro {
    public static final TaskDescription Companion = new TaskDescription(null);

    public final int AEQbTJ() {
        return 0;
    }

    public final int KWHzl() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return "%";
    }

    /* JADX INFO: renamed from: o.xro$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xro.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.String OLrzqt() {
        return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.copydefault, 2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "")));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.mulS$default(str, 100, null, null, null, 14, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.formatPercent$default(xMR.copydefault, str, 0, null, 4, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : C33129mqd.divS$default(str, 100, null, null, null, 14, null);
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.valueOf(str, C33129mqd.mulS$default("1.50", 100, null, null, null, 14, null));
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(str, C33129mqd.mulS$default("0", 100, null, null, null, 14, null));
    }

    public final boolean AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 1);
    }
}
