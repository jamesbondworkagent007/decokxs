package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55100xda extends ConstraintLayout {
    public int AEQbTJ;
    public int EZpvd;
    public final C54926xaL KWHzl;
    public final int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55100xda(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55100xda(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.xda.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55100xda(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55100xda(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54926xaL c54926xaLKWHzl = C54926xaL.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54926xaLKWHzl, "");
        this.KWHzl = c54926xaLKWHzl;
        int iEZpvd = new C52771wXt(context).EZpvd();
        this.OLrzqt = iEZpvd;
        setPaddingRelative(iEZpvd, getPaddingTop(), iEZpvd, getPaddingBottom());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.Ohcwxs, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        copydefault().setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.OeawrHRnVkix, 0, 4, null));
        AEQbTJ().setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.isTimeProfileEmpty, 0, 4, null));
        EZpvd().setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.OhcwxsRkSIEV, 0, 4, null));
        setMaxLeftWith(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.gvFztT, 0));
        setMaxMiddleWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.gCiISl, 0));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.xda.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C55100xda.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int iOLrzqt = C55302xhQ.OLrzqt(context);
                int i2 = C55100xda.this.OLrzqt;
                int iOLrzqt2 = C55298xhM.OLrzqt(8, context);
                C55100xda.this.EZpvd = ((((iOLrzqt - (i2 * 2)) - iOLrzqt2) - C55298xhM.OLrzqt(24, context)) - C55298xhM.OLrzqt(84, context)) / 2;
                C55100xda.this.copydefault().setMaxWidth(C55100xda.this.KWHzl() < C55100xda.this.EZpvd ? C55100xda.this.EZpvd : C55100xda.this.KWHzl());
                C55100xda.this.AEQbTJ().setMaxWidth(C55100xda.this.OLrzqt() < C55100xda.this.EZpvd ? C55100xda.this.EZpvd : C55100xda.this.OLrzqt());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setMaxLeftWith(int i) {
        int i2 = this.EZpvd;
        if (i > i2) {
            i = i2;
        }
        this.AEQbTJ = i;
        copydefault().setMaxWidth(this.AEQbTJ);
    }

    public final void setMaxMiddleWidth(int i) {
        int i2 = this.EZpvd;
        if (i > i2) {
            i = i2;
        }
        this.copydefault = i;
        AEQbTJ().setMaxWidth(this.copydefault);
    }

    public final OKSortTextView copydefault() {
        OKSortTextView oKSortTextView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        return oKSortTextView;
    }

    public final OKSortTextView AEQbTJ() {
        OKSortTextView oKSortTextView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        return oKSortTextView;
    }

    public final OKSortTextView EZpvd() {
        OKSortTextView oKSortTextView = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        return oKSortTextView;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.OLrzqt * 2, 1073741824));
    }
}
