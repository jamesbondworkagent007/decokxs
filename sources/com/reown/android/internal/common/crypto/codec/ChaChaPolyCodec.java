package com.reown.android.internal.common.crypto.codec;

import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.MissingKeyException;
import com.reown.android.internal.common.model.MissingParticipantsException;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.UnknownEnvelopeTypeException;
import com.reown.android.internal.utils.ContextKt;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.util.UtilFunctionsKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ChaChaPolyCodec implements Codec {
    public static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ENVELOPE_TYPE_SIZE = 1;

    @Deprecated
    public static final int KEY_SIZE = 32;

    @Deprecated
    public static final int NONCE_SIZE = 12;
    public final ChaCha20Poly1305 cha20Poly1305;
    public final KeyManagementRepository keyManagementRepository;

    public ChaChaPolyCodec(@NotNull KeyManagementRepository keyManagementRepository) {
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        this.keyManagementRepository = keyManagementRepository;
        this.cha20Poly1305 = new ChaCha20Poly1305();
    }

    @Override // com.reown.android.internal.common.crypto.codec.Codec
    public byte[] encrypt(@NotNull Topic topic, @NotNull String str, @NotNull EnvelopeType envelopeType, Participants participants) throws UnknownEnvelopeTypeException, MissingParticipantsException {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrRandomBytes = UtilFunctionsKt.randomBytes(12);
        byte id = envelopeType.getId();
        if (id == EnvelopeType.ZERO.getId()) {
            return encryptEnvelopeType0(topic, bArrRandomBytes, bytes, envelopeType);
        }
        if (id == EnvelopeType.ONE.getId()) {
            return encryptEnvelopeType1(participants, bArrRandomBytes, bytes, envelopeType);
        }
        if (id == EnvelopeType.TWO.getId()) {
            return encryptEnvelopeType2(bytes, envelopeType);
        }
        throw new UnknownEnvelopeTypeException("Encrypt; Unknown envelope type: " + ((int) envelopeType.getId()));
    }

    @Override // com.reown.android.internal.common.crypto.codec.Codec
    public String decrypt(@NotNull Topic topic, @NotNull byte[] bArr) throws UnknownEnvelopeTypeException, MissingKeyException {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        byte envelopeType = Companion.getEnvelopeType(bArr);
        if (envelopeType == EnvelopeType.ZERO.getId()) {
            return decryptType0(topic, bArr);
        }
        if (envelopeType == EnvelopeType.ONE.getId()) {
            return m7176decryptType1LkTxK_4(bArr, this.keyManagementRepository.mo7185getPublicKeyp9DwDrs(ContextKt.getParticipantTag(topic)));
        }
        if (envelopeType == EnvelopeType.TWO.getId()) {
            return decryptType2(bArr);
        }
        throw new UnknownEnvelopeTypeException("Decrypt; Unknown envelope type: " + ((int) envelopeType));
    }

    public final String decryptType0(Topic topic, byte[] bArr) {
        byte[] bArr2 = new byte[12];
        byte[] bArr3 = new byte[bArr.length - 13];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
        byteBufferWrap.get(new byte[1]);
        byteBufferWrap.get(bArr2);
        byteBufferWrap.get(bArr3);
        return new String(m7175decryptPayloadQyW3hOA(this.keyManagementRepository.mo7187getSymmetricKeyp84wnz8(topic.getValue()), bArr2, bArr3), Charsets.UTF_8);
    }

    /* JADX INFO: renamed from: decryptType1-LkTxK_4, reason: not valid java name */
    public final String m7176decryptType1LkTxK_4(byte[] bArr, String str) throws MissingKeyException {
        if (str == null) {
            throw new MissingKeyException("Missing receiver public key");
        }
        byte[] bArr2 = new byte[12];
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[bArr.length - 45];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
        byteBufferWrap.get(new byte[1]);
        byteBufferWrap.get(bArr3);
        byteBufferWrap.get(bArr2);
        byteBufferWrap.get(bArr4);
        return new String(m7175decryptPayloadQyW3hOA(this.keyManagementRepository.mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(str, PublicKey.m7317constructorimpl(UtilFunctionsKt.bytesToHex(bArr3))), bArr2, bArr4), Charsets.UTF_8);
    }

    public final String decryptType2(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
        byteBufferWrap.get(new byte[1]);
        byteBufferWrap.get(bArr2);
        return new String(bArr2, Charsets.UTF_8);
    }

    public final byte[] encryptEnvelopeType0(Topic topic, byte[] bArr, byte[] bArr2, EnvelopeType envelopeType) throws InvalidCipherTextException {
        byte[] bArrM7177encryptPayloadQyW3hOA = m7177encryptPayloadQyW3hOA(this.keyManagementRepository.mo7187getSymmetricKeyp84wnz8(topic.getValue()), bArr, bArr2);
        byte[] bArrArray = ByteBuffer.allocate(bArrM7177encryptPayloadQyW3hOA.length + 13).put(envelopeType.getId()).put(bArr).put(bArrM7177encryptPayloadQyW3hOA).array();
        Intrinsics.copydefault(bArrArray);
        return bArrArray;
    }

    public final byte[] encryptEnvelopeType1(Participants participants, byte[] bArr, byte[] bArr2, EnvelopeType envelopeType) throws InvalidCipherTextException, MissingParticipantsException {
        if (participants == null) {
            throw new MissingParticipantsException("Missing participants when encrypting envelope type 1");
        }
        String strM7237getSenderPublicKeyuN_RPug = participants.m7237getSenderPublicKeyuN_RPug();
        byte[] bArrHexToBytes = UtilFunctionsKt.hexToBytes(strM7237getSenderPublicKeyuN_RPug);
        byte[] bArrM7177encryptPayloadQyW3hOA = m7177encryptPayloadQyW3hOA(this.keyManagementRepository.mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(strM7237getSenderPublicKeyuN_RPug, participants.m7236getReceiverPublicKeyuN_RPug()), bArr, bArr2);
        byte[] bArrArray = ByteBuffer.allocate(bArrM7177encryptPayloadQyW3hOA.length + 13 + bArrHexToBytes.length).put(envelopeType.getId()).put(bArrHexToBytes).put(bArr).put(bArrM7177encryptPayloadQyW3hOA).array();
        Intrinsics.copydefault(bArrArray);
        return bArrArray;
    }

    public final byte[] encryptEnvelopeType2(byte[] bArr, EnvelopeType envelopeType) {
        byte[] bArrArray = ByteBuffer.allocate(bArr.length + 1).put(envelopeType.getId()).put(bArr).array();
        Intrinsics.copydefault(bArrArray);
        return bArrArray;
    }

    /* JADX INFO: renamed from: encryptPayload-QyW3hOA, reason: not valid java name */
    public final byte[] m7177encryptPayloadQyW3hOA(String str, byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        this.cha20Poly1305.init(true, new ParametersWithIV(new KeyParameter(UtilFunctionsKt.hexToBytes(str)), bArr));
        byte[] bArr3 = new byte[this.cha20Poly1305.getOutputSize(bArr2.length)];
        this.cha20Poly1305.doFinal(bArr3, this.cha20Poly1305.processBytes(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    /* JADX INFO: renamed from: decryptPayload-QyW3hOA, reason: not valid java name */
    public final byte[] m7175decryptPayloadQyW3hOA(String str, byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        this.cha20Poly1305.init(false, new ParametersWithIV(new KeyParameter(UtilFunctionsKt.hexToBytes(str)), bArr));
        byte[] bArr3 = new byte[this.cha20Poly1305.getOutputSize(bArr2.length)];
        this.cha20Poly1305.doFinal(bArr3, this.cha20Poly1305.processBytes(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.crypto.codec.ChaChaPolyCodec.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final byte getEnvelopeType(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return bArr[0];
        }
    }
}
