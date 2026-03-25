package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.explanation.ui.MemeLabelExplanationViewModel;
import com.okinc.business.market.features.tag.domain.TagMeta;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28706kfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28703kfl extends AbstractC28698kfg {
    public C23469hyn AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kfm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28703kfl.AYXKKw();
        }
    });
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;

    public C28703kfl() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.explanation.ui.MemeLabelExplanationBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.explanation.ui.MemeLabelExplanationBottomSheet$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeLabelExplanationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.explanation.ui.MemeLabelExplanationBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.explanation.ui.MemeLabelExplanationBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.explanation.ui.MemeLabelExplanationBottomSheet$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.kfl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kfl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28703kfl OLrzqt() {
            return new C28703kfl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM gEmmrt() {
        return (kMM) this.valueOf.getValue();
    }

    public static final kMM AYXKKw() {
        kMM kmm = new kMM();
        kmm.register(C21961hSt.class, new C21956hSo());
        return kmm;
    }

    public final MemeLabelExplanationViewModel valueOf() {
        return (MemeLabelExplanationViewModel) this.djBIcL.getValue();
    }

    public final C23469hyn AhwBna() {
        C23469hyn c23469hyn = this.AhwBna;
        Intrinsics.copydefault(c23469hyn);
        return c23469hyn;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(wxq.getContext().getString(C23274hvD.Fragment.onMultiWindowModeChanged));
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        valueOf().copydefault(yDY.gEmmrt("topHolder", "dev", "suspicious", "sniper", "bundle"));
        C25390ivn.collectOnViewLifecycle$default(this, valueOf().KWHzl(), null, new ActionBar(), 2, null);
        this.AhwBna = C23469hyn.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        AhwBna().EZpvd.setAdapter(gEmmrt());
    }

    /* JADX INFO: renamed from: o.kfl$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=5] */
        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28706kfo interfaceC28706kfo, Continuation<? super Unit> continuation) {
            C55113xdn c55113xdn = C28703kfl.this.AhwBna().copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(interfaceC28706kfo instanceof InterfaceC28706kfo.ActionBar ? 0 : 8);
            RecyclerView recyclerView = C28703kfl.this.AhwBna().EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            boolean z = interfaceC28706kfo instanceof InterfaceC28706kfo.StateListAnimator;
            recyclerView.setVisibility(z ? 0 : 8);
            C55173xeu c55173xeu = C28703kfl.this.AhwBna().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(interfaceC28706kfo instanceof InterfaceC28706kfo.Application ? 0 : 8);
            if (!Intrinsics.EZpvd(interfaceC28706kfo, InterfaceC28706kfo.Application.EZpvd) && !Intrinsics.EZpvd(interfaceC28706kfo, InterfaceC28706kfo.ActionBar.AEQbTJ)) {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                android.content.Context context = C28703kfl.this.AhwBna().getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                boolean zAEQbTJ = C33054mpH.AEQbTJ(context);
                kMM kmmGEmmrt = C28703kfl.this.gEmmrt();
                java.util.List<TagMeta> listKWHzl = ((InterfaceC28706kfo.StateListAnimator) interfaceC28706kfo).KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                java.util.Iterator<T> it = listKWHzl.iterator();
                while (true) {
                    java.lang.Integer numAEQbTJ = null;
                    if (it.hasNext()) {
                        TagMeta tagMeta = (TagMeta) it.next();
                        java.lang.String strAYXKKw = tagMeta.AYXKKw();
                        java.lang.String strCopydefault = tagMeta.copydefault();
                        java.lang.String strKWHzl = C29694kyV.AEQbTJ.KWHzl(tagMeta, zAEQbTJ);
                        java.lang.String strFetchVPNInfo = tagMeta.fetchVPNInfo();
                        switch (strFetchVPNInfo.hashCode()) {
                            case -1377881982:
                                if (strFetchVPNInfo.equals("bundle")) {
                                    numAEQbTJ = C56443yFo.AEQbTJ(C23274hvD.ActionBar.uzCIH);
                                }
                                break;
                            case -897788689:
                                if (strFetchVPNInfo.equals("sniper")) {
                                    numAEQbTJ = C56443yFo.AEQbTJ(C23274hvD.ActionBar.wlaJM);
                                }
                                break;
                            case -544577695:
                                if (strFetchVPNInfo.equals("topHolder")) {
                                    numAEQbTJ = C56443yFo.AEQbTJ(C23274hvD.ActionBar.AwvSrB);
                                }
                                break;
                            case 99349:
                                if (strFetchVPNInfo.equals("dev")) {
                                    numAEQbTJ = C56443yFo.AEQbTJ(C23274hvD.ActionBar.iwGUEr);
                                }
                                break;
                            case 133626717:
                                if (strFetchVPNInfo.equals("suspicious")) {
                                    numAEQbTJ = C56443yFo.AEQbTJ(C23274hvD.ActionBar.zuBGHE);
                                }
                                break;
                        }
                        arrayList.add(new C21961hSt(strAYXKKw, strCopydefault, strKWHzl, numAEQbTJ, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.sElUiK), false, 32, null));
                    } else {
                        kMM.setData$default(kmmGEmmrt, arrayList, null, 2, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
