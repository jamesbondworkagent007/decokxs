package com.okinc.business.market.features.meme.data.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MemeFilterParam {
    private final String botsMax;
    private final String botsMin;
    private final String bundHoldRtoMax;
    private final String bundHoldRtoMin;
    private final String chainId;
    private final String createTimeMax;
    private final String createTimeMin;
    private final String creatorMigrCntMax;
    private final String creatorMigrCntMin;
    private final String devHoldRtoMax;
    private final String devHoldRtoMin;
    private final Boolean devSellAll;
    private final Boolean devStillHolding;
    private final Boolean discord;
    private final Boolean dsPaid;
    private final Boolean dsTokenCommunityTakeOver;
    private final Boolean facebook;
    private final String feeMax;
    private final String feeMin;
    private final String freshHoldRtoMax;
    private final String freshHoldRtoMin;
    private final String holdMax;
    private final String holdMin;
    private final Boolean insta;
    private final String keywordsExclude;
    private final String keywordsInclude;
    private final String mcapMax;
    private final String mcapMin;
    private final Boolean media;
    private final String progMax;
    private final String progMin;
    private final List<String> protocolIdList;
    private final Boolean quickMigration;
    private final String rankType;
    private final String sniperHoldRtoMax;
    private final String sniperHoldRtoMin;
    private final String suspHoldRtoMax;
    private final String suspHoldRtoMin;
    private final String suspPhishHoldRtoMax;
    private final String suspPhishHoldRtoMin;
    private final Boolean tg;
    private final Boolean tokenPumpLive;
    private final String top10HoldRtoMax;
    private final String top10HoldRtoMin;
    private final Boolean tt;
    private final Boolean twitch;
    private final String txs1hMax;
    private final String txs1hMin;
    private final String txsb1hMax;
    private final String txsb1hMin;
    private final String txss1hMax;
    private final String txss1hMin;
    private final String volMax;
    private final String volMin;
    private final String walletAddress;
    private final Boolean web;
    private final Boolean x;
    private final Boolean youtb;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @SerialName("botsMax")
    public static /* synthetic */ void getBotsMax$annotations() {
    }

    @SerialName("botsMin")
    public static /* synthetic */ void getBotsMin$annotations() {
    }

    @SerialName("bundHoldRtoMax")
    public static /* synthetic */ void getBundHoldRtoMax$annotations() {
    }

    @SerialName("bundHoldRtoMin")
    public static /* synthetic */ void getBundHoldRtoMin$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("createTimeMax")
    public static /* synthetic */ void getCreateTimeMax$annotations() {
    }

    @SerialName("createTimeMin")
    public static /* synthetic */ void getCreateTimeMin$annotations() {
    }

    @SerialName("creatorMigrCntMax")
    public static /* synthetic */ void getCreatorMigrCntMax$annotations() {
    }

    @SerialName("creatorMigrCntMin")
    public static /* synthetic */ void getCreatorMigrCntMin$annotations() {
    }

    @SerialName("devHoldRtoMax")
    public static /* synthetic */ void getDevHoldRtoMax$annotations() {
    }

    @SerialName("devHoldRtoMin")
    public static /* synthetic */ void getDevHoldRtoMin$annotations() {
    }

    @SerialName("devSellAll")
    public static /* synthetic */ void getDevSellAll$annotations() {
    }

    @SerialName("devStillHolding")
    public static /* synthetic */ void getDevStillHolding$annotations() {
    }

    @SerialName("discord")
    public static /* synthetic */ void getDiscord$annotations() {
    }

    @SerialName("dsPaid")
    public static /* synthetic */ void getDsPaid$annotations() {
    }

    @SerialName("dsTokenCommunityTakeOver")
    public static /* synthetic */ void getDsTokenCommunityTakeOver$annotations() {
    }

    @SerialName("facebook")
    public static /* synthetic */ void getFacebook$annotations() {
    }

    @SerialName("feeMax")
    public static /* synthetic */ void getFeeMax$annotations() {
    }

    @SerialName("feeMin")
    public static /* synthetic */ void getFeeMin$annotations() {
    }

    @SerialName("freshHoldRtoMax")
    public static /* synthetic */ void getFreshHoldRtoMax$annotations() {
    }

    @SerialName("freshHoldRtoMin")
    public static /* synthetic */ void getFreshHoldRtoMin$annotations() {
    }

    @SerialName("holdMax")
    public static /* synthetic */ void getHoldMax$annotations() {
    }

    @SerialName("holdMin")
    public static /* synthetic */ void getHoldMin$annotations() {
    }

    @SerialName("insta")
    public static /* synthetic */ void getInsta$annotations() {
    }

    @SerialName("keywordsExclude")
    public static /* synthetic */ void getKeywordsExclude$annotations() {
    }

    @SerialName("keywordsInclude")
    public static /* synthetic */ void getKeywordsInclude$annotations() {
    }

    @SerialName("mcapMax")
    public static /* synthetic */ void getMcapMax$annotations() {
    }

    @SerialName("mcapMin")
    public static /* synthetic */ void getMcapMin$annotations() {
    }

    @SerialName("media")
    public static /* synthetic */ void getMedia$annotations() {
    }

    @SerialName("progMax")
    public static /* synthetic */ void getProgMax$annotations() {
    }

    @SerialName("progMin")
    public static /* synthetic */ void getProgMin$annotations() {
    }

    @SerialName("protocolIdList")
    public static /* synthetic */ void getProtocolIdList$annotations() {
    }

    @SerialName("quickMigration")
    public static /* synthetic */ void getQuickMigration$annotations() {
    }

    @SerialName("rankType")
    public static /* synthetic */ void getRankType$annotations() {
    }

    @SerialName("sniperHoldRtoMax")
    public static /* synthetic */ void getSniperHoldRtoMax$annotations() {
    }

    @SerialName("sniperHoldRtoMin")
    public static /* synthetic */ void getSniperHoldRtoMin$annotations() {
    }

    @SerialName("suspHoldRtoMax")
    public static /* synthetic */ void getSuspHoldRtoMax$annotations() {
    }

    @SerialName("suspHoldRtoMin")
    public static /* synthetic */ void getSuspHoldRtoMin$annotations() {
    }

    @SerialName("suspPhishHoldRtoMax")
    public static /* synthetic */ void getSuspPhishHoldRtoMax$annotations() {
    }

    @SerialName("suspPhishHoldRtoMin")
    public static /* synthetic */ void getSuspPhishHoldRtoMin$annotations() {
    }

    @SerialName("tg")
    public static /* synthetic */ void getTg$annotations() {
    }

    @SerialName("tokenPumpLive")
    public static /* synthetic */ void getTokenPumpLive$annotations() {
    }

    @SerialName("top10HoldRtoMax")
    public static /* synthetic */ void getTop10HoldRtoMax$annotations() {
    }

    @SerialName("top10HoldRtoMin")
    public static /* synthetic */ void getTop10HoldRtoMin$annotations() {
    }

    @SerialName(TtmlNode.TAG_TT)
    public static /* synthetic */ void getTt$annotations() {
    }

    @SerialName("twitch")
    public static /* synthetic */ void getTwitch$annotations() {
    }

    @SerialName("txs1hMax")
    public static /* synthetic */ void getTxs1hMax$annotations() {
    }

    @SerialName("txs1hMin")
    public static /* synthetic */ void getTxs1hMin$annotations() {
    }

    @SerialName("txsb1hMax")
    public static /* synthetic */ void getTxsb1hMax$annotations() {
    }

    @SerialName("txsb1hMin")
    public static /* synthetic */ void getTxsb1hMin$annotations() {
    }

    @SerialName("txss1hMax")
    public static /* synthetic */ void getTxss1hMax$annotations() {
    }

    @SerialName("txss1hMin")
    public static /* synthetic */ void getTxss1hMin$annotations() {
    }

    @SerialName("volMax")
    public static /* synthetic */ void getVolMax$annotations() {
    }

    @SerialName("volMin")
    public static /* synthetic */ void getVolMin$annotations() {
    }

    @SerialName("walletAddress")
    public static /* synthetic */ void getWalletAddress$annotations() {
    }

    @SerialName("web")
    public static /* synthetic */ void getWeb$annotations() {
    }

    @SerialName("x")
    public static /* synthetic */ void getX$annotations() {
    }

    @SerialName("youtb")
    public static /* synthetic */ void getYoutb$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.protocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.devHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.suspHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.suspHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.bundHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.bundHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.sniperHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.sniperHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.botsMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.botsMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.feeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.feeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.creatorMigrCntMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.creatorMigrCntMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.freshHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.freshHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.suspPhishHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.suspPhishHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.tokenPumpLive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.progMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.progMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.devSellAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.mcapMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.mcapMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.volMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.volMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.holdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.holdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.createTimeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.createTimeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.txs1hMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.txs1hMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.devStillHolding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.txsb1hMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.txsb1hMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.txss1hMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.txss1hMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component44() {
        return this.media;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component45() {
        return this.youtb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component46() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component47() {
        return this.insta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component48() {
        return this.tg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component49() {
        return this.tt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.keywordsInclude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component50() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component51() {
        return this.twitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component52() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component53() {
        return this.dsPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component54() {
        return this.web;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component55() {
        return this.dsTokenCommunityTakeOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component56() {
        return this.quickMigration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.keywordsExclude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.top10HoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.top10HoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.devHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilterParam copy(List<String> list, String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool3, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, @NotNull String str40, @NotNull String str41) {
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        return new MemeFilterParam(list, str, bool, bool2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, bool3, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, str40, str41);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeFilterParam)) {
            return false;
        }
        MemeFilterParam memeFilterParam = (MemeFilterParam) obj;
        return Intrinsics.EZpvd(this.protocolIdList, memeFilterParam.protocolIdList) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) memeFilterParam.walletAddress) && Intrinsics.EZpvd(this.devSellAll, memeFilterParam.devSellAll) && Intrinsics.EZpvd(this.devStillHolding, memeFilterParam.devStillHolding) && Intrinsics.EZpvd((Object) this.keywordsInclude, (Object) memeFilterParam.keywordsInclude) && Intrinsics.EZpvd((Object) this.keywordsExclude, (Object) memeFilterParam.keywordsExclude) && Intrinsics.EZpvd((Object) this.top10HoldRtoMin, (Object) memeFilterParam.top10HoldRtoMin) && Intrinsics.EZpvd((Object) this.top10HoldRtoMax, (Object) memeFilterParam.top10HoldRtoMax) && Intrinsics.EZpvd((Object) this.devHoldRtoMin, (Object) memeFilterParam.devHoldRtoMin) && Intrinsics.EZpvd((Object) this.devHoldRtoMax, (Object) memeFilterParam.devHoldRtoMax) && Intrinsics.EZpvd((Object) this.suspHoldRtoMin, (Object) memeFilterParam.suspHoldRtoMin) && Intrinsics.EZpvd((Object) this.suspHoldRtoMax, (Object) memeFilterParam.suspHoldRtoMax) && Intrinsics.EZpvd((Object) this.bundHoldRtoMin, (Object) memeFilterParam.bundHoldRtoMin) && Intrinsics.EZpvd((Object) this.bundHoldRtoMax, (Object) memeFilterParam.bundHoldRtoMax) && Intrinsics.EZpvd((Object) this.sniperHoldRtoMin, (Object) memeFilterParam.sniperHoldRtoMin) && Intrinsics.EZpvd((Object) this.sniperHoldRtoMax, (Object) memeFilterParam.sniperHoldRtoMax) && Intrinsics.EZpvd((Object) this.botsMin, (Object) memeFilterParam.botsMin) && Intrinsics.EZpvd((Object) this.botsMax, (Object) memeFilterParam.botsMax) && Intrinsics.EZpvd((Object) this.feeMin, (Object) memeFilterParam.feeMin) && Intrinsics.EZpvd((Object) this.feeMax, (Object) memeFilterParam.feeMax) && Intrinsics.EZpvd((Object) this.creatorMigrCntMin, (Object) memeFilterParam.creatorMigrCntMin) && Intrinsics.EZpvd((Object) this.creatorMigrCntMax, (Object) memeFilterParam.creatorMigrCntMax) && Intrinsics.EZpvd((Object) this.freshHoldRtoMin, (Object) memeFilterParam.freshHoldRtoMin) && Intrinsics.EZpvd((Object) this.freshHoldRtoMax, (Object) memeFilterParam.freshHoldRtoMax) && Intrinsics.EZpvd((Object) this.suspPhishHoldRtoMin, (Object) memeFilterParam.suspPhishHoldRtoMin) && Intrinsics.EZpvd((Object) this.suspPhishHoldRtoMax, (Object) memeFilterParam.suspPhishHoldRtoMax) && Intrinsics.EZpvd(this.tokenPumpLive, memeFilterParam.tokenPumpLive) && Intrinsics.EZpvd((Object) this.progMin, (Object) memeFilterParam.progMin) && Intrinsics.EZpvd((Object) this.progMax, (Object) memeFilterParam.progMax) && Intrinsics.EZpvd((Object) this.mcapMin, (Object) memeFilterParam.mcapMin) && Intrinsics.EZpvd((Object) this.mcapMax, (Object) memeFilterParam.mcapMax) && Intrinsics.EZpvd((Object) this.volMin, (Object) memeFilterParam.volMin) && Intrinsics.EZpvd((Object) this.volMax, (Object) memeFilterParam.volMax) && Intrinsics.EZpvd((Object) this.holdMin, (Object) memeFilterParam.holdMin) && Intrinsics.EZpvd((Object) this.holdMax, (Object) memeFilterParam.holdMax) && Intrinsics.EZpvd((Object) this.createTimeMin, (Object) memeFilterParam.createTimeMin) && Intrinsics.EZpvd((Object) this.createTimeMax, (Object) memeFilterParam.createTimeMax) && Intrinsics.EZpvd((Object) this.txs1hMin, (Object) memeFilterParam.txs1hMin) && Intrinsics.EZpvd((Object) this.txs1hMax, (Object) memeFilterParam.txs1hMax) && Intrinsics.EZpvd((Object) this.txsb1hMin, (Object) memeFilterParam.txsb1hMin) && Intrinsics.EZpvd((Object) this.txsb1hMax, (Object) memeFilterParam.txsb1hMax) && Intrinsics.EZpvd((Object) this.txss1hMin, (Object) memeFilterParam.txss1hMin) && Intrinsics.EZpvd((Object) this.txss1hMax, (Object) memeFilterParam.txss1hMax) && Intrinsics.EZpvd(this.media, memeFilterParam.media) && Intrinsics.EZpvd(this.youtb, memeFilterParam.youtb) && Intrinsics.EZpvd(this.x, memeFilterParam.x) && Intrinsics.EZpvd(this.insta, memeFilterParam.insta) && Intrinsics.EZpvd(this.tg, memeFilterParam.tg) && Intrinsics.EZpvd(this.tt, memeFilterParam.tt) && Intrinsics.EZpvd(this.facebook, memeFilterParam.facebook) && Intrinsics.EZpvd(this.twitch, memeFilterParam.twitch) && Intrinsics.EZpvd(this.discord, memeFilterParam.discord) && Intrinsics.EZpvd(this.dsPaid, memeFilterParam.dsPaid) && Intrinsics.EZpvd(this.web, memeFilterParam.web) && Intrinsics.EZpvd(this.dsTokenCommunityTakeOver, memeFilterParam.dsTokenCommunityTakeOver) && Intrinsics.EZpvd(this.quickMigration, memeFilterParam.quickMigration) && Intrinsics.EZpvd((Object) this.chainId, (Object) memeFilterParam.chainId) && Intrinsics.EZpvd((Object) this.rankType, (Object) memeFilterParam.rankType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotsMax() {
        return this.botsMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotsMin() {
        return this.botsMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundHoldRtoMax() {
        return this.bundHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundHoldRtoMin() {
        return this.bundHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTimeMax() {
        return this.createTimeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTimeMin() {
        return this.createTimeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatorMigrCntMax() {
        return this.creatorMigrCntMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatorMigrCntMin() {
        return this.creatorMigrCntMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldRtoMax() {
        return this.devHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldRtoMin() {
        return this.devHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDevSellAll() {
        return this.devSellAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDevStillHolding() {
        return this.devStillHolding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDiscord() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDsPaid() {
        return this.dsPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDsTokenCommunityTakeOver() {
        return this.dsTokenCommunityTakeOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFacebook() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeMax() {
        return this.feeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeMin() {
        return this.feeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreshHoldRtoMax() {
        return this.freshHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreshHoldRtoMin() {
        return this.freshHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldMax() {
        return this.holdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldMin() {
        return this.holdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInsta() {
        return this.insta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeywordsExclude() {
        return this.keywordsExclude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeywordsInclude() {
        return this.keywordsInclude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMcapMax() {
        return this.mcapMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMcapMin() {
        return this.mcapMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMedia() {
        return this.media;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgMax() {
        return this.progMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgMin() {
        return this.progMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getProtocolIdList() {
        return this.protocolIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getQuickMigration() {
        return this.quickMigration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRankType() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperHoldRtoMax() {
        return this.sniperHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperHoldRtoMin() {
        return this.sniperHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspHoldRtoMax() {
        return this.suspHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspHoldRtoMin() {
        return this.suspHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspPhishHoldRtoMax() {
        return this.suspPhishHoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspPhishHoldRtoMin() {
        return this.suspPhishHoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTg() {
        return this.tg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTokenPumpLive() {
        return this.tokenPumpLive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldRtoMax() {
        return this.top10HoldRtoMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldRtoMin() {
        return this.top10HoldRtoMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTt() {
        return this.tt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTwitch() {
        return this.twitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxs1hMax() {
        return this.txs1hMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxs1hMin() {
        return this.txs1hMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxsb1hMax() {
        return this.txsb1hMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxsb1hMin() {
        return this.txsb1hMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxss1hMax() {
        return this.txss1hMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxss1hMin() {
        return this.txss1hMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMax() {
        return this.volMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMin() {
        return this.volMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWeb() {
        return this.web;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getX() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getYoutb() {
        return this.youtb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.protocolIdList;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.walletAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.devSellAll;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.devStillHolding;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.keywordsInclude;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.keywordsExclude;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.top10HoldRtoMin;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.top10HoldRtoMax;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.devHoldRtoMin;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.devHoldRtoMax;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.suspHoldRtoMin;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.suspHoldRtoMax;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.bundHoldRtoMin;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.bundHoldRtoMax;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.sniperHoldRtoMin;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.sniperHoldRtoMax;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.botsMin;
        int iHashCode17 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.botsMax;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.feeMin;
        int iHashCode19 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.feeMax;
        int iHashCode20 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.creatorMigrCntMin;
        int iHashCode21 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.creatorMigrCntMax;
        int iHashCode22 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.freshHoldRtoMin;
        int iHashCode23 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.freshHoldRtoMax;
        int iHashCode24 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.suspPhishHoldRtoMin;
        int iHashCode25 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.suspPhishHoldRtoMax;
        int iHashCode26 = str23 == null ? 0 : str23.hashCode();
        Boolean bool3 = this.tokenPumpLive;
        int iHashCode27 = bool3 == null ? 0 : bool3.hashCode();
        String str24 = this.progMin;
        int iHashCode28 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.progMax;
        int iHashCode29 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.mcapMin;
        int iHashCode30 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.mcapMax;
        int iHashCode31 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.volMin;
        int iHashCode32 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.volMax;
        int iHashCode33 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.holdMin;
        int iHashCode34 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.holdMax;
        int iHashCode35 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.createTimeMin;
        int iHashCode36 = str32 == null ? 0 : str32.hashCode();
        String str33 = this.createTimeMax;
        int iHashCode37 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.txs1hMin;
        int iHashCode38 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.txs1hMax;
        int iHashCode39 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.txsb1hMin;
        int iHashCode40 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.txsb1hMax;
        int iHashCode41 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.txss1hMin;
        int iHashCode42 = str38 == null ? 0 : str38.hashCode();
        String str39 = this.txss1hMax;
        int iHashCode43 = str39 == null ? 0 : str39.hashCode();
        Boolean bool4 = this.media;
        int iHashCode44 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.youtb;
        int iHashCode45 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.x;
        int iHashCode46 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.insta;
        int iHashCode47 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.tg;
        int iHashCode48 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.tt;
        int iHashCode49 = bool9 == null ? 0 : bool9.hashCode();
        Boolean bool10 = this.facebook;
        int iHashCode50 = bool10 == null ? 0 : bool10.hashCode();
        Boolean bool11 = this.twitch;
        int iHashCode51 = bool11 == null ? 0 : bool11.hashCode();
        Boolean bool12 = this.discord;
        int iHashCode52 = bool12 == null ? 0 : bool12.hashCode();
        Boolean bool13 = this.dsPaid;
        int iHashCode53 = bool13 == null ? 0 : bool13.hashCode();
        Boolean bool14 = this.web;
        int iHashCode54 = bool14 == null ? 0 : bool14.hashCode();
        Boolean bool15 = this.dsTokenCommunityTakeOver;
        int iHashCode55 = bool15 == null ? 0 : bool15.hashCode();
        Boolean bool16 = this.quickMigration;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + (bool16 == null ? 0 : bool16.hashCode())) * 31) + this.chainId.hashCode()) * 31) + this.rankType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeFilterParam(protocolIdList=" + this.protocolIdList + ", walletAddress=" + this.walletAddress + ", devSellAll=" + this.devSellAll + ", devStillHolding=" + this.devStillHolding + ", keywordsInclude=" + this.keywordsInclude + ", keywordsExclude=" + this.keywordsExclude + ", top10HoldRtoMin=" + this.top10HoldRtoMin + ", top10HoldRtoMax=" + this.top10HoldRtoMax + ", devHoldRtoMin=" + this.devHoldRtoMin + ", devHoldRtoMax=" + this.devHoldRtoMax + ", suspHoldRtoMin=" + this.suspHoldRtoMin + ", suspHoldRtoMax=" + this.suspHoldRtoMax + ", bundHoldRtoMin=" + this.bundHoldRtoMin + ", bundHoldRtoMax=" + this.bundHoldRtoMax + ", sniperHoldRtoMin=" + this.sniperHoldRtoMin + ", sniperHoldRtoMax=" + this.sniperHoldRtoMax + ", botsMin=" + this.botsMin + ", botsMax=" + this.botsMax + ", feeMin=" + this.feeMin + ", feeMax=" + this.feeMax + ", creatorMigrCntMin=" + this.creatorMigrCntMin + ", creatorMigrCntMax=" + this.creatorMigrCntMax + ", freshHoldRtoMin=" + this.freshHoldRtoMin + ", freshHoldRtoMax=" + this.freshHoldRtoMax + ", suspPhishHoldRtoMin=" + this.suspPhishHoldRtoMin + ", suspPhishHoldRtoMax=" + this.suspPhishHoldRtoMax + ", tokenPumpLive=" + this.tokenPumpLive + ", progMin=" + this.progMin + ", progMax=" + this.progMax + ", mcapMin=" + this.mcapMin + ", mcapMax=" + this.mcapMax + ", volMin=" + this.volMin + ", volMax=" + this.volMax + ", holdMin=" + this.holdMin + ", holdMax=" + this.holdMax + ", createTimeMin=" + this.createTimeMin + ", createTimeMax=" + this.createTimeMax + ", txs1hMin=" + this.txs1hMin + ", txs1hMax=" + this.txs1hMax + ", txsb1hMin=" + this.txsb1hMin + ", txsb1hMax=" + this.txsb1hMax + ", txss1hMin=" + this.txss1hMin + ", txss1hMax=" + this.txss1hMax + ", media=" + this.media + ", youtb=" + this.youtb + ", x=" + this.x + ", insta=" + this.insta + ", tg=" + this.tg + ", tt=" + this.tt + ", facebook=" + this.facebook + ", twitch=" + this.twitch + ", discord=" + this.discord + ", dsPaid=" + this.dsPaid + ", web=" + this.web + ", dsTokenCommunityTakeOver=" + this.dsTokenCommunityTakeOver + ", quickMigration=" + this.quickMigration + ", chainId=" + this.chainId + ", rankType=" + this.rankType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.MemeFilterParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeFilterParam> serializer() {
            return MemeFilterParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeFilterParam(int i, int i2, List list, String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool3, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, String str40, String str41, SerializationConstructorMarker serializationConstructorMarker) {
        if (50331648 != (i2 & 50331648)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{0, 50331648}, MemeFilterParam$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.protocolIdList = null;
        } else {
            this.protocolIdList = list;
        }
        if ((i & 2) == 0) {
            this.walletAddress = null;
        } else {
            this.walletAddress = str;
        }
        if ((i & 4) == 0) {
            this.devSellAll = null;
        } else {
            this.devSellAll = bool;
        }
        if ((i & 8) == 0) {
            this.devStillHolding = null;
        } else {
            this.devStillHolding = bool2;
        }
        if ((i & 16) == 0) {
            this.keywordsInclude = null;
        } else {
            this.keywordsInclude = str2;
        }
        if ((i & 32) == 0) {
            this.keywordsExclude = null;
        } else {
            this.keywordsExclude = str3;
        }
        if ((i & 64) == 0) {
            this.top10HoldRtoMin = null;
        } else {
            this.top10HoldRtoMin = str4;
        }
        if ((i & 128) == 0) {
            this.top10HoldRtoMax = null;
        } else {
            this.top10HoldRtoMax = str5;
        }
        if ((i & 256) == 0) {
            this.devHoldRtoMin = null;
        } else {
            this.devHoldRtoMin = str6;
        }
        if ((i & 512) == 0) {
            this.devHoldRtoMax = null;
        } else {
            this.devHoldRtoMax = str7;
        }
        if ((i & 1024) == 0) {
            this.suspHoldRtoMin = null;
        } else {
            this.suspHoldRtoMin = str8;
        }
        if ((i & 2048) == 0) {
            this.suspHoldRtoMax = null;
        } else {
            this.suspHoldRtoMax = str9;
        }
        if ((i & 4096) == 0) {
            this.bundHoldRtoMin = null;
        } else {
            this.bundHoldRtoMin = str10;
        }
        if ((i & 8192) == 0) {
            this.bundHoldRtoMax = null;
        } else {
            this.bundHoldRtoMax = str11;
        }
        if ((i & 16384) == 0) {
            this.sniperHoldRtoMin = null;
        } else {
            this.sniperHoldRtoMin = str12;
        }
        if ((i & 32768) == 0) {
            this.sniperHoldRtoMax = null;
        } else {
            this.sniperHoldRtoMax = str13;
        }
        if ((i & 65536) == 0) {
            this.botsMin = null;
        } else {
            this.botsMin = str14;
        }
        if ((i & 131072) == 0) {
            this.botsMax = null;
        } else {
            this.botsMax = str15;
        }
        if ((i & 262144) == 0) {
            this.feeMin = null;
        } else {
            this.feeMin = str16;
        }
        if ((524288 & i) == 0) {
            this.feeMax = null;
        } else {
            this.feeMax = str17;
        }
        if ((1048576 & i) == 0) {
            this.creatorMigrCntMin = null;
        } else {
            this.creatorMigrCntMin = str18;
        }
        if ((2097152 & i) == 0) {
            this.creatorMigrCntMax = null;
        } else {
            this.creatorMigrCntMax = str19;
        }
        if ((4194304 & i) == 0) {
            this.freshHoldRtoMin = null;
        } else {
            this.freshHoldRtoMin = str20;
        }
        if ((8388608 & i) == 0) {
            this.freshHoldRtoMax = null;
        } else {
            this.freshHoldRtoMax = str21;
        }
        if ((16777216 & i) == 0) {
            this.suspPhishHoldRtoMin = null;
        } else {
            this.suspPhishHoldRtoMin = str22;
        }
        if ((33554432 & i) == 0) {
            this.suspPhishHoldRtoMax = null;
        } else {
            this.suspPhishHoldRtoMax = str23;
        }
        if ((67108864 & i) == 0) {
            this.tokenPumpLive = null;
        } else {
            this.tokenPumpLive = bool3;
        }
        if ((134217728 & i) == 0) {
            this.progMin = null;
        } else {
            this.progMin = str24;
        }
        if ((268435456 & i) == 0) {
            this.progMax = null;
        } else {
            this.progMax = str25;
        }
        if ((536870912 & i) == 0) {
            this.mcapMin = null;
        } else {
            this.mcapMin = str26;
        }
        if ((1073741824 & i) == 0) {
            this.mcapMax = null;
        } else {
            this.mcapMax = str27;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.volMin = null;
        } else {
            this.volMin = str28;
        }
        if ((i2 & 1) == 0) {
            this.volMax = null;
        } else {
            this.volMax = str29;
        }
        if ((i2 & 2) == 0) {
            this.holdMin = null;
        } else {
            this.holdMin = str30;
        }
        if ((i2 & 4) == 0) {
            this.holdMax = null;
        } else {
            this.holdMax = str31;
        }
        if ((i2 & 8) == 0) {
            this.createTimeMin = null;
        } else {
            this.createTimeMin = str32;
        }
        if ((i2 & 16) == 0) {
            this.createTimeMax = null;
        } else {
            this.createTimeMax = str33;
        }
        if ((i2 & 32) == 0) {
            this.txs1hMin = null;
        } else {
            this.txs1hMin = str34;
        }
        if ((i2 & 64) == 0) {
            this.txs1hMax = null;
        } else {
            this.txs1hMax = str35;
        }
        if ((i2 & 128) == 0) {
            this.txsb1hMin = null;
        } else {
            this.txsb1hMin = str36;
        }
        if ((i2 & 256) == 0) {
            this.txsb1hMax = null;
        } else {
            this.txsb1hMax = str37;
        }
        if ((i2 & 512) == 0) {
            this.txss1hMin = null;
        } else {
            this.txss1hMin = str38;
        }
        if ((i2 & 1024) == 0) {
            this.txss1hMax = null;
        } else {
            this.txss1hMax = str39;
        }
        if ((i2 & 2048) == 0) {
            this.media = null;
        } else {
            this.media = bool4;
        }
        if ((i2 & 4096) == 0) {
            this.youtb = null;
        } else {
            this.youtb = bool5;
        }
        if ((i2 & 8192) == 0) {
            this.x = null;
        } else {
            this.x = bool6;
        }
        if ((i2 & 16384) == 0) {
            this.insta = null;
        } else {
            this.insta = bool7;
        }
        if ((i2 & 32768) == 0) {
            this.tg = null;
        } else {
            this.tg = bool8;
        }
        if ((i2 & 65536) == 0) {
            this.tt = null;
        } else {
            this.tt = bool9;
        }
        if ((i2 & 131072) == 0) {
            this.facebook = null;
        } else {
            this.facebook = bool10;
        }
        if ((i2 & 262144) == 0) {
            this.twitch = null;
        } else {
            this.twitch = bool11;
        }
        if ((524288 & i2) == 0) {
            this.discord = null;
        } else {
            this.discord = bool12;
        }
        if ((1048576 & i2) == 0) {
            this.dsPaid = null;
        } else {
            this.dsPaid = bool13;
        }
        if ((2097152 & i2) == 0) {
            this.web = null;
        } else {
            this.web = bool14;
        }
        if ((4194304 & i2) == 0) {
            this.dsTokenCommunityTakeOver = null;
        } else {
            this.dsTokenCommunityTakeOver = bool15;
        }
        if ((8388608 & i2) == 0) {
            this.quickMigration = null;
        } else {
            this.quickMigration = bool16;
        }
        this.chainId = str40;
        this.rankType = str41;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeFilterParam memeFilterParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || memeFilterParam.protocolIdList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], memeFilterParam.protocolIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || memeFilterParam.walletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, memeFilterParam.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || memeFilterParam.devSellAll != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, memeFilterParam.devSellAll);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || memeFilterParam.devStillHolding != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, memeFilterParam.devStillHolding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || memeFilterParam.keywordsInclude != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, memeFilterParam.keywordsInclude);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || memeFilterParam.keywordsExclude != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, memeFilterParam.keywordsExclude);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || memeFilterParam.top10HoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, memeFilterParam.top10HoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || memeFilterParam.top10HoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, memeFilterParam.top10HoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || memeFilterParam.devHoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, memeFilterParam.devHoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || memeFilterParam.devHoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, memeFilterParam.devHoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || memeFilterParam.suspHoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, memeFilterParam.suspHoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || memeFilterParam.suspHoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, memeFilterParam.suspHoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || memeFilterParam.bundHoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, memeFilterParam.bundHoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || memeFilterParam.bundHoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, memeFilterParam.bundHoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || memeFilterParam.sniperHoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, memeFilterParam.sniperHoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || memeFilterParam.sniperHoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, memeFilterParam.sniperHoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || memeFilterParam.botsMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, memeFilterParam.botsMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || memeFilterParam.botsMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, memeFilterParam.botsMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || memeFilterParam.feeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, memeFilterParam.feeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || memeFilterParam.feeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, memeFilterParam.feeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || memeFilterParam.creatorMigrCntMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, memeFilterParam.creatorMigrCntMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || memeFilterParam.creatorMigrCntMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, memeFilterParam.creatorMigrCntMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || memeFilterParam.freshHoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, memeFilterParam.freshHoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || memeFilterParam.freshHoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, memeFilterParam.freshHoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || memeFilterParam.suspPhishHoldRtoMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, memeFilterParam.suspPhishHoldRtoMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || memeFilterParam.suspPhishHoldRtoMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, memeFilterParam.suspPhishHoldRtoMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || memeFilterParam.tokenPumpLive != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, memeFilterParam.tokenPumpLive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || memeFilterParam.progMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, memeFilterParam.progMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || memeFilterParam.progMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, memeFilterParam.progMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || memeFilterParam.mcapMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, memeFilterParam.mcapMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || memeFilterParam.mcapMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, memeFilterParam.mcapMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || memeFilterParam.volMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, memeFilterParam.volMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || memeFilterParam.volMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, memeFilterParam.volMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || memeFilterParam.holdMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, memeFilterParam.holdMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || memeFilterParam.holdMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, memeFilterParam.holdMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || memeFilterParam.createTimeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, memeFilterParam.createTimeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || memeFilterParam.createTimeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, memeFilterParam.createTimeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || memeFilterParam.txs1hMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, memeFilterParam.txs1hMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || memeFilterParam.txs1hMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, memeFilterParam.txs1hMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || memeFilterParam.txsb1hMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, memeFilterParam.txsb1hMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || memeFilterParam.txsb1hMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, memeFilterParam.txsb1hMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || memeFilterParam.txss1hMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, memeFilterParam.txss1hMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || memeFilterParam.txss1hMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, memeFilterParam.txss1hMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || memeFilterParam.media != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, BooleanSerializer.INSTANCE, memeFilterParam.media);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || memeFilterParam.youtb != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, BooleanSerializer.INSTANCE, memeFilterParam.youtb);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || memeFilterParam.x != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, BooleanSerializer.INSTANCE, memeFilterParam.x);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || memeFilterParam.insta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, BooleanSerializer.INSTANCE, memeFilterParam.insta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || memeFilterParam.tg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, BooleanSerializer.INSTANCE, memeFilterParam.tg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || memeFilterParam.tt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 48, BooleanSerializer.INSTANCE, memeFilterParam.tt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || memeFilterParam.facebook != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 49, BooleanSerializer.INSTANCE, memeFilterParam.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || memeFilterParam.twitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, BooleanSerializer.INSTANCE, memeFilterParam.twitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || memeFilterParam.discord != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, BooleanSerializer.INSTANCE, memeFilterParam.discord);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || memeFilterParam.dsPaid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, BooleanSerializer.INSTANCE, memeFilterParam.dsPaid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || memeFilterParam.web != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, BooleanSerializer.INSTANCE, memeFilterParam.web);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || memeFilterParam.dsTokenCommunityTakeOver != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, BooleanSerializer.INSTANCE, memeFilterParam.dsTokenCommunityTakeOver);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || memeFilterParam.quickMigration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, BooleanSerializer.INSTANCE, memeFilterParam.quickMigration);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 56, memeFilterParam.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 57, memeFilterParam.rankType);
    }

    public MemeFilterParam(List<String> list, String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool3, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, @NotNull String str40, @NotNull String str41) {
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        this.protocolIdList = list;
        this.walletAddress = str;
        this.devSellAll = bool;
        this.devStillHolding = bool2;
        this.keywordsInclude = str2;
        this.keywordsExclude = str3;
        this.top10HoldRtoMin = str4;
        this.top10HoldRtoMax = str5;
        this.devHoldRtoMin = str6;
        this.devHoldRtoMax = str7;
        this.suspHoldRtoMin = str8;
        this.suspHoldRtoMax = str9;
        this.bundHoldRtoMin = str10;
        this.bundHoldRtoMax = str11;
        this.sniperHoldRtoMin = str12;
        this.sniperHoldRtoMax = str13;
        this.botsMin = str14;
        this.botsMax = str15;
        this.feeMin = str16;
        this.feeMax = str17;
        this.creatorMigrCntMin = str18;
        this.creatorMigrCntMax = str19;
        this.freshHoldRtoMin = str20;
        this.freshHoldRtoMax = str21;
        this.suspPhishHoldRtoMin = str22;
        this.suspPhishHoldRtoMax = str23;
        this.tokenPumpLive = bool3;
        this.progMin = str24;
        this.progMax = str25;
        this.mcapMin = str26;
        this.mcapMax = str27;
        this.volMin = str28;
        this.volMax = str29;
        this.holdMin = str30;
        this.holdMax = str31;
        this.createTimeMin = str32;
        this.createTimeMax = str33;
        this.txs1hMin = str34;
        this.txs1hMax = str35;
        this.txsb1hMin = str36;
        this.txsb1hMax = str37;
        this.txss1hMin = str38;
        this.txss1hMax = str39;
        this.media = bool4;
        this.youtb = bool5;
        this.x = bool6;
        this.insta = bool7;
        this.tg = bool8;
        this.tt = bool9;
        this.facebook = bool10;
        this.twitch = bool11;
        this.discord = bool12;
        this.dsPaid = bool13;
        this.web = bool14;
        this.dsTokenCommunityTakeOver = bool15;
        this.quickMigration = bool16;
        this.chainId = str40;
        this.rankType = str41;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0267: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0004: ARITH (r122v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r64v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r122v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r122v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r66v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r122v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r67v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r122v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r122v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r122v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r122v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r122v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r122v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r122v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r122v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r122v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r122v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r122v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r122v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r122v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r122v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r122v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r122v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r122v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r122v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r122v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r122v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r122v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r122v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r122v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r90v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0107: ARITH (r122v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0112: ARITH (r122v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r122v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0128: ARITH (r122v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0133: ARITH (r122v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013b: ARITH (r123v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0144: ARITH (r123v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014d: ARITH (r123v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0156: ARITH (r123v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015f: ARITH (r123v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0168: ARITH (r123v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0171: ARITH (r123v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r102v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017a: ARITH (r123v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r103v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0182: ARITH (r123v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r104v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x018b: ARITH (r123v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r105v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0194: ARITH (r123v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r106v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x019d: ARITH (r123v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r107v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01a6: ARITH (r123v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r108v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01af: ARITH (r123v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r109v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01b8: ARITH (r123v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r110v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01c1: ARITH (32768 int) & (r123v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r111v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01ca: ARITH (65536 int) & (r123v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r112v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01d2: ARITH (r123v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r113v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01db: ARITH (r123v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r114v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01e4: ARITH (r123v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r115v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01ed: ARITH (r123v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r116v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x01f8: ARITH (2097152 int) & (r123v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r117v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0202: ARITH (4194304 int) & (r123v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r118v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x020c: ARITH (r123v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r119v0 java.lang.Boolean))
  (r120v0 java.lang.String)
  (r121v0 java.lang.String)
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.data.model.MemeFilterParam.<init>(java.util.List, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeFilterParam(List list, String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Boolean bool3, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, String str40, String str41, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : str16, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : str18, (i & 2097152) != 0 ? null : str19, (i & 4194304) != 0 ? null : str20, (i & 8388608) != 0 ? null : str21, (i & 16777216) != 0 ? null : str22, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str23, (i & 67108864) != 0 ? null : bool3, (i & 134217728) != 0 ? null : str24, (i & 268435456) != 0 ? null : str25, (i & 536870912) != 0 ? null : str26, (i & 1073741824) != 0 ? null : str27, (i & Integer.MIN_VALUE) != 0 ? null : str28, (i2 & 1) != 0 ? null : str29, (i2 & 2) != 0 ? null : str30, (i2 & 4) != 0 ? null : str31, (i2 & 8) != 0 ? null : str32, (i2 & 16) != 0 ? null : str33, (i2 & 32) != 0 ? null : str34, (i2 & 64) != 0 ? null : str35, (i2 & 128) != 0 ? null : str36, (i2 & 256) != 0 ? null : str37, (i2 & 512) != 0 ? null : str38, (i2 & 1024) != 0 ? null : str39, (i2 & 2048) != 0 ? null : bool4, (i2 & 4096) != 0 ? null : bool5, (i2 & 8192) != 0 ? null : bool6, (i2 & 16384) != 0 ? null : bool7, (32768 & i2) != 0 ? null : bool8, (65536 & i2) != 0 ? null : bool9, (i2 & 131072) != 0 ? null : bool10, (i2 & 262144) != 0 ? null : bool11, (i2 & 524288) != 0 ? null : bool12, (i2 & 1048576) != 0 ? null : bool13, (2097152 & i2) != 0 ? null : bool14, (4194304 & i2) != 0 ? null : bool15, (i2 & 8388608) != 0 ? null : bool16, str40, str41);
    }

    public final Map<String, String> toQueryMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chainId", this.chainId);
        linkedHashMap.put("rankType", this.rankType);
        List<String> list = this.protocolIdList;
        if (list != null && (!list.isEmpty())) {
            linkedHashMap.put("protocolIdList", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        String str = this.walletAddress;
        if (str != null) {
            linkedHashMap.put("walletAddress", str);
        }
        Boolean bool = this.devSellAll;
        if (bool != null) {
            linkedHashMap.put("devSellAll", String.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.devStillHolding;
        if (bool2 != null) {
            linkedHashMap.put("devStillHolding", String.valueOf(bool2.booleanValue()));
        }
        String str2 = this.keywordsInclude;
        if (str2 != null) {
            linkedHashMap.put("keywordsInclude", str2);
        }
        String str3 = this.keywordsExclude;
        if (str3 != null) {
            linkedHashMap.put("keywordsExclude", str3);
        }
        String str4 = this.top10HoldRtoMin;
        if (str4 != null) {
            linkedHashMap.put("top10HoldRtoMin", str4);
        }
        String str5 = this.top10HoldRtoMax;
        if (str5 != null) {
            linkedHashMap.put("top10HoldRtoMax", str5);
        }
        String str6 = this.devHoldRtoMin;
        if (str6 != null) {
            linkedHashMap.put("devHoldRtoMin", str6);
        }
        String str7 = this.devHoldRtoMax;
        if (str7 != null) {
            linkedHashMap.put("devHoldRtoMax", str7);
        }
        String str8 = this.suspHoldRtoMin;
        if (str8 != null) {
            linkedHashMap.put("suspHoldRtoMin", str8);
        }
        String str9 = this.suspHoldRtoMax;
        if (str9 != null) {
            linkedHashMap.put("suspHoldRtoMax", str9);
        }
        String str10 = this.bundHoldRtoMin;
        if (str10 != null) {
            linkedHashMap.put("bundHoldRtoMin", str10);
        }
        String str11 = this.bundHoldRtoMax;
        if (str11 != null) {
            linkedHashMap.put("bundHoldRtoMax", str11);
        }
        String str12 = this.sniperHoldRtoMin;
        if (str12 != null) {
            linkedHashMap.put("sniperHoldRtoMin", str12);
        }
        String str13 = this.sniperHoldRtoMax;
        if (str13 != null) {
            linkedHashMap.put("sniperHoldRtoMax", str13);
        }
        String str14 = this.botsMin;
        if (str14 != null) {
            linkedHashMap.put("botsMin", str14);
        }
        String str15 = this.botsMax;
        if (str15 != null) {
            linkedHashMap.put("botsMax", str15);
        }
        String str16 = this.feeMin;
        if (str16 != null) {
            linkedHashMap.put("feeMin", str16);
        }
        String str17 = this.feeMax;
        if (str17 != null) {
            linkedHashMap.put("feeMax", str17);
        }
        String str18 = this.creatorMigrCntMin;
        if (str18 != null) {
            linkedHashMap.put("creatorMigrCntMin", str18);
        }
        String str19 = this.creatorMigrCntMax;
        if (str19 != null) {
            linkedHashMap.put("creatorMigrCntMax", str19);
        }
        String str20 = this.freshHoldRtoMin;
        if (str20 != null) {
            linkedHashMap.put("freshHoldRtoMin", str20);
        }
        String str21 = this.freshHoldRtoMax;
        if (str21 != null) {
            linkedHashMap.put("freshHoldRtoMax", str21);
        }
        String str22 = this.suspPhishHoldRtoMin;
        if (str22 != null) {
            linkedHashMap.put("suspPhishHoldRtoMin", str22);
        }
        String str23 = this.suspPhishHoldRtoMax;
        if (str23 != null) {
            linkedHashMap.put("suspPhishHoldRtoMax", str23);
        }
        Boolean bool3 = this.tokenPumpLive;
        if (bool3 != null) {
            linkedHashMap.put("tokenPumpLive", String.valueOf(bool3.booleanValue()));
        }
        String str24 = this.progMin;
        if (str24 != null) {
            linkedHashMap.put("progMin", str24);
        }
        String str25 = this.progMax;
        if (str25 != null) {
            linkedHashMap.put("progMax", str25);
        }
        String str26 = this.mcapMin;
        if (str26 != null) {
            linkedHashMap.put("mcapMin", str26);
        }
        String str27 = this.mcapMax;
        if (str27 != null) {
            linkedHashMap.put("mcapMax", str27);
        }
        String str28 = this.volMin;
        if (str28 != null) {
            linkedHashMap.put("volMin", str28);
        }
        String str29 = this.volMax;
        if (str29 != null) {
            linkedHashMap.put("volMax", str29);
        }
        String str30 = this.holdMin;
        if (str30 != null) {
            linkedHashMap.put("holdMin", str30);
        }
        String str31 = this.holdMax;
        if (str31 != null) {
            linkedHashMap.put("holdMax", str31);
        }
        String str32 = this.createTimeMin;
        if (str32 != null) {
            linkedHashMap.put("createTimeMin", str32);
        }
        String str33 = this.createTimeMax;
        if (str33 != null) {
            linkedHashMap.put("createTimeMax", str33);
        }
        String str34 = this.txs1hMin;
        if (str34 != null) {
            linkedHashMap.put("txs1hMin", str34);
        }
        String str35 = this.txs1hMax;
        if (str35 != null) {
            linkedHashMap.put("txs1hMax", str35);
        }
        String str36 = this.txsb1hMin;
        if (str36 != null) {
            linkedHashMap.put("txsb1hMin", str36);
        }
        String str37 = this.txsb1hMax;
        if (str37 != null) {
            linkedHashMap.put("txsb1hMax", str37);
        }
        String str38 = this.txss1hMin;
        if (str38 != null) {
            linkedHashMap.put("txss1hMin", str38);
        }
        String str39 = this.txss1hMax;
        if (str39 != null) {
            linkedHashMap.put("txss1hMax", str39);
        }
        Boolean bool4 = this.media;
        if (bool4 != null) {
            linkedHashMap.put("media", String.valueOf(bool4.booleanValue()));
        }
        Boolean bool5 = this.youtb;
        if (bool5 != null) {
            linkedHashMap.put("youtb", String.valueOf(bool5.booleanValue()));
        }
        Boolean bool6 = this.x;
        if (bool6 != null) {
            linkedHashMap.put("x", String.valueOf(bool6.booleanValue()));
        }
        Boolean bool7 = this.insta;
        if (bool7 != null) {
            linkedHashMap.put("insta", String.valueOf(bool7.booleanValue()));
        }
        Boolean bool8 = this.tg;
        if (bool8 != null) {
            linkedHashMap.put("tg", String.valueOf(bool8.booleanValue()));
        }
        Boolean bool9 = this.tt;
        if (bool9 != null) {
            linkedHashMap.put(TtmlNode.TAG_TT, String.valueOf(bool9.booleanValue()));
        }
        Boolean bool10 = this.facebook;
        if (bool10 != null) {
            linkedHashMap.put("facebook", String.valueOf(bool10.booleanValue()));
        }
        Boolean bool11 = this.twitch;
        if (bool11 != null) {
            linkedHashMap.put("twitch", String.valueOf(bool11.booleanValue()));
        }
        Boolean bool12 = this.discord;
        if (bool12 != null) {
            linkedHashMap.put("discord", String.valueOf(bool12.booleanValue()));
        }
        Boolean bool13 = this.dsPaid;
        if (bool13 != null) {
            linkedHashMap.put("dsPaid", String.valueOf(bool13.booleanValue()));
        }
        Boolean bool14 = this.web;
        if (bool14 != null) {
            linkedHashMap.put("web", String.valueOf(bool14.booleanValue()));
        }
        Boolean bool15 = this.dsTokenCommunityTakeOver;
        if (bool15 != null) {
            linkedHashMap.put("dsTokenCommunityTakeOver", String.valueOf(bool15.booleanValue()));
        }
        Boolean bool16 = this.quickMigration;
        if (bool16 != null) {
            linkedHashMap.put("quickMigration", String.valueOf(bool16.booleanValue()));
        }
        return linkedHashMap;
    }
}
