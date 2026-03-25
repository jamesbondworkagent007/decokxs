package o;

import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.unify_find.data.RankListRequestGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55567xmQ {
    public final RankListRequestGroup AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    public abstract void KWHzl(@NotNull java.lang.Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.ArrayList<FuturesRankItemPo> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequestGroup copydefault() {
        return this.AEQbTJ;
    }

    public AbstractC55567xmQ(@NotNull RankListRequestGroup rankListRequestGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = rankListRequestGroup;
        this.EZpvd = str;
        this.KWHzl = "hot_futures_rank_listener";
        this.OLrzqt = "hot_futures_rank_listener";
    }
}
