package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50052vAc {
    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 kotlin.Pair) A[MD:(kotlin.Pair):void (m)] call: o.vAc.<init>(kotlin.Pair):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C50052vAc EZpvd(kotlin.Pair pair) {
        return new C50052vAc(pair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, java.lang.Object obj) {
        return (obj instanceof C50052vAc) && Intrinsics.EZpvd(pair, ((C50052vAc) obj).KWHzl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return pair.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> copydefault(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String gEmmrt(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return "CoinAmount(pair=" + pair + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ kotlin.Pair KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return EZpvd(this.EZpvd, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return KWHzl(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return gEmmrt(this.EZpvd);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.vAc.EZpvd(kotlin.Pair):o.vAc] */
    public /* synthetic */ C50052vAc(kotlin.Pair pair) {
        this.EZpvd = pair;
    }

    public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(C56390yDp.OLrzqt(str, str2));
    }

    public static final java.lang.String OLrzqt(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return pair.getFirst();
    }

    public static final java.lang.String AEQbTJ(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
        return pair.getSecond();
    }
}
