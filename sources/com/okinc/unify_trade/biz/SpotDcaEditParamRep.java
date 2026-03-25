package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SpotDcaEditParamRep implements Parcelable {
    private final String algoId;
    private final String currentCycleId;
    private final String initOrdAmt;
    private final String maxSafetyOrds;
    private final String pxSteps;
    private final String pxStepsMult;
    private final boolean reserveFunds;
    private final String safetyOrdAmt;
    private final String slPct;
    private final String tpPct;
    private final List<DcaTriggerParam> triggerParams;
    private final String volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotDcaEditParamRep> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(BuiltinSerializersKt.getNullable(DcaTriggerParam$$serializer.INSTANCE)), null, null, null};

    public static final class Creator implements Parcelable.Creator<SpotDcaEditParamRep> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaEditParamRep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : DcaTriggerParam.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SpotDcaEditParamRep(string, string2, string3, string4, string5, string6, string7, z, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaEditParamRep[] newArray(int i) {
            return new SpotDcaEditParamRep[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
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
    public final boolean getReserveFunds() {
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
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.currentCycleId);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeInt(this.reserveFunds ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotDcaEditParamRep.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotDcaEditParamRep> serializer() {
            return SpotDcaEditParamRep$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotDcaEditParamRep(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, List list, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (2288 != (i & 2288)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2288, SpotDcaEditParamRep$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.currentCycleId = null;
        } else {
            this.currentCycleId = str2;
        }
        if ((i & 4) == 0) {
            this.pxSteps = "";
        } else {
            this.pxSteps = str3;
        }
        if ((i & 8) == 0) {
            this.tpPct = "";
        } else {
            this.tpPct = str4;
        }
        this.initOrdAmt = str5;
        this.safetyOrdAmt = str6;
        this.maxSafetyOrds = str7;
        this.reserveFunds = z;
        if ((i & 256) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list;
        }
        if ((i & 512) == 0) {
            this.volMult = "";
        } else {
            this.volMult = str8;
        }
        if ((i & 1024) == 0) {
            this.pxStepsMult = "";
        } else {
            this.pxStepsMult = str9;
        }
        this.slPct = str10;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotDcaEditParamRep spotDcaEditParamRep, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotDcaEditParamRep.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotDcaEditParamRep.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotDcaEditParamRep.currentCycleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotDcaEditParamRep.currentCycleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotDcaEditParamRep.pxSteps, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotDcaEditParamRep.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotDcaEditParamRep.tpPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotDcaEditParamRep.tpPct);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, spotDcaEditParamRep.initOrdAmt);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, spotDcaEditParamRep.safetyOrdAmt);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, spotDcaEditParamRep.maxSafetyOrds);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, spotDcaEditParamRep.reserveFunds);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || spotDcaEditParamRep.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], spotDcaEditParamRep.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) spotDcaEditParamRep.volMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, spotDcaEditParamRep.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) spotDcaEditParamRep.pxStepsMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, spotDcaEditParamRep.pxStepsMult);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, spotDcaEditParamRep.slPct);
    }

    public SpotDcaEditParamRep(String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, List<DcaTriggerParam> list, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.algoId = str;
        this.currentCycleId = str2;
        this.pxSteps = str3;
        this.tpPct = str4;
        this.initOrdAmt = str5;
        this.safetyOrdAmt = str6;
        this.maxSafetyOrds = str7;
        this.reserveFunds = z;
        this.triggerParams = list;
        this.volMult = str8;
        this.pxStepsMult = str9;
        this.slPct = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 boolean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (r28v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:816) call: com.okinc.unify_trade.biz.SpotDcaEditParamRep.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotDcaEditParamRep(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, List list, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, str5, str6, str7, z, (i & 256) != 0 ? null : list, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, str10);
    }
}
