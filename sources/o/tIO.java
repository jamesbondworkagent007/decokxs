package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.okinc.planet.biz_social_feeds.FeedsFragment$initViewModel$1;
import com.okinc.planet.biz_social_feeds.FeedsFragment$initViewModel$2;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46133tJa;
import o.C47501trL;
import o.InterfaceC46104tHz;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class tIO extends AbstractC32996moC {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public final C46385tSj AhwBna;
    public tMB EZpvd;
    public final InterfaceC46389tSn OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tIW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tIO.KWHzl();
        }
    });
    public final InterfaceC56387yDm djBIcL;

    public static final boolean KWHzl(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.uzCIH;
    }

    public tIO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_social_feeds.FeedsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_social_feeds.FeedsFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C46133tJa.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_social_feeds.FeedsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_social_feeds.FeedsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_social_feeds.FeedsFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = C46385tSj.Companion.copydefault();
        this.OLrzqt = new StateListAnimator();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final tIO AEQbTJ() {
            return new tIO();
        }
    }

    public final tMB EZpvd() {
        tMB tmb = this.EZpvd;
        Intrinsics.copydefault(tmb);
        return tmb;
    }

    public final tIQ AEQbTJ() {
        return (tIQ) this.copydefault.getValue();
    }

    public static final tIQ KWHzl() {
        tIQ tiq = new tIQ();
        tiq.register(C46139tJg.class, new C46140tJh());
        tiq.register(C46141tJi.class, new C46137tJe(null, 1, 0 == true ? 1 : 0));
        tiq.register(InterfaceC46104tHz.class, new C46127tIv());
        return tiq;
    }

    public final C46133tJa OLrzqt() {
        return (C46133tJa) this.djBIcL.getValue();
    }

    public static final class StateListAnimator implements InterfaceC46389tSn {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC46389tSn
        public void AEQbTJ() {
            tIO.this.OLrzqt().EZpvd(true);
        }

        @Override // o.InterfaceC46389tSn
        public void OLrzqt() {
            tIO.this.OLrzqt().EZpvd(true);
        }

        @Override // o.InterfaceC46389tSn
        public void copydefault(boolean z) {
            tIO.this.OLrzqt().EZpvd(true);
        }

        @Override // o.InterfaceC46389tSn
        public void copydefault(C47265tml c47265tml) {
            tIO.this.OLrzqt().EZpvd(true);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.EZpvd = tMB.OLrzqt(layoutInflater, viewGroup, false);
        this.AhwBna.AEQbTJ(this.OLrzqt);
        ConstraintLayout root = EZpvd().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna.KWHzl(this.OLrzqt);
        EZpvd().KWHzl.KWHzl((InterfaceC57900yrD) null);
        EZpvd().KWHzl.OLrzqt((InterfaceC57903yrG) null);
        this.EZpvd = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt().AEQbTJ();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna();
        gEmmrt();
        AYXKKw();
        djBIcL();
    }

    public final void djBIcL() {
        final C55113xdn c55113xdn = EZpvd().AEQbTJ;
        c55113xdn.setAutoMirrored(true);
        c55113xdn.setOnTouchListener(new View.OnTouchListener() { // from class: o.tIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return tIO.KWHzl(view, motionEvent);
            }
        });
        c55113xdn.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: o.tIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                tIO.OLrzqt(c55113xdn, lottieComposition);
            }
        });
        c55113xdn.setAnimation(C33492mxV.OLrzqt() ? "loading-feed-night.lottie" : "loading-feed-light.lottie");
    }

    public static final void OLrzqt(C55113xdn c55113xdn, LottieComposition lottieComposition) {
        int iWidth = lottieComposition.getBounds().width();
        int width = c55113xdn.getWidth();
        if (iWidth != 0) {
            float f = width / iWidth;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f, f);
            c55113xdn.setImageMatrix(matrix);
        }
    }

    private final void AYXKKw() {
        C46373tRy.flowAndCollect$default(OLrzqt().EZpvd(), this, null, new FeedsFragment$initViewModel$1(this, null), 2, null);
        C46373tRy.KWHzl(OLrzqt().KWHzl(), this, Lifecycle.State.CREATED, new FeedsFragment$initViewModel$2(this, null));
    }

    public final void KWHzl(C46133tJa.Activity activity) {
        java.lang.String strAYXKKw;
        EZpvd().KWHzl.djBIcL(true);
        java.util.List<C46139tJg> listOLrzqt = activity.OLrzqt();
        if (listOLrzqt != null && !listOLrzqt.isEmpty()) {
            EZpvd().KWHzl.AhwBna(true);
            C47506trQ.submitList$default(AEQbTJ(), listOLrzqt, null, 2, null);
        } else {
            if (activity.copydefault()) {
                EZpvd().KWHzl.AhwBna(false);
                return;
            }
            EZpvd().KWHzl.AhwBna(false);
            tIQ tiqAEQbTJ = AEQbTJ();
            if (listOLrzqt == null) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.QOLQEE);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.svY);
            }
            tiqAEQbTJ.AEQbTJ(new InterfaceC46104tHz.StateListAnimator(null, null, 0.0f, null, strAYXKKw, false, false, 0, false, 495, null));
        }
    }

    public final void OLrzqt(java.lang.Throwable th) {
        InterfaceC47500trK taskDescription;
        C33546myW c33546myW = EZpvd().KWHzl;
        c33546myW.djBIcL(false);
        c33546myW.AhwBna(false);
        if (C59449zhJ.equals$default(th.getMessage(), "ERR_NOT_LOGIN", false, 2, null)) {
            taskDescription = new InterfaceC46104tHz.Application(null, null, 0.0f, C33070mpX.AYXKKw(C47501trL.Fragment.AwvSrB), new C46095tHq(C33070mpX.AYXKKw(C47501trL.Fragment.getNewProxyInstance), null, null, null, false, new Function0() { // from class: o.tIY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return tIO.valueOf(this.KWHzl);
                }
            }, 30, null), false, 0, false, 231, null);
        } else {
            taskDescription = new InterfaceC46104tHz.TaskDescription(null, 0.0f, new C46095tHq(C33070mpX.AYXKKw(C47501trL.Fragment.valueOf), null, null, null, false, new Function0() { // from class: o.tJb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return tIO.AhwBna(this.EZpvd);
                }
            }, 30, null), false, false, th, false, 91, null);
        }
        AEQbTJ().AEQbTJ(taskDescription);
    }

    public static final Unit valueOf(tIO tio) {
        if (!tio.isAdded()) {
            return Unit.INSTANCE;
        }
        android.content.Context context = tio.getContext();
        if (context != null) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(tIO tio) {
        if (!tio.isAdded()) {
            return Unit.INSTANCE;
        }
        tio.OLrzqt().AEQbTJ();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        C33546myW c33546myW = EZpvd().KWHzl;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                tIO.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.tIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                tIO.KWHzl(this.OLrzqt, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(tIO tio, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        tio.OLrzqt().AEQbTJ();
    }

    public static final void KWHzl(tIO tio, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        tio.OLrzqt().copydefault();
    }

    private final void AhwBna() {
        RecyclerView recyclerView = EZpvd().OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(AEQbTJ());
    }
}
