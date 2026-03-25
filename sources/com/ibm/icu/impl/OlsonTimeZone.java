package com.ibm.icu.impl;

import androidx.compose.material3.CalendarModelKt;
import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.util.AnnualTimeZoneRule;
import com.ibm.icu.util.BasicTimeZone;
import com.ibm.icu.util.DateTimeRule;
import com.ibm.icu.util.InitialTimeZoneRule;
import com.ibm.icu.util.SimpleTimeZone;
import com.ibm.icu.util.TimeArrayTimeZoneRule;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.TimeZoneRule;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.MissingResourceException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7019abT;
import o.C7045acS;
import o.C7047acU;
import o.C7060ach;
import o.C7261agW;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes3.dex */
public class OlsonTimeZone extends BasicTimeZone {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = C7060ach.AEQbTJ("olson");
    private static final int MAX_OFFSET_SECONDS = 86400;
    private static final int SECONDS_PER_DAY = 86400;
    private static final String ZONEINFORES = "zoneinfo64";
    private static final int currentSerialVersion = 1;
    static final long serialVersionUID = -6281977362477515376L;
    private volatile String canonicalID;
    private double finalStartMillis;
    private int finalStartYear;
    private SimpleTimeZone finalZone;
    private transient SimpleTimeZone finalZoneWithStartYear;
    private transient C7261agW firstFinalTZTransition;
    private transient C7261agW firstTZTransition;
    private transient int firstTZTransitionIdx;
    private transient TimeArrayTimeZoneRule[] historicRules;
    private transient InitialTimeZoneRule initialRule;
    private volatile transient boolean isFrozen;
    private int serialVersionOnStream;
    private int transitionCount;
    private transient boolean transitionRulesInitialized;
    private long[] transitionTimes64;
    private int typeCount;
    private byte[] typeMapData;
    private int[] typeOffsets;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void constructEmpty() {
        this.transitionCount = 0;
        this.transitionTimes64 = null;
        this.typeMapData = null;
        this.typeCount = 1;
        this.typeOffsets = new int[]{0, 0};
        this.finalZone = null;
        this.finalStartYear = Integer.MAX_VALUE;
        this.finalStartMillis = Double.MAX_VALUE;
        this.transitionRulesInitialized = false;
    }

