package o;

import com.okinc.unify_find.data.RankListRequestGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55630xna extends AbstractC55573xmW {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55573xmW
    public java.lang.String AEQbTJ() {
        return "up_rank_listener";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55630xna(@NotNull RankListRequestGroup rankListRequestGroup, @NotNull java.lang.String str) {
        super(rankListRequestGroup, str);
        Intrinsics.checkNotNullParameter(rankListRequestGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
