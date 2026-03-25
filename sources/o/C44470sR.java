package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC44254sJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C44470sR implements InterfaceC5053Cx {
    public final InterfaceC44254sJ.Application copydefault;

    public C44470sR(@NotNull InterfaceC44254sJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
    }

    @Override // o.InterfaceC5053Cx
    public InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "aws.auth#sigv4")) {
            return this.copydefault.copydefault();
        }
        throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(str)) + " not configured for client").toString());
    }
}
