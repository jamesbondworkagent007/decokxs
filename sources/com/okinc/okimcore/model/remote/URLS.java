package com.okinc.okimcore.model.remote;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class URLS {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String CN;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final String f81default;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ URLS copy$default(URLS urls, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urls.CN;
        }
        if ((i & 2) != 0) {
            str2 = urls.f81default;
        }
        return urls.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.CN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.f81default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final URLS copy(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new URLS(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLS)) {
            return false;
        }
        URLS urls = (URLS) obj;
        return Intrinsics.EZpvd((Object) this.CN, (Object) urls.CN) && Intrinsics.EZpvd((Object) this.f81default, (Object) urls.f81default);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCN() {
        return this.CN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefault() {
        return this.f81default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.CN;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f81default.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "URLS(CN=" + this.CN + ", default=" + this.f81default + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.URLS.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<URLS> serializer() {
            return URLS$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ URLS(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, URLS$$serializer.INSTANCE.getDescriptor());
        }
        this.CN = str;
        this.f81default = str2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(URLS urls, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, urls.CN);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, urls.f81default);
    }

    public URLS(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.CN = str;
        this.f81default = str2;
    }
}
