package com.okinc.business.defi.dapp.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.dapp.bean.RpcUrl;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C15152dyt;
import o.C43246rlf;
import o.C56391yDq;
import o.C56442yFn;
import o.dDN;

/* JADX INFO: loaded from: classes4.dex */
public final class DappRpcPreLoader$preloadDefaultRpc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public static final class Activity extends TypeToken<List<? extends RpcUrl>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappRpcPreLoader$preloadDefaultRpc$1(Continuation<? super DappRpcPreLoader$preloadDefaultRpc$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DappRpcPreLoader$preloadDefaultRpc$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DappRpcPreLoader$preloadDefaultRpc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Result.Application application = Result.Companion;
                dDN ddn = dDN.copydefault;
                InputStream inputStreamOpen = C43246rlf.OLrzqt.valueOf().getAssets().open("chainRPC.json");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                String strKWHzl = ddn.KWHzl(inputStreamOpen);
                if (strKWHzl != null) {
                    List<RpcUrl> list = (List) new Gson().fromJson(strKWHzl, new Activity().getType());
                    C15152dyt c15152dyt = C15152dyt.EZpvd;
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    if (list != null) {
                        for (RpcUrl rpcUrl : list) {
                            concurrentHashMap.put(rpcUrl.getChainId(), rpcUrl.getRpcSendPath());
                        }
                    }
                    C15152dyt.AEQbTJ = concurrentHashMap;
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
