package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.SignalBotReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.was, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52877was extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public uWM OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52877was(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52877was(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.was.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52877was(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52877was(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.waw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52877was.EZpvd(context);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52877was.OLrzqt();
            }
        });
        AYXKKw();
        valueOf();
    }

    /* JADX INFO: renamed from: o.was$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.was.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.fragment.app.FragmentManager EZpvd(android.content.Context context) {
        Intrinsics.copydefault(context, "");
        return ((AppCompatActivity) context).getSupportFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager gEmmrt() {
        return (androidx.fragment.app.FragmentManager) this.EZpvd.getValue();
    }

    public static final C55981xuG OLrzqt() {
        return new C55981xuG();
    }

    private final C55981xuG djBIcL() {
        return (C55981xuG) this.AEQbTJ.getValue();
    }

    private final void AYXKKw() {
        this.OLrzqt = (uWM) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.UJEglR, this, true);
        refreshVisibleState$default(this, null, 1, null);
    }

    public final void AEQbTJ(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        uWM uwm = this.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.valueOf.KWHzl(new View.OnClickListener() { // from class: o.waq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52877was.KWHzl(function0, view);
            }
        });
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        function0.invoke();
        C56028xvA.botClickTrack$default("orderType", null, 2, null);
    }

    public final void KWHzl(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        uWM uwm = this.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.KWHzl.KWHzl(new View.OnClickListener() { // from class: o.war
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52877was.copydefault(function0, view);
            }
        });
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        function0.invoke();
        C56028xvA.botClickTrack$default("inputCondition", null, 2, null);
    }

    public final void EZpvd(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        uWM uwm = this.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.gEmmrt.KWHzl(new View.OnClickListener() { // from class: o.wau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52877was.AhwBna(function0, view);
            }
        });
    }

    public static final void AhwBna(Function0 function0, android.view.View view) {
        function0.invoke();
        C56028xvA.botClickTrack$default("outCondition", null, 2, null);
    }

    private final void valueOf() {
        uWM uwm = this.OLrzqt;
        uWM uwm2 = null;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.wat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52877was.AEQbTJ(this.KWHzl, view);
            }
        });
        uWM uwm3 = this.OLrzqt;
        if (uwm3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwm2 = uwm3;
        }
        C55258xgZ c55258xgZ = uwm2.AEQbTJ;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
    }

    public static final void AEQbTJ(C52877was c52877was, android.view.View view) {
        uWM uwm = c52877was.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        Group group = uwm.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = !(group.getVisibility() == 0);
        c52877was.KWHzl(java.lang.Boolean.valueOf(z));
        SPUtils.put("sp_tag_visible_state_signal_bot", java.lang.Boolean.valueOf(z));
    }

    public static /* synthetic */ void refreshVisibleState$default(C52877was c52877was, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        c52877was.KWHzl(bool);
    }

    private final void KWHzl(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_signal_bot", false);
        uWM uwm = this.OLrzqt;
        uWM uwm2 = null;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        Group group = uwm.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(zBooleanValue ? 0 : 8);
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        uWM uwm3 = this.OLrzqt;
        if (uwm3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwm2 = uwm3;
        }
        uwm2.EZpvd.setImageResource(i);
    }

    public final void OLrzqt(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        djBIcL().AEQbTJ(signalBotReq);
        AEQbTJ();
        copydefault();
        KWHzl();
    }

    public final void AEQbTJ() {
        uWM uwm = this.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.valueOf.setActiveContent(C56048xvU.EZpvd.EZpvd(djBIcL().copydefault()));
    }

    public final void copydefault() {
        uWM uwm = this.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.KWHzl.setActiveContent(C56048xvU.EZpvd.OLrzqt(djBIcL().copydefault()));
    }

    public final void KWHzl() {
        uWM uwm = this.OLrzqt;
        if (uwm == null) {
            Intrinsics.gEmmrt("");
            uwm = null;
        }
        uwm.gEmmrt.setActiveContent(C56048xvU.EZpvd.copydefault(djBIcL().copydefault()));
    }

    /* JADX INFO: renamed from: o.was$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52877was OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52877was c52877was) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c52877was;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                new C50722vYy().show(this.OLrzqt.gEmmrt(), "SignalBotExplainedDialog");
            }
        }
    }
}
