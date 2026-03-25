package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C49401unp;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.une, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49390une {
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.unf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49390une.copydefault();
        }
    });

    public static final java.util.Map<java.lang.String, InterfaceC49398unm> EZpvd() {
        return (java.util.Map) copydefault.getValue();
    }

    public static final java.util.Map copydefault() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ void reportTrack$default(android.app.Activity activity, java.lang.String str, java.util.Map map, java.lang.Class[] clsArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        OLrzqt(activity, str, map, clsArr);
    }

    public static final void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.Class<?>... clsArr) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(clsArr, "");
        android.view.View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        C49402unq.copydefault(decorView, str, map, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
    }

    public static /* synthetic */ void registerTradeActivityTrack$default(ComponentActivity componentActivity, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        AEQbTJ(componentActivity, str, pairArr, function0);
    }

    public static final void AEQbTJ(@NotNull ComponentActivity componentActivity, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        KWHzl(componentActivity, str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0, "OKTrade-Track-Report");
    }

    public static /* synthetic */ void registerActivityTrack$default(ComponentActivity componentActivity, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            str2 = "OKTrade-Track-Report";
        }
        KWHzl(componentActivity, str, pairArr, function0, str2);
    }

    public static final void KWHzl(@NotNull ComponentActivity componentActivity, final java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, final Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : pairArr) {
            stringBuffer.append(((java.lang.Object) pair.getFirst()) + ":" + ((java.lang.Object) pair.getSecond()) + "  ");
        }
        final java.lang.String str3 = "view_activity";
        componentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.track.ActivityTrackerKt$registerActivityTrack$2
            public long AYXKKw;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Map<String, String> mapOLrzqt;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                this.AYXKKw = System.currentTimeMillis();
                Map<String, String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", str3), C56390yDp.OLrzqt("page", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, "enter"), C56390yDp.OLrzqt("extra_params", stringBuffer.toString()));
                Function0<Map<String, String>> function02 = function0;
                if (function02 != null && (mapOLrzqt = C56424yEw.OLrzqt(mapGEmmrt, function02.invoke())) != null) {
                    mapGEmmrt = mapOLrzqt;
                }
                C49401unp.OLrzqt.KWHzl(mapGEmmrt, str2);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onPause(lifecycleOwner);
                String strDivS$default = C33129mqd.divS$default(Long.valueOf(System.currentTimeMillis() - this.AYXKKw), 1000, null, null, null, 14, null);
                C49401unp.OLrzqt.KWHzl(C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", str3), C56390yDp.OLrzqt("page", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, EopTrackEvent.EXIT), C56390yDp.OLrzqt("view_time", strDivS$default + " s")), str2);
            }
        });
    }
}
