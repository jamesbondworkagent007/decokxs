package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C52643wT {
    public final java.lang.String AYXKKw;
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final java.lang.String AEQbTJ = EZpvd("smithy.api#noAuth");
    public static final java.lang.String AhwBna = EZpvd("smithy.api#httpBasicAuth");
    public static final java.lang.String valueOf = EZpvd("smithy.api#httpDigestAuth");
    public static final java.lang.String gEmmrt = EZpvd("smithy.api#httpBearerAuth");
    public static final java.lang.String EZpvd = EZpvd("smithy.api#httpApiKeyAuth");
    public static final java.lang.String KWHzl = EZpvd("aws.auth#sigv4");
    public static final java.lang.String copydefault = EZpvd("aws.auth#sigv4a");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String AEQbTJ(java.lang.String str) {
        return "AuthSchemeId(id=" + str + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean KWHzl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof C52643wT) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((C52643wT) obj).OLrzqt());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.wT.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C52643wT copydefault(java.lang.String str) {
        return new C52643wT(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return KWHzl(this.AYXKKw, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return KWHzl(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return AEQbTJ(this.AYXKKw);
    }

    /* JADX INFO: renamed from: o.wT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String copydefault() {
            return C52643wT.AEQbTJ;
        }

        public final java.lang.String OLrzqt() {
            return C52643wT.KWHzl;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.wT.copydefault(java.lang.String):o.wT] */
    public /* synthetic */ C52643wT(java.lang.String str) {
        this.AYXKKw = str;
    }
}
