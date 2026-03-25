package o;

import com.okinc.unify_find.data.NewCoinGroupResponse;
import com.okinc.unify_find.data.RankListRequestGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55574xmX {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final RankListRequestGroup OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull NewCoinGroupResponse newCoinGroupResponse);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequestGroup OLrzqt() {
        return this.OLrzqt;
    }

    public abstract void copydefault(@NotNull java.lang.Throwable th);

    public AbstractC55574xmX(@NotNull RankListRequestGroup rankListRequestGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = rankListRequestGroup;
        this.EZpvd = str;
        this.AEQbTJ = "new_coin_rank_listener";
        this.KWHzl = "new_coin_rank_listener";
    }
}
