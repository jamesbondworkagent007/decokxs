package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class HotItemCoinInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String hotIndex;
    private final String iconUrl;
    private final String instId;
    private final String instType;
    private final String lastPrice;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HotItemCoinInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HotItemCoinInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new HotItemCoinInfo(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotItemCoinInfo)) {
            return false;
        }
        HotItemCoinInfo hotItemCoinInfo = (HotItemCoinInfo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) hotItemCoinInfo.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) hotItemCoinInfo.instType) && Intrinsics.EZpvd((Object) this.hotIndex, (Object) hotItemCoinInfo.hotIndex) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) hotItemCoinInfo.lastPrice) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) hotItemCoinInfo.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) hotItemCoinInfo.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) hotItemCoinInfo.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) hotItemCoinInfo.iconUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay24h() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc0() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotIndex() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.hotIndex.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.changePerDay24h.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HotItemCoinInfo(instId=" + this.instId + ", instType=" + this.instType + ", hotIndex=" + this.hotIndex + ", lastPrice=" + this.lastPrice + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", iconUrl=" + this.iconUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.HotItemCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HotItemCoinInfo> serializer() {
            return HotItemCoinInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HotItemCoinInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.hotIndex = "";
        } else {
            this.hotIndex = str3;
        }
        if ((i & 8) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str4;
        }
        if ((i & 16) == 0) {
            this.changePerDay24h = "";
        } else {
            this.changePerDay24h = str5;
        }
        if ((i & 32) == 0) {
            this.changePerDayUtc0 = "";
        } else {
            this.changePerDayUtc0 = str6;
        }
        if ((i & 64) == 0) {
            this.changePerDayUtc8 = "";
        } else {
            this.changePerDayUtc8 = str7;
        }
        if ((i & 128) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(HotItemCoinInfo hotItemCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, hotItemCoinInfo.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, hotItemCoinInfo.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.hotIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, hotItemCoinInfo.hotIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, hotItemCoinInfo.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.changePerDay24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, hotItemCoinInfo.changePerDay24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.changePerDayUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, hotItemCoinInfo.changePerDayUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) hotItemCoinInfo.changePerDayUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, hotItemCoinInfo.changePerDayUtc8);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) hotItemCoinInfo.iconUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, hotItemCoinInfo.iconUrl);
    }

    public HotItemCoinInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.instId = str;
        this.instType = str2;
        this.hotIndex = str3;
        this.lastPrice = str4;
        this.changePerDay24h = str5;
        this.changePerDayUtc0 = str6;
        this.changePerDayUtc8 = str7;
        this.iconUrl = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.HotItemCoinInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HotItemCoinInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
