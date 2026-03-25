package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PushbackReader {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PushbackReader copy$default(PushbackReader pushbackReader, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pushbackReader.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = pushbackReader.OLrzqt;
        }
        return pushbackReader.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushbackReader KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PushbackReader(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushbackReader)) {
            return false;
        }
        PushbackReader pushbackReader = (PushbackReader) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pushbackReader.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pushbackReader.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public PushbackReader(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PushbackReader.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final PushbackReader OLrzqt(@NotNull HM hm) {
            Intrinsics.checkNotNullParameter(hm, "");
            java.lang.String strOLrzqt = hm.OLrzqt("aws.frameworkMetadata");
            if (strOLrzqt == null) {
                strOLrzqt = hm.EZpvd("AWS_FRAMEWORK_METADATA");
            }
            if (strOLrzqt == null) {
                return null;
            }
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new char[]{AbstractJsonLexerKt.COLON}, false, 2, 2, (java.lang.Object) null);
            if (listSplit$default.size() != 2) {
                throw new java.lang.IllegalStateException(("Invalid value for FRAMEWORK_METADATA: " + strOLrzqt + "; must be of the form `name:version`").toString());
            }
            return new PushbackReader((java.lang.String) listSplit$default.get(0), (java.lang.String) listSplit$default.get(1));
        }
    }

    public java.lang.String toString() {
        return Reader.AEQbTJ("lib", this.KWHzl, this.OLrzqt);
    }
}
