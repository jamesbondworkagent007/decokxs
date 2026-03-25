package com.okinc.tradingbot.impl.order.strategy.recurring.phase;

import com.okinc.unify_trade.bot.data.SelectCoinData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C33069mpW;
import o.C33129mqd;
import o.C48033uCm;
import o.C52794wYp;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.vTV;
import o.wYF;

/* JADX INFO: loaded from: classes19.dex */
public final class RecurringSelectCoinFragment$extraOnItemSelect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ vTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringSelectCoinFragment$extraOnItemSelect$1(vTV vtv, Continuation<? super RecurringSelectCoinFragment$extraOnItemSelect$1> continuation) {
        super(2, continuation);
        this.this$0 = vtv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringSelectCoinFragment$extraOnItemSelect$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringSelectCoinFragment$extraOnItemSelect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayListGEmmrt = this.this$0.gEmmrt();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListGEmmrt) {
                if (((SelectCoinData) obj2).isSelected()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SelectCoinData) it.next()).getName());
            }
            boolean z = false;
            if (arrayList2.size() == 1 && Intrinsics.EZpvd(arrayList2.get(0), (Object) this.this$0.OLrzqt)) {
                z = true;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList2, this.this$0, z, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.recurring.phase.RecurringSelectCoinFragment$extraOnItemSelect$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $areListsEqual;
        final /* synthetic */ List<String> $selected;
        int label;
        final /* synthetic */ vTV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, vTV vtv, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$selected = list;
            this.this$0 = vtv;
            this.$areListsEqual = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$selected, this.this$0, this.$areListsEqual, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C52794wYp c52794wYpAEQbTJ;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(this.$selected.size()), C56443yFo.AEQbTJ(1))) {
                    wYF wyf = this.this$0.copydefault;
                    if (wyf != null) {
                        wyf.setPrimaryText(C33069mpW.copydefault(C48033uCm.Fragment.aVhqwO, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.$selected.size()))))));
                    }
                } else {
                    wYF wyf2 = this.this$0.copydefault;
                    if (wyf2 != null) {
                        wyf2.setPrimaryText(C33069mpW.copydefault(C48033uCm.Fragment.dPnHjp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.$selected.size()))))));
                    }
                }
                wYF wyf3 = this.this$0.copydefault;
                if (wyf3 != null && (c52794wYpAEQbTJ = wyf3.AEQbTJ()) != null) {
                    c52794wYpAEQbTJ.setEnabled(!this.$areListsEqual && (this.$selected.isEmpty() ^ true));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
