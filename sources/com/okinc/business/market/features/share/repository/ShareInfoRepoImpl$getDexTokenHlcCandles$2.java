package com.okinc.business.market.features.share.repository;

import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29455ktv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareInfoRepoImpl$getDexTokenHlcCandles$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends List<? extends String>>>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ String $after;
    final /* synthetic */ String $bar;
    final /* synthetic */ String $before;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $limit;
    int label;
    final /* synthetic */ C29455ktv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareInfoRepoImpl$getDexTokenHlcCandles$2(C29455ktv c29455ktv, String str, String str2, String str3, String str4, String str5, String str6, Continuation<? super ShareInfoRepoImpl$getDexTokenHlcCandles$2> continuation) {
        super(1, continuation);
        this.this$0 = c29455ktv;
        this.$chainId = str;
        this.$address = str2;
        this.$after = str3;
        this.$before = str4;
        this.$bar = str5;
        this.$limit = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ShareInfoRepoImpl$getDexTokenHlcCandles$2(this.this$0, this.$chainId, this.$address, this.$after, this.$before, this.$bar, this.$limit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends List<? extends String>>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<List<String>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<List<String>>>> continuation) {
        return ((ShareInfoRepoImpl$getDexTokenHlcCandles$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23229huL interfaceC23229huL = this.this$0.EZpvd;
            String str = this.$chainId;
            String str2 = this.$address;
            String str3 = this.$after;
            String str4 = this.$before;
            String str5 = this.$bar;
            String str6 = this.$limit;
            this.label = 1;
            obj = interfaceC23229huL.OLrzqt(str, str2, str3, str4, str5, str6, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
