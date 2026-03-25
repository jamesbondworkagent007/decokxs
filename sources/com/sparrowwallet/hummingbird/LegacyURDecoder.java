package com.sparrowwallet.hummingbird;

import androidx.camera.video.AudioStats;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.sparrowwallet.hummingbird.UR;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class LegacyURDecoder {
    private final Set<String> fragments = new LinkedHashSet();

    public void receivePart(String str) {
        this.fragments.add(str.toLowerCase());
    }

    public boolean isComplete() {
        if (this.fragments.isEmpty()) {
            return false;
        }
        String[] strArrSplit = this.fragments.iterator().next().split("/");
        return strArrSplit.length <= 3 || checkAndGetSequence(strArrSplit[1])[1] == this.fragments.size();
    }

    public double getPercentComplete() {
        int i;
        if (this.fragments.isEmpty()) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        String[] strArrSplit = this.fragments.iterator().next().split("/");
        if (strArrSplit.length <= 3 || (i = checkAndGetSequence(strArrSplit[1])[1]) <= 0 || this.fragments.size() > i) {
            return 1.0d;
        }
        return ((double) this.fragments.size()) / ((double) i);
    }

    public static boolean isLegacyURFragment(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 3) {
            return true;
        }
        String lowerCase = strArrSplit[strArrSplit.length - 1].toLowerCase();
        if (lowerCase.indexOf(98) > -1 || lowerCase.indexOf(105) > -1 || lowerCase.indexOf(WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) > -1) {
            return false;
        }
        return lowerCase.matches(".*\\d.*");
    }

    public UR decode() throws UR.InvalidTypeException {
        return decode((String[]) this.fragments.toArray(new String[0]));
    }

    public static UR decode(String[] strArr) throws UR.InvalidTypeException {
        if (strArr.length == 1) {
            return handleFragment(strArr[0]);
        }
        return handleFragments(strArr);
    }

    private static UR handleFragment(String str) throws UR.InvalidTypeException {
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        if (length == 2) {
            return new UR(strArrSplit[0].substring(3), BC32.decode(strArrSplit[1]));
        }
        if (length == 3) {
            String str2 = strArrSplit[1];
            String str3 = strArrSplit[2];
            checkDigest(str3, str2);
            return new UR(strArrSplit[0].substring(3), BC32.decode(str3));
        }
        if (length == 4) {
            checkAndGetSequence(strArrSplit[1]);
            String str4 = strArrSplit[2];
            String str5 = strArrSplit[3];
            checkDigest(str4, str);
            return new UR(strArrSplit[0].substring(3), BC32.decode(str5));
        }
        throw new IllegalArgumentException("Invalid number of fragments: expected 2 / 3 / 4 but got " + strArrSplit.length);
    }

    private static UR handleFragments(String[] strArr) throws UR.InvalidTypeException {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        Arrays.fill(strArr2, "");
        String str = null;
        String str2 = null;
        for (String str3 : strArr) {
            String[] strArrSplit = str3.split("/");
            if (strArrSplit.length < 4) {
                throw new IllegalArgumentException(String.format("Invalid fragment: %s, insufficient number of components (%d)", str3, Integer.valueOf(strArrSplit.length)));
            }
            if (str2 != null && !str2.equals(strArrSplit[0])) {
                throw new IllegalArgumentException(String.format("Invalid fragment: %s, checksum changed %s, %s", str3, str2, strArrSplit[0]));
            }
            str2 = strArrSplit[0];
            int[] iArrCheckAndGetSequence = checkAndGetSequence(strArrSplit[1]);
            int i = iArrCheckAndGetSequence[0];
            int i2 = iArrCheckAndGetSequence[1];
            if (i2 != length) {
                throw new IllegalArgumentException(String.format("Invalid fragment: %s, total %d not equals to fragments length %d", str3, Integer.valueOf(i2), Integer.valueOf(length)));
            }
            if (str != null && !str.equals(strArrSplit[2])) {
                throw new IllegalArgumentException(String.format("Invalid fragment: %s, checksum changed %s, %s", str3, str, strArrSplit[2]));
            }
            str = strArrSplit[2];
            int i3 = i - 1;
            if (strArr2[i3].length() > 0) {
                throw new IllegalArgumentException(String.format("Invalid fragment: %s, index %d has already been set", str3, Integer.valueOf(i)));
            }
            strArr2[i3] = strArrSplit[3];
        }
        String str4 = (String) Arrays.stream(strArr2).reduce(new BinaryOperator() { // from class: com.sparrowwallet.hummingbird.LegacyURDecoder$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return LegacyURDecoder.lambda$handleFragments$0((String) obj, (String) obj2);
            }
        }).orElse("");
        checkDigest(str4, str);
        if (str2 == null) {
            throw new IllegalStateException("Type is null");
        }
        return new UR(str2.substring(3), BC32.decode(str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleFragments$0(String str, String str2) {
        return str + str2;
    }

    private static void checkDigest(String str, String str2) {
        MessageDigest messageDigestNewDigest = LegacyUREncoder.newDigest();
        messageDigestNewDigest.update(BC32.decode(str));
        if (Arrays.equals(messageDigestNewDigest.digest(), BC32.decode(str2))) {
            return;
        }
        throw new IllegalArgumentException("Invalid digest: " + str2 + " for payload: " + str);
    }

    public static int[] checkAndGetSequence(String str) {
        String[] strArrSplit = str.toLowerCase().split("of");
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Invalid sequence: " + str);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        if (i >= 1 && i <= i2) {
            return new int[]{i, i2};
        }
        throw new IllegalArgumentException("Invalid sequence: " + str);
    }
}
