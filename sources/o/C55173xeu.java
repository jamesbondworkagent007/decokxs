package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xeu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55173xeu extends android.widget.LinearLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;
    public java.lang.String AYXKKw;
    public android.graphics.drawable.Drawable KWHzl;
    public final C54930xaP OLrzqt;
    public C55171xes copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55173xeu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55173xeu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmptyType(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTitle(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.ffGIBT int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.xeu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55173xeu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.ffGIBT : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55173xeu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = "";
        this.valueOf = "";
        this.copydefault = new C55171xes(this);
        C54930xaP c54930xaPAEQbTJ = C54930xaP.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54930xaPAEQbTJ, "");
        this.OLrzqt = c54930xaPAEQbTJ;
        this.AYXKKw = "";
        setGravity(1);
        setOrientation(1);
        this.copydefault.OLrzqt(null, C52761wXj.ActionBar.ffGIBT, C52761wXj.LoaderManager.dNCPSb);
        setImage(this.copydefault.OLrzqt());
        if (this.copydefault.gEmmrt() != 0) {
            TextViewCompat.setTextAppearance(c54930xaPAEQbTJ.EZpvd, this.copydefault.gEmmrt());
        }
        if (this.copydefault.AhwBna() != 0) {
            TextViewCompat.setTextAppearance(c54930xaPAEQbTJ.OLrzqt, this.copydefault.AhwBna());
        }
        c54930xaPAEQbTJ.OLrzqt.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.v));
        if (this.copydefault.copydefault() != 0) {
            c54930xaPAEQbTJ.copydefault.setOKDSType(this.copydefault.copydefault());
        }
        if (this.copydefault.KWHzl() != 0) {
            c54930xaPAEQbTJ.copydefault.setOKDSSize(this.copydefault.KWHzl());
        }
        if (this.copydefault.AEQbTJ() != 0) {
            c54930xaPAEQbTJ.copydefault.setOKDSPill(this.copydefault.AEQbTJ());
        }
        if (this.copydefault.djBIcL() != -2) {
            c54930xaPAEQbTJ.AEQbTJ.getLayoutParams().width = this.copydefault.djBIcL();
        }
        if (this.copydefault.EZpvd() != -2) {
            c54930xaPAEQbTJ.AEQbTJ.getLayoutParams().height = this.copydefault.EZpvd();
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.fJNWhG, 0, 4, null);
        java.lang.String string = string$default != null ? string$default.toString() : null;
        this.gEmmrt = string;
        if (string != null) {
            setTitle(string);
        }
        java.lang.CharSequence string$default2 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.DbNXlk, 0, 4, null);
        java.lang.String string2 = string$default2 != null ? string$default2.toString() : null;
        this.AYXKKw = string2;
        if (string2 != null) {
            setSubTitle((java.lang.CharSequence) string2);
        }
        java.lang.CharSequence string$default3 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.isConnected, 0, 4, null);
        java.lang.String string3 = string$default3 != null ? string$default3.toString() : null;
        this.valueOf = string3;
        if (string3 != null) {
            setRetry(string3);
        }
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.values);
        this.KWHzl = drawable;
        if (drawable != null) {
            setImage(drawable);
        }
        int integer = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.AkhnZx, 0);
        this.AEQbTJ = integer;
        if (this.KWHzl == null) {
            setEmptyTypeImage(integer);
        }
        TextViewCompat.setLineHeight(c54930xaPAEQbTJ.EZpvd, C55298xhM.OLrzqt(20, context));
        TextViewCompat.setLineHeight(c54930xaPAEQbTJ.OLrzqt, C55298xhM.OLrzqt(22, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setEmptyTypeImage(int i) {
        switch (i) {
            case 0:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.RWIpjU));
                break;
            case 1:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.HJWChPRGtXKCRGtXKC));
                break;
            case 2:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.getSerial));
                break;
            case 3:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.ORmwhf));
                break;
            case 4:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.gCNefq));
                break;
            case 5:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.HJWChPURsaBn));
                break;
            case 6:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.HJWChPRGtXKC));
                break;
            case 7:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.HJWChPRGtXKCDKRTZD));
                break;
            case 8:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.HJWChPRAkuRW));
                break;
            case 9:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.QTtQrx));
                break;
            case 10:
                setImage(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.DcMfJK));
                break;
        }
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        android.widget.TextView textView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        setContent(textView, charSequence);
    }

    public final void setSubTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        android.widget.TextView textView = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        setContent(textView, charSequence);
    }

    public final void setRetry(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        C52794wYp c52794wYp = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        setContent(c52794wYp, charSequence);
    }

    public final void setRetryClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.OLrzqt.copydefault.setOnClickListener(onClickListener);
    }

    public final void setImage(android.graphics.drawable.Drawable drawable) {
        this.OLrzqt.AEQbTJ.setImageDrawable(drawable);
    }

    public final void setImage(@androidx.annotation.DrawableRes int i) {
        this.OLrzqt.AEQbTJ.setImageResource(i);
    }

    public final C52794wYp AEQbTJ() {
        C52794wYp c52794wYp = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        return c52794wYp;
    }

    public final android.widget.ImageView copydefault() {
        android.widget.ImageView imageView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setContent(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (charSequence.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: o.xeu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xeu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
