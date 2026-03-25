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
public final class ResponseCashTag {
    public final String coinName;
    public final String deeplinkUrl;
    public final String instId;
    public final String instType;
    public final List<Integer> position;
    public final String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.planet.domain.remote.dto.ResponseCashTag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseCashTag copy$default(ResponseCashTag responseCashTag, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseCashTag.coinName;
        }
        if ((i & 2) != 0) {
            str2 = responseCashTag.instId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = responseCashTag.instType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            list = responseCashTag.position;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = responseCashTag.tag;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = responseCashTag.deeplinkUrl;
        }
        return responseCashTag.AEQbTJ(str, str6, str7, list2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseCashTag AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Integer> list, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ResponseCashTag(str, str2, str3, list, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseCashTag)) {
            return false;
        }
        ResponseCashTag responseCashTag = (ResponseCashTag) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) responseCashTag.coinName) && Intrinsics.EZpvd((Object) this.instId, (Object) responseCashTag.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) responseCashTag.instType) && Intrinsics.EZpvd(this.position, responseCashTag.position) && Intrinsics.EZpvd((Object) this.tag, (Object) responseCashTag.tag) && Intrinsics.EZpvd((Object) this.deeplinkUrl, (Object) responseCashTag.deeplinkUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.coinName.hashCode() * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.position.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.deeplinkUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResponseCashTag(coinName=" + this.coinName + ", instId=" + this.instId + ", instType=" + this.instType + ", position=" + this.position + ", tag=" + this.tag + ", deeplinkUrl=" + this.deeplinkUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.ResponseCashTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResponseCashTag> serializer() {
            return ResponseCashTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ResponseCashTag(int i, String str, String str2, String str3, List list, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, ResponseCashTag$$serializer.INSTANCE.getDescriptor());
        }
        this.coinName = str;
        this.instId = str2;
        this.instType = str3;
        this.position = list;
        this.tag = str4;
        if ((i & 32) == 0) {
            this.deeplinkUrl = "";
        } else {
            this.deeplinkUrl = str5;
        }
    }

    public static final /* synthetic */ void copydefault(ResponseCashTag responseCashTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, responseCashTag.coinName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, responseCashTag.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, responseCashTag.instType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], responseCashTag.position);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, responseCashTag.tag);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) responseCashTag.deeplinkUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, responseCashTag.deeplinkUrl);
    }

    public ResponseCashTag(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Integer> list, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coinName = str;
        this.instId = str2;
        this.instType = str3;
        this.position = list;
        this.tag = str4;
        this.deeplinkUrl = str5;
    }
}
