package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradeuilib.widget.SelectedTime;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotOngoingParams;
import com.okinc.unify_trade.biz.BotOrderFilter;
import com.okinc.unify_trade.biz.OrderPositionData;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52324wHe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52376wJc extends AbstractC54505xKx<AbstractC50755vaD, BotOrderListPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public C50000uzE KWHzl;
    public final int copydefault = C48033uCm.Activity.HJWChPRAkuRW;

    /* JADX INFO: renamed from: o.wJc$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.wJc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wJc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C52376wJc KWHzl(boolean z) {
            C52376wJc c52376wJc = new C52376wJc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("type", z);
            c52376wJc.setArguments(bundle);
            return c52376wJc;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? arguments.getBoolean("type") : false;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = C48033uCm.Application.OVMstZ;
        C52324wHe.Application application = C52324wHe.Companion;
        java.lang.String botType = dxcTrN().valueOf().getBotType();
        boolean z = this.AEQbTJ;
        fragmentTransactionBeginTransaction.replace(i, application.OLrzqt(new BotOngoingParams(botType, z, false, false, false, false, false, false, !z, false, false, 16, 1788, null))).commitNowAllowingStateLoss();
        gGvvIC().OLrzqt.setSelectIconVisibility(this.AEQbTJ);
        gGvvIC().OLrzqt.setSelectIconSize(20.0f, 20.0f);
        gGvvIC().OLrzqt.setDividerVisibility(false);
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        AEQbTJ();
        AYXKKw();
    }

    private final void AYXKKw() {
        TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52376wJc.KWHzl(this.AEQbTJ, (OrderPositionData) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataFetchVPNInfo = dxcTrN().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52376wJc.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.util.List<BotCategoryConfig>> tradeLiveDataAhwBna = dxcTrN().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner3, new ActionBar());
    }

    public static final Unit KWHzl(C52376wJc c52376wJc, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c52376wJc.dxcTrN().OLrzqt(orderPositionData);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52376wJc c52376wJc, boolean z) {
        c52376wJc.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wJc$ActionBar */
    public static final class ActionBar implements Observer<java.util.List<? extends BotCategoryConfig>> {
        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onChanged(java.util.List<BotCategoryConfig> list) {
            xOR xorCopydefault;
            Intrinsics.checkNotNullParameter(list, "");
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) {
                return;
            }
            BotCategoryConfig botCategoryConfig = (BotCategoryConfig) CollectionsKt___CollectionsKt.firstOrNull(list);
            xorCopydefault.OLrzqt(botCategoryConfig != null ? botCategoryConfig.getStrategy() : null);
        }
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        djBIcL();
        if (this.AEQbTJ) {
            C52116vzn.EZpvd.AEQbTJ();
        } else {
            dxcTrN().AkhnZx();
            C52116vzn.EZpvd.copydefault();
        }
        dxcTrN().ejfBZ();
    }

    private final void djBIcL() {
        dxcTrN().copydefault(this.AEQbTJ);
        KWHzl();
    }

    public final void KWHzl() {
        if (isVisible()) {
            dxcTrN().copydefault(this.AEQbTJ);
            gGvvIC().OLrzqt.AEQbTJ(dxcTrN().valueOf().getInstId(), dxcTrN().valueOf().getInstType(), dxcTrN().valueOf().getBotType());
        }
    }

    private final void AEQbTJ() {
        gEmmrt();
        copydefault();
    }

    public final void copydefault() {
        gGvvIC().OLrzqt.setOnSelectCallback(new yHO() { // from class: o.wJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52376wJc.EZpvd(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        gGvvIC().OLrzqt.setOnBotSelectCallback(new Function1() { // from class: o.wJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52376wJc.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C52376wJc c52376wJc, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        BotOrderFilter botOrderFilterValueOf = c52376wJc.dxcTrN().valueOf();
        botOrderFilterValueOf.setBotType(str3);
        botOrderFilterValueOf.setInstId(str);
        if (str2 == null) {
            str2 = "ANY";
        }
        botOrderFilterValueOf.setInstType(str2);
        c52376wJc.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52376wJc c52376wJc, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52376wJc.dxcTrN().valueOf().setBotType(str);
        c52376wJc.valueOf();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        gGvvIC().OLrzqt.setSelectClickListener(new View.OnClickListener() { // from class: o.wJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52376wJc.copydefault(this.KWHzl, view);
            }
        });
    }

    public static final void copydefault(final C52376wJc c52376wJc, android.view.View view) {
        if (c52376wJc.KWHzl == null) {
            c52376wJc.KWHzl = new C50000uzE();
        }
        C50000uzE c50000uzE = c52376wJc.KWHzl;
        if (c50000uzE != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = c52376wJc.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c50000uzE.show(childFragmentManager, C56524yIo.AEQbTJ(C52376wJc.class).valueOf());
        }
        C50000uzE c50000uzE2 = c52376wJc.KWHzl;
        if (c50000uzE2 != null) {
            c50000uzE2.KWHzl(new yHS() { // from class: o.wJi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHS
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return C52376wJc.EZpvd(this.KWHzl, (Calendar) obj, (Calendar) obj2, ((java.lang.Boolean) obj3).booleanValue(), ((java.lang.Boolean) obj4).booleanValue(), (SelectedTime) obj5);
                }
            });
        }
    }

    public static final Unit EZpvd(C52376wJc c52376wJc, Calendar calendar, Calendar calendar2, boolean z, boolean z2, SelectedTime selectedTime) {
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        Intrinsics.checkNotNullParameter(selectedTime, "");
        c52376wJc.dxcTrN().valueOf().setStartTime(java.lang.String.valueOf(calendar.getTimeInMillis()));
        c52376wJc.dxcTrN().valueOf().setEndTime(java.lang.String.valueOf(calendar2.getTimeInMillis()));
        c52376wJc.valueOf();
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        getChildFragmentManager().setFragmentResult("bot_filter", new android.os.Bundle());
    }
}
