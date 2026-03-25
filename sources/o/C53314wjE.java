package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.BotExplainGatherData;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C53251whv;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wjE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53314wjE extends android.widget.RelativeLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public AbstractC48604uXo EZpvd;
    public boolean KWHzl;
    public androidx.fragment.app.FragmentManager copydefault;
    public ActivityResultLauncher<android.content.Intent> djBIcL;

    /* JADX INFO: renamed from: o.wjE$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.wjE$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GridStartTriggerType.values().length];
            try {
                iArr[GridStartTriggerType.RSI_14.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53314wjE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53314wjE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppendEnable(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:53) call: o.wjE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53314wjE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53314wjE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53314wjE.djBIcL(this.OLrzqt);
            }
        });
        this.KWHzl = true;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53314wjE.valueOf(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.wjE$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wjE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final androidx.fragment.app.FragmentManager djBIcL(C53314wjE c53314wjE) {
        return ((C53273wiQ) ViewKt.findFragment(c53314wjE)).getChildFragmentManager();
    }

    private final androidx.fragment.app.FragmentManager gEmmrt() {
        return (androidx.fragment.app.FragmentManager) this.AEQbTJ.getValue();
    }

    private final SpotDcaManualPresenter fetchVPNInfo() {
        return (SpotDcaManualPresenter) this.AYXKKw.getValue();
    }

    public static final SpotDcaManualPresenter valueOf(C53314wjE c53314wjE) {
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(c53314wjE);
        if (viewModelStoreOwner != null) {
            return (SpotDcaManualPresenter) new ViewModelProvider(viewModelStoreOwner).get(SpotDcaManualPresenter.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager AhwBna() {
        androidx.fragment.app.FragmentManager fragmentManager = this.copydefault;
        return fragmentManager == null ? gEmmrt() : fragmentManager;
    }

    public final void EZpvd() {
        valueOf();
        initListener$default(this, false, 1, null);
        copydefault();
        this.djBIcL = ((C53273wiQ) ViewKt.findFragment(this)).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.wjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C53314wjE.copydefault(this.KWHzl, (ActivityResult) obj);
            }
        });
    }

    public static final void copydefault(C53314wjE c53314wjE, ActivityResult activityResult) {
        android.content.Intent data;
        SpotDcaAdvancedParams spotDcaAdvancedParams;
        SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo;
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (spotDcaAdvancedParams = (SpotDcaAdvancedParams) data.getParcelableExtra("data")) == null || (spotDcaManualPresenterFetchVPNInfo = c53314wjE.fetchVPNInfo()) == null || (tradeLiveDataValueOf = spotDcaManualPresenterFetchVPNInfo.valueOf()) == null) {
            return;
        }
        tradeLiveDataValueOf.setValue(spotDcaAdvancedParams);
    }

    public final void OLrzqt(@NotNull C53173wgW c53173wgW) {
        androidx.fragment.app.FragmentManager childFragmentManager;
        Intrinsics.checkNotNullParameter(c53173wgW, "");
        try {
            childFragmentManager = ((C53173wgW) ViewKt.findFragment(this)).getChildFragmentManager();
        } catch (java.lang.Exception unused) {
            childFragmentManager = c53173wgW.getChildFragmentManager();
        }
        this.copydefault = childFragmentManager;
        KWHzl(true);
        copydefault(true);
        copydefault();
        this.djBIcL = ((C53173wgW) ViewKt.findFragment(this)).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.wjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C53314wjE.AEQbTJ(this.OLrzqt, (ActivityResult) obj);
            }
        });
    }

    public static final void AEQbTJ(C53314wjE c53314wjE, ActivityResult activityResult) {
        android.content.Intent data;
        SpotDcaAdvancedParams spotDcaAdvancedParams;
        SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo;
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (spotDcaAdvancedParams = (SpotDcaAdvancedParams) data.getParcelableExtra("data")) == null || (spotDcaManualPresenterFetchVPNInfo = c53314wjE.fetchVPNInfo()) == null || (tradeLiveDataValueOf = spotDcaManualPresenterFetchVPNInfo.valueOf()) == null) {
            return;
        }
        tradeLiveDataValueOf.setValue(spotDcaAdvancedParams);
    }

    public final void KWHzl(boolean z) {
        this.EZpvd = (AbstractC48604uXo) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.DRGLNw, this, true);
        refreshVisibleState$default(this, null, java.lang.Boolean.valueOf(z), 1, null);
    }

    public final void valueOf() {
        this.EZpvd = (AbstractC48604uXo) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.DRGLNw, this, true);
        refreshVisibleState$default(this, null, null, 3, null);
    }

    public final uBL AEQbTJ() {
        AbstractC48604uXo abstractC48604uXo = this.EZpvd;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        uBL ubl = abstractC48604uXo.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        return ubl;
    }

    public static /* synthetic */ void initListener$default(C53314wjE c53314wjE, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c53314wjE.copydefault(z);
    }

    public final void copydefault(boolean z) {
        AbstractC48604uXo abstractC48604uXo = this.EZpvd;
        AbstractC48604uXo abstractC48604uXo2 = null;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        abstractC48604uXo.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.wjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53314wjE.valueOf(this.AEQbTJ, view);
            }
        });
        AbstractC48604uXo abstractC48604uXo3 = this.EZpvd;
        if (abstractC48604uXo3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo3 = null;
        }
        C55258xgZ c55258xgZ = abstractC48604uXo3.AEQbTJ;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this, z));
        AbstractC48604uXo abstractC48604uXo4 = this.EZpvd;
        if (abstractC48604uXo4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo4 = null;
        }
        abstractC48604uXo4.djBIcL.KWHzl(new View.OnClickListener() { // from class: o.wjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53314wjE.KWHzl(this.KWHzl, view);
            }
        });
        AbstractC48604uXo abstractC48604uXo5 = this.EZpvd;
        if (abstractC48604uXo5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo5 = null;
        }
        abstractC48604uXo5.gEmmrt.KWHzl(new View.OnClickListener() { // from class: o.wjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53314wjE.AhwBna(this.KWHzl, view);
            }
        });
        AbstractC48604uXo abstractC48604uXo6 = this.EZpvd;
        if (abstractC48604uXo6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48604uXo2 = abstractC48604uXo6;
        }
        abstractC48604uXo2.copydefault.KWHzl(new View.OnClickListener() { // from class: o.wjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53314wjE.AYXKKw(this.OLrzqt, view);
            }
        });
    }

    public static final void valueOf(C53314wjE c53314wjE, android.view.View view) {
        AbstractC48604uXo abstractC48604uXo = c53314wjE.EZpvd;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        android.widget.LinearLayout linearLayout = abstractC48604uXo.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        boolean z = !(linearLayout.getVisibility() == 0);
        refreshVisibleState$default(c53314wjE, java.lang.Boolean.valueOf(z), null, 2, null);
        SPUtils.put("sp_tag_visible_state_spot_dca", java.lang.Boolean.valueOf(z));
    }

    public static final void KWHzl(C53314wjE c53314wjE, android.view.View view) {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher;
        C55887xsS c55887xsSFvQaOB;
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf;
        C55887xsS c55887xsSFvQaOB2;
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf2;
        if (c53314wjE.copydefault != null) {
            C53251whv.TaskDescription taskDescription = C53251whv.Companion;
            SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo = c53314wjE.fetchVPNInfo();
            SpotDcaAdvancedParams value = (spotDcaManualPresenterFetchVPNInfo == null || (tradeLiveDataValueOf2 = spotDcaManualPresenterFetchVPNInfo.valueOf()) == null) ? null : tradeLiveDataValueOf2.getValue();
            SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo2 = c53314wjE.fetchVPNInfo();
            C53251whv c53251whvAEQbTJ = taskDescription.AEQbTJ(value, (spotDcaManualPresenterFetchVPNInfo2 == null || (c55887xsSFvQaOB2 = spotDcaManualPresenterFetchVPNInfo2.fvQaOB()) == null) ? null : c55887xsSFvQaOB2.gEmmrt());
            androidx.fragment.app.FragmentManager fragmentManager = c53314wjE.copydefault;
            Intrinsics.copydefault(fragmentManager);
            c53251whvAEQbTJ.show(fragmentManager);
        } else {
            android.content.Context context = c53314wjE.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
            if (appCompatActivityCopydefault != null && (activityResultLauncher = c53314wjE.djBIcL) != null) {
                android.content.Intent intent = new android.content.Intent(appCompatActivityCopydefault, (java.lang.Class<?>) ActivityC53157wgG.class);
                SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo3 = c53314wjE.fetchVPNInfo();
                intent.putExtra("data", (spotDcaManualPresenterFetchVPNInfo3 == null || (tradeLiveDataValueOf = spotDcaManualPresenterFetchVPNInfo3.valueOf()) == null) ? null : tradeLiveDataValueOf.getValue());
                SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo4 = c53314wjE.fetchVPNInfo();
                intent.putExtra("bot_inst_id", (spotDcaManualPresenterFetchVPNInfo4 == null || (c55887xsSFvQaOB = spotDcaManualPresenterFetchVPNInfo4.fvQaOB()) == null) ? null : c55887xsSFvQaOB.gEmmrt());
                activityResultLauncher.launch(intent);
            }
        }
        C56028xvA.botClickTrack$default("startCondition", null, 2, null);
    }

    /* JADX INFO: renamed from: o.wjE$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53314wjE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53314wjE c53314wjE, boolean z) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c53314wjE;
            this.copydefault = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager fragmentManagerAhwBna = this.EZpvd.AhwBna();
                if (this.copydefault) {
                    this.EZpvd.AYXKKw();
                } else {
                    C53266wiJ.Companion.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RVsVBY), this.EZpvd.djBIcL(), fragmentManagerAhwBna);
                }
                C56028xvA.botClickTrack$default("advancedTv", null, 2, null);
            }
        }
    }

    public static final void AhwBna(C53314wjE c53314wjE, android.view.View view) {
        C53263wiG.Companion.OLrzqt(c53314wjE.AhwBna());
        C56028xvA.botClickTrack$default("slCondition", null, 2, null);
    }

    public static final void AYXKKw(C53314wjE c53314wjE, android.view.View view) {
        C53294wil.Companion.KWHzl(c53314wjE.AhwBna(), c53314wjE.KWHzl);
        C56028xvA.botClickTrack$default("addCondition", null, 2, null);
    }

    public final void AYXKKw() {
        OLrzqt(yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.fdOvFl), java.lang.Integer.valueOf(C55688xof.Application.call), java.lang.Integer.valueOf(C55688xof.Application.run)), yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.WS), java.lang.Integer.valueOf(C55688xof.Application.fHqPtx), java.lang.Integer.valueOf(C55688xof.Application.UscePu)));
    }

    public static final C43316rmw OLrzqt() {
        return new C43316rmw();
    }

    public static final C43316rmw OLrzqt(InterfaceC56387yDm<? extends C43316rmw> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public final void OLrzqt(java.util.ArrayList<java.lang.Integer> arrayList, java.util.ArrayList<java.lang.Integer> arrayList2) {
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.wjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53314wjE.OLrzqt();
            }
        });
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.YFmri, (android.view.ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C48033uCm.Application.dtVxwd);
        C43316rmw c43316rmwOLrzqt = OLrzqt((InterfaceC56387yDm<? extends C43316rmw>) interfaceC56387yDmCopydefault);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c43316rmwOLrzqt.register(ExplainItemModel.class, new C53151wgA(context));
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        OLrzqt((InterfaceC56387yDm<? extends C43316rmw>) interfaceC56387yDmCopydefault).setItems(KWHzl(context2, arrayList, arrayList2));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(OLrzqt((InterfaceC56387yDm<? extends C43316rmw>) interfaceC56387yDmCopydefault));
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context3);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.ActionBarDrawerToggle1, new View.OnClickListener() { // from class: o.wjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53314wjE.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final java.util.ArrayList<ExplainItemModel> KWHzl(@NotNull android.content.Context context, @NotNull java.util.ArrayList<java.lang.Integer> arrayList, @NotNull java.util.ArrayList<java.lang.Integer> arrayList2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        java.util.ArrayList<ExplainItemModel> arrayList3 = new java.util.ArrayList<>();
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((java.lang.Number) obj).intValue();
            if (i < arrayList2.size()) {
                java.lang.String string = context.getString(iIntValue);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.Integer num = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(num, "");
                java.lang.String string2 = context.getString(num.intValue());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList3.add(new ExplainItemModel(string, string2));
            }
            i++;
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.ArrayList<BotExplainGatherData> djBIcL() {
        java.util.ArrayList<BotExplainGatherData> arrayList = new java.util.ArrayList<>();
        if (!C56071xvr.gEmmrt.uzCIH()) {
            arrayList.add(new BotExplainGatherData(C33070mpX.AYXKKw(C55688xof.Application.RKcVTr), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), C33070mpX.AYXKKw(C55688xof.Application.OFhtUX)))));
        }
        arrayList.add(new BotExplainGatherData(C33070mpX.AYXKKw(C55688xof.Application.gVEiQJ), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.fdOvFl), C33070mpX.AYXKKw(C55688xof.Application.WS)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.call), C33070mpX.AYXKKw(C55688xof.Application.fHqPtx)))));
        arrayList.add(new BotExplainGatherData(C33070mpX.AYXKKw(C55688xof.Application.DwQSDd), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.run), C33070mpX.AYXKKw(C55688xof.Application.UscePu)))));
        return arrayList;
    }

    public static /* synthetic */ void refreshVisibleState$default(C53314wjE c53314wjE, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = java.lang.Boolean.FALSE;
        }
        c53314wjE.OLrzqt(bool, bool2);
    }

    public final void OLrzqt(java.lang.Boolean bool, java.lang.Boolean bool2) {
        AbstractC48604uXo abstractC48604uXo = this.EZpvd;
        AbstractC48604uXo abstractC48604uXo2 = null;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        C53573wnz c53573wnz = abstractC48604uXo.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
        c53573wnz.setVisibility(C56071xvr.gEmmrt.uzCIH() ^ true ? 0 : 8);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_spot_dca", false);
        if (Intrinsics.EZpvd(bool2, java.lang.Boolean.TRUE)) {
            zBooleanValue = false;
        }
        AbstractC48604uXo abstractC48604uXo3 = this.EZpvd;
        if (abstractC48604uXo3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo3 = null;
        }
        android.widget.LinearLayout linearLayout = abstractC48604uXo3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(zBooleanValue ? 0 : 8);
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        AbstractC48604uXo abstractC48604uXo4 = this.EZpvd;
        if (abstractC48604uXo4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48604uXo2 = abstractC48604uXo4;
        }
        abstractC48604uXo2.OLrzqt.setImageResource(i);
    }

    public final void copydefault() {
        C56111xwe<java.lang.Boolean> c56111xweDjBIcL;
        TradeLiveData<java.lang.String> tradeLiveDataEjfBZ;
        TradeLiveData<java.lang.String> tradeLiveDataFARcdN;
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo = fetchVPNInfo();
            if (spotDcaManualPresenterFetchVPNInfo != null && (tradeLiveDataValueOf = spotDcaManualPresenterFetchVPNInfo.valueOf()) != null) {
                tradeLiveDataValueOf.observe(lifecycleOwner, new Application(new Function1() { // from class: o.wjG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53314wjE.copydefault(this.EZpvd, (SpotDcaAdvancedParams) obj);
                    }
                }));
            }
            SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo2 = fetchVPNInfo();
            if (spotDcaManualPresenterFetchVPNInfo2 != null && (tradeLiveDataFARcdN = spotDcaManualPresenterFetchVPNInfo2.fARcdN()) != null) {
                tradeLiveDataFARcdN.observe(lifecycleOwner, new Application(new Function1() { // from class: o.wjL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53314wjE.EZpvd(this.EZpvd, (java.lang.String) obj);
                    }
                }));
            }
            SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo3 = fetchVPNInfo();
            if (spotDcaManualPresenterFetchVPNInfo3 != null && (tradeLiveDataEjfBZ = spotDcaManualPresenterFetchVPNInfo3.ejfBZ()) != null) {
                tradeLiveDataEjfBZ.observe(lifecycleOwner, new Application(new Function1() { // from class: o.wjM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53314wjE.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
                    }
                }));
            }
            SpotDcaManualPresenter spotDcaManualPresenterFetchVPNInfo4 = fetchVPNInfo();
            if (spotDcaManualPresenterFetchVPNInfo4 == null || (c56111xweDjBIcL = spotDcaManualPresenterFetchVPNInfo4.djBIcL()) == null) {
                return;
            }
            c56111xweDjBIcL.observe(lifecycleOwner, new Application(new Function1() { // from class: o.wjO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53314wjE.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            }));
        }
    }

    public static final Unit copydefault(C53314wjE c53314wjE, SpotDcaAdvancedParams spotDcaAdvancedParams) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String timePeriod;
        java.lang.String timeframe;
        Intrinsics.checkNotNullParameter(spotDcaAdvancedParams, "");
        AbstractC48604uXo abstractC48604uXo = c53314wjE.EZpvd;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        C53573wnz c53573wnz = abstractC48604uXo.djBIcL;
        if (StateListAnimator.EZpvd[spotDcaAdvancedParams.AEQbTJ().ordinal()] == 1) {
            java.util.List<DcaTriggerParam> listAYXKKw = spotDcaAdvancedParams.AYXKKw();
            DcaTriggerParam dcaTriggerParam = listAYXKKw != null ? (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw) : null;
            java.lang.String str = TriggerCond.Companion.KWHzl(dcaTriggerParam != null ? dcaTriggerParam.getTriggerCond() : null) + (dcaTriggerParam != null ? dcaTriggerParam.getThold() : null);
            int i = C55688xof.Application.multiple;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            if (dcaTriggerParam == null || (timePeriod = dcaTriggerParam.getTimePeriod()) == null) {
                timePeriod = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod);
            TimeFrame.Application application = TimeFrame.Companion;
            if (dcaTriggerParam == null || (timeframe = dcaTriggerParam.getTimeframe()) == null) {
                timeframe = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("RSIFactor2", application.copydefault(timeframe));
            pairArr[2] = C56390yDp.OLrzqt("RSIFactor3", str);
            strAYXKKw = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(spotDcaAdvancedParams.AEQbTJ().getDesc());
        }
        c53573wnz.setActiveContent(strAYXKKw);
        if (C33129mqd.AEQbTJ(spotDcaAdvancedParams.EZpvd(), 0)) {
            AbstractC48604uXo abstractC48604uXo2 = c53314wjE.EZpvd;
            if (abstractC48604uXo2 == null) {
                Intrinsics.gEmmrt("");
                abstractC48604uXo2 = null;
            }
            C53573wnz c53573wnz2 = abstractC48604uXo2.gEmmrt;
            xMR xmr = xMR.copydefault;
            java.lang.String strEZpvd = spotDcaAdvancedParams.EZpvd();
            c53573wnz2.setActiveContent(xMR.formatPercent$default(xmr, strEZpvd == null ? "" : strEZpvd, 0, null, 6, null));
        } else {
            AbstractC48604uXo abstractC48604uXo3 = c53314wjE.EZpvd;
            if (abstractC48604uXo3 == null) {
                Intrinsics.gEmmrt("");
                abstractC48604uXo3 = null;
            }
            abstractC48604uXo3.gEmmrt.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
        }
        AbstractC48604uXo abstractC48604uXo4 = c53314wjE.EZpvd;
        if (abstractC48604uXo4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo4 = null;
        }
        C53573wnz c53573wnz3 = abstractC48604uXo4.copydefault;
        if (C33129mqd.AEQbTJ(spotDcaAdvancedParams.AhwBna(), 0) && C33129mqd.AEQbTJ(spotDcaAdvancedParams.OLrzqt(), 0)) {
            xMR xmr2 = xMR.copydefault;
            java.lang.String strAhwBna = spotDcaAdvancedParams.AhwBna();
            if (strAhwBna == null) {
                strAhwBna = "";
            }
            java.lang.String localizedWithMinPrecision$default = xMR.formatLocalizedWithMinPrecision$default(xmr2, strAhwBna, 0, 2, null);
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
            java.lang.String strOLrzqt = spotDcaAdvancedParams.OLrzqt();
            strAYXKKw2 = localizedWithMinPrecision$default + strAYXKKw3 + " | " + xMR.formatLocalizedWithMinPrecision$default(xmr2, strOLrzqt != null ? strOLrzqt : "", 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
        }
        c53573wnz3.setActiveContent(strAYXKKw2);
        java.lang.Boolean boolCopydefault = spotDcaAdvancedParams.copydefault();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolCopydefault, bool)) {
            c53314wjE.OLrzqt(bool, spotDcaAdvancedParams.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53314wjE c53314wjE, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48604uXo abstractC48604uXo = c53314wjE.EZpvd;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        abstractC48604uXo.copydefault.setActiveContentState(true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53314wjE c53314wjE, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48604uXo abstractC48604uXo = c53314wjE.EZpvd;
        AbstractC48604uXo abstractC48604uXo2 = null;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        abstractC48604uXo.copydefault.setActiveContentState(true);
        AbstractC48604uXo abstractC48604uXo3 = c53314wjE.EZpvd;
        if (abstractC48604uXo3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48604uXo2 = abstractC48604uXo3;
        }
        abstractC48604uXo2.gEmmrt.setActiveContentState(true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53314wjE c53314wjE, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        AbstractC48604uXo abstractC48604uXo = c53314wjE.EZpvd;
        AbstractC48604uXo abstractC48604uXo2 = null;
        if (abstractC48604uXo == null) {
            Intrinsics.gEmmrt("");
            abstractC48604uXo = null;
        }
        abstractC48604uXo.copydefault.setActiveContentState(false);
        AbstractC48604uXo abstractC48604uXo3 = c53314wjE.EZpvd;
        if (abstractC48604uXo3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48604uXo2 = abstractC48604uXo3;
        }
        abstractC48604uXo2.gEmmrt.setActiveContentState(false);
        return Unit.INSTANCE;
    }
}
