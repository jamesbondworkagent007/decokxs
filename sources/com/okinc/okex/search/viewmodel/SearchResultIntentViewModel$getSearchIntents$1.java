package com.okinc.okex.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.okex.search.viewmodel.SearchResultIntentViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44052sBo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sBA;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchResultIntentViewModel$getSearchIntents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $intentId;
    int label;
    final /* synthetic */ SearchResultIntentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultIntentViewModel$getSearchIntents$1(String str, SearchResultIntentViewModel searchResultIntentViewModel, Continuation<? super SearchResultIntentViewModel$getSearchIntents$1> continuation) {
        super(2, continuation);
        this.$intentId = str;
        this.this$0 = searchResultIntentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultIntentViewModel$getSearchIntents$1(this.$intentId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultIntentViewModel$getSearchIntents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        SearchResultIntentViewModel.Activity stateListAnimator;
        C44052sBo c44052sBo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$intentId;
            if (str != null) {
                if (Intrinsics.EZpvd((Object) str, (Object) this.this$0.EZpvd())) {
                    stateListAnimator = null;
                } else {
                    MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                    SearchResultIntentViewModel.Activity.Application application = SearchResultIntentViewModel.Activity.Application.copydefault;
                    this.label = 1;
                    if (mutableStateFlow.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                stateListAnimator = SearchResultIntentViewModel.Activity.ActionBar.copydefault;
            }
            if (stateListAnimator != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault.set("ARG_INTENT_ID", this.$intentId);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            c44052sBo = (C44052sBo) obj;
            if (c44052sBo == null) {
                SavedStateHandle savedStateHandle = this.this$0.copydefault;
                if (!(!c44052sBo.KWHzl().isEmpty()) && !(!c44052sBo.copydefault().isEmpty())) {
                    z = false;
                }
                savedStateHandle.set("ARG_HAS_MORE", C56443yFo.KWHzl(z));
                stateListAnimator = new SearchResultIntentViewModel.Activity.StateListAnimator(this.$intentId, c44052sBo);
            } else {
                stateListAnimator = SearchResultIntentViewModel.Activity.ActionBar.copydefault;
            }
            if (stateListAnimator != null) {
                MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
                this.label = 3;
                if (mutableStateFlow2.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.copydefault.set("ARG_INTENT_ID", this.$intentId);
            }
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        sBA sba = this.this$0.KWHzl;
        String str2 = this.$intentId;
        this.label = 2;
        obj = sba.AEQbTJ(str2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        c44052sBo = (C44052sBo) obj;
        if (c44052sBo == null) {
        }
        if (stateListAnimator != null) {
        }
        return Unit.INSTANCE;
    }
}
