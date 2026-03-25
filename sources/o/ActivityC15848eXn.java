package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenActivity$initListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlTokenListDetailViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C15852eXr;
import o.C52761wXj;
import o.eSW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15848eXn extends eXJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public eSW AEQbTJ;
    public java.lang.String EZpvd = "DefiWalletPnlTokenActivity";
    public AbstractC16290ehD OLrzqt;
    public DialogC55112xdm copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    public ActivityC15848eXn() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(WalletPnlTokenListDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.eXn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eXn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eXn$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startActivity$default(ActionBar actionBar, android.content.Context context, java.lang.String str, int i, long j, java.util.ArrayList arrayList, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                i = 1;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                j = Long.MIN_VALUE;
            }
            long j2 = j;
            if ((i2 & 16) != 0) {
                arrayList = new java.util.ArrayList();
            }
            actionBar.copydefault(context, str, i3, j2, arrayList);
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, long j, @NotNull java.util.ArrayList<SupportPnlChainResponse> arrayList) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15848eXn.class);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            intent.putExtra("chain_id", j);
            intent.putExtra("type", i);
            intent.putExtra("chain_list", arrayList);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String gEmmrt() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final long AYXKKw() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getLongExtra("chain_id", Long.MIN_VALUE);
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Possible override for method o.eXJ.KWHzl()V */
    public final int KWHzl() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra("type", 1);
        }
        return 1;
    }

    /* JADX DEBUG: Possible override for method o.eXJ.AEQbTJ()V */
    public final java.util.ArrayList<SupportPnlChainResponse> AEQbTJ() {
        java.util.ArrayList<SupportPnlChainResponse> parcelableArrayListExtra;
        android.content.Intent intent = getIntent();
        return (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("chain_list")) == null) ? new java.util.ArrayList<>() : parcelableArrayListExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletPnlTokenListDetailViewModel djBIcL() {
        return (WalletPnlTokenListDetailViewModel) this.valueOf.getValue();
    }

    @Override // o.eXJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C33537myN c33537myN;
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16290ehD) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QKVWgx);
        C33516mxt.EZpvd(this);
        if (gEmmrt().length() == 0) {
            finish();
            return;
        }
        values();
        AkhnZx();
        AbstractC16290ehD abstractC16290ehD = this.OLrzqt;
        if (abstractC16290ehD == null || (c33537myN = abstractC16290ehD.KWHzl) == null) {
            return;
        }
        c33537myN.setSubDoListener(new View.OnClickListener() { // from class: o.eXp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC15848eXn.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(final ActivityC15848eXn activityC15848eXn, android.view.View view) {
        eYV eyv = new eYV();
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC15848eXn.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        eyv.EZpvd(supportFragmentManager, "recentPnl", new Function1() { // from class: o.eXo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15848eXn.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(ActivityC15848eXn activityC15848eXn, boolean z) {
        activityC15848eXn.djBIcL().copydefault(z);
        return Unit.INSTANCE;
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenActivity$initListener$1(this, null), 3, null);
    }

    private final void AkhnZx() {
        isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        if (AEQbTJ().isEmpty()) {
            DbNXlk();
            djBIcL().KWHzl();
            return;
        }
        AbstractC16290ehD abstractC16290ehD = this.OLrzqt;
        if (abstractC16290ehD != null) {
            abstractC16290ehD.EZpvd.setVisibility(8);
            abstractC16290ehD.copydefault.setVisibility(0);
            abstractC16290ehD.OLrzqt.setVisibility(0);
        }
        AbstractC16290ehD abstractC16290ehD2 = this.OLrzqt;
        if (abstractC16290ehD2 == null) {
            return;
        }
        KWHzl(abstractC16290ehD2, AEQbTJ());
    }

    private final void DbNXlk() {
        if (this.copydefault == null) {
            this.copydefault = new DialogC55112xdm(this, C13754dXa.LoaderManager.isConnected);
        }
        if (isFinishing() || isDestroyed()) {
            return;
        }
        try {
            DialogC55112xdm dialogC55112xdm = this.copydefault;
            if (dialogC55112xdm != null) {
                dialogC55112xdm.show();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "error message:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        DialogC55112xdm dialogC55112xdm = this.copydefault;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
    }

    public final void KWHzl(AbstractC16290ehD abstractC16290ehD, java.util.List<SupportPnlChainResponse> list) {
        try {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            final Activity activity = new Activity(this, supportFragmentManager, list);
            abstractC16290ehD.OLrzqt.setOffscreenPageLimit(activity.EZpvd().size());
            abstractC16290ehD.OLrzqt.setAdapter(activity);
            abstractC16290ehD.copydefault.setOKDSIndicator(false);
            abstractC16290ehD.copydefault.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(activity));
            eSW esw = new eSW(abstractC16290ehD.copydefault.copydefault(), abstractC16290ehD.OLrzqt, false, false, new eSW.Activity() { // from class: o.eXl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.eSW.Activity
                public final void KWHzl(TabLayout.Tab tab, int i) {
                    ActivityC15848eXn.copydefault(activity, tab, i);
                }
            });
            this.AEQbTJ = esw;
            esw.KWHzl();
            if (AYXKKw() != Long.MIN_VALUE) {
                int i = 0;
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.Long chainId = ((SupportPnlChainResponse) obj).getChainId();
                    long jAYXKKw = AYXKKw();
                    if (chainId != null && chainId.longValue() == jAYXKKw) {
                        abstractC16290ehD.OLrzqt.setCurrentItem(i);
                    }
                    i++;
                }
            }
            if (list.size() == 1) {
                abstractC16290ehD.copydefault.setVisibility(8);
            } else {
                abstractC16290ehD.copydefault.setVisibility(0);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "attachTabLayout error =" + e.getMessage() + " ");
        }
    }

    /* JADX INFO: renamed from: o.eXn$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Activity AEQbTJ;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public Application(Activity activity) {
            this.AEQbTJ = activity;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            android.view.View customView;
            int position = tab != null ? tab.getPosition() : 0;
            if (position < 0 || position >= this.AEQbTJ.EZpvd().size() || tab == null || (customView = tab.getCustomView()) == null) {
                return;
            }
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) customView.findViewById(C13754dXa.ActionBar.dhOYXF);
            android.widget.ImageView imageView = (android.widget.ImageView) customView.findViewById(C13754dXa.ActionBar.zAGdSp);
            android.widget.TextView textView = (android.widget.TextView) customView.findViewById(C13754dXa.ActionBar.ComponentActivity1);
            linearLayoutCompat.setBackgroundResource(C13754dXa.Activity.isConnected);
            imageView.setVisibility(0);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            android.view.View customView;
            if (tab == null || (customView = tab.getCustomView()) == null) {
                return;
            }
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) customView.findViewById(C13754dXa.ActionBar.dhOYXF);
            android.widget.ImageView imageView = (android.widget.ImageView) customView.findViewById(C13754dXa.ActionBar.zAGdSp);
            android.widget.TextView textView = (android.widget.TextView) customView.findViewById(C13754dXa.ActionBar.ComponentActivity1);
            linearLayoutCompat.setBackgroundResource(0);
            imageView.setVisibility(8);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.QwvEab));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dqq.loadFixSizeBorderImage$default(android.widget.ImageView, java.lang.String, int, float, float, int, boolean, int, java.lang.Object):void */
    public static final void copydefault(Activity activity, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i < 0 || i >= activity.EZpvd().size()) {
            return;
        }
        SupportPnlChainResponse supportPnlChainResponse = activity.EZpvd().get(i);
        C17121ewn c17121ewnCopydefault = C17121ewn.copydefault(android.view.LayoutInflater.from(tab.view.getContext()), null, false);
        Intrinsics.checkNotNullExpressionValue(c17121ewnCopydefault, "");
        ShapeableImageView shapeableImageView = c17121ewnCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String chainLogo = supportPnlChainResponse.getChainLogo();
        int i2 = C52761wXj.TaskDescription.aHXSQp;
        int i3 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c17121ewnCopydefault.EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, chainLogo, i2, 1.0f, 16.0f, C33070mpX.OLrzqt(i3, context), false, 32, null);
        c17121ewnCopydefault.OLrzqt.setText(supportPnlChainResponse.getChainName());
        tab.setCustomView(c17121ewnCopydefault.getRoot());
        ViewCompat.setPaddingRelative(tab.view, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0);
    }

    /* JADX INFO: renamed from: o.eXn$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Activity extends FragmentStateAdapter {
        public final java.util.List<SupportPnlChainResponse> KWHzl;
        public final /* synthetic */ ActivityC15848eXn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SupportPnlChainResponse> EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ActivityC15848eXn activityC15848eXn, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.List<SupportPnlChainResponse> list) {
            super(fragmentManager, activityC15848eXn.getLifecycle());
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = activityC15848eXn;
            this.KWHzl = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (i < 0 || i >= this.KWHzl.size()) {
                return new C15619ePa();
            }
            SupportPnlChainResponse supportPnlChainResponse = this.KWHzl.get(i);
            C15852eXr.ActionBar actionBar = C15852eXr.Companion;
            java.lang.String strGEmmrt = this.OLrzqt.gEmmrt();
            long jValueOf = C33129mqd.valueOf(supportPnlChainResponse.getChainId());
            java.lang.String chainName = supportPnlChainResponse.getChainName();
            if (chainName == null) {
                chainName = "";
            }
            return actionBar.copydefault(strGEmmrt, jValueOf, chainName, this.OLrzqt.KWHzl());
        }
    }

    @Override // o.eXJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eXJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eXJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eXJ, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
