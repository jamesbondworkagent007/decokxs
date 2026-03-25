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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SmartArbListItem implements Parcelable {
    private final String instFamily;
    private final ArrayList<SmartArbPlanLeg> planLeg;
    private final String preFundingFee;
    private final String spreadPx;
    private final String totalFundingFeeRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbListItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(SmartArbPlanLeg$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SmartArbListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbListItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(SmartArbPlanLeg.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SmartArbListItem(string, string2, string3, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbListItem[] newArray(int i) {
            return new SmartArbListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbListItem() {
        this((String) null, (String) null, (String) null, (String) null, (ArrayList) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.SmartArbListItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartArbListItem copy$default(SmartArbListItem smartArbListItem, String str, String str2, String str3, String str4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartArbListItem.instFamily;
        }
        if ((i & 2) != 0) {
            str2 = smartArbListItem.spreadPx;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = smartArbListItem.totalFundingFeeRatio;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = smartArbListItem.preFundingFee;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            arrayList = smartArbListItem.planLeg;
        }
        return smartArbListItem.copy(str, str5, str6, str7, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.spreadPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalFundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.preFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbPlanLeg> component5() {
        return this.planLeg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbListItem copy(String str, String str2, String str3, String str4, ArrayList<SmartArbPlanLeg> arrayList) {
        return new SmartArbListItem(str, str2, str3, str4, arrayList);
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
        if (!(obj instanceof SmartArbListItem)) {
            return false;
        }
        SmartArbListItem smartArbListItem = (SmartArbListItem) obj;
        return Intrinsics.EZpvd((Object) this.instFamily, (Object) smartArbListItem.instFamily) && Intrinsics.EZpvd((Object) this.spreadPx, (Object) smartArbListItem.spreadPx) && Intrinsics.EZpvd((Object) this.totalFundingFeeRatio, (Object) smartArbListItem.totalFundingFeeRatio) && Intrinsics.EZpvd((Object) this.preFundingFee, (Object) smartArbListItem.preFundingFee) && Intrinsics.EZpvd(this.planLeg, smartArbListItem.planLeg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbPlanLeg> getPlanLeg() {
        return this.planLeg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreFundingFee() {
        return this.preFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadPx() {
        return this.spreadPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFundingFeeRatio() {
        return this.totalFundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instFamily;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.spreadPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalFundingFeeRatio;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.preFundingFee;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        ArrayList<SmartArbPlanLeg> arrayList = this.planLeg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbListItem(instFamily=" + this.instFamily + ", spreadPx=" + this.spreadPx + ", totalFundingFeeRatio=" + this.totalFundingFeeRatio + ", preFundingFee=" + this.preFundingFee + ", planLeg=" + this.planLeg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instFamily);
        parcel.writeString(this.spreadPx);
        parcel.writeString(this.totalFundingFeeRatio);
        parcel.writeString(this.preFundingFee);
        ArrayList<SmartArbPlanLeg> arrayList = this.planLeg;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<SmartArbPlanLeg> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartArbListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbListItem> serializer() {
            return SmartArbListItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbListItem(int i, String str, String str2, String str3, String str4, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str;
        }
        if ((i & 2) == 0) {
            this.spreadPx = null;
        } else {
            this.spreadPx = str2;
        }
        if ((i & 4) == 0) {
            this.totalFundingFeeRatio = null;
        } else {
            this.totalFundingFeeRatio = str3;
        }
        if ((i & 8) == 0) {
            this.preFundingFee = null;
        } else {
            this.preFundingFee = str4;
        }
        if ((i & 16) == 0) {
            this.planLeg = null;
        } else {
            this.planLeg = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartArbListItem smartArbListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartArbListItem.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartArbListItem.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartArbListItem.spreadPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartArbListItem.spreadPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartArbListItem.totalFundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartArbListItem.totalFundingFeeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartArbListItem.preFundingFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, smartArbListItem.preFundingFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && smartArbListItem.planLeg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], smartArbListItem.planLeg);
    }

    public SmartArbListItem(String str, String str2, String str3, String str4, ArrayList<SmartArbPlanLeg> arrayList) {
        this.instFamily = str;
        this.spreadPx = str2;
        this.totalFundingFeeRatio = str3;
        this.preFundingFee = str4;
        this.planLeg = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r9v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.SmartArbPlanLeg>):void (m)] (LINE:1598) call: com.okinc.unify_trade.biz.SmartArbListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SmartArbListItem(String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : arrayList);
    }
}
