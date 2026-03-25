package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementActivity$setupObservers$1;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementActivity$setupObservers$2;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementViewModel;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C33625mzw;
import o.C52761wXj;
import o.jFP;
import o.xWO;
import o.xWS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jEV extends jEQ implements jEH {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final java.lang.String djBIcL = "address.management.recommend.tag";
    public final InterfaceC56387yDm AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jET
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jEV.fJNWhG(this.KWHzl);
        }
    });

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final void AEQbTJ(ActivityResult activityResult) {
    }

    public jEV() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(TrackerAddressManagementViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.jFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                jEV.AEQbTJ((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEV.isConnected(this.OLrzqt);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jEV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String EZpvd() {
            return jEV.djBIcL;
        }

        public final void KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) jEV.class));
        }
    }

    /* JADX DEBUG: Possible override for method o.jEQ.AhwBna()V */
    public final C23389hxM AhwBna() {
        return (C23389hxM) this.valueOf.getValue();
    }

    public static final C23389hxM fJNWhG(jEV jev) {
        return C23389hxM.OLrzqt(jev.getLayoutInflater());
    }

    public final TrackerAddressManagementViewModel DbNXlk() {
        return (TrackerAddressManagementViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractActivityC25766jFo, o.InterfaceC25770jFs
    public AbstractC25769jFr AYXKKw() {
        return DbNXlk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM ejfBZ() {
        return (kMM) this.AYXKKw.getValue();
    }

    public static final kMM isConnected(final jEV jev) {
        kMM kmm = new kMM();
        kmm.register(jEP.class, new jEL(new Function1() { // from class: o.jFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jEV.EZpvd(this.copydefault, (jEP) obj);
            }
        }, new Function1() { // from class: o.jFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jEV.AEQbTJ(this.AEQbTJ, (jEP) obj);
            }
        }));
        return kmm;
    }

    public static final Unit EZpvd(jEV jev, jEP jep) {
        Intrinsics.checkNotNullParameter(jep, "");
        jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.ADDRESS_INFO_CARD);
        jev.KWHzl(jep);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jEV jev, jEP jep) {
        Intrinsics.checkNotNullParameter(jep, "");
        jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.FOLLOWING_ALERT_BUTTON);
        jev.EZpvd(jep);
        return Unit.INSTANCE;
    }

    @Override // o.jEQ, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AhwBna().getRoot());
        iwGUEr();
        uzCIH();
        AkhnZx();
        values();
    }

    @Override // o.jEQ, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        DbNXlk().valueOf();
        DbNXlk().EZpvd(C33129mqd.AhwBna(java.lang.Long.valueOf(DbNXlk().EZpvd())));
    }

    private final void iwGUEr() {
        C23389hxM c23389hxMAhwBna = AhwBna();
        AhwBna().isConnected.setContentDescription("web3_dex_market_following_appbar_title_view");
        AhwBna().AhwBna.setContentDescription("web3_dex_market_tracker_following_top_bar_btn");
        AppCompatImageView appCompatImageView = c23389hxMAhwBna.EZpvd;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
        android.widget.TextView textView = c23389hxMAhwBna.AhwBna;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        c23389hxMAhwBna.DbNXlk.setLayoutManager(new LinearLayoutManager(this));
        c23389hxMAhwBna.DbNXlk.setAdapter(ejfBZ());
        c23389hxMAhwBna.AkhnZx.OLrzqt(new InterfaceC57903yrG() { // from class: o.jFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                jEV.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
        C52794wYp c52794wYp = c23389hxMAhwBna.AEQbTJ;
        c52794wYp.setOnClickListener(new Dialog(c52794wYp, 1000L, this));
        c23389hxMAhwBna.AYXKKw.KWHzl(new Function1() { // from class: o.jFg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jEV.EZpvd(this.OLrzqt, (android.content.Intent) obj);
            }
        });
        c23389hxMAhwBna.AYXKKw.AEQbTJ(new Function1() { // from class: o.jFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jEV.KWHzl(this.copydefault, (TrackerAddressGroupUIModel) obj);
            }
        });
    }

    public static final void KWHzl(jEV jev, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        jev.DbNXlk().KWHzl(false);
    }

    public static final Unit EZpvd(jEV jev, android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.MANAGE_ALL_GROUPS);
        jev.AhwBna.launch(intent);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(jEV jev, TrackerAddressGroupUIModel trackerAddressGroupUIModel) {
        Intrinsics.checkNotNullParameter(trackerAddressGroupUIModel, "");
        if (trackerAddressGroupUIModel.EZpvd() > 0) {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.GROUP_CUSTOM);
        } else {
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.GROUP_ALL);
        }
        jev.DbNXlk().EZpvd(trackerAddressGroupUIModel.EZpvd());
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        OKAlertBanner oKAlertBanner = AhwBna().OLrzqt;
        Intrinsics.copydefault(oKAlertBanner);
        oKAlertBanner.setVisibility(z ? 0 : 8);
        oKAlertBanner.setStyle(0);
        oKAlertBanner.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.sJqpAA));
        oKAlertBanner.gEmmrt().setVisibility(0);
        oKAlertBanner.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim));
        android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
        imageViewOLrzqt.setOnClickListener(new PendingIntent(imageViewOLrzqt, 1000L, this));
        C52794wYp c52794wYpAEQbTJ = oKAlertBanner.AEQbTJ();
        c52794wYpAEQbTJ.setOnClickListener(new Fragment(c52794wYpAEQbTJ, 1000L, this));
        if (z) {
            return;
        }
        djBIcL();
    }

    public static final class FragmentManager implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            jEV.this.DbNXlk().gEmmrt();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ jEV KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jEV jev) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = jev;
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
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.MANAGEMENT);
                jFP.Activity activity = jFP.Companion;
                jEV jev = this.KWHzl;
                this.KWHzl.AhwBna.launch(activity.OLrzqt(jev, jev.DbNXlk().KWHzl().getValue(), (int) this.KWHzl.DbNXlk().EZpvd()));
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ jEV AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, jEV jev) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = jev;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.ADD_ADDRESS);
                this.AEQbTJ.fetchVPNInfo();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jEV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, jEV jev) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = jev;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                jEV jev = this.OLrzqt;
                jev.EZpvd(jev.new FragmentManager());
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ jEV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, jEV jev) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = jev;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.DbNXlk().djBIcL();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ jEV AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, jEV jev) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = jev;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna().AuCTel.setSortSelf(true);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ jEV KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jEV jev) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = jev;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.BACK);
                this.KWHzl.finish();
            }
        }
    }

    public final void djBIcL() {
        C33625mzw.OLrzqt().AEQbTJ(this, new C33625mzw.StateListAnimator() { // from class: o.jEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33625mzw.StateListAnimator
            public final void KWHzl(boolean z) {
                jEV.KWHzl(this.OLrzqt, z);
            }
        });
    }

    public static final void KWHzl(final jEV jev, boolean z) {
        OKAlertBanner oKAlertBanner = jev.AhwBna().OLrzqt;
        if (z) {
            Intrinsics.copydefault(oKAlertBanner);
            oKAlertBanner.setVisibility(8);
            return;
        }
        oKAlertBanner.setStyle(-1);
        Intrinsics.copydefault(oKAlertBanner);
        oKAlertBanner.setVisibility(0);
        oKAlertBanner.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.UnZVfqExternalSyntheticApiModelOutline0));
        oKAlertBanner.gEmmrt().setVisibility(8);
        oKAlertBanner.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.RZOtbZ));
        oKAlertBanner.setPrimaryAction(C33070mpX.AYXKKw(C23274hvD.Fragment.m), new Function0() { // from class: o.jEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEV.AuCTel(this.copydefault);
            }
        });
    }

    public static final Unit AuCTel(jEV jev) {
        C33625mzw.OLrzqt().EZpvd(jev);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<TrackerAddressGroupUIModel> list) {
        java.lang.Object next;
        if (list.isEmpty()) {
            return;
        }
        AhwBna().AYXKKw.setQuickPickOptions(list);
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TrackerAddressGroupUIModel) next).djBIcL()) {
                    break;
                }
            }
        }
        TrackerAddressGroupUIModel trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) next;
        if (trackerAddressGroupUIModel == null) {
            trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        }
        AhwBna().AYXKKw.setSelection(trackerAddressGroupUIModel);
        DbNXlk().EZpvd(trackerAddressGroupUIModel.EZpvd());
    }

    private final void uzCIH() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerAddressManagementActivity$setupObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrackerAddressManagementActivity$setupObservers$2(this, null), 3, null);
    }

    public final void AkhnZx() {
        OKSortTextView oKSortTextView = AhwBna().AuCTel;
        oKSortTextView.setOnClickListener(new StateListAnimator(oKSortTextView, 1000L, this));
        AhwBna().AuCTel.setOnSortTypeChangeListener(new Function2() { // from class: o.jFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jEV.KWHzl(this.KWHzl, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
    }

    public static final Unit KWHzl(jEV jev, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        int i = Activity.OLrzqt[sortType.ordinal()];
        if (i == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(AddressTrackerSortType.TrackedTime, java.lang.Boolean.FALSE);
        } else if (i == 2) {
            pairOLrzqt = C56390yDp.OLrzqt(AddressTrackerSortType.SevenDayPnl, java.lang.Boolean.TRUE);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(AddressTrackerSortType.SevenDayPnl, java.lang.Boolean.FALSE);
        }
        jev.DbNXlk().copydefault((AddressTrackerSortType) pairOLrzqt.component1(), ((java.lang.Boolean) pairOLrzqt.component2()).booleanValue(), true);
        return Unit.INSTANCE;
    }

    public final void values() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.jFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jEV.KWHzl(this.AEQbTJ, (xXO) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.jFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                jEV.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(jEV jev, xXO xxo) {
        jev.DbNXlk().valueOf();
        return Unit.INSTANCE;
    }

    public final void KWHzl(jEP jep) {
        xWS xws = (xWS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWS.class));
        if (xws != null) {
            xWS.Application.routeProfileAssetPage$default(xws, this, jep.KWHzl(), 0L, 4, null);
        }
    }

    public final void fetchVPNInfo() {
        jFF jffOLrzqt = jFF.Companion.OLrzqt();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        jffOLrzqt.show(supportFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFieldNames() {
        FragmentContainerView fragmentContainerView = AhwBna().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        fragmentContainerView.setVisibility(0);
        C52794wYp c52794wYp = AhwBna().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(8);
        android.widget.TextView textView = AhwBna().AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.LinearLayout linearLayout = AhwBna().copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c31197lpV.EZpvd(supportFragmentManager, AhwBna().gEmmrt.getId(), djBIcL, new Function0() { // from class: o.jFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEV.ejfBZ(this.OLrzqt);
            }
        });
    }

    public static final androidx.fragment.app.Fragment ejfBZ(final jEV jev) {
        return C25707jDj.Companion.copydefault(new Function1() { // from class: o.jEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jEV.EZpvd(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(jEV jev, boolean z) {
        if (z) {
            AbstractC25769jFr.loadAddresses$default(jev.DbNXlk(), false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        C55173xeu c55173xeu = AhwBna().valueOf;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.ActivityResultKt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = c55173xeu.getContext().getString(C23274hvD.Fragment.UscePu);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        java.lang.String string3 = c55173xeu.getContext().getString(C23274hvD.Fragment.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jEV.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(jEV jev, android.view.View view) {
        AbstractC25769jFr.loadAddresses$default(jev.DbNXlk(), false, 1, null);
    }

    public final void fIwbmz() {
        C55173xeu c55173xeu = AhwBna().valueOf;
        Intrinsics.copydefault(c55173xeu);
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(6);
        java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.ActivityResultCallerLauncher);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = c55173xeu.getContext().getString(C23274hvD.Fragment.registerForActivityResultlambda0);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        java.lang.String string3 = c55173xeu.getContext().getString(C23274hvD.Fragment.apLTlu);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jEV.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    public static final void AEQbTJ(jEV jev, android.view.View view) {
        xWO xwo = (xWO) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWO.class));
        if (xwo != null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = jev.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            xWO.ActionBar.showConnectWalletDialog$default(xwo, supportFragmentManager, jev.new LoaderManager(), (java.util.List) null, (java.util.List) null, (InterfaceC54856xXw) null, 28, (java.lang.Object) null);
        }
    }

    public static final class LoaderManager implements InterfaceC54859xXz {
        public LoaderManager() {
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            jEV.this.DbNXlk().valueOf();
        }
    }

    public final void isConnected() {
        FragmentContainerView fragmentContainerView = AhwBna().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        fragmentContainerView.setVisibility(8);
        C52794wYp c52794wYp = AhwBna().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
    }

    @Override // o.jEH
    public void AEQbTJ(final int i, @NotNull final java.util.List<C25642jAz> list) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(new Function0() { // from class: o.jFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEV.KWHzl(this.KWHzl, i, list);
            }
        });
    }

    public static final Unit KWHzl(final jEV jev, int i, java.util.List list) {
        jev.DbNXlk().AEQbTJ(i, list, new Function0() { // from class: o.jEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEV.fARcdN(this.copydefault);
            }
        }, new Function0() { // from class: o.jEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jEV.valueOf();
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(jEV jev) {
        jev.DbNXlk().KWHzl(false);
        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.asBinder), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.ICustomTabsCallbackStubProxy), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.jEQ, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.jEQ, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.jEQ, o.AbstractActivityC25766jFo, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
