package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vMD extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final Function2<C47988uAv, java.lang.String, Unit> AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public AbstractC48515uUg OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public Function1<? super java.lang.String, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vMD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vMD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApyChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycleChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.vMD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vMD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vMD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vMD.OLrzqt();
            }
        });
        this.AEQbTJ = new Function2() { // from class: o.vML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vMD.copydefault(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        AkhnZx();
        DbNXlk();
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vMD.KWHzl(this.EZpvd);
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vMD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final C55856xro OLrzqt() {
        return new C55856xro();
    }

    private final C55856xro gEmmrt() {
        return (C55856xro) this.djBIcL.getValue();
    }

    public static final Unit copydefault(vMD vmd, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        AbstractC48515uUg abstractC48515uUg = vmd.OLrzqt;
        AbstractC48515uUg abstractC48515uUg2 = null;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        if (Intrinsics.EZpvd(c47988uAv, abstractC48515uUg.EZpvd)) {
            Function1<? super java.lang.String, Unit> function1 = vmd.EZpvd;
            if (function1 != null) {
                function1.invoke(vmd.gEmmrt().OLrzqt(c47988uAv.AkhnZx()));
            }
            if (vmd.copydefault()) {
                c47988uAv.copydefault();
            }
        } else {
            AbstractC48515uUg abstractC48515uUg3 = vmd.OLrzqt;
            if (abstractC48515uUg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48515uUg2 = abstractC48515uUg3;
            }
            if (Intrinsics.EZpvd(c47988uAv, abstractC48515uUg2.valueOf)) {
                Function1<? super java.lang.String, Unit> function12 = vmd.gEmmrt;
                if (function12 != null) {
                    function12.invoke(c47988uAv.AkhnZx());
                }
                if (vmd.EZpvd()) {
                    c47988uAv.copydefault();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        this.OLrzqt = (AbstractC48515uUg) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.DcMfJKOmnske, this, true);
        refreshVisibleState$default(this, null, 1, null);
        valueOf();
    }

    private final void DbNXlk() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        AbstractC48515uUg abstractC48515uUg2 = null;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        abstractC48515uUg.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vMD.OLrzqt(this.OLrzqt, view);
            }
        });
        AbstractC48515uUg abstractC48515uUg3 = this.OLrzqt;
        if (abstractC48515uUg3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg3 = null;
        }
        C55258xgZ c55258xgZ = abstractC48515uUg3.AhwBna;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        AbstractC48515uUg abstractC48515uUg4 = this.OLrzqt;
        if (abstractC48515uUg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48515uUg2 = abstractC48515uUg4;
        }
        C55258xgZ c55258xgZ2 = abstractC48515uUg2.djBIcL;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
    }

    public static final void OLrzqt(vMD vmd, android.view.View view) {
        AbstractC48515uUg abstractC48515uUg = vmd.OLrzqt;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        Group group = abstractC48515uUg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = !(group.getVisibility() == 0);
        vmd.EZpvd(java.lang.Boolean.valueOf(z));
        if (z) {
            C32866mlf.onEvent$default("DCDBot_PlaceOrder_Fullbutton_Click", (TrackChannel[]) null, new Function1() { // from class: o.vMH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vMD.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        SPUtils.put("sityghp_tag_visible_state_dcd", java.lang.Boolean.valueOf(z));
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "advanced_setting", true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshVisibleState$default(vMD vmd, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        vmd.EZpvd(bool);
    }

    private final void EZpvd(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sityghp_tag_visible_state_dcd", false);
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        AbstractC48515uUg abstractC48515uUg2 = null;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        Group group = abstractC48515uUg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(zBooleanValue ? 0 : 8);
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        AbstractC48515uUg abstractC48515uUg3 = this.OLrzqt;
        if (abstractC48515uUg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48515uUg2 = abstractC48515uUg3;
        }
        abstractC48515uUg2.OLrzqt.setImageResource(i);
    }

    public final void valueOf() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        C47988uAv c47988uAv = abstractC48515uUg.EZpvd;
        c47988uAv.setInputUnit(gEmmrt().copydefault());
        c47988uAv.setMaxDecimal(gEmmrt().AEQbTJ());
        c47988uAv.setOnTextChangeCallback(this.AEQbTJ);
        C47988uAv.setInputLabel$default(c47988uAv, "≤ " + gEmmrt().copydefault("1.50"), null, 2, null);
        AbstractC48515uUg abstractC48515uUg2 = this.OLrzqt;
        if (abstractC48515uUg2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg2 = null;
        }
        C47988uAv c47988uAv2 = abstractC48515uUg2.valueOf;
        c47988uAv2.setInputUnit(gEmmrt().OLrzqt());
        c47988uAv2.setMaxDecimal(gEmmrt().KWHzl());
        c47988uAv2.setOnTextChangeCallback(this.AEQbTJ);
        C47988uAv.setInputLabel$default(c47988uAv2, "≥ 1", null, 2, null);
    }

    private final java.util.Map<C47988uAv, java.lang.String> AhwBna() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        if (abstractC48515uUg != null) {
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            AbstractC48515uUg abstractC48515uUg2 = null;
            if (abstractC48515uUg == null) {
                Intrinsics.gEmmrt("");
                abstractC48515uUg = null;
            }
            pairArr[0] = C56390yDp.OLrzqt(abstractC48515uUg.EZpvd, "lowestApyInput");
            AbstractC48515uUg abstractC48515uUg3 = this.OLrzqt;
            if (abstractC48515uUg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48515uUg2 = abstractC48515uUg3;
            }
            pairArr[1] = C56390yDp.OLrzqt(abstractC48515uUg2.valueOf, "maxCycleInput");
            return C56424yEw.gEmmrt(pairArr);
        }
        return C56424yEw.KWHzl();
    }

    public static final C53519wmy KWHzl(vMD vmd) {
        return new C53519wmy(vmd.AhwBna());
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        AbstractC48515uUg abstractC48515uUg2 = null;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        C47988uAv.setInputContent$default(abstractC48515uUg.EZpvd, gEmmrt().copydefault(str), false, false, 6, null);
        AbstractC48515uUg abstractC48515uUg3 = this.OLrzqt;
        if (abstractC48515uUg3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48515uUg2 = abstractC48515uUg3;
        }
        C47988uAv.setInputContent$default(abstractC48515uUg2.valueOf, str2, false, false, 6, null);
    }

    public final boolean copydefault() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        C47988uAv c47988uAv = abstractC48515uUg.EZpvd;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            return true;
        }
        if (!gEmmrt().AEQbTJ(c47988uAv.AkhnZx())) {
            c47988uAv.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.gdmIOq));
            return false;
        }
        if (gEmmrt().EZpvd(c47988uAv.AkhnZx())) {
            return true;
        }
        c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.DQzvGNdrmXxu, C56423yEv.EZpvd(C56390yDp.OLrzqt("minPercent", gEmmrt().KWHzl("1.50")))));
        return false;
    }

    public final boolean EZpvd() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        C47988uAv c47988uAv = abstractC48515uUg.valueOf;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAv.AkhnZx()) || gEmmrt().AhwBna(c47988uAv.AkhnZx())) {
            return true;
        }
        c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.isReflectionWorking, C56423yEv.EZpvd(C56390yDp.OLrzqt("min", xMR.copydefault.copydefault("1", gEmmrt().KWHzl())))));
        return false;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ vMD AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vMD vmd) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = vmd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RTWSvT), C33070mpX.AYXKKw(C55688xof.Application.invokespecialaGOrKO));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vMD EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vMD vmd) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = vmd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RIuxYh), C33070mpX.AYXKKw(C55688xof.Application.invokespecialRtjmuc));
            }
        }
    }

    public static /* synthetic */ void showTitleMsgDialog$default(vMD vmd, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        vmd.EZpvd(str, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            viewOnClickListenerC54939xaY.setTitle(str);
        }
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.vMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vMD.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean djBIcL() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        AbstractC48515uUg abstractC48515uUg2 = null;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        if (!abstractC48515uUg.EZpvd.getFieldNames()) {
            AbstractC48515uUg abstractC48515uUg3 = this.OLrzqt;
            if (abstractC48515uUg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48515uUg2 = abstractC48515uUg3;
            }
            if (!abstractC48515uUg2.valueOf.getFieldNames()) {
                return false;
            }
        }
        return true;
    }

    public final C47988uAv AEQbTJ() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        C47988uAv c47988uAv = abstractC48515uUg.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv AYXKKw() {
        AbstractC48515uUg abstractC48515uUg = this.OLrzqt;
        if (abstractC48515uUg == null) {
            Intrinsics.gEmmrt("");
            abstractC48515uUg = null;
        }
        C47988uAv c47988uAv = abstractC48515uUg.valueOf;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }
}
