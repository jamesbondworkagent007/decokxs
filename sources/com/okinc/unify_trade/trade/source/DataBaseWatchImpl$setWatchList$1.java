package com.okinc.unify_trade.trade.source;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C33134mqi;
import o.C55608xnE;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.qWN;
import o.xPT;

/* JADX INFO: loaded from: classes12.dex */
public final class DataBaseWatchImpl$setWatchList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BizInstrument $info;
    final /* synthetic */ MutableLiveData<BizResp> $resp;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ xPT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBaseWatchImpl$setWatchList$1(String str, xPT xpt, BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData, Continuation<? super DataBaseWatchImpl$setWatchList$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.this$0 = xpt;
        this.$info = bizInstrument;
        this.$resp = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataBaseWatchImpl$setWatchList$1(this.$type, this.this$0, this.$info, this.$resp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataBaseWatchImpl$setWatchList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$type;
                xPT xpt = this.this$0;
                BizInstrument bizInstrument = this.$info;
                Result.Application application = Result.Companion;
                switch (str.hashCode()) {
                    case 48:
                        if (str.equals("0")) {
                            qWN qwnCopydefault = xpt.copydefault();
                            this.label = 1;
                            if (qwnCopydefault.copydefault(bizInstrument, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        break;
                    case 49:
                        if (str.equals("1")) {
                            qWN qwnCopydefault2 = xpt.copydefault();
                            this.label = 3;
                            if (qwnCopydefault2.OLrzqt(bizInstrument, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            qWN qwnCopydefault3 = xpt.copydefault();
                            this.label = 2;
                            if (qwnCopydefault3.KWHzl(bizInstrument, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        break;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        MutableLiveData<BizResp> mutableLiveData = this.$resp;
        String str2 = this.$type;
        xPT xpt2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(true, ""));
            }
            if (Intrinsics.EZpvd((Object) str2, (Object) "0")) {
                if (xpt2.AEQbTJ || !C55608xnE.isLogin$default(null, 1, null)) {
                    C33134mqi.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDGTeJD), 0, 1, (Object) null);
                }
            } else if (Intrinsics.EZpvd((Object) str2, (Object) "1")) {
                C33134mqi.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.svY), 0, 1, (Object) null);
            }
        }
        MutableLiveData<BizResp> mutableLiveData2 = this.$resp;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && mutableLiveData2 != null) {
            String message = thM7380exceptionOrNullimpl.getMessage();
            mutableLiveData2.postValue(new BizResp(false, message != null ? message : ""));
        }
        return Unit.INSTANCE;
    }
}
