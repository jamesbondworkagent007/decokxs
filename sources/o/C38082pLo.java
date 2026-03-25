package o;

import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.core.LinkStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38082pLo {
    public final AnalyticsLinkType AEQbTJ;
    public final java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public LinkState KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public LinkStatus djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38082pLo copy$default(C38082pLo c38082pLo, java.lang.String str, java.lang.String str2, java.lang.String str3, AnalyticsLinkType analyticsLinkType, java.lang.String str4, LinkState linkState, LinkStatus linkStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c38082pLo.AhwBna;
        }
        if ((i & 2) != 0) {
            str2 = c38082pLo.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c38082pLo.OLrzqt;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            analyticsLinkType = c38082pLo.AEQbTJ;
        }
        AnalyticsLinkType analyticsLinkType2 = analyticsLinkType;
        if ((i & 16) != 0) {
            str4 = c38082pLo.EZpvd;
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            linkState = c38082pLo.KWHzl;
        }
        LinkState linkState2 = linkState;
        if ((i & 64) != 0) {
            linkStatus = c38082pLo.djBIcL;
        }
        return c38082pLo.AEQbTJ(str, str5, str6, analyticsLinkType2, str7, linkState2, linkStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkState AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38082pLo AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AnalyticsLinkType analyticsLinkType, java.lang.String str4, LinkState linkState, LinkStatus linkStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        return new C38082pLo(str, str2, str3, analyticsLinkType, str4, linkState, linkStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(LinkStatus linkStatus) {
        this.djBIcL = linkStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(LinkState linkState) {
        this.KWHzl = linkState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnalyticsLinkType OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkStatus djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38082pLo)) {
            return false;
        }
        C38082pLo c38082pLo = (C38082pLo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c38082pLo.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c38082pLo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c38082pLo.OLrzqt) && this.AEQbTJ == c38082pLo.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c38082pLo.EZpvd) && this.KWHzl == c38082pLo.KWHzl && this.djBIcL == c38082pLo.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        LinkState linkState = this.KWHzl;
        int iHashCode6 = linkState == null ? 0 : linkState.hashCode();
        LinkStatus linkStatus = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (linkStatus != null ? linkStatus.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LinkAnalyticsState(source=" + this.AhwBna + ", sessionId=" + this.copydefault + ", link=" + this.OLrzqt + ", analyticsLinkType=" + this.AEQbTJ + ", deeplink=" + this.EZpvd + ", reason=" + this.KWHzl + ", status=" + this.djBIcL + ")";
    }

    public C38082pLo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull AnalyticsLinkType analyticsLinkType, java.lang.String str4, LinkState linkState, LinkStatus linkStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        this.AhwBna = str;
        this.copydefault = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = analyticsLinkType;
        this.EZpvd = str4;
        this.KWHzl = linkState;
        this.djBIcL = linkStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.lifecycle.impl.deeplink.core.LinkState:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.lifecycle.impl.deeplink.core.LinkState) : (r16v0 com.okinc.lifecycle.impl.deeplink.core.LinkState))
  (wrap:com.okinc.lifecycle.impl.deeplink.core.LinkStatus:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.lifecycle.impl.deeplink.core.LinkStatus) : (r17v0 com.okinc.lifecycle.impl.deeplink.core.LinkStatus))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType, java.lang.String, com.okinc.lifecycle.impl.deeplink.core.LinkState, com.okinc.lifecycle.impl.deeplink.core.LinkStatus):void (m)] (LINE:12) call: o.pLo.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType, java.lang.String, com.okinc.lifecycle.impl.deeplink.core.LinkState, com.okinc.lifecycle.impl.deeplink.core.LinkStatus):void type: THIS */
    public /* synthetic */ C38082pLo(java.lang.String str, java.lang.String str2, java.lang.String str3, AnalyticsLinkType analyticsLinkType, java.lang.String str4, LinkState linkState, LinkStatus linkStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, analyticsLinkType, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : linkState, (i & 64) != 0 ? null : linkStatus);
    }
}
