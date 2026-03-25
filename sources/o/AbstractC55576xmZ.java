package o;

import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.unify_find.data.RankListRequestGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55576xmZ {
    public final java.lang.String AEQbTJ;
    public final RankListRequestGroup EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    public abstract void EZpvd(@NotNull java.lang.Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.ArrayList<FuturesRankItemPo> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequestGroup copydefault() {
        return this.EZpvd;
    }

    public AbstractC55576xmZ(@NotNull RankListRequestGroup rankListRequestGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = rankListRequestGroup;
        this.copydefault = str;
        this.OLrzqt = "up_futures_rank_listener";
        this.AEQbTJ = "up_futures_rank_listener";
    }
}
