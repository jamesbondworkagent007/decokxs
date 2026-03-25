package o;

import com.google.common.base.Ascii;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C60033zuI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60033zuI {
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:char:INVOKE), (wrap:char:INVOKE) */
    public static final java.lang.String KWHzl(byte b) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("0123456789abcdef".charAt((b >> 4) & 15));
        sb.append("0123456789abcdef".charAt(b & Ascii.SI));
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String encode$default(byte[] bArr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = EIP1271Verifier.hexPrefix;
        }
        return copydefault(bArr, str);
    }

    public static final java.lang.String copydefault(@NotNull byte[] bArr, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.KWHzl(str, yDV.joinToString$default(bArr, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) new Function1<java.lang.Byte, java.lang.CharSequence>() { // from class: org.komputing.khex.HexKt$encode$1
            public final CharSequence invoke(byte b) {
                return C60033zuI.KWHzl(b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (java.lang.Object) null));
    }
}
