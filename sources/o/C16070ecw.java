package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedDAppDetailsBottomSheet$collectViewState$1;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16070ecw extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C16545elu KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public C16070ecw() {
        Function0 function0 = new Function0() { // from class: o.ecx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16070ecw.EZpvd(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedDAppDetailsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedDAppDetailsBottomSheet$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C16029ecH.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedDAppDetailsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedDAppDetailsBottomSheet$special$$inlined$viewModels$default$4
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
        this.OLrzqt = true;
    }

    /* JADX INFO: renamed from: o.ecw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ecw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C16070ecw AEQbTJ(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C16070ecw c16070ecw = new C16070ecw();
            c16070ecw.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("connectType", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt(CoreNetworkModuleKt.KEY_CLIENT_ID, str)));
            return c16070ecw;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16029ecH KWHzl() {
        return (C16029ecH) this.AEQbTJ.getValue();
    }

    public static final C16029ecH OLrzqt(C16070ecw c16070ecw, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.content.Context contextRequireContext = c16070ecw.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC13426dKx interfaceC13426dKxEZpvd = C13458dMb.EZpvd(contextRequireContext);
        return new C16029ecH(interfaceC13426dKxEZpvd.OcIXYQ(), interfaceC13426dKxEZpvd.ORxRYg(), interfaceC13426dKxEZpvd.wlaJM(), interfaceC13426dKxEZpvd.fJNWhG(), interfaceC13426dKxEZpvd.DTwDnp(), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
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
        this.KWHzl = C16545elu.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        EZpvd();
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConnectedDAppDetailsBottomSheet$collectViewState$1(this, null), 3, null);
    }

    public final void EZpvd(java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, java.util.List<C10854bwM> list) {
        C16545elu c16545elu = this.KWHzl;
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
        recyclerView.setAdapter(new Activity(list));
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(32.0f, context);
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        recyclerView.addItemDecoration(new SpacingItemDecoration(iCopydefault, C55298xhM.copydefault(16.0f, context2)));
        C52794wYp c52794wYp = c16545elu.AEQbTJ;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ecw$Activity */
    public static final class Activity extends RecyclerView.Adapter<C0837Activity> {
        public final java.util.List<C10854bwM> AEQbTJ;

        public Activity(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        /* JADX INFO: renamed from: o.ecw$Activity$Activity, reason: collision with other inner class name */
        public static final class C0837Activity extends RecyclerView.ViewHolder {
            public final C16876esG AEQbTJ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0837Activity(@NotNull C16876esG c16876esG) {
                super(c16876esG.getRoot());
                Intrinsics.checkNotNullParameter(c16876esG, "");
                this.AEQbTJ = c16876esG;
            }

            public final void copydefault(@NotNull C10854bwM c10854bwM) {
                Intrinsics.checkNotNullParameter(c10854bwM, "");
                android.widget.ImageView imageView = this.AEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C57659ymb.KWHzl(imageView, c10854bwM.AYXKKw(), C52761wXj.TaskDescription.aHXSQp);
                this.AEQbTJ.EZpvd.setText(c10854bwM.djBIcL());
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public C0837Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16876esG c16876esGOLrzqt = C16876esG.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16876esGOLrzqt, "");
            return new C0837Activity(c16876esGOLrzqt);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0837Activity c0837Activity, int i) {
            Intrinsics.checkNotNullParameter(c0837Activity, "");
            c0837Activity.copydefault(this.AEQbTJ.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }
    }

    /* JADX INFO: renamed from: o.ecw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C16070ecw EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C16070ecw c16070ecw) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c16070ecw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl().gEmmrt();
            }
        }
    }

    public static final ViewModelProvider.Factory EZpvd(final C16070ecw c16070ecw) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16029ecH.class), new Function1() { // from class: o.ecv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16070ecw.OLrzqt(this.KWHzl, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
