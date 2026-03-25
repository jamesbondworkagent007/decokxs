package com.okinc.planet.domain.remote.dto;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ResponseHashTag {
    public final String deeplinkUrl;
    public final String linkUrl;
    public final List<Integer> position;
    public final String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.domain.remote.dto.ResponseHashTag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseHashTag copy$default(ResponseHashTag responseHashTag, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseHashTag.deeplinkUrl;
        }
        if ((i & 2) != 0) {
            str2 = responseHashTag.linkUrl;
        }
        if ((i & 4) != 0) {
            list = responseHashTag.position;
        }
        if ((i & 8) != 0) {
            str3 = responseHashTag.tag;
        }
        return responseHashTag.copydefault(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseHashTag copydefault(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ResponseHashTag(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseHashTag)) {
            return false;
        }
        ResponseHashTag responseHashTag = (ResponseHashTag) obj;
        return Intrinsics.EZpvd((Object) this.deeplinkUrl, (Object) responseHashTag.deeplinkUrl) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) responseHashTag.linkUrl) && Intrinsics.EZpvd(this.position, responseHashTag.position) && Intrinsics.EZpvd((Object) this.tag, (Object) responseHashTag.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.deeplinkUrl.hashCode() * 31) + this.linkUrl.hashCode()) * 31) + this.position.hashCode()) * 31) + this.tag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResponseHashTag(deeplinkUrl=" + this.deeplinkUrl + ", linkUrl=" + this.linkUrl + ", position=" + this.position + ", tag=" + this.tag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.ResponseHashTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResponseHashTag> serializer() {
            return ResponseHashTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ResponseHashTag(int i, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, ResponseHashTag$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.deeplinkUrl = "";
        } else {
            this.deeplinkUrl = str;
        }
        if ((i & 2) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str2;
        }
        this.position = list;
        this.tag = str3;
    }

    public static final /* synthetic */ void AEQbTJ(ResponseHashTag responseHashTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) responseHashTag.deeplinkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, responseHashTag.deeplinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) responseHashTag.linkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, responseHashTag.linkUrl);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], responseHashTag.position);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, responseHashTag.tag);
    }

    public ResponseHashTag(@NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.deeplinkUrl = str;
        this.linkUrl = str2;
        this.position = list;
        this.tag = str3;
    }
}
