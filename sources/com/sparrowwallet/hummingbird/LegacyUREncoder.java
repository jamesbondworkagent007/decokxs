package com.sparrowwallet.hummingbird;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class LegacyUREncoder {
    public static final int DEFAULT_FRAGMENT_LENGTH = 200;
    private final int fragmentLen;
    private final UR ur;

    public LegacyUREncoder(UR ur) {
        this(ur, 200);
    }

    public LegacyUREncoder(UR ur, int i) {
        this.ur = ur;
        this.fragmentLen = i;
    }

    public String[] encode() {
        String strEncode = BC32.encode(this.ur.getCborBytes());
        MessageDigest messageDigestNewDigest = newDigest();
        messageDigestNewDigest.update(this.ur.getCborBytes());
        return composeHeadersToFragments(splitData(strEncode, this.fragmentLen), BC32.encode(messageDigestNewDigest.digest()));
    }

    private String[] splitData(String str, int i) {
        int iCeil = (int) Math.ceil(str.length() / i);
        int iCeil2 = (int) Math.ceil(str.length() / iCeil);
        String[] strArr = new String[iCeil];
        int i2 = 0;
        while (i2 < iCeil) {
            int i3 = i2 + 1;
            strArr[i2] = str.substring(iCeil2 * i2, Math.min(iCeil2 * i3, str.length()));
            i2 = i3;
        }
        return strArr;
    }

    private String[] composeHeadersToFragments(final String[] strArr, final String str) {
        final int length = strArr.length;
        if (length <= 1) {
            return (String[]) Arrays.stream(strArr).map(new Function() { // from class: com.sparrowwallet.hummingbird.LegacyUREncoder$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f$0.composeUR((String) obj);
                }
            }).toArray(new IntFunction() { // from class: com.sparrowwallet.hummingbird.LegacyUREncoder$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return LegacyUREncoder.lambda$composeHeadersToFragments$0(i);
                }
            });
        }
        return (String[]) IntStream.range(0, length).mapToObj(new IntFunction() { // from class: com.sparrowwallet.hummingbird.LegacyUREncoder$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return this.f$0.lambda$composeHeadersToFragments$1(strArr, str, length, i);
            }
        }).toArray(new IntFunction() { // from class: com.sparrowwallet.hummingbird.LegacyUREncoder$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return LegacyUREncoder.lambda$composeHeadersToFragments$2(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$composeHeadersToFragments$0(int i) {
        return new String[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$composeHeadersToFragments$1(String[] strArr, String str, int i, int i2) {
        return composeHeadersToFragment(strArr[i2], str, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$composeHeadersToFragments$2(int i) {
        return new String[i];
    }

    public static MessageDigest newDigest() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String composeHeadersToFragment(String str, String str2, int i, int i2) {
        return composeUR(composeSequencing(composeChecksum(str, str2), i, i2));
    }

    private String composeChecksum(String str, String str2) {
        return String.format("%s/%s", str2, str);
    }

    private String composeSequencing(String str, int i, int i2) {
        return String.format("%dof%d/%s", Integer.valueOf(i + 1), Integer.valueOf(i2), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String composeUR(String str) {
        return composeUR(str, this.ur.getType());
    }

    private String composeUR(String str, String str2) {
        return String.format("ur:%s/%s", str2, str);
    }
}
