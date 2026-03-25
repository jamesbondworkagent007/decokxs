package com.reown.android.internal.common.signing.eip191;

import com.reown.android.internal.common.signing.cacao.UtilsKt;
import com.reown.android.internal.common.signing.signature.Signature;
import com.reown.android.internal.common.signing.signature.SignatureKt;
import java.security.SignatureException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C59449zhJ;
import o.C60083zvF;
import o.C60088zvK;
import o.C60091zvN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EIP191Verifier {
    public static final EIP191Verifier INSTANCE = new EIP191Verifier();

    public final boolean verify(@NotNull Signature signature, @NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.gEmmrt(getAddressUsedToSignPrefixedMessage(SignatureKt.toSignatureData(signature), bArr), UtilsKt.guaranteeNoHexPrefix(str), true);
    }

    public final boolean verifyHex(@NotNull Signature signature, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrCopydefault = C60088zvK.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        return verify(signature, bArrCopydefault, str2);
    }

    public final boolean verify(@NotNull Signature signature, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return verify(signature, bytes, str2);
    }

    public final boolean verifyNoPrefix(@NotNull Signature signature, @NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.gEmmrt(getAddressUsedToSignMessage(SignatureKt.toSignatureData(signature), bArr), UtilsKt.guaranteeNoHexPrefix(str), true);
    }

    public final boolean verifyNoPrefix(@NotNull Signature signature, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return verifyNoPrefix(signature, bytes, str2);
    }

    public final boolean verifyHexMessagePrefix(@NotNull Signature signature, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrCopydefault = C60088zvK.copydefault(str);
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        return verifyNoPrefix(signature, bArrCopydefault, str2);
    }

    public final String getAddressUsedToSignPrefixedMessage(C60091zvN.TaskDescription taskDescription, byte[] bArr) throws SignatureException {
        String strAEQbTJ = C60083zvF.AEQbTJ(C60091zvN.EZpvd(bArr, taskDescription).toString(16));
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    public final String getAddressUsedToSignMessage(C60091zvN.TaskDescription taskDescription, byte[] bArr) throws SignatureException {
        String strAEQbTJ = C60083zvF.AEQbTJ(C60091zvN.KWHzl(bArr, taskDescription).toString(16));
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }
}
