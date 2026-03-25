package com.reown.android.internal.common.signing.message;

import com.reown.android.cacao.signature.SignatureType;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.signing.signature.Signature;
import com.reown.android.internal.common.signing.signature.SignatureKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class MessageSignatureVerifier {
    public final ProjectId projectId;

    public MessageSignatureVerifier(@NotNull ProjectId projectId) {
        Intrinsics.checkNotNullParameter(projectId, "");
        this.projectId = projectId;
    }

    public final boolean verify(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull SignatureType signatureType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(signatureType, "");
        return SignatureKt.verify(Signature.Companion.fromString(str), str2, str3, signatureType.getHeader(), this.projectId);
    }
}
