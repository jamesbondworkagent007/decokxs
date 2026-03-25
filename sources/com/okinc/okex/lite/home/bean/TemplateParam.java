package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TemplateParam {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TemplateParam copy$default(TemplateParam templateParam, String str, DescriptionTemplateStyle descriptionTemplateStyle, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateParam.name;
        }
        if ((i & 2) != 0) {
            descriptionTemplateStyle = templateParam.type;
        }
        if ((i & 4) != 0) {
            str2 = templateParam.value;
        }
        if ((i & 8) != 0) {
            str3 = templateParam.href;
        }
        return templateParam.OLrzqt(str, descriptionTemplateStyle, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TemplateParam OLrzqt(@NotNull String str, @NotNull DescriptionTemplateStyle descriptionTemplateStyle, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(descriptionTemplateStyle, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TemplateParam(str, descriptionTemplateStyle, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateParam)) {
            return false;
        }
        TemplateParam templateParam = (TemplateParam) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) templateParam.name) && this.type == templateParam.type && Intrinsics.EZpvd((Object) this.value, (Object) templateParam.value) && Intrinsics.EZpvd((Object) this.href, (Object) templateParam.href);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.value.hashCode();
        String str = this.href;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TemplateParam(name=" + this.name + ", type=" + this.type + ", value=" + this.value + ", href=" + this.href + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.TemplateParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TemplateParam> serializer() {
            return TemplateParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TemplateParam(int i, String str, DescriptionTemplateStyle descriptionTemplateStyle, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, TemplateParam$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.type = DescriptionTemplateStyle.NORMAL_TEXT;
        } else {
            this.type = descriptionTemplateStyle;
        }
        this.value = str2;
        this.href = str3;
    }

    public static final /* synthetic */ void copydefault(TemplateParam templateParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, templateParam.name);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || templateParam.type != DescriptionTemplateStyle.NORMAL_TEXT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], templateParam.type);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, templateParam.value);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, templateParam.href);
    }

    public TemplateParam(@NotNull String str, @NotNull DescriptionTemplateStyle descriptionTemplateStyle, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(descriptionTemplateStyle, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.type = descriptionTemplateStyle;
        this.value = str2;
        this.href = str3;
    }
}
