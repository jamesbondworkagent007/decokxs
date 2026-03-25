package com.okinc.business.market.features.scanner.surge.signal.domain;

import com.okinc.business.market.features.scanner.surge.signal.data.GemItem;
import com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C29289kqo;
import o.C29295kqu;
import o.C29297kqw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29294kqt;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ boolean $silentRefresh$inlined;
    int label;
    final /* synthetic */ C29289kqo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C29289kqo c29289kqo, boolean z, String str) {
        super(2, continuation);
        this.this$0 = c29289kqo;
        this.$silentRefresh$inlined = z;
        this.$chainId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$silentRefresh$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        Object value2;
        List<GemItem> listKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        List listAhwBna = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                this.this$0.AEQbTJ();
                if (!this.$silentRefresh$inlined) {
                    MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, null));
                }
                InterfaceC29294kqt interfaceC29294kqt = this.this$0.KWHzl;
                String str = this.$chainId$inlined;
                this.label = 1;
                obj = interfaceC29294kqt.AEQbTJ(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            SurgeSignalGemsData surgeSignalGemsData = (SurgeSignalGemsData) ((AbstractC43419rot) obj).copydefault();
            if (surgeSignalGemsData != null && (listKWHzl = surgeSignalGemsData.KWHzl()) != null) {
                listAhwBna = new ArrayList();
                Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    C29295kqu c29295kquAEQbTJ = this.this$0.AEQbTJ((GemItem) it.next());
                    if (c29295kquAEQbTJ != null) {
                        listAhwBna.add(c29295kquAEQbTJ);
                    }
                }
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new C29297kqw(listAhwBna)));
            if (!listAhwBna.isEmpty()) {
                this.this$0.OLrzqt(this.$chainId$inlined);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
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
