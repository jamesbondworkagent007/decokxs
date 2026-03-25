package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.okinc.uilib.core.drawable.UnderlineType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xjf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55423xjf extends AppCompatTextView {
    public final InterfaceC56387yDm AYXKKw;
    public Function0<Unit> EZpvd;
    public boolean KWHzl;
    public final C55381xiq copydefault;
    public UnderlineType djBIcL;
    public final C55382xir gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC55423xjf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC55423xjf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55381xiq AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachClickListener(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.xjf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ AbstractC55423xjf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55423xjf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.xjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(AbstractC55423xjf.KWHzl(this.AEQbTJ));
            }
        });
        this.gEmmrt = new C55382xir(context, ContextCompat.getColor(context, C52761wXj.Activity.DCUTEIddSDPG));
        this.copydefault = new C55381xiq(context, valueOf());
        this.djBIcL = UnderlineType.DOTTED;
        setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        setHighlightColor(0);
        AEQbTJ(attributeSet);
    }

    private final int valueOf() {
        return ((java.lang.Number) this.AYXKKw.getValue()).intValue();
    }

    public static final int KWHzl(AbstractC55423xjf abstractC55423xjf) {
        return abstractC55423xjf.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QOLQEE);
    }

    public void setUnderlineColor(int i) {
        this.gEmmrt.AEQbTJ(i);
        invalidate();
    }

    public void setShowUnderline(boolean z) {
        this.KWHzl = z;
        requestLayout();
        invalidate();
    }

    public void setUnderlineType(@NotNull UnderlineType underlineType) {
        Intrinsics.checkNotNullParameter(underlineType, "");
        this.djBIcL = underlineType;
        this.gEmmrt.KWHzl(underlineType);
        invalidate();
    }

    public boolean copydefault() {
        return this.copydefault.KWHzl();
    }

    private final void AEQbTJ(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.IPostMessageServiceStub);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setUnderlineColor(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.ITrustedWebActivityCallbackDefault, ContextCompat.getColor(getContext(), C52761wXj.Activity.DCUTEIddSDPG)));
        setShowUnderline(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.ITrustedWebActivityCallbackStubProxy, false));
        setUnderlineType(UnderlineType.Companion.EZpvd(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.areNotificationsEnabled, UnderlineType.SOLID.getId())));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + yII.EZpvd(this.gEmmrt.OLrzqt() + 1.0f));
    }

    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        android.text.Layout layout;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (EZpvd() && (layout = getLayout()) != null) {
            int totalPaddingLeft = getTotalPaddingLeft();
            int lineCount = layout.getLineCount();
            int i = 0;
            while (i < lineCount) {
                boolean z = i == lineCount + (-1);
                int lineBottom = layout.getLineBottom(i);
                int totalPaddingTop = getTotalPaddingTop();
                float f = totalPaddingLeft;
                float lineLeft = layout.getLineLeft(i) + f;
                float lineRight = layout.getLineRight(i) + f;
                if (z && getLayoutDirection() == 1 && copydefault()) {
                    lineLeft += this.copydefault.EZpvd();
                }
                if (z && getLayoutDirection() == 0 && copydefault()) {
                    lineRight -= this.copydefault.EZpvd();
                }
                this.gEmmrt.OLrzqt(canvas, lineLeft, lineRight, lineBottom + totalPaddingTop);
                i++;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        AEQbTJ(canvas);
    }

    public void EZpvd(int i) {
        this.copydefault.copydefault(i);
    }

    public void KWHzl() {
        this.copydefault.copydefault();
        java.lang.CharSequence text = getText();
        setText(text != null ? text.toString() : null);
    }
}
