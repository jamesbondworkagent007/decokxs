package o;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56028xvA {
    public static /* synthetic */ void botClickTrack$default(java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        OLrzqt(str, map);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C49402unq.OLrzqt(str, map, "OKTrade-BOT-Track-Report");
    }

    public static /* synthetic */ void botReportHttpResult$default(java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        AEQbTJ(str, map);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C49402unq.copydefault(str, map, "OKTrade-BOT-Track-Report");
    }

    public static /* synthetic */ void registerBotFragmentTrack$default(androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        KWHzl(fragment, str, pairArr, function0);
    }

    public static final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        C49396unk.copydefault(fragment, "OKTrade-BOT-Track-Report", str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0);
    }

    public static /* synthetic */ void registerBotActivityTrack$default(ComponentActivity componentActivity, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        OLrzqt(componentActivity, str, pairArr, function0);
    }

    public static final void OLrzqt(@NotNull ComponentActivity componentActivity, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        C49390une.KWHzl(componentActivity, str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0, "OKTrade-BOT-Track-Report");
    }
}
