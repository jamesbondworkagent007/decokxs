package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class QuotePriceBean implements Parcelable {
    private boolean bestOption;
    private String payment;
    private String price;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestOption() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayment() {
        return this.payment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBestOption(boolean z) {
        this.bestOption = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    public /* synthetic */ QuotePriceBean(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.bestOption = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.price = "";
        } else {
            this.price = str;
        }
        if ((i & 4) == 0) {
            this.payment = "";
        } else {
            this.payment = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(QuotePriceBean quotePriceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || quotePriceBean.bestOption) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, quotePriceBean.bestOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quotePriceBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, quotePriceBean.price);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) quotePriceBean.payment, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, quotePriceBean.payment);
    }

    public QuotePriceBean() {
        this.price = "";
        this.payment = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuotePriceBean(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "");
        this.bestOption = parcel.readByte() != 0;
        String string = parcel.readString();
        this.price = string == null ? "" : string;
        String string2 = parcel.readString();
        this.payment = string2 != null ? string2 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeByte(this.bestOption ? (byte) 1 : (byte) 0);
        parcel.writeString(this.price);
        parcel.writeString(this.payment);
    }

    /* JADX INFO: loaded from: classes18.dex */
    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<QuotePriceBean> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.QuotePriceBean.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<QuotePriceBean> serializer() {
            return QuotePriceBean$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuotePriceBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuotePriceBean(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QuotePriceBean[] newArray(int i) {
            return new QuotePriceBean[i];
        }
    }
}
