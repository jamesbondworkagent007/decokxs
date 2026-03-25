package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pWS {
    public static final pWS OLrzqt = new pWS();
    public static final java.util.ArrayList<pWP> KWHzl = new java.util.ArrayList<>();
    public static final java.util.ArrayList<pWP> AEQbTJ = new java.util.ArrayList<>();
    public static final java.util.ArrayList<pWP> EZpvd = new java.util.ArrayList<>();
    public static final int copydefault = 8;

    private pWS() {
    }

    public final void KWHzl(@NotNull java.util.List<pWP> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<pWP> arrayList = KWHzl;
        arrayList.clear();
        arrayList.addAll(list);
        AEQbTJ.clear();
    }

    public final void OLrzqt(@NotNull pWP pwp, boolean z) {
        Intrinsics.checkNotNullParameter(pwp, "");
        if (z) {
            AEQbTJ.add(pwp);
        } else {
            AEQbTJ.remove(pwp);
        }
        RxBus.AEQbTJ(new pWQ(AEQbTJ.size()));
    }
}
