package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.dexlogic.bean.ContentTip;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.RepeatOrderResponse;
import com.okinc.business.dexlogic.bean.RepeatSubOrderRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24758ijq {
    public abstract void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull Function0<Unit> function0);

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull final Function1<? super InterfaceC22335hdS, Unit> function1) {
        final CrossChainBridgeRulesRequest crossChainBridgeRulesRequestKWHzl;
        RepeatSubOrderRequest repeatSubOrderRequestOLrzqt;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (abstractC23101hrq.Dmq()) {
            QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh == null || (repeatSubOrderRequestOLrzqt = abstractC23101hrq.wlaJM().OLrzqt(quotePriceResAxsJAYsNCnLh)) == null) {
                return;
            }
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(C22380heK.OLrzqt.copydefault(abstractC23101hrq.ffGIBT()).DbNXlk().AEQbTJ(repeatSubOrderRequestOLrzqt, abstractC23101hrq.gEmmrt()), lifecycleOwner, Lifecycle.Event.ON_PAUSE);
            final Function1 function12 = new Function1() { // from class: o.ijs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC24758ijq.AEQbTJ(function1, (RepeatOrderResponse) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ijr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC24758ijq.AhwBna(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.ijt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC24758ijq.copydefault(function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ijp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC24758ijq.djBIcL(function13, obj);
                }
            });
            return;
        }
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = abstractC23101hrq.AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh2 == null || (crossChainBridgeRulesRequestKWHzl = abstractC23101hrq.wlaJM().KWHzl(quotePriceResAxsJAYsNCnLh2)) == null) {
            return;
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C58156yvv.OLrzqt(C22380heK.OLrzqt.copydefault(abstractC23101hrq.ffGIBT()).DbNXlk().OLrzqt(crossChainBridgeRulesRequestKWHzl, abstractC23101hrq.gEmmrt()), lifecycleOwner, Lifecycle.Event.ON_PAUSE);
        final Function1 function14 = new Function1() { // from class: o.ijw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC24758ijq.AEQbTJ(crossChainBridgeRulesRequestKWHzl, function1, (CrossChainBridgeRulesData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ijx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC24758ijq.EZpvd(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.iju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC24758ijq.AEQbTJ(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ijy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC24758ijq.AYXKKw(function15, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, RepeatOrderResponse repeatOrderResponse) {
        Intrinsics.copydefault(repeatOrderResponse);
        function1.invoke(repeatOrderResponse);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.lang.Throwable th) {
        function1.invoke(new RepeatOrderResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, 15, (DefaultConstructorMarker) null));
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(CrossChainBridgeRulesRequest crossChainBridgeRulesRequest, Function1 function1, CrossChainBridgeRulesData crossChainBridgeRulesData) {
        crossChainBridgeRulesData.setBridgeId(crossChainBridgeRulesRequest.getBridgeId());
        Intrinsics.copydefault(crossChainBridgeRulesData);
        function1.invoke(crossChainBridgeRulesData);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        function1.invoke(new CrossChainBridgeRulesData((java.lang.String) null, (java.lang.String) null, 0, (ContentTip) null, (java.lang.String) null, 0, 63, (DefaultConstructorMarker) null));
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }
}
