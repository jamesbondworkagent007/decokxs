package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CandleResultBean implements Parcelable {
    private boolean canUpdate;
    private final String fromIcon;
    private String latestPrice;
    private String maxPrice;
    private String minPrice;
    private final String percentage;
    private final List<CandleResultInfo> results;
    private boolean success;
    private final String tag;
    private final String toIcon;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CandleResultBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CandleResultInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CandleResultBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CandleResultBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CandleResultInfo.CREATOR.createFromParcel(parcel));
            }
            return new CandleResultBean(string, string2, string3, string4, z, string5, string6, z2, string7, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CandleResultBean[] newArray(int i) {
            return new CandleResultBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CandleResultBean() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, false, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CandleResultInfo> component10() {
        return this.results;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.canUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CandleResultBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, boolean z2, @NotNull String str7, @NotNull List<CandleResultInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CandleResultBean(str, str2, str3, str4, z, str5, str6, z2, str7, list);
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
        if (!(obj instanceof CandleResultBean)) {
            return false;
        }
        CandleResultBean candleResultBean = (CandleResultBean) obj;
        return Intrinsics.EZpvd((Object) this.latestPrice, (Object) candleResultBean.latestPrice) && Intrinsics.EZpvd((Object) this.percentage, (Object) candleResultBean.percentage) && Intrinsics.EZpvd((Object) this.fromIcon, (Object) candleResultBean.fromIcon) && Intrinsics.EZpvd((Object) this.toIcon, (Object) candleResultBean.toIcon) && this.success == candleResultBean.success && Intrinsics.EZpvd((Object) this.maxPrice, (Object) candleResultBean.maxPrice) && Intrinsics.EZpvd((Object) this.minPrice, (Object) candleResultBean.minPrice) && this.canUpdate == candleResultBean.canUpdate && Intrinsics.EZpvd((Object) this.tag, (Object) candleResultBean.tag) && Intrinsics.EZpvd(this.results, candleResultBean.results);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromIcon() {
        return this.fromIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestPrice() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPrice() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercentage() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CandleResultInfo> getResults() {
        return this.results;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToIcon() {
        return this.toIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.latestPrice.hashCode() * 31) + this.percentage.hashCode()) * 31) + this.fromIcon.hashCode()) * 31) + this.toIcon.hashCode()) * 31) + Boolean.hashCode(this.success)) * 31) + this.maxPrice.hashCode()) * 31) + this.minPrice.hashCode()) * 31) + Boolean.hashCode(this.canUpdate)) * 31) + this.tag.hashCode()) * 31) + this.results.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanUpdate(boolean z) {
        this.canUpdate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.latestPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.success = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CandleResultBean(latestPrice=" + this.latestPrice + ", percentage=" + this.percentage + ", fromIcon=" + this.fromIcon + ", toIcon=" + this.toIcon + ", success=" + this.success + ", maxPrice=" + this.maxPrice + ", minPrice=" + this.minPrice + ", canUpdate=" + this.canUpdate + ", tag=" + this.tag + ", results=" + this.results + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.latestPrice);
        parcel.writeString(this.percentage);
        parcel.writeString(this.fromIcon);
        parcel.writeString(this.toIcon);
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.maxPrice);
        parcel.writeString(this.minPrice);
        parcel.writeInt(this.canUpdate ? 1 : 0);
        parcel.writeString(this.tag);
        List<CandleResultInfo> list = this.results;
        parcel.writeInt(list.size());
        Iterator<CandleResultInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CandleResultBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CandleResultBean> serializer() {
            return CandleResultBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CandleResultBean(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, String str7, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.latestPrice = "";
        } else {
            this.latestPrice = str;
        }
        if ((i & 2) == 0) {
            this.percentage = "";
        } else {
            this.percentage = str2;
        }
        if ((i & 4) == 0) {
            this.fromIcon = "";
        } else {
            this.fromIcon = str3;
        }
        if ((i & 8) == 0) {
            this.toIcon = "";
        } else {
            this.toIcon = str4;
        }
        if ((i & 16) == 0) {
            this.success = true;
        } else {
            this.success = z;
        }
        if ((i & 32) == 0) {
            this.maxPrice = "";
        } else {
            this.maxPrice = str5;
        }
        if ((i & 64) == 0) {
            this.minPrice = "";
        } else {
            this.minPrice = str6;
        }
        if ((i & 128) == 0) {
            this.canUpdate = true;
        } else {
            this.canUpdate = z2;
        }
        if ((i & 256) == 0) {
            this.tag = String.valueOf(SystemClock.elapsedRealtime());
        } else {
            this.tag = str7;
        }
        if ((i & 512) == 0) {
            this.results = new ArrayList();
        } else {
            this.results = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CandleResultBean candleResultBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) candleResultBean.latestPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, candleResultBean.latestPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) candleResultBean.percentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, candleResultBean.percentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) candleResultBean.fromIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, candleResultBean.fromIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) candleResultBean.toIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, candleResultBean.toIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !candleResultBean.success) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, candleResultBean.success);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) candleResultBean.maxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, candleResultBean.maxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) candleResultBean.minPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, candleResultBean.minPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !candleResultBean.canUpdate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, candleResultBean.canUpdate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) candleResultBean.tag, (Object) String.valueOf(SystemClock.elapsedRealtime()))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, candleResultBean.tag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd(candleResultBean.results, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], candleResultBean.results);
    }

    public CandleResultBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, boolean z2, @NotNull String str7, @NotNull List<CandleResultInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.latestPrice = str;
        this.percentage = str2;
        this.fromIcon = str3;
        this.toIcon = str4;
        this.success = z;
        this.maxPrice = str5;
        this.minPrice = str6;
        this.canUpdate = z2;
        this.tag = str7;
        this.results = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : true)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: INVOKE 
  (wrap:long:0x0043: INVOKE  STATIC call: android.os.SystemClock.elapsedRealtime():long A[MD:():long (c), WRAPPED] (LINE:26))
 STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:26)) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004e: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:27) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r21v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.CandleResultInfo>):void (m)] (LINE:17) call: com.okinc.business.dexlogic.bean.CandleResultBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CandleResultBean(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) == 0 ? z2 : true, (i & 256) != 0 ? String.valueOf(SystemClock.elapsedRealtime()) : str7, (i & 512) != 0 ? new ArrayList() : list);
    }
}
