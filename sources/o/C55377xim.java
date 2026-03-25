package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55377xim extends android.widget.LinearLayout implements InterfaceC55066xct {
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public final C55065xcs AYXKKw;
    public boolean AhwBna;
    public Function0<Unit> KWHzl;
    public C54921xaG OLrzqt;
    public android.graphics.drawable.Drawable copydefault;
    public java.lang.String djBIcL;
    public android.graphics.drawable.Drawable gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55377xim(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterceptEvent(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: o.xim.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55377xim(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55377xim(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54921xaG c54921xaGCopydefault = C54921xaG.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54921xaGCopydefault, "");
        this.OLrzqt = c54921xaGCopydefault;
        this.djBIcL = "";
        this.AEQbTJ = "";
        this.AhwBna = true;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AYXKKw = c55065xcs;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OGitdB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setStartDrawable(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.zbGDDc));
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.OHsvZP);
        setTitleText(string == null ? "" : string);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.zdxASf);
        setDescriptionText(string2 != null ? string2 : "");
        this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.avCqka, true);
        setEndDrawable(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.ardYFU));
        typedArrayObtainStyledAttributes.recycle();
        C54921xaG c54921xaG = this.OLrzqt;
        c54921xaG.AhwBna.setTextValue(this.djBIcL);
        c54921xaG.KWHzl.setText(this.AEQbTJ);
        valueOf();
        setColorState();
    }

    public final void setStartDrawable(android.graphics.drawable.Drawable drawable) {
        this.gEmmrt = drawable;
        android.widget.ImageView imageView = this.OLrzqt.AEQbTJ;
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final C55258xgZ AhwBna() {
        C55258xgZ c55258xgZ = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.OLrzqt.AhwBna.setText(str);
    }

    public final void setDescriptionText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        android.widget.TextView textView = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void setEndDrawable(android.graphics.drawable.Drawable drawable) {
        this.copydefault = drawable;
        android.widget.ImageView imageView = this.OLrzqt.OLrzqt;
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
    }

    public int copydefault() {
        return this.AYXKKw.copydefault();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.AYXKKw.setOKDSSize(i);
        valueOf();
    }

    public final void valueOf() {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (this.AYXKKw.copydefault() >= -4) {
            android.view.View root = this.OLrzqt.getRoot();
            android.content.Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iKWHzl = C55298xhM.KWHzl(16.0f, context);
            android.content.Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iKWHzl2 = C55298xhM.KWHzl(20.0f, context2);
            android.content.Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iKWHzl3 = C55298xhM.KWHzl(16.0f, context3);
            android.content.Context context4 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            root.setPaddingRelative(iKWHzl, iKWHzl2, iKWHzl3, C55298xhM.KWHzl(20.0f, context4));
            AhwBna().setTextSize(18.0f);
            C55312xha c55312xhaValueOf = AhwBna().valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                TextViewCompat.setTextAppearance(c55320xhiKWHzl2, C52761wXj.LoaderManager.fFgQHt);
            }
            ViewGroup.LayoutParams layoutParams = this.OLrzqt.AEQbTJ.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            layoutParams2.width = C55298xhM.KWHzl(32.0f, context5);
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            layoutParams2.height = C55298xhM.KWHzl(32.0f, context6);
            this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams2);
            return;
        }
        android.view.View root2 = this.OLrzqt.getRoot();
        android.content.Context context7 = root2.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        int iKWHzl4 = C55298xhM.KWHzl(16.0f, context7);
        android.content.Context context8 = root2.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        int iKWHzl5 = C55298xhM.KWHzl(16.0f, context8);
        android.content.Context context9 = root2.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        int iKWHzl6 = C55298xhM.KWHzl(16.0f, context9);
        android.content.Context context10 = root2.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        root2.setPaddingRelative(iKWHzl4, iKWHzl5, iKWHzl6, C55298xhM.KWHzl(16.0f, context10));
        AhwBna().setTextSize(16.0f);
        C55312xha c55312xhaValueOf2 = AhwBna().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.giSNqX);
        }
        ViewGroup.LayoutParams layoutParams3 = this.OLrzqt.AEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        android.content.Context context11 = root2.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "");
        layoutParams4.width = C55298xhM.KWHzl(28.0f, context11);
        android.content.Context context12 = root2.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        layoutParams4.height = C55298xhM.KWHzl(28.0f, context12);
        this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams4);
        Intrinsics.copydefault(root2);
    }

    public final void setColorState() {
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ));
        c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.GhqvEQ));
        c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.DcMfJKDCKfqPDCfLja));
        c55279xgu.copydefault(true);
        android.view.View root = this.OLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
    }
}
