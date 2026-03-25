package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotModifyResp {
    public static final int $stable = 0;
    private final String state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotModifyResp copy$default(BotModifyResp botModifyResp, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botModifyResp.state;
        }
        return botModifyResp.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotModifyResp copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BotModifyResp(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BotModifyResp) && Intrinsics.EZpvd((Object) this.state, (Object) ((BotModifyResp) obj).state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.state.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotModifyResp(state=" + this.state + ")";
    }

    public BotModifyResp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }
}
