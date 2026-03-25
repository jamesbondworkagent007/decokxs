package o;

import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55371xig extends android.widget.RelativeLayout {
    public C54923xaI AEQbTJ;
    public boolean AhwBna;
    public android.graphics.drawable.Drawable EZpvd;
    public int KWHzl;
    public Function0<Unit> OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55371xig(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCardBinding$OKUILib_uilib(@NotNull C54923xaI c54923xaI) {
        Intrinsics.checkNotNullParameter(c54923xaI, "");
        this.AEQbTJ = c54923xaI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterceptEvent(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:25) call: o.xig.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55371xig(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55371xig(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54923xaI c54923xaIEZpvd = C54923xaI.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54923xaIEZpvd, "");
        this.AEQbTJ = c54923xaIEZpvd;
        this.gEmmrt = "";
        this.copydefault = "";
        this.AhwBna = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.IYdWPz);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.QzqeNH);
        setTitleText(string == null ? "" : string);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.aWuQzD);
        setDescriptionText(string2 != null ? string2 : "");
        setCustomViewId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.fJk, 0));
        this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.hpmliR, true);
        if (this.KWHzl != 0) {
            this.AEQbTJ.EZpvd.removeAllViews();
            android.view.LayoutInflater.from(context).inflate(this.KWHzl, (android.view.ViewGroup) this.AEQbTJ.EZpvd, true);
        }
        setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OAjjVP));
        typedArrayObtainStyledAttributes.recycle();
        this.AEQbTJ.gEmmrt.setText(this.gEmmrt);
        C55312xha c55312xhaValueOf = this.AEQbTJ.gEmmrt.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.fFgQHt);
        }
        this.AEQbTJ.KWHzl.setText(this.copydefault);
        setColorState();
    }

    public final C55258xgZ AhwBna() {
        C55258xgZ c55258xgZ = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.AEQbTJ.gEmmrt.setText(str);
    }

    public final void setDescriptionText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        android.widget.TextView textView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void setCustomViewId(int i) {
        this.KWHzl = i;
        if (i != 0) {
            this.AEQbTJ.EZpvd.removeAllViews();
            android.view.LayoutInflater.from(getContext()).inflate(i, (android.view.ViewGroup) this.AEQbTJ.EZpvd, true);
        }
    }

    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.EZpvd = drawable;
        android.widget.ImageView imageView = this.AEQbTJ.AEQbTJ;
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void setColorState() {
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.EZpvd(12.0f, context));
        c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.inahnb));
        c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.sRzUNh));
        c55279xgu.copydefault(true);
        android.widget.RelativeLayout root = this.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
    }
}
