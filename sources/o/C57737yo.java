package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C57737yo<T> {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57737yo copy$default(C57737yo c57737yo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c57737yo.EZpvd;
        }
        return c57737yo.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57737yo<T> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C57737yo<>(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C57737yo) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C57737yo) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public C57737yo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            throw new java.lang.IllegalArgumentException("AttributeKey name must not be blank".toString());
        }
    }

    public java.lang.String toString() {
        return "AttributeKey(" + this.EZpvd + ')';
    }
}
