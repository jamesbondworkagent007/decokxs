package com.okinc.find_ui.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class AssetDistributionData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String buyLargePerc;
    private final String buyLargeVol;
    private final String buyMidPerc;
    private final String buyMidVol;
    private final String buySmallPerc;
    private final String buySmallVol;
    private final String buyTotalVol;
    private final String buyXLargePerc;
    private final String buyXLargeVol;
    private final String endTs;
    private final String netVol;
    private final String sellLargePerc;
    private final String sellLargeVol;
    private final String sellMidPerc;
    private final String sellMidVol;
    private final String sellSmallPerc;
    private final String sellSmallVol;
    private final String sellTotalVol;
    private final String sellXLargePerc;
    private final String sellXLargeVol;
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetDistributionData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.buyLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.buyMidPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.buySmallPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sellTotalVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.sellXLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.sellLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.sellMidVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.sellSmallVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.sellXLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.sellLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.endTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.sellMidPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.sellSmallPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.netVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.buyTotalVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.buyXLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.buyLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.buyMidVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.buySmallVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.buyXLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetDistributionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
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
        return new AssetDistributionData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetDistributionData)) {
            return false;
        }
        AssetDistributionData assetDistributionData = (AssetDistributionData) obj;
        return Intrinsics.EZpvd((Object) this.ts, (Object) assetDistributionData.ts) && Intrinsics.EZpvd((Object) this.endTs, (Object) assetDistributionData.endTs) && Intrinsics.EZpvd((Object) this.netVol, (Object) assetDistributionData.netVol) && Intrinsics.EZpvd((Object) this.buyTotalVol, (Object) assetDistributionData.buyTotalVol) && Intrinsics.EZpvd((Object) this.buyXLargeVol, (Object) assetDistributionData.buyXLargeVol) && Intrinsics.EZpvd((Object) this.buyLargeVol, (Object) assetDistributionData.buyLargeVol) && Intrinsics.EZpvd((Object) this.buyMidVol, (Object) assetDistributionData.buyMidVol) && Intrinsics.EZpvd((Object) this.buySmallVol, (Object) assetDistributionData.buySmallVol) && Intrinsics.EZpvd((Object) this.buyXLargePerc, (Object) assetDistributionData.buyXLargePerc) && Intrinsics.EZpvd((Object) this.buyLargePerc, (Object) assetDistributionData.buyLargePerc) && Intrinsics.EZpvd((Object) this.buyMidPerc, (Object) assetDistributionData.buyMidPerc) && Intrinsics.EZpvd((Object) this.buySmallPerc, (Object) assetDistributionData.buySmallPerc) && Intrinsics.EZpvd((Object) this.sellTotalVol, (Object) assetDistributionData.sellTotalVol) && Intrinsics.EZpvd((Object) this.sellXLargeVol, (Object) assetDistributionData.sellXLargeVol) && Intrinsics.EZpvd((Object) this.sellLargeVol, (Object) assetDistributionData.sellLargeVol) && Intrinsics.EZpvd((Object) this.sellMidVol, (Object) assetDistributionData.sellMidVol) && Intrinsics.EZpvd((Object) this.sellSmallVol, (Object) assetDistributionData.sellSmallVol) && Intrinsics.EZpvd((Object) this.sellXLargePerc, (Object) assetDistributionData.sellXLargePerc) && Intrinsics.EZpvd((Object) this.sellLargePerc, (Object) assetDistributionData.sellLargePerc) && Intrinsics.EZpvd((Object) this.sellMidPerc, (Object) assetDistributionData.sellMidPerc) && Intrinsics.EZpvd((Object) this.sellSmallPerc, (Object) assetDistributionData.sellSmallPerc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyLargePerc() {
        return this.buyLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyLargeVol() {
        return this.buyLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyMidPerc() {
        return this.buyMidPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyMidVol() {
        return this.buyMidVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuySmallPerc() {
        return this.buySmallPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuySmallVol() {
        return this.buySmallVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyTotalVol() {
        return this.buyTotalVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyXLargePerc() {
        return this.buyXLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyXLargeVol() {
        return this.buyXLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTs() {
        return this.endTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetVol() {
        return this.netVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellLargePerc() {
        return this.sellLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellLargeVol() {
        return this.sellLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellMidPerc() {
        return this.sellMidPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellMidVol() {
        return this.sellMidVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellSmallPerc() {
        return this.sellSmallPerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellSmallVol() {
        return this.sellSmallVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTotalVol() {
        return this.sellTotalVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellXLargePerc() {
        return this.sellXLargePerc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellXLargeVol() {
        return this.sellXLargeVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.ts.hashCode() * 31) + this.endTs.hashCode()) * 31) + this.netVol.hashCode()) * 31) + this.buyTotalVol.hashCode()) * 31) + this.buyXLargeVol.hashCode()) * 31) + this.buyLargeVol.hashCode()) * 31) + this.buyMidVol.hashCode()) * 31) + this.buySmallVol.hashCode()) * 31) + this.buyXLargePerc.hashCode()) * 31) + this.buyLargePerc.hashCode()) * 31) + this.buyMidPerc.hashCode()) * 31) + this.buySmallPerc.hashCode()) * 31) + this.sellTotalVol.hashCode()) * 31) + this.sellXLargeVol.hashCode()) * 31) + this.sellLargeVol.hashCode()) * 31) + this.sellMidVol.hashCode()) * 31) + this.sellSmallVol.hashCode()) * 31) + this.sellXLargePerc.hashCode()) * 31) + this.sellLargePerc.hashCode()) * 31) + this.sellMidPerc.hashCode()) * 31) + this.sellSmallPerc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetDistributionData(ts=" + this.ts + ", endTs=" + this.endTs + ", netVol=" + this.netVol + ", buyTotalVol=" + this.buyTotalVol + ", buyXLargeVol=" + this.buyXLargeVol + ", buyLargeVol=" + this.buyLargeVol + ", buyMidVol=" + this.buyMidVol + ", buySmallVol=" + this.buySmallVol + ", buyXLargePerc=" + this.buyXLargePerc + ", buyLargePerc=" + this.buyLargePerc + ", buyMidPerc=" + this.buyMidPerc + ", buySmallPerc=" + this.buySmallPerc + ", sellTotalVol=" + this.sellTotalVol + ", sellXLargeVol=" + this.sellXLargeVol + ", sellLargeVol=" + this.sellLargeVol + ", sellMidVol=" + this.sellMidVol + ", sellSmallVol=" + this.sellSmallVol + ", sellXLargePerc=" + this.sellXLargePerc + ", sellLargePerc=" + this.sellLargePerc + ", sellMidPerc=" + this.sellMidPerc + ", sellSmallPerc=" + this.sellSmallPerc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.data.AssetDistributionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetDistributionData> serializer() {
            return AssetDistributionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetDistributionData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = "";
        } else {
            this.ts = str;
        }
        if ((i & 2) == 0) {
            this.endTs = "";
        } else {
            this.endTs = str2;
        }
        if ((i & 4) == 0) {
            this.netVol = "";
        } else {
            this.netVol = str3;
        }
        if ((i & 8) == 0) {
            this.buyTotalVol = "";
        } else {
            this.buyTotalVol = str4;
        }
        if ((i & 16) == 0) {
            this.buyXLargeVol = "";
        } else {
            this.buyXLargeVol = str5;
        }
        if ((i & 32) == 0) {
            this.buyLargeVol = "";
        } else {
            this.buyLargeVol = str6;
        }
        if ((i & 64) == 0) {
            this.buyMidVol = "";
        } else {
            this.buyMidVol = str7;
        }
        if ((i & 128) == 0) {
            this.buySmallVol = "";
        } else {
            this.buySmallVol = str8;
        }
        if ((i & 256) == 0) {
            this.buyXLargePerc = "";
        } else {
            this.buyXLargePerc = str9;
        }
        if ((i & 512) == 0) {
            this.buyLargePerc = "";
        } else {
            this.buyLargePerc = str10;
        }
        if ((i & 1024) == 0) {
            this.buyMidPerc = "";
        } else {
            this.buyMidPerc = str11;
        }
        if ((i & 2048) == 0) {
            this.buySmallPerc = "";
        } else {
            this.buySmallPerc = str12;
        }
        if ((i & 4096) == 0) {
            this.sellTotalVol = "";
        } else {
            this.sellTotalVol = str13;
        }
        if ((i & 8192) == 0) {
            this.sellXLargeVol = "";
        } else {
            this.sellXLargeVol = str14;
        }
        if ((i & 16384) == 0) {
            this.sellLargeVol = "";
        } else {
            this.sellLargeVol = str15;
        }
        if ((32768 & i) == 0) {
            this.sellMidVol = "";
        } else {
            this.sellMidVol = str16;
        }
        if ((65536 & i) == 0) {
            this.sellSmallVol = "";
        } else {
            this.sellSmallVol = str17;
        }
        if ((131072 & i) == 0) {
            this.sellXLargePerc = "";
        } else {
            this.sellXLargePerc = str18;
        }
        if ((262144 & i) == 0) {
            this.sellLargePerc = "";
        } else {
            this.sellLargePerc = str19;
        }
        if ((524288 & i) == 0) {
            this.sellMidPerc = "";
        } else {
            this.sellMidPerc = str20;
        }
        if ((i & 1048576) == 0) {
            this.sellSmallPerc = "";
        } else {
            this.sellSmallPerc = str21;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(AssetDistributionData assetDistributionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetDistributionData.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetDistributionData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetDistributionData.endTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, assetDistributionData.endTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetDistributionData.netVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, assetDistributionData.netVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) assetDistributionData.buyTotalVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, assetDistributionData.buyTotalVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) assetDistributionData.buyXLargeVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, assetDistributionData.buyXLargeVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) assetDistributionData.buyLargeVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, assetDistributionData.buyLargeVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) assetDistributionData.buyMidVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, assetDistributionData.buyMidVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) assetDistributionData.buySmallVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, assetDistributionData.buySmallVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) assetDistributionData.buyXLargePerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, assetDistributionData.buyXLargePerc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) assetDistributionData.buyLargePerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, assetDistributionData.buyLargePerc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) assetDistributionData.buyMidPerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, assetDistributionData.buyMidPerc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) assetDistributionData.buySmallPerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, assetDistributionData.buySmallPerc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) assetDistributionData.sellTotalVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, assetDistributionData.sellTotalVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) assetDistributionData.sellXLargeVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, assetDistributionData.sellXLargeVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) assetDistributionData.sellLargeVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, assetDistributionData.sellLargeVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) assetDistributionData.sellMidVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, assetDistributionData.sellMidVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) assetDistributionData.sellSmallVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, assetDistributionData.sellSmallVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) assetDistributionData.sellXLargePerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, assetDistributionData.sellXLargePerc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) assetDistributionData.sellLargePerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, assetDistributionData.sellLargePerc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) assetDistributionData.sellMidPerc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, assetDistributionData.sellMidPerc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) assetDistributionData.sellSmallPerc, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, assetDistributionData.sellSmallPerc);
    }

    public AssetDistributionData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
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
        this.ts = str;
        this.endTs = str2;
        this.netVol = str3;
        this.buyTotalVol = str4;
        this.buyXLargeVol = str5;
        this.buyLargeVol = str6;
        this.buyMidVol = str7;
        this.buySmallVol = str8;
        this.buyXLargePerc = str9;
        this.buyLargePerc = str10;
        this.buyMidPerc = str11;
        this.buySmallPerc = str12;
        this.sellTotalVol = str13;
        this.sellXLargeVol = str14;
        this.sellLargeVol = str15;
        this.sellMidVol = str16;
        this.sellSmallVol = str17;
        this.sellXLargePerc = str18;
        this.sellLargePerc = str19;
        this.sellMidPerc = str20;
        this.sellSmallPerc = str21;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ee: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.find_ui.data.AssetDistributionData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetDistributionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21);
    }
}
