package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53024wdg extends ConstraintLayout {
    public java.lang.String AEQbTJ;
    public final AbstractC50899vcp EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53024wdg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53024wdg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.wdg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53024wdg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53024wdg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50899vcp abstractC50899vcpKWHzl = AbstractC50899vcp.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50899vcpKWHzl, "");
        this.EZpvd = abstractC50899vcpKWHzl;
    }

    public final void AEQbTJ(java.lang.String str) {
        ActionBar actionBarAEQbTJ = TaskDescription.AEQbTJ(str);
        java.lang.String strCopydefault = TaskDescription.copydefault(actionBarAEQbTJ);
        java.lang.String str2 = TaskDescription.AEQbTJ(actionBarAEQbTJ) + " " + C33070mpX.AYXKKw(C55688xof.Application.finit);
        AbstractC50899vcp abstractC50899vcp = this.EZpvd;
        abstractC50899vcp.copydefault.setText(str2);
        abstractC50899vcp.OLrzqt.setText(TaskDescription.EZpvd(actionBarAEQbTJ));
        TickerIconView tickerIconView = abstractC50899vcp.valueOf;
        tickerIconView.setShowTickerIcon(false);
        TickerIconView.ColorChangeMode colorChangeMode = TickerIconView.ColorChangeMode.COMPARE_LAST;
        tickerIconView.setColorChangeMode(colorChangeMode);
        if (str == null) {
            str = "";
        }
        tickerIconView.OLrzqt(str, "SWAP");
        tickerIconView.setOnTickerChange(new Function1() { // from class: o.wdh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53024wdg.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        });
        TickerIconView tickerIconView2 = abstractC50899vcp.AEQbTJ;
        tickerIconView2.setShowTickerIcon(false);
        tickerIconView2.setColorChangeMode(colorChangeMode);
        tickerIconView2.OLrzqt(strCopydefault, "SPOT");
        tickerIconView2.setOnTickerChange(new Function1() { // from class: o.wde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53024wdg.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C53024wdg c53024wdg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53024wdg.AEQbTJ = str;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53024wdg c53024wdg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53024wdg.OLrzqt = str;
        return Unit.INSTANCE;
    }
}
