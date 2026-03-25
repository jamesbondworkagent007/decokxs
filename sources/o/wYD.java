package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYD extends android.widget.FrameLayout implements InterfaceC55066xct {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static final java.util.Map<java.lang.Integer, StateListAnimator> copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt(-2, new StateListAnimator(32, 4)), C56390yDp.OLrzqt(-3, new StateListAnimator(24, 4)), C56390yDp.OLrzqt(-4, new StateListAnimator(16, 3)), C56390yDp.OLrzqt(-5, new StateListAnimator(12, 2)));
    public int AEQbTJ;
    public final C55065xcs EZpvd;
    public final C54952xal KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.wYD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wYD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, -3);
        this.EZpvd = c55065xcs;
        C54952xal c54952xalOLrzqt = C54952xal.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54952xalOLrzqt, "");
        this.KWHzl = c54952xalOLrzqt;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.DwQSDd);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.iUnTnt);
            if (drawable != null) {
                c54952xalOLrzqt.KWHzl.setImageDrawable(drawable);
            }
            setType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DzkRMH, 0));
            typedArrayObtainStyledAttributes.recycle();
            InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
            Unit unit = Unit.INSTANCE;
            KWHzl();
            C55296xhK.setHitRect$default(this, 0, 1, null);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setType(int i) {
        this.AEQbTJ = i;
        EZpvd();
    }

    public final wYC OLrzqt() {
        wYC wyc = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        return wyc;
    }

    public final void setIconDrawableRes(@androidx.annotation.DrawableRes int i) {
        this.KWHzl.KWHzl.setImageResource(i);
    }

    public final void setIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.KWHzl.KWHzl.setImageDrawable(drawable);
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.EZpvd.setOKDSSize(i);
        KWHzl();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.KWHzl.KWHzl.setEnabled(false);
        this.KWHzl.EZpvd.setEnabled(false);
    }

    private final void KWHzl() {
        int iCopydefault = this.EZpvd.copydefault();
        StateListAnimator stateListAnimator = copydefault.get(java.lang.Integer.valueOf(iCopydefault));
        if (stateListAnimator != null) {
            android.widget.FrameLayout frameLayout = this.KWHzl.EZpvd;
            Intrinsics.copydefault(frameLayout);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C55298xhM.dpInt$default(stateListAnimator.AEQbTJ(), (android.content.Context) null, 1, (java.lang.Object) null);
                layoutParams.height = C55298xhM.dpInt$default(stateListAnimator.AEQbTJ(), (android.content.Context) null, 1, (java.lang.Object) null);
                frameLayout.setLayoutParams(layoutParams);
                int iDpInt$default = C55298xhM.dpInt$default(stateListAnimator.KWHzl(), (android.content.Context) null, 1, (java.lang.Object) null);
                frameLayout.setPadding(iDpInt$default, iDpInt$default, iDpInt$default, iDpInt$default);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            pUU.copydefault("Unsupported size: " + iCopydefault + " for OKIconButton");
        }
        if (this.AEQbTJ == 2) {
            AEQbTJ();
        }
    }

    private final void EZpvd() {
        AEQbTJ();
        this.KWHzl.AEQbTJ.setAnimation(this.AEQbTJ == 1 ? C52761wXj.PendingIntent.getFieldNames : C52761wXj.PendingIntent.OLrzqt);
    }

    public final void AEQbTJ() {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        int i = this.AEQbTJ;
        if (i == 0) {
            C55279xgu c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            c55279xgu.OLrzqt(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu.copydefault(true);
            c55279xgu.AhwBna(ContextCompat.getColor(context, C52761wXj.Activity.aBDePw));
            c55279xgu.AYXKKw(ContextCompat.getColor(context, C52761wXj.Activity.GcnicV));
            c55279xgu.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.aBDePw));
            C55280xgv c55280xgv = new C55280xgv();
            android.widget.FrameLayout frameLayout = this.KWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            c55280xgv.KWHzl(frameLayout, c55279xgu);
            this.KWHzl.KWHzl.setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{ContextCompat.getColor(context, C52761wXj.Activity.hfdhUn), ContextCompat.getColor(context, C52761wXj.Activity.svhCHd)}));
            return;
        }
        if (i == 1) {
            C55279xgu c55279xgu2 = new C55279xgu();
            c55279xgu2.AkhnZx(0);
            c55279xgu2.OLrzqt(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu2.copydefault(true);
            c55279xgu2.AhwBna(ContextCompat.getColor(context, C52761wXj.Activity.RFmUsE));
            c55279xgu2.AYXKKw(ContextCompat.getColor(context, C52761wXj.Activity.pXZxY));
            c55279xgu2.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.gAnGwV));
            C55280xgv c55280xgv2 = new C55280xgv();
            android.widget.FrameLayout frameLayout2 = this.KWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            c55280xgv2.KWHzl(frameLayout2, c55279xgu2);
            this.KWHzl.KWHzl.setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{ContextCompat.getColor(context, C52761wXj.Activity.hfdhUn), ContextCompat.getColor(context, C52761wXj.Activity.sIqKDg)}));
            return;
        }
        if (i == 2) {
            C55279xgu c55279xgu3 = new C55279xgu();
            c55279xgu3.AkhnZx(0);
            c55279xgu3.OLrzqt(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu3.copydefault(true);
            c55279xgu3.fIwbmz(this.EZpvd.copydefault() == -5 ? C55298xhM.dpInt$default(0.75f, (android.content.Context) null, 1, (java.lang.Object) null) : C55298xhM.dpInt$default(1, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu3.KWHzl(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{ContextCompat.getColor(getContext(), C52761wXj.Activity.DfrfUJ), ContextCompat.getColor(getContext(), C52761wXj.Activity.DlABUU)}));
            c55279xgu3.AhwBna(ContextCompat.getColor(context, C52761wXj.Activity.aBDePw));
            c55279xgu3.AYXKKw(ContextCompat.getColor(context, C52761wXj.Activity.GcnicV));
            c55279xgu3.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.aBDePw));
            C55280xgv c55280xgv3 = new C55280xgv();
            android.widget.FrameLayout frameLayout3 = this.KWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            c55280xgv3.KWHzl(frameLayout3, c55279xgu3);
            this.KWHzl.KWHzl.setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{ContextCompat.getColor(context, C52761wXj.Activity.hfdhUn), ContextCompat.getColor(context, C52761wXj.Activity.svhCHd)}));
            return;
        }
        pUU.copydefault("Unsupported type: " + i + " for OKIconButton");
    }

    public final void setLoadingBackground() {
        C55279xgu c55279xgu;
        int i = this.AEQbTJ;
        if (i == 0) {
            c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            c55279xgu.OLrzqt(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV));
        } else if (i == 1) {
            c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            c55279xgu.OLrzqt(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.pXZxY));
        } else {
            c55279xgu = new C55279xgu();
            c55279xgu.AkhnZx(0);
            c55279xgu.fIwbmz(this.EZpvd.copydefault() == -5 ? C55298xhM.dpInt$default(0.75f, (android.content.Context) null, 1, (java.lang.Object) null) : C55298xhM.dpInt$default(1, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu.DbNXlk(ContextCompat.getColor(getContext(), C52761wXj.Activity.DfrfUJ));
            c55279xgu.OLrzqt(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
            c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV));
        }
        C55280xgv c55280xgv = new C55280xgv();
        android.widget.FrameLayout frameLayout = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        c55280xgv.KWHzl(frameLayout, c55279xgu);
    }

    public static final class StateListAnimator {
        public final int AEQbTJ;
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = stateListAnimator.EZpvd;
            }
            if ((i3 & 2) != 0) {
                i2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(int i, int i2) {
            return new StateListAnimator(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.EZpvd == stateListAnimator.EZpvd && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SizeConfig(containerSize=" + this.EZpvd + ", padding=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(int i, int i2) {
            this.EZpvd = i;
            this.AEQbTJ = i2;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
