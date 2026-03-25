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
public final class BestQuoteItem implements Parcelable {
    private String clRfqId;
    private String px;
    private String quoteId;
    private String quoteSide;
    private String rfqId;
    private String state;
    private String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BestQuoteItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BestQuoteItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BestQuoteItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BestQuoteItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BestQuoteItem[] newArray(int i) {
            return new BestQuoteItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BestQuoteItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BestQuoteItem copy$default(BestQuoteItem bestQuoteItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bestQuoteItem.quoteId;
        }
        if ((i & 2) != 0) {
            str2 = bestQuoteItem.rfqId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = bestQuoteItem.clRfqId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = bestQuoteItem.validUntil;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = bestQuoteItem.state;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = bestQuoteItem.quoteSide;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = bestQuoteItem.px;
        }
        return bestQuoteItem.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BestQuoteItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new BestQuoteItem(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof BestQuoteItem)) {
            return false;
        }
        BestQuoteItem bestQuoteItem = (BestQuoteItem) obj;
        return Intrinsics.EZpvd((Object) this.quoteId, (Object) bestQuoteItem.quoteId) && Intrinsics.EZpvd((Object) this.rfqId, (Object) bestQuoteItem.rfqId) && Intrinsics.EZpvd((Object) this.clRfqId, (Object) bestQuoteItem.clRfqId) && Intrinsics.EZpvd((Object) this.validUntil, (Object) bestQuoteItem.validUntil) && Intrinsics.EZpvd((Object) this.state, (Object) bestQuoteItem.state) && Intrinsics.EZpvd((Object) this.quoteSide, (Object) bestQuoteItem.quoteSide) && Intrinsics.EZpvd((Object) this.px, (Object) bestQuoteItem.px);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClRfqId() {
        return this.clRfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSide() {
        return this.quoteSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqId() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidUntil() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.quoteId.hashCode() * 31) + this.rfqId.hashCode()) * 31) + this.clRfqId.hashCode()) * 31) + this.validUntil.hashCode()) * 31) + this.state.hashCode()) * 31) + this.quoteSide.hashCode()) * 31) + this.px.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClRfqId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clRfqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRfqId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rfqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidUntil(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.validUntil = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BestQuoteItem(quoteId=" + this.quoteId + ", rfqId=" + this.rfqId + ", clRfqId=" + this.clRfqId + ", validUntil=" + this.validUntil + ", state=" + this.state + ", quoteSide=" + this.quoteSide + ", px=" + this.px + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.quoteId);
        parcel.writeString(this.rfqId);
        parcel.writeString(this.clRfqId);
        parcel.writeString(this.validUntil);
        parcel.writeString(this.state);
        parcel.writeString(this.quoteSide);
        parcel.writeString(this.px);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BestQuoteItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BestQuoteItem> serializer() {
            return BestQuoteItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BestQuoteItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str;
        }
        if ((i & 2) == 0) {
            this.rfqId = "";
        } else {
            this.rfqId = str2;
        }
        if ((i & 4) == 0) {
            this.clRfqId = "";
        } else {
            this.clRfqId = str3;
        }
        if ((i & 8) == 0) {
            this.validUntil = "";
        } else {
            this.validUntil = str4;
        }
        if ((i & 16) == 0) {
            this.state = "";
        } else {
            this.state = str5;
        }
        if ((i & 32) == 0) {
            this.quoteSide = "";
        } else {
            this.quoteSide = str6;
        }
        if ((i & 64) == 0) {
            this.px = "";
        } else {
            this.px = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BestQuoteItem bestQuoteItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bestQuoteItem.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bestQuoteItem.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bestQuoteItem.rfqId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bestQuoteItem.rfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bestQuoteItem.clRfqId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bestQuoteItem.clRfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bestQuoteItem.validUntil, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bestQuoteItem.validUntil);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bestQuoteItem.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, bestQuoteItem.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) bestQuoteItem.quoteSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, bestQuoteItem.quoteSide);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) bestQuoteItem.px, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, bestQuoteItem.px);
    }

    public BestQuoteItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.quoteId = str;
        this.rfqId = str2;
        this.clRfqId = str3;
        this.validUntil = str4;
        this.state = str5;
        this.quoteSide = str6;
        this.px = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5093) call: com.okinc.unify_trade.biz.BestQuoteItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BestQuoteItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
