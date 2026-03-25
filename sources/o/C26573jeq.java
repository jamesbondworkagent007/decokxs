package o;

import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsTransactionHandler$doRedeem$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsTransactionHandler$doSave$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsTransactionHandler$onWalletPickedForInvest$1$onWalletAndNetworkSwitched$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsTransactionHandler$onWalletPickedForRedeem$1$onWalletAndNetworkSwitched$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsTransactionHandler$proceedToMakeTransaction$2;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC26670jgh;
import o.C24108iVe;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC26557jea;
import o.InterfaceC26561jee;
import o.InterfaceC54855xXv;
import o.iTU;
import o.iTX;
import o.iTY;
import o.iVA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C26573jeq {
    public iTU.Application AEQbTJ;
    public final java.lang.String AYXKKw;
    public final ProductDetailsByChain AhwBna;
    public final TaskDescription EZpvd;
    public iTY.StateListAnimator KWHzl;
    public final InterfaceC25466ixJ OLrzqt;
    public final Application copydefault;
    public final C26559jec djBIcL;
    public final C26534jeD gEmmrt;
    public final InterfaceC25526iyQ valueOf;

    /* JADX INFO: renamed from: o.jeq$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Univ3FarmInvest.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Univ3Invest.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.Univ3Redeem.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionType.Univ3FarmRedeem.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull iTU.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull iTY.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
    }

    public C26573jeq(@NotNull ProductDetailsByChain productDetailsByChain, @NotNull InterfaceC25466ixJ interfaceC25466ixJ, @NotNull InterfaceC25526iyQ interfaceC25526iyQ, C26534jeD c26534jeD, @NotNull java.lang.String str, C26559jec c26559jec) {
        Intrinsics.checkNotNullParameter(productDetailsByChain, "");
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(interfaceC25526iyQ, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = productDetailsByChain;
        this.OLrzqt = interfaceC25466ixJ;
        this.valueOf = interfaceC25526iyQ;
        this.gEmmrt = c26534jeD;
        this.AYXKKw = str;
        this.djBIcL = c26559jec;
        this.copydefault = new Application();
        this.EZpvd = new TaskDescription();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain)
  (r9v0 o.ixJ)
  (r10v0 o.iyQ)
  (r11v0 o.jeD)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:o.jec:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.jec) : (r13v0 o.jec))
 A[MD:(com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain, o.ixJ, o.iyQ, o.jeD, java.lang.String, o.jec):void (m)] (LINE:54) call: o.jeq.<init>(com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain, o.ixJ, o.iyQ, o.jeD, java.lang.String, o.jec):void type: THIS */
    public /* synthetic */ C26573jeq(ProductDetailsByChain productDetailsByChain, InterfaceC25466ixJ interfaceC25466ixJ, InterfaceC25526iyQ interfaceC25526iyQ, C26534jeD c26534jeD, java.lang.String str, C26559jec c26559jec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(productDetailsByChain, interfaceC25466ixJ, interfaceC25526iyQ, c26534jeD, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : c26559jec);
    }

    public final android.content.Context fJNWhG() {
        return this.OLrzqt.AEQbTJ();
    }

    public final AbstractActivityC33041mov fetchVPNInfo() {
        return this.OLrzqt.EZpvd();
    }

    /* JADX INFO: renamed from: o.jeq$Application */
    public static final class Application implements InterfaceC54855xXv {
        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        public Application() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C27493jwI.safeLaunch$default(C26573jeq.this.OLrzqt.KWHzl(), null, null, new ProductDetailsTransactionHandler$onWalletPickedForInvest$1$onWalletAndNetworkSwitched$1(C26573jeq.this, null), 3, null);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C26573jeq.this.ejfBZ();
        }
    }

    /* JADX INFO: renamed from: o.jeq$TaskDescription */
    public static final class TaskDescription implements InterfaceC54855xXv {
        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C27493jwI.safeLaunch$default(C26573jeq.this.OLrzqt.KWHzl(), null, null, new ProductDetailsTransactionHandler$onWalletPickedForRedeem$1$onWalletAndNetworkSwitched$1(C26573jeq.this, null), 3, null);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C26573jeq.this.ejfBZ();
        }
    }

    public final void ejfBZ() {
        if (fJNWhG() == null) {
            return;
        }
        android.content.Context contextFJNWhG = fJNWhG();
        Intrinsics.copydefault(contextFJNWhG);
        C55097xdX c55097xdX = new C55097xdX(contextFJNWhG, null, 0, 6, null);
        java.lang.String string = c55097xdX.getContext().getString(C25493ixk.FragmentManager.HJWChPOKBmQN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55097xdX.setTitle(string);
        c55097xdX.setState(4);
        android.widget.ImageView imageViewAEQbTJ = c55097xdX.AEQbTJ();
        imageViewAEQbTJ.setVisibility(0);
        imageViewAEQbTJ.setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.fdt));
        imageViewAEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.onReceive)));
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 0, 0, 0, 30, null);
        InterfaceC25526iyQ.loadData$default(this.valueOf, this.AhwBna.OLrzqt(), this.AhwBna.KWHzl(), this.AhwBna.AEQbTJ().OLrzqt(), false, false, 8, null);
        C7323ahf.KWHzl().AEQbTJ("MAIN_WALLET_CHANGED", null, null);
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object attemptToInvest$default(C26573jeq c26573jeq, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.jet
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.AYXKKw();
                }
            };
        }
        return c26573jeq.copydefault(z, (Function0<Unit>) function0, (Continuation<? super Unit>) continuation);
    }

    public final java.lang.Object copydefault(boolean z, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        C26559jec c26559jec = this.djBIcL;
        if (c26559jec != null) {
            c26559jec.AEQbTJ("invest_button");
        }
        java.lang.Object objKWHzl = KWHzl(this.AhwBna, z, function0, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object attemptToSupply$default(C26573jeq c26573jeq, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.jex
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.valueOf();
                }
            };
        }
        return c26573jeq.AEQbTJ(productDetailsByChain, z, (Function0<Unit>) function0, (Continuation<? super Unit>) continuation);
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objKWHzl = KWHzl(productDetailsByChain, z, function0, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function0, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ProductDetailsTransactionHandler$doSave$1 productDetailsTransactionHandler$doSave$1;
        java.lang.Object objKWHzl;
        C26573jeq c26573jeq;
        if (continuation instanceof ProductDetailsTransactionHandler$doSave$1) {
            productDetailsTransactionHandler$doSave$1 = (ProductDetailsTransactionHandler$doSave$1) continuation;
            int i = productDetailsTransactionHandler$doSave$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsTransactionHandler$doSave$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsTransactionHandler$doSave$1 = new ProductDetailsTransactionHandler$doSave$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsTransactionHandler$doSave$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsTransactionHandler$doSave$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25526iyQ interfaceC25526iyQ = this.valueOf;
            productDetailsTransactionHandler$doSave$1.L$0 = this;
            productDetailsTransactionHandler$doSave$1.L$1 = productDetailsByChain;
            productDetailsTransactionHandler$doSave$1.L$2 = function0;
            productDetailsTransactionHandler$doSave$1.label = 1;
            objKWHzl = interfaceC25526iyQ.KWHzl(productDetailsByChain, z, productDetailsTransactionHandler$doSave$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c26573jeq = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) productDetailsTransactionHandler$doSave$1.L$2;
            productDetailsByChain = (ProductDetailsByChain) productDetailsTransactionHandler$doSave$1.L$1;
            c26573jeq = (C26573jeq) productDetailsTransactionHandler$doSave$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            InterfaceC26557jea interfaceC26557jea = (InterfaceC26557jea) objKWHzl;
            if (interfaceC26557jea instanceof InterfaceC26557jea.StateListAnimator) {
                c26573jeq.copydefault(productDetailsByChain, true, function0);
            } else {
                C26534jeD c26534jeD = c26573jeq.gEmmrt;
                if (c26534jeD != null) {
                    c26534jeD.copydefault(interfaceC26557jea, c26573jeq.copydefault);
                }
                function0.invoke();
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            function0.invoke();
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object doSave$default(C26573jeq c26573jeq, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.jez
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.DbNXlk();
                }
            };
        }
        return c26573jeq.KWHzl(productDetailsByChain, z, (Function0<Unit>) function0, (Continuation<? super Unit>) continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object attemptToWithdraw$default(C26573jeq c26573jeq, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.jes
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.isConnected();
                }
            };
        }
        return c26573jeq.OLrzqt(productDetailsByChain, z, (Function0<Unit>) function0, (Continuation<? super Unit>) continuation);
    }

    public static final Unit isConnected() {
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objEZpvd = EZpvd(productDetailsByChain, z, function0, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object attemptToRedeem$default(C26573jeq c26573jeq, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.jeE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.gEmmrt();
                }
            };
        }
        return c26573jeq.OLrzqt(z, function0, continuation);
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(boolean z, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        C26559jec c26559jec = this.djBIcL;
        if (c26559jec != null) {
            c26559jec.AEQbTJ("redeem_button");
        }
        java.lang.Object objEZpvd = EZpvd(this.AhwBna, z, function0, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function0, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ProductDetailsTransactionHandler$doRedeem$1 productDetailsTransactionHandler$doRedeem$1;
        java.lang.Object objKWHzl;
        C26573jeq c26573jeq;
        if (continuation instanceof ProductDetailsTransactionHandler$doRedeem$1) {
            productDetailsTransactionHandler$doRedeem$1 = (ProductDetailsTransactionHandler$doRedeem$1) continuation;
            int i = productDetailsTransactionHandler$doRedeem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsTransactionHandler$doRedeem$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsTransactionHandler$doRedeem$1 = new ProductDetailsTransactionHandler$doRedeem$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsTransactionHandler$doRedeem$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsTransactionHandler$doRedeem$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25526iyQ interfaceC25526iyQ = this.valueOf;
            productDetailsTransactionHandler$doRedeem$1.L$0 = this;
            productDetailsTransactionHandler$doRedeem$1.L$1 = productDetailsByChain;
            productDetailsTransactionHandler$doRedeem$1.L$2 = function0;
            productDetailsTransactionHandler$doRedeem$1.label = 1;
            objKWHzl = interfaceC25526iyQ.KWHzl(productDetailsByChain, z, productDetailsTransactionHandler$doRedeem$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c26573jeq = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) productDetailsTransactionHandler$doRedeem$1.L$2;
            productDetailsByChain = (ProductDetailsByChain) productDetailsTransactionHandler$doRedeem$1.L$1;
            c26573jeq = (C26573jeq) productDetailsTransactionHandler$doRedeem$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            InterfaceC26557jea interfaceC26557jea = (InterfaceC26557jea) objKWHzl;
            if (interfaceC26557jea instanceof InterfaceC26557jea.StateListAnimator) {
                c26573jeq.copydefault(productDetailsByChain, false, function0);
            } else {
                C26534jeD c26534jeD = c26573jeq.gEmmrt;
                if (c26534jeD != null) {
                    c26534jeD.copydefault(interfaceC26557jea, c26573jeq.EZpvd);
                }
                function0.invoke();
            }
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            function0.invoke();
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object doRedeem$default(C26573jeq c26573jeq, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.jey
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.AkhnZx();
                }
            };
        }
        return c26573jeq.EZpvd(productDetailsByChain, z, function0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jeq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void proceedToMakeTransaction$default(C26573jeq c26573jeq, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.jev
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26573jeq.values();
                }
            };
        }
        c26573jeq.copydefault(productDetailsByChain, z, (Function0<Unit>) function0);
    }

    public static final Unit values() {
        return Unit.INSTANCE;
    }

    public final void copydefault(ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function0) {
        C27493jwI.safeLaunch$default(this.OLrzqt.KWHzl(), null, null, new ProductDetailsTransactionHandler$proceedToMakeTransaction$2(z, this, productDetailsByChain, function0, null), 3, null);
    }

    public final void EZpvd(InterfaceC26561jee interfaceC26561jee, boolean z) throws java.io.UnsupportedEncodingException {
        if (interfaceC26561jee instanceof InterfaceC26561jee.FragmentManager) {
            copydefault((InterfaceC26561jee.FragmentManager) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Fragment) {
            EZpvd((InterfaceC26561jee.Fragment) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Dialog) {
            OLrzqt((InterfaceC26561jee.Dialog) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.TaskDescription) {
            EZpvd((InterfaceC26561jee.TaskDescription) interfaceC26561jee, z);
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.PendingIntent) {
            OLrzqt(((InterfaceC26561jee.PendingIntent) interfaceC26561jee).OLrzqt());
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.ActionBar) {
            InterfaceC26561jee.ActionBar actionBar = (InterfaceC26561jee.ActionBar) interfaceC26561jee;
            if (C26531jeA.copydefault().contains(actionBar.fIwbmz())) {
                AEQbTJ(actionBar);
                return;
            } else {
                EZpvd(actionBar);
                return;
            }
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Application) {
            InterfaceC26561jee.Application application = (InterfaceC26561jee.Application) interfaceC26561jee;
            copydefault(application.KWHzl(), application.EZpvd());
        } else if (interfaceC26561jee instanceof InterfaceC26561jee.StateListAnimator) {
            KWHzl((InterfaceC26561jee.StateListAnimator) interfaceC26561jee);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(final InterfaceC26561jee.Fragment fragment, final boolean z) {
        java.lang.String string;
        iTX itxCopydefault = iTX.Companion.copydefault(new java.util.ArrayList<>(fragment.AEQbTJ()), new iTX.Activity() { // from class: o.jeu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.iTX.Activity
            public final void OLrzqt(InvestPositionSelectUIItem investPositionSelectUIItem) throws java.io.UnsupportedEncodingException {
                C26573jeq.AEQbTJ(fragment, this, z, investPositionSelectUIItem);
            }
        });
        android.content.Context contextFJNWhG = fJNWhG();
        if (contextFJNWhG != null) {
            InterfaceC26561jee interfaceC26561jeeOLrzqt = fragment.OLrzqt();
            InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeOLrzqt instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeOLrzqt : null;
            string = contextFJNWhG.getString((actionBar != null ? actionBar.fIwbmz() : null) == TransactionType.Univ3FarmInvest ? C25493ixk.FragmentManager.zhUgOk : C25493ixk.FragmentManager.GFUIi);
            if (string == null) {
                string = "";
            }
        }
        itxCopydefault.AEQbTJ(string);
        AbstractActivityC33041mov abstractActivityC33041movFetchVPNInfo = fetchVPNInfo();
        if (abstractActivityC33041movFetchVPNInfo != null) {
            itxCopydefault.show(abstractActivityC33041movFetchVPNInfo.getSupportFragmentManager(), "javaClass");
        }
    }

    public static final void AEQbTJ(InterfaceC26561jee.Fragment fragment, C26573jeq c26573jeq, boolean z, InvestPositionSelectUIItem investPositionSelectUIItem) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(investPositionSelectUIItem, "");
        InterfaceC26561jee interfaceC26561jeeOLrzqt = fragment.OLrzqt();
        InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeOLrzqt instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeOLrzqt : null;
        if (actionBar == null) {
            return;
        }
        c26573jeq.EZpvd(actionBar.OLrzqt((261631 & 1) != 0 ? actionBar.ejfBZ : null, (261631 & 2) != 0 ? actionBar.isConnected : null, (261631 & 4) != 0 ? actionBar.AhwBna : 0L, (261631 & 8) != 0 ? actionBar.valueOf : null, (261631 & 16) != 0 ? actionBar.EZpvd : 0L, (261631 & 32) != 0 ? actionBar.AYXKKw : null, (261631 & 64) != 0 ? actionBar.fJNWhG : investPositionSelectUIItem.getPositionTokenId(), (261631 & 128) != 0 ? actionBar.gEmmrt : false, (261631 & 256) != 0 ? actionBar.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBar.DbNXlk : null, (261631 & 1024) != 0 ? actionBar.values : null, (261631 & 2048) != 0 ? actionBar.OLrzqt : null, (261631 & 4096) != 0 ? actionBar.KWHzl : false, (261631 & 8192) != 0 ? actionBar.fARcdN : null, (261631 & 16384) != 0 ? actionBar.djBIcL : false, (261631 & 32768) != 0 ? actionBar.AEQbTJ : null, (261631 & 65536) != 0 ? actionBar.copydefault : null, (261631 & 131072) != 0 ? actionBar.AkhnZx : null), z);
    }

    public final void OLrzqt(InterfaceC26561jee.Dialog dialog, boolean z) {
        iVA.ActionBar actionBar = iVA.Companion;
        java.util.List<InvestOrder> investOrderList = dialog.KWHzl().getInvestOrderList();
        Intrinsics.copydefault(investOrderList, "");
        iVA ivaEZpvd = actionBar.EZpvd((java.util.ArrayList) investOrderList, dialog.EZpvd());
        ivaEZpvd.show(this.OLrzqt.getChildFragmentManager(), (java.lang.String) null);
        ivaEZpvd.OLrzqt(new Activity(dialog, this, z));
    }

    /* JADX INFO: renamed from: o.jeq$Activity */
    public static final class Activity implements iVF {
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ C26573jeq KWHzl;
        public final /* synthetic */ InterfaceC26561jee.Dialog copydefault;

        public Activity(InterfaceC26561jee.Dialog dialog, C26573jeq c26573jeq, boolean z) {
            this.copydefault = dialog;
            this.KWHzl = c26573jeq;
            this.EZpvd = z;
        }

        @Override // o.iVF
        public void AEQbTJ(InvestOrder investOrder) throws java.io.UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(investOrder, "");
            InterfaceC26561jee.ActionBar actionBarAEQbTJ = this.copydefault.AEQbTJ();
            this.KWHzl.EZpvd(actionBarAEQbTJ.OLrzqt((261631 & 1) != 0 ? actionBarAEQbTJ.ejfBZ : null, (261631 & 2) != 0 ? actionBarAEQbTJ.isConnected : null, (261631 & 4) != 0 ? actionBarAEQbTJ.AhwBna : 0L, (261631 & 8) != 0 ? actionBarAEQbTJ.valueOf : null, (261631 & 16) != 0 ? actionBarAEQbTJ.EZpvd : 0L, (261631 & 32) != 0 ? actionBarAEQbTJ.AYXKKw : null, (261631 & 64) != 0 ? actionBarAEQbTJ.fJNWhG : null, (261631 & 128) != 0 ? actionBarAEQbTJ.gEmmrt : false, (261631 & 256) != 0 ? actionBarAEQbTJ.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBarAEQbTJ.DbNXlk : investOrder, (261631 & 1024) != 0 ? actionBarAEQbTJ.values : null, (261631 & 2048) != 0 ? actionBarAEQbTJ.OLrzqt : null, (261631 & 4096) != 0 ? actionBarAEQbTJ.KWHzl : false, (261631 & 8192) != 0 ? actionBarAEQbTJ.fARcdN : null, (261631 & 16384) != 0 ? actionBarAEQbTJ.djBIcL : false, (261631 & 32768) != 0 ? actionBarAEQbTJ.AEQbTJ : null, (261631 & 65536) != 0 ? actionBarAEQbTJ.copydefault : null, (261631 & 131072) != 0 ? actionBarAEQbTJ.AkhnZx : null), this.EZpvd);
        }
    }

    public final void EZpvd(final InterfaceC26561jee.TaskDescription taskDescription, final boolean z) {
        iTX itxCopydefault = iTX.Companion.copydefault(new java.util.ArrayList<>(taskDescription.KWHzl()), new iTX.Activity() { // from class: o.jeC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.iTX.Activity
            public final void OLrzqt(InvestPositionSelectUIItem investPositionSelectUIItem) throws java.io.UnsupportedEncodingException {
                C26573jeq.OLrzqt(taskDescription, this, z, investPositionSelectUIItem);
            }
        });
        itxCopydefault.AEQbTJ(C33070mpX.AYXKKw(C25493ixk.FragmentManager.GFUIi));
        AbstractActivityC33041mov abstractActivityC33041movFetchVPNInfo = fetchVPNInfo();
        if (abstractActivityC33041movFetchVPNInfo != null) {
            itxCopydefault.show(abstractActivityC33041movFetchVPNInfo.getSupportFragmentManager(), "javaClass");
        }
    }

    public static final void OLrzqt(InterfaceC26561jee.TaskDescription taskDescription, C26573jeq c26573jeq, boolean z, InvestPositionSelectUIItem investPositionSelectUIItem) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(investPositionSelectUIItem, "");
        InterfaceC26561jee.ActionBar actionBarOLrzqt = taskDescription.OLrzqt();
        if (!(actionBarOLrzqt instanceof InterfaceC26561jee.ActionBar)) {
            actionBarOLrzqt = null;
        }
        InterfaceC26561jee.ActionBar actionBar = actionBarOLrzqt;
        if (actionBar == null) {
            return;
        }
        c26573jeq.EZpvd(actionBar.OLrzqt((261631 & 1) != 0 ? actionBar.ejfBZ : null, (261631 & 2) != 0 ? actionBar.isConnected : null, (261631 & 4) != 0 ? actionBar.AhwBna : 0L, (261631 & 8) != 0 ? actionBar.valueOf : null, (261631 & 16) != 0 ? actionBar.EZpvd : 0L, (261631 & 32) != 0 ? actionBar.AYXKKw : null, (261631 & 64) != 0 ? actionBar.fJNWhG : investPositionSelectUIItem.getPositionTokenId(), (261631 & 128) != 0 ? actionBar.gEmmrt : false, (261631 & 256) != 0 ? actionBar.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBar.DbNXlk : null, (261631 & 1024) != 0 ? actionBar.values : null, (261631 & 2048) != 0 ? actionBar.OLrzqt : null, (261631 & 4096) != 0 ? actionBar.KWHzl : false, (261631 & 8192) != 0 ? actionBar.fARcdN : null, (261631 & 16384) != 0 ? actionBar.djBIcL : false, (261631 & 32768) != 0 ? actionBar.AEQbTJ : null, (261631 & 65536) != 0 ? actionBar.copydefault : null, (261631 & 131072) != 0 ? actionBar.AkhnZx : null), z);
    }

    public final void copydefault(final InterfaceC26561jee.FragmentManager fragmentManager, final boolean z) {
        AbstractActivityC33041mov abstractActivityC33041movFetchVPNInfo = fetchVPNInfo();
        if (abstractActivityC33041movFetchVPNInfo != null) {
            C24108iVe.Companion.AEQbTJ(new C24108iVe.Application() { // from class: o.jew
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C24108iVe.Application
                public final void copydefault() throws java.io.UnsupportedEncodingException {
                    C26573jeq.AEQbTJ(this.copydefault, fragmentManager, z);
                }
            }).show(abstractActivityC33041movFetchVPNInfo.getSupportFragmentManager(), "javaClass");
        }
    }

    public static final void AEQbTJ(C26573jeq c26573jeq, InterfaceC26561jee.FragmentManager fragmentManager, boolean z) throws java.io.UnsupportedEncodingException {
        c26573jeq.EZpvd(fragmentManager.copydefault(), z);
    }

    public final void OLrzqt(InvestTipInfoVo investTipInfoVo) throws java.io.UnsupportedEncodingException {
        AbstractActivityC33041mov abstractActivityC33041movFetchVPNInfo = fetchVPNInfo();
        if (abstractActivityC33041movFetchVPNInfo != null) {
            C27569jxf.OLrzqt.KWHzl(abstractActivityC33041movFetchVPNInfo, abstractActivityC33041movFetchVPNInfo.getSupportFragmentManager(), investTipInfoVo, (Function0<Unit>) ((24 & 8) != 0 ? null : null), (Function1<? super java.lang.String, Unit>) ((24 & 16) != 0 ? null : null));
        }
    }

    public final void copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
        iTU.Companion.OLrzqt(productDetailsUserTradeAction, l, this.AEQbTJ).show(this.OLrzqt.getChildFragmentManager(), iTU.class.getName());
    }

    public final void KWHzl(InterfaceC26561jee.StateListAnimator stateListAnimator) {
        iTY.ActionBar.newInstance$default(iTY.Companion, stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), null, 16, null).show(this.OLrzqt.getChildFragmentManager(), iTY.class.getSimpleName());
    }

    public final void EZpvd(InterfaceC26561jee.ActionBar actionBar) {
        TransactionConfig transactionConfigKWHzl = KWHzl(actionBar);
        if (actionBar.AEQbTJ() || transactionConfigKWHzl.AxsJAY()) {
            AbstractActivityC33041mov abstractActivityC33041movFetchVPNInfo = fetchVPNInfo();
            if (abstractActivityC33041movFetchVPNInfo != null) {
                abstractActivityC33041movFetchVPNInfo.startActivity(ActivityC26670jgh.Activity.intent$default(ActivityC26670jgh.Companion, abstractActivityC33041movFetchVPNInfo, transactionConfigKWHzl, 0, 4, null));
                return;
            }
            return;
        }
        copydefault(actionBar, transactionConfigKWHzl.wlaJM());
    }

    public final void copydefault(InterfaceC26561jee.ActionBar actionBar, boolean z) {
        android.content.Context contextFJNWhG;
        if (!z || (contextFJNWhG = fJNWhG()) == null) {
            return;
        }
        C27508jwX.AEQbTJ.OLrzqt(contextFJNWhG, actionBar.gEmmrt(), (992 & 4) != 0 ? true : actionBar.AhwBna(), (992 & 8) != 0 ? null : null, (992 & 16) != 0 ? 0L : actionBar.EZpvd(), (992 & 32) != 0 ? null : null, (992 & 64) != 0 ? null : this.AYXKKw, (992 & 128) != 0 ? null : java.lang.Integer.valueOf(actionBar.djBIcL().getValue()), (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(InterfaceC26561jee.ActionBar actionBar) {
        android.content.Intent intent;
        TransactionConfig transactionConfigKWHzl = KWHzl(actionBar);
        int i = ActionBar.EZpvd[actionBar.fIwbmz().ordinal()];
        if (i == 1) {
            intent = new android.content.Intent(fJNWhG(), (java.lang.Class<?>) ActivityC26816jjU.class);
        } else if (i == 2) {
            intent = new android.content.Intent(fJNWhG(), (java.lang.Class<?>) InvestUniv3SubscribeActivity.class);
        } else if (i == 3) {
            android.content.Context contextFJNWhG = fJNWhG();
            if (contextFJNWhG != null) {
                intent = C27508jwX.AEQbTJ.KWHzl(contextFJNWhG, transactionConfigKWHzl);
            }
        } else {
            intent = i != 4 ? null : new android.content.Intent(fJNWhG(), (java.lang.Class<?>) ActivityC26830jji.class);
        }
        if (intent == null) {
            return;
        }
        intent.putExtra("key.trx_config", transactionConfigKWHzl);
        AbstractActivityC33041mov abstractActivityC33041movFetchVPNInfo = fetchVPNInfo();
        if (abstractActivityC33041movFetchVPNInfo != null) {
            abstractActivityC33041movFetchVPNInfo.startActivity(intent);
        }
    }

    public final TransactionConfig KWHzl(InterfaceC26561jee.ActionBar actionBar) {
        long jLongValue;
        long jGEmmrt = actionBar.gEmmrt();
        long jEZpvd = actionBar.EZpvd();
        boolean zAhwBna = actionBar.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int value = actionBar.djBIcL().getValue();
        int value2 = actionBar.fIwbmz().getValue();
        int value3 = actionBar.values().getValue();
        java.lang.String strIsConnected = actionBar.isConnected();
        java.lang.String strValueOf = actionBar.valueOf();
        if (actionBar.fARcdN() instanceof Supply) {
            jLongValue = ((Supply) actionBar.fARcdN()).EZpvd();
        } else {
            java.lang.Long lFetchVPNInfo = actionBar.fetchVPNInfo();
            jLongValue = lFetchVPNInfo != null ? lFetchVPNInfo.longValue() : 0L;
        }
        return new TransactionConfig(value, value2, jGEmmrt, zAhwBna, jLongValue, jEZpvd, strValueOf, this.AYXKKw, arrayList, value3, null, 0L, 0, strIsConnected, actionBar.AkhnZx(), null, actionBar.KWHzl(), java.lang.Boolean.valueOf(actionBar.fARcdN() instanceof Supply), false, false, null, actionBar.OLrzqt(), false, false, null, 31234048, null);
    }
}
