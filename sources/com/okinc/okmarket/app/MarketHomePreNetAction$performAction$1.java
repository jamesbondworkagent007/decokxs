package com.okinc.okmarket.app;

import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import o.C44586sZi;
import o.C55611xnH;
import o.C55633xnd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class MarketHomePreNetAction$performAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $scope;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomePreNetAction$performAction$1(CoroutineScope coroutineScope, Continuation<? super MarketHomePreNetAction$performAction$1> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomePreNetAction$performAction$1 marketHomePreNetAction$performAction$1 = new MarketHomePreNetAction$performAction$1(this.$scope, continuation);
        marketHomePreNetAction$performAction$1.L$0 = obj;
        return marketHomePreNetAction$performAction$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomePreNetAction$performAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [85=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineScope coroutineScope4 = this.$scope;
                Result.Application application = Result.Companion;
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, Dispatchers.getDefault(), null, new MarketHomePreNetAction$performAction$1$1$pageType$1(null), 2, null);
                this.L$0 = coroutineScope3;
                this.L$1 = coroutineScope4;
                this.label = 1;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope3;
                coroutineScope2 = coroutineScope4;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$1;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                coroutineScope = coroutineScope5;
            }
            String str = (String) objAwait;
            pUU.KWHzl("MarketCache", "init Tab = " + str);
            if (str != null) {
                switch (str.hashCode()) {
                    case -336625236:
                        if (!str.equals("hot-rank")) {
                            C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                        } else {
                            C44586sZi.EZpvd.KWHzl(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$1(coroutineScope2, new RankListRequest((String) null, (String) null, "7", "0", (String) null, (String) null, C55633xnd.getStableText$default(null, 1, null), 48, (DefaultConstructorMarker) null), null), 3, null));
                        }
                        break;
                    case -284735458:
                        if (!str.equals("up-rank")) {
                            C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                        } else {
                            PercentChangeRankingViewModel.ActionBar actionBar = PercentChangeRankingViewModel.Companion;
                            C44586sZi.EZpvd.AEQbTJ(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$2(coroutineScope2, new RankListRequest((String) null, (String) null, "7", "0", (String) null, C55611xnH.EZpvd(actionBar.copydefault(), actionBar.KWHzl(), actionBar.AEQbTJ()), C55633xnd.getStableText$default(null, 1, null), 16, (DefaultConstructorMarker) null), null), 3, null));
                        }
                        break;
                    case 69808306:
                        if (!str.equals("INDEX")) {
                            C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                        } else {
                            C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$4(coroutineScope2, null), 3, null));
                        }
                        break;
                    case 1724028365:
                        if (!str.equals("Watchlist")) {
                            C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                        }
                        break;
                    case 2122790395:
                        if (!str.equals("new-coin-rank")) {
                            C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                        } else {
                            C44586sZi.EZpvd.EZpvd(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$3(coroutineScope2, new RankListRequest((String) null, (String) null, "7", "0", (String) null, (String) null, C55633xnd.getStableText$default(null, 1, null), 51, (DefaultConstructorMarker) null), null), 3, null));
                        }
                        break;
                    default:
                        C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                        break;
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } else {
                C44586sZi.EZpvd.OLrzqt(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MarketHomePreNetAction$performAction$1$1$5(coroutineScope2, null), 3, null));
                Result.m7377constructorimpl(Unit.INSTANCE);
            }
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
