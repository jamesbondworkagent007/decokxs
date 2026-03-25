package com.okinc.oklive.app.domain;

import com.okinc.oklive.app.data.model.remote.PullUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.sTA;
import o.sTS;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class LivestreamInfoImpl$getAvailableQualities$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ sTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamInfoImpl$getAvailableQualities$2(sTS sts, String str, Continuation<? super LivestreamInfoImpl$getAvailableQualities$2> continuation) {
        super(2, continuation);
        this.this$0 = sts;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamInfoImpl$getAvailableQualities$2(this.this$0, this.$channelId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return ((LivestreamInfoImpl$getAvailableQualities$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sTS sts = this.this$0;
            String str = this.$channelId;
            this.label = 1;
            obj = sts.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sTA sta = (sTA) obj;
        if (sta instanceof sTA.TaskDescription) {
            List<PullUrl> pullUrlList = ((sTA.TaskDescription) sta).AEQbTJ().getPullUrlList();
            if (pullUrlList == null) {
                return yDY.AhwBna();
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(pullUrlList, 10));
            Iterator<T> it = pullUrlList.iterator();
            while (it.hasNext()) {
                arrayList.add(((PullUrl) it.next()).getQuality());
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }
}
