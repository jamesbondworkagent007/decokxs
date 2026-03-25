package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28419kaS;
import o.C28456kbC;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28457kbD;
import o.kMU;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$applyNewFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needLoadData;
    final /* synthetic */ HomeFavoriteListFilter $newFilter;
    final /* synthetic */ Boolean $resetPosition;
    int label;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$applyNewFilter$1(HomeFavoriteListFilter homeFavoriteListFilter, HomeFavoriteListViewModel homeFavoriteListViewModel, Boolean bool, boolean z, Continuation<? super HomeFavoriteListViewModel$applyNewFilter$1> continuation) {
        super(2, continuation);
        this.$newFilter = homeFavoriteListFilter;
        this.this$0 = homeFavoriteListViewModel;
        this.$resetPosition = bool;
        this.$needLoadData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListViewModel$applyNewFilter$1(this.$newFilter, this.this$0, this.$resetPosition, this.$needLoadData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListViewModel$applyNewFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = !Intrinsics.EZpvd((Object) this.$newFilter.OLrzqt(), (Object) ((HomeFavoriteListFilter) this.this$0.OLrzqt.getValue()).OLrzqt());
            boolean z2 = this.$newFilter.gEmmrt() != ((HomeFavoriteListFilter) this.this$0.OLrzqt.getValue()).gEmmrt();
            Boolean bool = this.$resetPosition;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = z || z2;
            }
            this.this$0.OLrzqt.setValue(this.$newFilter);
            if (this.$needLoadData) {
                HomeFavoriteListViewModel.loadData$default(this.this$0, z, false, zBooleanValue, 2, null);
            } else {
                boolean zCopydefault = HomeFavoriteListFilter.Companion.copydefault(this.$newFilter);
                InterfaceC28457kbD value = this.this$0.djBIcL().getValue();
                if (value instanceof InterfaceC28457kbD.StateListAnimator) {
                    CoroutineDispatcher coroutineDispatcher = this.this$0.KWHzl;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$newFilter, this.this$0, zBooleanValue, null);
                    this.label = 1;
                    if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    InterfaceC28457kbD.Activity activity = InterfaceC28457kbD.Activity.EZpvd;
                    if (Intrinsics.EZpvd(value, activity)) {
                        if (!zCopydefault) {
                            this.this$0.EZpvd.setValue(InterfaceC28457kbD.Application.OLrzqt);
                        }
                    } else {
                        if (!Intrinsics.EZpvd(value, InterfaceC28457kbD.Application.OLrzqt)) {
                            return Unit.INSTANCE;
                        }
                        if (zCopydefault) {
                            this.this$0.EZpvd.setValue(activity);
                        }
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListViewModel$applyNewFilter$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeFavoriteListFilter $newFilter;
        final /* synthetic */ boolean $shouldResetPosition;
        int label;
        final /* synthetic */ HomeFavoriteListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeFavoriteListFilter homeFavoriteListFilter, HomeFavoriteListViewModel homeFavoriteListViewModel, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newFilter = homeFavoriteListFilter;
            this.this$0 = homeFavoriteListViewModel;
            this.$shouldResetPosition = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$newFilter, this.this$0, this.$shouldResetPosition, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<HomeToken> listOLrzqt;
            Object value;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$newFilter.valueOf() != RankingType.DEFAULT) {
                    C28419kaS c28419kaS = this.this$0.AkhnZx;
                    List<kMU> list = this.this$0.DbNXlk;
                    ArrayList arrayList = new ArrayList();
                    for (kMU kmu : list) {
                        HomeToken homeToken = kmu instanceof HomeToken ? (HomeToken) kmu : null;
                        if (homeToken != null) {
                            arrayList.add(homeToken);
                        }
                    }
                    listOLrzqt = c28419kaS.OLrzqt(arrayList, this.$newFilter);
                } else {
                    listOLrzqt = this.this$0.DbNXlk;
                }
                C28456kbC c28456kbC = new C28456kbC(listOLrzqt, this.$shouldResetPosition);
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new InterfaceC28457kbD.StateListAnimator(c28456kbC, false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
