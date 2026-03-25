package com.okinc.okex.uploadlog.bean;

import com.okinc.okex.uploadlog.bean.enums.FormElementType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FormElement {
    private final ElementData elementData;
    private final FormElementType elementType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {FormElementType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FormElement copy$default(FormElement formElement, FormElementType formElementType, ElementData elementData, int i, Object obj) {
        if ((i & 1) != 0) {
            formElementType = formElement.elementType;
        }
        if ((i & 2) != 0) {
            elementData = formElement.elementData;
        }
        return formElement.copy(formElementType, elementData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormElementType component1() {
        return this.elementType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ElementData component2() {
        return this.elementData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormElement copy(@NotNull FormElementType formElementType, @NotNull ElementData elementData) {
        Intrinsics.checkNotNullParameter(formElementType, "");
        Intrinsics.checkNotNullParameter(elementData, "");
        return new FormElement(formElementType, elementData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormElement)) {
            return false;
        }
        FormElement formElement = (FormElement) obj;
        return this.elementType == formElement.elementType && Intrinsics.EZpvd(this.elementData, formElement.elementData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ElementData getElementData() {
        return this.elementData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormElementType getElementType() {
        return this.elementType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.elementType.hashCode() * 31) + this.elementData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FormElement(elementType=" + this.elementType + ", elementData=" + this.elementData + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.FormElement.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FormElement> serializer() {
            return FormElement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FormElement(int i, FormElementType formElementType, ElementData elementData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FormElement$$serializer.INSTANCE.getDescriptor());
        }
        this.elementType = formElementType;
        this.elementData = elementData;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FormElement formElement, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], formElement.elementType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, ElementData$$serializer.INSTANCE, formElement.elementData);
    }

    public FormElement(@NotNull FormElementType formElementType, @NotNull ElementData elementData) {
        Intrinsics.checkNotNullParameter(formElementType, "");
        Intrinsics.checkNotNullParameter(elementData, "");
        this.elementType = formElementType;
        this.elementData = elementData;
    }
}
