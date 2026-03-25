package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeuilib.order.trade.view.AccountMode;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49975uyg extends ViewModel {
    public Function0<java.lang.Boolean> AEQbTJ = new Function0() { // from class: o.uyl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C49975uyg.copydefault());
        }
    };
    public Function1<? super BizInstrument, java.lang.Boolean> KWHzl;

    public static final boolean AEQbTJ() {
        return false;
    }

    public static final boolean copydefault() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super BizInstrument, java.lang.Boolean> function1) {
        this.KWHzl = function1;
    }

    public final boolean gEmmrt() {
        return this.AEQbTJ.invoke().booleanValue();
    }

    public final boolean KWHzl(BizInstrument bizInstrument) {
        Function1<? super BizInstrument, java.lang.Boolean> function1 = this.KWHzl;
        return function1 != null && function1.invoke(bizInstrument).booleanValue();
    }

    public final boolean djBIcL() {
        return C54794xVo.copydefault.OLrzqt();
    }

    public final boolean valueOf() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.copydefault()) ? false : true;
    }

    public final boolean AhwBna() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.UeEOUB()) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.uyg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSimpleBorrowAgreementConfirm$default(C49975uyg c49975uyg, LifecycleOwner lifecycleOwner, java.lang.String str, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        c49975uyg.KWHzl(lifecycleOwner, str, function0, function1);
    }

    public final void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull final java.lang.String str, final Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        C49487upV.KWHzl.KWHzl(lifecycleOwner, new Function1() { // from class: o.uym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49975uyg.EZpvd(str, function0, ((java.lang.Boolean) obj).booleanValue());
            }
        }, function1);
    }

    public static final Unit EZpvd(java.lang.String str, Function0 function0, boolean z) {
        xOW newProxyInstance;
        if (z) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                newProxyInstance.r_(str);
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean copydefault(AccountMode accountMode, BizInstrument bizInstrument, java.lang.String str) {
        if (accountMode != AccountMode.MULTI && accountMode != AccountMode.PM) {
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
            boolean zDjBIcL = djBIcL();
            boolean zGEmmrt = gEmmrt();
            boolean zKWHzl = C49974uyf.EZpvd.KWHzl(accountMode, bizInstrument, C49926uxk.Companion.AEQbTJ(), str);
            if (zGEmmrt && zDjBIcL && C55697xoo.OLrzqt.isConnected() && (!zKWHzl)) {
                return false;
            }
        }
        return true;
    }

    public final void AEQbTJ(final boolean z) {
        C32866mlf.onEvent$default("PlaceOrder_Panel_Autoborrow_Click", (TrackChannel[]) null, new Function1() { // from class: o.uyi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49975uyg.EZpvd(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("Trade_Borrow_Manage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.AEQbTJ = new Function0() { // from class: o.uyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C49975uyg.AEQbTJ());
            }
        };
        this.KWHzl = null;
    }
}
