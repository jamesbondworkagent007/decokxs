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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ConceptRankData {
    private ArrayList<ConceptHot> hot;
    private ArrayList<ConceptUpDown> upDown;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ConceptHot$$serializer.INSTANCE), new ArrayListSerializer(ConceptUpDown$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConceptRankData() {
        this((ArrayList) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.ConceptRankData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConceptRankData copy$default(ConceptRankData conceptRankData, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = conceptRankData.hot;
        }
        if ((i & 2) != 0) {
            arrayList2 = conceptRankData.upDown;
        }
        return conceptRankData.copy(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConceptHot> component1() {
        return this.hot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConceptUpDown> component2() {
        return this.upDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConceptRankData copy(ArrayList<ConceptHot> arrayList, ArrayList<ConceptUpDown> arrayList2) {
        return new ConceptRankData(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConceptRankData)) {
            return false;
        }
        ConceptRankData conceptRankData = (ConceptRankData) obj;
        return Intrinsics.EZpvd(this.hot, conceptRankData.hot) && Intrinsics.EZpvd(this.upDown, conceptRankData.upDown);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConceptHot> getHot() {
        return this.hot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConceptUpDown> getUpDown() {
        return this.upDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<ConceptHot> arrayList = this.hot;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList<ConceptUpDown> arrayList2 = this.upDown;
        return (iHashCode * 31) + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHot(ArrayList<ConceptHot> arrayList) {
        this.hot = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpDown(ArrayList<ConceptUpDown> arrayList) {
        this.upDown = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConceptRankData(hot=" + this.hot + ", upDown=" + this.upDown + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ConceptRankData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConceptRankData> serializer() {
            return ConceptRankData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConceptRankData(int i, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hot = null;
        } else {
            this.hot = arrayList;
        }
        if ((i & 2) == 0) {
            this.upDown = null;
        } else {
            this.upDown = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ConceptRankData conceptRankData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || conceptRankData.hot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], conceptRankData.hot);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && conceptRankData.upDown == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], conceptRankData.upDown);
    }

    public ConceptRankData(ArrayList<ConceptHot> arrayList, ArrayList<ConceptUpDown> arrayList2) {
        this.hot = arrayList;
        this.upDown = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.ConceptHot>, java.util.ArrayList<com.okinc.unify_trade.biz.ConceptUpDown>):void (m)] (LINE:18) call: com.okinc.unify_trade.biz.ConceptRankData.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ ConceptRankData(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2);
    }
}
