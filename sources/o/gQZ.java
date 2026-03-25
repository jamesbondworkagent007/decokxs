package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment;
import com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C31197lpV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gQZ extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public gQZ() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new Application(this)));
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionComponentVewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.KWHzl = C19812gQf.OLrzqt(this);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gQZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final gQZ EZpvd() {
            return new gQZ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionComponentVewModel OLrzqt() {
        return (PositionComponentVewModel) this.OLrzqt.getValue();
    }

    private final OrderAndPositionEventViewModel AEQbTJ() {
        return (OrderAndPositionEventViewModel) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.hOMIpD));
    }

    public static final class Application implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof PositionComponentFragment) {
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

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23415hxm c23415hxmKWHzl = C23415hxm.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c23415hxmKWHzl, "");
        OLrzqt(c23415hxmKWHzl, OLrzqt().EZpvd());
    }

    public final void OLrzqt(C23415hxm c23415hxm, AdvancedAssetsFilter advancedAssetsFilter) {
        c23415hxm.KWHzl.setChecked(advancedAssetsFilter.getHidePricedTokens());
        C52794wYp c52794wYp = c23415hxm.AEQbTJ;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, advancedAssetsFilter, c23415hxm, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AEQbTJ().OLrzqt(!OLrzqt().EZpvd().isDefaultFilter());
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AdvancedAssetsFilter AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C23415hxm OLrzqt;
        public final /* synthetic */ gQZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AdvancedAssetsFilter advancedAssetsFilter, C23415hxm c23415hxm, gQZ gqz) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = advancedAssetsFilter;
            this.OLrzqt = c23415hxm;
            this.copydefault = gqz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                PositionComponentVewModel.saveAssetsFilter$default(this.copydefault.OLrzqt(), AdvancedAssetsFilter.copy$default(this.AEQbTJ, this.OLrzqt.KWHzl.isChecked(), null, false, 6, null), false, 2, null);
                this.copydefault.dismiss();
            }
        }
    }
}
