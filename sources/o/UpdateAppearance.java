package o;

import kotlin.jvm.internal.Intrinsics;
import o.MovementMethod;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateAppearance implements InterfaceC5053Cx {
    public final MovementMethod.TaskDescription AEQbTJ;

    public UpdateAppearance(@NotNull MovementMethod.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AEQbTJ = taskDescription;
    }

    @Override // o.InterfaceC5053Cx
    public InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "aws.auth#sigv4")) {
            return this.AEQbTJ.copydefault();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smithy.api#noAuth")) {
            return C2914Ac.OLrzqt;
        }
        throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(str)) + " not configured for client").toString());
    }
}
