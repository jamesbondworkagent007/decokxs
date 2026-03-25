package o;

import kotlin.jvm.internal.Intrinsics;
import o.Character;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassCircularityError implements InterfaceC5053Cx {
    public final Character.Activity KWHzl;

    public ClassCircularityError(@NotNull Character.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
    }

    @Override // o.InterfaceC5053Cx
    public InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "aws.auth#sigv4")) {
            return this.KWHzl.AEQbTJ();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smithy.api#noAuth")) {
            return C2914Ac.OLrzqt;
        }
        throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(str)) + " not configured for client").toString());
    }
}
