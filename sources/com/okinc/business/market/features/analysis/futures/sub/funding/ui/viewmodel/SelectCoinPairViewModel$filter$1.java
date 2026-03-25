package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes23.dex */
public final class SelectCoinPairViewModel$filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CharSequence $inputText;
    int label;
    final /* synthetic */ SelectCoinPairViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCoinPairViewModel$filter$1(SelectCoinPairViewModel selectCoinPairViewModel, CharSequence charSequence, Continuation<? super SelectCoinPairViewModel$filter$1> continuation) {
        super(2, continuation);
        this.this$0 = selectCoinPairViewModel;
        this.$inputText = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectCoinPairViewModel$filter$1(this.this$0, this.$inputText, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectCoinPairViewModel$filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AEQbTJ != null) {
                CharSequence charSequence = this.$inputText;
                List list = null;
                if (charSequence == null || StringsKt__StringsKt.fARcdN(charSequence)) {
                    SelectCoinPairViewModel selectCoinPairViewModel = this.this$0;
                    List list2 = selectCoinPairViewModel.AEQbTJ;
                    if (list2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        list = list2;
                    }
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list);
                    this.label = 1;
                    if (selectCoinPairViewModel.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) activity, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    CoroutineDispatcher coroutineDispatcherCopydefault = this.this$0.copydefault();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$inputText, null);
                    this.label = 2;
                    if (BuildersKt.withContext(coroutineDispatcherCopydefault, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.SelectCoinPairViewModel$filter$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $inputText;
        int label;
        final /* synthetic */ SelectCoinPairViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectCoinPairViewModel selectCoinPairViewModel, CharSequence charSequence, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = selectCoinPairViewModel;
            this.$inputText = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$inputText, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = this.this$0.AEQbTJ;
                if (list == null) {
                    Intrinsics.gEmmrt("");
                    list = null;
                }
                CharSequence charSequence = this.$inputText;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (StringsKt__StringsKt.AhwBna((CharSequence) ((CoinPairVo) obj2).getTitle(), charSequence, true)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    SelectCoinPairViewModel selectCoinPairViewModel = this.this$0;
                    InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                    this.label = 1;
                    if (selectCoinPairViewModel.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) taskDescription, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    SelectCoinPairViewModel selectCoinPairViewModel2 = this.this$0;
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(arrayList);
                    this.label = 2;
                    if (selectCoinPairViewModel2.OLrzqt((InterfaceC49371unL<? extends List<CoinPairVo>>) activity, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
