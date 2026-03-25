package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hXQ extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final hGV EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.hXQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ hXQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXQ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hGV hgvKWHzl = hGV.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgvKWHzl, "");
        this.EZpvd = hgvKWHzl;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXQ.AEQbTJ(context, this);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXQ.OLrzqt(context, this);
            }
        });
        if (isInEditMode()) {
            return;
        }
        C55113xdn c55113xdn = hgvKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_ORDER_PENDING_LOADING);
        hgvKWHzl.EZpvd.setAutoMirrored(true);
    }

    private final C22821hmb AEQbTJ() {
        return (C22821hmb) this.OLrzqt.getValue();
    }

    public static final C22821hmb AEQbTJ(android.content.Context context, hXQ hxq) {
        AppCompatImageView appCompatImageView = hxq.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        AppCompatTextView appCompatTextView = hxq.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C55113xdn c55113xdn = hxq.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        return new C22821hmb(context, appCompatImageView, appCompatTextView, c55113xdn);
    }

    private final C22820hma EZpvd() {
        return (C22820hma) this.AEQbTJ.getValue();
    }

    public static final C22820hma OLrzqt(android.content.Context context, hXQ hxq) {
        AppCompatImageView appCompatImageView = hxq.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        AppCompatTextView appCompatTextView = hxq.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C55113xdn c55113xdn = hxq.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        return new C22820hma(context, appCompatImageView, appCompatTextView, c55113xdn);
    }

    public final void setState(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C22822hmc.copydefault(str, AEQbTJ());
        } else {
            C22822hmc.EZpvd(str, EZpvd());
        }
    }
}
