package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ProfitDetailResponse implements Parcelable {
    private final String apy;
    private final String ccy;
    private final String estimated;
    private final ProfitDetailResponse quote;
    private final String total;
    private final String withdrawable;
    private final String withdrawn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProfitDetailResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ProfitDetailResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitDetailResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProfitDetailResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitDetailResponse[] newArray(int i) {
            return new ProfitDetailResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfitDetailResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProfitDetailResponse copy$default(ProfitDetailResponse profitDetailResponse, String str, String str2, String str3, String str4, String str5, ProfitDetailResponse profitDetailResponse2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profitDetailResponse.ccy;
        }
        if ((i & 2) != 0) {
            str2 = profitDetailResponse.total;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = profitDetailResponse.apy;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = profitDetailResponse.withdrawable;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = profitDetailResponse.withdrawn;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            profitDetailResponse2 = profitDetailResponse.quote;
        }
        ProfitDetailResponse profitDetailResponse3 = profitDetailResponse2;
        if ((i & 64) != 0) {
            str6 = profitDetailResponse.estimated;
        }
        return profitDetailResponse.copy(str, str7, str8, str9, str10, profitDetailResponse3, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.withdrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.withdrawn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component6() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.estimated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, ProfitDetailResponse profitDetailResponse, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ProfitDetailResponse(str, str2, str3, str4, str5, profitDetailResponse, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfitDetailResponse)) {
            return false;
        }
        ProfitDetailResponse profitDetailResponse = (ProfitDetailResponse) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) profitDetailResponse.ccy) && Intrinsics.EZpvd((Object) this.total, (Object) profitDetailResponse.total) && Intrinsics.EZpvd((Object) this.apy, (Object) profitDetailResponse.apy) && Intrinsics.EZpvd((Object) this.withdrawable, (Object) profitDetailResponse.withdrawable) && Intrinsics.EZpvd((Object) this.withdrawn, (Object) profitDetailResponse.withdrawn) && Intrinsics.EZpvd(this.quote, profitDetailResponse.quote) && Intrinsics.EZpvd((Object) this.estimated, (Object) profitDetailResponse.estimated);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimated() {
        return this.estimated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawable() {
        return this.withdrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawn() {
        return this.withdrawn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ccy.hashCode();
        int iHashCode2 = this.total.hashCode();
        int iHashCode3 = this.apy.hashCode();
        int iHashCode4 = this.withdrawable.hashCode();
        int iHashCode5 = this.withdrawn.hashCode();
        ProfitDetailResponse profitDetailResponse = this.quote;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (profitDetailResponse == null ? 0 : profitDetailResponse.hashCode())) * 31) + this.estimated.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfitDetailResponse(ccy=" + this.ccy + ", total=" + this.total + ", apy=" + this.apy + ", withdrawable=" + this.withdrawable + ", withdrawn=" + this.withdrawn + ", quote=" + this.quote + ", estimated=" + this.estimated + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.total);
        parcel.writeString(this.apy);
        parcel.writeString(this.withdrawable);
        parcel.writeString(this.withdrawn);
        ProfitDetailResponse profitDetailResponse = this.quote;
        if (profitDetailResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.estimated);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ProfitDetailResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfitDetailResponse> serializer() {
            return ProfitDetailResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfitDetailResponse(int i, String str, String str2, String str3, String str4, String str5, ProfitDetailResponse profitDetailResponse, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.total = "";
        } else {
            this.total = str2;
        }
        if ((i & 4) == 0) {
            this.apy = "";
        } else {
            this.apy = str3;
        }
        if ((i & 8) == 0) {
            this.withdrawable = "";
        } else {
            this.withdrawable = str4;
        }
        if ((i & 16) == 0) {
            this.withdrawn = "";
        } else {
            this.withdrawn = str5;
        }
        if ((i & 32) == 0) {
            this.quote = null;
        } else {
            this.quote = profitDetailResponse;
        }
        if ((i & 64) == 0) {
            this.estimated = "";
        } else {
            this.estimated = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ProfitDetailResponse profitDetailResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) profitDetailResponse.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, profitDetailResponse.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) profitDetailResponse.total, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, profitDetailResponse.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) profitDetailResponse.apy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, profitDetailResponse.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) profitDetailResponse.withdrawable, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, profitDetailResponse.withdrawable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) profitDetailResponse.withdrawn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, profitDetailResponse.withdrawn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || profitDetailResponse.quote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, ProfitDetailResponse$$serializer.INSTANCE, profitDetailResponse.quote);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) profitDetailResponse.estimated, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, profitDetailResponse.estimated);
    }

    public ProfitDetailResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, ProfitDetailResponse profitDetailResponse, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.ccy = str;
        this.total = str2;
        this.apy = str3;
        this.withdrawable = str4;
        this.withdrawn = str5;
        this.quote = profitDetailResponse;
        this.estimated = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:0x002a: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitDetailResponse) : (r12v0 com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ProfitDetailResponse, java.lang.String):void (m)] (LINE:1665) call: com.okinc.unify_trade.biz.ProfitDetailResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ProfitDetailResponse, java.lang.String):void type: THIS */
    public /* synthetic */ ProfitDetailResponse(String str, String str2, String str3, String str4, String str5, ProfitDetailResponse profitDetailResponse, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : profitDetailResponse, (i & 64) != 0 ? "" : str6);
    }
}
