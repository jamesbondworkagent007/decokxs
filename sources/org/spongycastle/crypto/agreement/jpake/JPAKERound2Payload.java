package org.spongycastle.crypto.agreement.jpake;

import com.bytedance.applog.encryptor.IEncryptorType;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes25.dex */
public class JPAKERound2Payload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigInteger f1099a;
    private final BigInteger[] knowledgeProofForX2s;
    private final String participantId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getA() {
        return this.f1099a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getParticipantId() {
        return this.participantId;
    }

    public JPAKERound2Payload(String str, BigInteger bigInteger, BigInteger[] bigIntegerArr) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(bigInteger, IEncryptorType.DEFAULT_ENCRYPTOR);
        JPAKEUtil.validateNotNull(bigIntegerArr, "knowledgeProofForX2s");
        this.participantId = str;
        this.f1099a = bigInteger;
        this.knowledgeProofForX2s = Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }

    public BigInteger[] getKnowledgeProofForX2s() {
        BigInteger[] bigIntegerArr = this.knowledgeProofForX2s;
        return Arrays.copyOf(bigIntegerArr, bigIntegerArr.length);
    }
}
