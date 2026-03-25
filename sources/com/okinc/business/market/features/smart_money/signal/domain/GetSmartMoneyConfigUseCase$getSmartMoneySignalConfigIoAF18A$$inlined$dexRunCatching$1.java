package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SignalConfigData;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.core.util.SPUtils;
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
import o.C29464kuD;
import o.C29512kuz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC29466kuF;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSmartMoneyConfigUseCase$getSmartMoneySignalConfig-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SmartMoneyConfig>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C29512kuz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C29512kuz c29512kuz) {
        super(2, continuation);
        this.this$0 = c29512kuz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SmartMoneyConfig>> continuation) {
        return ((GetSmartMoneyConfigUseCase$getSmartMoneySignalConfigIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x00a9, CancellationException -> 0x00c0, LOOP:0: B:22:0x0068->B:24:0x006e, LOOP_END, TryCatch #2 {CancellationException -> 0x00c0, all -> 0x00a9, blocks: (B:7:0x0012, B:21:0x004d, B:22:0x0068, B:24:0x006e, B:25:0x0082, B:11:0x001f, B:17:0x0037, B:14:0x0026), top: B:33:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        Iterator<T> it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C29464kuD c29464kuD = this.this$0.OLrzqt;
            this.label = 1;
            obj = c29464kuD.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str2;
                SignalConfigData signalConfigData = (SignalConfigData) ((AbstractC43419rot) obj).AEQbTJ();
                List<ChainInfoData> listOLrzqt = signalConfigData.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.copydefault.AEQbTJ((ChainInfoData) it.next()));
                }
                SmartMoneyConfig smartMoneyConfig = new SmartMoneyConfig(str, arrayList, null, null, null, null, null, null, this.this$0.copydefault.OLrzqt(signalConfigData.KWHzl()), 252, null);
                SPUtils.put("dex_market_signal_config", smartMoneyConfig);
                objM7377constructorimpl = Result.m7377constructorimpl(smartMoneyConfig);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = (String) obj;
        InterfaceC29466kuF interfaceC29466kuF = this.this$0.KWHzl;
        this.L$0 = str3;
        this.label = 2;
        Object objOLrzqt = interfaceC29466kuF.OLrzqt(this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        str = str3;
        obj = objOLrzqt;
        SignalConfigData signalConfigData2 = (SignalConfigData) ((AbstractC43419rot) obj).AEQbTJ();
        List<ChainInfoData> listOLrzqt2 = signalConfigData2.OLrzqt();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
        it = listOLrzqt2.iterator();
        while (it.hasNext()) {
        }
        SmartMoneyConfig smartMoneyConfig2 = new SmartMoneyConfig(str, arrayList2, null, null, null, null, null, null, this.this$0.copydefault.OLrzqt(signalConfigData2.KWHzl()), 252, null);
        SPUtils.put("dex_market_signal_config", smartMoneyConfig2);
        objM7377constructorimpl = Result.m7377constructorimpl(smartMoneyConfig2);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
