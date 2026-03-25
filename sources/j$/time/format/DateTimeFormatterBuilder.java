package j$.time.format;

import androidx.work.WorkRequest;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import j$.time.temporal.ValueRange;
import j$.time.temporal.WeekFields;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC56357yCj;
import o.AbstractC56364yCq;
import o.AbstractC56371yCx;
import o.C56350yCc;
import o.C56359yCl;
import o.C56360yCm;
import o.C56361yCn;
import o.C56362yCo;
import o.InterfaceC56351yCd;
import o.InterfaceC56365yCr;
import o.InterfaceC56372yCy;
import o.yBW;
import o.yCG;
import o.yCH;
import okhttp3.internal.connection.RealConnection;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes13.dex */
public final class DateTimeFormatterBuilder {
    static final Comparator AEQbTJ;
    private static final Map KWHzl;
    private static final yCG OLrzqt = new yCG() { // from class: o.yCi
        @Override // o.yCG
        public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            return DateTimeFormatterBuilder.EZpvd(interfaceC56365yCr);
        }
    };
    private int AYXKKw;
    private int AhwBna;
    private final boolean EZpvd;
    private DateTimeFormatterBuilder copydefault;
    private char djBIcL;
    private final DateTimeFormatterBuilder gEmmrt;
    private final List valueOf;

    interface StateListAnimator {
        boolean format(C56362yCo c56362yCo, StringBuilder sb);

        int parse(C56361yCn c56361yCn, CharSequence charSequence, int i);
    }

    public C56350yCc copydefault(Locale locale) {
        return OLrzqt(locale, ResolverStyle.SMART, null);
    }

    public C56350yCc OLrzqt(ResolverStyle resolverStyle, InterfaceC56351yCd interfaceC56351yCd) {
        return OLrzqt(Locale.getDefault(), resolverStyle, interfaceC56351yCd);
    }

    public C56350yCc AhwBna() {
        return copydefault(Locale.getDefault());
    }

    public DateTimeFormatterBuilder gEmmrt() {
        AEQbTJ(SettingsParser.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder EZpvd(InterfaceC56372yCy interfaceC56372yCy, long j) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        AEQbTJ(new TaskDescription(interfaceC56372yCy, j));
        return this;
    }

    public DateTimeFormatterBuilder valueOf() {
        AEQbTJ(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder AYXKKw() {
        AEQbTJ(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder copydefault(int i, char c) {
        if (i < 1) {
            throw new IllegalArgumentException("The pad width must be at least one but was " + i);
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.copydefault;
        dateTimeFormatterBuilder.AhwBna = i;
        dateTimeFormatterBuilder.djBIcL = c;
        dateTimeFormatterBuilder.AYXKKw = -1;
        return this;
    }

    public DateTimeFormatterBuilder OLrzqt(int i) {
        return copydefault(i, ' ');
    }

    public DateTimeFormatterBuilder djBIcL() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.copydefault;
        dateTimeFormatterBuilder.AYXKKw = -1;
        this.copydefault = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder EZpvd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.copydefault;
        if (dateTimeFormatterBuilder.gEmmrt == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.valueOf.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.copydefault;
            Application application = new Application(dateTimeFormatterBuilder2.valueOf, dateTimeFormatterBuilder2.EZpvd);
            this.copydefault = this.copydefault.gEmmrt;
            AEQbTJ(application);
        } else {
            this.copydefault = this.copydefault.gEmmrt;
        }
        return this;
    }

    public DateTimeFormatterBuilder copydefault(TextStyle textStyle) {
        AEQbTJ(new ComponentCallbacks2(textStyle, null));
        return this;
    }

    public DateTimeFormatterBuilder AEQbTJ() {
        AEQbTJ(new ClipData(OLrzqt, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder copydefault() {
        AEQbTJ(new ClipData(AbstractC56371yCx.djBIcL(), "ZoneId()"));
        return this;
    }

    public DateTimeFormatterBuilder OLrzqt(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, yBW ybw) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        Objects.requireNonNull(ybw, "baseDate");
        OLrzqt(new VoiceInteractor(interfaceC56372yCy, i, i2, 0, ybw));
        return this;
    }

    public DateTimeFormatterBuilder OLrzqt(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, SignStyle signStyle) {
        if (i == i2 && signStyle == SignStyle.NOT_NEGATIVE) {
            return AEQbTJ(interfaceC56372yCy, i2);
        }
        Objects.requireNonNull(interfaceC56372yCy, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            OLrzqt(new LoaderManager(interfaceC56372yCy, i, i2, signStyle));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public DateTimeFormatterBuilder AEQbTJ(InterfaceC56372yCy interfaceC56372yCy, int i) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        if (i >= 1 && i <= 19) {
            OLrzqt(new LoaderManager(interfaceC56372yCy, i, i, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
    }

    public DateTimeFormatterBuilder KWHzl(InterfaceC56372yCy interfaceC56372yCy) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        OLrzqt(new LoaderManager(interfaceC56372yCy, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder AEQbTJ(InterfaceC56372yCy interfaceC56372yCy, Map<Long, String> map) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        final C56360yCm.ActionBar actionBar = new C56360yCm.ActionBar(Collections.singletonMap(textStyle, linkedHashMap));
        AEQbTJ(new TaskStackBuilder(interfaceC56372yCy, textStyle, new C56360yCm() { // from class: j$.time.format.DateTimeFormatterBuilder.5
            @Override // o.C56360yCm
            public Iterator copydefault(InterfaceC56372yCy interfaceC56372yCy2, TextStyle textStyle2, Locale locale) {
                return actionBar.copydefault(textStyle2);
            }

            @Override // o.C56360yCm
            public String KWHzl(InterfaceC56372yCy interfaceC56372yCy2, long j, TextStyle textStyle2, Locale locale) {
                return actionBar.EZpvd(j, textStyle2);
            }
        }));
        return this;
    }

    public DateTimeFormatterBuilder OLrzqt(InterfaceC56372yCy interfaceC56372yCy, TextStyle textStyle) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        AEQbTJ(new TaskStackBuilder(interfaceC56372yCy, textStyle, C56360yCm.OLrzqt()));
        return this;
    }

    public DateTimeFormatterBuilder AEQbTJ(String str) {
        Objects.requireNonNull(str, "pattern");
        EZpvd(str);
        return this;
    }

    public DateTimeFormatterBuilder KWHzl() {
        AEQbTJ(Dialog.KWHzl);
        return this;
    }

    public DateTimeFormatterBuilder AEQbTJ(String str, String str2) {
        AEQbTJ(new Dialog(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder OLrzqt(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, TtmlNode.TAG_STYLE);
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        AEQbTJ(new PendingIntent(textStyle));
        return this;
    }

    public DateTimeFormatterBuilder KWHzl(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.length() > 0) {
            AEQbTJ(str.length() == 1 ? new Activity(str.charAt(0)) : new AssistContent(str));
        }
        return this;
    }

    public static final class VoiceInteractor extends LoaderManager {
        static final LocalDate AhwBna = LocalDate.of(2000, 1, 1);
        private final yBW gEmmrt;
        private final int valueOf;

        /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Lj$/time/format/DateTimeFormatterBuilder$LoaderManager; */
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.LoaderManager
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public VoiceInteractor KWHzl(int i) {
            return new VoiceInteractor(this.copydefault, this.AEQbTJ, this.KWHzl, this.valueOf, this.gEmmrt, this.EZpvd + i);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lj$/time/format/DateTimeFormatterBuilder$LoaderManager; */
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.LoaderManager
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public VoiceInteractor copydefault() {
            return this.EZpvd == -1 ? this : new VoiceInteractor(this.copydefault, this.AEQbTJ, this.KWHzl, this.valueOf, this.gEmmrt, -1);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.LoaderManager
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.copydefault);
            sb.append(",");
            sb.append(this.AEQbTJ);
            sb.append(",");
            sb.append(this.KWHzl);
            sb.append(",");
            Object objValueOf = this.gEmmrt;
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(this.valueOf);
            }
            sb.append(objValueOf);
            sb.append(")");
            return sb.toString();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.LoaderManager
        int AEQbTJ(final C56361yCn c56361yCn, final long j, final int i, final int i2) {
            int i3 = this.valueOf;
            if (this.gEmmrt != null) {
                i3 = c56361yCn.KWHzl().date(this.gEmmrt).get(this.copydefault);
                c56361yCn.AEQbTJ(new Consumer() { // from class: o.yCg
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        this.OLrzqt.AEQbTJ(c56361yCn, j, i, i2, (InterfaceC56351yCd) obj);
                    }
                });
            }
            int i4 = this.AEQbTJ;
            if (i2 - i == i4 && j >= 0) {
                long j2 = LoaderManager.OLrzqt[i4];
                long j3 = i3;
                long j4 = j3 - (j3 % j2);
                j = i3 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return c56361yCn.EZpvd(this.copydefault, j, i, i2);
        }

        public /* synthetic */ void AEQbTJ(C56361yCn c56361yCn, long j, int i, int i2, InterfaceC56351yCd interfaceC56351yCd) {
            AEQbTJ(c56361yCn, j, i, i2);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.LoaderManager
        boolean AEQbTJ(C56361yCn c56361yCn) {
            if (c56361yCn.AhwBna()) {
                return super.AEQbTJ(c56361yCn);
            }
            return false;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.LoaderManager
        long AEQbTJ(C56362yCo c56362yCo, long j) {
            long jAbs = Math.abs(j);
            int i = this.valueOf;
            if (this.gEmmrt != null) {
                i = InterfaceC56351yCd.KWHzl(c56362yCo.KWHzl()).date(this.gEmmrt).get(this.copydefault);
            }
            long j2 = i;
            if (j >= j2) {
                long j3 = LoaderManager.OLrzqt[this.AEQbTJ];
                if (j < j2 + j3) {
                    return jAbs % j3;
                }
            }
            return jAbs % LoaderManager.OLrzqt[this.KWHzl];
        }

        private VoiceInteractor(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, int i3, yBW ybw, int i4) {
            super(interfaceC56372yCy, i, i2, SignStyle.NOT_NEGATIVE, i4);
            this.valueOf = i3;
            this.gEmmrt = ybw;
        }

        VoiceInteractor(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, int i3, yBW ybw) {
            this(interfaceC56372yCy, i, i2, i3, ybw, 0);
            if (i < 1 || i > 10) {
                throw new IllegalArgumentException("The minWidth must be from 1 to 10 inclusive but was " + i);
            }
            if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i);
            }
            if (i2 < i) {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            }
            if (ybw == null) {
                long j = i3;
                if (!interfaceC56372yCy.range().isValidValue(j)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j + LoaderManager.OLrzqt[i2] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
        }
    }

    public DateTimeFormatterBuilder EZpvd(char c) {
        AEQbTJ(new Activity(c));
        return this;
    }

    static class LoaderManager implements StateListAnimator {
        static final long[] OLrzqt = {0, 10, 100, 1000, WorkRequest.MIN_BACKOFF_MILLIS, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
        final int AEQbTJ;
        final int EZpvd;
        final int KWHzl;
        final InterfaceC56372yCy copydefault;
        private final SignStyle djBIcL;

        long AEQbTJ(C56362yCo c56362yCo, long j) {
            return j;
        }

        LoaderManager KWHzl(int i) {
            return new LoaderManager(this.copydefault, this.AEQbTJ, this.KWHzl, this.djBIcL, this.EZpvd + i);
        }

        LoaderManager copydefault() {
            return this.EZpvd == -1 ? this : new LoaderManager(this.copydefault, this.AEQbTJ, this.KWHzl, this.djBIcL, -1);
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            int i = this.AEQbTJ;
            if (i == 1 && this.KWHzl == 19 && this.djBIcL == SignStyle.NORMAL) {
                sb = new StringBuilder();
                sb.append("Value(");
                obj = this.copydefault;
            } else {
                if (i == this.KWHzl && this.djBIcL == SignStyle.NOT_NEGATIVE) {
                    sb = new StringBuilder();
                    sb.append("Value(");
                    sb.append(this.copydefault);
                    sb.append(",");
                    sb.append(this.AEQbTJ);
                    sb.append(")");
                    return sb.toString();
                }
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.copydefault);
                sb.append(",");
                sb.append(this.AEQbTJ);
                sb.append(",");
                sb.append(this.KWHzl);
                sb.append(",");
                obj = this.djBIcL;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        int AEQbTJ(C56361yCn c56361yCn, long j, int i, int i2) {
            return c56361yCn.EZpvd(this.copydefault, j, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x0154, code lost:
        
            return ~(r7 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0155, code lost:
        
            if (r1 <= r2) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0158, code lost:
        
            return ~r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0159, code lost:
        
            r2 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x015a, code lost:
        
            if (r11 == null) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0162, code lost:
        
            if (r11.bitLength() <= 63) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x0164, code lost:
        
            r11 = r11.divide(java.math.BigInteger.TEN);
            r5 = r5 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0179, code lost:
        
            return AEQbTJ(r18, r11.longValue(), r7, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0183, code lost:
        
            return AEQbTJ(r18, r2, r7, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0109, code lost:
        
            r5 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x010e, code lost:
        
            if (r2 == false) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0110, code lost:
        
            if (r11 == null) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0118, code lost:
        
            if (r11.equals(java.math.BigInteger.ZERO) == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x011e, code lost:
        
            if (r18.AhwBna() == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
        
            return ~(r7 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0124, code lost:
        
            r11 = r11.negate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x012f, code lost:
        
            if (r14 != 0) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0135, code lost:
        
            if (r18.AhwBna() == false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0139, code lost:
        
            return ~(r7 - 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x013a, code lost:
        
            r2 = -r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0141, code lost:
        
            if (r17.djBIcL != j$.time.format.SignStyle.EXCEEDS_PAD) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0147, code lost:
        
            if (r18.AhwBna() == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0149, code lost:
        
            r1 = r5 - r7;
            r2 = r17.AEQbTJ;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x014d, code lost:
        
            if (r0 == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x014f, code lost:
        
            if (r1 > r2) goto L105;
         */
        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int i2;
            boolean z;
            boolean z2;
            long j;
            int i3;
            int i4;
            int length = charSequence.length();
            if (i != length) {
                char cCharAt = charSequence.charAt(i);
                int i5 = 0;
                if (cCharAt == c56361yCn.EZpvd().copydefault()) {
                    if (!this.djBIcL.parse(true, c56361yCn.AhwBna(), this.AEQbTJ == this.KWHzl)) {
                        return ~i;
                    }
                    i2 = i + 1;
                    z2 = false;
                    z = true;
                } else if (cCharAt == c56361yCn.EZpvd().OLrzqt()) {
                    if (!this.djBIcL.parse(false, c56361yCn.AhwBna(), this.AEQbTJ == this.KWHzl)) {
                        return ~i;
                    }
                    i2 = i + 1;
                    z = false;
                    z2 = true;
                } else {
                    if (this.djBIcL == SignStyle.ALWAYS && c56361yCn.AhwBna()) {
                        return ~i;
                    }
                    i2 = i;
                    z = false;
                    z2 = false;
                }
                int i6 = (c56361yCn.AhwBna() || AEQbTJ(c56361yCn)) ? this.AEQbTJ : 1;
                int i7 = i2 + i6;
                if (i7 <= length) {
                    int iMax = ((c56361yCn.AhwBna() || AEQbTJ(c56361yCn)) ? this.KWHzl : 9) + Math.max(this.EZpvd, 0);
                    while (true) {
                        BigInteger bigIntegerDivide = null;
                        if (i5 >= 2) {
                            int i8 = i2;
                            j = 0;
                            break;
                        }
                        int iMin = Math.min(iMax + i2, length);
                        int i9 = i2;
                        j = 0;
                        while (true) {
                            if (i9 >= iMin) {
                                break;
                            }
                            int i10 = i9 + 1;
                            int iKWHzl = c56361yCn.EZpvd().KWHzl(charSequence.charAt(i9));
                            if (iKWHzl >= 0) {
                                if (i10 - i2 > 18) {
                                    if (bigIntegerDivide == null) {
                                        bigIntegerDivide = BigInteger.valueOf(j);
                                    }
                                    i3 = i7;
                                    i4 = iMin;
                                    bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.TEN).add(BigInteger.valueOf(iKWHzl));
                                } else {
                                    i3 = i7;
                                    i4 = iMin;
                                    j = (j * 10) + ((long) iKWHzl);
                                }
                                i7 = i3;
                                iMin = i4;
                                i9 = i10;
                            } else if (i9 < i7) {
                                return ~i2;
                            }
                        }
                        int i11 = i7;
                        int i12 = this.EZpvd;
                        if (i12 <= 0 || i5 != 0) {
                            break;
                        }
                        iMax = Math.max(i6, (i9 - i2) - i12);
                        i5++;
                        i7 = i11;
                    }
                } else {
                    return ~i2;
                }
            } else {
                return ~i;
            }
        }

        boolean AEQbTJ(C56361yCn c56361yCn) {
            int i = this.EZpvd;
            return i == -1 || (i > 0 && this.AEQbTJ == this.KWHzl && this.djBIcL == SignStyle.NOT_NEGATIVE);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            char cOLrzqt;
            int i;
            Long lOLrzqt = c56362yCo.OLrzqt(this.copydefault);
            if (lOLrzqt == null) {
                return false;
            }
            long jAEQbTJ = AEQbTJ(c56362yCo, lOLrzqt.longValue());
            C56359yCl c56359yClEZpvd = c56362yCo.EZpvd();
            String string = jAEQbTJ == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jAEQbTJ));
            if (string.length() > this.KWHzl) {
                throw new DateTimeException("Field " + this.copydefault + " cannot be printed as the value " + jAEQbTJ + " exceeds the maximum print width of " + this.KWHzl);
            }
            String strOLrzqt = c56359yClEZpvd.OLrzqt(string);
            if (jAEQbTJ >= 0) {
                int i2 = AnonymousClass3.AEQbTJ[this.djBIcL.ordinal()];
                if (i2 == 1 ? !((i = this.AEQbTJ) >= 19 || jAEQbTJ < OLrzqt[i]) : i2 == 2) {
                    cOLrzqt = c56359yClEZpvd.copydefault();
                    sb.append(cOLrzqt);
                }
            } else {
                int i3 = AnonymousClass3.AEQbTJ[this.djBIcL.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    cOLrzqt = c56359yClEZpvd.OLrzqt();
                    sb.append(cOLrzqt);
                } else if (i3 == 4) {
                    throw new DateTimeException("Field " + this.copydefault + " cannot be printed as the value " + jAEQbTJ + " cannot be negative according to the SignStyle");
                }
            }
            for (int i4 = 0; i4 < this.AEQbTJ - strOLrzqt.length(); i4++) {
                sb.append(c56359yClEZpvd.EZpvd());
            }
            sb.append(strOLrzqt);
            return true;
        }

        protected LoaderManager(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, SignStyle signStyle, int i3) {
            this.copydefault = interfaceC56372yCy;
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.djBIcL = signStyle;
            this.EZpvd = i3;
        }

        LoaderManager(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, SignStyle signStyle) {
            this.copydefault = interfaceC56372yCy;
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.djBIcL = signStyle;
            this.EZpvd = 0;
        }
    }

    public DateTimeFormatterBuilder OLrzqt() {
        AEQbTJ(new Fragment(-2));
        return this;
    }

    /* JADX INFO: loaded from: classes17.dex */
    static class SharedElementCallback {
        protected SharedElementCallback AEQbTJ;
        protected SharedElementCallback EZpvd;
        protected String KWHzl;
        protected String OLrzqt;
        protected char copydefault;

        protected boolean AEQbTJ(char c, char c2) {
            return c == c2;
        }

        protected String copydefault(String str) {
            return str;
        }

        protected boolean AEQbTJ(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof String) {
                return ((String) charSequence).startsWith(this.KWHzl, i);
            }
            int length = this.KWHzl.length();
            if (length > i2 - i) {
                return false;
            }
            int i3 = 0;
            while (length > 0) {
                if (!AEQbTJ(this.KWHzl.charAt(i3), charSequence.charAt(i))) {
                    return false;
                }
                i++;
                length--;
                i3++;
            }
            return true;
        }

        protected SharedElementCallback AEQbTJ(String str, String str2, SharedElementCallback sharedElementCallback) {
            return new SharedElementCallback(str, str2, sharedElementCallback);
        }

        public String KWHzl(CharSequence charSequence, ParsePosition parsePosition) {
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            if (!AEQbTJ(charSequence, index, length)) {
                return null;
            }
            int length2 = index + this.KWHzl.length();
            SharedElementCallback sharedElementCallback = this.EZpvd;
            if (sharedElementCallback != null && length2 != length) {
                while (true) {
                    if (AEQbTJ(sharedElementCallback.copydefault, charSequence.charAt(length2))) {
                        parsePosition.setIndex(length2);
                        String strKWHzl = sharedElementCallback.KWHzl(charSequence, parsePosition);
                        if (strKWHzl != null) {
                            return strKWHzl;
                        }
                    } else {
                        sharedElementCallback = sharedElementCallback.AEQbTJ;
                        if (sharedElementCallback == null) {
                            break;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.OLrzqt;
        }

        /* JADX INFO: loaded from: classes24.dex */
        static class TaskDescription extends SharedElementCallback {
            @Override // j$.time.format.DateTimeFormatterBuilder.SharedElementCallback
            protected boolean AEQbTJ(CharSequence charSequence, int i, int i2) {
                int length = this.KWHzl.length();
                if (length > i2 - i) {
                    return false;
                }
                int i3 = 0;
                while (length > 0) {
                    if (!AEQbTJ(this.KWHzl.charAt(i3), charSequence.charAt(i))) {
                        return false;
                    }
                    i++;
                    length--;
                    i3++;
                }
                return true;
            }

            /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/String;Ljava/lang/String;Lj$/time/format/DateTimeFormatterBuilder$SharedElementCallback;)Lj$/time/format/DateTimeFormatterBuilder$SharedElementCallback; */
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // j$.time.format.DateTimeFormatterBuilder.SharedElementCallback
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public TaskDescription AEQbTJ(String str, String str2, SharedElementCallback sharedElementCallback) {
                return new TaskDescription(str, str2, sharedElementCallback);
            }

            @Override // j$.time.format.DateTimeFormatterBuilder.SharedElementCallback
            protected boolean AEQbTJ(char c, char c2) {
                return C56361yCn.KWHzl(c, c2);
            }

            private TaskDescription(String str, String str2, SharedElementCallback sharedElementCallback) {
                super(str, str2, sharedElementCallback);
            }
        }

        public boolean KWHzl(String str, String str2) {
            return EZpvd(str, str2);
        }

        private int OLrzqt(String str) {
            int i = 0;
            while (i < str.length() && i < this.KWHzl.length() && AEQbTJ(str.charAt(i), this.KWHzl.charAt(i))) {
                i++;
            }
            return i;
        }

        public static SharedElementCallback copydefault(Set set, C56361yCn c56361yCn) {
            SharedElementCallback sharedElementCallbackOLrzqt = OLrzqt(c56361yCn);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sharedElementCallbackOLrzqt.EZpvd(str, str);
            }
            return sharedElementCallbackOLrzqt;
        }

        public static SharedElementCallback OLrzqt(C56361yCn c56361yCn) {
            return c56361yCn.copydefault() ? new SharedElementCallback("", null, null) : new TaskDescription("", null, 0 == true ? 1 : 0);
        }

        private boolean EZpvd(String str, String str2) {
            String strCopydefault = copydefault(str);
            int iOLrzqt = OLrzqt(strCopydefault);
            if (iOLrzqt != this.KWHzl.length()) {
                SharedElementCallback sharedElementCallbackAEQbTJ = AEQbTJ(this.KWHzl.substring(iOLrzqt), this.OLrzqt, this.EZpvd);
                this.KWHzl = strCopydefault.substring(0, iOLrzqt);
                this.EZpvd = sharedElementCallbackAEQbTJ;
                if (iOLrzqt < strCopydefault.length()) {
                    this.EZpvd.AEQbTJ = AEQbTJ(strCopydefault.substring(iOLrzqt), str2, (SharedElementCallback) null);
                    this.OLrzqt = null;
                } else {
                    this.OLrzqt = str2;
                }
                return true;
            }
            if (iOLrzqt >= strCopydefault.length()) {
                this.OLrzqt = str2;
                return true;
            }
            String strSubstring = strCopydefault.substring(iOLrzqt);
            for (SharedElementCallback sharedElementCallback = this.EZpvd; sharedElementCallback != null; sharedElementCallback = sharedElementCallback.AEQbTJ) {
                if (AEQbTJ(sharedElementCallback.copydefault, strSubstring.charAt(0))) {
                    return sharedElementCallback.EZpvd(strSubstring, str2);
                }
            }
            SharedElementCallback sharedElementCallbackAEQbTJ2 = AEQbTJ(strSubstring, str2, (SharedElementCallback) null);
            sharedElementCallbackAEQbTJ2.AEQbTJ = this.EZpvd;
            this.EZpvd = sharedElementCallbackAEQbTJ2;
            return true;
        }

        private SharedElementCallback(String str, String str2, SharedElementCallback sharedElementCallback) {
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.EZpvd = sharedElementCallback;
            this.copydefault = str.length() == 0 ? (char) 65535 : this.KWHzl.charAt(0);
        }
    }

    public DateTimeFormatterBuilder EZpvd(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, boolean z) {
        AEQbTJ(new ActionBar(interfaceC56372yCy, i, i2, z));
        return this;
    }

    public DateTimeFormatterBuilder KWHzl(C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        AEQbTJ(c56350yCc.EZpvd(false));
        return this;
    }

    private C56350yCc OLrzqt(Locale locale, ResolverStyle resolverStyle, InterfaceC56351yCd interfaceC56351yCd) {
        Objects.requireNonNull(locale, "locale");
        while (this.copydefault.gEmmrt != null) {
            EZpvd();
        }
        return new C56350yCc(new Application(this.valueOf, false), locale, C56359yCl.KWHzl, resolverStyle, null, interfaceC56351yCd, null);
    }

    private void EZpvd(String str) {
        PictureInPictureParams pictureInPictureParams;
        String str2;
        String str3;
        TextStyle textStyle;
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i3 = i2 + 1;
                while (i3 < str.length() && str.charAt(i3) == cCharAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (cCharAt == 'p') {
                    if (i3 >= str.length() || (((cCharAt = str.charAt(i3)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i4 = 0;
                    } else {
                        int i5 = i3 + 1;
                        while (i5 < str.length() && str.charAt(i5) == cCharAt) {
                            i5++;
                        }
                        i = i5 - i3;
                        i3 = i5;
                    }
                    if (i4 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                    OLrzqt(i4);
                    i4 = i;
                }
                InterfaceC56372yCy interfaceC56372yCy = (InterfaceC56372yCy) KWHzl.get(Character.valueOf(cCharAt));
                if (interfaceC56372yCy != null) {
                    copydefault(cCharAt, i4, interfaceC56372yCy);
                } else if (cCharAt == 'z') {
                    if (i4 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    copydefault(i4 == 4 ? TextStyle.FULL : TextStyle.SHORT);
                } else if (cCharAt != 'V') {
                    String str4 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i4 < 4) {
                            str2 = "+HHMM";
                            AEQbTJ(str2, str4);
                        } else {
                            if (i4 != 4) {
                                if (i4 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                str3 = "+HH:MM:ss";
                                AEQbTJ(str3, "Z");
                            }
                            textStyle = TextStyle.FULL;
                            OLrzqt(textStyle);
                        }
                    } else if (cCharAt == 'O') {
                        if (i4 == 1) {
                            textStyle = TextStyle.SHORT;
                            OLrzqt(textStyle);
                        } else {
                            if (i4 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            textStyle = TextStyle.FULL;
                            OLrzqt(textStyle);
                        }
                    } else if (cCharAt == 'X') {
                        if (i4 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        str3 = Dialog.copydefault[i4 + (i4 == 1 ? 0 : 1)];
                        AEQbTJ(str3, "Z");
                    } else if (cCharAt != 'x') {
                        if (cCharAt == 'W') {
                            if (i4 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            pictureInPictureParams = new PictureInPictureParams(cCharAt, i4);
                        } else if (cCharAt == 'w') {
                            if (i4 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            pictureInPictureParams = new PictureInPictureParams(cCharAt, i4);
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            pictureInPictureParams = new PictureInPictureParams(cCharAt, i4);
                        }
                        AEQbTJ(pictureInPictureParams);
                    } else {
                        if (i4 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i4 == 1) {
                            str4 = "+00";
                        } else if (i4 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = Dialog.copydefault[i4 + (i4 == 1 ? 0 : 1)];
                        AEQbTJ(str2, str4);
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    copydefault();
                }
                i2 = i3 - 1;
            } else if (cCharAt == '\'') {
                int i6 = i2 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 >= str.length() || str.charAt(i8) != '\'') {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                    i7++;
                }
                if (i7 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
                String strSubstring = str.substring(i6, i7);
                if (strSubstring.length() == 0) {
                    EZpvd('\'');
                } else {
                    KWHzl(strSubstring.replace("''", "'"));
                }
                i2 = i7;
            } else if (cCharAt == '[') {
                djBIcL();
            } else if (cCharAt == ']') {
                if (this.copydefault.gEmmrt == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                EZpvd();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                EZpvd(cCharAt);
            }
            i2++;
        }
    }

    static final class Dialog implements StateListAnimator {
        private final int AEQbTJ;
        private final String OLrzqt;
        static final String[] copydefault = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final Dialog KWHzl = new Dialog("+HH:MM:ss", "Z");
        static final Dialog EZpvd = new Dialog("+HH:MM:ss", "0");

        public String toString() {
            return "Offset(" + copydefault[this.AEQbTJ] + ",'" + this.OLrzqt.replace("'", "''") + "')";
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int i2;
            long j;
            ChronoField chronoField;
            int length = charSequence.length();
            int length2 = this.OLrzqt.length();
            if (length2 == 0) {
                if (i == length) {
                    chronoField = ChronoField.OFFSET_SECONDS;
                    i2 = i;
                    j = 0;
                }
                return c56361yCn.EZpvd(chronoField, j, i, i2);
            }
            if (i == length) {
                return ~i;
            }
            if (c56361yCn.EZpvd(charSequence, i, this.OLrzqt, 0, length2)) {
                i2 = i + length2;
                j = 0;
                chronoField = ChronoField.OFFSET_SECONDS;
            }
            return c56361yCn.EZpvd(chronoField, j, i, i2);
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                int i3 = cCharAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i + 1;
                if (!AEQbTJ(iArr, 1, charSequence, true)) {
                    if (!AEQbTJ(iArr, 2, charSequence, this.AEQbTJ >= 3) && !AEQbTJ(iArr, 3, charSequence, false)) {
                        long j2 = i3;
                        long j3 = iArr[1];
                        long j4 = iArr[2];
                        long j5 = iArr[3];
                        ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                        long j6 = j2 * ((j3 * 3600) + (j4 * 60) + j5);
                        i2 = iArr[0];
                        chronoField = chronoField2;
                        j = j6;
                        return c56361yCn.EZpvd(chronoField, j, i, i2);
                    }
                }
            }
            if (length2 != 0) {
                return ~i;
            }
            i2 = i + length2;
            j = 0;
            chronoField = ChronoField.OFFSET_SECONDS;
            return c56361yCn.EZpvd(chronoField, j, i, i2);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            Long lOLrzqt = c56362yCo.OLrzqt(ChronoField.OFFSET_SECONDS);
            if (lOLrzqt == null) {
                return false;
            }
            int intExact = Math.toIntExact(lOLrzqt.longValue());
            if (intExact == 0) {
                sb.append(this.OLrzqt);
            } else {
                int iAbs = Math.abs((intExact / IMarketApiService.SIXTY_MINUTES) % 100);
                int iAbs2 = Math.abs((intExact / 60) % 60);
                int iAbs3 = Math.abs(intExact % 60);
                int length = sb.length();
                sb.append(intExact < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
                sb.append((char) ((iAbs / 10) + 48));
                sb.append((char) ((iAbs % 10) + 48));
                int i = this.AEQbTJ;
                if (i >= 3 || (i >= 1 && iAbs2 > 0)) {
                    sb.append(i % 2 == 0 ? ":" : "");
                    sb.append((char) ((iAbs2 / 10) + 48));
                    sb.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i2 = this.AEQbTJ;
                    if (i2 >= 7 || (i2 >= 5 && iAbs3 > 0)) {
                        sb.append(i2 % 2 != 0 ? "" : ":");
                        sb.append((char) ((iAbs3 / 10) + 48));
                        sb.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb.setLength(length);
                    sb.append(this.OLrzqt);
                }
            }
            return true;
        }

        private boolean AEQbTJ(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.AEQbTJ;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
                i4 = i5;
            }
            int i6 = i4 + 2;
            if (i6 > charSequence.length()) {
                return z;
            }
            char cCharAt = charSequence.charAt(i4);
            char cCharAt2 = charSequence.charAt(i4 + 1);
            if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || (i2 = ((cCharAt - '0') * 10) + (cCharAt2 - '0')) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i6;
            return false;
        }

        private int KWHzl(String str) {
            int i = 0;
            while (true) {
                String[] strArr = copydefault;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
                if (strArr[i].equals(str)) {
                    return i;
                }
                i++;
            }
        }

        Dialog(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            this.AEQbTJ = KWHzl(str);
            this.OLrzqt = str2;
        }
    }

    enum SettingsParser implements StateListAnimator {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                c56361yCn.OLrzqt(true);
            } else if (iOrdinal == 1) {
                c56361yCn.OLrzqt(false);
            } else if (iOrdinal == 2) {
                c56361yCn.KWHzl(true);
            } else if (iOrdinal == 3) {
                c56361yCn.KWHzl(false);
            }
            return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r10 == 1) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5 A[FALL_THROUGH, PHI: r7
  0x00f5: PHI (r7v1 boolean) = (r7v0 boolean), (r7v2 boolean), (r7v0 boolean), (r7v0 boolean), (r7v3 boolean), (r7v0 boolean), (r7v4 boolean) binds: [B:3:0x000a, B:55:0x00b5, B:22:0x0030, B:23:0x0033, B:96:?, B:24:0x0036, B:97:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void copydefault(char c, int i, InterfaceC56372yCy interfaceC56372yCy) {
        TextStyle textStyle;
        boolean z = false;
        if (c == 'Q') {
            if (i == 1 || i == 2) {
                if (c != 'c' || c == 'e') {
                    AEQbTJ(new PictureInPictureParams(c, i));
                    return;
                } else if (c != 'E') {
                    if (i != 1) {
                        AEQbTJ(interfaceC56372yCy, 2);
                        return;
                    }
                    KWHzl(interfaceC56372yCy);
                    return;
                }
            } else if (i != 3) {
                if (i == 4) {
                    textStyle = z ? TextStyle.FULL_STANDALONE : TextStyle.FULL;
                } else {
                    if (i != 5) {
                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                    }
                    textStyle = z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW;
                }
            } else if (z) {
                textStyle = TextStyle.SHORT_STANDALONE;
            }
            textStyle = TextStyle.SHORT;
        } else {
            if (c == 'S') {
                EZpvd((InterfaceC56372yCy) ChronoField.NANO_OF_SECOND, i, i, false);
                return;
            }
            if (c != 'a') {
                if (c != 'h' && c != 'k' && c != 'm') {
                    if (c == 'q') {
                        z = true;
                    } else if (c != 's') {
                        if (c != 'u' && c != 'y') {
                            switch (c) {
                                case 'D':
                                    if (i != 1) {
                                        if (i > 3) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c);
                                        }
                                        AEQbTJ(interfaceC56372yCy, i);
                                        return;
                                    }
                                    KWHzl(interfaceC56372yCy);
                                    return;
                                case 'E':
                                    break;
                                case 'F':
                                    if (i != 1) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                                    }
                                    KWHzl(interfaceC56372yCy);
                                    return;
                                case 'G':
                                    if (i != 1 && i != 2 && i != 3) {
                                        if (i != 4) {
                                            if (i != 5) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + c);
                                            }
                                        }
                                    }
                                    break;
                                case 'H':
                                    break;
                                default:
                                    switch (c) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z = true;
                                        case 'M':
                                            break;
                                        default:
                                            switch (c) {
                                                case 'c':
                                                    if (i == 2) {
                                                        throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                    }
                                                    z = true;
                                                    if (i == 1) {
                                                        if (c != 'c') {
                                                            break;
                                                        }
                                                        AEQbTJ(new PictureInPictureParams(c, i));
                                                        return;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else if (i == 2) {
                            OLrzqt(interfaceC56372yCy, 2, 2, VoiceInteractor.AhwBna);
                            return;
                        } else {
                            OLrzqt(interfaceC56372yCy, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                            return;
                        }
                    }
                    if (i == 1) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                    }
                    AEQbTJ(interfaceC56372yCy, i);
                    return;
                }
                KWHzl(interfaceC56372yCy);
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Too many pattern letters: " + c);
            }
            textStyle = TextStyle.SHORT;
        }
        OLrzqt(interfaceC56372yCy, textStyle);
    }

    static final class ActionBar implements StateListAnimator {
        private final boolean AEQbTJ;
        private final InterfaceC56372yCy KWHzl;
        private final int OLrzqt;
        private final int copydefault;

        public String toString() {
            return "Fraction(" + this.KWHzl + "," + this.OLrzqt + "," + this.copydefault + (this.AEQbTJ ? ",DecimalPoint" : "") + ")";
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int i2 = 0;
            int i3 = c56361yCn.AhwBna() ? this.OLrzqt : 0;
            int i4 = c56361yCn.AhwBna() ? this.copydefault : 9;
            int length = charSequence.length();
            if (i == length) {
                return i3 > 0 ? ~i : i;
            }
            if (this.AEQbTJ) {
                if (charSequence.charAt(i) != c56361yCn.EZpvd().KWHzl()) {
                    return i3 > 0 ? ~i : i;
                }
                i++;
            }
            int i5 = i;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int iMin = Math.min(i4 + i5, length);
            int i7 = i5;
            while (true) {
                if (i7 >= iMin) {
                    break;
                }
                int i8 = i7 + 1;
                int iKWHzl = c56361yCn.EZpvd().KWHzl(charSequence.charAt(i7));
                if (iKWHzl >= 0) {
                    i2 = (i2 * 10) + iKWHzl;
                    i7 = i8;
                } else if (i8 < i6) {
                    return ~i5;
                }
            }
            return c56361yCn.EZpvd(this.KWHzl, KWHzl(new BigDecimal(i2).movePointLeft(i7 - i5)), i5, i7);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            Long lOLrzqt = c56362yCo.OLrzqt(this.KWHzl);
            if (lOLrzqt == null) {
                return false;
            }
            C56359yCl c56359yClEZpvd = c56362yCo.EZpvd();
            BigDecimal bigDecimalCopydefault = copydefault(lOLrzqt.longValue());
            if (bigDecimalCopydefault.scale() != 0) {
                String strOLrzqt = c56359yClEZpvd.OLrzqt(bigDecimalCopydefault.setScale(Math.min(Math.max(bigDecimalCopydefault.scale(), this.OLrzqt), this.copydefault), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.AEQbTJ) {
                    sb.append(c56359yClEZpvd.KWHzl());
                }
                sb.append(strOLrzqt);
                return true;
            }
            if (this.OLrzqt <= 0) {
                return true;
            }
            if (this.AEQbTJ) {
                sb.append(c56359yClEZpvd.KWHzl());
            }
            for (int i = 0; i < this.OLrzqt; i++) {
                sb.append(c56359yClEZpvd.EZpvd());
            }
            return true;
        }

        private BigDecimal copydefault(long j) {
            ValueRange valueRangeRange = this.KWHzl.range();
            valueRangeRange.checkValidValue(j, this.KWHzl);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return bigDecimalDivide.compareTo(bigDecimal) == 0 ? bigDecimal : bigDecimalDivide.stripTrailingZeros();
        }

        private long KWHzl(BigDecimal bigDecimal) {
            ValueRange valueRangeRange = this.KWHzl.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            return bigDecimal.multiply(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact();
        }

        ActionBar(InterfaceC56372yCy interfaceC56372yCy, int i, int i2, boolean z) {
            Objects.requireNonNull(interfaceC56372yCy, "field");
            if (!interfaceC56372yCy.range().isFixed()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + interfaceC56372yCy);
            }
            if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            }
            if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            }
            if (i2 >= i) {
                this.KWHzl = interfaceC56372yCy;
                this.OLrzqt = i;
                this.copydefault = i2;
                this.AEQbTJ = z;
                return;
            }
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    public static final class Application implements StateListAnimator {
        private final StateListAnimator[] EZpvd;
        private final boolean KWHzl;

        public Application KWHzl(boolean z) {
            return z == this.KWHzl ? this : new Application(this.EZpvd, z);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.EZpvd != null) {
                sb.append(this.KWHzl ? "[" : "(");
                for (StateListAnimator stateListAnimator : this.EZpvd) {
                    sb.append(stateListAnimator);
                }
                sb.append(this.KWHzl ? "]" : ")");
            }
            return sb.toString();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            if (!this.KWHzl) {
                for (StateListAnimator stateListAnimator : this.EZpvd) {
                    i = stateListAnimator.parse(c56361yCn, charSequence, i);
                    if (i < 0) {
                        break;
                    }
                }
                return i;
            }
            c56361yCn.AYXKKw();
            int i2 = i;
            for (StateListAnimator stateListAnimator2 : this.EZpvd) {
                i2 = stateListAnimator2.parse(c56361yCn, charSequence, i2);
                if (i2 < 0) {
                    c56361yCn.AEQbTJ(false);
                    return i;
                }
            }
            c56361yCn.AEQbTJ(true);
            return i2;
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET]}, finally: {[IGET, INVOKE, IF] complete} */
        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            int length = sb.length();
            if (this.KWHzl) {
                c56362yCo.copydefault();
            }
            try {
                for (StateListAnimator stateListAnimator : this.EZpvd) {
                    if (!stateListAnimator.format(c56362yCo, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.KWHzl) {
                    c56362yCo.AEQbTJ();
                }
                return true;
            } finally {
                if (this.KWHzl) {
                    c56362yCo.AEQbTJ();
                }
            }
        }

        Application(StateListAnimator[] stateListAnimatorArr, boolean z) {
            this.EZpvd = stateListAnimatorArr;
            this.KWHzl = z;
        }

        Application(List list, boolean z) {
            this((StateListAnimator[]) list.toArray(new StateListAnimator[list.size()]), z);
        }
    }

    static class ClipData implements StateListAnimator {
        private static volatile Map.Entry AEQbTJ;
        private static volatile Map.Entry EZpvd;
        private final String KWHzl;
        private final yCG copydefault;

        public String toString() {
            return this.KWHzl;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i == length) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                return AEQbTJ(c56361yCn, charSequence, i, i, Dialog.KWHzl);
            }
            int i3 = i + 2;
            if (length >= i3) {
                char cCharAt2 = charSequence.charAt(i + 1);
                if (c56361yCn.copydefault(cCharAt, 'U') && c56361yCn.copydefault(cCharAt2, 'T')) {
                    int i4 = i + 3;
                    return (length < i4 || !c56361yCn.copydefault(charSequence.charAt(i3), 'C')) ? AEQbTJ(c56361yCn, charSequence, i, i3, Dialog.EZpvd) : AEQbTJ(c56361yCn, charSequence, i, i4, Dialog.EZpvd);
                }
                if (c56361yCn.copydefault(cCharAt, 'G') && length >= (i2 = i + 3) && c56361yCn.copydefault(cCharAt2, 'M') && c56361yCn.copydefault(charSequence.charAt(i3), 'T')) {
                    return AEQbTJ(c56361yCn, charSequence, i, i2, Dialog.EZpvd);
                }
            }
            SharedElementCallback sharedElementCallbackEZpvd = EZpvd(c56361yCn);
            ParsePosition parsePosition = new ParsePosition(i);
            String strKWHzl = sharedElementCallbackEZpvd.KWHzl(charSequence, parsePosition);
            if (strKWHzl != null) {
                c56361yCn.KWHzl(ZoneId.of(strKWHzl));
                return parsePosition.getIndex();
            }
            if (!c56361yCn.copydefault(cCharAt, 'Z')) {
                return ~i;
            }
            c56361yCn.KWHzl(ZoneOffset.UTC);
            return i + 1;
        }

        protected SharedElementCallback EZpvd(C56361yCn c56361yCn) {
            Set setEZpvd = yCH.EZpvd();
            int size = setEZpvd.size();
            Map.Entry simpleImmutableEntry = c56361yCn.copydefault() ? EZpvd : AEQbTJ;
            if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                synchronized (this) {
                    simpleImmutableEntry = c56361yCn.copydefault() ? EZpvd : AEQbTJ;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), SharedElementCallback.copydefault(setEZpvd, c56361yCn));
                        if (c56361yCn.copydefault()) {
                            EZpvd = simpleImmutableEntry;
                        } else {
                            AEQbTJ = simpleImmutableEntry;
                        }
                    }
                }
            }
            return (SharedElementCallback) simpleImmutableEntry.getValue();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) c56362yCo.KWHzl(this.copydefault);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.getId());
            return true;
        }

        private int AEQbTJ(C56361yCn c56361yCn, CharSequence charSequence, int i, int i2, Dialog dialog) {
            String upperCase = charSequence.toString().substring(i, i2).toUpperCase();
            if (i2 >= charSequence.length() || charSequence.charAt(i2) == '0' || c56361yCn.copydefault(charSequence.charAt(i2), 'Z')) {
                c56361yCn.KWHzl(ZoneId.of(upperCase));
                return i2;
            }
            C56361yCn c56361yCnOLrzqt = c56361yCn.OLrzqt();
            int i3 = dialog.parse(c56361yCnOLrzqt, charSequence, i2);
            try {
                if (i3 >= 0) {
                    c56361yCn.KWHzl(ZoneId.ofOffset(upperCase, ZoneOffset.ofTotalSeconds((int) c56361yCnOLrzqt.copydefault(ChronoField.OFFSET_SECONDS).longValue())));
                    return i3;
                }
                if (dialog == Dialog.KWHzl) {
                    return ~i;
                }
                c56361yCn.KWHzl(ZoneId.of(upperCase));
                return i2;
            } catch (DateTimeException unused) {
                return ~i;
            }
        }

        ClipData(yCG ycg, String str) {
            this.copydefault = ycg;
            this.KWHzl = str;
        }
    }

    static final class PendingIntent implements StateListAnimator {
        private final TextStyle EZpvd;

        public String toString() {
            return "LocalizedOffset(" + this.EZpvd + ")";
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int i2;
            int iEZpvd;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int length = charSequence.length() + i;
            if (!c56361yCn.EZpvd(charSequence, i, "GMT", 0, 3)) {
                return ~i;
            }
            int i8 = i + 3;
            if (i8 == length) {
                return c56361yCn.EZpvd(ChronoField.OFFSET_SECONDS, 0L, i, i8);
            }
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt == '+') {
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return c56361yCn.EZpvd(ChronoField.OFFSET_SECONDS, 0L, i, i8);
                }
                i2 = -1;
            }
            int i9 = i + 4;
            int i10 = 0;
            if (this.EZpvd != TextStyle.FULL) {
                int i11 = i + 5;
                iEZpvd = EZpvd(charSequence, i9);
                if (iEZpvd < 0) {
                    return ~i;
                }
                if (i11 < length) {
                    int iEZpvd2 = EZpvd(charSequence, i11);
                    if (iEZpvd2 >= 0) {
                        iEZpvd = (iEZpvd * 10) + iEZpvd2;
                        i11 = i + 6;
                    }
                    int i12 = i11 + 2;
                    if (i12 < length && charSequence.charAt(i11) == ':' && i12 < length && charSequence.charAt(i11) == ':') {
                        int iEZpvd3 = EZpvd(charSequence, i11 + 1);
                        int iEZpvd4 = EZpvd(charSequence, i12);
                        if (iEZpvd3 >= 0 && iEZpvd4 >= 0) {
                            int i13 = iEZpvd4 + (iEZpvd3 * 10);
                            i5 = i11 + 3;
                            int i14 = i11 + 5;
                            if (i14 < length && charSequence.charAt(i5) == ':') {
                                int iEZpvd5 = EZpvd(charSequence, i11 + 4);
                                int iEZpvd6 = EZpvd(charSequence, i14);
                                if (iEZpvd5 >= 0 && iEZpvd6 >= 0) {
                                    i10 = (iEZpvd5 * 10) + iEZpvd6;
                                    int i15 = i11 + 6;
                                    i6 = i13;
                                    i7 = i15;
                                }
                            }
                            i6 = i13;
                            i4 = i10;
                            i3 = i5;
                            i10 = i6;
                            return c56361yCn.EZpvd(ChronoField.OFFSET_SECONDS, ((long) i2) * ((((long) iEZpvd) * 3600) + (((long) i10) * 60) + ((long) i4)), i, i3);
                        }
                    }
                }
                i3 = i11;
                i4 = 0;
                return c56361yCn.EZpvd(ChronoField.OFFSET_SECONDS, ((long) i2) * ((((long) iEZpvd) * 3600) + (((long) i10) * 60) + ((long) i4)), i, i3);
            }
            int iEZpvd7 = EZpvd(charSequence, i9);
            int iEZpvd8 = EZpvd(charSequence, i + 5);
            if (iEZpvd7 < 0 || iEZpvd8 < 0 || charSequence.charAt(i + 6) != ':') {
                return ~i;
            }
            iEZpvd = (iEZpvd7 * 10) + iEZpvd8;
            int iEZpvd9 = EZpvd(charSequence, i + 7);
            i7 = i + 9;
            int iEZpvd10 = EZpvd(charSequence, i + 8);
            if (iEZpvd9 < 0 || iEZpvd10 < 0) {
                return ~i;
            }
            i6 = (iEZpvd9 * 10) + iEZpvd10;
            int i16 = i + 11;
            if (i16 < length && charSequence.charAt(i7) == ':') {
                int iEZpvd11 = EZpvd(charSequence, i + 10);
                int iEZpvd12 = EZpvd(charSequence, i16);
                if (iEZpvd11 >= 0 && iEZpvd12 >= 0) {
                    i10 = (iEZpvd11 * 10) + iEZpvd12;
                    i7 = i + 12;
                }
            }
            i5 = i7;
            i4 = i10;
            i3 = i5;
            i10 = i6;
            return c56361yCn.EZpvd(ChronoField.OFFSET_SECONDS, ((long) i2) * ((((long) iEZpvd) * 3600) + (((long) i10) * 60) + ((long) i4)), i, i3);
        }

        int EZpvd(CharSequence charSequence, int i) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return -1;
            }
            return cCharAt - '0';
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            Long lOLrzqt = c56362yCo.OLrzqt(ChronoField.OFFSET_SECONDS);
            if (lOLrzqt == null) {
                return false;
            }
            sb.append("GMT");
            int intExact = Math.toIntExact(lOLrzqt.longValue());
            if (intExact == 0) {
                return true;
            }
            int iAbs = Math.abs((intExact / IMarketApiService.SIXTY_MINUTES) % 100);
            int iAbs2 = Math.abs((intExact / 60) % 60);
            int iAbs3 = Math.abs(intExact % 60);
            sb.append(intExact < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
            if (this.EZpvd == TextStyle.FULL) {
                OLrzqt(sb, iAbs);
                sb.append(AbstractJsonLexerKt.COLON);
                OLrzqt(sb, iAbs2);
                if (iAbs3 == 0) {
                    return true;
                }
            } else {
                if (iAbs >= 10) {
                    sb.append((char) ((iAbs / 10) + 48));
                }
                sb.append((char) ((iAbs % 10) + 48));
                if (iAbs2 == 0 && iAbs3 == 0) {
                    return true;
                }
                sb.append(AbstractJsonLexerKt.COLON);
                OLrzqt(sb, iAbs2);
                if (iAbs3 == 0) {
                    return true;
                }
            }
            sb.append(AbstractJsonLexerKt.COLON);
            OLrzqt(sb, iAbs3);
            return true;
        }

        private static StringBuilder OLrzqt(StringBuilder sb, int i) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            return sb;
        }

        PendingIntent(TextStyle textStyle) {
            this.EZpvd = textStyle;
        }
    }

    public static /* synthetic */ ZoneId EZpvd(InterfaceC56365yCr interfaceC56365yCr) {
        ZoneId zoneId = (ZoneId) interfaceC56365yCr.query(AbstractC56371yCx.djBIcL());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }

    static final class ComponentCallbacks2 extends ClipData {
        private static final Map copydefault = new ConcurrentHashMap();
        private final Map AEQbTJ;
        private Set EZpvd;
        private final Map KWHzl;
        private final TextStyle OLrzqt;

        @Override // j$.time.format.DateTimeFormatterBuilder.ClipData
        protected SharedElementCallback EZpvd(C56361yCn c56361yCn) {
            SharedElementCallback sharedElementCallbackOLrzqt;
            if (this.OLrzqt == TextStyle.NARROW) {
                return super.EZpvd(c56361yCn);
            }
            Locale localeAEQbTJ = c56361yCn.AEQbTJ();
            boolean zCopydefault = c56361yCn.copydefault();
            Set setEZpvd = yCH.EZpvd();
            int size = setEZpvd.size();
            Map map = zCopydefault ? this.KWHzl : this.AEQbTJ;
            Map.Entry entry = (Map.Entry) map.get(localeAEQbTJ);
            if (entry == null || ((Integer) entry.getKey()).intValue() != size || (sharedElementCallbackOLrzqt = (SharedElementCallback) ((SoftReference) entry.getValue()).get()) == null) {
                sharedElementCallbackOLrzqt = SharedElementCallback.OLrzqt(c56361yCn);
                String[][] zoneStrings = DateFormatSymbols.getInstance(localeAEQbTJ).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String[] strArr = zoneStrings[i];
                    String str = strArr[0];
                    if (setEZpvd.contains(str)) {
                        sharedElementCallbackOLrzqt.KWHzl(str, str);
                        String strCopydefault = AbstractC56364yCq.copydefault(str, localeAEQbTJ);
                        for (int i2 = this.OLrzqt != TextStyle.FULL ? 2 : 1; i2 < strArr.length; i2 += 2) {
                            sharedElementCallbackOLrzqt.KWHzl(strArr[i2], strCopydefault);
                        }
                    }
                    i++;
                }
                if (this.EZpvd != null) {
                    for (String[] strArr2 : zoneStrings) {
                        String str2 = strArr2[0];
                        if (this.EZpvd.contains(str2) && setEZpvd.contains(str2)) {
                            for (int i3 = this.OLrzqt == TextStyle.FULL ? 1 : 2; i3 < strArr2.length; i3 += 2) {
                                sharedElementCallbackOLrzqt.KWHzl(strArr2[i3], str2);
                            }
                        }
                    }
                }
                map.put(localeAEQbTJ, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(sharedElementCallbackOLrzqt)));
            }
            return sharedElementCallbackOLrzqt;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.ClipData, j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) c56362yCo.KWHzl(AbstractC56371yCx.djBIcL());
            int i = 0;
            if (zoneId == null) {
                return false;
            }
            String id = zoneId.getId();
            if (!(zoneId instanceof ZoneOffset)) {
                InterfaceC56365yCr interfaceC56365yCrKWHzl = c56362yCo.KWHzl();
                if (!interfaceC56365yCrKWHzl.isSupported(ChronoField.INSTANT_SECONDS)) {
                    i = 2;
                } else if (zoneId.getRules().isDaylightSavings(Instant.from(interfaceC56365yCrKWHzl))) {
                    i = 1;
                }
                String strAEQbTJ = AEQbTJ(id, i, c56362yCo.OLrzqt());
                if (strAEQbTJ != null) {
                    id = strAEQbTJ;
                }
            }
            sb.append(id);
            return true;
        }

        private String AEQbTJ(String str, int i, Locale locale) {
            String[] strArr;
            Map concurrentHashMap = null;
            if (this.OLrzqt == TextStyle.NARROW) {
                return null;
            }
            Map map = copydefault;
            SoftReference softReference = (SoftReference) map.get(str);
            if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                strArr = new String[]{str, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), str, str};
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                concurrentHashMap.put(locale, strArr);
                map.put(str, new SoftReference(concurrentHashMap));
            }
            int iZoneNameStyleIndex = this.OLrzqt.zoneNameStyleIndex();
            return i != 0 ? i != 1 ? strArr[iZoneNameStyleIndex + 5] : strArr[iZoneNameStyleIndex + 3] : strArr[iZoneNameStyleIndex + 1];
        }

        ComponentCallbacks2(TextStyle textStyle, Set set) {
            super(AbstractC56371yCx.gEmmrt(), "ZoneText(" + textStyle + ")");
            this.KWHzl = new HashMap();
            this.AEQbTJ = new HashMap();
            Objects.requireNonNull(textStyle, "textStyle");
            this.OLrzqt = textStyle;
            if (set == null || set.size() == 0) {
                return;
            }
            this.EZpvd = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.EZpvd.add(((ZoneId) it.next()).getId());
            }
        }
    }

    static final class PictureInPictureParams implements StateListAnimator {
        private char EZpvd;
        private int KWHzl;

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.EZpvd;
            if (c == 'Y') {
                int i = this.KWHzl;
                if (i == 1) {
                    str2 = "WeekBasedYear";
                } else if (i == 2) {
                    str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.KWHzl);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    sb.append(this.KWHzl < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
                sb.append(str2);
            } else {
                if (c == 'W') {
                    str = "WeekOfMonth";
                } else if (c == 'c' || c == 'e') {
                    str = "DayOfWeek";
                } else {
                    if (c == 'w') {
                        str = "WeekOfWeekBasedYear";
                    }
                    sb.append(",");
                    sb.append(this.KWHzl);
                }
                sb.append(str);
                sb.append(",");
                sb.append(this.KWHzl);
            }
            sb.append(")");
            return sb.toString();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            return OLrzqt(c56361yCn.AEQbTJ()).parse(c56361yCn, charSequence, i);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            return OLrzqt(c56362yCo.OLrzqt()).format(c56362yCo, sb);
        }

        private StateListAnimator OLrzqt(Locale locale) {
            InterfaceC56372yCy interfaceC56372yCyWeekOfMonth;
            WeekFields weekFieldsOf = WeekFields.of(locale);
            char c = this.EZpvd;
            if (c == 'W') {
                interfaceC56372yCyWeekOfMonth = weekFieldsOf.weekOfMonth();
            } else {
                if (c == 'Y') {
                    InterfaceC56372yCy interfaceC56372yCyWeekBasedYear = weekFieldsOf.weekBasedYear();
                    int i = this.KWHzl;
                    if (i == 2) {
                        return new VoiceInteractor(interfaceC56372yCyWeekBasedYear, 2, 2, 0, VoiceInteractor.AhwBna, 0);
                    }
                    return new LoaderManager(interfaceC56372yCyWeekBasedYear, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, -1);
                }
                if (c == 'c' || c == 'e') {
                    interfaceC56372yCyWeekOfMonth = weekFieldsOf.dayOfWeek();
                } else {
                    if (c != 'w') {
                        throw new IllegalStateException("unreachable");
                    }
                    interfaceC56372yCyWeekOfMonth = weekFieldsOf.weekOfWeekBasedYear();
                }
            }
            return new LoaderManager(interfaceC56372yCyWeekOfMonth, this.KWHzl == 2 ? 2 : 1, 2, SignStyle.NOT_NEGATIVE);
        }

        PictureInPictureParams(char c, int i) {
            this.EZpvd = c;
            this.KWHzl = i;
        }
    }

    static final class TaskStackBuilder implements StateListAnimator {
        private final C56360yCm AEQbTJ;
        private volatile LoaderManager EZpvd;
        private final TextStyle KWHzl;
        private final InterfaceC56372yCy copydefault;

        public String toString() {
            StringBuilder sb;
            Object obj;
            if (this.KWHzl == TextStyle.FULL) {
                sb = new StringBuilder();
                sb.append("Text(");
                obj = this.copydefault;
            } else {
                sb = new StringBuilder();
                sb.append("Text(");
                sb.append(this.copydefault);
                sb.append(",");
                obj = this.KWHzl;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            TextStyle textStyle = c56361yCn.AhwBna() ? this.KWHzl : null;
            InterfaceC56351yCd interfaceC56351yCdKWHzl = c56361yCn.KWHzl();
            Iterator itCopydefault = (interfaceC56351yCdKWHzl == null || interfaceC56351yCdKWHzl == IsoChronology.INSTANCE) ? this.AEQbTJ.copydefault(this.copydefault, textStyle, c56361yCn.AEQbTJ()) : this.AEQbTJ.copydefault(interfaceC56351yCdKWHzl, this.copydefault, textStyle, c56361yCn.AEQbTJ());
            if (itCopydefault != null) {
                while (itCopydefault.hasNext()) {
                    Map.Entry entry = (Map.Entry) itCopydefault.next();
                    String str = (String) entry.getKey();
                    if (c56361yCn.EZpvd(str, 0, charSequence, i, str.length())) {
                        return c56361yCn.EZpvd(this.copydefault, ((Long) entry.getValue()).longValue(), i, i + str.length());
                    }
                }
                if (c56361yCn.AhwBna()) {
                    return ~i;
                }
            }
            return AEQbTJ().parse(c56361yCn, charSequence, i);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            Long lOLrzqt = c56362yCo.OLrzqt(this.copydefault);
            if (lOLrzqt == null) {
                return false;
            }
            InterfaceC56351yCd interfaceC56351yCd = (InterfaceC56351yCd) c56362yCo.KWHzl().query(AbstractC56371yCx.EZpvd());
            String strKWHzl = (interfaceC56351yCd == null || interfaceC56351yCd == IsoChronology.INSTANCE) ? this.AEQbTJ.KWHzl(this.copydefault, lOLrzqt.longValue(), this.KWHzl, c56362yCo.OLrzqt()) : this.AEQbTJ.AEQbTJ(interfaceC56351yCd, this.copydefault, lOLrzqt.longValue(), this.KWHzl, c56362yCo.OLrzqt());
            if (strKWHzl == null) {
                return AEQbTJ().format(c56362yCo, sb);
            }
            sb.append(strKWHzl);
            return true;
        }

        private LoaderManager AEQbTJ() {
            if (this.EZpvd == null) {
                this.EZpvd = new LoaderManager(this.copydefault, 1, 19, SignStyle.NORMAL);
            }
            return this.EZpvd;
        }

        TaskStackBuilder(InterfaceC56372yCy interfaceC56372yCy, TextStyle textStyle, C56360yCm c56360yCm) {
            this.copydefault = interfaceC56372yCy;
            this.KWHzl = textStyle;
            this.AEQbTJ = c56360yCm;
        }
    }

    public static String EZpvd(FormatStyle formatStyle, FormatStyle formatStyle2, InterfaceC56351yCd interfaceC56351yCd, Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(interfaceC56351yCd, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        if (dateInstance instanceof SimpleDateFormat) {
            return AbstractC56357yCj.copydefault(((SimpleDateFormat) dateInstance).toPattern());
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateInstance);
    }

    static final class Activity implements StateListAnimator {
        private final char AEQbTJ;

        public String toString() {
            if (this.AEQbTJ == '\'') {
                return "''";
            }
            return "'" + this.AEQbTJ + "'";
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            return (cCharAt == this.AEQbTJ || (!c56361yCn.copydefault() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(this.AEQbTJ) || Character.toLowerCase(cCharAt) == Character.toLowerCase(this.AEQbTJ)))) ? i + 1 : ~i;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            sb.append(this.AEQbTJ);
            return true;
        }

        Activity(char c) {
            this.AEQbTJ = c;
        }
    }

    static final class AssistContent implements StateListAnimator {
        private final String KWHzl;

        public String toString() {
            return "'" + this.KWHzl.replace("'", "''") + "'";
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.KWHzl;
            return !c56361yCn.EZpvd(charSequence, i, str, 0, str.length()) ? ~i : i + this.KWHzl.length();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            sb.append(this.KWHzl);
            return true;
        }

        AssistContent(String str) {
            this.KWHzl = str;
        }
    }

    static final class Fragment implements StateListAnimator {
        private final int OLrzqt;

        public String toString() {
            return "Instant()";
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4 = this.OLrzqt;
            int i5 = 0;
            int i6 = i4 < 0 ? 0 : i4;
            if (i4 < 0) {
                i4 = 9;
            }
            DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd = new DateTimeFormatterBuilder().KWHzl(C56350yCc.copydefault).EZpvd('T');
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd2 = dateTimeFormatterBuilderEZpvd.AEQbTJ(chronoField, 2).EZpvd(AbstractJsonLexerKt.COLON);
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            DateTimeFormatterBuilder dateTimeFormatterBuilderEZpvd3 = dateTimeFormatterBuilderEZpvd2.AEQbTJ(chronoField2, 2).EZpvd(AbstractJsonLexerKt.COLON);
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            DateTimeFormatterBuilder dateTimeFormatterBuilderAEQbTJ = dateTimeFormatterBuilderEZpvd3.AEQbTJ(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            Application applicationEZpvd = dateTimeFormatterBuilderAEQbTJ.EZpvd((InterfaceC56372yCy) chronoField4, i6, i4, true).EZpvd('Z').AhwBna().EZpvd(false);
            C56361yCn c56361yCnOLrzqt = c56361yCn.OLrzqt();
            int i7 = applicationEZpvd.parse(c56361yCnOLrzqt, charSequence, i);
            if (i7 < 0) {
                return i7;
            }
            long jLongValue = c56361yCnOLrzqt.copydefault(ChronoField.YEAR).longValue();
            int iIntValue = c56361yCnOLrzqt.copydefault(ChronoField.MONTH_OF_YEAR).intValue();
            int iIntValue2 = c56361yCnOLrzqt.copydefault(ChronoField.DAY_OF_MONTH).intValue();
            int iIntValue3 = c56361yCnOLrzqt.copydefault(chronoField).intValue();
            int iIntValue4 = c56361yCnOLrzqt.copydefault(chronoField2).intValue();
            Long lCopydefault = c56361yCnOLrzqt.copydefault(chronoField3);
            Long lCopydefault2 = c56361yCnOLrzqt.copydefault(chronoField4);
            int iIntValue5 = lCopydefault != null ? lCopydefault.intValue() : 0;
            int iIntValue6 = lCopydefault2 != null ? lCopydefault2.intValue() : 0;
            if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                i2 = 0;
                i3 = iIntValue5;
                i5 = 1;
            } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                c56361yCn.valueOf();
                i2 = iIntValue3;
                i3 = 59;
            } else {
                i2 = iIntValue3;
                i3 = iIntValue5;
            }
            try {
                return c56361yCn.EZpvd(chronoField4, iIntValue6, i, c56361yCn.EZpvd(ChronoField.INSTANT_SECONDS, Math.multiplyExact(jLongValue / WorkRequest.MIN_BACKOFF_MILLIS, 315569520000L) + LocalDateTime.of(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3, 0).plusDays(i5).copydefault(ZoneOffset.UTC), i, i7));
            } catch (RuntimeException unused) {
                return ~i;
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            Long lOLrzqt = c56362yCo.OLrzqt(ChronoField.INSTANT_SECONDS);
            InterfaceC56365yCr interfaceC56365yCrKWHzl = c56362yCo.KWHzl();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long lValueOf = interfaceC56365yCrKWHzl.isSupported(chronoField) ? Long.valueOf(c56362yCo.KWHzl().getLong(chronoField)) : null;
            int i = 0;
            if (lOLrzqt == null) {
                return false;
            }
            long jLongValue = lOLrzqt.longValue();
            int iCheckValidIntValue = chronoField.checkValidIntValue(lValueOf != null ? lValueOf.longValue() : 0L);
            if (jLongValue >= -62167219200L) {
                long j = jLongValue - 253402300800L;
                long jFloorDiv = 1 + Math.floorDiv(j, 315569520000L);
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                if (jFloorDiv > 0) {
                    sb.append('+');
                    sb.append(jFloorDiv);
                }
                sb.append(localDateTimeOfEpochSecond);
                if (localDateTimeOfEpochSecond.getSecond() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = jLongValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(j4 - 62167219200L, 0, ZoneOffset.UTC);
                int length = sb.length();
                sb.append(localDateTimeOfEpochSecond2);
                if (localDateTimeOfEpochSecond2.getSecond() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (localDateTimeOfEpochSecond2.getYear() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.OLrzqt;
            if ((i2 < 0 && iCheckValidIntValue > 0) || i2 > 0) {
                sb.append('.');
                int i3 = 100000000;
                while (true) {
                    int i4 = this.OLrzqt;
                    if ((i4 != -1 || iCheckValidIntValue <= 0) && ((i4 != -2 || (iCheckValidIntValue <= 0 && i % 3 == 0)) && i >= i4)) {
                        break;
                    }
                    int i5 = iCheckValidIntValue / i3;
                    sb.append((char) (i5 + 48));
                    iCheckValidIntValue -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb.append('Z');
            return true;
        }

        Fragment(int i) {
            this.OLrzqt = i;
        }
    }

    static final class FragmentManager implements StateListAnimator {
        private final int KWHzl;
        private final StateListAnimator OLrzqt;
        private final char copydefault;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.OLrzqt);
            sb.append(",");
            sb.append(this.KWHzl);
            if (this.copydefault == ' ') {
                str = ")";
            } else {
                str = ",'" + this.copydefault + "')";
            }
            sb.append(str);
            return sb.toString();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            boolean zAhwBna = c56361yCn.AhwBna();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            if (i == charSequence.length()) {
                return ~i;
            }
            int length = this.KWHzl + i;
            if (length > charSequence.length()) {
                if (zAhwBna) {
                    return ~i;
                }
                length = charSequence.length();
            }
            int i2 = i;
            while (i2 < length && c56361yCn.copydefault(charSequence.charAt(i2), this.copydefault)) {
                i2++;
            }
            int i3 = this.OLrzqt.parse(c56361yCn, charSequence.subSequence(0, length), i2);
            return (i3 == length || !zAhwBna) ? i3 : ~(i + i2);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            int length = sb.length();
            if (!this.OLrzqt.format(c56362yCo, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.KWHzl) {
                for (int i = 0; i < this.KWHzl - length2; i++) {
                    sb.insert(length, this.copydefault);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.KWHzl);
        }

        FragmentManager(StateListAnimator stateListAnimator, int i, char c) {
            this.OLrzqt = stateListAnimator;
            this.KWHzl = i;
            this.copydefault = c;
        }
    }

    private DateTimeFormatterBuilder OLrzqt(LoaderManager loaderManager) {
        LoaderManager loaderManagerCopydefault;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.copydefault;
        int i = dateTimeFormatterBuilder.AYXKKw;
        if (i >= 0) {
            LoaderManager loaderManager2 = (LoaderManager) dateTimeFormatterBuilder.valueOf.get(i);
            if (loaderManager.AEQbTJ == loaderManager.KWHzl && loaderManager.djBIcL == SignStyle.NOT_NEGATIVE) {
                loaderManagerCopydefault = loaderManager2.KWHzl(loaderManager.KWHzl);
                AEQbTJ(loaderManager.copydefault());
                this.copydefault.AYXKKw = i;
            } else {
                loaderManagerCopydefault = loaderManager2.copydefault();
                this.copydefault.AYXKKw = AEQbTJ(loaderManager);
            }
            this.copydefault.valueOf.set(i, loaderManagerCopydefault);
        } else {
            dateTimeFormatterBuilder.AYXKKw = AEQbTJ(loaderManager);
        }
        return this;
    }

    /* JADX INFO: loaded from: classes17.dex */
    static class TaskDescription implements StateListAnimator {
        private final InterfaceC56372yCy EZpvd;
        private final long OLrzqt;

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public boolean format(C56362yCo c56362yCo, StringBuilder sb) {
            return true;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.StateListAnimator
        public int parse(C56361yCn c56361yCn, CharSequence charSequence, int i) {
            if (c56361yCn.copydefault(this.EZpvd) == null) {
                c56361yCn.EZpvd(this.EZpvd, this.OLrzqt, i, i);
            }
            return i;
        }

        TaskDescription(InterfaceC56372yCy interfaceC56372yCy, long j) {
            this.EZpvd = interfaceC56372yCy;
            this.OLrzqt = j;
        }
    }

    private int AEQbTJ(StateListAnimator stateListAnimator) {
        Objects.requireNonNull(stateListAnimator, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.copydefault;
        int i = dateTimeFormatterBuilder.AhwBna;
        if (i > 0) {
            FragmentManager fragmentManager = new FragmentManager(stateListAnimator, i, dateTimeFormatterBuilder.djBIcL);
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.copydefault;
            dateTimeFormatterBuilder2.AhwBna = 0;
            dateTimeFormatterBuilder2.djBIcL = (char) 0;
            stateListAnimator = fragmentManager;
        }
        this.copydefault.valueOf.add(stateListAnimator);
        this.copydefault.AYXKKw = -1;
        return r4.valueOf.size() - 1;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.copydefault = this;
        this.valueOf = new ArrayList();
        this.AYXKKw = -1;
        this.gEmmrt = dateTimeFormatterBuilder;
        this.EZpvd = z;
    }

    /* JADX INFO: renamed from: j$.time.format.DateTimeFormatterBuilder$3, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[SignStyle.values().length];
            AEQbTJ = iArr;
            try {
                iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[SignStyle.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[SignStyle.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DateTimeFormatterBuilder() {
        this.copydefault = this;
        this.valueOf = new ArrayList();
        this.AYXKKw = -1;
        this.gEmmrt = null;
        this.EZpvd = false;
    }

    static {
        HashMap map = new HashMap();
        KWHzl = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        InterfaceC56372yCy interfaceC56372yCy = IsoFields.OLrzqt;
        map.put('Q', interfaceC56372yCy);
        map.put('q', interfaceC56372yCy);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        AEQbTJ = new Comparator() { // from class: j$.time.format.DateTimeFormatterBuilder.1
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
            }
        };
    }
}
