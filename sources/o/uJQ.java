package o;

import com.okinc.tradingbot.impl.common.model.TextColor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uJQ {
    public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> KWHzl;
    public final TextColor OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.Pair), (r2v0 com.okinc.tradingbot.impl.common.model.TextColor) A[MD:(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, com.okinc.tradingbot.impl.common.model.TextColor):void (m)] call: o.uJQ.<init>(kotlin.Pair, com.okinc.tradingbot.impl.common.model.TextColor):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ uJQ(kotlin.Pair pair, TextColor textColor, DefaultConstructorMarker defaultConstructorMarker) {
        this(pair, textColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uJQ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-uRw8rZc$default, reason: not valid java name */
    public static /* synthetic */ uJQ m8772copyuRw8rZc$default(uJQ ujq, kotlin.Pair pair, TextColor textColor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = ujq.KWHzl;
        }
        if ((i & 2) != 0) {
            textColor = ujq.OLrzqt;
        }
        return ujq.AEQbTJ(pair, textColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextColor AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uJQ AEQbTJ(@NotNull kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, @NotNull TextColor textColor) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(textColor, "");
        return new uJQ(pair, textColor, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uJQ)) {
            return false;
        }
        uJQ ujq = (uJQ) obj;
        return uLP.EZpvd(this.KWHzl, ujq.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, ujq.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (uLP.EZpvd(this.KWHzl) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TextProperties(value=" + uLP.gEmmrt(this.KWHzl) + ", color=" + this.OLrzqt + ")";
    }

    public uJQ(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, TextColor textColor) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(textColor, "");
        this.KWHzl = pair;
        this.OLrzqt = textColor;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
  (r1v0 kotlin.Pair)
  (wrap:com.okinc.tradingbot.impl.common.model.TextColor:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.common.model.TextColor:0x0004: SGET  A[WRAPPED] (LINE:171) com.okinc.tradingbot.impl.common.model.TextColor.Zero.OLrzqt com.okinc.tradingbot.impl.common.model.TextColor$Zero) : (r2v0 com.okinc.tradingbot.impl.common.model.TextColor))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(kotlin.Pair, com.okinc.tradingbot.impl.common.model.TextColor, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:169) call: o.uJQ.<init>(kotlin.Pair, com.okinc.tradingbot.impl.common.model.TextColor, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ uJQ(kotlin.Pair pair, TextColor textColor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pair, (i & 2) != 0 ? TextColor.Zero.OLrzqt : textColor, null);
    }
}
