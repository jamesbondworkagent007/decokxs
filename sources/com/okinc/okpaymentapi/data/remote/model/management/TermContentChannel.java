package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TermContentChannel implements Parcelable {
    public static final int $stable = 0;
    private final TermsURLContentData content;
    private final int mode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TermContentChannel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TermContentChannel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TermContentChannel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TermContentChannel(parcel.readInt(), parcel.readInt() == 0 ? null : TermsURLContentData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TermContentChannel[] newArray(int i) {
            return new TermContentChannel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TermContentChannel() {
        this(0, (TermsURLContentData) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TermContentChannel copy$default(TermContentChannel termContentChannel, int i, TermsURLContentData termsURLContentData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = termContentChannel.mode;
        }
        if ((i2 & 2) != 0) {
            termsURLContentData = termContentChannel.content;
        }
        return termContentChannel.copy(i, termsURLContentData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermsURLContentData component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannel copy(int i, TermsURLContentData termsURLContentData) {
        return new TermContentChannel(i, termsURLContentData);
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
        if (!(obj instanceof TermContentChannel)) {
            return false;
        }
        TermContentChannel termContentChannel = (TermContentChannel) obj;
        return this.mode == termContentChannel.mode && Intrinsics.EZpvd(this.content, termContentChannel.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermsURLContentData getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mode);
        TermsURLContentData termsURLContentData = this.content;
        return (iHashCode * 31) + (termsURLContentData == null ? 0 : termsURLContentData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TermContentChannel(mode=" + this.mode + ", content=" + this.content + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.mode);
        TermsURLContentData termsURLContentData = this.content;
        if (termsURLContentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termsURLContentData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TermContentChannel> serializer() {
            return TermContentChannel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TermContentChannel(int i, int i2, TermsURLContentData termsURLContentData, SerializationConstructorMarker serializationConstructorMarker) {
        this.mode = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = termsURLContentData;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(TermContentChannel termContentChannel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || termContentChannel.mode != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, termContentChannel.mode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && termContentChannel.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TermsURLContentData$$serializer.INSTANCE, termContentChannel.content);
    }

    public TermContentChannel(int i, TermsURLContentData termsURLContentData) {
        this.mode = i;
        this.content = termsURLContentData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TermsURLContentData:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.TermsURLContentData) : (r2v0 com.okinc.okpaymentapi.data.remote.model.management.TermsURLContentData))
 A[MD:(int, com.okinc.okpaymentapi.data.remote.model.management.TermsURLContentData):void (m)] (LINE:392) call: com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel.<init>(int, com.okinc.okpaymentapi.data.remote.model.management.TermsURLContentData):void type: THIS */
    public /* synthetic */ TermContentChannel(int i, TermsURLContentData termsURLContentData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : termsURLContentData);
    }
}
