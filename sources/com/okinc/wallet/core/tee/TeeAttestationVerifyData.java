package com.okinc.wallet.core.tee;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TeeAttestationVerifyData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, String> pcrsHex;
    private final String pubKeyHex;
    private final String userDataHex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeAttestationVerifyData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TeeAttestationVerifyData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAttestationVerifyData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TeeAttestationVerifyData(string, string2, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAttestationVerifyData[] newArray(int i) {
            return new TeeAttestationVerifyData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeAttestationVerifyData() {
        this((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.tee.TeeAttestationVerifyData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeeAttestationVerifyData copy$default(TeeAttestationVerifyData teeAttestationVerifyData, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeAttestationVerifyData.pubKeyHex;
        }
        if ((i & 2) != 0) {
            str2 = teeAttestationVerifyData.userDataHex;
        }
        if ((i & 4) != 0) {
            map = teeAttestationVerifyData.pcrsHex;
        }
        return teeAttestationVerifyData.copy(str, str2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pubKeyHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userDataHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.pcrsHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeAttestationVerifyData copy(String str, String str2, Map<String, String> map) {
        return new TeeAttestationVerifyData(str, str2, map);
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
        if (!(obj instanceof TeeAttestationVerifyData)) {
            return false;
        }
        TeeAttestationVerifyData teeAttestationVerifyData = (TeeAttestationVerifyData) obj;
        return Intrinsics.EZpvd((Object) this.pubKeyHex, (Object) teeAttestationVerifyData.pubKeyHex) && Intrinsics.EZpvd((Object) this.userDataHex, (Object) teeAttestationVerifyData.userDataHex) && Intrinsics.EZpvd(this.pcrsHex, teeAttestationVerifyData.pcrsHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getPcrsHex() {
        return this.pcrsHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKeyHex() {
        return this.pubKeyHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserDataHex() {
        return this.userDataHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.pubKeyHex;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.userDataHex;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Map<String, String> map = this.pcrsHex;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeAttestationVerifyData(pubKeyHex=" + this.pubKeyHex + ", userDataHex=" + this.userDataHex + ", pcrsHex=" + this.pcrsHex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pubKeyHex);
        parcel.writeString(this.userDataHex);
        Map<String, String> map = this.pcrsHex;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.tee.TeeAttestationVerifyData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeAttestationVerifyData> serializer() {
            return TeeAttestationVerifyData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ TeeAttestationVerifyData(int i, String str, String str2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pubKeyHex = null;
        } else {
            this.pubKeyHex = str;
        }
        if ((i & 2) == 0) {
            this.userDataHex = null;
        } else {
            this.userDataHex = str2;
        }
        if ((i & 4) == 0) {
            this.pcrsHex = null;
        } else {
            this.pcrsHex = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TeeAttestationVerifyData teeAttestationVerifyData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || teeAttestationVerifyData.pubKeyHex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, teeAttestationVerifyData.pubKeyHex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || teeAttestationVerifyData.userDataHex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, teeAttestationVerifyData.userDataHex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && teeAttestationVerifyData.pcrsHex == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], teeAttestationVerifyData.pcrsHex);
    }

    public TeeAttestationVerifyData(String str, String str2, Map<String, String> map) {
        this.pubKeyHex = str;
        this.userDataHex = str2;
        this.pcrsHex = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:28) call: com.okinc.wallet.core.tee.TeeAttestationVerifyData.<init>(java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ TeeAttestationVerifyData(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
    }
}
