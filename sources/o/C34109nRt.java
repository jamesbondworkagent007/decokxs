package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.create.SelectMembershipFeeFragment$observeViewModel$1;
import com.okinc.im.imui.group.create.SelectMembershipFeeFragment$observeViewModel$2;
import com.okinc.im.imui.group.create.viewmodel.SelectMembershipFeeViewModel;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.remote.SupportedCurrencies;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C37290oqz;
import o.C52761wXj;
import o.nQO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nRt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34109nRt extends AbstractC34094nRe {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public C33925nKy AYXKKw;
    public final int AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public C33934nLg djBIcL;
    public final InterfaceC56387yDm isConnected;
    public final ActivityResultLauncher<android.content.Intent> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C34109nRt() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.group.create.SelectMembershipFeeFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.group.create.SelectMembershipFeeFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectMembershipFeeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.create.SelectMembershipFeeFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.create.SelectMembershipFeeFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.create.SelectMembershipFeeFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AhwBna = C35399nuc.Dialog.DCUTEIddSDPG;
        this.valueOf = C37290oqz.copydefault.KWHzl(this, new Activity());
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.nRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C34109nRt.AYXKKw());
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.nRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C34109nRt.AhwBna());
            }
        });
    }

    public final SelectMembershipFeeViewModel values() {
        return (SelectMembershipFeeViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: renamed from: o.nRt$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nRt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C34109nRt KWHzl() {
            return new C34109nRt();
        }
    }

    /* JADX INFO: renamed from: o.nRt$Activity */
    public static final class Activity implements C37290oqz.StateListAnimator {
        public Activity() {
        }

        @Override // o.C37290oqz.StateListAnimator
        public void EZpvd(ActivityResult activityResult) {
            Intrinsics.checkNotNullParameter(activityResult, "");
            if (activityResult.getResultCode() == 1001) {
                C37290oqz c37290oqz = C37290oqz.copydefault;
                FragmentActivity fragmentActivityRequireActivity = C34109nRt.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
            }
        }
    }

    /* JADX INFO: renamed from: o.nRt$FragmentManager */
    public static final class FragmentManager implements android.text.TextWatcher {
        public final /* synthetic */ C34109nRt EZpvd;
        public final /* synthetic */ C33925nKy OLrzqt;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public FragmentManager(C33925nKy c33925nKy, C34109nRt c34109nRt) {
            this.OLrzqt = c33925nKy;
            this.EZpvd = c34109nRt;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.EZpvd.values().AEQbTJ(C59443zhD.AuCTel(this.OLrzqt.AhwBna.isConnected()));
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33925nKy c33925nKyEZpvd = C33925nKy.EZpvd(layoutInflater, viewGroup, false);
        this.AYXKKw = c33925nKyEZpvd;
        if (c33925nKyEZpvd == null) {
            Intrinsics.gEmmrt("");
            c33925nKyEZpvd = null;
        }
        android.widget.LinearLayout linearLayoutOLrzqt = c33925nKyEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOLrzqt, "");
        return linearLayoutOLrzqt;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AkhnZx();
        DbNXlk();
        fetchVPNInfo();
        fJNWhG();
        isConnected();
        view.post(new java.lang.Runnable() { // from class: o.nRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C34109nRt.djBIcL(this.AEQbTJ);
            }
        });
    }

    public static final void djBIcL(C34109nRt c34109nRt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c34109nRt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AkhnZx() {
        C55251xgS c55251xgS;
        android.content.Context context = getContext();
        C33925nKy c33925nKy = null;
        if (context != null) {
            C55251xgS c55251xgS2 = new C55251xgS(context, null, 0, 6, null);
            c55251xgS2.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fRNHEq));
            c55251xgS2.setOKDSSize(-5);
            c55251xgS2.setOKDSStyle(7);
            c55251xgS = c55251xgS2;
        } else {
            c55251xgS = null;
        }
        C55167xeo c55167xeo = new C55167xeo(-1, C33070mpX.AYXKKw(C35399nuc.LoaderManager.UJpkuA) + " ", C33070mpX.AYXKKw(C35399nuc.LoaderManager.gvFztT), c55251xgS, 0, 16, null);
        C55167xeo c55167xeo2 = new C55167xeo(-1, C33070mpX.AYXKKw(C35399nuc.LoaderManager.compare), C33070mpX.AYXKKw(C35399nuc.LoaderManager.RidNCX), null, 0, 24, null);
        C33925nKy c33925nKy2 = this.AYXKKw;
        if (c33925nKy2 == null) {
            Intrinsics.gEmmrt("");
            c33925nKy2 = null;
        }
        C55166xen c55166xen = c33925nKy2.copydefault;
        c55166xen.setIconResId(c55167xeo.KWHzl());
        c55166xen.setTitleText(c55167xeo.EZpvd());
        c55166xen.setDescriptionText(c55167xeo.OLrzqt());
        c55166xen.setTitleAttachingView(c55167xeo.copydefault());
        c55166xen.setSelected(true);
        c55166xen.setOnClickListener(new ActionBar(c55166xen, 1000L, this));
        C33925nKy c33925nKy3 = this.AYXKKw;
        if (c33925nKy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33925nKy = c33925nKy3;
        }
        C55166xen c55166xen2 = c33925nKy.EZpvd;
        c55166xen2.setIconResId(c55167xeo2.KWHzl());
        c55166xen2.setTitleText(c55167xeo2.EZpvd());
        c55166xen2.setDescriptionText(c55167xeo2.OLrzqt());
        c55166xen2.setSelected(false);
        c55166xen2.setOnClickListener(new TaskDescription(c55166xen2, 1000L, this));
        values().OLrzqt(GroupBillingType.MONTHLY);
    }

    public final void copydefault(GroupBillingType groupBillingType) {
        C33925nKy c33925nKy = this.AYXKKw;
        if (c33925nKy == null) {
            Intrinsics.gEmmrt("");
            c33925nKy = null;
        }
        c33925nKy.copydefault.setSelected(groupBillingType == GroupBillingType.MONTHLY);
        c33925nKy.EZpvd.setSelected(groupBillingType == GroupBillingType.YEARLY);
        values().OLrzqt(groupBillingType);
    }

    /* JADX INFO: renamed from: o.nRt$Dialog */
    public static final class Dialog implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C33925nKy AEQbTJ;
        public final /* synthetic */ android.view.ViewTreeObserver OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        public Dialog(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, C33925nKy c33925nKy) {
            this.OLrzqt = viewTreeObserver;
            this.copydefault = view;
            this.AEQbTJ = c33925nKy;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.OLrzqt.isAlive() ? this.OLrzqt : this.copydefault.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.AEQbTJ.values.fullScroll(130);
        }
    }

    public final void DbNXlk() {
        C33934nLg c33934nLgAEQbTJ = C33934nLg.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c33934nLgAEQbTJ, "");
        c33934nLgAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34109nRt.AEQbTJ(this.EZpvd, view);
            }
        });
        c33934nLgAEQbTJ.OLrzqt.EZpvd().setVisibility(8);
        this.djBIcL = c33934nLgAEQbTJ;
        final C33925nKy c33925nKy = this.AYXKKw;
        C33934nLg c33934nLg = null;
        if (c33925nKy == null) {
            Intrinsics.gEmmrt("");
            c33925nKy = null;
        }
        final C55001xbh c55001xbh = c33925nKy.AhwBna;
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.nRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C34109nRt.EZpvd(this.KWHzl, c55001xbh, c33925nKy, view, z);
            }
        });
        Intrinsics.copydefault(c55001xbh);
        c55001xbh.addTextChangedListener(new FragmentManager(c33925nKy, this));
        android.widget.FrameLayout frameLayout = c33925nKy.AYXKKw;
        frameLayout.removeAllViews();
        C33934nLg c33934nLg2 = this.djBIcL;
        if (c33934nLg2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33934nLg = c33934nLg2;
        }
        frameLayout.addView(c33934nLg.getRoot());
    }

    public static final void AEQbTJ(C34109nRt c34109nRt, android.view.View view) {
        pUU.KWHzl(c34109nRt.getTAG(), "Filter chip clicked");
    }

    public static final void EZpvd(C34109nRt c34109nRt, C55001xbh c55001xbh, C33925nKy c33925nKy, android.view.View view, boolean z) {
        java.lang.String minAmount;
        SupportedCurrencies value = c34109nRt.values().EZpvd().getValue();
        if (z) {
            android.text.Editable text = c55001xbh.getText();
            if (text == null || StringsKt__StringsKt.fARcdN(text)) {
                c55001xbh.setText((value == null || (minAmount = value.getMinAmount()) == null) ? null : C37683oyU.AEQbTJ(minAmount, java.lang.Integer.valueOf(value.getDecimalPoint())));
            }
            android.widget.ScrollView scrollView = c33925nKy.values;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            android.view.ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new Dialog(viewTreeObserver, scrollView, c33925nKy));
        }
    }

    /* JADX INFO: renamed from: o.nRt$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C34109nRt OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C34109nRt c34109nRt) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c34109nRt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault(GroupBillingType.MONTHLY);
            }
        }
    }

    /* JADX INFO: renamed from: o.nRt$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C34109nRt OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C34109nRt c34109nRt) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c34109nRt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.util.List listAhwBna = yDY.AhwBna();
                GroupType groupType = GroupType.PREMIUM;
                GroupBillingType groupBillingTypeKWHzl = this.OLrzqt.values().KWHzl();
                java.lang.Double dOLrzqt = this.OLrzqt.values().OLrzqt();
                SupportedCurrencies value = this.OLrzqt.values().EZpvd().getValue();
                nQO.ActionBar actionBar = new nQO.ActionBar(listAhwBna, groupType, groupBillingTypeKWHzl, dOLrzqt, value != null ? java.lang.Integer.valueOf(value.getCurrencyId()) : null);
                nQO.StateListAnimator stateListAnimator = nQO.Companion;
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                this.OLrzqt.valueOf.launch(stateListAnimator.AEQbTJ(contextRequireContext, actionBar));
            }
        }
    }

    /* JADX INFO: renamed from: o.nRt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C34109nRt EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C34109nRt c34109nRt) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c34109nRt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.copydefault(GroupBillingType.YEARLY);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void fetchVPNInfo() {
        C33925nKy c33925nKy = this.AYXKKw;
        if (c33925nKy == null) {
            Intrinsics.gEmmrt("");
            c33925nKy = null;
        }
        wYK wyk = c33925nKy.OLrzqt;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.QzqeNH);
        java.lang.String strCopydefault = C33069mpW.copydefault(C35399nuc.LoaderManager.icKaHr, C56423yEv.EZpvd(C56390yDp.OLrzqt("termsAndConditions", strAYXKKw)));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null);
        int length = strAYXKKw.length();
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        spannableString.setSpan(new PendingIntent(), iIndexOf$default, length + iIndexOf$default, 33);
        wyk.setHighlightColor(C33070mpX.copydefault(C52761wXj.Activity.RcvFxC));
        wyk.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        wyk.setText(spannableString);
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.nRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C34109nRt.EZpvd(this.EZpvd, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: o.nRt$PendingIntent */
    public static final class PendingIntent extends android.text.style.ClickableSpan {
        public PendingIntent() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.oHa.openPageWithInterceptor$default(com.okinc.web.WebActivity$TaskDescription, android.content.Context, android.os.Bundle, java.lang.Integer, int, java.lang.Object):void */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            view.cancelPendingInputEvents();
            view.invalidate();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.OAjjVP);
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = C34109nRt.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C35878oHa.openPageWithInterceptor$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", strAYXKKw)), null, 4, null);
        }
    }

    public static final void EZpvd(C34109nRt c34109nRt, android.widget.CompoundButton compoundButton, boolean z) {
        c34109nRt.values().AEQbTJ(z);
    }

    private final void fJNWhG() {
        C33925nKy c33925nKy = this.AYXKKw;
        if (c33925nKy == null) {
            Intrinsics.gEmmrt("");
            c33925nKy = null;
        }
        C52794wYp c52794wYp = c33925nKy.KWHzl;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public final void OLrzqt(SupportedCurrencies supportedCurrencies) {
        C33934nLg c33934nLg = null;
        java.lang.String localized$default = pTB.formatLocalized$default(supportedCurrencies.getMinAmount(), null, 1, null);
        java.lang.String localized$default2 = pTB.formatLocalized$default(supportedCurrencies.getMaxAmount(), null, 1, null);
        C33925nKy c33925nKy = this.AYXKKw;
        if (c33925nKy == null) {
            Intrinsics.gEmmrt("");
            c33925nKy = null;
        }
        c33925nKy.AhwBna.setMaxDecimalValue(supportedCurrencies.getDecimalPoint());
        c33925nKy.AhwBna.setHintText(localized$default);
        c33925nKy.gEmmrt.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.RgaQzq, C56424yEw.gEmmrt(C56390yDp.OLrzqt("lower", localized$default), C56390yDp.OLrzqt("upper", localized$default2), C56390yDp.OLrzqt("currency", supportedCurrencies.getCurrencyCode()))));
        android.widget.TextView textView = c33925nKy.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        C33934nLg c33934nLg2 = this.djBIcL;
        if (c33934nLg2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33934nLg = c33934nLg2;
        }
        c33934nLg.OLrzqt.copydefault().setText(supportedCurrencies.getCurrencyCode());
        values().EZpvd(supportedCurrencies);
    }

    public final int djBIcL() {
        return ((java.lang.Number) this.isConnected.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
    }

    public final int valueOf() {
        return ((java.lang.Number) this.DbNXlk.getValue()).intValue();
    }

    public static final int AhwBna() {
        return C33070mpX.copydefault(C52761wXj.Activity.DQzvGN);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ozF.collectOnLifecycle$default(kotlinx.coroutines.flow.Flow, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$State, o.yHO, int, java.lang.Object):void */
    private final void isConnected() {
        SharedFlow<SelectMembershipFeeViewModel.ActionBar> sharedFlowCopydefault = values().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowCopydefault, viewLifecycleOwner, (Lifecycle.State) null, new SelectMembershipFeeFragment$observeViewModel$1(this, null), 2, (java.lang.Object) null);
        StateFlow<SelectMembershipFeeViewModel.Application> stateFlowAEQbTJ = values().AEQbTJ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAEQbTJ, viewLifecycleOwner2, (Lifecycle.State) null, new SelectMembershipFeeFragment$observeViewModel$2(this, null), 2, (java.lang.Object) null);
        values().valueOf();
    }
}
