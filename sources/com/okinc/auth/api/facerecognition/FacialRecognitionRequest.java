package com.okinc.auth.api.facerecognition;

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
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FacialRecognitionRequest implements Parcelable {
    public static final Parcelable.Creator<FacialRecognitionRequest> CREATOR = new Creator();
    public final String AEQbTJ;
    public final BusinessId EZpvd;
    public final EntryPoint KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final Sdk gEmmrt;
    public final Phone valueOf;

    public static final class Creator implements Parcelable.Creator<FacialRecognitionRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FacialRecognitionRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FacialRecognitionRequest(EntryPoint.valueOf(parcel.readString()), (Sdk) parcel.readParcelable(FacialRecognitionRequest.class.getClassLoader()), BusinessId.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Phone.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FacialRecognitionRequest[] newArray(int i) {
            return new FacialRecognitionRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacialRecognitionRequest KWHzl(@NotNull EntryPoint entryPoint, @NotNull Sdk sdk, @NotNull BusinessId businessId, String str, String str2, Phone phone, String str3, String str4) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        Intrinsics.checkNotNullParameter(sdk, "");
        Intrinsics.checkNotNullParameter(businessId, "");
        return new FacialRecognitionRequest(entryPoint, sdk, businessId, str, str2, phone, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BusinessId copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof FacialRecognitionRequest)) {
            return false;
        }
        FacialRecognitionRequest facialRecognitionRequest = (FacialRecognitionRequest) obj;
        return this.KWHzl == facialRecognitionRequest.KWHzl && Intrinsics.EZpvd(this.gEmmrt, facialRecognitionRequest.gEmmrt) && this.EZpvd == facialRecognitionRequest.EZpvd && Intrinsics.EZpvd((Object) this.copydefault, (Object) facialRecognitionRequest.copydefault) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) facialRecognitionRequest.djBIcL) && Intrinsics.EZpvd(this.valueOf, facialRecognitionRequest.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) facialRecognitionRequest.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) facialRecognitionRequest.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        String str = this.copydefault;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.djBIcL;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Phone phone = this.valueOf;
        int iHashCode6 = phone == null ? 0 : phone.hashCode();
        String str3 = this.OLrzqt;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FacialRecognitionRequest(entryPoint=" + this.KWHzl + ", sdk=" + this.gEmmrt + ", businessId=" + this.EZpvd + ", businessRecordId=" + this.copydefault + ", uuid=" + this.djBIcL + ", phone=" + this.valueOf + ", email=" + this.OLrzqt + ", corStrategy=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeParcelable(this.gEmmrt, i);
        parcel.writeString(this.EZpvd.name());
        parcel.writeString(this.copydefault);
        parcel.writeString(this.djBIcL);
        Phone phone = this.valueOf;
        if (phone == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phone.writeToParcel(parcel, i);
        }
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
    }

    public FacialRecognitionRequest(@NotNull EntryPoint entryPoint, @NotNull Sdk sdk, @NotNull BusinessId businessId, String str, String str2, Phone phone, String str3, String str4) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        Intrinsics.checkNotNullParameter(sdk, "");
        Intrinsics.checkNotNullParameter(businessId, "");
        this.KWHzl = entryPoint;
        this.gEmmrt = sdk;
        this.EZpvd = businessId;
        this.copydefault = str;
        this.djBIcL = str2;
        this.valueOf = phone;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
    }

    public static abstract class Sdk implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.facerecognition.FacialRecognitionRequest.Sdk.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Sdk(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Sdk() {
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Ali extends Sdk implements Parcelable {
            public static final Parcelable.Creator<Ali> CREATOR = new Creator();
            public final Integer EZpvd;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class Creator implements Parcelable.Creator<Ali> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ali createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Ali(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ali[] newArray(int i) {
                    return new Ali[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Ali copy$default(Ali ali, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = ali.EZpvd;
                }
                return ali.OLrzqt(num);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Ali OLrzqt(Integer num) {
                return new Ali(num);
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
                return (obj instanceof Ali) && Intrinsics.EZpvd(this.EZpvd, ((Ali) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Integer num = this.EZpvd;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Ali(aliResetApplyId=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "");
                Integer num = this.EZpvd;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }

            public Ali(Integer num) {
                super(null);
                this.EZpvd = num;
            }
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Aws extends Sdk implements Parcelable {
            public static final Aws AEQbTJ = new Aws();
            public static final Parcelable.Creator<Aws> CREATOR = new Creator();

            /* JADX INFO: loaded from: classes22.dex */
            public static final class Creator implements Parcelable.Creator<Aws> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Aws createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Aws.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Aws[] newArray(int i) {
                    return new Aws[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Aws() {
                super(null);
            }
        }
    }

    @Serializable
    public static final class Phone implements Parcelable {
        public static final int $stable = 0;
        public final String countryCode;
        public final String phoneNumber;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Phone> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Phone(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i) {
                return new Phone[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phone.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = phone.phoneNumber;
            }
            return phone.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Phone copydefault(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Phone(str, str2);
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
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            return Intrinsics.EZpvd((Object) this.countryCode, (Object) phone.countryCode) && Intrinsics.EZpvd((Object) this.phoneNumber, (Object) phone.phoneNumber);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.countryCode.hashCode() * 31) + this.phoneNumber.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Phone(countryCode=" + this.countryCode + ", phoneNumber=" + this.phoneNumber + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.countryCode);
            parcel.writeString(this.phoneNumber);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.facerecognition.FacialRecognitionRequest.Phone.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Phone> serializer() {
                return FacialRecognitionRequest$Phone$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Phone(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, FacialRecognitionRequest$Phone$$serializer.INSTANCE.getDescriptor());
            }
            this.countryCode = str;
            this.phoneNumber = str2;
        }

        public static final /* synthetic */ void copydefault(Phone phone, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, phone.countryCode);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, phone.phoneNumber);
        }

        public Phone(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.countryCode = str;
            this.phoneNumber = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EntryPoint {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint NEW_DEVICE = new EntryPoint("NEW_DEVICE", 0, "new_device");
        public static final EntryPoint SELF_UNFREEZE = new EntryPoint("SELF_UNFREEZE", 1, "self_unfreeze");
        public static final EntryPoint UNKNOWN = new EntryPoint("UNKNOWN", 2, "unknown");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{NEW_DEVICE, SELF_UNFREEZE, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private EntryPoint(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(entryPointArr$values);
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BusinessId {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BusinessId[] $VALUES;
        private final int id;
        public static final BusinessId NEW_DEVICE = new BusinessId("NEW_DEVICE", 0, 8);
        public static final BusinessId CHANGE_MOBILE = new BusinessId("CHANGE_MOBILE", 1, 5);
        public static final BusinessId REBIND_2FA = new BusinessId("REBIND_2FA", 2, 7);
        public static final BusinessId NON_AUTH_REBIND_2FA = new BusinessId("NON_AUTH_REBIND_2FA", 3, 7);
        public static final BusinessId FORGET_PASSWORD = new BusinessId("FORGET_PASSWORD", 4, 6);
        public static final BusinessId SELF_UNFREEZE = new BusinessId("SELF_UNFREEZE", 5, 1);
        public static final BusinessId UNKNOWN = new BusinessId("UNKNOWN", 6, 17);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BusinessId[] $values() {
            return new BusinessId[]{NEW_DEVICE, CHANGE_MOBILE, REBIND_2FA, NON_AUTH_REBIND_2FA, FORGET_PASSWORD, SELF_UNFREEZE, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BusinessId> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getId() {
            return this.id;
        }

        private BusinessId(String str, int i, int i2) {
            this.id = i2;
        }

        static {
            BusinessId[] businessIdArr$values = $values();
            $VALUES = businessIdArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(businessIdArr$values);
        }

        public static BusinessId valueOf(String str) {
            return (BusinessId) Enum.valueOf(BusinessId.class, str);
        }

        public static BusinessId[] values() {
            return (BusinessId[]) $VALUES.clone();
        }
    }
}
