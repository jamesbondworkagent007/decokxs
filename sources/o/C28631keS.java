package o;

import com.okinc.business.market.features.meme.data.model.MemeFilterParam;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.social.SocialMediaType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28631keS {
    public static final C28631keS KWHzl = new C28631keS();

    private C28631keS() {
    }

    public static /* synthetic */ MemeFilterParam mapToMemeFilterParam$default(C28631keS c28631keS, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, MemeFilter memeFilter, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            memeFilter = null;
        }
        return c28631keS.OLrzqt(str, list, str2, str3, memeFilter);
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MemeFilterParam OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, MemeFilter memeFilter) {
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        java.lang.String str22;
        java.lang.String str23;
        java.lang.String str24;
        java.lang.String str25;
        java.lang.String str26;
        java.lang.String str27;
        java.lang.String str28;
        java.lang.String str29;
        java.lang.String str30;
        java.lang.String str31;
        java.lang.String str32;
        java.lang.String str33;
        java.lang.String str34;
        java.lang.String str35;
        java.lang.String str36;
        java.lang.String str37;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.List<java.lang.String> list2 = list.isEmpty() ^ true ? list : null;
        java.lang.String str38 = str2.length() > 0 ? str2 : null;
        if (memeFilter != null) {
            java.lang.String keyword = memeFilter.getKeyword();
            if (keyword.length() <= 0) {
                keyword = null;
            }
            str4 = keyword;
        } else {
            str4 = null;
        }
        if (memeFilter != null) {
            java.lang.String keywordExclude = memeFilter.getKeywordExclude();
            if (keywordExclude.length() <= 0) {
                keywordExclude = null;
            }
            str5 = keywordExclude;
        } else {
            str5 = null;
        }
        if (memeFilter != null) {
            java.lang.String top10HoldingMin = memeFilter.getTop10HoldingMin();
            if (top10HoldingMin.length() <= 0) {
                top10HoldingMin = null;
            }
            str6 = top10HoldingMin;
        } else {
            str6 = null;
        }
        if (memeFilter != null) {
            java.lang.String top10HoldingMax = memeFilter.getTop10HoldingMax();
            if (top10HoldingMax.length() <= 0) {
                top10HoldingMax = null;
            }
            str7 = top10HoldingMax;
        } else {
            str7 = null;
        }
        if (memeFilter != null) {
            java.lang.String devHoldingMin = memeFilter.getDevHoldingMin();
            if (devHoldingMin.length() <= 0) {
                devHoldingMin = null;
            }
            str8 = devHoldingMin;
        } else {
            str8 = null;
        }
        if (memeFilter != null) {
            java.lang.String devHoldingMax = memeFilter.getDevHoldingMax();
            if (devHoldingMax.length() <= 0) {
                devHoldingMax = null;
            }
            str9 = devHoldingMax;
        } else {
            str9 = null;
        }
        if (memeFilter != null) {
            java.lang.String insiderMin = memeFilter.getInsiderMin();
            if (insiderMin.length() <= 0) {
                insiderMin = null;
            }
            str10 = insiderMin;
        } else {
            str10 = null;
        }
        if (memeFilter != null) {
            java.lang.String insiderMax = memeFilter.getInsiderMax();
            if (insiderMax.length() <= 0) {
                insiderMax = null;
            }
            str11 = insiderMax;
        } else {
            str11 = null;
        }
        if (memeFilter != null) {
            java.lang.String sniperMin = memeFilter.getSniperMin();
            if (sniperMin.length() <= 0) {
                sniperMin = null;
            }
            str12 = sniperMin;
        } else {
            str12 = null;
        }
        if (memeFilter != null) {
            java.lang.String sniperMax = memeFilter.getSniperMax();
            if (sniperMax.length() <= 0) {
                sniperMax = null;
            }
            str13 = sniperMax;
        } else {
            str13 = null;
        }
        if (memeFilter != null) {
            java.lang.String bundleMin = memeFilter.getBundleMin();
            if (bundleMin.length() <= 0) {
                bundleMin = null;
            }
            str14 = bundleMin;
        } else {
            str14 = null;
        }
        if (memeFilter != null) {
            java.lang.String bundleMax = memeFilter.getBundleMax();
            if (bundleMax.length() <= 0) {
                bundleMax = null;
            }
            str15 = bundleMax;
        } else {
            str15 = null;
        }
        if (memeFilter != null) {
            java.lang.String freshHoldMin = memeFilter.getFreshHoldMin();
            if (freshHoldMin.length() <= 0) {
                freshHoldMin = null;
            }
            str16 = freshHoldMin;
        } else {
            str16 = null;
        }
        if (memeFilter != null) {
            java.lang.String freshHoldMax = memeFilter.getFreshHoldMax();
            if (freshHoldMax.length() <= 0) {
                freshHoldMax = null;
            }
            str17 = freshHoldMax;
        } else {
            str17 = null;
        }
        if (memeFilter != null) {
            java.lang.String phishHoldMin = memeFilter.getPhishHoldMin();
            if (phishHoldMin.length() <= 0) {
                phishHoldMin = null;
            }
            str18 = phishHoldMin;
        } else {
            str18 = null;
        }
        if (memeFilter != null) {
            java.lang.String phishHoldMax = memeFilter.getPhishHoldMax();
            if (phishHoldMax.length() <= 0) {
                phishHoldMax = null;
            }
            str19 = phishHoldMax;
        } else {
            str19 = null;
        }
        if (memeFilter != null) {
            java.lang.String bondingMin = memeFilter.getBondingMin();
            if (bondingMin.length() <= 0) {
                bondingMin = null;
            }
            str20 = bondingMin;
        } else {
            str20 = null;
        }
        if (memeFilter != null) {
            java.lang.String bondingMax = memeFilter.getBondingMax();
            if (bondingMax.length() <= 0) {
                bondingMax = null;
            }
            str21 = bondingMax;
        } else {
            str21 = null;
        }
        if (memeFilter != null) {
            java.lang.String migratedTokensMin = memeFilter.getMigratedTokensMin();
            if (migratedTokensMin.length() <= 0) {
                migratedTokensMin = null;
            }
            str22 = migratedTokensMin;
        } else {
            str22 = null;
        }
        if (memeFilter != null) {
            java.lang.String migratedTokensMax = memeFilter.getMigratedTokensMax();
            if (migratedTokensMax.length() <= 0) {
                migratedTokensMax = null;
            }
            str23 = migratedTokensMax;
        } else {
            str23 = null;
        }
        java.lang.Boolean boolOLrzqt = OLrzqt(memeFilter, SocialMediaType.PUMP_LIVE);
        if (memeFilter != null) {
            java.lang.String marketCapMin = memeFilter.getMarketCapMin();
            if (marketCapMin.length() <= 0) {
                marketCapMin = null;
            }
            str24 = marketCapMin;
        } else {
            str24 = null;
        }
        if (memeFilter != null) {
            java.lang.String marketCapMax = memeFilter.getMarketCapMax();
            if (marketCapMax.length() <= 0) {
                marketCapMax = null;
            }
            str25 = marketCapMax;
        } else {
            str25 = null;
        }
        if (memeFilter != null) {
            java.lang.String volumeMin = memeFilter.getVolumeMin();
            if (volumeMin.length() <= 0) {
                volumeMin = null;
            }
            str26 = volumeMin;
        } else {
            str26 = null;
        }
        if (memeFilter != null) {
            java.lang.String volumeMax = memeFilter.getVolumeMax();
            if (volumeMax.length() <= 0) {
                volumeMax = null;
            }
            str27 = volumeMax;
        } else {
            str27 = null;
        }
        if (memeFilter != null) {
            java.lang.String holdersMin = memeFilter.getHoldersMin();
            if (holdersMin.length() <= 0) {
                holdersMin = null;
            }
            str28 = holdersMin;
        } else {
            str28 = null;
        }
        if (memeFilter != null) {
            java.lang.String holdersMax = memeFilter.getHoldersMax();
            if (holdersMax.length() <= 0) {
                holdersMax = null;
            }
            str29 = holdersMax;
        } else {
            str29 = null;
        }
        if (memeFilter != null) {
            java.lang.String tokenAgeMin = memeFilter.getTokenAgeMin();
            if (tokenAgeMin.length() <= 0) {
                tokenAgeMin = null;
            }
            str30 = tokenAgeMin;
        } else {
            str30 = null;
        }
        if (memeFilter != null) {
            java.lang.String tokenAgeMax = memeFilter.getTokenAgeMax();
            if (tokenAgeMax.length() <= 0) {
                tokenAgeMax = null;
            }
            str31 = tokenAgeMax;
        } else {
            str31 = null;
        }
        if (memeFilter != null) {
            java.lang.String transactionsMin = memeFilter.getTransactionsMin();
            if (transactionsMin.length() <= 0) {
                transactionsMin = null;
            }
            str32 = transactionsMin;
        } else {
            str32 = null;
        }
        if (memeFilter != null) {
            java.lang.String transactionsMax = memeFilter.getTransactionsMax();
            if (transactionsMax.length() <= 0) {
                transactionsMax = null;
            }
            str33 = transactionsMax;
        } else {
            str33 = null;
        }
        if (memeFilter != null) {
            java.lang.String buyMin = memeFilter.getBuyMin();
            if (buyMin.length() <= 0) {
                buyMin = null;
            }
            str34 = buyMin;
        } else {
            str34 = null;
        }
        if (memeFilter != null) {
            java.lang.String buyMax = memeFilter.getBuyMax();
            if (buyMax.length() <= 0) {
                buyMax = null;
            }
            str35 = buyMax;
        } else {
            str35 = null;
        }
        if (memeFilter != null) {
            java.lang.String sellMin = memeFilter.getSellMin();
            if (sellMin.length() <= 0) {
                sellMin = null;
            }
            str36 = sellMin;
        } else {
            str36 = null;
        }
        if (memeFilter != null) {
            java.lang.String sellMax = memeFilter.getSellMax();
            str37 = sellMax.length() > 0 ? sellMax : null;
        }
        return new MemeFilterParam(list2, str38, (java.lang.Boolean) null, (java.lang.Boolean) null, str4, str5, str6, str7, str8, str9, str10, str11, str14, str15, str12, str13, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str22, str23, str16, str17, str18, str19, boolOLrzqt, str20, str21, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, OLrzqt(memeFilter, SocialMediaType.MEDIA), OLrzqt(memeFilter, SocialMediaType.YOUTUBE), OLrzqt(memeFilter, SocialMediaType.TWITTER_X), OLrzqt(memeFilter, SocialMediaType.INSTAGRAM), OLrzqt(memeFilter, SocialMediaType.TELEGRAM), OLrzqt(memeFilter, SocialMediaType.TIKTOK), OLrzqt(memeFilter, SocialMediaType.FACEBOOK), OLrzqt(memeFilter, SocialMediaType.TWITCH), OLrzqt(memeFilter, SocialMediaType.DISCORD), OLrzqt(memeFilter, SocialMediaType.DEX_SCREENER_PAID), OLrzqt(memeFilter, SocialMediaType.WEBSITE), OLrzqt(memeFilter, SocialMediaType.COMMUNITY_TAKEOVER), (java.lang.Boolean) null, str, str3, 983052, 8388608, (DefaultConstructorMarker) null);
    }

    public final java.lang.Boolean OLrzqt(MemeFilter memeFilter, SocialMediaType socialMediaType) {
        java.util.List<java.lang.String> selectedSocialData;
        if (memeFilter == null || (selectedSocialData = memeFilter.getSelectedSocialData()) == null || !selectedSocialData.contains(socialMediaType.getApiKey())) {
            return null;
        }
        return java.lang.Boolean.TRUE;
    }
}
