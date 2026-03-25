package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.kethereum.crypto.impl.hashing.DigestParams;
import org.kethereum.crypto.impl.kdf.PBKDF2;

/* JADX INFO: renamed from: o.zsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59962zsr {
    /* JADX INFO: renamed from: toSeed-HcQnx6Y$default, reason: not valid java name */
    public static /* synthetic */ byte[] m9316toSeedHcQnx6Y$default(java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return EZpvd(list, str);
    }

    public static final byte[] EZpvd(@NotNull java.util.List<? extends java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, " ", null, null, 0, null, null, 62, null);
        java.lang.String strKWHzl = Intrinsics.KWHzl("mnemonic", str);
        PBKDF2 pbkdf2KWHzl = C59964zst.OLrzqt.KWHzl();
        char[] charArray = strJoinToString$default.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        byte[] bytes = strKWHzl.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return C59965zsu.KWHzl(PBKDF2.DefaultImpls.derive$default(pbkdf2KWHzl, charArray, bytes, 0, (DigestParams) null, 12, (java.lang.Object) null));
    }

    /* JADX INFO: renamed from: toKey-aHn7skU$default, reason: not valid java name */
    public static /* synthetic */ C59966zsv m9315toKeyaHn7skU$default(java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return KWHzl(list, str, str2);
    }

    public static final C59966zsv KWHzl(@NotNull java.util.List<? extends java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C59960zsp.m9313toKeyoOkmR4Q$default(EZpvd(list, str2), str, false, 2, null);
    }

    public static final java.lang.String KWHzl(@NotNull byte[] bArr, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (bArr.length % 4 > 0) {
            throw new java.lang.RuntimeException("Entropy not multiple of 32 bits.");
        }
        if (bArr.length == 0) {
            throw new java.lang.RuntimeException("Entropy is empty.");
        }
        boolean[] zArrEZpvd = C59929zsK.EZpvd(C60028zuD.AEQbTJ(bArr));
        boolean[] zArrEZpvd2 = C59929zsK.EZpvd(bArr);
        int length = zArrEZpvd2.length / 32;
        int length2 = zArrEZpvd2.length + length;
        boolean[] zArr = new boolean[length2];
        yDT.copyInto$default(zArrEZpvd2, zArr, 0, 0, 0, 14, (java.lang.Object) null);
        yDT.copyInto$default(zArrEZpvd, zArr, zArrEZpvd2.length, 0, length, 4, (java.lang.Object) null);
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) new java.util.ArrayList());
        int i = length2 / 11;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < 11; i4++) {
                i3 <<= 1;
                if (zArr[(i2 * 11) + i4]) {
                    i3 |= 1;
                }
            }
            listFJNWhG.add(list.get(i3));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(listFJNWhG, " ", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ java.lang.String generateMnemonic$default(int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 128;
        }
        return copydefault(i, list);
    }

    public static final java.lang.String copydefault(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (i % 32 != 0) {
            throw new java.lang.IllegalArgumentException("The entropy strength needs to be a multiple of 32".toString());
        }
        byte[] bArr = new byte[i / 8];
        new java.security.SecureRandom().nextBytes(bArr);
        return KWHzl(bArr, list);
    }
}
