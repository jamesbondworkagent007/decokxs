package com.okinc.business.defi.biz.impl;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13426dKx;
import o.fVJ;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SingleTeeStatus>, Object> {
    final /* synthetic */ String $accountId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1$1$2(String str, Continuation<? super OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1$1$2> continuation) {
        super(2, continuation);
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1$1$2(this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SingleTeeStatus> continuation) {
        return ((OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[PHI: r10
  0x0063: PHI (r10v9 java.lang.Object) = (r10v7 java.lang.Object), (r10v0 java.lang.Object) binds: [B:17:0x0060, B:6:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC12782ctV abstractC12782ctVOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C12827cuN.Application application = C12827cuN.Companion;
            abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(application, null, 1, null).OLrzqt(this.$accountId);
            if (abstractC12782ctVOLrzqt == null) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(application, null, 1, null).OLrzqt(this.$accountId, false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            fVJ fieldNames = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
            String str = this.$accountId;
            String strEjfBZ = abstractC12782ctVOLrzqt.ejfBZ();
            this.label = 2;
            obj = fieldNames.AEQbTJ(str, strEjfBZ, false, true, this);
            return obj != objCopydefault ? objCopydefault : obj;
        }
        if (i != 1) {
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        abstractC12782ctVOLrzqt = (AbstractC12782ctV) obj;
        fVJ fieldNames2 = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
        String str2 = this.$accountId;
        String strEjfBZ2 = abstractC12782ctVOLrzqt.ejfBZ();
        this.label = 2;
        obj = fieldNames2.AEQbTJ(str2, strEjfBZ2, false, true, this);
        if (obj != objCopydefault) {
        }
    }
}
