package com.okinc.okex.uploadlog.bean;

import com.okinc.okex.uploadlog.bean.enums.FormValueType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ElementData {
    private final String defaultValue;
    private final String displayName;
    private final List<FieldOption> fieldOptions;
    private final List<FormCondition> formConditions;
    private final String id;
    private final Boolean isRequired;
    private final String name;
    private final String placeholder;
    private final FormValueType valueType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, FormValueType.Companion.serializer(), null, null, new ArrayListSerializer(FieldOption$$serializer.INSTANCE), new ArrayListSerializer(FormCondition$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.defaultValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormValueType component5() {
        return this.valueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FieldOption> component8() {
        return this.fieldOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FormCondition> component9() {
        return this.formConditions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ElementData copy(@NotNull String str, String str2, String str3, String str4, FormValueType formValueType, Boolean bool, String str5, List<FieldOption> list, List<FormCondition> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ElementData(str, str2, str3, str4, formValueType, bool, str5, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementData)) {
            return false;
        }
        ElementData elementData = (ElementData) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) elementData.id) && Intrinsics.EZpvd((Object) this.name, (Object) elementData.name) && Intrinsics.EZpvd((Object) this.displayName, (Object) elementData.displayName) && Intrinsics.EZpvd((Object) this.defaultValue, (Object) elementData.defaultValue) && this.valueType == elementData.valueType && Intrinsics.EZpvd(this.isRequired, elementData.isRequired) && Intrinsics.EZpvd((Object) this.placeholder, (Object) elementData.placeholder) && Intrinsics.EZpvd(this.fieldOptions, elementData.fieldOptions) && Intrinsics.EZpvd(this.formConditions, elementData.formConditions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FieldOption> getFieldOptions() {
        return this.fieldOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FormCondition> getFormConditions() {
        return this.formConditions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormValueType getValueType() {
        return this.valueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.displayName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.defaultValue;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        FormValueType formValueType = this.valueType;
        int iHashCode5 = formValueType == null ? 0 : formValueType.hashCode();
        Boolean bool = this.isRequired;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str4 = this.placeholder;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        List<FieldOption> list = this.fieldOptions;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        List<FormCondition> list2 = this.formConditions;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRequired() {
        return this.isRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ElementData(id=" + this.id + ", name=" + this.name + ", displayName=" + this.displayName + ", defaultValue=" + this.defaultValue + ", valueType=" + this.valueType + ", isRequired=" + this.isRequired + ", placeholder=" + this.placeholder + ", fieldOptions=" + this.fieldOptions + ", formConditions=" + this.formConditions + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.ElementData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ElementData> serializer() {
            return ElementData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ElementData(int i, String str, String str2, String str3, String str4, FormValueType formValueType, Boolean bool, String str5, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ElementData$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i & 8) == 0) {
            this.defaultValue = null;
        } else {
            this.defaultValue = str4;
        }
        if ((i & 16) == 0) {
            this.valueType = null;
        } else {
            this.valueType = formValueType;
        }
        if ((i & 32) == 0) {
            this.isRequired = null;
        } else {
            this.isRequired = bool;
        }
        if ((i & 64) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str5;
        }
        if ((i & 128) == 0) {
            this.fieldOptions = null;
        } else {
            this.fieldOptions = list;
        }
        if ((i & 256) == 0) {
            this.formConditions = null;
        } else {
            this.formConditions = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ElementData elementData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, elementData.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || elementData.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, elementData.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || elementData.displayName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, elementData.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || elementData.defaultValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, elementData.defaultValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || elementData.valueType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], elementData.valueType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || elementData.isRequired != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, elementData.isRequired);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || elementData.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, elementData.placeholder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || elementData.fieldOptions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], elementData.fieldOptions);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && elementData.formConditions == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], elementData.formConditions);
    }

    public ElementData(@NotNull String str, String str2, String str3, String str4, FormValueType formValueType, Boolean bool, String str5, List<FieldOption> list, List<FormCondition> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.name = str2;
        this.displayName = str3;
        this.defaultValue = str4;
        this.valueType = formValueType;
        this.isRequired = bool;
        this.placeholder = str5;
        this.fieldOptions = list;
        this.formConditions = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:com.okinc.okex.uploadlog.bean.enums.FormValueType:?: TERNARY null = ((wrap:int:0x0018: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.uploadlog.bean.enums.FormValueType) : (r14v0 com.okinc.okex.uploadlog.bean.enums.FormValueType))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r19v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.uploadlog.bean.enums.FormValueType, java.lang.Boolean, java.lang.String, java.util.List<com.okinc.okex.uploadlog.bean.FieldOption>, java.util.List<com.okinc.okex.uploadlog.bean.FormCondition>):void (m)] (LINE:28) call: com.okinc.okex.uploadlog.bean.ElementData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.uploadlog.bean.enums.FormValueType, java.lang.Boolean, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ElementData(String str, String str2, String str3, String str4, FormValueType formValueType, Boolean bool, String str5, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : formValueType, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) == 0 ? list2 : null);
    }
}
