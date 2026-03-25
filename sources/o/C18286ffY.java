package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.home.walletconnect.ConnectedNetworksBottomSheet$initViewState$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18286ffY extends wXX {
    public final InterfaceC56387yDm KWHzl;
    public C16526elb OLrzqt;
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.copydefault;
    }

    public C18286ffY() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18347fgg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.ConnectedNetworksBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.ConnectedNetworksBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.ConnectedNetworksBottomSheet$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18347fgg OLrzqt() {
        return (C18347fgg) this.KWHzl.getValue();
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
        this.OLrzqt = C16526elb.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        TaskDescription taskDescription = new TaskDescription(null, 1, 0 == true ? 1 : 0);
        C16526elb c16526elb = this.OLrzqt;
        if (c16526elb == null) {
            Intrinsics.gEmmrt("");
            c16526elb = null;
        }
        c16526elb.EZpvd.setAdapter(taskDescription);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConnectedNetworksBottomSheet$initViewState$1(this, taskDescription, null), 3, null);
    }

    /* JADX INFO: renamed from: o.ffY$TaskDescription */
    public static final class TaskDescription extends RecyclerView.Adapter<StateListAnimator> {
        public java.util.List<C10854bwM> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:57)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.bwM>):void (m)] (LINE:56) call: o.ffY.TaskDescription.<init>(java.util.List):void type: THIS */
        public /* synthetic */ TaskDescription(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }

        public TaskDescription(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        /* JADX INFO: renamed from: o.ffY$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public final C16734epX KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull C16734epX c16734epX) {
                super(c16734epX.getRoot());
                Intrinsics.checkNotNullParameter(c16734epX, "");
                this.KWHzl = c16734epX;
            }

            public final void EZpvd(@NotNull C10854bwM c10854bwM) {
                Intrinsics.checkNotNullParameter(c10854bwM, "");
                C16734epX c16734epX = this.KWHzl;
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
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16734epX c16734epXEZpvd = C16734epX.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16734epXEZpvd, "");
            return new StateListAnimator(c16734epXEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.EZpvd(this.copydefault.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }
    }
}
