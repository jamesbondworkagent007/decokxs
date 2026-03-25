package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$imagePicker$1$1;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$listAdapter$2$2$1;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$10;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$2;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$3;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$4;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$5;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$6;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$7;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$8;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$9;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$proceedImageProcessing$1;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel.StickerBoardViewModel;
import com.okinc.im.imui.sticker.model.StickerModel;
import com.okinc.im.imui.sticker.model.StickerPackModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.ActivityC37628oxS;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36965oks extends AbstractC36967oku {
    public final int AhwBna = C35399nuc.Dialog.run;
    public nKF AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> DbNXlk;
    public InterfaceC58217yxC djBIcL;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final FragmentManager isConnected;
    public final AbstractC55115xdp valueOf;
    public final ActivityResultLauncher<android.content.Intent> values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    public static final void AhwBna() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void KWHzl(InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C36965oks() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StickerBoardViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = new FragmentManager();
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.okw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36965oks.fetchVPNInfo(this.KWHzl);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.okt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36965oks.isConnected(this.OLrzqt);
            }
        });
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.okB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C36965oks.OLrzqt(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.okF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C36965oks.copydefault(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.values = activityResultLauncherRegisterForActivityResult2;
        this.valueOf = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.okE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C36965oks.copydefault(this.OLrzqt, (android.net.Uri) obj);
            }
        });
    }

    public final StickerBoardViewModel gEmmrt() {
        return (StickerBoardViewModel) this.fJNWhG.getValue();
    }

    /* JADX INFO: renamed from: o.oks$FragmentManager */
    public static final class FragmentManager extends RecyclerView.OnScrollListener {
        public FragmentManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            if (((GridLayoutManager) layoutManager).findLastVisibleItemPosition() >= r2.getItemCount() - 26) {
                C36965oks.this.gEmmrt().KWHzl();
            }
        }
    }

    public final C36931okK djBIcL() {
        return (C36931okK) this.fetchVPNInfo.getValue();
    }

    public static final C36931okK fetchVPNInfo(final C36965oks c36965oks) {
        return new C36931okK(new Function1() { // from class: o.okJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36965oks.copydefault(this.AEQbTJ, (StickerPackModel) obj);
            }
        });
    }

    public static final Unit copydefault(C36965oks c36965oks, StickerPackModel stickerPackModel) {
        Intrinsics.checkNotNullParameter(stickerPackModel, "");
        c36965oks.gEmmrt().copydefault(stickerPackModel);
        return Unit.INSTANCE;
    }

    public final C37623oxN valueOf() {
        return (C37623oxN) this.gEmmrt.getValue();
    }

    public static final C37623oxN isConnected(final C36965oks c36965oks) {
        return new C37623oxN(new Function1() { // from class: o.okC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36965oks.copydefault(this.AEQbTJ, (StickerModel) obj);
            }
        }, new Function0() { // from class: o.okG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36965oks.values(this.OLrzqt);
            }
        });
    }

    public static final Unit copydefault(C36965oks c36965oks, StickerModel stickerModel) {
        Intrinsics.checkNotNullParameter(stickerModel, "");
        C32866mlf.onEvent$default("IM_Sticker_Send_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C35290nsY.copydefault(c36965oks, new GeneralAction.SendMessages(yDY.copydefault(new SendMessageRequestParam.Sticker(stickerModel.KWHzl(), stickerModel.OLrzqt()))));
        return Unit.INSTANCE;
    }

    public static final Unit values(C36965oks c36965oks) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c36965oks), null, null, new StickerBoardFragment$listAdapter$2$2$1(c36965oks, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C36965oks c36965oks, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 10001) {
            android.content.Intent data = activityResult.getData();
            C55326xho.toastWithSuccessfulIcon$default(pTD.getFormattedQuantityString$default(c36965oks, C35399nuc.Fragment.zsXlph, data != null ? data.getIntExtra("NUMBER_OF_STICKERS", 0) : 0, (java.util.Map) null, 4, (java.lang.Object) null), 0, 1, (java.lang.Object) null);
            StickerPackModel value = c36965oks.gEmmrt().AYXKKw().getValue();
            if (value != null) {
                c36965oks.gEmmrt().copydefault(value);
            }
        }
    }

    public static final void copydefault(C36965oks c36965oks, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 10002) {
            C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.aVPvww, 0, 1, (java.lang.Object) null);
            StickerPackModel value = c36965oks.gEmmrt().AYXKKw().getValue();
            if (value != null) {
                c36965oks.gEmmrt().copydefault(value);
            }
        }
    }

    public static final void copydefault(C36965oks c36965oks, android.net.Uri uri) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c36965oks), null, null, new StickerBoardFragment$imagePicker$1$1(c36965oks, uri, null), 3, null);
    }

    public final boolean AEQbTJ(android.content.Context context, android.net.Uri uri) {
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) C37653oxr.OLrzqt.AEQbTJ()), C37658oxw.EZpvd.EZpvd(context, uri));
    }

    /* JADX INFO: renamed from: o.oks$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C36965oks copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C36965oks c36965oks) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c36965oks;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.gEmmrt().isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.oks$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C36965oks OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C36965oks c36965oks) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c36965oks;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.valueOf.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.oks$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C36965oks AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C36965oks c36965oks) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c36965oks;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    ActivityResultLauncher activityResultLauncher = this.AEQbTJ.DbNXlk;
                    ActivityC37628oxS.Activity activity = ActivityC37628oxS.Companion;
                    StickerPackModel value = this.AEQbTJ.gEmmrt().AYXKKw().getValue();
                    java.lang.String strKWHzl = value != null ? value.KWHzl() : null;
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    activityResultLauncher.launch(activity.EZpvd(context, strKWHzl));
                }
            }
        }
    }

    public final void EZpvd(android.net.Uri uri) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerBoardFragment$proceedImageProcessing$1(this, uri, null), 3, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nKF nkfAEQbTJ = nKF.AEQbTJ(layoutInflater, viewGroup, false);
        this.AkhnZx = nkfAEQbTJ;
        if (nkfAEQbTJ != null) {
            return nkfAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        nKF nkf = this.AkhnZx;
        if (nkf != null) {
            C34042nPg c34042nPg = nkf.copydefault;
            c34042nPg.copydefault.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OqIZjC));
            c34042nPg.OLrzqt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QUeTTI));
            c34042nPg.EZpvd.setText(C35399nuc.LoaderManager.values);
            C52794wYp c52794wYp = c34042nPg.EZpvd;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
            C34042nPg c34042nPg2 = nkf.AEQbTJ;
            c34042nPg2.copydefault.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QgUVrU));
            c34042nPg2.OLrzqt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.RxVVQC));
            c34042nPg2.EZpvd.setText(C35399nuc.LoaderManager.onServiceDisconnected);
            C52794wYp c52794wYp2 = c34042nPg2.EZpvd;
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
            android.widget.ImageView imageView = nkf.AYXKKw;
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
            C33546myW c33546myW = nkf.valueOf;
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.okx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C36965oks.KWHzl(interfaceC57934yrl);
                }
            });
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.okA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C36965oks.OLrzqt(this.OLrzqt, interfaceC57934yrl);
                }
            });
            RecyclerView recyclerView = nkf.isConnected;
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(valueOf());
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new Activity(nkf, this, recyclerView));
            recyclerView.addOnScrollListener(this.isConnected);
            RecyclerView recyclerView2 = nkf.fetchVPNInfo;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.setAdapter(djBIcL());
        }
        AYXKKw();
    }

    public static final void OLrzqt(C36965oks c36965oks, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c36965oks.gEmmrt().KWHzl();
    }

    /* JADX INFO: renamed from: o.oks$Activity */
    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C36965oks AEQbTJ;
        public int EZpvd;
        public final /* synthetic */ RecyclerView KWHzl;
        public final /* synthetic */ nKF copydefault;

        public Activity(nKF nkf, C36965oks c36965oks, RecyclerView recyclerView) {
            this.copydefault = nkf;
            this.AEQbTJ = c36965oks;
            this.KWHzl = recyclerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int width = this.copydefault.isConnected.getWidth();
            if (width != this.EZpvd) {
                this.EZpvd = width;
                C37623oxN c37623oxNValueOf = this.AEQbTJ.valueOf();
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                RecyclerView recyclerView = this.copydefault.isConnected;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                c37623oxNValueOf.KWHzl(context, recyclerView, this.EZpvd);
            }
        }
    }

    private final void AYXKKw() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33730nDs.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.oky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36965oks.AEQbTJ(this.KWHzl, (C33730nDs) obj);
            }
        };
        this.djBIcL = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.okz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C36965oks.EZpvd(function1, obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerBoardFragment$observeData$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerBoardFragment$observeData$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerBoardFragment$observeData$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerBoardFragment$observeData$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StickerBoardFragment$observeData$6(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().valueOf(), new StickerBoardFragment$observeData$7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().gEmmrt(), new StickerBoardFragment$observeData$8(null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().fetchVPNInfo(), new StickerBoardFragment$observeData$9(null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().AhwBna(), new StickerBoardFragment$observeData$10(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C36965oks c36965oks, C33730nDs c33730nDs) {
        StickerPackModel value = c36965oks.gEmmrt().AYXKKw().getValue();
        if (value != null && value.OLrzqt()) {
            StickerBoardViewModel stickerBoardViewModelGEmmrt = c36965oks.gEmmrt();
            StickerPackModel value2 = c36965oks.gEmmrt().AYXKKw().getValue();
            Intrinsics.copydefault(value2);
            stickerBoardViewModelGEmmrt.copydefault(value2);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final android.net.Uri uri) {
        if (getContext() != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.onServiceConnected);
            viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.UimiPO);
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.QqiRNA, new View.OnClickListener() { // from class: o.okI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36965oks.copydefault(this.copydefault, uri, viewOnClickListenerC54939xaY, view);
                }
            });
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void copydefault(C36965oks c36965oks, android.net.Uri uri, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c36965oks.EZpvd(uri);
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        nKF nkf = this.AkhnZx;
        if (nkf != null && (recyclerView = nkf.isConnected) != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.okD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C36965oks.AhwBna();
                }
            });
            recyclerView.removeOnScrollListener(this.isConnected);
        }
        this.AkhnZx = null;
    }

    /* JADX INFO: renamed from: o.oks$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oks.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C36965oks OLrzqt() {
            return new C36965oks();
        }
    }
}
