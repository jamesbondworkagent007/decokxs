package o;

import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59454zhO extends C59457zhR {
    public static char zLjUOn(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static java.lang.Character wlaJM(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            return null;
        }
        return java.lang.Character.valueOf(charSequence.charAt(0));
    }

    public static java.lang.Character AhwBna(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return java.lang.Character.valueOf(charSequence.charAt(i));
    }

    public static char zsXlph(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(StringsKt__StringsKt.fIwbmz(charSequence));
    }

    public static java.lang.Character gHZMYf(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            return null;
        }
        return java.lang.Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static char OLrzqt(@NotNull java.lang.CharSequence charSequence, @NotNull kotlin.random.Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(random.nextInt(charSequence.length()));
    }

    public static char sSMYrx(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new java.lang.IllegalArgumentException("Char sequence has more than one element.");
    }

    public static java.lang.String fetchVPNInfo(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        java.lang.String strSubstring = str.substring(C56548yJl.valueOf(i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static java.lang.String DbNXlk(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        return AkhnZx(str, C56548yJl.copydefault(str.length() - i, 0));
    }

    public static java.lang.String AkhnZx(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        java.lang.String strSubstring = str.substring(0, C56548yJl.valueOf(i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static java.lang.String isConnected(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        java.lang.String strSubstring = str.substring(length - C56548yJl.valueOf(i, length));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static java.lang.CharSequence AwvSrB(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new java.lang.StringBuilder(charSequence).reverse();
    }

    public static <C extends java.util.Collection<? super java.lang.Character>> C KWHzl(@NotNull java.lang.CharSequence charSequence, @NotNull C c) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(c, "");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(java.lang.Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    public static final java.util.Iterator DTwDnp(java.lang.CharSequence charSequence) {
        return StringsKt__StringsKt.ejfBZ(charSequence);
    }

    public static java.lang.Iterable<IndexedValue<java.lang.Character>> ORxRYg(@NotNull final java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new C56417yEp(new Function0() { // from class: o.zhT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C59454zhO.DTwDnp(charSequence);
            }
        });
    }

    public static java.util.List<java.lang.String> AYXKKw(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return copydefault(charSequence, i, i, true);
    }

    public static /* synthetic */ java.util.List windowed$default(java.lang.CharSequence charSequence, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return copydefault(charSequence, i, i2, z);
    }

    public static final java.lang.String AxsJAY(java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return charSequence.toString();
    }

    public static final java.util.List<java.lang.String> copydefault(@NotNull java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return copydefault(charSequence, i, i2, z, new Function1() { // from class: o.zhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59454zhO.AxsJAY((java.lang.CharSequence) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List windowed$default(java.lang.CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return copydefault(charSequence, i, i2, z, function1);
    }

    public static final <R> java.util.List<R> copydefault(@NotNull java.lang.CharSequence charSequence, int i, int i2, boolean z, @NotNull Function1<? super java.lang.CharSequence, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        yEH.KWHzl(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(function1.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    public static /* synthetic */ Sequence windowedSequence$default(java.lang.CharSequence charSequence, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return AEQbTJ(charSequence, i, i2, z);
    }

    public static final Sequence<java.lang.String> AEQbTJ(@NotNull java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return OLrzqt(charSequence, i, i2, z, new Function1() { // from class: o.zhP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59454zhO.zuBGHE((java.lang.CharSequence) obj);
            }
        });
    }

    public static final java.lang.String zuBGHE(java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return charSequence.toString();
    }

    public static /* synthetic */ Sequence windowedSequence$default(java.lang.CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return OLrzqt(charSequence, i, i2, z, function1);
    }

    public static final <R> Sequence<R> OLrzqt(@NotNull final java.lang.CharSequence charSequence, final int i, int i2, boolean z, @NotNull final Function1<? super java.lang.CharSequence, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        yEH.KWHzl(i, i2);
        return C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(C56548yJl.AEQbTJ(z ? StringsKt__StringsKt.fJNWhG(charSequence) : C56548yJl.AhwBna(0, (charSequence.length() - i) + 1), i2)), new Function1() { // from class: o.zhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59454zhO.EZpvd(i, charSequence, function1, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final java.lang.Object EZpvd(int i, java.lang.CharSequence charSequence, Function1 function1, int i2) {
        int length = i + i2;
        if (length < 0 || length > charSequence.length()) {
            length = charSequence.length();
        }
        return function1.invoke(charSequence.subSequence(i2, length));
    }
}
