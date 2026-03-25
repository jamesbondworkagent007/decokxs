package com.okinc.oklive.app.common.util;

import android.content.Context;
import com.ibm.icu.text.DateFormat;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import o.AbstractC34718nhd;
import o.C34733nhs;
import o.C44538sTq;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveDynamicUtil$loadLiveStreamingPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $startTime;
    long J$0;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDynamicUtil$loadLiveStreamingPage$2(Context context, long j, Continuation<? super LiveDynamicUtil$loadLiveStreamingPage$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$startTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveDynamicUtil$loadLiveStreamingPage$2(this.$context, this.$startTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((LiveDynamicUtil$loadLiveStreamingPage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.$context;
            long j = this.$startTime;
            this.L$0 = context;
            this.J$0 = j;
            this.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(this));
            new C34733nhs(context, "oklive_dynamic_streaming_page_impl", false, 0L, 8, null).AEQbTJ(new TaskDescription(j, c56434yFf));
            obj = c56434yFf.KWHzl();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
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

    public static final class TaskDescription extends AbstractC34718nhd {
        public final /* synthetic */ Continuation<Boolean> KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(long j, Continuation<? super Boolean> continuation) {
            this.copydefault = j;
            this.KWHzl = continuation;
        }

        @Override // o.AbstractC34718nhd
        public void AEQbTJ() {
            pUU.KWHzl("LiveDynamicUtil", "loadLiveStreamingPage success, loadTime=" + ((System.currentTimeMillis() - this.copydefault) / ((long) 1000)) + DateFormat.SECOND);
            if (JobKt.isActive(this.KWHzl.getContext())) {
                Object obj = C44538sTq.OLrzqt;
                Continuation<Boolean> continuation = this.KWHzl;
                synchronized (obj) {
                    C44538sTq c44538sTq = C44538sTq.copydefault;
                    if (!c44538sTq.gEmmrt()) {
                        try {
                            c44538sTq.gEmmrt(true);
                            Result.Application application = Result.Companion;
                            continuation.resumeWith(Result.m7377constructorimpl(Boolean.TRUE));
                        } catch (Exception e) {
                            pUU.copydefault("LiveDynamicUtil", "loadLiveStreamingPage-onSuccess-exception: " + e.getMessage());
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // o.AbstractC34718nhd
        public void copydefault(Exception exc, String str) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(str, "");
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.copydefault) / ((long) 1000);
            pUU.copydefault("LiveDynamicUtil", "loadLiveStreamingPage onFailure, exception=" + exc.getMessage() + ", msg=" + str + ", loadTime=" + jCurrentTimeMillis + DateFormat.SECOND);
            if (JobKt.isActive(this.KWHzl.getContext())) {
                Object obj = C44538sTq.OLrzqt;
                Continuation<Boolean> continuation = this.KWHzl;
                synchronized (obj) {
                    C44538sTq c44538sTq = C44538sTq.copydefault;
                    if (!c44538sTq.AYXKKw()) {
                        try {
                            c44538sTq.EZpvd(true);
                            Result.Application application = Result.Companion;
                            continuation.resumeWith(Result.m7377constructorimpl(Boolean.FALSE));
                        } catch (Exception e) {
                            pUU.copydefault("LiveDynamicUtil", "loadLiveStreamingPage-onFailure-exception: " + e.getMessage());
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // o.AbstractC34718nhd
        public void AEQbTJ(int i) {
            pUU.EZpvd("LiveDynamicUtil", "loadLiveStreamingPage onProgress: " + i + "%");
        }

        @Override // o.AbstractC34718nhd
        public void copydefault() {
            pUU.KWHzl("LiveDynamicUtil", "loadLiveStreamingPage onCancel, loadTime=" + ((System.currentTimeMillis() - this.copydefault) / ((long) 1000)) + DateFormat.SECOND);
            if (JobKt.isActive(this.KWHzl.getContext())) {
                Object obj = C44538sTq.OLrzqt;
                Continuation<Boolean> continuation = this.KWHzl;
                synchronized (obj) {
                    C44538sTq c44538sTq = C44538sTq.copydefault;
                    if (!c44538sTq.OLrzqt()) {
                        try {
                            c44538sTq.KWHzl(true);
                            Result.Application application = Result.Companion;
                            continuation.resumeWith(Result.m7377constructorimpl(Boolean.FALSE));
                        } catch (Exception e) {
                            pUU.copydefault("LiveDynamicUtil", "loadLiveStreamingPage-onCancel-exception: " + e.getMessage());
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
    }
}
