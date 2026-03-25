package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CategoryTopGainersResponseBean {
    private final String code;
    private final String name;
    private final List<TopInstIdsResponseBean> topInstIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(TopInstIdsResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CategoryTopGainersResponseBean() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.CategoryTopGainersResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryTopGainersResponseBean copy$default(CategoryTopGainersResponseBean categoryTopGainersResponseBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryTopGainersResponseBean.code;
        }
        if ((i & 2) != 0) {
            str2 = categoryTopGainersResponseBean.name;
        }
        if ((i & 4) != 0) {
            list = categoryTopGainersResponseBean.topInstIds;
        }
        return categoryTopGainersResponseBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsResponseBean> component3() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryTopGainersResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull List<TopInstIdsResponseBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CategoryTopGainersResponseBean(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTopGainersResponseBean)) {
            return false;
        }
        CategoryTopGainersResponseBean categoryTopGainersResponseBean = (CategoryTopGainersResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) categoryTopGainersResponseBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) categoryTopGainersResponseBean.name) && Intrinsics.EZpvd(this.topInstIds, categoryTopGainersResponseBean.topInstIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsResponseBean> getTopInstIds() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.topInstIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CategoryTopGainersResponseBean(code=" + this.code + ", name=" + this.name + ", topInstIds=" + this.topInstIds + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CategoryTopGainersResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CategoryTopGainersResponseBean> serializer() {
            return CategoryTopGainersResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CategoryTopGainersResponseBean(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.topInstIds = yDY.AhwBna();
        } else {
            this.topInstIds = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CategoryTopGainersResponseBean categoryTopGainersResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) categoryTopGainersResponseBean.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, categoryTopGainersResponseBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) categoryTopGainersResponseBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, categoryTopGainersResponseBean.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(categoryTopGainersResponseBean.topInstIds, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], categoryTopGainersResponseBean.topInstIds);
    }

    public CategoryTopGainersResponseBean(@NotNull String str, @NotNull String str2, @NotNull List<TopInstIdsResponseBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.code = str;
        this.name = str2;
        this.topInstIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.TopInstIdsResponseBean>):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.CategoryTopGainersResponseBean.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CategoryTopGainersResponseBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
