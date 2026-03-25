package o;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import com.okinc.tradingbot.impl.botList.ui.shared.MetricStyle;
import com.okinc.tradingbot.impl.widget.compose.HelperLabelType;
import com.okinc.tradingbot.impl.widget.compose.UnderlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48283uLt implements InterfaceC48286uLw {
    public final java.lang.String AEQbTJ;
    public final UnderlineStyle AYXKKw;
    public final java.lang.String AhwBna;
    public final HelperLabelType EZpvd;
    public final java.lang.String KWHzl;
    public final Function0<Unit> OLrzqt;
    public final Alignment.Horizontal copydefault;
    public final Color djBIcL;
    public final Color fetchVPNInfo;
    public final MetricStyle gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 androidx.compose.ui.graphics.Color)
  (r5v0 java.lang.String)
  (r6v0 androidx.compose.ui.graphics.Color)
  (r7v0 androidx.compose.ui.Alignment$Horizontal)
  (r8v0 com.okinc.tradingbot.impl.botList.ui.shared.MetricStyle)
  (r9v0 com.okinc.tradingbot.impl.widget.compose.HelperLabelType)
  (r10v0 com.okinc.tradingbot.impl.widget.compose.UnderlineStyle)
  (r11v0 kotlin.jvm.functions.Function0)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.graphics.Color, java.lang.String, androidx.compose.ui.graphics.Color, androidx.compose.ui.Alignment$Horizontal, com.okinc.tradingbot.impl.botList.ui.shared.MetricStyle, com.okinc.tradingbot.impl.widget.compose.HelperLabelType, com.okinc.tradingbot.impl.widget.compose.UnderlineStyle, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] call: o.uLt.<init>(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.graphics.Color, java.lang.String, androidx.compose.ui.graphics.Color, androidx.compose.ui.Alignment$Horizontal, com.okinc.tradingbot.impl.botList.ui.shared.MetricStyle, com.okinc.tradingbot.impl.widget.compose.HelperLabelType, com.okinc.tradingbot.impl.widget.compose.UnderlineStyle, kotlin.jvm.functions.Function0):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48283uLt(java.lang.String str, java.lang.String str2, java.lang.String str3, Color color, java.lang.String str4, Color color2, Alignment.Horizontal horizontal, MetricStyle metricStyle, HelperLabelType helperLabelType, UnderlineStyle underlineStyle, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, color, str4, color2, horizontal, metricStyle, helperLabelType, underlineStyle, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Alignment.Horizontal AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnderlineStyle AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48286uLw
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48283uLt EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Color color, java.lang.String str4, Color color2, @NotNull Alignment.Horizontal horizontal, @NotNull MetricStyle metricStyle, @NotNull HelperLabelType helperLabelType, @NotNull UnderlineStyle underlineStyle, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(horizontal, "");
        Intrinsics.checkNotNullParameter(metricStyle, "");
        Intrinsics.checkNotNullParameter(helperLabelType, "");
        Intrinsics.checkNotNullParameter(underlineStyle, "");
        return new C48283uLt(str, str2, str3, color, str4, color2, horizontal, metricStyle, helperLabelType, underlineStyle, function0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelType copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Color djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48283uLt)) {
            return false;
        }
        C48283uLt c48283uLt = (C48283uLt) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48283uLt.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48283uLt.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c48283uLt.AhwBna) && Intrinsics.EZpvd(this.fetchVPNInfo, c48283uLt.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c48283uLt.valueOf) && Intrinsics.EZpvd(this.djBIcL, c48283uLt.djBIcL) && Intrinsics.EZpvd(this.copydefault, c48283uLt.copydefault) && this.gEmmrt == c48283uLt.gEmmrt && this.EZpvd == c48283uLt.EZpvd && this.AYXKKw == c48283uLt.AYXKKw && Intrinsics.EZpvd(this.OLrzqt, c48283uLt.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.AhwBna.hashCode();
        Color color = this.fetchVPNInfo;
        int iM3156hashCodeimpl = color == null ? 0 : Color.m3156hashCodeimpl(color.m3159unboximpl());
        java.lang.String str = this.valueOf;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Color color2 = this.djBIcL;
        int iM3156hashCodeimpl2 = color2 == null ? 0 : Color.m3156hashCodeimpl(color2.m3159unboximpl());
        int iHashCode5 = this.copydefault.hashCode();
        int iHashCode6 = this.gEmmrt.hashCode();
        int iHashCode7 = this.EZpvd.hashCode();
        int iHashCode8 = this.AYXKKw.hashCode();
        Function0<Unit> function0 = this.OLrzqt;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iM3156hashCodeimpl) * 31) + iHashCode4) * 31) + iM3156hashCodeimpl2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Color isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Metric(id=" + this.KWHzl + ", label=" + this.AEQbTJ + ", value=" + this.AhwBna + ", valueColor=" + this.fetchVPNInfo + ", secondaryValue=" + this.valueOf + ", secondaryValueColor=" + this.djBIcL + ", align=" + this.copydefault + ", style=" + this.gEmmrt + ", labelStyle=" + this.EZpvd + ", underlineStyle=" + this.AYXKKw + ", onLabelClick=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MetricStyle valueOf() {
        return this.gEmmrt;
    }

    public C48283uLt(java.lang.String str, java.lang.String str2, java.lang.String str3, Color color, java.lang.String str4, Color color2, Alignment.Horizontal horizontal, MetricStyle metricStyle, HelperLabelType helperLabelType, UnderlineStyle underlineStyle, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(horizontal, "");
        Intrinsics.checkNotNullParameter(metricStyle, "");
        Intrinsics.checkNotNullParameter(helperLabelType, "");
        Intrinsics.checkNotNullParameter(underlineStyle, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.AhwBna = str3;
        this.fetchVPNInfo = color;
        this.valueOf = str4;
        this.djBIcL = color2;
        this.copydefault = horizontal;
        this.gEmmrt = metricStyle;
        this.EZpvd = helperLabelType;
        this.AYXKKw = underlineStyle;
        this.OLrzqt = function0;
    }
}
