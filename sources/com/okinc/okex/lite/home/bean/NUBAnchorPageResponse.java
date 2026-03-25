package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NUBAnchorPageResponse {

    @SerializedName("buttonHelpLink")
    private final ButtonHelpLink buttonHelpLink;

    @SerializedName("cta")
    private final CTA cta;

    @SerializedName("description")
    private final Description description;

    @SerializedName("sections")
    private final List<Section> sections;

    @SerializedName("title")
    private final String title;

    @SerializedName("trackingProperties")
    private final TrackingProperties trackingProperties;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Section$$serializer.INSTANCE), null, null, null};

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NUBAnchorPageResponse> serializer() {
            return NUBAnchorPageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NUBAnchorPageResponse(int i, String str, Description description, List list, CTA cta, ButtonHelpLink buttonHelpLink, TrackingProperties trackingProperties, SerializationConstructorMarker serializationConstructorMarker) {
        if (39 != (i & 39)) {
            PluginExceptionsKt.throwMissingFieldException(i, 39, NUBAnchorPageResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = description;
        this.sections = list;
        if ((i & 8) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 16) == 0) {
            this.buttonHelpLink = null;
        } else {
            this.buttonHelpLink = buttonHelpLink;
        }
        this.trackingProperties = trackingProperties;
    }

    public static final /* synthetic */ void OLrzqt(NUBAnchorPageResponse nUBAnchorPageResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, nUBAnchorPageResponse.title);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, Description$$serializer.INSTANCE, nUBAnchorPageResponse.description);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], nUBAnchorPageResponse.sections);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || nUBAnchorPageResponse.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CTA$$serializer.INSTANCE, nUBAnchorPageResponse.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || nUBAnchorPageResponse.buttonHelpLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ButtonHelpLink$$serializer.INSTANCE, nUBAnchorPageResponse.buttonHelpLink);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, TrackingProperties$$serializer.INSTANCE, nUBAnchorPageResponse.trackingProperties);
    }
}
