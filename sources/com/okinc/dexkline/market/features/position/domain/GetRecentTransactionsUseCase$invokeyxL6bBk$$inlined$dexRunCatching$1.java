package com.okinc.dexkline.market.features.position.domain;

import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C34462ncY;
import o.C34466ncc;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC34475ncl;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.position.domain.GetRecentTransactionsUseCase$invoke-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends C34462ncY>, ? extends Boolean>>>, Object> {
    final /* synthetic */ boolean $isDescOrder$inlined;
    final /* synthetic */ long $lastItemId$inlined;
    final /* synthetic */ PositionDetailsParam $params$inlined;
    final /* synthetic */ TxType $type$inlined;
    int I$0;
    int label;
    final /* synthetic */ C34466ncc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, long j, C34466ncc c34466ncc, PositionDetailsParam positionDetailsParam, TxType txType, boolean z) {
        super(2, continuation);
        this.$lastItemId$inlined = j;
        this.this$0 = c34466ncc;
        this.$params$inlined = positionDetailsParam;
        this.$type$inlined = txType;
        this.$isDescOrder$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(continuation, this.$lastItemId$inlined, this.this$0, this.$params$inlined, this.$type$inlined, this.$isDescOrder$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends List<? extends C34462ncY>, ? extends Boolean>>> continuation) {
        return ((GetRecentTransactionsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                int i3 = this.$lastItemId$inlined == -1 ? 1 : 0;
                if (i3 != 0) {
                    this.this$0.OLrzqt();
                }
                TokenFilter tokenFilterOLrzqt = this.this$0.OLrzqt(this.$params$inlined, this.this$0.djBIcL.KWHzl(this.$params$inlined.getChainId()), this.$type$inlined);
                InterfaceC34475ncl interfaceC34475ncl = this.this$0.KWHzl;
                long j = this.$lastItemId$inlined;
                boolean z = this.$isDescOrder$inlined;
                this.I$0 = i3;
                this.label = 1;
                Object objEZpvd = interfaceC34475ncl.EZpvd(j, z, tokenFilterOLrzqt, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                i = i3;
                obj = objEZpvd;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                C56391yDq.AEQbTJ(obj);
            }
            PnLTransactionResponse pnLTransactionResponse = (PnLTransactionResponse) ((AbstractC43419rot) obj).AEQbTJ();
            List<PnLTransactionData> transactions = pnLTransactionResponse.getTransactions();
            boolean hasNext = pnLTransactionResponse.getHasNext();
            List arrayList = new ArrayList(C56403yEb.AYXKKw(transactions, 10));
            Iterator<T> it = transactions.iterator();
            while (it.hasNext()) {
                arrayList.add(this.this$0.OLrzqt.copydefault((PnLTransactionData) it.next()));
            }
            if (i == 0) {
                List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.this$0.copydefault().getValue());
                listFJNWhG.addAll(arrayList);
                arrayList = listFJNWhG;
            }
            this.this$0.AEQbTJ.setValue(arrayList);
            objM7377constructorimpl = Result.m7377constructorimpl(new Pair(arrayList, C56443yFo.KWHzl(hasNext)));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
