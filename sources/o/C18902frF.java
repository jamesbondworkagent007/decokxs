package o;

import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppChainInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppModel;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchTokenModel;
import com.okinc.business.defi.wallet.mine.search.domain.mapper.SearchResultMapperKt$mapToSearchUiModel$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18902frF {
    /* JADX WARN: Path cross not found for [B:41:0x00cb, B:47:0x00da], limit reached: 92 */
    /* JADX WARN: Path cross not found for [B:50:0x00e1, B:56:0x00f1], limit reached: 92 */
    /* JADX WARN: Path cross not found for [B:59:0x00f9, B:65:0x0109], limit reached: 92 */
    /* JADX WARN: Path cross not found for [B:77:0x0131, B:81:0x013f], limit reached: 92 */
    /* JADX WARN: Path cross not found for [B:88:0x0155, B:92:0x0163], limit reached: 92 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:23:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(java.util.List<SearchTokenModel> list, @NotNull java.lang.String str, @NotNull C18913frQ c18913frQ, @NotNull Continuation<? super java.util.List<C18982fsg>> continuation) throws java.lang.Throwable {
        SearchResultMapperKt$mapToSearchUiModel$1 searchResultMapperKt$mapToSearchUiModel$1;
        java.util.List list2;
        java.util.Iterator it;
        java.lang.String str2;
        SearchResultMapperKt$mapToSearchUiModel$1 searchResultMapperKt$mapToSearchUiModel$12;
        C18913frQ c18913frQ2;
        java.lang.String tokenName;
        java.lang.String change24H;
        java.lang.String price;
        if (continuation instanceof SearchResultMapperKt$mapToSearchUiModel$1) {
            searchResultMapperKt$mapToSearchUiModel$1 = (SearchResultMapperKt$mapToSearchUiModel$1) continuation;
            int i = searchResultMapperKt$mapToSearchUiModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchResultMapperKt$mapToSearchUiModel$1.label = i - Integer.MIN_VALUE;
            } else {
                searchResultMapperKt$mapToSearchUiModel$1 = new SearchResultMapperKt$mapToSearchUiModel$1(continuation);
            }
        }
        java.lang.Object obj = searchResultMapperKt$mapToSearchUiModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchResultMapperKt$mapToSearchUiModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list == null) {
                return arrayList;
            }
            list2 = arrayList;
            it = list.iterator();
            str2 = str;
            searchResultMapperKt$mapToSearchUiModel$12 = searchResultMapperKt$mapToSearchUiModel$1;
            c18913frQ2 = c18913frQ;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SearchTokenModel searchTokenModel = (SearchTokenModel) searchResultMapperKt$mapToSearchUiModel$1.L$4;
            java.util.Iterator it2 = (java.util.Iterator) searchResultMapperKt$mapToSearchUiModel$1.L$3;
            java.util.List list3 = (java.util.List) searchResultMapperKt$mapToSearchUiModel$1.L$2;
            C18913frQ c18913frQ3 = (C18913frQ) searchResultMapperKt$mapToSearchUiModel$1.L$1;
            java.lang.String str3 = (java.lang.String) searchResultMapperKt$mapToSearchUiModel$1.L$0;
            C56391yDq.AEQbTJ(obj);
            SearchResultMapperKt$mapToSearchUiModel$1 searchResultMapperKt$mapToSearchUiModel$13 = searchResultMapperKt$mapToSearchUiModel$1;
            c18913frQ2 = c18913frQ3;
            java.util.List list4 = list3;
            java.util.Iterator it3 = it2;
            java.util.List list5 = (java.util.List) obj;
            java.lang.Long chainId = searchTokenModel.getChainId();
            long jLongValue = chainId == null ? chainId.longValue() : Long.MIN_VALUE;
            java.lang.String tokenContractAddress = searchTokenModel.getTokenContractAddress();
            java.lang.String str4 = tokenContractAddress != null ? "" : tokenContractAddress;
            java.lang.String tokenSymbol = searchTokenModel.getTokenSymbol();
            java.lang.String str5 = tokenSymbol != null ? "" : tokenSymbol;
            java.lang.String tokenLogoUrl = searchTokenModel.getTokenLogoUrl();
            java.lang.String str6 = tokenLogoUrl != null ? "" : tokenLogoUrl;
            java.lang.String tokenName2 = searchTokenModel.getTokenName();
            if (tokenName2 != null || tokenName2.length() == 0) {
                tokenName = "--";
            } else {
                tokenName = searchTokenModel.getTokenName();
                if (tokenName == null) {
                    tokenName = "";
                }
            }
            java.lang.String change24H2 = searchTokenModel.getChange24H();
            if (change24H2 != null || change24H2.length() == 0) {
                change24H = "--";
            } else {
                change24H = searchTokenModel.getChange24H();
                if (change24H == null) {
                    change24H = "";
                }
            }
            java.lang.String price2 = searchTokenModel.getPrice();
            if (price2 != null || price2.length() == 0) {
                price = "--";
            } else {
                price = searchTokenModel.getPrice();
                if (price == null) {
                    price = "";
                }
            }
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
            list4.add(new C18982fsg(new C18988fsm(jLongValue, str4, str5, str6, tokenName, change24H, price, chainLogoUrl, liquidity, turnOver24H, zOLrzqt, list5, marketCap2, (holderCount != null || holderCount.length() == 0) ? "--" : searchTokenModel.getHolderCount(), zBooleanValue, searchTokenModel.getRiskLevel()), str3));
            searchResultMapperKt$mapToSearchUiModel$12 = searchResultMapperKt$mapToSearchUiModel$13;
            it = it3;
            list2 = list4;
            str2 = str3;
            if (it.hasNext()) {
                SearchTokenModel searchTokenModel2 = (SearchTokenModel) it.next();
                C18959fsJ c18959fsJ = C18959fsJ.OLrzqt;
                java.util.List<CompactTagData> newTagList = searchTokenModel2.getNewTagList();
                searchResultMapperKt$mapToSearchUiModel$12.L$0 = str2;
                searchResultMapperKt$mapToSearchUiModel$12.L$1 = c18913frQ2;
                searchResultMapperKt$mapToSearchUiModel$12.L$2 = list2;
                searchResultMapperKt$mapToSearchUiModel$12.L$3 = it;
                searchResultMapperKt$mapToSearchUiModel$12.L$4 = searchTokenModel2;
                searchResultMapperKt$mapToSearchUiModel$12.label = 1;
                java.lang.Object objCopydefault2 = c18959fsJ.copydefault(newTagList, c18913frQ2, searchResultMapperKt$mapToSearchUiModel$12);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str2;
                obj = objCopydefault2;
                java.util.Iterator it4 = it;
                searchResultMapperKt$mapToSearchUiModel$13 = searchResultMapperKt$mapToSearchUiModel$12;
                searchTokenModel = searchTokenModel2;
                list4 = list2;
                it3 = it4;
                java.util.List list52 = (java.util.List) obj;
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
                java.lang.String tokenName22 = searchTokenModel.getTokenName();
                if (tokenName22 != null) {
                }
                tokenName = "--";
                java.lang.String change24H22 = searchTokenModel.getChange24H();
                if (change24H22 != null) {
                }
                change24H = "--";
                java.lang.String price22 = searchTokenModel.getPrice();
                if (price22 != null) {
                }
                price = "--";
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
                list4.add(new C18982fsg(new C18988fsm(jLongValue2, str4, str5, str6, tokenName, change24H, price, chainLogoUrl2, liquidity2, turnOver24H2, zOLrzqt2, list52, marketCap2, (holderCount2 != null || holderCount2.length() == 0) ? "--" : searchTokenModel.getHolderCount(), zBooleanValue2, searchTokenModel.getRiskLevel()), str3));
                searchResultMapperKt$mapToSearchUiModel$12 = searchResultMapperKt$mapToSearchUiModel$13;
                it = it3;
                list2 = list4;
                str2 = str3;
                if (it.hasNext()) {
                    return list2;
                }
            }
        }
    }

    public static /* synthetic */ java.lang.Object mapToSearchUiModel$default(java.util.List list, java.lang.String str, C18913frQ c18913frQ, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return KWHzl(list, str, c18913frQ, continuation);
    }

    public static /* synthetic */ java.util.List mapToDAppSearchUiModel$default(java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return OLrzqt(list, str);
    }

    public static final java.util.List<C18977fsb> OLrzqt(java.util.List<SearchDAppModel> list, @NotNull java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.List<SearchDAppChainInfo> chains;
        java.util.List<java.lang.String> tagsNameList;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list != null) {
            for (SearchDAppModel searchDAppModel : list) {
                SearchDAppInfo dappInfo = searchDAppModel.getDappInfo();
                java.util.ArrayList arrayList3 = null;
                long jCopydefault = C11600cUg.copydefault(dappInfo != null ? dappInfo.getId() : null);
                SearchDAppInfo dappInfo2 = searchDAppModel.getDappInfo();
                java.lang.String logo = dappInfo2 != null ? dappInfo2.getLogo() : null;
                java.lang.String str2 = logo == null ? "" : logo;
                SearchDAppInfo dappInfo3 = searchDAppModel.getDappInfo();
                java.lang.String name = dappInfo3 != null ? dappInfo3.getName() : null;
                java.lang.String str3 = name == null ? "" : name;
                SearchDAppInfo dappInfo4 = searchDAppModel.getDappInfo();
                java.lang.String url = dappInfo4 != null ? dappInfo4.getUrl() : null;
                java.lang.String str4 = url == null ? "" : url;
                SearchDAppInfo dappInfo5 = searchDAppModel.getDappInfo();
                if (dappInfo5 == null || (tagsNameList = dappInfo5.getTagsNameList()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : tagsNameList) {
                        if (((java.lang.String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                }
                java.util.List listAhwBna = arrayList == null ? yDY.AhwBna() : arrayList;
                SearchDAppInfo dappInfo6 = searchDAppModel.getDappInfo();
                if (dappInfo6 != null && (chains = dappInfo6.getChains()) != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : chains) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SearchDAppChainInfo) obj2).getColorLogo())) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                    java.util.Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        java.lang.String colorLogo = ((SearchDAppChainInfo) it.next()).getColorLogo();
                        if (colorLogo == null) {
                            colorLogo = "";
                        }
                        arrayList3.add(colorLogo);
                    }
                }
                arrayList2.add(new C18977fsb(new C18984fsi(jCopydefault, str2, str3, str4, listAhwBna, arrayList3 == null ? yDY.AhwBna() : arrayList3), str));
            }
        }
        return arrayList2;
    }
}
