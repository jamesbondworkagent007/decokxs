package com.okinc.business.market.features.holdings.domain;

import com.okinc.business.market.data.model.holdings.HoldingData;
import com.okinc.business.market.data.model.holdings.HoldingListResponseData;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
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
import o.C28434kah;
import o.C28443kaq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28437kak;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.holdings.domain.GetHoldingsUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends HoldingAsset>>>, Object> {
    final /* synthetic */ C28443kaq $activePositionFilter$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ boolean $filterOutLowLiquidityTokens$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C28443kaq c28443kaq, C28434kah c28434kah, String str, boolean z) {
        super(2, continuation);
        this.$activePositionFilter$inlined = c28443kaq;
        this.this$0 = c28434kah;
        this.$chainId$inlined = str;
        this.$filterOutLowLiquidityTokens$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$activePositionFilter$inlined, this.this$0, this.$chainId$inlined, this.$filterOutLowLiquidityTokens$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends HoldingAsset>>> continuation) {
        return ((GetHoldingsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[Catch: all -> 0x00f3, CancellationException -> 0x010a, LOOP:0: B:39:0x00d4->B:41:0x00da, LOOP_END, TryCatch #2 {CancellationException -> 0x010a, all -> 0x00f3, blocks: (B:8:0x0014, B:38:0x00b9, B:39:0x00d4, B:41:0x00da, B:42:0x00ee, B:13:0x0031, B:35:0x00a1, B:16:0x0044, B:31:0x0084, B:17:0x0048, B:26:0x0061, B:27:0x0063, B:20:0x004f, B:23:0x0056), top: B:50:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C28443kaq c28443kaq;
        InterfaceC28437kak interfaceC28437kak;
        Object objCopydefault;
        C28443kaq c28443kaq2;
        String str;
        Object objAEQbTJ;
        C28443kaq c28443kaq3;
        String str2;
        InterfaceC28437kak interfaceC28437kak2;
        Iterator<T> it;
        Object objCopydefault2 = C56442yFn.copydefault();
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
            c28443kaq = this.$activePositionFilter$inlined;
            if (c28443kaq != null) {
                interfaceC28437kak = this.this$0.isConnected;
                String str3 = this.$chainId$inlined;
                kKG kkg = this.this$0.fetchVPNInfo;
                this.L$0 = c28443kaq;
                this.L$1 = str3;
                this.L$2 = interfaceC28437kak;
                this.label = 2;
                objCopydefault = kkg.copydefault(this);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                c28443kaq2 = c28443kaq;
                obj = objCopydefault;
                str = str3;
                String str4 = (String) obj;
                kKG kkg2 = this.this$0.fetchVPNInfo;
                this.L$0 = c28443kaq2;
                this.L$1 = str;
                this.L$2 = interfaceC28437kak;
                this.L$3 = str4;
                this.label = 3;
                objAEQbTJ = kkg2.AEQbTJ(this);
                if (objAEQbTJ != objCopydefault2) {
                }
            } else {
                C28434kah c28434kah = this.this$0;
                this.label = 1;
                obj = c28434kah.copydefault(this);
                if (obj == objCopydefault2) {
                    return objCopydefault2;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    interfaceC28437kak = (InterfaceC28437kak) this.L$2;
                    str = (String) this.L$1;
                    c28443kaq2 = (C28443kaq) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    String str42 = (String) obj;
                    kKG kkg22 = this.this$0.fetchVPNInfo;
                    this.L$0 = c28443kaq2;
                    this.L$1 = str;
                    this.L$2 = interfaceC28437kak;
                    this.L$3 = str42;
                    this.label = 3;
                    objAEQbTJ = kkg22.AEQbTJ(this);
                    if (objAEQbTJ != objCopydefault2) {
                        return objCopydefault2;
                    }
                    c28443kaq3 = c28443kaq2;
                    str2 = str42;
                    obj = objAEQbTJ;
                    interfaceC28437kak2 = interfaceC28437kak;
                    boolean z = this.$filterOutLowLiquidityTokens$inlined;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    obj = interfaceC28437kak2.copydefault(str, str2, (String) obj, z, c28443kaq3, this);
                    if (obj == objCopydefault2) {
                    }
                    List<HoldingData> listAEQbTJ = ((HoldingListResponseData) ((AbstractC43419rot) obj).AEQbTJ()).AEQbTJ();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    it = listAEQbTJ.iterator();
                    while (it.hasNext()) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    List<HoldingData> listAEQbTJ2 = ((HoldingListResponseData) ((AbstractC43419rot) obj).AEQbTJ()).AEQbTJ();
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
                    it = listAEQbTJ2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(this.this$0.AYXKKw.EZpvd((HoldingData) it.next()));
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                String str5 = (String) this.L$3;
                interfaceC28437kak2 = (InterfaceC28437kak) this.L$2;
                str = (String) this.L$1;
                C28443kaq c28443kaq4 = (C28443kaq) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c28443kaq3 = c28443kaq4;
                str2 = str5;
                boolean z2 = this.$filterOutLowLiquidityTokens$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                obj = interfaceC28437kak2.copydefault(str, str2, (String) obj, z2, c28443kaq3, this);
                if (obj == objCopydefault2) {
                    return objCopydefault2;
                }
                List<HoldingData> listAEQbTJ22 = ((HoldingListResponseData) ((AbstractC43419rot) obj).AEQbTJ()).AEQbTJ();
                ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ22, 10));
                it = listAEQbTJ22.iterator();
                while (it.hasNext()) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList22);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        c28443kaq = (C28443kaq) obj;
        interfaceC28437kak = this.this$0.isConnected;
        String str32 = this.$chainId$inlined;
        kKG kkg3 = this.this$0.fetchVPNInfo;
        this.L$0 = c28443kaq;
        this.L$1 = str32;
        this.L$2 = interfaceC28437kak;
        this.label = 2;
        objCopydefault = kkg3.copydefault(this);
        if (objCopydefault != objCopydefault2) {
        }
    }
}
