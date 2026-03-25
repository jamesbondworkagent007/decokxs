package com.okinc.business.market.features.meme.aped_together.domain;

import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherData;
import com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData;
import com.okinc.business.market.features.tag.domain.TagMeta;
import java.util.ArrayList;
import java.util.Collection;
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
import o.C27634jyr;
import o.C28653keo;
import o.C28654kep;
import o.C28655keq;
import o.C29715kyq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC28656ker;
import o.jAH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.meme.aped_together.domain.FetchApedTogetherUseCase$invoke-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C28653keo>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ int $pageSize$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C28655keq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C28655keq c28655keq, String str, String str2, String str3, int i) {
        super(2, continuation);
        this.this$0 = c28655keq;
        this.$chainId$inlined = str;
        this.$walletAddress$inlined = str2;
        this.$tokenContractAddress$inlined = str3;
        this.$pageSize$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$walletAddress$inlined, this.$tokenContractAddress$inlined, this.$pageSize$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C28653keo>>> continuation) {
        return ((FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[Catch: all -> 0x0185, CancellationException -> 0x019c, TryCatch #2 {CancellationException -> 0x019c, all -> 0x0185, blocks: (B:9:0x0030, B:60:0x016d, B:63:0x0174, B:41:0x0110, B:43:0x0117, B:44:0x012c, B:56:0x0150, B:46:0x0130, B:47:0x0136, B:51:0x0142, B:64:0x017e, B:14:0x0050, B:40:0x00f7, B:17:0x0061, B:28:0x009c, B:32:0x00a7, B:33:0x00c0, B:35:0x00c6, B:36:0x00d5, B:31:0x00a3, B:19:0x006e, B:25:0x0089, B:22:0x0077), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6 A[Catch: all -> 0x0185, CancellationException -> 0x019c, LOOP:0: B:33:0x00c0->B:35:0x00c6, LOOP_END, TryCatch #2 {CancellationException -> 0x019c, all -> 0x0185, blocks: (B:9:0x0030, B:60:0x016d, B:63:0x0174, B:41:0x0110, B:43:0x0117, B:44:0x012c, B:56:0x0150, B:46:0x0130, B:47:0x0136, B:51:0x0142, B:64:0x017e, B:14:0x0050, B:40:0x00f7, B:17:0x0061, B:28:0x009c, B:32:0x00a7, B:33:0x00c0, B:35:0x00c6, B:36:0x00d5, B:31:0x00a3, B:19:0x006e, B:25:0x0089, B:22:0x0077), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117 A[Catch: all -> 0x0185, CancellationException -> 0x019c, TryCatch #2 {CancellationException -> 0x019c, all -> 0x0185, blocks: (B:9:0x0030, B:60:0x016d, B:63:0x0174, B:41:0x0110, B:43:0x0117, B:44:0x012c, B:56:0x0150, B:46:0x0130, B:47:0x0136, B:51:0x0142, B:64:0x017e, B:14:0x0050, B:40:0x00f7, B:17:0x0061, B:28:0x009c, B:32:0x00a7, B:33:0x00c0, B:35:0x00c6, B:36:0x00d5, B:31:0x00a3, B:19:0x006e, B:25:0x0089, B:22:0x0077), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e A[Catch: all -> 0x0185, CancellationException -> 0x019c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x019c, all -> 0x0185, blocks: (B:9:0x0030, B:60:0x016d, B:63:0x0174, B:41:0x0110, B:43:0x0117, B:44:0x012c, B:56:0x0150, B:46:0x0130, B:47:0x0136, B:51:0x0142, B:64:0x017e, B:14:0x0050, B:40:0x00f7, B:17:0x0061, B:28:0x009c, B:32:0x00a7, B:33:0x00c0, B:35:0x00c6, B:36:0x00d5, B:31:0x00a3, B:19:0x006e, B:25:0x0089, B:22:0x0077), top: B:72:0x000e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0169 -> B:60:0x016d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object emojiAddressMapping$default;
        Map map;
        Object objEZpvd;
        Object objKWHzl;
        Map map2;
        Map map3;
        Collection arrayList;
        Map map4;
        Map map5;
        Iterator it;
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
            C27634jyr c27634jyr = this.this$0.copydefault;
            this.label = 1;
            emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
            if (emojiAddressMapping$default == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            emojiAddressMapping$default = obj;
        } else if (i == 2) {
            map = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
            Map map6 = map;
            if (Result.m7380exceptionOrNullimpl(objEZpvd) == null) {
                objEZpvd = yDY.AhwBna();
            }
            List list = (List) objEZpvd;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (Object obj2 : list) {
                linkedHashMap.put(((TrackingAddressAlias) obj2).getCollectAddress(), obj2);
            }
            InterfaceC28656ker interfaceC28656ker = this.this$0.KWHzl;
            String str2 = this.$chainId$inlined;
            String str3 = this.$walletAddress$inlined;
            String str4 = this.$tokenContractAddress$inlined;
            int i2 = this.$pageSize$inlined;
            this.L$0 = map6;
            this.L$1 = linkedHashMap;
            this.label = 3;
            objKWHzl = interfaceC28656ker.KWHzl(str2, str3, str4, i2, this);
            if (objKWHzl != objCopydefault) {
                return objCopydefault;
            }
            map2 = map6;
            map3 = linkedHashMap;
            C56391yDq.AEQbTJ(objKWHzl);
            List<ApedTogetherData> holderRankingList = ((ApedTogetherResponseData) objKWHzl).getHolderRankingList();
            arrayList = new ArrayList(C56403yEb.AYXKKw(holderRankingList, 10));
            map4 = map3;
            map5 = map2;
            it = holderRankingList.iterator();
            Collection collection = arrayList;
            if (!it.hasNext()) {
            }
        } else if (i == 3) {
            map3 = (Map) this.L$1;
            map2 = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objKWHzl);
            List<ApedTogetherData> holderRankingList2 = ((ApedTogetherResponseData) objKWHzl).getHolderRankingList();
            arrayList = new ArrayList(C56403yEb.AYXKKw(holderRankingList2, 10));
            map4 = map3;
            map5 = map2;
            it = holderRankingList2.iterator();
            Collection collection2 = arrayList;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection3 = (Collection) this.L$5;
            ApedTogetherData apedTogetherData = (ApedTogetherData) this.L$4;
            Iterator it2 = (Iterator) this.L$3;
            arrayList = (Collection) this.L$2;
            Map map7 = (Map) this.L$1;
            Map map8 = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            it = it2;
            map4 = map7;
            map5 = map8;
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            collection3.add(C28654kep.KWHzl(apedTogetherData, map5, map4, (TagMeta) objM7386unboximpl));
            Collection collection22 = arrayList;
            if (!it.hasNext()) {
                ApedTogetherData apedTogetherData2 = (ApedTogetherData) it.next();
                C29715kyq c29715kyq = this.this$0.AEQbTJ;
                String tagType = apedTogetherData2.getTagType();
                switch (tagType.hashCode()) {
                    case 48:
                        str = tagType.equals("0") ? "following" : "kol";
                        break;
                    case 49:
                        if (tagType.equals("1")) {
                            str = "smartMoney";
                            break;
                        }
                        break;
                    case 50:
                        tagType.equals("2");
                        break;
                    default:
                        break;
                }
                this.L$0 = map5;
                this.L$1 = map4;
                this.L$2 = collection22;
                this.L$3 = it;
                this.L$4 = apedTogetherData2;
                this.L$5 = collection22;
                this.label = 4;
                Object objM8679getTagMeta0E7RQCE$default = C29715kyq.m8679getTagMeta0E7RQCE$default(c29715kyq, str, false, this, 2, null);
                if (objM8679getTagMeta0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                arrayList = collection22;
                apedTogetherData = apedTogetherData2;
                objM7386unboximpl = objM8679getTagMeta0E7RQCE$default;
                collection3 = arrayList;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                collection3.add(C28654kep.KWHzl(apedTogetherData, map5, map4, (TagMeta) objM7386unboximpl));
                Collection collection222 = arrayList;
                if (!it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl((List) collection222);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
        map = (Map) emojiAddressMapping$default;
        jAH jah = this.this$0.OLrzqt;
        this.L$0 = map;
        this.label = 2;
        objEZpvd = jah.EZpvd(this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        Map map62 = map;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) == null) {
        }
        List list2 = (List) objEZpvd;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
        while (r1.hasNext()) {
        }
        InterfaceC28656ker interfaceC28656ker2 = this.this$0.KWHzl;
        String str22 = this.$chainId$inlined;
        String str32 = this.$walletAddress$inlined;
        String str42 = this.$tokenContractAddress$inlined;
        int i22 = this.$pageSize$inlined;
        this.L$0 = map62;
        this.L$1 = linkedHashMap2;
        this.label = 3;
        objKWHzl = interfaceC28656ker2.KWHzl(str22, str32, str42, i22, this);
        if (objKWHzl != objCopydefault) {
        }
    }
}
