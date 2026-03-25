package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LendingHistoryRecordData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String borrowingYearRate;
    private final String currencyId;
    private final String currencyName;
    private final String dateHour;
    private final String dateHourStr;
    private final String rate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LendingHistoryRecordData copy$default(LendingHistoryRecordData lendingHistoryRecordData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lendingHistoryRecordData.amount;
        }
        if ((i & 2) != 0) {
            str2 = lendingHistoryRecordData.currencyId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = lendingHistoryRecordData.currencyName;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = lendingHistoryRecordData.dateHour;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = lendingHistoryRecordData.dateHourStr;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = lendingHistoryRecordData.rate;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = lendingHistoryRecordData.borrowingYearRate;
        }
        return lendingHistoryRecordData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dateHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dateHourStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.borrowingYearRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LendingHistoryRecordData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new LendingHistoryRecordData(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LendingHistoryRecordData)) {
            return false;
        }
        LendingHistoryRecordData lendingHistoryRecordData = (LendingHistoryRecordData) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) lendingHistoryRecordData.amount) && Intrinsics.EZpvd((Object) this.currencyId, (Object) lendingHistoryRecordData.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) lendingHistoryRecordData.currencyName) && Intrinsics.EZpvd((Object) this.dateHour, (Object) lendingHistoryRecordData.dateHour) && Intrinsics.EZpvd((Object) this.dateHourStr, (Object) lendingHistoryRecordData.dateHourStr) && Intrinsics.EZpvd((Object) this.rate, (Object) lendingHistoryRecordData.rate) && Intrinsics.EZpvd((Object) this.borrowingYearRate, (Object) lendingHistoryRecordData.borrowingYearRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowingYearRate() {
        return this.borrowingYearRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateHour() {
        return this.dateHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateHourStr() {
        return this.dateHourStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.amount.hashCode() * 31) + this.currencyId.hashCode()) * 31) + this.currencyName.hashCode()) * 31) + this.dateHour.hashCode()) * 31) + this.dateHourStr.hashCode()) * 31) + this.rate.hashCode()) * 31) + this.borrowingYearRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LendingHistoryRecordData(amount=" + this.amount + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", dateHour=" + this.dateHour + ", dateHourStr=" + this.dateHourStr + ", rate=" + this.rate + ", borrowingYearRate=" + this.borrowingYearRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LendingHistoryRecordData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LendingHistoryRecordData> serializer() {
            return LendingHistoryRecordData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LendingHistoryRecordData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (107 != (i & 107)) {
            PluginExceptionsKt.throwMissingFieldException(i, 107, LendingHistoryRecordData$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.currencyId = str2;
        if ((i & 4) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str3;
        }
        this.dateHour = str4;
        if ((i & 16) == 0) {
            this.dateHourStr = "";
        } else {
            this.dateHourStr = str5;
        }
        this.rate = str6;
        this.borrowingYearRate = str7;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LendingHistoryRecordData lendingHistoryRecordData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, lendingHistoryRecordData.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, lendingHistoryRecordData.currencyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) lendingHistoryRecordData.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, lendingHistoryRecordData.currencyName);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, lendingHistoryRecordData.dateHour);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) lendingHistoryRecordData.dateHourStr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, lendingHistoryRecordData.dateHourStr);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, lendingHistoryRecordData.rate);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, lendingHistoryRecordData.borrowingYearRate);
    }

    public LendingHistoryRecordData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.amount = str;
        this.currencyId = str2;
        this.currencyName = str3;
        this.dateHour = str4;
        this.dateHourStr = str5;
        this.rate = str6;
        this.borrowingYearRate = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:279) call: com.okinc.unify_trade.biz.LendingHistoryRecordData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LendingHistoryRecordData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, str4, (i & 16) != 0 ? "" : str5, str6, str7);
    }
}
