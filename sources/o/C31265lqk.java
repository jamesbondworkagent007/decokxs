package o;

import com.okinc.business.web3pay.lib.core.model.OrderType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31265lqk {
    public final java.lang.String AEQbTJ;
    public final JsonElement AYXKKw;
    public final OrderType EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31265lqk copy$default(C31265lqk c31265lqk, java.lang.String str, JsonElement jsonElement, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, OrderType orderType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31265lqk.copydefault;
        }
        if ((i & 2) != 0) {
            jsonElement = c31265lqk.AYXKKw;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i & 4) != 0) {
            str2 = c31265lqk.gEmmrt;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = c31265lqk.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c31265lqk.AEQbTJ;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = c31265lqk.KWHzl;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            orderType = c31265lqk.EZpvd;
        }
        return c31265lqk.AEQbTJ(str, jsonElement2, str6, str7, str8, str9, orderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31265lqk AEQbTJ(java.lang.String str, @NotNull JsonElement jsonElement, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull OrderType orderType) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        return new C31265lqk(str, jsonElement, str2, str3, str4, str5, orderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderType OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31265lqk)) {
            return false;
        }
        C31265lqk c31265lqk = (C31265lqk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31265lqk.copydefault) && Intrinsics.EZpvd(this.AYXKKw, c31265lqk.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c31265lqk.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31265lqk.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31265lqk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31265lqk.KWHzl) && this.EZpvd == c31265lqk.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubmitTransactionParams(sessionIdFor2FA=" + this.copydefault + ", signedMsg=" + this.AYXKKw + ", uopHash=" + this.gEmmrt + ", comment=" + this.OLrzqt + ", senderName=" + this.AEQbTJ + ", receiverName=" + this.KWHzl + ", orderType=" + this.EZpvd + ")";
    }

    public C31265lqk(java.lang.String str, @NotNull JsonElement jsonElement, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull OrderType orderType) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        this.copydefault = str;
        this.AYXKKw = jsonElement;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
        this.KWHzl = str5;
        this.EZpvd = orderType;
    }
}
