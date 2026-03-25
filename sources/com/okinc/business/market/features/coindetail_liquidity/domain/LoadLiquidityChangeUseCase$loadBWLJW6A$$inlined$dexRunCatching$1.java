package com.okinc.business.market.features.coindetail_liquidity.domain;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jPS;
import o.jPT;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.coindetail_liquidity.domain.LoadLiquidityChangeUseCase$load-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ TokenFilter $filter$inlined;
    final /* synthetic */ boolean $isDescOrder$inlined;
    final /* synthetic */ String $lastItemId$inlined;
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ jPS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, TokenFilter tokenFilter, boolean z, jPS jps) {
        super(2, continuation);
        this.$lastItemId$inlined = str;
        this.$filter$inlined = tokenFilter;
        this.$isDescOrder$inlined = z;
        this.this$0 = jps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$lastItemId$inlined, this.$filter$inlined, this.$isDescOrder$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((LoadLiquidityChangeUseCase$loadBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5 A[Catch: all -> 0x0142, CancellationException -> 0x0159, TryCatch #2 {CancellationException -> 0x0159, all -> 0x0142, blocks: (B:9:0x0019, B:56:0x0139, B:57:0x013d, B:14:0x0028, B:17:0x0033, B:41:0x00cf, B:43:0x00f5, B:46:0x0108, B:48:0x0116, B:51:0x011e, B:52:0x0125, B:20:0x0041, B:32:0x0075, B:33:0x007f, B:35:0x008b, B:37:0x0095, B:38:0x009b, B:23:0x0048, B:27:0x0055, B:29:0x0062), top: B:65:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[Catch: all -> 0x0142, CancellationException -> 0x0159, TryCatch #2 {CancellationException -> 0x0159, all -> 0x0142, blocks: (B:9:0x0019, B:56:0x0139, B:57:0x013d, B:14:0x0028, B:17:0x0033, B:41:0x00cf, B:43:0x00f5, B:46:0x0108, B:48:0x0116, B:51:0x011e, B:52:0x0125, B:20:0x0041, B:32:0x0075, B:33:0x007f, B:35:0x008b, B:37:0x0095, B:38:0x009b, B:23:0x0048, B:27:0x0055, B:29:0x0062), top: B:65:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        int i;
        jPT jpt;
        Object objAwait;
        Boolean boolKWHzl;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            i = this.$lastItemId$inlined.length() == 0 ? 1 : 0;
            jpt = new jPT(this.$lastItemId$inlined, this.$filter$inlined, this.$isDescOrder$inlined);
            if (i != 0) {
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                this.L$0 = jpt;
                this.I$0 = i;
                this.label = 1;
                if (mutableStateFlow.emit(null, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (this.this$0.gEmmrt.get(jpt) == null && !this.this$0.AEQbTJ(this.$lastItemId$inlined)) {
                boolKWHzl = C56443yFo.KWHzl(true);
                objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.this$0.KWHzl, null, null, new LoadLiquidityChangeUseCase$load$2$job$1(this.this$0, this.$lastItemId$inlined, this.$isDescOrder$inlined, this.$filter$inlined, null), 3, null);
            this.this$0.gEmmrt.put(jpt, deferredAsync$default);
            this.L$0 = jpt;
            this.I$0 = i;
            this.label = 2;
            objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            Object objM7386unboximpl = ((Result) objAwait).m7386unboximpl();
            this.this$0.gEmmrt.remove(jpt);
            C56391yDq.AEQbTJ(objM7386unboximpl);
            Pair pair = (Pair) objM7386unboximpl;
            List list = (List) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            if (i != 0) {
            }
            z = zBooleanValue;
            boolKWHzl = C56443yFo.KWHzl(z);
            objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    z = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                }
                boolKWHzl = C56443yFo.KWHzl(z);
                objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            i = this.I$0;
            jPT jpt2 = (jPT) this.L$0;
            C56391yDq.AEQbTJ(obj);
            jpt = jpt2;
            objAwait = obj;
            Object objM7386unboximpl2 = ((Result) objAwait).m7386unboximpl();
            this.this$0.gEmmrt.remove(jpt);
            C56391yDq.AEQbTJ(objM7386unboximpl2);
            Pair pair2 = (Pair) objM7386unboximpl2;
            List list2 = (List) pair2.component1();
            boolean zBooleanValue2 = ((Boolean) pair2.component2()).booleanValue();
            if (i != 0) {
                MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
                this.L$0 = null;
                this.Z$0 = zBooleanValue2;
                this.label = 3;
                if (mutableStateFlow2.emit(list2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                List list3 = (List) this.this$0.EZpvd.getValue();
                List listFJNWhG = list3 != null ? CollectionsKt___CollectionsKt.fJNWhG((Collection) list3) : null;
                if (listFJNWhG != null) {
                    C56443yFo.KWHzl(listFJNWhG.addAll(list2));
                }
                MutableStateFlow mutableStateFlow3 = this.this$0.EZpvd;
                this.L$0 = null;
                this.Z$0 = zBooleanValue2;
                this.label = 4;
                if (mutableStateFlow3.emit(listFJNWhG, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            z = zBooleanValue2;
            boolKWHzl = C56443yFo.KWHzl(z);
            objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        i = this.I$0;
        jpt = (jPT) this.L$0;
        C56391yDq.AEQbTJ(obj);
        this.this$0.copydefault();
        this.this$0.EZpvd();
        if (this.this$0.gEmmrt.get(jpt) == null) {
        }
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(this.this$0.KWHzl, null, null, new LoadLiquidityChangeUseCase$load$2$job$1(this.this$0, this.$lastItemId$inlined, this.$isDescOrder$inlined, this.$filter$inlined, null), 3, null);
        this.this$0.gEmmrt.put(jpt, deferredAsync$default2);
        this.L$0 = jpt;
        this.I$0 = i;
        this.label = 2;
        objAwait = deferredAsync$default2.await(this);
        if (objAwait == objCopydefault) {
        }
        Object objM7386unboximpl22 = ((Result) objAwait).m7386unboximpl();
        this.this$0.gEmmrt.remove(jpt);
        C56391yDq.AEQbTJ(objM7386unboximpl22);
        Pair pair22 = (Pair) objM7386unboximpl22;
        List list22 = (List) pair22.component1();
        boolean zBooleanValue22 = ((Boolean) pair22.component2()).booleanValue();
        if (i != 0) {
        }
        z = zBooleanValue22;
        boolKWHzl = C56443yFo.KWHzl(z);
        objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
