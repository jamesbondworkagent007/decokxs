package com.okinc.business.market.features.chart.domain;

import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25982jNo;
import o.C25986jNs;
import o.C25986jNs.ActionBar;
import o.C31256lqb;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC29133knr;
import o.jAH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.chart.domain.ChartPriceLineUseCase$getAveragePrice-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C25982jNo>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C25986jNs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, C25986jNs c25986jNs, String str2, String str3) {
        super(2, continuation);
        this.$walletAddress$inlined = str;
        this.this$0 = c25986jNs;
        this.$chainId$inlined = str2;
        this.$tokenContractAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$walletAddress$inlined, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C25982jNo>> continuation) {
        return ((ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strKWHzl;
        Object objEZpvd;
        String strKWHzl2;
        Object objEZpvd2;
        String str;
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
            strKWHzl = C31256lqb.KWHzl(this.$walletAddress$inlined, this.this$0.new ActionBar(this.$chainId$inlined));
            if (this.$walletAddress$inlined.length() == 0) {
                strKWHzl2 = this.$walletAddress$inlined;
                InterfaceC29133knr interfaceC29133knr = this.this$0.OLrzqt;
                String str2 = this.$chainId$inlined;
                String str3 = this.$tokenContractAddress$inlined;
                this.L$0 = strKWHzl2;
                this.label = 2;
                objEZpvd2 = interfaceC29133knr.EZpvd(strKWHzl, str2, str3, this);
                if (objEZpvd2 != objCopydefault) {
                    return objCopydefault;
                }
                str = strKWHzl2;
                obj = objEZpvd2;
                objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.KWHzl.KWHzl((LatestPnLData) ((AbstractC43419rot) obj).AEQbTJ(), str));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            jAH jah = this.this$0.AEQbTJ;
            this.L$0 = strKWHzl;
            this.label = 1;
            objEZpvd = jah.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.KWHzl.KWHzl((LatestPnLData) ((AbstractC43419rot) obj).AEQbTJ(), str));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            strKWHzl = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            objEZpvd = yDY.AhwBna();
        }
        Iterable iterable = (Iterable) objEZpvd;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable, 10)), 16));
        for (Object obj2 : iterable) {
            linkedHashMap.put(((TrackingAddressAlias) obj2).getCollectAddress(), obj2);
        }
        TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) linkedHashMap.get(this.$walletAddress$inlined);
        strKWHzl2 = C31256lqb.KWHzl(trackingAddressAlias != null ? trackingAddressAlias.getAddressAlias() : null, new C25986jNs.Activity(this.$walletAddress$inlined));
        InterfaceC29133knr interfaceC29133knr2 = this.this$0.OLrzqt;
        String str22 = this.$chainId$inlined;
        String str32 = this.$tokenContractAddress$inlined;
        this.L$0 = strKWHzl2;
        this.label = 2;
        objEZpvd2 = interfaceC29133knr2.EZpvd(strKWHzl, str22, str32, this);
        if (objEZpvd2 != objCopydefault) {
        }
    }
}
