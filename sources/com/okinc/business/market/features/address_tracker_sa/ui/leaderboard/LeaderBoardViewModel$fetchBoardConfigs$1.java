package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25708jDk;
import o.C25706jDi;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.gWI;
import o.jBD;
import o.jBF;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$fetchBoardConfigs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LeaderBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$fetchBoardConfigs$1(LeaderBoardViewModel leaderBoardViewModel, Continuation<? super LeaderBoardViewModel$fetchBoardConfigs$1> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardViewModel$fetchBoardConfigs$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardViewModel$fetchBoardConfigs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:8:0x0018, B:31:0x00b5, B:35:0x00bd, B:37:0x00c1, B:38:0x00c5, B:12:0x002d, B:27:0x00a2, B:15:0x0035, B:21:0x0055, B:23:0x0074, B:24:0x0095, B:18:0x0044), top: B:43:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LeaderBoardViewModel leaderBoardViewModel;
        Object objAEQbTJ;
        Object objKWHzl;
        LeaderBoardViewModel leaderBoardViewModel2;
        Object objM7386unboximpl;
        Map mapKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (Exception unused) {
            this.this$0.KWHzl.setValue(new AbstractC25708jDk.Application());
            this.this$0.AEQbTJ.setValue(new C25706jDi(false, false, false, new Exception(), 7, null));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            leaderBoardViewModel = this.this$0;
            jBD jbd = leaderBoardViewModel.uzCIH;
            this.L$0 = leaderBoardViewModel;
            this.label = 1;
            objAEQbTJ = jbd.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    leaderBoardViewModel2 = (LeaderBoardViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        obj2 = objM7386unboximpl;
                    }
                    mapKWHzl = (Map) obj2;
                    if (mapKWHzl == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    }
                    leaderBoardViewModel2.djBIcL = mapKWHzl;
                    this.this$0.fARcdN = true;
                    LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, false, false, 7, null);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                LeaderBoardViewModel leaderBoardViewModel3 = this.this$0;
                gWI gwi = leaderBoardViewModel3.valueOf;
                this.L$0 = leaderBoardViewModel3;
                this.label = 3;
                objKWHzl = gwi.KWHzl(this);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                leaderBoardViewModel2 = leaderBoardViewModel3;
                objM7386unboximpl = objKWHzl;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                mapKWHzl = (Map) obj2;
                if (mapKWHzl == null) {
                }
                leaderBoardViewModel2.djBIcL = mapKWHzl;
                this.this$0.fARcdN = true;
                LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, false, false, 7, null);
                return Unit.INSTANCE;
            }
            leaderBoardViewModel = (LeaderBoardViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        leaderBoardViewModel.AubY = (List) objAEQbTJ;
        LeaderBoardViewModel leaderBoardViewModel4 = this.this$0;
        leaderBoardViewModel4.isConnected = (jBF) CollectionsKt___CollectionsKt.firstOrNull(leaderBoardViewModel4.AubY);
        jBF jbf = this.this$0.isConnected;
        if (jbf != null) {
            this.this$0.AYXKKw = new LeaderBoardFilterModel(null, null, null, jbf.EZpvd(), null, null, null, null, null, null, 1015, null);
        }
        LeaderBoardViewModel leaderBoardViewModel5 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (leaderBoardViewModel5.EZpvd((Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        LeaderBoardViewModel leaderBoardViewModel32 = this.this$0;
        gWI gwi2 = leaderBoardViewModel32.valueOf;
        this.L$0 = leaderBoardViewModel32;
        this.label = 3;
        objKWHzl = gwi2.KWHzl(this);
        if (objKWHzl != objCopydefault) {
        }
    }
}
