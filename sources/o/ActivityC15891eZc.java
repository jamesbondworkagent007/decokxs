package o;

import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$initListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$initListener$2;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$initListener$3;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.eSW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15891eZc extends eXM {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public AbstractC16365eiZ AkhnZx;
    public AbstractC32996moC AuCTel;
    public boolean djBIcL;
    public java.lang.Integer fJNWhG;
    public AbstractC32996moC fetchVPNInfo;
    public eSW gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public DialogC55112xdm values;
    public long AhwBna = Long.MIN_VALUE;
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.eZd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15891eZc.ejfBZ();
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.eZf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15891eZc.AYXKKw();
        }
    });
    public int fIwbmz = 1;
    public int isConnected = 2;
    public boolean AYXKKw = true;

    /* JADX INFO: renamed from: o.eZc$ActionBar */
    public static final class ActionBar implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX INFO: renamed from: o.eZc$TaskDescription */
    public static final class TaskDescription implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    public ActivityC15891eZc() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(AddressProfileAssetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.eZc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eZc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.eZc$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startActivity$default(Application application, android.content.Context context, java.lang.String str, java.util.List list, long j, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                list = null;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                j = Long.MIN_VALUE;
            }
            application.AEQbTJ(context, str, list2, j);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.List<java.lang.Long> list, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15891eZc.class);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            intent.putExtra("chain_list", list != null ? CollectionsKt___CollectionsKt.AuCTel((java.util.Collection<java.lang.Long>) list) : null);
            intent.putExtra("chain_id", j);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String valueOf() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.util.List<java.lang.Long> fetchVPNInfo() {
        long[] longArrayExtra;
        java.util.List<java.lang.Long> listOLrzqt;
        android.content.Intent intent = getIntent();
        return (intent == null || (longArrayExtra = intent.getLongArrayExtra("chain_list")) == null || (listOLrzqt = yDV.OLrzqt(longArrayExtra)) == null) ? yDY.AhwBna() : listOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressProfileAssetViewModel gEmmrt() {
        return (AddressProfileAssetViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9773bbs> values() {
        return (java.util.List) this.ejfBZ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List ejfBZ() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9774bbt> DbNXlk() {
        return (java.util.List) this.DbNXlk.getValue();
    }

    public static final java.util.List AYXKKw() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
    }

    @Override // o.eXM, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16365eiZ abstractC16365eiZCopydefault = AbstractC16365eiZ.copydefault(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(abstractC16365eiZCopydefault, "");
        setContentView(abstractC16365eiZCopydefault.getRoot());
        this.AkhnZx = abstractC16365eiZCopydefault;
        C33516mxt.EZpvd(this);
        if (valueOf().length() == 0) {
            finish();
            return;
        }
        android.content.Intent intent = getIntent();
        this.AhwBna = intent != null ? intent.getLongExtra("chain_id", Long.MIN_VALUE) : Long.MIN_VALUE;
        isConnected();
        AkhnZx();
    }

    private final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfilePortfolioDetailsActivity$initListener$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfilePortfolioDetailsActivity$initListener$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfilePortfolioDetailsActivity$initListener$3(this, null), 3, null);
    }

    private final void AkhnZx() {
        final AbstractC16365eiZ abstractC16365eiZ = this.AkhnZx;
        if (abstractC16365eiZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16365eiZ = null;
        }
        C33537myN c33537myN = abstractC16365eiZ.AEQbTJ;
        c33537myN.setTitleTypeface("harmony_sans_bold.ttf");
        c33537myN.setTitleSize(18.0f);
        c33537myN.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrawableRes));
        abstractC16365eiZ.DbNXlk.setTypeface(ResourcesCompat.getFont(this, C52761wXj.Dialog.EZpvd));
        abstractC16365eiZ.DbNXlk.setGravity(C55296xhK.OLrzqt(this) ? 8388613 : 8388611);
        abstractC16365eiZ.DbNXlk.setCharacterLists(C57862yqS.copydefault());
        abstractC16365eiZ.values.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        abstractC16365eiZ.AkhnZx.OLrzqt(new InterfaceC57903yrG() { // from class: o.eZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC15891eZc.OLrzqt(this.AEQbTJ, abstractC16365eiZ, interfaceC57934yrl);
            }
        });
        AEQbTJ(abstractC16365eiZ);
        fJNWhG();
    }

    public static final void OLrzqt(ActivityC15891eZc activityC15891eZc, AbstractC16365eiZ abstractC16365eiZ, InterfaceC57934yrl interfaceC57934yrl) {
        java.util.List<java.lang.Long> listEZpvd;
        AbstractC32996moC abstractC32996moC;
        AbstractC32996moC abstractC32996moC2;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        long j = activityC15891eZc.AhwBna;
        if (j == Long.MIN_VALUE) {
            listEZpvd = activityC15891eZc.fetchVPNInfo();
        } else {
            listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(j));
        }
        AddressProfileAssetViewModel.loadAddressAssetInformation$default(activityC15891eZc.gEmmrt(), activityC15891eZc.valueOf(), listEZpvd, false, 0, activityC15891eZc.AhwBna != Long.MIN_VALUE, true, 12, null);
        AbstractC32996moC abstractC32996moC3 = activityC15891eZc.AuCTel;
        if (abstractC32996moC3 != null && abstractC32996moC3.isAdded() && (abstractC32996moC2 = activityC15891eZc.AuCTel) != null) {
            abstractC32996moC2.onRefresh(java.lang.Boolean.valueOf(activityC15891eZc.fIwbmz == abstractC16365eiZ.AYXKKw.getCurrentItem()), new TaskDescription());
        }
        AbstractC32996moC abstractC32996moC4 = activityC15891eZc.fetchVPNInfo;
        if ((abstractC32996moC4 != null ? java.lang.Boolean.valueOf(abstractC32996moC4.isAdded()) : null) != null || (abstractC32996moC = activityC15891eZc.fetchVPNInfo) == null) {
            return;
        }
        abstractC32996moC.onRefresh(java.lang.Boolean.valueOf(activityC15891eZc.isConnected == C15838eXd.KWHzl.EZpvd("portfolio")), new ActionBar());
    }

    private final void fIwbmz() {
        if (this.values == null) {
            this.values = new DialogC55112xdm(this, C13754dXa.LoaderManager.isConnected);
        }
        if (isFinishing() || isDestroyed()) {
            return;
        }
        try {
            DialogC55112xdm dialogC55112xdm = this.values;
            if (dialogC55112xdm != null) {
                dialogC55112xdm.show();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "error message:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        DialogC55112xdm dialogC55112xdm = this.values;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
    }

    public final void AEQbTJ(AbstractC16365eiZ abstractC16365eiZ) {
        try {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            final Activity activity = new Activity(this, supportFragmentManager, null, 2, null);
            abstractC16365eiZ.AYXKKw.setOffscreenPageLimit(activity.KWHzl().size());
            abstractC16365eiZ.AYXKKw.setAdapter(activity);
            eSW esw = new eSW(abstractC16365eiZ.copydefault.AYXKKw(), abstractC16365eiZ.AYXKKw, true, false, new eSW.Activity() { // from class: o.eZe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.eSW.Activity
                public final void KWHzl(TabLayout.Tab tab, int i) {
                    ActivityC15891eZc.EZpvd(activity, this, tab, i);
                }
            });
            this.gEmmrt = esw;
            esw.KWHzl();
            abstractC16365eiZ.copydefault.copydefault(new StateListAnimator(activity));
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "attachTabLayout error =" + e.getMessage() + " ");
        }
    }

    public static final void EZpvd(Activity activity, ActivityC15891eZc activityC15891eZc, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i < 0 || i >= activity.AEQbTJ().size()) {
            return;
        }
        tab.setText(activityC15891eZc.getString(activity.AEQbTJ().get(i).intValue()));
    }

    /* JADX INFO: renamed from: o.eZc$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Activity EZpvd;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(Activity activity) {
            this.EZpvd = activity;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String str;
            int position = tab != null ? tab.getPosition() : 0;
            if (position < 0 || position >= this.EZpvd.KWHzl().size()) {
                return;
            }
            java.lang.String str2 = this.EZpvd.KWHzl().get(tab != null ? tab.getPosition() : 0);
            int iHashCode = str2.hashCode();
            if (iHashCode == -795192327) {
                str = "wallet";
            } else if (iHashCode == 1121781064) {
                str = "portfolio";
            } else if (iHashCode != 1635687287) {
                return;
            } else {
                str = "collectibles";
            }
            str2.equals(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        fIwbmz();
        if (this.AhwBna == Long.MIN_VALUE) {
            AddressProfileAssetViewModel.loadAddressAssetInformation$default(gEmmrt(), valueOf(), fetchVPNInfo(), false, 0, false, false, 60, null);
        } else {
            AddressProfileAssetViewModel.loadAddressAssetInformation$default(gEmmrt(), valueOf(), C56402yEa.EZpvd(java.lang.Long.valueOf(this.AhwBna)), false, 0, true, false, 44, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        int length = str.length();
        float fCopydefault = C56548yJl.copydefault(2.0f - (length * 0.05f), 0.1f);
        int iOLrzqt = C55302xhQ.OLrzqt(this);
        int iCopydefault = C55298xhM.copydefault(48.0f, (android.content.Context) this);
        AbstractC16365eiZ abstractC16365eiZ = this.AkhnZx;
        if (abstractC16365eiZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16365eiZ = null;
        }
        android.text.TextPaint textPaint = new android.text.TextPaint(abstractC16365eiZ.DbNXlk.uzCIH);
        float f = 36.0f;
        textPaint.setTextSize(C55298xhM.gEmmrt(36.0f, this));
        float fMeasureText = textPaint.measureText(str);
        while (fMeasureText > iOLrzqt - iCopydefault && f >= 14.0f) {
            f -= fCopydefault;
            textPaint.setTextSize(C55298xhM.gEmmrt(f, this));
            fMeasureText = textPaint.measureText(str);
        }
        java.lang.Integer num = this.fJNWhG;
        if (num == null || num == null || num.intValue() != length) {
            this.fJNWhG = java.lang.Integer.valueOf(length);
            this.AYXKKw = true;
        }
        AbstractC16365eiZ abstractC16365eiZ2 = this.AkhnZx;
        if (abstractC16365eiZ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16365eiZ2 = null;
        }
        abstractC16365eiZ2.DbNXlk.setTextSize(C55298xhM.gEmmrt(f, this));
        AbstractC16365eiZ abstractC16365eiZ3 = this.AkhnZx;
        if (abstractC16365eiZ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16365eiZ3 = null;
        }
        abstractC16365eiZ3.DbNXlk.requestLayout();
        AbstractC16365eiZ abstractC16365eiZ4 = this.AkhnZx;
        if (abstractC16365eiZ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16365eiZ4 = null;
        }
        abstractC16365eiZ4.DbNXlk.setText(str, (this.AYXKKw || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "*****", false, 2, (java.lang.Object) null)) ? false : true);
    }

    /* JADX INFO: renamed from: o.eZc$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Activity extends FragmentStateAdapter {
        public final /* synthetic */ ActivityC15891eZc KWHzl;
        public final java.util.List<java.lang.Integer> OLrzqt;
        public final java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 o.eZc)
  (r2v0 androidx.fragment.app.FragmentManager)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000e: INVOKE 
  (wrap:java.lang.String[]:0x000a: FILLED_NEW_ARRAY ("wallet"), ("portfolio"), ("collectibles") A[WRAPPED] elemType: java.lang.String)
 STATIC call: o.yDY.copydefault(java.lang.Object[]):java.util.ArrayList A[MD:<T>:(T[]):java.util.ArrayList<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:359)) : (r3v0 java.util.ArrayList))
 A[MD:(o.eZc, androidx.fragment.app.FragmentManager, java.util.ArrayList<java.lang.String>):void (m)] (LINE:357) call: o.eZc.Activity.<init>(o.eZc, androidx.fragment.app.FragmentManager, java.util.ArrayList):void type: THIS */
        public /* synthetic */ Activity(ActivityC15891eZc activityC15891eZc, androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(activityC15891eZc, fragmentManager, (i & 2) != 0 ? yDY.copydefault("wallet", "portfolio", "collectibles") : arrayList);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ActivityC15891eZc activityC15891eZc, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList<java.lang.String> arrayList) {
            super(fragmentManager, activityC15891eZc.getLifecycle());
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.KWHzl = activityC15891eZc;
            C15838eXd c15838eXd = C15838eXd.KWHzl;
            this.copydefault = c15838eXd.OLrzqt(arrayList);
            this.OLrzqt = c15838eXd.copydefault(arrayList);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            AbstractC32996moC c15619ePa;
            InterfaceC9774bbt interfaceC9774bbt;
            InterfaceC9773bbs interfaceC9773bbs;
            java.lang.String str = this.copydefault.get(i);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "collectibles")) {
                java.util.List listValues = this.KWHzl.values();
                androidx.fragment.app.Fragment fragmentAEQbTJ = (listValues == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listValues)) == null) ? null : interfaceC9773bbs.AEQbTJ(this.KWHzl.valueOf());
                c15619ePa = fragmentAEQbTJ instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentAEQbTJ : null;
                if (c15619ePa == null) {
                    c15619ePa = new C15619ePa();
                    pUU.copydefault(this.KWHzl.getTAG(), "getNFTAssetEntryFragment error.");
                }
                this.KWHzl.AuCTel = c15619ePa;
                return c15619ePa;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "portfolio")) {
                java.util.List listDbNXlk = this.KWHzl.DbNXlk();
                androidx.fragment.app.Fragment fragmentKWHzl = (listDbNXlk == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listDbNXlk)) == null) ? null : interfaceC9774bbt.KWHzl(this.KWHzl.valueOf(), null);
                c15619ePa = fragmentKWHzl instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentKWHzl : null;
                if (c15619ePa == null) {
                    C15619ePa c15619ePa2 = new C15619ePa();
                    pUU.copydefault(this.KWHzl.getTAG(), "getInvestPlatformListFragment error.");
                    c15619ePa = c15619ePa2;
                }
                this.KWHzl.fetchVPNInfo = c15619ePa;
                return c15619ePa;
            }
            return C15840eXf.Companion.OLrzqt(this.KWHzl.valueOf());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(eWT ewt, long j) {
        xWV xwv;
        BigDecimal bigDecimalAEQbTJ = ewt.AEQbTJ();
        if (bigDecimalAEQbTJ == null) {
            bigDecimalAEQbTJ = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalAEQbTJ;
        BigDecimal bigDecimalKWHzl = ewt.KWHzl();
        if (bigDecimalKWHzl == null) {
            bigDecimalKWHzl = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalOLrzqt = ewt.OLrzqt();
        if (bigDecimalOLrzqt == null) {
            bigDecimalOLrzqt = BigDecimal.ZERO;
        }
        C14687dqE c14687dqE = C14687dqE.OLrzqt;
        boolean z = !c14687dqE.isConnected();
        boolean z2 = (c14687dqE.AkhnZx() || (xwv = (xWV) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWV.class))) == null || !xwv.copydefault()) ? false : true;
        AbstractC16365eiZ abstractC16365eiZ = this.AkhnZx;
        if (abstractC16365eiZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16365eiZ = null;
        }
        C14697dqO c14697dqO = abstractC16365eiZ.OLrzqt;
        if (j == Long.MIN_VALUE || j >= 0) {
            Intrinsics.copydefault(bigDecimal);
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
            Intrinsics.copydefault(bigDecimalKWHzl);
            java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
            Intrinsics.copydefault(bigDecimalOLrzqt);
            c14697dqO.setData(strConvertToString$default, strConvertToString$default2, z, C54862xYb.convertToString$default(bigDecimalOLrzqt, false, null, null, 7, null), z2);
            return;
        }
        c14697dqO.setData("0", "0", z, "0", z2);
    }

    @Override // o.eXM, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eXM, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eXM, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eXM, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
