package com.okinc.okex.search.viewmodel;

import com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC44051sBn;
import o.C44055sBr;
import o.C44760scx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchSuggestionsViewModel$getSearchSuggestions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $keyword;
    Object L$0;
    int label;
    final /* synthetic */ SearchSuggestionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsViewModel$getSearchSuggestions$1(SearchSuggestionsViewModel searchSuggestionsViewModel, String str, Continuation<? super SearchSuggestionsViewModel$getSearchSuggestions$1> continuation) {
        super(2, continuation);
        this.this$0 = searchSuggestionsViewModel;
        this.$keyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchSuggestionsViewModel$getSearchSuggestions$1(this.this$0, this.$keyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchSuggestionsViewModel$getSearchSuggestions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object next;
        SearchSuggestionsViewModel.TaskDescription c0567TaskDescription;
        MutableStateFlow mutableStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44055sBr c44055sBr = this.this$0.djBIcL;
            String str = this.$keyword;
            this.label = 1;
            obj = c44055sBr.OLrzqt(str, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.EZpvd.set("ARG_KEYWORD", this.$keyword);
                    return Unit.INSTANCE;
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!list.isEmpty()) {
                    c0567TaskDescription = new SearchSuggestionsViewModel.TaskDescription.Activity(this.$keyword);
                } else {
                    c0567TaskDescription = new SearchSuggestionsViewModel.TaskDescription.C0567TaskDescription(list);
                }
                mutableStateFlow = this.this$0.AEQbTJ;
                this.L$0 = null;
                this.label = 3;
                if (mutableStateFlow.emit(c0567TaskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.EZpvd.set("ARG_KEYWORD", this.$keyword);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof AbstractC44051sBn.TaskDescription) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC44051sBn.TaskDescription) next).EZpvd()) {
                break;
            }
        }
        AbstractC44051sBn.TaskDescription taskDescription = (AbstractC44051sBn.TaskDescription) next;
        String strKWHzl = taskDescription != null ? taskDescription.KWHzl() : null;
        C44760scx.log$default("SearchSuggestionsViewModel: getSearchSuggestions > confidentIntentId: " + strKWHzl, null, 2, null);
        MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
        this.L$0 = list;
        this.label = 2;
        if (mutableStateFlow2.emit(strKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        if (!list.isEmpty()) {
        }
        mutableStateFlow = this.this$0.AEQbTJ;
        this.L$0 = null;
        this.label = 3;
        if (mutableStateFlow.emit(c0567TaskDescription, this) == objCopydefault) {
        }
        this.this$0.EZpvd.set("ARG_KEYWORD", this.$keyword);
        return Unit.INSTANCE;
    }
}
