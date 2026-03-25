package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17655fNj {
    public static final C17655fNj AEQbTJ = new C17655fNj();

    private C17655fNj() {
    }

    public final boolean KWHzl(boolean z, final long j, int i, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == 1) {
            j = -2000;
        } else if (i == 501) {
            j = -2002;
        }
        if (!z && str.length() == 0) {
            return true;
        }
        if (str.length() == 0) {
            return false;
        }
        return ((java.lang.Boolean) new Function0() { // from class: o.fNk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C17655fNj.copydefault(j, str));
            }
        }.invoke()).booleanValue();
    }

    public static final boolean copydefault(long j, java.lang.String str) {
        return xYW.AEQbTJ.AEQbTJ(j, str, "");
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 10) {
            return str;
        }
        java.lang.CharSequence charSequenceSubSequence = str.subSequence(0, 4);
        Intrinsics.copydefault(charSequenceSubSequence, "");
        java.lang.CharSequence charSequenceSubSequence2 = str.subSequence(str.length() - 4, str.length());
        Intrinsics.copydefault(charSequenceSubSequence2, "");
        return ((java.lang.String) charSequenceSubSequence) + "..." + ((java.lang.String) charSequenceSubSequence2);
    }
}
