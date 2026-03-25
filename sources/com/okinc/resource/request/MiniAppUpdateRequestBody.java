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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class MiniAppUpdateRequestBody {
    private static final KSerializer<Object>[] $childSerializers;
    private String account;
    private List<String> appids;
    private Map<String, String> localVersions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.resource.request.MiniAppUpdateRequestBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MiniAppUpdateRequestBody copy$default(MiniAppUpdateRequestBody miniAppUpdateRequestBody, String str, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miniAppUpdateRequestBody.account;
        }
        if ((i & 2) != 0) {
            list = miniAppUpdateRequestBody.appids;
        }
        if ((i & 4) != 0) {
            map = miniAppUpdateRequestBody.localVersions;
        }
        return miniAppUpdateRequestBody.copy(str, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.appids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.localVersions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniAppUpdateRequestBody copy(@NotNull String str, @NotNull List<String> list, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new MiniAppUpdateRequestBody(str, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniAppUpdateRequestBody)) {
            return false;
        }
        MiniAppUpdateRequestBody miniAppUpdateRequestBody = (MiniAppUpdateRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.account, (Object) miniAppUpdateRequestBody.account) && Intrinsics.EZpvd(this.appids, miniAppUpdateRequestBody.appids) && Intrinsics.EZpvd(this.localVersions, miniAppUpdateRequestBody.localVersions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAppids() {
        return this.appids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getLocalVersions() {
        return this.localVersions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.account.hashCode() * 31) + this.appids.hashCode()) * 31) + this.localVersions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppids(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.appids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalVersions(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.localVersions = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MiniAppUpdateRequestBody(account=" + this.account + ", appids=" + this.appids + ", localVersions=" + this.localVersions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.resource.request.MiniAppUpdateRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MiniAppUpdateRequestBody> serializer() {
            return MiniAppUpdateRequestBody$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ MiniAppUpdateRequestBody(int i, String str, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, MiniAppUpdateRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.account = "0";
        } else {
            this.account = str;
        }
        this.appids = list;
        this.localVersions = map;
    }

    public static final /* synthetic */ void write$Self$OKRuntime_ok_runtime(MiniAppUpdateRequestBody miniAppUpdateRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) miniAppUpdateRequestBody.account, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, miniAppUpdateRequestBody.account);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], miniAppUpdateRequestBody.appids);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], miniAppUpdateRequestBody.localVersions);
    }

    public MiniAppUpdateRequestBody(@NotNull String str, @NotNull List<String> list, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.account = str;
        this.appids = list;
        this.localVersions = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
  (r2v0 java.util.List)
  (r3v0 java.util.Map)
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:8) call: com.okinc.resource.request.MiniAppUpdateRequestBody.<init>(java.lang.String, java.util.List, java.util.Map):void type: THIS */
    public /* synthetic */ MiniAppUpdateRequestBody(String str, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, list, map);
    }
}
