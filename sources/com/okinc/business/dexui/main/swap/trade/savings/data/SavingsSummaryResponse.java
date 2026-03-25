package com.okinc.business.dexui.main.swap.trade.savings.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SavingsSummaryResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String summaryMonth;
    private final String totalSavingValueUsd;
    private final String totalSurplusValueUsd;
    private final String totalTradeCount;
    private final String totalTradeValueUsd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SavingsSummaryResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SavingsSummaryResponse copy$default(SavingsSummaryResponse savingsSummaryResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsSummaryResponse.summaryMonth;
        }
        if ((i & 2) != 0) {
            str2 = savingsSummaryResponse.totalSurplusValueUsd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = savingsSummaryResponse.totalSavingValueUsd;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = savingsSummaryResponse.totalTradeCount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = savingsSummaryResponse.totalTradeValueUsd;
        }
        return savingsSummaryResponse.copy(str, str6, str7, str8, str5);
    }

    @SerialName("summaryMonth")
    public static /* synthetic */ void getSummaryMonth$annotations() {
    }

    @SerialName("totalSavingValueUsd")
    public static /* synthetic */ void getTotalSavingValueUsd$annotations() {
    }

    @SerialName("totalSurplusValueUsd")
    public static /* synthetic */ void getTotalSurplusValueUsd$annotations() {
    }

    @SerialName("totalTradeCount")
    public static /* synthetic */ void getTotalTradeCount$annotations() {
    }

    @SerialName("totalTradeValueUsd")
    public static /* synthetic */ void getTotalTradeValueUsd$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.summaryMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalSurplusValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalSavingValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalTradeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalTradeValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SavingsSummaryResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SavingsSummaryResponse(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsSummaryResponse)) {
            return false;
        }
        SavingsSummaryResponse savingsSummaryResponse = (SavingsSummaryResponse) obj;
        return Intrinsics.EZpvd((Object) this.summaryMonth, (Object) savingsSummaryResponse.summaryMonth) && Intrinsics.EZpvd((Object) this.totalSurplusValueUsd, (Object) savingsSummaryResponse.totalSurplusValueUsd) && Intrinsics.EZpvd((Object) this.totalSavingValueUsd, (Object) savingsSummaryResponse.totalSavingValueUsd) && Intrinsics.EZpvd((Object) this.totalTradeCount, (Object) savingsSummaryResponse.totalTradeCount) && Intrinsics.EZpvd((Object) this.totalTradeValueUsd, (Object) savingsSummaryResponse.totalTradeValueUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummaryMonth() {
        return this.summaryMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSavingValueUsd() {
        return this.totalSavingValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSurplusValueUsd() {
        return this.totalSurplusValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTradeCount() {
        return this.totalTradeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalTradeValueUsd() {
        return this.totalTradeValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.summaryMonth.hashCode() * 31) + this.totalSurplusValueUsd.hashCode()) * 31) + this.totalSavingValueUsd.hashCode()) * 31) + this.totalTradeCount.hashCode()) * 31) + this.totalTradeValueUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SavingsSummaryResponse(summaryMonth=" + this.summaryMonth + ", totalSurplusValueUsd=" + this.totalSurplusValueUsd + ", totalSavingValueUsd=" + this.totalSavingValueUsd + ", totalTradeCount=" + this.totalTradeCount + ", totalTradeValueUsd=" + this.totalTradeValueUsd + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SavingsSummaryResponse> serializer() {
            return SavingsSummaryResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SavingsSummaryResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.summaryMonth = "";
        } else {
            this.summaryMonth = str;
        }
        if ((i & 2) == 0) {
            this.totalSurplusValueUsd = "";
        } else {
            this.totalSurplusValueUsd = str2;
        }
        if ((i & 4) == 0) {
            this.totalSavingValueUsd = "";
        } else {
            this.totalSavingValueUsd = str3;
        }
        if ((i & 8) == 0) {
            this.totalTradeCount = "";
        } else {
            this.totalTradeCount = str4;
        }
        if ((i & 16) == 0) {
            this.totalTradeValueUsd = "";
        } else {
            this.totalTradeValueUsd = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SavingsSummaryResponse savingsSummaryResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) savingsSummaryResponse.summaryMonth, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, savingsSummaryResponse.summaryMonth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) savingsSummaryResponse.totalSurplusValueUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, savingsSummaryResponse.totalSurplusValueUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) savingsSummaryResponse.totalSavingValueUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, savingsSummaryResponse.totalSavingValueUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) savingsSummaryResponse.totalTradeCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, savingsSummaryResponse.totalTradeCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) savingsSummaryResponse.totalTradeValueUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, savingsSummaryResponse.totalTradeValueUsd);
    }

    public SavingsSummaryResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.summaryMonth = str;
        this.totalSurplusValueUsd = str2;
        this.totalSavingValueUsd = str3;
        this.totalTradeCount = str4;
        this.totalTradeValueUsd = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SavingsSummaryResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
