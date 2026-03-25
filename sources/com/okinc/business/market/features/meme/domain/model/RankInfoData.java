package com.okinc.business.market.features.meme.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class RankInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String maxTokenCount;
    private final String newTokenPushChannelName;
    private final String privatePushChannelName;
    private final String pushChannelName;
    private final String rankName;
    private final String rankType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankInfoData copy$default(RankInfoData rankInfoData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankInfoData.rankType;
        }
        if ((i & 2) != 0) {
            str2 = rankInfoData.rankName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = rankInfoData.pushChannelName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = rankInfoData.newTokenPushChannelName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = rankInfoData.privatePushChannelName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = rankInfoData.maxTokenCount;
        }
        return rankInfoData.copy(str, str7, str8, str9, str10, str6);
    }

    @SerialName("maxTokenCount")
    public static /* synthetic */ void getMaxTokenCount$annotations() {
    }

    @SerialName("newTokenPushChannelName")
    public static /* synthetic */ void getNewTokenPushChannelName$annotations() {
    }

    @SerialName("privatePushChannelName")
    public static /* synthetic */ void getPrivatePushChannelName$annotations() {
    }

    @SerialName("pushChannelName")
    public static /* synthetic */ void getPushChannelName$annotations() {
    }

    @SerialName("rankName")
    public static /* synthetic */ void getRankName$annotations() {
    }

    @SerialName("rankType")
    public static /* synthetic */ void getRankType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pushChannelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newTokenPushChannelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.privatePushChannelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new RankInfoData(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankInfoData)) {
            return false;
        }
        RankInfoData rankInfoData = (RankInfoData) obj;
        return Intrinsics.EZpvd((Object) this.rankType, (Object) rankInfoData.rankType) && Intrinsics.EZpvd((Object) this.rankName, (Object) rankInfoData.rankName) && Intrinsics.EZpvd((Object) this.pushChannelName, (Object) rankInfoData.pushChannelName) && Intrinsics.EZpvd((Object) this.newTokenPushChannelName, (Object) rankInfoData.newTokenPushChannelName) && Intrinsics.EZpvd((Object) this.privatePushChannelName, (Object) rankInfoData.privatePushChannelName) && Intrinsics.EZpvd((Object) this.maxTokenCount, (Object) rankInfoData.maxTokenCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxTokenCount() {
        return this.maxTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTokenPushChannelName() {
        return this.newTokenPushChannelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivatePushChannelName() {
        return this.privatePushChannelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushChannelName() {
        return this.pushChannelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRankName() {
        return this.rankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRankType() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.rankType.hashCode() * 31) + this.rankName.hashCode()) * 31) + this.pushChannelName.hashCode()) * 31) + this.newTokenPushChannelName.hashCode()) * 31) + this.privatePushChannelName.hashCode()) * 31) + this.maxTokenCount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankInfoData(rankType=" + this.rankType + ", rankName=" + this.rankName + ", pushChannelName=" + this.pushChannelName + ", newTokenPushChannelName=" + this.newTokenPushChannelName + ", privatePushChannelName=" + this.privatePushChannelName + ", maxTokenCount=" + this.maxTokenCount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.domain.model.RankInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankInfoData> serializer() {
            return RankInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RankInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rankType = "";
        } else {
            this.rankType = str;
        }
        if ((i & 2) == 0) {
            this.rankName = "";
        } else {
            this.rankName = str2;
        }
        if ((i & 4) == 0) {
            this.pushChannelName = "";
        } else {
            this.pushChannelName = str3;
        }
        if ((i & 8) == 0) {
            this.newTokenPushChannelName = "";
        } else {
            this.newTokenPushChannelName = str4;
        }
        if ((i & 16) == 0) {
            this.privatePushChannelName = "";
        } else {
            this.privatePushChannelName = str5;
        }
        if ((i & 32) == 0) {
            this.maxTokenCount = "";
        } else {
            this.maxTokenCount = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(RankInfoData rankInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rankInfoData.rankType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rankInfoData.rankType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rankInfoData.rankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rankInfoData.rankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rankInfoData.pushChannelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rankInfoData.pushChannelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) rankInfoData.newTokenPushChannelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, rankInfoData.newTokenPushChannelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rankInfoData.privatePushChannelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rankInfoData.privatePushChannelName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) rankInfoData.maxTokenCount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, rankInfoData.maxTokenCount);
    }

    public RankInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.rankType = str;
        this.rankName = str2;
        this.pushChannelName = str3;
        this.newTokenPushChannelName = str4;
        this.privatePushChannelName = str5;
        this.maxTokenCount = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.market.features.meme.domain.model.RankInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RankInfoData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
