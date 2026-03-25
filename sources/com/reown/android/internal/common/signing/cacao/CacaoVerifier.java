package com.reown.android.internal.common.signing.cacao;

import com.reown.android.cacao.signature.SignatureType;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.signing.signature.Signature;
import com.reown.android.internal.common.signing.signature.SignatureKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C60088zvK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CacaoVerifier {
    public final ProjectId projectId;

    public CacaoVerifier(@NotNull ProjectId projectId) {
        Intrinsics.checkNotNullParameter(projectId, "");
        this.projectId = projectId;
    }

    public final boolean verify(@NotNull Cacao cacao) {
        Intrinsics.checkNotNullParameter(cacao, "");
        String t = cacao.getSignature().getT();
        if (Intrinsics.EZpvd((Object) t, (Object) SignatureType.EIP191.getHeader()) || Intrinsics.EZpvd((Object) t, (Object) SignatureType.EIP1271.getHeader())) {
            String cAIP222Message$default = CacaoKt.toCAIP222Message$default(cacao.getPayload(), null, 1, null);
            byte[] bytes = CacaoKt.toCAIP222Message$default(cacao.getPayload(), null, 1, null).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strKWHzl = C60088zvK.KWHzl(bytes);
            String address = new Issuer(cacao.getPayload().getIss()).getAddress();
            if (SignatureKt.verify(CacaoKt.toSignature(cacao.getSignature()), cAIP222Message$default, address, cacao.getSignature().getT(), this.projectId)) {
                return true;
            }
            Signature signature = CacaoKt.toSignature(cacao.getSignature());
            Intrinsics.copydefault((Object) strKWHzl);
            return SignatureKt.verify(signature, strKWHzl, address, cacao.getSignature().getT(), this.projectId);
        }
        throw new RuntimeException("Invalid header");
    }
}
