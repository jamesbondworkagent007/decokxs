package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53427wlL extends android.widget.LinearLayout {
    public AbstractC50908vcy AEQbTJ;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;
    public Function0<Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53427wlL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53427wlL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final void AYXKKw(android.view.View view) {
    }

    public static final void AhwBna(android.view.View view) {
    }

    public static final void djBIcL(android.view.View view) {
    }

    public static final void gEmmrt(android.view.View view) {
    }

    public static final void valueOf(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickReduceCallback(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnIvReduceClickListener(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSameAmtClickCallback(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSameTotalClickCallback(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowClick(boolean z, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53427wlL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.adevsa, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC50908vcy) viewDataBindingInflate;
        AEQbTJ();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.wlL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53427wlL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void AEQbTJ() {
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.fzHEvu);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl));
        }
        this.AEQbTJ.EZpvd.setImageDrawable(drawable);
    }

    public final void setBalanceVisible(boolean z) {
        android.widget.LinearLayout linearLayout = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
    }

    public final void setAvailUse(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.AkhnZx.setText(str);
        this.AEQbTJ.DbNXlk.setText(str2);
    }

    public final void setAvailUseLabelType(int i) {
        this.AEQbTJ.AkhnZx.setHelperLabelType(i);
    }

    public final void setAvailUseUnderStyle(int i) {
        this.AEQbTJ.AkhnZx.setUnderlineStyle(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wlL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAvailUseClick$default(C53427wlL c53427wlL, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c53427wlL.setAvailUseClick(function0);
    }

    public final void setAvailUseClick(Function0<Unit> function0) {
        C55258xgZ c55258xgZ = this.AEQbTJ.AkhnZx;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, function0));
    }

    public final void setAvailTrade(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.valueOf.setText(str);
        this.AEQbTJ.AhwBna.setText(str2);
    }

    public final void setAvailTradeVisible(boolean z) {
        android.widget.TextView textView = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        android.widget.TextView textView2 = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setReduceVisible$default(C53427wlL c53427wlL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c53427wlL.setReduceVisible(z);
    }

    public final void setReduceVisible(boolean z) {
        this.AEQbTJ.OLrzqt.setVisibility(z ? 0 : 8);
    }

    public final void setSameAmtVisible(boolean z) {
        if (z) {
            this.AEQbTJ.fetchVPNInfo.setVisibility(0);
            this.AEQbTJ.fetchVPNInfo.setClickable(true);
        } else {
            this.AEQbTJ.fetchVPNInfo.setVisibility(4);
            this.AEQbTJ.fetchVPNInfo.setClickable(false);
        }
    }

    public final void setSameTotalVisible(boolean z) {
        if (z) {
            this.AEQbTJ.isConnected.setVisibility(0);
            this.AEQbTJ.isConnected.setClickable(true);
        } else {
            this.AEQbTJ.isConnected.setVisibility(4);
            this.AEQbTJ.isConnected.setClickable(false);
        }
    }

    public final void setSameAmtSelectedStatus(boolean z, boolean z2) {
        wYK wyk = this.AEQbTJ.fetchVPNInfo;
        wyk.setEnabled(z);
        wyk.setClickable(z);
        wyk.setCheckedIgnoreListener(z2);
        this.AEQbTJ.djBIcL.setOnClickListener(z ? null : new View.OnClickListener() { // from class: o.wlR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.setSameAmtSelectedStatus$lambda$2$lambda$1(this.AEQbTJ, view);
            }
        });
    }

    public static final void setSameAmtSelectedStatus$lambda$2$lambda$1(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setSameTotalSelectedStatus(boolean z, boolean z2) {
        wYK wyk = this.AEQbTJ.isConnected;
        wyk.setEnabled(z);
        wyk.setClickable(z);
        wyk.setCheckedIgnoreListener(z2);
        this.AEQbTJ.gEmmrt.setOnClickListener(z ? null : new View.OnClickListener() { // from class: o.wlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.setSameTotalSelectedStatus$lambda$4$lambda$3(this.KWHzl, view);
            }
        });
    }

    public static final void setSameTotalSelectedStatus$lambda$4$lambda$3(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final C47988uAv OLrzqt() {
        C47988uAv c47988uAv = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv KWHzl() {
        C47988uAv c47988uAv = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final void setOnClickTransferCallback(boolean z, Function0<Unit> function0) {
        if (z) {
            this.AEQbTJ.EZpvd.setVisibility(0);
        } else {
            this.AEQbTJ.EZpvd.setVisibility(8);
        }
        this.djBIcL = function0;
    }

    public final void setReduceSelect(boolean z) {
        this.AEQbTJ.AYXKKw.setCheckedIgnoreListener(z);
    }

    /* JADX INFO: renamed from: o.wlL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final boolean EZpvd() {
        return this.AEQbTJ.KWHzl.KWHzl();
    }

    public static final void djBIcL(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void copydefault() {
        AbstractC50908vcy abstractC50908vcy = this.AEQbTJ;
        abstractC50908vcy.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.wlU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.djBIcL(this.EZpvd, view);
            }
        });
        abstractC50908vcy.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.wlT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.AYXKKw(this.KWHzl, view);
            }
        });
        abstractC50908vcy.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wlW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.valueOf(this.EZpvd, view);
            }
        });
        abstractC50908vcy.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.wlP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.isConnected(this.OLrzqt, view);
            }
        });
        abstractC50908vcy.values.setOnClickListener(new View.OnClickListener() { // from class: o.wlO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.fetchVPNInfo(this.AEQbTJ, view);
            }
        });
    }

    public static final void AYXKKw(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void valueOf(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void isConnected(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void fetchVPNInfo(C53427wlL c53427wlL, android.view.View view) {
        Function0<Unit> function0 = c53427wlL.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void valueOf() {
        AbstractC50908vcy abstractC50908vcy = this.AEQbTJ;
        abstractC50908vcy.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.wlK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.AYXKKw(view);
            }
        });
        abstractC50908vcy.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.wlM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.AhwBna(view);
            }
        });
        abstractC50908vcy.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wlQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.djBIcL(view);
            }
        });
        abstractC50908vcy.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.wlN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.gEmmrt(view);
            }
        });
        abstractC50908vcy.values.setOnClickListener(new View.OnClickListener() { // from class: o.wlS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53427wlL.valueOf(view);
            }
        });
    }
}
