package com.okinc.crcore.coreapi.net.responsebean.dex;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TagItem {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, String> e;
    private final String k;
    private final int m;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagItem() {
        this((Map) null, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.dex.TagItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagItem copy$default(TagItem tagItem, Map map, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = tagItem.e;
        }
        if ((i2 & 2) != 0) {
            str = tagItem.k;
        }
        if ((i2 & 4) != 0) {
            i = tagItem.m;
        }
        return tagItem.copy(map, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagItem copy(@NotNull Map<String, String> map, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new TagItem(map, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagItem)) {
            return false;
        }
        TagItem tagItem = (TagItem) obj;
        return Intrinsics.EZpvd(this.e, tagItem.e) && Intrinsics.EZpvd((Object) this.k, (Object) tagItem.k) && this.m == tagItem.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getE() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getK() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getM() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.e.hashCode() * 31) + this.k.hashCode()) * 31) + Integer.hashCode(this.m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagItem(e=" + this.e + ", k=" + this.k + ", m=" + this.m + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.TagItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TagItem> serializer() {
            return TagItem$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null};
    }

    public /* synthetic */ TagItem(int i, Map map, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.e = (i & 1) == 0 ? C56424yEw.KWHzl() : map;
        if ((i & 2) == 0) {
            this.k = "";
        } else {
            this.k = str;
        }
        if ((i & 4) == 0) {
            this.m = 0;
        } else {
            this.m = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TagItem tagItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(tagItem.e, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tagItem.e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tagItem.k, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tagItem.k);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tagItem.m == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, tagItem.m);
    }

    public TagItem(@NotNull Map<String, String> map, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.e = map;
        this.k = str;
        this.m = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:100)) : (r1v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, java.lang.String, int):void (m)] (LINE:99) call: com.okinc.crcore.coreapi.net.responsebean.dex.TagItem.<init>(java.util.Map, java.lang.String, int):void type: THIS */
    public /* synthetic */ TagItem(Map map, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C56424yEw.KWHzl() : map, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
