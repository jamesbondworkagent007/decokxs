package com.okinc.okex.lite.earn.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EarnUserOrderList implements Parcelable {
    private final String balance;
    private final long currencyId;
    private final List<EarnProfit> earnProfits;
    private final String fullName;
    private final String iconUrl;
    private final String name;
    private final String profit;
    private final String unit;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarnUserOrderList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(EarnProfit$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EarnUserOrderList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnUserOrderList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EarnProfit.CREATOR.createFromParcel(parcel));
            }
            return new EarnUserOrderList(j, string, string2, string3, string4, string5, string6, string7, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnUserOrderList[] newArray(int i) {
            return new EarnUserOrderList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnProfit> component9() {
        return this.earnProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnUserOrderList copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<EarnProfit> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EarnUserOrderList(j, str, str2, str3, str4, str5, str6, str7, list);
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
        if (!(obj instanceof EarnUserOrderList)) {
            return false;
        }
        EarnUserOrderList earnUserOrderList = (EarnUserOrderList) obj;
        return this.currencyId == earnUserOrderList.currencyId && Intrinsics.EZpvd((Object) this.iconUrl, (Object) earnUserOrderList.iconUrl) && Intrinsics.EZpvd((Object) this.name, (Object) earnUserOrderList.name) && Intrinsics.EZpvd((Object) this.fullName, (Object) earnUserOrderList.fullName) && Intrinsics.EZpvd((Object) this.balance, (Object) earnUserOrderList.balance) && Intrinsics.EZpvd((Object) this.value, (Object) earnUserOrderList.value) && Intrinsics.EZpvd((Object) this.unit, (Object) earnUserOrderList.unit) && Intrinsics.EZpvd((Object) this.profit, (Object) earnUserOrderList.profit) && Intrinsics.EZpvd(this.earnProfits, earnUserOrderList.earnProfits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnProfit> getEarnProfits() {
        return this.earnProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.currencyId) * 31) + this.iconUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.value.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.profit.hashCode()) * 31) + this.earnProfits.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnUserOrderList(currencyId=" + this.currencyId + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", fullName=" + this.fullName + ", balance=" + this.balance + ", value=" + this.value + ", unit=" + this.unit + ", profit=" + this.profit + ", earnProfits=" + this.earnProfits + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.currencyId);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.fullName);
        parcel.writeString(this.balance);
        parcel.writeString(this.value);
        parcel.writeString(this.unit);
        parcel.writeString(this.profit);
        List<EarnProfit> list = this.earnProfits;
        parcel.writeInt(list.size());
        Iterator<EarnProfit> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.EarnUserOrderList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnUserOrderList> serializer() {
            return EarnUserOrderList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnUserOrderList(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, EarnUserOrderList$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = j;
        this.iconUrl = str;
        this.name = str2;
        this.fullName = str3;
        this.balance = str4;
        this.value = str5;
        this.unit = str6;
        this.profit = str7;
        if ((i & 256) == 0) {
            this.earnProfits = yDY.AhwBna();
        } else {
            this.earnProfits = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EarnUserOrderList earnUserOrderList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, earnUserOrderList.currencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, earnUserOrderList.iconUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, earnUserOrderList.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, earnUserOrderList.fullName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, earnUserOrderList.balance);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, earnUserOrderList.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, earnUserOrderList.unit);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, earnUserOrderList.profit);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd(earnUserOrderList.earnProfits, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], earnUserOrderList.earnProfits);
    }

    public EarnUserOrderList(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<EarnProfit> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currencyId = j;
        this.iconUrl = str;
        this.name = str2;
        this.fullName = str3;
        this.balance = str4;
        this.value = str5;
        this.unit = str6;
        this.profit = str7;
        this.earnProfits = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r13v0 long)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r22v0 java.util.List))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.okex.lite.earn.bean.EarnProfit>):void (m)] (LINE:22) call: com.okinc.okex.lite.earn.bean.EarnUserOrderList.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ EarnUserOrderList(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, str6, str7, (i & 256) != 0 ? yDY.AhwBna() : list);
    }
}
