package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C18989fsn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryViewModel$loadHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WalletSearchHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryViewModel$loadHistory$1(WalletSearchHistoryViewModel walletSearchHistoryViewModel, Continuation<? super WalletSearchHistoryViewModel$loadHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = walletSearchHistoryViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryViewModel$loadHistory$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryViewModel$loadHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<List<? extends C18989fsn>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel$loadHistory$1$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                WalletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1 walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof WalletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1) {
                    walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1 = (WalletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1 = new WalletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    List<SearchHistoryItem> list = (List) obj;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (SearchHistoryItem searchHistoryItem : list) {
                        arrayList.add(new C18989fsn(searchHistoryItem.KWHzl(), searchHistoryItem.EZpvd(), searchHistoryItem.AYXKKw(), searchHistoryItem.AhwBna(), searchHistoryItem));
                    }
                    walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, walletSearchHistoryViewModel$loadHistory$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends C18989fsn>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateListAnimator stateListAnimator = new StateListAnimator(this.this$0.isConnected.KWHzl());
                final WalletSearchHistoryViewModel walletSearchHistoryViewModel = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel$loadHistory$1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C18989fsn> list, Continuation<? super Unit> continuation) {
                        walletSearchHistoryViewModel.AEQbTJ.setValue(list);
                        if (((Boolean) walletSearchHistoryViewModel.copydefault.getValue()).booleanValue()) {
                            walletSearchHistoryViewModel.fIwbmz++;
                            if (walletSearchHistoryViewModel.fIwbmz >= 2) {
                                walletSearchHistoryViewModel.gEmmrt = list;
                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(walletSearchHistoryViewModel), null, null, new WalletSearchHistoryViewModel$loadHistory$1$2$1(walletSearchHistoryViewModel, null), 3, null);
                            }
                        } else {
                            walletSearchHistoryViewModel.gEmmrt = list;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateListAnimator.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("WalletSearchHistoryViewModel", "Error loading history: " + e.getMessage(), e);
            this.this$0.DbNXlk = false;
            this.this$0.copydefault.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
