package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class NewCoinGroupResponseBean {
    private final String displayName;
    private final String id;
    private final String key;
    private final String name;
    private final ArrayList<String> types;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinGroupResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (ArrayList) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.NewCoinGroupResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewCoinGroupResponseBean copy$default(NewCoinGroupResponseBean newCoinGroupResponseBean, String str, String str2, String str3, String str4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newCoinGroupResponseBean.id;
        }
        if ((i & 2) != 0) {
            str2 = newCoinGroupResponseBean.key;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = newCoinGroupResponseBean.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = newCoinGroupResponseBean.displayName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            arrayList = newCoinGroupResponseBean.types;
        }
        return newCoinGroupResponseBean.copy(str, str5, str6, str7, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component5() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinGroupResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new NewCoinGroupResponseBean(str, str2, str3, str4, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCoinGroupResponseBean)) {
            return false;
        }
        NewCoinGroupResponseBean newCoinGroupResponseBean = (NewCoinGroupResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) newCoinGroupResponseBean.id) && Intrinsics.EZpvd((Object) this.key, (Object) newCoinGroupResponseBean.key) && Intrinsics.EZpvd((Object) this.name, (Object) newCoinGroupResponseBean.name) && Intrinsics.EZpvd((Object) this.displayName, (Object) newCoinGroupResponseBean.displayName) && Intrinsics.EZpvd(this.types, newCoinGroupResponseBean.types);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.name.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.types.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinGroupResponseBean(id=" + this.id + ", key=" + this.key + ", name=" + this.name + ", displayName=" + this.displayName + ", types=" + this.types + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.NewCoinGroupResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinGroupResponseBean> serializer() {
            return NewCoinGroupResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCoinGroupResponseBean(int i, String str, String str2, String str3, String str4, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.key = "";
        } else {
            this.key = str2;
        }
        if ((i & 4) == 0) {
            this.name = "";
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str4;
        }
        if ((i & 16) == 0) {
            this.types = new ArrayList<>();
        } else {
            this.types = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(NewCoinGroupResponseBean newCoinGroupResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) newCoinGroupResponseBean.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, newCoinGroupResponseBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) newCoinGroupResponseBean.key, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newCoinGroupResponseBean.key);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) newCoinGroupResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newCoinGroupResponseBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) newCoinGroupResponseBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newCoinGroupResponseBean.displayName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(newCoinGroupResponseBean.types, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], newCoinGroupResponseBean.types);
    }

    public NewCoinGroupResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.id = str;
        this.key = str2;
        this.name = str3;
        this.displayName = str4;
        this.types = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0023: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:52) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>):void (m)] (LINE:47) call: com.okinc.crcore.coreapi.net.responsebean.NewCoinGroupResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ NewCoinGroupResponseBean(String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? new ArrayList() : arrayList);
    }
}
