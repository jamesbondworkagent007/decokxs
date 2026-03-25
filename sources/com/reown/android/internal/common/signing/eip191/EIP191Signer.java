package com.reown.android.internal.common.signing.eip191;

import com.reown.android.internal.common.signing.signature.Signature;
import com.reown.android.internal.common.signing.signature.SignatureKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C60087zvJ;
import o.C60088zvK;
import o.C60091zvN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EIP191Signer {
    public static final EIP191Signer INSTANCE = new EIP191Signer();

    public final Signature sign(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        C60091zvN.TaskDescription taskDescriptionKWHzl = C60091zvN.KWHzl(bArr, C60087zvJ.KWHzl(bArr2));
        Intrinsics.checkNotNullExpressionValue(taskDescriptionKWHzl, "");
        return SignatureKt.toSignature(taskDescriptionKWHzl);
    }

    public final Signature sign(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return sign(bytes, bArr);
    }

    /* JADX INFO: renamed from: signHex-twYc3iQ, reason: not valid java name */
    public final Signature m7257signHextwYc3iQ(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopydefault = C60088zvK.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        return sign(bArrCopydefault, bArr);
    }

    public final Signature signNoPrefix(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        C60091zvN.TaskDescription taskDescriptionAEQbTJ = C60091zvN.AEQbTJ(bArr, C60087zvJ.KWHzl(bArr2));
        Intrinsics.checkNotNullExpressionValue(taskDescriptionAEQbTJ, "");
        return SignatureKt.toSignature(taskDescriptionAEQbTJ);
    }

    public final Signature signNoPrefix(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return signNoPrefix(bytes, bArr);
    }

    /* JADX INFO: renamed from: signHexNoPrefix-twYc3iQ, reason: not valid java name */
    public final Signature m7258signHexNoPrefixtwYc3iQ(@NotNull String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopydefault = C60088zvK.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        return signNoPrefix(bArrCopydefault, bArr);
    }
}
