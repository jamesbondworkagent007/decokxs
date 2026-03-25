package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PermissionDetail implements Parcelable {
    private final List<AuthGroups> authGrous;
    private final String authName;
    private final String authType;
    private final Integer threshold;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PermissionDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(AuthGroups$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PermissionDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PermissionDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(AuthGroups.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new PermissionDetail(string, string2, numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PermissionDetail[] newArray(int i) {
            return new PermissionDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PermissionDetail() {
        this((String) null, (String) null, (Integer) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.PermissionDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionDetail copy$default(PermissionDetail permissionDetail, String str, String str2, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionDetail.authName;
        }
        if ((i & 2) != 0) {
            str2 = permissionDetail.authType;
        }
        if ((i & 4) != 0) {
            num = permissionDetail.threshold;
        }
        if ((i & 8) != 0) {
            list = permissionDetail.authGrous;
        }
        return permissionDetail.copy(str, str2, num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.authType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AuthGroups> component4() {
        return this.authGrous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PermissionDetail copy(String str, String str2, Integer num, List<AuthGroups> list) {
        return new PermissionDetail(str, str2, num, list);
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
        if (!(obj instanceof PermissionDetail)) {
            return false;
        }
        PermissionDetail permissionDetail = (PermissionDetail) obj;
        return Intrinsics.EZpvd((Object) this.authName, (Object) permissionDetail.authName) && Intrinsics.EZpvd((Object) this.authType, (Object) permissionDetail.authType) && Intrinsics.EZpvd(this.threshold, permissionDetail.threshold) && Intrinsics.EZpvd(this.authGrous, permissionDetail.authGrous);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AuthGroups> getAuthGrous() {
        return this.authGrous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthName() {
        return this.authName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthType() {
        return this.authType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getThreshold() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.authName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.authType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.threshold;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        List<AuthGroups> list = this.authGrous;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PermissionDetail(authName=" + this.authName + ", authType=" + this.authType + ", threshold=" + this.threshold + ", authGrous=" + this.authGrous + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authName);
        parcel.writeString(this.authType);
        Integer num = this.threshold;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<AuthGroups> list = this.authGrous;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AuthGroups> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.PermissionDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PermissionDetail> serializer() {
            return PermissionDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PermissionDetail(int i, String str, String str2, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authName = null;
        } else {
            this.authName = str;
        }
        if ((i & 2) == 0) {
            this.authType = null;
        } else {
            this.authType = str2;
        }
        if ((i & 4) == 0) {
            this.threshold = null;
        } else {
            this.threshold = num;
        }
        if ((i & 8) == 0) {
            this.authGrous = null;
        } else {
            this.authGrous = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(PermissionDetail permissionDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || permissionDetail.authName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, permissionDetail.authName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || permissionDetail.authType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, permissionDetail.authType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || permissionDetail.threshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, permissionDetail.threshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && permissionDetail.authGrous == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], permissionDetail.authGrous);
    }

    public PermissionDetail(String str, String str2, Integer num, List<AuthGroups> list) {
        this.authName = str;
        this.authType = str2;
        this.threshold = num;
        this.authGrous = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.util.List<com.okinc.business.defi.biz.net.bean.AuthGroups>):void (m)] (LINE:268) call: com.okinc.business.defi.biz.net.bean.PermissionDetail.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ PermissionDetail(String str, String str2, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list);
    }
}
