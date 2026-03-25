package com.okinc.business.dex.trade.core.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MevConfig implements Parcelable {
    private final boolean enableMev;
    private final List<String> mevSuppliers;
    private final String mevType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MevConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<MevConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MevConfig(parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevConfig[] newArray(int i) {
            return new MevConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.core.domain.model.common.MevConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MevConfig copy$default(MevConfig mevConfig, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mevConfig.mevType;
        }
        if ((i & 2) != 0) {
            z = mevConfig.enableMev;
        }
        if ((i & 4) != 0) {
            list = mevConfig.mevSuppliers;
        }
        return mevConfig.copy(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mevType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig copy(String str, boolean z, List<String> list) {
        return new MevConfig(str, z, list);
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
        if (!(obj instanceof MevConfig)) {
            return false;
        }
        MevConfig mevConfig = (MevConfig) obj;
        return Intrinsics.EZpvd((Object) this.mevType, (Object) mevConfig.mevType) && this.enableMev == mevConfig.enableMev && Intrinsics.EZpvd(this.mevSuppliers, mevConfig.mevSuppliers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableMev() {
        return this.enableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMevSuppliers() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevType() {
        return this.mevType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.mevType;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.enableMev);
        List<String> list = this.mevSuppliers;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MevConfig(mevType=" + this.mevType + ", enableMev=" + this.enableMev + ", mevSuppliers=" + this.mevSuppliers + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mevType);
        parcel.writeInt(this.enableMev ? 1 : 0);
        parcel.writeStringList(this.mevSuppliers);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.MevConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MevConfig> serializer() {
            return MevConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MevConfig(int i, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, MevConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.mevType = null;
        } else {
            this.mevType = str;
        }
        this.enableMev = z;
        if ((i & 4) == 0) {
            this.mevSuppliers = null;
        } else {
            this.mevSuppliers = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MevConfig mevConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mevConfig.mevType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mevConfig.mevType);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, mevConfig.enableMev);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mevConfig.mevSuppliers == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], mevConfig.mevSuppliers);
    }

    public MevConfig(String str, boolean z, List<String> list) {
        this.mevType = str;
        this.enableMev = z;
        this.mevSuppliers = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (r3v0 boolean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, boolean, java.util.List<java.lang.String>):void (m)] (LINE:149) call: com.okinc.business.dex.trade.core.domain.model.common.MevConfig.<init>(java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ MevConfig(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, z, (i & 4) != 0 ? null : list);
    }
}
