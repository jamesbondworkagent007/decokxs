package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28410kaJ;
import o.C28422kaV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28457kbD;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$onGroupSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $groupId;
    Object L$0;
    int label;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$onGroupSelected$1(HomeFavoriteListViewModel homeFavoriteListViewModel, int i, Continuation<? super HomeFavoriteListViewModel$onGroupSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFavoriteListViewModel;
        this.$groupId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListViewModel$onGroupSelected$1(this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListViewModel$onGroupSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HomeFavoriteListFilter homeFavoriteListFilter;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HomeFavoriteListFilter homeFavoriteListFilterCopy$default = HomeFavoriteListFilter.copy$default((HomeFavoriteListFilter) this.this$0.OLrzqt.getValue(), null, this.$groupId, null, null, false, null, null, 125, null);
            this.this$0.OLrzqt.setValue(homeFavoriteListFilterCopy$default);
            this.this$0.fetchVPNInfo.OLrzqt();
            this.this$0.EZpvd.setValue(InterfaceC28457kbD.ActionBar.KWHzl);
            C28410kaJ c28410kaJ = this.this$0.gEmmrt;
            int iGEmmrt = homeFavoriteListFilterCopy$default.gEmmrt();
            String strOLrzqt = homeFavoriteListFilterCopy$default.OLrzqt();
            this.L$0 = homeFavoriteListFilterCopy$default;
            this.label = 1;
            Object objEZpvd = c28410kaJ.EZpvd(iGEmmrt, strOLrzqt, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            homeFavoriteListFilter = homeFavoriteListFilterCopy$default;
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeFavoriteListFilter = (HomeFavoriteListFilter) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = listAhwBna;
        }
        List<C28422kaV> list = (List) objM7386unboximpl;
        if (!list.isEmpty()) {
            this.this$0.fetchVPNInfo.copydefault(list);
        }
        this.this$0.KWHzl(list, homeFavoriteListFilter, true);
        return Unit.INSTANCE;
    }
}
