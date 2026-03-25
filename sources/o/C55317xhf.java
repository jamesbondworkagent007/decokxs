package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55317xhf extends C55314xhc implements InterfaceC55066xct {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public final C55316xhe OLrzqt;
    public final C55065xcs djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55317xhf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55317xhf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.xhf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55317xhf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55317xhf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55316xhe c55316xhe = new C55316xhe(this);
        this.OLrzqt = c55316xhe;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.djBIcL = c55065xcs;
        this.KWHzl = ContextCompat.getColor(context, C52761wXj.Activity.svhCHd);
        this.AEQbTJ = ContextCompat.getColor(context, C52761wXj.Activity.hfdhUn);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55316xhe, attributeSet, C52761wXj.ActionBar.htlTjW, 0, 4, null);
        this.KWHzl = c55316xhe.copydefault();
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        OLrzqt(context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.RcXXUw);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setEmphasis(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.DAIeex, 0));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.QKudOq, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setEmphasis(int i) {
        this.EZpvd = i;
        setTextAppearance(i == 0 ? C52761wXj.LoaderManager.fFgQHt : C52761wXj.LoaderManager.giSNqX);
    }

    public final void setUnderlineColor(int i) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setUnderlineColor(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        C55320xhi c55320xhiKWHzl;
        super.setEnabled(z);
        int i = z ? this.KWHzl : this.AEQbTJ;
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setEnabled(z);
            c55320xhiKWHzl.setUnderlineColor(i);
        }
        setTextColor(i);
    }

    @Override // o.C55314xhc, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setBackground(ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.DcMfJKfwDlxl));
        }
        super.setOnClickListener(onClickListener);
    }

    public int copydefault() {
        return this.djBIcL.copydefault();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        C55320xhi c55320xhiKWHzl;
        this.djBIcL.setOKDSSize(i);
        EZpvd();
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextSize(KWHzl());
        }
        requestLayout();
    }

    public final void OLrzqt(android.content.Context context) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C52761wXj.Fragment.QfsBiF, (android.view.ViewGroup) this, false);
        Intrinsics.copydefault(viewInflate, "");
        setHyperLabel((C55312xha) viewInflate);
        C55312xha c55312xhaValueOf2 = valueOf();
        if (c55312xhaValueOf2 != null) {
            C55312xha c55312xhaValueOf3 = valueOf();
            c55312xhaValueOf2.setUnderlineTextView(c55312xhaValueOf3 != null ? (C55320xhi) c55312xhaValueOf3.findViewById(C52761wXj.FragmentManager.RTWSvT) : null);
            C55312xha c55312xhaValueOf4 = valueOf();
            c55312xhaValueOf2.setSecondView(c55312xhaValueOf4 != null ? (C55318xhg) c55312xhaValueOf4.findViewById(C52761wXj.FragmentManager.gUEfcq) : null);
        }
        if (KWHzl() == -1.0f) {
            EZpvd();
        }
        if (values() == -1) {
            setTextColor(this.OLrzqt.copydefault());
        }
        if (fetchVPNInfo() == -1) {
            setTextWeight(this.OLrzqt.AhwBna());
        }
        C55312xha c55312xhaValueOf5 = valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl2 = c55312xhaValueOf5.KWHzl()) != null) {
            if (isConnected() != -1) {
                c55320xhiKWHzl2.setTextAppearance(isConnected());
            }
            c55320xhiKWHzl2.setHyperLabelLayout$OKUILib_uilib(valueOf());
            c55320xhiKWHzl2.setTextSize(KWHzl());
            c55320xhiKWHzl2.setTextColor(values());
            setTextWeight$OKUILib_uilib(fetchVPNInfo());
            c55320xhiKWHzl2.setMaxLines(gEmmrt());
            c55320xhiKWHzl2.setTextAlignment(AYXKKw());
            c55320xhiKWHzl2.setTextDirection(getTextDirection());
            if (AEQbTJ() >= 0) {
                c55320xhiKWHzl2.setLineHeight(AEQbTJ());
            }
        }
        final C55312xha c55312xhaValueOf6 = valueOf();
        if (c55312xhaValueOf6 != null) {
            C55320xhi c55320xhiKWHzl3 = c55312xhaValueOf6.KWHzl();
            if (c55320xhiKWHzl3 != null) {
                c55320xhiKWHzl3.setText(AkhnZx());
            }
            C55318xhg c55318xhgEZpvd = c55312xhaValueOf6.EZpvd();
            if (c55318xhgEZpvd != null) {
                c55318xhgEZpvd.setOnVisibilityChanged$OKUILib_uilib(new Function1() { // from class: o.xhd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55317xhf.KWHzl(c55312xhaValueOf6, (java.lang.Integer) obj);
                    }
                });
            }
        }
        C55312xha c55312xhaValueOf7 = valueOf();
        if (c55312xhaValueOf7 != null) {
            addView(c55312xhaValueOf7);
        }
        setGravity(getGravity());
        if (this.OLrzqt.EZpvd() && (c55312xhaValueOf = valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setShowUnderline(true);
            c55320xhiKWHzl.setUnderlineColor(ContextCompat.getColor(context, C52761wXj.Activity.svhCHd));
            c55320xhiKWHzl.setLineStyle(1);
        }
        setHelperLabel(valueOf());
    }

    public static final Unit KWHzl(C55312xha c55312xha, java.lang.Integer num) {
        C55320xhi c55320xhiKWHzl = c55312xha.KWHzl();
        if (c55320xhiKWHzl != null) {
            C55320xhi c55320xhiKWHzl2 = c55312xha.KWHzl();
            c55320xhiKWHzl.setText(c55320xhiKWHzl2 != null ? c55320xhiKWHzl2.KWHzl() : null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        float f;
        float fAEQbTJ;
        float f2;
        if (copydefault() == -6) {
            fAEQbTJ = this.OLrzqt.valueOf();
            f2 = getResources().getDisplayMetrics().scaledDensity;
        } else if (copydefault() == -5) {
            fAEQbTJ = this.OLrzqt.OLrzqt();
            f2 = getResources().getDisplayMetrics().scaledDensity;
        } else if (copydefault() == -4) {
            fAEQbTJ = this.OLrzqt.KWHzl();
            f2 = getResources().getDisplayMetrics().scaledDensity;
        } else if (copydefault() != -3) {
            f = 14.0f;
            setTextSize(f);
        } else {
            fAEQbTJ = this.OLrzqt.AEQbTJ();
            f2 = getResources().getDisplayMetrics().scaledDensity;
        }
        f = fAEQbTJ / f2;
        setTextSize(f);
    }

    /* JADX INFO: renamed from: o.xhf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xhf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
