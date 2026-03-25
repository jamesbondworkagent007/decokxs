package o;

import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52781wYc extends LinearLayoutCompat {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C52783wYe AEQbTJ;
    public boolean AhwBna;
    public android.view.View EZpvd;
    public C54934xaT KWHzl;
    public boolean OLrzqt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52781wYc(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52781wYc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.USBtdM int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:34) call: o.wYc.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52781wYc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.USBtdM : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52781wYc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = 1;
        C52783wYe c52783wYe = new C52783wYe(this, null, 2, 0 == true ? 1 : 0);
        this.AEQbTJ = c52783wYe;
        setOrientation(1);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c52783wYe, attributeSet, i, 0, 4, null);
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(c52783wYe.copydefault());
        this.EZpvd = view;
    }

    /* JADX INFO: renamed from: o.wYc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final LinearLayoutCompat EZpvd() {
        C54934xaT c54934xaT = this.KWHzl;
        if (c54934xaT != null) {
            return c54934xaT.djBIcL;
        }
        return null;
    }

    public final android.widget.ImageView KWHzl() {
        C54934xaT c54934xaT = this.KWHzl;
        if (c54934xaT != null) {
            return c54934xaT.KWHzl;
        }
        return null;
    }

    public final android.widget.ImageView OLrzqt() {
        C54934xaT c54934xaT = this.KWHzl;
        if (c54934xaT != null) {
            return c54934xaT.EZpvd;
        }
        return null;
    }

    public final android.widget.TextView AEQbTJ() {
        C54934xaT c54934xaT = this.KWHzl;
        if (c54934xaT != null) {
            return c54934xaT.gEmmrt;
        }
        return null;
    }

    public final void setTitleAlignmentCenter(boolean z) {
        android.widget.LinearLayout linearLayout;
        this.AhwBna = z;
        C54934xaT c54934xaT = this.KWHzl;
        if (c54934xaT == null || (linearLayout = c54934xaT.OLrzqt) == null) {
            return;
        }
        linearLayout.setGravity(z ? 17 : 8388611);
    }

    public final void setType(int i) {
        this.valueOf = i;
        removeAllViews();
        if (this.valueOf == 0) {
            return;
        }
        int i2 = i & 2;
        if (i2 == 2) {
            android.view.LayoutInflater.from(getContext()).inflate(this.AEQbTJ.valueOf(), (android.view.ViewGroup) this, true);
        }
        if ((i & 1) == 1) {
            C54934xaT c54934xaTOLrzqt = C54934xaT.OLrzqt(android.view.LayoutInflater.from(getContext()));
            android.view.View viewEZpvd = c54934xaTOLrzqt.getRoot();
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            Unit unit = Unit.INSTANCE;
            addView(viewEZpvd, layoutParams);
            c54934xaTOLrzqt.getRoot().setMinimumHeight(this.AEQbTJ.AYXKKw());
            c54934xaTOLrzqt.getRoot().setPaddingRelative(this.AEQbTJ.gEmmrt(), this.AEQbTJ.DbNXlk(), this.AEQbTJ.gEmmrt(), this.AEQbTJ.DbNXlk());
            TextViewCompat.setTextAppearance(c54934xaTOLrzqt.gEmmrt, this.AEQbTJ.fetchVPNInfo());
            int iAkhnZx = this.AEQbTJ.AkhnZx();
            if (iAkhnZx != 0) {
                c54934xaTOLrzqt.gEmmrt.setTextColor(iAkhnZx);
            }
            float fIsConnected = this.AEQbTJ.isConnected();
            if (fIsConnected > 0.0f) {
                c54934xaTOLrzqt.gEmmrt.setTextSize(0, fIsConnected);
            }
            if ((i & 33) == 33) {
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.NRYds);
                if (drawable != null) {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    int iKWHzl = C55298xhM.KWHzl(24.0f, context);
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    drawable.setBounds(0, 0, iKWHzl, C55298xhM.KWHzl(24.0f, context2));
                }
                if (drawable != null) {
                    drawable.setTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.iRgjgR)));
                }
                android.widget.TextView textView = c54934xaTOLrzqt.gEmmrt;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context3));
                c54934xaTOLrzqt.gEmmrt.setCompoundDrawablesRelative(drawable, null, null, null);
            }
            if ((i & 65) == 65) {
                c54934xaTOLrzqt.OLrzqt.setGravity(17);
            }
            if ((i & 17) == 17) {
                c54934xaTOLrzqt.AEQbTJ.setVisibility(0);
            }
            if (i2 != 2) {
                if ((i & 9) == 9) {
                    wYC wyc = c54934xaTOLrzqt.EZpvd;
                    wyc.setVisibility(0);
                    wyc.setImageDrawable(this.AEQbTJ.EZpvd());
                    wyc.setImageTintList(this.AEQbTJ.KWHzl());
                }
                if ((i & 5) == 5) {
                    wYC wyc2 = c54934xaTOLrzqt.KWHzl;
                    wyc2.setVisibility(0);
                    wyc2.setImageDrawable(this.AEQbTJ.AEQbTJ());
                    wyc2.setImageTintList(this.AEQbTJ.OLrzqt());
                }
            }
            if (this.AhwBna) {
                c54934xaTOLrzqt.OLrzqt.setGravity(17);
            }
            this.KWHzl = c54934xaTOLrzqt;
        }
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        C54934xaT c54934xaT = this.KWHzl;
        if (c54934xaT != null) {
            c54934xaT.djBIcL.setVisibility(0);
            c54934xaT.gEmmrt.setText(charSequence);
            if (C33129mqd.OLrzqt(charSequence) && this.OLrzqt) {
                setDividerVisibility(true);
            }
        }
    }

    public static /* synthetic */ void setDividerVisibility$default(C52781wYc c52781wYc, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c52781wYc.setDividerVisibility(z);
    }

    public final void setDividerVisibility(boolean z) {
        this.OLrzqt = z;
        if (z) {
            if (this.AEQbTJ.copydefault() != 0) {
                removeView(this.EZpvd);
                android.view.View view = this.EZpvd;
                LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, this.AEQbTJ.djBIcL());
                layoutParams.setMarginStart(this.AEQbTJ.AhwBna());
                layoutParams.setMarginEnd(this.AEQbTJ.AhwBna());
                Unit unit = Unit.INSTANCE;
                addView(view, layoutParams);
                return;
            }
            return;
        }
        removeView(this.EZpvd);
    }
}
