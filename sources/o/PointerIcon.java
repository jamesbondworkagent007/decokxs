package o;

import kotlin.jvm.internal.Intrinsics;
import o.Factory2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PointerIcon implements InterfaceC5053Cx {
    public final Factory2.Application OLrzqt;

    public PointerIcon(@NotNull Factory2.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = application;
    }

    @Override // o.InterfaceC5053Cx
    public InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "aws.auth#sigv4")) {
            return this.OLrzqt.EZpvd();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smithy.api#noAuth")) {
            return C2914Ac.OLrzqt;
        }
        throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(str)) + " not configured for client").toString());
    }
}
