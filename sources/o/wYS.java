package o;

import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYS extends C52794wYp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public Application AEQbTJ;
    public int EZpvd;
    public int copydefault;

    public interface Application {
        void KWHzl(@NotNull wYS wys, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYS(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C52794wYp
    public void setButtonSize$OKUILib_uilib(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectedStateChangeListener(Application application) {
        this.AEQbTJ = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:23) call: o.wYS.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ wYS(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = 36;
        this.EZpvd = 2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OFqMGB);
        try {
            this.copydefault = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.seuMaA, 36);
            this.EZpvd = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.znKlvJ, 2);
            typedArrayObtainStyledAttributes.recycle();
            copydefault();
            setMaxLines(this.EZpvd);
            int iOLrzqt = C55298xhM.OLrzqt(8, context);
            setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
            KWHzl();
            AEQbTJ(isSelected());
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setSelectionChipSize(int i) {
        if (i == this.copydefault) {
            return;
        }
        this.copydefault = i;
        copydefault();
    }

    public final void setTextMaxLines(int i) {
        if (i >= 1) {
            if (this.EZpvd == i) {
                return;
            }
            this.EZpvd = i;
            setMaxLines(i);
            return;
        }
        pUU.copydefault("OKSelectionChip", "maxLines: " + i + " must be greater than 0");
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (z2) {
            EZpvd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        AEQbTJ();
    }

    @Override // o.C52794wYp, o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        super.setOKDSSize(i);
    }

    @Override // o.C52794wYp
    public int AkhnZx() {
        return super.AkhnZx();
    }

    private final void copydefault() {
        int i = this.copydefault;
        if (i == 36) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            setMinHeight(C55298xhM.OLrzqt(36, context));
        } else {
            if (i != 44) {
                return;
            }
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            setMinHeight(C55298xhM.OLrzqt(40, context2));
        }
    }

    /* JADX DEBUG: Possible override for method o.wYp.AEQbTJ()Landroid/graphics/Rect; */
    public final void AEQbTJ() {
        KWHzl();
    }

    /* JADX DEBUG: Possible override for method o.wYp.EZpvd()Ljava/util/ArrayList; */
    public final void EZpvd() {
        AEQbTJ(isSelected());
        Application application = this.AEQbTJ;
        if (application != null) {
            application.KWHzl(this, isSelected());
        }
    }

    /* JADX DEBUG: Possible override for method o.wYp.KWHzl()Landroid/graphics/Rect; */
    public final void KWHzl() {
        setEllipsize(TextUtils.TruncateAt.END);
        setTextSize(14.0f);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, 12, 14, 2, 2);
        TextViewCompat.setTextAppearance(this, C52761wXj.LoaderManager.zuBGHE);
        if (isEnabled()) {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.svhCHd));
        } else {
            setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.hfdhUn));
        }
    }

    public final void AEQbTJ(boolean z) {
        C55279xgu c55279xguFARcdN = fARcdN();
        c55279xguFARcdN.zuBGHE();
        c55279xguFARcdN.copydefault(true);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xguFARcdN.OLrzqt(C55298xhM.AEQbTJ(8, context));
        if (z) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55279xguFARcdN.fIwbmz(C55298xhM.OLrzqt(1, context2));
            C33517mxu c33517mxu = C33517mxu.KWHzl;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c55279xguFARcdN.DbNXlk(c33517mxu.OLrzqt(context3, C52761wXj.ActionBar.fetchVPNInfo));
        } else {
            c55279xguFARcdN.fIwbmz(0);
        }
        c55279xguFARcdN.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.GQzpsZ));
        c55279xguFARcdN.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV));
        c55279xguFARcdN.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.RXdAnZ));
        getNewProxyInstance().KWHzl(this, fARcdN());
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
