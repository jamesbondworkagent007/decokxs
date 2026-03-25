package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43363rnq {
    public static volatile C43363rnq OLrzqt;
    public java.lang.String KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.KWHzl = null;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            pUU.EZpvd("ChainRPCAdapter", "ignore empty httpHost");
            return;
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            if ((!listSplit$default.isEmpty()) && !Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) this.KWHzl)) {
                java.lang.String str2 = (java.lang.String) listSplit$default.get(0);
                this.KWHzl = str2;
                pUU.EZpvd("ChainRPCAdapter", "update http prefix to " + str2 + ", full is " + str);
                return;
            }
            pUU.EZpvd("ChainRPCAdapter", "ignore httpHost is missing '.', ignore ");
        }
    }

    public final boolean AEQbTJ() {
        java.lang.String str = this.KWHzl;
        return str == null || str.length() == 0;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String str2 = (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null).get(0);
            return str2.length() == 0 ? str : C59449zhJ.replaceFirst$default(str, str2, "chainrpc", false, 4, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("ChainRPCAdapter", "toChainRPCUrl,e:" + e);
            return str;
        }
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.KWHzl;
        return (str2 == null || str2.length() == 0) ? str : C59449zhJ.replaceFirst$default(str, "chainrpc", str2, false, 4, (java.lang.Object) null);
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return false;
        }
        return C59449zhJ.startsWith$default(str, "chainrpc.", false, 2, null);
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return false;
        }
        return C43292rmY.OLrzqt.wlaJM().contains(str);
    }

    /* JADX INFO: renamed from: o.rnq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C43363rnq copydefault() {
            C43363rnq c43363rnq = C43363rnq.OLrzqt;
            if (c43363rnq == null) {
                synchronized (this) {
                    c43363rnq = C43363rnq.OLrzqt;
                    if (c43363rnq == null) {
                        c43363rnq = new C43363rnq();
                        TaskDescription taskDescription = C43363rnq.Companion;
                        C43363rnq.OLrzqt = c43363rnq;
                    }
                }
            }
            return c43363rnq;
        }
    }
}
