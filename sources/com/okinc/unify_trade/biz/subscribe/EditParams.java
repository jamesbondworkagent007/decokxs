package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.DcaTriggerParam$$serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EditParams implements Parcelable {
    private final String currentCycleId;
    private final String initOrdAmt;
    private final String maxSafetyOrds;
    private final String pxSteps;
    private final String pxStepsMult;
    private final String reserveFunds;
    private final String safetyOrdAmt;
    private final String slPct;
    private final String tpPct;
    private final List<DcaTriggerParam> triggerParams;
    private final String volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(BuiltinSerializersKt.getNullable(DcaTriggerParam$$serializer.INSTANCE)), null, null, null};

    public static final class Creator implements Parcelable.Creator<EditParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readInt() == 0 ? null : DcaTriggerParam.CREATOR.createFromParcel(parcel));
                }
            }
            return new EditParams(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditParams[] newArray(int i) {
            return new EditParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EditParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentCycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component8() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<DcaTriggerParam> list, String str8, String str9, String str10) {
        return new EditParams(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10);
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
        if (!(obj instanceof EditParams)) {
            return false;
        }
        EditParams editParams = (EditParams) obj;
        return Intrinsics.EZpvd((Object) this.currentCycleId, (Object) editParams.currentCycleId) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) editParams.pxSteps) && Intrinsics.EZpvd((Object) this.tpPct, (Object) editParams.tpPct) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) editParams.initOrdAmt) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) editParams.safetyOrdAmt) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) editParams.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.reserveFunds, (Object) editParams.reserveFunds) && Intrinsics.EZpvd(this.triggerParams, editParams.triggerParams) && Intrinsics.EZpvd((Object) this.volMult, (Object) editParams.volMult) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) editParams.pxStepsMult) && Intrinsics.EZpvd((Object) this.slPct, (Object) editParams.slPct);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentCycleId() {
        return this.currentCycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currentCycleId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pxSteps;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tpPct;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.initOrdAmt;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.safetyOrdAmt;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maxSafetyOrds;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.reserveFunds;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        List<DcaTriggerParam> list = this.triggerParams;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        String str8 = this.volMult;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.pxStepsMult;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.slPct;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditParams(currentCycleId=" + this.currentCycleId + ", pxSteps=" + this.pxSteps + ", tpPct=" + this.tpPct + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", maxSafetyOrds=" + this.maxSafetyOrds + ", reserveFunds=" + this.reserveFunds + ", triggerParams=" + this.triggerParams + ", volMult=" + this.volMult + ", pxStepsMult=" + this.pxStepsMult + ", slPct=" + this.slPct + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currentCycleId);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.reserveFunds);
        List<DcaTriggerParam> list = this.triggerParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (DcaTriggerParam dcaTriggerParam : list) {
                if (dcaTriggerParam == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    dcaTriggerParam.writeToParcel(parcel, i);
                }
            }
        }
        parcel.writeString(this.volMult);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.slPct);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.EditParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditParams> serializer() {
            return EditParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditParams(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currentCycleId = null;
        } else {
            this.currentCycleId = str;
        }
        if ((i & 2) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str2;
        }
        if ((i & 4) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = str3;
        }
        if ((i & 8) == 0) {
            this.initOrdAmt = null;
        } else {
            this.initOrdAmt = str4;
        }
        if ((i & 16) == 0) {
            this.safetyOrdAmt = null;
        } else {
            this.safetyOrdAmt = str5;
        }
        if ((i & 32) == 0) {
            this.maxSafetyOrds = null;
        } else {
            this.maxSafetyOrds = str6;
        }
        if ((i & 64) == 0) {
            this.reserveFunds = null;
        } else {
            this.reserveFunds = str7;
        }
        if ((i & 128) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list;
        }
        if ((i & 256) == 0) {
            this.volMult = null;
        } else {
            this.volMult = str8;
        }
        if ((i & 512) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = str9;
        }
        if ((i & 1024) == 0) {
            this.slPct = null;
        } else {
            this.slPct = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EditParams editParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || editParams.currentCycleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, editParams.currentCycleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || editParams.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, editParams.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editParams.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, editParams.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || editParams.initOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, editParams.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || editParams.safetyOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, editParams.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || editParams.maxSafetyOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, editParams.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || editParams.reserveFunds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, editParams.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || editParams.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], editParams.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || editParams.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, editParams.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || editParams.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, editParams.pxStepsMult);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && editParams.slPct == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, editParams.slPct);
    }

    public EditParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<DcaTriggerParam> list, String str8, String str9, String str10) {
        this.currentCycleId = str;
        this.pxSteps = str2;
        this.tpPct = str3;
        this.initOrdAmt = str4;
        this.safetyOrdAmt = str5;
        this.maxSafetyOrds = str6;
        this.reserveFunds = str7;
        this.triggerParams = list;
        this.volMult = str8;
        this.pxStepsMult = str9;
        this.slPct = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.unify_trade.biz.subscribe.EditParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EditParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) == 0 ? str10 : null);
    }
}
