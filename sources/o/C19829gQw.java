package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment;
import com.okinc.business.dex.trade.order.domain.model.OrderFilterStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C31197lpV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gQw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19829gQw extends AbstractC19814gQh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw = C19812gQf.OLrzqt(this);
    public C23485hzC AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.valueOf;
    }

    /* JADX INFO: renamed from: o.gQw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gQw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public C19829gQw() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new Activity(this)));
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderPagerViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.valueOf = true;
    }

    private final OrderAndPositionEventViewModel djBIcL() {
        return (OrderAndPositionEventViewModel) this.AYXKKw.getValue();
    }

    private final OrderPagerViewModel gEmmrt() {
        return (OrderPagerViewModel) this.gEmmrt.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.hwXsuq));
    }

    /* JADX INFO: renamed from: o.gQw$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof OpenOrderComponentFragment) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            java.lang.Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.AEQbTJ.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.AhwBna = C23485hzC.KWHzl(getLayoutInflater(), constraintLayout, true);
        KWHzl();
        AhwBna();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.QKVWgx));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.copydefault(), 0L, new Function1() { // from class: o.gQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19829gQw.OLrzqt(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.AEQbTJ(), 0L, new Function1() { // from class: o.gQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19829gQw.copydefault(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C19829gQw c19829gQw, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C23485hzC c23485hzC = c19829gQw.AhwBna;
        if (c23485hzC != null) {
            c19829gQw.gEmmrt().OLrzqt((OrderFilterStrategyType) c23485hzC.KWHzl.KWHzl(), (OrderSubStatus) c23485hzC.AEQbTJ.KWHzl());
        }
        c19829gQw.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19829gQw c19829gQw, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c19829gQw.KWHzl();
        c19829gQw.AhwBna();
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        gQD gqd;
        InterfaceC56445yFq<OrderFilterStrategyType> entries = OrderFilterStrategyType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        java.util.Iterator<OrderFilterStrategyType> it = entries.iterator();
        while (it.hasNext()) {
            OrderFilterStrategyType next = it.next();
            arrayList.add(new C20073gZx(C33070mpX.AYXKKw(next.getTextRes()), gEmmrt().EZpvd() == next, next, false, false, 24, null));
        }
        C23485hzC c23485hzC = this.AhwBna;
        if (c23485hzC == null || (gqd = c23485hzC.KWHzl) == null) {
            return;
        }
        gqd.AEQbTJ(arrayList);
    }

    public final void AhwBna() {
        gQD gqd;
        java.util.List<OrderSubStatus> listAEQbTJ = gEmmrt().AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (OrderSubStatus orderSubStatus : listAEQbTJ) {
            arrayList.add(new C20073gZx(C33070mpX.AYXKKw(orderSubStatus.getFilterTextRes()), gEmmrt().AYXKKw() == orderSubStatus, orderSubStatus, false, false, 24, null));
        }
        C23485hzC c23485hzC = this.AhwBna;
        if (c23485hzC == null || (gqd = c23485hzC.AEQbTJ) == null) {
            return;
        }
        gqd.AEQbTJ(arrayList);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL().OLrzqt(gEmmrt().isConnected());
    }
}
