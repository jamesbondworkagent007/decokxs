package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeuilib.utils.E2EUtils;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C52812wZg;
import o.C54066wxO;
import o.C54154wyx;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54154wyx extends android.widget.FrameLayout {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C52812wZg AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public final uML EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;
    public ViewTreeObserver.OnGlobalLayoutListener djBIcL;
    public ViewTreeObserver.OnPreDrawListener gEmmrt;
    public boolean valueOf;
    public android.view.ViewTreeObserver values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54154wyx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54154wyx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIsSmartArbi(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIsSmartArbiDefault(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMisNewOrderConfirmPage(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:47) call: o.wyx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C54154wyx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54154wyx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uML umlKWHzl = uML.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(umlKWHzl, "");
        this.EZpvd = umlKWHzl;
    }

    /* JADX INFO: renamed from: o.wyx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wyx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final androidx.fragment.app.Fragment AEQbTJ() {
        try {
            if (isAttachedToWindow()) {
                return ViewKt.findFragment(this);
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public final android.app.Activity KWHzl() {
        try {
            android.content.Context context = getContext();
            while (context instanceof android.content.ContextWrapper) {
                if (context instanceof android.app.Activity) {
                    return (android.app.Activity) context;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public final android.app.Activity OLrzqt() {
        FragmentActivity fragmentActivityRequireActivity;
        androidx.fragment.app.Fragment fragmentAEQbTJ = AEQbTJ();
        return (fragmentAEQbTJ == null || (fragmentActivityRequireActivity = fragmentAEQbTJ.requireActivity()) == null) ? KWHzl() : fragmentActivityRequireActivity;
    }

    public final java.lang.String EZpvd() {
        java.lang.String simpleName;
        androidx.fragment.app.Fragment fragmentAEQbTJ = AEQbTJ();
        if (fragmentAEQbTJ != null) {
            simpleName = fragmentAEQbTJ.getClass().getSimpleName();
        } else {
            android.app.Activity activityOLrzqt = OLrzqt();
            simpleName = activityOLrzqt != null ? activityOLrzqt.getClass().getSimpleName() : null;
            if (simpleName == null) {
                simpleName = "UnknownPage";
            }
        }
        return "sp_key_btc_auto_earn_coachmark_shown_" + simpleName;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(@NotNull final AutoVipProfitInfo autoVipProfitInfo, boolean z, boolean z2, boolean z3, final boolean z4, boolean z5, java.lang.String str, View.OnClickListener onClickListener) {
        java.lang.String str2;
        java.lang.String strAYXKKw;
        java.lang.String percentWithSymbol$default;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        java.lang.String percentWithSymbol$default2;
        Intrinsics.checkNotNullParameter(autoVipProfitInfo, "");
        this.AhwBna = z3;
        this.AYXKKw = z4;
        this.valueOf = z5;
        this.EZpvd.djBIcL.setIncludeFontPadding(false);
        setChevronVisible(z && !z5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "auto_education_single_staking";
        java.util.List<AutoEarnStakingConfig> autoEarn = autoVipProfitInfo.getAutoEarn();
        java.lang.String apr = "0";
        if (autoEarn != null) {
            java.lang.String apr2 = "0";
            for (AutoEarnStakingConfig autoEarnStakingConfig : autoEarn) {
                if (C33129mqd.AEQbTJ(autoEarnStakingConfig.getApr(), apr2)) {
                    apr2 = autoEarnStakingConfig.getApr();
                }
            }
            str2 = apr2;
        } else {
            str2 = "0";
        }
        java.util.List<AutoEarnStakingConfig> autoStake = autoVipProfitInfo.getAutoStake();
        if (autoStake != null) {
            for (AutoEarnStakingConfig autoEarnStakingConfig2 : autoStake) {
                if (C33129mqd.AEQbTJ(autoEarnStakingConfig2.getApr(), apr)) {
                    apr = autoEarnStakingConfig2.getApr();
                }
            }
        }
        java.lang.String str3 = apr;
        if (!C33129mqd.KWHzl((java.util.Collection) autoVipProfitInfo.getAutoStake()) || !C33129mqd.KWHzl((java.util.Collection) autoVipProfitInfo.getAutoEarn())) {
            if (C33129mqd.KWHzl((java.util.Collection) autoVipProfitInfo.getAutoStake())) {
                if (z4) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.UJEglR);
                } else if (z2) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.DsfknC);
                } else {
                    strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.UCQKYV);
                }
                java.lang.String str4 = strAYXKKw2;
                objectRef.element = "auto_education_single_staking";
                OLrzqt(z2, "auto_education_single_staking", str4, autoVipProfitInfo, z4, onClickListener);
                setVisibility(0);
                aprSpanner$default(this, xMR.formatPercentWithSymbol$default(xMR.copydefault, z4 ? str == null ? "" : str : str3, 0, 0, RoundingMode.DOWN, 6, null), z && !z4, false, 4, null);
            } else if (C33129mqd.KWHzl((java.util.Collection) autoVipProfitInfo.getAutoEarn())) {
                if (z4) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.FYtjSf);
                } else if (z2) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.adwzgZ);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.aBDePw);
                }
                java.lang.String str5 = strAYXKKw;
                objectRef.element = "auto_education_single_earn";
                OLrzqt(z2, "auto_education_single_earn", str5, autoVipProfitInfo, z4, onClickListener);
                setVisibility(0);
                if (z5) {
                    percentWithSymbol$default = "--";
                } else if (z4) {
                    percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xMR.copydefault, str == null ? "" : str, 0, 0, RoundingMode.DOWN, 6, null);
                } else {
                    percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xMR.copydefault, str2, 0, 0, RoundingMode.DOWN, 6, null);
                }
                KWHzl(percentWithSymbol$default, z && !z4, z5);
            } else {
                setVisibility(8);
            }
        } else {
            objectRef.element = "auto_earn_and_staking";
            setVisibility(0);
            if (z4) {
                strAYXKKw3 = C33070mpX.AYXKKw(C48033uCm.Fragment.NRYds);
            } else if (z2) {
                strAYXKKw3 = C33070mpX.AYXKKw(C48033uCm.Fragment.DGgkXd);
            } else {
                strAYXKKw3 = C33070mpX.AYXKKw(C48033uCm.Fragment.OqCbbx);
            }
            OLrzqt(z2, (java.lang.String) objectRef.element, strAYXKKw3, autoVipProfitInfo, z4, onClickListener);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<AutoEarnStakingConfig> autoEarn2 = autoVipProfitInfo.getAutoEarn();
            if (autoEarn2 != null) {
                for (AutoEarnStakingConfig autoEarnStakingConfig3 : autoEarn2) {
                    java.util.List<AutoEarnStakingConfig> autoStake2 = autoVipProfitInfo.getAutoStake();
                    if (autoStake2 != null) {
                        for (AutoEarnStakingConfig autoEarnStakingConfig4 : autoStake2) {
                            if (Intrinsics.EZpvd((java.lang.Object) autoEarnStakingConfig3.getCcy(), (java.lang.Object) autoEarnStakingConfig4.getCcy())) {
                                arrayList.add(C33129mqd.addS$default(autoEarnStakingConfig3.getApr(), autoEarnStakingConfig4.getApr(), null, null, null, 14, null));
                            }
                        }
                    }
                }
            }
            arrayList.add(str2);
            arrayList.add(str3);
            BigDecimal bigDecimal3 = null;
            if (!z4) {
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    try {
                        bigDecimal = new BigDecimal((java.lang.String) it.next());
                    } catch (java.lang.Exception unused) {
                        bigDecimal = BigDecimal.ZERO;
                    }
                    while (it.hasNext()) {
                        try {
                            bigDecimal2 = new BigDecimal((java.lang.String) it.next());
                        } catch (java.lang.Exception unused2) {
                            bigDecimal2 = BigDecimal.ZERO;
                        }
                        if (bigDecimal.compareTo(bigDecimal2) < 0) {
                            bigDecimal = bigDecimal2;
                        }
                    }
                    bigDecimal3 = bigDecimal;
                }
            } else if (str != null) {
                java.lang.String str6 = str.length() > 0 ? str : null;
                if (str6 != null) {
                    try {
                        bigDecimal3 = new BigDecimal(str6);
                    } catch (java.lang.Exception unused3) {
                    }
                }
            }
            if (bigDecimal3 == null || (percentWithSymbol$default2 = xMR.formatPercentWithSymbol$default(xMR.copydefault, C33129mqd.gEmmrt(bigDecimal3), 0, 0, RoundingMode.DOWN, 6, null)) == null) {
                percentWithSymbol$default2 = "0%";
            }
            aprSpanner$default(this, percentWithSymbol$default2, z && !z4, false, 4, null);
        }
        if (z && !this.valueOf) {
            Function1 function1 = new Function1() { // from class: o.wyK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54154wyx.KWHzl(this.OLrzqt, objectRef, autoVipProfitInfo, z4, (android.view.View) obj);
                }
            };
            android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
            linearLayout.setOnClickListener(new Application(linearLayout, 1000L, function1));
            ConstraintLayout constraintLayout = this.EZpvd.OLrzqt;
            constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, function1));
        }
        java.util.List<AutoEarnStakingConfig> autoEarn3 = autoVipProfitInfo.getAutoEarn();
        if (autoEarn3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : autoEarn3) {
                if (Intrinsics.EZpvd((java.lang.Object) ((AutoEarnStakingConfig) obj).getCcy(), (java.lang.Object) "BTC")) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                if ((autoVipProfitInfo.isManualPage() || autoVipProfitInfo.isFromOrderPage()) && !this.copydefault) {
                    java.lang.String strEZpvd = EZpvd();
                    if (!SPUtils.getBoolean(strEZpvd, false)) {
                        EZpvd(strEZpvd);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wyx$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.OLrzqt;
                Function1 function1 = this.copydefault;
                Intrinsics.copydefault(linearLayout);
                function1.invoke(linearLayout);
            }
        }
    }

    /* JADX INFO: renamed from: o.wyx$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C55312xha AEQbTJ;
        public final /* synthetic */ View.OnClickListener EZpvd;
        public final /* synthetic */ AutoVipProfitInfo KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ android.view.View gEmmrt;
        public final /* synthetic */ long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, boolean z, View.OnClickListener onClickListener, C55312xha c55312xha, java.lang.String str, AutoVipProfitInfo autoVipProfitInfo) {
            this.gEmmrt = view;
            this.valueOf = j;
            this.OLrzqt = z;
            this.EZpvd = onClickListener;
            this.AEQbTJ = c55312xha;
            this.copydefault = str;
            this.KWHzl = autoVipProfitInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.gEmmrt) > this.valueOf || (this.gEmmrt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.gEmmrt, jCurrentTimeMillis);
                C55312xha c55312xha = (C55312xha) this.gEmmrt;
                if (this.OLrzqt) {
                    View.OnClickListener onClickListener = this.EZpvd;
                    if (onClickListener != null) {
                        onClickListener.onClick(c55312xha);
                        return;
                    }
                    return;
                }
                androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(this.AEQbTJ);
                C54066wxO.ActionBar actionBar = C54066wxO.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = fragmentFindFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                actionBar.AEQbTJ(childFragmentManager, this.copydefault, (56 & 4) != 0 ? null : this.KWHzl, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : this.OLrzqt, (56 & 32) != 0 ? 0 : 0);
            }
        }
    }

    /* JADX INFO: renamed from: o.wyx$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function1 function1) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.AEQbTJ;
                Function1 function1 = this.copydefault;
                Intrinsics.copydefault(constraintLayout);
                function1.invoke(constraintLayout);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C54154wyx c54154wyx, Ref.ObjectRef objectRef, AutoVipProfitInfo autoVipProfitInfo, boolean z, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!c54154wyx.valueOf) {
            C54066wxO.ActionBar actionBar = C54066wxO.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = ViewKt.findFragment(c54154wyx).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            actionBar.AEQbTJ(childFragmentManager, (java.lang.String) objectRef.element, (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : z, (56 & 32) != 0 ? 0 : z ? 1 : 0);
        }
        return Unit.INSTANCE;
    }

    public final void setChevronVisible(boolean z) {
        android.widget.ImageView imageView = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void renderTitle$default(C54154wyx c54154wyx, boolean z, java.lang.String str, java.lang.String str2, AutoVipProfitInfo autoVipProfitInfo, boolean z2, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i & 32) != 0) {
            onClickListener = null;
        }
        c54154wyx.OLrzqt(z, str, str2, autoVipProfitInfo, z3, onClickListener);
    }

    public final void OLrzqt(boolean z, java.lang.String str, java.lang.String str2, AutoVipProfitInfo autoVipProfitInfo, boolean z2, View.OnClickListener onClickListener) {
        C55312xha c55312xhaValueOf = this.EZpvd.AYXKKw.valueOf();
        if (c55312xhaValueOf != null) {
            if (z2) {
                C55320xhi c55320xhiKWHzl = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl != null) {
                    c55320xhiKWHzl.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
                }
                C55320xhi c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl2 != null) {
                    c55320xhiKWHzl2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                }
            } else if (autoVipProfitInfo.isManualPage()) {
                C55320xhi c55320xhiKWHzl3 = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl3 != null) {
                    c55320xhiKWHzl3.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
                }
                C55320xhi c55320xhiKWHzl4 = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl4 != null) {
                    c55320xhiKWHzl4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
            }
            if (z) {
                C55320xhi c55320xhiKWHzl5 = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl5 != null) {
                    c55320xhiKWHzl5.setTextSize(12.0f);
                }
                c55312xhaValueOf.OLrzqt();
                c55312xhaValueOf.setOnClickListener(new StateListAnimator(c55312xhaValueOf, 1000L, z2, onClickListener, c55312xhaValueOf, str, autoVipProfitInfo));
            } else {
                c55312xhaValueOf.copydefault();
            }
            if (this.AhwBna) {
                C55320xhi c55320xhiKWHzl6 = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl6 != null) {
                    c55320xhiKWHzl6.setTextAppearance(C52761wXj.LoaderManager.AxsJAY);
                }
                C55320xhi c55320xhiKWHzl7 = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl7 != null) {
                    c55320xhiKWHzl7.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                }
            }
            C55320xhi c55320xhiKWHzl8 = c55312xhaValueOf.KWHzl();
            if (c55320xhiKWHzl8 != null) {
                c55320xhiKWHzl8.setText(str2);
            }
        }
    }

    public static /* synthetic */ void aprSpanner$default(C54154wyx c54154wyx, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        c54154wyx.KWHzl(str, z, z2);
    }

    public final void KWHzl(java.lang.String str, boolean z, boolean z2) {
        C49962uyT c49962uyT = C49962uyT.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int defaultProfitLossColor$default = C49962uyT.getDefaultProfitLossColor$default(c49962uyT, context, true, 0.0f, 4, null);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        java.lang.String strEZpvd = C56068xvo.copydefault.EZpvd(str);
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf("");
        if (z) {
            java.lang.String strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.hwXsuq, C56423yEv.EZpvd(C56390yDp.OLrzqt("apr", strEZpvd)));
            spannableStringBuilderValueOf.append(strCopydefault, new android.text.style.ForegroundColorSpan(iCopydefault), 34);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strEZpvd, 0, false, 6, (java.lang.Object) null);
            spannableStringBuilderValueOf.setSpan(new android.text.style.ForegroundColorSpan(defaultProfitLossColor$default), iIndexOf$default, strEZpvd.length() + iIndexOf$default, 34);
        } else {
            spannableStringBuilderValueOf.append(strEZpvd, z2 ? new android.text.style.ForegroundColorSpan(iCopydefault) : new android.text.style.ForegroundColorSpan(defaultProfitLossColor$default), 34);
        }
        if (this.AhwBna) {
            this.EZpvd.djBIcL.setTextAppearance(C52761wXj.LoaderManager.AxsJAY);
        }
        if (this.AYXKKw) {
            this.EZpvd.KWHzl.setColorFilter(defaultProfitLossColor$default);
        }
        this.EZpvd.djBIcL.setText(spannableStringBuilderValueOf);
    }

    public final void EZpvd(java.lang.String str) {
        if (this.OLrzqt) {
            return;
        }
        copydefault();
        OLrzqt(str);
        if (this.copydefault) {
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new ActionBar(str));
        } else {
            copydefault(str);
        }
    }

    /* JADX INFO: renamed from: o.wyx$ActionBar */
    public static final class ActionBar implements View.OnAttachStateChangeListener {
        public final /* synthetic */ java.lang.String AEQbTJ;

        public ActionBar(java.lang.String str) {
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C54154wyx.this.removeOnAttachStateChangeListener(this);
            final C54154wyx c54154wyx = C54154wyx.this;
            final java.lang.String str = this.AEQbTJ;
            c54154wyx.post(new java.lang.Runnable() { // from class: o.wyM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C54154wyx.ActionBar.AEQbTJ(c54154wyx, str);
                }
            });
        }

        public static final void AEQbTJ(C54154wyx c54154wyx, java.lang.String str) {
            c54154wyx.copydefault(str);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C54154wyx.this.removeOnAttachStateChangeListener(this);
        }
    }

    public final void OLrzqt(final java.lang.String str) {
        if (!this.copydefault && !this.OLrzqt && isAttachedToWindow() && isShown() && getVisibility() == 0 && getGlobalVisibleRect(new android.graphics.Rect())) {
            postDelayed(new java.lang.Runnable() { // from class: o.wyG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C54154wyx.djBIcL(this.OLrzqt, str);
                }
            }, 300L);
        }
    }

    public static final void djBIcL(C54154wyx c54154wyx, java.lang.String str) {
        if (!c54154wyx.copydefault && c54154wyx.isAttachedToWindow() && c54154wyx.isShown() && c54154wyx.getVisibility() == 0 && c54154wyx.getGlobalVisibleRect(new android.graphics.Rect())) {
            c54154wyx.KWHzl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final java.lang.String str) {
        post(new java.lang.Runnable() { // from class: o.wyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C54154wyx.setupVisibilityListener$lambda$21(this.copydefault, str);
            }
        });
    }

    public static final void setupVisibilityListener$lambda$21(final C54154wyx c54154wyx, final java.lang.String str) {
        c54154wyx.OLrzqt(str);
        if (c54154wyx.copydefault) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = c54154wyx.values;
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            c54154wyx.postDelayed(new java.lang.Runnable() { // from class: o.wyB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.OLrzqt.copydefault(str);
                }
            }, 100L);
            return;
        }
        c54154wyx.values = viewTreeObserver;
        final Function0 function0 = new Function0() { // from class: o.wyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54154wyx.gEmmrt(this.EZpvd, str);
            }
        };
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: o.wyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return C54154wyx.EZpvd(function0);
            }
        };
        c54154wyx.gEmmrt = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wyD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C54154wyx.AEQbTJ(function0);
            }
        };
        c54154wyx.djBIcL = onGlobalLayoutListener;
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static final Unit gEmmrt(C54154wyx c54154wyx, java.lang.String str) {
        if (c54154wyx.copydefault) {
            c54154wyx.copydefault();
            return Unit.INSTANCE;
        }
        if (c54154wyx.isAttachedToWindow() && c54154wyx.isShown() && c54154wyx.getVisibility() == 0 && c54154wyx.getGlobalVisibleRect(new android.graphics.Rect())) {
            c54154wyx.copydefault();
            c54154wyx.OLrzqt(str);
        }
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(Function0 function0) {
        function0.invoke();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function0 function0) {
        function0.invoke();
    }

    public final void KWHzl(final java.lang.String str) {
        if (!this.copydefault && isAttachedToWindow() && isShown() && getVisibility() == 0 && !this.OLrzqt) {
            try {
                android.app.Activity activityOLrzqt = OLrzqt();
                if (activityOLrzqt == null) {
                    return;
                }
                ConstraintLayout constraintLayout = this.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                if (constraintLayout.getWidth() == 0 && constraintLayout.getHeight() == 0) {
                    postDelayed(new java.lang.Runnable() { // from class: o.wyE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C54154wyx.valueOf(this.OLrzqt, str);
                        }
                    }, 200L);
                    return;
                }
                final C52812wZg c52812wZg = new C52812wZg(activityOLrzqt);
                C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
                if (c52794wYpIsConnected != null) {
                    c52794wYpIsConnected.setText(C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView));
                }
                C52794wYp c52794wYpIsConnected2 = c52812wZg.isConnected();
                if (c52794wYpIsConnected2 != null) {
                    c52794wYpIsConnected2.setOnClickListener(new View.OnClickListener() { // from class: o.wyJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C54154wyx.EZpvd(c52812wZg, view);
                        }
                    });
                }
                c52812wZg.KWHzl(new Function0() { // from class: o.wyI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C54154wyx.copydefault(str, this);
                    }
                });
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(constraintLayout);
                stateListAnimator.EZpvd(3);
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.dNxZaP));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.DuR));
                c52812wZg.AEQbTJ(stateListAnimator);
                c52812wZg.OLrzqt(1);
                C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
                if (c52794wYpAkhnZx != null) {
                    c52794wYpAkhnZx.setVisibility(8);
                }
                E2EUtils.OLrzqt.AEQbTJ(c52812wZg, E2EUtils.FeatureFlag.BotCommon);
                this.AEQbTJ = c52812wZg;
                this.copydefault = true;
            } catch (java.lang.Exception unused) {
                SPUtils.put(str, java.lang.Boolean.TRUE);
                this.copydefault = true;
            }
        }
    }

    public static final void valueOf(C54154wyx c54154wyx, java.lang.String str) {
        if (c54154wyx.copydefault || !c54154wyx.isAttachedToWindow() || c54154wyx.OLrzqt) {
            return;
        }
        c54154wyx.KWHzl(str);
    }

    public static final void EZpvd(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.KWHzl();
    }

    public static final Unit copydefault(java.lang.String str, C54154wyx c54154wyx) {
        SPUtils.put(str, java.lang.Boolean.TRUE);
        c54154wyx.copydefault = true;
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        android.view.ViewTreeObserver viewTreeObserver = this.values;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.gEmmrt;
            if (onPreDrawListener != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.djBIcL;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        this.gEmmrt = null;
        this.djBIcL = null;
        this.values = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OLrzqt = true;
        copydefault();
        C52812wZg c52812wZg = this.AEQbTJ;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        this.AEQbTJ = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.OLrzqt = false;
    }
}
