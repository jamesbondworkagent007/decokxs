package o;

import com.okinc.unify_find.data.HotRankResponse;
import com.okinc.unify_find.data.RankListRequestGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55571xmU {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final RankListRequestGroup copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequestGroup AEQbTJ() {
        return this.copydefault;
    }

    public abstract void AEQbTJ(@NotNull java.lang.Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    public abstract void EZpvd(@NotNull java.lang.String str, @NotNull java.util.ArrayList<HotRankResponse> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public AbstractC55571xmU(@NotNull RankListRequestGroup rankListRequestGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = rankListRequestGroup;
        this.AEQbTJ = str;
        this.EZpvd = "hot_rank_listener";
        this.OLrzqt = "hot_rank_listener";
    }
}
