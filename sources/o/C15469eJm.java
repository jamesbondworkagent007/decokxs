package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.wallet.history.fragment.TypeFilterBottomSheetFragment$onCreateContent$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eJm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15469eJm extends AbstractC52792wYn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C55198xfS AEQbTJ;
    public StateListAnimator EZpvd = new StateListAnimator();
    public final InterfaceC56387yDm copydefault;

    public C15469eJm() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C15516eLf.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.fragment.TypeFilterBottomSheetFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.fragment.TypeFilterBottomSheetFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.fragment.TypeFilterBottomSheetFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.eJm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eJm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C15469eJm AEQbTJ() {
            return new C15469eJm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C15516eLf copydefault() {
        return (C15516eLf) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.eJm$StateListAnimator */
    public static final class StateListAnimator implements yHO<C55276xgr, C55276xgr, C55276xgr, Unit> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            EZpvd(c55276xgr, c55276xgr2, c55276xgr3);
            return Unit.INSTANCE;
        }

        public void EZpvd(C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            C15505eKv c15505eKv = objOLrzqt instanceof C15505eKv ? (C15505eKv) objOLrzqt : null;
            if (c15505eKv != null) {
                C15469eJm c15469eJm = C15469eJm.this;
                c15469eJm.copydefault().copydefault(c15505eKv);
                c15469eJm.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DisplayContext));
        wxq.setStyle(1);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TypeFilterBottomSheetFragment$onCreateContent$1(this, null), 3, null);
        constraintLayout.post(new java.lang.Runnable() { // from class: o.eJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15469eJm.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(C15469eJm c15469eJm) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15469eJm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.AEQbTJ = c55198xfS;
        c55198xfS.copydefault(this.EZpvd);
        c55198xfS.EZpvd(new Application());
    }

    /* JADX INFO: renamed from: o.eJm$Application */
    public static final class Application extends C55268xgj {
        public Application() {
            super(null, 0, 3, null);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
        @Override // o.C55268xgj, o.InterfaceC55196xfQ
        /* JADX INFO: renamed from: copydefault */
        public void EZpvd(@NotNull C55104xde<wZX> c55104xde, @NotNull C55276xgr c55276xgr, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(c55104xde, "");
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            super.EZpvd(c55104xde, c55276xgr, z, z2);
            ((wZX) c55104xde.OLrzqt()).getRoot().setSize(-4);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        copydefault().OLrzqt(copydefault().OLrzqt());
    }

    public final void KWHzl(java.util.List<C15505eKv> list) {
        C55198xfS c55198xfS = this.AEQbTJ;
        if (c55198xfS != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C15505eKv c15505eKv : list) {
                arrayList.add(new C55276xgr(c15505eKv.KWHzl(), c15505eKv, null, c15505eKv.EZpvd(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
            }
            InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, arrayList, null, 2, null);
        }
    }
}
