package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedNetworksBottomSheet$initViewState$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16025ecD extends wXX {
    public C16526elb AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.copydefault;
    }

    public C16025ecD() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C16029ecH.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedNetworksBottomSheet$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.ConnectedNetworksBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.ecz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16025ecD.AEQbTJ(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16029ecH OLrzqt() {
        return (C16029ecH) this.OLrzqt.getValue();
    }

    public static final C16029ecH AEQbTJ(C16025ecD c16025ecD, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.content.Context contextRequireContext = c16025ecD.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC13426dKx interfaceC13426dKxEZpvd = C13458dMb.EZpvd(contextRequireContext);
        return new C16029ecH(interfaceC13426dKxEZpvd.OcIXYQ(), interfaceC13426dKxEZpvd.ORxRYg(), interfaceC13426dKxEZpvd.wlaJM(), interfaceC13426dKxEZpvd.fJNWhG(), interfaceC13426dKxEZpvd.DTwDnp(), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(5);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = C16526elb.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        copydefault();
    }

    public final void copydefault() {
        Activity activity = new Activity(null, 1, 0 == true ? 1 : 0);
        C16526elb c16526elb = this.AEQbTJ;
        if (c16526elb == null) {
            Intrinsics.gEmmrt("");
            c16526elb = null;
        }
        c16526elb.EZpvd.setAdapter(activity);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConnectedNetworksBottomSheet$initViewState$1(this, activity, null), 3, null);
    }

    /* JADX INFO: renamed from: o.ecD$Activity */
    public static final class Activity extends RecyclerView.Adapter<Application> {
        public java.util.List<C10854bwM> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:76)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.bwM>):void (m)] (LINE:75) call: o.ecD.Activity.<init>(java.util.List):void type: THIS */
        public /* synthetic */ Activity(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }

        public Activity(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        /* JADX INFO: renamed from: o.ecD$Activity$Application */
        public static final class Application extends RecyclerView.ViewHolder {
            public final C16734epX copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull C16734epX c16734epX) {
                super(c16734epX.getRoot());
                Intrinsics.checkNotNullParameter(c16734epX, "");
                this.copydefault = c16734epX;
            }

            public final void copydefault(@NotNull C10854bwM c10854bwM) {
                Intrinsics.checkNotNullParameter(c10854bwM, "");
                C16734epX c16734epX = this.copydefault;
                android.widget.ImageView imageView = c16734epX.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C14725dqq.loadFixSizeBorderImage$default(imageView, c10854bwM.AYXKKw(), C52761wXj.TaskDescription.fERRXa, 1.0f, 48.0f, 0, false, 48, null);
                c16734epX.EZpvd.setText(c10854bwM.djBIcL());
            }
        }

        public final void KWHzl(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16734epX c16734epXEZpvd = C16734epX.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16734epXEZpvd, "");
            return new Application(c16734epXEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.copydefault(this.copydefault.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }
    }

    public static final ViewModelProvider.Factory AEQbTJ(final C16025ecD c16025ecD) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16029ecH.class), new Function1() { // from class: o.ecA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16025ecD.AEQbTJ(this.AEQbTJ, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
