package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$getAllWallet$1;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$getMainWallet$1;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$getWalletById$1;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$refreshAllWalletAsset$2;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$refreshMpcWalletsState$2;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$setMainWallet$1;
import com.okinc.business.defi.wallet.switchComponent.repository.WalletRepositoryImpl$setMainWallet$2;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.AAWalletEnableState;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fRx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17777fRx implements InterfaceC17773fRt {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static volatile InterfaceC17773fRt copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fRx.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C17777fRx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C17777fRx() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC17773fRt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super InterfaceC9738bbJ> continuation) throws java.lang.Throwable {
        WalletRepositoryImpl$getMainWallet$1 walletRepositoryImpl$getMainWallet$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof WalletRepositoryImpl$getMainWallet$1) {
            walletRepositoryImpl$getMainWallet$1 = (WalletRepositoryImpl$getMainWallet$1) continuation;
            int i = walletRepositoryImpl$getMainWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getMainWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getMainWallet$1 = new WalletRepositoryImpl$getMainWallet$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletRepositoryImpl$getMainWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletRepositoryImpl$getMainWallet$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl();
                walletRepositoryImpl$getMainWallet$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, walletRepositoryImpl$getMainWallet$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC17773fRt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super InterfaceC9738bbJ> continuation) throws java.lang.Throwable {
        WalletRepositoryImpl$getWalletById$1 walletRepositoryImpl$getWalletById$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof WalletRepositoryImpl$getWalletById$1) {
            walletRepositoryImpl$getWalletById$1 = (WalletRepositoryImpl$getWalletById$1) continuation;
            int i = walletRepositoryImpl$getWalletById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getWalletById$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getWalletById$1 = new WalletRepositoryImpl$getWalletById$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletRepositoryImpl$getWalletById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletRepositoryImpl$getWalletById$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
                walletRepositoryImpl$getWalletById$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, walletRepositoryImpl$getWalletById$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC17773fRt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<? extends AbstractC12784ctX>> continuation) throws java.lang.Throwable {
        WalletRepositoryImpl$getAllWallet$1 walletRepositoryImpl$getAllWallet$1;
        if (continuation instanceof WalletRepositoryImpl$getAllWallet$1) {
            walletRepositoryImpl$getAllWallet$1 = (WalletRepositoryImpl$getAllWallet$1) continuation;
            int i = walletRepositoryImpl$getAllWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getAllWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getAllWallet$1 = new WalletRepositoryImpl$getAllWallet$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletRepositoryImpl$getAllWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletRepositoryImpl$getAllWallet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 2, null);
            walletRepositoryImpl$getAllWallet$1.label = 1;
            objAwait = RxAwaitKt.await(allRootWallets$default, walletRepositoryImpl$getAllWallet$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "");
        return objAwait;
    }

    @Override // o.InterfaceC17773fRt
    public java.lang.Object copydefault(@NotNull java.util.List<? extends AbstractC12782ctV> list, @NotNull Continuation<? super Unit> continuation) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new WalletRepositoryImpl$refreshMpcWalletsState$2(list, null), continuation);
            return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC17773fRt
    public MpcWalletService.MpcWalletAbleStatus EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(interfaceC9738bbJ);
    }

    @Override // o.InterfaceC17773fRt
    public AAWalletEnableState AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((InterfaceC54825xWs) C43251rlk.copydefault(InterfaceC54825xWs.class)).OLrzqt(interfaceC9738bbJ).getAaState();
    }

    @Override // o.InterfaceC17773fRt
    public java.lang.String KWHzl(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).EZpvd(mpcWalletAbleStatus, interfaceC9738bbJ);
    }

    @Override // o.InterfaceC17773fRt
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new WalletRepositoryImpl$refreshAllWalletAsset$2(null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fRx$Application */
    public static final class Application implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            OLrzqt(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(boolean z) {
            if (this.copydefault.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC17773fRt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        WalletRepositoryImpl$setMainWallet$1 walletRepositoryImpl$setMainWallet$1;
        if (continuation instanceof WalletRepositoryImpl$setMainWallet$1) {
            walletRepositoryImpl$setMainWallet$1 = (WalletRepositoryImpl$setMainWallet$1) continuation;
            int i = walletRepositoryImpl$setMainWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$setMainWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$setMainWallet$1 = new WalletRepositoryImpl$setMainWallet$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletRepositoryImpl$setMainWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletRepositoryImpl$setMainWallet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WalletRepositoryImpl$setMainWallet$2 walletRepositoryImpl$setMainWallet$2 = new WalletRepositoryImpl$setMainWallet$2(str, null);
            walletRepositoryImpl$setMainWallet$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, walletRepositoryImpl$setMainWallet$2, walletRepositoryImpl$setMainWallet$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "");
        return objWithContext;
    }

    @Override // o.InterfaceC17773fRt
    public void OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        java.util.List<InterfaceC9780bbz> listIsConnected = interfaceC9738bbJ.isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listIsConnected, 10));
        java.util.Iterator<T> it = listIsConnected.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC9780bbz) it.next()).getAddress());
        }
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        if (c11205cFp.AEQbTJ(arrayList).getFirst().booleanValue()) {
            RxBus.AEQbTJ(new C9915beb());
        }
        c11205cFp.OLrzqt(arrayList);
    }

    @Override // o.InterfaceC17773fRt
    public InterfaceC9731bbC copydefault(long j) {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(j, true);
    }

    /* JADX INFO: renamed from: o.fRx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fRx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final InterfaceC17773fRt KWHzl() {
            InterfaceC17773fRt c17777fRx = C17777fRx.copydefault;
            if (c17777fRx == null) {
                synchronized (this) {
                    c17777fRx = C17777fRx.copydefault;
                    if (c17777fRx == null) {
                        c17777fRx = new C17777fRx(null);
                        StateListAnimator stateListAnimator = C17777fRx.Companion;
                        C17777fRx.copydefault = c17777fRx;
                    }
                }
            }
            return c17777fRx;
        }
    }

    @Override // o.InterfaceC17773fRt
    public java.lang.Object AEQbTJ(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull FragmentActivity fragmentActivity, @NotNull Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(mpcWalletAbleStatus, interfaceC9738bbJ, fragmentActivity, new Application(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }
}
