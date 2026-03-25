package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.widget.asset_card.DexAssetContentBlock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28013kLr extends LinearLayoutCompat {
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28013kLr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28013kLr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.kLr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28013kLr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28013kLr(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28013kLr.KWHzl(context, this);
            }
        });
    }

    private final C21623hGf OLrzqt() {
        return (C21623hGf) this.EZpvd.getValue();
    }

    public static final C21623hGf KWHzl(android.content.Context context, C28013kLr c28013kLr) {
        return C21623hGf.copydefault(android.view.LayoutInflater.from(context), c28013kLr, true);
    }

    public final void setData(@NotNull DexAssetContentBlock.Trade trade) {
        Intrinsics.checkNotNullParameter(trade, "");
        C21623hGf c21623hGfOLrzqt = OLrzqt();
        AppCompatTextView appCompatTextView = c21623hGfOLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C31258lqd.copydefault(appCompatTextView, trade.OLrzqt());
        c21623hGfOLrzqt.OLrzqt.setText(trade.KWHzl());
        AppCompatTextView appCompatTextView2 = c21623hGfOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C31258lqd.setTextColorOrDisabledColor$default(appCompatTextView2, trade.EZpvd(), 0, 2, null);
    }
}
