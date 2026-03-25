package com.okinc.referral.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC47221tlu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AddressItem implements Parcelable, InterfaceC47221tlu {
    private String identifier;
    private String name;
    private String num;
    private String path;
    private int position;
    private String primary;
    private double primarySimilarity;
    private String searchNum;
    private String secondary;
    private double secondarySimilarity;
    private int state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressItem> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<AddressItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressItem[] newArray(int i) {
            return new AddressItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressItem() {
        this(0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component10() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component11() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.searchNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.identifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressItem copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5, String str6, String str7, double d, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AddressItem(i, str, str2, str3, str4, i2, str5, str6, str7, d, d2);
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
        if (!(obj instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) obj;
        return this.position == addressItem.position && Intrinsics.EZpvd((Object) this.name, (Object) addressItem.name) && Intrinsics.EZpvd((Object) this.num, (Object) addressItem.num) && Intrinsics.EZpvd((Object) this.searchNum, (Object) addressItem.searchNum) && Intrinsics.EZpvd((Object) this.identifier, (Object) addressItem.identifier) && this.state == addressItem.state && Intrinsics.EZpvd((Object) this.path, (Object) addressItem.path) && Intrinsics.EZpvd((Object) this.primary, (Object) addressItem.primary) && Intrinsics.EZpvd((Object) this.secondary, (Object) addressItem.secondary) && Double.compare(this.primarySimilarity, addressItem.primarySimilarity) == 0 && Double.compare(this.secondarySimilarity, addressItem.secondarySimilarity) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNum() {
        return this.num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getPrimary() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.primarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSearchNum() {
        return this.searchNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getSecondary() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.position);
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.num.hashCode();
        int iHashCode4 = this.searchNum.hashCode();
        int iHashCode5 = this.identifier.hashCode();
        int iHashCode6 = Integer.hashCode(this.state);
        int iHashCode7 = this.path.hashCode();
        String str = this.primary;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.secondary;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.primarySimilarity)) * 31) + Double.hashCode(this.secondarySimilarity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.identifier = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.num = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrimary(String str) {
        this.primary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.primarySimilarity = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSecondary(String str) {
        this.secondary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.secondarySimilarity = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(int i) {
        this.state = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressItem(position=" + this.position + ", name=" + this.name + ", num=" + this.num + ", searchNum=" + this.searchNum + ", identifier=" + this.identifier + ", state=" + this.state + ", path=" + this.path + ", primary=" + this.primary + ", secondary=" + this.secondary + ", primarySimilarity=" + this.primarySimilarity + ", secondarySimilarity=" + this.secondarySimilarity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.position);
        parcel.writeString(this.name);
        parcel.writeString(this.num);
        parcel.writeString(this.searchNum);
        parcel.writeString(this.identifier);
        parcel.writeInt(this.state);
        parcel.writeString(this.path);
        parcel.writeString(this.primary);
        parcel.writeString(this.secondary);
        parcel.writeDouble(this.primarySimilarity);
        parcel.writeDouble(this.secondarySimilarity);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.referral.biz.net.bean.AddressItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressItem> serializer() {
            return AddressItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressItem(int i, int i2, String str, String str2, String str3, String str4, int i3, String str5, String str6, String str7, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        this.position = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.num = "";
        } else {
            this.num = str2;
        }
        if ((i & 8) == 0) {
            this.searchNum = "";
        } else {
            this.searchNum = str3;
        }
        if ((i & 16) == 0) {
            this.identifier = "";
        } else {
            this.identifier = str4;
        }
        if ((i & 32) == 0) {
            this.state = 0;
        } else {
            this.state = i3;
        }
        if ((i & 64) == 0) {
            this.path = "";
        } else {
            this.path = str5;
        }
        if ((i & 128) == 0) {
            this.primary = this.name;
        } else {
            this.primary = str6;
        }
        if ((i & 256) == 0) {
            this.secondary = this.searchNum;
        } else {
            this.secondary = str7;
        }
        if ((i & 512) == 0) {
            this.primarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.primarySimilarity = d;
        }
        if ((i & 1024) == 0) {
            this.secondarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.secondarySimilarity = d2;
        }
    }

    public static final /* synthetic */ void write$Self$OKReferral_referral_impl(AddressItem addressItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressItem.position != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, addressItem.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addressItem.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, addressItem.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressItem.num, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, addressItem.num);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) addressItem.searchNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, addressItem.searchNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) addressItem.identifier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, addressItem.identifier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || addressItem.state != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, addressItem.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) addressItem.path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, addressItem.path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) addressItem.getPrimary(), (Object) addressItem.name)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, addressItem.getPrimary());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) addressItem.getSecondary(), (Object) addressItem.searchNum)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, addressItem.getSecondary());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || Double.compare(addressItem.getPrimarySimilarity(), AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 9, addressItem.getPrimarySimilarity());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Double.compare(addressItem.getSecondarySimilarity(), AudioStats.AUDIO_AMPLITUDE_NONE) == 0) {
            return;
        }
        compositeEncoder.encodeDoubleElement(serialDescriptor, 10, addressItem.getSecondarySimilarity());
    }

    public AddressItem(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5, String str6, String str7, double d, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.position = i;
        this.name = str;
        this.num = str2;
        this.searchNum = str3;
        this.identifier = str4;
        this.state = i2;
        this.path = str5;
        this.primary = str6;
        this.secondary = str7;
        this.primarySimilarity = d;
        this.secondarySimilarity = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddressItem(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, double d, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4 = (i3 & 1) != 0 ? -1 : i;
        String str8 = (i3 & 2) != 0 ? "" : str;
        String str9 = (i3 & 4) != 0 ? "" : str2;
        String str10 = (i3 & 8) != 0 ? "" : str3;
        this(i4, str8, str9, str10, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? str5 : "", (i3 & 128) != 0 ? str8 : str6, (i3 & 256) != 0 ? str10 : str7, (i3 & 512) != 0 ? 0.0d : d, (i3 & 1024) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
