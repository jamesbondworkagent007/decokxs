package o;

import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vAg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50056vAg {
    public final java.util.List<C50052vAc> EZpvd;
    public final java.util.List<C50052vAc> OLrzqt;
    public final BotStopType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vAg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C50056vAg copy$default(C50056vAg c50056vAg, BotStopType botStopType, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            botStopType = c50056vAg.copydefault;
        }
        if ((i & 2) != 0) {
            list = c50056vAg.OLrzqt;
        }
        if ((i & 4) != 0) {
            list2 = c50056vAg.EZpvd;
        }
        return c50056vAg.EZpvd(botStopType, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C50056vAg EZpvd(@NotNull BotStopType botStopType, @NotNull java.util.List<C50052vAc> list, @NotNull java.util.List<C50052vAc> list2) {
        Intrinsics.checkNotNullParameter(botStopType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C50056vAg(botStopType, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C50052vAc> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C50052vAc> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50056vAg)) {
            return false;
        }
        C50056vAg c50056vAg = (C50056vAg) obj;
        return this.copydefault == c50056vAg.copydefault && Intrinsics.EZpvd(this.OLrzqt, c50056vAg.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c50056vAg.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StopBotData(stopType=" + this.copydefault + ", returnCoinAmount=" + this.OLrzqt + ", sellCoinAmount=" + this.EZpvd + ")";
    }

    public C50056vAg(@NotNull BotStopType botStopType, @NotNull java.util.List<C50052vAc> list, @NotNull java.util.List<C50052vAc> list2) {
        Intrinsics.checkNotNullParameter(botStopType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = botStopType;
        this.OLrzqt = list;
        this.EZpvd = list2;
    }
}
