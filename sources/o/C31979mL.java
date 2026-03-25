package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC31925mJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C31979mL implements InterfaceC5053Cx {
    public final InterfaceC31925mJ.StateListAnimator copydefault;

    public C31979mL(@NotNull InterfaceC31925mJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault = stateListAnimator;
    }

    @Override // o.InterfaceC5053Cx
    public InterfaceC5045Cp EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "aws.auth#sigv4")) {
            return this.copydefault.KWHzl();
        }
        throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(str)) + " not configured for client").toString());
    }
}
