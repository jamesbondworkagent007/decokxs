package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import com.okinc.localization2.bean.AppLocaleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C6614aSf;
import o.C6617aSi;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AuthenticationStartResponse implements Parcelable {

    @SerializedName("additionalData")
    private final List<AdditionalData> additionalData;

    @SerializedName("publicKey")
    private final PublicKey publicKey;

    @SerializedName("userHandle")
    private final String userHandle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AuthenticationStartResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AuthenticationStartResponse$AdditionalData$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<AuthenticationStartResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationStartResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            PublicKey publicKeyCreateFromParcel = parcel.readInt() == 0 ? null : PublicKey.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(AdditionalData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AuthenticationStartResponse(publicKeyCreateFromParcel, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticationStartResponse[] newArray(int i) {
            return new AuthenticationStartResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthenticationStartResponse() {
        this((PublicKey) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthenticationStartResponse copy$default(AuthenticationStartResponse authenticationStartResponse, PublicKey publicKey, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            publicKey = authenticationStartResponse.publicKey;
        }
        if ((i & 2) != 0) {
            list = authenticationStartResponse.additionalData;
        }
        if ((i & 4) != 0) {
            str = authenticationStartResponse.userHandle;
        }
        return authenticationStartResponse.copy(publicKey, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey component1() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdditionalData> component2() {
        return this.additionalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userHandle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationStartResponse copy(PublicKey publicKey, List<AdditionalData> list, String str) {
        return new AuthenticationStartResponse(publicKey, list, str);
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
        if (!(obj instanceof AuthenticationStartResponse)) {
            return false;
        }
        AuthenticationStartResponse authenticationStartResponse = (AuthenticationStartResponse) obj;
        return Intrinsics.EZpvd(this.publicKey, authenticationStartResponse.publicKey) && Intrinsics.EZpvd(this.additionalData, authenticationStartResponse.additionalData) && Intrinsics.EZpvd((Object) this.userHandle, (Object) authenticationStartResponse.userHandle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdditionalData> getAdditionalData() {
        return this.additionalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserHandle() {
        return this.userHandle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PublicKey publicKey = this.publicKey;
        int iHashCode = publicKey == null ? 0 : publicKey.hashCode();
        List<AdditionalData> list = this.additionalData;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.userHandle;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthenticationStartResponse(publicKey=" + this.publicKey + ", additionalData=" + this.additionalData + ", userHandle=" + this.userHandle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PublicKey publicKey = this.publicKey;
        if (publicKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicKey.writeToParcel(parcel, i);
        }
        List<AdditionalData> list = this.additionalData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AdditionalData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.userHandle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuthenticationStartResponse> serializer() {
            return AuthenticationStartResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthenticationStartResponse(int i, PublicKey publicKey, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = publicKey;
        }
        if ((i & 2) == 0) {
            this.additionalData = null;
        } else {
            this.additionalData = list;
        }
        if ((i & 4) == 0) {
            this.userHandle = null;
        } else {
            this.userHandle = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(AuthenticationStartResponse authenticationStartResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || authenticationStartResponse.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AuthenticationStartResponse$PublicKey$$serializer.INSTANCE, authenticationStartResponse.publicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || authenticationStartResponse.additionalData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], authenticationStartResponse.additionalData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && authenticationStartResponse.userHandle == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, authenticationStartResponse.userHandle);
    }

    public AuthenticationStartResponse(PublicKey publicKey, List<AdditionalData> list, String str) {
        this.publicKey = publicKey;
        this.additionalData = list;
        this.userHandle = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey) : (r2v0 com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey, java.util.List<com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$AdditionalData>, java.lang.String):void (m)] (LINE:24) call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.<init>(com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AuthenticationStartResponse(PublicKey publicKey, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : publicKey, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }

    @Serializable
    public static final class DeviceWithV2Passkey implements Parcelable {
        public static final int $stable = 0;

        @SerializedName("deviceName")
        private final String deviceName;

        @SerializedName("lastActiveTime")
        private final Long lastActiveTime;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<DeviceWithV2Passkey> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<DeviceWithV2Passkey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceWithV2Passkey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DeviceWithV2Passkey(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeviceWithV2Passkey[] newArray(int i) {
                return new DeviceWithV2Passkey[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DeviceWithV2Passkey() {
            this((String) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DeviceWithV2Passkey copy$default(DeviceWithV2Passkey deviceWithV2Passkey, String str, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceWithV2Passkey.deviceName;
            }
            if ((i & 2) != 0) {
                l = deviceWithV2Passkey.lastActiveTime;
            }
            return deviceWithV2Passkey.copy(str, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.deviceName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component2() {
            return this.lastActiveTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceWithV2Passkey copy(String str, Long l) {
            return new DeviceWithV2Passkey(str, l);
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
            if (!(obj instanceof DeviceWithV2Passkey)) {
                return false;
            }
            DeviceWithV2Passkey deviceWithV2Passkey = (DeviceWithV2Passkey) obj;
            return Intrinsics.EZpvd((Object) this.deviceName, (Object) deviceWithV2Passkey.deviceName) && Intrinsics.EZpvd(this.lastActiveTime, deviceWithV2Passkey.lastActiveTime);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeviceName() {
            return this.deviceName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getLastActiveTime() {
            return this.lastActiveTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.deviceName;
            int iHashCode = str == null ? 0 : str.hashCode();
            Long l = this.lastActiveTime;
            return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DeviceWithV2Passkey(deviceName=" + this.deviceName + ", lastActiveTime=" + this.lastActiveTime + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.deviceName);
            Long l = this.lastActiveTime;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.DeviceWithV2Passkey.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<DeviceWithV2Passkey> serializer() {
                return AuthenticationStartResponse$DeviceWithV2Passkey$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DeviceWithV2Passkey(int i, String str, Long l, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.deviceName = null;
            } else {
                this.deviceName = str;
            }
            if ((i & 2) == 0) {
                this.lastActiveTime = null;
            } else {
                this.lastActiveTime = l;
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_impl(DeviceWithV2Passkey deviceWithV2Passkey, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deviceWithV2Passkey.deviceName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, deviceWithV2Passkey.deviceName);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && deviceWithV2Passkey.lastActiveTime == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, deviceWithV2Passkey.lastActiveTime);
        }

        public DeviceWithV2Passkey(String str, Long l) {
            this.deviceName = str;
            this.lastActiveTime = l;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long):void (m)] (LINE:36) call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.DeviceWithV2Passkey.<init>(java.lang.String, java.lang.Long):void type: THIS */
        public /* synthetic */ DeviceWithV2Passkey(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
        }
    }

    @Serializable
    public static final class AdditionalData implements Parcelable {

        @SerializedName("credentialId")
        private final String credentialId;

        @SerializedName("credentialType")
        private final String credentialType;

        @SerializedName("currentDevice")
        private final Boolean currentDevice;

        @SerializedName("deviceName")
        private final String deviceName;

        @SerializedName("devicesWithV2Passkey")
        private final List<DeviceWithV2Passkey> devicesWithV2Passkey;

        @SerializedName(AppLocaleInfo.KEY_DISPLAY_NAME)
        private final String displayName;

        @SerializedName("inHouse")
        private final Boolean inHouse;

        @SerializedName("inHouseVer")
        private final Integer inHouseVer;

        @SerializedName("lastUsedTimestamp")
        private final Long lastUsedTimestamp;

        @SerializedName("registrationTimestamp")
        private final Long registrationTimestamp;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<AdditionalData> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AuthenticationStartResponse$DeviceWithV2Passkey$$serializer.INSTANCE)};

        public static final class Creator implements Parcelable.Creator<AdditionalData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(DeviceWithV2Passkey.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new AdditionalData(string, lValueOf, lValueOf2, boolValueOf, boolValueOf2, numValueOf, string2, string3, string4, arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalData[] newArray(int i) {
                return new AdditionalData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AdditionalData() {
            this((String) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.credentialType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DeviceWithV2Passkey> component10() {
            return this.devicesWithV2Passkey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component2() {
            return this.lastUsedTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.registrationTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component4() {
            return this.currentDevice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component5() {
            return this.inHouse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component6() {
            return this.inHouseVer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.deviceName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.credentialId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdditionalData copy(String str, Long l, Long l2, Boolean bool, Boolean bool2, Integer num, String str2, String str3, String str4, List<DeviceWithV2Passkey> list) {
            return new AdditionalData(str, l, l2, bool, bool2, num, str2, str3, str4, list);
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
            if (!(obj instanceof AdditionalData)) {
                return false;
            }
            AdditionalData additionalData = (AdditionalData) obj;
            return Intrinsics.EZpvd((Object) this.credentialType, (Object) additionalData.credentialType) && Intrinsics.EZpvd(this.lastUsedTimestamp, additionalData.lastUsedTimestamp) && Intrinsics.EZpvd(this.registrationTimestamp, additionalData.registrationTimestamp) && Intrinsics.EZpvd(this.currentDevice, additionalData.currentDevice) && Intrinsics.EZpvd(this.inHouse, additionalData.inHouse) && Intrinsics.EZpvd(this.inHouseVer, additionalData.inHouseVer) && Intrinsics.EZpvd((Object) this.displayName, (Object) additionalData.displayName) && Intrinsics.EZpvd((Object) this.deviceName, (Object) additionalData.deviceName) && Intrinsics.EZpvd((Object) this.credentialId, (Object) additionalData.credentialId) && Intrinsics.EZpvd(this.devicesWithV2Passkey, additionalData.devicesWithV2Passkey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCredentialId() {
            return this.credentialId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCredentialType() {
            return this.credentialType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCurrentDevice() {
            return this.currentDevice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeviceName() {
            return this.deviceName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DeviceWithV2Passkey> getDevicesWithV2Passkey() {
            return this.devicesWithV2Passkey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getInHouse() {
            return this.inHouse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getInHouseVer() {
            return this.inHouseVer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getLastUsedTimestamp() {
            return this.lastUsedTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getRegistrationTimestamp() {
            return this.registrationTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.credentialType;
            int iHashCode = str == null ? 0 : str.hashCode();
            Long l = this.lastUsedTimestamp;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            Long l2 = this.registrationTimestamp;
            int iHashCode3 = l2 == null ? 0 : l2.hashCode();
            Boolean bool = this.currentDevice;
            int iHashCode4 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.inHouse;
            int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
            Integer num = this.inHouseVer;
            int iHashCode6 = num == null ? 0 : num.hashCode();
            String str2 = this.displayName;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.deviceName;
            int iHashCode8 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.credentialId;
            int iHashCode9 = str4 == null ? 0 : str4.hashCode();
            List<DeviceWithV2Passkey> list = this.devicesWithV2Passkey;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.credentialType);
            Long l = this.lastUsedTimestamp;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Long l2 = this.registrationTimestamp;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            Boolean bool = this.currentDevice;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.inHouse;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Integer num = this.inHouseVer;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.displayName);
            parcel.writeString(this.deviceName);
            parcel.writeString(this.credentialId);
            List<DeviceWithV2Passkey> list = this.devicesWithV2Passkey;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DeviceWithV2Passkey> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.AdditionalData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AdditionalData> serializer() {
                return AuthenticationStartResponse$AdditionalData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AdditionalData(int i, String str, Long l, Long l2, Boolean bool, Boolean bool2, Integer num, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.credentialType = null;
            } else {
                this.credentialType = str;
            }
            if ((i & 2) == 0) {
                this.lastUsedTimestamp = null;
            } else {
                this.lastUsedTimestamp = l;
            }
            if ((i & 4) == 0) {
                this.registrationTimestamp = null;
            } else {
                this.registrationTimestamp = l2;
            }
            if ((i & 8) == 0) {
                this.currentDevice = null;
            } else {
                this.currentDevice = bool;
            }
            if ((i & 16) == 0) {
                this.inHouse = null;
            } else {
                this.inHouse = bool2;
            }
            if ((i & 32) == 0) {
                this.inHouseVer = null;
            } else {
                this.inHouseVer = num;
            }
            if ((i & 64) == 0) {
                this.displayName = null;
            } else {
                this.displayName = str2;
            }
            if ((i & 128) == 0) {
                this.deviceName = null;
            } else {
                this.deviceName = str3;
            }
            if ((i & 256) == 0) {
                this.credentialId = null;
            } else {
                this.credentialId = str4;
            }
            if ((i & 512) == 0) {
                this.devicesWithV2Passkey = null;
            } else {
                this.devicesWithV2Passkey = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_impl(AdditionalData additionalData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || additionalData.credentialType != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, additionalData.credentialType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || additionalData.lastUsedTimestamp != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, additionalData.lastUsedTimestamp);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || additionalData.registrationTimestamp != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, additionalData.registrationTimestamp);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || additionalData.currentDevice != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, additionalData.currentDevice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || additionalData.inHouse != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, additionalData.inHouse);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || additionalData.inHouseVer != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, additionalData.inHouseVer);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || additionalData.displayName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, additionalData.displayName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || additionalData.deviceName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, additionalData.deviceName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || additionalData.credentialId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, additionalData.credentialId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && additionalData.devicesWithV2Passkey == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], additionalData.devicesWithV2Passkey);
        }

        public AdditionalData(String str, Long l, Long l2, Boolean bool, Boolean bool2, Integer num, String str2, String str3, String str4, List<DeviceWithV2Passkey> list) {
            this.credentialType = str;
            this.lastUsedTimestamp = l;
            this.registrationTimestamp = l2;
            this.currentDevice = bool;
            this.inHouse = bool2;
            this.inHouseVer = num;
            this.displayName = str2;
            this.deviceName = str3;
            this.credentialId = str4;
            this.devicesWithV2Passkey = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$DeviceWithV2Passkey>):void (m)] (LINE:46) call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.AdditionalData.<init>(java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ AdditionalData(String str, Long l, Long l2, Boolean bool, Boolean bool2, Integer num, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? list : null);
        }

        public String toString() {
            return "Device(currentDevice=" + this.currentDevice + ", inHouse=" + this.inHouse + ", displayName=" + this.displayName + ", credentialId=" + this.credentialId + ", devicesWithV2Passkey=" + this.devicesWithV2Passkey + ")";
        }
    }

    @Serializable
    public static final class PublicKey implements Parcelable {

        @SerializedName("allowCredentials")
        private final List<CredentialDescriptor> allowCredentials;

        @SerializedName(ClientData.KEY_CHALLENGE)
        private final String challenge;

        @SerializedName("extensions")
        private final Extensions extensions;

        @SerializedName("rpId")
        private final String rpId;

        @SerializedName("userVerification")
        private final String userVerification;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<PublicKey> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(AuthenticationStartResponse$CredentialDescriptor$$serializer.INSTANCE)};

        public static final class Creator implements Parcelable.Creator<PublicKey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PublicKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                ArrayList arrayList = null;
                Extensions extensionsCreateFromParcel = parcel.readInt() == 0 ? null : Extensions.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(CredentialDescriptor.CREATOR.createFromParcel(parcel));
                    }
                }
                return new PublicKey(extensionsCreateFromParcel, string, string2, string3, arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PublicKey[] newArray(int i) {
                return new PublicKey[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PublicKey() {
            this((Extensions) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$PublicKey */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PublicKey copy$default(PublicKey publicKey, Extensions extensions, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                extensions = publicKey.extensions;
            }
            if ((i & 2) != 0) {
                str = publicKey.userVerification;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = publicKey.challenge;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = publicKey.rpId;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                list = publicKey.allowCredentials;
            }
            return publicKey.copy(extensions, str4, str5, str6, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extensions component1() {
            return this.extensions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.userVerification;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.rpId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CredentialDescriptor> component5() {
            return this.allowCredentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PublicKey copy(Extensions extensions, String str, String str2, String str3, List<CredentialDescriptor> list) {
            return new PublicKey(extensions, str, str2, str3, list);
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
            if (!(obj instanceof PublicKey)) {
                return false;
            }
            PublicKey publicKey = (PublicKey) obj;
            return Intrinsics.EZpvd(this.extensions, publicKey.extensions) && Intrinsics.EZpvd((Object) this.userVerification, (Object) publicKey.userVerification) && Intrinsics.EZpvd((Object) this.challenge, (Object) publicKey.challenge) && Intrinsics.EZpvd((Object) this.rpId, (Object) publicKey.rpId) && Intrinsics.EZpvd(this.allowCredentials, publicKey.allowCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CredentialDescriptor> getAllowCredentials() {
            return this.allowCredentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChallenge() {
            return this.challenge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extensions getExtensions() {
            return this.extensions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRpId() {
            return this.rpId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUserVerification() {
            return this.userVerification;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Extensions extensions = this.extensions;
            int iHashCode = extensions == null ? 0 : extensions.hashCode();
            String str = this.userVerification;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.challenge;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.rpId;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            List<CredentialDescriptor> list = this.allowCredentials;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PublicKey(extensions=" + this.extensions + ", userVerification=" + this.userVerification + ", challenge=" + this.challenge + ", rpId=" + this.rpId + ", allowCredentials=" + this.allowCredentials + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Extensions extensions = this.extensions;
            if (extensions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                extensions.writeToParcel(parcel, i);
            }
            parcel.writeString(this.userVerification);
            parcel.writeString(this.challenge);
            parcel.writeString(this.rpId);
            List<CredentialDescriptor> list = this.allowCredentials;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CredentialDescriptor> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.PublicKey.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PublicKey> serializer() {
                return AuthenticationStartResponse$PublicKey$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PublicKey(int i, Extensions extensions, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.extensions = null;
            } else {
                this.extensions = extensions;
            }
            if ((i & 2) == 0) {
                this.userVerification = null;
            } else {
                this.userVerification = str;
            }
            if ((i & 4) == 0) {
                this.challenge = null;
            } else {
                this.challenge = str2;
            }
            if ((i & 8) == 0) {
                this.rpId = null;
            } else {
                this.rpId = str3;
            }
            if ((i & 16) == 0) {
                this.allowCredentials = null;
            } else {
                this.allowCredentials = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_impl(PublicKey publicKey, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || publicKey.extensions != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AuthenticationStartResponse$Extensions$$serializer.INSTANCE, publicKey.extensions);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || publicKey.userVerification != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, publicKey.userVerification);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || publicKey.challenge != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, publicKey.challenge);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || publicKey.rpId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, publicKey.rpId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && publicKey.allowCredentials == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], publicKey.allowCredentials);
        }

        public PublicKey(Extensions extensions, String str, String str2, String str3, List<CredentialDescriptor> list) {
            this.extensions = extensions;
            this.userVerification = str;
            this.challenge = str2;
            this.rpId = str3;
            this.allowCredentials = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$Extensions:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$Extensions) : (r5v0 com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$Extensions))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$Extensions, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$CredentialDescriptor>):void (m)] (LINE:76) call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.PublicKey.<init>(com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$Extensions, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ PublicKey(Extensions extensions, String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : extensions, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
        }
    }

    @Serializable
    public static final class Extensions implements Parcelable {
        public static final int $stable = 0;

        @SerializedName("credProps")
        private final Boolean credProps;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Extensions> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Extensions> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extensions createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Extensions(boolValueOf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extensions[] newArray(int i) {
                return new Extensions[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Extensions() {
            this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Extensions copy$default(Extensions extensions, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = extensions.credProps;
            }
            return extensions.copy(bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component1() {
            return this.credProps;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Extensions copy(Boolean bool) {
            return new Extensions(bool);
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
            return (obj instanceof Extensions) && Intrinsics.EZpvd(this.credProps, ((Extensions) obj).credProps);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCredProps() {
            return this.credProps;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.credProps;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Extensions(credProps=" + this.credProps + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            ?? BooleanValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean bool = this.credProps;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.Extensions.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Extensions> serializer() {
                return AuthenticationStartResponse$Extensions$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Extensions(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.credProps = null;
            } else {
                this.credProps = bool;
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_impl(Extensions extensions, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && extensions.credProps == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, extensions.credProps);
        }

        public Extensions(Boolean bool) {
            this.credProps = bool;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r1v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean):void (m)] (LINE:92) call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.Extensions.<init>(java.lang.Boolean):void type: THIS */
        public /* synthetic */ Extensions(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }
    }

    @Serializable
    public static final class CredentialDescriptor implements Parcelable {

        @SerializedName("id")
        private final String id;

        @SerializedName("transports")
        private final List<String> transports;

        @SerializedName("type")
        private final String type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<CredentialDescriptor> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

        public static final class Creator implements Parcelable.Creator<CredentialDescriptor> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CredentialDescriptor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CredentialDescriptor(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CredentialDescriptor[] newArray(int i) {
                return new CredentialDescriptor[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CredentialDescriptor() {
            this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse$CredentialDescriptor */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CredentialDescriptor copy$default(CredentialDescriptor credentialDescriptor, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = credentialDescriptor.id;
            }
            if ((i & 2) != 0) {
                str2 = credentialDescriptor.type;
            }
            if ((i & 4) != 0) {
                list = credentialDescriptor.transports;
            }
            return credentialDescriptor.copy(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.transports;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CredentialDescriptor copy(String str, String str2, List<String> list) {
            return new CredentialDescriptor(str, str2, list);
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
            if (!(obj instanceof CredentialDescriptor)) {
                return false;
            }
            CredentialDescriptor credentialDescriptor = (CredentialDescriptor) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) credentialDescriptor.id) && Intrinsics.EZpvd((Object) this.type, (Object) credentialDescriptor.type) && Intrinsics.EZpvd(this.transports, credentialDescriptor.transports);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getTransports() {
            return this.transports;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.id;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.type;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            List<String> list = this.transports;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CredentialDescriptor(id=" + this.id + ", type=" + this.type + ", transports=" + this.transports + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.id);
            parcel.writeString(this.type);
            parcel.writeStringList(this.transports);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.CredentialDescriptor.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CredentialDescriptor> serializer() {
                return AuthenticationStartResponse$CredentialDescriptor$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CredentialDescriptor(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.type = null;
            } else {
                this.type = str2;
            }
            if ((i & 4) == 0) {
                this.transports = null;
            } else {
                this.transports = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_impl(CredentialDescriptor credentialDescriptor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || credentialDescriptor.id != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, credentialDescriptor.id);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || credentialDescriptor.type != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, credentialDescriptor.type);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && credentialDescriptor.transports == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], credentialDescriptor.transports);
        }

        public CredentialDescriptor(String str, String str2, List<String> list) {
            this.id = str;
            this.type = str2;
            this.transports = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:100) call: com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.CredentialDescriptor.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ CredentialDescriptor(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PublicKeyCredentialRequestOptions toPublicKeyCredentialRequestOptions() {
        List<PublicKeyCredentialDescriptor> listAhwBna;
        List<CredentialDescriptor> allowCredentials;
        byte[] bArrAEQbTJ;
        List listEZpvd;
        Object objM7377constructorimpl;
        List<String> transports;
        List<String> transports2;
        String rpId;
        String challenge;
        byte[] bArrAEQbTJ2;
        PublicKeyCredentialRequestOptions.Builder builder = new PublicKeyCredentialRequestOptions.Builder();
        PublicKey publicKey = this.publicKey;
        String userVerification = publicKey != null ? publicKey.getUserVerification() : null;
        if (userVerification == null) {
            userVerification = "";
        }
        builder.zzc(UserVerificationRequirement.fromString(userVerification));
        PublicKey publicKey2 = this.publicKey;
        if (publicKey2 != null && (challenge = publicKey2.getChallenge()) != null && (bArrAEQbTJ2 = C6617aSi.AEQbTJ(challenge)) != null) {
            builder.setChallenge(bArrAEQbTJ2);
        }
        PublicKey publicKey3 = this.publicKey;
        if (publicKey3 != null && (rpId = publicKey3.getRpId()) != null) {
            builder.setRpId(rpId);
        }
        PublicKey publicKey4 = this.publicKey;
        if (publicKey4 == null || (allowCredentials = publicKey4.getAllowCredentials()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            ArrayList<CredentialDescriptor> arrayList = new ArrayList();
            for (Object obj : allowCredentials) {
                CredentialDescriptor credentialDescriptor = (CredentialDescriptor) obj;
                if (C6614aSf.OLrzqt.KWHzl() || (((transports = credentialDescriptor.getTransports()) != null && transports.contains("hybrid")) || ((transports2 = credentialDescriptor.getTransports()) != null && transports2.contains("unknown")))) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (CredentialDescriptor credentialDescriptor2 : arrayList) {
                String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                String id = credentialDescriptor2.getId();
                if (id == null || (bArrAEQbTJ = C6617aSi.AEQbTJ(id)) == null) {
                    bArrAEQbTJ = new byte[0];
                }
                if (C6614aSf.OLrzqt.KWHzl()) {
                    List<String> transports3 = credentialDescriptor2.getTransports();
                    if (transports3 != null) {
                        listEZpvd = new ArrayList();
                        for (String str : transports3) {
                            try {
                                Result.Application application = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(Transport.fromString(str));
                            } catch (Throwable th) {
                                Result.Application application2 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                objM7377constructorimpl = null;
                            }
                            Transport transport = (Transport) objM7377constructorimpl;
                            if (transport != null) {
                                listEZpvd.add(transport);
                            }
                        }
                    } else {
                        listEZpvd = null;
                    }
                    if (listEZpvd == null) {
                        listEZpvd = yDY.AhwBna();
                    }
                } else {
                    listEZpvd = C56402yEa.EZpvd(Transport.INTERNAL);
                }
                arrayList2.add(new PublicKeyCredentialDescriptor(string, bArrAEQbTJ, (List<Transport>) listEZpvd));
            }
            listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
            if (listAhwBna == null) {
            }
        }
        builder.setAllowList(listAhwBna);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(publicKeyCredentialRequestOptionsBuild, "");
        return publicKeyCredentialRequestOptionsBuild;
    }
}
