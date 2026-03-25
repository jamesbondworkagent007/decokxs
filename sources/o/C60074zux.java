package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C59449zhJ;
import o.C60076zuz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60074zux {
    public final java.util.List<C60076zuz> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zux */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C60074zux copy$default(C60074zux c60074zux, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c60074zux.KWHzl;
        }
        return c60074zux.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60074zux AEQbTJ(@NotNull java.util.List<C60076zuz> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C60074zux(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C60076zuz> OLrzqt() {
        return this.KWHzl;
    }

    public C60074zux(@NotNull java.util.List<C60076zuz> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C60074zux(@NotNull final java.lang.String str) {
        java.util.List listZuBGHE;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = C60075zuy.EZpvd(str);
        if (strEZpvd.length() == 0) {
            listZuBGHE = yDY.AhwBna();
        } else {
            listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(StringsKt__StringsKt.split$default((java.lang.CharSequence) strEZpvd, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null)), new Function1<java.lang.String, C60076zuz>() { // from class: org.komputing.kbip44.BIP44$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final C60076zuz invoke(@NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    boolean zEndsWith$default = C59449zhJ.endsWith$default(str2, "'", false, 2, null);
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(StringsKt__StringsKt.EZpvd(str2, (CharSequence) "'"));
                    if (intOrNull != null) {
                        return new C60076zuz(zEndsWith$default, intOrNull.intValue());
                    }
                    throw new IllegalArgumentException("not a number '" + str2 + "' in path " + str);
                }
            }));
        }
        this((java.util.List<C60076zuz>) listZuBGHE);
    }

    public boolean equals(java.lang.Object obj) {
        C60074zux c60074zux = obj instanceof C60074zux ? (C60074zux) obj : null;
        return Intrinsics.EZpvd(c60074zux != null ? c60074zux.KWHzl : null, this.KWHzl);
    }

    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    public java.lang.String toString() {
        return StringsKt__StringsKt.EZpvd(Intrinsics.KWHzl("m/", CollectionsKt___CollectionsKt.joinToString$default(this.KWHzl, "/", null, null, 0, null, new Function1<C60076zuz, java.lang.CharSequence>() { // from class: org.komputing.kbip44.BIP44$toString$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:int:INVOKE), 39 */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(@NotNull C60076zuz c60076zuz) {
                Intrinsics.checkNotNullParameter(c60076zuz, "");
                if (!c60076zuz.EZpvd()) {
                    return String.valueOf(c60076zuz.copydefault());
                }
                StringBuilder sb = new StringBuilder();
                sb.append(c60076zuz.copydefault());
                sb.append('\'');
                return sb.toString();
            }
        }, 30, null)), (java.lang.CharSequence) "/");
    }
}
