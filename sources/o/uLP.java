package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uLP {
    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt;
    public static final Application Companion = new Application(null);
    public static final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> AEQbTJ = EZpvd("--", "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int EZpvd(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return pair.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2) {
        return Intrinsics.EZpvd(pair, pair2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> OLrzqt(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return pair;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 kotlin.Pair) A[MD:(kotlin.Pair):void (m)] call: o.uLP.<init>(kotlin.Pair):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ uLP copydefault(kotlin.Pair pair) {
        return new uLP(pair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, java.lang.Object obj) {
        return (obj instanceof uLP) && Intrinsics.EZpvd(pair, ((uLP) obj).OLrzqt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String gEmmrt(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return "DisplayString(pair=" + pair + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ kotlin.Pair OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return copydefault(this.OLrzqt, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return EZpvd(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return gEmmrt(this.OLrzqt);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.uLP.copydefault(kotlin.Pair):o.uLP] */
    public /* synthetic */ uLP(kotlin.Pair pair) {
        this.OLrzqt = pair;
    }

    public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt(C56390yDp.OLrzqt(str, str2));
    }

    public static final java.lang.String AEQbTJ(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return pair.getFirst();
    }

    public static final java.lang.String KWHzl(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return pair.getSecond();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> OLrzqt() {
            return uLP.AEQbTJ;
        }
    }
}
