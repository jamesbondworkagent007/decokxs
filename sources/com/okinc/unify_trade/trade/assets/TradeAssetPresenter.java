package com.okinc.unify_trade.trade.assets;

import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.SimulateAssetsRequest;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.AccountDetailData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.unify_trade.trade.account.AccountBalance;
import com.okinc.unify_trade.trade.assets.TradeAssetPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC55657xoA;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C54589xNz;
import o.C56109xwc;
import o.C56111xwe;
import o.C56161xxb;
import o.C56173xxn;
import o.InterfaceC54581xNr;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58217yxC;
import o.InterfaceC58222yxH;
import o.InterfaceC58227yxM;
import o.pUU;
import o.xKK;
import o.xUR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeAssetPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C56111xwe<List<Unit>> AEQbTJ;
    public final C56173xxn EZpvd;
    public Observer<Exception> OLrzqt;
    public final C56161xxb copydefault;

    public interface ActionBar {
        void KWHzl();
    }

    public interface Application<T> {
        void OLrzqt(T t);
    }

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56161xxb getGetAccountBalanceUseCase() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<Unit>> getResetDemoBalanceLD() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56173xxn getResetDemoBalanceUseCase() {
        return this.EZpvd;
    }

    public final void onInvisible() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAssetPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56161xxb();
        this.EZpvd = new C56173xxn();
        this.AEQbTJ = new C56111xwe<>();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.trade.assets.TradeAssetPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final InterfaceC58217yxC getAccountBalance(final AbstractC55657xoA abstractC55657xoA, final Application<AccountBalanceData> application, final ActionBar actionBar) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX abstractC58185ywXCopydefault = xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.xLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                TradeAssetPresenter.getAccountBalance$lambda$4(this.OLrzqt, objectRef, abstractC55657xoA, application, actionBar, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.xLm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                TradeAssetPresenter.getAccountBalance$lambda$6(objectRef, this);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.xLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeAssetPresenter.getAccountBalance$lambda$7(abstractC55657xoA, this, (AccountBalance) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.xLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeAssetPresenter.getAccountBalance$lambda$9(actionBar, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.util.ArrayList] */
    public static final void getAccountBalance$lambda$4(TradeAssetPresenter tradeAssetPresenter, Ref.ObjectRef objectRef, AbstractC55657xoA abstractC55657xoA, final Application application, final ActionBar actionBar, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C56111xwe c56111xwe = new C56111xwe();
        C56161xxb c56161xxb = tradeAssetPresenter.copydefault;
        c56161xxb.OLrzqt(abstractC55657xoA != null ? abstractC55657xoA.OLrzqt() : null);
        c56161xxb.AEQbTJ(c56111xwe);
        xKK.Activity.execute$default(c56161xxb, 0L, 1, null);
        c56111xwe.observeForever(new StateListAnimator(new Function1() { // from class: o.xLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeAssetPresenter.getAccountBalance$lambda$4$lambda$1(application, interfaceC58184ywW, (java.util.List) obj);
            }
        }));
        Observer<Exception> observer = tradeAssetPresenter.OLrzqt;
        if (observer != null) {
            tradeAssetPresenter.copydefault.AhwBna().removeObserver(observer);
        }
        tradeAssetPresenter.OLrzqt = new Observer() { // from class: o.xLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                TradeAssetPresenter.getAccountBalance$lambda$4$lambda$3(actionBar, (java.lang.Exception) obj);
            }
        };
        C56109xwc<Exception> c56109xwcAhwBna = tradeAssetPresenter.copydefault.AhwBna();
        Observer<Exception> observer2 = tradeAssetPresenter.OLrzqt;
        Intrinsics.copydefault(observer2);
        c56109xwcAhwBna.observeForever(observer2);
        Object[] objArr = new Object[1];
        objArr[0] = new Activity(interfaceC58184ywW, abstractC55657xoA != null ? abstractC55657xoA.OLrzqt() : null, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())));
        objectRef.element = yDY.copydefault(objArr);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            T t = objectRef.element;
            Intrinsics.copydefault(t);
            interfaceC54581xNrOLrzqt.copydefault((ArrayList<Object>) t);
        }
    }

    public static final Unit getAccountBalance$lambda$4$lambda$1(Application application, InterfaceC58184ywW interfaceC58184ywW, List list) {
        AccountBalanceData accountBalanceData = C33129mqd.KWHzl((Collection) list) ? (AccountBalanceData) list.get(0) : null;
        if (accountBalanceData != null) {
            interfaceC58184ywW.onNext(new AccountBalance(accountBalanceData, "http"));
        } else if (application != null) {
            application.OLrzqt(accountBalanceData);
        }
        return Unit.INSTANCE;
    }

    public static final void getAccountBalance$lambda$4$lambda$3(ActionBar actionBar, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (actionBar != null) {
            actionBar.KWHzl();
        }
    }

    public static final class Activity extends AbstractC55657xoA {
        public final /* synthetic */ InterfaceC58184ywW<AccountBalance> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(InterfaceC58184ywW<AccountBalance> interfaceC58184ywW, String str, String str2) {
            super(str, str2);
            this.KWHzl = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(AccountBalanceData accountBalanceData, String str, Boolean bool) {
            Intrinsics.checkNotNullParameter(accountBalanceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("TradeAssetPresenter", " " + bool + " " + accountBalanceData);
            this.KWHzl.onNext(new AccountBalance(accountBalanceData, str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getAccountBalance$lambda$6(Ref.ObjectRef objectRef, TradeAssetPresenter tradeAssetPresenter) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        ArrayList<Object> arrayList = (ArrayList) objectRef.element;
        if (arrayList != null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
        }
        tradeAssetPresenter.copydefault.AYXKKw();
    }

    public static final Unit getAccountBalance$lambda$7(AbstractC55657xoA abstractC55657xoA, TradeAssetPresenter tradeAssetPresenter, AccountBalance accountBalance) {
        if (abstractC55657xoA != null) {
            abstractC55657xoA.EZpvd(tradeAssetPresenter.setCoinFullName(accountBalance.getResp()), accountBalance.getOrigin());
        }
        return Unit.INSTANCE;
    }

    public static final Unit getAccountBalance$lambda$9(ActionBar actionBar, Throwable th) {
        if (actionBar != null) {
            actionBar.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public final AccountBalanceData setCoinFullName(AccountBalanceData accountBalanceData) {
        String strCopydefault;
        if (C33129mqd.KWHzl((Collection) accountBalanceData.getDetails())) {
            ArrayList<AccountDetailData> details = accountBalanceData.getDetails();
            Intrinsics.copydefault(details);
            int i = 0;
            for (Object obj : details) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                AccountDetailData accountDetailData = (AccountDetailData) obj;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (strCopydefault = interfaceC54581xNrOLrzqt.copydefault(accountDetailData.getCcy())) == null) {
                    strCopydefault = "";
                }
                accountDetailData.setCoinFullName(strCopydefault);
                i++;
            }
        }
        return accountBalanceData;
    }

    public final void resetSimulateAssets(String str) {
        C56173xxn c56173xxn = this.EZpvd;
        c56173xxn.EZpvd(new SimulateAssetsRequest(str));
        c56173xxn.AEQbTJ(this.AEQbTJ);
        xKK.Activity.execute$default(c56173xxn, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.copydefault, this.EZpvd);
    }
}
