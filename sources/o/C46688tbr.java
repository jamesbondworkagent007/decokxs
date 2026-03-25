package o;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46688tbr {
    public static final C46688tbr KWHzl = new C46688tbr();

    private C46688tbr() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tbr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void marketClickTrack$default(C46688tbr c46688tbr, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        c46688tbr.KWHzl(str, map);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C49402unq.OLrzqt(str, map, "OKMarket-Track-Report");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tbr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerTradeFragmentTrack$default(C46688tbr c46688tbr, androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c46688tbr.AEQbTJ(fragment, str, pairArr, function0);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        C49396unk.copydefault(fragment, "OKMarket-Track-Report", str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tbr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerTradeActivityTrack$default(C46688tbr c46688tbr, ComponentActivity componentActivity, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c46688tbr.copydefault(componentActivity, str, pairArr, function0);
    }

    public final void copydefault(@NotNull ComponentActivity componentActivity, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        C49390une.KWHzl(componentActivity, str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0, "OKMarket-Track-Report");
    }
}
