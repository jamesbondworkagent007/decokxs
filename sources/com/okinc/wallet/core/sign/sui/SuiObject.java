package com.okinc.wallet.core.sign.sui;

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
public final class SuiObject {
    private String digest;
    private String objectId;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SuiObject copy$default(SuiObject suiObject, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiObject.objectId;
        }
        if ((i & 2) != 0) {
            str2 = suiObject.version;
        }
        if ((i & 4) != 0) {
            str3 = suiObject.digest;
        }
        return suiObject.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.objectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.digest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiObject copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SuiObject(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiObject)) {
            return false;
        }
        SuiObject suiObject = (SuiObject) obj;
        return Intrinsics.EZpvd((Object) this.objectId, (Object) suiObject.objectId) && Intrinsics.EZpvd((Object) this.version, (Object) suiObject.version) && Intrinsics.EZpvd((Object) this.digest, (Object) suiObject.digest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDigest() {
        return this.digest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getObjectId() {
        return this.objectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.objectId.hashCode() * 31) + this.version.hashCode()) * 31) + this.digest.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDigest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.digest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObjectId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.objectId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.version = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiObject(objectId=" + this.objectId + ", version=" + this.version + ", digest=" + this.digest + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.sui.SuiObject.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiObject> serializer() {
            return SuiObject$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiObject(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SuiObject$$serializer.INSTANCE.getDescriptor());
        }
        this.objectId = str;
        this.version = str2;
        this.digest = str3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SuiObject suiObject, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, suiObject.objectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, suiObject.version);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, suiObject.digest);
    }

    public SuiObject(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.objectId = str;
        this.version = str2;
        this.digest = str3;
    }
}
