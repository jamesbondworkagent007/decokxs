package com.okinc.business.defi.wallet.mpc;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
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
import o.AbstractC12784ctX;
import o.ActivityC17435fFf;
import o.C56391yDq;
import o.C56442yFn;
import o.fGL;
import o.fGT;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapeMpcWalletAccountListActivity$onCreate$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17435fFf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapeMpcWalletAccountListActivity$onCreate$4(ActivityC17435fFf activityC17435fFf, Continuation<? super EscapeMpcWalletAccountListActivity$onCreate$4> continuation) {
        super(2, continuation);
        this.this$0 = activityC17435fFf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapeMpcWalletAccountListActivity$onCreate$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapeMpcWalletAccountListActivity$onCreate$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC17435fFf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17435fFf activityC17435fFf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17435fFf;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03071 extends SuspendLambda implements Function2<List<? extends MpcPrivateKeyItem>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC17435fFf this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03071(ActivityC17435fFf activityC17435fFf, Continuation<? super C03071> continuation) {
                super(2, continuation);
                this.this$0 = activityC17435fFf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03071 c03071 = new C03071(this.this$0, continuation);
                c03071.L$0 = obj;
                return c03071;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends MpcPrivateKeyItem> list, Continuation<? super Unit> continuation) {
                return invoke2((List<MpcPrivateKeyItem>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<MpcPrivateKeyItem> list, Continuation<? super Unit> continuation) {
                return ((C03071) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String mpcId;
                String uid;
                MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected;
                String mpcId2;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    this.this$0.dismissLoadingWithLogo();
                    String str = "";
                    if (!list.isEmpty()) {
                        AbstractC12784ctX abstractC12784ctXAhwBna = this.this$0.AEQbTJ().AhwBna();
                        if (abstractC12784ctXAhwBna != null) {
                            ActivityC17435fFf activityC17435fFf = this.this$0;
                            fGL.TaskDescription taskDescription = fGL.Companion;
                            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = abstractC12784ctXAhwBna.isConnected();
                            if (mpcWalletEncodeInfoIsConnected2 == null || (mpcId = mpcWalletEncodeInfoIsConnected2.getMpcId()) == null) {
                                mpcId = "";
                            }
                            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected3 = abstractC12784ctXAhwBna.isConnected();
                            if (mpcWalletEncodeInfoIsConnected3 == null || (uid = mpcWalletEncodeInfoIsConnected3.getUid()) == null) {
                                uid = "";
                            }
                            String strEZpvd = abstractC12784ctXAhwBna.EZpvd();
                            int iCopydefault = activityC17435fFf.AEQbTJ().copydefault();
                            Intrinsics.copydefault(list, "");
                            taskDescription.KWHzl(activityC17435fFf, mpcId, uid, strEZpvd, String.valueOf(iCopydefault), (ArrayList) list);
                        }
                        return Unit.INSTANCE;
                    }
                    this.this$0.showLoadingWithLogo();
                    fGT fgtOLrzqt = this.this$0.OLrzqt();
                    AbstractC12784ctX abstractC12784ctXAhwBna2 = this.this$0.AEQbTJ().AhwBna();
                    if (abstractC12784ctXAhwBna2 != null && (mpcWalletEncodeInfoIsConnected = abstractC12784ctXAhwBna2.isConnected()) != null && (mpcId2 = mpcWalletEncodeInfoIsConnected.getMpcId()) != null) {
                        str = mpcId2;
                    }
                    fgtOLrzqt.KWHzl(str);
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
                Flow<List<MpcPrivateKeyItem>> flowOLrzqt = this.this$0.AEQbTJ().OLrzqt();
                C03071 c03071 = new C03071(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowOLrzqt, c03071, this) == objCopydefault) {
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
            ActivityC17435fFf activityC17435fFf = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC17435fFf, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC17435fFf, state, anonymousClass1, this) == objCopydefault) {
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
