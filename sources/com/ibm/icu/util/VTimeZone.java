package com.ibm.icu.util;

import androidx.compose.material3.CalendarModelKt;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.StringTokenizer;
import o.C7019abT;
import o.C7261agW;

/* JADX INFO: loaded from: classes22.dex */
public class VTimeZone extends BasicTimeZone {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final int DEF_DSTSAVINGS = 3600000;
    private static final long DEF_TZSTARTTIME = 0;
    private static final String EQUALS_SIGN = "=";
    private static final int ERR = 3;
    private static final String ICAL_BEGIN = "BEGIN";
    private static final String ICAL_BEGIN_VTIMEZONE = "BEGIN:VTIMEZONE";
    private static final String ICAL_BYDAY = "BYDAY";
    private static final String ICAL_BYMONTH = "BYMONTH";
    private static final String ICAL_BYMONTHDAY = "BYMONTHDAY";
    private static final String ICAL_DAYLIGHT = "DAYLIGHT";
    private static final String ICAL_DTSTART = "DTSTART";
    private static final String ICAL_END = "END";
    private static final String ICAL_END_VTIMEZONE = "END:VTIMEZONE";
    private static final String ICAL_FREQ = "FREQ";
    private static final String ICAL_LASTMOD = "LAST-MODIFIED";
    private static final String ICAL_RDATE = "RDATE";
    private static final String ICAL_RRULE = "RRULE";
    private static final String ICAL_STANDARD = "STANDARD";
    private static final String ICAL_TZID = "TZID";
    private static final String ICAL_TZNAME = "TZNAME";
    private static final String ICAL_TZOFFSETFROM = "TZOFFSETFROM";
    private static final String ICAL_TZOFFSETTO = "TZOFFSETTO";
    private static final String ICAL_TZURL = "TZURL";
    private static final String ICAL_UNTIL = "UNTIL";
    private static final String ICAL_VTIMEZONE = "VTIMEZONE";
    private static final String ICAL_YEARLY = "YEARLY";
    private static final String ICU_TZINFO_PROP = "X-TZINFO";
    private static String ICU_TZVERSION = null;
    private static final int INI = 0;
    private static final long MAX_TIME = Long.MAX_VALUE;
    private static final long MIN_TIME = Long.MIN_VALUE;
    private static final String NEWLINE = "\r\n";
    private static final String SEMICOLON = ";";
    private static final int TZI = 2;
    private static final int VTZ = 1;
    private static final long serialVersionUID = -6851467294127795902L;
    private volatile transient boolean isFrozen;
    private Date lastmod;
    private String olsonzid;
    private BasicTimeZone tz;
    private String tzurl;
    private List<String> vtzlines;
    private static final String[] ICAL_DOW_NAMES = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    private static final int[] MONTHLENGTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: freeze */
    public TimeZone mo6320freeze() {
        this.isFrozen = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getLastModified() {
        return this.lastmod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTZURL() {
        return this.tzurl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public boolean isFrozen() {
        return this.isFrozen;
    }

    public static VTimeZone create(String str) {
        BasicTimeZone frozenICUTimeZone = TimeZone.getFrozenICUTimeZone(str, true);
        if (frozenICUTimeZone == null) {
            return null;
        }
        VTimeZone vTimeZone = new VTimeZone(str);
        BasicTimeZone basicTimeZone = (BasicTimeZone) frozenICUTimeZone.mo6319cloneAsThawed();
        vTimeZone.tz = basicTimeZone;
        vTimeZone.olsonzid = basicTimeZone.getID();
        return vTimeZone;
    }

    public static VTimeZone create(Reader reader) {
        VTimeZone vTimeZone = new VTimeZone();
        if (vTimeZone.load(reader)) {
            return vTimeZone;
        }
        return null;
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.tz.getOffset(i, i2, i3, i4, i5, i6);
    }

    @Override // com.ibm.icu.util.TimeZone
    public void getOffset(long j, boolean z, int[] iArr) {
        this.tz.getOffset(j, z, iArr);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    @Deprecated
    public void getOffsetFromLocal(long j, int i, int i2, int[] iArr) {
        this.tz.getOffsetFromLocal(j, i, i2, iArr);
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getRawOffset() {
        return this.tz.getRawOffset();
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return this.tz.inDaylightTime(date);
    }

    @Override // com.ibm.icu.util.TimeZone
    public void setRawOffset(int i) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen VTimeZone instance.");
        }
        this.tz.setRawOffset(i);
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean useDaylightTime() {
        return this.tz.useDaylightTime();
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean observesDaylightTime() {
        return this.tz.observesDaylightTime();
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean hasSameRules(TimeZone timeZone) {
        if (this == timeZone) {
            return true;
        }
        if (timeZone instanceof VTimeZone) {
            return this.tz.hasSameRules(((VTimeZone) timeZone).tz);
        }
        return this.tz.hasSameRules(timeZone);
    }

    public void setTZURL(String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen VTimeZone instance.");
        }
        this.tzurl = str;
    }

    public void setLastModified(Date date) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen VTimeZone instance.");
        }
        this.lastmod = date;
    }

    public void write(Writer writer) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        List<String> list = this.vtzlines;
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("TZURL:")) {
                    if (this.tzurl != null) {
                        bufferedWriter.write(ICAL_TZURL);
                        bufferedWriter.write(":");
                        bufferedWriter.write(this.tzurl);
                        bufferedWriter.write(NEWLINE);
                    }
                } else if (!str.startsWith("LAST-MODIFIED:")) {
                    bufferedWriter.write(str);
                    bufferedWriter.write(NEWLINE);
                } else if (this.lastmod != null) {
                    bufferedWriter.write(ICAL_LASTMOD);
                    bufferedWriter.write(":");
                    bufferedWriter.write(getUTCDateTimeString(this.lastmod.getTime()));
                    bufferedWriter.write(NEWLINE);
                }
            }
            bufferedWriter.flush();
            return;
        }
        writeZone(writer, this.tz, (this.olsonzid == null || ICU_TZVERSION == null) ? null : new String[]{"X-TZINFO:" + this.olsonzid + "[" + ICU_TZVERSION + "]"});
    }

    public void write(Writer writer, long j) throws IOException {
        TimeZoneRule[] timeZoneRules = this.tz.getTimeZoneRules(j);
        RuleBasedTimeZone ruleBasedTimeZone = new RuleBasedTimeZone(this.tz.getID(), (InitialTimeZoneRule) timeZoneRules[0]);
        for (int i = 1; i < timeZoneRules.length; i++) {
            ruleBasedTimeZone.addTransitionRule(timeZoneRules[i]);
        }
        writeZone(writer, ruleBasedTimeZone, (this.olsonzid == null || ICU_TZVERSION == null) ? null : new String[]{"X-TZINFO:" + this.olsonzid + "[" + ICU_TZVERSION + "/Partial@" + j + "]"});
    }

    public void writeSimple(Writer writer, long j) throws IOException {
        TimeZoneRule[] simpleTimeZoneRulesNear = this.tz.getSimpleTimeZoneRulesNear(j);
        RuleBasedTimeZone ruleBasedTimeZone = new RuleBasedTimeZone(this.tz.getID(), (InitialTimeZoneRule) simpleTimeZoneRulesNear[0]);
        for (int i = 1; i < simpleTimeZoneRulesNear.length; i++) {
            ruleBasedTimeZone.addTransitionRule(simpleTimeZoneRulesNear[i]);
        }
        writeZone(writer, ruleBasedTimeZone, (this.olsonzid == null || ICU_TZVERSION == null) ? null : new String[]{"X-TZINFO:" + this.olsonzid + "[" + ICU_TZVERSION + "/Simple@" + j + "]"});
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getNextTransition(long j, boolean z) {
        return this.tz.getNextTransition(j, z);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getPreviousTransition(long j, boolean z) {
        return this.tz.getPreviousTransition(j, z);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public boolean hasEquivalentTransitions(TimeZone timeZone, long j, long j2) {
        if (this == timeZone) {
            return true;
        }
        return this.tz.hasEquivalentTransitions(timeZone, j, j2);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public TimeZoneRule[] getTimeZoneRules() {
        return this.tz.getTimeZoneRules();
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public TimeZoneRule[] getTimeZoneRules(long j) {
        return this.tz.getTimeZoneRules(j);
    }

    @Override // com.ibm.icu.util.TimeZone
    public Object clone() {
        return isFrozen() ? this : mo6319cloneAsThawed();
    }

    static {
        try {
            ICU_TZVERSION = TimeZone.getTZDataVersion();
        } catch (MissingResourceException unused) {
            ICU_TZVERSION = null;
        }
    }

    private VTimeZone() {
        this.olsonzid = null;
        this.tzurl = null;
        this.lastmod = null;
        this.isFrozen = false;
    }

    private VTimeZone(String str) {
        super(str);
        this.olsonzid = null;
        this.tzurl = null;
        this.lastmod = null;
        this.isFrozen = false;
    }

    private boolean load(Reader reader) {
        try {
            this.vtzlines = new LinkedList();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                int i = reader.read();
                if (i == -1) {
                    if (!z || !sb.toString().startsWith(ICAL_END_VTIMEZONE)) {
                        return false;
                    }
                    this.vtzlines.add(sb.toString());
                } else if (i != 13) {
                    if (z2) {
                        if (i != 9 && i != 32) {
                            if (z && sb.length() > 0) {
                                this.vtzlines.add(sb.toString());
                            }
                            sb.setLength(0);
                            if (i != 10) {
                                sb.append((char) i);
                            }
                        }
                    } else if (i == 10) {
                        z2 = true;
                        if (z) {
                            if (sb.toString().startsWith(ICAL_END_VTIMEZONE)) {
                                this.vtzlines.add(sb.toString());
                                break;
                            }
                        } else if (sb.toString().startsWith(ICAL_BEGIN_VTIMEZONE)) {
                            this.vtzlines.add(sb.toString());
                            sb.setLength(0);
                            z = true;
                        }
                    } else {
                        sb.append((char) i);
                    }
                    z2 = false;
                }
            }
            return parse();
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[PHI: r12 r26 r27
  0x0160: PHI (r12v14 com.ibm.icu.util.TimeZoneRule) = 
  (r12v13 com.ibm.icu.util.TimeZoneRule)
  (r12v20 com.ibm.icu.util.TimeZoneRule)
  (r12v20 com.ibm.icu.util.TimeZoneRule)
  (r12v20 com.ibm.icu.util.TimeZoneRule)
 binds: [B:87:0x015f, B:75:0x013a, B:166:0x0160, B:78:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0160: PHI (r26v10 boolean) = (r26v9 boolean), (r26v13 boolean), (r26v13 boolean), (r26v13 boolean) binds: [B:87:0x015f, B:75:0x013a, B:166:0x0160, B:78:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0160: PHI (r27v9 java.lang.String) = (r27v8 java.lang.String), (r27v12 java.lang.String), (r27v12 java.lang.String), (r27v12 java.lang.String) binds: [B:87:0x015f, B:75:0x013a, B:166:0x0160, B:78:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean parse() {
        boolean z;
        Object annualTimeZoneRule;
        int i;
        boolean z2;
        String str;
        char c;
        TimeZoneRule timeZoneRuleCreateRuleByRDATE;
        int iOffsetStrToMillis;
        int iOffsetStrToMillis2;
        int i2;
        int i3;
        Date firstStart;
        List<String> list = this.vtzlines;
        boolean z3 = false;
        if (list == null || list.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.vtzlines.iterator();
        long time = Long.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z4 = false;
        boolean zEquals = false;
        String str2 = null;
        String defaultTZName = null;
        String str3 = null;
        LinkedList linkedList = null;
        String str4 = null;
        String str5 = null;
        while (it.hasNext()) {
            String next = it.next();
            int iIndexOf = next.indexOf(":");
            if (iIndexOf >= 0) {
                Iterator<String> it2 = it;
                String strSubstring = next.substring(z3 ? 1 : 0, iIndexOf);
                String strSubstring2 = next.substring(iIndexOf + 1);
                if (c2 != 0) {
                    i = i4;
                    if (c2 != 1) {
                        if (c2 == 2) {
                            if (strSubstring.equals(ICAL_DTSTART)) {
                                str3 = strSubstring2;
                            } else if (strSubstring.equals(ICAL_TZNAME)) {
                                defaultTZName = strSubstring2;
                            } else if (strSubstring.equals(ICAL_TZOFFSETFROM)) {
                                str4 = strSubstring2;
                            } else if (strSubstring.equals(ICAL_TZOFFSETTO)) {
                                str5 = strSubstring2;
                            } else {
                                if (strSubstring.equals(ICAL_RDATE)) {
                                    if (!z4) {
                                        LinkedList linkedList2 = linkedList == null ? new LinkedList() : linkedList;
                                        StringTokenizer stringTokenizer = new StringTokenizer(strSubstring2, COMMA);
                                        while (stringTokenizer.hasMoreTokens()) {
                                            linkedList2.add(stringTokenizer.nextToken());
                                        }
                                        linkedList = linkedList2;
                                    }
                                } else if (strSubstring.equals(ICAL_RRULE)) {
                                    if (z4 || linkedList == null) {
                                        if (linkedList == null) {
                                            linkedList = new LinkedList();
                                        }
                                        LinkedList linkedList3 = linkedList;
                                        linkedList3.add(strSubstring2);
                                        linkedList = linkedList3;
                                        i4 = i;
                                        c = 3;
                                        z4 = true;
                                    }
                                } else if (strSubstring.equals(ICAL_END)) {
                                    if (str3 == null || str4 == null || str5 == null) {
                                        z2 = zEquals;
                                        str = str3;
                                        i4 = i;
                                        zEquals = z2;
                                        str3 = str;
                                        c = 3;
                                        c2 = 3;
                                    } else {
                                        if (defaultTZName == null) {
                                            defaultTZName = getDefaultTZName(str2, zEquals);
                                        }
                                        String str6 = defaultTZName;
                                        try {
                                            iOffsetStrToMillis = offsetStrToMillis(str4);
                                            iOffsetStrToMillis2 = offsetStrToMillis(str5);
                                            if (zEquals) {
                                                i3 = iOffsetStrToMillis2 - iOffsetStrToMillis;
                                                if (i3 > 0) {
                                                    i2 = iOffsetStrToMillis;
                                                } else {
                                                    i2 = iOffsetStrToMillis2 - DEF_DSTSAVINGS;
                                                    i3 = DEF_DSTSAVINGS;
                                                }
                                            } else {
                                                i2 = iOffsetStrToMillis2;
                                                i3 = 0;
                                            }
                                            long dateTimeString = parseDateTimeString(str3, iOffsetStrToMillis);
                                            if (z4) {
                                                z2 = zEquals;
                                                str = str3;
                                                try {
                                                    timeZoneRuleCreateRuleByRDATE = createRuleByRRULE(str6, i2, i3, dateTimeString, linkedList, iOffsetStrToMillis);
                                                } catch (IllegalArgumentException unused) {
                                                    timeZoneRuleCreateRuleByRDATE = null;
                                                }
                                            } else {
                                                z2 = zEquals;
                                                str = str3;
                                                timeZoneRuleCreateRuleByRDATE = createRuleByRDATE(str6, i2, i3, dateTimeString, linkedList, iOffsetStrToMillis);
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                            z2 = zEquals;
                                            str = str3;
                                        }
                                        if (timeZoneRuleCreateRuleByRDATE != null) {
                                            try {
                                                firstStart = timeZoneRuleCreateRuleByRDATE.getFirstStart(iOffsetStrToMillis, 0);
                                            } catch (IllegalArgumentException unused3) {
                                            }
                                            if (firstStart.getTime() < time) {
                                                time = firstStart.getTime();
                                                if (i3 <= 0 && iOffsetStrToMillis - iOffsetStrToMillis2 == DEF_DSTSAVINGS) {
                                                    int i6 = iOffsetStrToMillis - DEF_DSTSAVINGS;
                                                    i5 = DEF_DSTSAVINGS;
                                                    i4 = i6;
                                                } else {
                                                    i4 = iOffsetStrToMillis;
                                                    i5 = 0;
                                                }
                                            } else {
                                                i4 = i;
                                            }
                                            if (timeZoneRuleCreateRuleByRDATE == null) {
                                                defaultTZName = str6;
                                                zEquals = z2;
                                                str3 = str;
                                                c = 3;
                                                c2 = 3;
                                            } else {
                                                arrayList.add(timeZoneRuleCreateRuleByRDATE);
                                                defaultTZName = str6;
                                                zEquals = z2;
                                                str3 = str;
                                                c = 3;
                                                c2 = 1;
                                            }
                                        }
                                    }
                                }
                                z2 = zEquals;
                                str = str3;
                                i4 = i;
                                zEquals = z2;
                                str3 = str;
                                c = 3;
                                c2 = 3;
                            }
                            z2 = zEquals;
                            i4 = i;
                            zEquals = z2;
                            c = 3;
                        }
                        z2 = zEquals;
                        str = str3;
                        str3 = str;
                        i4 = i;
                        zEquals = z2;
                        c = 3;
                    } else {
                        z2 = zEquals;
                        str = str3;
                        if (strSubstring.equals(ICAL_TZID)) {
                            str2 = strSubstring2;
                        } else if (strSubstring.equals(ICAL_TZURL)) {
                            this.tzurl = strSubstring2;
                        } else if (strSubstring.equals(ICAL_LASTMOD)) {
                            this.lastmod = new Date(parseDateTimeString(strSubstring2, 0));
                        } else if (strSubstring.equals(ICAL_BEGIN)) {
                            zEquals = strSubstring2.equals(ICAL_DAYLIGHT);
                            if ((strSubstring2.equals(ICAL_STANDARD) || zEquals) && str2 != null) {
                                i4 = i;
                                str3 = str;
                                c = 3;
                                c2 = 2;
                                z4 = false;
                                defaultTZName = null;
                                linkedList = null;
                                str4 = null;
                                str5 = null;
                            }
                            i4 = i;
                            zEquals = z2;
                            str3 = str;
                            c = 3;
                            c2 = 3;
                        } else {
                            strSubstring.equals(ICAL_END);
                        }
                        str3 = str;
                        i4 = i;
                        zEquals = z2;
                        c = 3;
                    }
                    if (c2 == c) {
                        this.vtzlines = null;
                        return false;
                    }
                    it = it2;
                    z3 = false;
                } else {
                    i = i4;
                    z2 = zEquals;
                    str = str3;
                    if (strSubstring.equals(ICAL_BEGIN) && strSubstring2.equals(ICAL_VTIMEZONE)) {
                        i4 = i;
                        zEquals = z2;
                        str3 = str;
                        c = 3;
                        c2 = 1;
                        if (c2 == c) {
                        }
                    }
                    str3 = str;
                    i4 = i;
                    zEquals = z2;
                    c = 3;
                    if (c2 == c) {
                    }
                }
            }
        }
        int i7 = i4;
        if (arrayList.size() == 0) {
            return z3;
        }
        RuleBasedTimeZone ruleBasedTimeZone = new RuleBasedTimeZone(str2, new InitialTimeZoneRule(getDefaultTZName(str2, z3), i7, i5));
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TimeZoneRule timeZoneRule = (TimeZoneRule) arrayList.get(i10);
            if ((timeZoneRule instanceof AnnualTimeZoneRule) && ((AnnualTimeZoneRule) timeZoneRule).getEndYear() == Integer.MAX_VALUE) {
                i9++;
                i8 = i10;
            }
        }
        if (i9 > 2) {
            return false;
        }
        if (i9 != 1) {
            z = true;
        } else if (arrayList.size() == 1) {
            arrayList.clear();
            z = true;
        } else {
            AnnualTimeZoneRule annualTimeZoneRule2 = (AnnualTimeZoneRule) arrayList.get(i8);
            int rawOffset = annualTimeZoneRule2.getRawOffset();
            int dSTSavings = annualTimeZoneRule2.getDSTSavings();
            Date firstStart2 = annualTimeZoneRule2.getFirstStart(i7, i5);
            Date nextStart = firstStart2;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i8 != i11) {
                    TimeZoneRule timeZoneRule2 = (TimeZoneRule) arrayList.get(i11);
                    Date finalStart = timeZoneRule2.getFinalStart(rawOffset, dSTSavings);
                    if (finalStart.after(nextStart)) {
                        nextStart = annualTimeZoneRule2.getNextStart(finalStart.getTime(), timeZoneRule2.getRawOffset(), timeZoneRule2.getDSTSavings(), false);
                    }
                }
            }
            if (nextStart == firstStart2) {
                z = true;
                annualTimeZoneRule = new TimeArrayTimeZoneRule(annualTimeZoneRule2.getName(), annualTimeZoneRule2.getRawOffset(), annualTimeZoneRule2.getDSTSavings(), new long[]{firstStart2.getTime()}, 2);
            } else {
                z = true;
                annualTimeZoneRule = new AnnualTimeZoneRule(annualTimeZoneRule2.getName(), annualTimeZoneRule2.getRawOffset(), annualTimeZoneRule2.getDSTSavings(), annualTimeZoneRule2.getRule(), annualTimeZoneRule2.getStartYear(), C7019abT.KWHzl(nextStart.getTime(), null)[0]);
            }
            arrayList.set(i8, annualTimeZoneRule);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ruleBasedTimeZone.addTransitionRule((TimeZoneRule) it3.next());
        }
        this.tz = ruleBasedTimeZone;
        setID(str2);
        return z;
    }

    private static String getDefaultTZName(String str, boolean z) {
        if (z) {
            return str + "(DST)";
        }
        return str + "(STD)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TimeZoneRule createRuleByRRULE(String str, int i, int i2, long j, List<String> list, int i3) {
        int[] iArr;
        int i4;
        int i5;
        int length;
        int i6;
        DateTimeRule dateTimeRule;
        DateTimeRule dateTimeRule2;
        if (list == null || list.size() == 0) {
            return null;
        }
        char c = 0;
        int i7 = 1;
        long[] jArr = new long[1];
        int[] rrule = parseRRULE(list.get(0), jArr);
        if (rrule == null) {
            return null;
        }
        int i8 = rrule[0];
        int i9 = rrule[1];
        int i10 = rrule[2];
        int i11 = 3;
        int i12 = rrule[3];
        int i13 = 7;
        if (list.size() == 1) {
            if (rrule.length > 4) {
                if (rrule.length == 10 && i8 != -1 && i9 != 0) {
                    int[] iArr2 = new int[7];
                    i12 = 31;
                    for (int i14 = 0; i14 < 7; i14++) {
                        int i15 = rrule[i14 + 3];
                        iArr2[i14] = i15;
                        if (i15 <= 0) {
                            i15 = MONTHLENGTH[i8] + i15 + 1;
                        }
                        iArr2[i14] = i15;
                        if (i15 < i12) {
                            i12 = i15;
                        }
                    }
                    int i16 = 1;
                    while (i16 < 7) {
                        for (int i17 = 0; i17 < 7; i17++) {
                            if (iArr2[i17] == i12 + i16) {
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            iArr = null;
            i4 = i3;
        } else {
            if (i8 == -1 || i9 == 0 || i12 == 0 || list.size() > 7) {
                return null;
            }
            int length2 = rrule.length - 3;
            int i18 = 31;
            for (int i19 = 0; i19 < length2; i19++) {
                int i20 = rrule[i19 + 3];
                if (i20 <= 0) {
                    i20 = MONTHLENGTH[i8] + i20 + 1;
                }
                int i21 = i20;
                if (i21 < i18) {
                    i18 = i21;
                }
            }
            int i22 = 1;
            int i23 = i8;
            int i24 = -1;
            while (i22 < list.size()) {
                long[] jArr2 = new long[i7];
                int[] rrule2 = parseRRULE(list.get(i22), jArr2);
                if (jArr2[c] > jArr[c]) {
                    jArr = jArr2;
                }
                int i25 = rrule2[c];
                if (i25 == -1 || (i5 = rrule2[i7]) == 0 || rrule2[i11] == 0 || (length2 = length2 + (length = rrule2.length - i11)) > 7 || i5 != i9) {
                    return null;
                }
                if (i25 != i8) {
                    if (i24 == -1) {
                        int i26 = i25 - i8;
                        if (i26 == -11 || i26 == -1) {
                            i23 = i25;
                            i18 = 31;
                        } else if (i26 != 11 && i26 != 1) {
                            return null;
                        }
                        i24 = i25;
                    } else if (i25 != i8 && i25 != i24) {
                        return null;
                    }
                }
                if (i25 == i23) {
                    for (int i27 = 0; i27 < length; i27++) {
                        int i28 = rrule2[i27 + 3];
                        if (i28 <= 0) {
                            i28 = MONTHLENGTH[rrule2[0]] + i28 + 1;
                        }
                        if (i28 < i18) {
                            i18 = i28;
                        }
                    }
                }
                i22++;
                c = 0;
                i7 = 1;
                i11 = 3;
                i13 = 7;
            }
            iArr = null;
            if (length2 != i13) {
                return null;
            }
            i4 = i3;
            i8 = i23;
            i12 = i18;
        }
        int[] iArrKWHzl = C7019abT.KWHzl(j + ((long) i4), iArr);
        int i29 = iArrKWHzl[0];
        int i30 = i8 == -1 ? iArrKWHzl[1] : i8;
        if (i9 == 0 && i10 == 0 && i12 == 0) {
            i12 = iArrKWHzl[2];
        }
        int i31 = iArrKWHzl[5];
        long j2 = jArr[0];
        if (j2 != Long.MIN_VALUE) {
            C7019abT.KWHzl(j2, iArrKWHzl);
            i6 = iArrKWHzl[0];
        } else {
            i6 = Integer.MAX_VALUE;
        }
        int i32 = i6;
        if (i9 == 0 && i10 == 0 && i12 != 0) {
            dateTimeRule2 = new DateTimeRule(i30, i12, i31, 0);
        } else {
            if (i9 != 0 && i10 != 0 && i12 == 0) {
                dateTimeRule = new DateTimeRule(i30, i10, i9, i31, 0);
            } else {
                if (i9 == 0 || i10 != 0 || i12 == 0) {
                    return null;
                }
                dateTimeRule = new DateTimeRule(i30, i12, i9, true, i31, 0);
            }
            dateTimeRule2 = dateTimeRule;
        }
        return new AnnualTimeZoneRule(str, i, i2, dateTimeRule2, i29, i32);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int[] parseRRULE(String str, long[] jArr) {
        int[] iArr;
        int i;
        String[] strArr;
        int i2;
        int i3;
        StringTokenizer stringTokenizer = new StringTokenizer(str, SEMICOLON);
        long dateTimeString = Long.MIN_VALUE;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        int i7 = 0;
        int[] iArr2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("=");
            if (iIndexOf != i4) {
                String strSubstring = strNextToken.substring(0, iIndexOf);
                String strSubstring2 = strNextToken.substring(iIndexOf + 1);
                if (strSubstring.equals(ICAL_FREQ)) {
                    if (strSubstring2.equals(ICAL_YEARLY)) {
                        z2 = true;
                        i4 = -1;
                    }
                } else if (strSubstring.equals(ICAL_UNTIL)) {
                    try {
                        dateTimeString = parseDateTimeString(strSubstring2, 0);
                        i4 = -1;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (strSubstring.equals(ICAL_BYMONTH)) {
                    if (strSubstring2.length() <= 2 && Integer.parseInt(strSubstring2) - 1 >= 0 && i5 < 12) {
                        i4 = -1;
                    }
                } else {
                    if (strSubstring.equals(ICAL_BYDAY)) {
                        int length = strSubstring2.length();
                        if (length >= 2 && length <= 4) {
                            if (length > 2) {
                                if (strSubstring2.charAt(0) != '+') {
                                    if (strSubstring2.charAt(0) == '-') {
                                        i2 = -1;
                                        int i8 = length - 2;
                                        i3 = Integer.parseInt(strSubstring2.substring(length - 3, i8));
                                        if (i3 != 0 && i3 <= 4) {
                                            strSubstring2 = strSubstring2.substring(i8);
                                            i6 = i3 * i2;
                                            i = 0;
                                            while (true) {
                                                strArr = ICAL_DOW_NAMES;
                                                if (i >= strArr.length) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                i++;
                                            }
                                            if (i >= strArr.length) {
                                            }
                                        }
                                    } else {
                                        if (length == 4) {
                                        }
                                        i2 = 1;
                                        int i82 = length - 2;
                                        i3 = Integer.parseInt(strSubstring2.substring(length - 3, i82));
                                        if (i3 != 0) {
                                        }
                                    }
                                } else {
                                    i2 = 1;
                                    int i822 = length - 2;
                                    i3 = Integer.parseInt(strSubstring2.substring(length - 3, i822));
                                    if (i3 != 0) {
                                    }
                                }
                            } else {
                                i = 0;
                                while (true) {
                                    strArr = ICAL_DOW_NAMES;
                                    if (i >= strArr.length || strSubstring2.equals(strArr[i])) {
                                        break;
                                    }
                                    i++;
                                }
                                if (i >= strArr.length) {
                                    i7 = i + 1;
                                }
                            }
                        }
                    } else if (strSubstring.equals(ICAL_BYMONTHDAY)) {
                        StringTokenizer stringTokenizer2 = new StringTokenizer(strSubstring2, COMMA);
                        iArr2 = new int[stringTokenizer2.countTokens()];
                        int i9 = 0;
                        while (stringTokenizer2.hasMoreTokens()) {
                            try {
                                iArr2[i9] = Integer.parseInt(stringTokenizer2.nextToken());
                                i9++;
                            } catch (NumberFormatException unused2) {
                                z = true;
                            }
                        }
                    }
                    i4 = -1;
                }
            }
            z = true;
        }
        if (z || !z2) {
            return null;
        }
        jArr[0] = dateTimeString;
        if (iArr2 == null) {
            iArr = new int[4];
            iArr[3] = 0;
        } else {
            iArr = new int[iArr2.length + 3];
            for (int i10 = 0; i10 < iArr2.length; i10++) {
                iArr[i10 + 3] = iArr2[i10];
            }
        }
        iArr[0] = i5;
        iArr[1] = i7;
        iArr[2] = i6;
        return iArr;
    }

    private static TimeZoneRule createRuleByRDATE(String str, int i, int i2, long j, List<String> list, int i3) {
        long[] jArr;
        int i4 = 0;
        if (list == null || list.size() == 0) {
            jArr = new long[]{j};
        } else {
            long[] jArr2 = new long[list.size()];
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    jArr2[i4] = parseDateTimeString(it.next(), i3);
                    i4++;
                }
                jArr = jArr2;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return new TimeArrayTimeZoneRule(str, i, i2, jArr, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fa, code lost:
    
        r15 = r60;
        r45 = r7;
        r2 = r9;
        r4 = r12;
        r0 = r18;
        r8 = r19;
        r13 = r24;
        r14 = r25;
        r7 = r1;
        r1 = r11;
        r11 = r22;
        r10 = r49;
        r56 = r6;
        r6 = r5;
        r5 = r56;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeZone(Writer writer, BasicTimeZone basicTimeZone, String[] strArr) throws IOException {
        int i;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int rawOffset;
        int i7;
        int i8;
        int i9;
        long j;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String str3;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z3;
        int i30;
        BasicTimeZone basicTimeZone2;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        String str4;
        int i40;
        String str5;
        int i41;
        int i42;
        String str6;
        int i43;
        int i44;
        int i45;
        int i46;
        String str7;
        int i47;
        int i48;
        int i49;
        int i50;
        boolean z4;
        int i51;
        BasicTimeZone basicTimeZone3 = basicTimeZone;
        writeHeader(writer);
        boolean z5 = false;
        if (strArr != null && strArr.length > 0) {
            for (String str8 : strArr) {
                if (str8 != null) {
                    writer.write(str8);
                    writer.write(NEWLINE);
                }
            }
        }
        int[] iArr = new int[6];
        long j2 = Long.MIN_VALUE;
        String str9 = null;
        String str10 = null;
        AnnualTimeZoneRule annualTimeZoneRule = null;
        AnnualTimeZoneRule annualTimeZoneRule2 = null;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (true) {
            C7261agW nextTransition = basicTimeZone3.getNextTransition(j2, z5);
            if (nextTransition == null) {
                i = i53;
                i2 = i55;
                str = str9;
                i3 = i59;
                z = z5;
                i4 = i70;
                z2 = true;
                break;
            }
            long jKWHzl = nextTransition.KWHzl();
            String name = nextTransition.OLrzqt().getName();
            boolean z6 = nextTransition.OLrzqt().getDSTSavings() != 0 ? true : z5;
            rawOffset = nextTransition.EZpvd().getRawOffset() + nextTransition.EZpvd().getDSTSavings();
            int dSTSavings = nextTransition.EZpvd().getDSTSavings();
            int rawOffset2 = nextTransition.OLrzqt().getRawOffset() + nextTransition.OLrzqt().getDSTSavings();
            int i71 = i53;
            int i72 = i54;
            C7019abT.KWHzl(nextTransition.KWHzl() + ((long) rawOffset), iArr);
            z = false;
            int i73 = i55;
            int iOLrzqt = C7019abT.OLrzqt(iArr[0], iArr[1], iArr[2]);
            int i74 = iArr[0];
            if (z6) {
                if (annualTimeZoneRule2 == null && (nextTransition.OLrzqt() instanceof AnnualTimeZoneRule)) {
                    str5 = str9;
                    if (((AnnualTimeZoneRule) nextTransition.OLrzqt()).getEndYear() == Integer.MAX_VALUE) {
                        annualTimeZoneRule2 = (AnnualTimeZoneRule) nextTransition.OLrzqt();
                    }
                } else {
                    str5 = str9;
                }
                if (i62 > 0) {
                    if (i74 == i65 + i62 && name.equals(str10) && i58 == rawOffset && i61 == rawOffset2 && i57 == iArr[1] && i59 == iArr[3] && i56 == iOLrzqt && i60 == iArr[5]) {
                        i51 = i62 + 1;
                        j4 = jKWHzl;
                        z4 = true;
                    } else {
                        i51 = i62;
                        z4 = false;
                    }
                    if (z4) {
                        i41 = i74;
                        i42 = iOLrzqt;
                        i50 = i51;
                        str6 = str10;
                        i43 = i59;
                        i44 = i60;
                        i45 = rawOffset2;
                        i46 = i72;
                        i2 = i73;
                        i = i71;
                        str = str5;
                        str7 = name;
                        i47 = i56;
                        i48 = i57;
                        i49 = i58;
                    } else if (i51 == 1) {
                        i45 = rawOffset2;
                        str7 = name;
                        i = i71;
                        i41 = i74;
                        i46 = i72;
                        i42 = iOLrzqt;
                        i2 = i73;
                        i47 = i56;
                        i48 = i57;
                        i49 = i58;
                        writeZonePropsByTime(writer, true, str10, i58, i61, j3, true);
                        i50 = i51;
                        str6 = str10;
                        i43 = i59;
                        i44 = i60;
                        str = str5;
                    } else {
                        i41 = i74;
                        i42 = iOLrzqt;
                        i45 = rawOffset2;
                        i46 = i72;
                        i2 = i73;
                        i = i71;
                        str7 = name;
                        i47 = i56;
                        i48 = i57;
                        i49 = i58;
                        i50 = i51;
                        str6 = str10;
                        str = str5;
                        i43 = i59;
                        i44 = i60;
                        writeZonePropsByDOW(writer, true, str10, i49, i61, i48, i47, i59, j3, j4);
                    }
                } else {
                    i41 = i74;
                    i42 = iOLrzqt;
                    str6 = str10;
                    i43 = i59;
                    i44 = i60;
                    i45 = rawOffset2;
                    i46 = i72;
                    i2 = i73;
                    i = i71;
                    str = str5;
                    str7 = name;
                    i47 = i56;
                    i48 = i57;
                    i49 = i58;
                    i50 = i62;
                    z4 = false;
                }
                z2 = true;
                if (z4) {
                    i3 = i43;
                    i60 = i44;
                    i62 = i50;
                    str10 = str6;
                    i56 = i47;
                    i57 = i48;
                    i58 = i49;
                } else {
                    int i75 = iArr[1];
                    i3 = iArr[3];
                    i57 = i75;
                    i60 = iArr[5];
                    i62 = 1;
                    str10 = str7;
                    i58 = rawOffset;
                    j3 = jKWHzl;
                    j4 = j3;
                    i68 = dSTSavings;
                    i61 = i45;
                    i65 = i41;
                    i56 = i42;
                }
                if (annualTimeZoneRule != null && annualTimeZoneRule2 != null) {
                    i4 = 1;
                    break;
                }
                i27 = i52;
                i18 = i56;
                i31 = 1;
                i53 = i;
                i54 = i46;
                i55 = i2;
                str9 = str;
                i59 = i3;
                i24 = i61;
                basicTimeZone2 = basicTimeZone;
            } else {
                String str11 = str9;
                String str12 = str10;
                int i76 = i59;
                int i77 = i60;
                int i78 = i71;
                i18 = i56;
                int i79 = i57;
                i5 = i58;
                if (annualTimeZoneRule == null && (nextTransition.OLrzqt() instanceof AnnualTimeZoneRule) && ((AnnualTimeZoneRule) nextTransition.OLrzqt()).getEndYear() == Integer.MAX_VALUE) {
                    annualTimeZoneRule = (AnnualTimeZoneRule) nextTransition.OLrzqt();
                }
                if (i64 > 0) {
                    if (i74 == i63 + i64) {
                        str4 = str11;
                        if (name.equals(str4)) {
                            i34 = i67;
                            if (i34 == rawOffset) {
                                i35 = rawOffset2;
                                i38 = i73;
                                if (i38 == i35) {
                                    i33 = i66;
                                    if (i33 == iArr[1]) {
                                        i36 = i78;
                                        i32 = i52;
                                        if (i36 == iArr[3]) {
                                            i39 = iOLrzqt;
                                            if (i32 == i39) {
                                                i37 = i72;
                                                if (i37 == iArr[5]) {
                                                    i40 = i64 + 1;
                                                    j5 = jKWHzl;
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                    i29 = i40;
                                                    i19 = i37;
                                                    i23 = i32;
                                                    i27 = i39;
                                                    i78 = i36;
                                                    i20 = i38;
                                                    i21 = i33;
                                                    i26 = i35;
                                                } else if (i40 == 1) {
                                                    i29 = i40;
                                                    i19 = i37;
                                                    i23 = i32;
                                                    i27 = i39;
                                                    i78 = i36;
                                                    i20 = i38;
                                                    i21 = i33;
                                                    i26 = i35;
                                                    writeZonePropsByTime(writer, false, str4, i34, i38, j6, true);
                                                } else {
                                                    i29 = i40;
                                                    i19 = i37;
                                                    i23 = i32;
                                                    i27 = i39;
                                                    i78 = i36;
                                                    i20 = i38;
                                                    i21 = i33;
                                                    i26 = i35;
                                                    str3 = str4;
                                                    i22 = i34;
                                                    i28 = i74;
                                                    i24 = i61;
                                                    i25 = 1;
                                                    writeZonePropsByDOW(writer, false, str4, i34, i20, i21, i23, i78, j6, j5);
                                                }
                                                str3 = str4;
                                                i22 = i34;
                                                i28 = i74;
                                                i24 = i61;
                                                i25 = 1;
                                            } else {
                                                i37 = i72;
                                            }
                                        }
                                        i37 = i72;
                                        i39 = iOLrzqt;
                                    } else {
                                        i32 = i52;
                                    }
                                } else {
                                    i32 = i52;
                                    i33 = i66;
                                }
                                i36 = i78;
                                i37 = i72;
                                i39 = iOLrzqt;
                            } else {
                                i32 = i52;
                                i33 = i66;
                            }
                        } else {
                            i32 = i52;
                            i33 = i66;
                            i34 = i67;
                        }
                        i35 = rawOffset2;
                        i36 = i78;
                        i37 = i72;
                        i38 = i73;
                        i39 = iOLrzqt;
                    } else {
                        i32 = i52;
                        i33 = i66;
                        i34 = i67;
                        i35 = rawOffset2;
                        i36 = i78;
                        i37 = i72;
                        i38 = i73;
                        i39 = iOLrzqt;
                        str4 = str11;
                    }
                    i40 = i64;
                    z3 = false;
                    if (!z3) {
                    }
                    str3 = str4;
                    i22 = i34;
                    i28 = i74;
                    i24 = i61;
                    i25 = 1;
                } else {
                    i19 = i72;
                    i20 = i73;
                    i21 = i66;
                    i22 = i67;
                    str3 = str11;
                    i23 = i52;
                    i24 = i61;
                    i25 = 1;
                    i26 = rawOffset2;
                    i27 = iOLrzqt;
                    i28 = i74;
                    i29 = i64;
                    z3 = false;
                }
                if (z3) {
                    i27 = i23;
                    str9 = str3;
                    i64 = i29;
                    i54 = i19;
                    i53 = i78;
                    i55 = i20;
                    i30 = i21;
                    rawOffset = i22;
                } else {
                    i30 = iArr[i25];
                    i53 = iArr[3];
                    i54 = iArr[5];
                    i64 = i25;
                    str9 = name;
                    j5 = jKWHzl;
                    j6 = j5;
                    i69 = dSTSavings;
                    i55 = i26;
                    i63 = i28;
                }
                if (annualTimeZoneRule != null && annualTimeZoneRule2 != null) {
                    i7 = i30;
                    i9 = i53;
                    i2 = i55;
                    i14 = i25;
                    i15 = i62;
                    i8 = i64;
                    i10 = i76;
                    str2 = str12;
                    i11 = i18;
                    i12 = i79;
                    i6 = i27;
                    i13 = i24;
                    str = str9;
                    j = j3;
                    break;
                }
                basicTimeZone2 = basicTimeZone;
                i31 = i25;
                i66 = i30;
                i67 = rawOffset;
                i59 = i76;
                i60 = i77;
                str10 = str12;
                i57 = i79;
                i58 = i5;
            }
            basicTimeZone3 = basicTimeZone2;
            j2 = jKWHzl;
            z5 = false;
            i52 = i27;
            i61 = i24;
            i70 = i31;
            i56 = i18;
        }
        if (i14 == 0) {
            int offset = basicTimeZone.getOffset(0L);
            boolean z7 = offset != basicTimeZone.getRawOffset() ? true : z;
            writeZonePropsByTime(writer, z7, getDefaultTZName(basicTimeZone.getID(), z7), offset, offset, 0 - ((long) offset), false);
        } else {
            int i80 = i7;
            if (i15 <= 0) {
                i16 = i9;
                i17 = i8;
                if (i17 > 0) {
                    if (annualTimeZoneRule == null) {
                        if (i17 == 1) {
                            writeZonePropsByTime(writer, false, str, rawOffset, i2, j6, true);
                        } else {
                            writeZonePropsByDOW(writer, false, str, rawOffset, i2, i80, i6, i16, j6, j5);
                        }
                    } else if (i17 == 1) {
                        writeFinalRule(writer, false, annualTimeZoneRule, rawOffset - i69, i69, j6);
                    } else if (isEquivalentDateRule(i80, i6, i16, annualTimeZoneRule.getRule())) {
                        writeZonePropsByDOW(writer, false, str, rawOffset, i2, i80, i6, i16, j6, Long.MAX_VALUE);
                    } else {
                        writeZonePropsByDOW(writer, false, str, rawOffset, i2, i80, i6, i16, j6, j5);
                        int i81 = rawOffset - i69;
                        Date nextStart = annualTimeZoneRule.getNextStart(j5, i81, i69, false);
                        if (nextStart != null) {
                            writeFinalRule(writer, false, annualTimeZoneRule, i81, i69, nextStart.getTime());
                        }
                    }
                }
            } else {
                if (annualTimeZoneRule2 != null) {
                    i16 = i9;
                    i17 = i8;
                    if (i15 == 1) {
                        writeFinalRule(writer, true, annualTimeZoneRule2, i5 - i68, i68, j);
                    } else if (isEquivalentDateRule(i12, i11, i10, annualTimeZoneRule2.getRule())) {
                        writeZonePropsByDOW(writer, true, str2, i5, i13, i12, i11, i10, j, Long.MAX_VALUE);
                    } else {
                        writeZonePropsByDOW(writer, true, str2, i5, i13, i12, i11, i10, j, j4);
                        int i82 = i5 - i68;
                        Date nextStart2 = annualTimeZoneRule2.getNextStart(j4, i82, i68, false);
                        if (nextStart2 != null) {
                            writeFinalRule(writer, true, annualTimeZoneRule2, i82, i68, nextStart2.getTime());
                        }
                    }
                } else if (i15 == 1) {
                    writeZonePropsByTime(writer, true, str2, i5, i13, j, true);
                    i16 = i9;
                    i17 = i8;
                } else {
                    i16 = i9;
                    i17 = i8;
                    writeZonePropsByDOW(writer, true, str2, i5, i13, i12, i11, i10, j, j4);
                }
                if (i17 > 0) {
                }
            }
        }
        writeFooter(writer);
    }

    private static boolean isEquivalentDateRule(int i, int i2, int i3, DateTimeRule dateTimeRule) {
        if (i != dateTimeRule.getRuleMonth() || i3 != dateTimeRule.getRuleDayOfWeek() || dateTimeRule.getTimeRuleType() != 0) {
            return false;
        }
        if (dateTimeRule.getDateRuleType() == 1 && dateTimeRule.getRuleWeekInMonth() == i2) {
            return true;
        }
        int ruleDayOfMonth = dateTimeRule.getRuleDayOfMonth();
        if (dateTimeRule.getDateRuleType() == 2) {
            if (ruleDayOfMonth % 7 == 1 && (ruleDayOfMonth + 6) / 7 == i2) {
                return true;
            }
            if (i != 1) {
                int i4 = MONTHLENGTH[i] - ruleDayOfMonth;
                if (i4 % 7 == 6 && i2 == ((i4 + 1) / 7) * (-1)) {
                    return true;
                }
            }
        }
        if (dateTimeRule.getDateRuleType() == 3) {
            if (ruleDayOfMonth % 7 == 0 && ruleDayOfMonth / 7 == i2) {
                return true;
            }
            if (i != 1) {
                int i5 = MONTHLENGTH[i] - ruleDayOfMonth;
                if (i5 % 7 == 0 && i2 == ((i5 / 7) + 1) * (-1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void writeZonePropsByTime(Writer writer, boolean z, String str, int i, int i2, long j, boolean z2) throws IOException {
        beginZoneProps(writer, z, str, i, i2, j);
        if (z2) {
            writer.write(ICAL_RDATE);
            writer.write(":");
            writer.write(getDateTimeString(j + ((long) i)));
            writer.write(NEWLINE);
        }
        endZoneProps(writer, z);
    }

    private static void writeZonePropsByDOM(Writer writer, boolean z, String str, int i, int i2, int i3, int i4, long j, long j2) throws IOException {
        beginZoneProps(writer, z, str, i, i2, j);
        beginRRULE(writer, i3);
        writer.write(ICAL_BYMONTHDAY);
        writer.write("=");
        writer.write(Integer.toString(i4));
        if (j2 != Long.MAX_VALUE) {
            appendUNTIL(writer, getDateTimeString(j2 + ((long) i)));
        }
        writer.write(NEWLINE);
        endZoneProps(writer, z);
    }

    private static void writeZonePropsByDOW(Writer writer, boolean z, String str, int i, int i2, int i3, int i4, int i5, long j, long j2) throws IOException {
        beginZoneProps(writer, z, str, i, i2, j);
        beginRRULE(writer, i3);
        writer.write(ICAL_BYDAY);
        writer.write("=");
        writer.write(Integer.toString(i4));
        writer.write(ICAL_DOW_NAMES[i5 - 1]);
        if (j2 != Long.MAX_VALUE) {
            appendUNTIL(writer, getDateTimeString(j2 + ((long) i)));
        }
        writer.write(NEWLINE);
        endZoneProps(writer, z);
    }

    private static void writeZonePropsByDOW_GEQ_DOM(Writer writer, boolean z, String str, int i, int i2, int i3, int i4, int i5, long j, long j2) throws IOException {
        int i6;
        int i7;
        int i8 = 7;
        if (i4 % 7 == 1) {
            writeZonePropsByDOW(writer, z, str, i, i2, i3, (i4 + 6) / 7, i5, j, j2);
            return;
        }
        if (i3 != 1) {
            int i9 = MONTHLENGTH[i3] - i4;
            if (i9 % 7 == 6) {
                writeZonePropsByDOW(writer, z, str, i, i2, i3, ((i9 + 1) / 7) * (-1), i5, j, j2);
                return;
            }
        }
        beginZoneProps(writer, z, str, i, i2, j);
        if (i4 <= 0) {
            int i10 = 1 - i4;
            int i11 = i3 - 1;
            writeZonePropsByDOW_GEQ_DOM_sub(writer, i11 < 0 ? 11 : i11, -i10, i5, i10, Long.MAX_VALUE, i);
            i6 = 7 - i10;
            i7 = 1;
        } else {
            int i12 = i4 + 6;
            int i13 = MONTHLENGTH[i3];
            if (i12 > i13) {
                int i14 = i12 - i13;
                int i15 = i3 + 1;
                writeZonePropsByDOW_GEQ_DOM_sub(writer, i15 > 11 ? 0 : i15, 1, i5, i14, Long.MAX_VALUE, i);
                i8 = 7 - i14;
            }
            i6 = i8;
            i7 = i4;
        }
        writeZonePropsByDOW_GEQ_DOM_sub(writer, i3, i7, i5, i6, j2, i);
        endZoneProps(writer, z);
    }

    private static void writeZonePropsByDOW_GEQ_DOM_sub(Writer writer, int i, int i2, int i3, int i4, long j, int i5) throws IOException {
        boolean z = i == 1;
        if (i2 < 0 && !z) {
            i2 = MONTHLENGTH[i] + i2 + 1;
        }
        beginRRULE(writer, i);
        writer.write(ICAL_BYDAY);
        writer.write("=");
        writer.write(ICAL_DOW_NAMES[i3 - 1]);
        writer.write(SEMICOLON);
        writer.write(ICAL_BYMONTHDAY);
        writer.write("=");
        writer.write(Integer.toString(i2));
        for (int i6 = 1; i6 < i4; i6++) {
            writer.write(COMMA);
            writer.write(Integer.toString(i2 + i6));
        }
        if (j != Long.MAX_VALUE) {
            appendUNTIL(writer, getDateTimeString(j + ((long) i5)));
        }
        writer.write(NEWLINE);
    }

    private static void writeZonePropsByDOW_LEQ_DOM(Writer writer, boolean z, String str, int i, int i2, int i3, int i4, int i5, long j, long j2) throws IOException {
        if (i4 % 7 == 0) {
            writeZonePropsByDOW(writer, z, str, i, i2, i3, i4 / 7, i5, j, j2);
            return;
        }
        if (i3 != 1) {
            int i6 = MONTHLENGTH[i3] - i4;
            if (i6 % 7 == 0) {
                writeZonePropsByDOW(writer, z, str, i, i2, i3, ((i6 / 7) + 1) * (-1), i5, j, j2);
                return;
            }
        }
        if (i3 == 1 && i4 == 29) {
            writeZonePropsByDOW(writer, z, str, i, i2, 1, -1, i5, j, j2);
        } else {
            writeZonePropsByDOW_GEQ_DOM(writer, z, str, i, i2, i3, i4 - 6, i5, j, j2);
        }
    }

    private static void writeFinalRule(Writer writer, boolean z, AnnualTimeZoneRule annualTimeZoneRule, int i, int i2, long j) throws IOException {
        DateTimeRule wallTimeRule = toWallTimeRule(annualTimeZoneRule.getRule(), i, i2);
        int ruleMillisInDay = wallTimeRule.getRuleMillisInDay();
        long j2 = ruleMillisInDay < 0 ? j + ((long) (0 - ruleMillisInDay)) : ruleMillisInDay >= 86400000 ? j - ((long) (ruleMillisInDay - 86399999)) : j;
        int rawOffset = annualTimeZoneRule.getRawOffset() + annualTimeZoneRule.getDSTSavings();
        int dateRuleType = wallTimeRule.getDateRuleType();
        if (dateRuleType == 0) {
            writeZonePropsByDOM(writer, z, annualTimeZoneRule.getName(), i + i2, rawOffset, wallTimeRule.getRuleMonth(), wallTimeRule.getRuleDayOfMonth(), j2, Long.MAX_VALUE);
            return;
        }
        if (dateRuleType == 1) {
            writeZonePropsByDOW(writer, z, annualTimeZoneRule.getName(), i + i2, rawOffset, wallTimeRule.getRuleMonth(), wallTimeRule.getRuleWeekInMonth(), wallTimeRule.getRuleDayOfWeek(), j2, Long.MAX_VALUE);
        } else if (dateRuleType == 2) {
            writeZonePropsByDOW_GEQ_DOM(writer, z, annualTimeZoneRule.getName(), i + i2, rawOffset, wallTimeRule.getRuleMonth(), wallTimeRule.getRuleDayOfMonth(), wallTimeRule.getRuleDayOfWeek(), j2, Long.MAX_VALUE);
        } else {
            if (dateRuleType != 3) {
                return;
            }
            writeZonePropsByDOW_LEQ_DOM(writer, z, annualTimeZoneRule.getName(), i + i2, rawOffset, wallTimeRule.getRuleMonth(), wallTimeRule.getRuleDayOfMonth(), wallTimeRule.getRuleDayOfWeek(), j2, Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[PHI: r0 r1 r4 r5
  0x0080: PHI (r0v6 int) = (r0v5 int), (r0v11 int), (r0v11 int) binds: [B:19:0x003e, B:38:0x0073, B:42:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r1v2 int) = (r1v1 int), (r1v6 int), (r1v6 int) binds: [B:19:0x003e, B:38:0x0073, B:42:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r4v1 int) = (r4v0 int), (r4v0 int), (r4v3 int) binds: [B:19:0x003e, B:38:0x0073, B:42:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r5v1 int) = (r5v0 int), (r5v4 int), (r5v4 int) binds: [B:19:0x003e, B:38:0x0073, B:42:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static DateTimeRule toWallTimeRule(DateTimeRule dateTimeRule, int i, int i2) {
        int i3;
        int i4;
        int dateRuleType;
        int i5;
        int i6;
        if (dateTimeRule.getTimeRuleType() == 0) {
            return dateTimeRule;
        }
        int ruleMillisInDay = dateTimeRule.getRuleMillisInDay();
        if (dateTimeRule.getTimeRuleType() == 2) {
            ruleMillisInDay += i + i2;
        } else if (dateTimeRule.getTimeRuleType() == 1) {
            ruleMillisInDay += i2;
        }
        if (ruleMillisInDay < 0) {
            ruleMillisInDay += 86400000;
            i3 = -1;
        } else {
            if (ruleMillisInDay >= 86400000) {
                i4 = ruleMillisInDay - 86400000;
                i3 = 1;
                int ruleMonth = dateTimeRule.getRuleMonth();
                int ruleDayOfMonth = dateTimeRule.getRuleDayOfMonth();
                int ruleDayOfWeek = dateTimeRule.getRuleDayOfWeek();
                dateRuleType = dateTimeRule.getDateRuleType();
                if (i3 == 0) {
                    i5 = ruleDayOfMonth;
                    i6 = ruleDayOfWeek;
                } else {
                    if (dateRuleType == 1) {
                        int ruleWeekInMonth = dateTimeRule.getRuleWeekInMonth();
                        if (ruleWeekInMonth > 0) {
                            ruleDayOfMonth = ((ruleWeekInMonth - 1) * 7) + 1;
                            dateRuleType = 2;
                        } else {
                            ruleDayOfMonth = MONTHLENGTH[ruleMonth] + ((ruleWeekInMonth + 1) * 7);
                            dateRuleType = 3;
                        }
                    }
                    ruleDayOfMonth += i3;
                    if (ruleDayOfMonth == 0) {
                        ruleMonth--;
                        if (ruleMonth < 0) {
                            ruleMonth = 11;
                        }
                        ruleDayOfMonth = MONTHLENGTH[ruleMonth];
                    } else if (ruleDayOfMonth > MONTHLENGTH[ruleMonth]) {
                        ruleMonth++;
                        if (ruleMonth > 11) {
                            ruleMonth = 0;
                        }
                        ruleDayOfMonth = 1;
                    }
                    if (dateRuleType != 0) {
                        ruleDayOfWeek += i3;
                        if (ruleDayOfWeek < 1) {
                            i6 = 7;
                            i5 = ruleDayOfMonth;
                        } else if (ruleDayOfWeek > 7) {
                            i5 = ruleDayOfMonth;
                            i6 = 1;
                        }
                    }
                }
                if (dateRuleType != 0) {
                    return new DateTimeRule(ruleMonth, i5, i4, 0);
                }
                return new DateTimeRule(ruleMonth, i5, i6, dateRuleType == 2, i4, 0);
            }
            i3 = 0;
        }
        i4 = ruleMillisInDay;
        int ruleMonth2 = dateTimeRule.getRuleMonth();
        int ruleDayOfMonth2 = dateTimeRule.getRuleDayOfMonth();
        int ruleDayOfWeek2 = dateTimeRule.getRuleDayOfWeek();
        dateRuleType = dateTimeRule.getDateRuleType();
        if (i3 == 0) {
        }
        if (dateRuleType != 0) {
        }
    }

    private static void beginZoneProps(Writer writer, boolean z, String str, int i, int i2, long j) throws IOException {
        writer.write(ICAL_BEGIN);
        writer.write(":");
        if (z) {
            writer.write(ICAL_DAYLIGHT);
        } else {
            writer.write(ICAL_STANDARD);
        }
        writer.write(NEWLINE);
        writer.write(ICAL_TZOFFSETTO);
        writer.write(":");
        writer.write(millisToOffset(i2));
        writer.write(NEWLINE);
        writer.write(ICAL_TZOFFSETFROM);
        writer.write(":");
        writer.write(millisToOffset(i));
        writer.write(NEWLINE);
        writer.write(ICAL_TZNAME);
        writer.write(":");
        writer.write(str);
        writer.write(NEWLINE);
        writer.write(ICAL_DTSTART);
        writer.write(":");
        writer.write(getDateTimeString(j + ((long) i)));
        writer.write(NEWLINE);
    }

    private static void endZoneProps(Writer writer, boolean z) throws IOException {
        writer.write(ICAL_END);
        writer.write(":");
        if (z) {
            writer.write(ICAL_DAYLIGHT);
        } else {
            writer.write(ICAL_STANDARD);
        }
        writer.write(NEWLINE);
    }

    private static void beginRRULE(Writer writer, int i) throws IOException {
        writer.write(ICAL_RRULE);
        writer.write(":");
        writer.write(ICAL_FREQ);
        writer.write("=");
        writer.write(ICAL_YEARLY);
        writer.write(SEMICOLON);
        writer.write(ICAL_BYMONTH);
        writer.write("=");
        writer.write(Integer.toString(i + 1));
        writer.write(SEMICOLON);
    }

    private static void appendUNTIL(Writer writer, String str) throws IOException {
        if (str != null) {
            writer.write(SEMICOLON);
            writer.write(ICAL_UNTIL);
            writer.write("=");
            writer.write(str);
        }
    }

    private void writeHeader(Writer writer) throws IOException {
        writer.write(ICAL_BEGIN);
        writer.write(":");
        writer.write(ICAL_VTIMEZONE);
        writer.write(NEWLINE);
        writer.write(ICAL_TZID);
        writer.write(":");
        writer.write(this.tz.getID());
        writer.write(NEWLINE);
        if (this.tzurl != null) {
            writer.write(ICAL_TZURL);
            writer.write(":");
            writer.write(this.tzurl);
            writer.write(NEWLINE);
        }
        if (this.lastmod != null) {
            writer.write(ICAL_LASTMOD);
            writer.write(":");
            writer.write(getUTCDateTimeString(this.lastmod.getTime()));
            writer.write(NEWLINE);
        }
    }

    private static void writeFooter(Writer writer) throws IOException {
        writer.write(ICAL_END);
        writer.write(":");
        writer.write(ICAL_VTIMEZONE);
        writer.write(NEWLINE);
    }

    private static String getDateTimeString(long j) {
        int[] iArrKWHzl = C7019abT.KWHzl(j, null);
        StringBuilder sb = new StringBuilder(15);
        sb.append(numToString(iArrKWHzl[0], 4));
        sb.append(numToString(iArrKWHzl[1] + 1, 2));
        sb.append(numToString(iArrKWHzl[2], 2));
        sb.append('T');
        int i = iArrKWHzl[5];
        int i2 = i / DEF_DSTSAVINGS;
        int i3 = i % DEF_DSTSAVINGS;
        sb.append(numToString(i2, 2));
        sb.append(numToString(i3 / 60000, 2));
        sb.append(numToString((i3 % 60000) / 1000, 2));
        return sb.toString();
    }

    private static String getUTCDateTimeString(long j) {
        return getDateTimeString(j) + "Z";
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long parseDateTimeString(String str, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length;
        boolean z2 = false;
        if (str != null && (((length = str.length()) == 15 || length == 16) && str.charAt(8) == 'T')) {
            if (length == 16) {
                if (str.charAt(15) == 'Z') {
                    z = true;
                }
                i2 = 0;
                z = false;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
            } else {
                z = false;
            }
            try {
                i5 = Integer.parseInt(str.substring(0, 4));
                try {
                    i3 = Integer.parseInt(str.substring(4, 6)) - 1;
                    try {
                        i4 = Integer.parseInt(str.substring(6, 8));
                    } catch (NumberFormatException unused) {
                        i4 = 0;
                        i6 = 0;
                        i7 = 0;
                        i2 = 0;
                        if (!z2) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
            } catch (NumberFormatException unused3) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            try {
                i6 = Integer.parseInt(str.substring(9, 11));
                try {
                    i7 = Integer.parseInt(str.substring(11, 13));
                } catch (NumberFormatException unused4) {
                    i7 = 0;
                }
                try {
                    i2 = Integer.parseInt(str.substring(13, 15));
                    int iCopydefault = C7019abT.copydefault(i5, i3);
                    if (i5 >= 0 && i3 >= 0 && i3 <= 11 && i4 >= 1 && i4 <= iCopydefault && i6 >= 0 && i6 < 24 && i7 >= 0 && i7 < 60 && i2 >= 0 && i2 < 60) {
                        z2 = true;
                    }
                } catch (NumberFormatException unused5) {
                    i2 = 0;
                }
            } catch (NumberFormatException unused6) {
                i6 = 0;
                i7 = 0;
                i2 = 0;
                if (!z2) {
                }
            }
        } else {
            i2 = 0;
            z = false;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!z2) {
            throw new IllegalArgumentException("Invalid date time string format");
        }
        long jCopydefault = (C7019abT.copydefault(i5, i3, i4) * CalendarModelKt.MillisecondsIn24Hours) + ((long) ((i6 * DEF_DSTSAVINGS) + (i7 * 60000) + (i2 * 1000)));
        return !z ? jCopydefault - ((long) i) : jCopydefault;
    }

    private static int offsetStrToMillis(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        int i5 = 0;
        if (str != null && ((length = str.length()) == 5 || length == 7)) {
            char cCharAt = str.charAt(0);
            if (cCharAt == '+') {
                i2 = 1;
            } else {
                if (cCharAt == '-') {
                    i2 = -1;
                }
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            try {
                i4 = Integer.parseInt(str.substring(1, 3));
                try {
                    i3 = Integer.parseInt(str.substring(3, 5));
                    if (length == 7) {
                        try {
                            i5 = Integer.parseInt(str.substring(5, 7));
                        } catch (NumberFormatException unused) {
                            i = 0;
                        }
                    }
                    i = i5;
                    i5 = 1;
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
            } catch (NumberFormatException unused3) {
                i3 = 0;
                i4 = 0;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (i5 != 0) {
            return i2 * ((((i4 * 60) + i3) * 60) + i) * 1000;
        }
        throw new IllegalArgumentException("Bad offset string");
    }

    private static String millisToOffset(int i) {
        StringBuilder sb = new StringBuilder(7);
        if (i >= 0) {
            sb.append('+');
        } else {
            sb.append('-');
            i = -i;
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 - i3) / 60;
        sb.append(numToString(i4 / 60, 2));
        sb.append(numToString(i4 % 60, 2));
        sb.append(numToString(i3, 2));
        return sb.toString();
    }

    private static String numToString(int i, int i2) {
        String string = Integer.toString(i);
        int length = string.length();
        if (length >= i2) {
            return string.substring(length - i2, length);
        }
        StringBuilder sb = new StringBuilder(i2);
        while (length < i2) {
            sb.append('0');
            length++;
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: cloneAsThawed */
    public TimeZone mo6319cloneAsThawed() {
        VTimeZone vTimeZone = (VTimeZone) super.mo6319cloneAsThawed();
        vTimeZone.tz = (BasicTimeZone) this.tz.mo6319cloneAsThawed();
        vTimeZone.isFrozen = false;
        return vTimeZone;
    }
}
