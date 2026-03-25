package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectDetailsBottomSheet$collectViewState$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectDetailsBottomSheet$initParams$1;
import com.reown.android.push.notifications.PushMessagingService;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC18445fiY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18348fgh extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public C16545elu EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AEQbTJ;
    }

    public C18348fgh() {
        Function0 function0 = new Function0() { // from class: o.fgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18348fgh.KWHzl();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectDetailsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectDetailsBottomSheet$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18347fgg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectDetailsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectDetailsBottomSheet$special$$inlined$viewModels$default$4
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
        this.AEQbTJ = true;
    }

    /* JADX INFO: renamed from: o.fgh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fgh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C18348fgh EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18348fgh c18348fgh = new C18348fgh();
            c18348fgh.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PushMessagingService.KEY_TOPIC, str)));
            return c18348fgh;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18347fgg OLrzqt() {
        return (C18347fgg) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18347fgg AEQbTJ(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C18347fgg(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C16545elu.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        EZpvd();
        copydefault();
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletConnectDetailsBottomSheet$collectViewState$1(this, null), 3, null);
    }

    private final void copydefault() {
        android.content.Context context = getContext();
        android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application == null) {
            return;
        }
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString(PushMessagingService.KEY_TOPIC, "") : null;
        if (string == null) {
            string = "";
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletConnectDetailsBottomSheet$initParams$1(this, string, application, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, java.util.List<C10854bwM> list) {
        C16545elu c16545elu = this.EZpvd;
        if (c16545elu == null) {
            Intrinsics.gEmmrt("");
            c16545elu = null;
        }
        android.widget.ImageView imageView = c16545elu.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14725dqq.loadFixSizeBorderImage$default(imageView, str, C13754dXa.Activity.aKErDB, 0.0f, 80.0f, 0, false, 48, null);
        c16545elu.valueOf.setText(getString(C13754dXa.FragmentManager.getIconBitmap));
        c16545elu.AhwBna.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.getMediaDescription, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("dappUrl", str2), C56390yDp.OLrzqt("wallet", charSequence))));
        android.view.View view = c16545elu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(list.size() > 1 ? 0 : 8);
        RecyclerView recyclerView = c16545elu.OLrzqt;
        Intrinsics.copydefault(recyclerView);
        recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        recyclerView.setAdapter(new StateListAnimator(list));
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(32.0f, context);
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        recyclerView.addItemDecoration(new SpacingItemDecoration(iCopydefault, C55298xhM.copydefault(16.0f, context2)));
        C52794wYp c52794wYp = c16545elu.AEQbTJ;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fgh$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.Adapter<Activity> {
        public final java.util.List<C10854bwM> OLrzqt;

        public StateListAnimator(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        /* JADX INFO: renamed from: o.fgh$StateListAnimator$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public final C16876esG copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull C16876esG c16876esG) {
                super(c16876esG.getRoot());
                Intrinsics.checkNotNullParameter(c16876esG, "");
                this.copydefault = c16876esG;
            }

            public final void EZpvd(@NotNull C10854bwM c10854bwM) {
                Intrinsics.checkNotNullParameter(c10854bwM, "");
                android.widget.ImageView imageView = this.copydefault.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C57659ymb.KWHzl(imageView, c10854bwM.AYXKKw(), C52761wXj.TaskDescription.aHXSQp);
                this.copydefault.EZpvd.setText(c10854bwM.djBIcL());
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16876esG c16876esGOLrzqt = C16876esG.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16876esGOLrzqt, "");
            return new Activity(c16876esGOLrzqt);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.EZpvd(this.OLrzqt.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }
    }

    /* JADX INFO: renamed from: o.fgh$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18348fgh EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18348fgh c18348fgh) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c18348fgh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.OLrzqt().AEQbTJ();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory KWHzl() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C18347fgg.class), new Function1() { // from class: o.fgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18348fgh.AEQbTJ((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
