package o;

import com.okinc.oklive.app.domain.model.sdk.VeLivePlayerFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sTC {
    public static final sTC KWHzl = new sTC();

    private sTC() {
    }

    public final VeLivePlayerFormat copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.valueOf(str, ".sdp", true) ? VeLivePlayerFormat.RTM : C59449zhJ.valueOf(str, ".m3u8", true) ? VeLivePlayerFormat.HLS : C59449zhJ.valueOf(str, ".flv", true) ? VeLivePlayerFormat.FLV : C59449zhJ.AYXKKw(str, "rtmp://", true) ? VeLivePlayerFormat.RTM : VeLivePlayerFormat.FLV;
    }
}
