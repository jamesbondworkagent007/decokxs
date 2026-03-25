package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import com.okinc.business.dex.trade.copytrading.home.ui.StrategyCellType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC19982gWn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19975gWg extends android.widget.FrameLayout {
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.gWg$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyCellType.values().length];
            try {
                iArr[StrategyCellType.PnL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyCellType.Status.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyCellType.Txns.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyCellType.BoughtSold.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyCellType.Network.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[StrategyCellType.From.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[StrategyCellType.CreateTime.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[StrategyCellType.ExpiresAfter.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[StrategyCellType.ExpiredAt.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[StrategyCellType.EndsIn.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19975gWg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19975gWg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.gWg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19975gWg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19975gWg(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gWf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19975gWg.copydefault(context, this);
            }
        });
    }

    private final C21656hHl AEQbTJ() {
        return (C21656hHl) this.copydefault.getValue();
    }

    public static final C21656hHl copydefault(android.content.Context context, C19975gWg c19975gWg) {
        return C21656hHl.AEQbTJ(android.view.LayoutInflater.from(context), c19975gWg, true);
    }

    public final void setData(@NotNull final C19981gWm c19981gWm, InterfaceC19969gWa interfaceC19969gWa) {
        Intrinsics.checkNotNullParameter(c19981gWm, "");
        C21656hHl c21656hHlAEQbTJ = AEQbTJ();
        c21656hHlAEQbTJ.EZpvd.setText(C31256lqb.KWHzl(c19981gWm.OLrzqt(), (Function0<java.lang.String>) new Function0() { // from class: o.gWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19975gWg.OLrzqt(this.KWHzl, c19981gWm);
            }
        }));
        InterfaceC19970gWb interfaceC19970gWbAEQbTJ = c19981gWm.AEQbTJ();
        if (interfaceC19970gWbAEQbTJ != null) {
            AppCompatTextView appCompatTextView = c21656hHlAEQbTJ.EZpvd;
            appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, interfaceC19969gWa, interfaceC19970gWbAEQbTJ));
        }
        KWHzl(c19981gWm.copydefault(), interfaceC19969gWa);
    }

    public static final java.lang.String OLrzqt(C19975gWg c19975gWg, C19981gWm c19981gWm) {
        return c19975gWg.AEQbTJ(c19981gWm.EZpvd());
    }

    public final java.lang.String AEQbTJ(StrategyCellType strategyCellType) {
        switch (Application.EZpvd[strategyCellType.ordinal()]) {
            case 1:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.GGlJim);
            case 2:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.OStAOF);
            case 3:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.GiPPlLRPuVlr);
            case 4:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.jNexW) + "/" + C33070mpX.AYXKKw(C23274hvD.Fragment.gAnGwV);
            case 5:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.DztXDE);
            case 6:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.hdpuIA);
            case 7:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.FHvxmb);
            case 8:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.DuXjdv);
            case 9:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.UJEglR);
            case 10:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.setPageName);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void KWHzl(InterfaceC19982gWn interfaceC19982gWn, InterfaceC19969gWa interfaceC19969gWa) {
        if (interfaceC19982gWn instanceof InterfaceC19982gWn.ActionBar) {
            OLrzqt((InterfaceC19982gWn.ActionBar) interfaceC19982gWn, interfaceC19969gWa);
            return;
        }
        if (interfaceC19982gWn instanceof InterfaceC19982gWn.TaskDescription) {
            KWHzl((InterfaceC19982gWn.TaskDescription) interfaceC19982gWn, interfaceC19969gWa);
            return;
        }
        if (interfaceC19982gWn instanceof InterfaceC19982gWn.Activity) {
            KWHzl((InterfaceC19982gWn.Activity) interfaceC19982gWn);
        } else if (interfaceC19982gWn instanceof InterfaceC19982gWn.Application) {
            KWHzl((InterfaceC19982gWn.Application) interfaceC19982gWn);
        } else {
            if (!(interfaceC19982gWn instanceof InterfaceC19982gWn.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ((InterfaceC19982gWn.StateListAnimator) interfaceC19982gWn);
        }
    }

    public final void KWHzl(final InterfaceC19982gWn.TaskDescription taskDescription, InterfaceC19969gWa interfaceC19969gWa) {
        C21656hHl c21656hHlAEQbTJ = AEQbTJ();
        c21656hHlAEQbTJ.KWHzl.setText(C31256lqb.KWHzl(taskDescription.OLrzqt(), (Function0<java.lang.String>) new Function0() { // from class: o.gWj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19975gWg.OLrzqt(taskDescription);
            }
        }));
        wYC wyc = c21656hHlAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(taskDescription.copydefault() != null ? 0 : 8);
        android.widget.ImageView imageView = c21656hHlAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.EZpvd()) ? 0 : 8);
        wYC wyc2 = c21656hHlAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc2, "");
        C33054mpH.AEQbTJ(wyc2, java.lang.Integer.valueOf(C52761wXj.TaskDescription.tIwhY));
        InterfaceC19970gWb interfaceC19970gWbCopydefault = taskDescription.copydefault();
        if (interfaceC19970gWbCopydefault != null) {
            wYC wyc3 = c21656hHlAEQbTJ.AEQbTJ;
            wyc3.setOnClickListener(new ActionBar(wyc3, 1000L, interfaceC19969gWa, interfaceC19970gWbCopydefault));
        }
        android.widget.ImageView imageView2 = c21656hHlAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadWalletProfileImage$default(imageView2, null, taskDescription.EZpvd(), taskDescription.AEQbTJ(), 0.0f, 8, null);
    }

    public static final java.lang.String OLrzqt(InterfaceC19982gWn.TaskDescription taskDescription) {
        return C25352ivB.formatAddress$default(taskDescription.AEQbTJ(), 6, 4, null, 4, null);
    }

    public final void OLrzqt(InterfaceC19982gWn.ActionBar actionBar, InterfaceC19969gWa interfaceC19969gWa) {
        C21656hHl c21656hHlAEQbTJ = AEQbTJ();
        c21656hHlAEQbTJ.KWHzl.setText(actionBar.EZpvd());
        wYC wyc = c21656hHlAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility((actionBar.copydefault() == null || actionBar.AEQbTJ() == null) ? 8 : 0);
        java.lang.Integer numCopydefault = actionBar.copydefault();
        if (numCopydefault != null) {
            int iIntValue = numCopydefault.intValue();
            wYC wyc2 = c21656hHlAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyc2, "");
            C33054mpH.AEQbTJ(wyc2, java.lang.Integer.valueOf(iIntValue));
        }
        android.widget.ImageView imageView = c21656hHlAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(actionBar.KWHzl() != null ? 0 : 8);
        java.lang.String strKWHzl = actionBar.KWHzl();
        if (strKWHzl != null) {
            android.widget.ImageView imageView2 = c21656hHlAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.AEQbTJ(imageView2, strKWHzl);
        }
        InterfaceC19970gWb interfaceC19970gWbAEQbTJ = actionBar.AEQbTJ();
        if (interfaceC19970gWbAEQbTJ != null) {
            wYC wyc3 = c21656hHlAEQbTJ.AEQbTJ;
            wyc3.setOnClickListener(new TaskDescription(wyc3, 1000L, interfaceC19969gWa, interfaceC19970gWbAEQbTJ));
        }
    }

    public final void KWHzl(InterfaceC19982gWn.Activity activity) {
        C21656hHl c21656hHlAEQbTJ = AEQbTJ();
        wYC wyc = c21656hHlAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(8);
        android.widget.ImageView imageView = c21656hHlAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        AppCompatTextView appCompatTextView = c21656hHlAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility((activity.OLrzqt().length() > 0 || activity.copydefault().length() > 0) ? 0 : 8);
        AppCompatTextView appCompatTextView2 = c21656hHlAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        java.lang.String strOLrzqt = activity.OLrzqt();
        java.lang.String strCopydefault = activity.copydefault();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = c21656hHlAEQbTJ.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        android.content.Context context2 = c21656hHlAEQbTJ.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setColoredText(appCompatTextView2, strOLrzqt, strCopydefault, iTradeRiseDefault$default, C33512mxp.tradeFallDefault$default(c33512mxp, context2, 0.0f, 2, null));
    }

    public final void KWHzl(InterfaceC19982gWn.Application application) {
        C21656hHl c21656hHlAEQbTJ = AEQbTJ();
        wYC wyc = c21656hHlAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(8);
        android.widget.ImageView imageView = c21656hHlAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        AppCompatTextView appCompatTextView = c21656hHlAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility((application.OLrzqt().length() > 0 || application.AEQbTJ().length() > 0) ? 0 : 8);
        AppCompatTextView appCompatTextView2 = c21656hHlAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        setColoredText(appCompatTextView2, C23272hvB.formatScientificCurrency$default(c23272hvB, application.OLrzqt(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), C23272hvB.formatScientificCurrency$default(c23272hvB, application.AEQbTJ(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
    }

    public final void AEQbTJ(InterfaceC19982gWn.StateListAnimator stateListAnimator) {
        int iTradeFallDefault$default;
        C21656hHl c21656hHlAEQbTJ = AEQbTJ();
        wYC wyc = c21656hHlAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(8);
        android.widget.ImageView imageView = c21656hHlAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        AppCompatTextView appCompatTextView = c21656hHlAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(stateListAnimator.OLrzqt().length() > 0 ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.Object) stateListAnimator.OLrzqt(), (java.lang.Object) 0)) {
            c21656hHlAEQbTJ.KWHzl.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, stateListAnimator.OLrzqt(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null));
            c21656hHlAEQbTJ.KWHzl.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.gtdfxv));
            return;
        }
        AppCompatTextView appCompatTextView2 = c21656hHlAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        java.lang.String strKWHzl = C23272hvB.KWHzl.KWHzl(stateListAnimator.OLrzqt());
        if (stateListAnimator.AEQbTJ()) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c21656hHlAEQbTJ.KWHzl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = c21656hHlAEQbTJ.KWHzl.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        setColoredText(appCompatTextView2, strKWHzl, "", iTradeFallDefault$default, -1);
    }

    /* JADX INFO: renamed from: o.gWg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ InterfaceC19970gWb AEQbTJ;
        public final /* synthetic */ InterfaceC19969gWa EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, InterfaceC19969gWa interfaceC19969gWa, InterfaceC19970gWb interfaceC19970gWb) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = interfaceC19969gWa;
            this.AEQbTJ = interfaceC19970gWb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC19969gWa interfaceC19969gWa = this.EZpvd;
                if (interfaceC19969gWa != null) {
                    interfaceC19969gWa.EZpvd(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gWg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ InterfaceC19970gWb AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ InterfaceC19969gWa OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, InterfaceC19969gWa interfaceC19969gWa, InterfaceC19970gWb interfaceC19970gWb) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = interfaceC19969gWa;
            this.AEQbTJ = interfaceC19970gWb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InterfaceC19969gWa interfaceC19969gWa = this.OLrzqt;
                if (interfaceC19969gWa != null) {
                    interfaceC19969gWa.EZpvd(this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gWg$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ InterfaceC19970gWb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ InterfaceC19969gWa copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, InterfaceC19969gWa interfaceC19969gWa, InterfaceC19970gWb interfaceC19970gWb) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = interfaceC19969gWa;
            this.KWHzl = interfaceC19970gWb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC19969gWa interfaceC19969gWa = this.copydefault;
                if (interfaceC19969gWa != null) {
                    interfaceC19969gWa.EZpvd(this.KWHzl);
                }
            }
        }
    }

    public final void setColoredText(android.widget.TextView textView, java.lang.String str, java.lang.String str2, int i, int i2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        if (str2.length() == 0) {
            textView.setText(spannableStringBuilder);
            return;
        }
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) " / ");
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.UlJrfe)), length2, spannableStringBuilder.length(), 0);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str2);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i2), length3, spannableStringBuilder.length(), 0);
        textView.setText(spannableStringBuilder);
    }
}
