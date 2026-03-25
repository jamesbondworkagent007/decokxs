package com.okinc.wallet.core.aa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAParseInitCode {
    private String factory;
    private String factoryData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAParseInitCode copy$default(AAParseInitCode aAParseInitCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAParseInitCode.factory;
        }
        if ((i & 2) != 0) {
            str2 = aAParseInitCode.factoryData;
        }
        return aAParseInitCode.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.factoryData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAParseInitCode copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AAParseInitCode(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAParseInitCode)) {
            return false;
        }
        AAParseInitCode aAParseInitCode = (AAParseInitCode) obj;
        return Intrinsics.EZpvd((Object) this.factory, (Object) aAParseInitCode.factory) && Intrinsics.EZpvd((Object) this.factoryData, (Object) aAParseInitCode.factoryData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactory() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactoryData() {
        return this.factoryData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.factory.hashCode() * 31) + this.factoryData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.factory = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactoryData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.factoryData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAParseInitCode(factory=" + this.factory + ", factoryData=" + this.factoryData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAParseInitCode.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAParseInitCode> serializer() {
            return AAParseInitCode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAParseInitCode(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AAParseInitCode$$serializer.INSTANCE.getDescriptor());
        }
        this.factory = str;
        this.factoryData = str2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAParseInitCode aAParseInitCode, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aAParseInitCode.factory);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aAParseInitCode.factoryData);
    }

    public AAParseInitCode(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.factory = str;
        this.factoryData = str2;
    }
}
