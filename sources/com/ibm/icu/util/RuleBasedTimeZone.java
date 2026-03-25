package com.ibm.icu.util;

import androidx.compose.material3.CalendarModelKt;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o.C7019abT;
import o.C7261agW;

/* JADX INFO: loaded from: classes3.dex */
public class RuleBasedTimeZone extends BasicTimeZone {
    private static final long serialVersionUID = 7580833058949327935L;
    private AnnualTimeZoneRule[] finalRules;
    private List<TimeZoneRule> historicRules;
    private transient List<C7261agW> historicTransitions;
    private final InitialTimeZoneRule initialRule;
    private volatile transient boolean isFrozen;
    private transient boolean upToDate;

    private static int getLocalDelta(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + i2;
        int i8 = i3 + i4;
        boolean z = false;
        boolean z2 = i2 != 0 && i4 == 0;
        if (i2 == 0 && i4 != 0) {
            z = true;
        }
        if (i8 - i7 >= 0) {
            int i9 = i5 & 3;
            if (i9 == 1 && z2) {
                return i7;
            }
            if (i9 == 3 && z) {
                return i7;
            }
            if ((i9 != 1 || !z) && ((i9 != 3 || !z2) && (i5 & 12) == 12)) {
                return i7;
            }
        } else {
            int i10 = i6 & 3;
            if ((i10 != 1 || !z2) && (i10 != 3 || !z)) {
                if (i10 == 1 && z) {
                    return i7;
                }
                if ((i10 == 3 && z2) || (i6 & 12) == 4) {
                    return i7;
                }
            }
        }
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public boolean isFrozen() {
        return this.isFrozen;
    }

    public RuleBasedTimeZone(String str, InitialTimeZoneRule initialTimeZoneRule) {
        super(str);
        this.isFrozen = false;
        this.initialRule = initialTimeZoneRule;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addTransitionRule(TimeZoneRule timeZoneRule) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen RuleBasedTimeZone instance.");
        }
        if (!timeZoneRule.isTransitionRule()) {
            throw new IllegalArgumentException("Rule must be a transition rule");
        }
        if (timeZoneRule instanceof AnnualTimeZoneRule) {
            AnnualTimeZoneRule annualTimeZoneRule = (AnnualTimeZoneRule) timeZoneRule;
            if (annualTimeZoneRule.getEndYear() == Integer.MAX_VALUE) {
                AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
                if (annualTimeZoneRuleArr == null) {
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = new AnnualTimeZoneRule[2];
                    this.finalRules = annualTimeZoneRuleArr2;
                    annualTimeZoneRuleArr2[0] = annualTimeZoneRule;
                } else if (annualTimeZoneRuleArr[1] == null) {
                    annualTimeZoneRuleArr[1] = annualTimeZoneRule;
                } else {
                    throw new IllegalStateException("Too many final rules");
                }
            } else {
                if (this.historicRules == null) {
                    this.historicRules = new ArrayList();
                }
                this.historicRules.add(timeZoneRule);
            }
        }
        this.upToDate = false;
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 0) {
            i2 = 1 - i2;
        }
        int[] iArr = new int[2];
        getOffset((C7019abT.copydefault(i2, i3, i4) * CalendarModelKt.MillisecondsIn24Hours) + ((long) i6), true, 3, 1, iArr);
        return iArr[0] + iArr[1];
    }

    @Override // com.ibm.icu.util.TimeZone
    public void getOffset(long j, boolean z, int[] iArr) {
        getOffset(j, z, 4, 12, iArr);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    @Deprecated
    public void getOffsetFromLocal(long j, int i, int i2, int[] iArr) {
        getOffset(j, true, i, i2, iArr);
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getRawOffset() {
        int[] iArr = new int[2];
        getOffset(System.currentTimeMillis(), false, iArr);
        return iArr[0];
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean inDaylightTime(Date date) {
        int[] iArr = new int[2];
        getOffset(date.getTime(), false, iArr);
        return iArr[1] != 0;
    }

    @Override // com.ibm.icu.util.TimeZone
    public void setRawOffset(int i) {
        throw new UnsupportedOperationException("setRawOffset in RuleBasedTimeZone is not supported.");
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean useDaylightTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArr = new int[2];
        getOffset(jCurrentTimeMillis, false, iArr);
        if (iArr[1] != 0) {
            return true;
        }
        C7261agW nextTransition = getNextTransition(jCurrentTimeMillis, false);
        return (nextTransition == null || nextTransition.OLrzqt().getDSTSavings() == 0) ? false : true;
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean observesDaylightTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int[] iArr = new int[2];
        getOffset(jCurrentTimeMillis, false, iArr);
        if (iArr[1] != 0) {
            return true;
        }
        BitSet bitSet = this.finalRules == null ? null : new BitSet(this.finalRules.length);
        while (true) {
            C7261agW nextTransition = getNextTransition(jCurrentTimeMillis, false);
            if (nextTransition == null) {
                break;
            }
            TimeZoneRule timeZoneRuleOLrzqt = nextTransition.OLrzqt();
            if (timeZoneRuleOLrzqt.getDSTSavings() != 0) {
                return true;
            }
            if (bitSet != null) {
                int i = 0;
                while (true) {
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
                    if (i >= annualTimeZoneRuleArr.length) {
                        break;
                    }
                    if (annualTimeZoneRuleArr[i].equals(timeZoneRuleOLrzqt)) {
                        bitSet.set(i);
                    }
                    i++;
                }
                if (bitSet.cardinality() == this.finalRules.length) {
                    break;
                }
            }
            jCurrentTimeMillis = nextTransition.KWHzl();
        }
        return false;
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean hasSameRules(TimeZone timeZone) {
        AnnualTimeZoneRule annualTimeZoneRule;
        if (this == timeZone) {
            return true;
        }
        if (!(timeZone instanceof RuleBasedTimeZone)) {
            return false;
        }
        RuleBasedTimeZone ruleBasedTimeZone = (RuleBasedTimeZone) timeZone;
        if (!this.initialRule.isEquivalentTo(ruleBasedTimeZone.initialRule)) {
            return false;
        }
        AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
        if (annualTimeZoneRuleArr == null || ruleBasedTimeZone.finalRules == null) {
            if (annualTimeZoneRuleArr == null && ruleBasedTimeZone.finalRules == null) {
            }
            return false;
        }
        int i = 0;
        while (true) {
            AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = this.finalRules;
            if (i >= annualTimeZoneRuleArr2.length) {
                break;
            }
            AnnualTimeZoneRule annualTimeZoneRule2 = annualTimeZoneRuleArr2[i];
            if (!(annualTimeZoneRule2 == null && ruleBasedTimeZone.finalRules[i] == null) && (annualTimeZoneRule2 == null || (annualTimeZoneRule = ruleBasedTimeZone.finalRules[i]) == null || !annualTimeZoneRule2.isEquivalentTo(annualTimeZoneRule))) {
                break;
            }
            i++;
        }
        return false;
        List<TimeZoneRule> list = this.historicRules;
        if (list != null && ruleBasedTimeZone.historicRules != null) {
            if (list.size() != ruleBasedTimeZone.historicRules.size()) {
                return false;
            }
            for (TimeZoneRule timeZoneRule : this.historicRules) {
                Iterator<TimeZoneRule> it = ruleBasedTimeZone.historicRules.iterator();
                while (it.hasNext()) {
                    if (timeZoneRule.isEquivalentTo(it.next())) {
                        break;
                    }
                }
                return false;
            }
        }
        if (list != null || ruleBasedTimeZone.historicRules != null) {
            return false;
        }
        return true;
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public TimeZoneRule[] getTimeZoneRules() {
        int i;
        List<TimeZoneRule> list = this.historicRules;
        int size = list != null ? list.size() + 1 : 1;
        AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
        if (annualTimeZoneRuleArr != null) {
            size = annualTimeZoneRuleArr[1] != null ? size + 2 : size + 1;
        }
        TimeZoneRule[] timeZoneRuleArr = new TimeZoneRule[size];
        timeZoneRuleArr[0] = this.initialRule;
        if (this.historicRules != null) {
            i = 1;
            while (i < this.historicRules.size() + 1) {
                timeZoneRuleArr[i] = this.historicRules.get(i - 1);
                i++;
            }
        } else {
            i = 1;
        }
        AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = this.finalRules;
        if (annualTimeZoneRuleArr2 != null) {
            timeZoneRuleArr[i] = annualTimeZoneRuleArr2[0];
            AnnualTimeZoneRule annualTimeZoneRule = annualTimeZoneRuleArr2[1];
            if (annualTimeZoneRule != null) {
                timeZoneRuleArr[i + 1] = annualTimeZoneRule;
            }
        }
        return timeZoneRuleArr;
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getNextTransition(long j, boolean z) {
        C7261agW c7261agW;
        boolean z2;
        complete();
        List<C7261agW> list = this.historicTransitions;
        if (list == null) {
            return null;
        }
        C7261agW c7261agW2 = list.get(0);
        long jKWHzl = c7261agW2.KWHzl();
        if (jKWHzl > j || (z && jKWHzl == j)) {
            c7261agW = c7261agW2;
            z2 = false;
        } else {
            int size = this.historicTransitions.size();
            C7261agW c7261agW3 = this.historicTransitions.get(size - 1);
            long jKWHzl2 = c7261agW3.KWHzl();
            if (!z || jKWHzl2 != j) {
                if (jKWHzl2 <= j) {
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
                    if (annualTimeZoneRuleArr == null) {
                        return null;
                    }
                    z2 = true;
                    Date nextStart = annualTimeZoneRuleArr[0].getNextStart(j, annualTimeZoneRuleArr[1].getRawOffset(), this.finalRules[1].getDSTSavings(), z);
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = this.finalRules;
                    Date nextStart2 = annualTimeZoneRuleArr2[1].getNextStart(j, annualTimeZoneRuleArr2[0].getRawOffset(), this.finalRules[0].getDSTSavings(), z);
                    if (nextStart2.after(nextStart)) {
                        long time = nextStart.getTime();
                        AnnualTimeZoneRule[] annualTimeZoneRuleArr3 = this.finalRules;
                        c7261agW = new C7261agW(time, annualTimeZoneRuleArr3[1], annualTimeZoneRuleArr3[0]);
                    } else {
                        long time2 = nextStart2.getTime();
                        AnnualTimeZoneRule[] annualTimeZoneRuleArr4 = this.finalRules;
                        c7261agW = new C7261agW(time2, annualTimeZoneRuleArr4[0], annualTimeZoneRuleArr4[1]);
                    }
                } else {
                    int i = size - 2;
                    while (i > 0) {
                        C7261agW c7261agW4 = this.historicTransitions.get(i);
                        long jKWHzl3 = c7261agW4.KWHzl();
                        if (jKWHzl3 < j || (!z && jKWHzl3 == j)) {
                            break;
                        }
                        i--;
                        c7261agW3 = c7261agW4;
                    }
                }
            }
            c7261agW2 = c7261agW3;
            c7261agW = c7261agW2;
            z2 = false;
        }
        TimeZoneRule timeZoneRuleEZpvd = c7261agW.EZpvd();
        TimeZoneRule timeZoneRuleOLrzqt = c7261agW.OLrzqt();
        if (timeZoneRuleEZpvd.getRawOffset() != timeZoneRuleOLrzqt.getRawOffset() || timeZoneRuleEZpvd.getDSTSavings() != timeZoneRuleOLrzqt.getDSTSavings()) {
            return c7261agW;
        }
        if (z2) {
            return null;
        }
        return getNextTransition(c7261agW.KWHzl(), false);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getPreviousTransition(long j, boolean z) {
        complete();
        List<C7261agW> list = this.historicTransitions;
        if (list == null) {
            return null;
        }
        C7261agW c7261agW = list.get(0);
        long jKWHzl = c7261agW.KWHzl();
        if (!z || jKWHzl != j) {
            if (jKWHzl >= j) {
                return null;
            }
            int size = this.historicTransitions.size();
            C7261agW c7261agW2 = this.historicTransitions.get(size - 1);
            long jKWHzl2 = c7261agW2.KWHzl();
            if (z && jKWHzl2 == j) {
                c7261agW = c7261agW2;
            } else {
                if (jKWHzl2 < j) {
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
                    if (annualTimeZoneRuleArr != null) {
                        Date previousStart = annualTimeZoneRuleArr[0].getPreviousStart(j, annualTimeZoneRuleArr[1].getRawOffset(), this.finalRules[1].getDSTSavings(), z);
                        AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = this.finalRules;
                        Date previousStart2 = annualTimeZoneRuleArr2[1].getPreviousStart(j, annualTimeZoneRuleArr2[0].getRawOffset(), this.finalRules[0].getDSTSavings(), z);
                        if (previousStart2.before(previousStart)) {
                            long time = previousStart.getTime();
                            AnnualTimeZoneRule[] annualTimeZoneRuleArr3 = this.finalRules;
                            c7261agW = new C7261agW(time, annualTimeZoneRuleArr3[1], annualTimeZoneRuleArr3[0]);
                        } else {
                            long time2 = previousStart2.getTime();
                            AnnualTimeZoneRule[] annualTimeZoneRuleArr4 = this.finalRules;
                            c7261agW = new C7261agW(time2, annualTimeZoneRuleArr4[0], annualTimeZoneRuleArr4[1]);
                        }
                    }
                } else {
                    for (int i = size - 2; i >= 0; i--) {
                        c7261agW2 = this.historicTransitions.get(i);
                        long jKWHzl3 = c7261agW2.KWHzl();
                        if (jKWHzl3 < j || (z && jKWHzl3 == j)) {
                            break;
                        }
                    }
                }
                c7261agW = c7261agW2;
            }
        }
        TimeZoneRule timeZoneRuleEZpvd = c7261agW.EZpvd();
        TimeZoneRule timeZoneRuleOLrzqt = c7261agW.OLrzqt();
        return (timeZoneRuleEZpvd.getRawOffset() == timeZoneRuleOLrzqt.getRawOffset() && timeZoneRuleEZpvd.getDSTSavings() == timeZoneRuleOLrzqt.getDSTSavings()) ? getPreviousTransition(c7261agW.KWHzl(), false) : c7261agW;
    }

    @Override // com.ibm.icu.util.TimeZone
    public Object clone() {
        return isFrozen() ? this : mo6319cloneAsThawed();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108 A[EDGE_INSN: B:82:0x0108->B:70:0x0108 BREAK  A[LOOP:0: B:20:0x0037->B:69:0x00f9], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void complete() {
        boolean z;
        TimeZoneRule timeZoneRule;
        Date nextStart;
        int i;
        if (this.upToDate) {
            return;
        }
        AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
        if (annualTimeZoneRuleArr != null && annualTimeZoneRuleArr[1] == null) {
            throw new IllegalStateException("Incomplete final rules");
        }
        List<TimeZoneRule> list = this.historicRules;
        if (list == null && annualTimeZoneRuleArr == null) {
            z = true;
        } else {
            TimeZoneRule timeZoneRule2 = this.initialRule;
            long j = -184303902528000000L;
            if (list != null) {
                BitSet bitSet = new BitSet(this.historicRules.size());
                loop0: while (true) {
                    int rawOffset = timeZoneRule2.getRawOffset();
                    int dSTSavings = timeZoneRule2.getDSTSavings();
                    long j2 = 183882168921600000L;
                    TimeZoneRule timeZoneRule3 = null;
                    int i2 = 0;
                    while (i2 < this.historicRules.size()) {
                        if (bitSet.get(i2)) {
                            i = i2;
                        } else {
                            TimeZoneRule timeZoneRule4 = this.historicRules.get(i2);
                            i = i2;
                            Date nextStart2 = timeZoneRule4.getNextStart(j, rawOffset, dSTSavings, false);
                            if (nextStart2 == null) {
                                bitSet.set(i);
                            } else if (timeZoneRule4 != timeZoneRule2 && (!timeZoneRule4.getName().equals(timeZoneRule2.getName()) || timeZoneRule4.getRawOffset() != timeZoneRule2.getRawOffset() || timeZoneRule4.getDSTSavings() != timeZoneRule2.getDSTSavings())) {
                                long time = nextStart2.getTime();
                                if (time < j2) {
                                    timeZoneRule3 = timeZoneRule4;
                                    j2 = time;
                                }
                            }
                        }
                        i2 = i + 1;
                    }
                    if (timeZoneRule3 == null) {
                        for (int i3 = 0; i3 < this.historicRules.size(); i3++) {
                            if (!bitSet.get(i3)) {
                                if (this.finalRules != null) {
                                    for (int i4 = 0; i4 < 2; i4++) {
                                        AnnualTimeZoneRule annualTimeZoneRule = this.finalRules[i4];
                                        if (annualTimeZoneRule != timeZoneRule2 && (nextStart = annualTimeZoneRule.getNextStart(j, rawOffset, dSTSavings, false)) != null) {
                                            long time2 = nextStart.getTime();
                                            if (time2 < j2) {
                                                timeZoneRule3 = this.finalRules[i4];
                                                j2 = time2;
                                            }
                                        }
                                    }
                                }
                                long j3 = j2;
                                timeZoneRule = timeZoneRule3;
                                if (timeZoneRule != null) {
                                    break;
                                }
                                if (this.historicTransitions == null) {
                                    this.historicTransitions = new ArrayList();
                                }
                                this.historicTransitions.add(new C7261agW(j3, timeZoneRule2, timeZoneRule));
                                timeZoneRule2 = timeZoneRule;
                                j = j3;
                            }
                        }
                        break loop0;
                    }
                    if (this.finalRules != null) {
                    }
                    long j32 = j2;
                    timeZoneRule = timeZoneRule3;
                    if (timeZoneRule != null) {
                    }
                }
            }
            long j4 = j;
            if (this.finalRules != null) {
                if (this.historicTransitions == null) {
                    this.historicTransitions = new ArrayList();
                }
                Date nextStart3 = this.finalRules[0].getNextStart(j4, timeZoneRule2.getRawOffset(), timeZoneRule2.getDSTSavings(), false);
                Date nextStart4 = this.finalRules[1].getNextStart(j4, timeZoneRule2.getRawOffset(), timeZoneRule2.getDSTSavings(), false);
                if (nextStart4.after(nextStart3)) {
                    this.historicTransitions.add(new C7261agW(nextStart3.getTime(), timeZoneRule2, this.finalRules[0]));
                    Date nextStart5 = this.finalRules[1].getNextStart(nextStart3.getTime(), this.finalRules[0].getRawOffset(), this.finalRules[0].getDSTSavings(), false);
                    List<C7261agW> list2 = this.historicTransitions;
                    long time3 = nextStart5.getTime();
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = this.finalRules;
                    list2.add(new C7261agW(time3, annualTimeZoneRuleArr2[0], annualTimeZoneRuleArr2[1]));
                    z = true;
                } else {
                    this.historicTransitions.add(new C7261agW(nextStart4.getTime(), timeZoneRule2, this.finalRules[1]));
                    Date nextStart6 = this.finalRules[0].getNextStart(nextStart4.getTime(), this.finalRules[1].getRawOffset(), this.finalRules[1].getDSTSavings(), false);
                    List<C7261agW> list3 = this.historicTransitions;
                    long time4 = nextStart6.getTime();
                    AnnualTimeZoneRule[] annualTimeZoneRuleArr3 = this.finalRules;
                    z = true;
                    list3.add(new C7261agW(time4, annualTimeZoneRuleArr3[1], annualTimeZoneRuleArr3[0]));
                }
            } else {
                z = true;
            }
        }
        this.upToDate = z;
    }

    private void getOffset(long j, boolean z, int i, int i2, int[] iArr) {
        TimeZoneRule timeZoneRuleOLrzqt;
        complete();
        List<C7261agW> list = this.historicTransitions;
        if (list != null && j >= getTransitionTime(list.get(0), z, i, i2)) {
            int size = this.historicTransitions.size() - 1;
            if (j > getTransitionTime(this.historicTransitions.get(size), z, i, i2)) {
                timeZoneRuleOLrzqt = this.finalRules != null ? findRuleInFinal(j, z, i, i2) : null;
                if (timeZoneRuleOLrzqt == null) {
                    timeZoneRuleOLrzqt = this.historicTransitions.get(size).OLrzqt();
                }
            } else {
                while (size >= 0 && j < getTransitionTime(this.historicTransitions.get(size), z, i, i2)) {
                    size--;
                }
                timeZoneRuleOLrzqt = this.historicTransitions.get(size).OLrzqt();
            }
        } else {
            timeZoneRuleOLrzqt = this.initialRule;
        }
        iArr[0] = timeZoneRuleOLrzqt.getRawOffset();
        iArr[1] = timeZoneRuleOLrzqt.getDSTSavings();
    }

    private TimeZoneRule findRuleInFinal(long j, boolean z, int i, int i2) {
        AnnualTimeZoneRule annualTimeZoneRule;
        AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
        if (annualTimeZoneRuleArr == null || annualTimeZoneRuleArr.length != 2 || annualTimeZoneRuleArr[0] == null || (annualTimeZoneRule = annualTimeZoneRuleArr[1]) == null) {
            return null;
        }
        long localDelta = z ? j - ((long) getLocalDelta(annualTimeZoneRule.getRawOffset(), this.finalRules[1].getDSTSavings(), this.finalRules[0].getRawOffset(), this.finalRules[0].getDSTSavings(), i, i2)) : j;
        AnnualTimeZoneRule[] annualTimeZoneRuleArr2 = this.finalRules;
        Date previousStart = annualTimeZoneRuleArr2[0].getPreviousStart(localDelta, annualTimeZoneRuleArr2[1].getRawOffset(), this.finalRules[1].getDSTSavings(), true);
        long localDelta2 = z ? j - ((long) getLocalDelta(this.finalRules[0].getRawOffset(), this.finalRules[0].getDSTSavings(), this.finalRules[1].getRawOffset(), this.finalRules[1].getDSTSavings(), i, i2)) : j;
        AnnualTimeZoneRule[] annualTimeZoneRuleArr3 = this.finalRules;
        Date previousStart2 = annualTimeZoneRuleArr3[1].getPreviousStart(localDelta2, annualTimeZoneRuleArr3[0].getRawOffset(), this.finalRules[0].getDSTSavings(), true);
        if (previousStart != null && previousStart2 != null) {
            return previousStart.after(previousStart2) ? this.finalRules[0] : this.finalRules[1];
        }
        if (previousStart != null) {
            return this.finalRules[0];
        }
        if (previousStart2 != null) {
            return this.finalRules[1];
        }
        return null;
    }

    private static long getTransitionTime(C7261agW c7261agW, boolean z, int i, int i2) {
        long jKWHzl = c7261agW.KWHzl();
        return z ? jKWHzl + ((long) getLocalDelta(c7261agW.EZpvd().getRawOffset(), c7261agW.EZpvd().getDSTSavings(), c7261agW.OLrzqt().getRawOffset(), c7261agW.OLrzqt().getDSTSavings(), i, i2)) : jKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: freeze */
    public TimeZone mo6320freeze() {
        complete();
        this.isFrozen = true;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: cloneAsThawed */
    public TimeZone mo6319cloneAsThawed() {
        RuleBasedTimeZone ruleBasedTimeZone = (RuleBasedTimeZone) super.mo6319cloneAsThawed();
        if (this.historicRules != null) {
            ruleBasedTimeZone.historicRules = new ArrayList(this.historicRules);
        }
        AnnualTimeZoneRule[] annualTimeZoneRuleArr = this.finalRules;
        if (annualTimeZoneRuleArr != null) {
            ruleBasedTimeZone.finalRules = (AnnualTimeZoneRule[]) annualTimeZoneRuleArr.clone();
        }
        ruleBasedTimeZone.isFrozen = false;
        return ruleBasedTimeZone;
    }
}
