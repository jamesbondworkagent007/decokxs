package org.kethereum.crypto.impl.ec;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59924zsF;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes24.dex */
public final class EllipticCurvePointKt {
    public static final InterfaceC59924zsF copydefault(@NotNull ECPoint eCPoint) {
        Intrinsics.checkNotNullParameter(eCPoint, "");
        return new EllipticCurvePoint(eCPoint);
    }
}
