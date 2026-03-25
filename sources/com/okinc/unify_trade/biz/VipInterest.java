package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class VipInterest implements Parcelable {
    private String annualInterestRate;
    private String ccy;
    private String defaultRate;
    private ArrayList<VipLevelItem> levelList;
    private String quota;
    private String rate;
    private String totalQuota;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VipInterest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(VipLevelItem$$serializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<VipInterest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipInterest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(VipLevelItem.CREATOR.createFromParcel(parcel));
            }
            return new VipInterest(string, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipInterest[] newArray(int i) {
            return new VipInterest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VipInterest() {
        this((String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.VipInterest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VipInterest copy$default(VipInterest vipInterest, String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipInterest.ccy;
        }
        if ((i & 2) != 0) {
            str2 = vipInterest.defaultRate;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = vipInterest.annualInterestRate;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            arrayList = vipInterest.levelList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            str4 = vipInterest.quota;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = vipInterest.rate;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = vipInterest.totalQuota;
        }
        return vipInterest.copy(str, str7, str8, arrayList2, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.defaultRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.annualInterestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<VipLevelItem> component4() {
        return this.levelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipInterest copy(String str, String str2, String str3, @NotNull ArrayList<VipLevelItem> arrayList, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new VipInterest(str, str2, str3, arrayList, str4, str5, str6);
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
        if (!(obj instanceof VipInterest)) {
            return false;
        }
        VipInterest vipInterest = (VipInterest) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) vipInterest.ccy) && Intrinsics.EZpvd((Object) this.defaultRate, (Object) vipInterest.defaultRate) && Intrinsics.EZpvd((Object) this.annualInterestRate, (Object) vipInterest.annualInterestRate) && Intrinsics.EZpvd(this.levelList, vipInterest.levelList) && Intrinsics.EZpvd((Object) this.quota, (Object) vipInterest.quota) && Intrinsics.EZpvd((Object) this.rate, (Object) vipInterest.rate) && Intrinsics.EZpvd((Object) this.totalQuota, (Object) vipInterest.totalQuota);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultRate() {
        return this.defaultRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<VipLevelItem> getLevelList() {
        return this.levelList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuota() {
        return this.quota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalQuota() {
        return this.totalQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ccy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.defaultRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.annualInterestRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.levelList.hashCode();
        String str4 = this.quota;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rate;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalQuota;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnualInterestRate(String str) {
        this.annualInterestRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultRate(String str) {
        this.defaultRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevelList(@NotNull ArrayList<VipLevelItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.levelList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuota(String str) {
        this.quota = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(String str) {
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalQuota(String str) {
        this.totalQuota = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipInterest(ccy=" + this.ccy + ", defaultRate=" + this.defaultRate + ", annualInterestRate=" + this.annualInterestRate + ", levelList=" + this.levelList + ", quota=" + this.quota + ", rate=" + this.rate + ", totalQuota=" + this.totalQuota + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.defaultRate);
        parcel.writeString(this.annualInterestRate);
        ArrayList<VipLevelItem> arrayList = this.levelList;
        parcel.writeInt(arrayList.size());
        Iterator<VipLevelItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.quota);
        parcel.writeString(this.rate);
        parcel.writeString(this.totalQuota);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.VipInterest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipInterest> serializer() {
            return VipInterest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipInterest(int i, String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.defaultRate = "";
        } else {
            this.defaultRate = str2;
        }
        if ((i & 4) == 0) {
            this.annualInterestRate = "";
        } else {
            this.annualInterestRate = str3;
        }
        if ((i & 8) == 0) {
            this.levelList = new ArrayList<>();
        } else {
            this.levelList = arrayList;
        }
        if ((i & 16) == 0) {
            this.quota = "";
        } else {
            this.quota = str4;
        }
        if ((i & 32) == 0) {
            this.rate = "";
        } else {
            this.rate = str5;
        }
        if ((i & 64) == 0) {
            this.totalQuota = "";
        } else {
            this.totalQuota = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(VipInterest vipInterest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) vipInterest.ccy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, vipInterest.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vipInterest.defaultRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, vipInterest.defaultRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vipInterest.annualInterestRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, vipInterest.annualInterestRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(vipInterest.levelList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], vipInterest.levelList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vipInterest.quota, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, vipInterest.quota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) vipInterest.rate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, vipInterest.rate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) vipInterest.totalQuota, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, vipInterest.totalQuota);
    }

    public VipInterest(String str, String str2, String str3, @NotNull ArrayList<VipLevelItem> arrayList, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.ccy = str;
        this.defaultRate = str2;
        this.annualInterestRate = str3;
        this.levelList = arrayList;
        this.quota = str4;
        this.rate = str5;
        this.totalQuota = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.ArrayList:0x0020: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x001d: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3602) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r10v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.VipLevelItem>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3598) call: com.okinc.unify_trade.biz.VipInterest.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VipInterest(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new ArrayList() : arrayList, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }
}
