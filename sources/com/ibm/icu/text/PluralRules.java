package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.util.ULocale;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import o.C7071acs;
import o.C7158aeZ;
import o.C7225afn;
import o.C7227afp;
import o.C7255agQ;

/* JADX INFO: loaded from: classes3.dex */
public class PluralRules implements Serializable {
    static final UnicodeSet ALLOWED_ID = new UnicodeSet("[a-z]").AYXKKw();
    static final Pattern AND_SEPARATED;
    static final Pattern AT_SEPARATED;
    private static final String CATEGORY_SEPARATOR = ";  ";
    static final Pattern COMMA_SEPARATED;
    public static final PluralRules DEFAULT;
    private static final Rule DEFAULT_RULE;
    static final Pattern DOTDOT_SEPARATED;
    public static final String KEYWORD_FEW = "few";
    public static final String KEYWORD_MANY = "many";
    public static final String KEYWORD_ONE = "one";
    public static final String KEYWORD_OTHER = "other";
    public static final String KEYWORD_TWO = "two";
    public static final String KEYWORD_ZERO = "zero";
    private static final Constraint NO_CONSTRAINT;
    public static final double NO_UNIQUE_VALUE = -0.00123456777d;
    static final Pattern OR_SEPARATED;
    static final Pattern SEMI_SEPARATED;
    static final Pattern TILDE_SEPARATED;
    private static final long serialVersionUID = 1;
    private final transient Set<String> keywords;
    private final RuleList rules;
    private final transient C7158aeZ standardPluralRanges;

    public interface Constraint extends Serializable {
        boolean isFulfilled(TaskDescription taskDescription);

        boolean isLimited(SampleType sampleType);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public enum KeywordStatus {
        INVALID,
        SUPPRESSED,
        UNIQUE,
        BOUNDED,
        UNBOUNDED
    }

    @Deprecated
    public enum Operand {
        n,
        i,
        f,
        t,
        v,
        w,
        e,
        j
    }

    public enum PluralType {
        CARDINAL,
        ORDINAL
    }

    @Deprecated
    public enum SampleType {
        INTEGER,
        DECIMAL
    }

    @Deprecated
    public interface TaskDescription {
        @Deprecated
        double getPluralOperand(Operand operand);

        @Deprecated
        boolean isInfinite();

        @Deprecated
        boolean isNaN();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> getKeywords() {
        return this.keywords;
    }

    static {
        Constraint constraint = new Constraint() { // from class: com.ibm.icu.text.PluralRules.1
            private static final long serialVersionUID = 9163464945387899416L;

            @Override // com.ibm.icu.text.PluralRules.Constraint
            public boolean isFulfilled(TaskDescription taskDescription) {
                return true;
            }

            @Override // com.ibm.icu.text.PluralRules.Constraint
            public boolean isLimited(SampleType sampleType) {
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "";
            }
        };
        NO_CONSTRAINT = constraint;
        Rule rule = new Rule("other", constraint, null, null);
        DEFAULT_RULE = rule;
        DEFAULT = new PluralRules(new RuleList().addRule(rule), C7158aeZ.EZpvd);
        AT_SEPARATED = Pattern.compile("\\s*\\Q\\E@\\s*");
        OR_SEPARATED = Pattern.compile("\\s*or\\s*");
        AND_SEPARATED = Pattern.compile("\\s*and\\s*");
        COMMA_SEPARATED = Pattern.compile("\\s*,\\s*");
        DOTDOT_SEPARATED = Pattern.compile("\\s*\\Q..\\E\\s*");
        TILDE_SEPARATED = Pattern.compile("\\s*~\\s*");
        SEMI_SEPARATED = Pattern.compile("\\s*;\\s*");
    }

    @Deprecated
    public static abstract class Activity {
        @Deprecated
        public Activity() {
        }

        @Deprecated
        public static C7071acs EZpvd() {
            return C7071acs.copydefault;
        }
    }

    public static PluralRules parseDescription(String str) throws ParseException {
        return newInternal(str, null);
    }

