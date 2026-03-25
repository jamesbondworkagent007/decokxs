package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32866mlf {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void KWHzl(@NotNull java.lang.String str, @NotNull TrackChannel... trackChannelArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        onEvent$default(str, trackChannelArr, (Function1) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void onEvent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onEvent$default(str, (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static /* synthetic */ void onEvent$default(java.lang.String str, TrackChannel[] trackChannelArr, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        OLrzqt(str, trackChannelArr, (kotlin.Pair<java.lang.String, java.lang.String>) pair);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(pair, "");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(1);
        arrayMap.put(pair.getFirst(), pair.getSecond());
        C32872mll c32872mll = C32872mll.OLrzqt;
        java.lang.String[] strArrKWHzl = KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
        c32872mll.AEQbTJ(str, arrayMap, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        TrackChannel[] trackChannelArrKWHzl = C32867mlg.KWHzl.KWHzl(str);
        OLrzqt(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrKWHzl, trackChannelArrKWHzl.length), map);
    }

    public static /* synthetic */ void onEvent$default(java.lang.String str, TrackChannel[] trackChannelArr, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        OLrzqt(str, trackChannelArr, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32872mll c32872mll = C32872mll.OLrzqt;
        java.lang.String[] strArrKWHzl = KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
        c32872mll.AEQbTJ(str, map, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull EventParam eventParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParam, "");
        TrackChannel[] trackChannelArrKWHzl = C32867mlg.KWHzl.KWHzl(str);
        OLrzqt(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrKWHzl, trackChannelArrKWHzl.length), eventParam);
    }

    public static /* synthetic */ void onEventWithParams$default(java.lang.String str, TrackChannel[] trackChannelArr, EventParam eventParam, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        OLrzqt(str, trackChannelArr, eventParam);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull EventParam eventParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(eventParam, "");
        onEvent$default(str, "", null, yDY.copydefault(eventParam), null, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), 10, null);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<EventParam> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        TrackChannel[] trackChannelArrKWHzl = C32867mlg.KWHzl.KWHzl(str);
        AEQbTJ(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrKWHzl, trackChannelArrKWHzl.length), list);
    }

    public static /* synthetic */ void onEventWithParams$default(java.lang.String str, TrackChannel[] trackChannelArr, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        AEQbTJ(str, trackChannelArr, (java.util.List<EventParam>) list);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull java.util.List<EventParam> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(list, "");
        onEvent$default(str, "", null, list, null, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), 10, null);
    }

    public static /* synthetic */ void onEventWithParams$default(java.lang.String str, TrackChannel[] trackChannelArr, EventParamsList eventParamsList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        EZpvd(str, trackChannelArr, eventParamsList);
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        onEvent$default(str, "", null, eventParamsList, null, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), 10, null);
    }

    public static final void KWHzl(@NotNull java.lang.String str, @NotNull Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TrackChannel[] trackChannelArrKWHzl = C32867mlg.KWHzl.KWHzl(str);
        AEQbTJ(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrKWHzl, trackChannelArrKWHzl.length), function1);
    }

    public static /* synthetic */ void onEventWithParams$default(java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        AEQbTJ(str, trackChannelArr, (Function1<? super EventParamsList, Unit>) function1);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, @NotNull Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C43296rmc.KWHzl("Trackline", str);
        onEvent$default(str, null, null, new EventParamsList(5), function1, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), 3, null);
    }

    public static final java.lang.String[] KWHzl(@NotNull TrackChannel... trackChannelArr) {
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        if (yDV.valueOf(trackChannelArr, TrackChannel.All)) {
            TrackChannel[] trackChannelArrValues = TrackChannel.values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TrackChannel trackChannel : trackChannelArrValues) {
                if (trackChannel != TrackChannel.All) {
                    arrayList.add(trackChannel);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TrackChannel) it.next()).name());
            }
            return (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(trackChannelArr.length);
        for (TrackChannel trackChannel2 : trackChannelArr) {
            arrayList3.add(trackChannel2.name());
        }
        return (java.lang.String[]) arrayList3.toArray(new java.lang.String[0]);
    }

    public static /* synthetic */ void onEvent$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, Function1 function1, TrackChannel[] trackChannelArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "";
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        if ((i & 16) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        EZpvd(str, str2, str3, list, function1, trackChannelArr);
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.util.List<EventParam> list, Function1<? super EventParamsList, Unit> function1, @NotNull TrackChannel... trackChannelArr) {
        EventParamsList eventParamsList;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        if (list instanceof EventParamsList) {
            eventParamsList = (EventParamsList) list;
        } else {
            if (list == null) {
                list = yDY.AhwBna();
            }
            eventParamsList = new EventParamsList(list);
        }
        if (str2.length() > 0) {
            eventParamsList.add(new EventParam("action_type", str2, true));
        }
        if (str3.length() > 0) {
            eventParamsList.add(new EventParam("element_type", str3, true));
        }
        C32872mll c32872mll = C32872mll.OLrzqt;
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        Unit unit = Unit.INSTANCE;
        java.lang.String[] strArrKWHzl = KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
        c32872mll.copydefault(str, eventParamsList, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
    }

    public static /* synthetic */ void onEvent$default(java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        EZpvd(str, trackChannelArr, (Function1<? super EventParamsList, Unit>) function1);
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        EventParamsList eventParamsList = new EventParamsList(yDY.AhwBna());
        C32872mll c32872mll = C32872mll.OLrzqt;
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        Unit unit = Unit.INSTANCE;
        java.lang.String[] strArrKWHzl = KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
        c32872mll.copydefault(str, eventParamsList, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
    }
}
