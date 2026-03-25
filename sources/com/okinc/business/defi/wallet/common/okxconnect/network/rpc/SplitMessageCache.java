package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SplitMessageCache {
    private final String packageGroupId;
    private final List<String> packages;
    private final Set<Integer> sentPackages;
    private final long timestamp;
    private final String topic;
    private final int totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new LinkedHashSetSerializer(IntSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitMessageCache copy$default(SplitMessageCache splitMessageCache, String str, String str2, int i, List list, Set set, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = splitMessageCache.topic;
        }
        if ((i2 & 2) != 0) {
            str2 = splitMessageCache.packageGroupId;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = splitMessageCache.totalCount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = splitMessageCache.packages;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            set = splitMessageCache.sentPackages;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            j = splitMessageCache.timestamp;
        }
        return splitMessageCache.copy(str, str3, i3, list2, set2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.packageGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.packages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Integer> component5() {
        return this.sentPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SplitMessageCache copy(@NotNull String str, @NotNull String str2, int i, @NotNull List<String> list, @NotNull Set<Integer> set, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        return new SplitMessageCache(str, str2, i, list, set, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitMessageCache)) {
            return false;
        }
        SplitMessageCache splitMessageCache = (SplitMessageCache) obj;
        return Intrinsics.EZpvd((Object) this.topic, (Object) splitMessageCache.topic) && Intrinsics.EZpvd((Object) this.packageGroupId, (Object) splitMessageCache.packageGroupId) && this.totalCount == splitMessageCache.totalCount && Intrinsics.EZpvd(this.packages, splitMessageCache.packages) && Intrinsics.EZpvd(this.sentPackages, splitMessageCache.sentPackages) && this.timestamp == splitMessageCache.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPackageGroupId() {
        return this.packageGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPackages() {
        return this.packages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Integer> getSentPackages() {
        return this.sentPackages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.topic.hashCode() * 31) + this.packageGroupId.hashCode()) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.packages.hashCode()) * 31) + this.sentPackages.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SplitMessageCache(topic=" + this.topic + ", packageGroupId=" + this.packageGroupId + ", totalCount=" + this.totalCount + ", packages=" + this.packages + ", sentPackages=" + this.sentPackages + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SplitMessageCache> serializer() {
            return SplitMessageCache$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SplitMessageCache(int i, String str, String str2, int i2, List list, Set set, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, SplitMessageCache$$serializer.INSTANCE.getDescriptor());
        }
        this.topic = str;
        this.packageGroupId = str2;
        this.totalCount = i2;
        this.packages = list;
        if ((i & 16) == 0) {
            this.sentPackages = yEE.copydefault();
        } else {
            this.sentPackages = set;
        }
        if ((i & 32) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SplitMessageCache splitMessageCache, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, splitMessageCache.topic);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, splitMessageCache.packageGroupId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, splitMessageCache.totalCount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], splitMessageCache.packages);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(splitMessageCache.sentPackages, yEE.copydefault())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], splitMessageCache.sentPackages);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && splitMessageCache.timestamp == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 5, splitMessageCache.timestamp);
    }

    public SplitMessageCache(@NotNull String str, @NotNull String str2, int i, @NotNull List<String> list, @NotNull Set<Integer> set, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.topic = str;
        this.packageGroupId = str2;
        this.totalCount = i;
        this.packages = list;
        this.sentPackages = set;
        this.timestamp = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 int)
  (r13v0 java.util.List)
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yEE.copydefault():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:23)) : (r14v0 java.util.Set))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:24)) : (r15v0 long))
 A[MD:(java.lang.String, java.lang.String, int, java.util.List<java.lang.String>, java.util.Set<java.lang.Integer>, long):void (m)] (LINE:18) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache.<init>(java.lang.String, java.lang.String, int, java.util.List, java.util.Set, long):void type: THIS */
    public /* synthetic */ SplitMessageCache(String str, String str2, int i, List list, Set set, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, list, (i2 & 16) != 0 ? yEE.copydefault() : set, (i2 & 32) != 0 ? System.currentTimeMillis() : j);
    }
}
