package org.spongycastle.crypto.agreement.jpake;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes25.dex */
public class JPAKERound3Payload {
    private final BigInteger macTag;
    private final String participantId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigInteger getMacTag() {
        return this.macTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getParticipantId() {
        return this.participantId;
    }

    public JPAKERound3Payload(String str, BigInteger bigInteger) {
        this.participantId = str;
        this.macTag = bigInteger;
    }
}
