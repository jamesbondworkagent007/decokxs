package com.okinc.im.imui.broadcastmessages.messagelist;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33891nJr;
import o.C35254nrp;
import o.C35428nvF;
import o.C35956oJy;
import o.C37005olf;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessageListFragment$initView$6 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35428nvF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragment$initView$6(C35428nvF c35428nvF, Continuation<? super BroadcastMessageListFragment$initView$6> continuation) {
        super(2, continuation);
        this.this$0 = c35428nvF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageListFragment$initView$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageListFragment$initView$6) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C33891nJr c33891nJr = this.this$0.valueOf;
            if (c33891nJr != null && (recyclerView = c33891nJr.EZpvd) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.registerAdapterDataObserver(new StateListAnimator(adapter, recyclerView));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class StateListAnimator extends RecyclerView.AdapterDataObserver {
        public final /* synthetic */ RecyclerView.Adapter AEQbTJ;
        public final /* synthetic */ RecyclerView copydefault;

        public StateListAnimator(RecyclerView.Adapter adapter, RecyclerView recyclerView) {
            this.AEQbTJ = adapter;
            this.copydefault = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            List<C35254nrp> currentList;
            super.onItemRangeChanged(i, i2, obj);
            RecyclerView.Adapter adapter = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                adapter.unregisterAdapterDataObserver(this);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            RecyclerView.Adapter adapter2 = this.copydefault.getAdapter();
            Integer numValueOf = null;
            C37005olf c37005olf = adapter2 instanceof C37005olf ? (C37005olf) adapter2 : null;
            if (c37005olf != null && (currentList = c37005olf.getCurrentList()) != null) {
                numValueOf = Integer.valueOf(yDY.AuCTel(currentList));
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C35956oJy.AEQbTJ(this.copydefault, numValueOf.intValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            List<C35254nrp> currentList;
            super.onItemRangeChanged(i, i2);
            RecyclerView.Adapter adapter = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                adapter.unregisterAdapterDataObserver(this);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            RecyclerView.Adapter adapter2 = this.copydefault.getAdapter();
            Integer numValueOf = null;
            C37005olf c37005olf = adapter2 instanceof C37005olf ? (C37005olf) adapter2 : null;
            if (c37005olf != null && (currentList = c37005olf.getCurrentList()) != null) {
                numValueOf = Integer.valueOf(yDY.AuCTel(currentList));
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C35956oJy.AEQbTJ(this.copydefault, numValueOf.intValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            List<C35254nrp> currentList;
            super.onItemRangeInserted(i, i2);
            RecyclerView.Adapter adapter = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                adapter.unregisterAdapterDataObserver(this);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            RecyclerView.Adapter adapter2 = this.copydefault.getAdapter();
            Integer numValueOf = null;
            C37005olf c37005olf = adapter2 instanceof C37005olf ? (C37005olf) adapter2 : null;
            if (c37005olf != null && (currentList = c37005olf.getCurrentList()) != null) {
                numValueOf = Integer.valueOf(yDY.AuCTel(currentList));
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C35956oJy.AEQbTJ(this.copydefault, numValueOf.intValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            List<C35254nrp> currentList;
            super.onItemRangeMoved(i, i2, i3);
            RecyclerView.Adapter adapter = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                adapter.unregisterAdapterDataObserver(this);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            RecyclerView.Adapter adapter2 = this.copydefault.getAdapter();
            Integer numValueOf = null;
            C37005olf c37005olf = adapter2 instanceof C37005olf ? (C37005olf) adapter2 : null;
            if (c37005olf != null && (currentList = c37005olf.getCurrentList()) != null) {
                numValueOf = Integer.valueOf(yDY.AuCTel(currentList));
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C35956oJy.AEQbTJ(this.copydefault, numValueOf.intValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            List<C35254nrp> currentList;
            super.onItemRangeRemoved(i, i2);
            RecyclerView.Adapter adapter = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                adapter.unregisterAdapterDataObserver(this);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            RecyclerView.Adapter adapter2 = this.copydefault.getAdapter();
            Integer numValueOf = null;
            C37005olf c37005olf = adapter2 instanceof C37005olf ? (C37005olf) adapter2 : null;
            if (c37005olf != null && (currentList = c37005olf.getCurrentList()) != null) {
                numValueOf = Integer.valueOf(yDY.AuCTel(currentList));
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C35956oJy.AEQbTJ(this.copydefault, numValueOf.intValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            List<C35254nrp> currentList;
            super.onChanged();
            RecyclerView.Adapter adapter = this.AEQbTJ;
            try {
                Result.Application application = Result.Companion;
                adapter.unregisterAdapterDataObserver(this);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            RecyclerView.Adapter adapter2 = this.copydefault.getAdapter();
            Integer numValueOf = null;
            C37005olf c37005olf = adapter2 instanceof C37005olf ? (C37005olf) adapter2 : null;
            if (c37005olf != null && (currentList = c37005olf.getCurrentList()) != null) {
                numValueOf = Integer.valueOf(yDY.AuCTel(currentList));
            }
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C35956oJy.AEQbTJ(this.copydefault, numValueOf.intValue());
        }
    }
}
