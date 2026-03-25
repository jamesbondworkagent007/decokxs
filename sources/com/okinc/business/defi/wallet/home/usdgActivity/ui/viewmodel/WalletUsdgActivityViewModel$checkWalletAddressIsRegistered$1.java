package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.SupportChainAddressBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC18226feR;
import o.C18181fdZ;
import o.C18236feb;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel$checkWalletAddressIsRegistered$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletUsdgActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityViewModel$checkWalletAddressIsRegistered$1(WalletUsdgActivityViewModel walletUsdgActivityViewModel, Continuation<? super WalletUsdgActivityViewModel$checkWalletAddressIsRegistered$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUsdgActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUsdgActivityViewModel$checkWalletAddressIsRegistered$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUsdgActivityViewModel$checkWalletAddressIsRegistered$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0101 A[Catch: all -> 0x0129, CancellationException -> 0x015e, TryCatch #2 {CancellationException -> 0x015e, all -> 0x0129, blocks: (B:12:0x0028, B:44:0x0120, B:15:0x0033, B:39:0x00fb, B:41:0x0101, B:18:0x003c, B:32:0x00c2, B:34:0x00c8, B:21:0x0052, B:22:0x0080, B:24:0x0086, B:25:0x00a1, B:27:0x00ad, B:29:0x00b4), top: B:57:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel;
        Object objCopydefault;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel2;
        Object obj2;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel3;
        Throwable thM7380exceptionOrNullimpl2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            walletUsdgActivityViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            walletUsdgActivityViewModel.AhwBna.setValue(walletUsdgActivityViewModel.copydefault(walletUsdgActivityViewModel.valueOf(), (List<Long>) walletUsdgActivityViewModel.AkhnZx()));
            List<SupportChainAddressBean> value = walletUsdgActivityViewModel.AhwBna().getValue();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
            for (SupportChainAddressBean supportChainAddressBean : value) {
                arrayList.add(new AddressRegisterBean(supportChainAddressBean.getWalletAddress(), supportChainAddressBean.getGeneralChainId(), supportChainAddressBean.getTokenAddress()));
            }
            C18181fdZ c18181fdZ = walletUsdgActivityViewModel.fIwbmz;
            Long lAYXKKw = walletUsdgActivityViewModel.AYXKKw();
            C18236feb c18236feb = new C18236feb(lAYXKKw != null ? lAYXKKw.longValue() : -1L, arrayList);
            this.L$0 = walletUsdgActivityViewModel;
            this.label = 1;
            objCopydefault = c18181fdZ.copydefault(c18236feb, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.L$1;
                    walletUsdgActivityViewModel3 = (WalletUsdgActivityViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    walletUsdgActivityViewModel2 = walletUsdgActivityViewModel3;
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                        pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkWalletAddressIsRegistered1", thM7380exceptionOrNullimpl2);
                        MutableSharedFlow mutableSharedFlow = walletUsdgActivityViewModel2.OLrzqt;
                        AbstractC18226feR.Activity activity = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl2.getMessage());
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 3;
                        if (mutableSharedFlow.emit(activity, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                    WalletUsdgActivityViewModel walletUsdgActivityViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                WalletUsdgActivityViewModel walletUsdgActivityViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkWalletAddressIsRegistered2", thM7380exceptionOrNullimpl);
                    MutableSharedFlow mutableSharedFlow2 = walletUsdgActivityViewModel42.OLrzqt;
                    AbstractC18226feR.Activity activity2 = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl.getMessage());
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 4;
                    if (mutableSharedFlow2.emit(activity2, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                return Unit.INSTANCE;
            }
            walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        Object obj3 = objCopydefault;
        walletUsdgActivityViewModel2 = walletUsdgActivityViewModel;
        obj2 = obj3;
        if (Result.m7384isSuccessimpl(obj2)) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            pUU.copydefault("WalletUsdgActivityViewModel", "checkWalletAddressIsRegistered: isAllRegistered:" + zBooleanValue);
            MutableSharedFlow mutableSharedFlow3 = walletUsdgActivityViewModel2.OLrzqt;
            AbstractC18226feR.LoaderManager loaderManager = new AbstractC18226feR.LoaderManager(zBooleanValue);
            this.L$0 = walletUsdgActivityViewModel2;
            this.L$1 = obj2;
            this.label = 2;
            if (mutableSharedFlow3.emit(loaderManager, this) == objCopydefault2) {
                return objCopydefault2;
            }
            walletUsdgActivityViewModel3 = walletUsdgActivityViewModel2;
            walletUsdgActivityViewModel2 = walletUsdgActivityViewModel3;
        }
        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl2 != null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
        WalletUsdgActivityViewModel walletUsdgActivityViewModel422 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
