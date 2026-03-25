package com.okinc.business.defi.wallet.icloud;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC16388eiw;
import o.ActivityC18363fgw;
import o.C33064mpR;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ICloudListActivity$onCreate$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18363fgw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICloudListActivity$onCreate$4(ActivityC18363fgw activityC18363fgw, Continuation<? super ICloudListActivity$onCreate$4> continuation) {
        super(2, continuation);
        this.this$0 = activityC18363fgw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ICloudListActivity$onCreate$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ICloudListActivity$onCreate$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.icloud.ICloudListActivity$onCreate$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC18363fgw this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18363fgw activityC18363fgw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18363fgw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.icloud.ICloudListActivity$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02881 extends SuspendLambda implements Function2<ArrayList<Object>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC18363fgw this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02881(ActivityC18363fgw activityC18363fgw, Continuation<? super C02881> continuation) {
                super(2, continuation);
                this.this$0 = activityC18363fgw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02881 c02881 = new C02881(this.this$0, continuation);
                c02881.L$0 = obj;
                return c02881;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ArrayList<Object> arrayList, Continuation<? super Unit> continuation) {
                return ((C02881) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ArrayList arrayList = (ArrayList) this.L$0;
                    this.this$0.dismissLoading();
                    if (arrayList.isEmpty()) {
                        AbstractC16388eiw abstractC16388eiw = this.this$0.valueOf;
                        if (abstractC16388eiw == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16388eiw = null;
                        }
                        abstractC16388eiw.EZpvd.setVisibility(0);
                        AbstractC16388eiw abstractC16388eiw2 = this.this$0.valueOf;
                        if (abstractC16388eiw2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16388eiw2 = null;
                        }
                        abstractC16388eiw2.valueOf.setVisibility(8);
                    } else {
                        AbstractC16388eiw abstractC16388eiw3 = this.this$0.valueOf;
                        if (abstractC16388eiw3 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16388eiw3 = null;
                        }
                        abstractC16388eiw3.EZpvd.setVisibility(8);
                        AbstractC16388eiw abstractC16388eiw4 = this.this$0.valueOf;
                        if (abstractC16388eiw4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16388eiw4 = null;
                        }
                        abstractC16388eiw4.valueOf.setVisibility(0);
                    }
                    C33064mpR.OLrzqt(this.this$0.djBIcL(), (List<? extends Object>) arrayList);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<ArrayList<Object>> flowEZpvd = this.this$0.EZpvd().EZpvd();
                C02881 c02881 = new C02881(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowEZpvd, c02881, this) == objCopydefault) {
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
            ActivityC18363fgw activityC18363fgw = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC18363fgw, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC18363fgw, state, anonymousClass1, this) == objCopydefault) {
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
