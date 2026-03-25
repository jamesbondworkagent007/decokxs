package com.okinc.business.defi.wallet.eip7702.ui.viewmodel;

import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.eCC;
import o.eCD;

/* JADX INFO: loaded from: classes18.dex */
public final class EIP7702OnboardingViewModel$initPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ eCD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702OnboardingViewModel$initPage$1(eCD ecd, Continuation<? super EIP7702OnboardingViewModel$initPage$1> continuation) {
        super(2, continuation);
        this.this$0 = ecd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EIP7702OnboardingViewModel$initPage$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EIP7702OnboardingViewModel$initPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: CancellationException -> 0x0022, all -> 0x0119, TryCatch #2 {CancellationException -> 0x0022, all -> 0x0119, blocks: (B:8:0x001d, B:57:0x0112, B:13:0x0031, B:28:0x0081, B:30:0x0088, B:32:0x0094, B:33:0x0096, B:35:0x009c, B:38:0x00b2, B:40:0x00b6, B:43:0x00d5, B:45:0x00db, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:53:0x00f2, B:52:0x00f0, B:56:0x010f, B:16:0x0039, B:27:0x0073, B:23:0x005a), top: B:72:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6 A[Catch: CancellationException -> 0x0022, all -> 0x0119, TryCatch #2 {CancellationException -> 0x0022, all -> 0x0119, blocks: (B:8:0x001d, B:57:0x0112, B:13:0x0031, B:28:0x0081, B:30:0x0088, B:32:0x0094, B:33:0x0096, B:35:0x009c, B:38:0x00b2, B:40:0x00b6, B:43:0x00d5, B:45:0x00db, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:53:0x00f2, B:52:0x00f0, B:56:0x010f, B:16:0x0039, B:27:0x0073, B:23:0x005a), top: B:72:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5 A[Catch: CancellationException -> 0x0022, all -> 0x0119, TryCatch #2 {CancellationException -> 0x0022, all -> 0x0119, blocks: (B:8:0x001d, B:57:0x0112, B:13:0x0031, B:28:0x0081, B:30:0x0088, B:32:0x0094, B:33:0x0096, B:35:0x009c, B:38:0x00b2, B:40:0x00b6, B:43:0x00d5, B:45:0x00db, B:47:0x00e1, B:49:0x00e7, B:51:0x00ed, B:53:0x00f2, B:52:0x00f0, B:56:0x010f, B:16:0x0039, B:27:0x0073, B:23:0x005a), top: B:72:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objWithContext;
        eCD ecd;
        Ref.BooleanRef booleanRef;
        Iterator it;
        EIP7702UIState.UnavailableWallet.Status status;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.KWHzl;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                eCD ecd2 = this.this$0;
                Result.Application application2 = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = ecd2.AhwBna;
                EIP7702OnboardingViewModel$initPage$1$1$wallets$1 eIP7702OnboardingViewModel$initPage$1$1$wallets$1 = new EIP7702OnboardingViewModel$initPage$1$1$wallets$1(ecd2, null);
                this.L$0 = ecd2;
                this.label = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, eIP7702OnboardingViewModel$initPage$1$1$wallets$1, this);
                if (objWithContext != objCopydefault) {
                    return objCopydefault;
                }
                ecd = ecd2;
                obj = objWithContext;
                List list = (List) obj;
                booleanRef = new Ref.BooleanRef();
                Intrinsics.copydefault(list);
                it = list.iterator();
                while (it.hasNext()) {
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
                    if (eCC.OLrzqt(abstractC12782ctV)) {
                        booleanRef.element = true;
                    }
                    if (abstractC12782ctV.zuWLRA()) {
                        ecd.gEmmrt = abstractC12782ctV;
                        MutableSharedFlow mutableSharedFlow3 = ecd.OLrzqt;
                        this.L$0 = ecd;
                        this.L$1 = booleanRef;
                        this.L$2 = it;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(abstractC12782ctV, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                if (!booleanRef.element) {
                    MutableStateFlow mutableStateFlow = ecd.AEQbTJ;
                    List listEZpvd = C56402yEa.EZpvd(new EIP7702UIState.UnavailableWallet(EIP7702UIState.UnavailableWallet.Status.ALL_WALLETS_UNAVAILABLE));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (mutableStateFlow.emit(listEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    AbstractC12782ctV abstractC12782ctV2 = ecd.gEmmrt;
                    if (abstractC12782ctV2 != null) {
                        if (!eCC.OLrzqt(abstractC12782ctV2)) {
                            if (abstractC12782ctV2.QfsBiF() && abstractC12782ctV2.AuCTelauCTel()) {
                                status = EIP7702UIState.UnavailableWallet.Status.CURRENT_WALLET_IS_EVM_TRACKING;
                            } else {
                                status = EIP7702UIState.UnavailableWallet.Status.CURRENT_WALLET_IS_UNAVAILABLE;
                            }
                            MutableStateFlow mutableStateFlow2 = ecd.AEQbTJ;
                            List listEZpvd2 = C56402yEa.EZpvd(new EIP7702UIState.UnavailableWallet(status));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (mutableStateFlow2.emit(listEZpvd2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            eCD.refreshNetworkList$default(ecd, null, null, 3, null);
                        }
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                eCD ecd3 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MutableStateFlow mutableStateFlow3 = ecd3.AEQbTJ;
                    List listEZpvd3 = C56402yEa.EZpvd(EIP7702UIState.StateListAnimator.KWHzl);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    if (mutableStateFlow3.emit(listEZpvd3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                eCD ecd22 = this.this$0;
                Result.Application application22 = Result.Companion;
                CoroutineDispatcher coroutineDispatcher2 = ecd22.AhwBna;
                EIP7702OnboardingViewModel$initPage$1$1$wallets$1 eIP7702OnboardingViewModel$initPage$1$1$wallets$12 = new EIP7702OnboardingViewModel$initPage$1$1$wallets$1(ecd22, null);
                this.L$0 = ecd22;
                this.label = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, eIP7702OnboardingViewModel$initPage$1$1$wallets$12, this);
                if (objWithContext != objCopydefault) {
                }
                break;
            case 2:
                eCD ecd4 = (eCD) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ecd = ecd4;
                List list2 = (List) obj;
                booleanRef = new Ref.BooleanRef();
                Intrinsics.copydefault(list2);
                it = list2.iterator();
                while (it.hasNext()) {
                }
                if (!booleanRef.element) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                eCD ecd32 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                it = (Iterator) this.L$2;
                booleanRef = (Ref.BooleanRef) this.L$1;
                ecd = (eCD) this.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it.hasNext()) {
                }
                if (!booleanRef.element) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                eCD ecd322 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                eCD ecd3222 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.KWHzl;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
