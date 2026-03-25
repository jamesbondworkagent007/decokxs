package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.history.fragment.TypesSelectFragment$initData$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eJp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C15472eJp extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC16618enN KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eJv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15472eJp.copydefault(this.copydefault);
        }
    });

    public C15472eJp() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C15516eLf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.fragment.TypesSelectFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.fragment.TypesSelectFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.fragment.TypesSelectFragment$special$$inlined$activityViewModels$default$3
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
    public final C15516eLf copydefault() {
        return (C15516eLf) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C59534zip EZpvd() {
        return (C59534zip) this.OLrzqt.getValue();
    }

    public static final C59534zip copydefault(C15472eJp c15472eJp) {
        return c15472eJp.OLrzqt();
    }

    /* JADX INFO: renamed from: o.eJp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eJp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = (AbstractC16618enN) DataBindingUtil.inflate(getCustomLayoutInflater(), C13754dXa.TaskDescription.invokespecialaKhcqp, constraintLayout, true);
        KWHzl();
        AEQbTJ();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.eJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15472eJp.gEmmrt(this.EZpvd);
            }
        });
    }

    public static final void gEmmrt(C15472eJp c15472eJp) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15472eJp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C15516eLf c15516eLfCopydefault = copydefault();
        C15516eLf c15516eLfCopydefault2 = copydefault();
        c15516eLfCopydefault.OLrzqt(c15516eLfCopydefault2 != null ? c15516eLfCopydefault2.OLrzqt() : null);
    }

    private final void AEQbTJ() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new TypesSelectFragment$initData$1(this, null));
    }

    private final void KWHzl() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AbstractC16618enN abstractC16618enN = this.KWHzl;
        if (abstractC16618enN != null && (recyclerView2 = abstractC16618enN.copydefault) != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        AbstractC16618enN abstractC16618enN2 = this.KWHzl;
        if (abstractC16618enN2 == null || (recyclerView = abstractC16618enN2.copydefault) == null) {
            return;
        }
        recyclerView.setAdapter(EZpvd());
    }

    private final C59534zip OLrzqt() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C15505eKv.class, new C15473eJq(new Function1() { // from class: o.eJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15472eJp.EZpvd(this.AEQbTJ, (C15505eKv) obj);
            }
        }));
        return c59534zip;
    }

    public static final Unit EZpvd(C15472eJp c15472eJp, C15505eKv c15505eKv) {
        Intrinsics.checkNotNullParameter(c15505eKv, "");
        c15472eJp.copydefault().copydefault(c15505eKv);
        c15472eJp.EZpvd().notifyDataSetChanged();
        c15472eJp.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
