package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CallApiModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;

    /* JADX INFO: renamed from: api, reason: collision with root package name */
    private final String f1043api;
    private final HashMap<String, String> extraParams;
    private final String successMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CallApiModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CallApiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallApiModel createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                HashMap map2 = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                map = map2;
            }
            return new CallApiModel(string, string2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallApiModel[] newArray(int i) {
            return new CallApiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallApiModel() {
        this((String) null, (String) null, (HashMap) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallApiModel copy$default(CallApiModel callApiModel, String str, String str2, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callApiModel.f1043api;
        }
        if ((i & 2) != 0) {
            str2 = callApiModel.successMessage;
        }
        if ((i & 4) != 0) {
            map = callApiModel.extraParams;
        }
        return callApiModel.copy(str, str2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f1043api;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.successMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component3() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel copy(String str, String str2, HashMap<String, String> map) {
        return new CallApiModel(str, str2, map);
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
        if (!(obj instanceof CallApiModel)) {
            return false;
        }
        CallApiModel callApiModel = (CallApiModel) obj;
        return Intrinsics.EZpvd((Object) this.f1043api, (Object) callApiModel.f1043api) && Intrinsics.EZpvd((Object) this.successMessage, (Object) callApiModel.successMessage) && Intrinsics.EZpvd(this.extraParams, callApiModel.extraParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApi() {
        return this.f1043api;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getExtraParams() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.f1043api;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.successMessage;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        HashMap<String, String> map = this.extraParams;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallApiModel(api=" + this.f1043api + ", successMessage=" + this.successMessage + ", extraParams=" + this.extraParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f1043api);
        parcel.writeString(this.successMessage);
        HashMap<String, String> map = this.extraParams;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CallApiModel> serializer() {
            return CallApiModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new HashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ CallApiModel(int i, String str, String str2, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f1043api = null;
        } else {
            this.f1043api = str;
        }
        if ((i & 2) == 0) {
            this.successMessage = null;
        } else {
            this.successMessage = str2;
        }
        if ((i & 4) == 0) {
            this.extraParams = null;
        } else {
            this.extraParams = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CallApiModel callApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || callApiModel.f1043api != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, callApiModel.f1043api);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || callApiModel.successMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, callApiModel.successMessage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && callApiModel.extraParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], callApiModel.extraParams);
    }

    public CallApiModel(String str, String str2, HashMap<String, String> map) {
        this.f1043api = str;
        this.successMessage = str2;
        this.extraParams = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r4v0 java.util.HashMap))
 A[MD:(java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:1630) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel.<init>(java.lang.String, java.lang.String, java.util.HashMap):void type: THIS */
    public /* synthetic */ CallApiModel(String str, String str2, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
    }
}
