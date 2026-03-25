package com.okinc.okex.uploadlog.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class FormCondition {
    private final String fieldOptionValue;
    private final List<FormElement> fieldsToDisplay;
    private final Integer formId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(FormElement$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FormCondition() {
        this((Integer) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.uploadlog.bean.FormCondition */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormCondition copy$default(FormCondition formCondition, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = formCondition.formId;
        }
        if ((i & 2) != 0) {
            str = formCondition.fieldOptionValue;
        }
        if ((i & 4) != 0) {
            list = formCondition.fieldsToDisplay;
        }
        return formCondition.copy(num, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.formId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fieldOptionValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FormElement> component3() {
        return this.fieldsToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormCondition copy(Integer num, String str, List<FormElement> list) {
        return new FormCondition(num, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormCondition)) {
            return false;
        }
        FormCondition formCondition = (FormCondition) obj;
        return Intrinsics.EZpvd(this.formId, formCondition.formId) && Intrinsics.EZpvd((Object) this.fieldOptionValue, (Object) formCondition.fieldOptionValue) && Intrinsics.EZpvd(this.fieldsToDisplay, formCondition.fieldsToDisplay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldOptionValue() {
        return this.fieldOptionValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FormElement> getFieldsToDisplay() {
        return this.fieldsToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFormId() {
        return this.formId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.formId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.fieldOptionValue;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<FormElement> list = this.fieldsToDisplay;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FormCondition(formId=" + this.formId + ", fieldOptionValue=" + this.fieldOptionValue + ", fieldsToDisplay=" + this.fieldsToDisplay + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.FormCondition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FormCondition> serializer() {
            return FormCondition$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FormCondition(int i, Integer num, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.formId = null;
        } else {
            this.formId = num;
        }
        if ((i & 2) == 0) {
            this.fieldOptionValue = null;
        } else {
            this.fieldOptionValue = str;
        }
        if ((i & 4) == 0) {
            this.fieldsToDisplay = null;
        } else {
            this.fieldsToDisplay = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FormCondition formCondition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || formCondition.formId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, formCondition.formId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || formCondition.fieldOptionValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, formCondition.fieldOptionValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && formCondition.fieldsToDisplay == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], formCondition.fieldsToDisplay);
    }

    public FormCondition(Integer num, String str, List<FormElement> list) {
        this.formId = num;
        this.fieldOptionValue = str;
        this.fieldsToDisplay = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.Integer, java.lang.String, java.util.List<com.okinc.okex.uploadlog.bean.FormElement>):void (m)] (LINE:50) call: com.okinc.okex.uploadlog.bean.FormCondition.<init>(java.lang.Integer, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ FormCondition(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
