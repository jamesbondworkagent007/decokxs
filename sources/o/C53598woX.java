package o;

import com.okinc.tradingbot.impl.planet.dto.BotDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.woX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53598woX {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final BotDirection copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C53598woX copy$default(C53598woX c53598woX, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, BotDirection botDirection, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c53598woX.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c53598woX.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c53598woX.OLrzqt;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c53598woX.AEQbTJ;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            botDirection = c53598woX.copydefault;
        }
        return c53598woX.EZpvd(str, str5, str6, str7, botDirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotDirection EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53598woX EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, BotDirection botDirection) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C53598woX(str, str2, str3, str4, botDirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53598woX)) {
            return false;
        }
        C53598woX c53598woX = (C53598woX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c53598woX.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c53598woX.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c53598woX.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c53598woX.AEQbTJ) && this.copydefault == c53598woX.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        BotDirection botDirection = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (botDirection != null ? botDirection.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BotInfo(instId=" + this.EZpvd + ", instType=" + this.KWHzl + ", botType=" + this.OLrzqt + ", leverage=" + this.AEQbTJ + ", direction=" + this.copydefault + ")";
    }

    public C53598woX(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, BotDirection botDirection) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
        this.copydefault = botDirection;
    }
}
