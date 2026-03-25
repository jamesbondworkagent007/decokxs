package com.okinc.wallet.hardware.api.keystone;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KeystoneMultiAccount implements Parcelable {
    private List<KeystoneAccount> accounts;
    private final String device;
    private final String deviceId;
    private final String deviceVersion;
    private final String masterFingerprint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KeystoneMultiAccount> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(KeystoneAccount$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<KeystoneMultiAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneMultiAccount createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(KeystoneAccount.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new KeystoneMultiAccount(string, string2, string3, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneMultiAccount[] newArray(int i) {
            return new KeystoneMultiAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeystoneMultiAccount copy$default(KeystoneMultiAccount keystoneMultiAccount, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keystoneMultiAccount.masterFingerprint;
        }
        if ((i & 2) != 0) {
            str2 = keystoneMultiAccount.device;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = keystoneMultiAccount.deviceId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = keystoneMultiAccount.deviceVersion;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = keystoneMultiAccount.accounts;
        }
        return keystoneMultiAccount.copy(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.deviceVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KeystoneAccount> component5() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneMultiAccount copy(@NotNull String str, String str2, String str3, String str4, List<KeystoneAccount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new KeystoneMultiAccount(str, str2, str3, str4, list);
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
        if (!(obj instanceof KeystoneMultiAccount)) {
            return false;
        }
        KeystoneMultiAccount keystoneMultiAccount = (KeystoneMultiAccount) obj;
        return Intrinsics.EZpvd((Object) this.masterFingerprint, (Object) keystoneMultiAccount.masterFingerprint) && Intrinsics.EZpvd((Object) this.device, (Object) keystoneMultiAccount.device) && Intrinsics.EZpvd((Object) this.deviceId, (Object) keystoneMultiAccount.deviceId) && Intrinsics.EZpvd((Object) this.deviceVersion, (Object) keystoneMultiAccount.deviceVersion) && Intrinsics.EZpvd(this.accounts, keystoneMultiAccount.accounts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KeystoneAccount> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevice() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceVersion() {
        return this.deviceVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.masterFingerprint.hashCode();
        String str = this.device;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.deviceId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deviceVersion;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<KeystoneAccount> list = this.accounts;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccounts(List<KeystoneAccount> list) {
        this.accounts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneMultiAccount(masterFingerprint=" + this.masterFingerprint + ", device=" + this.device + ", deviceId=" + this.deviceId + ", deviceVersion=" + this.deviceVersion + ", accounts=" + this.accounts + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.masterFingerprint);
        parcel.writeString(this.device);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceVersion);
        List<KeystoneAccount> list = this.accounts;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<KeystoneAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeystoneMultiAccount> serializer() {
            return KeystoneMultiAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeystoneMultiAccount(int i, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, KeystoneMultiAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.masterFingerprint = str;
        if ((i & 2) == 0) {
            this.device = null;
        } else {
            this.device = str2;
        }
        if ((i & 4) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str3;
        }
        if ((i & 8) == 0) {
            this.deviceVersion = null;
        } else {
            this.deviceVersion = str4;
        }
        if ((i & 16) == 0) {
            this.accounts = null;
        } else {
            this.accounts = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(KeystoneMultiAccount keystoneMultiAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, keystoneMultiAccount.masterFingerprint);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || keystoneMultiAccount.device != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, keystoneMultiAccount.device);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || keystoneMultiAccount.deviceId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, keystoneMultiAccount.deviceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || keystoneMultiAccount.deviceVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, keystoneMultiAccount.deviceVersion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && keystoneMultiAccount.accounts == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], keystoneMultiAccount.accounts);
    }

    public KeystoneMultiAccount(@NotNull String str, String str2, String str3, String str4, List<KeystoneAccount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.masterFingerprint = str;
        this.device = str2;
        this.deviceId = str3;
        this.deviceVersion = str4;
        this.accounts = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.hardware.api.keystone.KeystoneAccount>):void (m)] (LINE:43) call: com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ KeystoneMultiAccount(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}
