package com.okinc.business.market.data.model;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RwaTradingInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String circulatingMCap;
    public final String companyName;
    public final String companyProfile;
    public final String industry;
    public final String listedCompany;
    public final String peRatio;
    public final String stockCode;
    public final String totalMCap;
    public final String turnoverRatio;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RwaTradingInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.industry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.peRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.circulatingMCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.companyProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RwaTradingInfoData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new RwaTradingInfoData(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.companyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.listedCompany;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.turnoverRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RwaTradingInfoData)) {
            return false;
        }
        RwaTradingInfoData rwaTradingInfoData = (RwaTradingInfoData) obj;
        return Intrinsics.EZpvd((Object) this.circulatingMCap, (Object) rwaTradingInfoData.circulatingMCap) && Intrinsics.EZpvd((Object) this.companyName, (Object) rwaTradingInfoData.companyName) && Intrinsics.EZpvd((Object) this.companyProfile, (Object) rwaTradingInfoData.companyProfile) && Intrinsics.EZpvd((Object) this.industry, (Object) rwaTradingInfoData.industry) && Intrinsics.EZpvd((Object) this.listedCompany, (Object) rwaTradingInfoData.listedCompany) && Intrinsics.EZpvd((Object) this.peRatio, (Object) rwaTradingInfoData.peRatio) && Intrinsics.EZpvd((Object) this.stockCode, (Object) rwaTradingInfoData.stockCode) && Intrinsics.EZpvd((Object) this.totalMCap, (Object) rwaTradingInfoData.totalMCap) && Intrinsics.EZpvd((Object) this.turnoverRatio, (Object) rwaTradingInfoData.turnoverRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.stockCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.circulatingMCap.hashCode() * 31) + this.companyName.hashCode()) * 31) + this.companyProfile.hashCode()) * 31) + this.industry.hashCode()) * 31) + this.listedCompany.hashCode()) * 31) + this.peRatio.hashCode()) * 31) + this.stockCode.hashCode()) * 31) + this.totalMCap.hashCode()) * 31) + this.turnoverRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RwaTradingInfoData(circulatingMCap=" + this.circulatingMCap + ", companyName=" + this.companyName + ", companyProfile=" + this.companyProfile + ", industry=" + this.industry + ", listedCompany=" + this.listedCompany + ", peRatio=" + this.peRatio + ", stockCode=" + this.stockCode + ", totalMCap=" + this.totalMCap + ", turnoverRatio=" + this.turnoverRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.totalMCap;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.RwaTradingInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RwaTradingInfoData> serializer() {
            return RwaTradingInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RwaTradingInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.circulatingMCap = "";
        } else {
            this.circulatingMCap = str;
        }
        if ((i & 2) == 0) {
            this.companyName = "";
        } else {
            this.companyName = str2;
        }
        if ((i & 4) == 0) {
            this.companyProfile = "";
        } else {
            this.companyProfile = str3;
        }
        if ((i & 8) == 0) {
            this.industry = "";
        } else {
            this.industry = str4;
        }
        if ((i & 16) == 0) {
            this.listedCompany = "";
        } else {
            this.listedCompany = str5;
        }
        if ((i & 32) == 0) {
            this.peRatio = "";
        } else {
            this.peRatio = str6;
        }
        if ((i & 64) == 0) {
            this.stockCode = "";
        } else {
            this.stockCode = str7;
        }
        if ((i & 128) == 0) {
            this.totalMCap = "";
        } else {
            this.totalMCap = str8;
        }
        if ((i & 256) == 0) {
            this.turnoverRatio = "";
        } else {
            this.turnoverRatio = str9;
        }
    }

    public static final /* synthetic */ void copydefault(RwaTradingInfoData rwaTradingInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.circulatingMCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rwaTradingInfoData.circulatingMCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.companyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rwaTradingInfoData.companyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.companyProfile, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rwaTradingInfoData.companyProfile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.industry, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, rwaTradingInfoData.industry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.listedCompany, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rwaTradingInfoData.listedCompany);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.peRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, rwaTradingInfoData.peRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.stockCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, rwaTradingInfoData.stockCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) rwaTradingInfoData.totalMCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, rwaTradingInfoData.totalMCap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) rwaTradingInfoData.turnoverRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, rwaTradingInfoData.turnoverRatio);
    }

    public RwaTradingInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.circulatingMCap = str;
        this.companyName = str2;
        this.companyProfile = str3;
        this.industry = str4;
        this.listedCompany = str5;
        this.peRatio = str6;
        this.stockCode = str7;
        this.totalMCap = str8;
        this.turnoverRatio = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:33) call: com.okinc.business.market.data.model.RwaTradingInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RwaTradingInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
