package o;

import android.graphics.PorterDuff;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55014xbu extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public int AEQbTJ;
    public final C54944xad EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55014xbu(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:26) call: o.xbu.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55014xbu(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55014xbu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54944xad c54944xadKWHzl = C54944xad.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54944xadKWHzl, "");
        this.EZpvd = c54944xadKWHzl;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.gAnGwV);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.RFmUsE, -1));
        typedArrayObtainStyledAttributes.recycle();
        android.widget.ImageView imageView = c54944xadKWHzl.djBIcL;
        imageView.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        imageView.setImageTintList(ContextCompat.getColorStateList(context, C52761wXj.Activity.DVmcag));
    }

    public final void setType(int i) {
        if (i < 0) {
            return;
        }
        this.AEQbTJ = i;
        KWHzl(i);
    }

    public final void setFunctionImage(android.graphics.drawable.Drawable drawable) {
        this.EZpvd.OLrzqt.setImageDrawable(drawable);
    }

    public final void setFunctionImage(@androidx.annotation.DrawableRes int i) {
        this.EZpvd.OLrzqt.setImageDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public final void setUnitText(java.lang.CharSequence charSequence) {
        this.EZpvd.valueOf.setText(charSequence);
    }

    public final void setActionText(java.lang.CharSequence charSequence) {
        this.EZpvd.AEQbTJ.setText(charSequence);
    }

    public final void setSelectionHeaderImage(android.graphics.drawable.Drawable drawable) {
        this.EZpvd.djBIcL.setImageDrawable(drawable);
    }

    public final void setSelectionHeaderImage(@androidx.annotation.DrawableRes int i) {
        this.EZpvd.djBIcL.setImageDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public final void setSelectionText(java.lang.CharSequence charSequence) {
        this.EZpvd.AYXKKw.setText(charSequence);
    }

    public final void setSelectionCaretImage(android.graphics.drawable.Drawable drawable) {
        this.EZpvd.gEmmrt.setImageDrawable(drawable);
    }

    public final void setSelectionCaretImage(@androidx.annotation.DrawableRes int i) {
        this.EZpvd.gEmmrt.setImageDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public final void KWHzl(int i) {
        if (i == 0) {
            C54944xad c54944xad = this.EZpvd;
            android.widget.ImageView imageView = c54944xad.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.TextView textView = c54944xad.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C52794wYp c52794wYp = c54944xad.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            android.widget.LinearLayout linearLayout = c54944xad.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.view.View view = c54944xad.copydefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            return;
        }
        if (i == 1) {
            C54944xad c54944xad2 = this.EZpvd;
            android.widget.ImageView imageView2 = c54944xad2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            android.widget.TextView textView2 = c54944xad2.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            C52794wYp c52794wYp2 = c54944xad2.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = c54944xad2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            android.view.View view2 = c54944xad2.copydefault;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            return;
        }
        if (i == 2) {
            C54944xad c54944xad3 = this.EZpvd;
            android.widget.ImageView imageView3 = c54944xad3.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            android.widget.TextView textView3 = c54944xad3.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            C52794wYp c52794wYp3 = c54944xad3.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(8);
            android.widget.LinearLayout linearLayout3 = c54944xad3.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(0);
            android.view.View view3 = c54944xad3.copydefault;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(0);
            return;
        }
        if (i == 3) {
            C54944xad c54944xad4 = this.EZpvd;
            android.widget.ImageView imageView4 = c54944xad4.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
            android.widget.TextView textView4 = c54944xad4.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            C52794wYp c52794wYp4 = c54944xad4.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
            c52794wYp4.setVisibility(0);
            android.widget.LinearLayout linearLayout4 = c54944xad4.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            linearLayout4.setVisibility(8);
            android.view.View view4 = c54944xad4.copydefault;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            view4.setVisibility(0);
            return;
        }
        if (i == 4) {
            C54944xad c54944xad5 = this.EZpvd;
            android.widget.ImageView imageView5 = c54944xad5.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(8);
            android.widget.TextView textView5 = c54944xad5.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            C52794wYp c52794wYp5 = c54944xad5.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp5, "");
            c52794wYp5.setVisibility(8);
            android.widget.LinearLayout linearLayout5 = c54944xad5.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            linearLayout5.setVisibility(0);
            android.view.View view5 = c54944xad5.copydefault;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            view5.setVisibility(8);
            return;
        }
        if (i != 5) {
            return;
        }
        C54944xad c54944xad6 = this.EZpvd;
        android.widget.ImageView imageView6 = c54944xad6.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView6, "");
        imageView6.setVisibility(8);
        android.widget.TextView textView6 = c54944xad6.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(8);
        C52794wYp c52794wYp6 = c54944xad6.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp6, "");
        c52794wYp6.setVisibility(0);
        android.widget.LinearLayout linearLayout6 = c54944xad6.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
        linearLayout6.setVisibility(8);
        android.view.View view6 = c54944xad6.copydefault;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        view6.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.xbu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
