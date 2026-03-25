package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.IntentCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.trade.features.home.ui.autosell.TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTpslEditEvents;
import com.okinc.business.trade.features.home.ui.viewmodel.TradeAutoSellStrategyViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC30505lcS;
import o.C23274hvD;
import o.C30488lcB;
import o.C52761wXj;
import o.InterfaceC30608leP;

/* JADX INFO: renamed from: o.lcK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC30497lcK extends AbstractActivityC30492lcF {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public wYF AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public C23419hxq valueOf;

    /* JADX INFO: renamed from: o.lcK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lcK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public ActivityC30497lcK() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(TradeAutoSellStrategyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.autosell.TradeAutoSellStrategyActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.autosell.TradeAutoSellStrategyActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.autosell.TradeAutoSellStrategyActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradeAutoSellStrategyViewModel values() {
        return (TradeAutoSellStrategyViewModel) this.djBIcL.getValue();
    }

    private final java.lang.String DbNXlk() {
        java.lang.String stringExtra;
        android.content.Intent intent = getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("business_type")) == null) ? "advanced" : stringExtra;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.lcK */
    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC30608leP valueOf() {
        if (this instanceof InterfaceC30608leP) {
            return (InterfaceC30608leP) this;
        }
        return null;
    }

    @Override // o.AbstractActivityC30492lcF, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23419hxq c23419hxqCopydefault = C23419hxq.copydefault(getLayoutInflater());
        this.valueOf = c23419hxqCopydefault;
        if (c23419hxqCopydefault == null) {
            Intrinsics.gEmmrt("");
            c23419hxqCopydefault = null;
        }
        setContentView(c23419hxqCopydefault.getRoot());
        isConnected();
        AkhnZx();
        AYXKKw();
        AhwBna();
        gEmmrt();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradeAutoSellStrategyActivity$checkAndShowFirstUseDialog$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.lcK$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            InterfaceC30608leP interfaceC30608lePValueOf = ActivityC30497lcK.this.valueOf();
            if (interfaceC30608lePValueOf != null) {
                InterfaceC30608leP.ActionBar.trackEvent$default(interfaceC30608lePValueOf, AdvancedTpslEditEvents.TpslEditClose, null, 2, null);
            }
            ActivityC30497lcK.this.finish();
        }
    }

    public final void AhwBna() {
        getOnBackPressedDispatcher().addCallback(this, new StateListAnimator());
    }

    private final void isConnected() {
        C23419hxq c23419hxq = this.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        android.widget.ImageView doImage = c23419hxq.copydefault.getDoImage();
        Intrinsics.copydefault(doImage);
        ViewGroup.LayoutParams layoutParams = doImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context = doImage.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(24, context));
            doImage.setLayoutParams(marginLayoutParams);
            doImage.setOnClickListener(new Fragment(doImage, 1000L, this));
            C23419hxq c23419hxq3 = this.valueOf;
            if (c23419hxq3 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq3 = null;
            }
            c23419hxq3.gEmmrt.setOnRemoveClickListener(new Function0() { // from class: o.lcJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC30497lcK.AYXKKw(this.copydefault);
                }
            });
            C23419hxq c23419hxq4 = this.valueOf;
            if (c23419hxq4 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq4 = null;
            }
            c23419hxq4.gEmmrt.setOnEnableConfirmButtonListener(new Function1() { // from class: o.lcI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC30497lcK.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            C23419hxq c23419hxq5 = this.valueOf;
            if (c23419hxq5 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq5 = null;
            }
            android.widget.TextView textView = c23419hxq5.KWHzl;
            textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
            C23419hxq c23419hxq6 = this.valueOf;
            if (c23419hxq6 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq6 = null;
            }
            android.widget.TextView textView2 = c23419hxq6.OLrzqt;
            textView2.setOnClickListener(new Application(textView2, 1000L, this));
            C23419hxq c23419hxq7 = this.valueOf;
            if (c23419hxq7 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq7 = null;
            }
            c23419hxq7.gEmmrt.setOnEnableAddStrategyButtonListener(new Function1() { // from class: o.lcH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC30497lcK.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            C23419hxq c23419hxq8 = this.valueOf;
            if (c23419hxq8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23419hxq2 = c23419hxq8;
            }
            c23419hxq2.AYXKKw.setOnAddStrategyClickListener(new Function1() { // from class: o.lcG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC30497lcK.OLrzqt(this.EZpvd, (AdvancedAutoSellStrategy) obj);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final Unit AYXKKw(ActivityC30497lcK activityC30497lcK) {
        InterfaceC30608leP interfaceC30608lePValueOf = activityC30497lcK.valueOf();
        if (interfaceC30608lePValueOf != null) {
            InterfaceC30608leP.ActionBar.trackEvent$default(interfaceC30608lePValueOf, AdvancedTpslEditEvents.StrategyDelete, null, 2, null);
        }
        activityC30497lcK.EZpvd("strategy_delete");
        activityC30497lcK.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC30497lcK activityC30497lcK, boolean z) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        wYF wyf = activityC30497lcK.AhwBna;
        if (wyf != null && (c52794wYpCopydefault2 = wyf.copydefault()) != null) {
            c52794wYpCopydefault2.setEnabled(z);
        }
        wYF wyf2 = activityC30497lcK.AhwBna;
        if (wyf2 != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
            c52794wYpCopydefault.setContentDescription("web3_dex_advance_autosell_confirm");
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC30497lcK activityC30497lcK, boolean z) {
        int iCopydefault;
        int i;
        C23419hxq c23419hxq = activityC30497lcK.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        c23419hxq.KWHzl.setEnabled(z);
        C23419hxq c23419hxq3 = activityC30497lcK.valueOf;
        if (c23419hxq3 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq3 = null;
        }
        c23419hxq3.OLrzqt.setEnabled(z);
        C23419hxq c23419hxq4 = activityC30497lcK.valueOf;
        if (c23419hxq4 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq4 = null;
        }
        c23419hxq4.AYXKKw.KWHzl(z);
        if (z) {
            iCopydefault = C33517mxu.KWHzl.OLrzqt(activityC30497lcK, C52761wXj.ActionBar.aKErDB);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(iCopydefault);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        C23419hxq c23419hxq5 = activityC30497lcK.valueOf;
        if (c23419hxq5 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq5 = null;
        }
        TextViewCompat.setCompoundDrawableTintList(c23419hxq5.KWHzl, colorStateListValueOf);
        C23419hxq c23419hxq6 = activityC30497lcK.valueOf;
        if (c23419hxq6 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq6 = null;
        }
        TextViewCompat.setCompoundDrawableTintList(c23419hxq6.OLrzqt, colorStateListValueOf);
        C23419hxq c23419hxq7 = activityC30497lcK.valueOf;
        if (c23419hxq7 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq7 = null;
        }
        android.widget.TextView textView = c23419hxq7.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C23419hxq c23419hxq8 = activityC30497lcK.valueOf;
        if (c23419hxq8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23419hxq2 = c23419hxq8;
        }
        java.util.List<AdvancedAutoSellStrategy> listAEQbTJ = c23419hxq2.gEmmrt.AEQbTJ();
        if ((listAEQbTJ instanceof java.util.Collection) && listAEQbTJ.isEmpty()) {
            i = 8;
        } else {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((AdvancedAutoSellStrategy) it.next()) instanceof AdvancedAutoSellStrategy.StopLoss) {
                    i = 0;
                    break;
                }
            }
            i = 8;
        }
        textView.setVisibility(i);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC30497lcK activityC30497lcK, AdvancedAutoSellStrategy advancedAutoSellStrategy) {
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        C23419hxq c23419hxq = activityC30497lcK.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        java.util.List<AdvancedAutoSellStrategy> listEZpvd = c23419hxq.gEmmrt.EZpvd();
        if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                if (((AdvancedAutoSellStrategy) it.next()).djBIcL() == advancedAutoSellStrategy.djBIcL()) {
                    C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.setInternalConnectionCallback), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return Unit.INSTANCE;
                }
            }
        }
        activityC30497lcK.EZpvd("strategy_add");
        C23419hxq c23419hxq3 = activityC30497lcK.valueOf;
        if (c23419hxq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23419hxq2 = c23419hxq3;
        }
        c23419hxq2.gEmmrt.EZpvd(advancedAutoSellStrategy);
        activityC30497lcK.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        C52794wYp c52794wYpCopydefault;
        wYF wyf = (wYF) findViewById(C23274hvD.Application.DGUQLIOvDItG);
        this.AhwBna = wyf;
        if (wyf != null) {
            wyf.setType(5);
        }
        wYF wyf2 = this.AhwBna;
        if (wyf2 != null) {
            wyf2.setPrimaryText(getString(C23274hvD.Fragment.QKVWgx));
        }
        wYF wyf3 = this.AhwBna;
        if (wyf3 == null || (c52794wYpCopydefault = wyf3.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setOnClickListener(new FragmentManager(c52794wYpCopydefault, 1000L, this));
    }

    /* JADX INFO: renamed from: o.lcK$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC30497lcK KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC30497lcK activityC30497lcK) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC30497lcK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.EZpvd("strategy_add");
                C23419hxq c23419hxq = this.KWHzl.valueOf;
                if (c23419hxq == null) {
                    Intrinsics.gEmmrt("");
                    c23419hxq = null;
                }
                c23419hxq.gEmmrt.EZpvd(new AdvancedAutoSellStrategy.StopLoss("", "", false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null));
                this.KWHzl.fetchVPNInfo();
            }
        }
    }

    /* JADX INFO: renamed from: o.lcK$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ActivityC30497lcK AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC30497lcK activityC30497lcK) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = activityC30497lcK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd("auto_sell_explain");
                C30488lcB.Activity activity = C30488lcB.Companion;
                androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                AbstractC30505lcS value = this.AEQbTJ.values().AEQbTJ().getValue();
                AbstractC30505lcS.TaskDescription taskDescription = value instanceof AbstractC30505lcS.TaskDescription ? (AbstractC30505lcS.TaskDescription) value : null;
                activity.OLrzqt(supportFragmentManager, taskDescription != null ? taskDescription.KWHzl() : null);
            }
        }
    }

    /* JADX INFO: renamed from: o.lcK$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ActivityC30497lcK AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC30497lcK activityC30497lcK) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC30497lcK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C23419hxq c23419hxq = this.AEQbTJ.valueOf;
                if (c23419hxq == null) {
                    Intrinsics.gEmmrt("");
                    c23419hxq = null;
                }
                java.util.List<AdvancedAutoSellStrategy> listEZpvd = c23419hxq.gEmmrt.EZpvd();
                InterfaceC30608leP interfaceC30608lePValueOf = this.AEQbTJ.valueOf();
                if (interfaceC30608lePValueOf != null) {
                    interfaceC30608lePValueOf.KWHzl(AdvancedTpslEditEvents.Confirm, new kRM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, C30501lcO.copydefault(listEZpvd), C30501lcO.AEQbTJ(listEZpvd), false, 655359, null));
                }
                this.AEQbTJ.EZpvd("tpsl_edit_close");
                this.AEQbTJ.values().KWHzl(listEZpvd);
                this.AEQbTJ.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.lcK$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC30497lcK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC30497lcK activityC30497lcK) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = activityC30497lcK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd("strategy_add");
                C23419hxq c23419hxq = this.copydefault.valueOf;
                if (c23419hxq == null) {
                    Intrinsics.gEmmrt("");
                    c23419hxq = null;
                }
                c23419hxq.gEmmrt.EZpvd(new AdvancedAutoSellStrategy.TakeProfit("", "", false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null));
                this.copydefault.fetchVPNInfo();
            }
        }
    }

    public final void AYXKKw() {
        android.content.Intent intent = getIntent();
        java.util.ArrayList<AdvancedAutoSellStrategy> parcelableArrayListExtra = intent != null ? IntentCompat.getParcelableArrayListExtra(intent, "strategies", AdvancedAutoSellStrategy.class) : null;
        if (parcelableArrayListExtra != null) {
            for (AdvancedAutoSellStrategy advancedAutoSellStrategy : parcelableArrayListExtra) {
                C23419hxq c23419hxq = this.valueOf;
                if (c23419hxq == null) {
                    Intrinsics.gEmmrt("");
                    c23419hxq = null;
                }
                c23419hxq.gEmmrt.EZpvd(advancedAutoSellStrategy);
            }
        }
        fetchVPNInfo();
    }

    public final void fetchVPNInfo() {
        C23419hxq c23419hxq = this.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        C30571ldf c30571ldf = c23419hxq.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c30571ldf, "");
        boolean z = c30571ldf.getChildCount() != 0;
        C23419hxq c23419hxq3 = this.valueOf;
        if (c23419hxq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23419hxq2 = c23419hxq3;
        }
        android.widget.TextView textView = c23419hxq2.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ^ true ? 0 : 8);
    }

    public final void gEmmrt() {
        C25390ivn.collectOnLifecycle$default(this, values().AEQbTJ(), null, new Activity(), 2, null);
    }

    /* JADX INFO: renamed from: o.lcK$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC30505lcS abstractC30505lcS, Continuation<? super Unit> continuation) {
            if (abstractC30505lcS instanceof AbstractC30505lcS.ActionBar) {
                ActivityC30497lcK.this.djBIcL();
            } else if (abstractC30505lcS instanceof AbstractC30505lcS.TaskDescription) {
                ActivityC30497lcK.this.AEQbTJ(((AbstractC30505lcS.TaskDescription) abstractC30505lcS).KWHzl());
                ActivityC30497lcK.this.KWHzl();
                rVN.reportFullyDrawn$default((android.app.Activity) ActivityC30497lcK.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (abstractC30505lcS instanceof AbstractC30505lcS.StateListAnimator) {
                ActivityC30497lcK.this.KWHzl(((AbstractC30505lcS.StateListAnimator) abstractC30505lcS).AEQbTJ());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public final void djBIcL() {
        pUU.EZpvd(getTAG(), "Remote strategies loading...");
        C23419hxq c23419hxq = this.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        C55113xdn c55113xdn = c23419hxq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(0);
        C23419hxq c23419hxq3 = this.valueOf;
        if (c23419hxq3 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq3 = null;
        }
        C55173xeu c55173xeu = c23419hxq3.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C23419hxq c23419hxq4 = this.valueOf;
        if (c23419hxq4 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq4 = null;
        }
        NestedScrollView nestedScrollView = c23419hxq4.EZpvd;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(8);
        C23419hxq c23419hxq5 = this.valueOf;
        if (c23419hxq5 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq5 = null;
        }
        C30568ldc c30568ldc = c23419hxq5.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c30568ldc, "");
        c30568ldc.setVisibility(8);
        C23419hxq c23419hxq6 = this.valueOf;
        if (c23419hxq6 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq6 = null;
        }
        wYF wyf = c23419hxq6.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyf, "");
        wyf.setVisibility(8);
        C23419hxq c23419hxq7 = this.valueOf;
        if (c23419hxq7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23419hxq2 = c23419hxq7;
        }
        c23419hxq2.copydefault.setSubDoImageVisible(8);
    }

    public final void AEQbTJ(java.util.List<? extends AdvancedAutoSellStrategy> list) {
        pUU.EZpvd(getTAG(), "Remote strategies loaded successfully: " + list.size() + " strategies");
        C23419hxq c23419hxq = this.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        C55113xdn c55113xdn = c23419hxq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        C23419hxq c23419hxq3 = this.valueOf;
        if (c23419hxq3 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq3 = null;
        }
        C55173xeu c55173xeu = c23419hxq3.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C23419hxq c23419hxq4 = this.valueOf;
        if (c23419hxq4 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq4 = null;
        }
        NestedScrollView nestedScrollView = c23419hxq4.EZpvd;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(0);
        C23419hxq c23419hxq5 = this.valueOf;
        if (c23419hxq5 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq5 = null;
        }
        wYF wyf = c23419hxq5.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyf, "");
        wyf.setVisibility(0);
        C23419hxq c23419hxq6 = this.valueOf;
        if (c23419hxq6 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq6 = null;
        }
        c23419hxq6.copydefault.setSubDoImageVisible(0);
        C23419hxq c23419hxq7 = this.valueOf;
        if (c23419hxq7 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq7 = null;
        }
        c23419hxq7.AYXKKw.removeAllViews();
        if (!list.isEmpty()) {
            C23419hxq c23419hxq8 = this.valueOf;
            if (c23419hxq8 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq8 = null;
            }
            C30568ldc c30568ldc = c23419hxq8.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c30568ldc, "");
            c30568ldc.setVisibility(0);
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                AdvancedAutoSellStrategy advancedAutoSellStrategy = (AdvancedAutoSellStrategy) obj;
                boolean z = i == 0;
                C23419hxq c23419hxq9 = this.valueOf;
                if (c23419hxq9 == null) {
                    Intrinsics.gEmmrt("");
                    c23419hxq9 = null;
                }
                c23419hxq9.AYXKKw.AEQbTJ(advancedAutoSellStrategy, z);
                i++;
            }
            C23419hxq c23419hxq10 = this.valueOf;
            if (c23419hxq10 == null) {
                Intrinsics.gEmmrt("");
                c23419hxq10 = null;
            }
            if (c23419hxq10.gEmmrt.EZpvd().size() == 5) {
                C23419hxq c23419hxq11 = this.valueOf;
                if (c23419hxq11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c23419hxq2 = c23419hxq11;
                }
                c23419hxq2.AYXKKw.KWHzl(false);
                return;
            }
            return;
        }
        C23419hxq c23419hxq12 = this.valueOf;
        if (c23419hxq12 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23419hxq2 = c23419hxq12;
        }
        C30568ldc c30568ldc2 = c23419hxq2.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c30568ldc2, "");
        c30568ldc2.setVisibility(8);
    }

    public final void KWHzl(java.lang.String str) {
        pUU.copydefault(getTAG(), "Failed to load remote strategies: " + str);
        C23419hxq c23419hxq = this.valueOf;
        C23419hxq c23419hxq2 = null;
        if (c23419hxq == null) {
            Intrinsics.gEmmrt("");
            c23419hxq = null;
        }
        C55113xdn c55113xdn = c23419hxq.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        C23419hxq c23419hxq3 = this.valueOf;
        if (c23419hxq3 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq3 = null;
        }
        NestedScrollView nestedScrollView = c23419hxq3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(8);
        C23419hxq c23419hxq4 = this.valueOf;
        if (c23419hxq4 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq4 = null;
        }
        wYF wyf = c23419hxq4.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyf, "");
        wyf.setVisibility(8);
        C23419hxq c23419hxq5 = this.valueOf;
        if (c23419hxq5 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq5 = null;
        }
        C30568ldc c30568ldc = c23419hxq5.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c30568ldc, "");
        c30568ldc.setVisibility(8);
        C23419hxq c23419hxq6 = this.valueOf;
        if (c23419hxq6 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq6 = null;
        }
        C55173xeu c55173xeu = c23419hxq6.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(0);
        C23419hxq c23419hxq7 = this.valueOf;
        if (c23419hxq7 == null) {
            Intrinsics.gEmmrt("");
            c23419hxq7 = null;
        }
        c23419hxq7.copydefault.setSubDoImageVisible(8);
        C23419hxq c23419hxq8 = this.valueOf;
        if (c23419hxq8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23419hxq2 = c23419hxq8;
        }
        C55173xeu c55173xeu2 = c23419hxq2.AhwBna;
        setTitle(getString(C23274hvD.Fragment.ikIEnW));
        java.lang.String string = getString(C23274hvD.Fragment.heceqZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu2.setSubTitle((java.lang.CharSequence) string);
        java.lang.String string2 = getString(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi213);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu2.setRetry(string2);
        c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.lcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC30497lcK.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC30497lcK activityC30497lcK, android.view.View view) {
        activityC30497lcK.values().OLrzqt();
    }

    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.lcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC30497lcK.AEQbTJ(this.AEQbTJ, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(ActivityC30497lcK activityC30497lcK, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", activityC30497lcK.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "tpsl_edit", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC30492lcF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AhwBna = null;
    }

    @Override // o.AbstractActivityC30492lcF, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30492lcF, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30492lcF, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30492lcF, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
