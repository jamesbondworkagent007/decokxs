package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dTU {
    public static /* synthetic */ void onWeb3Event$default(java.lang.String str, TrackChannel[] trackChannelArr, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        OLrzqt(str, trackChannelArr, z, function1);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, boolean z, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        ((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class)).AEQbTJ(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), function1, z);
    }

    public static /* synthetic */ void onWeb3Event$default(java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        OLrzqt(str, trackChannelArr, function1);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        OLrzqt(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), true, function1);
    }
}
