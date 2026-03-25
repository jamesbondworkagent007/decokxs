package o;

import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xAF {
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final BotUserSummaryReq OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUserSummaryReq EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    public abstract void KWHzl(@NotNull BotUserSummaryData botUserSummaryData);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.AEQbTJ;
    }

    public abstract void copydefault(@NotNull java.lang.String str);

    public xAF(@NotNull BotUserSummaryReq botUserSummaryReq, @NotNull java.lang.String str, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(botUserSummaryReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = botUserSummaryReq;
        this.EZpvd = str;
        this.AEQbTJ = bool;
        this.copydefault = "BotUserSummaryListener";
    }
}
