package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;
import o.fVJ;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8(String str, Continuation<? super OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8> continuation) {
        super(2, continuation);
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8(this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountId;
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$accountId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$accountId, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            AbstractC12782ctV abstractC12782ctVOLrzqt;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                str = this.$accountId;
                Result.Application application2 = Result.Companion;
                C12827cuN.Application application3 = C12827cuN.Companion;
                abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(application3, null, 1, null).OLrzqt(str);
                if (abstractC12782ctVOLrzqt == null) {
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(application3, null, 1, null).OLrzqt(str, false);
                    this.L$0 = str;
                    this.label = 1;
                    obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
                String str2 = str;
                fVJ fieldNames = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
                String strEjfBZ = abstractC12782ctVOLrzqt.ejfBZ();
                this.L$0 = null;
                this.label = 2;
                obj = fieldNames.AEQbTJ(str2, strEjfBZ, false, true, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                Result.m7377constructorimpl((SingleTeeStatus) obj);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl((SingleTeeStatus) obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            abstractC12782ctVOLrzqt = (AbstractC12782ctV) obj;
            String str22 = str;
            fVJ fieldNames2 = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
            String strEjfBZ2 = abstractC12782ctVOLrzqt.ejfBZ();
            this.L$0 = null;
            this.label = 2;
            obj = fieldNames2.AEQbTJ(str22, strEjfBZ2, false, true, this);
            if (obj == objCopydefault) {
            }
            Result.m7377constructorimpl((SingleTeeStatus) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountId, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
