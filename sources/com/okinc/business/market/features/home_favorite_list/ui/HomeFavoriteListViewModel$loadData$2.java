package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28410kaJ;
import o.C28422kaV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28457kbD;
import o.InterfaceC9738bbJ;
import o.kKG;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$loadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $resetPosition;
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$loadData$2(HomeFavoriteListViewModel homeFavoriteListViewModel, boolean z, boolean z2, Continuation<? super HomeFavoriteListViewModel$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = homeFavoriteListViewModel;
        this.$showLoading = z;
        this.$resetPosition = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListViewModel$loadData$2(this.this$0, this.$showLoading, this.$resetPosition, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListViewModel$loadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objEZpvd2;
        InterfaceC9738bbJ interfaceC9738bbJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fetchVPNInfo.OLrzqt();
            kKG kkg = this.this$0.ejfBZ;
            this.label = 1;
            objEZpvd = kkg.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = ((Result) obj).m7386unboximpl();
                HomeFavoriteListViewModel homeFavoriteListViewModel = this.this$0;
                boolean z = this.$resetPosition;
                if (Result.m7384isSuccessimpl(objEZpvd2)) {
                    List<C28422kaV> list = (List) objEZpvd2;
                    homeFavoriteListViewModel.KWHzl(list, (HomeFavoriteListFilter) homeFavoriteListViewModel.OLrzqt.getValue(), z);
                    homeFavoriteListViewModel.fetchVPNInfo.copydefault(list);
                }
                HomeFavoriteListViewModel homeFavoriteListViewModel2 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objEZpvd2) != null) {
                    homeFavoriteListViewModel2.EZpvd.setValue(InterfaceC28457kbD.TaskDescription.AEQbTJ);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd) && ((interfaceC9738bbJ = (InterfaceC9738bbJ) objEZpvd) == null || interfaceC9738bbJ.zsXlph() || interfaceC9738bbJ.QfsBiF())) {
            homeFavoriteListViewModel3.EZpvd.setValue(InterfaceC28457kbD.PendingIntent.OLrzqt);
            return Unit.INSTANCE;
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel4 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            homeFavoriteListViewModel4.EZpvd.setValue(InterfaceC28457kbD.TaskDescription.AEQbTJ);
            return Unit.INSTANCE;
        }
        if (!this.this$0.valueOf()) {
            return Unit.INSTANCE;
        }
        if (this.$showLoading) {
            this.this$0.EZpvd.setValue(InterfaceC28457kbD.ActionBar.KWHzl);
        }
        String strOLrzqt = !Intrinsics.EZpvd((Object) ((HomeFavoriteListFilter) this.this$0.OLrzqt.getValue()).OLrzqt(), (Object) "-100") ? ((HomeFavoriteListFilter) this.this$0.OLrzqt.getValue()).OLrzqt() : null;
        C28410kaJ c28410kaJ = this.this$0.gEmmrt;
        int iGEmmrt = ((HomeFavoriteListFilter) this.this$0.OLrzqt.getValue()).gEmmrt();
        this.label = 2;
        objEZpvd2 = c28410kaJ.EZpvd(iGEmmrt, strOLrzqt, this);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel5 = this.this$0;
        boolean z2 = this.$resetPosition;
        if (Result.m7384isSuccessimpl(objEZpvd2)) {
        }
        HomeFavoriteListViewModel homeFavoriteListViewModel22 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd2) != null) {
        }
        return Unit.INSTANCE;
    }
}
