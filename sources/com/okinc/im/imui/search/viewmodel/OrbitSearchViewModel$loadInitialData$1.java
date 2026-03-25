package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.bean.SearchResultData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class OrbitSearchViewModel$loadInitialData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SearchResultData> $resultList;
    int label;
    final /* synthetic */ OrbitSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrbitSearchViewModel$loadInitialData$1(OrbitSearchViewModel orbitSearchViewModel, List<? extends SearchResultData> list, Continuation<? super OrbitSearchViewModel$loadInitialData$1> continuation) {
        super(2, continuation);
        this.this$0 = orbitSearchViewModel;
        this.$resultList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitSearchViewModel$loadInitialData$1(this.this$0, this.$resultList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitSearchViewModel$loadInitialData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:19:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0094 -> B:19:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            List<SearchResultData> list = this.$resultList;
            this.label = 1;
            if (mutableStateFlow.emit(list, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    if (((Boolean) this.this$0.OLrzqt.getValue()).booleanValue()) {
                    }
                    if (((List) this.this$0.copydefault.getValue()).size() < 100) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                if (((List) this.this$0.copydefault.getValue()).size() < 100 && ((Boolean) this.this$0.AEQbTJ.getValue()).booleanValue()) {
                    OrbitSearchViewModel orbitSearchViewModel = this.this$0;
                    this.label = 2;
                    if (orbitSearchViewModel.OLrzqt((Continuation<? super List<? extends SearchResultData>>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (((Boolean) this.this$0.OLrzqt.getValue()).booleanValue()) {
                        this.label = 3;
                        if (DelayKt.delay(100L, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    if (((List) this.this$0.copydefault.getValue()).size() < 100) {
                        OrbitSearchViewModel orbitSearchViewModel2 = this.this$0;
                        this.label = 2;
                        if (orbitSearchViewModel2.OLrzqt((Continuation<? super List<? extends SearchResultData>>) this) == objCopydefault) {
                        }
                        if (((Boolean) this.this$0.OLrzqt.getValue()).booleanValue()) {
                        }
                        if (((List) this.this$0.copydefault.getValue()).size() < 100) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$resultList.size() < 100) {
            if (((List) this.this$0.copydefault.getValue()).size() < 100) {
            }
        } else {
            MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 4;
            if (mutableStateFlow2.emit(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
