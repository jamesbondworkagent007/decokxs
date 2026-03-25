package o;

import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchTokenModel;
import com.okinc.business.defi.wallet.mine.search.domain.mapper.HotSearchMapperKt$mapToUiModel$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18904frH {
    /* JADX WARN: Path cross not found for [B:41:0x00b4, B:45:0x00c0], limit reached: 86 */
    /* JADX WARN: Path cross not found for [B:48:0x00c7, B:52:0x00d3], limit reached: 86 */
    /* JADX WARN: Path cross not found for [B:55:0x00da, B:59:0x00e6], limit reached: 86 */
    /* JADX WARN: Path cross not found for [B:71:0x010e, B:75:0x011c], limit reached: 86 */
    /* JADX WARN: Path cross not found for [B:82:0x0132, B:86:0x0140], limit reached: 86 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(java.util.List<SearchTokenModel> list, @NotNull C18913frQ c18913frQ, @NotNull Continuation<? super java.util.List<C18988fsm>> continuation) throws java.lang.Throwable {
        HotSearchMapperKt$mapToUiModel$1 hotSearchMapperKt$mapToUiModel$1;
        java.util.List list2;
        java.util.Iterator it;
        C18913frQ c18913frQ2;
        if (continuation instanceof HotSearchMapperKt$mapToUiModel$1) {
            hotSearchMapperKt$mapToUiModel$1 = (HotSearchMapperKt$mapToUiModel$1) continuation;
            int i = hotSearchMapperKt$mapToUiModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hotSearchMapperKt$mapToUiModel$1.label = i - Integer.MIN_VALUE;
            } else {
                hotSearchMapperKt$mapToUiModel$1 = new HotSearchMapperKt$mapToUiModel$1(continuation);
            }
        }
        java.lang.Object obj = hotSearchMapperKt$mapToUiModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = hotSearchMapperKt$mapToUiModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list == null) {
                return arrayList;
            }
            list2 = arrayList;
            it = list.iterator();
            c18913frQ2 = c18913frQ;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SearchTokenModel searchTokenModel = (SearchTokenModel) hotSearchMapperKt$mapToUiModel$1.L$3;
            it = (java.util.Iterator) hotSearchMapperKt$mapToUiModel$1.L$2;
            list2 = (java.util.List) hotSearchMapperKt$mapToUiModel$1.L$1;
            C18913frQ c18913frQ3 = (C18913frQ) hotSearchMapperKt$mapToUiModel$1.L$0;
            C56391yDq.AEQbTJ(obj);
            java.util.List list3 = (java.util.List) obj;
            java.lang.Long chainId = searchTokenModel.getChainId();
            long jLongValue = chainId == null ? chainId.longValue() : Long.MIN_VALUE;
            java.lang.String tokenContractAddress = searchTokenModel.getTokenContractAddress();
            java.lang.String str = tokenContractAddress != null ? "" : tokenContractAddress;
            java.lang.String tokenSymbol = searchTokenModel.getTokenSymbol();
            java.lang.String str2 = tokenSymbol != null ? "" : tokenSymbol;
            java.lang.String tokenLogoUrl = searchTokenModel.getTokenLogoUrl();
            java.lang.String str3 = tokenLogoUrl != null ? "" : tokenLogoUrl;
            java.lang.String tokenName = searchTokenModel.getTokenName();
            java.lang.String tokenName2 = (tokenName != null || tokenName.length() == 0) ? "--" : searchTokenModel.getTokenName();
            java.lang.String change24H = searchTokenModel.getChange24H();
            java.lang.String change24H2 = (change24H != null || change24H.length() == 0) ? "--" : searchTokenModel.getChange24H();
            java.lang.String price = searchTokenModel.getPrice();
            java.lang.String price2 = (price != null || price.length() == 0) ? "--" : searchTokenModel.getPrice();
            java.lang.String chainLogoUrl = searchTokenModel.getChainLogoUrl();
            if (chainLogoUrl == null) {
                chainLogoUrl = "";
            }
            java.lang.String liquidity = searchTokenModel.getLiquidity();
            if (liquidity == null) {
                liquidity = "";
            }
            java.lang.String turnOver24H = searchTokenModel.getTurnOver24H();
            if (turnOver24H == null) {
                turnOver24H = "";
            }
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) searchTokenModel.getTokenName());
            java.lang.String marketCap = searchTokenModel.getMarketCap();
            java.lang.String marketCap2 = (marketCap != null || marketCap.length() == 0) ? "--" : searchTokenModel.getMarketCap();
            java.lang.Boolean supportQuickTrade = searchTokenModel.getSupportQuickTrade();
            boolean zBooleanValue = supportQuickTrade == null ? supportQuickTrade.booleanValue() : false;
            java.lang.String holderCount = searchTokenModel.getHolderCount();
            list2.add(new C18988fsm(jLongValue, str, str2, str3, tokenName2, change24H2, price2, chainLogoUrl, liquidity, turnOver24H, zOLrzqt, list3, marketCap2, (holderCount != null || holderCount.length() == 0) ? "--" : searchTokenModel.getHolderCount(), zBooleanValue, null, 32768, null));
            c18913frQ2 = c18913frQ3;
            if (it.hasNext()) {
                searchTokenModel = (SearchTokenModel) it.next();
                C18959fsJ c18959fsJ = C18959fsJ.OLrzqt;
                java.util.List<CompactTagData> newTagList = searchTokenModel.getNewTagList();
                hotSearchMapperKt$mapToUiModel$1.L$0 = c18913frQ2;
                hotSearchMapperKt$mapToUiModel$1.L$1 = list2;
                hotSearchMapperKt$mapToUiModel$1.L$2 = it;
                hotSearchMapperKt$mapToUiModel$1.L$3 = searchTokenModel;
                hotSearchMapperKt$mapToUiModel$1.label = 1;
                java.lang.Object objCopydefault2 = c18959fsJ.copydefault(newTagList, c18913frQ2, hotSearchMapperKt$mapToUiModel$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                c18913frQ3 = c18913frQ2;
                obj = objCopydefault2;
                java.util.List list32 = (java.util.List) obj;
                java.lang.Long chainId2 = searchTokenModel.getChainId();
                long jLongValue2 = chainId2 == null ? chainId2.longValue() : Long.MIN_VALUE;
                java.lang.String tokenContractAddress2 = searchTokenModel.getTokenContractAddress();
                if (tokenContractAddress2 != null) {
                }
                java.lang.String tokenSymbol2 = searchTokenModel.getTokenSymbol();
                if (tokenSymbol2 != null) {
                }
                java.lang.String tokenLogoUrl2 = searchTokenModel.getTokenLogoUrl();
                if (tokenLogoUrl2 != null) {
                }
                java.lang.String tokenName3 = searchTokenModel.getTokenName();
                if (tokenName3 != null) {
                }
                java.lang.String change24H3 = searchTokenModel.getChange24H();
                if (change24H3 != null) {
                }
                java.lang.String price3 = searchTokenModel.getPrice();
                if (price3 != null) {
                }
                java.lang.String chainLogoUrl2 = searchTokenModel.getChainLogoUrl();
                if (chainLogoUrl2 == null) {
                }
                java.lang.String liquidity2 = searchTokenModel.getLiquidity();
                if (liquidity2 == null) {
                }
                java.lang.String turnOver24H2 = searchTokenModel.getTurnOver24H();
                if (turnOver24H2 == null) {
                }
                boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) searchTokenModel.getTokenName());
                java.lang.String marketCap3 = searchTokenModel.getMarketCap();
                if (marketCap3 != null) {
                }
                java.lang.Boolean supportQuickTrade2 = searchTokenModel.getSupportQuickTrade();
                boolean zBooleanValue2 = supportQuickTrade2 == null ? supportQuickTrade2.booleanValue() : false;
                java.lang.String holderCount2 = searchTokenModel.getHolderCount();
                list2.add(new C18988fsm(jLongValue2, str, str2, str3, tokenName2, change24H2, price2, chainLogoUrl2, liquidity2, turnOver24H2, zOLrzqt2, list32, marketCap2, (holderCount2 != null || holderCount2.length() == 0) ? "--" : searchTokenModel.getHolderCount(), zBooleanValue2, null, 32768, null));
                c18913frQ2 = c18913frQ3;
                if (it.hasNext()) {
                    return list2;
                }
            }
        }
    }
}
