package o;

import j$.time.DateTimeException;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.ResolverStyle;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import java.text.ParsePosition;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56350yCc {
    public static final C56350yCc AEQbTJ;
    public static final C56350yCc AYXKKw;
    public static final C56350yCc AhwBna;
    public static final C56350yCc AkhnZx;
    private static final yCG AuCTel;
    public static final C56350yCc DbNXlk;
    public static final C56350yCc EZpvd;
    public static final C56350yCc KWHzl;
    public static final C56350yCc OLrzqt;
    public static final C56350yCc copydefault;
    public static final C56350yCc djBIcL;
    private static final yCG fIwbmz;
    public static final C56350yCc fetchVPNInfo;
    public static final C56350yCc gEmmrt;
    public static final C56350yCc isConnected;
    public static final C56350yCc valueOf;
    public static final C56350yCc values;
    private final C56359yCl ejfBZ;
    private final InterfaceC56351yCd fARcdN;
    private final java.util.Locale fJNWhG;
    private final ZoneId getFieldNames;
    private final ResolverStyle hDKMBd;
    private final DateTimeFormatterBuilder.Application iwGUEr;
    private final java.util.Set uzCIH;

    public C56350yCc AEQbTJ(ZoneId zoneId) {
        return Objects.equals(this.getFieldNames, zoneId) ? this : new C56350yCc(this.iwGUEr, this.fJNWhG, this.ejfBZ, this.hDKMBd, this.uzCIH, this.fARcdN, zoneId);
    }

    public C56350yCc AEQbTJ(C56359yCl c56359yCl) {
        return this.ejfBZ.equals(c56359yCl) ? this : new C56350yCc(this.iwGUEr, this.fJNWhG, c56359yCl, this.hDKMBd, this.uzCIH, this.fARcdN, this.getFieldNames);
    }

    public C56350yCc KWHzl(InterfaceC56351yCd interfaceC56351yCd) {
        return Objects.equals(this.fARcdN, interfaceC56351yCd) ? this : new C56350yCc(this.iwGUEr, this.fJNWhG, this.ejfBZ, this.hDKMBd, this.uzCIH, interfaceC56351yCd, this.getFieldNames);
    }

    public java.lang.String toString() {
        java.lang.String string = this.iwGUEr.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatterBuilder.Application EZpvd(boolean z) {
        return this.iwGUEr.KWHzl(z);
    }

    public java.lang.Object AEQbTJ(java.lang.CharSequence charSequence, yCG ycg) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(ycg, "query");
        try {
            return KWHzl(charSequence, null).query(ycg);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw EZpvd(charSequence, e2);
        }
    }

    public ZoneId AEQbTJ() {
        return this.getFieldNames;
    }

    public java.util.Locale EZpvd() {
        return this.fJNWhG;
    }

    public C56359yCl OLrzqt() {
        return this.ejfBZ;
    }

    public InterfaceC56351yCd KWHzl() {
        return this.fARcdN;
    }

    public void AEQbTJ(InterfaceC56365yCr interfaceC56365yCr, java.lang.Appendable appendable) {
        Objects.requireNonNull(interfaceC56365yCr, "temporal");
        Objects.requireNonNull(appendable, "appendable");
        try {
            C56362yCo c56362yCo = new C56362yCo(interfaceC56365yCr, this);
            if (appendable instanceof java.lang.StringBuilder) {
                this.iwGUEr.format(c56362yCo, (java.lang.StringBuilder) appendable);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            this.iwGUEr.format(c56362yCo, sb);
            appendable.append(sb);
        } catch (java.io.IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public java.lang.String OLrzqt(InterfaceC56365yCr interfaceC56365yCr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        AEQbTJ(interfaceC56365yCr, sb);
        return sb.toString();
    }

    private C56361yCn copydefault(java.lang.CharSequence charSequence, ParsePosition parsePosition) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        C56361yCn c56361yCn = new C56361yCn(this);
        int i = this.iwGUEr.parse(c56361yCn, charSequence, parsePosition.getIndex());
        if (i < 0) {
            parsePosition.setErrorIndex(~i);
            return null;
        }
        parsePosition.setIndex(i);
        return c56361yCn;
    }

    private InterfaceC56365yCr KWHzl(java.lang.CharSequence charSequence, ParsePosition parsePosition) {
        java.lang.String string;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        C56361yCn c56361yCnCopydefault = copydefault(charSequence, parsePosition2);
        if (c56361yCnCopydefault != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return c56361yCnCopydefault.OLrzqt(this.hDKMBd, this.uzCIH);
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new DateTimeParseException("Text '" + string + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new DateTimeParseException("Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    public static C56350yCc OLrzqt(java.lang.String str, java.util.Locale locale) {
        return new DateTimeFormatterBuilder().AEQbTJ(str).copydefault(locale);
    }

    public static C56350yCc AEQbTJ(java.lang.String str) {
        return new DateTimeFormatterBuilder().AEQbTJ(str).AhwBna();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap:boolean:0x0000: INSTANCE_OF (r1v0 o.yCr) A[WRAPPED] (LINE:65350) o.yCp) != false) ? (wrap:java.lang.Boolean:0x0008: INVOKE (wrap:boolean:0x0006: IGET (wrap:o.yCp:0x0004: CHECK_CAST (o.yCp) (r1v0 o.yCr)) A[WRAPPED] o.yCp.AEQbTJ boolean) STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean A[MD:(boolean):java.lang.Boolean (c), WRAPPED]) : (wrap:java.lang.Boolean:0x000d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) */
    static /* synthetic */ java.lang.Boolean AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
        return interfaceC56365yCr instanceof C56363yCp ? java.lang.Boolean.valueOf(((C56363yCp) interfaceC56365yCr).AEQbTJ) : java.lang.Boolean.FALSE;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap:boolean:0x0000: INSTANCE_OF (r1v0 o.yCr) A[WRAPPED] (LINE:65351) o.yCp) != false) ? (wrap:j$.time.Period:0x0006: IGET (wrap:o.yCp:0x0004: CHECK_CAST (o.yCp) (r1v0 o.yCr)) A[WRAPPED] o.yCp.KWHzl j$.time.Period) : (wrap:j$.time.Period:0x0009: SGET  A[WRAPPED] j$.time.Period.ZERO j$.time.Period) */
    static /* synthetic */ Period EZpvd(InterfaceC56365yCr interfaceC56365yCr) {
        return interfaceC56365yCr instanceof C56363yCp ? ((C56363yCp) interfaceC56365yCr).KWHzl : Period.ZERO;
    }

    private DateTimeParseException EZpvd(java.lang.CharSequence charSequence, java.lang.RuntimeException runtimeException) {
        java.lang.String string;
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + string + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    public C56350yCc(DateTimeFormatterBuilder.Application application, java.util.Locale locale, C56359yCl c56359yCl, ResolverStyle resolverStyle, java.util.Set set, InterfaceC56351yCd interfaceC56351yCd, ZoneId zoneId) {
        Objects.requireNonNull(application, "printerParser");
        this.iwGUEr = application;
        this.uzCIH = set;
        Objects.requireNonNull(locale, "locale");
        this.fJNWhG = locale;
        Objects.requireNonNull(c56359yCl, "decimalStyle");
        this.ejfBZ = c56359yCl;
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        this.hDKMBd = resolverStyle;
        this.fARcdN = interfaceC56351yCd;
        this.getFieldNames = zoneId;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd = dateTimeFormatterBuilder.OLrzqt(chronoField, 4, 10, signStyle).EZpvd('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd2 = dateTimeFormatterBuilderEZpvd.AEQbTJ(chronoField2, 2).EZpvd('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAEQbTJ = dateTimeFormatterBuilderEZpvd2.AEQbTJ(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        C56350yCc c56350yCcOLrzqt = dateTimeFormatterBuilderAEQbTJ.OLrzqt(resolverStyle, isoChronology);
        copydefault = c56350yCcOLrzqt;
        AhwBna = new DateTimeFormatterBuilder().AYXKKw().KWHzl(c56350yCcOLrzqt).KWHzl().OLrzqt(resolverStyle, isoChronology);
        EZpvd = new DateTimeFormatterBuilder().AYXKKw().KWHzl(c56350yCcOLrzqt).djBIcL().KWHzl().OLrzqt(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd3 = dateTimeFormatterBuilder2.AEQbTJ(chronoField4, 2).EZpvd(AbstractJsonLexerKt.COLON);
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd4 = dateTimeFormatterBuilderEZpvd3.AEQbTJ(chronoField5, 2).djBIcL().EZpvd(AbstractJsonLexerKt.COLON);
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        C56350yCc c56350yCcOLrzqt2 = dateTimeFormatterBuilderEZpvd4.AEQbTJ(chronoField6, 2).djBIcL().EZpvd((InterfaceC56372yCy) ChronoField.NANO_OF_SECOND, 0, 9, true).OLrzqt(resolverStyle, (InterfaceC56351yCd) null);
        valueOf = c56350yCcOLrzqt2;
        AYXKKw = new DateTimeFormatterBuilder().AYXKKw().KWHzl(c56350yCcOLrzqt2).KWHzl().OLrzqt(resolverStyle, (InterfaceC56351yCd) null);
        DbNXlk = new DateTimeFormatterBuilder().AYXKKw().KWHzl(c56350yCcOLrzqt2).djBIcL().KWHzl().OLrzqt(resolverStyle, (InterfaceC56351yCd) null);
        C56350yCc c56350yCcOLrzqt3 = new DateTimeFormatterBuilder().AYXKKw().KWHzl(c56350yCcOLrzqt).EZpvd('T').KWHzl(c56350yCcOLrzqt2).OLrzqt(resolverStyle, isoChronology);
        gEmmrt = c56350yCcOLrzqt3;
        C56350yCc c56350yCcOLrzqt4 = new DateTimeFormatterBuilder().AYXKKw().KWHzl(c56350yCcOLrzqt3).KWHzl().OLrzqt(resolverStyle, isoChronology);
        djBIcL = c56350yCcOLrzqt4;
        isConnected = new DateTimeFormatterBuilder().KWHzl(c56350yCcOLrzqt4).djBIcL().EZpvd(AbstractJsonLexerKt.BEGIN_LIST).valueOf().AEQbTJ().EZpvd(AbstractJsonLexerKt.END_LIST).OLrzqt(resolverStyle, isoChronology);
        OLrzqt = new DateTimeFormatterBuilder().KWHzl(c56350yCcOLrzqt3).djBIcL().KWHzl().djBIcL().EZpvd(AbstractJsonLexerKt.BEGIN_LIST).valueOf().AEQbTJ().EZpvd(AbstractJsonLexerKt.END_LIST).OLrzqt(resolverStyle, isoChronology);
        values = new DateTimeFormatterBuilder().AYXKKw().OLrzqt(chronoField, 4, 10, signStyle).EZpvd('-').AEQbTJ(ChronoField.DAY_OF_YEAR, 3).djBIcL().KWHzl().OLrzqt(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd5 = new DateTimeFormatterBuilder().AYXKKw().OLrzqt(IsoFields.copydefault, 4, 10, signStyle).KWHzl("-W").AEQbTJ(IsoFields.AhwBna, 2).EZpvd('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        AkhnZx = dateTimeFormatterBuilderEZpvd5.AEQbTJ(chronoField7, 1).djBIcL().KWHzl().OLrzqt(resolverStyle, isoChronology);
        AEQbTJ = new DateTimeFormatterBuilder().AYXKKw().OLrzqt().OLrzqt(resolverStyle, (InterfaceC56351yCd) null);
        KWHzl = new DateTimeFormatterBuilder().AYXKKw().AEQbTJ(chronoField, 4).AEQbTJ(chronoField2, 2).AEQbTJ(chronoField3, 2).djBIcL().AEQbTJ("+HHMMss", "Z").OLrzqt(resolverStyle, isoChronology);
        java.util.HashMap map = new java.util.HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        fetchVPNInfo = new DateTimeFormatterBuilder().AYXKKw().gEmmrt().djBIcL().AEQbTJ(chronoField7, map).KWHzl(", ").EZpvd().OLrzqt(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).EZpvd(' ').AEQbTJ(chronoField2, map2).EZpvd(' ').AEQbTJ(chronoField, 4).EZpvd(' ').AEQbTJ(chronoField4, 2).EZpvd(AbstractJsonLexerKt.COLON).AEQbTJ(chronoField5, 2).djBIcL().EZpvd(AbstractJsonLexerKt.COLON).AEQbTJ(chronoField6, 2).EZpvd().EZpvd(' ').AEQbTJ("+HHMM", "GMT").OLrzqt(ResolverStyle.SMART, isoChronology);
        AuCTel = new yCG() { // from class: o.yCh
            @Override // o.yCG
            public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
                return C56350yCc.EZpvd(interfaceC56365yCr);
            }
        };
        fIwbmz = new yCG() { // from class: o.yCk
            @Override // o.yCG
            public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
                return C56350yCc.AEQbTJ(interfaceC56365yCr);
            }
        };
    }
}
