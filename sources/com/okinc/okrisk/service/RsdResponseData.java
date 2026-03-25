package com.okinc.okrisk.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RsdResponseData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String et;
    private final String st;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RsdResponseData copy$default(RsdResponseData rsdResponseData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rsdResponseData.et;
        }
        if ((i & 2) != 0) {
            str2 = rsdResponseData.st;
        }
        return rsdResponseData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.et;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RsdResponseData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RsdResponseData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RsdResponseData)) {
            return false;
        }
        RsdResponseData rsdResponseData = (RsdResponseData) obj;
        return Intrinsics.EZpvd((Object) this.et, (Object) rsdResponseData.et) && Intrinsics.EZpvd((Object) this.st, (Object) rsdResponseData.st);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEt() {
        return this.et;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSt() {
        return this.st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.et.hashCode() * 31) + this.st.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RsdResponseData(et=" + this.et + ", st=" + this.st + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.RsdResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RsdResponseData> serializer() {
            return RsdResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RsdResponseData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RsdResponseData$$serializer.INSTANCE.getDescriptor());
        }
        this.et = str;
        this.st = str2;
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(RsdResponseData rsdResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rsdResponseData.et);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rsdResponseData.st);
    }

    public RsdResponseData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.et = str;
        this.st = str2;
    }
}
