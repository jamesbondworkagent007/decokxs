package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2$$serializer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FullRecentActivityPageDataV2 {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<TransactionType, Boolean> hasMore;
    private final int numberOfDays;
    private final Map<TransactionType, List<TransactionDisplayModelV2>> txnLists;
    private final Map<TransactionType, SelfServiceTools> txnSelfServiceTools;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.FullRecentActivityPageDataV2 */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FullRecentActivityPageDataV2 copy$default(FullRecentActivityPageDataV2 fullRecentActivityPageDataV2, int i, Map map, Map map2, Map map3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fullRecentActivityPageDataV2.numberOfDays;
        }
        if ((i2 & 2) != 0) {
            map = fullRecentActivityPageDataV2.txnLists;
        }
        if ((i2 & 4) != 0) {
            map2 = fullRecentActivityPageDataV2.txnSelfServiceTools;
        }
        if ((i2 & 8) != 0) {
            map3 = fullRecentActivityPageDataV2.hasMore;
        }
        return fullRecentActivityPageDataV2.copy(i, map, map2, map3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.numberOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<TransactionType, List<TransactionDisplayModelV2>> component2() {
        return this.txnLists;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<TransactionType, SelfServiceTools> component3() {
        return this.txnSelfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<TransactionType, Boolean> component4() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FullRecentActivityPageDataV2 copy(int i, @NotNull Map<TransactionType, ? extends List<TransactionDisplayModelV2>> map, @NotNull Map<TransactionType, SelfServiceTools> map2, @NotNull Map<TransactionType, Boolean> map3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        return new FullRecentActivityPageDataV2(i, map, map2, map3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullRecentActivityPageDataV2)) {
            return false;
        }
        FullRecentActivityPageDataV2 fullRecentActivityPageDataV2 = (FullRecentActivityPageDataV2) obj;
        return this.numberOfDays == fullRecentActivityPageDataV2.numberOfDays && Intrinsics.EZpvd(this.txnLists, fullRecentActivityPageDataV2.txnLists) && Intrinsics.EZpvd(this.txnSelfServiceTools, fullRecentActivityPageDataV2.txnSelfServiceTools) && Intrinsics.EZpvd(this.hasMore, fullRecentActivityPageDataV2.hasMore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<TransactionType, Boolean> getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<TransactionType, List<TransactionDisplayModelV2>> getTxnLists() {
        return this.txnLists;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<TransactionType, SelfServiceTools> getTxnSelfServiceTools() {
        return this.txnSelfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.numberOfDays) * 31) + this.txnLists.hashCode()) * 31) + this.txnSelfServiceTools.hashCode()) * 31) + this.hasMore.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FullRecentActivityPageDataV2(numberOfDays=" + this.numberOfDays + ", txnLists=" + this.txnLists + ", txnSelfServiceTools=" + this.txnSelfServiceTools + ", hasMore=" + this.hasMore + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.FullRecentActivityPageDataV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FullRecentActivityPageDataV2> serializer() {
            return FullRecentActivityPageDataV2$$serializer.INSTANCE;
        }
    }

    static {
        TransactionType.Companion companion = TransactionType.Companion;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(companion.serializer(), new ArrayListSerializer(TransactionDisplayModelV2$$serializer.INSTANCE)), new LinkedHashMapSerializer(companion.serializer(), SelfServiceTools$$serializer.INSTANCE), new LinkedHashMapSerializer(companion.serializer(), BooleanSerializer.INSTANCE)};
    }

    public /* synthetic */ FullRecentActivityPageDataV2(int i, int i2, Map map, Map map2, Map map3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FullRecentActivityPageDataV2$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfDays = i2;
        this.txnLists = map;
        if ((i & 4) == 0) {
            this.txnSelfServiceTools = C56424yEw.KWHzl();
        } else {
            this.txnSelfServiceTools = map2;
        }
        if ((i & 8) == 0) {
            this.hasMore = C56424yEw.KWHzl();
        } else {
            this.hasMore = map3;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FullRecentActivityPageDataV2 fullRecentActivityPageDataV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, fullRecentActivityPageDataV2.numberOfDays);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], fullRecentActivityPageDataV2.txnLists);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(fullRecentActivityPageDataV2.txnSelfServiceTools, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], fullRecentActivityPageDataV2.txnSelfServiceTools);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(fullRecentActivityPageDataV2.hasMore, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], fullRecentActivityPageDataV2.hasMore);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<com.okinc.okex.center.bean.enums.TransactionType, ? extends java.util.List<com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2>> */
    /* JADX WARN: Multi-variable type inference failed */
    public FullRecentActivityPageDataV2(int i, @NotNull Map<TransactionType, ? extends List<TransactionDisplayModelV2>> map, @NotNull Map<TransactionType, SelfServiceTools> map2, @NotNull Map<TransactionType, Boolean> map3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        this.numberOfDays = i;
        this.txnLists = map;
        this.txnSelfServiceTools = map2;
        this.hasMore = map3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.util.Map)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:14)) : (r3v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000c: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:15)) : (r4v0 java.util.Map))
 A[MD:(int, java.util.Map<com.okinc.okex.center.bean.enums.TransactionType, ? extends java.util.List<com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2>>, java.util.Map<com.okinc.okex.center.bean.enums.TransactionType, com.okinc.okex.center.bean.SelfServiceTools>, java.util.Map<com.okinc.okex.center.bean.enums.TransactionType, java.lang.Boolean>):void (m)] (LINE:11) call: com.okinc.okex.center.bean.FullRecentActivityPageDataV2.<init>(int, java.util.Map, java.util.Map, java.util.Map):void type: THIS */
    public /* synthetic */ FullRecentActivityPageDataV2(int i, Map map, Map map2, Map map3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, map, (i2 & 4) != 0 ? C56424yEw.KWHzl() : map2, (i2 & 8) != 0 ? C56424yEw.KWHzl() : map3);
    }
}
