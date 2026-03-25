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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class InstTypeItem {
    private final ArrayList<BillTypeItem> billTypes;
    private final String instType;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(BillTypeItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InstTypeItem() {
        this((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.InstTypeItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstTypeItem copy$default(InstTypeItem instTypeItem, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instTypeItem.instType;
        }
        if ((i & 2) != 0) {
            str2 = instTypeItem.name;
        }
        if ((i & 4) != 0) {
            arrayList = instTypeItem.billTypes;
        }
        return instTypeItem.copy(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BillTypeItem> component3() {
        return this.billTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstTypeItem copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<BillTypeItem> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new InstTypeItem(str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstTypeItem)) {
            return false;
        }
        InstTypeItem instTypeItem = (InstTypeItem) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) instTypeItem.instType) && Intrinsics.EZpvd((Object) this.name, (Object) instTypeItem.name) && Intrinsics.EZpvd(this.billTypes, instTypeItem.billTypes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BillTypeItem> getBillTypes() {
        return this.billTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.instType.hashCode() * 31) + this.name.hashCode()) * 31) + this.billTypes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstTypeItem(instType=" + this.instType + ", name=" + this.name + ", billTypes=" + this.billTypes + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstTypeItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstTypeItem> serializer() {
            return InstTypeItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstTypeItem(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.billTypes = new ArrayList<>();
        } else {
            this.billTypes = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstTypeItem instTypeItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) instTypeItem.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, instTypeItem.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) instTypeItem.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, instTypeItem.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(instTypeItem.billTypes, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], instTypeItem.billTypes);
    }

    public InstTypeItem(@NotNull String str, @NotNull String str2, @NotNull ArrayList<BillTypeItem> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.instType = str;
        this.name = str2;
        this.billTypes = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:133) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.BillTypeItem>):void (m)] (LINE:130) call: com.okinc.unify_trade.biz.InstTypeItem.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ InstTypeItem(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
