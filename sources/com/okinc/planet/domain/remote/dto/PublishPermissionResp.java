package com.okinc.planet.domain.remote.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PublishPermissionResp implements Parcelable {
    private final Boolean agreeTnc;
    private final Boolean permission;
    private final List<String> pluginConfig;
    private final Integer profileModified;
    private final Boolean urlPermission;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PublishPermissionResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<PublishPermissionResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublishPermissionResp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PublishPermissionResp(boolValueOf, boolValueOf2, numValueOf, arrayListCreateStringArrayList, boolValueOf3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PublishPermissionResp[] newArray(int i) {
            return new PublishPermissionResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PublishPermissionResp() {
        this((Boolean) null, (Boolean) null, (Integer) null, (List) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.planet.domain.remote.dto.PublishPermissionResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishPermissionResp copy$default(PublishPermissionResp publishPermissionResp, Boolean bool, Boolean bool2, Integer num, List list, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = publishPermissionResp.permission;
        }
        if ((i & 2) != 0) {
            bool2 = publishPermissionResp.agreeTnc;
        }
        Boolean bool4 = bool2;
        if ((i & 4) != 0) {
            num = publishPermissionResp.profileModified;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            list = publishPermissionResp.pluginConfig;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            bool3 = publishPermissionResp.urlPermission;
        }
        return publishPermissionResp.copy(bool, bool4, num2, list2, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.permission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.agreeTnc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.profileModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.pluginConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.urlPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublishPermissionResp copy(Boolean bool, Boolean bool2, Integer num, List<String> list, Boolean bool3) {
        return new PublishPermissionResp(bool, bool2, num, list, bool3);
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
        if (!(obj instanceof PublishPermissionResp)) {
            return false;
        }
        PublishPermissionResp publishPermissionResp = (PublishPermissionResp) obj;
        return Intrinsics.EZpvd(this.permission, publishPermissionResp.permission) && Intrinsics.EZpvd(this.agreeTnc, publishPermissionResp.agreeTnc) && Intrinsics.EZpvd(this.profileModified, publishPermissionResp.profileModified) && Intrinsics.EZpvd(this.pluginConfig, publishPermissionResp.pluginConfig) && Intrinsics.EZpvd(this.urlPermission, publishPermissionResp.urlPermission);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAgreeTnc() {
        return this.agreeTnc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPermission() {
        return this.permission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPluginConfig() {
        return this.pluginConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProfileModified() {
        return this.profileModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUrlPermission() {
        return this.urlPermission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.permission;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.agreeTnc;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.profileModified;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        List<String> list = this.pluginConfig;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Boolean bool3 = this.urlPermission;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublishPermissionResp(permission=" + this.permission + ", agreeTnc=" + this.agreeTnc + ", profileModified=" + this.profileModified + ", pluginConfig=" + this.pluginConfig + ", urlPermission=" + this.urlPermission + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.permission;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.agreeTnc;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.profileModified;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.pluginConfig);
        Boolean bool3 = this.urlPermission;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PublishPermissionResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublishPermissionResp> serializer() {
            return PublishPermissionResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublishPermissionResp(int i, Boolean bool, Boolean bool2, Integer num, List list, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        this.permission = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.agreeTnc = Boolean.FALSE;
        } else {
            this.agreeTnc = bool2;
        }
        if ((i & 4) == 0) {
            this.profileModified = 1;
        } else {
            this.profileModified = num;
        }
        if ((i & 8) == 0) {
            this.pluginConfig = null;
        } else {
            this.pluginConfig = list;
        }
        if ((i & 16) == 0) {
            this.urlPermission = Boolean.FALSE;
        } else {
            this.urlPermission = bool3;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(PublishPermissionResp publishPermissionResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(publishPermissionResp.permission, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, publishPermissionResp.permission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(publishPermissionResp.agreeTnc, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, publishPermissionResp.agreeTnc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = publishPermissionResp.profileModified) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, publishPermissionResp.profileModified);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || publishPermissionResp.pluginConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], publishPermissionResp.pluginConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(publishPermissionResp.urlPermission, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, publishPermissionResp.urlPermission);
    }

    public PublishPermissionResp(Boolean bool, Boolean bool2, Integer num, List<String> list, Boolean bool3) {
        this.permission = bool;
        this.agreeTnc = bool2;
        this.profileModified = num;
        this.pluginConfig = list;
        this.urlPermission = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.Integer:0x0016: TERNARY null = ((wrap:int:0x000d: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r6v0 java.lang.Integer))
  (wrap:java.util.List:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0021: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r8v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.util.List<java.lang.String>, java.lang.Boolean):void (m)] (LINE:14) call: com.okinc.planet.domain.remote.dto.PublishPermissionResp.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PublishPermissionResp(Boolean bool, Boolean bool2, Integer num, List list, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? 1 : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? Boolean.FALSE : bool3);
    }
}
