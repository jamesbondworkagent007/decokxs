package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AddressAutoComplete implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, String> extraParams;
    private final String listUri;
    private final Map<String, String> listUriParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressAutoComplete> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressAutoComplete> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAutoComplete createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap3;
            }
            return new AddressAutoComplete(string, linkedHashMap2, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAutoComplete[] newArray(int i) {
            return new AddressAutoComplete[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressAutoComplete copy$default(AddressAutoComplete addressAutoComplete, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressAutoComplete.listUri;
        }
        if ((i & 2) != 0) {
            map = addressAutoComplete.listUriParams;
        }
        if ((i & 4) != 0) {
            map2 = addressAutoComplete.extraParams;
        }
        return addressAutoComplete.copy(str, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.listUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component2() {
        return this.listUriParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAutoComplete copy(@NotNull String str, @NotNull Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new AddressAutoComplete(str, map, map2);
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
        if (!(obj instanceof AddressAutoComplete)) {
            return false;
        }
        AddressAutoComplete addressAutoComplete = (AddressAutoComplete) obj;
        return Intrinsics.EZpvd((Object) this.listUri, (Object) addressAutoComplete.listUri) && Intrinsics.EZpvd(this.listUriParams, addressAutoComplete.listUriParams) && Intrinsics.EZpvd(this.extraParams, addressAutoComplete.extraParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListUri() {
        return this.listUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getListUriParams() {
        return this.listUriParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.listUri.hashCode();
        int iHashCode2 = this.listUriParams.hashCode();
        Map<String, String> map = this.extraParams;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAutoComplete(listUri=" + this.listUri + ", listUriParams=" + this.listUriParams + ", extraParams=" + this.extraParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.listUri);
        Map<String, String> map = this.listUriParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map2 = this.extraParams;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressAutoComplete> serializer() {
            return AddressAutoComplete$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ AddressAutoComplete(int i, String str, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AddressAutoComplete$$serializer.INSTANCE.getDescriptor());
        }
        this.listUri = str;
        this.listUriParams = map;
        if ((i & 4) == 0) {
            this.extraParams = null;
        } else {
            this.extraParams = map2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressAutoComplete addressAutoComplete, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressAutoComplete.listUri);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], addressAutoComplete.listUriParams);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && addressAutoComplete.extraParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], addressAutoComplete.extraParams);
    }

    public AddressAutoComplete(@NotNull String str, @NotNull Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.listUri = str;
        this.listUriParams = map;
        this.extraParams = map2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.Map)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:3521) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete.<init>(java.lang.String, java.util.Map, java.util.Map):void type: THIS */
    public /* synthetic */ AddressAutoComplete(String str, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : map2);
    }
}
