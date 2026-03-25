package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class ProfileNftAll implements Parcelable {
    private String accountId;
    private ArrayList<ProfileNftBean> collections;
    private Integer created;
    private ArrayList<ProfileNetworkValuation> networkValuations;
    private String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProfileNftAll> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ProfileNftBean$$serializer.INSTANCE), new ArrayListSerializer(ProfileNetworkValuation$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<ProfileNftAll> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileNftAll createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ProfileNftBean.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ProfileNetworkValuation.CREATOR.createFromParcel(parcel));
                }
            }
            return new ProfileNftAll(string, numValueOf, arrayList, arrayList2, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileNftAll[] newArray(int i) {
            return new ProfileNftAll[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfileNftAll() {
        this((String) null, (Integer) null, (ArrayList) null, (ArrayList) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.ProfileNftAll */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNftAll copy$default(ProfileNftAll profileNftAll, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNftAll.accountId;
        }
        if ((i & 2) != 0) {
            num = profileNftAll.created;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            arrayList = profileNftAll.collections;
        }
        ArrayList arrayList3 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = profileNftAll.networkValuations;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 16) != 0) {
            str2 = profileNftAll.valuation;
        }
        return profileNftAll.copy(str, num2, arrayList3, arrayList4, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.created;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProfileNftBean> component3() {
        return this.collections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProfileNetworkValuation> component4() {
        return this.networkValuations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfileNftAll copy(String str, Integer num, ArrayList<ProfileNftBean> arrayList, ArrayList<ProfileNetworkValuation> arrayList2, String str2) {
        return new ProfileNftAll(str, num, arrayList, arrayList2, str2);
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
        if (!(obj instanceof ProfileNftAll)) {
            return false;
        }
        ProfileNftAll profileNftAll = (ProfileNftAll) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) profileNftAll.accountId) && Intrinsics.EZpvd(this.created, profileNftAll.created) && Intrinsics.EZpvd(this.collections, profileNftAll.collections) && Intrinsics.EZpvd(this.networkValuations, profileNftAll.networkValuations) && Intrinsics.EZpvd((Object) this.valuation, (Object) profileNftAll.valuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProfileNftBean> getCollections() {
        return this.collections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCreated() {
        return this.created;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProfileNetworkValuation> getNetworkValuations() {
        return this.networkValuations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.created;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        ArrayList<ProfileNftBean> arrayList = this.collections;
        int iHashCode3 = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<ProfileNetworkValuation> arrayList2 = this.networkValuations;
        int iHashCode4 = arrayList2 == null ? 0 : arrayList2.hashCode();
        String str2 = this.valuation;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(String str) {
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollections(ArrayList<ProfileNftBean> arrayList) {
        this.collections = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreated(Integer num) {
        this.created = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkValuations(ArrayList<ProfileNetworkValuation> arrayList) {
        this.networkValuations = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(String str) {
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfileNftAll(accountId=" + this.accountId + ", created=" + this.created + ", collections=" + this.collections + ", networkValuations=" + this.networkValuations + ", valuation=" + this.valuation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        Integer num = this.created;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ArrayList<ProfileNftBean> arrayList = this.collections;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<ProfileNftBean> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<ProfileNetworkValuation> arrayList2 = this.networkValuations;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<ProfileNetworkValuation> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.valuation);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ProfileNftAll.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfileNftAll> serializer() {
            return ProfileNftAll$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfileNftAll(int i, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.created = 0;
        } else {
            this.created = num;
        }
        if ((i & 4) == 0) {
            this.collections = null;
        } else {
            this.collections = arrayList;
        }
        if ((i & 8) == 0) {
            this.networkValuations = null;
        } else {
            this.networkValuations = arrayList2;
        }
        if ((i & 16) == 0) {
            this.valuation = null;
        } else {
            this.valuation = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ProfileNftAll profileNftAll, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) profileNftAll.accountId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, profileNftAll.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num = profileNftAll.created) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, profileNftAll.created);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || profileNftAll.collections != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], profileNftAll.collections);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || profileNftAll.networkValuations != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], profileNftAll.networkValuations);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && profileNftAll.valuation == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, profileNftAll.valuation);
    }

    public ProfileNftAll(String str, Integer num, ArrayList<ProfileNftBean> arrayList, ArrayList<ProfileNetworkValuation> arrayList2, String str2) {
        this.accountId = str;
        this.created = num;
        this.collections = arrayList;
        this.networkValuations = arrayList2;
        this.valuation = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:0x000f: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 java.lang.Integer))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r6v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r7v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.ProfileNftBean>, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.ProfileNetworkValuation>, java.lang.String):void (m)] (LINE:46) call: com.okinc.business.defi.biz.net.bean.ProfileNftAll.<init>(java.lang.String, java.lang.Integer, java.util.ArrayList, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ ProfileNftAll(String str, Integer num, ArrayList arrayList, ArrayList arrayList2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : arrayList2, (i & 16) == 0 ? str2 : null);
    }
}
