package o;

import com.okinc.tradingbot.impl.planet.model.BotUiState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53652wpY {
    public final java.util.List<BotUiState> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wpY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C53652wpY copy$default(C53652wpY c53652wpY, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c53652wpY.KWHzl;
        }
        return c53652wpY.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53652wpY AEQbTJ(@NotNull java.util.List<BotUiState> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C53652wpY(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BotUiState> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C53652wpY) && Intrinsics.EZpvd(this.KWHzl, ((C53652wpY) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImmutableBotList(bots=" + this.KWHzl + ")";
    }

    public C53652wpY(@NotNull java.util.List<BotUiState> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }
}
