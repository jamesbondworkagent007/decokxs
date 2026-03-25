package o;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewSpotVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41713qvx extends C40512qYp {
    public C41713qvx(@NotNull java.lang.String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        register(RankingHotCryptoVo.class, new C41712qvw(str, function0));
        register(RankingNewSpotVo.class, new C41666qvC(function0));
    }
}
