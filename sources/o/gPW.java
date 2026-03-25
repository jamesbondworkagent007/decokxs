package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.trade.component.orderandposition.BaseOrderAndPositionComponentFragment$onViewCreated$1;
import com.okinc.business.dex.trade.component.orderandposition.BaseOrderAndPositionComponentFragment$onViewCreated$2;
import com.okinc.business.dex.trade.component.orderandposition.BaseOrderAndPositionComponentFragment$onViewCreated$3;
import com.okinc.business.dex.trade.component.orderandposition.BaseOrderAndPositionComponentFragment$onViewCreated$4;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gPW<VB extends ViewBinding> extends hTH<VB> {
    public final InterfaceC56387yDm EZpvd = C19812gQf.OLrzqt(this);

    public abstract void AEQbTJ(DefiChainInfo defiChainInfo);

    public abstract void AhwBna();

    public abstract void EZpvd();

    public abstract void KWHzl(@NotNull java.util.List<DexMultiTokenInfoBean> list);

    public abstract boolean KWHzl();

    public abstract void OLrzqt();

    public final OrderAndPositionEventViewModel AEQbTJ() {
        return (OrderAndPositionEventViewModel) this.EZpvd.getValue();
    }

    @Override // o.hTH, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseOrderAndPositionComponentFragment$onViewCreated$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseOrderAndPositionComponentFragment$onViewCreated$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseOrderAndPositionComponentFragment$onViewCreated$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseOrderAndPositionComponentFragment$onViewCreated$4(this, null), 3, null);
        C25390ivn.EZpvd(this, AEQbTJ().valueOf(), Lifecycle.State.RESUMED, new Activity(this));
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.gPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPW.AEQbTJ(this.KWHzl, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gPW.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gPW.EZpvd((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gPY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gPW.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, AEQbTJ().call());
    }

    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ gPW<VB> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(gPW<VB> gpw) {
            this.OLrzqt = gpw;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(Unit unit, Continuation<? super Unit> continuation) {
            this.OLrzqt.OLrzqt();
            return Unit.INSTANCE;
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(gPW gpw, xXO xxo) {
        gpw.EZpvd();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AEQbTJ().OLrzqt(KWHzl());
    }
}
