package com.sparrowwallet.hummingbird;

import co.nstant.in.cbor.CborException;
import com.sparrowwallet.hummingbird.Bytewords;
import com.sparrowwallet.hummingbird.UR;
import com.sparrowwallet.hummingbird.fountain.FountainDecoder;
import com.sparrowwallet.hummingbird.fountain.FountainEncoder;
import java.util.Arrays;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class URDecoder {
    private static final Pattern SEQUENCE_COMPONENT_PATTERN = Pattern.compile("(\\d+)-(\\d+)");
    private String expectedType;
    private final FountainDecoder fountainDecoder = new FountainDecoder();
    private Result result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Result getResult() {
        return this.result;
    }

    public int getExpectedPartCount() {
        return this.fountainDecoder.getExpectedPartCount();
    }

    public Set<Integer> getReceivedPartIndexes() {
        return this.fountainDecoder.getRecievedPartIndexes();
    }

    public Set<Integer> getLastPartIndexes() {
        return this.fountainDecoder.getLastPartIndexes();
    }

    public int getProcessedPartsCount() {
        return this.fountainDecoder.getProcessedPartsCount();
    }

    public double getEstimatedPercentComplete() {
        return this.fountainDecoder.getEstimatedPercentComplete();
    }

    public static UR decode(String str) throws UR.URException {
        ParsedURString parsedURString = parse(str);
        String[] strArr = parsedURString.components;
        if (strArr.length < 1) {
            throw new UR.InvalidPathLengthException("Invalid path length");
        }
        return decode(parsedURString.type, strArr[0]);
    }

    public static UR decode(String str, String str2) throws UR.InvalidTypeException {
        return new UR(str, Bytewords.decode(str2, Bytewords.Style.MINIMAL));
    }

    public boolean receivePart(String str) {
        try {
            if (getResult() != null) {
                return false;
            }
            ParsedURString parsedURString = parse(str);
            if (!validatePart(parsedURString.type)) {
                return false;
            }
            String[] strArr = parsedURString.components;
            if (strArr.length == 1) {
                this.result = new Result(ResultType.SUCCESS, decode(parsedURString.type, strArr[0]), null);
                return true;
            }
            if (strArr.length != 2) {
                throw new UR.InvalidPathLengthException("Invalid path length");
            }
            String str2 = strArr[0];
            String str3 = strArr[1];
            Matcher matcher = SEQUENCE_COMPONENT_PATTERN.matcher(str2);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                int i2 = Integer.parseInt(matcher.group(2));
                FountainEncoder.Part partFromCborBytes = FountainEncoder.Part.fromCborBytes(Bytewords.decode(str3, Bytewords.Style.MINIMAL));
                if (i != partFromCborBytes.getSeqNum() || i2 != partFromCborBytes.getSeqLen() || !this.fountainDecoder.receivePart(partFromCborBytes)) {
                    return false;
                }
                if (this.fountainDecoder.getResult() != null) {
                    ResultType resultType = this.fountainDecoder.getResult().type;
                    ResultType resultType2 = ResultType.SUCCESS;
                    if (resultType == resultType2) {
                        this.result = new Result(resultType2, new UR(parsedURString.type, this.fountainDecoder.getResult().data), null);
                    } else {
                        ResultType resultType3 = this.fountainDecoder.getResult().type;
                        ResultType resultType4 = ResultType.FAILURE;
                        if (resultType3 == resultType4) {
                            this.result = new Result(resultType4, null, this.fountainDecoder.getResult().error);
                        }
                    }
                }
                return true;
            }
            throw new UR.InvalidSequenceComponentException("Invalid sequence " + str2);
        } catch (CborException | UR.URException unused) {
            return false;
        }
    }

    private boolean validatePart(String str) {
        String str2 = this.expectedType;
        if (str2 == null) {
            if (!UR.isURType(str)) {
                return false;
            }
            this.expectedType = str;
            return true;
        }
        return str2.equals(str);
    }

    public static ParsedURString parse(String str) throws UR.URException {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("ur:")) {
            throw new UR.InvalidSchemeException("Invalid scheme");
        }
        String[] strArrSplit = lowerCase.substring(3).split("/");
        if (strArrSplit.length <= 1) {
            throw new UR.InvalidPathLengthException("Invalid path length");
        }
        String str2 = strArrSplit[0];
        if (!UR.isURType(str2)) {
            throw new UR.InvalidTypeException("Invalid type: " + str2);
        }
        return new ParsedURString(str2, (String[]) Arrays.copyOfRange(strArrSplit, 1, strArrSplit.length));
    }

    public static class ParsedURString {
        public final String[] components;
        public final String type;

        public ParsedURString(String str, String[] strArr) {
            this.type = str;
            this.components = strArr;
        }
    }

    public static class Result {
        public final String error;
        public final ResultType type;
        public final UR ur;

        public Result(ResultType resultType, UR ur, String str) {
            this.type = resultType;
            this.ur = ur;
            this.error = str;
        }
    }
}
