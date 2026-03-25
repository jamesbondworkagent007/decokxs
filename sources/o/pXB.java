package o;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pXB {
    public static final pXB EZpvd = new pXB();

    private pXB() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pXB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void klineClickTrack$default(pXB pxb, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = new java.util.HashMap();
        }
        pxb.AEQbTJ(str, map);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C49402unq.OLrzqt(str, map, "OKKline-Track-Report");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pXB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerTradeFragmentTrack$default(pXB pxb, androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        pxb.AEQbTJ(fragment, str, pairArr, function0);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        C49396unk.copydefault(fragment, "OKKline-Track-Report", str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pXB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerTradeActivityTrack$default(pXB pxb, ComponentActivity componentActivity, java.lang.String str, kotlin.Pair[] pairArr, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        pxb.EZpvd(componentActivity, str, pairArr, function0);
    }

    public final void EZpvd(@NotNull ComponentActivity componentActivity, java.lang.String str, @NotNull kotlin.Pair<java.lang.String, java.lang.String>[] pairArr, Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function0) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        C49390une.KWHzl(componentActivity, str, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), function0, "OKKline-Track-Report");
    }
}
