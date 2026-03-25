package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.smart_money.SignalGemItemData;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.data.model.smart_money.SignalGemsData;
import com.okinc.business.market.data.model.smart_money.SignalGemsSortType;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29481kuU;
import o.C29505kus;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29466kuF;
import o.InterfaceC56445yFq;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalGemsListUseCase$invoke-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends SignalGemsCardsUiModel>>>, Object> {
    final /* synthetic */ boolean $ascendingOrder$inlined;
    final /* synthetic */ SignalGemType $gemsType$inlined;
    final /* synthetic */ C29481kuU $signalFilter$inlined;
    final /* synthetic */ SignalGemsSortType $sortBy$inlined;
    int label;
    final /* synthetic */ C29505kus this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C29481kuU c29481kuU, C29505kus c29505kus, SignalGemsSortType signalGemsSortType, boolean z, SignalGemType signalGemType) {
        super(2, continuation);
        this.$signalFilter$inlined = c29481kuU;
        this.this$0 = c29505kus;
        this.$sortBy$inlined = signalGemsSortType;
        this.$ascendingOrder$inlined = z;
        this.$gemsType$inlined = signalGemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(continuation, this.$signalFilter$inlined, this.this$0, this.$sortBy$inlined, this.$ascendingOrder$inlined, this.$gemsType$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends SignalGemsCardsUiModel>>> continuation) {
        return ((GetSignalGemsListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                String strValueOf = this.$signalFilter$inlined.copydefault().valueOf();
                if (strValueOf.length() == 0) {
                    strValueOf = "501";
                }
                String str = strValueOf;
                InterfaceC56445yFq<InfluencerType> entries = InfluencerType.getEntries();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
                Iterator<InfluencerType> it = entries.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.AEQbTJ(C33129mqd.AhwBna(it.next().getValue())));
                }
                InterfaceC29466kuF interfaceC29466kuF = this.this$0.OLrzqt;
                SignalGemsSortType signalGemsSortType = this.$sortBy$inlined;
                boolean z = this.$ascendingOrder$inlined;
                SignalGemType signalGemType = this.$gemsType$inlined;
                this.label = 1;
                obj = interfaceC29466kuF.EZpvd(str, signalGemsSortType, z, signalGemType, arrayList, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List<SignalGemItemData> listCopydefault = ((SignalGemsData) ((AbstractC43419rot) obj).AEQbTJ()).copydefault();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            Iterator<T> it2 = listCopydefault.iterator();
            while (it2.hasNext()) {
                arrayList2.add(this.this$0.EZpvd.copydefault((SignalGemItemData) it2.next()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
