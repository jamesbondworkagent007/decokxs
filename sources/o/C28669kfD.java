package o;

import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28669kfD {
    public static final C28714kfw AEQbTJ(@NotNull MemeBlacklist memeBlacklist) {
        Intrinsics.checkNotNullParameter(memeBlacklist, "");
        return new C28714kfw(memeBlacklist.getChainId(), memeBlacklist.getTokenAddress(), memeBlacklist.getLogo(), memeBlacklist.getChainLogo(), memeBlacklist.getSymbol(), memeBlacklist.getName());
    }

    public static final MemeBlacklist KWHzl(@NotNull C28714kfw c28714kfw) {
        Intrinsics.checkNotNullParameter(c28714kfw, "");
        return new MemeBlacklist(c28714kfw.OLrzqt(), c28714kfw.gEmmrt(), c28714kfw.KWHzl(), c28714kfw.copydefault(), c28714kfw.AEQbTJ(), c28714kfw.EZpvd());
    }
}
