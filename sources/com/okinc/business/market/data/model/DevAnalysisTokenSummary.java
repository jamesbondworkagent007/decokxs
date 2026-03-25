package com.okinc.business.market.data.model;

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
public final class DevAnalysisTokenSummary {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String createdTokenCount;
    public final String creatorAddress;
    public final String goldenDogCount;
    public final String goldenDogRate;
    public final String launchedRate;
    public final String launchedTokenCount;
    public final String page;
    public final String pageSize;
    public final String ruggedTokenCount;
    public final String ruggedTokenRate;
    public final String totalPage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DevAnalysisTokenSummary() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.goldenDogRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.ruggedTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.creatorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.launchedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevAnalysisTokenSummary OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        return new DevAnalysisTokenSummary(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.goldenDogCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.createdTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevAnalysisTokenSummary)) {
            return false;
        }
        DevAnalysisTokenSummary devAnalysisTokenSummary = (DevAnalysisTokenSummary) obj;
        return Intrinsics.EZpvd((Object) this.createdTokenCount, (Object) devAnalysisTokenSummary.createdTokenCount) && Intrinsics.EZpvd((Object) this.creatorAddress, (Object) devAnalysisTokenSummary.creatorAddress) && Intrinsics.EZpvd((Object) this.goldenDogCount, (Object) devAnalysisTokenSummary.goldenDogCount) && Intrinsics.EZpvd((Object) this.goldenDogRate, (Object) devAnalysisTokenSummary.goldenDogRate) && Intrinsics.EZpvd((Object) this.launchedRate, (Object) devAnalysisTokenSummary.launchedRate) && Intrinsics.EZpvd((Object) this.launchedTokenCount, (Object) devAnalysisTokenSummary.launchedTokenCount) && Intrinsics.EZpvd((Object) this.page, (Object) devAnalysisTokenSummary.page) && Intrinsics.EZpvd((Object) this.pageSize, (Object) devAnalysisTokenSummary.pageSize) && Intrinsics.EZpvd((Object) this.ruggedTokenCount, (Object) devAnalysisTokenSummary.ruggedTokenCount) && Intrinsics.EZpvd((Object) this.ruggedTokenRate, (Object) devAnalysisTokenSummary.ruggedTokenRate) && Intrinsics.EZpvd((Object) this.totalPage, (Object) devAnalysisTokenSummary.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.launchedTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.createdTokenCount.hashCode() * 31) + this.creatorAddress.hashCode()) * 31) + this.goldenDogCount.hashCode()) * 31) + this.goldenDogRate.hashCode()) * 31) + this.launchedRate.hashCode()) * 31) + this.launchedTokenCount.hashCode()) * 31) + this.page.hashCode()) * 31) + this.pageSize.hashCode()) * 31) + this.ruggedTokenCount.hashCode()) * 31) + this.ruggedTokenRate.hashCode()) * 31) + this.totalPage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DevAnalysisTokenSummary(createdTokenCount=" + this.createdTokenCount + ", creatorAddress=" + this.creatorAddress + ", goldenDogCount=" + this.goldenDogCount + ", goldenDogRate=" + this.goldenDogRate + ", launchedRate=" + this.launchedRate + ", launchedTokenCount=" + this.launchedTokenCount + ", page=" + this.page + ", pageSize=" + this.pageSize + ", ruggedTokenCount=" + this.ruggedTokenCount + ", ruggedTokenRate=" + this.ruggedTokenRate + ", totalPage=" + this.totalPage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.ruggedTokenRate;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.DevAnalysisTokenSummary.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DevAnalysisTokenSummary> serializer() {
            return DevAnalysisTokenSummary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DevAnalysisTokenSummary(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.createdTokenCount = "";
        } else {
            this.createdTokenCount = str;
        }
        if ((i & 2) == 0) {
            this.creatorAddress = "";
        } else {
            this.creatorAddress = str2;
        }
        if ((i & 4) == 0) {
            this.goldenDogCount = "";
        } else {
            this.goldenDogCount = str3;
        }
        if ((i & 8) == 0) {
            this.goldenDogRate = "";
        } else {
            this.goldenDogRate = str4;
        }
        if ((i & 16) == 0) {
            this.launchedRate = "";
        } else {
            this.launchedRate = str5;
        }
        if ((i & 32) == 0) {
            this.launchedTokenCount = "";
        } else {
            this.launchedTokenCount = str6;
        }
        if ((i & 64) == 0) {
            this.page = "";
        } else {
            this.page = str7;
        }
        if ((i & 128) == 0) {
            this.pageSize = "";
        } else {
            this.pageSize = str8;
        }
        if ((i & 256) == 0) {
            this.ruggedTokenCount = "";
        } else {
            this.ruggedTokenCount = str9;
        }
        if ((i & 512) == 0) {
            this.ruggedTokenRate = "";
        } else {
            this.ruggedTokenRate = str10;
        }
        if ((i & 1024) == 0) {
            this.totalPage = "";
        } else {
            this.totalPage = str11;
        }
    }

    public static final /* synthetic */ void OLrzqt(DevAnalysisTokenSummary devAnalysisTokenSummary, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.createdTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, devAnalysisTokenSummary.createdTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.creatorAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, devAnalysisTokenSummary.creatorAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.goldenDogCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, devAnalysisTokenSummary.goldenDogCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.goldenDogRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, devAnalysisTokenSummary.goldenDogRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.launchedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, devAnalysisTokenSummary.launchedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.launchedTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, devAnalysisTokenSummary.launchedTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.page, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, devAnalysisTokenSummary.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.pageSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, devAnalysisTokenSummary.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.ruggedTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, devAnalysisTokenSummary.ruggedTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) devAnalysisTokenSummary.ruggedTokenRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, devAnalysisTokenSummary.ruggedTokenRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) devAnalysisTokenSummary.totalPage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, devAnalysisTokenSummary.totalPage);
    }

    public DevAnalysisTokenSummary(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        this.createdTokenCount = str;
        this.creatorAddress = str2;
        this.goldenDogCount = str3;
        this.goldenDogRate = str4;
        this.launchedRate = str5;
        this.launchedTokenCount = str6;
        this.page = str7;
        this.pageSize = str8;
        this.ruggedTokenCount = str9;
        this.ruggedTokenRate = str10;
        this.totalPage = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.market.data.model.DevAnalysisTokenSummary.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DevAnalysisTokenSummary(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }
}
