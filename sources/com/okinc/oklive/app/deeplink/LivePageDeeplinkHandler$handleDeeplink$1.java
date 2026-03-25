package com.okinc.oklive.app.deeplink;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44531sTi;

/* JADX INFO: loaded from: classes10.dex */
public final class LivePageDeeplinkHandler$handleDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $affiliateChannelId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $entrySource;
    final /* synthetic */ InterfaceC44531sTi $liveService;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ String $shareCode;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePageDeeplinkHandler$handleDeeplink$1(InterfaceC44531sTi interfaceC44531sTi, Context context, String str, String str2, String str3, Map<String, ? extends Object> map, Continuation<? super LivePageDeeplinkHandler$handleDeeplink$1> continuation) {
        super(2, continuation);
        this.$liveService = interfaceC44531sTi;
        this.$context = context;
        this.$shareCode = str;
        this.$affiliateChannelId = str2;
        this.$entrySource = str3;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivePageDeeplinkHandler$handleDeeplink$1(this.$liveService, this.$context, this.$shareCode, this.$affiliateChannelId, this.$entrySource, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivePageDeeplinkHandler$handleDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44531sTi interfaceC44531sTi = this.$liveService;
            if (interfaceC44531sTi != null) {
                Context context = this.$context;
                String str = this.$shareCode;
                String str2 = this.$affiliateChannelId;
                String str3 = this.$entrySource;
                Map<String, Object> map = this.$params;
                this.label = 1;
                if (InterfaceC44531sTi.Application.navigateToLiveStreamPage$default(interfaceC44531sTi, context, str, str2, str3, map, null, this, 32, null) == objCopydefault) {
                    return objCopydefault;
                }
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
