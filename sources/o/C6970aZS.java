package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6970aZS {
    @yCM
    public C6970aZS() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aZS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackDexTradeSelectDappView$default(C6970aZS c6970aZS, C22402heg c22402heg, C22404hei c22404hei, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        c6970aZS.KWHzl(c22402heg, c22404hei, map);
    }

    public final void KWHzl(@NotNull C22402heg c22402heg, @NotNull C22404hei c22404hei, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(c22402heg, "");
        Intrinsics.checkNotNullParameter(c22404hei, "");
        C25437iwh.trackDexTradeSelectDappEvent$default("DEXTrade_Selectdapp_Dapp_View", c22402heg, c22404hei, map, null, 16, null);
    }
}
