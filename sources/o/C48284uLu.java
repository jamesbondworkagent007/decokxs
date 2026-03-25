package o;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import com.okinc.tradingbot.impl.botList.ui.shared.MetricStyle;
import com.okinc.tradingbot.impl.widget.compose.HelperLabelType;
import com.okinc.tradingbot.impl.widget.compose.UnderlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48284uLu {
    public HelperLabelType AEQbTJ;
    public java.lang.String AYXKKw;
    public UnderlineStyle AhwBna;
    public Color AkhnZx;
    public Alignment.Horizontal EZpvd;
    public Function0<Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public boolean copydefault;
    public MetricStyle djBIcL;
    public Color gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48284uLu EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48284uLu copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        return this;
    }

    public C48284uLu(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AYXKKw = "";
        this.EZpvd = Alignment.Companion.getStart();
        this.djBIcL = MetricStyle.NORMAL;
        this.AEQbTJ = HelperLabelType.Regular;
        this.AhwBna = UnderlineStyle.Dotted;
    }

    public final C48284uLu AEQbTJ(long j) {
        this.AkhnZx = Color.m3139boximpl(j);
        return this;
    }

    public final C48284uLu OLrzqt(long j) {
        this.gEmmrt = Color.m3139boximpl(j);
        return this;
    }

    public final C48284uLu copydefault() {
        this.djBIcL = MetricStyle.LARGE;
        return this;
    }

    public final C48284uLu EZpvd(@NotNull C48282uLs c48282uLs) {
        Intrinsics.checkNotNullParameter(c48282uLs, "");
        this.EZpvd = Alignment.Companion.getEnd();
        this.copydefault = true;
        return this;
    }

    public final C48283uLt OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C48283uLt(str, this.OLrzqt, this.AYXKKw, this.AkhnZx, this.valueOf, this.gEmmrt, this.EZpvd, this.djBIcL, this.AEQbTJ, this.AhwBna, this.KWHzl, null);
    }
}
