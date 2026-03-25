package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_setting.PlanetProfileSettingActivity$handleXAccountClick$1;
import com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$1;
import com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$2;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.data.OrbitSettingUpgradeCardType;
import com.okinc.planet.manager.OrbitStatus;
import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C47501trL;
import o.InterfaceC46130tIy;
import o.InterfaceC47502trM;
import o.tHW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC46100tHv extends AbstractActivityC47505trP implements InterfaceC47502trM<C46231tMr> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public androidx.fragment.app.Fragment AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public C46231tMr copydefault;
    public final ActivityResultLauncher<Unit> djBIcL;
    public boolean valueOf;
    public final C46099tHu AYXKKw = new C46099tHu();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tHA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46100tHv.AkhnZx(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.tHB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC46100tHv.DbNXlk(this.EZpvd);
        }
    });
    public java.lang.String KWHzl = "PlanetProfileSettingActivity";

    /* JADX INFO: renamed from: o.tHv$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrbitSettingUpgradeCardType.values().length];
            try {
                iArr[OrbitSettingUpgradeCardType.NON_ORBITER_TO_ORBITER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrbitSettingUpgradeCardType.ORBITER_TO_ORBITER_PLUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrbitSettingUpgradeCardType.ORBITER_PLUS_RECALL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    public void EZpvd(C46231tMr c46231tMr) {
        this.copydefault = c46231tMr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C46231tMr OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return "PlanetProfileSettingActivity";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public ActivityC46100tHv() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(tHW.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_setting.PlanetProfileSettingActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.tHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC46100tHv.values(this.EZpvd);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_setting.PlanetProfileSettingActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.tHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC46100tHv.AEQbTJ(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.djBIcL = tKR.KWHzl.copydefault(this, new Function0() { // from class: o.tHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC46100tHv.isConnected(this.copydefault);
            }
        });
    }

    public void AEQbTJ(@NotNull Function1<? super C46231tMr, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    public final tHW EZpvd() {
        return (tHW) this.AkhnZx.getValue();
    }

    public static final tHW copydefault(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new tHW(savedStateHandle, null, null, 6, null);
    }

    public static final ViewModelProvider.Factory values(ActivityC46100tHv activityC46100tHv) {
        android.content.Intent intent = activityC46100tHv.getIntent();
        return new tRJ(activityC46100tHv, intent != null ? intent.getExtras() : null, new Function1() { // from class: o.tHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46100tHv.copydefault((SavedStateHandle) obj);
            }
        });
    }

    public final C46106tIa copydefault() {
        return (C46106tIa) this.AEQbTJ.getValue();
    }

    public static final C46106tIa AkhnZx(final ActivityC46100tHv activityC46100tHv) {
        return new C46106tIa(new Function1() { // from class: o.tHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46100tHv.OLrzqt(this.KWHzl, (InterfaceC46130tIy) obj);
            }
        }, new Function1() { // from class: o.tHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46100tHv.AEQbTJ(this.OLrzqt, (InterfaceC46130tIy.Activity) obj);
            }
        }, activityC46100tHv.getSupportFragmentManager());
    }

    public static final Unit OLrzqt(ActivityC46100tHv activityC46100tHv, InterfaceC46130tIy interfaceC46130tIy) {
        Intrinsics.checkNotNullParameter(interfaceC46130tIy, "");
        if (interfaceC46130tIy instanceof InterfaceC46130tIy.TaskDescription) {
            activityC46100tHv.KWHzl(((InterfaceC46130tIy.TaskDescription) interfaceC46130tIy).gEmmrt());
        } else if (interfaceC46130tIy instanceof InterfaceC46130tIy.LoaderManager) {
            activityC46100tHv.EZpvd(((InterfaceC46130tIy.LoaderManager) interfaceC46130tIy).AhwBna());
        } else {
            activityC46100tHv.EZpvd().KWHzl(new tHW.TaskDescription.C0958TaskDescription(interfaceC46130tIy));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC46100tHv activityC46100tHv, InterfaceC46130tIy.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activityC46100tHv.EZpvd().KWHzl(new tHW.TaskDescription.C0958TaskDescription(activity));
        return Unit.INSTANCE;
    }

    private final ConcatAdapter djBIcL() {
        return (ConcatAdapter) this.gEmmrt.getValue();
    }

    public static final ConcatAdapter DbNXlk(ActivityC46100tHv activityC46100tHv) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{activityC46100tHv.AYXKKw, activityC46100tHv.copydefault()});
    }

    /* JADX INFO: renamed from: o.tHv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tHv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ android.content.Intent newIntent$OKPlanet_ok_feature_planet_impl$default(Activity activity, android.content.Context context, PlanetProfileSettingsActions planetProfileSettingsActions, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                planetProfileSettingsActions = null;
            }
            return activity.copydefault(context, planetProfileSettingsActions);
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, PlanetProfileSettingsActions planetProfileSettingsActions) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC46100tHv.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("community_user_center_user_setting_action", planetProfileSettingsActions)));
            return intent;
        }
    }

    public static final void AEQbTJ(ActivityC46100tHv activityC46100tHv, ActivityResult activityResult) {
        C46231tMr c46231tMrOLrzqt;
        ConstraintLayout constraintLayoutOLrzqt;
        if (activityResult.getResultCode() != 1281 || (c46231tMrOLrzqt = activityC46100tHv.OLrzqt()) == null || (constraintLayoutOLrzqt = c46231tMrOLrzqt.getRoot()) == null) {
            return;
        }
        tIE.Companion.KWHzl(constraintLayoutOLrzqt);
    }

    public static final Unit isConnected(ActivityC46100tHv activityC46100tHv) {
        activityC46100tHv.startActivity(new android.content.Intent(activityC46100tHv, (java.lang.Class<?>) ActivityC46157tJy.class));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46231tMr c46231tMrOLrzqt = C46231tMr.OLrzqt(getLayoutInflater());
        setContentView(c46231tMrOLrzqt.getRoot());
        EZpvd(c46231tMrOLrzqt);
        AEQbTJ(new Function1() { // from class: o.tHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46100tHv.EZpvd(this.EZpvd, (C46231tMr) obj);
            }
        });
        AEQbTJ();
        AhwBna();
    }

    public static final Unit EZpvd(ActivityC46100tHv activityC46100tHv, C46231tMr c46231tMr) {
        Intrinsics.checkNotNullParameter(c46231tMr, "");
        c46231tMr.copydefault.setAdapter(activityC46100tHv.djBIcL());
        c46231tMr.copydefault.setItemAnimator(null);
        return Unit.INSTANCE;
    }

    private final void AhwBna() {
        AEQbTJ(new Function1() { // from class: o.tHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46100tHv.copydefault(this.EZpvd, (C46231tMr) obj);
            }
        });
    }

    public static final Unit copydefault(final ActivityC46100tHv activityC46100tHv, final C46231tMr c46231tMr) {
        Intrinsics.checkNotNullParameter(c46231tMr, "");
        android.widget.ImageView backImage = c46231tMr.AEQbTJ.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c46231tMr.AEQbTJ.setBackListener(new View.OnClickListener() { // from class: o.tHE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46100tHv.OLrzqt(this.EZpvd, view);
                }
            });
            c46231tMr.AEQbTJ.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.AuCTel));
            c46231tMr.EZpvd.post(new java.lang.Runnable() { // from class: o.tHI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC46100tHv.djBIcL(this.AEQbTJ, c46231tMr);
                }
            });
            android.widget.FrameLayout frameLayout = c46231tMr.OLrzqt;
            frameLayout.setOnClickListener(new Application(frameLayout, 300L, frameLayout, activityC46100tHv));
            return Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void OLrzqt(ActivityC46100tHv activityC46100tHv, android.view.View view) {
        activityC46100tHv.finish();
    }

    public static final void djBIcL(ActivityC46100tHv activityC46100tHv, C46231tMr c46231tMr) {
        int iGEmmrt = C33570myu.gEmmrt(activityC46100tHv) / 2;
        ViewGroup.LayoutParams layoutParams = c46231tMr.EZpvd.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = iGEmmrt;
            c46231tMr.EZpvd.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: o.tHv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC46100tHv KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.view.View view2, ActivityC46100tHv activityC46100tHv) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = view2;
            this.KWHzl = activityC46100tHv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ((tWL) C43251rlk.copydefault(tWL.class)).AEQbTJ(this.KWHzl);
            }
        }
    }

    public final void EZpvd(final OrbitStatus orbitStatus) {
        AEQbTJ(new Function1() { // from class: o.tHM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC46100tHv.copydefault(orbitStatus, (C46231tMr) obj);
            }
        });
    }

    public static final Unit copydefault(OrbitStatus orbitStatus, C46231tMr c46231tMr) {
        Intrinsics.checkNotNullParameter(c46231tMr, "");
        boolean z = orbitStatus == OrbitStatus.NORMAL;
        android.widget.FrameLayout frameLayout = c46231tMr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EZpvd().KWHzl(tHW.TaskDescription.Application.copydefault);
    }

    public final void AEQbTJ() {
        SharedFlow<tHW.ActionBar> sharedFlowGEmmrt = EZpvd().gEmmrt();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C46373tRy.AEQbTJ(sharedFlowGEmmrt, this, state, new PlanetProfileSettingActivity$setUpViewModel$1(this, null));
        C46373tRy.AEQbTJ(EZpvd().copydefault(), this, state, new PlanetProfileSettingActivity$setUpViewModel$2(this, null));
    }

    public final void EZpvd(CurveResetInfo curveResetInfo) {
        this.OLrzqt.launch(tIE.Companion.copydefault(this, C33129mqd.valueOf(curveResetInfo != null ? curveResetInfo.OLrzqt() : null)));
    }

    public final void KWHzl(AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet) {
        pUU.KWHzl(getTAG(), "onAffiliateBindClick, max num: " + (affiliatePartnerBeanForPlanet != null ? java.lang.Integer.valueOf(affiliatePartnerBeanForPlanet.getMaxNum()) : null) + ", currentNum: " + (affiliatePartnerBeanForPlanet != null ? java.lang.Integer.valueOf(affiliatePartnerBeanForPlanet.getCurrentNum()) : null));
        ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).AEQbTJ(this, affiliatePartnerBeanForPlanet);
        C46386tSk.copydefault.fIwbmz(tKU.Companion.KWHzl().KWHzl());
    }

    public final void EZpvd(boolean z) {
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetProfileSettingActivity$handleXAccountClick$1(this, null), 3, null);
        } else {
            ActivityC46184tKy.Companion.AEQbTJ(this);
        }
    }

    public final void EZpvd(OrbitSettingUpgradeCardType orbitSettingUpgradeCardType) {
        int i = StateListAnimator.OLrzqt[orbitSettingUpgradeCardType.ordinal()];
        if (i == 1) {
            ((tWL) C43251rlk.copydefault(tWL.class)).OLrzqt(this, null, false, new Function1() { // from class: o.tHO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC46100tHv.EZpvd(this.KWHzl, (kotlin.Pair) obj);
                }
            });
            return;
        }
        if (i == 2) {
            C32866mlf.onEvent$default("Orbit_PersonalProfile_OrbiterPlusBanner_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            ((tWL) C43251rlk.copydefault(tWL.class)).KWHzl(this, new Function1() { // from class: o.tHK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC46100tHv.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ((tWL) C43251rlk.copydefault(tWL.class)).KWHzl(this, new Function1() { // from class: o.tHP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC46100tHv.gEmmrt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit EZpvd(ActivityC46100tHv activityC46100tHv, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            activityC46100tHv.finish();
            C46447tUr.KWHzl.KWHzl(activityC46100tHv, "", "", (java.lang.String) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC46100tHv activityC46100tHv, boolean z) {
        final ConstraintLayout constraintLayoutOLrzqt;
        if (z) {
            activityC46100tHv.EZpvd().KWHzl(tHW.TaskDescription.Application.copydefault);
            C46231tMr c46231tMrOLrzqt = activityC46100tHv.OLrzqt();
            if (c46231tMrOLrzqt != null && (constraintLayoutOLrzqt = c46231tMrOLrzqt.getRoot()) != null) {
                constraintLayoutOLrzqt.post(new java.lang.Runnable() { // from class: o.tHN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC46100tHv.EZpvd(constraintLayoutOLrzqt);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ConstraintLayout constraintLayout) {
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(constraintLayout, C33070mpX.AYXKKw(C47501trL.Fragment.DPHNDa));
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    public static final Unit gEmmrt(ActivityC46100tHv activityC46100tHv, boolean z) {
        if (z) {
            activityC46100tHv.EZpvd().KWHzl(tHW.TaskDescription.Application.copydefault);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
