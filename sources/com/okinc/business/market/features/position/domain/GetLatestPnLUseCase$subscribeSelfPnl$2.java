package com.okinc.business.market.features.position.domain;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C29123knh;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29133knr;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes7.dex */
public final class GetLatestPnLUseCase$subscribeSelfPnl$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ C29123knh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$subscribeSelfPnl$2(C29123knh c29123knh, String str, String str2, Continuation<? super GetLatestPnLUseCase$subscribeSelfPnl$2> continuation) {
        super(2, continuation);
        this.this$0 = c29123knh;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLatestPnLUseCase$subscribeSelfPnl$2(this.this$0, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetLatestPnLUseCase$subscribeSelfPnl$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJValueOf = this.this$0.AkhnZx.valueOf();
            String strEZpvd = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(this.$chainId)) : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            PnLExtraParams pnLExtraParams = new PnLExtraParams(this.$chainId, strEZpvd, this.$tokenAddress, (String) null, 8, (DefaultConstructorMarker) null);
            InterfaceC29133knr interfaceC29133knr = this.this$0.valueOf;
            this.label = 1;
            obj = interfaceC29133knr.OLrzqt(pnLExtraParams, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        final C29123knh c29123knh = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeSelfPnl$2.5
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(LatestPnLData latestPnLData, Continuation<? super Unit> continuation) {
                C29123knh c29123knh2 = c29123knh;
                PnLDetailsUiModel pnLDetailsUiModel = c29123knh2.OLrzqt;
                c29123knh2.OLrzqt = pnLDetailsUiModel.OLrzqt((393215 & 1) != 0 ? pnLDetailsUiModel.AYXKKw : false, (393215 & 2) != 0 ? pnLDetailsUiModel.DbNXlk : latestPnLData.djBIcL(), (393215 & 4) != 0 ? pnLDetailsUiModel.isConnected : null, (393215 & 8) != 0 ? pnLDetailsUiModel.AkhnZx : null, (393215 & 16) != 0 ? pnLDetailsUiModel.KWHzl : null, (393215 & 32) != 0 ? pnLDetailsUiModel.valueOf : null, (393215 & 64) != 0 ? pnLDetailsUiModel.fJNWhG : null, (393215 & 128) != 0 ? pnLDetailsUiModel.AuCTel : null, (393215 & 256) != 0 ? pnLDetailsUiModel.AhwBna : latestPnLData.AYXKKw(), (393215 & 512) != 0 ? pnLDetailsUiModel.djBIcL : latestPnLData.AhwBna(), (393215 & 1024) != 0 ? pnLDetailsUiModel.copydefault : latestPnLData.AEQbTJ(), (393215 & 2048) != 0 ? pnLDetailsUiModel.EZpvd : latestPnLData.copydefault(), (393215 & 4096) != 0 ? pnLDetailsUiModel.fetchVPNInfo : latestPnLData.EZpvd(), (393215 & 8192) != 0 ? pnLDetailsUiModel.fIwbmz : latestPnLData.valueOf(), (393215 & 16384) != 0 ? pnLDetailsUiModel.fARcdN : null, (393215 & 32768) != 0 ? pnLDetailsUiModel.values : null, (393215 & 65536) != 0 ? pnLDetailsUiModel.gEmmrt : null, (393215 & 131072) != 0 ? pnLDetailsUiModel.AEQbTJ : null, (393215 & 262144) != 0 ? pnLDetailsUiModel.OLrzqt : null);
                C29123knh.updatePnLByPrice$default(c29123knh, null, 1, null);
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
