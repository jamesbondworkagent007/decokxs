package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
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
import o.AbstractC16400ejH;
import o.ActivityC20923gpz;
import o.C56391yDq;
import o.C56442yFn;
import o.C57227yeT;
import o.C57287yfa;
import o.C57294yfh;
import o.InterfaceC57302yfp;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC16400ejH $this_observeData;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$5(ActivityC20923gpz activityC20923gpz, AbstractC16400ejH abstractC16400ejH, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$5> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
        this.$this_observeData = abstractC16400ejH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMultiTransferInputAddressActivity$observeData$5(this.this$0, this.$this_observeData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractC16400ejH $this_observeData;
        int label;
        final /* synthetic */ ActivityC20923gpz this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC20923gpz activityC20923gpz, AbstractC16400ejH abstractC16400ejH, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC20923gpz;
            this.$this_observeData = abstractC16400ejH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$this_observeData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$5$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03231 extends SuspendLambda implements Function2<InterfaceC57302yfp, Continuation<? super Unit>, Object> {
            final /* synthetic */ AbstractC16400ejH $this_observeData;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC20923gpz this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03231(ActivityC20923gpz activityC20923gpz, AbstractC16400ejH abstractC16400ejH, Continuation<? super C03231> continuation) {
                super(2, continuation);
                this.this$0 = activityC20923gpz;
                this.$this_observeData = abstractC16400ejH;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03231 c03231 = new C03231(this.this$0, this.$this_observeData, continuation);
                c03231.L$0 = obj;
                return c03231;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC57302yfp interfaceC57302yfp, Continuation<? super Unit> continuation) {
                return ((C03231) create(interfaceC57302yfp, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0112 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC57302yfp interfaceC57302yfp;
                AbstractC16400ejH abstractC16400ejH;
                C57294yfh c57294yfh;
                AbstractC16400ejH abstractC16400ejH2;
                C57294yfh c57294yfh2;
                InterfaceC57302yfp interfaceC57302yfp2;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                AbstractC16400ejH abstractC16400ejH3 = null;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    interfaceC57302yfp = (InterfaceC57302yfp) this.L$0;
                    if (interfaceC57302yfp instanceof C57287yfa) {
                        this.this$0.KWHzl(((C57287yfa) interfaceC57302yfp).copydefault().length() == 0);
                        C57294yfh c57294yfh3 = this.$this_observeData.AkhnZx;
                        List<C57227yeT.TaskDescription> listAhwBna = yDY.AhwBna();
                        this.L$0 = interfaceC57302yfp;
                        this.label = 1;
                        if (c57294yfh3.copydefault(listAhwBna, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        this.$this_observeData.AkhnZx.AEQbTJ();
                        C57294yfh c57294yfh4 = this.$this_observeData.AkhnZx;
                        C57287yfa c57287yfa = (C57287yfa) interfaceC57302yfp;
                        abstractC16400ejH = this.this$0.OLrzqt;
                        if (abstractC16400ejH == null) {
                        }
                        TextView textView = abstractC16400ejH.valueOf;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        c57294yfh4.copydefault(c57287yfa, textView);
                        c57294yfh = this.$this_observeData.AkhnZx;
                        this.L$0 = null;
                        this.label = 2;
                        if (c57294yfh.AEQbTJ(false, (Continuation<? super Unit>) this) == objCopydefault) {
                        }
                        this.$this_observeData.AkhnZx.setAddressListInvisible(true);
                        this.$this_observeData.AkhnZx.EZpvd();
                        abstractC16400ejH2 = this.this$0.OLrzqt;
                        if (abstractC16400ejH2 == null) {
                        }
                        abstractC16400ejH3.values.setVisibility(8);
                    } else {
                        if (!(interfaceC57302yfp instanceof C57227yeT)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C57227yeT c57227yeT = (C57227yeT) interfaceC57302yfp;
                        this.this$0.KWHzl(c57227yeT.EZpvd().isEmpty());
                        TextView textView2 = this.$this_observeData.valueOf;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(8);
                        this.$this_observeData.AkhnZx.KWHzl();
                        this.$this_observeData.AkhnZx.setAddressListInvisible(false);
                        C57294yfh c57294yfh5 = this.$this_observeData.AkhnZx;
                        List<C57227yeT.TaskDescription> listEZpvd = c57227yeT.EZpvd();
                        this.L$0 = interfaceC57302yfp;
                        this.label = 3;
                        if (c57294yfh5.copydefault(listEZpvd, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        c57294yfh2 = this.$this_observeData.AkhnZx;
                        this.L$0 = interfaceC57302yfp;
                        this.label = 4;
                        if (c57294yfh2.AEQbTJ(true, (Continuation<? super Unit>) this) != objCopydefault) {
                        }
                    }
                } else if (i == 1) {
                    interfaceC57302yfp = (InterfaceC57302yfp) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.$this_observeData.AkhnZx.AEQbTJ();
                    C57294yfh c57294yfh42 = this.$this_observeData.AkhnZx;
                    C57287yfa c57287yfa2 = (C57287yfa) interfaceC57302yfp;
                    abstractC16400ejH = this.this$0.OLrzqt;
                    if (abstractC16400ejH == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16400ejH = null;
                    }
                    TextView textView3 = abstractC16400ejH.valueOf;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    c57294yfh42.copydefault(c57287yfa2, textView3);
                    c57294yfh = this.$this_observeData.AkhnZx;
                    this.L$0 = null;
                    this.label = 2;
                    if (c57294yfh.AEQbTJ(false, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.$this_observeData.AkhnZx.setAddressListInvisible(true);
                    this.$this_observeData.AkhnZx.EZpvd();
                    abstractC16400ejH2 = this.this$0.OLrzqt;
                    if (abstractC16400ejH2 == null) {
                    }
                    abstractC16400ejH3.values.setVisibility(8);
                } else if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    this.$this_observeData.AkhnZx.setAddressListInvisible(true);
                    this.$this_observeData.AkhnZx.EZpvd();
                    abstractC16400ejH2 = this.this$0.OLrzqt;
                    if (abstractC16400ejH2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16400ejH3 = abstractC16400ejH2;
                    }
                    abstractC16400ejH3.values.setVisibility(8);
                } else if (i == 3) {
                    interfaceC57302yfp = (InterfaceC57302yfp) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c57294yfh2 = this.$this_observeData.AkhnZx;
                    this.L$0 = interfaceC57302yfp;
                    this.label = 4;
                    if (c57294yfh2.AEQbTJ(true, (Continuation<? super Unit>) this) != objCopydefault) {
                        return objCopydefault;
                    }
                    interfaceC57302yfp2 = interfaceC57302yfp;
                    this.this$0.AEQbTJ((List<C57227yeT.TaskDescription>) ((C57227yeT) interfaceC57302yfp2).EZpvd());
                    this.this$0.valueOf();
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC57302yfp2 = (InterfaceC57302yfp) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.AEQbTJ((List<C57227yeT.TaskDescription>) ((C57227yeT) interfaceC57302yfp2).EZpvd());
                    this.this$0.valueOf();
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
                StateFlow<InterfaceC57302yfp> stateFlowAhwBna = this.this$0.AEQbTJ().AhwBna();
                C03231 c03231 = new C03231(this.this$0, this.$this_observeData, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAhwBna, c03231, this) == objCopydefault) {
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
            ActivityC20923gpz activityC20923gpz = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC20923gpz, this.$this_observeData, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC20923gpz, state, anonymousClass1, this) == objCopydefault) {
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
