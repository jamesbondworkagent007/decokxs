package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.TradeUnitReq;
import com.okinc.unify_trade.constants.KLineConfigType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49661usk extends AbstractC49393unh {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function0<Unit> AEQbTJ;
    public java.util.ArrayList<android.widget.TextView> EZpvd = new java.util.ArrayList<>();
    public AbstractC49527uqI KWHzl;
    public KLineConfigType OLrzqt;

    /* JADX INFO: renamed from: o.usk$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KLineConfigType.values().length];
            try {
                iArr[KLineConfigType.CLOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KLineConfigType.BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "HalfKlineSettingBottomFragment";
    }

    /* JADX INFO: renamed from: o.usk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.usk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C49511upt.Activity.OcIXYQ));
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = (AbstractC49527uqI) DataBindingUtil.inflate(android.view.LayoutInflater.from(requireContext()), C49511upt.StateListAnimator.valueOf, constraintLayout, true);
        EZpvd();
        C32866mlf.onEvent$default("BasicTrading_HalfKline_Setting_View", (TrackChannel[]) null, new Function1() { // from class: o.usv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49661usk.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void EZpvd() {
        KLineConfigType kLineConfigTypeDTwDnp;
        xOW newProxyInstance;
        java.util.ArrayList<android.widget.TextView> arrayList = this.EZpvd;
        AbstractC49527uqI abstractC49527uqI = this.KWHzl;
        AbstractC49527uqI abstractC49527uqI2 = null;
        if (abstractC49527uqI == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI = null;
        }
        arrayList.add(abstractC49527uqI.OLrzqt);
        AbstractC49527uqI abstractC49527uqI3 = this.KWHzl;
        if (abstractC49527uqI3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI3 = null;
        }
        arrayList.add(abstractC49527uqI3.valueOf);
        AbstractC49527uqI abstractC49527uqI4 = this.KWHzl;
        if (abstractC49527uqI4 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI4 = null;
        }
        arrayList.add(abstractC49527uqI4.AEQbTJ);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (kLineConfigTypeDTwDnp = newProxyInstance.DTwDnp()) == null) {
            kLineConfigTypeDTwDnp = KLineConfigType.TOP;
        }
        this.OLrzqt = kLineConfigTypeDTwDnp;
        KWHzl();
        AbstractC49527uqI abstractC49527uqI5 = this.KWHzl;
        if (abstractC49527uqI5 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI5 = null;
        }
        abstractC49527uqI5.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.usq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49661usk.KWHzl(this.OLrzqt, view);
            }
        });
        AbstractC49527uqI abstractC49527uqI6 = this.KWHzl;
        if (abstractC49527uqI6 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI6 = null;
        }
        abstractC49527uqI6.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.usn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49661usk.copydefault(this.KWHzl, view);
            }
        });
        AbstractC49527uqI abstractC49527uqI7 = this.KWHzl;
        if (abstractC49527uqI7 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI7 = null;
        }
        abstractC49527uqI7.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.usp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49661usk.gEmmrt(this.copydefault, view);
            }
        });
        AbstractC49527uqI abstractC49527uqI8 = this.KWHzl;
        if (abstractC49527uqI8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49527uqI2 = abstractC49527uqI8;
        }
        C52794wYp c52794wYp = abstractC49527uqI2.KWHzl;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public static final void KWHzl(C49661usk c49661usk, android.view.View view) {
        c49661usk.OLrzqt = KLineConfigType.BOTTOM;
        c49661usk.KWHzl();
    }

    public static final void copydefault(C49661usk c49661usk, android.view.View view) {
        c49661usk.OLrzqt = KLineConfigType.TOP;
        c49661usk.KWHzl();
    }

    public static final void gEmmrt(C49661usk c49661usk, android.view.View view) {
        c49661usk.OLrzqt = KLineConfigType.CLOSE;
        c49661usk.KWHzl();
    }

    /* JADX INFO: renamed from: o.usk$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    private final void KWHzl() {
        KLineConfigType kLineConfigType = this.OLrzqt;
        int i = kLineConfigType == null ? -1 : Activity.KWHzl[kLineConfigType.ordinal()];
        AbstractC49527uqI abstractC49527uqI = null;
        if (i == 1) {
            AbstractC49527uqI abstractC49527uqI2 = this.KWHzl;
            if (abstractC49527uqI2 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI2 = null;
            }
            abstractC49527uqI2.EZpvd.setSelected(true);
            AbstractC49527uqI abstractC49527uqI3 = this.KWHzl;
            if (abstractC49527uqI3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI3 = null;
            }
            abstractC49527uqI3.copydefault.setSelected(false);
            AbstractC49527uqI abstractC49527uqI4 = this.KWHzl;
            if (abstractC49527uqI4 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI4 = null;
            }
            abstractC49527uqI4.djBIcL.setSelected(false);
            AbstractC49527uqI abstractC49527uqI5 = this.KWHzl;
            if (abstractC49527uqI5 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI5 = null;
            }
            android.widget.TextView textView = abstractC49527uqI5.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            KWHzl(textView);
            AbstractC49527uqI abstractC49527uqI6 = this.KWHzl;
            if (abstractC49527uqI6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49527uqI = abstractC49527uqI6;
            }
            abstractC49527uqI.AhwBna.setText(C33070mpX.AYXKKw(C49511upt.Activity.QOLQEE));
            return;
        }
        if (i != 2) {
            AbstractC49527uqI abstractC49527uqI7 = this.KWHzl;
            if (abstractC49527uqI7 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI7 = null;
            }
            abstractC49527uqI7.djBIcL.setSelected(true);
            AbstractC49527uqI abstractC49527uqI8 = this.KWHzl;
            if (abstractC49527uqI8 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI8 = null;
            }
            abstractC49527uqI8.copydefault.setSelected(false);
            AbstractC49527uqI abstractC49527uqI9 = this.KWHzl;
            if (abstractC49527uqI9 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI9 = null;
            }
            abstractC49527uqI9.EZpvd.setSelected(false);
            AbstractC49527uqI abstractC49527uqI10 = this.KWHzl;
            if (abstractC49527uqI10 == null) {
                Intrinsics.gEmmrt("");
                abstractC49527uqI10 = null;
            }
            android.widget.TextView textView2 = abstractC49527uqI10.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            KWHzl(textView2);
            AbstractC49527uqI abstractC49527uqI11 = this.KWHzl;
            if (abstractC49527uqI11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49527uqI = abstractC49527uqI11;
            }
            abstractC49527uqI.AhwBna.setText(C33070mpX.AYXKKw(C49511upt.Activity.ORxRYg));
            return;
        }
        AbstractC49527uqI abstractC49527uqI12 = this.KWHzl;
        if (abstractC49527uqI12 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI12 = null;
        }
        abstractC49527uqI12.copydefault.setSelected(true);
        AbstractC49527uqI abstractC49527uqI13 = this.KWHzl;
        if (abstractC49527uqI13 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI13 = null;
        }
        abstractC49527uqI13.EZpvd.setSelected(false);
        AbstractC49527uqI abstractC49527uqI14 = this.KWHzl;
        if (abstractC49527uqI14 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI14 = null;
        }
        abstractC49527uqI14.djBIcL.setSelected(false);
        AbstractC49527uqI abstractC49527uqI15 = this.KWHzl;
        if (abstractC49527uqI15 == null) {
            Intrinsics.gEmmrt("");
            abstractC49527uqI15 = null;
        }
        android.widget.TextView textView3 = abstractC49527uqI15.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        KWHzl(textView3);
        AbstractC49527uqI abstractC49527uqI16 = this.KWHzl;
        if (abstractC49527uqI16 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49527uqI = abstractC49527uqI16;
        }
        abstractC49527uqI.AhwBna.setText(C33070mpX.AYXKKw(C49511upt.Activity.DTwDnp));
    }

    public final void copydefault() {
        C54630xPm c54630xPm;
        java.lang.String value;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c54630xPm = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            c54630xPm = new C54630xPm();
        }
        Lifecycle lifecycle = getLifecycle();
        KLineConfigType kLineConfigType = this.OLrzqt;
        if (kLineConfigType == null || (value = kLineConfigType.getValue()) == null) {
            value = "";
        }
        c54630xPm.EZpvd(lifecycle, new TradeUnitReq("23", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, value, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 33553406, (DefaultConstructorMarker) null), new Function0() { // from class: o.usu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49661usk.KWHzl(this.KWHzl);
            }
        }, new Function1() { // from class: o.ust
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49661usk.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(C49661usk c49661usk) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        KLineConfigType kLineConfigType = c49661usk.OLrzqt;
        if (kLineConfigType != null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            newProxyInstance.KWHzl(kLineConfigType);
        }
        c49661usk.AEQbTJ();
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.ActionBarOnMenuVisibilityListener, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C54630xPm c54630xPm;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c54630xPm = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            c54630xPm = new C54630xPm();
        }
        KLineConfigType kLineConfigType = this.OLrzqt;
        final boolean z = kLineConfigType == KLineConfigType.BOTTOM || KLineConfigType.TOP == kLineConfigType;
        c54630xPm.EZpvd(getLifecycle(), new TradeUnitReq("10", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, z ? "1" : "0", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 33553918, (DefaultConstructorMarker) null), new Function0() { // from class: o.usm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49661usk.copydefault(z, this);
            }
        }, new Function1() { // from class: o.uso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49661usk.copydefault((java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(boolean z, C49661usk c49661usk) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            newProxyInstance.copydefault(z);
        }
        c49661usk.dismiss();
        Function0<Unit> function0 = c49661usk.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.usk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C49661usk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C49661usk c49661usk) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c49661usk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault();
                C32866mlf.onEvent$default("BasicTrading_HalfKline_Setting_Click", (TrackChannel[]) null, TaskDescription.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(android.widget.TextView textView) {
        for (android.widget.TextView textView2 : this.EZpvd) {
            if (Intrinsics.EZpvd(textView2, textView)) {
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            } else {
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            }
        }
    }
}
