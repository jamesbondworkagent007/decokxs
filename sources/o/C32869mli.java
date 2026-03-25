package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32869mli {
    public static /* synthetic */ void onNewOKexEventWithParams$default(java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32868mlh.OLrzqt.copydefault();
        }
        OLrzqt(str, trackChannelArr, function1);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C34704nhP.copydefault.copydefault()) {
            EventParamsList eventParamsList = new EventParamsList(5);
            C32872mll c32872mll = C32872mll.OLrzqt;
            function1.invoke(eventParamsList);
            java.lang.String[] strArrKWHzl = C32866mlf.KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
            c32872mll.copydefault(str, eventParamsList, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
        }
    }

    public static /* synthetic */ void onNewOKexEventWithParams$default(java.lang.String str, TrackChannel[] trackChannelArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32868mlh.OLrzqt.copydefault();
        }
        KWHzl(str, trackChannelArr);
    }

    public static final void KWHzl(@NotNull java.lang.String str, @NotNull TrackChannel... trackChannelArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        if (C34704nhP.copydefault.copydefault()) {
            C32872mll c32872mll = C32872mll.OLrzqt;
            java.lang.String[] strArrKWHzl = C32866mlf.KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
            c32872mll.OLrzqt(str, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
        }
    }
}
