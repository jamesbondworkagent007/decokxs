package com.okinc.im.imui.relationlist.ui.newmessage;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.ActivityC34105nRp;
import o.C37295orD;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31257lqc;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C37295orD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1(C37295orD c37295orD, Continuation<? super NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c37295orD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            NewMessageViewModel newMessageViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = newMessageViewModelDjBIcL.OLrzqt(this);
            if (obj == objCopydefault) {
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(zBooleanValue, this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.ui.newmessage.NewMessageFragment$buttonListClickListener$1$onItemClick$dialog$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $hasSA;
        int label;
        final /* synthetic */ C37295orD this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, C37295orD c37295orD, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hasSA = z;
            this.this$0 = c37295orD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$hasSA, this.this$0, continuation);
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
                if (this.$hasSA) {
                    ActivityResultLauncher activityResultLauncher = this.this$0.AYXKKw;
                    ActivityC34105nRp.Activity activity = ActivityC34105nRp.Companion;
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    activityResultLauncher.launch(activity.OLrzqt(contextRequireContext));
                } else {
                    InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
                    if (interfaceC31257lqc != null) {
                        Context contextRequireContext2 = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        InterfaceC31257lqc.StateListAnimator.activatePayAccount$default(interfaceC31257lqc, contextRequireContext2, false, true, true, null, 16, null);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
