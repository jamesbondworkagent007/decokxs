package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51779vtU extends ConstraintLayout {
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;
    public final java.util.List<java.lang.String> AYXKKw;
    public Function1<? super java.lang.String, Unit> AhwBna;
    public final AbstractC50828vbX EZpvd;
    public Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51779vtU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51779vtU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCbCheckedCallback(Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChargeTypeChangedCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscribeTypeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.vtU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51779vtU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51779vtU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = new java.util.ArrayList();
        this.copydefault = "1";
        this.OLrzqt = "30";
        this.EZpvd = (AbstractC50828vbX) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OCdtug, this, true);
        gEmmrt();
        valueOf();
    }

    private final void gEmmrt() {
        android.widget.TextView textView = this.EZpvd.fetchVPNInfo;
        xMR xmr = xMR.copydefault;
        textView.setText(xMR.formatPercent$default(xmr, "0.1", 0, null, 4, null));
        this.EZpvd.AkhnZx.setText(xMR.formatPercent$default(xmr, "0.2", 0, null, 4, null));
        this.EZpvd.fetchVPNInfo.setActivated(true);
        this.EZpvd.AkhnZx.setActivated(true);
        C47988uAv c47988uAv = this.EZpvd.valueOf;
        c47988uAv.setInputUnit("%");
        c47988uAv.setInputHint(this.copydefault + "-" + this.OLrzqt);
        c47988uAv.setMaxDecimal(0);
        C47988uAv c47988uAv2 = this.EZpvd.AhwBna;
        c47988uAv2.setInputUnit("USDT");
        c47988uAv2.setMaxDecimal(2);
    }

    private final void valueOf() {
        android.widget.TextView textView = this.EZpvd.fetchVPNInfo;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        android.widget.TextView textView2 = this.EZpvd.AkhnZx;
        textView2.setOnClickListener(new Activity(textView2, 1000L, this));
        C54984xbQ c54984xbQ = this.EZpvd.KWHzl;
        c54984xbQ.setOnClickListener(new StateListAnimator(c54984xbQ, 1000L, this));
        C54984xbQ c54984xbQ2 = this.EZpvd.EZpvd;
        c54984xbQ2.setOnClickListener(new ActionBar(c54984xbQ2, 1000L, this));
        this.EZpvd.djBIcL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51779vtU.OLrzqt(this.EZpvd, compoundButton, z);
            }
        });
        this.EZpvd.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51779vtU.AEQbTJ(this.AEQbTJ, compoundButton, z);
            }
        });
        this.EZpvd.valueOf.setOnTextChangeCallback(new Function2() { // from class: o.vud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51779vtU.KWHzl(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        this.EZpvd.AhwBna.setOnTextChangeCallback(new Function2() { // from class: o.vuc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51779vtU.copydefault(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final void OLrzqt(C51779vtU c51779vtU, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            c51779vtU.AYXKKw.add("profit_sharing");
        } else {
            c51779vtU.AYXKKw.remove("profit_sharing");
            C47988uAv.setInputContent$default(c51779vtU.EZpvd.valueOf, "", false, false, 6, null);
            c51779vtU.EZpvd.valueOf.copydefault();
        }
        Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2 = c51779vtU.KWHzl;
        if (function2 != null) {
            function2.invoke("profit_sharing", java.lang.Boolean.valueOf(z));
        }
        Group group = c51779vtU.EZpvd.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ? 0 : 8);
        c51779vtU.AhwBna();
    }

    public static final void AEQbTJ(C51779vtU c51779vtU, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            c51779vtU.AYXKKw.add("subscription");
        } else {
            c51779vtU.AYXKKw.remove("subscription");
            C47988uAv.setInputContent$default(c51779vtU.EZpvd.AhwBna, "", false, false, 6, null);
            c51779vtU.EZpvd.AhwBna.copydefault();
        }
        Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2 = c51779vtU.KWHzl;
        if (function2 != null) {
            function2.invoke("subscription", java.lang.Boolean.valueOf(z));
        }
        Group group = c51779vtU.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ? 0 : 8);
        c51779vtU.AhwBna();
    }

    public static final Unit KWHzl(C51779vtU c51779vtU, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (C33129mqd.AEQbTJ(str, c51779vtU.OLrzqt)) {
            int i = C55688xof.Application.seuMaA;
            xMR xmr = xMR.copydefault;
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr, xMR.formatHundredQuot$default(xmr, c51779vtU.OLrzqt, 0, false, null, 14, null), 0, null, 4, null)))));
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.gEmmrt(str, c51779vtU.copydefault)) {
            int i2 = C55688xof.Application.dYepVG;
            xMR xmr2 = xMR.copydefault;
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr2, xMR.formatHundredQuot$default(xmr2, c51779vtU.copydefault, 0, false, null, 14, null), 0, null, 4, null)))));
        } else {
            c47988uAv.copydefault();
        }
        c51779vtU.EZpvd.fetchVPNInfo.setSelected(false);
        c51779vtU.EZpvd.AkhnZx.setSelected(false);
        c51779vtU.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51779vtU c51779vtU, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.valueOf(str, 0)) {
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.fJk, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "0"))));
        } else {
            c47988uAv.copydefault();
        }
        c51779vtU.AhwBna();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z) {
        Group group = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ^ true ? 0 : 8);
        this.AYXKKw.clear();
        if (z) {
            this.AYXKKw.add("free");
        }
        this.EZpvd.djBIcL.setChecked(false);
        this.EZpvd.OLrzqt.setChecked(false);
        AhwBna();
        Function1<? super java.lang.Boolean, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, this);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strAkhnZx = this.EZpvd.valueOf.AkhnZx();
        return strAkhnZx.length() > 0 ? xMR.formatHundredQuot$default(xMR.copydefault, strAkhnZx, 0, false, null, 14, null) : "";
    }

    public final java.lang.String djBIcL() {
        return this.EZpvd.AhwBna.AkhnZx();
    }

    /* JADX INFO: renamed from: o.vtU$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51779vtU AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51779vtU c51779vtU) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c51779vtU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.EZpvd.setSelectedStyle(true, 3);
                this.AEQbTJ.EZpvd.KWHzl.setSelectedStyle(false, 3);
                this.AEQbTJ.OLrzqt(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.vtU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C51779vtU OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51779vtU c51779vtU) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c51779vtU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C47988uAv.setInputContent$default(this.OLrzqt.EZpvd.valueOf, "20", false, false, 6, null);
                this.OLrzqt.EZpvd.AkhnZx.setSelected(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.vtU$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51779vtU KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51779vtU c51779vtU) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c51779vtU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C47988uAv.setInputContent$default(this.KWHzl.EZpvd.valueOf, "10", false, false, 6, null);
                this.KWHzl.EZpvd.fetchVPNInfo.setSelected(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.vtU$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C51779vtU EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51779vtU c51779vtU) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c51779vtU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd.KWHzl.setSelectedStyle(true, 3);
                this.EZpvd.EZpvd.EZpvd.setSelectedStyle(false, 3);
                this.EZpvd.OLrzqt(false);
            }
        }
    }

    public final C47988uAv copydefault() {
        C47988uAv c47988uAv = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv EZpvd() {
        C47988uAv c47988uAv = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final void AhwBna() {
        Function1<? super java.lang.String, Unit> function1 = this.AhwBna;
        if (function1 != null) {
            function1.invoke(CollectionsKt___CollectionsKt.joinToString$default(this.AYXKKw, ",", null, null, 0, null, null, 62, null));
        }
    }

    public final java.lang.String OLrzqt() {
        return this.EZpvd.fetchVPNInfo.isSelected() ? "ten_percent" : this.EZpvd.AkhnZx.isSelected() ? "twenty_percent" : "customisation";
    }

    public final boolean KWHzl() {
        if (this.AYXKKw.isEmpty()) {
            return false;
        }
        if (this.AYXKKw.contains("profit_sharing") && C33129mqd.valueOf(AEQbTJ(), 0)) {
            return false;
        }
        return ((this.AYXKKw.contains("subscription") && C33129mqd.valueOf(djBIcL(), 0)) || this.EZpvd.valueOf.getFieldNames() || this.EZpvd.AhwBna.getFieldNames()) ? false : true;
    }
}
