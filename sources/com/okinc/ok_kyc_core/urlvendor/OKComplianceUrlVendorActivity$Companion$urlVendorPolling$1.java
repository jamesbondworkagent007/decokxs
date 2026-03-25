package com.okinc.ok_kyc_core.urlvendor;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC43728ruk;
import o.C56391yDq;
import o.C56442yFn;
import o.rBC;

/* JADX INFO: loaded from: classes23.dex */
public final class OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<Boolean, Unit> $pollingStopCallback;
    final /* synthetic */ Long $pollingTimeout;
    final /* synthetic */ String $url;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1(FragmentActivity fragmentActivity, String str, Long l, Function1<? super Boolean, Unit> function1, Continuation<? super OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$url = str;
        this.$pollingTimeout = l;
        this.$pollingStopCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1(this.$activity, this.$url, this.$pollingTimeout, this.$pollingStopCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.urlvendor.OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $pollingStopCallback;
        final /* synthetic */ Long $pollingTimeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Long l, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$pollingTimeout = l;
            this.$pollingStopCallback = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$url, this.$pollingTimeout, this.$pollingStopCallback, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.ok_kyc_core.urlvendor.OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $pollingStopCallback;
            final /* synthetic */ Long $pollingTimeout;
            final /* synthetic */ String $url;
            Object L$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05221(String str, Long l, Function1<? super Boolean, Unit> function1, Continuation<? super C05221> continuation) {
                super(2, continuation);
                this.$url = str;
                this.$pollingTimeout = l;
                this.$pollingStopCallback = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05221(this.$url, this.$pollingTimeout, this.$pollingStopCallback, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC43728ruk abstractC43728ruk;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    rBC rbc = new rBC();
                    String str = this.$url;
                    HashMap map = new HashMap();
                    Long l = this.$pollingTimeout;
                    long jLongValue = l != null ? l.longValue() : 120000L;
                    this.label = 1;
                    obj = rbc.AEQbTJ(str, map, jLongValue, this);
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
                        Function1<Boolean, Unit> function1 = this.$pollingStopCallback;
                        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$2$1 oKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$2$1 = new OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$2$1(function1, null);
                            this.L$0 = abstractC43728ruk;
                            this.label = 3;
                            if (BuildersKt.withContext(main, oKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$2$1, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                abstractC43728ruk = (AbstractC43728ruk) obj;
                Function1<Boolean, Unit> function12 = this.$pollingStopCallback;
                if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                    OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$1$1 oKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$1$1 = new OKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$1$1(function12, null);
                    this.L$0 = abstractC43728ruk;
                    this.label = 2;
                    if (BuildersKt.withContext(main2, oKComplianceUrlVendorActivity$Companion$urlVendorPolling$1$1$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                Function1<Boolean, Unit> function13 = this.$pollingStopCallback;
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
                C05221 c05221 = new C05221(this.$url, this.$pollingTimeout, this.$pollingStopCallback, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05221, this) == objCopydefault) {
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
            FragmentActivity fragmentActivity = this.$activity;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$url, this.$pollingTimeout, this.$pollingStopCallback, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(fragmentActivity, state, anonymousClass1, this) == objCopydefault) {
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
