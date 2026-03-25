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
public final class SupportedMevNodeBean implements Parcelable {
    private List<Integer> chainIds;
    private String gas;
    private String name;
    private String priorityRate;
    private String supplier;
    private String vendorIcon;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportedMevNodeBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<SupportedMevNodeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedMevNodeBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new SupportedMevNodeBean(string, string2, string3, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportedMevNodeBean[] newArray(int i) {
            return new SupportedMevNodeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportedMevNodeBean() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.SupportedMevNodeBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedMevNodeBean copy$default(SupportedMevNodeBean supportedMevNodeBean, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportedMevNodeBean.name;
        }
        if ((i & 2) != 0) {
            str2 = supportedMevNodeBean.gas;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = supportedMevNodeBean.supplier;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            list = supportedMevNodeBean.chainIds;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = supportedMevNodeBean.priorityRate;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = supportedMevNodeBean.vendorIcon;
        }
        return supportedMevNodeBean.copy(str, str6, str7, list2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.supplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priorityRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.vendorIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportedMevNodeBean copy(String str, String str2, String str3, List<Integer> list, String str4, String str5) {
        return new SupportedMevNodeBean(str, str2, str3, list, str4, str5);
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
        if (!(obj instanceof SupportedMevNodeBean)) {
            return false;
        }
        SupportedMevNodeBean supportedMevNodeBean = (SupportedMevNodeBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) supportedMevNodeBean.name) && Intrinsics.EZpvd((Object) this.gas, (Object) supportedMevNodeBean.gas) && Intrinsics.EZpvd((Object) this.supplier, (Object) supportedMevNodeBean.supplier) && Intrinsics.EZpvd(this.chainIds, supportedMevNodeBean.chainIds) && Intrinsics.EZpvd((Object) this.priorityRate, (Object) supportedMevNodeBean.priorityRate) && Intrinsics.EZpvd((Object) this.vendorIcon, (Object) supportedMevNodeBean.vendorIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getChainIds() {
        return this.chainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityRate() {
        return this.priorityRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupplier() {
        return this.supplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVendorIcon() {
        return this.vendorIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.gas;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.supplier;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<Integer> list = this.chainIds;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str4 = this.priorityRate;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.vendorIcon;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIds(List<Integer> list) {
        this.chainIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGas(String str) {
        this.gas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityRate(String str) {
        this.priorityRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupplier(String str) {
        this.supplier = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVendorIcon(String str) {
        this.vendorIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportedMevNodeBean(name=" + this.name + ", gas=" + this.gas + ", supplier=" + this.supplier + ", chainIds=" + this.chainIds + ", priorityRate=" + this.priorityRate + ", vendorIcon=" + this.vendorIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.gas);
        parcel.writeString(this.supplier);
        List<Integer> list = this.chainIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        parcel.writeString(this.priorityRate);
        parcel.writeString(this.vendorIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SupportedMevNodeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportedMevNodeBean> serializer() {
            return SupportedMevNodeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportedMevNodeBean(int i, String str, String str2, String str3, List list, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.gas = null;
        } else {
            this.gas = str2;
        }
        if ((i & 4) == 0) {
            this.supplier = null;
        } else {
            this.supplier = str3;
        }
        if ((i & 8) == 0) {
            this.chainIds = null;
        } else {
            this.chainIds = list;
        }
        if ((i & 16) == 0) {
            this.priorityRate = null;
        } else {
            this.priorityRate = str4;
        }
        if ((i & 32) == 0) {
            this.vendorIcon = null;
        } else {
            this.vendorIcon = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SupportedMevNodeBean supportedMevNodeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || supportedMevNodeBean.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, supportedMevNodeBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || supportedMevNodeBean.gas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, supportedMevNodeBean.gas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportedMevNodeBean.supplier != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, supportedMevNodeBean.supplier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportedMevNodeBean.chainIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], supportedMevNodeBean.chainIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportedMevNodeBean.priorityRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, supportedMevNodeBean.priorityRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && supportedMevNodeBean.vendorIcon == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, supportedMevNodeBean.vendorIcon);
    }

    public SupportedMevNodeBean(String str, String str2, String str3, List<Integer> list, String str4, String str5) {
        this.name = str;
        this.gas = str2;
        this.supplier = str3;
        this.chainIds = list;
        this.priorityRate = str4;
        this.vendorIcon = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String):void (m)] (LINE:1455) call: com.okinc.business.defi.biz.net.bean.SupportedMevNodeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SupportedMevNodeBean(String str, String str2, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
