package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DescriptionTemplate {
    public static final int $stable = 0;

    @SerializedName("href")
    private final String href;

    @SerializedName("name")
    private final String name;

    @SerializedName("type")
    private final DescriptionTemplateStyle type;

    @SerializedName("value")
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, DescriptionTemplateStyle.Companion.serializer(), null, null};

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.DescriptionTemplate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DescriptionTemplate> serializer() {
            return DescriptionTemplate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DescriptionTemplate(int i, String str, DescriptionTemplateStyle descriptionTemplateStyle, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, DescriptionTemplate$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.type = DescriptionTemplateStyle.NORMAL_TEXT;
        } else {
            this.type = descriptionTemplateStyle;
        }
        this.value = str2;
        if ((i & 8) == 0) {
            this.href = null;
        } else {
            this.href = str3;
        }
    }

    public static final /* synthetic */ void EZpvd(DescriptionTemplate descriptionTemplate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, descriptionTemplate.name);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || descriptionTemplate.type != DescriptionTemplateStyle.NORMAL_TEXT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], descriptionTemplate.type);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, descriptionTemplate.value);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && descriptionTemplate.href == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, descriptionTemplate.href);
    }
}
