package com.okinc.unify_find.viewmodel;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C33129mqd;
import o.C55468xkX;
import o.C56131xwy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class RankModel$initCupProvider$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $validCcys;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RankModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankModel$initCupProvider$1(RankModel rankModel, List<String> list, Continuation<? super RankModel$initCupProvider$1> continuation) {
        super(2, continuation);
        this.this$0 = rankModel;
        this.$validCcys = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RankModel$initCupProvider$1 rankModel$initCupProvider$1 = new RankModel$initCupProvider$1(this.this$0, this.$validCcys, continuation);
        rankModel$initCupProvider$1.L$0 = obj;
        return rankModel$initCupProvider$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RankModel$initCupProvider$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.unify_find.viewmodel.RankModel$initCupProvider$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $validCcys;
        Object L$0;
        int label;
        final /* synthetic */ RankModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RankModel rankModel, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = rankModel;
            this.$validCcys = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$validCcys, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RankModel rankModel;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rankModel = (RankModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                } else {
                    C56391yDq.AEQbTJ(obj);
                    RankModel rankModel2 = this.this$0;
                    List<String> list = this.$validCcys;
                    Result.Application application = Result.Companion;
                    C56131xwy c56131xwyFJNWhG = rankModel2.fJNWhG();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (C33129mqd.OLrzqt((CharSequence) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    this.L$0 = rankModel2;
                    this.label = 1;
                    Object objAEQbTJ = C55468xkX.AEQbTJ(c56131xwyFJNWhG, arrayList, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    rankModel = rankModel2;
                    obj = objAEQbTJ;
                }
                for (TickersData tickersData : (List) obj) {
                    rankModel.isConnected().put(tickersData.getCcy(), tickersData);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            RankModel rankModel = this.this$0;
            Job jobFetchVPNInfo = rankModel.fetchVPNInfo();
            if (jobFetchVPNInfo == null) {
                jobFetchVPNInfo = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$validCcys, null), 3, null);
            }
            rankModel.copydefault(jobFetchVPNInfo);
            this.this$0.AEQbTJ(this.$validCcys);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
