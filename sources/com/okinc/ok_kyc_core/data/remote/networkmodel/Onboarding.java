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
public final class Onboarding implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> onboardingParam;
    private final String target;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Onboarding> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Onboarding createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
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
            return new Onboarding(string, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Onboarding[] newArray(int i) {
            return new Onboarding[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Onboarding() {
        this((String) null, (HashMap) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, String str, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboarding.target;
        }
        if ((i & 2) != 0) {
            map = onboarding.onboardingParam;
        }
        return onboarding.copy(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component2() {
        return this.onboardingParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Onboarding copy(String str, HashMap<String, String> map) {
        return new Onboarding(str, map);
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
        if (!(obj instanceof Onboarding)) {
            return false;
        }
        Onboarding onboarding = (Onboarding) obj;
        return Intrinsics.EZpvd((Object) this.target, (Object) onboarding.target) && Intrinsics.EZpvd(this.onboardingParam, onboarding.onboardingParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getOnboardingParam() {
        return this.onboardingParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.target;
        int iHashCode = str == null ? 0 : str.hashCode();
        HashMap<String, String> map = this.onboardingParam;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Onboarding(target=" + this.target + ", onboardingParam=" + this.onboardingParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.target);
        HashMap<String, String> map = this.onboardingParam;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Onboarding> serializer() {
            return Onboarding$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new HashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ Onboarding(int i, String str, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        this.target = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.onboardingParam = null;
        } else {
            this.onboardingParam = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Onboarding onboarding, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) onboarding.target, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, onboarding.target);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && onboarding.onboardingParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], onboarding.onboardingParam);
    }

    public Onboarding(String str, HashMap<String, String> map) {
        this.target = str;
        this.onboardingParam = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r2v0 java.util.HashMap))
 A[MD:(java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:702) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding.<init>(java.lang.String, java.util.HashMap):void type: THIS */
    public /* synthetic */ Onboarding(String str, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : map);
    }
}
