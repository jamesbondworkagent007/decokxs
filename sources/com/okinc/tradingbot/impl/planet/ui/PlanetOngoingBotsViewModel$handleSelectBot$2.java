package com.okinc.tradingbot.impl.planet.ui;

import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class PlanetOngoingBotsViewModel$handleSelectBot$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    int label;
    final /* synthetic */ PlanetOngoingBotsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetOngoingBotsViewModel$handleSelectBot$2(PlanetOngoingBotsViewModel planetOngoingBotsViewModel, String str, Continuation<? super PlanetOngoingBotsViewModel$handleSelectBot$2> continuation) {
        super(2, continuation);
        this.this$0 = planetOngoingBotsViewModel;
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetOngoingBotsViewModel$handleSelectBot$2(this.this$0, this.$algoId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetOngoingBotsViewModel$handleSelectBot$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objCopydefault;
        BotUiState botUiStateKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            String str = this.$algoId;
            do {
                value = mutableStateFlow.getValue();
                objCopydefault = (uLU) value;
                if (objCopydefault instanceof uLU.ActionBar) {
                    uLU.ActionBar actionBar = (uLU.ActionBar) objCopydefault;
                    PlanetOngoingBotsViewModel.StateListAnimator stateListAnimator = (PlanetOngoingBotsViewModel.StateListAnimator) actionBar.KWHzl();
                    List<BotUiState> listCopydefault = ((PlanetOngoingBotsViewModel.StateListAnimator) actionBar.KWHzl()).copydefault();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                    for (BotUiState botUiState : listCopydefault) {
                        if (Intrinsics.EZpvd((Object) botUiState.KWHzl(), (Object) str)) {
                            botUiStateKWHzl = botUiState.KWHzl((261119 & 1) != 0 ? botUiState.AEQbTJ : null, (261119 & 2) != 0 ? botUiState.valueOf : null, (261119 & 4) != 0 ? botUiState.djBIcL : null, (261119 & 8) != 0 ? botUiState.EZpvd : null, (261119 & 16) != 0 ? botUiState.AkhnZx : null, (261119 & 32) != 0 ? botUiState.fetchVPNInfo : null, (261119 & 64) != 0 ? botUiState.isConnected : null, (261119 & 128) != 0 ? botUiState.AuCTel : null, (261119 & 256) != 0 ? botUiState.DbNXlk : null, (261119 & 512) != 0 ? botUiState.AhwBna : null, (261119 & 1024) != 0 ? botUiState.AYXKKw : !botUiState.isConnected(), (261119 & 2048) != 0 ? botUiState.gEmmrt : null, (261119 & 4096) != 0 ? botUiState.ejfBZ : null, (261119 & 8192) != 0 ? botUiState.copydefault : null, (261119 & 16384) != 0 ? botUiState.OLrzqt : null, (261119 & 32768) != 0 ? botUiState.fJNWhG : false, (261119 & 65536) != 0 ? botUiState.KWHzl : null, (261119 & 131072) != 0 ? botUiState.values : null);
                        } else {
                            botUiStateKWHzl = botUiState.KWHzl((261119 & 1) != 0 ? botUiState.AEQbTJ : null, (261119 & 2) != 0 ? botUiState.valueOf : null, (261119 & 4) != 0 ? botUiState.djBIcL : null, (261119 & 8) != 0 ? botUiState.EZpvd : null, (261119 & 16) != 0 ? botUiState.AkhnZx : null, (261119 & 32) != 0 ? botUiState.fetchVPNInfo : null, (261119 & 64) != 0 ? botUiState.isConnected : null, (261119 & 128) != 0 ? botUiState.AuCTel : null, (261119 & 256) != 0 ? botUiState.DbNXlk : null, (261119 & 512) != 0 ? botUiState.AhwBna : null, (261119 & 1024) != 0 ? botUiState.AYXKKw : false, (261119 & 2048) != 0 ? botUiState.gEmmrt : null, (261119 & 4096) != 0 ? botUiState.ejfBZ : null, (261119 & 8192) != 0 ? botUiState.copydefault : null, (261119 & 16384) != 0 ? botUiState.OLrzqt : null, (261119 & 32768) != 0 ? botUiState.fJNWhG : false, (261119 & 65536) != 0 ? botUiState.KWHzl : null, (261119 & 131072) != 0 ? botUiState.values : null);
                        }
                        arrayList.add(botUiStateKWHzl);
                    }
                    objCopydefault = actionBar.copydefault(PlanetOngoingBotsViewModel.StateListAnimator.copy$default(stateListAnimator, arrayList, false, null, false, 14, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, objCopydefault));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
