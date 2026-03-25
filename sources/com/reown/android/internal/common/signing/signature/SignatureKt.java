package com.reown.android.internal.common.signing.signature;

import com.reown.android.cacao.signature.SignatureType;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.reown.android.internal.common.signing.eip191.EIP191Verifier;
import com.reown.utils.UtilFunctionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.C60091zvN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class SignatureKt {
    public static final /* synthetic */ Signature toSignature(C60091zvN.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        byte[] bArrCopydefault = taskDescription.copydefault();
        Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
        byte[] bArrEZpvd = taskDescription.EZpvd();
        Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
        byte[] bArrKWHzl = taskDescription.KWHzl();
        Intrinsics.checkNotNullExpressionValue(bArrKWHzl, "");
        return new Signature(bArrCopydefault, bArrEZpvd, bArrKWHzl);
    }

    public static final String toCacaoSignature(@NotNull Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "");
        return UtilFunctionsKt.getHexPrefix(C56529yIt.KWHzl) + com.reown.util.UtilFunctionsKt.bytesToHex(signature.getR()) + com.reown.util.UtilFunctionsKt.bytesToHex(signature.getS()) + com.reown.util.UtilFunctionsKt.bytesToHex(signature.getV());
    }

    public static final /* synthetic */ C60091zvN.TaskDescription toSignatureData(Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "");
        return new C60091zvN.TaskDescription(signature.getV(), signature.getR(), signature.getS());
    }

    public static final /* synthetic */ boolean verify(Signature signature, String str, String str2, String str3, ProjectId projectId) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        if (Intrinsics.EZpvd((Object) str3, (Object) SignatureType.EIP191.getHeader())) {
            return EIP191Verifier.INSTANCE.verify(signature, str, str2);
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) SignatureType.EIP1271.getHeader())) {
            return EIP1271Verifier.INSTANCE.verify(signature, str, str2, projectId.getValue());
        }
        throw new RuntimeException("Invalid signature type");
    }

    public static final /* synthetic */ boolean verifyHexMessage(Signature signature, String str, String str2, String str3, ProjectId projectId) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        if (Intrinsics.EZpvd((Object) str3, (Object) SignatureType.EIP191.getHeader())) {
            return EIP191Verifier.INSTANCE.verifyHex(signature, str, str2);
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) SignatureType.EIP1271.getHeader())) {
            return EIP1271Verifier.INSTANCE.verifyHex(signature, str, str2, projectId.getValue());
        }
        throw new RuntimeException("Invalid signature type");
    }
}
