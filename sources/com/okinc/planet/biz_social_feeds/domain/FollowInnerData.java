package com.okinc.planet.biz_social_feeds.domain;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FollowInnerData {
    public final String alias;
    public final List<ArbitrageInfoData> arbitrageInfoList;
    public final String balNum;
    public final String baseCcy;
    public final String bizId;
    public final String copyType;
    public final String cycles;
    public final String gridNum;
    public final String instId;
    public final String instType;
    public final String lever;
    public final String maxPrice;
    public final String mgnMode;
    public final String minPrice;
    public final String nickName;
    public final String openAvgPx;
    public final String ordType;
    public final String orderFinishTime;
    public final String pnlRatio;
    public final String portrait;
    public final String pos;
    public final String posCcy;
    public final String posSide;
    public final String posStatus;
    public final String postId;
    public final String px;
    public final String quoteCcy;
    public final String side;
    public final String state;
    public final String stgyName;
    public final String sysTime;
    public final String targetId;
    public final String tradeType;
    public final String uniqueName;
    public final String userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ArbitrageInfoData$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowInnerData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, -1, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.cycles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.sysTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageInfoData> EZpvd() {
        return this.arbitrageInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.balNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowInnerData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull List<ArbitrageInfoData> list, @NotNull String str33, @NotNull String str34) {
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
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        return new FollowInnerData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, list, str33, str34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowInnerData)) {
            return false;
        }
        FollowInnerData followInnerData = (FollowInnerData) obj;
        return Intrinsics.EZpvd((Object) this.nickName, (Object) followInnerData.nickName) && Intrinsics.EZpvd((Object) this.uniqueName, (Object) followInnerData.uniqueName) && Intrinsics.EZpvd((Object) this.portrait, (Object) followInnerData.portrait) && Intrinsics.EZpvd((Object) this.targetId, (Object) followInnerData.targetId) && Intrinsics.EZpvd((Object) this.userId, (Object) followInnerData.userId) && Intrinsics.EZpvd((Object) this.postId, (Object) followInnerData.postId) && Intrinsics.EZpvd((Object) this.instId, (Object) followInnerData.instId) && Intrinsics.EZpvd((Object) this.px, (Object) followInnerData.px) && Intrinsics.EZpvd((Object) this.openAvgPx, (Object) followInnerData.openAvgPx) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) followInnerData.quoteCcy) && Intrinsics.EZpvd((Object) this.baseCcy, (Object) followInnerData.baseCcy) && Intrinsics.EZpvd((Object) this.side, (Object) followInnerData.side) && Intrinsics.EZpvd((Object) this.lever, (Object) followInnerData.lever) && Intrinsics.EZpvd((Object) this.orderFinishTime, (Object) followInnerData.orderFinishTime) && Intrinsics.EZpvd((Object) this.sysTime, (Object) followInnerData.sysTime) && Intrinsics.EZpvd((Object) this.posSide, (Object) followInnerData.posSide) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) followInnerData.mgnMode) && Intrinsics.EZpvd((Object) this.bizId, (Object) followInnerData.bizId) && Intrinsics.EZpvd((Object) this.instType, (Object) followInnerData.instType) && Intrinsics.EZpvd((Object) this.posStatus, (Object) followInnerData.posStatus) && Intrinsics.EZpvd((Object) this.alias, (Object) followInnerData.alias) && Intrinsics.EZpvd((Object) this.pos, (Object) followInnerData.pos) && Intrinsics.EZpvd((Object) this.posCcy, (Object) followInnerData.posCcy) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) followInnerData.pnlRatio) && Intrinsics.EZpvd((Object) this.stgyName, (Object) followInnerData.stgyName) && Intrinsics.EZpvd((Object) this.ordType, (Object) followInnerData.ordType) && Intrinsics.EZpvd((Object) this.state, (Object) followInnerData.state) && Intrinsics.EZpvd((Object) this.balNum, (Object) followInnerData.balNum) && Intrinsics.EZpvd((Object) this.cycles, (Object) followInnerData.cycles) && Intrinsics.EZpvd((Object) this.gridNum, (Object) followInnerData.gridNum) && Intrinsics.EZpvd((Object) this.minPrice, (Object) followInnerData.minPrice) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) followInnerData.maxPrice) && Intrinsics.EZpvd(this.arbitrageInfoList, followInnerData.arbitrageInfoList) && Intrinsics.EZpvd((Object) this.tradeType, (Object) followInnerData.tradeType) && Intrinsics.EZpvd((Object) this.copyType, (Object) followInnerData.copyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.orderFinishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.posStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.nickName.hashCode() * 31) + this.uniqueName.hashCode()) * 31) + this.portrait.hashCode()) * 31) + this.targetId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.postId.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.px.hashCode()) * 31) + this.openAvgPx.hashCode()) * 31) + this.quoteCcy.hashCode()) * 31) + this.baseCcy.hashCode()) * 31) + this.side.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.orderFinishTime.hashCode()) * 31) + this.sysTime.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.mgnMode.hashCode()) * 31) + this.bizId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.posStatus.hashCode()) * 31) + this.alias.hashCode()) * 31) + this.pos.hashCode()) * 31) + this.posCcy.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.stgyName.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.state.hashCode()) * 31) + this.balNum.hashCode()) * 31) + this.cycles.hashCode()) * 31) + this.gridNum.hashCode()) * 31) + this.minPrice.hashCode()) * 31) + this.maxPrice.hashCode()) * 31) + this.arbitrageInfoList.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + this.copyType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowInnerData(nickName=" + this.nickName + ", uniqueName=" + this.uniqueName + ", portrait=" + this.portrait + ", targetId=" + this.targetId + ", userId=" + this.userId + ", postId=" + this.postId + ", instId=" + this.instId + ", px=" + this.px + ", openAvgPx=" + this.openAvgPx + ", quoteCcy=" + this.quoteCcy + ", baseCcy=" + this.baseCcy + ", side=" + this.side + ", lever=" + this.lever + ", orderFinishTime=" + this.orderFinishTime + ", sysTime=" + this.sysTime + ", posSide=" + this.posSide + ", mgnMode=" + this.mgnMode + ", bizId=" + this.bizId + ", instType=" + this.instType + ", posStatus=" + this.posStatus + ", alias=" + this.alias + ", pos=" + this.pos + ", posCcy=" + this.posCcy + ", pnlRatio=" + this.pnlRatio + ", stgyName=" + this.stgyName + ", ordType=" + this.ordType + ", state=" + this.state + ", balNum=" + this.balNum + ", cycles=" + this.cycles + ", gridNum=" + this.gridNum + ", minPrice=" + this.minPrice + ", maxPrice=" + this.maxPrice + ", arbitrageInfoList=" + this.arbitrageInfoList + ", tradeType=" + this.tradeType + ", copyType=" + this.copyType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.targetId;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_social_feeds.domain.FollowInnerData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FollowInnerData> serializer() {
            return FollowInnerData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FollowInnerData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List list, String str33, String str34, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str;
        }
        if ((i & 2) == 0) {
            this.uniqueName = "";
        } else {
            this.uniqueName = str2;
        }
        if ((i & 4) == 0) {
            this.portrait = "";
        } else {
            this.portrait = str3;
        }
        if ((i & 8) == 0) {
            this.targetId = "";
        } else {
            this.targetId = str4;
        }
        if ((i & 16) == 0) {
            this.userId = "";
        } else {
            this.userId = str5;
        }
        if ((i & 32) == 0) {
            this.postId = "";
        } else {
            this.postId = str6;
        }
        if ((i & 64) == 0) {
            this.instId = "";
        } else {
            this.instId = str7;
        }
        if ((i & 128) == 0) {
            this.px = "";
        } else {
            this.px = str8;
        }
        if ((i & 256) == 0) {
            this.openAvgPx = "";
        } else {
            this.openAvgPx = str9;
        }
        if ((i & 512) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str10;
        }
        if ((i & 1024) == 0) {
            this.baseCcy = "";
        } else {
            this.baseCcy = str11;
        }
        if ((i & 2048) == 0) {
            this.side = "";
        } else {
            this.side = str12;
        }
        if ((i & 4096) == 0) {
            this.lever = "";
        } else {
            this.lever = str13;
        }
        if ((i & 8192) == 0) {
            this.orderFinishTime = "";
        } else {
            this.orderFinishTime = str14;
        }
        if ((i & 16384) == 0) {
            this.sysTime = "";
        } else {
            this.sysTime = str15;
        }
        if ((32768 & i) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str16;
        }
        if ((65536 & i) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str17;
        }
        if ((131072 & i) == 0) {
            this.bizId = "";
        } else {
            this.bizId = str18;
        }
        if ((262144 & i) == 0) {
            this.instType = "";
        } else {
            this.instType = str19;
        }
        if ((524288 & i) == 0) {
            this.posStatus = "";
        } else {
            this.posStatus = str20;
        }
        if ((1048576 & i) == 0) {
            this.alias = "";
        } else {
            this.alias = str21;
        }
        if ((2097152 & i) == 0) {
            this.pos = "";
        } else {
            this.pos = str22;
        }
        if ((4194304 & i) == 0) {
            this.posCcy = "";
        } else {
            this.posCcy = str23;
        }
        if ((8388608 & i) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str24;
        }
        if ((16777216 & i) == 0) {
            this.stgyName = "";
        } else {
            this.stgyName = str25;
        }
        if ((33554432 & i) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str26;
        }
        if ((67108864 & i) == 0) {
            this.state = "";
        } else {
            this.state = str27;
        }
        if ((134217728 & i) == 0) {
            this.balNum = "";
        } else {
            this.balNum = str28;
        }
        if ((268435456 & i) == 0) {
            this.cycles = "";
        } else {
            this.cycles = str29;
        }
        if ((536870912 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str30;
        }
        if ((1073741824 & i) == 0) {
            this.minPrice = "";
        } else {
            this.minPrice = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.maxPrice = "";
        } else {
            this.maxPrice = str32;
        }
        this.arbitrageInfoList = (i2 & 1) == 0 ? new ArrayList() : list;
        if ((i2 & 2) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str33;
        }
        if ((i2 & 4) == 0) {
            this.copyType = "";
        } else {
            this.copyType = str34;
        }
    }

    public static final /* synthetic */ void KWHzl(FollowInnerData followInnerData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) followInnerData.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, followInnerData.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) followInnerData.uniqueName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, followInnerData.uniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) followInnerData.portrait, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, followInnerData.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) followInnerData.targetId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, followInnerData.targetId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) followInnerData.userId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, followInnerData.userId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) followInnerData.postId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, followInnerData.postId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) followInnerData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, followInnerData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) followInnerData.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, followInnerData.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) followInnerData.openAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, followInnerData.openAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) followInnerData.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, followInnerData.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) followInnerData.baseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, followInnerData.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) followInnerData.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, followInnerData.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) followInnerData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, followInnerData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) followInnerData.orderFinishTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, followInnerData.orderFinishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) followInnerData.sysTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, followInnerData.sysTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) followInnerData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, followInnerData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) followInnerData.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, followInnerData.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) followInnerData.bizId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, followInnerData.bizId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) followInnerData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, followInnerData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) followInnerData.posStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, followInnerData.posStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) followInnerData.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, followInnerData.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) followInnerData.pos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, followInnerData.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) followInnerData.posCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, followInnerData.posCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) followInnerData.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, followInnerData.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) followInnerData.stgyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, followInnerData.stgyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) followInnerData.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, followInnerData.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) followInnerData.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, followInnerData.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) followInnerData.balNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, followInnerData.balNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) followInnerData.cycles, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, followInnerData.cycles);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) followInnerData.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, followInnerData.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) followInnerData.minPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, followInnerData.minPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) followInnerData.maxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, followInnerData.maxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd(followInnerData.arbitrageInfoList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 32, kSerializerArr[32], followInnerData.arbitrageInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) followInnerData.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, followInnerData.tradeType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && Intrinsics.EZpvd((Object) followInnerData.copyType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 34, followInnerData.copyType);
    }

    public FollowInnerData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull List<ArbitrageInfoData> list, @NotNull String str33, @NotNull String str34) {
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
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        this.nickName = str;
        this.uniqueName = str2;
        this.portrait = str3;
        this.targetId = str4;
        this.userId = str5;
        this.postId = str6;
        this.instId = str7;
        this.px = str8;
        this.openAvgPx = str9;
        this.quoteCcy = str10;
        this.baseCcy = str11;
        this.side = str12;
        this.lever = str13;
        this.orderFinishTime = str14;
        this.sysTime = str15;
        this.posSide = str16;
        this.mgnMode = str17;
        this.bizId = str18;
        this.instType = str19;
        this.posStatus = str20;
        this.alias = str21;
        this.pos = str22;
        this.posCcy = str23;
        this.pnlRatio = str24;
        this.stgyName = str25;
        this.ordType = str26;
        this.state = str27;
        this.balNum = str28;
        this.cycles = str29;
        this.gridNum = str30;
        this.minPrice = str31;
        this.maxPrice = str32;
        this.arbitrageInfoList = list;
        this.tradeType = str33;
        this.copyType = str34;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01a1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r71v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r71v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r71v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r71v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r71v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r71v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r71v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r71v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r71v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r71v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r71v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r71v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r71v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r71v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r71v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r71v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r71v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r71v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r71v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r71v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r71v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r71v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r71v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r71v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r71v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r71v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r71v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r71v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r71v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r71v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r71v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x013b: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0141: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:39) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r68v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0147: ARITH (r72v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0150: ARITH (r72v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_social_feeds.domain.ArbitrageInfoData>, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.planet.biz_social_feeds.domain.FollowInnerData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FollowInnerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List list, String str33, String str34, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34);
    }

    public final boolean gHZMYf() {
        return Intrinsics.EZpvd((Object) this.copyType, (Object) "2") || Intrinsics.EZpvd((Object) this.copyType, (Object) "3");
    }
}
