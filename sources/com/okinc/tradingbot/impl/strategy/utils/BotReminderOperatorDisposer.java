package com.okinc.tradingbot.impl.strategy.utils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.tradingbot.impl.strategy.utils.BotReminderOperatorDisposer;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.biz.ToggleReinvestmentReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.BotReminderOperatorPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C48033uCm;
import o.C52602wRm;
import o.C55326xho;
import o.C55328xhq;
import o.C55688xof;
import o.C56111xwe;
import o.C56392yDr;
import o.InterfaceC52662wTs;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.xAE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotReminderOperatorDisposer implements DefaultLifecycleObserver {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public Toast EZpvd;
    public InterfaceC52662wTs copydefault;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotReminderOperatorDisposer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BotReminderOperatorDisposer(InterfaceC52662wTs interfaceC52662wTs) {
        this.copydefault = interfaceC52662wTs;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotReminderOperatorDisposer.AEQbTJ(this.EZpvd);
            }
        });
        InterfaceC52662wTs interfaceC52662wTs2 = this.copydefault;
        if (interfaceC52662wTs2 instanceof LifecycleOwner) {
            Intrinsics.copydefault(interfaceC52662wTs2, "");
            interfaceC52662wTs2.getLifecycle().addObserver(this);
            KWHzl(interfaceC52662wTs2);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.wTs:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.wTs) : (r1v0 o.wTs))
 A[MD:(o.wTs):void (m)] (LINE:26) call: com.okinc.tradingbot.impl.strategy.utils.BotReminderOperatorDisposer.<init>(o.wTs):void type: THIS */
    public /* synthetic */ BotReminderOperatorDisposer(InterfaceC52662wTs interfaceC52662wTs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC52662wTs);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.utils.BotReminderOperatorDisposer.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final BotReminderOperatorPresenter KWHzl() {
        return (BotReminderOperatorPresenter) this.AEQbTJ.getValue();
    }

    public static final BotReminderOperatorPresenter AEQbTJ(BotReminderOperatorDisposer botReminderOperatorDisposer) {
        ViewModelStoreOwner viewModelStoreOwner;
        LifecycleOwner lifecycleOwner = botReminderOperatorDisposer.copydefault;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            viewModelStoreOwner = (Fragment) lifecycleOwner;
        } else if (lifecycleOwner instanceof FragmentActivity) {
            Intrinsics.copydefault(lifecycleOwner, "");
            viewModelStoreOwner = (FragmentActivity) lifecycleOwner;
        } else {
            viewModelStoreOwner = null;
        }
        if (viewModelStoreOwner != null) {
            return (BotReminderOperatorPresenter) new ViewModelProvider(viewModelStoreOwner).get(BotReminderOperatorPresenter.class);
        }
        return null;
    }

    private final Context copydefault() {
        LifecycleOwner lifecycleOwner = this.copydefault;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            return ((Fragment) lifecycleOwner).getContext();
        }
        if (!(lifecycleOwner instanceof FragmentActivity)) {
            return null;
        }
        Intrinsics.copydefault(lifecycleOwner, "");
        return (FragmentActivity) lifecycleOwner;
    }

    public final void OLrzqt(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl = KWHzl();
        if (botReminderOperatorPresenterKWHzl != null) {
            botReminderOperatorPresenterKWHzl.AEQbTJ(tacticsData);
        }
        copydefault(tacticsData.getAlgoId(), !tacticsData.getReinvestment());
    }

    public final void KWHzl(LifecycleOwner lifecycleOwner) {
        LiveData<Pair<String, Exception>> aggregateErrorLiveData;
        LiveData<Pair<String, Boolean>> aggregateLoadingLiveData;
        C56111xwe<BotModifyResp> c56111xweOLrzqt;
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl = KWHzl();
        if (botReminderOperatorPresenterKWHzl != null && (c56111xweOLrzqt = botReminderOperatorPresenterKWHzl.OLrzqt()) != null) {
            c56111xweOLrzqt.observe(lifecycleOwner, new Activity(new Function1() { // from class: o.wPH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotReminderOperatorDisposer.AEQbTJ(this.AEQbTJ, (BotModifyResp) obj);
                }
            }));
        }
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl2 = KWHzl();
        if (botReminderOperatorPresenterKWHzl2 != null && (aggregateLoadingLiveData = botReminderOperatorPresenterKWHzl2.getAggregateLoadingLiveData()) != null) {
            aggregateLoadingLiveData.observe(lifecycleOwner, new Activity(new Function1() { // from class: o.wPJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotReminderOperatorDisposer.KWHzl(this.AEQbTJ, (androidx.core.util.Pair) obj);
                }
            }));
        }
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl3 = KWHzl();
        if (botReminderOperatorPresenterKWHzl3 == null || (aggregateErrorLiveData = botReminderOperatorPresenterKWHzl3.getAggregateErrorLiveData()) == null) {
            return;
        }
        aggregateErrorLiveData.observe(lifecycleOwner, new Activity(new Function1() { // from class: o.wPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotReminderOperatorDisposer.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(BotReminderOperatorDisposer botReminderOperatorDisposer, BotModifyResp botModifyResp) {
        String strAYXKKw;
        TacticsData tacticsDataAEQbTJ;
        Intrinsics.checkNotNullParameter(botModifyResp, "");
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl = botReminderOperatorDisposer.KWHzl();
        if (botReminderOperatorPresenterKWHzl != null && (tacticsDataAEQbTJ = botReminderOperatorPresenterKWHzl.AEQbTJ()) != null && tacticsDataAEQbTJ.getReinvestment()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.frkDMe);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dzCpvv);
        }
        C55326xho.toastWithSuccessfulIcon$default(strAYXKKw, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(BotReminderOperatorDisposer botReminderOperatorDisposer, Pair pair) {
        String strAYXKKw;
        TacticsData tacticsDataAEQbTJ;
        xAE xaeKWHzl;
        String str = (String) pair.first;
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl = botReminderOperatorDisposer.KWHzl();
        if (Intrinsics.EZpvd((Object) str, (Object) ((botReminderOperatorPresenterKWHzl == null || (xaeKWHzl = botReminderOperatorPresenterKWHzl.KWHzl()) == null) ? null : xaeKWHzl.bB_()))) {
            if (((Boolean) pair.second).booleanValue()) {
                BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl2 = botReminderOperatorDisposer.KWHzl();
                if (botReminderOperatorPresenterKWHzl2 != null && (tacticsDataAEQbTJ = botReminderOperatorPresenterKWHzl2.AEQbTJ()) != null && tacticsDataAEQbTJ.getReinvestment()) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QfJbVf);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DUUtXg);
                }
                botReminderOperatorDisposer.EZpvd = C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, strAYXKKw, null, 0, null, 0, 0, 62, null);
            } else {
                Toast toast = botReminderOperatorDisposer.EZpvd;
                if (toast != null) {
                    toast.cancel();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(BotReminderOperatorDisposer botReminderOperatorDisposer, Pair pair) {
        xAE xaeKWHzl;
        String str = (String) pair.first;
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl = botReminderOperatorDisposer.KWHzl();
        if (Intrinsics.EZpvd((Object) str, (Object) ((botReminderOperatorPresenterKWHzl == null || (xaeKWHzl = botReminderOperatorPresenterKWHzl.KWHzl()) == null) ? null : xaeKWHzl.bB_()))) {
            String message = ((Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            }
            Object obj = pair.first;
            String message2 = ((Exception) pair.second).getMessage();
            if (message2 == null) {
                message2 = "";
            }
            pUU.copydefault("BotReminderOperatorDisposer", "Toggle ReInvestment Fail " + obj + " - " + message2);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final String str, final boolean z) {
        String strAYXKKw;
        String strAYXKKw2;
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DSiOMJ);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DrqXHJ);
        }
        String str2 = strAYXKKw;
        if (z) {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.DGUQLIhJrIAr);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.DIIpTV);
        }
        String str3 = strAYXKKw2;
        Context contextCopydefault = copydefault();
        if (contextCopydefault != null) {
            C52602wRm.OLrzqt.KWHzl(contextCopydefault, (1184 & 2) != 0 ? null : str2, (1184 & 4) != 0 ? null : str3, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wPF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotReminderOperatorDisposer.OLrzqt(this.copydefault, str, z, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wPC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotReminderOperatorDisposer.OLrzqt((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 1024) == 0 ? null : null);
        }
    }

    public static final Unit OLrzqt(BotReminderOperatorDisposer botReminderOperatorDisposer, String str, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        BotReminderOperatorPresenter botReminderOperatorPresenterKWHzl = botReminderOperatorDisposer.KWHzl();
        if (botReminderOperatorPresenterKWHzl != null) {
            botReminderOperatorPresenterKWHzl.AEQbTJ(new ToggleReinvestmentReq(str, z));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.copydefault = null;
    }
}
