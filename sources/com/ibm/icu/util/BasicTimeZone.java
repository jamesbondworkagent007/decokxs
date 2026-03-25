package com.ibm.icu.util;

import java.util.BitSet;
import java.util.Date;
import java.util.LinkedList;
import o.C7019abT;
import o.C7261agW;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicTimeZone extends TimeZone {

    @Deprecated
    protected static final int FORMER_LATTER_MASK = 12;

    @Deprecated
    public static final int LOCAL_DST = 3;

    @Deprecated
    public static final int LOCAL_FORMER = 4;

    @Deprecated
    public static final int LOCAL_LATTER = 12;

    @Deprecated
    public static final int LOCAL_STD = 1;
    private static final long MILLIS_PER_YEAR = 31536000000L;

    @Deprecated
    protected static final int STD_DST_MASK = 3;
    private static final long serialVersionUID = -3204278532246180932L;

    public abstract C7261agW getNextTransition(long j, boolean z);

    public abstract C7261agW getPreviousTransition(long j, boolean z);

    public abstract TimeZoneRule[] getTimeZoneRules();

    public boolean hasEquivalentTransitions(TimeZone timeZone, long j, long j2) {
        return hasEquivalentTransitions(timeZone, j, j2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x015d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasEquivalentTransitions(TimeZone timeZone, long j, long j2, boolean z) {
        if (this == timeZone) {
            return true;
        }
        if (!(timeZone instanceof BasicTimeZone)) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getOffset(j, false, iArr);
        timeZone.getOffset(j, false, iArr2);
        if (!z) {
            if (iArr[0] == iArr2[0] && iArr[1] == iArr2[1]) {
            }
            return false;
        }
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        if (i + i2 != i3 + i4 || ((i2 != 0 && i4 == 0) || (i2 == 0 && i4 != 0))) {
            return false;
        }
        while (true) {
            C7261agW nextTransition = getNextTransition(j, false);
            BasicTimeZone basicTimeZone = (BasicTimeZone) timeZone;
            C7261agW nextTransition2 = basicTimeZone.getNextTransition(j, false);
            if (z) {
                while (nextTransition != null && nextTransition.KWHzl() <= j2 && nextTransition.EZpvd().getRawOffset() + nextTransition.EZpvd().getDSTSavings() == nextTransition.OLrzqt().getRawOffset() + nextTransition.OLrzqt().getDSTSavings() && nextTransition.EZpvd().getDSTSavings() != 0 && nextTransition.OLrzqt().getDSTSavings() != 0) {
                    nextTransition = getNextTransition(nextTransition.KWHzl(), false);
                }
                while (nextTransition2 != null && nextTransition2.KWHzl() <= j2 && nextTransition2.EZpvd().getRawOffset() + nextTransition2.EZpvd().getDSTSavings() == nextTransition2.OLrzqt().getRawOffset() + nextTransition2.OLrzqt().getDSTSavings() && nextTransition2.EZpvd().getDSTSavings() != 0 && nextTransition2.OLrzqt().getDSTSavings() != 0) {
                    nextTransition2 = basicTimeZone.getNextTransition(nextTransition2.KWHzl(), false);
                }
            }
            boolean z2 = nextTransition != null && nextTransition.KWHzl() <= j2;
            boolean z3 = nextTransition2 != null && nextTransition2.KWHzl() <= j2;
            if (!z2 && !z3) {
                return true;
            }
            if (!z2 || !z3 || nextTransition.KWHzl() != nextTransition2.KWHzl()) {
                return false;
            }
            if (z) {
                if (nextTransition.OLrzqt().getRawOffset() + nextTransition.OLrzqt().getDSTSavings() != nextTransition2.OLrzqt().getRawOffset() + nextTransition2.OLrzqt().getDSTSavings() || ((nextTransition.OLrzqt().getDSTSavings() != 0 && nextTransition2.OLrzqt().getDSTSavings() == 0) || (nextTransition.OLrzqt().getDSTSavings() == 0 && nextTransition2.OLrzqt().getDSTSavings() != 0))) {
                    break;
                }
            } else if (nextTransition.OLrzqt().getRawOffset() != nextTransition2.OLrzqt().getRawOffset() || nextTransition.OLrzqt().getDSTSavings() != nextTransition2.OLrzqt().getDSTSavings()) {
                break;
            }
            j = nextTransition.KWHzl();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        return (com.ibm.icu.util.TimeZoneRule[]) r12.toArray(new com.ibm.icu.util.TimeZoneRule[r12.size()]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TimeZoneRule[] getTimeZoneRules(long j) {
        boolean z;
        BitSet bitSet;
        boolean z2;
        BitSet bitSet2;
        C7261agW nextTransition;
        BasicTimeZone basicTimeZone = this;
        TimeZoneRule[] timeZoneRules = getTimeZoneRules();
        int i = 1;
        C7261agW previousTransition = basicTimeZone.getPreviousTransition(j, true);
        if (previousTransition == null) {
            return timeZoneRules;
        }
        BitSet bitSet3 = new BitSet(timeZoneRules.length);
        LinkedList linkedList = new LinkedList();
        InitialTimeZoneRule initialTimeZoneRule = new InitialTimeZoneRule(previousTransition.OLrzqt().getName(), previousTransition.OLrzqt().getRawOffset(), previousTransition.OLrzqt().getDSTSavings());
        linkedList.add(initialTimeZoneRule);
        boolean z3 = false;
        bitSet3.set(0);
        for (int i2 = 1; i2 < timeZoneRules.length; i2++) {
            if (timeZoneRules[i2].getNextStart(j, initialTimeZoneRule.getRawOffset(), initialTimeZoneRule.getDSTSavings(), false) == null) {
                bitSet3.set(i2);
            }
        }
        long j2 = j;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            if (z4 && z5) {
                break;
            }
            C7261agW nextTransition2 = basicTimeZone.getNextTransition(j2, z3);
            if (nextTransition2 == null) {
                break;
            }
            long jKWHzl = nextTransition2.KWHzl();
            TimeZoneRule timeZoneRuleOLrzqt = nextTransition2.OLrzqt();
            int i3 = i;
            while (i3 < timeZoneRules.length && !timeZoneRules[i3].equals(timeZoneRuleOLrzqt)) {
                i3++;
            }
            if (i3 >= timeZoneRules.length) {
                throw new IllegalStateException("The rule was not found");
            }
            if (bitSet3.get(i3)) {
                j2 = jKWHzl;
            } else {
                if (timeZoneRuleOLrzqt instanceof TimeArrayTimeZoneRule) {
                    TimeArrayTimeZoneRule timeArrayTimeZoneRule = (TimeArrayTimeZoneRule) timeZoneRuleOLrzqt;
                    bitSet = bitSet3;
                    long jKWHzl2 = j;
                    while (true) {
                        nextTransition = basicTimeZone.getNextTransition(jKWHzl2, z3);
                        if (nextTransition == null || nextTransition.OLrzqt().equals(timeArrayTimeZoneRule)) {
                            break;
                        }
                        jKWHzl2 = nextTransition.KWHzl();
                        basicTimeZone = this;
                        z3 = false;
                    }
                    if (nextTransition == null) {
                        z = z4;
                    } else if (timeArrayTimeZoneRule.getFirstStart(nextTransition.EZpvd().getRawOffset(), nextTransition.EZpvd().getDSTSavings()).getTime() > j) {
                        linkedList.add(timeArrayTimeZoneRule);
                        z = z4;
                    } else {
                        long[] startTimes = timeArrayTimeZoneRule.getStartTimes();
                        int timeType = timeArrayTimeZoneRule.getTimeType();
                        ?? r11 = z3;
                        while (true) {
                            if (r11 >= startTimes.length) {
                                z = z4;
                                break;
                            }
                            long dSTSavings = startTimes[r11];
                            if (timeType == 1) {
                                z = z4;
                                dSTSavings -= (long) nextTransition.EZpvd().getRawOffset();
                            } else {
                                z = z4;
                            }
                            if (timeType == 0) {
                                dSTSavings -= (long) nextTransition.EZpvd().getDSTSavings();
                            }
                            if (dSTSavings > j) {
                                break;
                            }
                            z4 = z;
                            r11++;
                        }
                        int length = startTimes.length - r11;
                        if (length > 0) {
                            long[] jArr = new long[length];
                            System.arraycopy(startTimes, r11, jArr, 0, length);
                            linkedList.add(new TimeArrayTimeZoneRule(timeArrayTimeZoneRule.getName(), timeArrayTimeZoneRule.getRawOffset(), timeArrayTimeZoneRule.getDSTSavings(), jArr, timeArrayTimeZoneRule.getTimeType()));
                        }
                    }
                } else {
                    z = z4;
                    bitSet = bitSet3;
                    if (timeZoneRuleOLrzqt instanceof AnnualTimeZoneRule) {
                        AnnualTimeZoneRule annualTimeZoneRule = (AnnualTimeZoneRule) timeZoneRuleOLrzqt;
                        if (annualTimeZoneRule.getFirstStart(nextTransition2.EZpvd().getRawOffset(), nextTransition2.EZpvd().getDSTSavings()).getTime() == nextTransition2.KWHzl()) {
                            linkedList.add(annualTimeZoneRule);
                            z2 = false;
                        } else {
                            int[] iArr = new int[6];
                            C7019abT.KWHzl(nextTransition2.KWHzl(), iArr);
                            z2 = false;
                            linkedList.add(new AnnualTimeZoneRule(annualTimeZoneRule.getName(), annualTimeZoneRule.getRawOffset(), annualTimeZoneRule.getDSTSavings(), annualTimeZoneRule.getRule(), iArr[0], annualTimeZoneRule.getEndYear()));
                        }
                        if (annualTimeZoneRule.getEndYear() == Integer.MAX_VALUE) {
                            if (annualTimeZoneRule.getDSTSavings() == 0) {
                                bitSet2 = bitSet;
                                z4 = true;
                            } else {
                                z4 = z;
                                bitSet2 = bitSet;
                                z5 = true;
                            }
                        }
                        bitSet2.set(i3);
                        bitSet3 = bitSet2;
                        z3 = z2;
                        j2 = jKWHzl;
                        i = 1;
                        basicTimeZone = this;
                    }
                    z4 = z;
                    bitSet2 = bitSet;
                    bitSet2.set(i3);
                    bitSet3 = bitSet2;
                    z3 = z2;
                    j2 = jKWHzl;
                    i = 1;
                    basicTimeZone = this;
                }
                z2 = false;
                z4 = z;
                bitSet2 = bitSet;
                bitSet2.set(i3);
                bitSet3 = bitSet2;
                z3 = z2;
                j2 = jKWHzl;
                i = 1;
                basicTimeZone = this;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TimeZoneRule[] getSimpleTimeZoneRulesNear(long j) {
        char c;
        InitialTimeZoneRule initialTimeZoneRule;
        int i;
        AnnualTimeZoneRule[] annualTimeZoneRuleArr;
        int i2;
        int i3;
        String str;
        int dSTSavings;
        int rawOffset;
        String name;
        long j2;
        AnnualTimeZoneRule[] annualTimeZoneRuleArr2;
        C7261agW nextTransition;
        C7261agW nextTransition2 = getNextTransition(j, false);
        if (nextTransition2 != null) {
            String name2 = nextTransition2.EZpvd().getName();
            int rawOffset2 = nextTransition2.EZpvd().getRawOffset();
            int dSTSavings2 = nextTransition2.EZpvd().getDSTSavings();
            long jKWHzl = nextTransition2.KWHzl();
            if (((nextTransition2.EZpvd().getDSTSavings() != 0 || nextTransition2.OLrzqt().getDSTSavings() == 0) && (nextTransition2.EZpvd().getDSTSavings() == 0 || nextTransition2.OLrzqt().getDSTSavings() != 0)) || j + MILLIS_PER_YEAR <= jKWHzl) {
                i2 = dSTSavings2;
                i3 = rawOffset2;
                str = name2;
            } else {
                AnnualTimeZoneRule[] annualTimeZoneRuleArr3 = new AnnualTimeZoneRule[2];
                str = name2;
                int[] iArrKWHzl = C7019abT.KWHzl(((long) nextTransition2.EZpvd().getRawOffset()) + jKWHzl + ((long) nextTransition2.EZpvd().getDSTSavings()), null);
                annualTimeZoneRuleArr3[0] = new AnnualTimeZoneRule(nextTransition2.OLrzqt().getName(), rawOffset2, nextTransition2.OLrzqt().getDSTSavings(), new DateTimeRule(iArrKWHzl[1], C7019abT.OLrzqt(iArrKWHzl[0], iArrKWHzl[1], iArrKWHzl[2]), iArrKWHzl[3], iArrKWHzl[5], 0), iArrKWHzl[0], Integer.MAX_VALUE);
                if (nextTransition2.OLrzqt().getRawOffset() != rawOffset2 || (nextTransition = getNextTransition(jKWHzl, false)) == null || (((nextTransition.EZpvd().getDSTSavings() != 0 || nextTransition.OLrzqt().getDSTSavings() == 0) && (nextTransition.EZpvd().getDSTSavings() == 0 || nextTransition.OLrzqt().getDSTSavings() != 0)) || jKWHzl + MILLIS_PER_YEAR <= nextTransition.KWHzl())) {
                    j2 = jKWHzl;
                    annualTimeZoneRuleArr2 = annualTimeZoneRuleArr3;
                    i2 = dSTSavings2;
                    i3 = rawOffset2;
                } else {
                    iArrKWHzl = C7019abT.KWHzl(nextTransition.KWHzl() + ((long) nextTransition.EZpvd().getRawOffset()) + ((long) nextTransition.EZpvd().getDSTSavings()), iArrKWHzl);
                    AnnualTimeZoneRule annualTimeZoneRule = new AnnualTimeZoneRule(nextTransition.OLrzqt().getName(), nextTransition.OLrzqt().getRawOffset(), nextTransition.OLrzqt().getDSTSavings(), new DateTimeRule(iArrKWHzl[1], C7019abT.OLrzqt(iArrKWHzl[0], iArrKWHzl[1], iArrKWHzl[2]), iArrKWHzl[3], iArrKWHzl[5], 0), iArrKWHzl[0] - 1, Integer.MAX_VALUE);
                    int rawOffset3 = nextTransition.EZpvd().getRawOffset();
                    int dSTSavings3 = nextTransition.EZpvd().getDSTSavings();
                    j2 = jKWHzl;
                    annualTimeZoneRuleArr2 = annualTimeZoneRuleArr3;
                    i2 = dSTSavings2;
                    i3 = rawOffset2;
                    Date previousStart = annualTimeZoneRule.getPreviousStart(j, rawOffset3, dSTSavings3, true);
                    if (previousStart != null && previousStart.getTime() <= j && i3 == nextTransition.OLrzqt().getRawOffset() && i2 == nextTransition.OLrzqt().getDSTSavings()) {
                        annualTimeZoneRuleArr2[1] = annualTimeZoneRule;
                    }
                }
                char c2 = 1;
                if (annualTimeZoneRuleArr2[1] == null) {
                    C7261agW previousTransition = getPreviousTransition(j, true);
                    if (previousTransition == null || ((previousTransition.EZpvd().getDSTSavings() != 0 || previousTransition.OLrzqt().getDSTSavings() == 0) && (previousTransition.EZpvd().getDSTSavings() == 0 || previousTransition.OLrzqt().getDSTSavings() != 0))) {
                        c2 = 1;
                    } else {
                        int[] iArrKWHzl2 = C7019abT.KWHzl(previousTransition.KWHzl() + ((long) previousTransition.EZpvd().getRawOffset()) + ((long) previousTransition.EZpvd().getDSTSavings()), iArrKWHzl);
                        AnnualTimeZoneRule annualTimeZoneRule2 = new AnnualTimeZoneRule(previousTransition.OLrzqt().getName(), i3, i2, new DateTimeRule(iArrKWHzl2[1], C7019abT.OLrzqt(iArrKWHzl2[0], iArrKWHzl2[1], iArrKWHzl2[2]), iArrKWHzl2[3], iArrKWHzl2[5], 0), annualTimeZoneRuleArr2[0].getStartYear() - 1, Integer.MAX_VALUE);
                        if (annualTimeZoneRule2.getNextStart(j, previousTransition.EZpvd().getRawOffset(), previousTransition.EZpvd().getDSTSavings(), false).getTime() > j2) {
                            c2 = 1;
                            annualTimeZoneRuleArr2[1] = annualTimeZoneRule2;
                        }
                    }
                }
                if (annualTimeZoneRuleArr2[c2] != null) {
                    name = annualTimeZoneRuleArr2[0].getName();
                    rawOffset = annualTimeZoneRuleArr2[0].getRawOffset();
                    dSTSavings = annualTimeZoneRuleArr2[0].getDSTSavings();
                    annualTimeZoneRuleArr = annualTimeZoneRuleArr2;
                }
                initialTimeZoneRule = new InitialTimeZoneRule(name, rawOffset, dSTSavings);
                c = 0;
                i = 1;
            }
            dSTSavings = i2;
            rawOffset = i3;
            name = str;
            annualTimeZoneRuleArr = null;
            initialTimeZoneRule = new InitialTimeZoneRule(name, rawOffset, dSTSavings);
            c = 0;
            i = 1;
        } else {
            C7261agW previousTransition2 = getPreviousTransition(j, true);
            if (previousTransition2 != null) {
                initialTimeZoneRule = new InitialTimeZoneRule(previousTransition2.OLrzqt().getName(), previousTransition2.OLrzqt().getRawOffset(), previousTransition2.OLrzqt().getDSTSavings());
                c = 0;
                i = 1;
            } else {
                int[] iArr = new int[2];
                c = 0;
                getOffset(j, false, iArr);
                i = 1;
                initialTimeZoneRule = new InitialTimeZoneRule(getID(), iArr[0], iArr[1]);
            }
            annualTimeZoneRuleArr = null;
        }
        if (annualTimeZoneRuleArr == null) {
            TimeZoneRule[] timeZoneRuleArr = new TimeZoneRule[i];
            timeZoneRuleArr[c] = initialTimeZoneRule;
            return timeZoneRuleArr;
        }
        TimeZoneRule[] timeZoneRuleArr2 = new TimeZoneRule[3];
        timeZoneRuleArr2[c] = initialTimeZoneRule;
        timeZoneRuleArr2[i] = annualTimeZoneRuleArr[c];
        timeZoneRuleArr2[2] = annualTimeZoneRuleArr[i];
        return timeZoneRuleArr2;
    }

    @Deprecated
    public void getOffsetFromLocal(long j, int i, int i2, int[] iArr) {
        throw new IllegalStateException("Not implemented");
    }

    public BasicTimeZone() {
    }

    @Deprecated
    public BasicTimeZone(String str) {
        super(str);
    }
}
