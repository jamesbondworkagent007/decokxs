package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.just.agentweb.DefaultWebClient;
import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.GenericInputFragment$observePluginDataState$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$restoreStateIfNeeded$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupCampaignCardIntegration$2;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupContentValidationIntegration$1$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupImageItemsObservation$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupImageProviderIntegration$1$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupPluginDataIntegration$3$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupShareProviderIntegration$1$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupShareProviderIntegration$1$2;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupTextInsertIntegration$1$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupTokenProviderIntegration$1$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupTopicProviderIntegration$1$1;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupTopicProviderIntegration$1$2;
import com.okinc.planet.biz_content.input.GenericInputFragment$setupTopicProviderIntegration$1$3;
import com.okinc.planet.biz_content.input.GenericInputParentViewModel;
import com.okinc.planet.biz_content.input.ValidationStatus;
import com.okinc.planet.biz_content.input.data.SerializableInputTextState;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
import com.okinc.planet_api.ActivityCardImage;
import com.okinc.planet_api.PluginShareToFeedConfig;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C47546tsE;
import o.C47576tsi;
import o.C47625tte;
import o.C47793twn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47576tsi extends AbstractC32996moC {
    public InterfaceC47543tsB AYXKKw;
    public float AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public boolean EZpvd;
    public tNJ KWHzl;
    public tOE OLrzqt;
    public final float copydefault;
    public C47574tsg djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public GenericInputParentViewModel gEmmrt;
    public C43316rmw isConnected;
    public boolean valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.tsi$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UploadState.values().length];
            try {
                iArr[UploadState.Idle.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UploadState.Uploading.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadState.Success.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadState.Failed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(GenericInputParentViewModel genericInputParentViewModel) {
        this.gEmmrt = genericInputParentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InterfaceC47543tsB interfaceC47543tsB) {
        this.AYXKKw = interfaceC47543tsB;
    }

    public final void AEQbTJ(C47577tsj c47577tsj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C47574tsg c47574tsg) {
        Intrinsics.checkNotNullParameter(c47574tsg, "");
        this.djBIcL = c47574tsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47574tsg djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC47543tsB gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.ODWQjV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GenericInputParentViewModel isConnected() {
        return this.gEmmrt;
    }

    public C47576tsi() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47546tsE.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment$special$$inlined$viewModels$default$5
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.tsq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C47576tsi.EZpvd();
            }
        });
        this.isConnected = new C43316rmw();
        this.copydefault = 10.0f;
        this.djBIcL = new C47574tsg(null, null, 0, 0, false, false, 0, false, false, 0, false, false, null, 0, 0, 0, 0, 131071, null);
    }

    /* JADX INFO: renamed from: o.tsi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tsi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C47576tsi newInstance$default(TaskDescription taskDescription, C47574tsg c47574tsg, GenericInputParentViewModel genericInputParentViewModel, InterfaceC47543tsB interfaceC47543tsB, boolean z, int i, java.lang.Object obj) {
            TaskDescription taskDescription2;
            boolean z2;
            C47574tsg c47574tsg2 = (i & 1) != 0 ? new C47574tsg(null, null, 0, 0, false, false, 0, false, false, 0, false, false, null, 0, 0, 0, 0, 131071, null) : c47574tsg;
            GenericInputParentViewModel genericInputParentViewModel2 = (i & 2) != 0 ? null : genericInputParentViewModel;
            InterfaceC47543tsB interfaceC47543tsB2 = (i & 4) == 0 ? interfaceC47543tsB : null;
            if ((i & 8) != 0) {
                z2 = false;
                taskDescription2 = taskDescription;
            } else {
                taskDescription2 = taskDescription;
                z2 = z;
            }
            return taskDescription2.OLrzqt(c47574tsg2, genericInputParentViewModel2, interfaceC47543tsB2, z2);
        }

        public final C47576tsi OLrzqt(@NotNull C47574tsg c47574tsg, GenericInputParentViewModel genericInputParentViewModel, InterfaceC47543tsB interfaceC47543tsB, boolean z) {
            Intrinsics.checkNotNullParameter(c47574tsg, "");
            C47576tsi c47576tsi = new C47576tsi();
            c47576tsi.copydefault(c47574tsg);
            c47576tsi.AEQbTJ(genericInputParentViewModel);
            c47576tsi.AEQbTJ(interfaceC47543tsB);
            c47576tsi.copydefault(z);
            return c47576tsi;
        }
    }

    public final C47546tsE fARcdN() {
        return (C47546tsE) this.AkhnZx.getValue();
    }

    public static final C47736tvj EZpvd() {
        return tPF.copydefault.akftKQ();
    }

    private final C47736tvj ORxRYg() {
        return (C47736tvj) this.fetchVPNInfo.getValue();
    }

    public final C47546tsE fetchVPNInfo() {
        return fARcdN();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNJ tnjOLrzqt = tNJ.OLrzqt(view);
        this.KWHzl = tnjOLrzqt;
        if (tnjOLrzqt == null) {
            Intrinsics.gEmmrt("");
            tnjOLrzqt = null;
        }
        this.OLrzqt = tnjOLrzqt.AEQbTJ;
        sSMYrx();
        getNewProxyInstance();
        wlaJM();
        AubY();
        AxsJAY();
        AwvSrB();
        zuBGHE();
        hDKMBd();
        zLjUOn();
        gHZMYf();
        zsXlph();
        AuCTelauCTel();
        uzCIH();
        getFieldNames();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        ejfBZ();
        view.post(new java.lang.Runnable() { // from class: o.tsn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47576tsi.djBIcL(this.EZpvd);
            }
        });
    }

    public static final void djBIcL(C47576tsi c47576tsi) {
        if (c47576tsi.EZpvd) {
            return;
        }
        c47576tsi.EZpvd = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47576tsi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ORxRYg().AEQbTJ();
    }

    public final void ejfBZ() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$observePluginDataState$1(this, objectRef, null), 3, null);
    }

    /* JADX INFO: renamed from: o.tsi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C47793twn AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C47793twn.Application OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.view.View view2, C47793twn c47793twn, C47793twn.Application application) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = view2;
            this.AEQbTJ = c47793twn;
            this.OLrzqt = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C47793twn c47793twn = this.AEQbTJ;
                C47793twn.Application application = this.OLrzqt;
                c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : UploadState.Uploading, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : null, (4093 & 2048) != 0 ? application.EZpvd : null));
            }
        }
    }

    /* JADX INFO: renamed from: o.tsi$PendingIntent */
    public static final class PendingIntent implements C47625tte.FragmentManager {
        public PendingIntent() {
        }

        @Override // o.C47625tte.FragmentManager
        public void copydefault(java.lang.String str, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC47543tsB interfaceC47543tsBGEmmrt = C47576tsi.this.gEmmrt();
            if (interfaceC47543tsBGEmmrt != null) {
                interfaceC47543tsBGEmmrt.OLrzqt(str, i, i2);
            }
            if (C47576tsi.this.djBIcL().KWHzl()) {
                C47576tsi.this.fetchVPNInfo().OLrzqt(str);
            }
            C47576tsi.this.OLrzqt(str);
            C47576tsi.this.KWHzl(str);
        }
    }

    public final void sSMYrx() {
        tNJ tnj = this.KWHzl;
        tNJ tnj2 = null;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        tnj.valueOf.setOnTextChangedListener(new PendingIntent());
        tNJ tnj3 = this.KWHzl;
        if (tnj3 == null) {
            Intrinsics.gEmmrt("");
            tnj3 = null;
        }
        tnj3.valueOf.copydefault(this.djBIcL);
        KWHzl("");
        tNJ tnj4 = this.KWHzl;
        if (tnj4 == null) {
            Intrinsics.gEmmrt("");
            tnj4 = null;
        }
        tnj4.valueOf.setOnFocusChangedListener(new Fragment());
        tNJ tnj5 = this.KWHzl;
        if (tnj5 == null) {
            Intrinsics.gEmmrt("");
            tnj5 = null;
        }
        tnj5.valueOf.setOnKeywordDetectedListener(new LoaderManager());
        tNJ tnj6 = this.KWHzl;
        if (tnj6 == null) {
            Intrinsics.gEmmrt("");
            tnj6 = null;
        }
        tnj6.valueOf.setOnHyperlinkPositionChangedListener(new FragmentManager());
        tNJ tnj7 = this.KWHzl;
        if (tnj7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tnj2 = tnj7;
        }
        tnj2.valueOf.setOnImagesPastedListener(new TaskStackBuilder());
    }

    /* JADX INFO: renamed from: o.tsi$Fragment */
    public static final class Fragment implements C47625tte.TaskDescription {
        public Fragment() {
        }

        @Override // o.C47625tte.TaskDescription
        public void EZpvd() {
            InterfaceC47543tsB interfaceC47543tsBGEmmrt = C47576tsi.this.gEmmrt();
            if (interfaceC47543tsBGEmmrt != null) {
                interfaceC47543tsBGEmmrt.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.tsi$LoaderManager */
    public static final class LoaderManager implements C47625tte.StateListAnimator {
        public LoaderManager() {
        }

        @Override // o.C47625tte.StateListAnimator
        public void copydefault(java.lang.String str, int i) {
            InterfaceC47543tsB interfaceC47543tsBGEmmrt;
            Intrinsics.checkNotNullParameter(str, "");
            GenericInputParentViewModel genericInputParentViewModelIsConnected = C47576tsi.this.isConnected();
            if ((genericInputParentViewModelIsConnected != null && genericInputParentViewModelIsConnected.fARcdN().getValue().booleanValue() && (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "$") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER))) || (interfaceC47543tsBGEmmrt = C47576tsi.this.gEmmrt()) == null) {
                return;
            }
            interfaceC47543tsBGEmmrt.copydefault(str, i);
        }

        @Override // o.C47625tte.StateListAnimator
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC47543tsB interfaceC47543tsBGEmmrt = C47576tsi.this.gEmmrt();
            if (interfaceC47543tsBGEmmrt != null) {
                interfaceC47543tsBGEmmrt.AEQbTJ(str);
            }
        }

        @Override // o.C47625tte.StateListAnimator
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC47543tsB interfaceC47543tsBGEmmrt = C47576tsi.this.gEmmrt();
            if (interfaceC47543tsBGEmmrt != null) {
                interfaceC47543tsBGEmmrt.copydefault(str);
            }
        }
    }

    /* JADX INFO: renamed from: o.tsi$FragmentManager */
    public static final class FragmentManager implements C47625tte.Application {
        public FragmentManager() {
        }

        @Override // o.C47625tte.Application
        public void copydefault(int i) {
            boolean z = i >= C47576tsi.this.djBIcL().djBIcL();
            GenericInputParentViewModel genericInputParentViewModelIsConnected = C47576tsi.this.isConnected();
            if (genericInputParentViewModelIsConnected != null) {
                genericInputParentViewModelIsConnected.OLrzqt(z);
            }
        }
    }

    /* JADX INFO: renamed from: o.tsi$TaskStackBuilder */
    public static final class TaskStackBuilder implements C47625tte.ActionBar {
        public TaskStackBuilder() {
        }

        @Override // o.C47625tte.ActionBar
        public void AEQbTJ(java.util.List<? extends android.net.Uri> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (C47576tsi.this.fARcdN().copydefault().getValue().size() != C47576tsi.this.djBIcL().AhwBna()) {
                C47546tsE c47546tsEFARcdN = C47576tsi.this.fARcdN();
                android.content.Context contextRequireContext = C47576tsi.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c47546tsEFARcdN.EZpvd(contextRequireContext, list);
                return;
            }
            InterfaceC47543tsB interfaceC47543tsBGEmmrt = C47576tsi.this.gEmmrt();
            if (interfaceC47543tsBGEmmrt != null) {
                interfaceC47543tsBGEmmrt.copydefault();
            }
        }
    }

    public final void getNewProxyInstance() {
        tNJ tnj = null;
        if (!this.djBIcL.AEQbTJ()) {
            tNJ tnj2 = this.KWHzl;
            if (tnj2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tnj = tnj2;
            }
            tnj.EZpvd.setVisibility(8);
            return;
        }
        this.isConnected.register(ImageItem.class, new C47757twD(new Function1() { // from class: o.tss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47576tsi.copydefault(this.KWHzl, (ImageItem) obj);
            }
        }, new Function1() { // from class: o.tsw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47576tsi.OLrzqt(this.copydefault, (ImageItem) obj);
            }
        }, new Function1() { // from class: o.tsy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47576tsi.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, new Function2() { // from class: o.tsx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C47576tsi.AEQbTJ(this.KWHzl, (ImageItem) obj, (android.graphics.Bitmap) obj2);
            }
        }));
        int iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
        tNJ tnj3 = this.KWHzl;
        if (tnj3 == null) {
            Intrinsics.gEmmrt("");
            tnj3 = null;
        }
        tnj3.EZpvd.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        tNJ tnj4 = this.KWHzl;
        if (tnj4 == null) {
            Intrinsics.gEmmrt("");
            tnj4 = null;
        }
        tnj4.EZpvd.setAdapter(this.isConnected);
        tNJ tnj5 = this.KWHzl;
        if (tnj5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tnj = tnj5;
        }
        tnj.EZpvd.addItemDecoration(new Dialog(iDp2px$default));
    }

    public static final Unit copydefault(C47576tsi c47576tsi, ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(imageItem, "");
        c47576tsi.fetchVPNInfo().OLrzqt(imageItem);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C47576tsi c47576tsi, ImageItem imageItem) {
        Intrinsics.checkNotNullParameter(imageItem, "");
        C47546tsE c47546tsEFetchVPNInfo = c47576tsi.fetchVPNInfo();
        android.content.Context contextRequireContext = c47576tsi.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c47546tsEFetchVPNInfo.OLrzqt(contextRequireContext, imageItem);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C47576tsi c47576tsi, int i) {
        C47546tsE c47546tsEFetchVPNInfo = c47576tsi.fetchVPNInfo();
        FragmentActivity fragmentActivityRequireActivity = c47576tsi.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        tNJ tnj = c47576tsi.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        RecyclerView recyclerView = tnj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c47546tsEFetchVPNInfo.OLrzqt(fragmentActivityRequireActivity, i, recyclerView);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47576tsi c47576tsi, ImageItem imageItem, android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageItem, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        C47546tsE c47546tsEFetchVPNInfo = c47576tsi.fetchVPNInfo();
        FragmentActivity fragmentActivityRequireActivity = c47576tsi.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c47546tsEFetchVPNInfo.copydefault(fragmentActivityRequireActivity, imageItem, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tsi$Dialog */
    public static final class Dialog extends RecyclerView.ItemDecoration {
        public final /* synthetic */ int OLrzqt;

        public Dialog(int i) {
            this.OLrzqt = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != -1) {
                rect.right = this.OLrzqt;
            }
        }
    }

    public final void wlaJM() {
        if (this.djBIcL.OLrzqt()) {
            tNJ tnj = this.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            tnj.OLrzqt.setOnTouchListener(new View.OnTouchListener() { // from class: o.tso
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C47576tsi.AEQbTJ(this.KWHzl, view, motionEvent);
                }
            });
        }
    }

    public static final boolean AEQbTJ(C47576tsi c47576tsi, android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            c47576tsi.AhwBna = motionEvent.getY();
            return true;
        }
        if (action == 2) {
            float y = motionEvent.getY();
            if (java.lang.Math.abs(y - c47576tsi.AhwBna) > c47576tsi.copydefault) {
                c47576tsi.KWHzl();
            }
            c47576tsi.AhwBna = y;
        }
        return false;
    }

    public final void AubY() {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupImageProviderIntegration$1$1(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public final void AxsJAY() {
        GenericInputParentViewModel genericInputParentViewModel;
        if (this.djBIcL.EZpvd() && (genericInputParentViewModel = this.gEmmrt) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupTokenProviderIntegration$1$1(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public final void AwvSrB() {
        GenericInputParentViewModel genericInputParentViewModel;
        if (this.djBIcL.copydefault() && (genericInputParentViewModel = this.gEmmrt) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupTopicProviderIntegration$1$1(this, genericInputParentViewModel, null), 3, null);
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new GenericInputFragment$setupTopicProviderIntegration$1$2(this, genericInputParentViewModel, null), 3, null);
            LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new GenericInputFragment$setupTopicProviderIntegration$1$3(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public final void gHZMYf() {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupShareProviderIntegration$1$1(this, genericInputParentViewModel, null), 3, null);
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new GenericInputFragment$setupShareProviderIntegration$1$2(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public final void zsXlph() {
        ORxRYg().AEQbTJ(new Function2() { // from class: o.tsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C47576tsi.AEQbTJ(this.OLrzqt, (tWV) obj, (PlanetPublisherPluginType) obj2);
            }
        }, new Function1() { // from class: o.tsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47576tsi.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupPluginDataIntegration$3$1(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public static final Unit AEQbTJ(final C47576tsi c47576tsi, tWV twv, PlanetPublisherPluginType planetPublisherPluginType) {
        Intrinsics.checkNotNullParameter(twv, "");
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        c47576tsi.fARcdN().KWHzl(twv, planetPublisherPluginType);
        tNJ tnj = c47576tsi.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        tnj.getRoot().post(new java.lang.Runnable() { // from class: o.tst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47576tsi.valueOf(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void valueOf(C47576tsi c47576tsi) {
        tNJ tnj = c47576tsi.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        c47576tsi.KWHzl(tnj.valueOf.values());
    }

    public static final Unit copydefault(C47576tsi c47576tsi, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("GenericInputFragment", "Plugin error: " + str);
        c47576tsi.fARcdN().EZpvd();
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        android.widget.FrameLayout frameLayout;
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        final C47793twn c47793twn = genericInputParentViewModel instanceof C47793twn ? (C47793twn) genericInputParentViewModel : null;
        if (c47793twn == null) {
            return;
        }
        tOE toe = this.OLrzqt;
        if (toe != null && (frameLayout = toe.OLrzqt) != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o.tsh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C47576tsi.AEQbTJ(c47793twn, view);
                }
            });
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupCampaignCardIntegration$2(this, c47793twn, null), 3, null);
    }

    public static final void AEQbTJ(C47793twn c47793twn, android.view.View view) {
        c47793twn.uzCIH();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C47793twn.Application application) {
        tOE toe;
        android.widget.FrameLayout frameLayout;
        android.widget.ImageView imageView;
        C55113xdn c55113xdn;
        android.view.View view;
        java.lang.String strOLrzqt;
        java.lang.Object obj;
        ViewGroup.LayoutParams layoutParams;
        android.widget.FrameLayout frameLayout2;
        android.widget.ImageView imageView2;
        C55113xdn c55113xdn2;
        android.view.View view2;
        android.widget.FrameLayout frameLayout3;
        android.widget.ImageView imageView3;
        C55113xdn c55113xdn3;
        android.view.View view3;
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        C47793twn c47793twn = genericInputParentViewModel instanceof C47793twn ? (C47793twn) genericInputParentViewModel : null;
        if (c47793twn == null || (toe = this.OLrzqt) == null) {
            return;
        }
        MaterialCardView materialCardView = toe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "");
        materialCardView.setVisibility(application.values() ? 0 : 8);
        if (application.values()) {
            toe.djBIcL.setText(application.djBIcL());
            toe.copydefault.setText(application.EZpvd());
            android.widget.ImageView imageView4 = toe.valueOf;
            imageView4.setOnClickListener(new ActionBar(imageView4, 300L, imageView4, c47793twn, application));
            int i = Activity.KWHzl[application.AkhnZx().ordinal()];
            if (i == 1) {
                c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : UploadState.Uploading, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : null, (4093 & 2048) != 0 ? application.EZpvd : null));
                return;
            }
            if (i == 2) {
                tOE toe2 = this.OLrzqt;
                if (toe2 != null && (view = toe2.AYXKKw) != null) {
                    view.setVisibility(8);
                }
                tOE toe3 = this.OLrzqt;
                if (toe3 != null && (c55113xdn = toe3.gEmmrt) != null) {
                    c55113xdn.setVisibility(0);
                }
                tOE toe4 = this.OLrzqt;
                if (toe4 != null && (imageView = toe4.valueOf) != null) {
                    imageView.setVisibility(8);
                }
                tOE toe5 = this.OLrzqt;
                if (toe5 != null && (frameLayout = toe5.OLrzqt) != null) {
                    frameLayout.setVisibility(8);
                }
            } else if (i == 3) {
                tOE toe6 = this.OLrzqt;
                if (toe6 != null && (view2 = toe6.AYXKKw) != null) {
                    view2.setVisibility(8);
                }
                tOE toe7 = this.OLrzqt;
                if (toe7 != null && (c55113xdn2 = toe7.gEmmrt) != null) {
                    c55113xdn2.setVisibility(8);
                }
                tOE toe8 = this.OLrzqt;
                if (toe8 != null && (imageView2 = toe8.valueOf) != null) {
                    imageView2.setVisibility(8);
                }
                tOE toe9 = this.OLrzqt;
                if (toe9 != null && (frameLayout2 = toe9.OLrzqt) != null) {
                    frameLayout2.setVisibility(0);
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                tOE toe10 = this.OLrzqt;
                if (toe10 != null && (view3 = toe10.AYXKKw) != null) {
                    view3.setVisibility(0);
                }
                tOE toe11 = this.OLrzqt;
                if (toe11 != null && (c55113xdn3 = toe11.gEmmrt) != null) {
                    c55113xdn3.setVisibility(8);
                }
                tOE toe12 = this.OLrzqt;
                if (toe12 != null && (imageView3 = toe12.valueOf) != null) {
                    imageView3.setVisibility(0);
                }
                tOE toe13 = this.OLrzqt;
                if (toe13 != null && (frameLayout3 = toe13.OLrzqt) != null) {
                    frameLayout3.setVisibility(0);
                }
            }
            ActivityCardImage activityCardImageAEQbTJ = application.AEQbTJ();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (activityCardImageAEQbTJ != null ? activityCardImageAEQbTJ.getValue() : null))) {
                ShapeableImageView shapeableImageView = toe.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                shapeableImageView.setVisibility(0);
                ActivityCardImage activityCardImageAEQbTJ2 = application.AEQbTJ();
                java.lang.String type = activityCardImageAEQbTJ2 != null ? activityCardImageAEQbTJ2.getType() : null;
                if (type != null) {
                    switch (type.hashCode()) {
                        case -1396204209:
                            if (type.equals("base64")) {
                                tTQ ttq = tTQ.OLrzqt;
                                byte[] bArrCopydefault = ttq.copydefault(application.AEQbTJ().getValue());
                                if (bArrCopydefault != null && (application.valueOf() == null || toe.AEQbTJ.getDrawable() == null)) {
                                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = ttq.copydefault(bArrCopydefault);
                                    float fIntValue = pairCopydefault.getFirst().intValue() / pairCopydefault.getSecond().intValue();
                                    ShapeableImageView shapeableImageView2 = toe.AEQbTJ;
                                    Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
                                    copydefault(shapeableImageView2, fIntValue);
                                    Glide.KWHzl(toe.AEQbTJ).KWHzl(bArrCopydefault).copydefault(Integer.MIN_VALUE, Integer.MIN_VALUE).copydefault(C47501trL.ActionBar.fJNWhG).EZpvd((android.widget.ImageView) toe.AEQbTJ);
                                    upLoadActivityImage$default(this, application, null, 2, null);
                                }
                                obj = bArrCopydefault;
                            }
                            strOLrzqt = null;
                            obj = strOLrzqt;
                            break;
                        case -970300171:
                            if (type.equals("url_path")) {
                                strOLrzqt = OLrzqt(application.AEQbTJ().getType(), application.AEQbTJ().getValue());
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) && (application.valueOf() == null || toe.AEQbTJ.getDrawable() == null)) {
                                    android.view.ViewParent parent = toe.AEQbTJ.getParent();
                                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                                    if (viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null || layoutParams.height <= 0) {
                                        ShapeableImageView shapeableImageView3 = toe.AEQbTJ;
                                        Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
                                        copydefault(shapeableImageView3, 1.7777778f);
                                    }
                                    Glide.KWHzl(toe.AEQbTJ).EZpvd().copydefault(strOLrzqt).DbNXlk().copydefault(Integer.MIN_VALUE, Integer.MIN_VALUE).KWHzl(C47501trL.ActionBar.fJNWhG).copydefault(C47501trL.ActionBar.fJNWhG).copydefault((RY) new StateListAnimator(application, toe, c47793twn, this)).EZpvd((android.widget.ImageView) toe.AEQbTJ);
                                }
                            } else {
                                strOLrzqt = null;
                            }
                            obj = strOLrzqt;
                            break;
                        case 116079:
                            if (!type.equals("url")) {
                            }
                            obj = strOLrzqt;
                            break;
                        case 1303586937:
                            if (type.equals("local_path")) {
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) application.AEQbTJ().getValue()) && (application.valueOf() == null || toe.AEQbTJ.getDrawable() == null)) {
                                    float fIntValue2 = tTQ.OLrzqt.KWHzl(application.AEQbTJ().getValue()) != null ? r1.getFirst().intValue() / r1.getSecond().intValue() : 1.7777778f;
                                    ShapeableImageView shapeableImageView4 = toe.AEQbTJ;
                                    Intrinsics.checkNotNullExpressionValue(shapeableImageView4, "");
                                    copydefault(shapeableImageView4, fIntValue2);
                                    Glide.KWHzl(toe.AEQbTJ).EZpvd(application.AEQbTJ().getValue()).copydefault(Integer.MIN_VALUE, Integer.MIN_VALUE).copydefault(C47501trL.ActionBar.fJNWhG).EZpvd((android.widget.ImageView) toe.AEQbTJ);
                                    upLoadActivityImage$default(this, application, null, 2, null);
                                    strOLrzqt = application.AEQbTJ().getValue();
                                } else {
                                    strOLrzqt = application.AEQbTJ().getValue();
                                }
                            }
                            obj = strOLrzqt;
                            break;
                    }
                }
                if (obj == null) {
                    c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : null, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : null, (4093 & 2048) != 0 ? application.EZpvd : null));
                    return;
                }
                return;
            }
            c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : null, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : null, (4093 & 2048) != 0 ? application.EZpvd : null));
        }
    }

    /* JADX INFO: renamed from: o.tsi$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ C47793twn AEQbTJ;
        public final /* synthetic */ C47576tsi KWHzl;
        public final /* synthetic */ C47793twn.Application OLrzqt;
        public final /* synthetic */ tOE copydefault;

        public StateListAnimator(C47793twn.Application application, tOE toe, C47793twn c47793twn, C47576tsi c47576tsi) {
            this.OLrzqt = application;
            this.copydefault = toe;
            this.AEQbTJ = c47793twn;
            this.KWHzl = c47576tsi;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            if (this.OLrzqt.AkhnZx() != UploadState.Uploading) {
                return false;
            }
            ShapeableImageView shapeableImageView = this.copydefault.AEQbTJ;
            final C47793twn c47793twn = this.AEQbTJ;
            final C47793twn.Application application = this.OLrzqt;
            shapeableImageView.post(new java.lang.Runnable() { // from class: o.tsD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47576tsi.StateListAnimator.AEQbTJ(c47793twn, application);
                }
            });
            return false;
        }

        public static final void AEQbTJ(C47793twn c47793twn, C47793twn.Application application) {
            c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : UploadState.Failed, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : null, (4093 & 2048) != 0 ? application.EZpvd : null));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(final android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            final tOE toe = this.copydefault;
            ShapeableImageView shapeableImageView = toe.AEQbTJ;
            final C47576tsi c47576tsi = this.KWHzl;
            final C47793twn.Application application = this.OLrzqt;
            shapeableImageView.post(new java.lang.Runnable() { // from class: o.tsv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47576tsi.StateListAnimator.OLrzqt(bitmap, c47576tsi, toe, application);
                }
            });
            return false;
        }

        public static final void OLrzqt(android.graphics.Bitmap bitmap, C47576tsi c47576tsi, tOE toe, C47793twn.Application application) {
            ViewGroup.LayoutParams layoutParams;
            float width = bitmap.getWidth() / bitmap.getHeight();
            float fFloatValue = ((java.lang.Number) c47576tsi.copydefault(width).component1()).floatValue();
            android.view.ViewParent parent = toe.AEQbTJ.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            int width2 = viewGroup != null ? viewGroup.getWidth() : 0;
            int i = (viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null) ? 0 : layoutParams.height;
            int i2 = width2 > 0 ? (int) (width2 / fFloatValue) : 0;
            if (i <= 0 || java.lang.Math.abs(i - i2) > 2) {
                ShapeableImageView shapeableImageView = toe.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                c47576tsi.copydefault(shapeableImageView, width);
            }
            c47576tsi.OLrzqt(application, bitmap);
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str2).toString();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
            return null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "url_path") || C59449zhJ.startsWith$default(string, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(string, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) {
            return string;
        }
        if (C59449zhJ.startsWith$default(string, "images/", false, 2, null)) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            return C43454rpb.copydefault(string, contextRequireContext, false);
        }
        java.lang.String strEZpvd = C43386roM.EZpvd.EZpvd();
        java.lang.String str3 = strEZpvd != null ? strEZpvd : "";
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            return string;
        }
        if (C59449zhJ.startsWith$default(string, "/", false, 2, null)) {
            return str3 + string;
        }
        return str3 + "/" + string;
    }

    public final kotlin.Pair<java.lang.Float, java.lang.Boolean> copydefault(float f) {
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.7777778f);
        if (f <= 0.0f) {
            return new kotlin.Pair<>(fValueOf, java.lang.Boolean.FALSE);
        }
        if (f < 0.75f) {
            return new kotlin.Pair<>(fValueOf, java.lang.Boolean.FALSE);
        }
        if (f > 2.0f) {
            return new kotlin.Pair<>(fValueOf, java.lang.Boolean.FALSE);
        }
        return new kotlin.Pair<>(java.lang.Float.valueOf(f), java.lang.Boolean.TRUE);
    }

    public final void copydefault(android.widget.ImageView imageView, float f) {
        float fFloatValue = copydefault(f).component1().floatValue();
        android.view.ViewParent parent = imageView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getWidth() > 0) {
            AEQbTJ(viewGroup, fFloatValue);
        } else {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new Application(viewGroup, this, fFloatValue));
        }
    }

    /* JADX INFO: renamed from: o.tsi$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ float AEQbTJ;
        public final /* synthetic */ android.view.ViewGroup EZpvd;
        public final /* synthetic */ C47576tsi KWHzl;

        public Application(android.view.ViewGroup viewGroup, C47576tsi c47576tsi, float f) {
            this.EZpvd = viewGroup;
            this.KWHzl = c47576tsi;
            this.AEQbTJ = f;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.EZpvd.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.EZpvd.getWidth() > 0) {
                this.KWHzl.AEQbTJ(this.EZpvd, this.AEQbTJ);
            }
        }
    }

    public final void AEQbTJ(android.view.ViewGroup viewGroup, float f) {
        int width = (int) (viewGroup.getWidth() / f);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).dimensionRatio = null;
        }
        layoutParams.height = width;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.requestLayout();
    }

    public final void AuCTelauCTel() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        ((C47735tvi) tnj.getRoot().findViewById(C47501trL.TaskDescription.DlABUU)).setVisibility(8);
    }

    public final void fIwbmz() {
        try {
            tNJ tnj = this.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            C47735tvi c47735tvi = (C47735tvi) tnj.getRoot().findViewById(C47501trL.TaskDescription.DlABUU);
            c47735tvi.OLrzqt();
            c47735tvi.setVisibility(8);
            pUU.EZpvd("GenericInputFragment", "Plugin container hidden");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("GenericInputFragment", "Failed to hide plugin container", e);
        }
    }

    public final void AEQbTJ(C47735tvi c47735tvi, final PlanetPublisherPluginType planetPublisherPluginType) {
        c47735tvi.setActionButtonListeners(new Function1() { // from class: o.tsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47576tsi.OLrzqt(planetPublisherPluginType, this, (tWV) obj);
            }
        }, new Function1() { // from class: o.tsu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47576tsi.EZpvd(planetPublisherPluginType, this, (tWV) obj);
            }
        });
    }

    public static final Unit OLrzqt(PlanetPublisherPluginType planetPublisherPluginType, C47576tsi c47576tsi, tWV twv) {
        pUU.EZpvd("GenericInputFragment", "Edit button clicked for plugin: " + planetPublisherPluginType);
        if (twv != null) {
            C47736tvj c47736tvjORxRYg = c47576tsi.ORxRYg();
            android.content.Context contextRequireContext = c47576tsi.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            androidx.fragment.app.FragmentManager parentFragmentManager = c47576tsi.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c47736tvjORxRYg.EZpvd(contextRequireContext, parentFragmentManager, planetPublisherPluginType, twv.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(PlanetPublisherPluginType planetPublisherPluginType, final C47576tsi c47576tsi, tWV twv) {
        pUU.EZpvd("GenericInputFragment", "Delete button clicked for plugin: " + planetPublisherPluginType);
        if (twv != null) {
            c47576tsi.ORxRYg().OLrzqt(planetPublisherPluginType, twv.KWHzl());
            c47576tsi.fARcdN().EZpvd();
            tNJ tnj = c47576tsi.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            tnj.getRoot().post(new java.lang.Runnable() { // from class: o.tsl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47576tsi.AYXKKw(this.EZpvd);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(C47576tsi c47576tsi) {
        tNJ tnj = c47576tsi.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        c47576tsi.KWHzl(tnj.valueOf.values());
    }

    public final void OLrzqt(PluginShareToFeedConfig pluginShareToFeedConfig) {
        pUU.EZpvd("GenericInputFragment", "Handling plugin data: " + pluginShareToFeedConfig.getPluginType());
        C47736tvj c47736tvjORxRYg = ORxRYg();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c47736tvjORxRYg.copydefault(contextRequireContext, pluginShareToFeedConfig);
    }

    public final void copydefault(tWV twv, PlanetPublisherPluginType planetPublisherPluginType) {
        try {
            tNJ tnj = this.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            C47735tvi c47735tvi = (C47735tvi) tnj.getRoot().findViewById(C47501trL.TaskDescription.DlABUU);
            c47735tvi.OLrzqt();
            c47735tvi.setVisibility(0);
            c47735tvi.setPluginData(planetPublisherPluginType, twv);
            Intrinsics.copydefault(c47735tvi);
            AEQbTJ(c47735tvi, planetPublisherPluginType);
            AEQbTJ(c47735tvi);
            if (c47735tvi.getWidth() > 0) {
                AEQbTJ(twv, c47735tvi);
            } else {
                KWHzl(twv, c47735tvi);
            }
            InterfaceC47543tsB interfaceC47543tsB = this.AYXKKw;
            if (interfaceC47543tsB != null) {
                interfaceC47543tsB.AEQbTJ(planetPublisherPluginType);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("GenericInputFragment", "Failed to add plugin view to placeholder", e);
        }
    }

    public final void KWHzl(tWV twv, C47735tvi c47735tvi) {
        pUU.EZpvd("GenericInputFragment", "Layout not measured yet, waiting for layout completion");
        c47735tvi.getViewTreeObserver().addOnGlobalLayoutListener(new SharedElementCallback(c47735tvi, this, twv));
    }

    /* JADX INFO: renamed from: o.tsi$SharedElementCallback */
    public static final class SharedElementCallback implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ tWV EZpvd;
        public final /* synthetic */ C47735tvi KWHzl;
        public final /* synthetic */ C47576tsi OLrzqt;

        public SharedElementCallback(C47735tvi c47735tvi, C47576tsi c47576tsi, tWV twv) {
            this.KWHzl = c47735tvi;
            this.OLrzqt = c47576tsi;
            this.EZpvd = twv;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.KWHzl.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.OLrzqt.AEQbTJ(this.EZpvd, this.KWHzl);
        }
    }

    public final void AEQbTJ(tWV twv, C47735tvi c47735tvi) {
        twv.EZpvd().setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        c47735tvi.setPluginContent(twv.EZpvd());
        pUU.KWHzl("GenericInputFragment", "Successfully added plugin view to placeholder");
    }

    public final void zuBGHE() {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupTextInsertIntegration$1$1(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public final void zLjUOn() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupImageItemsObservation$1(this, null), 3, null);
    }

    public final void getFieldNames() {
        if (this.djBIcL.KWHzl()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$restoreStateIfNeeded$1(this, null), 3, null);
        }
    }

    public final java.lang.String values() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        return tnj.valueOf.values();
    }

    public final C47625tte AkhnZx() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        C47625tte c47625tte = tnj.valueOf;
        Intrinsics.checkNotNullExpressionValue(c47625tte, "");
        return c47625tte;
    }

    public final void fJNWhG() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        tnj.valueOf.AkhnZx();
    }

    public final void KWHzl() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        tnj.valueOf.KWHzl();
    }

    public final void AYXKKw() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        tnj.valueOf.AYXKKw();
    }

    public final void valueOf() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        tnj.valueOf.copydefault();
    }

    public final SerializableInputTextState iwGUEr() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        return tnj.valueOf.fetchVPNInfo();
    }

    public final void EZpvd(@NotNull SerializableInputTextState serializableInputTextState) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        try {
            tNJ tnj = this.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            tnj.valueOf.EZpvd(serializableInputTextState);
        } catch (java.lang.Exception e) {
            pUU.copydefault("GenericInputFragment", "Failed to restore text state: " + e);
            e.printStackTrace();
        }
    }

    public final int AhwBna() {
        return fetchVPNInfo().copydefault().getValue().size();
    }

    public final boolean AuCTel() {
        tNJ tnj = this.KWHzl;
        if (tnj == null) {
            Intrinsics.gEmmrt("");
            tnj = null;
        }
        C47735tvi c47735tvi = (C47735tvi) tnj.getRoot().findViewById(C47501trL.TaskDescription.DlABUU);
        Intrinsics.copydefault(c47735tvi);
        return c47735tvi.getVisibility() == 0 && c47735tvi.EZpvd() != null;
    }

    public final C47546tsE.StateListAnimator DbNXlk() {
        return fARcdN().KWHzl().getValue();
    }

    public final void AEQbTJ(C47735tvi c47735tvi) {
        c47735tvi.setTestMode(this.valueOf);
        if (this.valueOf) {
            c47735tvi.setPreviewClickListener(new Function2() { // from class: o.tsz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C47576tsi.OLrzqt(this.KWHzl, (PlanetPublisherPluginType) obj, (tWV) obj2);
                }
            });
        }
    }

    public static final Unit OLrzqt(C47576tsi c47576tsi, PlanetPublisherPluginType planetPublisherPluginType, tWV twv) {
        if (planetPublisherPluginType != null && twv != null) {
            c47576tsi.copydefault(planetPublisherPluginType, twv);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(PlanetPublisherPluginType planetPublisherPluginType, tWV twv) {
        try {
            tWR twr = (tWR) C43251rlk.copydefault(tWR.class);
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            twr.KWHzl(parentFragmentManager, planetPublisherPluginType, twv);
        } catch (java.lang.Exception e) {
            pUU.valueOf("GenericInputFragment", "Debug service not available: " + e.getMessage());
        }
    }

    public final boolean DTwDnp() {
        boolean z = true;
        for (ImageItem imageItem : fetchVPNInfo().copydefault().getValue()) {
            java.lang.String remoteUrl = imageItem.getRemoteUrl();
            if (remoteUrl == null || remoteUrl.length() == 0) {
                C47546tsE c47546tsEFetchVPNInfo = fetchVPNInfo();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C47546tsE.startUpload$default(c47546tsEFetchVPNInfo, contextRequireContext, imageItem, null, 4, null);
                z = false;
            }
        }
        return z;
    }

    public static /* synthetic */ void upLoadActivityImage$default(C47576tsi c47576tsi, C47793twn.Application application, android.graphics.Bitmap bitmap, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        c47576tsi.OLrzqt(application, bitmap);
    }

    public final void OLrzqt(final C47793twn.Application application, android.graphics.Bitmap bitmap) {
        ActivityCardImage activityCardImageAEQbTJ;
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        final C47793twn c47793twn = genericInputParentViewModel instanceof C47793twn ? (C47793twn) genericInputParentViewModel : null;
        if (c47793twn != null && application.values() && application.valueOf() == null && application.AkhnZx() == UploadState.Uploading && (activityCardImageAEQbTJ = application.AEQbTJ()) != null && activityCardImageAEQbTJ.getValue() != null) {
            C47546tsE c47546tsEFARcdN = fARcdN();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c47546tsEFARcdN.KWHzl(fragmentActivityRequireActivity, application.AEQbTJ(), bitmap, new Function1() { // from class: o.tsm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47576tsi.EZpvd(c47793twn, application, (SingleFileUploadUseCase.UploadedFile) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(C47793twn c47793twn, C47793twn.Application application, SingleFileUploadUseCase.UploadedFile uploadedFile) {
        if (uploadedFile != null) {
            java.lang.String imagePath = uploadedFile.getImagePath();
            java.lang.String width = uploadedFile.getWidth();
            java.lang.String str = width == null ? "" : width;
            java.lang.String height = uploadedFile.getHeight();
            java.lang.String str2 = height == null ? "" : height;
            java.lang.String fileSize = uploadedFile.getFileSize();
            c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : UploadState.Success, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : new PublishImageItem(imagePath, (java.lang.String) null, str, str2, (java.lang.String) null, fileSize == null ? "" : fileSize, 18, (DefaultConstructorMarker) null), (4093 & 2048) != 0 ? application.EZpvd : null));
        } else {
            c47793twn.copydefault(application.KWHzl((4093 & 1) != 0 ? application.AYXKKw : false, (4093 & 2) != 0 ? application.AkhnZx : UploadState.Failed, (4093 & 4) != 0 ? application.OLrzqt : null, (4093 & 8) != 0 ? application.KWHzl : null, (4093 & 16) != 0 ? application.fetchVPNInfo : 0, (4093 & 32) != 0 ? application.gEmmrt : null, (4093 & 64) != 0 ? application.AEQbTJ : null, (4093 & 128) != 0 ? application.AhwBna : null, (4093 & 256) != 0 ? application.values : null, (4093 & 512) != 0 ? application.djBIcL : null, (4093 & 1024) != 0 ? application.valueOf : null, (4093 & 2048) != 0 ? application.EZpvd : null));
        }
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt() {
        ActivityCardImage activityCardImageAEQbTJ;
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        C47793twn c47793twn = genericInputParentViewModel instanceof C47793twn ? (C47793twn) genericInputParentViewModel : null;
        if (c47793twn == null) {
            return true;
        }
        C47793twn.Application value = c47793twn.zLjUOn().getValue();
        if (!value.values() || value.valueOf() != null || (activityCardImageAEQbTJ = value.AEQbTJ()) == null || activityCardImageAEQbTJ.getValue() == null) {
            return true;
        }
        c47793twn.copydefault(value.KWHzl((4093 & 1) != 0 ? value.AYXKKw : false, (4093 & 2) != 0 ? value.AkhnZx : UploadState.Uploading, (4093 & 4) != 0 ? value.OLrzqt : null, (4093 & 8) != 0 ? value.KWHzl : null, (4093 & 16) != 0 ? value.fetchVPNInfo : 0, (4093 & 32) != 0 ? value.gEmmrt : null, (4093 & 64) != 0 ? value.AEQbTJ : null, (4093 & 128) != 0 ? value.AhwBna : null, (4093 & 256) != 0 ? value.values : null, (4093 & 512) != 0 ? value.djBIcL : null, (4093 & 1024) != 0 ? value.valueOf : null, (4093 & 2048) != 0 ? value.EZpvd : null));
        return false;
    }

    public final void copydefault() {
        if (this.djBIcL.KWHzl()) {
            fetchVPNInfo().OLrzqt();
            tNJ tnj = this.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            tnj.valueOf.AEQbTJ();
        }
    }

    public final void hDKMBd() {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new GenericInputFragment$setupContentValidationIntegration$1$1(this, genericInputParentViewModel, null), 3, null);
        }
    }

    public final void KWHzl(java.lang.String str) {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            KWHzl(str, genericInputParentViewModel);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                if (this.djBIcL.gEmmrt()) {
                    genericInputParentViewModel.AEQbTJ(ContentValidationType.URL_DETECTION);
                }
                genericInputParentViewModel.AEQbTJ(ContentValidationType.LENGTH_LIMIT);
            } else {
                if (this.djBIcL.gEmmrt()) {
                    AEQbTJ(str, genericInputParentViewModel);
                } else {
                    genericInputParentViewModel.AEQbTJ(ContentValidationType.URL_DETECTION);
                }
                EZpvd(str, genericInputParentViewModel);
            }
        }
    }

    public final void KWHzl(java.lang.String str, GenericInputParentViewModel genericInputParentViewModel) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            int iAhwBna = this.djBIcL.AEQbTJ() ? AhwBna() : 0;
            if (AuCTel()) {
                genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.BLANK_TEXT_HAVE_PLUGIN, ValidationStatus.FAIL, "Tell us why you want to share this", "Text is blank but has plugin data", null, 0L, 48, null));
                genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_ALL);
                return;
            }
            if (this.djBIcL.AEQbTJ() && iAhwBna > 0) {
                genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.BLANK_TEXT_HAVE_IMAGES, ValidationStatus.FAIL, "Tell us why you want to share this", "Text is blank but has " + iAhwBna + " image(s)", null, 0L, 48, null));
                genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_ALL);
                return;
            }
            genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.BLANK_ALL, ValidationStatus.FAIL, "Content cannot be empty", this.djBIcL.AEQbTJ() ? "Both text and images are empty" : "Text is empty and image input is disabled", null, 0L, 48, null));
            genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_TEXT_HAVE_IMAGES);
            genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_TEXT_HAVE_PLUGIN);
            return;
        }
        genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_ALL);
        genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_TEXT_HAVE_IMAGES);
        genericInputParentViewModel.AEQbTJ(ContentValidationType.BLANK_TEXT_HAVE_PLUGIN);
    }

    public final void AEQbTJ(java.lang.String str, GenericInputParentViewModel genericInputParentViewModel) {
        if (!C46454tUy.OLrzqt.KWHzl(str).isEmpty()) {
            genericInputParentViewModel.AEQbTJ(ContentValidationType.URL_DETECTION);
        } else {
            genericInputParentViewModel.AEQbTJ(ContentValidationType.URL_DETECTION);
        }
    }

    public final void EZpvd(java.lang.String str, GenericInputParentViewModel genericInputParentViewModel) {
        int iValueOf = this.djBIcL.valueOf();
        if (iValueOf <= 0) {
            genericInputParentViewModel.AEQbTJ(ContentValidationType.LENGTH_LIMIT);
            return;
        }
        int length = str.length();
        if (length > iValueOf) {
            genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.LENGTH_LIMIT, ValidationStatus.FAIL, "Text exceeds maximum length (" + length + "/" + iValueOf + ")", "Current: " + length + ", Max: " + iValueOf, null, 0L, 48, null));
            return;
        }
        genericInputParentViewModel.AEQbTJ(ContentValidationType.LENGTH_LIMIT);
    }

    public final void OLrzqt(java.util.List<ImageItem> list) {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            if (list.isEmpty()) {
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_FAIL);
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_PROGRESSING);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((ImageItem) obj).getUploadState() == UploadState.Failed) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.IMAGE_UPLOAD_FAIL, ValidationStatus.FAIL, "Image upload failed", arrayList.size() + " image(s) failed to upload", null, 0L, 48, null));
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_PROGRESSING);
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (((ImageItem) obj2).getUploadState() == UploadState.Uploading) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.IMAGE_UPLOAD_PROGRESSING, ValidationStatus.FAIL, "Images are being uploaded", arrayList2.size() + " image(s) currently uploading", null, 0L, 48, null));
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_FAIL);
                return;
            }
            genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_FAIL);
            genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_PROGRESSING);
        }
    }

    public final void copydefault(C47793twn.Application application) {
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            if (!application.values()) {
                genericInputParentViewModel.AEQbTJ(ContentValidationType.ACTIVITY_IMAGE_UPLOAD_FAIL);
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_PROGRESSING);
            } else if (application.AkhnZx() == UploadState.Uploading) {
                genericInputParentViewModel.AEQbTJ(ContentValidationType.ACTIVITY_IMAGE_UPLOAD_FAIL);
                genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.IMAGE_UPLOAD_PROGRESSING, ValidationStatus.FAIL, "Images are being uploaded", "activity card image currently uploading", null, 0L, 48, null));
            } else if (application.valueOf() == null) {
                genericInputParentViewModel.EZpvd(new C47572tse(ContentValidationType.ACTIVITY_IMAGE_UPLOAD_FAIL, ValidationStatus.FAIL, "Image upload failed", "activity card image failed to upload", null, 0L, 48, null));
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_PROGRESSING);
            } else {
                genericInputParentViewModel.AEQbTJ(ContentValidationType.ACTIVITY_IMAGE_UPLOAD_FAIL);
                genericInputParentViewModel.AEQbTJ(ContentValidationType.IMAGE_UPLOAD_PROGRESSING);
            }
        }
    }

    public final void OLrzqt(java.lang.String str) {
        GenericInputParentViewModel.SearchType searchType;
        GenericInputParentViewModel genericInputParentViewModel = this.gEmmrt;
        if (genericInputParentViewModel != null) {
            tNJ tnj = this.KWHzl;
            if (tnj == null) {
                Intrinsics.gEmmrt("");
                tnj = null;
            }
            int iAhwBna = tnj.valueOf.AhwBna();
            if (iAhwBna > 0) {
                int iLastIndexOf$default = this.djBIcL.EZpvd() ? StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, '$', iAhwBna - 1, false, 4, (java.lang.Object) null) : -1;
                int iLastIndexOf$default2 = this.djBIcL.copydefault() ? StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, '#', iAhwBna - 1, false, 4, (java.lang.Object) null) : -1;
                if (iLastIndexOf$default > iLastIndexOf$default2) {
                    searchType = GenericInputParentViewModel.SearchType.TOKEN;
                } else {
                    if (iLastIndexOf$default2 <= iLastIndexOf$default) {
                        return;
                    }
                    int i = iLastIndexOf$default2;
                    searchType = GenericInputParentViewModel.SearchType.TOPIC;
                    iLastIndexOf$default = i;
                }
                java.lang.String strSubstring = str.substring(iLastIndexOf$default + 1, iAhwBna);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                genericInputParentViewModel.EZpvd(strSubstring, searchType);
            }
        }
    }
}
