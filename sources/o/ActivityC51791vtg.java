package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.search.SearchStrategyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vtg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC51791vtg extends AbstractActivityC48163uHh<AbstractC48309uMs, SearchStrategyViewModel> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C43316rmw AEQbTJ;
    public java.lang.String KWHzl = "";
    public ActionBar OLrzqt = new ActionBar();

    /* JADX INFO: renamed from: o.vtg$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.values;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48309uMs EZpvd(ActivityC51791vtg activityC51791vtg) {
        return (AbstractC48309uMs) activityC51791vtg.sSMYrx();
    }

    /* JADX INFO: renamed from: o.vtg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vtg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51791vtg.class);
            intent.putExtra(OtcExtraKeys.MODE, str);
            intent.putExtra(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str2);
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.LinearLayout linearLayout = ((AbstractC48309uMs) sSMYrx()).copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        wPQ.copydefault(linearLayout);
        OLrzqt();
        gEmmrt();
        valueOf();
        KWHzl();
        copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((SearchStrategyViewModel) gHZMYf()).KWHzl(getIntent().getStringExtra(OtcExtraKeys.MODE));
        ((SearchStrategyViewModel) gHZMYf()).EZpvd(getIntent().getStringExtra(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((AbstractC48309uMs) sSMYrx()).OLrzqt.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((AbstractC48309uMs) sSMYrx()).OLrzqt.setAdapter(this.AEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ((AbstractC48309uMs) sSMYrx()).AEQbTJ.djBIcL(false);
        ((AbstractC48309uMs) sSMYrx()).AEQbTJ.OLrzqt(new InterfaceC57903yrG() { // from class: o.vti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51791vtg.OLrzqt(this.OLrzqt, interfaceC57934yrl);
            }
        });
        ((AbstractC48309uMs) sSMYrx()).AEQbTJ.KWHzl(new InterfaceC57900yrD() { // from class: o.vtk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51791vtg.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        ((AbstractC48309uMs) sSMYrx()).djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.vto
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51791vtg.OLrzqt(this.copydefault, view);
            }
        });
        ((AbstractC48309uMs) sSMYrx()).KWHzl.setCancelCallback(new Function0() { // from class: o.vtl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC51791vtg.KWHzl(this.AEQbTJ);
            }
        });
        ((AbstractC48309uMs) sSMYrx()).KWHzl.setClearCallback(new Function0() { // from class: o.vtn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC51791vtg.copydefault(this.EZpvd);
            }
        });
        ((AbstractC48309uMs) sSMYrx()).KWHzl.EZpvd().addTextChangedListener(this.OLrzqt);
        ((AbstractC48309uMs) sSMYrx()).AhwBna.setOnClickItemListener(new Function1() { // from class: o.vts
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        });
    }

    public static final void OLrzqt(ActivityC51791vtg activityC51791vtg, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC51791vtg.EZpvd(activityC51791vtg.KWHzl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC51791vtg activityC51791vtg, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((SearchStrategyViewModel) activityC51791vtg.gHZMYf()).AEQbTJ(activityC51791vtg.KWHzl);
    }

    public static final void OLrzqt(ActivityC51791vtg activityC51791vtg, android.view.View view) {
        activityC51791vtg.finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51791vtg activityC51791vtg) {
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AhwBna.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51791vtg activityC51791vtg) {
        ((SearchStrategyViewModel) activityC51791vtg.gHZMYf()).KWHzl();
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).OLrzqt.setVisibility(8);
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AhwBna.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51791vtg activityC51791vtg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).KWHzl.EZpvd().setText(str);
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).KWHzl.EZpvd().setSelection(str.length());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        ((SearchStrategyViewModel) gHZMYf()).OLrzqt().observe(this, new Application(new Function1() { // from class: o.vtr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.KWHzl(this.KWHzl, (HomeStrategyCardResult) obj);
            }
        }));
        ((SearchStrategyViewModel) gHZMYf()).EZpvd().observe(this, new Application(new Function1() { // from class: o.vtq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.OLrzqt(this.EZpvd, (HomeStrategyCardResult) obj);
            }
        }));
        ((SearchStrategyViewModel) gHZMYf()).AhwBna().observe(this, new Application(new Function1() { // from class: o.vtt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        ((SearchStrategyViewModel) gHZMYf()).copydefault().AhwBna().observe(this, new Application(new Function1() { // from class: o.vtu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.OLrzqt(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51791vtg activityC51791vtg, HomeStrategyCardResult homeStrategyCardResult) {
        Intrinsics.checkNotNullParameter(homeStrategyCardResult, "");
        C43316rmw c43316rmw = activityC51791vtg.AEQbTJ;
        if (c43316rmw != null) {
            C49952uyJ.KWHzl(c43316rmw, ((SearchStrategyViewModel) activityC51791vtg.gHZMYf()).AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.InspectablePropertyFlagEntry), 96);
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC51791vtg, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51791vtg activityC51791vtg, HomeStrategyCardResult homeStrategyCardResult) {
        Intrinsics.checkNotNullParameter(homeStrategyCardResult, "");
        C43316rmw c43316rmw = activityC51791vtg.AEQbTJ;
        if (c43316rmw != null) {
            SearchStrategyViewModel searchStrategyViewModel = (SearchStrategyViewModel) activityC51791vtg.gHZMYf();
            C43316rmw c43316rmw2 = activityC51791vtg.AEQbTJ;
            C49952uyJ.KWHzl(c43316rmw, searchStrategyViewModel.copydefault(new java.util.ArrayList<>(c43316rmw2 != null ? c43316rmw2.getItems() : null)), C33070mpX.AYXKKw(C55688xof.Application.InspectablePropertyFlagEntry), 96);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51791vtg activityC51791vtg, boolean z) {
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AEQbTJ.AEQbTJ();
        ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AEQbTJ.valueOf();
        if (z) {
            ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AEQbTJ.AhwBna(false);
            ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AEQbTJ.AYXKKw();
        } else {
            ((AbstractC48309uMs) activityC51791vtg.sSMYrx()).AEQbTJ.AhwBna(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC51791vtg activityC51791vtg, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C43316rmw c43316rmw = activityC51791vtg.AEQbTJ;
        if (c43316rmw != null) {
            C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT), 16, false, null, null, false, 60, null));
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC51791vtg, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.OLrzqt(this.KWHzl, (EmptyData) obj);
            }
        }));
        c43316rmw.register(HomeStrategyCardInfo.class, new C51514voU(true, new Function2() { // from class: o.vtm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC51791vtg.KWHzl(this.EZpvd, (HomeStrategyCardInfo) obj, ((java.lang.Integer) obj2).intValue());
            }
        }));
        c43316rmw.register(C51505voL.class, new C51508voO(new Function0() { // from class: o.vtp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC51791vtg.EZpvd();
            }
        }));
        this.AEQbTJ = c43316rmw;
        ((AbstractC48309uMs) sSMYrx()).OLrzqt.setItemViewCacheSize(10);
        ((AbstractC48309uMs) sSMYrx()).OLrzqt.addItemDecoration(new C31703mAu(ContextCompat.getColor(this, C32113mPz.ActionBar.getNewProxyInstance), C33052mpF.EZpvd(8.0f, (android.content.Context) this), ContextCompat.getColor(this, C32113mPz.ActionBar.getNewProxyInstance), 0));
    }

    public static final Unit OLrzqt(ActivityC51791vtg activityC51791vtg, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        activityC51791vtg.EZpvd(activityC51791vtg.KWHzl);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC51791vtg activityC51791vtg, HomeStrategyCardInfo homeStrategyCardInfo, int i) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activityC51791vtg.KWHzl)) {
            C55945xtX.OLrzqt.AEQbTJ(activityC51791vtg.KWHzl);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vtg$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strValueOf = java.lang.String.valueOf(editable);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf)) {
                ActivityC51791vtg.EZpvd(ActivityC51791vtg.this).AhwBna.AYXKKw();
                ActivityC51791vtg.this.KWHzl = strValueOf;
            }
            ActivityC51791vtg.this.EZpvd(strValueOf);
            ActivityC51791vtg.this.KWHzl(strValueOf);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            ((AbstractC48309uMs) sSMYrx()).AhwBna.setVisibility(8);
            ((SearchStrategyViewModel) gHZMYf()).OLrzqt(str);
            C55945xtX.OLrzqt.KWHzl(str);
            ((AbstractC48309uMs) sSMYrx()).OLrzqt.setVisibility(0);
            return;
        }
        ((AbstractC48309uMs) sSMYrx()).AhwBna.AYXKKw();
        ((AbstractC48309uMs) sSMYrx()).OLrzqt.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ((AbstractC48309uMs) sSMYrx()).KWHzl.EZpvd().removeTextChangedListener(this.OLrzqt);
        super.onDestroy();
        C55945xtX.OLrzqt.KWHzl("");
        C33565myp.EZpvd().OLrzqt();
    }

    public final void KWHzl(final java.lang.String str) {
        C32866mlf.onEvent$default("TradingBot_BotMarketplace_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vtj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51791vtg.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "search_input", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
