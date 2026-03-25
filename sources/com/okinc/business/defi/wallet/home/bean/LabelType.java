package com.okinc.business.defi.wallet.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LabelType implements Parcelable {
    public static final int $stable = 0;
    public final int labelType;
    public final String twitterLink;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LabelType> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LabelType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabelType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LabelType(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabelType[] newArray(int i) {
            return new LabelType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LabelType copy$default(LabelType labelType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = labelType.labelType;
        }
        if ((i2 & 2) != 0) {
            str = labelType.twitterLink;
        }
        return labelType.KWHzl(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LabelType KWHzl(int i, String str) {
        return new LabelType(i, str);
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
        if (!(obj instanceof LabelType)) {
            return false;
        }
        LabelType labelType = (LabelType) obj;
        return this.labelType == labelType.labelType && Intrinsics.EZpvd((Object) this.twitterLink, (Object) labelType.twitterLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.labelType);
        String str = this.twitterLink;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LabelType(labelType=" + this.labelType + ", twitterLink=" + this.twitterLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.labelType);
        parcel.writeString(this.twitterLink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.LabelType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LabelType> serializer() {
            return LabelType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LabelType(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, LabelType$$serializer.INSTANCE.getDescriptor());
        }
        this.labelType = i2;
        if ((i & 2) == 0) {
            this.twitterLink = null;
        } else {
            this.twitterLink = str;
        }
    }

    public static final /* synthetic */ void OLrzqt(LabelType labelType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, labelType.labelType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && labelType.twitterLink == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, labelType.twitterLink);
    }

    public LabelType(int i, String str) {
        this.labelType = i;
        this.twitterLink = str;
    }
}
