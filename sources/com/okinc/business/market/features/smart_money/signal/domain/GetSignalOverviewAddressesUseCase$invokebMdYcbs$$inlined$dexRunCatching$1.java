package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.data.model.smart_money.SignalOverviewAddressData;
import com.okinc.business.market.data.model.smart_money.SignalOverviewAddressResponse;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C27634jyr;
import o.C29468kuH;
import o.C29506kut;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC29466kuF;
import o.jAH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewAddressesUseCase$invoke-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C29468kuH>>>, Object> {
    final /* synthetic */ String $batchId$inlined;
    final /* synthetic */ String $batchIndex$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $tokenSymbol$inlined;
    final /* synthetic */ String $userWalletAddress$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C29506kut this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, C29506kut c29506kut, String str, String str2, String str3, String str4, String str5, String str6) {
        super(2, continuation);
        this.this$0 = c29506kut;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$batchId$inlined = str3;
        this.$batchIndex$inlined = str4;
        this.$userWalletAddress$inlined = str5;
        this.$tokenSymbol$inlined = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$batchId$inlined, this.$batchIndex$inlined, this.$userWalletAddress$inlined, this.$tokenSymbol$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C29468kuH>>> continuation) {
        return ((GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: all -> 0x018b, CancellationException -> 0x01a2, TryCatch #2 {CancellationException -> 0x01a2, all -> 0x018b, blocks: (B:8:0x001e, B:36:0x00cb, B:37:0x00e4, B:39:0x00ea, B:41:0x0102, B:45:0x0114, B:47:0x0126, B:51:0x013a, B:53:0x016c, B:55:0x0175, B:56:0x0186, B:13:0x0032, B:24:0x006d, B:28:0x0078, B:29:0x0091, B:31:0x0097, B:32:0x00a6, B:27:0x0074, B:15:0x003f, B:21:0x005a, B:18:0x0048), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x018b, CancellationException -> 0x01a2, LOOP:1: B:29:0x0091->B:31:0x0097, LOOP_END, TryCatch #2 {CancellationException -> 0x01a2, all -> 0x018b, blocks: (B:8:0x001e, B:36:0x00cb, B:37:0x00e4, B:39:0x00ea, B:41:0x0102, B:45:0x0114, B:47:0x0126, B:51:0x013a, B:53:0x016c, B:55:0x0175, B:56:0x0186, B:13:0x0032, B:24:0x006d, B:28:0x0078, B:29:0x0091, B:31:0x0097, B:32:0x00a6, B:27:0x0074, B:15:0x003f, B:21:0x005a, B:18:0x0048), top: B:64:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea A[Catch: all -> 0x018b, CancellationException -> 0x01a2, TryCatch #2 {CancellationException -> 0x01a2, all -> 0x018b, blocks: (B:8:0x001e, B:36:0x00cb, B:37:0x00e4, B:39:0x00ea, B:41:0x0102, B:45:0x0114, B:47:0x0126, B:51:0x013a, B:53:0x016c, B:55:0x0175, B:56:0x0186, B:13:0x0032, B:24:0x006d, B:28:0x0078, B:29:0x0091, B:31:0x0097, B:32:0x00a6, B:27:0x0074, B:15:0x003f, B:21:0x005a, B:18:0x0048), top: B:64:0x000e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object emojiAddressMapping$default;
        Map map;
        Object objEZpvd;
        Map map2;
        Object objEZpvd2;
        Map map3;
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
            C27634jyr c27634jyr = this.this$0.OLrzqt;
            this.label = 1;
            emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
            if (emojiAddressMapping$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map3 = (Map) this.L$1;
                    Map map4 = (Map) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    map2 = map4;
                    objEZpvd2 = obj;
                    List<SignalOverviewAddressData> listAEQbTJ = ((SignalOverviewAddressResponse) ((AbstractC43419rot) objEZpvd2).AEQbTJ()).AEQbTJ();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    for (SignalOverviewAddressData signalOverviewAddressData : listAEQbTJ) {
                        String strKWHzl = (signalOverviewAddressData.OLrzqt().EZpvd() && (StringsKt__StringsKt.fARcdN((CharSequence) signalOverviewAddressData.OLrzqt().KWHzl()) ^ true)) ? signalOverviewAddressData.OLrzqt().KWHzl() : null;
                        String strAEQbTJ = (signalOverviewAddressData.OLrzqt().EZpvd() && (StringsKt__StringsKt.fARcdN((CharSequence) signalOverviewAddressData.OLrzqt().AEQbTJ()) ^ true)) ? signalOverviewAddressData.OLrzqt().AEQbTJ() : null;
                        String strValueOf = signalOverviewAddressData.valueOf();
                        TxType txTypeAhwBna = signalOverviewAddressData.AhwBna();
                        String strAYXKKw = signalOverviewAddressData.AYXKKw();
                        String strEZpvd = signalOverviewAddressData.EZpvd();
                        String strKWHzl2 = signalOverviewAddressData.KWHzl();
                        String strCopydefault = signalOverviewAddressData.copydefault();
                        String str = (String) map2.getOrDefault(signalOverviewAddressData.valueOf(), "");
                        TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) map3.get(signalOverviewAddressData.valueOf());
                        arrayList.add(new C29468kuH(this.$tokenSymbol$inlined, strKWHzl, strAEQbTJ, strValueOf, strCopydefault, txTypeAhwBna, strAYXKKw, strEZpvd, strKWHzl2, this.$chainId$inlined, str, trackingAddressAlias != null ? trackingAddressAlias.getAddressAliasColorHex() : null));
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                map = (Map) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                map2 = map;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) == null) {
                    objEZpvd = yDY.AhwBna();
                }
                List list = (List) objEZpvd;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                for (Object obj2 : list) {
                    linkedHashMap.put(((TrackingAddressAlias) obj2).getCollectAddress(), obj2);
                }
                InterfaceC29466kuF interfaceC29466kuF = this.this$0.copydefault;
                String str2 = this.$chainId$inlined;
                String str3 = this.$tokenContractAddress$inlined;
                String str4 = this.$batchId$inlined;
                String str5 = this.$batchIndex$inlined;
                String str6 = this.$userWalletAddress$inlined;
                this.L$0 = map2;
                this.L$1 = linkedHashMap;
                this.label = 3;
                objEZpvd2 = interfaceC29466kuF.EZpvd(str2, str3, str4, str5, str6, this);
                if (objEZpvd2 != objCopydefault) {
                    return objCopydefault;
                }
                map3 = linkedHashMap;
                List<SignalOverviewAddressData> listAEQbTJ2 = ((SignalOverviewAddressResponse) ((AbstractC43419rot) objEZpvd2).AEQbTJ()).AEQbTJ();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
                while (r1.hasNext()) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            emojiAddressMapping$default = obj;
        }
        map = (Map) emojiAddressMapping$default;
        jAH jah = this.this$0.KWHzl;
        this.L$0 = map;
        this.label = 2;
        objEZpvd = jah.EZpvd(this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        map2 = map;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) == null) {
        }
        List list2 = (List) objEZpvd;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
        while (r1.hasNext()) {
        }
        InterfaceC29466kuF interfaceC29466kuF2 = this.this$0.copydefault;
        String str22 = this.$chainId$inlined;
        String str32 = this.$tokenContractAddress$inlined;
        String str42 = this.$batchId$inlined;
        String str52 = this.$batchIndex$inlined;
        String str62 = this.$userWalletAddress$inlined;
        this.L$0 = map2;
        this.L$1 = linkedHashMap2;
        this.label = 3;
        objEZpvd2 = interfaceC29466kuF2.EZpvd(str22, str32, str42, str52, str62, this);
        if (objEZpvd2 != objCopydefault) {
        }
    }
}
