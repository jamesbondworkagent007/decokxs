package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoAction;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementActivity$showExplanationDialog$1;
import com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementViewModel;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoTab;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoWalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC10317bmF;
import o.InterfaceC10354bmq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC10355bmr extends AbstractActivityC10348bmk implements InterfaceC10352bmo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C16390eiy AhwBna;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bmu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC10355bmr.EZpvd(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.bmw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC10355bmr.valueOf(this.AEQbTJ);
        }
    });

    public final UtxoWalletInfo valueOf() {
        UtxoWalletInfo utxoWalletInfo = (UtxoWalletInfo) getIntent().getParcelableExtra("key.params");
        if (utxoWalletInfo != null) {
            return utxoWalletInfo;
        }
        throw new java.lang.IllegalStateException("Must provide params.");
    }

    /* JADX INFO: renamed from: o.bmr$Activity */
    public static final class Activity extends FragmentStateAdapter {
        public Activity() {
            super(ActivityC10355bmr.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C10361bmx.AEQbTJ.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return C10285bla.Companion.AEQbTJ(UtxoWalletInfo.copy$default(ActivityC10355bmr.this.valueOf(), null, 0L, 0L, java.lang.Integer.valueOf(((UtxoTab) C10361bmx.AEQbTJ.get(i)).copydefault()), 7, null));
        }
    }

    /* JADX DEBUG: Possible override for method o.bmk.EZpvd()V */
    public final Activity EZpvd() {
        return (Activity) this.valueOf.getValue();
    }

    public static final Activity EZpvd(ActivityC10355bmr activityC10355bmr) {
        return activityC10355bmr.new Activity();
    }

    public final InvestUtxoManagementViewModel AhwBna() {
        return (InvestUtxoManagementViewModel) this.AYXKKw.getValue();
    }

    @Override // o.AbstractActivityC10348bmk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16390eiy c16390eiyCopydefault = C16390eiy.copydefault(android.view.LayoutInflater.from(this));
        this.AhwBna = c16390eiyCopydefault;
        if (c16390eiyCopydefault == null) {
            Intrinsics.gEmmrt("");
            c16390eiyCopydefault = null;
        }
        setContentView(c16390eiyCopydefault.getRoot());
        djBIcL();
        C14646dpQ.collectOnLifecycle$default(this, AhwBna().copydefault(), null, new Function1() { // from class: o.bmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10355bmr.copydefault(this.copydefault, (InterfaceC10317bmF) obj);
            }
        }, 2, null);
        C14646dpQ.collectOnLifecycle$default(this, AhwBna().OLrzqt(), null, new Function1() { // from class: o.bms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10355bmr.KWHzl(this.copydefault, (Unit) obj);
            }
        }, 2, null);
        C14646dpQ.collectOnLifecycle$default(this, AhwBna().AEQbTJ(), null, new Function1() { // from class: o.bmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10355bmr.copydefault(this.copydefault, (InterfaceC10354bmq) obj);
            }
        }, 2, null);
        AhwBna().OLrzqt(valueOf().KWHzl());
        KWHzl();
    }

    public static final Unit copydefault(ActivityC10355bmr activityC10355bmr, InterfaceC10317bmF interfaceC10317bmF) {
        Intrinsics.checkNotNullParameter(interfaceC10317bmF, "");
        activityC10355bmr.EZpvd(interfaceC10317bmF);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC10355bmr activityC10355bmr, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        activityC10355bmr.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC10355bmr activityC10355bmr, InterfaceC10354bmq interfaceC10354bmq) {
        Intrinsics.checkNotNullParameter(interfaceC10354bmq, "");
        activityC10355bmr.KWHzl(interfaceC10354bmq);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC10352bmo
    public void KWHzl() {
        AhwBna().AEQbTJ(valueOf());
    }

    @Override // o.InterfaceC10352bmo
    public void KWHzl(@NotNull InvestUtxoAction investUtxoAction) {
        Intrinsics.checkNotNullParameter(investUtxoAction, "");
        C10262blD c10262blDCopydefault = C10262blD.Companion.copydefault(investUtxoAction);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c10262blDCopydefault.show(supportFragmentManager);
    }

    @Override // o.InterfaceC10352bmo
    public void copydefault(@NotNull InvestUtxoAction investUtxoAction) {
        Intrinsics.checkNotNullParameter(investUtxoAction, "");
        AhwBna().copydefault(valueOf(), investUtxoAction);
    }

    /* JADX DEBUG: Possible override for method o.bmk.djBIcL()V */
    public final Unit djBIcL() {
        C16390eiy c16390eiy = this.AhwBna;
        if (c16390eiy == null) {
            Intrinsics.gEmmrt("");
            c16390eiy = null;
        }
        c16390eiy.AhwBna.setAdapter(EZpvd());
        c16390eiy.AhwBna.setOffscreenPageLimit(C10361bmx.AEQbTJ.size());
        fetchVPNInfo();
        C16390eiy c16390eiy2 = this.AhwBna;
        if (c16390eiy2 == null) {
            Intrinsics.gEmmrt("");
            c16390eiy2 = null;
        }
        C55173xeu c55173xeu = c16390eiy2.copydefault;
        c55173xeu.setEmptyTypeImage(2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.bmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC10355bmr.OLrzqt(this.AEQbTJ, view);
            }
        });
        C16390eiy c16390eiy3 = this.AhwBna;
        if (c16390eiy3 == null) {
            Intrinsics.gEmmrt("");
            c16390eiy3 = null;
        }
        android.widget.ImageView doImage = c16390eiy3.AEQbTJ.getDoImage();
        if (doImage == null) {
            return null;
        }
        doImage.setOnClickListener(new ActionBar(doImage, 1000L, this));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC10355bmr activityC10355bmr, android.view.View view) {
        activityC10355bmr.KWHzl();
    }

    private final void fetchVPNInfo() {
        C16390eiy c16390eiy = this.AhwBna;
        if (c16390eiy == null) {
            Intrinsics.gEmmrt("");
            c16390eiy = null;
        }
        new TabLayoutMediator(c16390eiy.djBIcL, c16390eiy.AhwBna, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.bmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ActivityC10355bmr.KWHzl(tab, i);
            }
        }).attach();
        android.view.View childAt = c16390eiy.djBIcL.getChildAt(0);
        android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        boolean zOLrzqt = C55296xhK.OLrzqt(this);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt2 = viewGroup.getChildAt(i);
            if (childAt2 != null) {
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    if (zOLrzqt) {
                        marginLayoutParams.setMargins(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
                    } else {
                        marginLayoutParams.setMargins(0, 0, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), 0);
                    }
                }
                childAt2.requestLayout();
            }
        }
    }

    public static final void KWHzl(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(C33070mpX.AYXKKw(((UtxoTab) C10361bmx.AEQbTJ.get(i)).AEQbTJ()));
    }

    public final void EZpvd(InterfaceC10317bmF interfaceC10317bmF) {
        C16390eiy c16390eiy = this.AhwBna;
        if (c16390eiy == null) {
            Intrinsics.gEmmrt("");
            c16390eiy = null;
        }
        C55173xeu c55173xeu = c16390eiy.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z = interfaceC10317bmF instanceof InterfaceC10317bmF.TaskDescription;
        c55173xeu.setVisibility(z ? 0 : 8);
        C10316bmE c10316bmE = c16390eiy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c10316bmE, "");
        c10316bmE.setVisibility(interfaceC10317bmF instanceof InterfaceC10317bmF.ActionBar ? 0 : 8);
        TabLayout tabLayout = c16390eiy.djBIcL;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "");
        boolean z2 = interfaceC10317bmF instanceof InterfaceC10317bmF.Application;
        tabLayout.setVisibility(z2 ? 0 : 8);
        ViewPager2 viewPager2 = c16390eiy.AhwBna;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        viewPager2.setVisibility(z2 ? 0 : 8);
        if (z2) {
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (z) {
            rVN.reportFullyDrawn$default((android.app.Activity) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void gEmmrt() {
        C10227bkV c10227bkVKWHzl = C10227bkV.Companion.KWHzl(valueOf().KWHzl());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c10227bkVKWHzl.show(supportFragmentManager);
        AhwBna().copydefault(valueOf().KWHzl());
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestUtxoManagementActivity$showExplanationDialog$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.bmr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC10355bmr KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC10355bmr activityC10355bmr) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC10355bmr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.AYXKKw();
            }
        }
    }

    public final void KWHzl(InterfaceC10354bmq interfaceC10354bmq) {
        if (interfaceC10354bmq instanceof InterfaceC10354bmq.Application) {
            C55328xhq.show$default(C55328xhq.OLrzqt, getString(C13754dXa.FragmentManager.sTzBva), ContextCompat.getDrawable(this, C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
            return;
        }
        if (interfaceC10354bmq instanceof InterfaceC10354bmq.TaskDescription) {
            InterfaceC10354bmq.TaskDescription taskDescription = (InterfaceC10354bmq.TaskDescription) interfaceC10354bmq;
            int i = taskDescription.copydefault() ? C13754dXa.FragmentManager.dispose : C13754dXa.FragmentManager.BackHandler;
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(valueOf().KWHzl());
            java.lang.String strFJNWhG = c10854bwMCopydefault != null ? c10854bwMCopydefault.fJNWhG() : null;
            if (strFJNWhG == null) {
                strFJNWhG = "";
            }
            C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.KWHzl(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", C10353bmp.OLrzqt.AEQbTJ(taskDescription.OLrzqt())), C56390yDp.OLrzqt("chainName", strFJNWhG))), ContextCompat.getDrawable(this, C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.bmr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bmr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull UtxoWalletInfo utxoWalletInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(utxoWalletInfo, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC10355bmr.class);
            intent.putExtra("key.params", utxoWalletInfo);
            return intent;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InvestUtxoManagementViewModel valueOf(final ActivityC10355bmr activityC10355bmr) {
        final Function0 function0 = null;
        InvestUtxoManagementViewModel investUtxoManagementViewModel = (InvestUtxoManagementViewModel) new ViewModelLazy(C56524yIo.AEQbTJ(InvestUtxoManagementViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementActivity$viewModel_delegate$lambda$1$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = activityC10355bmr.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementActivity$viewModel_delegate$lambda$1$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = activityC10355bmr.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementActivity$viewModel_delegate$lambda$1$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = activityC10355bmr.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
        investUtxoManagementViewModel.AEQbTJ(activityC10355bmr.valueOf().KWHzl());
        return investUtxoManagementViewModel;
    }

    @Override // o.AbstractActivityC10348bmk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC10348bmk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC10348bmk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC10348bmk, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
