package com.okinc.web3Uilib.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class InputsAndOutputsBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final String inputLabel;
    private final List<SimpleBean> inputList;
    private final String outputLabel;
    private final List<SimpleBean> outputList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputsAndOutputsBean() {
        this((String) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3Uilib.bean.InputsAndOutputsBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputsAndOutputsBean copy$default(InputsAndOutputsBean inputsAndOutputsBean, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputsAndOutputsBean.inputLabel;
        }
        if ((i & 2) != 0) {
            str2 = inputsAndOutputsBean.outputLabel;
        }
        if ((i & 4) != 0) {
            list = inputsAndOutputsBean.inputList;
        }
        if ((i & 8) != 0) {
            list2 = inputsAndOutputsBean.outputList;
        }
        return inputsAndOutputsBean.copy(str, str2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inputLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.outputLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleBean> component3() {
        return this.inputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleBean> component4() {
        return this.outputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputsAndOutputsBean copy(@NotNull String str, @NotNull String str2, List<SimpleBean> list, List<SimpleBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InputsAndOutputsBean(str, str2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputsAndOutputsBean)) {
            return false;
        }
        InputsAndOutputsBean inputsAndOutputsBean = (InputsAndOutputsBean) obj;
        return Intrinsics.EZpvd((Object) this.inputLabel, (Object) inputsAndOutputsBean.inputLabel) && Intrinsics.EZpvd((Object) this.outputLabel, (Object) inputsAndOutputsBean.outputLabel) && Intrinsics.EZpvd(this.inputList, inputsAndOutputsBean.inputList) && Intrinsics.EZpvd(this.outputList, inputsAndOutputsBean.outputList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputLabel() {
        return this.inputLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleBean> getInputList() {
        return this.inputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOutputLabel() {
        return this.outputLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleBean> getOutputList() {
        return this.outputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.inputLabel.hashCode();
        int iHashCode2 = this.outputLabel.hashCode();
        List<SimpleBean> list = this.inputList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<SimpleBean> list2 = this.outputList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputsAndOutputsBean(inputLabel=" + this.inputLabel + ", outputLabel=" + this.outputLabel + ", inputList=" + this.inputList + ", outputList=" + this.outputList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.InputsAndOutputsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputsAndOutputsBean> serializer() {
            return InputsAndOutputsBean$$serializer.INSTANCE;
        }
    }

    static {
        InputsAndOutputsBean$SimpleBean$$serializer inputsAndOutputsBean$SimpleBean$$serializer = InputsAndOutputsBean$SimpleBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(inputsAndOutputsBean$SimpleBean$$serializer), new ArrayListSerializer(inputsAndOutputsBean$SimpleBean$$serializer)};
    }

    public /* synthetic */ InputsAndOutputsBean(int i, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.inputLabel = "";
        } else {
            this.inputLabel = str;
        }
        if ((i & 2) == 0) {
            this.outputLabel = "";
        } else {
            this.outputLabel = str2;
        }
        if ((i & 4) == 0) {
            this.inputList = null;
        } else {
            this.inputList = list;
        }
        if ((i & 8) == 0) {
            this.outputList = null;
        } else {
            this.outputList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(InputsAndOutputsBean inputsAndOutputsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputsAndOutputsBean.inputLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inputsAndOutputsBean.inputLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inputsAndOutputsBean.outputLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, inputsAndOutputsBean.outputLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputsAndOutputsBean.inputList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], inputsAndOutputsBean.inputList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && inputsAndOutputsBean.outputList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], inputsAndOutputsBean.outputList);
    }

    public InputsAndOutputsBean(@NotNull String str, @NotNull String str2, List<SimpleBean> list, List<SimpleBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.inputLabel = str;
        this.outputLabel = str2;
        this.inputList = list;
        this.outputList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.web3Uilib.bean.InputsAndOutputsBean$SimpleBean>, java.util.List<com.okinc.web3Uilib.bean.InputsAndOutputsBean$SimpleBean>):void (m)] (LINE:204) call: com.okinc.web3Uilib.bean.InputsAndOutputsBean.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ InputsAndOutputsBean(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }

    @Serializable
    public static final class SimpleBean {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String leftInfo;
        private final String rightInfo;
        private final String tagContent;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SimpleBean() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SimpleBean copy$default(SimpleBean simpleBean, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simpleBean.leftInfo;
            }
            if ((i & 2) != 0) {
                str2 = simpleBean.rightInfo;
            }
            if ((i & 4) != 0) {
                str3 = simpleBean.tagContent;
            }
            return simpleBean.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.leftInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.rightInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new SimpleBean(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimpleBean)) {
                return false;
            }
            SimpleBean simpleBean = (SimpleBean) obj;
            return Intrinsics.EZpvd((Object) this.leftInfo, (Object) simpleBean.leftInfo) && Intrinsics.EZpvd((Object) this.rightInfo, (Object) simpleBean.rightInfo) && Intrinsics.EZpvd((Object) this.tagContent, (Object) simpleBean.tagContent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLeftInfo() {
            return this.leftInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRightInfo() {
            return this.rightInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTagContent() {
            return this.tagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.leftInfo.hashCode() * 31) + this.rightInfo.hashCode()) * 31) + this.tagContent.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimpleBean(leftInfo=" + this.leftInfo + ", rightInfo=" + this.rightInfo + ", tagContent=" + this.tagContent + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3Uilib.bean.InputsAndOutputsBean.SimpleBean.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimpleBean> serializer() {
                return InputsAndOutputsBean$SimpleBean$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SimpleBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.leftInfo = "";
            } else {
                this.leftInfo = str;
            }
            if ((i & 2) == 0) {
                this.rightInfo = "";
            } else {
                this.rightInfo = str2;
            }
            if ((i & 4) == 0) {
                this.tagContent = "";
            } else {
                this.tagContent = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKWeb3UILib_web3_uilib(SimpleBean simpleBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleBean.leftInfo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleBean.leftInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) simpleBean.rightInfo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleBean.rightInfo);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) simpleBean.tagContent, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleBean.tagContent);
        }

        public SimpleBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.leftInfo = str;
            this.rightInfo = str2;
            this.tagContent = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:212) call: com.okinc.web3Uilib.bean.InputsAndOutputsBean.SimpleBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SimpleBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }
}
