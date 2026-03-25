package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MultiMinAmountItem implements Parcelable {
    private final String apy;
    private final ArbitrageCostVo arbitrageCostVo;
    private final String displayMinPaybackDays;
    private final List<FundingFeeApyItem> fundingFeeApyList;
    private final String highestApyPeriod;
    private final String minAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultiMinAmountItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(FundingFeeApyItem$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MultiMinAmountItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiMinAmountItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            ArbitrageCostVo arbitrageCostVoCreateFromParcel = parcel.readInt() == 0 ? null : ArbitrageCostVo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(FundingFeeApyItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new MultiMinAmountItem(string, string2, string3, arbitrageCostVoCreateFromParcel, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiMinAmountItem[] newArray(int i) {
            return new MultiMinAmountItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiMinAmountItem() {
        this((String) null, (String) null, (String) null, (ArbitrageCostVo) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.MultiMinAmountItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiMinAmountItem copy$default(MultiMinAmountItem multiMinAmountItem, String str, String str2, String str3, ArbitrageCostVo arbitrageCostVo, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiMinAmountItem.minAmount;
        }
        if ((i & 2) != 0) {
            str2 = multiMinAmountItem.highestApyPeriod;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = multiMinAmountItem.displayMinPaybackDays;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            arbitrageCostVo = multiMinAmountItem.arbitrageCostVo;
        }
        ArbitrageCostVo arbitrageCostVo2 = arbitrageCostVo;
        if ((i & 16) != 0) {
            list = multiMinAmountItem.fundingFeeApyList;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str4 = multiMinAmountItem.apy;
        }
        return multiMinAmountItem.copy(str, str5, str6, arbitrageCostVo2, list2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageCostVo component4() {
        return this.arbitrageCostVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeApyItem> component5() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiMinAmountItem copy(String str, String str2, String str3, ArbitrageCostVo arbitrageCostVo, List<FundingFeeApyItem> list, String str4) {
        return new MultiMinAmountItem(str, str2, str3, arbitrageCostVo, list, str4);
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
        if (!(obj instanceof MultiMinAmountItem)) {
            return false;
        }
        MultiMinAmountItem multiMinAmountItem = (MultiMinAmountItem) obj;
        return Intrinsics.EZpvd((Object) this.minAmount, (Object) multiMinAmountItem.minAmount) && Intrinsics.EZpvd((Object) this.highestApyPeriod, (Object) multiMinAmountItem.highestApyPeriod) && Intrinsics.EZpvd((Object) this.displayMinPaybackDays, (Object) multiMinAmountItem.displayMinPaybackDays) && Intrinsics.EZpvd(this.arbitrageCostVo, multiMinAmountItem.arbitrageCostVo) && Intrinsics.EZpvd(this.fundingFeeApyList, multiMinAmountItem.fundingFeeApyList) && Intrinsics.EZpvd((Object) this.apy, (Object) multiMinAmountItem.apy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageCostVo getArbitrageCostVo() {
        return this.arbitrageCostVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayMinPaybackDays() {
        return this.displayMinPaybackDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeApyItem> getFundingFeeApyList() {
        return this.fundingFeeApyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighestApyPeriod() {
        return this.highestApyPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.minAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.highestApyPeriod;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.displayMinPaybackDays;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        ArbitrageCostVo arbitrageCostVo = this.arbitrageCostVo;
        int iHashCode4 = arbitrageCostVo == null ? 0 : arbitrageCostVo.hashCode();
        List<FundingFeeApyItem> list = this.fundingFeeApyList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str4 = this.apy;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiMinAmountItem(minAmount=" + this.minAmount + ", highestApyPeriod=" + this.highestApyPeriod + ", displayMinPaybackDays=" + this.displayMinPaybackDays + ", arbitrageCostVo=" + this.arbitrageCostVo + ", fundingFeeApyList=" + this.fundingFeeApyList + ", apy=" + this.apy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minAmount);
        parcel.writeString(this.highestApyPeriod);
        parcel.writeString(this.displayMinPaybackDays);
        ArbitrageCostVo arbitrageCostVo = this.arbitrageCostVo;
        if (arbitrageCostVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageCostVo.writeToParcel(parcel, i);
        }
        List<FundingFeeApyItem> list = this.fundingFeeApyList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<FundingFeeApyItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.apy);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MultiMinAmountItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiMinAmountItem> serializer() {
            return MultiMinAmountItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiMinAmountItem(int i, String str, String str2, String str3, ArbitrageCostVo arbitrageCostVo, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minAmount = null;
        } else {
            this.minAmount = str;
        }
        if ((i & 2) == 0) {
            this.highestApyPeriod = null;
        } else {
            this.highestApyPeriod = str2;
        }
        if ((i & 4) == 0) {
            this.displayMinPaybackDays = "false";
        } else {
            this.displayMinPaybackDays = str3;
        }
        if ((i & 8) == 0) {
            this.arbitrageCostVo = null;
        } else {
            this.arbitrageCostVo = arbitrageCostVo;
        }
        if ((i & 16) == 0) {
            this.fundingFeeApyList = null;
        } else {
            this.fundingFeeApyList = list;
        }
        if ((i & 32) == 0) {
            this.apy = null;
        } else {
            this.apy = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MultiMinAmountItem multiMinAmountItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || multiMinAmountItem.minAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, multiMinAmountItem.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || multiMinAmountItem.highestApyPeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, multiMinAmountItem.highestApyPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) multiMinAmountItem.displayMinPaybackDays, (Object) "false")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, multiMinAmountItem.displayMinPaybackDays);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || multiMinAmountItem.arbitrageCostVo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ArbitrageCostVo$$serializer.INSTANCE, multiMinAmountItem.arbitrageCostVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || multiMinAmountItem.fundingFeeApyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], multiMinAmountItem.fundingFeeApyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && multiMinAmountItem.apy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, multiMinAmountItem.apy);
    }

    public MultiMinAmountItem(String str, String str2, String str3, ArbitrageCostVo arbitrageCostVo, List<FundingFeeApyItem> list, String str4) {
        this.minAmount = str;
        this.highestApyPeriod = str2;
        this.displayMinPaybackDays = str3;
        this.arbitrageCostVo = arbitrageCostVo;
        this.fundingFeeApyList = list;
        this.apy = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("false") : (r8v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ArbitrageCostVo:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ArbitrageCostVo) : (r9v0 com.okinc.unify_trade.biz.ArbitrageCostVo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageCostVo, java.util.List<com.okinc.unify_trade.biz.FundingFeeApyItem>, java.lang.String):void (m)] (LINE:3867) call: com.okinc.unify_trade.biz.MultiMinAmountItem.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ArbitrageCostVo, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MultiMinAmountItem(String str, String str2, String str3, ArbitrageCostVo arbitrageCostVo, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "false" : str3, (i & 8) != 0 ? null : arbitrageCostVo, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4);
    }

    public final FundingFeeApyItem getMinHoldDayApyItem() {
        List<FundingFeeApyItem> list = this.fundingFeeApyList;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.EZpvd((Object) ((FundingFeeApyItem) next).getPeriod(), (Object) this.highestApyPeriod)) {
                obj = next;
                break;
            }
        }
        return (FundingFeeApyItem) obj;
    }
}
