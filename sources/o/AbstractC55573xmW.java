package o;

import com.okinc.unify_find.data.RankListRequestGroup;
import com.okinc.unify_find.data.UpDownRank;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55573xmW {
    public final java.lang.String AEQbTJ;
    public final RankListRequestGroup KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    public abstract void KWHzl(@NotNull java.lang.Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequestGroup OLrzqt() {
        return this.KWHzl;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.ArrayList<UpDownRank> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public AbstractC55573xmW(@NotNull RankListRequestGroup rankListRequestGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = rankListRequestGroup;
        this.AEQbTJ = str;
        this.gEmmrt = "up_down_rank_listener";
        this.copydefault = "up_down_rank_listener";
    }
}
