package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55815xr {
    public static final InterfaceC55285xh OLrzqt = new C55550xm(null, null, null, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC55285xh copydefault() {
        return OLrzqt;
    }

    public static final java.lang.String OLrzqt(@NotNull C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(c55338xi, "");
        return c55338xi.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED_DATE) + JsonPointer.SEPARATOR + c55338xi.AhwBna() + JsonPointer.SEPARATOR + c55338xi.djBIcL() + "/aws4_request";
    }

    public static final java.lang.String AEQbTJ(@NotNull C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(c55338xi, "");
        return c55338xi.OLrzqt().EZpvd() + JsonPointer.SEPARATOR + OLrzqt(c55338xi);
    }
}
