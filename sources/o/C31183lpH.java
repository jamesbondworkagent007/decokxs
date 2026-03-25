package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.widget.TradeGuideType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31183lpH extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final hGW AEQbTJ;
    public Function0<Unit> AhwBna;
    public Function0<Unit> EZpvd;
    public TradeGuideType KWHzl;
    public Function0<Unit> copydefault;

    /* JADX INFO: renamed from: o.lpH$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeGuideType.values().length];
            try {
                iArr[TradeGuideType.MODE_SWITCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeGuideType.ADVANCED_MODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31183lpH(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:31) call: o.lpH.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C31183lpH(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31183lpH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGW hgwEZpvd = hGW.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgwEZpvd, "");
        this.AEQbTJ = hgwEZpvd;
        this.KWHzl = TradeGuideType.MODE_SWITCH;
        setBackgroundColor(C25382ivf.copydefault(C52761wXj.Activity.DjwCMv, context));
        setElevation(10.0f);
        C55113xdn c55113xdn = hgwEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(4);
        android.widget.ImageView imageView = hgwEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(4);
        C55113xdn c55113xdn2 = hgwEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        c55113xdn2.setVisibility(4);
        android.widget.LinearLayout linearLayout = hgwEZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(4);
        hgwEZpvd.EZpvd.setAnimation(AEQbTJ());
        postDelayed(new java.lang.Runnable() { // from class: o.lpF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31183lpH.copydefault(this.copydefault);
            }
        }, 20L);
        C25352ivB.setOnDoubleCheckClickListener$default(this, 0L, new Function1() { // from class: o.lpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31183lpH.copydefault((android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(hgwEZpvd.AEQbTJ, 0L, new Function1() { // from class: o.lpM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31183lpH.copydefault(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        C52794wYp c52794wYp = hgwEZpvd.OLrzqt;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        AppCompatImageView appCompatImageView = hgwEZpvd.KWHzl;
        appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.lpH$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lpH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.lpH$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C31183lpH show$default(StateListAnimator stateListAnimator, android.app.Activity activity, TradeGuideType tradeGuideType, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                tradeGuideType = TradeGuideType.MODE_SWITCH;
            }
            return stateListAnimator.OLrzqt(activity, tradeGuideType, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02, function03);
        }

        public final C31183lpH OLrzqt(@NotNull android.app.Activity activity, @NotNull TradeGuideType tradeGuideType, Function0<Unit> function0, Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(tradeGuideType, "");
            Intrinsics.checkNotNullParameter(function03, "");
            C31183lpH c31183lpH = new C31183lpH(activity, null, 2, 0 == true ? 1 : 0);
            c31183lpH.copydefault = function03;
            c31183lpH.AhwBna = function02;
            c31183lpH.EZpvd = function0;
            c31183lpH.KWHzl = tradeGuideType;
            c31183lpH.copydefault();
            return c31183lpH;
        }
    }

    public static final void copydefault(C31183lpH c31183lpH) {
        c31183lpH.OLrzqt();
    }

    public static final Unit copydefault(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void OLrzqt() {
        C55113xdn c55113xdn = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(0);
        android.widget.ImageView imageView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        C55113xdn c55113xdn2 = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        c55113xdn2.setVisibility(0);
        android.widget.LinearLayout linearLayout = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        this.AEQbTJ.EZpvd.setEnabled(true);
        C55113xdn.showLoading$default(this.AEQbTJ.EZpvd, 0L, 1, null);
        this.AEQbTJ.copydefault.setEnabled(true);
        C55113xdn c55113xdn3 = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
        c55113xdn3.setVisibility(0);
        C55113xdn.showLoading$default(this.AEQbTJ.copydefault, 0L, 1, null);
    }

    private final android.view.View EZpvd() {
        android.content.Context context = getContext();
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov != null) {
            return ((xWO) C43251rlk.copydefault(xWO.class)).EZpvd(abstractActivityC33041mov);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        android.view.Window window;
        final android.view.View viewEZpvd = EZpvd();
        if (viewEZpvd == null) {
            return;
        }
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(this);
        }
        this.AEQbTJ.AhwBna.post(new java.lang.Runnable() { // from class: o.lpK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31183lpH.EZpvd(viewEZpvd, this);
            }
        });
        int size = TradingType.Companion.OLrzqt().size();
        int i = Application.KWHzl[this.KWHzl.ordinal()];
        if (i == 1) {
            this.AEQbTJ.AYXKKw.setText(getContext().getString(C23274hvD.Fragment.fupbxE));
            AppCompatTextView appCompatTextView = this.AEQbTJ.valueOf;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            appCompatTextView.setText(C33069mpW.KWHzl(context2, C23274hvD.Fragment.dPnHjp, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(size)))));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.AEQbTJ.AYXKKw.setText(getContext().getString(C23274hvD.Fragment.getUserContextRegisteredStatus));
            this.AEQbTJ.valueOf.setText(getContext().getString(C23274hvD.Fragment.gBtXYZ));
        }
        AppCompatImageView appCompatImageView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        TradeGuideType tradeGuideType = this.KWHzl;
        TradeGuideType tradeGuideType2 = TradeGuideType.ADVANCED_MODE;
        appCompatImageView.setVisibility(tradeGuideType == tradeGuideType2 ? 0 : 8);
        C52794wYp c52794wYp = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(this.KWHzl == tradeGuideType2 ? 0 : 8);
    }

    public static final void EZpvd(android.view.View view, C31183lpH c31183lpH) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.widget.LinearLayout linearLayout = c31183lpH.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (iArr[1] - c31183lpH.AEQbTJ.AEQbTJ.getTop()) - C55298xhM.dpInt$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            linearLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    private final int AEQbTJ() {
        return C33492mxV.OLrzqt() ? C52761wXj.PendingIntent.wlaJM : C52761wXj.PendingIntent.AuCTelauCTel;
    }

    /* JADX INFO: renamed from: o.lpH$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C31183lpH AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C31183lpH c31183lpH) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c31183lpH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.setVisibility(8);
                Function0 function0 = this.AEQbTJ.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lpH$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C31183lpH KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C31183lpH c31183lpH) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c31183lpH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.setVisibility(8);
                Function0 function0 = this.KWHzl.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final Unit copydefault(C31183lpH c31183lpH, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c31183lpH.setVisibility(8);
        Function0<Unit> function0 = c31183lpH.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