    public static PluralRules createRules(String str) {
        try {
            return parseDescription(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Deprecated
    public static PluralRules newInternal(String str, C7158aeZ c7158aeZ) throws ParseException {
        String strTrim = str.trim();
        return strTrim.length() == 0 ? DEFAULT : new PluralRules(parseRuleChain(strTrim), c7158aeZ);
    }

    @Deprecated
    public static class FixedDecimal extends Number implements Comparable<FixedDecimal>, TaskDescription {
        static final long MAX = 1000000000000000000L;
        private static final long MAX_INTEGER_PART = 1000000000;
        private static final long serialVersionUID = -4756200506571685661L;
        private final int baseFactor;
        final long decimalDigits;
        final long decimalDigitsWithoutTrailingZeros;
        final int exponent;
        final boolean hasIntegerValue;
        final long integerValue;
        final boolean isNegative;
        final double source;
        final int visibleDecimalDigitCount;
        final int visibleDecimalDigitCountWithoutTrailingZeros;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public int getBaseFactor() {
            return this.baseFactor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public long getDecimalDigits() {
            return this.decimalDigits;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public long getDecimalDigitsWithoutTrailingZeros() {
            return this.decimalDigitsWithoutTrailingZeros;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public long getIntegerValue() {
            return this.integerValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public long getShiftedValue() {
            return (this.integerValue * ((long) this.baseFactor)) + this.decimalDigits;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public double getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public int getVisibleDecimalDigitCount() {
            return this.visibleDecimalDigitCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public int getVisibleDecimalDigitCountWithoutTrailingZeros() {
            return this.visibleDecimalDigitCountWithoutTrailingZeros;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public boolean hasIntegerValue() {
            return this.hasIntegerValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public int hashCode() {
            return (int) (this.decimalDigits + ((long) ((this.visibleDecimalDigitCount + ((int) (this.source * 37.0d))) * 37)));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public boolean isHasIntegerValue() {
            return this.hasIntegerValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public boolean isNegative() {
            return this.isNegative;
        }

        @Deprecated
        public FixedDecimal(double d, int i, long j, int i2) {
            boolean z = d < AudioStats.AUDIO_AMPLITUDE_NONE;
            this.isNegative = z;
            double d2 = z ? -d : d;
            this.source = d2;
            this.visibleDecimalDigitCount = i;
            this.decimalDigits = j;
            long j2 = d > 1.0E18d ? MAX : (long) d;
            this.integerValue = j2;
            this.exponent = i2;
            this.hasIntegerValue = d2 == ((double) j2);
            if (j == 0) {
                this.decimalDigitsWithoutTrailingZeros = 0L;
                this.visibleDecimalDigitCountWithoutTrailingZeros = 0;
            } else {
                int i3 = i;
                while (j % 10 == 0) {
                    j /= 10;
                    i3--;
                }
                this.decimalDigitsWithoutTrailingZeros = j;
                this.visibleDecimalDigitCountWithoutTrailingZeros = i3;
            }
            this.baseFactor = (int) Math.pow(10.0d, i);
        }

        @Deprecated
        public FixedDecimal(double d, int i, long j) {
            this(d, i, j, 0);
        }

        @Deprecated
        public static FixedDecimal createWithExponent(double d, int i, int i2) {
            return new FixedDecimal(d, i, getFractionalDigits(d, i), i2);
        }

        @Deprecated
        public FixedDecimal(double d, int i) {
            this(d, i, getFractionalDigits(d, i));
        }

        private static int getFractionalDigits(double d, int i) {
            if (i == 0) {
                return 0;
            }
            if (d < AudioStats.AUDIO_AMPLITUDE_NONE) {
                d = -d;
            }
            int iPow = (int) Math.pow(10.0d, i);
            return (int) (Math.round(d * ((double) iPow)) % ((long) iPow));
        }

        @Deprecated
        public FixedDecimal(double d) {
            this(d, decimals(d));
        }

        @Deprecated
        public FixedDecimal(long j) {
            this(j, 0);
        }

        @Deprecated
        public static int decimals(double d) {
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                return 0;
            }
            if (d < AudioStats.AUDIO_AMPLITUDE_NONE) {
                d = -d;
            }
            if (d == Math.floor(d)) {
                return 0;
            }
            if (d < 1.0E9d) {
                long j = (long) (d * 1000000.0d);
                int i = 10;
                for (int i2 = 6; i2 > 0; i2--) {
                    if ((j % 1000000) % ((long) i) != 0) {
                        return i2;
                    }
                    i *= 10;
                }
                return 0;
            }
            String str = String.format(Locale.ENGLISH, "%1.15e", Double.valueOf(d));
            int iLastIndexOf = str.lastIndexOf(101);
            int i3 = iLastIndexOf + 1;
            if (str.charAt(i3) == '+') {
                i3 = iLastIndexOf + 2;
            }
            int i4 = (iLastIndexOf - 2) - Integer.parseInt(str.substring(i3));
            if (i4 < 0) {
                return 0;
            }
            for (int i5 = iLastIndexOf - 1; i4 > 0 && str.charAt(i5) == '0'; i5--) {
                i4--;
            }
            return i4;
        }

        @Deprecated
        private FixedDecimal(FixedDecimal fixedDecimal) {
            this.source = fixedDecimal.source;
            this.visibleDecimalDigitCount = fixedDecimal.visibleDecimalDigitCount;
            this.visibleDecimalDigitCountWithoutTrailingZeros = fixedDecimal.visibleDecimalDigitCountWithoutTrailingZeros;
            this.decimalDigits = fixedDecimal.decimalDigits;
            this.decimalDigitsWithoutTrailingZeros = fixedDecimal.decimalDigitsWithoutTrailingZeros;
            this.integerValue = fixedDecimal.integerValue;
            this.hasIntegerValue = fixedDecimal.hasIntegerValue;
            this.isNegative = fixedDecimal.isNegative;
            this.exponent = fixedDecimal.exponent;
            this.baseFactor = fixedDecimal.baseFactor;
        }

        @Deprecated
        public FixedDecimal(String str) {
            this(parseDecimalSampleRangeNumString(str));
        }

        @Deprecated
        private static FixedDecimal parseDecimalSampleRangeNumString(String str) {
            if (str.contains("e")) {
                int iLastIndexOf = str.lastIndexOf(101);
                int i = Integer.parseInt(str.substring(iLastIndexOf + 1));
                String strSubstring = str.substring(0, iLastIndexOf);
                return createWithExponent(Double.parseDouble(strSubstring), getVisibleFractionCount(strSubstring), i);
            }
            return new FixedDecimal(Double.parseDouble(str), getVisibleFractionCount(str));
        }

        private static int getVisibleFractionCount(String str) {
            String strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(46) + 1;
            if (iIndexOf == 0) {
                return 0;
            }
            return strTrim.length() - iIndexOf;
        }

        @Override // com.ibm.icu.text.PluralRules.TaskDescription
        @Deprecated
        public double getPluralOperand(Operand operand) {
            switch (AnonymousClass3.EZpvd[operand.ordinal()]) {
                case 1:
                    return this.source;
                case 2:
                    return this.integerValue;
                case 3:
                    return this.decimalDigits;
                case 4:
                    return this.decimalDigitsWithoutTrailingZeros;
                case 5:
                    return this.visibleDecimalDigitCount;
                case 6:
                    return this.visibleDecimalDigitCountWithoutTrailingZeros;
                case 7:
                    return this.exponent;
                default:
                    return this.source;
            }
        }

        @Deprecated
        public static Operand getOperand(String str) {
            return Operand.valueOf(str);
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        @Deprecated
        public int compareTo(FixedDecimal fixedDecimal) {
            if (this.exponent != fixedDecimal.exponent) {
                return doubleValue() < fixedDecimal.doubleValue() ? -1 : 1;
            }
            long j = this.integerValue;
            long j2 = fixedDecimal.integerValue;
            if (j != j2) {
                return j < j2 ? -1 : 1;
            }
            double d = this.source;
            double d2 = fixedDecimal.source;
            if (d != d2) {
                return d < d2 ? -1 : 1;
            }
            int i = this.visibleDecimalDigitCount;
            int i2 = fixedDecimal.visibleDecimalDigitCount;
            if (i != i2) {
                return i < i2 ? -1 : 1;
            }
            long j3 = this.decimalDigits - fixedDecimal.decimalDigits;
            if (j3 != 0) {
                return j3 < 0 ? -1 : 1;
            }
            return 0;
        }

        @Deprecated
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FixedDecimal)) {
                return false;
            }
            FixedDecimal fixedDecimal = (FixedDecimal) obj;
            return this.source == fixedDecimal.source && this.visibleDecimalDigitCount == fixedDecimal.visibleDecimalDigitCount && this.decimalDigits == fixedDecimal.decimalDigits && this.exponent == fixedDecimal.exponent;
        }

        @Deprecated
        public String toString() {
            String str = String.format(Locale.ROOT, "%." + this.visibleDecimalDigitCount + "f", Double.valueOf(this.source));
            if (this.exponent == 0) {
                return str;
            }
            return str + "e" + this.exponent;
        }

        @Override // java.lang.Number
        @Deprecated
        public int intValue() {
            return (int) longValue();
        }

        @Override // java.lang.Number
        @Deprecated
        public long longValue() {
            int i = this.exponent;
            return i == 0 ? this.integerValue : (long) (Math.pow(10.0d, i) * this.integerValue);
        }

        @Override // java.lang.Number
        @Deprecated
        public float floatValue() {
            return (float) (this.source * Math.pow(10.0d, this.exponent));
        }

        @Override // java.lang.Number
        @Deprecated
        public double doubleValue() {
            return (this.isNegative ? -this.source : this.source) * Math.pow(10.0d, this.exponent);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }

        @Override // com.ibm.icu.text.PluralRules.TaskDescription
        @Deprecated
        public boolean isNaN() {
            return Double.isNaN(this.source);
        }

        @Override // com.ibm.icu.text.PluralRules.TaskDescription
        @Deprecated
        public boolean isInfinite() {
            return Double.isInfinite(this.source);
        }
    }

    @Deprecated
    public static class StateListAnimator {

        @Deprecated
        public final FixedDecimal EZpvd;

        @Deprecated
        public final FixedDecimal OLrzqt;

        @Deprecated
        public StateListAnimator(FixedDecimal fixedDecimal, FixedDecimal fixedDecimal2) {
            if (fixedDecimal.visibleDecimalDigitCount == fixedDecimal2.visibleDecimalDigitCount) {
                this.OLrzqt = fixedDecimal;
                this.EZpvd = fixedDecimal2;
                return;
            }
            throw new IllegalArgumentException("Ranges must have the same number of visible decimals: " + fixedDecimal + "~" + fixedDecimal2);
        }

        @Deprecated
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.OLrzqt);
            if (this.EZpvd == this.OLrzqt) {
                str = "";
            } else {
                str = "~" + this.EZpvd;
            }
            sb.append(str);
            return sb.toString();
        }
    }

    @Deprecated
    public static class Application {

        @Deprecated
        public final boolean AEQbTJ;

        @Deprecated
        public final SampleType EZpvd;

        @Deprecated
        public final Set<StateListAnimator> copydefault;

        public Application(SampleType sampleType, Set<StateListAnimator> set, boolean z) {
            this.EZpvd = sampleType;
            this.copydefault = set;
            this.AEQbTJ = z;
        }

        public static Application copydefault(String str) {
            SampleType sampleType;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (str.startsWith(TypedValues.Custom.S_INT)) {
                sampleType = SampleType.INTEGER;
            } else if (str.startsWith("decimal")) {
                sampleType = SampleType.DECIMAL;
            } else {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            boolean z = false;
            boolean z2 = true;
            for (String str2 : PluralRules.COMMA_SEPARATED.split(str.substring(7).trim())) {
                if (str2.equals("…") || str2.equals("...")) {
                    z2 = false;
                    z = true;
                } else {
                    if (z) {
                        throw new IllegalArgumentException("Can only have … at the end of samples: " + str2);
                    }
                    String[] strArrSplit = PluralRules.TILDE_SEPARATED.split(str2);
                    int length = strArrSplit.length;
                    if (length == 1) {
                        FixedDecimal fixedDecimal = new FixedDecimal(strArrSplit[0]);
                        AEQbTJ(sampleType, fixedDecimal);
                        linkedHashSet.add(new StateListAnimator(fixedDecimal, fixedDecimal));
                    } else {
                        if (length != 2) {
                            throw new IllegalArgumentException("Ill-formed number range: " + str2);
                        }
                        FixedDecimal fixedDecimal2 = new FixedDecimal(strArrSplit[0]);
                        FixedDecimal fixedDecimal3 = new FixedDecimal(strArrSplit[1]);
                        AEQbTJ(sampleType, fixedDecimal2);
                        AEQbTJ(sampleType, fixedDecimal3);
                        linkedHashSet.add(new StateListAnimator(fixedDecimal2, fixedDecimal3));
                    }
                }
            }
            return new Application(sampleType, Collections.unmodifiableSet(linkedHashSet), z2);
        }

        public static void AEQbTJ(SampleType sampleType, FixedDecimal fixedDecimal) {
            if ((sampleType == SampleType.INTEGER) == (fixedDecimal.getVisibleDecimalDigitCount() == 0)) {
                return;
            }
            throw new IllegalArgumentException("Ill-formed number range: " + fixedDecimal);
        }

        @Deprecated
        public Set<Double> copydefault(Set<Double> set) {
            for (StateListAnimator stateListAnimator : this.copydefault) {
                long shiftedValue = stateListAnimator.EZpvd.getShiftedValue();
                for (long shiftedValue2 = stateListAnimator.OLrzqt.getShiftedValue(); shiftedValue2 <= shiftedValue; shiftedValue2++) {
                    set.add(Double.valueOf(shiftedValue2 / ((double) stateListAnimator.OLrzqt.baseFactor)));
                }
            }
            return set;
        }

        @Deprecated
        public String toString() {
            StringBuilder sb = new StringBuilder("@");
            sb.append(this.EZpvd.toString().toLowerCase(Locale.ENGLISH));
            boolean z = true;
            for (StateListAnimator stateListAnimator : this.copydefault) {
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(' ');
                sb.append(stateListAnimator);
            }
            if (!this.AEQbTJ) {
                sb.append(", …");
            }
            return sb.toString();
        }
    }

    public static class ActionBar {
        public static final UnicodeSet EZpvd = new UnicodeSet(9, 10, 12, 13, 32, 32).AYXKKw();
        public static final UnicodeSet AEQbTJ = new UnicodeSet(33, 33, 37, 37, 44, 44, 46, 46, 61, 61).AYXKKw();

        public static String[] KWHzl(String str) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (EZpvd.AEQbTJ(cCharAt)) {
                    if (i >= 0) {
                        arrayList.add(str.substring(i, i2));
                        i = -1;
                    }
                } else if (AEQbTJ.AEQbTJ(cCharAt)) {
                    if (i >= 0) {
                        arrayList.add(str.substring(i, i2));
                    }
                    arrayList.add(str.substring(i2, i2 + 1));
                    i = -1;
                } else if (i < 0) {
                    i = i2;
                }
            }
            if (i >= 0) {
                arrayList.add(str.substring(i));
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Constraint parseConstraint(String str) throws ParseException {
        String[] strArr;
        int i;
        Constraint constraint;
        String[] strArr2;
        int i2;
        Constraint constraint2;
        int i3;
        int i4;
        boolean z;
        boolean zEquals;
        int i5;
        boolean z2;
        boolean z3;
        String strNextToken;
        boolean z4;
        double d;
        long j;
        boolean z5;
        Operand operand;
        boolean z6;
        long j2;
        String strNextToken2;
        int i6;
        boolean z7;
        double dMin;
        long[] jArr;
        String[] strArrSplit = OR_SEPARATED.split(str);
        int i7 = 0;
        int i8 = 0;
        Constraint orConstraint = null;
        while (i8 < strArrSplit.length) {
            String[] strArrSplit2 = AND_SEPARATED.split(strArrSplit[i8]);
            int i9 = i7;
            Constraint andConstraint = null;
            while (i9 < strArrSplit2.length) {
                Constraint rangeConstraint = NO_CONSTRAINT;
                String strTrim = strArrSplit2[i9].trim();
                String[] strArrKWHzl = ActionBar.KWHzl(strTrim);
                String str2 = strArrKWHzl[i7];
                try {
                    Operand operand2 = FixedDecimal.getOperand(str2);
                    if (1 < strArrKWHzl.length) {
                        String strNextToken3 = strArrKWHzl[1];
                        if ("mod".equals(strNextToken3) || "%".equals(strNextToken3)) {
                            i3 = 4;
                            i4 = Integer.parseInt(strArrKWHzl[2]);
                            strNextToken3 = nextToken(strArrKWHzl, 3, strTrim);
                        } else {
                            i4 = i7;
                            i3 = 2;
                        }
                        if ("not".equals(strNextToken3)) {
                            strNextToken3 = nextToken(strArrKWHzl, i3, strTrim);
                            if (ContainerUtils.KEY_VALUE_DELIMITER.equals(strNextToken3)) {
                                throw unexpected(strNextToken3, strTrim);
                            }
                        } else if ("!".equals(strNextToken3)) {
                            strNextToken3 = nextToken(strArrKWHzl, i3, strTrim);
                            if (!ContainerUtils.KEY_VALUE_DELIMITER.equals(strNextToken3)) {
                                throw unexpected(strNextToken3, strTrim);
                            }
                        } else {
                            z = true;
                            strArr = strArrSplit;
                            if (!"is".equals(strNextToken3) || "in".equals(strNextToken3) || ContainerUtils.KEY_VALUE_DELIMITER.equals(strNextToken3)) {
                                zEquals = "is".equals(strNextToken3);
                                if (!zEquals && !z) {
                                    throw unexpected(strNextToken3, strTrim);
                                }
                                String strNextToken4 = nextToken(strArrKWHzl, i3, strTrim);
                                i5 = i3 + 1;
                                z2 = true;
                                z3 = zEquals;
                                strNextToken = strNextToken4;
                            } else if ("within".equals(strNextToken3)) {
                                strNextToken = nextToken(strArrKWHzl, i3, strTrim);
                                i5 = i3 + 1;
                                z3 = false;
                                z2 = false;
                            } else {
                                throw unexpected(strNextToken3, strTrim);
                            }
                            if ("not".equals(strNextToken)) {
                                z4 = z;
                            } else {
                                if (!z3 && !z) {
                                    throw unexpected(strNextToken, strTrim);
                                }
                                strNextToken = nextToken(strArrKWHzl, i5, strTrim);
                                z4 = !z;
                                i5++;
                            }
                            ArrayList arrayList = new ArrayList();
                            d = 9.223372036854776E18d;
                            i = i8;
                            constraint = orConstraint;
                            strArr2 = strArrSplit2;
                            i2 = i9;
                            double dMax = -9.223372036854776E18d;
                            while (true) {
                                j = Long.parseLong(strNextToken);
                                String str3 = strNextToken;
                                constraint2 = andConstraint;
                                if (i5 >= strArrKWHzl.length) {
                                    int i10 = i5 + 1;
                                    operand = operand2;
                                    String strNextToken5 = nextToken(strArrKWHzl, i5, strTrim);
                                    z5 = z4;
                                    if (strNextToken5.equals(JwtUtilsKt.JWT_DELIMITER)) {
                                        String strNextToken6 = nextToken(strArrKWHzl, i10, strTrim);
                                        if (!strNextToken6.equals(JwtUtilsKt.JWT_DELIMITER)) {
                                            throw unexpected(strNextToken6, strTrim);
                                        }
                                        int i11 = i5 + 3;
                                        String strNextToken7 = nextToken(strArrKWHzl, i5 + 2, strTrim);
                                        long j3 = Long.parseLong(strNextToken7);
                                        if (i11 < strArrKWHzl.length) {
                                            i5 += 4;
                                            strNextToken2 = nextToken(strArrKWHzl, i11, strTrim);
                                            if (!strNextToken2.equals(",")) {
                                                throw unexpected(strNextToken2, strTrim);
                                            }
                                        } else {
                                            i5 = i11;
                                            strNextToken2 = strNextToken7;
                                        }
                                        z6 = z3;
                                        j2 = j3;
                                    } else {
                                        if (!strNextToken5.equals(",")) {
                                            throw unexpected(strNextToken5, strTrim);
                                        }
                                        i5 = i10;
                                        strNextToken2 = strNextToken5;
                                        z6 = z3;
                                        j2 = j;
                                    }
                                } else {
                                    z5 = z4;
                                    operand = operand2;
                                    z6 = z3;
                                    j2 = j;
                                    strNextToken2 = str3;
                                }
                                if (j <= j2) {
                                    throw unexpected(j + "~" + j2, strTrim);
                                }
                                i6 = i5;
                                z7 = z6;
                                if (i4 != 0 && j2 >= i4) {
                                    throw unexpected(j2 + ">mod=" + i4, strTrim);
                                }
                                arrayList.add(Long.valueOf(j));
                                arrayList.add(Long.valueOf(j2));
                                dMin = Math.min(d, j);
                                dMax = Math.max(dMax, j2);
                                if (i6 < strArrKWHzl.length) {
                                    strNextToken = nextToken(strArrKWHzl, i6, strTrim);
                                    i5 = i6 + 1;
                                    d = dMin;
                                    operand2 = operand;
                                    z4 = z5;
                                    z3 = z7;
                                    andConstraint = constraint2;
                                } else {
                                    if (strNextToken2.equals(",")) {
                                        throw unexpected(strNextToken2, strTrim);
                                    }
                                    if (arrayList.size() == 2) {
                                        jArr = null;
                                    } else {
                                        int size = arrayList.size();
                                        jArr = new long[size];
                                        for (int i12 = 0; i12 < size; i12++) {
                                            jArr[i12] = ((Long) arrayList.get(i12)).longValue();
                                        }
                                    }
                                    if (dMin != dMax && z7 && !z5) {
                                        throw unexpected("is not <range>", strTrim);
                                    }
                                    rangeConstraint = new RangeConstraint(i4, z5, operand, z2, dMin, dMax, jArr);
                                }
                            }
                        }
                        i3++;
                        z = false;
                        strArr = strArrSplit;
                        if (!"is".equals(strNextToken3)) {
                            zEquals = "is".equals(strNextToken3);
                            if (!zEquals) {
                            }
                            String strNextToken42 = nextToken(strArrKWHzl, i3, strTrim);
                            i5 = i3 + 1;
                            z2 = true;
                            z3 = zEquals;
                            strNextToken = strNextToken42;
                            if ("not".equals(strNextToken)) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            d = 9.223372036854776E18d;
                            i = i8;
                            constraint = orConstraint;
                            strArr2 = strArrSplit2;
                            i2 = i9;
                            double dMax2 = -9.223372036854776E18d;
                            while (true) {
                                j = Long.parseLong(strNextToken);
                                String str32 = strNextToken;
                                constraint2 = andConstraint;
                                if (i5 >= strArrKWHzl.length) {
                                }
                                if (j <= j2) {
                                }
                                strNextToken = nextToken(strArrKWHzl, i6, strTrim);
                                i5 = i6 + 1;
                                d = dMin;
                                operand2 = operand;
                                z4 = z5;
                                z3 = z7;
                                andConstraint = constraint2;
                            }
                        }
                    } else {
                        strArr = strArrSplit;
                        i = i8;
                        constraint = orConstraint;
                        strArr2 = strArrSplit2;
                        i2 = i9;
                        constraint2 = andConstraint;
                    }
                    andConstraint = constraint2 == null ? rangeConstraint : new AndConstraint(constraint2, rangeConstraint);
                    i9 = i2 + 1;
                    strArrSplit = strArr;
                    i8 = i;
                    orConstraint = constraint;
                    strArrSplit2 = strArr2;
                    i7 = 0;
                } catch (Exception unused) {
                    throw unexpected(str2, strTrim);
                }
            }
            String[] strArr3 = strArrSplit;
            int i13 = i8;
            Constraint constraint3 = orConstraint;
            Constraint constraint4 = andConstraint;
            orConstraint = constraint3 == null ? constraint4 : new OrConstraint(constraint3, constraint4);
            i8 = i13 + 1;
            strArrSplit = strArr3;
            i7 = 0;
        }
        return orConstraint;
    }

    private static ParseException unexpected(String str, String str2) {
        return new ParseException("unexpected token '" + str + "' in '" + str2 + "'", -1);
    }

    private static String nextToken(String[] strArr, int i, String str) throws ParseException {
        if (i < strArr.length) {
            return strArr[i];
        }
        throw new ParseException("missing token at end of '" + str + "'", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Rule parseRule(String str) throws ParseException {
        Application applicationCopydefault;
        if (str.length() == 0) {
            return DEFAULT_RULE;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int iIndexOf = lowerCase.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("missing ':' in rule description '" + lowerCase + "'", 0);
        }
        String strTrim = lowerCase.substring(0, iIndexOf).trim();
        if (!isValidKeyword(strTrim)) {
            throw new ParseException("keyword '" + strTrim + " is not valid", 0);
        }
        String strTrim2 = lowerCase.substring(iIndexOf + 1).trim();
        String[] strArrSplit = AT_SEPARATED.split(strTrim2);
        int length = strArrSplit.length;
        Application applicationCopydefault2 = null;
        if (length == 1) {
            applicationCopydefault = null;
        } else if (length == 2) {
            applicationCopydefault = Application.copydefault(strArrSplit[1]);
            if (applicationCopydefault.EZpvd != SampleType.DECIMAL) {
                applicationCopydefault2 = applicationCopydefault;
                applicationCopydefault = null;
            }
        } else if (length == 3) {
            applicationCopydefault2 = Application.copydefault(strArrSplit[1]);
            Application applicationCopydefault3 = Application.copydefault(strArrSplit[2]);
            if (applicationCopydefault2.EZpvd != SampleType.INTEGER || applicationCopydefault3.EZpvd != SampleType.DECIMAL) {
                throw new IllegalArgumentException("Must have @integer then @decimal in " + strTrim2);
            }
            applicationCopydefault = applicationCopydefault3;
        } else {
            throw new IllegalArgumentException("Too many samples in " + strTrim2);
        }
        boolean zEquals = strTrim.equals("other");
        if (zEquals != (strArrSplit[0].length() == 0)) {
            throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
        }
        return new Rule(strTrim, zEquals ? NO_CONSTRAINT : parseConstraint(strArrSplit[0]), applicationCopydefault2, applicationCopydefault);
    }

    private static RuleList parseRuleChain(String str) throws ParseException {
        RuleList ruleList = new RuleList();
        if (str.endsWith(";")) {
            str = str.substring(0, str.length() - 1);
        }
        for (String str2 : SEMI_SEPARATED.split(str)) {
            Rule rule = parseRule(str2.trim());
            ruleList.hasExplicitBoundingInfo |= (rule.integerSamples == null && rule.decimalSamples == null) ? false : true;
            ruleList.addRule(rule);
        }
        return ruleList.finish();
    }

    public static class RangeConstraint implements Constraint, Serializable {
        private static final long serialVersionUID = 1;
        private final boolean inRange;
        private final boolean integersOnly;
        private final double lowerBound;
        private final int mod;
        private final Operand operand;
        private final long[] range_list;
        private final double upperBound;

        public RangeConstraint(int i, boolean z, Operand operand, boolean z2, double d, double d2, long[] jArr) {
            this.mod = i;
            this.inRange = z;
            this.integersOnly = z2;
            this.lowerBound = d;
            this.upperBound = d2;
            this.range_list = jArr;
            this.operand = operand;
        }

        @Override // com.ibm.icu.text.PluralRules.Constraint
        public boolean isFulfilled(TaskDescription taskDescription) {
            double pluralOperand = taskDescription.getPluralOperand(this.operand);
            if ((this.integersOnly && pluralOperand - ((long) pluralOperand) != AudioStats.AUDIO_AMPLITUDE_NONE) || (this.operand == Operand.j && taskDescription.getPluralOperand(Operand.v) != AudioStats.AUDIO_AMPLITUDE_NONE)) {
                return !this.inRange;
            }
            int i = this.mod;
            if (i != 0) {
                pluralOperand %= (double) i;
            }
            boolean z = pluralOperand >= this.lowerBound && pluralOperand <= this.upperBound;
            if (z && this.range_list != null) {
                z = false;
                int i2 = 0;
                while (!z) {
                    long[] jArr = this.range_list;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    z = pluralOperand >= ((double) jArr[i2]) && pluralOperand <= ((double) jArr[i2 + 1]);
                    i2 += 2;
                }
            }
            return this.inRange == z;
        }

        @Override // com.ibm.icu.text.PluralRules.Constraint
        public boolean isLimited(SampleType sampleType) {
            Operand operand;
            double d = this.lowerBound;
            boolean z = d == this.upperBound && d == AudioStats.AUDIO_AMPLITUDE_NONE;
            Operand operand2 = this.operand;
            boolean z2 = (operand2 == Operand.v || operand2 == Operand.w || operand2 == Operand.f || operand2 == Operand.t) && this.inRange != z;
            int i = AnonymousClass3.OLrzqt[sampleType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                return (!z2 || (operand = this.operand) == Operand.n || operand == Operand.j) && (this.integersOnly || this.lowerBound == this.upperBound) && this.mod == 0 && this.inRange;
            }
            if (z2) {
                return true;
            }
            Operand operand3 = this.operand;
            return (operand3 == Operand.n || operand3 == Operand.i || operand3 == Operand.j) && this.mod == 0 && this.inRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.operand);
            if (this.mod != 0) {
                sb.append(" % ");
                sb.append(this.mod);
            }
            if (this.lowerBound != this.upperBound) {
                if (this.integersOnly) {
                    str = this.inRange ? " = " : " != ";
                } else {
                    str = this.inRange ? " within " : " not within ";
                }
            } else if (this.inRange) {
            }
            sb.append(str);
            if (this.range_list != null) {
                int i = 0;
                while (true) {
                    if (i >= this.range_list.length) {
                        break;
                    }
                    PluralRules.addRange(sb, r0[i], r0[i + 1], i != 0);
                    i += 2;
                }
            } else {
                PluralRules.addRange(sb, this.lowerBound, this.upperBound, false);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.PluralRules$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[SampleType.values().length];
            OLrzqt = iArr;
            try {
                iArr[SampleType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[SampleType.DECIMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Operand.values().length];
            EZpvd = iArr2;
            try {
                iArr2[Operand.n.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[Operand.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EZpvd[Operand.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EZpvd[Operand.t.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EZpvd[Operand.v.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                EZpvd[Operand.w.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                EZpvd[Operand.e.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addRange(StringBuilder sb, double d, double d2, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d == d2) {
            sb.append(format(d));
            return;
        }
        sb.append(format(d) + ".." + format(d2));
    }

    private static String format(double d) {
        long j = (long) d;
        return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
    }

    public static abstract class BinaryConstraint implements Constraint, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Constraint f1037a;
        protected final Constraint b;

        public BinaryConstraint(Constraint constraint, Constraint constraint2) {
            this.f1037a = constraint;
            this.b = constraint2;
        }
    }

    public static class AndConstraint extends BinaryConstraint {
        private static final long serialVersionUID = 7766999779862263523L;

        public AndConstraint(Constraint constraint, Constraint constraint2) {
            super(constraint, constraint2);
        }

        @Override // com.ibm.icu.text.PluralRules.Constraint
        public boolean isFulfilled(TaskDescription taskDescription) {
            return this.f1037a.isFulfilled(taskDescription) && this.b.isFulfilled(taskDescription);
        }

        @Override // com.ibm.icu.text.PluralRules.Constraint
        public boolean isLimited(SampleType sampleType) {
            return this.f1037a.isLimited(sampleType) || this.b.isLimited(sampleType);
        }

        public String toString() {
            return this.f1037a.toString() + " and " + this.b.toString();
        }
    }

    public static class OrConstraint extends BinaryConstraint {
        private static final long serialVersionUID = 1405488568664762222L;

        public OrConstraint(Constraint constraint, Constraint constraint2) {
            super(constraint, constraint2);
        }

        @Override // com.ibm.icu.text.PluralRules.Constraint
        public boolean isFulfilled(TaskDescription taskDescription) {
            return this.f1037a.isFulfilled(taskDescription) || this.b.isFulfilled(taskDescription);
        }

        @Override // com.ibm.icu.text.PluralRules.Constraint
        public boolean isLimited(SampleType sampleType) {
            return this.f1037a.isLimited(sampleType) && this.b.isLimited(sampleType);
        }

        public String toString() {
            return this.f1037a.toString() + " or " + this.b.toString();
        }
    }

    public static class Rule implements Serializable {
        private static final long serialVersionUID = 1;
        private final Constraint constraint;
        private final Application decimalSamples;
        private final Application integerSamples;
        private final String keyword;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getKeyword() {
            return this.keyword;
        }

        public Rule(String str, Constraint constraint, Application application, Application application2) {
            this.keyword = str;
            this.constraint = constraint;
            this.integerSamples = application;
            this.decimalSamples = application2;
        }

        public Rule and(Constraint constraint) {
            return new Rule(this.keyword, new AndConstraint(this.constraint, constraint), this.integerSamples, this.decimalSamples);
        }

        public Rule or(Constraint constraint) {
            return new Rule(this.keyword, new OrConstraint(this.constraint, constraint), this.integerSamples, this.decimalSamples);
        }

        public boolean appliesTo(TaskDescription taskDescription) {
            return this.constraint.isFulfilled(taskDescription);
        }

        public boolean isLimited(SampleType sampleType) {
            return this.constraint.isLimited(sampleType);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.keyword);
            sb.append(": ");
            sb.append(this.constraint.toString());
            String str2 = "";
            if (this.integerSamples == null) {
                str = "";
            } else {
                str = " " + this.integerSamples.toString();
            }
            sb.append(str);
            if (this.decimalSamples != null) {
                str2 = " " + this.decimalSamples.toString();
            }
            sb.append(str2);
            return sb.toString();
        }

        public int hashCode() {
            return this.keyword.hashCode() ^ this.constraint.hashCode();
        }

        public String getConstraint() {
            return this.constraint.toString();
        }
    }

    public static class RuleList implements Serializable {
        private static final long serialVersionUID = 1;
        private boolean hasExplicitBoundingInfo;
        private final List<Rule> rules;

        private RuleList() {
            this.hasExplicitBoundingInfo = false;
            this.rules = new ArrayList();
        }

        public RuleList addRule(Rule rule) {
            String keyword = rule.getKeyword();
            Iterator<Rule> it = this.rules.iterator();
            while (it.hasNext()) {
                if (keyword.equals(it.next().getKeyword())) {
                    throw new IllegalArgumentException("Duplicate keyword: " + keyword);
                }
            }
            this.rules.add(rule);
            return this;
        }

        public RuleList finish() throws ParseException {
            Iterator<Rule> it = this.rules.iterator();
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                if ("other".equals(next.getKeyword())) {
                    it.remove();
                    rule = next;
                }
            }
            if (rule == null) {
                rule = PluralRules.parseRule("other:");
            }
            this.rules.add(rule);
            return this;
        }

        private Rule selectRule(TaskDescription taskDescription) {
            for (Rule rule : this.rules) {
                if (rule.appliesTo(taskDescription)) {
                    return rule;
                }
            }
            return null;
        }

        public String select(TaskDescription taskDescription) {
            return (taskDescription.isInfinite() || taskDescription.isNaN()) ? "other" : selectRule(taskDescription).getKeyword();
        }

        public Set<String> getKeywords() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<Rule> it = this.rules.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(it.next().getKeyword());
            }
            return linkedHashSet;
        }

        public boolean isLimited(String str, SampleType sampleType) {
            if (this.hasExplicitBoundingInfo) {
                Application decimalSamples = getDecimalSamples(str, sampleType);
                if (decimalSamples == null) {
                    return true;
                }
                return decimalSamples.AEQbTJ;
            }
            return computeLimited(str, sampleType);
        }

        public boolean computeLimited(String str, SampleType sampleType) {
            boolean z = false;
            for (Rule rule : this.rules) {
                if (str.equals(rule.getKeyword())) {
                    if (!rule.isLimited(sampleType)) {
                        return false;
                    }
                    z = true;
                }
            }
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Rule rule : this.rules) {
                if (sb.length() != 0) {
                    sb.append(PluralRules.CATEGORY_SEPARATOR);
                }
                sb.append(rule);
            }
            return sb.toString();
        }

        public String getRules(String str) {
            for (Rule rule : this.rules) {
                if (rule.getKeyword().equals(str)) {
                    return rule.getConstraint();
                }
            }
            return null;
        }

        public boolean select(TaskDescription taskDescription, String str) {
            for (Rule rule : this.rules) {
                if (rule.getKeyword().equals(str) && rule.appliesTo(taskDescription)) {
                    return true;
                }
            }
            return false;
        }

        public Application getDecimalSamples(String str, SampleType sampleType) {
            for (Rule rule : this.rules) {
                if (rule.getKeyword().equals(str)) {
                    return sampleType == SampleType.INTEGER ? rule.integerSamples : rule.decimalSamples;
                }
            }
            return null;
        }
    }

    private boolean addConditional(Set<TaskDescription> set, Set<TaskDescription> set2, double d) {
        FixedDecimal fixedDecimal = new FixedDecimal(d);
        if (set.contains(fixedDecimal) || set2.contains(fixedDecimal)) {
            return false;
        }
        set2.add(fixedDecimal);
        return true;
    }

    public static PluralRules forLocale(ULocale uLocale) {
        return Activity.EZpvd().copydefault(uLocale, PluralType.CARDINAL);
    }

    public static PluralRules forLocale(Locale locale) {
        return forLocale(ULocale.forLocale(locale));
    }

    public static PluralRules forLocale(ULocale uLocale, PluralType pluralType) {
        return Activity.EZpvd().copydefault(uLocale, pluralType);
    }

    public static PluralRules forLocale(Locale locale, PluralType pluralType) {
        return forLocale(ULocale.forLocale(locale), pluralType);
    }

    private static boolean isValidKeyword(String str) {
        return ALLOWED_ID.EZpvd(str);
    }

    private PluralRules(RuleList ruleList, C7158aeZ c7158aeZ) {
        this.rules = ruleList;
        this.keywords = Collections.unmodifiableSet(ruleList.getKeywords());
        this.standardPluralRanges = c7158aeZ;
    }

    public int hashCode() {
        return this.rules.hashCode();
    }

    public String select(double d) {
        return this.rules.select(new FixedDecimal(d));
    }

    public String select(C7225afn c7225afn) {
        return this.rules.select(c7225afn.EZpvd());
    }

    public String select(C7227afp c7227afp) {
        if (this.standardPluralRanges == null) {
            throw new UnsupportedOperationException("Plural ranges are unavailable on this instance");
        }
        return this.standardPluralRanges.OLrzqt(StandardPlural.fromString(select(c7227afp.copydefault())), StandardPlural.fromString(select(c7227afp.EZpvd()))).getKeyword();
    }

    @Deprecated
    public String select(double d, int i, long j) {
        return this.rules.select(new FixedDecimal(d, i, j));
    }

    @Deprecated
    public String select(TaskDescription taskDescription) {
        return this.rules.select(taskDescription);
    }

    @Deprecated
    public boolean matches(FixedDecimal fixedDecimal, String str) {
        return this.rules.select(fixedDecimal, str);
    }

    public double getUniqueKeywordValue(String str) {
        Collection<Double> allKeywordValues = getAllKeywordValues(str);
        if (allKeywordValues == null || allKeywordValues.size() != 1) {
            return -0.00123456777d;
        }
        return allKeywordValues.iterator().next().doubleValue();
    }

    public Collection<Double> getAllKeywordValues(String str) {
        return getAllKeywordValues(str, SampleType.INTEGER);
    }

    @Deprecated
    public Collection<Double> getAllKeywordValues(String str, SampleType sampleType) {
        Collection<Double> samples;
        if (isLimited(str, sampleType) && (samples = getSamples(str, sampleType)) != null) {
            return Collections.unmodifiableCollection(samples);
        }
        return null;
    }

    public Collection<Double> getSamples(String str) {
        return getSamples(str, SampleType.INTEGER);
    }

    @Deprecated
    public Collection<Double> getSamples(String str, SampleType sampleType) {
        if (!this.keywords.contains(str)) {
            return null;
        }
        TreeSet treeSet = new TreeSet();
        if (this.rules.hasExplicitBoundingInfo) {
            Application decimalSamples = this.rules.getDecimalSamples(str, sampleType);
            if (decimalSamples == null) {
                return Collections.unmodifiableSet(treeSet);
            }
            return Collections.unmodifiableSet(decimalSamples.copydefault(treeSet));
        }
        int i = isLimited(str, sampleType) ? Integer.MAX_VALUE : 20;
        int i2 = AnonymousClass3.OLrzqt[sampleType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            while (i3 < 200 && addSample(str, Integer.valueOf(i3), i, treeSet)) {
                i3++;
            }
            addSample(str, 1000000, i, treeSet);
        } else if (i2 == 2) {
            while (i3 < 2000 && addSample(str, new FixedDecimal(((double) i3) / 10.0d, 1), i, treeSet)) {
                i3++;
            }
            addSample(str, new FixedDecimal(1000000.0d, 1), i, treeSet);
        }
        if (treeSet.size() == 0) {
            return null;
        }
        return Collections.unmodifiableSet(treeSet);
    }

    private boolean addSample(String str, Number number, int i, Set<Double> set) {
        if ((number instanceof FixedDecimal ? select((FixedDecimal) number) : select(number.doubleValue())).equals(str)) {
            set.add(Double.valueOf(number.doubleValue()));
            if (i - 1 < 0) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public Application getDecimalSamples(String str, SampleType sampleType) {
        return this.rules.getDecimalSamples(str, sampleType);
    }

    public static ULocale[] getAvailableULocales() {
        return Activity.EZpvd().AEQbTJ();
    }

    public static ULocale getFunctionalEquivalent(ULocale uLocale, boolean[] zArr) {
        return Activity.EZpvd().EZpvd(uLocale, zArr);
    }

    public String toString() {
        return this.rules.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof PluralRules) && equals((PluralRules) obj);
    }

    public boolean equals(PluralRules pluralRules) {
        return pluralRules != null && toString().equals(pluralRules.toString());
    }

    public KeywordStatus getKeywordStatus(String str, int i, Set<Double> set, C7255agQ<Double> c7255agQ) {
        return getKeywordStatus(str, i, set, c7255agQ, SampleType.INTEGER);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.lang.Object] */
    @Deprecated
    public KeywordStatus getKeywordStatus(String str, int i, Set<Double> set, C7255agQ<Double> c7255agQ, SampleType sampleType) {
        if (c7255agQ != null) {
            c7255agQ.copydefault = null;
        }
        if (!this.keywords.contains(str)) {
            return KeywordStatus.INVALID;
        }
        if (!isLimited(str, sampleType)) {
            return KeywordStatus.UNBOUNDED;
        }
        Collection<Double> samples = getSamples(str, sampleType);
        int size = samples.size();
        if (set == null) {
            set = Collections.emptySet();
        }
        if (size > set.size()) {
            if (size == 1) {
                if (c7255agQ != null) {
                    c7255agQ.copydefault = samples.iterator().next();
                }
                return KeywordStatus.UNIQUE;
            }
            return KeywordStatus.BOUNDED;
        }
        HashSet hashSet = new HashSet(samples);
        Iterator<Double> it = set.iterator();
        while (it.hasNext()) {
            hashSet.remove(Double.valueOf(it.next().doubleValue() - ((double) i)));
        }
        if (hashSet.size() == 0) {
            return KeywordStatus.SUPPRESSED;
        }
        if (c7255agQ != null && hashSet.size() == 1) {
            c7255agQ.copydefault = hashSet.iterator().next();
        }
        return size == 1 ? KeywordStatus.UNIQUE : KeywordStatus.BOUNDED;
    }

    @Deprecated
    public String getRules(String str) {
        return this.rules.getRules(str);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        throw new NotSerializableException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new NotSerializableException();
    }

    private Object writeReplace() throws ObjectStreamException {
        return new PluralRulesSerialProxy(toString());
    }

    @Deprecated
    public int compareTo(PluralRules pluralRules) {
        return toString().compareTo(pluralRules.toString());
    }

    public Boolean isLimited(String str) {
        return Boolean.valueOf(this.rules.isLimited(str, SampleType.INTEGER));
    }

    @Deprecated
    public boolean isLimited(String str, SampleType sampleType) {
        return this.rules.isLimited(str, sampleType);
    }

    @Deprecated
    public boolean computeLimited(String str, SampleType sampleType) {
        return this.rules.computeLimited(str, sampleType);
    }
}
