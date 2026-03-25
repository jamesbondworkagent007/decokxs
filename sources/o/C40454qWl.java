package o;

import com.okinc.market.watch.data.UserGroup;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40454qWl {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [104=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean AEQbTJ(@NotNull UserGroup userGroup, @NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        java.lang.String groupName = userGroup.getGroupName();
        switch (groupName.hashCode()) {
            case -1956807563:
                if (groupName.equals("OPTION")) {
                    return Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "OPTION");
                }
            case 64897:
                return groupName.equals("ALL");
            case 67575:
                if (groupName.equals("DEX")) {
                    return Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "CEDEFI");
                }
            case 2074257:
                if (groupName.equals("COIN")) {
                    return Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN");
                }
            case 2552066:
                if (groupName.equals("SPOT")) {
                    return Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "SPOT");
                }
            case 2558355:
                if (groupName.equals("SWAP") && (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES"))) {
                }
                break;
        }
    }
}
