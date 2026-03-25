package com.sparrowwallet.hummingbird;

import com.sparrowwallet.hummingbird.Bytewords;
import com.sparrowwallet.hummingbird.fountain.FountainEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes12.dex */
public class UREncoder {
    private final FountainEncoder fountainEncoder;
    private final UR ur;

    public UREncoder(UR ur, int i, int i2, long j) {
        this.ur = ur;
        this.fountainEncoder = new FountainEncoder(ur.getCborBytes(), i, i2, j);
    }

    public boolean isComplete() {
        return this.fountainEncoder.isComplete();
    }

    public boolean isSinglePart() {
        return this.fountainEncoder.isSinglePart();
    }

    public String nextPart() {
        FountainEncoder.Part partNextPart = this.fountainEncoder.nextPart();
        if (isSinglePart()) {
            return encode(this.ur);
        }
        return encodePart(this.ur.getType(), partNextPart);
    }

    public long getSeqNum() {
        return this.fountainEncoder.getSeqNum();
    }

    public int getSeqLen() {
        return this.fountainEncoder.getSeqLen();
    }

    public List<Integer> getPartIndexes() {
        return this.fountainEncoder.getPartIndexes();
    }

    public static String encode(UR ur) {
        return encodeUR(ur.getType(), Bytewords.encode(ur.getCborBytes(), Bytewords.Style.MINIMAL));
    }

    private static String encodeUR(String... strArr) {
        return encodeURI(UR.UR_PREFIX, strArr);
    }

    private static String encodeURI(String str, String... strArr) {
        StringJoiner stringJoiner = new StringJoiner("/");
        Arrays.stream(strArr).forEach(new Bytewords$$ExternalSyntheticLambda9(stringJoiner));
        return str + ":" + stringJoiner.toString();
    }

    private static String encodePart(String str, FountainEncoder.Part part) {
        return encodeUR(str, part.getSeqNum() + "-" + part.getSeqLen(), Bytewords.encode(part.toCborBytes(), Bytewords.Style.MINIMAL));
    }
}
