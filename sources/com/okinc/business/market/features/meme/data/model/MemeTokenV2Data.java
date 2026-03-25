package com.okinc.business.market.features.meme.data.model;

import androidx.core.app.FrameMetricsAggregator;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C28635keW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MemeTokenV2Data {
    private final String bigLogo;
    private final String bots;
    private final String bundHoldRto;
    private final String chainId;
    private final String collect;
    private final String createTime;
    private final String creator;
    private final String creatorMigrCnt;
    private final String devHoldRto;
    private final String extProtocolId;
    private final String fee;
    private final String freshHoldRto;
    private final String hold;
    private final String logo;
    private final String mcap;
    private final MediaV2Data media;
    private final String migrBegin;
    private final String migrEnd;
    private final String name;
    private final String progress;
    private final String projectLink;
    private final String protocolId;
    private final String sameCarFollowedCount;
    private final String sameCarNumber;
    private final String sniperBuy;
    private final String sniperCnt;
    private final String sniperHoldingRatio;
    private final String suspHoldRto;
    private final String suspPhishHoldRto;
    private final List<CompactTagData> tagData;
    private final String tokenContractAddress;
    private final String tokenSymbol;
    private final String top10HoldRto;
    private final String txs1h;
    private final String txsb1h;
    private final String txss1h;
    private final String vol1h;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeTokenV2Data() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MediaV2Data) null, (String) null, -1, 31, (DefaultConstructorMarker) null);
    }

    @SerialName("bigLogo")
    public static /* synthetic */ void getBigLogo$annotations() {
    }

    @SerialName("bots")
    public static /* synthetic */ void getBots$annotations() {
    }

    @SerialName("bundHoldRto")
    public static /* synthetic */ void getBundHoldRto$annotations() {
    }

    @SerialName("chain")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("collect")
    public static /* synthetic */ void getCollect$annotations() {
    }

    @SerialName("createTime")
    public static /* synthetic */ void getCreateTime$annotations() {
    }

    @SerialName("creator")
    public static /* synthetic */ void getCreator$annotations() {
    }

    @SerialName("creatorMigrCnt")
    public static /* synthetic */ void getCreatorMigrCnt$annotations() {
    }

    @SerialName("devHoldRto")
    public static /* synthetic */ void getDevHoldRto$annotations() {
    }

    @SerialName("extProtoId")
    public static /* synthetic */ void getExtProtocolId$annotations() {
    }

    @SerialName("fee")
    public static /* synthetic */ void getFee$annotations() {
    }

    @SerialName("freshHoldRto")
    public static /* synthetic */ void getFreshHoldRto$annotations() {
    }

    @SerialName("hold")
    public static /* synthetic */ void getHold$annotations() {
    }

    @SerialName("logo")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @SerialName("mcap")
    public static /* synthetic */ void getMcap$annotations() {
    }

    @SerialName("media")
    public static /* synthetic */ void getMedia$annotations() {
    }

    @SerialName("migrBegin")
    public static /* synthetic */ void getMigrBegin$annotations() {
    }

    @SerialName("migrEnd")
    public static /* synthetic */ void getMigrEnd$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("prog")
    public static /* synthetic */ void getProgress$annotations() {
    }

    @SerialName("projLink")
    public static /* synthetic */ void getProjectLink$annotations() {
    }

    @SerialName("protoId")
    public static /* synthetic */ void getProtocolId$annotations() {
    }

    @SerialName("flwCarCnt")
    public static /* synthetic */ void getSameCarFollowedCount$annotations() {
    }

    @SerialName("carCnt")
    public static /* synthetic */ void getSameCarNumber$annotations() {
    }

    @SerialName("sniperBuy")
    public static /* synthetic */ void getSniperBuy$annotations() {
    }

    @SerialName("sniperCnt")
    public static /* synthetic */ void getSniperCnt$annotations() {
    }

    @SerialName("sniperHoldRto")
    public static /* synthetic */ void getSniperHoldingRatio$annotations() {
    }

    @SerialName("suspHoldRto")
    public static /* synthetic */ void getSuspHoldRto$annotations() {
    }

    @SerialName("suspPhishHoldRto")
    public static /* synthetic */ void getSuspPhishHoldRto$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getTagData$annotations() {
    }

    @SerialName("ca")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("smbl")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("top10HoldRto")
    public static /* synthetic */ void getTop10HoldRto$annotations() {
    }

    @SerialName("txs1h")
    public static /* synthetic */ void getTxs1h$annotations() {
    }

    @SerialName("txsb1h")
    public static /* synthetic */ void getTxsb1h$annotations() {
    }

    @SerialName("txss1h")
    public static /* synthetic */ void getTxss1h$annotations() {
    }

    @SerialName("vol1h")
    public static /* synthetic */ void getVol1h$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.txsb1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.txss1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.vol1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.mcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.bots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.top10HoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.devHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.suspHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.sniperBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.sniperCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.sniperHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.bundHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.freshHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.suspPhishHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.creatorMigrCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component27() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.migrBegin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.migrEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.extProtocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.sameCarNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.sameCarFollowedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.projectLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaV2Data component36() {
        return this.media;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.collect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bigLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.creator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.txs1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTokenV2Data copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull List<CompactTagData> list, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull MediaV2Data mediaV2Data, @NotNull String str35) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(mediaV2Data, "");
        Intrinsics.checkNotNullParameter(str35, "");
        return new MemeTokenV2Data(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, list, str27, str28, str29, str30, str31, str32, str33, str34, mediaV2Data, str35);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeTokenV2Data)) {
            return false;
        }
        MemeTokenV2Data memeTokenV2Data = (MemeTokenV2Data) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) memeTokenV2Data.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) memeTokenV2Data.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) memeTokenV2Data.tokenSymbol) && Intrinsics.EZpvd((Object) this.name, (Object) memeTokenV2Data.name) && Intrinsics.EZpvd((Object) this.logo, (Object) memeTokenV2Data.logo) && Intrinsics.EZpvd((Object) this.bigLogo, (Object) memeTokenV2Data.bigLogo) && Intrinsics.EZpvd((Object) this.createTime, (Object) memeTokenV2Data.createTime) && Intrinsics.EZpvd((Object) this.creator, (Object) memeTokenV2Data.creator) && Intrinsics.EZpvd((Object) this.txs1h, (Object) memeTokenV2Data.txs1h) && Intrinsics.EZpvd((Object) this.txsb1h, (Object) memeTokenV2Data.txsb1h) && Intrinsics.EZpvd((Object) this.txss1h, (Object) memeTokenV2Data.txss1h) && Intrinsics.EZpvd((Object) this.vol1h, (Object) memeTokenV2Data.vol1h) && Intrinsics.EZpvd((Object) this.mcap, (Object) memeTokenV2Data.mcap) && Intrinsics.EZpvd((Object) this.fee, (Object) memeTokenV2Data.fee) && Intrinsics.EZpvd((Object) this.bots, (Object) memeTokenV2Data.bots) && Intrinsics.EZpvd((Object) this.hold, (Object) memeTokenV2Data.hold) && Intrinsics.EZpvd((Object) this.top10HoldRto, (Object) memeTokenV2Data.top10HoldRto) && Intrinsics.EZpvd((Object) this.devHoldRto, (Object) memeTokenV2Data.devHoldRto) && Intrinsics.EZpvd((Object) this.suspHoldRto, (Object) memeTokenV2Data.suspHoldRto) && Intrinsics.EZpvd((Object) this.sniperBuy, (Object) memeTokenV2Data.sniperBuy) && Intrinsics.EZpvd((Object) this.sniperCnt, (Object) memeTokenV2Data.sniperCnt) && Intrinsics.EZpvd((Object) this.sniperHoldingRatio, (Object) memeTokenV2Data.sniperHoldingRatio) && Intrinsics.EZpvd((Object) this.bundHoldRto, (Object) memeTokenV2Data.bundHoldRto) && Intrinsics.EZpvd((Object) this.freshHoldRto, (Object) memeTokenV2Data.freshHoldRto) && Intrinsics.EZpvd((Object) this.suspPhishHoldRto, (Object) memeTokenV2Data.suspPhishHoldRto) && Intrinsics.EZpvd((Object) this.creatorMigrCnt, (Object) memeTokenV2Data.creatorMigrCnt) && Intrinsics.EZpvd(this.tagData, memeTokenV2Data.tagData) && Intrinsics.EZpvd((Object) this.migrBegin, (Object) memeTokenV2Data.migrBegin) && Intrinsics.EZpvd((Object) this.migrEnd, (Object) memeTokenV2Data.migrEnd) && Intrinsics.EZpvd((Object) this.progress, (Object) memeTokenV2Data.progress) && Intrinsics.EZpvd((Object) this.protocolId, (Object) memeTokenV2Data.protocolId) && Intrinsics.EZpvd((Object) this.extProtocolId, (Object) memeTokenV2Data.extProtocolId) && Intrinsics.EZpvd((Object) this.sameCarNumber, (Object) memeTokenV2Data.sameCarNumber) && Intrinsics.EZpvd((Object) this.sameCarFollowedCount, (Object) memeTokenV2Data.sameCarFollowedCount) && Intrinsics.EZpvd((Object) this.projectLink, (Object) memeTokenV2Data.projectLink) && Intrinsics.EZpvd(this.media, memeTokenV2Data.media) && Intrinsics.EZpvd((Object) this.collect, (Object) memeTokenV2Data.collect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBigLogo() {
        return this.bigLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBots() {
        return this.bots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundHoldRto() {
        return this.bundHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollect() {
        return this.collect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreator() {
        return this.creator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatorMigrCnt() {
        return this.creatorMigrCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldRto() {
        return this.devHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtProtocolId() {
        return this.extProtocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreshHoldRto() {
        return this.freshHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHold() {
        return this.hold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMcap() {
        return this.mcap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaV2Data getMedia() {
        return this.media;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMigrBegin() {
        return this.migrBegin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMigrEnd() {
        return this.migrEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectLink() {
        return this.projectLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSameCarFollowedCount() {
        return this.sameCarFollowedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSameCarNumber() {
        return this.sameCarNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperBuy() {
        return this.sniperBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperCnt() {
        return this.sniperCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperHoldingRatio() {
        return this.sniperHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspHoldRto() {
        return this.suspHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspPhishHoldRto() {
        return this.suspPhishHoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getTagData() {
        return this.tagData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldRto() {
        return this.top10HoldRto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxs1h() {
        return this.txs1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxsb1h() {
        return this.txsb1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxss1h() {
        return this.txss1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVol1h() {
        return this.vol1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.bigLogo.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.creator.hashCode()) * 31) + this.txs1h.hashCode()) * 31) + this.txsb1h.hashCode()) * 31) + this.txss1h.hashCode()) * 31) + this.vol1h.hashCode()) * 31) + this.mcap.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.bots.hashCode()) * 31) + this.hold.hashCode()) * 31) + this.top10HoldRto.hashCode()) * 31) + this.devHoldRto.hashCode()) * 31) + this.suspHoldRto.hashCode()) * 31) + this.sniperBuy.hashCode()) * 31) + this.sniperCnt.hashCode()) * 31) + this.sniperHoldingRatio.hashCode()) * 31) + this.bundHoldRto.hashCode()) * 31) + this.freshHoldRto.hashCode()) * 31) + this.suspPhishHoldRto.hashCode()) * 31) + this.creatorMigrCnt.hashCode()) * 31) + this.tagData.hashCode()) * 31) + this.migrBegin.hashCode()) * 31) + this.migrEnd.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.protocolId.hashCode()) * 31) + this.extProtocolId.hashCode()) * 31) + this.sameCarNumber.hashCode()) * 31) + this.sameCarFollowedCount.hashCode()) * 31) + this.projectLink.hashCode()) * 31) + this.media.hashCode()) * 31) + this.collect.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeTokenV2Data(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", name=" + this.name + ", logo=" + this.logo + ", bigLogo=" + this.bigLogo + ", createTime=" + this.createTime + ", creator=" + this.creator + ", txs1h=" + this.txs1h + ", txsb1h=" + this.txsb1h + ", txss1h=" + this.txss1h + ", vol1h=" + this.vol1h + ", mcap=" + this.mcap + ", fee=" + this.fee + ", bots=" + this.bots + ", hold=" + this.hold + ", top10HoldRto=" + this.top10HoldRto + ", devHoldRto=" + this.devHoldRto + ", suspHoldRto=" + this.suspHoldRto + ", sniperBuy=" + this.sniperBuy + ", sniperCnt=" + this.sniperCnt + ", sniperHoldingRatio=" + this.sniperHoldingRatio + ", bundHoldRto=" + this.bundHoldRto + ", freshHoldRto=" + this.freshHoldRto + ", suspPhishHoldRto=" + this.suspPhishHoldRto + ", creatorMigrCnt=" + this.creatorMigrCnt + ", tagData=" + this.tagData + ", migrBegin=" + this.migrBegin + ", migrEnd=" + this.migrEnd + ", progress=" + this.progress + ", protocolId=" + this.protocolId + ", extProtocolId=" + this.extProtocolId + ", sameCarNumber=" + this.sameCarNumber + ", sameCarFollowedCount=" + this.sameCarFollowedCount + ", projectLink=" + this.projectLink + ", media=" + this.media + ", collect=" + this.collect + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.MemeTokenV2Data.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeTokenV2Data> serializer() {
            return MemeTokenV2Data$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeTokenV2Data(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, List list, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, MediaV2Data mediaV2Data, String str35, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str3;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
        if ((i & 16) == 0) {
            this.logo = "";
        } else {
            this.logo = str5;
        }
        if ((i & 32) == 0) {
            this.bigLogo = "";
        } else {
            this.bigLogo = str6;
        }
        if ((i & 64) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str7;
        }
        if ((i & 128) == 0) {
            this.creator = "";
        } else {
            this.creator = str8;
        }
        if ((i & 256) == 0) {
            this.txs1h = "";
        } else {
            this.txs1h = str9;
        }
        if ((i & 512) == 0) {
            this.txsb1h = "";
        } else {
            this.txsb1h = str10;
        }
        if ((i & 1024) == 0) {
            this.txss1h = "";
        } else {
            this.txss1h = str11;
        }
        if ((i & 2048) == 0) {
            this.vol1h = "";
        } else {
            this.vol1h = str12;
        }
        if ((i & 4096) == 0) {
            this.mcap = "";
        } else {
            this.mcap = str13;
        }
        if ((i & 8192) == 0) {
            this.fee = "";
        } else {
            this.fee = str14;
        }
        if ((i & 16384) == 0) {
            this.bots = "";
        } else {
            this.bots = str15;
        }
        if ((32768 & i) == 0) {
            this.hold = "";
        } else {
            this.hold = str16;
        }
        if ((65536 & i) == 0) {
            this.top10HoldRto = "";
        } else {
            this.top10HoldRto = str17;
        }
        if ((131072 & i) == 0) {
            this.devHoldRto = "";
        } else {
            this.devHoldRto = str18;
        }
        if ((262144 & i) == 0) {
            this.suspHoldRto = "";
        } else {
            this.suspHoldRto = str19;
        }
        if ((524288 & i) == 0) {
            this.sniperBuy = "";
        } else {
            this.sniperBuy = str20;
        }
        if ((1048576 & i) == 0) {
            this.sniperCnt = "";
        } else {
            this.sniperCnt = str21;
        }
        if ((2097152 & i) == 0) {
            this.sniperHoldingRatio = "";
        } else {
            this.sniperHoldingRatio = str22;
        }
        if ((4194304 & i) == 0) {
            this.bundHoldRto = "";
        } else {
            this.bundHoldRto = str23;
        }
        if ((8388608 & i) == 0) {
            this.freshHoldRto = "";
        } else {
            this.freshHoldRto = str24;
        }
        if ((16777216 & i) == 0) {
            this.suspPhishHoldRto = "";
        } else {
            this.suspPhishHoldRto = str25;
        }
        if ((33554432 & i) == 0) {
            this.creatorMigrCnt = "";
        } else {
            this.creatorMigrCnt = str26;
        }
        this.tagData = (67108864 & i) == 0 ? yDY.AhwBna() : list;
        if ((134217728 & i) == 0) {
            this.migrBegin = "";
        } else {
            this.migrBegin = str27;
        }
        if ((268435456 & i) == 0) {
            this.migrEnd = "";
        } else {
            this.migrEnd = str28;
        }
        if ((536870912 & i) == 0) {
            this.progress = "";
        } else {
            this.progress = str29;
        }
        if ((1073741824 & i) == 0) {
            this.protocolId = "";
        } else {
            this.protocolId = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.extProtocolId = "";
        } else {
            this.extProtocolId = str31;
        }
        if ((i2 & 1) == 0) {
            this.sameCarNumber = "";
        } else {
            this.sameCarNumber = str32;
        }
        if ((i2 & 2) == 0) {
            this.sameCarFollowedCount = "";
        } else {
            this.sameCarFollowedCount = str33;
        }
        if ((i2 & 4) == 0) {
            this.projectLink = "";
        } else {
            this.projectLink = str34;
        }
        this.media = (i2 & 8) == 0 ? new MediaV2Data((String) null, (String) null, (XMediaV2Data) null, (YoutubeMediaV2Data) null, (FacebookMediaV2Data) null, (TwitchMediaV2Data) null, (InstagramMediaV2Data) null, (TikTokMediaV2Data) null, (DiscordMediaV2Data) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : mediaV2Data;
        this.collect = (i2 & 16) == 0 ? "0" : str35;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeTokenV2Data memeTokenV2Data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        CompositeEncoder compositeEncoder2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeTokenV2Data.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeTokenV2Data.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeTokenV2Data.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeTokenV2Data.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeTokenV2Data.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeTokenV2Data.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) memeTokenV2Data.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, memeTokenV2Data.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) memeTokenV2Data.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, memeTokenV2Data.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) memeTokenV2Data.bigLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, memeTokenV2Data.bigLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) memeTokenV2Data.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, memeTokenV2Data.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) memeTokenV2Data.creator, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, memeTokenV2Data.creator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) memeTokenV2Data.txs1h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, memeTokenV2Data.txs1h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) memeTokenV2Data.txsb1h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, memeTokenV2Data.txsb1h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) memeTokenV2Data.txss1h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, memeTokenV2Data.txss1h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) memeTokenV2Data.vol1h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, memeTokenV2Data.vol1h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) memeTokenV2Data.mcap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, memeTokenV2Data.mcap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) memeTokenV2Data.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, memeTokenV2Data.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) memeTokenV2Data.bots, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, memeTokenV2Data.bots);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) memeTokenV2Data.hold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, memeTokenV2Data.hold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) memeTokenV2Data.top10HoldRto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, memeTokenV2Data.top10HoldRto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) memeTokenV2Data.devHoldRto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, memeTokenV2Data.devHoldRto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) memeTokenV2Data.suspHoldRto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, memeTokenV2Data.suspHoldRto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) memeTokenV2Data.sniperBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, memeTokenV2Data.sniperBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) memeTokenV2Data.sniperCnt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, memeTokenV2Data.sniperCnt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) memeTokenV2Data.sniperHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, memeTokenV2Data.sniperHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) memeTokenV2Data.bundHoldRto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, memeTokenV2Data.bundHoldRto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) memeTokenV2Data.freshHoldRto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, memeTokenV2Data.freshHoldRto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) memeTokenV2Data.suspPhishHoldRto, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, memeTokenV2Data.suspPhishHoldRto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) memeTokenV2Data.creatorMigrCnt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, memeTokenV2Data.creatorMigrCnt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd(memeTokenV2Data.tagData, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], memeTokenV2Data.tagData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) memeTokenV2Data.migrBegin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, memeTokenV2Data.migrBegin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) memeTokenV2Data.migrEnd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, memeTokenV2Data.migrEnd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) memeTokenV2Data.progress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, memeTokenV2Data.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) memeTokenV2Data.protocolId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, memeTokenV2Data.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) memeTokenV2Data.extProtocolId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, memeTokenV2Data.extProtocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) memeTokenV2Data.sameCarNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, memeTokenV2Data.sameCarNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) memeTokenV2Data.sameCarFollowedCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, memeTokenV2Data.sameCarFollowedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) memeTokenV2Data.projectLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, memeTokenV2Data.projectLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && Intrinsics.EZpvd(memeTokenV2Data.media, new MediaV2Data((String) null, (String) null, (XMediaV2Data) null, (YoutubeMediaV2Data) null, (FacebookMediaV2Data) null, (TwitchMediaV2Data) null, (InstagramMediaV2Data) null, (TikTokMediaV2Data) null, (DiscordMediaV2Data) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder2 = compositeEncoder;
        } else {
            compositeEncoder2 = compositeEncoder;
            compositeEncoder2.encodeSerializableElement(serialDescriptor, 35, MediaV2Data$$serializer.INSTANCE, memeTokenV2Data.media);
        }
        if (!compositeEncoder2.shouldEncodeElementDefault(serialDescriptor, 36) && Intrinsics.EZpvd((Object) memeTokenV2Data.collect, (Object) "0")) {
            return;
        }
        compositeEncoder2.encodeStringElement(serialDescriptor, 36, memeTokenV2Data.collect);
    }

    public MemeTokenV2Data(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull List<CompactTagData> list, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull MediaV2Data mediaV2Data, @NotNull String str35) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(mediaV2Data, "");
        Intrinsics.checkNotNullParameter(str35, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.tokenSymbol = str3;
        this.name = str4;
        this.logo = str5;
        this.bigLogo = str6;
        this.createTime = str7;
        this.creator = str8;
        this.txs1h = str9;
        this.txsb1h = str10;
        this.txss1h = str11;
        this.vol1h = str12;
        this.mcap = str13;
        this.fee = str14;
        this.bots = str15;
        this.hold = str16;
        this.top10HoldRto = str17;
        this.devHoldRto = str18;
        this.suspHoldRto = str19;
        this.sniperBuy = str20;
        this.sniperCnt = str21;
        this.sniperHoldingRatio = str22;
        this.bundHoldRto = str23;
        this.freshHoldRto = str24;
        this.suspPhishHoldRto = str25;
        this.creatorMigrCnt = str26;
        this.tagData = list;
        this.migrBegin = str27;
        this.migrEnd = str28;
        this.progress = str29;
        this.protocolId = str30;
        this.extProtocolId = str31;
        this.sameCarNumber = str32;
        this.sameCarFollowedCount = str33;
        this.projectLink = str34;
        this.media = mediaV2Data;
        this.collect = str35;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01e7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r85v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r85v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r85v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r85v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r85v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r85v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r85v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r85v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r85v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r85v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r85v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r85v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r85v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r85v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r85v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r85v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r85v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r85v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r85v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r85v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r85v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r85v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r85v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r85v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r85v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r85v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r85v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ff: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:66)) : (r74v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0108: ARITH (r85v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0113: ARITH (r85v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r85v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0129: ARITH (r85v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0134: ARITH (r85v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013d: ARITH (r86v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0146: ARITH (r86v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014f: ARITH (r86v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.data.model.MediaV2Data:?: TERNARY null = ((wrap:int:0x0158: ARITH (r86v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x018c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.features.meme.data.model.XMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.XMediaV2Data) (null com.okinc.business.market.features.meme.data.model.XMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data) (null com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data) (null com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data) (null com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data) (null com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data) (null com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data))
  (wrap:com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data:?: CAST (com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data) (null com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data))
  (wrap:int:0x0170: SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XMediaV2Data, com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data, com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data, com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data, com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data, com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data, com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:84) call: com.okinc.business.market.features.meme.data.model.MediaV2Data.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XMediaV2Data, com.okinc.business.market.features.meme.data.model.YoutubeMediaV2Data, com.okinc.business.market.features.meme.data.model.FacebookMediaV2Data, com.okinc.business.market.features.meme.data.model.TwitchMediaV2Data, com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data, com.okinc.business.market.features.meme.data.model.TikTokMediaV2Data, com.okinc.business.market.features.meme.data.model.DiscordMediaV2Data, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r83v0 com.okinc.business.market.features.meme.data.model.MediaV2Data))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0192: ARITH (r86v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r84v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.MediaV2Data, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.market.features.meme.data.model.MemeTokenV2Data.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.MediaV2Data, java.lang.String):void type: THIS */
    public /* synthetic */ MemeTokenV2Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, List list, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, MediaV2Data mediaV2Data, String str35, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? yDY.AhwBna() : list, (i & 134217728) != 0 ? "" : str27, (i & 268435456) != 0 ? "" : str28, (i & 536870912) != 0 ? "" : str29, (i & 1073741824) != 0 ? "" : str30, (i & Integer.MIN_VALUE) != 0 ? "" : str31, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? new MediaV2Data((String) null, (String) null, (XMediaV2Data) null, (YoutubeMediaV2Data) null, (FacebookMediaV2Data) null, (TwitchMediaV2Data) null, (InstagramMediaV2Data) null, (TikTokMediaV2Data) null, (DiscordMediaV2Data) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : mediaV2Data, (i2 & 16) != 0 ? "0" : str35);
    }

    public final C28635keW toMemePumpTokenModel() {
        String str = this.chainId;
        String str2 = this.tokenContractAddress;
        return new C28635keW(str, this.name, this.tokenSymbol, this.logo, null, false, this.bigLogo, str2, this.createTime, this.creator, this.txs1h, this.txsb1h, this.txss1h, this.vol1h, this.mcap, this.fee, this.bots, this.hold, this.top10HoldRto, this.devHoldRto, this.suspHoldRto, this.sniperBuy, this.sniperCnt, this.sniperHoldingRatio, this.bundHoldRto, this.freshHoldRto, this.suspPhishHoldRto, this.creatorMigrCnt, this.tagData, this.migrBegin, this.migrEnd, this.progress, this.protocolId, this.extProtocolId, this.sameCarNumber, this.sameCarFollowedCount, this.projectLink, this.media.toMedia(), Intrinsics.EZpvd((Object) this.collect, (Object) "1"), 0L, null, null, 48, FaceDetector.NUM_BOXES, null);
    }
}
