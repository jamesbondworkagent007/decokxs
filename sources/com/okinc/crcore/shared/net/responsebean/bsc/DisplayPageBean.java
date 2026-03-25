package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.DisplayPageResponseBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DisplayPageBean {
    private final String flowType;
    private final List<String> pageNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DisplayPageBean() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.DisplayPageBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayPageBean copy$default(DisplayPageBean displayPageBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayPageBean.flowType;
        }
        if ((i & 2) != 0) {
            list = displayPageBean.pageNames;
        }
        return displayPageBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.flowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.pageNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayPageBean copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DisplayPageBean(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayPageBean)) {
            return false;
        }
        DisplayPageBean displayPageBean = (DisplayPageBean) obj;
        return Intrinsics.EZpvd((Object) this.flowType, (Object) displayPageBean.flowType) && Intrinsics.EZpvd(this.pageNames, displayPageBean.pageNames);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlowType() {
        return this.flowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPageNames() {
        return this.pageNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.flowType.hashCode() * 31) + this.pageNames.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DisplayPageBean(flowType=" + this.flowType + ", pageNames=" + this.pageNames + ")";
    }

    public /* synthetic */ DisplayPageBean(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.flowType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.pageNames = yDY.AhwBna();
        } else {
            this.pageNames = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DisplayPageBean displayPageBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) displayPageBean.flowType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, displayPageBean.flowType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(displayPageBean.pageNames, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], displayPageBean.pageNames);
    }

    public DisplayPageBean(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.flowType = str;
        this.pageNames = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:9) call: com.okinc.crcore.shared.net.responsebean.bsc.DisplayPageBean.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DisplayPageBean(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.DisplayPageBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DisplayPageBean> serializer() {
            return DisplayPageBean$$serializer.INSTANCE;
        }

        public final DisplayPageBean KWHzl(@NotNull DisplayPageResponseBean displayPageResponseBean) {
            Intrinsics.checkNotNullParameter(displayPageResponseBean, "");
            return new DisplayPageBean(displayPageResponseBean.getFlowType(), displayPageResponseBean.getPageNames());
        }
    }
}
