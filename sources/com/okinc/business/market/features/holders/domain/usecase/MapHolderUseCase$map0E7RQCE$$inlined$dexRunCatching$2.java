package com.okinc.business.market.features.holders.domain.usecase;

import com.okinc.business.data.model.market.HolderRankingResponseData;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27634jyr;
import o.C27722kAy;
import o.C29712kyn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.jAH;
import o.jYH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$map-0E7RQCE$$inlined$dexRunCatching$2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends HolderDetailModel>>, Object> {
    final /* synthetic */ HolderRankingResponseData $from$inlined;
    final /* synthetic */ int $index$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ jYH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2(Continuation continuation, HolderRankingResponseData holderRankingResponseData, jYH jyh, int i) {
        super(2, continuation);
        this.$from$inlined = holderRankingResponseData;
        this.this$0 = jyh;
        this.$index$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2(continuation, this.$from$inlined, this.this$0, this.$index$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends HolderDetailModel>> continuation) {
        return ((MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x01ff, CancellationException -> 0x0216, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x01ff, CancellationException -> 0x0216, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[Catch: all -> 0x01ff, CancellationException -> 0x0216, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[Catch: all -> 0x01ff, CancellationException -> 0x0216, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[Catch: all -> 0x01ff, CancellationException -> 0x0216, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115 A[Catch: all -> 0x01ff, CancellationException -> 0x0216, LOOP:0: B:46:0x010f->B:48:0x0115, LOOP_END, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[Catch: all -> 0x01ff, CancellationException -> 0x0216, TryCatch #2 {CancellationException -> 0x0216, all -> 0x01ff, blocks: (B:8:0x001c, B:41:0x00e7, B:45:0x00f2, B:46:0x010f, B:48:0x0115, B:49:0x0124, B:51:0x012c, B:53:0x01d4, B:55:0x01e2, B:56:0x01e6, B:44:0x00ee, B:13:0x0035, B:35:0x00c9, B:37:0x00d3, B:16:0x0045, B:26:0x00a0, B:29:0x00a7, B:20:0x0069, B:22:0x006f, B:32:0x00af, B:31:0x00ab, B:19:0x0056), top: B:64:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009c -> B:26:0x00a0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Iterator it;
        Collection collection;
        List list;
        Object emojiAddressMapping$default;
        Map map;
        List list2;
        Object objEZpvd;
        List list3;
        Map map2;
        TrackingAddressAlias trackingAddressAlias;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String addressAliasColorHex = null;
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
            List<CompactTagData> newTagList = this.$from$inlined.getNewTagList();
            ArrayList arrayList = new ArrayList();
            it = newTagList.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.L$1;
                    map = (Map) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) == null) {
                        objEZpvd = yDY.AhwBna();
                    }
                    List list4 = (List) objEZpvd;
                    jYH jyh = this.this$0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list4, 10)), 16));
                    for (Object obj2 : list4) {
                        linkedHashMap.put(((TrackingAddressAlias) obj2).getCollectAddress(), obj2);
                    }
                    jyh.KWHzl = linkedHashMap;
                    list2 = list3;
                    int i2 = this.$index$inlined;
                    String chainId = this.$from$inlined.getChainId();
                    String tokenContractAddress = this.$from$inlined.getTokenContractAddress();
                    String holderWalletAddress = this.$from$inlined.getHolderWalletAddress();
                    String holdAmount = this.$from$inlined.getHoldAmount();
                    String holdAmountPercentage = this.$from$inlined.getHoldAmountPercentage();
                    String holdVolume = this.$from$inlined.getHoldVolume();
                    String holdAmount24HChange = this.$from$inlined.getHoldAmount24HChange();
                    String fundingSourceAddress = this.$from$inlined.getFundingSourceAddress();
                    String fundingSourceTime = this.$from$inlined.getFundingSourceTime();
                    String fundingSourceAddressShowName = this.$from$inlined.getFundingSourceAddressShowName();
                    boolean zEZpvd = Intrinsics.EZpvd((Object) this.$from$inlined.getChainId(), (Object) "501");
                    boolean zOLrzqt = C27722kAy.OLrzqt(this.$from$inlined.getExtraOne());
                    String lastTradeTime = this.$from$inlined.getLastTradeTime();
                    String explorerUrl = this.$from$inlined.getExplorerUrl();
                    String nativeTokenPrice = this.$from$inlined.getNativeTokenPrice();
                    String nativeTokenBalance = this.$from$inlined.getNativeTokenBalance();
                    String totalProfit = this.$from$inlined.getTotalProfit();
                    String totalProfitPercentage = this.$from$inlined.getTotalProfitPercentage();
                    String inFlowAmount = this.$from$inlined.getInFlowAmount();
                    String inFlowValue = this.$from$inlined.getInFlowValue();
                    String holdingTime = this.$from$inlined.getHoldingTime();
                    String holdCreateTime = this.$from$inlined.getHoldCreateTime();
                    String str = (String) map.getOrDefault(this.$from$inlined.getHolderWalletAddress(), "");
                    map2 = this.this$0.KWHzl;
                    if (map2 != null && (trackingAddressAlias = (TrackingAddressAlias) map2.get(this.$from$inlined.getHolderWalletAddress())) != null) {
                        addressAliasColorHex = trackingAddressAlias.getAddressAliasColorHex();
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(new HolderDetailModel(i2 + 1, chainId, tokenContractAddress, holderWalletAddress, holdAmount, holdAmountPercentage, holdVolume, holdAmount24HChange, fundingSourceAddress, fundingSourceTime, fundingSourceAddressShowName, zEZpvd, zOLrzqt, lastTradeTime, explorerUrl, false, null, nativeTokenPrice, nativeTokenBalance, totalProfit, totalProfitPercentage, inFlowAmount, inFlowValue, holdCreateTime, holdingTime, list2, str, addressAliasColorHex, 98304, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                List list5 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = list5;
                emojiAddressMapping$default = obj;
                map = (Map) emojiAddressMapping$default;
                if (this.this$0.KWHzl == null) {
                    list2 = list;
                    int i22 = this.$index$inlined;
                    String chainId2 = this.$from$inlined.getChainId();
                    String tokenContractAddress2 = this.$from$inlined.getTokenContractAddress();
                    String holderWalletAddress2 = this.$from$inlined.getHolderWalletAddress();
                    String holdAmount2 = this.$from$inlined.getHoldAmount();
                    String holdAmountPercentage2 = this.$from$inlined.getHoldAmountPercentage();
                    String holdVolume2 = this.$from$inlined.getHoldVolume();
                    String holdAmount24HChange2 = this.$from$inlined.getHoldAmount24HChange();
                    String fundingSourceAddress2 = this.$from$inlined.getFundingSourceAddress();
                    String fundingSourceTime2 = this.$from$inlined.getFundingSourceTime();
                    String fundingSourceAddressShowName2 = this.$from$inlined.getFundingSourceAddressShowName();
                    boolean zEZpvd2 = Intrinsics.EZpvd((Object) this.$from$inlined.getChainId(), (Object) "501");
                    boolean zOLrzqt2 = C27722kAy.OLrzqt(this.$from$inlined.getExtraOne());
                    String lastTradeTime2 = this.$from$inlined.getLastTradeTime();
                    String explorerUrl2 = this.$from$inlined.getExplorerUrl();
                    String nativeTokenPrice2 = this.$from$inlined.getNativeTokenPrice();
                    String nativeTokenBalance2 = this.$from$inlined.getNativeTokenBalance();
                    String totalProfit2 = this.$from$inlined.getTotalProfit();
                    String totalProfitPercentage2 = this.$from$inlined.getTotalProfitPercentage();
                    String inFlowAmount2 = this.$from$inlined.getInFlowAmount();
                    String inFlowValue2 = this.$from$inlined.getInFlowValue();
                    String holdingTime2 = this.$from$inlined.getHoldingTime();
                    String holdCreateTime2 = this.$from$inlined.getHoldCreateTime();
                    String str2 = (String) map.getOrDefault(this.$from$inlined.getHolderWalletAddress(), "");
                    map2 = this.this$0.KWHzl;
                    if (map2 != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(new HolderDetailModel(i22 + 1, chainId2, tokenContractAddress2, holderWalletAddress2, holdAmount2, holdAmountPercentage2, holdVolume2, holdAmount24HChange2, fundingSourceAddress2, fundingSourceTime2, fundingSourceAddressShowName2, zEZpvd2, zOLrzqt2, lastTradeTime2, explorerUrl2, false, null, nativeTokenPrice2, nativeTokenBalance2, totalProfit2, totalProfitPercentage2, inFlowAmount2, inFlowValue2, holdCreateTime2, holdingTime2, list2, str2, addressAliasColorHex, 98304, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                jAH jah = this.this$0.AEQbTJ;
                this.L$0 = map;
                this.L$1 = list;
                this.label = 3;
                objEZpvd = jah.EZpvd(this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                list3 = list;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) == null) {
                }
                List list42 = (List) objEZpvd;
                jYH jyh2 = this.this$0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list42, 10)), 16));
                while (r2.hasNext()) {
                }
                jyh2.KWHzl = linkedHashMap2;
                list2 = list3;
                int i222 = this.$index$inlined;
                String chainId22 = this.$from$inlined.getChainId();
                String tokenContractAddress22 = this.$from$inlined.getTokenContractAddress();
                String holderWalletAddress22 = this.$from$inlined.getHolderWalletAddress();
                String holdAmount22 = this.$from$inlined.getHoldAmount();
                String holdAmountPercentage22 = this.$from$inlined.getHoldAmountPercentage();
                String holdVolume22 = this.$from$inlined.getHoldVolume();
                String holdAmount24HChange22 = this.$from$inlined.getHoldAmount24HChange();
                String fundingSourceAddress22 = this.$from$inlined.getFundingSourceAddress();
                String fundingSourceTime22 = this.$from$inlined.getFundingSourceTime();
                String fundingSourceAddressShowName22 = this.$from$inlined.getFundingSourceAddressShowName();
                boolean zEZpvd22 = Intrinsics.EZpvd((Object) this.$from$inlined.getChainId(), (Object) "501");
                boolean zOLrzqt22 = C27722kAy.OLrzqt(this.$from$inlined.getExtraOne());
                String lastTradeTime22 = this.$from$inlined.getLastTradeTime();
                String explorerUrl22 = this.$from$inlined.getExplorerUrl();
                String nativeTokenPrice22 = this.$from$inlined.getNativeTokenPrice();
                String nativeTokenBalance22 = this.$from$inlined.getNativeTokenBalance();
                String totalProfit22 = this.$from$inlined.getTotalProfit();
                String totalProfitPercentage22 = this.$from$inlined.getTotalProfitPercentage();
                String inFlowAmount22 = this.$from$inlined.getInFlowAmount();
                String inFlowValue22 = this.$from$inlined.getInFlowValue();
                String holdingTime22 = this.$from$inlined.getHoldingTime();
                String holdCreateTime22 = this.$from$inlined.getHoldCreateTime();
                String str22 = (String) map.getOrDefault(this.$from$inlined.getHolderWalletAddress(), "");
                map2 = this.this$0.KWHzl;
                if (map2 != null) {
                    addressAliasColorHex = trackingAddressAlias.getAddressAliasColorHex();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new HolderDetailModel(i222 + 1, chainId22, tokenContractAddress22, holderWalletAddress22, holdAmount22, holdAmountPercentage22, holdVolume22, holdAmount24HChange22, fundingSourceAddress22, fundingSourceTime22, fundingSourceAddressShowName22, zEZpvd22, zOLrzqt22, lastTradeTime22, explorerUrl22, false, null, nativeTokenPrice22, nativeTokenBalance22, totalProfit22, totalProfitPercentage22, inFlowAmount22, inFlowValue22, holdCreateTime22, holdingTime22, list2, str22, addressAliasColorHex, 98304, null));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            Iterator it2 = (Iterator) this.L$1;
            Collection collection2 = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd2 = ((Result) obj).m7386unboximpl();
            it = it2;
            collection = collection2;
            if (Result.m7383isFailureimpl(objEZpvd2)) {
                objEZpvd2 = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objEZpvd2;
            if (tagWrapper != null) {
                collection.add(tagWrapper);
            }
            if (it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C29712kyn c29712kyn = this.this$0.OLrzqt;
                this.L$0 = collection;
                this.L$1 = it;
                this.label = 1;
                Collection collection3 = collection;
                Iterator it3 = it;
                objEZpvd2 = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                it = it3;
                collection = collection3;
                if (Result.m7383isFailureimpl(objEZpvd2)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objEZpvd2;
                if (tagWrapper2 != null) {
                }
                if (it.hasNext()) {
                    list = (List) collection;
                    C27634jyr c27634jyr = this.this$0.EZpvd;
                    this.L$0 = list;
                    this.L$1 = null;
                    this.label = 2;
                    emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
                    if (emojiAddressMapping$default == objCopydefault) {
                        return objCopydefault;
                    }
                    map = (Map) emojiAddressMapping$default;
                    if (this.this$0.KWHzl == null) {
                    }
                }
            }
        }
    }
}
