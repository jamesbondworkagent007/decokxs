package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
public final class SmartArbHisOrderItem implements Parcelable {
    private final String apy;
    private final String cTime;
    private final String groupId;
    private final String instFamily;
    private final ArrayList<SmartArbPlanLeg> planLeg;
    private final String spreadPx;
    private final String totalFundingFeeRatio;
    private final String totalPnl;
    private final String uTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbHisOrderItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(SmartArbPlanLeg$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SmartArbHisOrderItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbHisOrderItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
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
            return new SmartArbHisOrderItem(string, string2, string3, string4, string5, string6, string7, string8, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbHisOrderItem[] newArray(int i) {
            return new SmartArbHisOrderItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbHisOrderItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.spreadPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalFundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SmartArbPlanLeg> component9() {
        return this.planLeg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbHisOrderItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList<SmartArbPlanLeg> arrayList) {
        return new SmartArbHisOrderItem(str, str2, str3, str4, str5, str6, str7, str8, arrayList);
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
        if (!(obj instanceof SmartArbHisOrderItem)) {
            return false;
        }
        SmartArbHisOrderItem smartArbHisOrderItem = (SmartArbHisOrderItem) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) smartArbHisOrderItem.groupId) && Intrinsics.EZpvd((Object) this.instFamily, (Object) smartArbHisOrderItem.instFamily) && Intrinsics.EZpvd((Object) this.cTime, (Object) smartArbHisOrderItem.cTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) smartArbHisOrderItem.uTime) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) smartArbHisOrderItem.totalPnl) && Intrinsics.EZpvd((Object) this.apy, (Object) smartArbHisOrderItem.apy) && Intrinsics.EZpvd((Object) this.spreadPx, (Object) smartArbHisOrderItem.spreadPx) && Intrinsics.EZpvd((Object) this.totalFundingFeeRatio, (Object) smartArbHisOrderItem.totalFundingFeeRatio) && Intrinsics.EZpvd(this.planLeg, smartArbHisOrderItem.planLeg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
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
    public final String getSpreadPx() {
        return this.spreadPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFundingFeeRatio() {
        return this.totalFundingFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.groupId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instFamily;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.uTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalPnl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.apy;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.spreadPx;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.totalFundingFeeRatio;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        ArrayList<SmartArbPlanLeg> arrayList = this.planLeg;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbHisOrderItem(groupId=" + this.groupId + ", instFamily=" + this.instFamily + ", cTime=" + this.cTime + ", uTime=" + this.uTime + ", totalPnl=" + this.totalPnl + ", apy=" + this.apy + ", spreadPx=" + this.spreadPx + ", totalFundingFeeRatio=" + this.totalFundingFeeRatio + ", planLeg=" + this.planLeg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupId);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.cTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.apy);
        parcel.writeString(this.spreadPx);
        parcel.writeString(this.totalFundingFeeRatio);
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

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SmartArbHisOrderItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartArbHisOrderItem> serializer() {
            return SmartArbHisOrderItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartArbHisOrderItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str2;
        }
        if ((i & 4) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str3;
        }
        if ((i & 8) == 0) {
            this.uTime = null;
        } else {
            this.uTime = str4;
        }
        if ((i & 16) == 0) {
            this.totalPnl = null;
        } else {
            this.totalPnl = str5;
        }
        if ((i & 32) == 0) {
            this.apy = null;
        } else {
            this.apy = str6;
        }
        if ((i & 64) == 0) {
            this.spreadPx = null;
        } else {
            this.spreadPx = str7;
        }
        if ((i & 128) == 0) {
            this.totalFundingFeeRatio = null;
        } else {
            this.totalFundingFeeRatio = str8;
        }
        if ((i & 256) == 0) {
            this.planLeg = null;
        } else {
            this.planLeg = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartArbHisOrderItem smartArbHisOrderItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartArbHisOrderItem.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, smartArbHisOrderItem.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartArbHisOrderItem.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartArbHisOrderItem.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartArbHisOrderItem.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartArbHisOrderItem.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartArbHisOrderItem.uTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, smartArbHisOrderItem.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || smartArbHisOrderItem.totalPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, smartArbHisOrderItem.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || smartArbHisOrderItem.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, smartArbHisOrderItem.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || smartArbHisOrderItem.spreadPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, smartArbHisOrderItem.spreadPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || smartArbHisOrderItem.totalFundingFeeRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, smartArbHisOrderItem.totalFundingFeeRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && smartArbHisOrderItem.planLeg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], smartArbHisOrderItem.planLeg);
    }

    public SmartArbHisOrderItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList<SmartArbPlanLeg> arrayList) {
        this.groupId = str;
        this.instFamily = str2;
        this.cTime = str3;
        this.uTime = str4;
        this.totalPnl = str5;
        this.apy = str6;
        this.spreadPx = str7;
        this.totalFundingFeeRatio = str8;
        this.planLeg = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.util.ArrayList) : (null java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.SmartArbPlanLeg>):void (m)] (LINE:1645) call: com.okinc.unify_trade.biz.SmartArbHisOrderItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SmartArbHisOrderItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? arrayList : null);
    }
}
