package com.okinc.resource.request;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DynamicResourceUpdateRequestBody {
    private static final KSerializer<Object>[] $childSerializers;
    private final String account;
    private final List<String> fileIds;
    private final Map<String, String> localVersions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.resource.request.DynamicResourceUpdateRequestBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicResourceUpdateRequestBody copy$default(DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, String str, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicResourceUpdateRequestBody.account;
        }
        if ((i & 2) != 0) {
            list = dynamicResourceUpdateRequestBody.fileIds;
        }
        if ((i & 4) != 0) {
            map = dynamicResourceUpdateRequestBody.localVersions;
        }
        return dynamicResourceUpdateRequestBody.copy(str, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.fileIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.localVersions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicResourceUpdateRequestBody copy(@NotNull String str, @NotNull List<String> list, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new DynamicResourceUpdateRequestBody(str, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicResourceUpdateRequestBody)) {
            return false;
        }
        DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody = (DynamicResourceUpdateRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.account, (Object) dynamicResourceUpdateRequestBody.account) && Intrinsics.EZpvd(this.fileIds, dynamicResourceUpdateRequestBody.fileIds) && Intrinsics.EZpvd(this.localVersions, dynamicResourceUpdateRequestBody.localVersions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFileIds() {
        return this.fileIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getLocalVersions() {
        return this.localVersions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.account.hashCode() * 31) + this.fileIds.hashCode()) * 31) + this.localVersions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DynamicResourceUpdateRequestBody(account=" + this.account + ", fileIds=" + this.fileIds + ", localVersions=" + this.localVersions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.resource.request.DynamicResourceUpdateRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DynamicResourceUpdateRequestBody> serializer() {
            return DynamicResourceUpdateRequestBody$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ DynamicResourceUpdateRequestBody(int i, String str, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, DynamicResourceUpdateRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.account = (i & 1) == 0 ? "0" : str;
        this.fileIds = list;
        if ((i & 4) == 0) {
            this.localVersions = C56424yEw.KWHzl();
        } else {
            this.localVersions = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKRuntime_ok_runtime(DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dynamicResourceUpdateRequestBody.account, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dynamicResourceUpdateRequestBody.account);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dynamicResourceUpdateRequestBody.fileIds);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(dynamicResourceUpdateRequestBody.localVersions, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], dynamicResourceUpdateRequestBody.localVersions);
    }

    public DynamicResourceUpdateRequestBody(@NotNull String str, @NotNull List<String> list, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.account = str;
        this.fileIds = list;
        this.localVersions = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
  (r2v0 java.util.List)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000a: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:11)) : (r3v0 java.util.Map))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:8) call: com.okinc.resource.request.DynamicResourceUpdateRequestBody.<init>(java.lang.String, java.util.List, java.util.Map):void type: THIS */
    public /* synthetic */ DynamicResourceUpdateRequestBody(String str, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, list, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
    }
}
