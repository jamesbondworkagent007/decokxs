package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$2;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$3;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$4;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$5;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$6;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$7;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupViews$1$3$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C52761wXj;
import o.jFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jFP extends jFD {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.jFS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jFP.isConnected(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jFR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jFP.fetchVPNInfo(this.copydefault);
        }
    });
    public final InterfaceC56387yDm gEmmrt;
    public boolean valueOf;

    public jFP() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(TrackerManageAddressGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$special$$inlined$viewModels$default$3
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
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(TrackerManageAddressGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jFP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.util.List<TrackerAddressGroupUIModel> list, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) jFP.class);
            intent.putExtra("group_params", i);
            intent.putParcelableArrayListExtra("group_list", new java.util.ArrayList<>(list));
            return intent;
        }
    }

    public final C23391hxO djBIcL() {
        return (C23391hxO) this.AhwBna.getValue();
    }

    public static final C23391hxO isConnected(jFP jfp) {
        return C23391hxO.AEQbTJ(jfp.getLayoutInflater());
    }

    /* JADX DEBUG: Possible override for method o.jFD.AhwBna()V */
    public final TrackerManageAddressGroupViewModel AhwBna() {
        return (TrackerManageAddressGroupViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractActivityC25766jFo, o.InterfaceC25770jFs
    public AbstractC25769jFr AYXKKw() {
        return (AbstractC25769jFr) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM fetchVPNInfo() {
        return (kMM) this.djBIcL.getValue();
    }

    public static final kMM fetchVPNInfo(final jFP jfp) {
        kMM kmm = new kMM();
        kmm.register(jFL.class, new jFB(new Function1() { // from class: o.jFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jFP.OLrzqt(this.EZpvd, (jFL) obj);
            }
        }, new Function1() { // from class: o.jFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jFP.AEQbTJ(this.AEQbTJ, (jFL) obj);
            }
        }));
        return kmm;
    }

    public static final Unit OLrzqt(jFP jfp, jFL jfl) {
        Intrinsics.checkNotNullParameter(jfl, "");
        jfp.AhwBna().copydefault(jfl.OLrzqt(), !jfl.AhwBna());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jFP jfp, jFL jfl) {
        Intrinsics.checkNotNullParameter(jfl, "");
        jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.MANAGE_ALERT_BUTTON);
        jfp.EZpvd(jfl);
        return Unit.INSTANCE;
    }

    @Override // o.jFD, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna().copydefault(C33129mqd.valueOf(java.lang.Integer.valueOf(getIntent().getIntExtra("group_params", 0))));
        AhwBna().valueOf();
        setContentView(djBIcL().getRoot());
        DbNXlk();
        values();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("group_results", true);
        setResult(-1, intent);
    }

    private final void DbNXlk() {
        C23391hxO c23391hxODjBIcL = djBIcL();
        android.widget.TextView textView = c23391hxODjBIcL.values;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this));
        c23391hxODjBIcL.isConnected.setLayoutManager(new LinearLayoutManager(this));
        c23391hxODjBIcL.isConnected.setAdapter(fetchVPNInfo());
        android.widget.LinearLayout linearLayout = c23391hxODjBIcL.fetchVPNInfo;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
        C52794wYp c52794wYp = c23391hxODjBIcL.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        android.widget.LinearLayout linearLayout2 = c23391hxODjBIcL.copydefault;
        linearLayout2.setOnClickListener(new ActionBar(linearLayout2, 1000L, this));
        android.widget.LinearLayout linearLayout3 = c23391hxODjBIcL.gEmmrt;
        linearLayout3.setOnClickListener(new Dialog(linearLayout3, 1000L, this));
        AppCompatImageView appCompatImageView = c23391hxODjBIcL.KWHzl;
        appCompatImageView.setOnClickListener(new Fragment(appCompatImageView, 1000L, this));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jFP KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jFP jfp) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = jfp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.valueOf();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jFP KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jFP jfp) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = jfp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.SELECT_ALL);
                this.KWHzl.AhwBna().fIwbmz();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jFP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, jFP jfp) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = jfp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.UNFOLLOW);
                this.OLrzqt.gEmmrt();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ jFP EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, jFP jfp) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = jfp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.BACK);
                this.EZpvd.finish();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ jFP AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, jFP jfp) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = jfp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                jFI.Activity activity = jFI.Companion;
                java.util.List<TrackerAddressGroupUIModel> value = this.AEQbTJ.AhwBna().KWHzl().getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
                for (TrackerAddressGroupUIModel trackerAddressGroupUIModel : value) {
                    arrayList.add(new C25780jGb(C33129mqd.valueOf(java.lang.Integer.valueOf(trackerAddressGroupUIModel.EZpvd())), jFN.OLrzqt(trackerAddressGroupUIModel, this.AEQbTJ)));
                }
                jFI jfiKWHzl = activity.KWHzl(arrayList, this.AEQbTJ.AhwBna().EZpvd());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                jfiKWHzl.show(supportFragmentManager);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ jFP KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jFP jfp) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = jfp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.KWHzl.AhwBna().DbNXlk().isEmpty()) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new TrackerManageAddressGroupActivity$setupViews$1$3$1(this.KWHzl, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        android.widget.LinearLayout linearLayout = djBIcL().fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        RecyclerView recyclerView = djBIcL().isConnected;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        ConstraintLayout constraintLayout = djBIcL().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        FragmentContainerView fragmentContainerView = djBIcL().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        fragmentContainerView.setVisibility(0);
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c31197lpV.EZpvd(supportFragmentManager, djBIcL().AYXKKw.getId(), jEV.Companion.EZpvd(), new Function0() { // from class: o.jFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jFP.DbNXlk(this.copydefault);
            }
        });
    }

    public static final androidx.fragment.app.Fragment DbNXlk(final jFP jfp) {
        return C25707jDj.Companion.copydefault(new Function1() { // from class: o.jFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jFP.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(jFP jfp, boolean z) {
        if (z) {
            AbstractC25769jFr.loadAddresses$default(jfp.AhwBna(), false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        android.widget.LinearLayout linearLayout = djBIcL().fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        RecyclerView recyclerView = djBIcL().isConnected;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(0);
        ConstraintLayout constraintLayout = djBIcL().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        FragmentContainerView fragmentContainerView = djBIcL().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        fragmentContainerView.setVisibility(8);
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerManageAddressGroupActivity$setupObservers$7(this, null), 3, null);
    }

    public final void EZpvd(int i) {
        if (i > 0) {
            djBIcL().fJNWhG.setText(C33069mpW.KWHzl(this, C23274hvD.Fragment.onReceive, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
            djBIcL().fJNWhG.setTextColor(getColor(C52761wXj.Activity.DQzvGN));
            djBIcL().fIwbmz.setImageTintList(android.content.res.ColorStateList.valueOf(getColor(C52761wXj.Activity.DQzvGN)));
        } else {
            djBIcL().fJNWhG.setText(getString(C23274hvD.Fragment.GqbzPL));
            djBIcL().fJNWhG.setTextColor(getColor(C52761wXj.Activity.UlJrfe));
            djBIcL().fIwbmz.setImageTintList(android.content.res.ColorStateList.valueOf(getColor(C52761wXj.Activity.UlJrfe)));
        }
    }

    public final void KWHzl(int i) {
        if (i > 0) {
            djBIcL().AkhnZx.setText(C33069mpW.KWHzl(this, C23274hvD.Fragment.Dff, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
            djBIcL().AkhnZx.setTextColor(getColor(C52761wXj.Activity.fdOvFl));
            djBIcL().valueOf.setImageTintList(android.content.res.ColorStateList.valueOf(getColor(C52761wXj.Activity.fdOvFl)));
        } else {
            djBIcL().AkhnZx.setText(getString(C23274hvD.Fragment.GiPPlLgiPPlL));
            djBIcL().AkhnZx.setTextColor(getColor(C52761wXj.Activity.UlJrfe));
            djBIcL().valueOf.setImageTintList(android.content.res.ColorStateList.valueOf(getColor(C52761wXj.Activity.UlJrfe)));
        }
    }

    public final void valueOf() {
        if (AhwBna().DbNXlk().isEmpty()) {
            return;
        }
        jFH jfhEZpvd = jFH.Companion.EZpvd();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        jfhEZpvd.show(supportFragmentManager);
    }

    /* JADX DEBUG: Possible override for method o.jFD.AEQbTJ()V */
    public final android.widget.LinearLayout AEQbTJ() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setPadding(0, C55298xhM.dp2px$default(16.0f, null, 1, null), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        wYK wyk = new wYK(this, null, 0, 6, null);
        wyk.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.jFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                jFP.copydefault(this.KWHzl, compoundButton, z);
            }
        });
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setText(getString(C23274hvD.Fragment.ICustomTabsCallbackStub));
        textView.setTextSize(12.0f);
        textView.setTextColor(getColor(C52761wXj.Activity.Dmq));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        layoutParams2.setMarginStart(8);
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(wyk);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static final void copydefault(jFP jfp, android.widget.CompoundButton compoundButton, boolean z) {
        jfp.valueOf = z;
    }

    public final void gEmmrt() {
        java.util.List<jFL> listDbNXlk = AhwBna().DbNXlk();
        if (listDbNXlk.isEmpty()) {
            return;
        }
        this.valueOf = false;
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(getString(C23274hvD.Fragment.asInterface));
        viewOnClickListenerC54939xaY.EZpvd(pTD.EZpvd(this, AhwBna().EZpvd() == -1 ? C23274hvD.FragmentManager.values : C23274hvD.FragmentManager.fJNWhG, listDbNXlk.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(listDbNXlk.size())))));
        if (AhwBna().EZpvd() != -1) {
            ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, AEQbTJ(), 0, 2, null);
        }
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.OcIXYQ, new View.OnClickListener() { // from class: o.jFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jFP.OLrzqt(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.ORxRYg, new View.OnClickListener() { // from class: o.jFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jFP.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(jFP jfp, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(jfp), null, null, new TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1(jfp, null), 3, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.jFD, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.jFD, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.jFD, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.jFD, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
