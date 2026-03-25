package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.track.FragmentTrackerKt$reportTrack$1;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C33129mqd;
import o.C49401unp;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49396unk {
    public static /* synthetic */ void registerFragmentTrack$default(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        copydefault(fragment, str, str2, pairArr, function0);
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull final java.lang.String str, final java.lang.String str2, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, final Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        final java.lang.String str3 = fragment instanceof androidx.fragment.app.DialogFragment ? "view_dialog" : "view_fragment";
        final java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : pairArr) {
            stringBuffer.append(((java.lang.Object) pair.getFirst()) + ":" + ((java.lang.Object) pair.getSecond()) + "  ");
        }
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.track.FragmentTrackerKt$registerFragmentTrack$2
            public long AYXKKw;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Map<String, String> mapOLrzqt;
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                this.AYXKKw = System.currentTimeMillis();
                Map<String, String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", str3), C56390yDp.OLrzqt("page", C33129mqd.gEmmrt(str2)), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, "enter"), C56390yDp.OLrzqt("extra_params", stringBuffer.toString()));
                Function0<Map<String, String>> function02 = function0;
                if (function02 != null && (mapOLrzqt = C56424yEw.OLrzqt(mapGEmmrt, function02.invoke())) != null) {
                    mapGEmmrt = mapOLrzqt;
                }
                C49401unp.OLrzqt.KWHzl(mapGEmmrt, str);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onPause(lifecycleOwner);
                String strDivS$default = C33129mqd.divS$default(Long.valueOf(System.currentTimeMillis() - this.AYXKKw), 1000, null, null, null, 14, null);
                C49401unp.OLrzqt.KWHzl(C56424yEw.gEmmrt(C56390yDp.OLrzqt("event_type", str3), C56390yDp.OLrzqt("page", C33129mqd.gEmmrt(str2)), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, EopTrackEvent.EXIT), C56390yDp.OLrzqt("view_time", strDivS$default + " s")), str);
            }
        });
    }

    public static /* synthetic */ void registerTradeFragmentTrack$default(androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        AEQbTJ(fragment, str, pairArr, function0);
    }

    public static final void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        copydefault(fragment, "OKTrade-Track-Report", str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0);
    }

    public static /* synthetic */ Job reportTrack$default(androidx.fragment.app.Fragment fragment, java.lang.String str, java.util.Map map, java.lang.Class[] clsArr, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(fragment, str, map, clsArr);
    }

    public static final Job copydefault(androidx.fragment.app.Fragment fragment, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Class<?>... clsArr) {
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), Dispatchers.getDefault(), null, new FragmentTrackerKt$reportTrack$1(null), 2, null);
    }
}
