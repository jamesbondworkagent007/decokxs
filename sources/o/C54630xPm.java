package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeUnitReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xPm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54630xPm {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.xPm$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.xPm$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xPm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void EZpvd(final Lifecycle lifecycle, @NotNull TradeUnitReq tradeUnitReq, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(tradeUnitReq, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!C55697xoo.OLrzqt.isConnected()) {
            function0.invoke();
            return;
        }
        final C56178xxs c56178xxs = new C56178xxs();
        c56178xxs.AEQbTJ(tradeUnitReq);
        c56178xxs.KWHzl(new Function1() { // from class: o.xPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54630xPm.OLrzqt(function0, function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56178xxs, 0L, 1, null);
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.okinc.unify_trade.trade.setting.setting_data.OkTradeSettingManager$setTradeUnit$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    Intrinsics.checkNotNullParameter(event, "");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        c56178xxs.AYXKKw();
                        lifecycle.removeObserver(this);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void setOrderConfirm$default(C54630xPm c54630xPm, boolean z, Lifecycle lifecycle, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        c54630xPm.AEQbTJ(z, lifecycle);
    }

    public final void AEQbTJ(final boolean z, Lifecycle lifecycle) {
        EZpvd(lifecycle, new TradeUnitReq("3", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, z ? "1" : "0", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 33554398, (DefaultConstructorMarker) null), new Function0() { // from class: o.xPr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54630xPm.EZpvd(z);
            }
        }, new Function1() { // from class: o.xPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54630xPm.copydefault((java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(boolean z) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            newProxyInstance.AEQbTJ(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(final boolean z, Lifecycle lifecycle) {
        EZpvd(lifecycle, new TradeUnitReq("13", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, z ? "1" : "0", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 33552382, (DefaultConstructorMarker) null), new Function0() { // from class: o.xPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54630xPm.KWHzl(z);
            }
        }, new Function1() { // from class: o.xPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54630xPm.OLrzqt((java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(boolean z) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
            newProxyInstance.KWHzl(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            function0.invoke();
        } else {
            function1.invoke(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
