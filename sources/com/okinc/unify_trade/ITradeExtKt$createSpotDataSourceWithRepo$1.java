package com.okinc.unify_trade;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.ITradeExtKt$createSpotDataSourceWithRepo$1;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.AbstractC54646xQb;
import o.C54681xRj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.pUU;
import o.qTI;
import o.qTT;

/* JADX INFO: loaded from: classes11.dex */
public final class ITradeExtKt$createSpotDataSourceWithRepo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clue;
    final /* synthetic */ qTI $cupTickerRepo;
    final /* synthetic */ MutableLiveData<SourceResp<AbstractC54646xQb>> $dataSource;
    final /* synthetic */ boolean $isMarket;
    final /* synthetic */ boolean $needQuoteCupTicker;
    final /* synthetic */ Boolean $noEnableAreaSplit;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ InterfaceC54581xNr $this_createSpotDataSourceWithRepo;
    final /* synthetic */ qTT $tickerRepo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ITradeExtKt$createSpotDataSourceWithRepo$1(InterfaceC54581xNr interfaceC54581xNr, MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, boolean z2, CoroutineScope coroutineScope, qTI qti, qTT qtt, String str, Boolean bool, Continuation<? super ITradeExtKt$createSpotDataSourceWithRepo$1> continuation) {
        super(2, continuation);
        this.$this_createSpotDataSourceWithRepo = interfaceC54581xNr;
        this.$dataSource = mutableLiveData;
        this.$isMarket = z;
        this.$needQuoteCupTicker = z2;
        this.$scope = coroutineScope;
        this.$cupTickerRepo = qti;
        this.$tickerRepo = qtt;
        this.$clue = str;
        this.$noEnableAreaSplit = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ITradeExtKt$createSpotDataSourceWithRepo$1(this.$this_createSpotDataSourceWithRepo, this.$dataSource, this.$isMarket, this.$needQuoteCupTicker, this.$scope, this.$cupTickerRepo, this.$tickerRepo, this.$clue, this.$noEnableAreaSplit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ITradeExtKt$createSpotDataSourceWithRepo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNr = this.$this_createSpotDataSourceWithRepo;
            this.label = 1;
            obj = interfaceC54581xNr.EZpvd("SPOT", this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj;
        if (abstractC54531xLw != null) {
            ArrayList<BizInstrument> arrayListEZpvd = abstractC54531xLw.EZpvd();
            if (arrayListEZpvd.isEmpty()) {
                this.$dataSource.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
            } else {
                Intrinsics.copydefault(arrayListEZpvd, "");
                final C54681xRj c54681xRj = new C54681xRj(arrayListEZpvd, this.$this_createSpotDataSourceWithRepo.djBIcL(), this.$this_createSpotDataSourceWithRepo.iwGUEr(), false, this.$dataSource, this.$isMarket, this.$needQuoteCupTicker, this.$scope, this.$cupTickerRepo, this.$tickerRepo, this.$clue);
                Boolean bool = this.$noEnableAreaSplit;
                final MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData = this.$dataSource;
                final String str = this.$clue;
                c54681xRj.KWHzl(bool, new Function1() { // from class: o.xnP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ITradeExtKt$createSpotDataSourceWithRepo$1.invokeSuspend$lambda$0(mutableLiveData, c54681xRj, str, ((java.lang.Boolean) obj2).booleanValue());
                    }
                });
            }
        } else {
            this.$dataSource.postValue(new SourceResp<>(C56443yFo.KWHzl(false), null, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableLiveData mutableLiveData, C54681xRj c54681xRj, String str, boolean z) {
        if (!mutableLiveData.hasActiveObservers()) {
            c54681xRj.valueOf();
        }
        pUU.KWHzl("NavOptPhase1", str + " -> SpotSourceByRepo init callback");
        mutableLiveData.postValue(new SourceResp(Boolean.TRUE, c54681xRj, null));
        return Unit.INSTANCE;
    }
}
