package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49464uoz;
import o.C49720utq;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.utJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49687utJ extends android.widget.LinearLayout implements InterfaceC49582urK {
    public BizInstrument AEQbTJ;
    public Observer<AbstractC49464uoz.Activity> AYXKKw;
    public java.lang.String AhwBna;
    public boolean AkhnZx;
    public final InterfaceC49574urC AuCTel;
    public Observer<xMJ.StateListAnimator> DbNXlk;
    public final xUS EZpvd;
    public Function1<? super java.lang.Long, Unit> KWHzl;
    public final xUY OLrzqt;
    public final xUY copydefault;
    public Observer<xMJ.TaskDescription> djBIcL;
    public final long fetchVPNInfo;
    public final AbstractC49684utG gEmmrt;
    public java.lang.String isConnected;
    public final InterfaceC56387yDm valueOf;
    public InterfaceC49623urz values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBizInstrument(BizInstrument bizInstrument) {
        this.AEQbTJ = bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMIsLeftLegal(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r10v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r11v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (r13v0 com.okinc.unify_trade.biz.BizInstrument)
  (r14v0 boolean)
  (wrap:o.urC:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.urC) : (r15v0 o.urC))
 A[MD:(android.content.Context, android.util.AttributeSet, int, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void (m)] (LINE:61) call: o.utJ.<init>(android.content.Context, android.util.AttributeSet, int, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void type: THIS */
    public /* synthetic */ C49687utJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bizInstrument, z, (i2 & 32) != 0 ? null : interfaceC49574urC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49687utJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = bizInstrument;
        this.AkhnZx = z;
        this.AuCTel = interfaceC49574urC;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49720utq.ActionBar.djBIcL, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.gEmmrt = (AbstractC49684utG) viewDataBindingInflate;
        this.EZpvd = new xUS();
        this.copydefault = new xUY();
        this.OLrzqt = new xUY();
        this.fetchVPNInfo = 7200000L;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.utN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49687utJ.EZpvd(this.copydefault);
            }
        });
        this.AhwBna = "";
        this.isConnected = "";
        this.KWHzl = new Function1() { // from class: o.utP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49687utJ.AEQbTJ(this.EZpvd, (java.lang.Long) obj);
            }
        };
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            bizInstrumentCopydefault.getInstId();
        }
        AYXKKw();
    }

    public static final androidx.fragment.app.FragmentManager EZpvd(C49687utJ c49687utJ) {
        return ViewKt.findFragment(c49687utJ).getChildFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager valueOf() {
        return (androidx.fragment.app.FragmentManager) this.valueOf.getValue();
    }

    public static final Unit AEQbTJ(C49687utJ c49687utJ, java.lang.Long l) {
        BizInstrument bizInstrumentCopydefault;
        C55320xhi c55320xhiKWHzl;
        if (l == null) {
            c49687utJ.gEmmrt.OLrzqt.EZpvd(true);
            if (!c49687utJ.gEmmrt.copydefault.AEQbTJ()) {
                c49687utJ.gEmmrt.copydefault.KWHzl(true);
            }
            if (!c49687utJ.gEmmrt.AEQbTJ.AEQbTJ()) {
                c49687utJ.gEmmrt.AEQbTJ.KWHzl(true);
            }
        } else {
            if (c49687utJ.gEmmrt.copydefault.AEQbTJ()) {
                c49687utJ.gEmmrt.copydefault.KWHzl(!c49687utJ.AhwBna());
            }
            if (c49687utJ.gEmmrt.AEQbTJ.AEQbTJ()) {
                c49687utJ.gEmmrt.AEQbTJ.KWHzl(true);
            }
            if (c49687utJ.AhwBna()) {
                c49687utJ.gEmmrt.AEQbTJ.AEQbTJ(xUX.KWHzl(l.longValue()));
            } else {
                BizInstrument bizInstrumentCopydefault2 = c49687utJ.copydefault();
                if ((bizInstrumentCopydefault2 != null && !bizInstrumentCopydefault2.isPreMarketPair()) || ((bizInstrumentCopydefault = c49687utJ.copydefault()) != null && bizInstrumentCopydefault.mo7129getExpiryDisplay())) {
                    c49687utJ.gEmmrt.OLrzqt.OLrzqt(xUX.OLrzqt(l.longValue()));
                    c49687utJ.gEmmrt.OLrzqt.AhwBna.setHelperLabelType(1);
                    C55258xgZ c55258xgZ = c49687utJ.gEmmrt.OLrzqt.AhwBna;
                    c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, c49687utJ, l));
                    c49687utJ.gEmmrt.OLrzqt.OLrzqt(false);
                    C55320xhi c55320xhi = c49687utJ.gEmmrt.OLrzqt.AEQbTJ;
                    c55320xhi.setOnClickListener(new Activity(c55320xhi, 1000L));
                    C55312xha c55312xhaValueOf = c49687utJ.gEmmrt.OLrzqt.AhwBna.valueOf();
                    if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C49720utq.Activity.OLrzqt));
                    }
                }
            }
        }
        c49687utJ.gEmmrt.OLrzqt.EZpvd(c49687utJ.AhwBna());
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        this.DbNXlk = new Observer() { // from class: o.utO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49687utJ.OLrzqt(this.EZpvd, (xMJ.StateListAnimator) obj);
            }
        };
        this.djBIcL = new Observer() { // from class: o.utQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49687utJ.KWHzl(this.OLrzqt, (xMJ.TaskDescription) obj);
            }
        };
        this.AYXKKw = new Observer() { // from class: o.utS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49687utJ.KWHzl(this.AEQbTJ, (AbstractC49464uoz.Activity) obj);
            }
        };
    }

    public static final void OLrzqt(C49687utJ c49687utJ, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AbstractC49681utD abstractC49681utD = c49687utJ.gEmmrt.AhwBna;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtMarkPriceWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49687utJ.copydefault(), false, 4, null));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.urH.fmtIndexTickerWithSign$default(o.urH, java.lang.String, com.okinc.unify_trade.biz.BizInstrument, boolean, int, java.lang.Object):java.lang.String */
    public static final void KWHzl(C49687utJ c49687utJ, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC49681utD abstractC49681utD = c49687utJ.gEmmrt.KWHzl;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtIndexTickerWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49687utJ.copydefault(), false, 4, null));
    }

    public static final void KWHzl(C49687utJ c49687utJ, AbstractC49464uoz.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String strCopydefault = activity.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        c49687utJ.AhwBna = strCopydefault;
        java.lang.String strEZpvd = activity.EZpvd();
        c49687utJ.isConnected = strEZpvd != null ? strEZpvd : "";
        c49687utJ.gEmmrt.copydefault.AEQbTJ(C49579urH.EZpvd.copydefault(c49687utJ.AhwBna, c49687utJ.copydefault()));
    }

    @Override // o.InterfaceC49582urK
    public void AEQbTJ() {
        BizInstrument suggestedInstrument$default;
        java.lang.String expTime;
        java.lang.String instType;
        InterfaceC49623urz interfaceC49623urz;
        LiveData<AbstractC49464uoz.Activity> liveDataOLrzqt;
        InterfaceC49623urz interfaceC49623urz2;
        LiveData<xMJ.TaskDescription> liveDataAEQbTJ;
        InterfaceC49623urz interfaceC49623urz3;
        LiveData<xMJ.StateListAnimator> liveDataCopydefault;
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            bizInstrumentCopydefault.getInstId();
        }
        InterfaceC49574urC interfaceC49574urC = this.AuCTel;
        InterfaceC49623urz interfaceC49623urzKWHzl = interfaceC49574urC != null ? interfaceC49574urC.KWHzl(OLrzqt()) : null;
        this.values = interfaceC49623urzKWHzl;
        if (interfaceC49623urzKWHzl != null) {
            interfaceC49623urzKWHzl.AhwBna();
        }
        if (AhwBna()) {
            this.gEmmrt.EZpvd.setVisibility(8);
            this.gEmmrt.AhwBna.KWHzl(true);
            this.gEmmrt.KWHzl.KWHzl(true);
            this.gEmmrt.OLrzqt.EZpvd(true);
        } else {
            this.gEmmrt.EZpvd.setVisibility(8);
            this.gEmmrt.AhwBna.KWHzl(true);
            this.gEmmrt.KWHzl.KWHzl(true);
            this.gEmmrt.OLrzqt.EZpvd(false);
        }
        Observer<xMJ.StateListAnimator> observer = this.DbNXlk;
        if (observer != null && (interfaceC49623urz3 = this.values) != null && (liveDataCopydefault = interfaceC49623urz3.copydefault()) != null) {
            liveDataCopydefault.observeForever(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.djBIcL;
        if (observer2 != null && (interfaceC49623urz2 = this.values) != null && (liveDataAEQbTJ = interfaceC49623urz2.AEQbTJ()) != null) {
            liveDataAEQbTJ.observeForever(observer2);
        }
        Observer<AbstractC49464uoz.Activity> observer3 = this.AYXKKw;
        if (observer3 != null && (interfaceC49623urz = this.values) != null && (liveDataOLrzqt = interfaceC49623urz.OLrzqt()) != null) {
            liveDataOLrzqt.observeForever(observer3);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            BizInstrument bizInstrumentCopydefault2 = copydefault();
            if (bizInstrumentCopydefault2 == null || (instType = bizInstrumentCopydefault2.getInstType()) == null) {
                instType = "";
            }
            java.lang.String str = instType;
            BizInstrument bizInstrumentCopydefault3 = copydefault();
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, bizInstrumentCopydefault3 != null ? bizInstrumentCopydefault3.getInstId() : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        setBizInstrument(suggestedInstrument$default);
        BizInstrument bizInstrumentCopydefault4 = copydefault();
        FutureInstrument futureInstrument = bizInstrumentCopydefault4 instanceof FutureInstrument ? (FutureInstrument) bizInstrumentCopydefault4 : null;
        if (futureInstrument != null && (expTime = futureInstrument.getExpTime()) != null && expTime.length() > 0) {
            OLrzqt(expTime);
            if (AhwBna()) {
                this.EZpvd.KWHzl(C33129mqd.valueOf(expTime) - java.lang.System.currentTimeMillis(), this.fetchVPNInfo, 1000L, this.KWHzl);
            } else {
                this.copydefault.copydefault(C33129mqd.valueOf(expTime) - java.lang.System.currentTimeMillis(), 1000L, this.KWHzl);
            }
        }
        gEmmrt();
    }

    /* JADX INFO: renamed from: o.utJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ java.lang.Long AEQbTJ;
        public final /* synthetic */ C49687utJ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C49687utJ c49687utJ, java.lang.Long l) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c49687utJ;
            this.AEQbTJ = l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C49773uuq.Companion.OLrzqt("settlement", this.EZpvd.OLrzqt(this.AEQbTJ.longValue(), "settlement"), this.EZpvd.valueOf());
            }
        }
    }

    /* JADX INFO: renamed from: o.utJ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j) {
            this.KWHzl = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.utJ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C49687utJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, long j2, C49687utJ c49687utJ) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = j2;
            this.copydefault = c49687utJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("PreMarketTimeToDelivery_Top_Text_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                java.lang.String standardDateTime$default = this.AEQbTJ < 0 ? "--" : pTA.formatStandardDateTime$default(new Date(this.AEQbTJ), null, 1, null);
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C49720utq.Activity.AhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("settleDate", standardDateTime$default))));
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.utJ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C49687utJ EZpvd;
        public final /* synthetic */ java.lang.Long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C49687utJ c49687utJ, java.lang.Long l) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c49687utJ;
            this.KWHzl = l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C49773uuq.Companion.OLrzqt("delivery", this.EZpvd.OLrzqt(this.KWHzl.longValue(), "delivery"), this.EZpvd.valueOf());
            }
        }
    }

    public final void OLrzqt(java.lang.String str) {
        BizInstrument bizInstrumentCopydefault;
        C55320xhi c55320xhiKWHzl;
        BizInstrument bizInstrumentCopydefault2 = copydefault();
        if (bizInstrumentCopydefault2 == null || !bizInstrumentCopydefault2.isPreMarketPair() || (bizInstrumentCopydefault = copydefault()) == null || bizInstrumentCopydefault.mo7129getExpiryDisplay()) {
            return;
        }
        this.gEmmrt.OLrzqt.EZpvd(false);
        long jValueOf = C33129mqd.valueOf(str);
        this.gEmmrt.OLrzqt.OLrzqt(C33070mpX.AYXKKw(C49720utq.Activity.values));
        this.gEmmrt.OLrzqt.OLrzqt(true);
        C55320xhi c55320xhi = this.gEmmrt.OLrzqt.AEQbTJ;
        c55320xhi.setOnClickListener(new Application(c55320xhi, 1000L, jValueOf, this));
        C55312xha c55312xhaValueOf = this.gEmmrt.OLrzqt.AhwBna.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.setContentView));
    }

    /* JADX INFO: renamed from: o.utJ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    public final void gEmmrt() {
        MarginModeManager marginModeManagerIsConnected;
        BizInstrument bizInstrumentCopydefault = copydefault();
        java.lang.String currentMarginMode$default = null;
        FutureInstrument futureInstrument = bizInstrumentCopydefault instanceof FutureInstrument ? (FutureInstrument) bizInstrumentCopydefault : null;
        if (!AhwBna() && futureInstrument != null && futureInstrument.getFutureSettlement()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
                currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null);
            }
            if (Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "cross")) {
                this.gEmmrt.gEmmrt.AhwBna.setTextValue(C33070mpX.AYXKKw(C49720utq.Activity.fIwbmz));
                this.gEmmrt.gEmmrt.AhwBna.setHelperLabelType(1);
                java.lang.String nextSettleTime = futureInstrument.getNextSettleTime();
                if (C33129mqd.AEQbTJ(nextSettleTime, 0)) {
                    this.OLrzqt.copydefault(C33129mqd.valueOf(nextSettleTime) - java.lang.System.currentTimeMillis(), 1000L, new Function1() { // from class: o.utR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C49687utJ.EZpvd(this.copydefault, (java.lang.Long) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        this.gEmmrt.gEmmrt.EZpvd(true);
        this.OLrzqt.AEQbTJ();
    }

    public static final Unit EZpvd(C49687utJ c49687utJ, java.lang.Long l) {
        if (l != null) {
            AbstractC49679utB abstractC49679utB = c49687utJ.gEmmrt.gEmmrt;
            abstractC49679utB.OLrzqt(xUX.OLrzqt(l.longValue()));
            abstractC49679utB.EZpvd(false);
            C55258xgZ c55258xgZ = abstractC49679utB.AhwBna;
            c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, c49687utJ, l));
        } else {
            c49687utJ.gEmmrt.gEmmrt.EZpvd(true);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt(long j, java.lang.String str) {
        java.lang.String instType;
        java.lang.String instFamily;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        if (this.AhwBna.length() == 0 || !xUX.djBIcL(j) || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.isConnected)) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return "";
        }
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault == null || (instType = bizInstrumentCopydefault.getInstType()) == null) {
            instType = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        if (abstractC54531xLwOLrzqt == null) {
            return "";
        }
        BizInstrument bizInstrumentCopydefault2 = copydefault();
        if (bizInstrumentCopydefault2 == null || (instFamily = bizInstrumentCopydefault2.getInstFamily()) == null) {
            instFamily = "";
        }
        xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        return (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(this.AhwBna)) == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final boolean AhwBna() {
        xOU xouWlaJM;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C49955uyM.copydefault(context) instanceof InterfaceC49514upw) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "arbitrage")) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC49582urK
    public void KWHzl() {
        InterfaceC49623urz interfaceC49623urz;
        LiveData<AbstractC49464uoz.Activity> liveDataOLrzqt;
        InterfaceC49623urz interfaceC49623urz2;
        LiveData<xMJ.TaskDescription> liveDataAEQbTJ;
        InterfaceC49623urz interfaceC49623urz3;
        LiveData<xMJ.StateListAnimator> liveDataCopydefault;
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            bizInstrumentCopydefault.getInstId();
        }
        InterfaceC49623urz interfaceC49623urz4 = this.values;
        if (interfaceC49623urz4 != null) {
            interfaceC49623urz4.djBIcL();
        }
        this.EZpvd.copydefault();
        this.copydefault.AEQbTJ();
        this.OLrzqt.AEQbTJ();
        Observer<xMJ.StateListAnimator> observer = this.DbNXlk;
        if (observer != null && (interfaceC49623urz3 = this.values) != null && (liveDataCopydefault = interfaceC49623urz3.copydefault()) != null) {
            liveDataCopydefault.removeObserver(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.djBIcL;
        if (observer2 != null && (interfaceC49623urz2 = this.values) != null && (liveDataAEQbTJ = interfaceC49623urz2.AEQbTJ()) != null) {
            liveDataAEQbTJ.removeObserver(observer2);
        }
        Observer<AbstractC49464uoz.Activity> observer3 = this.AYXKKw;
        if (observer3 == null || (interfaceC49623urz = this.values) == null || (liveDataOLrzqt = interfaceC49623urz.OLrzqt()) == null) {
            return;
        }
        liveDataOLrzqt.removeObserver(observer3);
    }

    @Override // o.InterfaceC49582urK
    public void EZpvd() {
        C54782xVc c54782xVc = C54782xVc.AEQbTJ;
        c54782xVc.KWHzl().setValue(c54782xVc.KWHzl().getValue());
        c54782xVc.copydefault().setValue(c54782xVc.copydefault().getValue());
        c54782xVc.AEQbTJ().setValue(c54782xVc.AEQbTJ().getValue());
    }
}
