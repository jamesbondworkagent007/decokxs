package com.okinc.ok_kyc_core.presentation.processing;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Polling;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC43728ruk;
import o.C56391yDq;
import o.C56442yFn;
import o.rBH;
import o.rIF;

/* JADX INFO: loaded from: classes23.dex */
public final class ProcessingFragment$getWCResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProcessingAppModel $processingAppModel;
    int label;
    final /* synthetic */ rIF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessingFragment$getWCResult$1(rIF rif, ProcessingAppModel processingAppModel, Continuation<? super ProcessingFragment$getWCResult$1> continuation) {
        super(2, continuation);
        this.this$0 = rif;
        this.$processingAppModel = processingAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProcessingFragment$getWCResult$1(this.this$0, this.$processingAppModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProcessingFragment$getWCResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$getWCResult$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProcessingAppModel $processingAppModel;
        int label;
        final /* synthetic */ rIF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(rIF rif, ProcessingAppModel processingAppModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = rif;
            this.$processingAppModel = processingAppModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$processingAppModel, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$getWCResult$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ProcessingAppModel $processingAppModel;
            Object L$0;
            int label;
            final /* synthetic */ rIF this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05161(rIF rif, ProcessingAppModel processingAppModel, Continuation<? super C05161> continuation) {
                super(2, continuation);
                this.this$0 = rif;
                this.$processingAppModel = processingAppModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05161(this.this$0, this.$processingAppModel, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                String url;
                HashMap<String, String> map;
                AbstractC43728ruk abstractC43728ruk;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    rBH rbhZsXlph = this.this$0.fetchVPNInfo().zsXlph();
                    Polling polling = this.$processingAppModel.getPolling();
                    if (polling == null || (url = polling.getUrl()) == null) {
                        url = "";
                    }
                    String str = url;
                    Polling polling2 = this.$processingAppModel.getPolling();
                    if (polling2 == null || (map = polling2.getPollingParam()) == null) {
                        map = new HashMap<>();
                    }
                    HashMap<String, String> map2 = map;
                    Long processTimeOut = this.$processingAppModel.getProcessTimeOut();
                    long jLongValue = processTimeOut != null ? processTimeOut.longValue() : 120000L;
                    this.label = 1;
                    obj = rbhZsXlph.KWHzl(str, map2, jLongValue, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            return Unit.INSTANCE;
                        }
                        abstractC43728ruk = (AbstractC43728ruk) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        rIF rif = this.this$0;
                        ProcessingAppModel processingAppModel = this.$processingAppModel;
                        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            ProcessingFragment$getWCResult$1$1$1$2$1 processingFragment$getWCResult$1$1$1$2$1 = new ProcessingFragment$getWCResult$1$1$1$2$1(rif, processingAppModel, null);
                            this.L$0 = abstractC43728ruk;
                            this.label = 3;
                            if (BuildersKt.withContext(main, processingFragment$getWCResult$1$1$1$2$1, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                abstractC43728ruk = (AbstractC43728ruk) obj;
                rIF rif2 = this.this$0;
                ProcessingAppModel processingAppModel2 = this.$processingAppModel;
                if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                    ProcessingFragment$getWCResult$1$1$1$1$1 processingFragment$getWCResult$1$1$1$1$1 = new ProcessingFragment$getWCResult$1$1$1$1$1(rif2, processingAppModel2, null);
                    this.L$0 = abstractC43728ruk;
                    this.label = 2;
                    if (BuildersKt.withContext(main2, processingFragment$getWCResult$1$1$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                rIF rif3 = this.this$0;
                ProcessingAppModel processingAppModel3 = this.$processingAppModel;
                if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                }
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
                C05161 c05161 = new C05161(this.this$0, this.$processingAppModel, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05161, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rIF rif = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(rif, this.$processingAppModel, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(rif, state, anonymousClass1, this) == objCopydefault) {
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
