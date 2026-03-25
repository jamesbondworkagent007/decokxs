package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xen, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55166xen extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public android.view.View AEQbTJ;
    public int AYXKKw;
    public java.lang.CharSequence AhwBna;
    public java.lang.CharSequence KWHzl;
    public final C54928xaN OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55166xen(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55166xen(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.xen.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55166xen(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55166xen(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54928xaN c54928xaNEZpvd = C54928xaN.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54928xaNEZpvd, "");
        this.OLrzqt = c54928xaNEZpvd;
        this.copydefault = -1;
        this.AhwBna = "";
        this.AYXKKw = -1;
        this.KWHzl = "";
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.RckOJh);
        setIconResId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.GiPPlL, -1));
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.idLUrz);
        setTitleText(string == null ? "" : string);
        setTitleAttachingViewResId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.fQQVvf, -1));
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.DXd);
        setDescriptionText(string2 != null ? string2 : "");
        typedArrayObtainStyledAttributes.recycle();
        C55312xha c55312xhaValueOf = c54928xaNEZpvd.OLrzqt.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setMovementMethod(null);
        }
        EZpvd();
    }

    public final void setIconResId(int i) {
        this.copydefault = i;
        android.widget.ImageView imageView = this.OLrzqt.AEQbTJ;
        if (i == -1) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(i);
        }
    }

    public final void setTitleText(java.lang.CharSequence charSequence) {
        this.AhwBna = charSequence;
        this.OLrzqt.OLrzqt.setTextValue(charSequence);
    }

    public final void setTitleAttachingView(android.view.View view) {
        this.AEQbTJ = view;
        C55258xgZ c55258xgZ = this.OLrzqt.OLrzqt;
        if (view != null) {
            c55258xgZ.setAttachingView(view);
        } else {
            c55258xgZ.ejfBZ();
        }
    }

    public final void setTitleAttachingViewResId(int i) {
        this.AYXKKw = i;
        C55258xgZ c55258xgZ = this.OLrzqt.OLrzqt;
        if (i != -1) {
            c55258xgZ.setAttachmentViewId(i);
        } else {
            c55258xgZ.ejfBZ();
        }
    }

    public final void setDescriptionText(java.lang.CharSequence charSequence) {
        this.KWHzl = charSequence;
        android.widget.TextView textView = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    public final void EZpvd() {
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.EZpvd(8.0f, context));
        c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialaKhcqp));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55279xgu.fIwbmz(C55298xhM.KWHzl(1.5f, context2));
        c55279xgu.KWHzl(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.iWlNch));
        c55279xgu.copydefault(true);
        C55280xgv c55280xgv = new C55280xgv();
        ConstraintLayout root = this.OLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
    }

    /* JADX INFO: renamed from: o.xen$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xen.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
