package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.smart_money.AddressResponse;
import com.okinc.business.market.data.model.smart_money.SmartMoneyAddressData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C27634jyr;
import o.C29510kux;
import o.C29626kxG;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC29466kuF;
import o.jAH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSmartMoneyAddressesUseCase$invoke-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C29626kxG>>>, Object> {
    final /* synthetic */ String $batchId$inlined;
    final /* synthetic */ String $batchIndex$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C29510kux this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, String str, String str2, String str3, String str4, String str5, C29510kux c29510kux) {
        super(2, continuation);
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$batchId$inlined = str3;
        this.$batchIndex$inlined = str4;
        this.$walletAddress$inlined = str5;
        this.this$0 = c29510kux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(continuation, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$batchId$inlined, this.$batchIndex$inlined, this.$walletAddress$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C29626kxG>>> continuation) {
        return ((GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: all -> 0x0118, CancellationException -> 0x012f, TryCatch #2 {CancellationException -> 0x012f, all -> 0x0118, blocks: (B:8:0x0019, B:31:0x00ab, B:35:0x00b6, B:36:0x00d1, B:38:0x00d7, B:39:0x00e6, B:40:0x00f7, B:42:0x00fd, B:43:0x0113, B:34:0x00b2, B:13:0x0030, B:27:0x0094, B:14:0x0034, B:23:0x0076, B:17:0x003b, B:19:0x0062, B:20:0x0067), top: B:51:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7 A[Catch: all -> 0x0118, CancellationException -> 0x012f, LOOP:0: B:36:0x00d1->B:38:0x00d7, LOOP_END, TryCatch #2 {CancellationException -> 0x012f, all -> 0x0118, blocks: (B:8:0x0019, B:31:0x00ab, B:35:0x00b6, B:36:0x00d1, B:38:0x00d7, B:39:0x00e6, B:40:0x00f7, B:42:0x00fd, B:43:0x0113, B:34:0x00b2, B:13:0x0030, B:27:0x0094, B:14:0x0034, B:23:0x0076, B:17:0x003b, B:19:0x0062, B:20:0x0067), top: B:51:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[Catch: all -> 0x0118, CancellationException -> 0x012f, LOOP:1: B:40:0x00f7->B:42:0x00fd, LOOP_END, TryCatch #2 {CancellationException -> 0x012f, all -> 0x0118, blocks: (B:8:0x0019, B:31:0x00ab, B:35:0x00b6, B:36:0x00d1, B:38:0x00d7, B:39:0x00e6, B:40:0x00f7, B:42:0x00fd, B:43:0x0113, B:34:0x00b2, B:13:0x0030, B:27:0x0094, B:14:0x0034, B:23:0x0076, B:17:0x003b, B:19:0x0062, B:20:0x0067), top: B:51:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AddressResponse addressResponse;
        Object objEZpvd;
        Map<String, String> map;
        Object objAhwBna;
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
            HashMap map2 = new HashMap();
            map2.put("chainId", this.$chainId$inlined);
            map2.put("tokenContractAddress", this.$tokenContractAddress$inlined);
            map2.put("batchId", this.$batchId$inlined);
            map2.put("batchIndex", this.$batchIndex$inlined);
            String str = this.$walletAddress$inlined;
            if (str != null) {
                map2.put("userWalletAddress", str);
            }
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC29466kuF.copydefault(map2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) this.L$1;
                    addressResponse = (AddressResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAhwBna = ((Result) obj).m7386unboximpl();
                    if (Result.m7380exceptionOrNullimpl(objAhwBna) == null) {
                        objAhwBna = yDY.AhwBna();
                    }
                    List list = (List) objAhwBna;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                    for (Object obj2 : list) {
                        linkedHashMap.put(((TrackingAddressAlias) obj2).getCollectAddress(), obj2);
                    }
                    List<SmartMoneyAddressData> listAEQbTJ = addressResponse.AEQbTJ();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    it = listAEQbTJ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.this$0.OLrzqt.AEQbTJ((SmartMoneyAddressData) it.next(), this.$chainId$inlined, map, linkedHashMap));
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                addressResponse = (AddressResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Map<String, String> map3 = (Map) obj;
                jAH jah = this.this$0.copydefault;
                this.L$0 = addressResponse;
                this.L$1 = map3;
                this.label = 3;
                objEZpvd = jah.EZpvd(this);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                map = map3;
                objAhwBna = objEZpvd;
                if (Result.m7380exceptionOrNullimpl(objAhwBna) == null) {
                }
                List list2 = (List) objAhwBna;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
                while (r8.hasNext()) {
                }
                List<SmartMoneyAddressData> listAEQbTJ2 = addressResponse.AEQbTJ();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
                it = listAEQbTJ2.iterator();
                while (it.hasNext()) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        AddressResponse addressResponse2 = (AddressResponse) ((AbstractC43419rot) obj).AEQbTJ();
        C27634jyr c27634jyr = this.this$0.AEQbTJ;
        this.L$0 = addressResponse2;
        this.label = 2;
        Object emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
        if (emojiAddressMapping$default == objCopydefault) {
            return objCopydefault;
        }
        addressResponse = addressResponse2;
        obj = emojiAddressMapping$default;
        Map<String, String> map32 = (Map) obj;
        jAH jah2 = this.this$0.copydefault;
        this.L$0 = addressResponse;
        this.L$1 = map32;
        this.label = 3;
        objEZpvd = jah2.EZpvd(this);
        if (objEZpvd != objCopydefault) {
        }
    }
}
