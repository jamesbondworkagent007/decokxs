package o;

import com.okinc.unify_trade.bot.list.CardStyle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uJN {
    public final CardStyle EZpvd;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ uJN copy$default(uJN ujn, boolean z, CardStyle cardStyle, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = ujn.copydefault;
        }
        if ((i & 2) != 0) {
            cardStyle = ujn.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = ujn.KWHzl;
        }
        return ujn.KWHzl(z, cardStyle, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uJN KWHzl(boolean z, @NotNull CardStyle cardStyle, boolean z2) {
        Intrinsics.checkNotNullParameter(cardStyle, "");
        return new uJN(z, cardStyle, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uJN)) {
            return false;
        }
        uJN ujn = (uJN) obj;
        return this.copydefault == ujn.copydefault && this.EZpvd == ujn.EZpvd && this.KWHzl == ujn.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.copydefault) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LayoutConfig(isHistorical=" + this.copydefault + ", displayStyle=" + this.EZpvd + ", isFromDetailPage=" + this.KWHzl + ")";
    }

    public uJN(boolean z, @NotNull CardStyle cardStyle, boolean z2) {
        Intrinsics.checkNotNullParameter(cardStyle, "");
        this.copydefault = z;
        this.EZpvd = cardStyle;
        this.KWHzl = z2;
    }

    public final boolean copydefault() {
        return this.EZpvd == CardStyle.DETAILED;
    }

    public final boolean EZpvd() {
        return this.EZpvd != CardStyle.MINI;
    }
}
