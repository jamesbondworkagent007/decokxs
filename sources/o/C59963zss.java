package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59924zsF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59963zss {
    public static final C59926zsH copydefault(@NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        return new C59926zsH(bigInteger, C59919zsA.AEQbTJ(bigInteger), null);
    }

    public static final java.math.BigInteger copydefault(@NotNull InterfaceC59924zsF interfaceC59924zsF) {
        Intrinsics.checkNotNullParameter(interfaceC59924zsF, "");
        byte[] bArrEncoded$default = InterfaceC59924zsF.Application.encoded$default(interfaceC59924zsF, false, 1, null);
        return C59925zsG.AEQbTJ(new java.math.BigInteger(1, yDT.AEQbTJ(bArrEncoded$default, 1, bArrEncoded$default.length)));
    }
}
