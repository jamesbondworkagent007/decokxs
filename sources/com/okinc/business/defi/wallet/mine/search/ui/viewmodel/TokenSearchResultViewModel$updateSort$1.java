package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C18980fse;
import o.C18982fsg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultViewModel$updateSort$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SearchSortType $sortType;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TokenSearchResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultViewModel$updateSort$1(TokenSearchResultViewModel tokenSearchResultViewModel, SearchSortType searchSortType, Continuation<? super TokenSearchResultViewModel$updateSort$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenSearchResultViewModel;
        this.$sortType = searchSortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenSearchResultViewModel$updateSort$1(this.this$0, this.$sortType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenSearchResultViewModel$updateSort$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TokenSearchResultViewModel tokenSearchResultViewModel;
        List<C18982fsg> list;
        C18980fse c18980fse;
        MutableSharedFlow mutableSharedFlow;
        C18980fse c18980fseOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<C18982fsg> list2 = this.this$0.values;
            if (list2 != null) {
                tokenSearchResultViewModel = this.this$0;
                List<C18982fsg> listCopydefault = tokenSearchResultViewModel.fetchVPNInfo.copydefault(this.$sortType, list2);
                C18980fse c18980fse2 = (C18980fse) tokenSearchResultViewModel.copydefault.getValue();
                MutableStateFlow mutableStateFlow = tokenSearchResultViewModel.copydefault;
                C18980fse c18980fseOLrzqt2 = c18980fse2.OLrzqt((509 & 1) != 0 ? c18980fse2.KWHzl : false, (509 & 2) != 0 ? c18980fse2.AYXKKw : listCopydefault, (509 & 4) != 0 ? c18980fse2.AhwBna : null, (509 & 8) != 0 ? c18980fse2.OLrzqt : null, (509 & 16) != 0 ? c18980fse2.valueOf : null, (509 & 32) != 0 ? c18980fse2.EZpvd : null, (509 & 64) != 0 ? c18980fse2.copydefault : null, (509 & 128) != 0 ? c18980fse2.gEmmrt : null, (509 & 256) != 0 ? c18980fse2.AEQbTJ : false);
                this.L$0 = tokenSearchResultViewModel;
                this.L$1 = listCopydefault;
                this.L$2 = c18980fse2;
                this.label = 1;
                if (mutableStateFlow.emit(c18980fseOLrzqt2, this) == objCopydefault) {
                    return objCopydefault;
                }
                list = listCopydefault;
                c18980fse = c18980fse2;
                mutableSharedFlow = tokenSearchResultViewModel.EZpvd;
                c18980fseOLrzqt = c18980fse.OLrzqt((509 & 1) != 0 ? c18980fse.KWHzl : false, (509 & 2) != 0 ? c18980fse.AYXKKw : list, (509 & 4) != 0 ? c18980fse.AhwBna : null, (509 & 8) != 0 ? c18980fse.OLrzqt : null, (509 & 16) != 0 ? c18980fse.valueOf : null, (509 & 32) != 0 ? c18980fse.EZpvd : null, (509 & 64) != 0 ? c18980fse.copydefault : null, (509 & 128) != 0 ? c18980fse.gEmmrt : null, (509 & 256) != 0 ? c18980fse.AEQbTJ : false);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(c18980fseOLrzqt, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            C18980fse c18980fse3 = (C18980fse) this.L$2;
            List<C18982fsg> list3 = (List) this.L$1;
            tokenSearchResultViewModel = (TokenSearchResultViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c18980fse = c18980fse3;
            list = list3;
            mutableSharedFlow = tokenSearchResultViewModel.EZpvd;
            c18980fseOLrzqt = c18980fse.OLrzqt((509 & 1) != 0 ? c18980fse.KWHzl : false, (509 & 2) != 0 ? c18980fse.AYXKKw : list, (509 & 4) != 0 ? c18980fse.AhwBna : null, (509 & 8) != 0 ? c18980fse.OLrzqt : null, (509 & 16) != 0 ? c18980fse.valueOf : null, (509 & 32) != 0 ? c18980fse.EZpvd : null, (509 & 64) != 0 ? c18980fse.copydefault : null, (509 & 128) != 0 ? c18980fse.gEmmrt : null, (509 & 256) != 0 ? c18980fse.AEQbTJ : false);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (mutableSharedFlow.emit(c18980fseOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
