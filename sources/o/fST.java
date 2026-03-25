package o;

import android.view.GestureDetector;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;
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
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$observeViewModel$1;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$onCreateContent$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17792fSl;
import o.C12827cuN;
import o.C13754dXa;
import o.C14140dfo;
import o.fTF;
import o.fVU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fST extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final long AEQbTJ;
    public SimpleExoPlayer AYXKKw;
    public SimpleExoPlayer AhwBna;
    public boolean AkhnZx;
    public fTF.Activity AuCTel;
    public boolean DbNXlk;
    public C16485ekn KWHzl;
    public ActivityResultLauncher<ActivateTeeGuideModel> OLrzqt;
    public wYF copydefault;
    public java.util.List<ActionBar> djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public ActivityResultLauncher<java.lang.String> fIwbmz;
    public Function1<? super WalletCreatedData, Unit> fetchVPNInfo;
    public final boolean gEmmrt = true;
    public Function0<Unit> isConnected;
    public boolean valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super WalletCreatedData, Unit> function1) {
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.gEmmrt;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    public fST() {
        Function0 function0 = new Function0() { // from class: o.fTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fST.values(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fTF.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideBottomSheet$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.fSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fST.OLrzqt();
            }
        });
        this.djBIcL = yDY.AhwBna();
        this.AEQbTJ = 300L;
    }

    public final fTF AEQbTJ() {
        return (fTF) this.fARcdN.getValue();
    }

    public static final fTF copydefault(fST fst, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.os.Bundle arguments = fst.getArguments();
        return new fTF(arguments != null ? (ActivateTeeGuideModel) arguments.getParcelable("tee_account_info") : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xWJ valueOf() {
        return (xWJ) this.values.getValue();
    }

    public static final xWJ OLrzqt() {
        return (xWJ) C43251rlk.copydefault(xWJ.class);
    }

    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.KWHzl;
            }
            if ((i & 4) != 0) {
                str3 = actionBar.EZpvd;
            }
            return actionBar.KWHzl(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new ActionBar(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GuidePage(videoName=" + this.AEQbTJ + ", title=" + this.KWHzl + ", desc=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.EZpvd = str3;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.fIwbmz = registerForActivityResult(fVU.TaskDescription.copydefault, new ActivityResultCallback() { // from class: o.fTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fST.copydefault(this.copydefault, (ActivityResult) obj);
            }
        });
        this.OLrzqt = registerForActivityResult(ActivityC17792fSl.ActionBar.KWHzl, new ActivityResultCallback() { // from class: o.fTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fST.EZpvd(this.KWHzl, (ActivityResult) obj);
            }
        });
    }

    public static final void copydefault(fST fst, ActivityResult activityResult) {
        fst.dismissAllowingStateLoss();
    }

    public static final void EZpvd(fST fst, ActivityResult activityResult) {
        fst.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        djBIcL();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        copydefault();
        super.onStop();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C17922fXg.AEQbTJ(this);
        C16485ekn c16485eknAEQbTJ = C16485ekn.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.KWHzl = c16485eknAEQbTJ;
        if (c16485eknAEQbTJ == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ActivateSAGuideBottomSheet$onCreateContent$1(this, c16485eknAEQbTJ, null), 3, null);
        AhwBna();
    }

    private final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ActivateSAGuideBottomSheet$observeViewModel$1(this, null), 3, null);
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ fST KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, fST fst) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = fst;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.djBIcL();
                this.KWHzl.AEQbTJ().valueOf();
            }
        }
    }

    public final void EZpvd(fTF.TaskDescription taskDescription) {
        if (taskDescription instanceof fTF.TaskDescription.StateListAnimator) {
            dismissAllowingStateLoss();
        } else if (taskDescription instanceof fTF.TaskDescription.Application) {
            KWHzl(((fTF.TaskDescription.Application) taskDescription).EZpvd());
        } else {
            if (!(taskDescription instanceof fTF.TaskDescription.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(((fTF.TaskDescription.Activity) taskDescription).copydefault());
        }
    }

    public final void AEQbTJ(final ActivateTeeGuideModel activateTeeGuideModel) {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14513dmq(supportFragmentManager, "ActivateSAGuideBottomSheet", new Function1() { // from class: o.fSY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fST.copydefault(activateTeeGuideModel, activity, this, (java.lang.String) obj);
            }
        }, null).EZpvd();
    }

    public static final Unit copydefault(ActivateTeeGuideModel activateTeeGuideModel, FragmentActivity fragmentActivity, final fST fst, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14140dfo.TaskDescription taskDescription = C14140dfo.Companion;
        C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null).OLrzqt(activateTeeGuideModel.getRootWalletId(), C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null), null, activateTeeGuideModel.getAddressIndex() + 1, false, 5, null), activateTeeGuideModel.getAddressIndex(), str, fragmentActivity.getSupportFragmentManager(), new C13786dYf(false), (192 & 64) != 0, (192 & 128) != 0, (Function1<? super AbstractC12782ctV, Unit>) new Function1() { // from class: o.fSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fST.copydefault(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(fST fst, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        Function1<? super WalletCreatedData, Unit> function1 = fst.fetchVPNInfo;
        if (function1 != null) {
            function1.invoke(C13788dYh.copydefault(abstractC12782ctV));
        }
        if (!abstractC12782ctV.RJOkX()) {
            ActivityResultLauncher<ActivateTeeGuideModel> activityResultLauncher = fst.OLrzqt;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, true, (java.lang.String) null, 0, 0, 0, "sa_wallet_onboarding", 122, (DefaultConstructorMarker) null));
            }
        } else {
            fst.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        this.copydefault = wyf;
        wyf.setPrimaryText(C33070mpX.AYXKKw(AEQbTJ().OLrzqt().getValue().intValue()));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new FragmentManager(c52794wYpCopydefault, 500L, this));
        }
    }

    public final void EZpvd(android.content.Context context, C16485ekn c16485ekn) {
        if (this.AYXKKw == null) {
            this.AYXKKw = new SimpleExoPlayer.Builder(context).build();
        }
        if (this.AhwBna == null) {
            this.AhwBna = new SimpleExoPlayer.Builder(context).build();
        }
        c16485ekn.valueOf.setPlayer(this.AYXKKw);
        c16485ekn.AEQbTJ.setPlayer(this.AhwBna);
        c16485ekn.valueOf.setKeepContentOnPlayerReset(false);
        c16485ekn.AEQbTJ.setKeepContentOnPlayerReset(false);
        c16485ekn.AkhnZx.setAspectRatio(0.9375f);
        SimpleExoPlayer simpleExoPlayer = this.AYXKKw;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setRepeatMode(1);
            simpleExoPlayer.addListener(new Activity(simpleExoPlayer));
            android.net.Uri uri = android.net.Uri.parse(EZpvd("onboarding"));
            Intrinsics.checkNotNullExpressionValue(uri, "");
            simpleExoPlayer.setMediaItem(MediaItem.fromUri(uri));
            simpleExoPlayer.prepare();
            simpleExoPlayer.setPlayWhenReady(true);
            simpleExoPlayer.play();
        }
        SimpleExoPlayer simpleExoPlayer2 = this.AhwBna;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.setRepeatMode(0);
            simpleExoPlayer2.addListener(new TaskDescription(simpleExoPlayer2));
        }
    }

    public static final class Activity implements Player.EventListener {
        public final /* synthetic */ SimpleExoPlayer EZpvd;

        public Activity(SimpleExoPlayer simpleExoPlayer) {
            this.EZpvd = simpleExoPlayer;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i) {
            FragmentActivity activity;
            android.view.Window window;
            if (fST.this.isAdded() && i == 3 && (activity = fST.this.getActivity()) != null && (window = activity.getWindow()) != null) {
                window.clearFlags(128);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            if (fST.this.isAdded()) {
                this.EZpvd.clearMediaItems();
            }
        }
    }

    public static final class TaskDescription implements Player.EventListener {
        public final /* synthetic */ SimpleExoPlayer EZpvd;

        public TaskDescription(SimpleExoPlayer simpleExoPlayer) {
            this.EZpvd = simpleExoPlayer;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i) {
            android.view.Window window;
            PlayerView playerView;
            if (fST.this.isAdded()) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.EZpvd.setPlayWhenReady(false);
                    return;
                }
                C16485ekn c16485ekn = fST.this.KWHzl;
                if (c16485ekn != null && (playerView = c16485ekn.AEQbTJ) != null) {
                    playerView.setAlpha(1.0f);
                }
                FragmentActivity activity = fST.this.getActivity();
                if (activity == null || (window = activity.getWindow()) == null) {
                    return;
                }
                window.clearFlags(128);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            if (fST.this.isAdded()) {
                this.EZpvd.clearMediaItems();
            }
        }
    }

    public final void copydefault() {
        fTF.Activity value = AEQbTJ().AEQbTJ().getValue();
        if (value instanceof fTF.Activity.Application) {
            SimpleExoPlayer simpleExoPlayer = this.AYXKKw;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.pause();
                return;
            }
            return;
        }
        if (!(value instanceof fTF.Activity.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleExoPlayer simpleExoPlayer2 = this.AhwBna;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.pause();
        }
    }

    public final void djBIcL() {
        C16485ekn c16485ekn = this.KWHzl;
        if (c16485ekn == null) {
            return;
        }
        c16485ekn.valueOf.setPlayer(this.AYXKKw);
        c16485ekn.AEQbTJ.setPlayer(this.AhwBna);
        fTF.Activity value = AEQbTJ().AEQbTJ().getValue();
        if (value instanceof fTF.Activity.Application) {
            SimpleExoPlayer simpleExoPlayer = this.AhwBna;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.pause();
            }
            SimpleExoPlayer simpleExoPlayer2 = this.AYXKKw;
            if (simpleExoPlayer2 == null) {
                return;
            }
            if (simpleExoPlayer2.getCurrentMediaItem() == null) {
                android.net.Uri uri = android.net.Uri.parse(EZpvd("onboarding"));
                Intrinsics.checkNotNullExpressionValue(uri, "");
                simpleExoPlayer2.setMediaItem(MediaItem.fromUri(uri));
                simpleExoPlayer2.prepare();
            }
            simpleExoPlayer2.setPlayWhenReady(true);
            simpleExoPlayer2.play();
            return;
        }
        if (!(value instanceof fTF.Activity.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleExoPlayer simpleExoPlayer3 = this.AYXKKw;
        if (simpleExoPlayer3 != null) {
            simpleExoPlayer3.pause();
        }
        SimpleExoPlayer simpleExoPlayer4 = this.AhwBna;
        if (simpleExoPlayer4 == null) {
            return;
        }
        if (simpleExoPlayer4.getCurrentMediaItem() == null) {
            AEQbTJ(c16485ekn, ((fTF.Activity.ActionBar) value).AEQbTJ());
        } else {
            simpleExoPlayer4.setPlayWhenReady(true);
            simpleExoPlayer4.play();
        }
    }

    public final void KWHzl(android.content.Context context, C16485ekn c16485ekn) {
        final GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, new Application(context.getResources().getDisplayMetrics().density * 60.0f, context.getResources().getDisplayMetrics().density * 800.0f));
        c16485ekn.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: o.fSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return fST.EZpvd(gestureDetectorCompat, view, motionEvent);
            }
        });
    }

    public static final class Application extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ float AEQbTJ;
        public final /* synthetic */ float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return true;
        }

        public Application(float f, float f2) {
            this.copydefault = f;
            this.AEQbTJ = f2;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
            Intrinsics.checkNotNullParameter(motionEvent2, "");
            if (fST.this.valueOf) {
                return true;
            }
            if (motionEvent == null) {
                return false;
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            float fAbs = java.lang.Math.abs(x);
            float fAbs2 = java.lang.Math.abs(motionEvent2.getY() - motionEvent.getY());
            if (fAbs < this.copydefault || fAbs2 > fAbs || java.lang.Math.abs(f) < this.AEQbTJ) {
                return false;
            }
            fST.this.djBIcL();
            if (x < 0.0f) {
                fST.this.AEQbTJ().KWHzl();
            } else {
                fST.this.AEQbTJ().copydefault();
            }
            return true;
        }
    }

    public static final boolean EZpvd(GestureDetectorCompat gestureDetectorCompat, android.view.View view, android.view.MotionEvent motionEvent) {
        return gestureDetectorCompat.onTouchEvent(motionEvent);
    }

    public final void KWHzl(final ActivateTeeGuideModel activateTeeGuideModel) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(activateTeeGuideModel.getAccountId(), false);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(abstractC58260yxtOLrzqt, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.fSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fST.OLrzqt(this.EZpvd, activateTeeGuideModel, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fTb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fST.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fST.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fST.OLrzqt(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(fST fst, ActivateTeeGuideModel activateTeeGuideModel, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.RJOkX()) {
            if (!abstractC12782ctV.DTwDnp()) {
                ActivityResultLauncher<java.lang.String> activityResultLauncher = fst.fIwbmz;
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(activateTeeGuideModel.getAccountId());
                }
            } else {
                fst.dismissAllowingStateLoss();
            }
        } else {
            ActivityResultLauncher<ActivateTeeGuideModel> activityResultLauncher2 = fst.OLrzqt;
            if (activityResultLauncher2 != null) {
                activityResultLauncher2.launch(activateTeeGuideModel);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(fST fst, java.lang.Throwable th) {
        pUU.AEQbTJ("ActivateSAGuideBottomSheet", "startActivateOrRenewForExistingWallet error", th);
        fst.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void KWHzl(fTF.Activity activity, boolean z) {
        C16485ekn c16485ekn = this.KWHzl;
        if (c16485ekn == null) {
            return;
        }
        if (this.valueOf && z) {
            return;
        }
        java.lang.Object obj = this.AuCTel;
        if (obj == null) {
            obj = fTF.Activity.Application.copydefault;
        }
        if (!Intrinsics.EZpvd(obj, activity) || this.AuCTel == null) {
            this.AuCTel = activity;
            if ((obj instanceof fTF.Activity.Application) && (activity instanceof fTF.Activity.ActionBar)) {
                AEQbTJ(c16485ekn);
                AEQbTJ(c16485ekn, ((fTF.Activity.ActionBar) activity).AEQbTJ());
                SimpleExoPlayer simpleExoPlayer = this.AYXKKw;
                if (simpleExoPlayer != null) {
                    simpleExoPlayer.pause();
                }
                if (z) {
                    ConstraintLayout constraintLayout = c16485ekn.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    ConstraintLayout constraintLayout2 = c16485ekn.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                    AEQbTJ(constraintLayout, constraintLayout2);
                    return;
                }
                c16485ekn.AYXKKw.setVisibility(8);
                c16485ekn.EZpvd.setVisibility(0);
                c16485ekn.AYXKKw.setAlpha(1.0f);
                c16485ekn.EZpvd.setAlpha(1.0f);
                return;
            }
            boolean z2 = obj instanceof fTF.Activity.ActionBar;
            if (z2 && (activity instanceof fTF.Activity.Application)) {
                AEQbTJ(c16485ekn);
                SimpleExoPlayer simpleExoPlayer2 = this.AhwBna;
                if (simpleExoPlayer2 != null) {
                    simpleExoPlayer2.pause();
                }
                SimpleExoPlayer simpleExoPlayer3 = this.AYXKKw;
                if (simpleExoPlayer3 != null) {
                    simpleExoPlayer3.setPlayWhenReady(true);
                }
                SimpleExoPlayer simpleExoPlayer4 = this.AYXKKw;
                if (simpleExoPlayer4 != null) {
                    simpleExoPlayer4.play();
                }
                if (z) {
                    ConstraintLayout constraintLayout3 = c16485ekn.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                    ConstraintLayout constraintLayout4 = c16485ekn.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                    AEQbTJ(constraintLayout3, constraintLayout4);
                    return;
                }
                c16485ekn.EZpvd.setVisibility(8);
                c16485ekn.AYXKKw.setVisibility(0);
                c16485ekn.AYXKKw.setAlpha(1.0f);
                c16485ekn.EZpvd.setAlpha(1.0f);
                return;
            }
            if (z2 && (activity instanceof fTF.Activity.ActionBar)) {
                fTF.Activity.ActionBar actionBar = (fTF.Activity.ActionBar) activity;
                if (((fTF.Activity.ActionBar) obj).AEQbTJ() == actionBar.AEQbTJ()) {
                    return;
                }
                if (z) {
                    KWHzl(c16485ekn, actionBar.AEQbTJ());
                    return;
                } else {
                    AEQbTJ(c16485ekn, actionBar.AEQbTJ());
                    return;
                }
            }
            c16485ekn.AYXKKw.setVisibility(0);
            c16485ekn.EZpvd.setVisibility(8);
            c16485ekn.AYXKKw.setAlpha(1.0f);
            c16485ekn.EZpvd.setAlpha(1.0f);
            AEQbTJ(c16485ekn);
            SimpleExoPlayer simpleExoPlayer5 = this.AhwBna;
            if (simpleExoPlayer5 != null) {
                simpleExoPlayer5.pause();
            }
            SimpleExoPlayer simpleExoPlayer6 = this.AYXKKw;
            if (simpleExoPlayer6 != null) {
                simpleExoPlayer6.setPlayWhenReady(true);
            }
            SimpleExoPlayer simpleExoPlayer7 = this.AYXKKw;
            if (simpleExoPlayer7 != null) {
                simpleExoPlayer7.play();
            }
        }
    }

    public final void AEQbTJ(C16485ekn c16485ekn) {
        c16485ekn.isConnected.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeMenuProvider));
        c16485ekn.gEmmrt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRequestPermissionsResult));
    }

    public final void AEQbTJ(C16485ekn c16485ekn, int i) {
        ActionBar actionBar = (ActionBar) CollectionsKt___CollectionsKt.AkhnZx(this.djBIcL, i);
        if (actionBar == null) {
            return;
        }
        c16485ekn.KWHzl.setSelectedItem(i);
        c16485ekn.AhwBna.setText(actionBar.AEQbTJ());
        c16485ekn.OLrzqt.setText(actionBar.copydefault());
        c16485ekn.djBIcL.setAspectRatio(0.8333333f);
        java.lang.String strEZpvd = EZpvd(actionBar.OLrzqt());
        c16485ekn.AEQbTJ.setAlpha(0.0f);
        SimpleExoPlayer simpleExoPlayer = this.AhwBna;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            android.net.Uri uri = android.net.Uri.parse(strEZpvd);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            simpleExoPlayer.setMediaItem(MediaItem.fromUri(uri));
            simpleExoPlayer.prepare();
            simpleExoPlayer.seekTo(0L);
            simpleExoPlayer.setPlayWhenReady(true);
            simpleExoPlayer.play();
        }
    }

    public final void AEQbTJ(final android.view.View view, android.view.View view2) {
        this.valueOf = true;
        view2.setAlpha(0.0f);
        view2.setVisibility(0);
        view.animate().alpha(0.0f).setDuration(this.AEQbTJ).withEndAction(new java.lang.Runnable() { // from class: o.fTf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fST.OLrzqt(this.OLrzqt, view);
            }
        }).start();
        view2.animate().alpha(1.0f).setDuration(this.AEQbTJ).withEndAction(new java.lang.Runnable() { // from class: o.fTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fST.fetchVPNInfo(this.AEQbTJ);
            }
        }).start();
    }

    public static final void OLrzqt(fST fst, android.view.View view) {
        if (fst.isAdded()) {
            view.setVisibility(8);
            view.setAlpha(1.0f);
        }
    }

    public static final void fetchVPNInfo(fST fst) {
        if (fst.isAdded()) {
            fst.valueOf = false;
        }
    }

    public final void KWHzl(C16485ekn c16485ekn, int i) {
        this.valueOf = true;
        java.util.List listGEmmrt = yDY.gEmmrt(c16485ekn.djBIcL, c16485ekn.AhwBna, c16485ekn.OLrzqt);
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).animate().cancel();
        }
        java.util.Iterator it2 = listGEmmrt.iterator();
        while (it2.hasNext()) {
            ((android.view.View) it2.next()).animate().alpha(0.0f).setDuration(this.AEQbTJ).start();
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ActivateSAGuideBottomSheet$fadeGuideContentAndSwap$3(this, c16485ekn, i, listGEmmrt, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String str2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "onboarding")) {
            str2 = this.AkhnZx ? "_night.mp4" : ".mp4";
        } else {
            boolean z = this.AkhnZx;
            if (z && !this.DbNXlk) {
                str2 = "_en_night.mp4";
            } else if (!z || !this.DbNXlk) {
                if (!z && !this.DbNXlk) {
                    str2 = "_en.mp4";
                }
            }
        }
        return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/video/sa2_guide_" + str + str2;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fST.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final fST KWHzl(@NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            fST fst = new fST();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tee_account_info", activateTeeGuideModel);
            fst.setArguments(bundle);
            return fst;
        }
    }

    public final java.util.List<ActionBar> EZpvd() {
        return yDY.gEmmrt(new ActionBar("scan_chain", C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnConfigurationChangedListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPreparePanel)), new ActionBar("flow_window", C33070mpX.AYXKKw(C13754dXa.FragmentManager.peekAvailableContext), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRetainCustomNonConfigurationInstance)), new ActionBar("follow", C33070mpX.AYXKKw(C13754dXa.FragmentManager.onTrimMemory), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMenuItemSelected)), new ActionBar("fast_trade", C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerForActivityResult), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPictureInPictureModeChanged)));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.isConnected;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SimpleExoPlayer simpleExoPlayer = this.AYXKKw;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
        }
        SimpleExoPlayer simpleExoPlayer2 = this.AYXKKw;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.release();
        }
        this.AYXKKw = null;
        SimpleExoPlayer simpleExoPlayer3 = this.AhwBna;
        if (simpleExoPlayer3 != null) {
            simpleExoPlayer3.stop();
        }
        SimpleExoPlayer simpleExoPlayer4 = this.AhwBna;
        if (simpleExoPlayer4 != null) {
            simpleExoPlayer4.release();
        }
        this.AhwBna = null;
        this.KWHzl = null;
        this.copydefault = null;
        this.djBIcL = yDY.AhwBna();
        this.valueOf = false;
        this.AuCTel = null;
    }

    public static final ViewModelProvider.Factory values(final fST fst) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fTF.class), new Function1() { // from class: o.fTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fST.copydefault(this.KWHzl, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
