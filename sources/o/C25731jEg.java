package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25731jEg extends kMD<jEB> {
    public final java.util.Map<kMF, jEB> AEQbTJ;
    public final java.util.Map<kMF, android.os.CountDownTimer> EZpvd;
    public final Function1<jEB, Unit> KWHzl;
    public final Function1<jEB, Unit> OLrzqt;
    public final Function1<jEB, Unit> copydefault;

    /* JADX INFO: renamed from: o.jEg$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddressTrackerUserAction.values().length];
            try {
                iArr[AddressTrackerUserAction.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AddressTrackerUserAction.NEWLY_HOLD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressTrackerUserAction.BUY_MORE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AddressTrackerUserAction.SELL_PARTIALLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[AddressTrackerUserAction.SELL_ALL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[AddressTrackerUserAction.BUY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[AddressTrackerUserAction.SELL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25731jEg() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:43) call: o.jEi.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:44) call: o.jEf.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:45) call: o.jEm.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super o.jEB, kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.jEB, kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.jEB, kotlin.Unit>):void (m)] (LINE:42) call: o.jEg.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C25731jEg(Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: o.jEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25731jEg.OLrzqt((jEB) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: o.jEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25731jEg.EZpvd((jEB) obj);
            }
        } : function12, (i & 4) != 0 ? new Function1() { // from class: o.jEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25731jEg.valueOf((jEB) obj);
            }
        } : function13);
    }

    public static final Unit OLrzqt(jEB jeb) {
        Intrinsics.checkNotNullParameter(jeb, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(jEB jeb) {
        Intrinsics.checkNotNullParameter(jeb, "");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(jEB jeb) {
        Intrinsics.checkNotNullParameter(jeb, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jEB, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jEB, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.jEB, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25731jEg(@NotNull Function1<? super jEB, Unit> function1, @NotNull Function1<? super jEB, Unit> function12, @NotNull Function1<? super jEB, Unit> function13) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.copydefault = function1;
        this.KWHzl = function12;
        this.OLrzqt = function13;
        this.EZpvd = new LinkedHashMap();
        this.AEQbTJ = new LinkedHashMap();
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hEL helAEQbTJ = hEL.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(helAEQbTJ, "");
        return helAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull kMF kmf) {
        Intrinsics.checkNotNullParameter(kmf, "");
        super.onViewRecycled(kmf);
        OLrzqt(kmf);
        this.AEQbTJ.remove(kmf);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    public void KWHzl(@NotNull kMF kmf, @NotNull jEB jeb) {
        int color;
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(jeb, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hEL hel = viewBindingAEQbTJ instanceof hEL ? (hEL) viewBindingAEQbTJ : null;
        if (hel == null) {
            return;
        }
        this.AEQbTJ.put(kmf, jeb);
        OLrzqt(kmf);
        android.widget.LinearLayout root = hel.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, jeb));
        android.widget.TextView textView = hel.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C31258lqd.copydefault(textView, jeb.values(), jeb.valueOf(), C52761wXj.Activity.QwvEab);
        ShapeableImageView shapeableImageView = hel.gEmmrt;
        Intrinsics.copydefault(shapeableImageView);
        C25386ivj.loadWalletProfileImage$default(shapeableImageView, jeb.DbNXlk(), jeb.AhwBna(), jeb.values(), 0.0f, 8, null);
        android.widget.LinearLayout linearLayout = hel.djBIcL;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this, jeb));
        AppCompatImageView appCompatImageView = hel.isConnected;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.copydefault(appCompatImageView, jeb.gEmmrt(), 16);
        hel.EZpvd.setText(AEQbTJ(jeb.AuCTelauCTel()));
        if (jeb.zLjUOn()) {
            AppCompatImageView appCompatImageView2 = hel.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
            hel.OLrzqt.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, jeb.EZpvd(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        } else {
            AppCompatImageView appCompatImageView3 = hel.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(0);
            AppCompatImageView appCompatImageView4 = hel.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            C33054mpH.AEQbTJ(appCompatImageView4, jeb.AEQbTJ());
            android.widget.TextView textView2 = hel.OLrzqt;
            java.lang.String strCopydefault = jeb.copydefault();
            textView2.setText(C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault) ? C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, strCopydefault, null, 1, null) : "");
        }
        if (jeb.fARcdN().length() == 0) {
            AppCompatImageView appCompatImageView5 = hel.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
            appCompatImageView5.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView6 = hel.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "");
            appCompatImageView6.setVisibility(0);
            AppCompatImageView appCompatImageView7 = hel.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView7, "");
            C28884kjG.EZpvd(appCompatImageView7, jeb.fARcdN(), C55298xhM.dp2px$default(2.0f, null, 1, null), jeb.ejfBZ(), jeb.AkhnZx(), C52761wXj.TaskDescription.dzCpvv, C55298xhM.dp2px$default(2.0f, null, 1, null), java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd)));
        }
        hel.valueOf.setText(jeb.KWHzl());
        android.widget.TextView textView3 = hel.EZpvd;
        android.content.Context context = hel.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView3.setTextColor(KWHzl(context, jeb.AuCTelauCTel()));
        android.widget.TextView textView4 = hel.OLrzqt;
        android.content.Context context2 = hel.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView4.setTextColor(KWHzl(context2, jeb.AuCTelauCTel()));
        hel.AEQbTJ.setText(hel.getRoot().getContext().getString(C23274hvD.Fragment.zagaMW));
        hel.copydefault.setText(C23272hvB.getFormattedLocalCurrencyInICU$default(C23272hvB.KWHzl, jeb.OLrzqt(), null, null, false, 14, null));
        int iFIwbmz = jeb.fIwbmz();
        if (iFIwbmz == -1) {
            color = hel.getRoot().getContext().getColor(C52761wXj.Activity.ONJgbh);
        } else if (iFIwbmz == 1) {
            color = hel.getRoot().getContext().getColor(C52761wXj.Activity.RWIpjU);
        } else {
            color = hel.getRoot().getContext().getColor(C23274hvD.StateListAnimator.sSMYrx);
        }
        hel.values.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33522mxz.OLrzqt(color, 0.1f)));
        hel.values.setTextColor(hel.getRoot().getContext().getColor(C52761wXj.Activity.Dmq));
        C55251xgS c55251xgS = hel.values;
        android.content.Context context3 = hel.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c55251xgS.setText(EZpvd(context3, C27599jyI.copydefault(jeb.AuCTelauCTel()), jeb.AuCTel(), color));
        C55251xgS c55251xgS2 = hel.values;
        android.content.Context context4 = hel.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        c55251xgS2.setMaxWidth(C55298xhM.OLrzqt(400, context4));
        C52794wYp c52794wYp = hel.AkhnZx;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this, jeb));
        OLrzqt(kmf, jeb);
        AEQbTJ(kmf, jeb);
    }

    /* JADX INFO: renamed from: o.jEg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C25731jEg AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jEB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25731jEg c25731jEg, jEB jeb) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c25731jEg;
            this.copydefault = jeb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.copydefault.invoke(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.jEg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C25731jEg OLrzqt;
        public final /* synthetic */ jEB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25731jEg c25731jEg, jEB jeb) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c25731jEg;
            this.copydefault = jeb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt.invoke(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.jEg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C25731jEg AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jEB OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C25731jEg c25731jEg, jEB jeb) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c25731jEg;
            this.OLrzqt = jeb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.invoke(this.OLrzqt);
            }
        }
    }

    public final java.lang.String AEQbTJ(int i) {
        switch (TaskDescription.copydefault[AddressTrackerUserAction.Companion.KWHzl(i).ordinal()]) {
            case 1:
                return "";
            case 2:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKt);
            case 3:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0);
            case 4:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherKt);
            case 5:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherOwner);
            case 6:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.ZqidTP);
            case 7:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.identifier);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final android.text.SpannableStringBuilder EZpvd(android.content.Context context, boolean z, java.lang.String str, int i) {
        java.lang.String string = context.getString(z ? C23274hvD.Fragment.DcMfJKfwDlxl : C23274hvD.Fragment.DcMfJKOmnske);
        Intrinsics.copydefault((java.lang.Object) string);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string + " " + str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), string.length(), string.length() + str.length() + 1, 33);
        return spannableStringBuilder;
    }

    public final int KWHzl(android.content.Context context, int i) {
        return C27599jyI.copydefault(i) ? context.getColor(C52761wXj.Activity.RWIpjU) : context.getColor(C52761wXj.Activity.ONJgbh);
    }

    public final void OLrzqt(kMF kmf, jEB jeb) {
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hEL hel = viewBindingAEQbTJ instanceof hEL ? (hEL) viewBindingAEQbTJ : null;
        if (hel == null) {
            return;
        }
        android.widget.TextView textView = hel.fetchVPNInfo;
        C25322iuY c25322iuY = C25322iuY.OLrzqt;
        textView.setText(c25322iuY.EZpvd(java.lang.String.valueOf(jeb.iwGUEr())));
        hel.KWHzl.setText("(" + c25322iuY.EZpvd(jeb.getFieldNames()) + ")");
    }

    public final void AEQbTJ(kMF kmf, jEB jeb) {
        OLrzqt(kmf);
        Application application = new Application(kmf, jeb);
        this.EZpvd.put(kmf, application);
        application.start();
    }

    /* JADX INFO: renamed from: o.jEg$Application */
    public static final class Application extends android.os.CountDownTimer {
        public final /* synthetic */ jEB EZpvd;
        public final /* synthetic */ kMF OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(kMF kmf, jEB jeb) {
            super(Long.MAX_VALUE, 1000L);
            this.OLrzqt = kmf;
            this.EZpvd = jeb;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            jEB jeb = (jEB) C25731jEg.this.AEQbTJ.get(this.OLrzqt);
            if (Intrinsics.EZpvd((java.lang.Object) (jeb != null ? jeb.zsXlph() : null), (java.lang.Object) this.EZpvd.zsXlph())) {
                C25731jEg.this.OLrzqt(this.OLrzqt, this.EZpvd);
            } else {
                cancel();
                C25731jEg.this.EZpvd.remove(this.OLrzqt);
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C25731jEg.this.EZpvd.remove(this.OLrzqt);
        }
    }

    private final void OLrzqt(kMF kmf) {
        android.os.CountDownTimer countDownTimer = this.EZpvd.get(kmf);
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.EZpvd.remove(kmf);
    }
}
