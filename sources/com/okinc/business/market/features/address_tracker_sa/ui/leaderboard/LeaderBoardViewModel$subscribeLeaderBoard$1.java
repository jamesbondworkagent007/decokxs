package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25667jBx;
import o.C27634jyr;
import o.C56391yDq;
import o.C56442yFn;
import o.jBB;
import o.jBD;
import o.jBH;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$subscribeLeaderBoard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ jBH $groupFilter;
    final /* synthetic */ int $startRank;
    Object L$0;
    int label;
    final /* synthetic */ LeaderBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$subscribeLeaderBoard$1(LeaderBoardViewModel leaderBoardViewModel, jBH jbh, int i, Continuation<? super LeaderBoardViewModel$subscribeLeaderBoard$1> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardViewModel;
        this.$groupFilter = jbh;
        this.$startRank = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardViewModel$subscribeLeaderBoard$1(this.this$0, this.$groupFilter, this.$startRank, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardViewModel$subscribeLeaderBoard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [647=4] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objOLrzqt;
        final Map map;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception unused) {
            this.this$0.uzCIH.copydefault();
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(3000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    map = (Map) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    final LeaderBoardViewModel leaderBoardViewModel = this.this$0;
                    final int i2 = this.$startRank;
                    flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardViewModel$subscribeLeaderBoard$1.2
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public final Object emit(jBB jbb, Continuation<? super Unit> continuation) {
                            if (jbb != null) {
                                LeaderBoardViewModel leaderBoardViewModel2 = leaderBoardViewModel;
                                Map<String, String> map2 = map;
                                leaderBoardViewModel2.EZpvd(C25667jBx.EZpvd(jbb, leaderBoardViewModel2.AhwBna, leaderBoardViewModel2.wlaJM, leaderBoardViewModel2.EZpvd, map2, leaderBoardViewModel2.gEmmrt()), i2, jbb.EZpvd().size());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 5;
                    if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Map map2 = (Map) obj;
                jBD jbd = this.this$0.uzCIH;
                jBH jbh = this.$groupFilter;
                this.L$0 = map2;
                this.label = 4;
                objOLrzqt = jbd.OLrzqt(str, jbh, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                map = map2;
                obj = objOLrzqt;
                final LeaderBoardViewModel leaderBoardViewModel2 = this.this$0;
                final int i22 = this.$startRank;
                flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardViewModel$subscribeLeaderBoard$1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(jBB jbb, Continuation<? super Unit> continuation) {
                        if (jbb != null) {
                            LeaderBoardViewModel leaderBoardViewModel22 = leaderBoardViewModel2;
                            Map<String, String> map22 = map;
                            leaderBoardViewModel22.EZpvd(C25667jBx.EZpvd(jbb, leaderBoardViewModel22.AhwBna, leaderBoardViewModel22.wlaJM, leaderBoardViewModel22.EZpvd, map22, leaderBoardViewModel22.gEmmrt()), i22, jbb.EZpvd().size());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 5;
                if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            str = (String) obj;
            C27634jyr c27634jyr = this.this$0.fetchVPNInfo;
            this.L$0 = str;
            this.label = 3;
            obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            Map map22 = (Map) obj;
            jBD jbd2 = this.this$0.uzCIH;
            jBH jbh2 = this.$groupFilter;
            this.L$0 = map22;
            this.label = 4;
            objOLrzqt = jbd2.OLrzqt(str, jbh2, this);
            if (objOLrzqt == objCopydefault) {
            }
        }
        LeaderBoardViewModel leaderBoardViewModel3 = this.this$0;
        this.label = 2;
        obj = leaderBoardViewModel3.AEQbTJ((Continuation<? super String>) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        str = (String) obj;
        C27634jyr c27634jyr2 = this.this$0.fetchVPNInfo;
        this.L$0 = str;
        this.label = 3;
        obj = C27634jyr.getEmojiAddressMapping$default(c27634jyr2, false, this, 1, null);
        if (obj == objCopydefault) {
        }
        Map map222 = (Map) obj;
        jBD jbd22 = this.this$0.uzCIH;
        jBH jbh22 = this.$groupFilter;
        this.L$0 = map222;
        this.label = 4;
        objOLrzqt = jbd22.OLrzqt(str, jbh22, this);
        if (objOLrzqt == objCopydefault) {
        }
    }
}
