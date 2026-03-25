package com.okinc.business.trade.features.home.meme.repository;

import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28277kVl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends MemeCurrencyBean>>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tradeType;
    final /* synthetic */ String $userUniqueId;
    int label;
    final /* synthetic */ C28277kVl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2(C28277kVl c28277kVl, String str, String str2, String str3, String str4, Continuation<? super MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2> continuation) {
        super(1, continuation);
        this.this$0 = c28277kVl;
        this.$chainId = str;
        this.$tradeType = str2;
        this.$accountId = str3;
        this.$userUniqueId = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2(this.this$0, this.$chainId, this.$tradeType, this.$accountId, this.$userUniqueId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends MemeCurrencyBean>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<MemeCurrencyBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<MemeCurrencyBean>>> continuation) {
        return ((MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$tradeType;
            String str3 = this.$accountId;
            String str4 = this.$userUniqueId;
            this.label = 1;
            obj = interfaceC23234huQ.KWHzl(str, str2, str3, str4, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C28277kVl c28277kVl = this.this$0;
        String str5 = this.$chainId;
        List list = (List) ((ResponseData) obj).getData();
        if (list != null) {
            c28277kVl.copydefault().put(str5, list);
        }
        return obj;
    }
}
