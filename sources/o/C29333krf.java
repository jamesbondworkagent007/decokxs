package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetViewModel;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterProtocolsFragment$special$$inlined$map$1$2$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C31197lpV;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.krf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29333krf extends AbstractC29257kqI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm djBIcL;

    public C29333krf() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new Activity(this)));
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrendingFilterBottomSheetViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
    }

    /* JADX INFO: renamed from: o.krf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.krf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C29333krf OLrzqt() {
            C29333krf c29333krf = new C29333krf();
            c29333krf.setArguments(new android.os.Bundle());
            return c29333krf;
        }
    }

    private final TrendingFilterBottomSheetViewModel AhwBna() {
        return (TrendingFilterBottomSheetViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractC26071jQw
    public Flow<java.util.List<InterfaceC28823khz.ActionBar>> EZpvd() {
        return new ActionBar(AhwBna().EZpvd());
    }

    @Override // o.AbstractC26071jQw
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna().EZpvd(str);
    }

    @Override // o.AbstractC26071jQw
    public void AEQbTJ() {
        AhwBna().KWHzl();
    }

    /* JADX INFO: renamed from: o.krf$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29260kqL) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            java.lang.Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.EZpvd.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    @Override // o.AbstractC26071jQw
    public void gEmmrt() {
        AhwBna().AEQbTJ();
    }

    @Override // o.AbstractC26071jQw
    public void EZpvd(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: renamed from: o.krf$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends InterfaceC28823khz.ActionBar>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.krf$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TrendingFilterProtocolsFragment$special$$inlined$map$1$2$1 trendingFilterProtocolsFragment$special$$inlined$map$1$2$1;
                if (continuation instanceof TrendingFilterProtocolsFragment$special$$inlined$map$1$2$1) {
                    trendingFilterProtocolsFragment$special$$inlined$map$1$2$1 = (TrendingFilterProtocolsFragment$special$$inlined$map$1$2$1) continuation;
                    int i = trendingFilterProtocolsFragment$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        trendingFilterProtocolsFragment$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        trendingFilterProtocolsFragment$special$$inlined$map$1$2$1 = new TrendingFilterProtocolsFragment$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = trendingFilterProtocolsFragment$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = trendingFilterProtocolsFragment$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List<InterfaceC28823khz.ActionBar> listAEQbTJ = ((C29264kqP) obj).AEQbTJ();
                    trendingFilterProtocolsFragment$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listAEQbTJ, trendingFilterProtocolsFragment$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC28823khz.ActionBar>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
