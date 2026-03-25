package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27443jvL extends android.widget.LinearLayout {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public boolean AhwBna;
    public android.widget.LinearLayout AkhnZx;
    public final android.widget.ImageView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public wYC KWHzl;
    public android.widget.LinearLayout OLrzqt;
    public android.widget.LinearLayout copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public android.widget.LinearLayout gEmmrt;
    public android.view.View isConnected;
    public final C55113xdn valueOf;
    public Function0<Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27443jvL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27443jvL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.jvL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27443jvL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27443jvL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C25493ixk.Activity.iCPUKe, (android.view.ViewGroup) this, true);
        this.gEmmrt = (android.widget.LinearLayout) findViewById(C25493ixk.ActionBar.HJWChPOKBmQNaCIdOM);
        this.AkhnZx = (android.widget.LinearLayout) findViewById(C25493ixk.ActionBar.DjwCMv);
        this.copydefault = (android.widget.LinearLayout) findViewById(C25493ixk.ActionBar.wlaJM);
        this.OLrzqt = (android.widget.LinearLayout) findViewById(C25493ixk.ActionBar.zsXlph);
        this.DbNXlk = (android.widget.ImageView) findViewById(C25493ixk.ActionBar.DsfknC);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(C25493ixk.ActionBar.aWJMta);
        this.AEQbTJ = (android.widget.TextView) findViewById(C25493ixk.ActionBar.AuCTelauCTel);
        this.AYXKKw = (android.widget.TextView) findViewById(C25493ixk.ActionBar.zAEkPU);
        this.valueOf = (C55113xdn) findViewById(C25493ixk.ActionBar.zDUObI);
        this.djBIcL = (android.widget.FrameLayout) findViewById(C25493ixk.ActionBar.tIwhY);
        this.EZpvd = (android.widget.ImageView) findViewById(C25493ixk.ActionBar.DCUTEIdCUTEI);
        this.KWHzl = (wYC) findViewById(C25493ixk.ActionBar.OBJEWx);
        this.isConnected = findViewById(C25493ixk.ActionBar.processStrongAuthMessage);
        setupDefaultStyle();
    }

    public final void setupDefaultStyle() {
        setBackground(OLrzqt());
        setClickable(true);
        setFocusable(true);
    }

    public final GradientDrawable OLrzqt() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(16.0f, null, 1, null));
        gradientDrawable.setColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialDPHOMC));
        return gradientDrawable;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            this.djBIcL.setVisibility(0);
            this.AYXKKw.setVisibility(4);
            this.valueOf.setVisibility(0);
            this.valueOf.KWHzl(0L);
            this.AEQbTJ.setVisibility(8);
            return;
        }
        this.AEQbTJ.setVisibility(0);
        this.AEQbTJ.setText(str);
        this.AYXKKw.setVisibility(0);
        this.AYXKKw.setText(str2);
        this.valueOf.copydefault();
        this.djBIcL.setVisibility(0);
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.djBIcL.setVisibility(0);
            this.AYXKKw.setVisibility(4);
            this.valueOf.setVisibility(0);
            this.valueOf.KWHzl(0L);
            return;
        }
        this.AYXKKw.setText(str);
        if (str.length() > 0) {
            this.djBIcL.setVisibility(0);
            this.valueOf.setVisibility(4);
            this.valueOf.copydefault();
            this.AYXKKw.setVisibility(0);
            return;
        }
        this.djBIcL.setVisibility(8);
        this.valueOf.setVisibility(4);
        this.valueOf.copydefault();
        this.AYXKKw.setVisibility(4);
    }

    public final void setLeftIcon(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            this.DbNXlk.setVisibility(0);
            C27569jxf.loadCircleWithBorder$default(C27569jxf.OLrzqt, this.DbNXlk, str, 0, 0, 0.0f, 28, null);
        }
    }

    public final void setProtocolIcon(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            this.DbNXlk.setVisibility(0);
            C27569jxf.loadCircleWithBorder$default(C27569jxf.OLrzqt, this.DbNXlk, str, 0, 0, 0.0f, 28, null);
        }
    }

    public final void setLeftTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo.setText(str);
    }

    public final void setProtocolTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo.setText(str);
    }

    public final void setRightTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setText(str);
    }

    public final void setApy(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setText(str);
    }

    public final void setGoDetailCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.values = function0;
        setDetailEntryClick();
    }

    public final void setTvl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.setVisibility(0);
        this.valueOf.setVisibility(4);
        this.AYXKKw.setVisibility(0);
        this.AYXKKw.setText(str);
    }

    /* JADX INFO: renamed from: o.jvL$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C27443jvL KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C27443jvL c27443jvL) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c27443jvL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.values;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jvL$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C27443jvL AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View.OnClickListener copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C27443jvL c27443jvL, View.OnClickListener onClickListener) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c27443jvL;
            this.copydefault = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            View.OnClickListener onClickListener;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.AEQbTJ.AhwBna && (onClickListener = this.copydefault) != null) {
                    onClickListener.onClick(this.AEQbTJ);
                }
            }
        }
    }

    public final void setOnCardClickListener(View.OnClickListener onClickListener) {
        android.widget.LinearLayout linearLayout = this.gEmmrt;
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this, onClickListener));
    }

    public final void OLrzqt(boolean z) {
        this.AhwBna = z;
        this.EZpvd.setVisibility(z ? 0 : 8);
        this.KWHzl.setVisibility(z ^ true ? 0 : 8);
        setDetailEntryClick();
    }

    public final void EZpvd(boolean z) {
        this.KWHzl.setVisibility(z ? 0 : 8);
        setDetailEntryClick();
    }

    public final void setDetailEntryClick() {
        if (this.values != null && this.KWHzl.getVisibility() == 0 && !this.AhwBna) {
            Function0<Unit> function0 = this.values;
            boolean z = this.KWHzl.getVisibility() == 0;
            pUU.KWHzl("zxf=========", function0 + " " + z + " " + this.AhwBna);
            this.isConnected.setVisibility(0);
            this.copydefault.setClickable(true);
            android.widget.LinearLayout linearLayout = this.copydefault;
            linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
            return;
        }
        this.isConnected.setVisibility(8);
        this.copydefault.setClickable(false);
    }
}
