package com.okinc.wallet.hardware.api.onekey;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class HDNodeType {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chain_code;
    private final long child_num;
    private final long depth;
    private final long fingerprint;
    private final String private_key;
    private final String public_key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain_code() {
        return this.chain_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChild_num() {
        return this.child_num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDepth() {
        return this.depth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFingerprint() {
        return this.fingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivate_key() {
        return this.private_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublic_key() {
        return this.public_key;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.HDNodeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HDNodeType> serializer() {
            return HDNodeType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HDNodeType(int i, long j, long j2, long j3, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i, 47, HDNodeType$$serializer.INSTANCE.getDescriptor());
        }
        this.depth = j;
        this.fingerprint = j2;
        this.child_num = j3;
        this.chain_code = str;
        if ((i & 16) == 0) {
            this.private_key = null;
        } else {
            this.private_key = str2;
        }
        this.public_key = str3;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(HDNodeType hDNodeType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, hDNodeType.depth);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, hDNodeType.fingerprint);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, hDNodeType.child_num);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, hDNodeType.chain_code);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || hDNodeType.private_key != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, hDNodeType.private_key);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, hDNodeType.public_key);
    }

    public HDNodeType(long j, long j2, long j3, @NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.depth = j;
        this.fingerprint = j2;
        this.child_num = j3;
        this.chain_code = str;
        this.private_key = str2;
        this.public_key = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r12v0 long)
  (r14v0 long)
  (r16v0 long)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
 A[MD:(long, long, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:299) call: com.okinc.wallet.hardware.api.onekey.HDNodeType.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HDNodeType(long j, long j2, long j3, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, str, (i & 16) != 0 ? null : str2, str3);
    }
}
