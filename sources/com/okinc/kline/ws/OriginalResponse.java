package com.okinc.kline.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class OriginalResponse {
    public final String code;
    public final List<List<String>> data;
    public final String msg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE)), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.ws.OriginalResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OriginalResponse copy$default(OriginalResponse originalResponse, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = originalResponse.code;
        }
        if ((i & 2) != 0) {
            list = originalResponse.data;
        }
        if ((i & 4) != 0) {
            str2 = originalResponse.msg;
        }
        return originalResponse.copydefault(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> KWHzl() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OriginalResponse copydefault(@NotNull String str, @NotNull List<? extends List<String>> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OriginalResponse(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalResponse)) {
            return false;
        }
        OriginalResponse originalResponse = (OriginalResponse) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) originalResponse.code) && Intrinsics.EZpvd(this.data, originalResponse.data) && Intrinsics.EZpvd((Object) this.msg, (Object) originalResponse.msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.data.hashCode()) * 31) + this.msg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OriginalResponse(code=" + this.code + ", data=" + this.data + ", msg=" + this.msg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.ws.OriginalResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OriginalResponse> serializer() {
            return OriginalResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OriginalResponse(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, OriginalResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.data = list;
        this.msg = str2;
    }

    public static final /* synthetic */ void OLrzqt(OriginalResponse originalResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, originalResponse.code);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], originalResponse.data);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, originalResponse.msg);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public OriginalResponse(@NotNull String str, @NotNull List<? extends List<String>> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.data = list;
        this.msg = str2;
    }
}
