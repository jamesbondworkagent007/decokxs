package com.okinc.business.defi.wallet.transfer.receive.exchange;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC21108gtY;
import o.Bitmap;
import o.C13754dXa;
import o.C14316djE;
import o.C43316rmw;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WithdrawalNetworkCoinsActivity$observeNetListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC21108gtY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawalNetworkCoinsActivity$observeNetListData$1(ActivityC21108gtY activityC21108gtY, Continuation<? super WithdrawalNetworkCoinsActivity$observeNetListData$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC21108gtY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WithdrawalNetworkCoinsActivity$observeNetListData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WithdrawalNetworkCoinsActivity$observeNetListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalNetworkCoinsActivity$observeNetListData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Bitmap<ArrayList<Object>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC21108gtY this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC21108gtY activityC21108gtY, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC21108gtY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Bitmap<ArrayList<Object>> bitmap, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(bitmap, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Bitmap bitmap = (Bitmap) this.L$0;
                if (bitmap == null) {
                    return Unit.INSTANCE;
                }
                if (!(bitmap instanceof Bitmap.TaskDescription)) {
                    if (bitmap instanceof Bitmap.StateListAnimator) {
                        Bitmap.StateListAnimator stateListAnimator = (Bitmap.StateListAnimator) bitmap;
                        if (((ArrayList) stateListAnimator.OLrzqt()) == null) {
                            this.this$0.AEQbTJ.setItems(new ArrayList());
                        } else {
                            C43316rmw c43316rmw = this.this$0.AEQbTJ;
                            T tOLrzqt = stateListAnimator.OLrzqt();
                            Intrinsics.copydefault(tOLrzqt);
                            c43316rmw.setItems((List) tOLrzqt);
                        }
                        this.this$0.AEQbTJ.notifyDataSetChanged();
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (bitmap instanceof Bitmap.ActionBar) {
                        this.this$0.AEQbTJ.setItems(yDY.copydefault(new C14316djE(null, 0, 2, null)));
                        this.this$0.AEQbTJ.notifyDataSetChanged();
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                        C55326xho.toast$default(this.this$0.getString(C13754dXa.FragmentManager.skipToQueueItem), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
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
            StateFlow<Bitmap<ArrayList<Object>>> stateFlowEZpvd = this.this$0.AEQbTJ().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
