package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.order.strategy.view.OrderType;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53497wmc extends ConstraintLayout {
    public final C52794wYp AEQbTJ;
    public BizInstrument AYXKKw;
    public java.lang.String AhwBna;
    public final C52794wYp EZpvd;
    public final java.lang.String KWHzl;
    public InterfaceC53561wnn OLrzqt;
    public final wYK copydefault;
    public BizInstrument djBIcL;
    public java.lang.String gEmmrt;
    public final C52794wYp valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53497wmc(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53497wmc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC53561wnn interfaceC53561wnn) {
        Intrinsics.checkNotNullParameter(interfaceC53561wnn, "");
        this.OLrzqt = interfaceC53561wnn;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.wmc.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53497wmc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53497wmc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "arbitrage_enable_key";
        android.view.View.inflate(context, C48033uCm.Activity.avCqka, this);
        C52794wYp c52794wYp = (C52794wYp) findViewById(C48033uCm.Application.onPrepareSupportNavigateUpTaskStack);
        this.AEQbTJ = c52794wYp;
        C52794wYp c52794wYp2 = (C52794wYp) findViewById(C48033uCm.Application.onSupportActionModeStarted);
        this.valueOf = c52794wYp2;
        C52794wYp c52794wYp3 = (C52794wYp) findViewById(C48033uCm.Application.onPostResume);
        this.EZpvd = c52794wYp3;
        wYK wyk = (wYK) findViewById(C48033uCm.Application.getSmallIconBitmap);
        this.copydefault = wyk;
        wyk.setChecked(SPUtils.getBoolean("arbitrage_enable_key", false));
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
        c52794wYp3.setOnClickListener(new TaskDescription(c52794wYp3, 1000L, this));
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C53497wmc.AEQbTJ(this.AEQbTJ, compoundButton, z);
            }
        });
        KWHzl();
    }

    public static final void AEQbTJ(C53497wmc c53497wmc, android.widget.CompoundButton compoundButton, boolean z) {
        SPUtils.put(c53497wmc.KWHzl, java.lang.Boolean.valueOf(z));
    }

    public final void OLrzqt(@NotNull java.lang.String str, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = bizInstrument;
        this.gEmmrt = str;
        AEQbTJ(str, this.AEQbTJ, true);
        KWHzl();
    }

    public final void KWHzl(@NotNull java.lang.String str, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = bizInstrument;
        this.AhwBna = str;
        AEQbTJ(str, this.valueOf, false);
    }

    public final boolean copydefault() {
        return this.copydefault.isChecked();
    }

    public final void AEQbTJ(java.lang.String str, C52794wYp c52794wYp, boolean z) {
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.sSMYrx()) {
            c52794wYp.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.HJWChPURsaBn)));
            c52794wYp.setText(C33070mpX.AYXKKw(C55688xof.Application.access001));
            return;
        }
        c52794wYp.setOKDSType(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sell") ? 262 : 261);
        if (z) {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sell") ? C33070mpX.AYXKKw(C55688xof.Application.addOnTrimMemoryListener) : C33070mpX.AYXKKw(C55688xof.Application.adjustVolume);
        } else {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sell") ? C33070mpX.AYXKKw(C55688xof.Application.isCaptioningEnabled) : C33070mpX.AYXKKw(C55688xof.Application.addOnPictureInPictureModeChangedListener);
        }
        c52794wYp.setText(strAYXKKw);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() {
        boolean z;
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            z = interfaceC54581xNrOLrzqt.sSMYrx();
        }
        C52794wYp c52794wYp = this.EZpvd;
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.access001);
        }
        c52794wYp.setText(strAYXKKw);
    }

    public final void copydefault(OrderType orderType) {
        InterfaceC8104awT interfaceC8104awT;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.sSMYrx()) {
            InterfaceC53561wnn interfaceC53561wnn = this.OLrzqt;
            if (interfaceC53561wnn != null) {
                interfaceC53561wnn.copydefault(orderType);
                return;
            }
            return;
        }
        android.content.Context context = getContext();
        if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
            return;
        }
        InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
    }

    public final void setLeftAndRightVisible(boolean z) {
        this.AEQbTJ.setVisibility(z ? 0 : 8);
        this.valueOf.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.wmc$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53497wmc EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53497wmc c53497wmc) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c53497wmc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(OrderType.LEFT);
            }
        }
    }

    /* JADX INFO: renamed from: o.wmc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C53497wmc EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53497wmc c53497wmc) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c53497wmc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.copydefault(OrderType.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: o.wmc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53497wmc KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53497wmc c53497wmc) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c53497wmc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.copydefault(OrderType.BOTH);
            }
        }
    }
}
