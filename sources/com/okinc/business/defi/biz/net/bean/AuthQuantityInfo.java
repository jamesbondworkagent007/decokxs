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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AuthQuantityInfo implements Parcelable {
    private List<AuthQuantity> authQuantityList;
    private String editUiType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AuthQuantityInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AuthQuantity$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AuthQuantityInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthQuantityInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(AuthQuantity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AuthQuantityInfo(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthQuantityInfo[] newArray(int i) {
            return new AuthQuantityInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthQuantityInfo() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AuthQuantityInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthQuantityInfo copy$default(AuthQuantityInfo authQuantityInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authQuantityInfo.editUiType;
        }
        if ((i & 2) != 0) {
            list = authQuantityInfo.authQuantityList;
        }
        return authQuantityInfo.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.editUiType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AuthQuantity> component2() {
        return this.authQuantityList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthQuantityInfo copy(String str, List<AuthQuantity> list) {
        return new AuthQuantityInfo(str, list);
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
        if (!(obj instanceof AuthQuantityInfo)) {
            return false;
        }
        AuthQuantityInfo authQuantityInfo = (AuthQuantityInfo) obj;
        return Intrinsics.EZpvd((Object) this.editUiType, (Object) authQuantityInfo.editUiType) && Intrinsics.EZpvd(this.authQuantityList, authQuantityInfo.authQuantityList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AuthQuantity> getAuthQuantityList() {
        return this.authQuantityList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEditUiType() {
        return this.editUiType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.editUiType;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<AuthQuantity> list = this.authQuantityList;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthQuantityList(List<AuthQuantity> list) {
        this.authQuantityList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEditUiType(String str) {
        this.editUiType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthQuantityInfo(editUiType=" + this.editUiType + ", authQuantityList=" + this.authQuantityList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.editUiType);
        List<AuthQuantity> list = this.authQuantityList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AuthQuantity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AuthQuantityInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuthQuantityInfo> serializer() {
            return AuthQuantityInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthQuantityInfo(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.editUiType = null;
        } else {
            this.editUiType = str;
        }
        if ((i & 2) == 0) {
            this.authQuantityList = null;
        } else {
            this.authQuantityList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(AuthQuantityInfo authQuantityInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || authQuantityInfo.editUiType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, authQuantityInfo.editUiType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && authQuantityInfo.authQuantityList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], authQuantityInfo.authQuantityList);
    }

    public AuthQuantityInfo(String str, List<AuthQuantity> list) {
        this.editUiType = str;
        this.authQuantityList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.AuthQuantity>):void (m)] (LINE:185) call: com.okinc.business.defi.biz.net.bean.AuthQuantityInfo.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AuthQuantityInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
