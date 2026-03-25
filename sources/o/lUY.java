package o;

import androidx.camera.video.AudioStats;
import com.okinc.buysell.view.cryptolist.ConvertListItem;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.crcore.shared.net.responsebean.DexTokenBean;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lUY {
    public static /* synthetic */ java.util.List toBuyCryptoListItemsLegacy$default(java.util.List list, java.lang.String str, double d, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        return EZpvd(list, str, d, map);
    }

    public static /* synthetic */ java.util.List toConvertToListItems$default(java.util.List list, java.lang.String str, double d, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            map = C56424yEw.KWHzl();
        }
        return OLrzqt(list, str, d, str3, map);
    }

    public static final java.util.List<CryptoListItem> OLrzqt(@NotNull java.util.List<CurrencyToken> list, @NotNull java.lang.String str, double d, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, FairPriceTickerData> map) {
        java.lang.Object next;
        java.lang.String price;
        java.lang.String second;
        ConvertListItem.ConvertToCryptoListItem.PercentageChange percentageChange;
        FairPriceTickerData fairPriceTickerData;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (CurrencyToken currencyToken : list) {
            if (!Intrinsics.EZpvd((java.lang.Object) currencyToken.getCurrencyId(), (java.lang.Object) str2)) {
                if (currencyToken.getFiatFlag()) {
                    arrayList2.add(new ConvertListItem.TaskDescription(currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken, currencyToken.getIcon()));
                } else {
                    java.util.Iterator<T> it = map.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd(((Map.Entry) next).getKey(), (java.lang.Object) currencyToken.getCurrency())) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (!Intrinsics.EZpvd((java.lang.Object) currencyToken.getPrice(), (java.lang.Object) "--")) {
                        if (entry == null || ((FairPriceTickerData) entry.getValue()).getFairPricePair().length() == 0 || (((FairPriceTickerData) entry.getValue()).getFairPricePair().length() > 0 && ((FairPriceTickerData) entry.getValue()).isConverterNeeded())) {
                            price = C31661lzi.getCryptoListPriceFormat$default(C33129mqd.divS$default(currencyToken.getPrice(), java.lang.Double.valueOf(d), null, null, null, 14, null), str, false, 0, null, 14, null);
                        } else {
                            price = C31661lzi.getCryptoListPriceFormat$default(currencyToken.getPrice(), str, false, 0, null, 14, null);
                        }
                    } else {
                        price = currencyToken.getPrice();
                    }
                    java.lang.String str3 = price;
                    boolean zIsStableCoin = (entry == null || (fairPriceTickerData = (FairPriceTickerData) entry.getValue()) == null) ? false : fairPriceTickerData.isStableCoin();
                    if (Intrinsics.EZpvd((java.lang.Object) currencyToken.getPercentage().getSecond(), (java.lang.Object) C46871tfO.EZpvd().getSecond())) {
                        second = C46871tfO.EZpvd().getSecond();
                    } else {
                        second = currencyToken.getPercentage().getSecond();
                    }
                    java.lang.String str4 = second;
                    java.lang.String currency = currencyToken.getCurrency();
                    java.lang.String currencyName = currencyToken.getCurrencyName();
                    java.lang.String currency2 = currencyToken.getCurrency();
                    java.lang.String currencyName2 = currencyToken.getCurrencyName();
                    java.lang.String icon = currencyToken.getIcon();
                    if (currencyToken.getPercentage().getFirst().doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                        percentageChange = ConvertListItem.ConvertToCryptoListItem.PercentageChange.UP;
                    } else {
                        percentageChange = currencyToken.getPercentage().getFirst().doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE ? ConvertListItem.ConvertToCryptoListItem.PercentageChange.DOWN : ConvertListItem.ConvertToCryptoListItem.PercentageChange.NO_CHANGE;
                    }
                    arrayList.add(new ConvertListItem.ConvertToCryptoListItem(currency, currencyName, currency2, currencyName2, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, currencyToken, icon, str3, str4, percentageChange, zIsStableCoin, 48, null));
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (!arrayList2.isEmpty()) {
            arrayList3.add(new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.getNewProxyInstance), 12, null));
            arrayList3.addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            arrayList3.add(new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.getFieldNames), 12, null));
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public static /* synthetic */ java.util.List toConvertFromListItems$default(java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return AEQbTJ(list, str, str2);
    }

    public static final java.util.List<CryptoListItem> AEQbTJ(@NotNull java.util.List<CurrencyToken> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (CurrencyToken currencyToken : list) {
            if (!Intrinsics.EZpvd((java.lang.Object) currencyToken.getCurrencyId(), (java.lang.Object) str2)) {
                if (currencyToken.getFiatFlag()) {
                    arrayList2.add(new ConvertListItem.ActionBar(currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken, currencyToken.getIcon(), C31661lzi.getCryptoListPriceFormat$default(currencyToken.getAvailableBalance(), currencyToken.getSymbol(), true, currencyToken.getScale(), null, 8, null), "", C33129mqd.AEQbTJ(currencyToken.getValuation()), C33129mqd.AEQbTJ(currencyToken.getAvailableBalance())));
                } else {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getValuation()) && C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getAvailableBalance())) {
                        pairOLrzqt = C56390yDp.OLrzqt(C31661lzi.getCryptoListPriceFormat$default(currencyToken.getValuation(), str, true, 0, null, 12, null), C31661lzi.appendCryptoSymbol$default(currencyToken.getAvailableBalance(), currencyToken.getCurrency(), 0, null, null, null, 30, null));
                    } else {
                        pairOLrzqt = C56390yDp.OLrzqt("", "");
                    }
                    arrayList.add(new ConvertListItem.Application(currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken, currencyToken.getIcon(), (java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2(), C33129mqd.AEQbTJ(currencyToken.getValuation()), C33129mqd.AEQbTJ(currencyToken.getAvailableBalance())));
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (!arrayList2.isEmpty()) {
            arrayList3.add(new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.getNewProxyInstance), 12, null));
            arrayList3.addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            arrayList3.add(new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.getFieldNames), 12, null));
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public static final java.util.List<CryptoListItem> KWHzl(@NotNull java.util.List<DexTokenBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DexTokenBean dexTokenBean : list) {
            arrayList.add(new CryptoListItem.BuyDexListItem(dexTokenBean.getUniqueId(), dexTokenBean.getTokenSymbol(), dexTokenBean.getTokenSymbol(), dexTokenBean.getTokenName(), new CurrencyToken((java.lang.String) null, false, (java.util.List) null, dexTokenBean.getTokenSymbol(), (java.lang.String) null, dexTokenBean.getTokenName(), (java.lang.String) null, false, dexTokenBean.getTokenLogo(), dexTokenBean.getTokenLogo(), 0, (java.util.List) null, 0, dexTokenBean.getTokenSymbol(), (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EarnOption) null, (java.util.List) null, (java.lang.String) null, (kotlin.Pair) null, false, false, new DexInfo(dexTokenBean.getUniqueId(), dexTokenBean.getChainId(), dexTokenBean.getChainName(), dexTokenBean.getChainLogo(), dexTokenBean.getTokenContractAddress(), dexTokenBean.getPrice(), dexTokenBean.getLiquidity(), dexTokenBean.getMarketCap(), dexTokenBean.getRiskLevel(), 0, 0, "", "", dexTokenBean.getCommunityRecognized(), dexTokenBean.getCexListing(), dexTokenBean.getCexListingName()), 33545431, (DefaultConstructorMarker) null), "--", "--", CryptoListItem.BuyDexListItem.PercentageChange.NO_CHANGE));
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x017d */
    public static final java.util.List<CryptoListItem> KWHzl(@NotNull java.util.List<CurrencyToken> list, @NotNull java.util.Set<? extends CryptoListItem> set) {
        java.lang.Object next;
        java.lang.String price;
        java.lang.String second;
        CryptoListItem.BuyCryptoListItem.PercentageChange percentageChangeCopydefault;
        java.lang.Object buyCryptoListItem;
        java.lang.Object next2;
        java.lang.String strEZpvd;
        CryptoListItem.BuyDexListItem.PercentageChange percentageChangeOLrzqt;
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CurrencyToken currencyToken : list) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
                java.util.Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((CryptoListItem) next2).getCryptoId(), (java.lang.Object) currencyToken.getDexInfo().getUniqueId())) {
                        break;
                    }
                }
                CryptoListItem cryptoListItem = (CryptoListItem) next2;
                java.lang.String uniqueId = currencyToken.getDexInfo().getUniqueId();
                java.lang.String symbol = currencyToken.getSymbol();
                java.lang.String symbol2 = currencyToken.getSymbol();
                java.lang.String currencyName = currencyToken.getCurrencyName();
                boolean z = cryptoListItem instanceof CryptoListItem.BuyDexListItem;
                CryptoListItem.BuyDexListItem buyDexListItem = z ? (CryptoListItem.BuyDexListItem) cryptoListItem : null;
                java.lang.String str = "--";
                if (buyDexListItem == null || (strEZpvd = buyDexListItem.EZpvd()) == null) {
                    strEZpvd = "--";
                }
                CryptoListItem.BuyDexListItem buyDexListItem2 = z ? (CryptoListItem.BuyDexListItem) cryptoListItem : null;
                if (buyDexListItem2 != null && (strKWHzl = buyDexListItem2.KWHzl()) != null) {
                    str = strKWHzl;
                }
                CryptoListItem.BuyDexListItem buyDexListItem3 = z ? (CryptoListItem.BuyDexListItem) cryptoListItem : null;
                if (buyDexListItem3 == null || (percentageChangeOLrzqt = buyDexListItem3.OLrzqt()) == null) {
                    percentageChangeOLrzqt = CryptoListItem.BuyDexListItem.PercentageChange.NO_CHANGE;
                }
                buyCryptoListItem = new CryptoListItem.BuyDexListItem(uniqueId, symbol, symbol2, currencyName, currencyToken, strEZpvd, str, percentageChangeOLrzqt);
            } else {
                java.util.Iterator<T> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((CryptoListItem) next).getCryptoId(), (java.lang.Object) currencyToken.getCurrency())) {
                        break;
                    }
                }
                CryptoListItem cryptoListItem2 = (CryptoListItem) next;
                java.lang.String currency = currencyToken.getCurrency();
                java.lang.String currencyName2 = currencyToken.getCurrencyName();
                java.lang.String currency2 = currencyToken.getCurrency();
                java.lang.String currencyName3 = currencyToken.getCurrencyName();
                java.lang.String icon = currencyToken.getIcon();
                boolean z2 = cryptoListItem2 instanceof CryptoListItem.BuyCryptoListItem;
                CryptoListItem.BuyCryptoListItem buyCryptoListItem2 = z2 ? (CryptoListItem.BuyCryptoListItem) cryptoListItem2 : null;
                if (buyCryptoListItem2 == null || (price = buyCryptoListItem2.gEmmrt()) == null) {
                    price = currencyToken.getPrice();
                }
                CryptoListItem.BuyCryptoListItem buyCryptoListItem3 = z2 ? (CryptoListItem.BuyCryptoListItem) cryptoListItem2 : null;
                if (buyCryptoListItem3 == null || (second = buyCryptoListItem3.OLrzqt()) == null) {
                    second = currencyToken.getPercentage().getSecond();
                }
                java.lang.String earnRate = currencyToken.getEarnRate();
                CryptoListItem.BuyCryptoListItem buyCryptoListItem4 = z2 ? (CryptoListItem.BuyCryptoListItem) cryptoListItem2 : null;
                if (buyCryptoListItem4 == null || (percentageChangeCopydefault = buyCryptoListItem4.copydefault()) == null) {
                    if (currencyToken.getPercentage().getFirst().doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                        percentageChangeCopydefault = CryptoListItem.BuyCryptoListItem.PercentageChange.UP;
                    } else {
                        percentageChangeCopydefault = currencyToken.getPercentage().getFirst().doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE ? CryptoListItem.BuyCryptoListItem.PercentageChange.DOWN : CryptoListItem.BuyCryptoListItem.PercentageChange.NO_CHANGE;
                    }
                }
                CryptoListItem.BuyCryptoListItem buyCryptoListItem5 = z2 ? (CryptoListItem.BuyCryptoListItem) cryptoListItem2 : null;
                buyCryptoListItem = new CryptoListItem.BuyCryptoListItem(currency, currencyName2, currency2, currencyName3, currencyToken, icon, price, second, percentageChangeCopydefault, earnRate, buyCryptoListItem5 != null ? buyCryptoListItem5.AhwBna() : false);
            }
            arrayList.add(buyCryptoListItem);
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    public static final java.util.List<CryptoListItem> EZpvd(@NotNull java.util.List<CurrencyToken> list, @NotNull java.lang.String str, double d, @NotNull java.util.Map<java.lang.String, FairPriceTickerData> map) {
        java.lang.Object next;
        java.lang.String price;
        java.lang.String second;
        CryptoListItem.BuyCryptoListItem.PercentageChange percentageChange;
        FairPriceTickerData fairPriceTickerData;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            boolean zIsStableCoin = false;
            if (!it.hasNext()) {
                break;
            }
            CurrencyToken currencyToken = (CurrencyToken) it.next();
            java.util.Iterator<T> it2 = map.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd(((Map.Entry) next).getKey(), (java.lang.Object) currencyToken.getCurrency())) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (!Intrinsics.EZpvd((java.lang.Object) currencyToken.getPrice(), (java.lang.Object) "--")) {
                if (entry == null || ((FairPriceTickerData) entry.getValue()).getFairPricePair().length() == 0 || (((FairPriceTickerData) entry.getValue()).getFairPricePair().length() > 0 && ((FairPriceTickerData) entry.getValue()).isConverterNeeded())) {
                    price = C31661lzi.getCryptoListPriceFormat$default(C33129mqd.mulS$default(currencyToken.getPrice(), java.lang.Double.valueOf(d), null, null, null, 14, null), str, false, 0, null, 14, null);
                } else {
                    price = C31661lzi.getCryptoListPriceFormat$default(currencyToken.getPrice(), str, false, 0, null, 14, null);
                }
            } else {
                price = currencyToken.getPrice();
            }
            java.lang.String str2 = price;
            if (Intrinsics.EZpvd((java.lang.Object) currencyToken.getPercentage().getSecond(), (java.lang.Object) C46871tfO.EZpvd().getSecond())) {
                second = C46871tfO.EZpvd().getSecond();
            } else {
                second = currencyToken.getPercentage().getSecond();
            }
            java.lang.String str3 = second;
            if (entry != null && (fairPriceTickerData = (FairPriceTickerData) entry.getValue()) != null) {
                zIsStableCoin = fairPriceTickerData.isStableCoin();
            }
            boolean z = zIsStableCoin;
            java.lang.String currency = currencyToken.getCurrency();
            java.lang.String currencyName = currencyToken.getCurrencyName();
            java.lang.String currency2 = currencyToken.getCurrency();
            java.lang.String currencyName2 = currencyToken.getCurrencyName();
            java.lang.String icon = currencyToken.getIcon();
            java.lang.String earnRate = currencyToken.getEarnRate();
            if (currencyToken.getPercentage().getFirst().doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE) {
                percentageChange = CryptoListItem.BuyCryptoListItem.PercentageChange.UP;
            } else {
                percentageChange = currencyToken.getPercentage().getFirst().doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE ? CryptoListItem.BuyCryptoListItem.PercentageChange.DOWN : CryptoListItem.BuyCryptoListItem.PercentageChange.NO_CHANGE;
            }
            arrayList.add(new CryptoListItem.BuyCryptoListItem(currency, currencyName, currency2, currencyName2, currencyToken, icon, str2, str3, percentageChange, earnRate, z));
        }
        java.util.List<CryptoListItem> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        if (!listFJNWhG.isEmpty()) {
            listFJNWhG.add(0, new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.gwTjWJ), 12, null));
        }
        return listFJNWhG;
    }

    public static final java.util.List<CryptoListItem> copydefault(@NotNull java.util.List<CurrencyToken> list, @NotNull java.lang.String str, boolean z) {
        kotlin.Pair pairOLrzqt;
        InterfaceC47217tlq actionBar;
        java.lang.String strPrependFiatSymbol$default;
        kotlin.Pair pairOLrzqt2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CurrencyToken currencyToken : list) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
                if (currencyToken.getDexInfo().getBalanceTag() != 0) {
                    currencyToken.getDexInfo().getBalanceTag();
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getBalance()) && C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getBalanceUsd())) {
                    pairOLrzqt2 = C56390yDp.OLrzqt(C31661lzi.prependFiatSymbol$default(currencyToken.getDexInfo().getBalanceUsd(), str, str, null, null, false, 28, null), C31661lzi.appendCryptoSymbol$default(currencyToken.getDexInfo().getBalance(), currencyToken.getCurrency(), 0, null, null, null, 30, null));
                } else {
                    pairOLrzqt2 = C56390yDp.OLrzqt("", "");
                }
                actionBar = new CryptoListItem.Application(currencyToken.getDexInfo().getUniqueId(), currencyToken.getCurrency(), currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken, (java.lang.String) pairOLrzqt2.component1(), (java.lang.String) pairOLrzqt2.component2());
            } else {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getValuation()) && C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getAvailableBalance())) {
                    if (z) {
                        strPrependFiatSymbol$default = C31661lzi.appendCryptoSymbol$default(currencyToken.getValuation(), str, 2, null, null, null, 28, null);
                    } else {
                        strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(currencyToken.getValuation(), str, str, null, null, false, 28, null);
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(strPrependFiatSymbol$default, C31661lzi.appendCryptoSymbol$default(currencyToken.getAvailableBalance(), currencyToken.getCurrency(), 0, null, null, null, 30, null));
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt("", "");
                }
                actionBar = new CryptoListItem.ActionBar(currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken, currencyToken.getIcon(), (java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2());
            }
            arrayList.add(actionBar);
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    public static final java.util.List<CryptoListItem> OLrzqt(@NotNull java.util.List<CurrencyToken> list, @NotNull java.lang.String str) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CurrencyToken currencyToken : list) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getValuation()) && C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getAvailableBalance())) {
                pairOLrzqt = C56390yDp.OLrzqt(lTX.getCryptoListPriceFormat$default(new lTX(), currencyToken.getValuation(), str, false, 0, null, 28, null), C31661lzi.appendCryptoSymbol$default(currencyToken.getAvailableBalance(), currencyToken.getCurrency(), 0, null, null, null, 30, null));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("", "");
            }
            arrayList.add(new CryptoListItem.ActionBar(currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken.getCurrency(), currencyToken.getCurrencyName(), currencyToken, currencyToken.getIcon(), (java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2()));
        }
        java.util.List<CryptoListItem> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        if (!listFJNWhG.isEmpty()) {
            listFJNWhG.add(0, new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.gwTjWJ), 12, null));
        }
        return listFJNWhG;
    }
}
