package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.google.errorprone.annotations.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C16015ebu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Serializable
public final class Ed25519KeyPair {
    public final String privateKey;
    public final byte[] privateKeyByteArray;
    public final String publicKey;
    public final byte[] publicKeyByteArray;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.privateKeyByteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] KWHzl() {
        return this.publicKeyByteArray;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Ed25519KeyPair> serializer() {
            return Ed25519KeyPair$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Ed25519KeyPair(int i, String str, String str2, byte[] bArr, byte[] bArr2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Ed25519KeyPair$$serializer.INSTANCE.getDescriptor());
        }
        this.publicKey = str;
        this.privateKey = str2;
        if ((i & 4) == 0) {
            byte[] bytes = str.getBytes(C16015ebu.Companion.KWHzl());
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            this.publicKeyByteArray = bytes;
        } else {
            this.publicKeyByteArray = bArr;
        }
        if ((i & 8) != 0) {
            this.privateKeyByteArray = bArr2;
            return;
        }
        byte[] bytes2 = str2.getBytes(C16015ebu.Companion.KWHzl());
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        this.privateKeyByteArray = bytes2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void copydefault(Ed25519KeyPair ed25519KeyPair, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ed25519KeyPair.publicKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ed25519KeyPair.privateKey);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, ByteArraySerializer.INSTANCE, ed25519KeyPair.publicKeyByteArray);
        } else {
            byte[] bArr = ed25519KeyPair.publicKeyByteArray;
            byte[] bytes = ed25519KeyPair.publicKey.getBytes(C16015ebu.Companion.KWHzl());
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            if (!Intrinsics.EZpvd(bArr, bytes)) {
            }
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3)) {
            byte[] bArr2 = ed25519KeyPair.privateKeyByteArray;
            byte[] bytes2 = ed25519KeyPair.privateKey.getBytes(C16015ebu.Companion.KWHzl());
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            if (Intrinsics.EZpvd(bArr2, bytes2)) {
                return;
            }
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, ByteArraySerializer.INSTANCE, ed25519KeyPair.privateKeyByteArray);
    }

    public Ed25519KeyPair(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.publicKey = str;
        this.privateKey = str2;
        C16015ebu.Activity activity = C16015ebu.Companion;
        byte[] bytes = str.getBytes(activity.KWHzl());
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.publicKeyByteArray = bytes;
        byte[] bytes2 = str2.getBytes(activity.KWHzl());
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        this.privateKeyByteArray = bytes2;
    }
}
