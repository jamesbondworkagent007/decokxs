package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InstTypeGroup {
    private final ArrayList<InstTypeData> availableType;
    private final ArrayList<ChargeGroupData> baseGroup;
    private final ArrayList<FutureGroupData> contractGroup;
    private final String displayLocalisation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InstTypeData$$serializer.INSTANCE), new ArrayListSerializer(ChargeGroupData$$serializer.INSTANCE), new ArrayListSerializer(FutureGroupData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InstTypeGroup() {
        this((ArrayList) null, (ArrayList) null, (ArrayList) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.InstTypeGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstTypeGroup copy$default(InstTypeGroup instTypeGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = instTypeGroup.availableType;
        }
        if ((i & 2) != 0) {
            arrayList2 = instTypeGroup.baseGroup;
        }
        if ((i & 4) != 0) {
            arrayList3 = instTypeGroup.contractGroup;
        }
        if ((i & 8) != 0) {
            str = instTypeGroup.displayLocalisation;
        }
        return instTypeGroup.copy(arrayList, arrayList2, arrayList3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstTypeData> component1() {
        return this.availableType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ChargeGroupData> component2() {
        return this.baseGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FutureGroupData> component3() {
        return this.contractGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayLocalisation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstTypeGroup copy(ArrayList<InstTypeData> arrayList, ArrayList<ChargeGroupData> arrayList2, ArrayList<FutureGroupData> arrayList3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InstTypeGroup(arrayList, arrayList2, arrayList3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstTypeGroup)) {
            return false;
        }
        InstTypeGroup instTypeGroup = (InstTypeGroup) obj;
        return Intrinsics.EZpvd(this.availableType, instTypeGroup.availableType) && Intrinsics.EZpvd(this.baseGroup, instTypeGroup.baseGroup) && Intrinsics.EZpvd(this.contractGroup, instTypeGroup.contractGroup) && Intrinsics.EZpvd((Object) this.displayLocalisation, (Object) instTypeGroup.displayLocalisation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InstTypeData> getAvailableType() {
        return this.availableType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ChargeGroupData> getBaseGroup() {
        return this.baseGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FutureGroupData> getContractGroup() {
        return this.contractGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayLocalisation() {
        return this.displayLocalisation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<InstTypeData> arrayList = this.availableType;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<ChargeGroupData> arrayList2 = this.baseGroup;
        int iHashCode2 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList<FutureGroupData> arrayList3 = this.contractGroup;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31) + this.displayLocalisation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstTypeGroup(availableType=" + this.availableType + ", baseGroup=" + this.baseGroup + ", contractGroup=" + this.contractGroup + ", displayLocalisation=" + this.displayLocalisation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstTypeGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstTypeGroup> serializer() {
            return InstTypeGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstTypeGroup(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availableType = null;
        } else {
            this.availableType = arrayList;
        }
        if ((i & 2) == 0) {
            this.baseGroup = null;
        } else {
            this.baseGroup = arrayList2;
        }
        if ((i & 4) == 0) {
            this.contractGroup = null;
        } else {
            this.contractGroup = arrayList3;
        }
        if ((i & 8) == 0) {
            this.displayLocalisation = "";
        } else {
            this.displayLocalisation = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstTypeGroup instTypeGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || instTypeGroup.availableType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], instTypeGroup.availableType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || instTypeGroup.baseGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], instTypeGroup.baseGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || instTypeGroup.contractGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], instTypeGroup.contractGroup);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) instTypeGroup.displayLocalisation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, instTypeGroup.displayLocalisation);
    }

    public InstTypeGroup(ArrayList<InstTypeData> arrayList, ArrayList<ChargeGroupData> arrayList2, ArrayList<FutureGroupData> arrayList3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availableType = arrayList;
        this.baseGroup = arrayList2;
        this.contractGroup = arrayList3;
        this.displayLocalisation = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.InstTypeData>, java.util.ArrayList<com.okinc.unify_trade.biz.ChargeGroupData>, java.util.ArrayList<com.okinc.unify_trade.biz.FutureGroupData>, java.lang.String):void (m)] (LINE:83) call: com.okinc.unify_trade.biz.InstTypeGroup.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ InstTypeGroup(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? null : arrayList3, (i & 8) != 0 ? "" : str);
    }
}
