package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55258xgZ extends C55314xhc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public int AYXKKw;
    public wYC AhwBna;
    public int DbNXlk;
    public int djBIcL;
    public android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55258xgZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55258xgZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wYC copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.xgZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55258xgZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: o.xgZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55258xgZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.zLjUOn);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.djBIcL = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.AwvSrB, 0);
        this.AYXKKw = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.AuCTelauCTel, 0);
        this.DbNXlk = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.sSMYrx, ContextCompat.getColor(context, C52761wXj.Activity.iUnTnt));
        typedArrayObtainStyledAttributes.recycle();
        copydefault(context);
    }

    @Override // o.C55314xhc
    public void setTextSize(float f) {
        super.setTextSize(f);
        post(new java.lang.Runnable() { // from class: o.xhb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55258xgZ.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(C55258xgZ c55258xgZ) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
        c55258xgZ.KWHzl((c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) ? 0 : c55320xhiKWHzl.getLineHeight());
    }

    @Override // o.C55314xhc
    public float KWHzl() {
        return super.KWHzl();
    }

    @Override // o.C55314xhc
    public int AEQbTJ() {
        return super.AEQbTJ();
    }

    @Override // o.C55314xhc
    public void setLineHeight(int i) {
        super.setLineHeight(i);
        if (i < 0) {
            return;
        }
        KWHzl(i);
    }

    private final void copydefault(android.content.Context context) {
        C55320xhi c55320xhiKWHzl;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C52761wXj.Fragment.QfsBiF, (android.view.ViewGroup) this, false);
        Intrinsics.copydefault(viewInflate, "");
        setHyperLabel((C55312xha) viewInflate);
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf != null) {
            C55312xha c55312xhaValueOf2 = valueOf();
            c55312xhaValueOf.setUnderlineTextView(c55312xhaValueOf2 != null ? (C55320xhi) c55312xhaValueOf2.findViewById(C52761wXj.FragmentManager.RTWSvT) : null);
            C55320xhi c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl();
            if (c55320xhiKWHzl2 != null) {
                c55320xhiKWHzl2.setLineStyle(this.djBIcL);
            }
            C55312xha c55312xhaValueOf3 = valueOf();
            c55312xhaValueOf.setSecondView(c55312xhaValueOf3 != null ? (C55318xhg) c55312xhaValueOf3.findViewById(C52761wXj.FragmentManager.gUEfcq) : null);
        }
        if (KWHzl() == -1.0f) {
            setTextSize(12.0f);
        }
        if (values() == -1) {
            setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.svhCHd));
        }
        if (fetchVPNInfo() == -1) {
            setTextWeight(400);
        }
        C55312xha c55312xhaValueOf4 = valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl = c55312xhaValueOf4.KWHzl()) != null) {
            if (isConnected() != -1) {
                c55320xhiKWHzl.setTextAppearance(isConnected());
            }
            c55320xhiKWHzl.setHyperLabelLayout$OKUILib_uilib(valueOf());
            c55320xhiKWHzl.setTextSize(KWHzl());
            c55320xhiKWHzl.setTextColor(values());
            c55320xhiKWHzl.setUnderlineColor(this.DbNXlk);
            setTextWeight$OKUILib_uilib(fetchVPNInfo());
            c55320xhiKWHzl.setMaxLines(gEmmrt());
            c55320xhiKWHzl.setTextAlignment(AYXKKw());
            if (AEQbTJ() >= 0) {
                c55320xhiKWHzl.setLineHeight(AEQbTJ());
            }
        }
        OLrzqt(context);
        setGravity(getGravity());
        setHelperLabel(valueOf());
    }

    public final void setHelperLabelType(int i) {
        this.AYXKKw = i;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        copydefault(context);
        requestLayout();
    }

    public final void setUnderlineStyle(int i) {
        this.djBIcL = i;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        copydefault(context);
        requestLayout();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        super.onLayout(z, i, i2, i3, i4);
        wYC wyc = this.AhwBna;
        if (wyc == null || (layoutParams = wyc.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = getMeasuredHeight();
        layoutParams.height = getMeasuredHeight();
    }

    private final void OLrzqt(android.content.Context context) {
        C55312xha c55312xhaValueOf;
        C55318xhg c55318xhgEZpvd;
        C55318xhg c55318xhgEZpvd2;
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55312xha c55312xhaValueOf2 = valueOf();
        this.valueOf = c55312xhaValueOf2 != null ? c55312xhaValueOf2.EZpvd() : null;
        int i = this.AYXKKw;
        if (i != 2) {
            if (i == 0 && djBIcL() == -1 && OLrzqt() == null) {
                this.AhwBna = new wYC(context, null, 0, 6, null);
                C55312xha c55312xhaValueOf3 = valueOf();
                int lineHeight = (c55312xhaValueOf3 == null || (c55320xhiKWHzl2 = c55312xhaValueOf3.KWHzl()) == null) ? 0 : c55320xhiKWHzl2.getLineHeight();
                C55312xha c55312xhaValueOf4 = valueOf();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(lineHeight, (c55312xhaValueOf4 == null || (c55320xhiKWHzl = c55312xhaValueOf4.KWHzl()) == null) ? 0 : c55320xhiKWHzl.getLineHeight());
                layoutParams.addRule(13, -1);
                wYC wyc = this.AhwBna;
                if (wyc != null) {
                    wyc.setLayoutParams(layoutParams);
                    wyc.setPaddingRelative(C55298xhM.OLrzqt(2, context), 0, 0, 0);
                    wyc.setImageResource(C52761wXj.TaskDescription.GGlJim);
                    wyc.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.v)));
                }
                C55312xha c55312xhaValueOf5 = valueOf();
                if (c55312xhaValueOf5 != null) {
                    C55318xhg c55318xhgEZpvd3 = c55312xhaValueOf5.EZpvd();
                    if (c55318xhgEZpvd3 != null) {
                        c55318xhgEZpvd3.addView(this.AhwBna);
                    }
                    c55312xhaValueOf5.setShowUnderline(false);
                }
            } else if (djBIcL() != -1 || OLrzqt() != null) {
                C55312xha c55312xhaValueOf6 = valueOf();
                if (c55312xhaValueOf6 != null) {
                    c55312xhaValueOf6.setShowUnderline(false);
                }
            } else {
                this.valueOf = this;
                C55312xha c55312xhaValueOf7 = valueOf();
                if (c55312xhaValueOf7 != null) {
                    c55312xhaValueOf7.setShowUnderline(true);
                }
            }
        }
        if (djBIcL() != -1) {
            C55312xha c55312xhaValueOf8 = valueOf();
            if (c55312xhaValueOf8 != null && (c55318xhgEZpvd2 = c55312xhaValueOf8.EZpvd()) != null) {
                c55318xhgEZpvd2.removeAllViews();
            }
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
            int iDjBIcL = djBIcL();
            C55312xha c55312xhaValueOf9 = valueOf();
            layoutInflaterFrom.inflate(iDjBIcL, (android.view.ViewGroup) (c55312xhaValueOf9 != null ? c55312xhaValueOf9.EZpvd() : null), true);
        }
        if (OLrzqt() != null && (c55312xhaValueOf = valueOf()) != null && (c55318xhgEZpvd = c55312xhaValueOf.EZpvd()) != null) {
            c55318xhgEZpvd.removeAllViews();
            c55318xhgEZpvd.addView(OLrzqt());
        }
        C55312xha c55312xhaValueOf10 = valueOf();
        if (c55312xhaValueOf10 != null) {
            removeAllViews();
            addView(c55312xhaValueOf10);
        }
        final C55312xha c55312xhaValueOf11 = valueOf();
        if (c55312xhaValueOf11 != null) {
            C55320xhi c55320xhiKWHzl3 = c55312xhaValueOf11.KWHzl();
            if (c55320xhiKWHzl3 != null) {
                c55320xhiKWHzl3.setText(AkhnZx());
            }
            C55318xhg c55318xhgEZpvd4 = c55312xhaValueOf11.EZpvd();
            if (c55318xhgEZpvd4 != null) {
                c55318xhgEZpvd4.setOnVisibilityChanged$OKUILib_uilib(new Function1() { // from class: o.xgX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C55258xgZ.KWHzl(c55312xhaValueOf11, (java.lang.Integer) obj);
                    }
                });
            }
        }
    }

    public static final Unit KWHzl(C55312xha c55312xha, java.lang.Integer num) {
        C55320xhi c55320xhiKWHzl = c55312xha.KWHzl();
        if (c55320xhiKWHzl != null) {
            C55320xhi c55320xhiKWHzl2 = c55312xha.KWHzl();
            c55320xhiKWHzl.setText(c55320xhiKWHzl2 != null ? c55320xhiKWHzl2.KWHzl() : null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        C55320xhi c55320xhiKWHzl;
        ViewGroup.LayoutParams layoutParams;
        wYC wyc = this.AhwBna;
        if (wyc != null && (layoutParams = wyc.getLayoutParams()) != null) {
            layoutParams.height = i;
            layoutParams.width = i;
            wYC wyc2 = this.AhwBna;
            if (wyc2 != null) {
                wyc2.setLayoutParams(layoutParams);
            }
        }
        C55312xha c55312xhaValueOf = valueOf();
        setTextValue((c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) ? null : c55320xhiKWHzl.KWHzl());
    }

    public void setClickAction(@NotNull View.OnClickListener onClickListener) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        android.view.View view = this.valueOf;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setOnClickListener$OKUILib_uilib(onClickListener);
    }
}
