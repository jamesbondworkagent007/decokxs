package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35562nxh implements java.lang.Comparable<C35562nxh> {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35562nxh copy$default(C35562nxh c35562nxh, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c35562nxh.KWHzl;
        }
        if ((i4 & 2) != 0) {
            i2 = c35562nxh.EZpvd;
        }
        if ((i4 & 4) != 0) {
            i3 = c35562nxh.AEQbTJ;
        }
        return c35562nxh.copydefault(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35562nxh copydefault(int i, int i2, int i3) {
        return new C35562nxh(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35562nxh)) {
            return false;
        }
        C35562nxh c35562nxh = (C35562nxh) obj;
        return this.KWHzl == c35562nxh.KWHzl && this.EZpvd == c35562nxh.EZpvd && this.AEQbTJ == c35562nxh.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    public C35562nxh(int i, int i2, int i3) {
        this.KWHzl = i;
        this.EZpvd = i2;
        this.AEQbTJ = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C35562nxh(@NotNull java.lang.String str) {
        java.lang.Integer intOrNull;
        java.lang.Integer intOrNull2;
        java.lang.Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue = 0;
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null), 0);
        int iIntValue2 = (str2 == null || (intOrNull3 = StringsKt__StringNumberConversionsKt.toIntOrNull(str2)) == null) ? 0 : intOrNull3.intValue();
        java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null), 1);
        int iIntValue3 = (str3 == null || (intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue();
        java.lang.String str4 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null), 2);
        if (str4 != null && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str4)) != null) {
            iIntValue = intOrNull.intValue();
        }
        this(iIntValue2, iIntValue3, iIntValue);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C35562nxh c35562nxh) {
        Intrinsics.checkNotNullParameter(c35562nxh, "");
        int i = this.KWHzl;
        int i2 = c35562nxh.KWHzl;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.EZpvd;
        int i4 = c35562nxh.EZpvd;
        return i3 != i4 ? i3 - i4 : this.AEQbTJ - c35562nxh.AEQbTJ;
    }

    public java.lang.String toString() {
        return this.KWHzl + JwtUtilsKt.JWT_DELIMITER + this.EZpvd + JwtUtilsKt.JWT_DELIMITER + this.AEQbTJ;
    }
}