    private int getInt(byte b) {
        return b & UnsignedBytes.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: freeze */
    public TimeZone mo6320freeze() {
        this.isFrozen = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public boolean isFrozen() {
        return this.isFrozen;
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 < 0 || i3 > 11) {
            throw new IllegalArgumentException("Month is not in the legal range: " + i3);
        }
        return getOffset(i, i2, i3, i4, i5, i6, C7019abT.copydefault(i2, i3));
    }

    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if ((i != 1 && i != 0) || i3 < 0 || i3 > 11 || i4 < 1 || i4 > i7 || i5 < 1 || i5 > 7 || i6 < 0 || i6 >= 86400000 || i7 < 28 || i7 > 31) {
            throw new IllegalArgumentException();
        }
        if (i == 0) {
            i2 = -i2;
        }
        int i8 = i2;
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null && i8 >= this.finalStartYear) {
            return simpleTimeZone.getOffset(i, i8, i3, i4, i5, i6);
        }
        int[] iArr = new int[2];
        getHistoricalOffset((C7019abT.copydefault(i8, i3, i4) * CalendarModelKt.MillisecondsIn24Hours) + ((long) i6), true, 3, 1, iArr);
        return iArr[0] + iArr[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    @Override // com.ibm.icu.util.TimeZone
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRawOffset(int i) {
        int i2;
        DateTimeRule rule;
        DateTimeRule rule2;
        C7261agW previousTransition;
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen OlsonTimeZone instance.");
        }
        if (getRawOffset() == i) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.finalStartMillis) {
            SimpleTimeZone simpleTimeZone = new SimpleTimeZone(i, getID());
            boolean zUseDaylightTime = useDaylightTime();
            if (zUseDaylightTime) {
                TimeZoneRule[] simpleTimeZoneRulesNear = getSimpleTimeZoneRulesNear(jCurrentTimeMillis);
                if (simpleTimeZoneRulesNear.length != 3 && (previousTransition = getPreviousTransition(jCurrentTimeMillis, false)) != null) {
                    simpleTimeZoneRulesNear = getSimpleTimeZoneRulesNear(previousTransition.KWHzl() - 1);
                }
                if (simpleTimeZoneRulesNear.length == 3) {
                    TimeZoneRule timeZoneRule = simpleTimeZoneRulesNear[1];
                    if (timeZoneRule instanceof AnnualTimeZoneRule) {
                        TimeZoneRule timeZoneRule2 = simpleTimeZoneRulesNear[2];
                        if (timeZoneRule2 instanceof AnnualTimeZoneRule) {
                            AnnualTimeZoneRule annualTimeZoneRule = (AnnualTimeZoneRule) timeZoneRule;
                            AnnualTimeZoneRule annualTimeZoneRule2 = (AnnualTimeZoneRule) timeZoneRule2;
                            int rawOffset = annualTimeZoneRule.getRawOffset() + annualTimeZoneRule.getDSTSavings();
                            int rawOffset2 = annualTimeZoneRule2.getRawOffset() + annualTimeZoneRule2.getDSTSavings();
                            if (rawOffset > rawOffset2) {
                                rule = annualTimeZoneRule.getRule();
                                rule2 = annualTimeZoneRule2.getRule();
                                i2 = rawOffset - rawOffset2;
                            } else {
                                DateTimeRule rule3 = annualTimeZoneRule2.getRule();
                                DateTimeRule rule4 = annualTimeZoneRule.getRule();
                                i2 = rawOffset2 - rawOffset;
                                rule = rule3;
                                rule2 = rule4;
                            }
                            simpleTimeZone.setStartRule(rule.getRuleMonth(), rule.getRuleWeekInMonth(), rule.getRuleDayOfWeek(), rule.getRuleMillisInDay());
                            simpleTimeZone.setEndRule(rule2.getRuleMonth(), rule2.getRuleWeekInMonth(), rule2.getRuleDayOfWeek(), rule2.getRuleMillisInDay());
                            simpleTimeZone.setDSTSavings(i2);
                        } else {
                            simpleTimeZone.setStartRule(0, 1, 0);
                            simpleTimeZone.setEndRule(11, 31, 86399999);
                        }
                    }
                }
            }
            this.finalStartYear = C7019abT.KWHzl(jCurrentTimeMillis, null)[0];
            this.finalStartMillis = C7019abT.copydefault(r0, 0, 1);
            if (zUseDaylightTime) {
                simpleTimeZone.setStartYear(this.finalStartYear);
            }
            this.finalZone = simpleTimeZone;
        } else {
            this.finalZone.setRawOffset(i);
        }
        this.transitionRulesInitialized = false;
    }

    @Override // com.ibm.icu.util.TimeZone
    public Object clone() {
        return isFrozen() ? this : mo6319cloneAsThawed();
    }

    @Override // com.ibm.icu.util.TimeZone
    public void getOffset(long j, boolean z, int[] iArr) {
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null && j >= this.finalStartMillis) {
            simpleTimeZone.getOffset(j, z, iArr);
        } else {
            getHistoricalOffset(j, z, 4, 12, iArr);
        }
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public void getOffsetFromLocal(long j, int i, int i2, int[] iArr) {
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null && j >= this.finalStartMillis) {
            simpleTimeZone.getOffsetFromLocal(j, i, i2, iArr);
        } else {
            getHistoricalOffset(j, true, i, i2, iArr);
        }
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getRawOffset() {
        int[] iArr = new int[2];
        getOffset(System.currentTimeMillis(), false, iArr);
        return iArr[0];
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean useDaylightTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null && jCurrentTimeMillis >= this.finalStartMillis) {
            return simpleTimeZone != null && simpleTimeZone.useDaylightTime();
        }
        int[] iArrKWHzl = C7019abT.KWHzl(jCurrentTimeMillis, null);
        long jCopydefault = C7019abT.copydefault(iArrKWHzl[0], 0, 1) * 86400;
        long jCopydefault2 = C7019abT.copydefault(iArrKWHzl[0] + 1, 0, 1);
        for (int i = 0; i < this.transitionCount; i++) {
            long j = this.transitionTimes64[i];
            if (j >= jCopydefault2 * 86400) {
                break;
            }
            if ((j >= jCopydefault && dstOffsetAt(i) != 0) || (this.transitionTimes64[i] > jCopydefault && i > 0 && dstOffsetAt(i - 1) != 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean observesDaylightTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null) {
            if (simpleTimeZone.useDaylightTime()) {
                return true;
            }
            if (jCurrentTimeMillis >= this.finalStartMillis) {
                return false;
            }
        }
        long jCopydefault = C7019abT.copydefault(jCurrentTimeMillis, 1000L);
        int i = this.transitionCount - 1;
        if (dstOffsetAt(i) != 0) {
            return true;
        }
        while (i >= 0 && this.transitionTimes64[i] > jCopydefault) {
            if (dstOffsetAt(i - 1) != 0) {
                return true;
            }
            i--;
        }
        return false;
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getDSTSavings() {
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null) {
            return simpleTimeZone.getDSTSavings();
        }
        return super.getDSTSavings();
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean inDaylightTime(Date date) {
        int[] iArr = new int[2];
        getOffset(date.getTime(), false, iArr);
        return iArr[1] != 0;
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean hasSameRules(TimeZone timeZone) {
        if (this == timeZone) {
            return true;
        }
        if (!super.hasSameRules(timeZone) || !(timeZone instanceof OlsonTimeZone)) {
            return false;
        }
        OlsonTimeZone olsonTimeZone = (OlsonTimeZone) timeZone;
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone == null) {
            if (olsonTimeZone.finalZone != null) {
                return false;
            }
        } else {
            SimpleTimeZone simpleTimeZone2 = olsonTimeZone.finalZone;
            if (simpleTimeZone2 != null && this.finalStartYear == olsonTimeZone.finalStartYear && simpleTimeZone.hasSameRules(simpleTimeZone2)) {
            }
        }
        return this.transitionCount == olsonTimeZone.transitionCount && Arrays.equals(this.transitionTimes64, olsonTimeZone.transitionTimes64) && this.typeCount == olsonTimeZone.typeCount && Arrays.equals(this.typeMapData, olsonTimeZone.typeMapData) && Arrays.equals(this.typeOffsets, olsonTimeZone.typeOffsets);
    }

    public String getCanonicalID() {
        if (this.canonicalID == null) {
            synchronized (this) {
                if (this.canonicalID == null) {
                    this.canonicalID = TimeZone.getCanonicalID(getID());
                    if (this.canonicalID == null) {
                        this.canonicalID = getID();
                    }
                }
            }
        }
        return this.canonicalID;
    }

    public OlsonTimeZone(UResourceBundle uResourceBundle, UResourceBundle uResourceBundle2, String str) {
        super(str);
        this.finalStartYear = Integer.MAX_VALUE;
        this.finalStartMillis = Double.MAX_VALUE;
        this.finalZone = null;
        this.canonicalID = null;
        this.serialVersionOnStream = 1;
        this.isFrozen = false;
        construct(uResourceBundle, uResourceBundle2, str);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x01bc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    private void construct(UResourceBundle uResourceBundle, UResourceBundle uResourceBundle2, String str) {
        int[] iArrUzCIH;
        int[] iArrUzCIH2;
        int[] iArrUzCIH3;
        SimpleTimeZone simpleTimeZone;
        ?? string;
        int i;
        if (uResourceBundle == null || uResourceBundle2 == null) {
            throw new IllegalArgumentException();
        }
        if (DEBUG) {
            System.out.println("OlsonTimeZone(" + uResourceBundle2.AEQbTJ() + ")");
        }
        this.transitionCount = 0;
        int i2 = 2;
        try {
            iArrUzCIH = uResourceBundle2.isConnected("transPre32").uzCIH();
        } catch (MissingResourceException unused) {
            iArrUzCIH = null;
        }
        if (iArrUzCIH.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid Format");
        }
        this.transitionCount += iArrUzCIH.length / 2;
        try {
            iArrUzCIH2 = uResourceBundle2.isConnected("trans").uzCIH();
            try {
                this.transitionCount += iArrUzCIH2.length;
            } catch (MissingResourceException unused2) {
            }
        } catch (MissingResourceException unused3) {
            iArrUzCIH2 = null;
        }
        try {
            iArrUzCIH3 = uResourceBundle2.isConnected("transPost32").uzCIH();
        } catch (MissingResourceException unused4) {
            iArrUzCIH3 = null;
        }
        if (iArrUzCIH3.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid Format");
        }
        this.transitionCount += iArrUzCIH3.length / 2;
        int i3 = this.transitionCount;
        if (i3 > 0) {
            this.transitionTimes64 = new long[i3];
            char c = ' ';
            if (iArrUzCIH != null) {
                i = 0;
                int i4 = 0;
                while (i4 < iArrUzCIH.length / i2) {
                    int i5 = i4 * 2;
                    int[] iArr = iArrUzCIH;
                    this.transitionTimes64[i] = ((((long) iArrUzCIH[i5]) & BodyPartID.bodyIdMax) << c) | (((long) iArr[i5 + 1]) & BodyPartID.bodyIdMax);
                    i4++;
                    i++;
                    iArrUzCIH = iArr;
                    i2 = 2;
                    c = ' ';
                }
            } else {
                i = 0;
            }
            if (iArrUzCIH2 != null) {
                int i6 = 0;
                while (i6 < iArrUzCIH2.length) {
                    this.transitionTimes64[i] = iArrUzCIH2[i6];
                    i6++;
                    i++;
                }
            }
            if (iArrUzCIH3 != null) {
                int i7 = 0;
                while (i7 < iArrUzCIH3.length / 2) {
                    int i8 = i7 * 2;
                    this.transitionTimes64[i] = ((((long) iArrUzCIH3[i8]) & BodyPartID.bodyIdMax) << 32) | (((long) iArrUzCIH3[i8 + 1]) & BodyPartID.bodyIdMax);
                    i7++;
                    i++;
                }
            }
        } else {
            this.transitionTimes64 = null;
        }
        int[] iArrUzCIH4 = uResourceBundle2.isConnected("typeOffsets").uzCIH();
        this.typeOffsets = iArrUzCIH4;
        if (iArrUzCIH4.length < 2 || iArrUzCIH4.length > 32766 || iArrUzCIH4.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid Format");
        }
        this.typeCount = iArrUzCIH4.length / 2;
        if (this.transitionCount > 0) {
            byte[] bArrCopydefault = uResourceBundle2.isConnected("typeMap").copydefault((byte[]) null);
            this.typeMapData = bArrCopydefault;
            if (bArrCopydefault == null || bArrCopydefault.length != this.transitionCount) {
                throw new IllegalArgumentException("Invalid Format");
            }
            simpleTimeZone = null;
        } else {
            simpleTimeZone = null;
            this.typeMapData = null;
        }
        this.finalZone = simpleTimeZone;
        this.finalStartYear = Integer.MAX_VALUE;
        this.finalStartMillis = Double.MAX_VALUE;
        try {
            string = uResourceBundle2.getString("finalRule");
        } catch (MissingResourceException unused5) {
            string = simpleTimeZone;
        }
        try {
            int iFIwbmz = uResourceBundle2.isConnected("finalRaw").fIwbmz();
            int[] iArrUzCIH5 = loadRule(uResourceBundle, string).uzCIH();
            if (iArrUzCIH5 == null || iArrUzCIH5.length != 11) {
                throw new IllegalArgumentException("Invalid Format");
            }
            this.finalZone = new SimpleTimeZone(iFIwbmz * 1000, str, iArrUzCIH5[0], iArrUzCIH5[1], iArrUzCIH5[2], iArrUzCIH5[3] * 1000, iArrUzCIH5[4], iArrUzCIH5[5], iArrUzCIH5[6], iArrUzCIH5[7], iArrUzCIH5[8] * 1000, iArrUzCIH5[9], iArrUzCIH5[10] * 1000);
            this.finalStartYear = uResourceBundle2.isConnected("finalYear").fIwbmz();
            this.finalStartMillis = C7019abT.copydefault(r1, 0, 1) * CalendarModelKt.MillisecondsIn24Hours;
        } catch (MissingResourceException unused6) {
            if (string != 0) {
                throw new IllegalArgumentException("Invalid Format");
            }
        }
    }

    public OlsonTimeZone(String str) {
        super(str);
        this.finalStartYear = Integer.MAX_VALUE;
        this.finalStartMillis = Double.MAX_VALUE;
        this.finalZone = null;
        this.canonicalID = null;
        this.serialVersionOnStream = 1;
        this.isFrozen = false;
        UResourceBundle uResourceBundleCopydefault = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", ZONEINFORES, ICUResourceBundle.AEQbTJ);
        construct(uResourceBundleCopydefault, C7047acU.KWHzl(uResourceBundleCopydefault, str), str);
    }

    @Override // com.ibm.icu.util.TimeZone
    public void setID(String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen OlsonTimeZone instance.");
        }
        if (this.canonicalID == null) {
            this.canonicalID = TimeZone.getCanonicalID(getID());
            if (this.canonicalID == null) {
                this.canonicalID = getID();
            }
        }
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null) {
            simpleTimeZone.setID(str);
        }
        super.setID(str);
        this.transitionRulesInitialized = false;
    }

    private void getHistoricalOffset(long j, boolean z, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        if (this.transitionCount != 0) {
            long jCopydefault = C7019abT.copydefault(j, 1000L);
            if (!z && jCopydefault < this.transitionTimes64[0]) {
                iArr[0] = initialRawOffset() * 1000;
                iArr[1] = initialDstOffset() * 1000;
                return;
            }
            int i5 = this.transitionCount - 1;
            while (i5 >= 0) {
                long j2 = this.transitionTimes64[i5];
                if (z && jCopydefault >= j2 - 86400) {
                    int i6 = i5 - 1;
                    int iZoneOffsetAt = zoneOffsetAt(i6);
                    boolean z2 = dstOffsetAt(i6) != 0;
                    int iZoneOffsetAt2 = zoneOffsetAt(i5);
                    boolean z3 = dstOffsetAt(i5) != 0;
                    boolean z4 = z2 && !z3;
                    boolean z5 = !z2 && z3;
                    j2 += (iZoneOffsetAt2 - iZoneOffsetAt < 0 ? !((i3 = i2 & 3) == 1 && z4) && (!(i3 == 3 && z5) && ((i3 == 1 && z5) || ((i3 == 3 && z4) || (i2 & 12) == 4))) : ((i4 = i & 3) == 1 && z4) || ((i4 == 3 && z5) || (!(i4 == 1 && z5) && (!(i4 == 3 && z4) && (i & 12) == 12)))) ? iZoneOffsetAt : iZoneOffsetAt2;
                }
                if (jCopydefault >= j2) {
                    break;
                } else {
                    i5--;
                }
            }
            iArr[0] = rawOffsetAt(i5) * 1000;
            iArr[1] = dstOffsetAt(i5) * 1000;
            return;
        }
        iArr[0] = initialRawOffset() * 1000;
        iArr[1] = initialDstOffset() * 1000;
    }

    private int zoneOffsetAt(int i) {
        int i2 = i >= 0 ? getInt(this.typeMapData[i]) * 2 : 0;
        int[] iArr = this.typeOffsets;
        return iArr[i2] + iArr[i2 + 1];
    }

    private int rawOffsetAt(int i) {
        return this.typeOffsets[i >= 0 ? getInt(this.typeMapData[i]) * 2 : 0];
    }

    private int dstOffsetAt(int i) {
        return this.typeOffsets[(i >= 0 ? getInt(this.typeMapData[i]) * 2 : 0) + 1];
    }

    private int initialRawOffset() {
        return this.typeOffsets[0];
    }

    private int initialDstOffset() {
        return this.typeOffsets[1];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("transitionCount=" + this.transitionCount);
        sb.append(",typeCount=" + this.typeCount);
        sb.append(",transitionTimes=");
        if (this.transitionTimes64 != null) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i = 0; i < this.transitionTimes64.length; i++) {
                if (i > 0) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(Long.toString(this.transitionTimes64[i]));
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.NULL);
        }
        sb.append(",typeOffsets=");
        if (this.typeOffsets != null) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i2 = 0; i2 < this.typeOffsets.length; i2++) {
                if (i2 > 0) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(Integer.toString(this.typeOffsets[i2]));
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.NULL);
        }
        sb.append(",typeMapData=");
        if (this.typeMapData != null) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i3 = 0; i3 < this.typeMapData.length; i3++) {
                if (i3 > 0) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(Byte.toString(this.typeMapData[i3]));
            }
        } else {
            sb.append(AbstractJsonLexerKt.NULL);
        }
        sb.append(",finalStartYear=" + this.finalStartYear);
        sb.append(",finalStartMillis=" + this.finalStartMillis);
        sb.append(",finalZone=" + this.finalZone);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private static UResourceBundle loadRule(UResourceBundle uResourceBundle, String str) {
        return uResourceBundle.isConnected("Rules").isConnected(str);
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean equals(Object obj) {
        SimpleTimeZone simpleTimeZone;
        if (!super.equals(obj)) {
            return false;
        }
        OlsonTimeZone olsonTimeZone = (OlsonTimeZone) obj;
        if (!C7045acS.AEQbTJ(this.typeMapData, (Object) olsonTimeZone.typeMapData)) {
            if (this.finalStartYear != olsonTimeZone.finalStartYear) {
                return false;
            }
            SimpleTimeZone simpleTimeZone2 = this.finalZone;
            if ((simpleTimeZone2 != null || olsonTimeZone.finalZone != null) && (simpleTimeZone2 == null || (simpleTimeZone = olsonTimeZone.finalZone) == null || !simpleTimeZone2.equals(simpleTimeZone) || this.transitionCount != olsonTimeZone.transitionCount || this.typeCount != olsonTimeZone.typeCount || !C7045acS.copydefault(this.transitionTimes64, olsonTimeZone.transitionTimes64) || !C7045acS.EZpvd(this.typeOffsets, olsonTimeZone.typeOffsets) || !C7045acS.AEQbTJ(this.typeMapData, (Object) olsonTimeZone.typeMapData))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ibm.icu.util.TimeZone
    public int hashCode() {
        int i = this.finalStartYear;
        int i2 = this.transitionCount;
        int i3 = this.typeCount;
        long j = (i ^ ((i >>> 4) + i2)) ^ ((i2 >>> 6) + i3);
        long j2 = i3 >>> 8;
        long jDoubleToLongBits = Double.doubleToLongBits(this.finalStartMillis);
        SimpleTimeZone simpleTimeZone = this.finalZone;
        int i4 = 0;
        int iHashCode = (int) (j ^ (((j2 + jDoubleToLongBits) + ((long) (simpleTimeZone == null ? 0 : simpleTimeZone.hashCode()))) + ((long) super.hashCode())));
        if (this.transitionTimes64 != null) {
            int i5 = 0;
            while (true) {
                long[] jArr = this.transitionTimes64;
                if (i5 >= jArr.length) {
                    break;
                }
                long j3 = jArr[i5];
                iHashCode = (int) (((long) iHashCode) + (j3 ^ (j3 >>> 8)));
                i5++;
            }
        }
        int i6 = 0;
        while (true) {
            int[] iArr = this.typeOffsets;
            if (i6 >= iArr.length) {
                break;
            }
            int i7 = iArr[i6];
            iHashCode += i7 ^ (i7 >>> 8);
            i6++;
        }
        if (this.typeMapData != null) {
            while (true) {
                byte[] bArr = this.typeMapData;
                if (i4 >= bArr.length) {
                    break;
                }
                iHashCode += bArr[i4] & UnsignedBytes.MAX_VALUE;
                i4++;
            }
        }
        return iHashCode;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:19:0x0039 */
    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getNextTransition(long j, boolean z) {
        int i;
        initTransitionRules();
        if (this.finalZone != null) {
            if (z && j == this.firstFinalTZTransition.KWHzl()) {
                return this.firstFinalTZTransition;
            }
            if (j >= this.firstFinalTZTransition.KWHzl()) {
                if (this.finalZone.useDaylightTime()) {
                    return this.finalZoneWithStartYear.getNextTransition(j, z);
                }
                return null;
            }
        }
        if (this.historicRules == null) {
            return null;
        }
        int i2 = this.transitionCount;
        while (true) {
            i2--;
            i = this.firstTZTransitionIdx;
            if (i2 < i) {
                break;
            }
            long j2 = this.transitionTimes64[i2] * 1000;
            if (j > j2 || (!z && j == j2)) {
                break;
            }
        }
        if (i2 == this.transitionCount - 1) {
            return this.firstFinalTZTransition;
        }
        if (i2 < i) {
            return this.firstTZTransition;
        }
        int i3 = i2 + 1;
        TimeArrayTimeZoneRule timeArrayTimeZoneRule = this.historicRules[getInt(this.typeMapData[i3])];
        TimeArrayTimeZoneRule timeArrayTimeZoneRule2 = this.historicRules[getInt(this.typeMapData[i2])];
        long j3 = this.transitionTimes64[i3] * 1000;
        if (timeArrayTimeZoneRule2.getName().equals(timeArrayTimeZoneRule.getName()) && timeArrayTimeZoneRule2.getRawOffset() == timeArrayTimeZoneRule.getRawOffset() && timeArrayTimeZoneRule2.getDSTSavings() == timeArrayTimeZoneRule.getDSTSavings()) {
            return getNextTransition(j3, false);
        }
        return new C7261agW(j3, timeArrayTimeZoneRule2, timeArrayTimeZoneRule);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:20:0x003b */
    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getPreviousTransition(long j, boolean z) {
        int i;
        initTransitionRules();
        if (this.finalZone != null) {
            if (z && j == this.firstFinalTZTransition.KWHzl()) {
                return this.firstFinalTZTransition;
            }
            if (j > this.firstFinalTZTransition.KWHzl()) {
                return this.finalZone.useDaylightTime() ? this.finalZoneWithStartYear.getPreviousTransition(j, z) : this.firstFinalTZTransition;
            }
        }
        if (this.historicRules == null) {
            return null;
        }
        int i2 = this.transitionCount;
        while (true) {
            i2--;
            i = this.firstTZTransitionIdx;
            if (i2 < i) {
                break;
            }
            long j2 = this.transitionTimes64[i2] * 1000;
            if (j > j2 || (z && j == j2)) {
                break;
            }
        }
        if (i2 < i) {
            return null;
        }
        if (i2 == i) {
            return this.firstTZTransition;
        }
        TimeArrayTimeZoneRule timeArrayTimeZoneRule = this.historicRules[getInt(this.typeMapData[i2])];
        TimeArrayTimeZoneRule timeArrayTimeZoneRule2 = this.historicRules[getInt(this.typeMapData[i2 - 1])];
        long j3 = this.transitionTimes64[i2] * 1000;
        if (timeArrayTimeZoneRule2.getName().equals(timeArrayTimeZoneRule.getName()) && timeArrayTimeZoneRule2.getRawOffset() == timeArrayTimeZoneRule.getRawOffset() && timeArrayTimeZoneRule2.getDSTSavings() == timeArrayTimeZoneRule.getDSTSavings()) {
            return getPreviousTransition(j3, false);
        }
        return new C7261agW(j3, timeArrayTimeZoneRule2, timeArrayTimeZoneRule);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public TimeZoneRule[] getTimeZoneRules() {
        int i;
        int i2;
        initTransitionRules();
        if (this.historicRules != null) {
            int i3 = 0;
            i = 1;
            while (true) {
                TimeArrayTimeZoneRule[] timeArrayTimeZoneRuleArr = this.historicRules;
                if (i3 >= timeArrayTimeZoneRuleArr.length) {
                    break;
                }
                if (timeArrayTimeZoneRuleArr[i3] != null) {
                    i++;
                }
                i3++;
            }
        } else {
            i = 1;
        }
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null) {
            i = simpleTimeZone.useDaylightTime() ? i + 2 : i + 1;
        }
        TimeZoneRule[] timeZoneRuleArr = new TimeZoneRule[i];
        timeZoneRuleArr[0] = this.initialRule;
        if (this.historicRules != null) {
            int i4 = 0;
            i2 = 1;
            while (true) {
                TimeArrayTimeZoneRule[] timeArrayTimeZoneRuleArr2 = this.historicRules;
                if (i4 >= timeArrayTimeZoneRuleArr2.length) {
                    break;
                }
                TimeArrayTimeZoneRule timeArrayTimeZoneRule = timeArrayTimeZoneRuleArr2[i4];
                if (timeArrayTimeZoneRule != null) {
                    timeZoneRuleArr[i2] = timeArrayTimeZoneRule;
                    i2++;
                }
                i4++;
            }
        } else {
            i2 = 1;
        }
        SimpleTimeZone simpleTimeZone2 = this.finalZone;
        if (simpleTimeZone2 != null) {
            if (simpleTimeZone2.useDaylightTime()) {
                TimeZoneRule[] timeZoneRules = this.finalZoneWithStartYear.getTimeZoneRules();
                timeZoneRuleArr[i2] = timeZoneRules[1];
                timeZoneRuleArr[i2 + 1] = timeZoneRules[2];
            } else {
                timeZoneRuleArr[i2] = new TimeArrayTimeZoneRule(getID() + "(STD)", this.finalZone.getRawOffset(), 0, new long[]{(long) this.finalStartMillis}, 2);
            }
        }
        return timeZoneRuleArr;
    }

    private void initTransitionRules() {
        TimeZoneRule timeArrayTimeZoneRule;
        int i;
        synchronized (this) {
            if (this.transitionRulesInitialized) {
                return;
            }
            this.initialRule = null;
            this.firstTZTransition = null;
            this.firstFinalTZTransition = null;
            this.historicRules = null;
            this.firstTZTransitionIdx = 0;
            this.finalZoneWithStartYear = null;
            String str = getID() + "(STD)";
            String str2 = getID() + "(DST)";
            int iInitialRawOffset = initialRawOffset();
            int iInitialDstOffset = initialDstOffset() * 1000;
            this.initialRule = new InitialTimeZoneRule(iInitialDstOffset == 0 ? str : str2, iInitialRawOffset * 1000, iInitialDstOffset);
            if (this.transitionCount > 0) {
                int i2 = 0;
                while (i2 < this.transitionCount && getInt(this.typeMapData[i2]) == 0) {
                    this.firstTZTransitionIdx++;
                    i2++;
                }
                int i3 = this.transitionCount;
                if (i2 != i3) {
                    long[] jArr = new long[i3];
                    int i4 = 0;
                    while (true) {
                        long j = 1000;
                        if (i4 >= this.typeCount) {
                            break;
                        }
                        int i5 = this.firstTZTransitionIdx;
                        int i6 = 0;
                        while (i5 < this.transitionCount) {
                            if (i4 == getInt(this.typeMapData[i5])) {
                                long j2 = this.transitionTimes64[i5] * j;
                                i = i4;
                                if (j2 < this.finalStartMillis) {
                                    jArr[i6] = j2;
                                    i6++;
                                }
                            } else {
                                i = i4;
                            }
                            i5++;
                            i4 = i;
                            j = 1000;
                        }
                        int i7 = i4;
                        if (i6 > 0) {
                            long[] jArr2 = new long[i6];
                            System.arraycopy(jArr, 0, jArr2, 0, i6);
                            int[] iArr = this.typeOffsets;
                            int i8 = i7 * 2;
                            int i9 = iArr[i8];
                            int i10 = iArr[i8 + 1] * 1000;
                            if (this.historicRules == null) {
                                this.historicRules = new TimeArrayTimeZoneRule[this.typeCount];
                            }
                            this.historicRules[i7] = new TimeArrayTimeZoneRule(i10 == 0 ? str : str2, i9 * 1000, i10, jArr2, 2);
                        }
                        i4 = i7 + 1;
                    }
                    this.firstTZTransition = new C7261agW(this.transitionTimes64[this.firstTZTransitionIdx] * 1000, this.initialRule, this.historicRules[getInt(this.typeMapData[this.firstTZTransitionIdx])]);
                }
            }
            SimpleTimeZone simpleTimeZone = this.finalZone;
            if (simpleTimeZone != null) {
                long jKWHzl = (long) this.finalStartMillis;
                if (simpleTimeZone.useDaylightTime()) {
                    SimpleTimeZone simpleTimeZone2 = (SimpleTimeZone) this.finalZone.clone();
                    this.finalZoneWithStartYear = simpleTimeZone2;
                    simpleTimeZone2.setStartYear(this.finalStartYear);
                    C7261agW nextTransition = this.finalZoneWithStartYear.getNextTransition(jKWHzl, false);
                    timeArrayTimeZoneRule = nextTransition.OLrzqt();
                    jKWHzl = nextTransition.KWHzl();
                } else {
                    SimpleTimeZone simpleTimeZone3 = this.finalZone;
                    this.finalZoneWithStartYear = simpleTimeZone3;
                    timeArrayTimeZoneRule = new TimeArrayTimeZoneRule(simpleTimeZone3.getID(), this.finalZone.getRawOffset(), 0, new long[]{jKWHzl}, 2);
                }
                int i11 = this.transitionCount;
                TimeZoneRule timeZoneRule = i11 > 0 ? this.historicRules[getInt(this.typeMapData[i11 - 1])] : null;
                if (timeZoneRule == null) {
                    timeZoneRule = this.initialRule;
                }
                this.firstFinalTZTransition = new C7261agW(jKWHzl, timeZoneRule, timeArrayTimeZoneRule);
            }
            this.transitionRulesInitialized = true;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.serialVersionOnStream < 1) {
            String id = getID();
            if (id != null) {
                try {
                    UResourceBundle uResourceBundleCopydefault = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", ZONEINFORES, ICUResourceBundle.AEQbTJ);
                    construct(uResourceBundleCopydefault, C7047acU.KWHzl(uResourceBundleCopydefault, id), id);
                } catch (Exception unused) {
                    constructEmpty();
                }
            } else {
                constructEmpty();
            }
        }
        this.transitionRulesInitialized = false;
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: cloneAsThawed */
    public TimeZone mo6319cloneAsThawed() {
        OlsonTimeZone olsonTimeZone = (OlsonTimeZone) super.mo6319cloneAsThawed();
        SimpleTimeZone simpleTimeZone = this.finalZone;
        if (simpleTimeZone != null) {
            olsonTimeZone.finalZone = (SimpleTimeZone) simpleTimeZone.clone();
        }
        olsonTimeZone.isFrozen = false;
        return olsonTimeZone;
    }
}
