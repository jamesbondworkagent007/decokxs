package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.lite.hero.data.model.HeroContent;
import com.okinc.okex.lite.hero.data.model.HeroCta;
import com.okinc.okex.lite.hero.ui.HeroContainerFragment$1;
import com.okinc.okex.lite.hero.ui.HeroContainerFragment$initView$1;
import com.okinc.okex.lite.hero.ui.HeroContainerViewModel;
import java.util.zip.ZipInputStream;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC45740svw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45729svl extends AbstractC45741svx<C45757swc> {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public C45729svl() {
        super(HeroContainerFragment$1.INSTANCE);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okex.lite.hero.ui.HeroContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.lite.hero.ui.HeroContainerFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HeroContainerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.lite.hero.ui.HeroContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.lite.hero.ui.HeroContainerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.lite.hero.ui.HeroContainerFragment$special$$inlined$viewModels$default$5
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
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.svk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45729svl.AYXKKw();
            }
        });
    }

    public final HeroContainerViewModel KWHzl() {
        return (HeroContainerViewModel) this.EZpvd.getValue();
    }

    private final InterfaceC47278tmy djBIcL() {
        return (InterfaceC47278tmy) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC47278tmy AYXKKw() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        StateFlow<InterfaceC45740svw> stateFlowAEQbTJ = KWHzl().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C45710svF.collectOnLifecycle$default(stateFlowAEQbTJ, viewLifecycleOwner, null, new HeroContainerFragment$initView$1(this, null), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(HeroContent heroContent) {
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        final C45757swc c45757swc = (C45757swc) AhwBna();
        c45757swc.AYXKKw.setText(heroContent.AYXKKw());
        c45757swc.OLrzqt.setText(heroContent.AhwBna());
        c45757swc.KWHzl.removeAllViews();
        java.util.Iterator<T> it = heroContent.djBIcL().iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            HeroCta heroCta = (HeroCta) next;
            android.widget.LinearLayout linearLayout = c45757swc.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            if (i != 1 && heroContent.djBIcL().size() != 1) {
                z = false;
            }
            EZpvd(linearLayout, heroCta, z);
            i++;
        }
        if (heroContent.gEmmrt()) {
            LottieAnimationView lottieAnimationView = c45757swc.copydefault;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(0);
            if (C33492mxV.OLrzqt()) {
                strKWHzl2 = heroContent.copydefault();
            } else {
                strKWHzl2 = heroContent.KWHzl();
            }
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(strKWHzl2), 1024);
            if (new java.io.File(strKWHzl2).exists()) {
                LottieCompositionFactory.fromZipStream(new ZipInputStream(bufferedInputStream), strKWHzl2).addListener(new LottieListener() { // from class: o.svs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.airbnb.lottie.LottieListener
                    public final void onResult(java.lang.Object obj) {
                        C45729svl.AEQbTJ(c45757swc, (LottieComposition) obj);
                    }
                }).addFailureListener(new LottieListener() { // from class: o.svq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.airbnb.lottie.LottieListener
                    public final void onResult(java.lang.Object obj) {
                        C45729svl.KWHzl(c45757swc, (java.lang.Throwable) obj);
                    }
                });
            } else {
                LottieAnimationView lottieAnimationView2 = c45757swc.copydefault;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                lottieAnimationView2.setVisibility(8);
                pUU.copydefault("LiteHeroPage", "lottie file doesnt exist");
                Unit unit = Unit.INSTANCE;
            }
        } else {
            android.widget.ImageView imageView = c45757swc.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            if (C33492mxV.OLrzqt()) {
                strKWHzl = heroContent.copydefault();
            } else {
                strKWHzl = heroContent.KWHzl();
            }
            android.content.Context context = getContext();
            if (context == null) {
                return;
            } else {
                Glide.AEQbTJ(context).EZpvd(strKWHzl).copydefault(AbstractC5360Os.copydefault).copydefault(false).EZpvd(c45757swc.AEQbTJ);
            }
        }
        C32866mlf.onEvent$default("Simpleherotab_Main_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.svo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45729svl.EZpvd(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(C45757swc c45757swc, LottieComposition lottieComposition) {
        c45757swc.copydefault.setComposition(lottieComposition);
        c45757swc.copydefault.playAnimation();
    }

    public static final void KWHzl(C45757swc c45757swc, java.lang.Throwable th) {
        pUU.copydefault("LiteHeroPage", "lottie file failed to load. Hiding Hero tab:" + th);
        LottieAnimationView lottieAnimationView = c45757swc.copydefault;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
    }

    public static final Unit EZpvd(C45729svl c45729svl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_logged_in", java.lang.String.valueOf(c45729svl.djBIcL().values()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final HeroCta heroCta) {
        C32866mlf.onEvent$default("Simpleherotab_ValueProp_CTA_Click", (TrackChannel[]) null, new Function1() { // from class: o.svr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45729svl.AEQbTJ(heroCta, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activity, heroCta.KWHzl(), null, new Function1() { // from class: o.svp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45729svl.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit AEQbTJ(HeroCta heroCta, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "trackingkey", heroCta.EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.widget.LinearLayout linearLayout, HeroCta heroCta, boolean z) {
        android.content.Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        C55296xhK.AEQbTJ(layoutParams, c52794wYp.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QKVWgx), 0, c52794wYp.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QKVWgx), c52794wYp.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QOLQEE));
        c52794wYp.setLayoutParams(layoutParams);
        c52794wYp.setText(heroCta.copydefault());
        c52794wYp.setOKDSPill(-1);
        c52794wYp.setOKDSSize(44);
        c52794wYp.setTextAppearance(C52761wXj.LoaderManager.fFgQHt);
        c52794wYp.setTextColor(c52794wYp.getContext().getColor(C52761wXj.Activity.htlTjW));
        c52794wYp.setOKDSType(z ? 257 : 258);
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, heroCta));
        linearLayout.addView(c52794wYp);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        LottieAnimationView lottieAnimationView = ((C45757swc) AhwBna()).copydefault;
        InterfaceC45740svw value = KWHzl().AEQbTJ().getValue();
        if ((value instanceof InterfaceC45740svw.Activity) && ((InterfaceC45740svw.Activity) value).OLrzqt().gEmmrt()) {
            lottieAnimationView.playAnimation();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ConstraintLayout constraintLayout = ((C45757swc) AhwBna()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setPadding(0, 0, 0, 0);
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.svl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.svl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.svl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C45729svl AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ HeroCta KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C45729svl c45729svl, HeroCta heroCta) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c45729svl;
            this.KWHzl = heroCta;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt(this.KWHzl);
            }
        }
    }
}
