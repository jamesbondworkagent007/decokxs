package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55314xhc extends android.widget.RelativeLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fetchVPNInfo = 8;
    public int AkhnZx;
    public C55312xha AuCTel;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public C55312xha fJNWhG;
    public int getFieldNames;
    public float getNewProxyInstance;
    public java.lang.CharSequence hDKMBd;
    public android.view.View isConnected;
    public java.lang.String iwGUEr;
    public int uzCIH;
    public int values;
    public int wlaJM;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55314xhc(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55314xhc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55312xha AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AkhnZx() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float KWHzl() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHelperLabel(C55312xha c55312xha) {
        this.fJNWhG = c55312xha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHyperLabel(C55312xha c55312xha) {
        this.AuCTel = c55312xha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55312xha valueOf() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.xhc.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55314xhc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55314xhc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        java.lang.String strValueOf = "";
        Intrinsics.checkNotNullParameter(context, "");
        this.getNewProxyInstance = -1.0f;
        this.ejfBZ = -1;
        this.hDKMBd = "";
        this.uzCIH = -1;
        this.getFieldNames = -1;
        this.values = -1;
        this.fARcdN = Integer.MAX_VALUE;
        this.AkhnZx = -1;
        this.wlaJM = -1;
        this.iwGUEr = "";
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.gHZMYf);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.ORxRYg, 0, 4, null);
        java.lang.CharSequence string$default2 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.UeEOUB, 0, 4, null);
        if (!android.text.TextUtils.isEmpty(string$default)) {
            strValueOf = java.lang.String.valueOf(string$default);
        } else if (!android.text.TextUtils.isEmpty(string$default2)) {
            strValueOf = java.lang.String.valueOf(string$default2);
        }
        setText(strValueOf);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QfsBiF, -1.0f));
        if (KWHzl() == -1.0f) {
            setTextSize(typedArrayObtainStyledAttributes.getDimension(C52761wXj.PictureInPictureParams.QVAiDq, -1.0f));
        }
        if (KWHzl() != -1.0f) {
            setTextSize(KWHzl() / getResources().getDisplayMetrics().scaledDensity);
        }
        setTextColor(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QKVWgx, -1));
        if (this.uzCIH == -1) {
            setTextColor(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.QbewEr, -1));
        }
        setTextWeight(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.aKErDB, -1));
        if (this.wlaJM == -1) {
            setTextWeight(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.QOLQEE, -1));
        }
        if (this.wlaJM == -1) {
            setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.dNCPSb, -1));
            if (this.getFieldNames == -1) {
                setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.OcIXYQ, -1));
            }
        }
        setAttachmentView(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.RJOkX, -1));
        setAttachmentViewId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.QUSxYX, -1));
        setMaxLines(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.AxsJAY, Integer.MAX_VALUE));
        setLineHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.zuBGHE, -1));
        setHyperLabelAlignment$OKUILib_uilib(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.DTwDnp, 0));
        setTextDirection(AEQbTJ(context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setTextSize(float f) {
        C55320xhi c55320xhiKWHzl;
        this.getNewProxyInstance = f;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextSize(f);
    }

    public void setLineHeight(int i) {
        C55320xhi c55320xhiKWHzl;
        if (i < 0) {
            return;
        }
        this.ejfBZ = i;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setLineHeight(i);
    }

    public final void setTextValue(java.lang.CharSequence charSequence) {
        C55320xhi c55320xhiKWHzl;
        this.hDKMBd = charSequence;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(charSequence);
    }

    public final void setTextColor(int i) {
        C55320xhi c55320xhiKWHzl;
        this.uzCIH = i;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(this.uzCIH);
    }

    public final void setTextAppearance(int i) {
        C55312xha c55312xha;
        C55320xhi c55320xhiKWHzl;
        this.getFieldNames = i;
        if (i == -1 || (c55312xha = this.AuCTel) == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextAppearance(i);
    }

    public final void setAttachmentViewId(int i) {
        C55320xhi c55320xhiKWHzl;
        C55318xhg c55318xhgEZpvd;
        if (i == -1) {
            return;
        }
        this.values = i;
        setLayoutParams();
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha != null && (c55318xhgEZpvd = c55312xha.EZpvd()) != null) {
            c55318xhgEZpvd.removeAllViews();
            android.view.LayoutInflater.from(c55318xhgEZpvd.getContext()).inflate(i, (android.view.ViewGroup) c55318xhgEZpvd, true);
        }
        C55312xha c55312xha2 = this.AuCTel;
        if (c55312xha2 == null || (c55320xhiKWHzl = c55312xha2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(c55320xhiKWHzl.KWHzl());
    }

    public final void setAttachingView(android.view.View view) {
        C55320xhi c55320xhiKWHzl;
        C55318xhg c55318xhgEZpvd;
        if (view == null) {
            return;
        }
        this.isConnected = view;
        setLayoutParams();
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha != null && (c55318xhgEZpvd = c55312xha.EZpvd()) != null) {
            c55318xhgEZpvd.removeAllViews();
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            c55318xhgEZpvd.addView(view);
        }
        C55312xha c55312xha2 = this.AuCTel;
        if (c55312xha2 == null || (c55320xhiKWHzl = c55312xha2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(c55320xhiKWHzl.KWHzl());
    }

    public final void setMaxLines(int i) {
        C55320xhi c55320xhiKWHzl;
        this.fARcdN = i;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setMaxLines(i);
    }

    public final void setAttachmentView(int i) {
        this.AkhnZx = i;
        setAttachmentViewId(i);
    }

    public final void setTextWeight(int i) {
        this.wlaJM = i;
        setTextWeight$OKUILib_uilib(i);
    }

    public final void setText(java.lang.String str) {
        this.iwGUEr = str;
        setTextValue(str);
    }

    public final void setHyperLabelAlignment$OKUILib_uilib(int i) {
        C55320xhi c55320xhiKWHzl;
        this.fIwbmz = i;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextAlignment(i);
    }

    public static /* synthetic */ void setAttachmentViewVisibility$default(C55314xhc c55314xhc, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttachmentViewVisibility");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        c55314xhc.setAttachmentViewVisibility(z);
    }

    public final void setAttachmentViewVisibility(boolean z) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setShowAttachmentView(z);
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i) {
        C55320xhi c55320xhiKWHzl;
        super.setGravity(i);
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setGravity(i);
    }

    @Override // android.view.View
    public void setTextDirection(int i) {
        C55320xhi c55320xhiKWHzl;
        super.setTextDirection(i);
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextDirection(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C55312xha c55312xha;
        C55320xhi c55320xhiKWHzl;
        super.setOnClickListener(onClickListener);
        if (onClickListener == null || (c55312xha = this.AuCTel) == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setOnClickListener(onClickListener);
    }

    public final void ejfBZ() {
        C55318xhg c55318xhgEZpvd;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55318xhgEZpvd = c55312xha.EZpvd()) == null) {
            return;
        }
        c55318xhgEZpvd.removeAllViews();
    }

    public final void setTextWeight$OKUILib_uilib(int i) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55320xhiKWHzl = c55312xha.KWHzl()) == null) {
            return;
        }
        if (i < 500) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.gGvvIC);
        } else if (i < 700) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.giSNqX);
        } else {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, C52761wXj.LoaderManager.fFgQHt);
        }
    }

    public final void setLayoutParams() {
        C55318xhg c55318xhgEZpvd;
        ViewGroup.LayoutParams layoutParams;
        C55318xhg c55318xhgEZpvd2;
        C55312xha c55312xha = this.AuCTel;
        if (c55312xha == null || (c55318xhgEZpvd = c55312xha.EZpvd()) == null || (layoutParams = c55318xhgEZpvd.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        C55312xha c55312xha2 = this.AuCTel;
        if (c55312xha2 == null || (c55318xhgEZpvd2 = c55312xha2.EZpvd()) == null) {
            return;
        }
        c55318xhgEZpvd2.setLayoutParams(layoutParams);
    }

    public final int AEQbTJ(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(C52761wXj.LoaderManager.gasjUx, new int[]{android.R.attr.textDirection});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            return typedArrayObtainStyledAttributes.getInt(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: o.xhc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xhc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
