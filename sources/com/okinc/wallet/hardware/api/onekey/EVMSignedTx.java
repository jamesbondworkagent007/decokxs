package com.okinc.wallet.hardware.api.onekey;

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
public final class EVMSignedTx {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String r;
    private final String s;
    private final String v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getR() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getS() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getV() {
        return this.v;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.EVMSignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMSignedTx> serializer() {
            return EVMSignedTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMSignedTx(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EVMSignedTx$$serializer.INSTANCE.getDescriptor());
        }
        this.v = str;
        this.r = str2;
        this.s = str3;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(EVMSignedTx eVMSignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eVMSignedTx.v);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eVMSignedTx.r);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eVMSignedTx.s);
    }

    public EVMSignedTx(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.v = str;
        this.r = str2;
        this.s = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(EVMSignedTx.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        EVMSignedTx eVMSignedTx = (EVMSignedTx) obj;
        return Intrinsics.EZpvd((Object) this.v, (Object) eVMSignedTx.v) && Intrinsics.EZpvd((Object) this.r, (Object) eVMSignedTx.r) && Intrinsics.EZpvd((Object) this.s, (Object) eVMSignedTx.s);
    }

    public int hashCode() {
        int iHashCode = this.v.hashCode();
        return (((iHashCode * 31) + this.r.hashCode()) * 31) + this.s.hashCode();
    }

    public String toString() {
        return "EVMSignedTx(v='" + this.v + "', r='" + this.r + "', s='" + this.s + "')";
    }
}
