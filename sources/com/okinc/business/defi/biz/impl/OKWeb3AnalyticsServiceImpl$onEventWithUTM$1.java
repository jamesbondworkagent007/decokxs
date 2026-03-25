package com.okinc.business.defi.biz.impl;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C32866mlf;
import o.C32872mll;
import o.C56391yDq;
import o.C56442yFn;
import o.cXH;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWeb3AnalyticsServiceImpl$onEventWithUTM$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TrackChannel[] $channel;
    final /* synthetic */ String $this_onEventWithUTM;
    final /* synthetic */ boolean $willIncludeUTM;
    final /* synthetic */ Function1<EventParamsList, Unit> $wrapper;
    int label;
    final /* synthetic */ cXH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKWeb3AnalyticsServiceImpl$onEventWithUTM$1(cXH cxh, String str, TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1, boolean z, Continuation<? super OKWeb3AnalyticsServiceImpl$onEventWithUTM$1> continuation) {
        super(2, continuation);
        this.this$0 = cxh;
        this.$this_onEventWithUTM = str;
        this.$channel = trackChannelArr;
        this.$wrapper = function1;
        this.$willIncludeUTM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWeb3AnalyticsServiceImpl$onEventWithUTM$1(this.this$0, this.$this_onEventWithUTM, this.$channel, this.$wrapper, this.$willIncludeUTM, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWeb3AnalyticsServiceImpl$onEventWithUTM$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("OKWeb3AnalyticsServiceImpl", "Event tracking failed", e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cXH cxh = this.this$0;
            this.label = 1;
            if (cxh.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_onEventWithUTM, this.$channel, this.$wrapper, this.$willIncludeUTM, this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.impl.OKWeb3AnalyticsServiceImpl$onEventWithUTM$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TrackChannel[] $channel;
        final /* synthetic */ String $this_onEventWithUTM;
        final /* synthetic */ boolean $willIncludeUTM;
        final /* synthetic */ Function1<EventParamsList, Unit> $wrapper;
        int label;
        final /* synthetic */ cXH this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1, boolean z, cXH cxh, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_onEventWithUTM = str;
            this.$channel = trackChannelArr;
            this.$wrapper = function1;
            this.$willIncludeUTM = z;
            this.this$0 = cxh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_onEventWithUTM, this.$channel, this.$wrapper, this.$willIncludeUTM, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EventParamsList eventParamsList = new EventParamsList(yDY.AhwBna());
                C32872mll c32872mll = C32872mll.OLrzqt;
                String str = this.$this_onEventWithUTM;
                Function1<EventParamsList, Unit> function1 = this.$wrapper;
                boolean z = this.$willIncludeUTM;
                cXH cxh = this.this$0;
                if (function1 != null) {
                    function1.invoke(eventParamsList);
                }
                if (z) {
                    cxh.OLrzqt(eventParamsList);
                }
                cxh.KWHzl(eventParamsList);
                Unit unit = Unit.INSTANCE;
                TrackChannel[] trackChannelArr = this.$channel;
                String[] strArrKWHzl = C32866mlf.KWHzl((TrackChannel[]) Arrays.copyOf(trackChannelArr, trackChannelArr.length));
                c32872mll.copydefault(str, eventParamsList, (String[]) Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
                return unit;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
