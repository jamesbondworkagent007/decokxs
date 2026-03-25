package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.ValidationStatus;
import com.okinc.planet.biz_content.input.data.InputPageState;
import com.okinc.planet.biz_content.input.data.SerializableInputTextState;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$checkAndRestorePageState$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$handlePublishClick$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$2;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$3;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$4;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$5;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$6;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$7;
import com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$8;
import com.okinc.planet.biz_content.publisher.ToolFragmentType;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import com.okinc.planet.domain.remote.dto.PublishResponse;
import com.okinc.planet.domain.remote.dto.SaveDraftResponse;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC43419rot;
import o.C32113mPz;
import o.C47501trL;
import o.C47507trR;
import o.C47556tsO;
import o.C52761wXj;
import o.C55284xgz;
import o.InterfaceC43033rhe;
import o.InterfaceC47502trM;
import o.InterfaceC47543tsB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC47702tvB extends AbstractActivityC47505trP implements InterfaceC47502trM<AbstractC46258tNr> {
    public boolean AYXKKw;
    public C47576tsi AhwBna;
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.tvz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC47702tvB.KWHzl();
        }
    });
    public C52794wYp DbNXlk;
    public boolean EZpvd;
    public AbstractC46258tNr KWHzl;
    public C47754twA OLrzqt;
    public android.widget.TextView copydefault;
    public boolean djBIcL;
    public C47747tvu fetchVPNInfo;
    public boolean gEmmrt;
    public android.view.View isConnected;
    public boolean valueOf;
    public final InterfaceC56387yDm values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.tvB$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ToolFragmentType.values().length];
            try {
                iArr[ToolFragmentType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ToolFragmentType.IMAGE_SELECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolFragmentType.TOPIC_LIST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ToolFragmentType.TOKEN_LIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ToolFragmentType.REPLY_TEST.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ToolFragmentType.PLUGIN_LIST.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(AbstractC46258tNr abstractC46258tNr) {
        this.KWHzl = abstractC46258tNr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public AbstractC46258tNr OLrzqt() {
        return this.KWHzl;
    }

    public ActivityC47702tvB() {
        final Function0 function0 = null;
        this.values = new ViewModelLazy(C56524yIo.AEQbTJ(C47793twn.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.tvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC47702tvB.AkhnZx(this.KWHzl);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$special$$inlined$viewModels$default$3
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

    public void EZpvd(@NotNull Function1<? super AbstractC46258tNr, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    /* JADX INFO: renamed from: o.tvB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tvB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull android.content.Context context, PlanetPublisherChannelId planetPublisherChannelId, java.util.Map<java.lang.String, ? extends java.lang.Object> map, android.os.Bundle bundle, boolean z, java.lang.String str) {
            java.lang.Object obj;
            java.lang.String value;
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC47702tvB.class);
            if (planetPublisherChannelId != null && (value = planetPublisherChannelId.getValue()) != null) {
                intent.putExtra("extra_channel_id", value);
            }
            if (map != null && (obj = map.get("channelData")) != null) {
                try {
                    java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
                    if (map2 != null) {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        for (Map.Entry entry : map2.entrySet()) {
                            bundle2.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                        }
                        intent.putExtra("extra_channel_data", bundle2);
                    }
                } catch (java.lang.Exception unused) {
                    Unit unit = Unit.INSTANCE;
                }
            }
            intent.putExtra("extra_test_mode", z);
            intent.putExtra("extra_orbit_upgrade_success_msg", str);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }
    }

    public final C47793twn AkhnZx() {
        return (C47793twn) this.values.getValue();
    }

    public static final ViewModelProvider.Factory AkhnZx(ActivityC47702tvB activityC47702tvB) {
        android.content.Intent intent = activityC47702tvB.getIntent();
        return new tRJ(activityC47702tvB, intent != null ? intent.getExtras() : null, new Function1() { // from class: o.tvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.OLrzqt((SavedStateHandle) obj);
            }
        });
    }

    public static final C47793twn OLrzqt(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C47793twn(savedStateHandle, null, null, null, null, null, null, null, null, null, 1022, null);
    }

    public static final C47736tvj KWHzl() {
        return tPF.copydefault.akftKQ();
    }

    private final C47736tvj OcIXYQ() {
        return (C47736tvj) this.AkhnZx.getValue();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View root;
        super.onCreate(bundle);
        this.djBIcL = getIntent().getBooleanExtra("extra_test_mode", false);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        boolean z = (getResources().getConfiguration().uiMode & 48) == 32;
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        boolean z2 = !z;
        insetsController.setAppearanceLightStatusBars(z2);
        insetsController.setAppearanceLightNavigationBars(z2);
        AbstractC46258tNr abstractC46258tNrOLrzqt = AbstractC46258tNr.OLrzqt(getLayoutInflater());
        setContentView(abstractC46258tNrOLrzqt.getRoot());
        EZpvd(abstractC46258tNrOLrzqt);
        getOnBackPressedDispatcher().addCallback(this, new TaskDescription());
        QOLQEE();
        fIwbmz();
        ejfBZ();
        fJNWhG();
        ORxRYg();
        java.lang.String stringExtra = getIntent().getStringExtra("extra_orbit_upgrade_success_msg");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) stringExtra)) {
            tTY tty = tTY.EZpvd;
            AbstractC46258tNr abstractC46258tNrOLrzqt2 = OLrzqt();
            android.view.View root2 = abstractC46258tNrOLrzqt2 != null ? abstractC46258tNrOLrzqt2.getRoot() : null;
            Intrinsics.copydefault((java.lang.Object) stringExtra);
            tty.AEQbTJ(root2, stringExtra);
        }
        AbstractC46258tNr abstractC46258tNrOLrzqt3 = OLrzqt();
        if (abstractC46258tNrOLrzqt3 == null || (root = abstractC46258tNrOLrzqt3.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.tvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC47702tvB.fetchVPNInfo(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.tvB$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        public TaskDescription() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ActivityC47702tvB.this.fetchVPNInfo();
        }
    }

    public static final void fetchVPNInfo(ActivityC47702tvB activityC47702tvB) {
        if (activityC47702tvB.EZpvd) {
            return;
        }
        activityC47702tvB.EZpvd = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC47702tvB, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void fetchVPNInfo() {
        java.lang.String string;
        C47576tsi c47576tsi;
        C47576tsi c47576tsi2;
        C47576tsi c47576tsi3 = this.AhwBna;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c47576tsi3 != null ? c47576tsi3.values() : null)) || (((c47576tsi = this.AhwBna) != null && c47576tsi.AhwBna() > 0) || ((c47576tsi2 = this.AhwBna) != null && c47576tsi2.AuCTel()))) {
            C47576tsi c47576tsi4 = this.AhwBna;
            java.lang.String strValues = c47576tsi4 != null ? c47576tsi4.values() : null;
            if (strValues == null || strValues.length() == 0) {
                finish();
                return;
            }
            final boolean zEZpvd = EZpvd();
            if (!zEZpvd) {
                DraftDataInfo draftDataInfoAxsJAY = AkhnZx().AxsJAY();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (draftDataInfoAxsJAY != null ? draftDataInfoAxsJAY.getDraftId() : null))) {
                    finish();
                    return;
                }
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
            if (zEZpvd) {
                string = viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.OJuSTm);
            } else {
                string = viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.USBtdM);
            }
            viewOnClickListenerC54939xaY.setTitle(string);
            viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(zEZpvd ? C47501trL.Fragment.QSLkRj : C47501trL.Fragment.QVsKAR));
            java.lang.String string2 = viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.QCjLjM);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string2, new View.OnClickListener() { // from class: o.tvV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47702tvB.EZpvd(this.copydefault, zEZpvd, viewOnClickListenerC54939xaY, view);
                }
            });
            java.lang.String string3 = viewOnClickListenerC54939xaY.getContext().getString(C47501trL.Fragment.OFhtUX);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            viewOnClickListenerC54939xaY.AEQbTJ(string3, new View.OnClickListener() { // from class: o.tvW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47702tvB.KWHzl(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        finish();
    }

    public static final void EZpvd(ActivityC47702tvB activityC47702tvB, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC47702tvB.AEQbTJ(true, z);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Mid_PublishCancel_Click", (TrackChannel[]) null, new Function1() { // from class: o.tvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.AEQbTJ(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.dismiss();
        activityC47702tvB.AwvSrB();
        activityC47702tvB.finish();
    }

    public static final Unit AEQbTJ(ActivityC47702tvB activityC47702tvB, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C47576tsi c47576tsi = activityC47702tvB.AhwBna;
        EventParamsList.put$default(eventParamsList, "input_content", C33129mqd.OLrzqt((java.lang.CharSequence) (c47576tsi != null ? c47576tsi.values() : null)) ? "true" : "false", false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd() {
        java.lang.String draftId;
        java.lang.String strValues;
        DraftDataInfo draftDataInfoAxsJAY = AkhnZx().AxsJAY();
        if (draftDataInfoAxsJAY != null && (draftId = draftDataInfoAxsJAY.getDraftId()) != null && draftId.length() != 0) {
            C47576tsi c47576tsi = this.AhwBna;
            if (c47576tsi == null || (strValues = c47576tsi.values()) == null) {
                strValues = "";
            }
            java.lang.String content = draftDataInfoAxsJAY.getContent();
            if (!Intrinsics.EZpvd((java.lang.Object) strValues, (java.lang.Object) (content != null ? content : ""))) {
                return true;
            }
            java.util.List<PublishImageItem> imageList = draftDataInfoAxsJAY.getImageList();
            if (imageList == null) {
                imageList = yDY.AhwBna();
            }
            java.util.List<ImageItem> listValueOf = AkhnZx().valueOf();
            if (imageList.size() != listValueOf.size()) {
                return true;
            }
            int size = imageList.size();
            for (int i = 0; i < size; i++) {
                if (!Intrinsics.EZpvd((java.lang.Object) imageList.get(i).AEQbTJ(), (java.lang.Object) listValueOf.get(i).getRemoteUrl())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
    }

    private final void QOLQEE() {
        EZpvd(new Function1() { // from class: o.tvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.valueOf(this.copydefault, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit valueOf(final ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.widget.ImageView backImage = abstractC46258tNr.OLrzqt.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(layoutParams2);
            abstractC46258tNr.OLrzqt.getBackImage().setOnClickListener(new View.OnClickListener() { // from class: o.tvS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47702tvB.gEmmrt(this.OLrzqt, view);
                }
            });
            activityC47702tvB.AuCTel();
            return Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public static final void gEmmrt(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        activityC47702tvB.fetchVPNInfo();
    }

    public final void AuCTel() {
        EZpvd(new Function1() { // from class: o.tvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.values(this.AEQbTJ, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit values(final ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        android.view.ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activityC47702tvB);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C52794wYp c52794wYp = new C52794wYp(activityC47702tvB, null, 0, 6, null);
        c52794wYp.setOKDSType(257);
        c52794wYp.setOKDSSize(28);
        c52794wYp.setOKDSPill(-1);
        c52794wYp.setText(C33070mpX.AYXKKw(C47501trL.Fragment.invokespecialdPnHjp));
        c52794wYp.setEnabled(false);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.tvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.AuCTel(this.EZpvd, view);
            }
        });
        activityC47702tvB.DbNXlk = c52794wYp;
        android.widget.TextView textView = new android.widget.TextView(activityC47702tvB);
        textView.setText(C33070mpX.AYXKKw(C47501trL.Fragment.OxVOHk));
        textView.setTextColor(ContextCompat.getColor(activityC47702tvB, C52761wXj.Activity.fdOvFl));
        textView.setTextAppearance(C52761wXj.LoaderManager.DTwDnp);
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.tvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.fJNWhG(this.OLrzqt, view);
            }
        });
        activityC47702tvB.copydefault = textView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewGroup.LayoutParams layoutParams2 = null;
        layoutParams.setMarginEnd(C55298xhM.dp2px$default(12.0f, null, 1, null));
        android.widget.TextView textView2 = activityC47702tvB.copydefault;
        if (textView2 != null) {
            textView2.setLayoutParams(layoutParams);
        }
        linearLayout.addView(activityC47702tvB.copydefault);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        C52794wYp c52794wYp2 = activityC47702tvB.DbNXlk;
        if (c52794wYp2 != null) {
            c52794wYp2.setLayoutParams(layoutParams3);
        }
        linearLayout.addView(activityC47702tvB.DbNXlk);
        C33537myN c33537myN = abstractC46258tNr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) c33537myN.findViewById(C32113mPz.FragmentManager.aKErDB);
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = -2;
                layoutParams2 = layoutParams4;
            }
            viewGroup.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2, TextAlign.RIGHT);
            layoutParams5.setMarginEnd(activityC47702tvB.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ORxRYg));
            linearLayout.setLayoutParams(layoutParams5);
            viewGroup.addView(linearLayout);
            android.view.View view = new android.view.View(activityC47702tvB);
            view.setBackgroundColor(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.tvE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ActivityC47702tvB.ejfBZ(this.KWHzl, view2);
                }
            });
            view.setVisibility(0);
            activityC47702tvB.isConnected = view;
            viewGroup.addView(view);
            C52794wYp c52794wYp3 = activityC47702tvB.DbNXlk;
            if (c52794wYp3 != null && (viewTreeObserver = c52794wYp3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(activityC47702tvB.new Application());
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        handlePublishClick$default(activityC47702tvB, false, false, 3, null);
    }

    public static final void fJNWhG(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Top_Draft_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        activityC47702tvB.fARcdN();
    }

    public static final void ejfBZ(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        handlePublishClick$default(activityC47702tvB, false, false, 3, null);
    }

    /* JADX INFO: renamed from: o.tvB$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public Application() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.ViewTreeObserver viewTreeObserver;
            C52794wYp c52794wYp = ActivityC47702tvB.this.DbNXlk;
            if (c52794wYp != null && (viewTreeObserver = c52794wYp.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C52794wYp c52794wYp2 = ActivityC47702tvB.this.DbNXlk;
            if (c52794wYp2 != null) {
                ActivityC47702tvB activityC47702tvB = ActivityC47702tvB.this;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c52794wYp2.getWidth(), c52794wYp2.getHeight(), TextAlign.RIGHT);
                layoutParams.setMarginEnd(activityC47702tvB.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ORxRYg));
                android.view.View view = activityC47702tvB.isConnected;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void fARcdN() {
        C47507trR.TaskDescription taskDescription = C47507trR.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        taskDescription.copydefault(supportFragmentManager, new Function1() { // from class: o.tvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.AEQbTJ(this.copydefault, (DraftDataInfo) obj);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC47702tvB activityC47702tvB, DraftDataInfo draftDataInfo) {
        Intrinsics.checkNotNullParameter(draftDataInfo, "");
        activityC47702tvB.AkhnZx().copydefault(activityC47702tvB.AkhnZx().AEQbTJ(draftDataInfo));
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        EZpvd(new Function1() { // from class: o.tvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.DbNXlk(this.AEQbTJ, (AbstractC46258tNr) obj);
            }
        });
        valueOf();
        DTwDnp();
    }

    public static final Unit DbNXlk(final ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        abstractC46258tNr.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.twi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.isConnected(this.EZpvd, view);
            }
        });
        abstractC46258tNr.AYXKKw.setVisibility(activityC47702tvB.AkhnZx().giSNqX());
        abstractC46258tNr.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.twk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.DbNXlk(this.OLrzqt, view);
            }
        });
        abstractC46258tNr.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.two
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.AkhnZx(this.EZpvd, view);
            }
        });
        android.widget.ImageButton imageButton = abstractC46258tNr.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setVisibility(activityC47702tvB.djBIcL ? 0 : 8);
        abstractC46258tNr.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.tvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.fetchVPNInfo(this.KWHzl, view);
            }
        });
        abstractC46258tNr.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.tvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC47702tvB.values(this.KWHzl, view);
            }
        });
        abstractC46258tNr.fetchVPNInfo.setText(pTB.formatLocalized$default("2100", null, 1, null));
        return Unit.INSTANCE;
    }

    public static final void isConnected(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Mid_Imageupload_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (activityC47702tvB.AkhnZx().fJNWhG().getValue().booleanValue()) {
            activityC47702tvB.uzCIH();
        } else {
            C47793twn.handleToolFragmentAction$default(activityC47702tvB.AkhnZx(), ToolFragmentType.IMAGE_SELECT, false, 2, null);
        }
    }

    public static final void DbNXlk(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Mid_TopicUpload_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (activityC47702tvB.AkhnZx().fARcdN().getValue().booleanValue()) {
            activityC47702tvB.wlaJM();
        } else {
            C47793twn.handleToolFragmentAction$default(activityC47702tvB.AkhnZx(), ToolFragmentType.TOPIC_LIST, false, 2, null);
        }
    }

    public static final void AkhnZx(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Mid_TokenUpload_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (activityC47702tvB.AkhnZx().fARcdN().getValue().booleanValue()) {
            activityC47702tvB.wlaJM();
        } else {
            C47793twn.handleToolFragmentAction$default(activityC47702tvB.AkhnZx(), ToolFragmentType.TOKEN_LIST, false, 2, null);
        }
    }

    public static final void fetchVPNInfo(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C47793twn.handleToolFragmentAction$default(activityC47702tvB.AkhnZx(), ToolFragmentType.REPLY_TEST, false, 2, null);
    }

    public static final void values(ActivityC47702tvB activityC47702tvB, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Mid_PluginUpload_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C47793twn.handleToolFragmentAction$default(activityC47702tvB.AkhnZx(), ToolFragmentType.PLUGIN_LIST, false, 2, null);
    }

    public final void valueOf() {
        try {
            final java.util.List<tWX> listEZpvd = OcIXYQ().EZpvd(this.djBIcL);
            EZpvd(new Function1() { // from class: o.twb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC47702tvB.EZpvd(listEZpvd, (AbstractC46258tNr) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PlanetPublisherActivity", "Failed to check plugin availability", e);
            EZpvd(new Function1() { // from class: o.twc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC47702tvB.EZpvd((AbstractC46258tNr) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.util.List list, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.widget.ImageButton imageButton = abstractC46258tNr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.widget.ImageButton imageButton = abstractC46258tNr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setVisibility(8);
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        this.AhwBna = C47576tsi.Companion.OLrzqt(new C47574tsg(C33070mpX.AYXKKw(C47501trL.Fragment.hOMIpD), null, 2100, 0, true, true, 4, false, false, 0, true, true, "publisher_input_state", C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(20.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), TypedValues.Custom.TYPE_REFERENCE, null), AkhnZx(), new Activity(), this.djBIcL);
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C47501trL.TaskDescription.DPHsZd;
        C47576tsi c47576tsi = this.AhwBna;
        Intrinsics.copydefault(c47576tsi);
        fragmentTransactionBeginTransaction.replace(i, c47576tsi).commitNow();
    }

    /* JADX INFO: renamed from: o.tvB$Activity */
    public static final class Activity implements InterfaceC47543tsB {
        public Activity() {
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl() {
            InterfaceC47543tsB.Activity.EZpvd(this);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt(java.lang.String str, int i, int i2) {
            android.widget.TextView textView;
            android.widget.TextView textView2;
            Intrinsics.checkNotNullParameter(str, "");
            if (i2 > 0) {
                int i3 = i2 - i;
                AbstractC46258tNr abstractC46258tNrOLrzqt = ActivityC47702tvB.this.OLrzqt();
                if (abstractC46258tNrOLrzqt != null && (textView2 = abstractC46258tNrOLrzqt.fetchVPNInfo) != null) {
                    textView2.setText(pTB.formatLocalized$default(java.lang.String.valueOf(i3), null, 1, null));
                }
                int i4 = i3 <= 0 ? C52761wXj.Activity.DQzvGN : C52761wXj.Activity.QwvEab;
                AbstractC46258tNr abstractC46258tNrOLrzqt2 = ActivityC47702tvB.this.OLrzqt();
                if (abstractC46258tNrOLrzqt2 != null && (textView = abstractC46258tNrOLrzqt2.fetchVPNInfo) != null) {
                    textView.setTextColor(ActivityC47702tvB.this.getResources().getColor(i4, null));
                }
            }
            ActivityC47702tvB.this.AkhnZx().AEQbTJ(str);
        }

        @Override // o.InterfaceC47543tsB
        public void EZpvd() {
            ActivityC47702tvB.this.AkhnZx().djSkpj();
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ() {
            ActivityC47702tvB.this.AkhnZx().djSkpj();
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt() {
            if (ActivityC47702tvB.this.AkhnZx().RcXXUw()) {
                ActivityC47702tvB.this.AkhnZx().djSkpj();
            }
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            ToolFragmentType toolFragmentTypeOLrzqt = ActivityC47702tvB.this.OLrzqt(str);
            if (toolFragmentTypeOLrzqt == null || ActivityC47702tvB.this.AkhnZx().QbewEr().AEQbTJ() == toolFragmentTypeOLrzqt) {
                return;
            }
            ActivityC47702tvB.this.AkhnZx().copydefault(toolFragmentTypeOLrzqt, false);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ToolFragmentType toolFragmentTypeOLrzqt = ActivityC47702tvB.this.OLrzqt(str);
            if (toolFragmentTypeOLrzqt == null || ActivityC47702tvB.this.AkhnZx().QbewEr().AEQbTJ() != toolFragmentTypeOLrzqt) {
                return;
            }
            ActivityC47702tvB.this.AkhnZx().djSkpj();
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (ActivityC47702tvB.this.AkhnZx().RcXXUw()) {
                ActivityC47702tvB.this.AkhnZx().djSkpj();
            }
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault() {
            ActivityC47702tvB.this.uzCIH();
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(PlanetPublisherPluginType planetPublisherPluginType) {
            Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
            pUU.EZpvd("PlanetPublisherActivity", "Plugin added: " + planetPublisherPluginType.getValue());
            ActivityC47702tvB.this.DbNXlk();
            ActivityC47702tvB.this.gEmmrt = true;
            ActivityC47702tvB.this.AkhnZx().KWHzl(true);
            ActivityC47702tvB.this.sSMYrx();
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl(PlanetPublisherPluginType planetPublisherPluginType) {
            Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
            pUU.EZpvd("PlanetPublisherActivity", "Plugin deleted: " + planetPublisherPluginType.getValue());
            ActivityC47702tvB.this.AubY();
            ActivityC47702tvB.this.gEmmrt = false;
            ActivityC47702tvB.this.AkhnZx().KWHzl(false);
            ActivityC47702tvB.this.sSMYrx();
            C47576tsi c47576tsi = ActivityC47702tvB.this.AhwBna;
            java.lang.String strValues = c47576tsi != null ? c47576tsi.values() : null;
            ActivityC47702tvB.this.AkhnZx().AEQbTJ(strValues != null ? strValues : "");
        }
    }

    public final void fJNWhG() {
        this.fetchVPNInfo = C47747tvu.Companion.AEQbTJ(this.djBIcL);
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C47501trL.TaskDescription.glVQsU;
        C47747tvu c47747tvu = this.fetchVPNInfo;
        Intrinsics.copydefault(c47747tvu);
        fragmentTransactionBeginTransaction.replace(i, c47747tvu).commitNow();
    }

    private final void DTwDnp() {
        android.view.View root;
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt == null || (root = abstractC46258tNrOLrzqt.getRoot()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(root, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.twa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC47702tvB.AEQbTJ(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        int i = insets2.bottom;
        int i2 = i > 0 ? i - insets.bottom : insets.bottom;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(C47501trL.TaskDescription.QOLQEE);
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i2);
        }
        return windowInsetsCompat;
    }

    public final void KWHzl(final C47754twA c47754twA) {
        android.view.View root;
        this.OLrzqt = c47754twA;
        if (c47754twA.KWHzl()) {
            AhwBna();
        } else {
            C47576tsi c47576tsi = this.AhwBna;
            if (c47576tsi != null) {
                c47576tsi.fJNWhG();
            }
        }
        copydefault(!c47754twA.EZpvd());
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null && (root = abstractC46258tNrOLrzqt.getRoot()) != null) {
            root.post(new java.lang.Runnable() { // from class: o.twf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC47702tvB.AEQbTJ(c47754twA, this);
                }
            });
        }
        if (c47754twA.AEQbTJ() == ToolFragmentType.TOPIC_LIST || c47754twA.AEQbTJ() == ToolFragmentType.TOKEN_LIST) {
            C47576tsi c47576tsi2 = this.AhwBna;
            if (c47576tsi2 != null) {
                c47576tsi2.AYXKKw();
            }
        } else {
            C47576tsi c47576tsi3 = this.AhwBna;
            if (c47576tsi3 != null) {
                c47576tsi3.valueOf();
            }
        }
        gHZMYf();
    }

    public static final void AEQbTJ(C47754twA c47754twA, ActivityC47702tvB activityC47702tvB) {
        switch (ActionBar.KWHzl[c47754twA.AEQbTJ().ordinal()]) {
            case 1:
                activityC47702tvB.values();
                return;
            case 2:
                activityC47702tvB.getFieldNames();
                return;
            case 3:
                activityC47702tvB.AxsJAY();
                return;
            case 4:
                activityC47702tvB.zLjUOn();
                return;
            case 5:
                activityC47702tvB.zsXlph();
                return;
            case 6:
                activityC47702tvB.AuCTelauCTel();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void zLjUOn() {
        getSupportFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.ORxRYg, C47565tsX.Companion.EZpvd(AkhnZx(), new PendingIntent())).commitNow();
    }

    /* JADX INFO: renamed from: o.tvB$PendingIntent */
    public static final class PendingIntent implements InterfaceC47543tsB {
        public PendingIntent() {
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ() {
            InterfaceC47543tsB.Activity.AEQbTJ(this);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.copydefault(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(java.lang.String str) {
            InterfaceC47543tsB.Activity.copydefault(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl() {
            InterfaceC47543tsB.Activity.EZpvd(this);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.KWHzl(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt() {
            InterfaceC47543tsB.Activity.KWHzl(this);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt(java.lang.String str, int i, int i2) {
            InterfaceC47543tsB.Activity.EZpvd(this, str, i, i2);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault() {
            InterfaceC47543tsB.Activity.OLrzqt(this);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str) {
            InterfaceC47543tsB.Activity.EZpvd(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str, int i) {
            InterfaceC47543tsB.Activity.OLrzqt(this, str, i);
        }

        @Override // o.InterfaceC47543tsB
        public void EZpvd() {
            ActivityC47702tvB.this.AkhnZx().djSkpj();
        }
    }

    public final void AxsJAY() {
        if (AkhnZx().giSNqX() == 0) {
            getSupportFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.ORxRYg, C47622ttb.Companion.copydefault(AkhnZx(), new Dialog())).commitNow();
        }
    }

    /* JADX INFO: renamed from: o.tvB$Dialog */
    public static final class Dialog implements InterfaceC47543tsB {
        public Dialog() {
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ() {
            InterfaceC47543tsB.Activity.AEQbTJ(this);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.copydefault(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(java.lang.String str) {
            InterfaceC47543tsB.Activity.copydefault(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void EZpvd() {
            InterfaceC47543tsB.Activity.copydefault(this);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.KWHzl(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt() {
            InterfaceC47543tsB.Activity.KWHzl(this);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt(java.lang.String str, int i, int i2) {
            InterfaceC47543tsB.Activity.EZpvd(this, str, i, i2);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault() {
            InterfaceC47543tsB.Activity.OLrzqt(this);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str) {
            InterfaceC47543tsB.Activity.EZpvd(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str, int i) {
            InterfaceC47543tsB.Activity.OLrzqt(this, str, i);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl() {
            ActivityC47702tvB.this.AkhnZx().djSkpj();
        }
    }

    public final void getFieldNames() {
        C47574tsg c47574tsgDjBIcL;
        C47556tsO.TaskDescription taskDescription = C47556tsO.Companion;
        C47576tsi c47576tsi = this.AhwBna;
        getSupportFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.ORxRYg, taskDescription.EZpvd(((c47576tsi == null || (c47574tsgDjBIcL = c47576tsi.djBIcL()) == null) ? 4 : c47574tsgDjBIcL.AhwBna()) - AkhnZx().djBIcL().getValue().size(), AkhnZx(), new LoaderManager())).commitNow();
    }

    /* JADX INFO: renamed from: o.tvB$LoaderManager */
    public static final class LoaderManager implements InterfaceC47543tsB {
        public LoaderManager() {
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.copydefault(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void AEQbTJ(java.lang.String str) {
            InterfaceC47543tsB.Activity.copydefault(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void EZpvd() {
            InterfaceC47543tsB.Activity.copydefault(this);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl() {
            InterfaceC47543tsB.Activity.EZpvd(this);
        }

        @Override // o.InterfaceC47543tsB
        public void KWHzl(PlanetPublisherPluginType planetPublisherPluginType) {
            InterfaceC47543tsB.Activity.KWHzl(this, planetPublisherPluginType);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt() {
            InterfaceC47543tsB.Activity.KWHzl(this);
        }

        @Override // o.InterfaceC47543tsB
        public void OLrzqt(java.lang.String str, int i, int i2) {
            InterfaceC47543tsB.Activity.EZpvd(this, str, i, i2);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault() {
            InterfaceC47543tsB.Activity.OLrzqt(this);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str) {
            InterfaceC47543tsB.Activity.EZpvd(this, str);
        }

        @Override // o.InterfaceC47543tsB
        public void copydefault(java.lang.String str, int i) {
            InterfaceC47543tsB.Activity.OLrzqt(this, str, i);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.twn.handleToolFragmentAction$default(o.twn, com.okinc.planet.biz_content.publisher.ToolFragmentType, boolean, int, java.lang.Object):void */
        @Override // o.InterfaceC47543tsB
        public void AEQbTJ() {
            ActivityC47702tvB.this.AkhnZx().djSkpj();
            if (ActivityC47702tvB.this.AkhnZx().fJNWhG().getValue().booleanValue()) {
                return;
            }
            C47793twn.handleToolFragmentAction$default(ActivityC47702tvB.this.AkhnZx(), ToolFragmentType.IMAGE_SELECT, false, 2, null);
        }
    }

    public final void AuCTelauCTel() {
        getSupportFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.ORxRYg, C47740tvn.Companion.AEQbTJ(new Function1() { // from class: o.twe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.OLrzqt(this.EZpvd, (tWX) obj);
            }
        }, new Function2() { // from class: o.twg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC47702tvB.AEQbTJ(this.AEQbTJ, (tWV) obj, (PlanetPublisherPluginType) obj2);
            }
        }, this.djBIcL)).commitNow();
    }

    public static final Unit OLrzqt(ActivityC47702tvB activityC47702tvB, tWX twx) {
        Intrinsics.checkNotNullParameter(twx, "");
        pUU.EZpvd("PlanetPublisherActivity", "Plugin selected: " + twx.EZpvd().getValue());
        C47736tvj c47736tvjOcIXYQ = activityC47702tvB.OcIXYQ();
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC47702tvB.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c47736tvjOcIXYQ.AEQbTJ(activityC47702tvB, supportFragmentManager, twx.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC47702tvB activityC47702tvB, tWV twv, PlanetPublisherPluginType planetPublisherPluginType) {
        C47546tsE c47546tsEFetchVPNInfo;
        Intrinsics.checkNotNullParameter(twv, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        pUU.EZpvd("PlanetPublisherActivity", "Plugin view generated: " + planetPublisherPluginType.getValue());
        C47576tsi c47576tsi = activityC47702tvB.AhwBna;
        if (c47576tsi != null && (c47546tsEFetchVPNInfo = c47576tsi.fetchVPNInfo()) != null) {
            c47546tsEFetchVPNInfo.KWHzl(twv, planetPublisherPluginType);
        }
        return Unit.INSTANCE;
    }

    public final void values() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C47501trL.TaskDescription.ORxRYg);
        if (fragmentFindFragmentById != null) {
            getSupportFragmentManager().beginTransaction().remove(fragmentFindFragmentById).commitNow();
        }
    }

    public final void gHZMYf() {
        android.view.View root;
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt == null || (root = abstractC46258tNrOLrzqt.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.tvP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC47702tvB.values(this.EZpvd);
            }
        });
    }

    public static final void values(final ActivityC47702tvB activityC47702tvB) {
        activityC47702tvB.EZpvd(new Function1() { // from class: o.tvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.isConnected(this.KWHzl, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit isConnected(ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        abstractC46258tNr.gEmmrt.setImageResource(activityC47702tvB.getSupportFragmentManager().findFragmentById(C47501trL.TaskDescription.ORxRYg) instanceof C47740tvn ? C52761wXj.TaskDescription.RKcVTr : C52761wXj.TaskDescription.fzHEvu);
        return Unit.INSTANCE;
    }

    public final void copydefault(final boolean z) {
        EZpvd(new Function1() { // from class: o.twl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.KWHzl(z, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit KWHzl(boolean z, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.widget.LinearLayout linearLayout = abstractC46258tNr.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        C47576tsi c47576tsi = this.AhwBna;
        if (c47576tsi != null) {
            c47576tsi.KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToolFragmentType OLrzqt(java.lang.String str) {
        return AkhnZx().OLrzqt(str);
    }

    public final void EZpvd(final boolean z) {
        EZpvd(new Function1() { // from class: o.twj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.copydefault(z, this, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit copydefault(boolean z, ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(activityC47702tvB, z ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl);
        abstractC46258tNr.valueOf.setImageTintList(colorStateList);
        abstractC46258tNr.AYXKKw.setImageTintList(colorStateList);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z) {
        this.valueOf = z;
        zuBGHE();
    }

    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
        zuBGHE();
        sSMYrx();
        if (z) {
            DbNXlk();
        } else {
            if (this.gEmmrt) {
                return;
            }
            AubY();
        }
    }

    public final void zuBGHE() {
        EZpvd(new Function1() { // from class: o.tvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.fetchVPNInfo(this.copydefault, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        abstractC46258tNr.AEQbTJ.setEnabled(!activityC47702tvB.AYXKKw);
        int i = (activityC47702tvB.AYXKKw || activityC47702tvB.valueOf) ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl;
        abstractC46258tNr.AEQbTJ.setImageTintList(ContextCompat.getColorStateList(activityC47702tvB, i));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(AbstractC46258tNr abstractC46258tNr, ActivityC47702tvB activityC47702tvB, C47572tse c47572tse) {
        abstractC46258tNr.fetchVPNInfo.setTextColor(activityC47702tvB.getResources().getColor((c47572tse != null ? c47572tse.EZpvd() : null) == ValidationStatus.FAIL ? C52761wXj.Activity.DQzvGN : C52761wXj.Activity.QwvEab, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(final C47577tsj c47577tsj) {
        EZpvd(new Function1() { // from class: o.tvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.EZpvd(this.EZpvd, c47577tsj, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit EZpvd(ActivityC47702tvB activityC47702tvB, C47577tsj c47577tsj, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        android.widget.TextView textView = activityC47702tvB.copydefault;
        if (textView != null) {
            textView.setVisibility(c47577tsj.copydefault() ? 0 : 8);
        }
        C52794wYp c52794wYp = activityC47702tvB.DbNXlk;
        if (c52794wYp != null) {
            c52794wYp.setEnabled(c47577tsj.AEQbTJ());
        }
        android.view.View view = activityC47702tvB.isConnected;
        if (view != null) {
            view.setVisibility(c47577tsj.AEQbTJ() ? 8 : 0);
        }
        EZpvd(abstractC46258tNr, activityC47702tvB, c47577tsj.OLrzqt().get(ContentValidationType.LENGTH_LIMIT));
        return Unit.INSTANCE;
    }

    public final void sSMYrx() {
        if (this.AYXKKw || this.gEmmrt) {
            djBIcL();
        } else {
            AYXKKw();
        }
    }

    public static /* synthetic */ void handlePublishClick$default(ActivityC47702tvB activityC47702tvB, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        activityC47702tvB.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.Object next4;
        java.lang.Object next5;
        java.lang.String strValues;
        C47577tsj value = AkhnZx().AEQbTJ().getValue();
        if (value.AEQbTJ()) {
            C47576tsi c47576tsi = this.AhwBna;
            if (c47576tsi == null || (strValues = c47576tsi.values()) == null) {
                strValues = "";
            }
            java.lang.String str = strValues;
            C47576tsi c47576tsi2 = this.AhwBna;
            java.lang.Boolean boolValueOf = c47576tsi2 != null ? java.lang.Boolean.valueOf(c47576tsi2.DTwDnp()) : null;
            C47576tsi c47576tsi3 = this.AhwBna;
            objValueOf = c47576tsi3 != null ? java.lang.Boolean.valueOf(c47576tsi3.OLrzqt()) : null;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(boolValueOf, bool) && Intrinsics.EZpvd(objValueOf, bool)) {
                AhwBna();
                showLoading();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$handlePublishClick$1(this, z, str, z2, null), 3, null);
                return;
            }
            AEQbTJ(C33069mpW.copydefault(C47501trL.Fragment.zpGcln, C56424yEw.KWHzl()), false);
            return;
        }
        java.util.List<C47572tse> listEZpvd = value.EZpvd();
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C47572tse) next).KWHzl() == ContentValidationType.BLANK_ALL) {
                    break;
                }
            }
        }
        if (((C47572tse) next) != null) {
            return;
        }
        java.util.Iterator<T> it2 = listEZpvd.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((C47572tse) next2).KWHzl() == ContentValidationType.BLANK_TEXT_HAVE_PLUGIN) {
                    break;
                }
            }
        }
        if (((C47572tse) next2) != null) {
            hDKMBd();
            return;
        }
        java.util.Iterator<T> it3 = listEZpvd.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (((C47572tse) next3).KWHzl() == ContentValidationType.BLANK_TEXT_HAVE_IMAGES) {
                    break;
                }
            }
        }
        if (((C47572tse) next3) != null) {
            hDKMBd();
            return;
        }
        java.util.Iterator<T> it4 = listEZpvd.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            } else {
                next4 = it4.next();
                if (((C47572tse) next4).KWHzl() == ContentValidationType.IMAGE_UPLOAD_FAIL) {
                    break;
                }
            }
        }
        if (((C47572tse) next4) != null) {
            getNewProxyInstance();
            C47576tsi c47576tsi4 = this.AhwBna;
            if (c47576tsi4 != null) {
                c47576tsi4.DTwDnp();
                return;
            }
            return;
        }
        java.util.Iterator<T> it5 = listEZpvd.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            } else {
                next5 = it5.next();
                if (((C47572tse) next5).KWHzl() == ContentValidationType.ACTIVITY_IMAGE_UPLOAD_FAIL) {
                    break;
                }
            }
        }
        if (((C47572tse) next5) != null) {
            getNewProxyInstance();
            C47576tsi c47576tsi5 = this.AhwBna;
            if (c47576tsi5 != null) {
                c47576tsi5.OLrzqt();
                return;
            }
            return;
        }
        java.util.Iterator<T> it6 = listEZpvd.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next6 = it6.next();
            if (((C47572tse) next6).KWHzl() == ContentValidationType.IMAGE_UPLOAD_PROGRESSING) {
                objValueOf = next6;
                break;
            }
        }
        if (((C47572tse) objValueOf) != null) {
            iwGUEr();
        }
    }

    public final void OLrzqt(AbstractC43419rot<PublishResponse, OKServerException> abstractC43419rot) {
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            AwvSrB();
            final InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class);
            final java.lang.String strAEQbTJ = ((PublishResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).AEQbTJ();
            finish();
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.tvL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC47702tvB.KWHzl(this.AEQbTJ, interfaceC43033rhe, strAEQbTJ);
                }
            }, 500L);
            return;
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String message = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage();
        if (message == null) {
            message = "";
        }
        AEQbTJ(message, !tQM.EZpvd.AEQbTJ(((OKServerException) r6.KWHzl()).getCode()));
    }

    public static final void KWHzl(ActivityC47702tvB activityC47702tvB, final InterfaceC43033rhe interfaceC43033rhe, final java.lang.String str) {
        android.view.View viewEZpvd = tUB.copydefault.EZpvd();
        if (viewEZpvd != null) {
            BottomNavigationView bottomNavigationViewEZpvd = activityC47702tvB.EZpvd(viewEZpvd);
            final C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewEZpvd, C33070mpX.AYXKKw(C47501trL.Fragment.dzkkkq));
            if (c55284xgzKWHzl != null) {
                if (bottomNavigationViewEZpvd != null) {
                    c55284xgzKWHzl.AEQbTJ(bottomNavigationViewEZpvd);
                }
                c55284xgzKWHzl.isConnected(3);
                c55284xgzKWHzl.djBIcL(1);
                c55284xgzKWHzl.EZpvd(C33070mpX.AYXKKw(C47501trL.Fragment.gBtXYZ));
                c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.tvQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC47702tvB.copydefault(interfaceC43033rhe, str, c55284xgzKWHzl, view);
                    }
                });
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public static final void copydefault(InterfaceC43033rhe interfaceC43033rhe, java.lang.String str, C55284xgz c55284xgz, android.view.View view) {
        C32866mlf.onEvent$default("Feeds_Bottom_ViewPublish_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        InterfaceC43033rhe.StateListAnimator.gotoCommunityFeedDetailPage$default(interfaceC43033rhe, activityAEQbTJ, str, "", null, 8, null);
        c55284xgz.copydefault();
    }

    public static /* synthetic */ void handleSaveDraftResult$default(ActivityC47702tvB activityC47702tvB, AbstractC43419rot abstractC43419rot, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        activityC47702tvB.AEQbTJ((AbstractC43419rot<SaveDraftResponse, OKServerException>) abstractC43419rot, z);
    }

    public final void AEQbTJ(AbstractC43419rot<SaveDraftResponse, OKServerException> abstractC43419rot, final boolean z) {
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            AwvSrB();
            finish();
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.twm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC47702tvB.gEmmrt(this.OLrzqt, z);
                }
            }, 500L);
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String message = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage();
            if (message == null) {
                message = "";
            }
            AEQbTJ(message, !tQM.EZpvd.AEQbTJ(((OKServerException) r4.KWHzl()).getCode()));
        }
    }

    public static final void gEmmrt(ActivityC47702tvB activityC47702tvB, boolean z) {
        java.lang.String strAYXKKw;
        android.view.View viewEZpvd = tUB.copydefault.EZpvd();
        if (viewEZpvd != null) {
            BottomNavigationView bottomNavigationViewEZpvd = activityC47702tvB.EZpvd(viewEZpvd);
            if (z) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.dUDNAs);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.UlJrfe);
            }
            C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewEZpvd, strAYXKKw);
            if (c55284xgzKWHzl != null) {
                if (bottomNavigationViewEZpvd != null) {
                    c55284xgzKWHzl.AEQbTJ(bottomNavigationViewEZpvd);
                }
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(strAYXKKw);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final void AEQbTJ(java.lang.String str, boolean z) {
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null) {
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View root = abstractC46258tNrOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, str);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(z ? 2 : 1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(abstractC46258tNrOLrzqt.KWHzl);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final void hDKMBd() {
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null) {
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View root = abstractC46258tNrOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, C33070mpX.AYXKKw(C47501trL.Fragment.getPriority));
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(abstractC46258tNrOLrzqt.KWHzl);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final void getNewProxyInstance() {
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null) {
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View root = abstractC46258tNrOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, C33070mpX.AYXKKw(C47501trL.Fragment.zpGcln));
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(abstractC46258tNrOLrzqt.KWHzl);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final void iwGUEr() {
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null) {
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View root = abstractC46258tNrOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, C33070mpX.AYXKKw(C47501trL.Fragment.aUsmxb));
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(abstractC46258tNrOLrzqt.KWHzl);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final void wlaJM() {
        C47574tsg c47574tsgDjBIcL;
        C47576tsi c47576tsi = this.AhwBna;
        java.lang.String strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.siEkQe, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf((c47576tsi == null || (c47574tsgDjBIcL = c47576tsi.djBIcL()) == null) ? 5 : c47574tsgDjBIcL.djBIcL()))));
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null) {
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View root = abstractC46258tNrOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, strCopydefault);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(abstractC46258tNrOLrzqt.KWHzl);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    public final void uzCIH() {
        C47574tsg c47574tsgDjBIcL;
        C47576tsi c47576tsi = this.AhwBna;
        java.lang.String strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.processStrongAuthMessage, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf((c47576tsi == null || (c47574tsgDjBIcL = c47576tsi.djBIcL()) == null) ? 4 : c47574tsgDjBIcL.AhwBna()))));
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt != null) {
            C55284xgz.Activity activity = C55284xgz.Companion;
            android.view.View root = abstractC46258tNrOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, strCopydefault);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(abstractC46258tNrOLrzqt.KWHzl);
                c55284xgzKWHzl.hDKMBd();
            }
        }
    }

    private final void ORxRYg() {
        android.view.View root;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$observeViewModel$8(this, null), 3, null);
        AbstractC46258tNr abstractC46258tNrOLrzqt = OLrzqt();
        if (abstractC46258tNrOLrzqt == null || (root = abstractC46258tNrOLrzqt.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.tvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC47702tvB.DbNXlk(this.EZpvd);
            }
        });
    }

    public static final void DbNXlk(ActivityC47702tvB activityC47702tvB) {
        activityC47702tvB.AEQbTJ();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        isConnected();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.copydefault = null;
        this.DbNXlk = null;
        this.isConnected = null;
        super.onDestroy();
    }

    public final void isConnected() {
        SerializableInputTextState serializableInputTextState;
        SerializableInputTextState textState;
        try {
            C47576tsi c47576tsi = this.AhwBna;
            if (c47576tsi == null || (serializableInputTextState = c47576tsi.iwGUEr()) == null) {
                serializableInputTextState = new SerializableInputTextState("", yDY.AhwBna());
            }
            if (!AkhnZx().dNCPSb() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) serializableInputTextState.getPlainText()))) {
                InputPageState inputPageStateAwvSrB = AkhnZx().AwvSrB();
                if (Intrinsics.EZpvd((java.lang.Object) ((inputPageStateAwvSrB == null || (textState = inputPageStateAwvSrB.getTextState()) == null) ? null : textState.getPlainText()), (java.lang.Object) serializableInputTextState.getPlainText())) {
                    return;
                }
            }
            AkhnZx().OLrzqt(serializableInputTextState);
        } catch (java.lang.Exception e) {
            pUU.copydefault("Publisher", "Failed to save all state: " + e);
        }
    }

    private final void AwvSrB() {
        AkhnZx().getNewProxyInstance();
        C47576tsi c47576tsi = this.AhwBna;
        if (c47576tsi != null) {
            c47576tsi.copydefault();
        }
    }

    public final void AEQbTJ() {
        C47576tsi c47576tsi;
        C47546tsE c47546tsEFetchVPNInfo;
        C47546tsE c47546tsEFetchVPNInfo2;
        InputPageState inputPageStateAwvSrB;
        try {
            if (AkhnZx().aKErDB() && (inputPageStateAwvSrB = AkhnZx().AwvSrB()) != null) {
                AkhnZx().EZpvd(inputPageStateAwvSrB);
            }
            AkhnZx().iwGUEr();
            SerializableInputTextState serializableInputTextStateDvKsVJ = AkhnZx().dvKsVJ();
            if (serializableInputTextStateDvKsVJ == null || (c47576tsi = this.AhwBna) == null) {
                return;
            }
            if (c47576tsi != null) {
                c47576tsi.EZpvd(serializableInputTextStateDvKsVJ);
            }
            C47576tsi c47576tsi2 = this.AhwBna;
            if (c47576tsi2 != null && (c47546tsEFetchVPNInfo2 = c47576tsi2.fetchVPNInfo()) != null) {
                c47546tsEFetchVPNInfo2.KWHzl(serializableInputTextStateDvKsVJ.getPlainText());
            }
            C47576tsi c47576tsi3 = this.AhwBna;
            if (c47576tsi3 != null && (c47546tsEFetchVPNInfo = c47576tsi3.fetchVPNInfo()) != null) {
                c47546tsEFetchVPNInfo.AEQbTJ(AkhnZx().djBIcL().getValue());
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetPublisherActivity$checkAndRestorePageState$1(this, null), 3, null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("Publisher", "Failed to restore state on Activity recreation: " + e);
            e.printStackTrace();
        }
    }

    public final void zsXlph() {
        C47804twy c47804twyKWHzl = C47804twy.Companion.KWHzl("John Van Bourg");
        c47804twyKWHzl.AEQbTJ(new Function2() { // from class: o.tvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC47702tvB.AEQbTJ(this.EZpvd, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c47804twyKWHzl.show(supportFragmentManager);
    }

    public static final Unit AEQbTJ(ActivityC47702tvB activityC47702tvB, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.widget.Toast.makeText(activityC47702tvB, "Reply submitted: " + str + " (" + list.size() + " images)", 0).show();
        activityC47702tvB.AkhnZx().djSkpj();
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        C47747tvu c47747tvu = this.fetchVPNInfo;
        if (c47747tvu != null) {
            c47747tvu.OLrzqt();
        }
    }

    public final void AubY() {
        C47747tvu c47747tvu = this.fetchVPNInfo;
        if (c47747tvu != null) {
            c47747tvu.AEQbTJ();
        }
    }

    public final void djBIcL() {
        EZpvd(new Function1() { // from class: o.twh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.AYXKKw(this.KWHzl, (AbstractC46258tNr) obj);
            }
        });
        values();
        gHZMYf();
    }

    public static final Unit AYXKKw(ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        abstractC46258tNr.gEmmrt.setEnabled(false);
        abstractC46258tNr.gEmmrt.setImageTintList(ContextCompat.getColorStateList(activityC47702tvB, C52761wXj.Activity.UlJrfe));
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        EZpvd(new Function1() { // from class: o.twd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47702tvB.AhwBna(this.copydefault, (AbstractC46258tNr) obj);
            }
        });
    }

    public static final Unit AhwBna(ActivityC47702tvB activityC47702tvB, AbstractC46258tNr abstractC46258tNr) {
        Intrinsics.checkNotNullParameter(abstractC46258tNr, "");
        abstractC46258tNr.gEmmrt.setEnabled(true);
        abstractC46258tNr.gEmmrt.setImageTintList(ContextCompat.getColorStateList(activityC47702tvB, C52761wXj.Activity.fdOvFl));
        return Unit.INSTANCE;
    }

    public final BottomNavigationView EZpvd(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof BottomNavigationView) {
            return (BottomNavigationView) view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                BottomNavigationView bottomNavigationViewEZpvd = EZpvd(viewGroup.getChildAt(i));
                if (bottomNavigationViewEZpvd != null) {
                    return bottomNavigationViewEZpvd;
                }
            }
        }
        return null;
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
