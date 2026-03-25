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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionPnlResp implements Parcelable {
    private String expireTimePrice;
    private String indexPrice;
    private String selectTimePrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionPnlResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OptionPnlResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionPnlResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OptionPnlResp(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionPnlResp[] newArray(int i) {
            return new OptionPnlResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionPnlResp() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OptionPnlResp copy$default(OptionPnlResp optionPnlResp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionPnlResp.expireTimePrice;
        }
        if ((i & 2) != 0) {
            str2 = optionPnlResp.indexPrice;
        }
        if ((i & 4) != 0) {
            str3 = optionPnlResp.selectTimePrice;
        }
        return optionPnlResp.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.expireTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.indexPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.selectTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionPnlResp copy(String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OptionPnlResp(str, str2, str3);
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
        if (!(obj instanceof OptionPnlResp)) {
            return false;
        }
        OptionPnlResp optionPnlResp = (OptionPnlResp) obj;
        return Intrinsics.EZpvd((Object) this.expireTimePrice, (Object) optionPnlResp.expireTimePrice) && Intrinsics.EZpvd((Object) this.indexPrice, (Object) optionPnlResp.indexPrice) && Intrinsics.EZpvd((Object) this.selectTimePrice, (Object) optionPnlResp.selectTimePrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTimePrice() {
        return this.expireTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndexPrice() {
        return this.indexPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectTimePrice() {
        return this.selectTimePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.expireTimePrice;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.indexPrice.hashCode()) * 31) + this.selectTimePrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireTimePrice(String str) {
        this.expireTimePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndexPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.indexPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectTimePrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selectTimePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionPnlResp(expireTimePrice=" + this.expireTimePrice + ", indexPrice=" + this.indexPrice + ", selectTimePrice=" + this.selectTimePrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.expireTimePrice);
        parcel.writeString(this.indexPrice);
        parcel.writeString(this.selectTimePrice);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionPnlResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionPnlResp> serializer() {
            return OptionPnlResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionPnlResp(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.expireTimePrice = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.indexPrice = "";
        } else {
            this.indexPrice = str2;
        }
        if ((i & 4) == 0) {
            this.selectTimePrice = "";
        } else {
            this.selectTimePrice = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionPnlResp optionPnlResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || optionPnlResp.expireTimePrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, optionPnlResp.expireTimePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) optionPnlResp.indexPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optionPnlResp.indexPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) optionPnlResp.selectTimePrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, optionPnlResp.selectTimePrice);
    }

    public OptionPnlResp(String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.expireTimePrice = str;
        this.indexPrice = str2;
        this.selectTimePrice = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5239) call: com.okinc.unify_trade.biz.OptionPnlResp.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptionPnlResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
