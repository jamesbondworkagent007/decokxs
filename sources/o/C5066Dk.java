package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5066Dk {
    public static final okio.Buffer EZpvd(@NotNull CQ cq) {
        Intrinsics.checkNotNullParameter(cq, "");
        return cq.OLrzqt();
    }

    public static final CQ AEQbTJ(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "");
        return new CQ(buffer);
    }

    public static final Source copydefault(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        return interfaceC5060De instanceof C5065Dj ? ((C5065Dj) interfaceC5060De).OLrzqt() : new C5071Dp(interfaceC5060De);
    }

    public static final Sink KWHzl(@NotNull InterfaceC5058Dc interfaceC5058Dc) {
        Intrinsics.checkNotNullParameter(interfaceC5058Dc, "");
        return interfaceC5058Dc instanceof C5063Dh ? ((C5063Dh) interfaceC5058Dc).copydefault() : new C5072Dq(interfaceC5058Dc);
    }

    public static final InterfaceC5058Dc copydefault(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "");
        return sink instanceof C5072Dq ? ((C5072Dq) sink).EZpvd() : new C5063Dh(sink);
    }

    public static final InterfaceC5060De EZpvd(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "");
        return source instanceof C5071Dp ? ((C5071Dp) source).KWHzl() : new C5065Dj(source);
    }
}
