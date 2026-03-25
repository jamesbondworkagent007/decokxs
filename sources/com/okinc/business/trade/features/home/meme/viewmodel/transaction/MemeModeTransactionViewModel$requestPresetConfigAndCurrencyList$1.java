package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $tokenInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1(MemeModeTransactionViewModel memeModeTransactionViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$tokenInfo = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1 memeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1 = new MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1(this.this$0, this.$tokenInfo, continuation);
        memeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1.L$0 = obj;
        return memeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:7:0x0016, B:23:0x0092, B:27:0x00a6, B:29:0x00aa, B:12:0x002b, B:19:0x007e, B:15:0x0046), top: B:35:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String chainId;
        Deferred deferred;
        Object obj2;
        DexPresetResultVO dexPresetResultVO;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj3 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(true));
                chainId = this.$tokenInfo.getChainId();
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1$presetResult$1(this.this$0, chainId, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1$currencyFetchResult$1(this.this$0, chainId, this.$tokenInfo, null), 3, null);
                this.L$0 = chainId;
                this.L$1 = deferredAsync$default2;
                this.label = 1;
                Object objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                deferred = deferredAsync$default2;
                obj = objAwait;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$1;
                    chainId = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    boolean zEZpvd = this.this$0.EZpvd(chainId, this.$tokenInfo.getTokenContractAddress(), obj2);
                    if (Result.m7383isFailureimpl(obj2)) {
                        obj3 = obj2;
                    }
                    dexPresetResultVO = (DexPresetResultVO) obj3;
                    if (dexPresetResultVO != null) {
                        this.this$0.EZpvd(this.$tokenInfo, dexPresetResultVO, zEZpvd);
                    }
                    this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(false));
                    return Unit.INSTANCE;
                }
                Deferred deferred2 = (Deferred) this.L$1;
                String str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferred = deferred2;
                chainId = str;
            }
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            this.L$0 = chainId;
            this.L$1 = objM7386unboximpl;
            this.label = 2;
            if (deferred.await(this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objM7386unboximpl;
            boolean zEZpvd2 = this.this$0.EZpvd(chainId, this.$tokenInfo.getTokenContractAddress(), obj2);
            if (Result.m7383isFailureimpl(obj2)) {
            }
            dexPresetResultVO = (DexPresetResultVO) obj3;
            if (dexPresetResultVO != null) {
            }
            this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(false));
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(false));
            throw th;
        }
    }
}
