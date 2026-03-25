package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CX {
    public static final CO AEQbTJ(@NotNull InterfaceC5058Dc interfaceC5058Dc) {
        Intrinsics.checkNotNullParameter(interfaceC5058Dc, "");
        return interfaceC5058Dc instanceof CO ? (CO) interfaceC5058Dc : new CC(Okio.buffer(C5066Dk.KWHzl(interfaceC5058Dc)));
    }

    public static final CR copydefault(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        return interfaceC5060De instanceof CR ? (CR) interfaceC5060De : new CA(Okio.buffer(C5066Dk.copydefault(interfaceC5060De)));
    }

    public static final InterfaceC5060De EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new C5055Cz(bArr);
    }
}
