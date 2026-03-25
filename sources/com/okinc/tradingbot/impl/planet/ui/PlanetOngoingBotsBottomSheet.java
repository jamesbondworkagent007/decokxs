package com.okinc.tradingbot.impl.planet.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.model.PlanetBotSelectedResult;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C33070mpX;
import o.C33570myu;
import o.C43246rlf;
import o.C48033uCm;
import o.C52692wUv;
import o.C52794wYp;
import o.C53652wpY;
import o.C53657wpd;
import o.C53664wpk;
import o.C53726wqt;
import o.C54946xaf;
import o.C55118xds;
import o.C55296xhK;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55688xof;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C58114yvF;
import o.InterfaceC51009vet;
import o.InterfaceC56387yDm;
import o.uLU;
import o.wWG;
import o.wWN;
import o.wXQ;
import o.wXX;
import o.wYF;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetOngoingBotsBottomSheet extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public Function1<? super PlanetBotSelectedResult, Unit> EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public CoroutineDispatcher defaultDispatcher;

    @yCM
    public C53664wpk getOngoingBotsUseCase;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.5f;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class C17511 extends SuspendLambda implements Function2<uLU<? extends PlanetOngoingBotsViewModel.StateListAnimator>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17511(Continuation<? super C17511> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17511 c17511 = PlanetOngoingBotsBottomSheet.this.new C17511(continuation);
            c17511.L$0 = obj;
            return c17511;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(uLU<? extends PlanetOngoingBotsViewModel.StateListAnimator> ulu, Continuation<? super Unit> continuation) {
            return invoke2((uLU<PlanetOngoingBotsViewModel.StateListAnimator>) ulu, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(uLU<PlanetOngoingBotsViewModel.StateListAnimator> ulu, Continuation<? super Unit> continuation) {
            return ((C17511) create(ulu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$onViewCreated$1$ActionBar */
        public static final class ActionBar implements View.OnLayoutChangeListener {
            public final /* synthetic */ uLU AEQbTJ;
            public final /* synthetic */ PlanetOngoingBotsBottomSheet copydefault;

            public ActionBar(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, uLU ulu) {
                this.copydefault = planetOngoingBotsBottomSheet;
                this.AEQbTJ = ulu;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C55118xds c55118xdsAEQbTJ;
                C54946xaf binding;
                C55118xds c55118xdsAEQbTJ2;
                wXQ wxq;
                C55118xds c55118xdsAEQbTJ3;
                Intrinsics.checkNotNullParameter(view, "");
                view.removeOnLayoutChangeListener(this);
                C54946xaf binding2 = this.copydefault.getBinding();
                Object tag = (binding2 == null || (c55118xdsAEQbTJ3 = binding2.getRoot()) == null) ? null : c55118xdsAEQbTJ3.getTag();
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.EZpvd(bool, bool2)) {
                    return;
                }
                int iOLrzqt = C33570myu.OLrzqt(this.copydefault.requireContext());
                int iGEmmrt = C33570myu.gEmmrt(this.copydefault.requireContext());
                C54946xaf binding3 = PlanetOngoingBotsBottomSheet.super.getBinding();
                int measuredHeight = (binding3 == null || (wxq = binding3.KWHzl) == null) ? 0 : wxq.getMeasuredHeight();
                Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                int iMax = Math.max(measuredHeight, C55298xhM.OLrzqt(60, contextRequireContext));
                Resources resources = this.copydefault.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                int iAEQbTJ = C55302xhQ.AEQbTJ(resources);
                Context contextRequireContext2 = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                float fOLrzqt = C55298xhM.OLrzqt(76.0f, contextRequireContext2);
                float size = ((PlanetOngoingBotsViewModel.StateListAnimator) ((uLU.ActionBar) this.AEQbTJ).KWHzl()).copydefault().size();
                Intrinsics.checkNotNullExpressionValue(this.copydefault.getResources(), "");
                if ((fOLrzqt * size) + iOLrzqt > ((C55302xhQ.AEQbTJ(r9) * 0.5f) - iMax) - iGEmmrt && (binding = this.copydefault.getBinding()) != null && (c55118xdsAEQbTJ2 = binding.getRoot()) != null) {
                    ViewGroup.LayoutParams layoutParams = c55118xdsAEQbTJ2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = (iAEQbTJ - iMax) - iGEmmrt;
                    c55118xdsAEQbTJ2.setLayoutParams(layoutParams);
                }
                C54946xaf binding4 = this.copydefault.getBinding();
                if (binding4 == null || (c55118xdsAEQbTJ = binding4.getRoot()) == null) {
                    return;
                }
                c55118xdsAEQbTJ.setTag(bool2);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C54946xaf binding;
            C55118xds c55118xdsAEQbTJ;
            C55118xds c55118xdsAEQbTJ2;
            C54946xaf binding2;
            C55118xds c55118xdsAEQbTJ3;
            wXQ wxq;
            C55118xds c55118xdsAEQbTJ4;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                uLU ulu = (uLU) this.L$0;
                if ((ulu instanceof uLU.ActionBar) && (binding = PlanetOngoingBotsBottomSheet.this.getBinding()) != null && (c55118xdsAEQbTJ = binding.getRoot()) != null) {
                    PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet = PlanetOngoingBotsBottomSheet.this;
                    if (ViewCompat.isLaidOut(c55118xdsAEQbTJ) && !c55118xdsAEQbTJ.isLayoutRequested()) {
                        C54946xaf binding3 = planetOngoingBotsBottomSheet.getBinding();
                        Object tag = (binding3 == null || (c55118xdsAEQbTJ4 = binding3.getRoot()) == null) ? null : c55118xdsAEQbTJ4.getTag();
                        if (!Intrinsics.EZpvd(tag instanceof Boolean ? (Boolean) tag : null, C56443yFo.KWHzl(true))) {
                            int iOLrzqt = C33570myu.OLrzqt(planetOngoingBotsBottomSheet.requireContext());
                            int iGEmmrt = C33570myu.gEmmrt(planetOngoingBotsBottomSheet.requireContext());
                            C54946xaf binding4 = PlanetOngoingBotsBottomSheet.super.getBinding();
                            int measuredHeight = (binding4 == null || (wxq = binding4.KWHzl) == null) ? 0 : wxq.getMeasuredHeight();
                            Context contextRequireContext = planetOngoingBotsBottomSheet.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            int iMax = Math.max(measuredHeight, C55298xhM.OLrzqt(60, contextRequireContext));
                            Resources resources = planetOngoingBotsBottomSheet.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "");
                            int iAEQbTJ = C55302xhQ.AEQbTJ(resources);
                            Context contextRequireContext2 = planetOngoingBotsBottomSheet.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                            float fOLrzqt = C55298xhM.OLrzqt(76.0f, contextRequireContext2);
                            float size = ((PlanetOngoingBotsViewModel.StateListAnimator) ((uLU.ActionBar) ulu).KWHzl()).copydefault().size();
                            Intrinsics.checkNotNullExpressionValue(planetOngoingBotsBottomSheet.getResources(), "");
                            if ((fOLrzqt * size) + iOLrzqt > ((C55302xhQ.AEQbTJ(r8) * 0.5f) - iMax) - iGEmmrt && (binding2 = planetOngoingBotsBottomSheet.getBinding()) != null && (c55118xdsAEQbTJ3 = binding2.getRoot()) != null) {
                                ViewGroup.LayoutParams layoutParams = c55118xdsAEQbTJ3.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = (iAEQbTJ - iMax) - iGEmmrt;
                                    c55118xdsAEQbTJ3.setLayoutParams(layoutParams);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                            }
                            C54946xaf binding5 = planetOngoingBotsBottomSheet.getBinding();
                            if (binding5 != null && (c55118xdsAEQbTJ2 = binding5.getRoot()) != null) {
                                c55118xdsAEQbTJ2.setTag(C56443yFo.KWHzl(true));
                            }
                        }
                    } else {
                        c55118xdsAEQbTJ.addOnLayoutChangeListener(new ActionBar(planetOngoingBotsBottomSheet, ulu));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PlanetOngoingBotsBottomSheet() {
        Function0 function0 = new Function0() { // from class: o.wqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetOngoingBotsBottomSheet.gEmmrt(this.OLrzqt);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PlanetOngoingBotsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$special$$inlined$viewModels$default$4
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
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlanetOngoingBotsBottomSheet newInstance$default(Application application, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return application.copydefault(function1);
        }

        public final PlanetOngoingBotsBottomSheet copydefault(Function1<? super PlanetBotSelectedResult, Unit> function1) {
            PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet = new PlanetOngoingBotsBottomSheet();
            planetOngoingBotsBottomSheet.EZpvd = function1;
            return planetOngoingBotsBottomSheet;
        }
    }

    public final CoroutineDispatcher OLrzqt() {
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C53664wpk EZpvd() {
        C53664wpk c53664wpk = this.getOngoingBotsUseCase;
        if (c53664wpk != null) {
            return c53664wpk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final PlanetOngoingBotsViewModel AEQbTJ() {
        return (PlanetOngoingBotsViewModel) this.OLrzqt.getValue();
    }

    public static final PlanetOngoingBotsViewModel AEQbTJ(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new PlanetOngoingBotsViewModel(planetOngoingBotsBottomSheet.EZpvd(), planetOngoingBotsBottomSheet.OLrzqt());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ((InterfaceC51009vet) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).OLrzqt(this);
        super.onAttach(context);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        setDynamicFullScreen(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(6);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.wqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                PlanetOngoingBotsBottomSheet.OLrzqt(this.AEQbTJ, view);
            }
        });
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.gdLjtZ));
    }

    public static final void OLrzqt(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, View view) {
        planetOngoingBotsBottomSheet.dismiss();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(wyf, null), 3, null);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$onFooterCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ wYF $buttonbox;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wYF wyf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$buttonbox = wyf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlanetOngoingBotsBottomSheet.this.new AnonymousClass1(this.$buttonbox, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$onFooterCreated$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ wYF $buttonbox;
            int label;
            final /* synthetic */ PlanetOngoingBotsBottomSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06641(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, wYF wyf, Continuation<? super C06641> continuation) {
                super(2, continuation);
                this.this$0 = planetOngoingBotsBottomSheet;
                this.$buttonbox = wyf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06641(this.this$0, this.$buttonbox, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<Boolean> stateFlowOLrzqt = this.this$0.AEQbTJ().OLrzqt();
                    final wYF wyf = this.$buttonbox;
                    FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet.onFooterCreated.1.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return KWHzl(((Boolean) obj2).booleanValue(), continuation);
                        }

                        public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
                            C52794wYp c52794wYpCopydefault = wyf.copydefault();
                            if (c52794wYpCopydefault != null) {
                                c52794wYpCopydefault.setEnabled(z);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet = PlanetOngoingBotsBottomSheet.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C06641 c06641 = new C06641(planetOngoingBotsBottomSheet, this.$buttonbox, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(planetOngoingBotsBottomSheet, state, c06641, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void copydefault() {
        Function1<? super PlanetBotSelectedResult, Unit> function1;
        BotUiState botUiStateAEQbTJ = AEQbTJ().AEQbTJ();
        if (botUiStateAEQbTJ == null || (function1 = this.EZpvd) == null) {
            return;
        }
        function1.invoke(new PlanetBotSelectedResult(botUiStateAEQbTJ.KWHzl(), botUiStateAEQbTJ.AhwBna()));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ().EZpvd((PlanetOngoingBotsViewModel.ActionBar) PlanetOngoingBotsViewModel.ActionBar.Activity.AEQbTJ);
        StateFlow<uLU<PlanetOngoingBotsViewModel.StateListAnimator>> stateFlowCopydefault = AEQbTJ().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C52692wUv.flowAndCollect$default(stateFlowCopydefault, viewLifecycleOwner, null, new C17511(null), 2, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ PlanetOngoingBotsBottomSheet KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = planetOngoingBotsBottomSheet;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.copydefault();
                C53657wpd.copydefault.copydefault();
                this.KWHzl.dismiss();
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-338005342, true, new TaskDescription()));
        constraintLayout.addView(composeView);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements Function2<Composer, Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher, int, java.lang.Object):androidx.compose.ui.Modifier */
        public final void AEQbTJ(Composer composer, int i) {
            List<BotUiState> listAhwBna;
            PlanetOngoingBotsViewModel.StateListAnimator stateListAnimator;
            PlanetOngoingBotsViewModel.StateListAnimator stateListAnimator2;
            PlanetOngoingBotsViewModel.StateListAnimator stateListAnimator3;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-338005342, i, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet.onCreateContent.<anonymous>.<anonymous> (PlanetOngoingBotsBottomSheet.kt:210)");
                }
                State stateCollectAsState = SnapshotStateKt.collectAsState(PlanetOngoingBotsBottomSheet.this.AEQbTJ().copydefault(), null, composer, 0, 1);
                uLU<PlanetOngoingBotsViewModel.StateListAnimator> uluOLrzqt = OLrzqt((State<? extends uLU<PlanetOngoingBotsViewModel.StateListAnimator>>) stateCollectAsState);
                uLU.ActionBar actionBar = uluOLrzqt instanceof uLU.ActionBar ? (uLU.ActionBar) uluOLrzqt : null;
                if (actionBar == null || (stateListAnimator3 = (PlanetOngoingBotsViewModel.StateListAnimator) actionBar.KWHzl()) == null || (listAhwBna = stateListAnimator3.copydefault()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                List<BotUiState> list = listAhwBna;
                boolean z = !(actionBar != null && (stateListAnimator2 = (PlanetOngoingBotsViewModel.StateListAnimator) actionBar.KWHzl()) != null && stateListAnimator2.KWHzl()) && (actionBar != null && (stateListAnimator = (PlanetOngoingBotsViewModel.StateListAnimator) actionBar.KWHzl()) != null && stateListAnimator.OLrzqt());
                composer.startReplaceableGroup(-1138515636);
                boolean zChangedInstance = composer.changedInstance(PlanetOngoingBotsBottomSheet.this);
                final PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet = PlanetOngoingBotsBottomSheet.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.wqq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return PlanetOngoingBotsBottomSheet.TaskDescription.AEQbTJ(planetOngoingBotsBottomSheet);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                LazyListState lazyListStateKWHzl = wWG.KWHzl(null, 0, z, (Function0) objRememberedValue, composer, 0, 3);
                boolean zIsEmpty = list.isEmpty();
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null);
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null);
                uLU<PlanetOngoingBotsViewModel.StateListAnimator> uluOLrzqt2 = OLrzqt((State<? extends uLU<PlanetOngoingBotsViewModel.StateListAnimator>>) stateCollectAsState);
                composer.startReplaceableGroup(-1138497495);
                boolean zChangedInstance2 = composer.changedInstance(PlanetOngoingBotsBottomSheet.this);
                final PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet2 = PlanetOngoingBotsBottomSheet.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: o.wqo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return PlanetOngoingBotsBottomSheet.TaskDescription.OLrzqt(planetOngoingBotsBottomSheet2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                wWN.copydefault(modifierNestedScroll$default, null, modifierM675paddingqDBjuR0$default, uluOLrzqt2, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composer, 1257045916, true, new AnonymousClass5(zIsEmpty, lazyListStateKWHzl, list, PlanetOngoingBotsBottomSheet.this)), composer, 196992, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit AEQbTJ(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet) {
            planetOngoingBotsBottomSheet.AEQbTJ().EZpvd((PlanetOngoingBotsViewModel.ActionBar) PlanetOngoingBotsViewModel.ActionBar.StateListAnimator.EZpvd);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet) {
            planetOngoingBotsBottomSheet.AEQbTJ().EZpvd((PlanetOngoingBotsViewModel.ActionBar) PlanetOngoingBotsViewModel.ActionBar.Application.copydefault);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5 implements yHO<BoxScope, Composer, Integer, Unit> {
            public final /* synthetic */ boolean AEQbTJ;
            public final /* synthetic */ PlanetOngoingBotsBottomSheet KWHzl;
            public final /* synthetic */ List<BotUiState> OLrzqt;
            public final /* synthetic */ LazyListState copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(boolean z, LazyListState lazyListState, List<BotUiState> list, PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet) {
                this.AEQbTJ = z;
                this.copydefault = lazyListState;
                this.OLrzqt = list;
                this.KWHzl = planetOngoingBotsBottomSheet;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHO
            public /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                OLrzqt(boxScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void OLrzqt(BoxScope boxScope, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(boxScope, "");
                if ((i & 6) == 0) {
                    i |= composer.changed(boxScope) ? 4 : 2;
                }
                if ((i & 19) != 18 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1257045916, i, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet.onCreateContent.<anonymous>.<anonymous>.<anonymous> (PlanetOngoingBotsBottomSheet.kt:236)");
                    }
                    if (this.AEQbTJ) {
                        composer.startReplaceableGroup(2130361529);
                        wWN.AEQbTJ(boxScope.align(Modifier.Companion, Alignment.Companion.getCenter()), 0, StringResources_androidKt.stringResource(C55688xof.Application.WorkerThread, composer, 0), composer, 0, 2);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(2130654758);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                        LazyListState lazyListState = this.copydefault;
                        C53652wpY c53652wpY = new C53652wpY(this.OLrzqt);
                        composer.startReplaceableGroup(1592762091);
                        boolean zChangedInstance = composer.changedInstance(this.KWHzl);
                        final PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet = this.KWHzl;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: o.wqu
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return PlanetOngoingBotsBottomSheet.TaskDescription.AnonymousClass5.copydefault(planetOngoingBotsBottomSheet, (java.lang.String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceableGroup();
                        C53726wqt.AEQbTJ(modifierFillMaxSize$default, lazyListState, c53652wpY, null, (Function1) objRememberedValue, composer, 3078, 0);
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            public static final Unit copydefault(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, String str) {
                Intrinsics.checkNotNullParameter(str, "");
                C53657wpd.copydefault.EZpvd();
                planetOngoingBotsBottomSheet.AEQbTJ().EZpvd((PlanetOngoingBotsViewModel.ActionBar) new PlanetOngoingBotsViewModel.ActionBar.TaskDescription(str));
                return Unit.INSTANCE;
            }
        }

        private static final uLU<PlanetOngoingBotsViewModel.StateListAnimator> OLrzqt(State<? extends uLU<PlanetOngoingBotsViewModel.StateListAnimator>> state) {
            return state.getValue();
        }
    }

    public static final ViewModelProvider.Factory gEmmrt(final PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(PlanetOngoingBotsViewModel.class), new Function1() { // from class: o.wqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PlanetOngoingBotsBottomSheet.AEQbTJ(this.KWHzl, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
