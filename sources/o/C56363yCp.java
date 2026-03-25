package o;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yCp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
final class C56363yCp implements InterfaceC56365yCr {
    boolean AEQbTJ;
    private LocalTime AYXKKw;
    InterfaceC56351yCd EZpvd;
    ZoneId copydefault;
    private ResolverStyle djBIcL;
    private yBW valueOf;
    final java.util.Map OLrzqt = new java.util.HashMap();
    Period KWHzl = Period.ZERO;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(this.OLrzqt);
        sb.append(AbstractJsonLexerKt.COMMA);
        sb.append(this.EZpvd);
        if (this.copydefault != null) {
            sb.append(AbstractJsonLexerKt.COMMA);
            sb.append(this.copydefault);
        }
        if (this.valueOf != null || this.AYXKKw != null) {
            sb.append(" resolved to ");
            yBW ybw = this.valueOf;
            if (ybw != null) {
                sb.append(ybw);
                if (this.AYXKKw != null) {
                    sb.append('T');
                    sb.append(this.AYXKKw);
                }
            } else {
                sb.append(this.AYXKKw);
            }
        }
        return sb.toString();
    }

    InterfaceC56365yCr EZpvd(ResolverStyle resolverStyle, java.util.Set set) {
        if (set != null) {
            this.OLrzqt.keySet().retainAll(set);
        }
        this.djBIcL = resolverStyle;
        KWHzl();
        gEmmrt();
        OLrzqt();
        djBIcL();
        EZpvd();
        AYXKKw();
        return this;
    }

    @Override // o.InterfaceC56365yCr
    public java.lang.Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.djBIcL()) {
            return this.copydefault;
        }
        if (ycg == AbstractC56371yCx.EZpvd()) {
            return this.EZpvd;
        }
        if (ycg == AbstractC56371yCx.OLrzqt()) {
            yBW ybw = this.valueOf;
            if (ybw != null) {
                return LocalDate.from(ybw);
            }
            return null;
        }
        if (ycg == AbstractC56371yCx.KWHzl()) {
            return this.AYXKKw;
        }
        if (ycg == AbstractC56371yCx.gEmmrt() || ycg == AbstractC56371yCx.copydefault()) {
            return ycg.AEQbTJ(this);
        }
        if (ycg == AbstractC56371yCx.AEQbTJ()) {
            return null;
        }
        return ycg.AEQbTJ(this);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        yBW ybw;
        LocalTime localTime;
        return this.OLrzqt.containsKey(interfaceC56372yCy) || ((ybw = this.valueOf) != null && ybw.isSupported(interfaceC56372yCy)) || (((localTime = this.AYXKKw) != null && localTime.isSupported(interfaceC56372yCy)) || !(interfaceC56372yCy == null || (interfaceC56372yCy instanceof ChronoField) || !interfaceC56372yCy.isSupportedBy(this)));
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        Objects.requireNonNull(interfaceC56372yCy, "field");
        java.lang.Long l = (java.lang.Long) this.OLrzqt.get(interfaceC56372yCy);
        if (l != null) {
            return l.longValue();
        }
        yBW ybw = this.valueOf;
        if (ybw != null && ybw.isSupported(interfaceC56372yCy)) {
            return this.valueOf.getLong(interfaceC56372yCy);
        }
        LocalTime localTime = this.AYXKKw;
        if (localTime != null && localTime.isSupported(interfaceC56372yCy)) {
            return this.AYXKKw.getLong(interfaceC56372yCy);
        }
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    C56363yCp AEQbTJ() {
        C56363yCp c56363yCp = new C56363yCp();
        c56363yCp.OLrzqt.putAll(this.OLrzqt);
        c56363yCp.copydefault = this.copydefault;
        c56363yCp.EZpvd = this.EZpvd;
        c56363yCp.AEQbTJ = this.AEQbTJ;
        return c56363yCp;
    }

    private void AEQbTJ(InterfaceC56372yCy interfaceC56372yCy, InterfaceC56372yCy interfaceC56372yCy2, java.lang.Long l) {
        java.lang.Long l2 = (java.lang.Long) this.OLrzqt.put(interfaceC56372yCy2, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + interfaceC56372yCy2 + " " + l2 + " differs from " + interfaceC56372yCy2 + " " + l + " while resolving  " + interfaceC56372yCy);
    }

    private void KWHzl(yBW ybw) {
        yBW ybw2 = this.valueOf;
        if (ybw2 != null) {
            if (ybw == null || ybw2.equals(ybw)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.valueOf + " " + ybw);
        }
        if (ybw != null) {
            if (this.EZpvd.equals(ybw.getChronology())) {
                this.valueOf = ybw;
                return;
            }
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.EZpvd);
        }
    }

    private void EZpvd(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.AYXKKw;
        if (localTime2 == null) {
            this.AYXKKw = localTime;
        } else {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.AYXKKw + " " + localTime);
            }
            if (!this.KWHzl.isZero() && !period.isZero() && !this.KWHzl.equals(period)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.KWHzl + " " + period);
            }
        }
        this.KWHzl = period;
    }

    private void gEmmrt() {
        java.util.Map map;
        ChronoField chronoField;
        if (this.AYXKKw == null) {
            java.util.Map map2 = this.OLrzqt;
            ChronoField chronoField2 = ChronoField.MILLI_OF_SECOND;
            long j = 1000;
            if (map2.containsKey(chronoField2)) {
                long jLongValue = ((java.lang.Long) this.OLrzqt.remove(chronoField2)).longValue();
                java.util.Map map3 = this.OLrzqt;
                ChronoField chronoField3 = ChronoField.MICRO_OF_SECOND;
                if (map3.containsKey(chronoField3)) {
                    jLongValue = (jLongValue * 1000) + (((java.lang.Long) this.OLrzqt.get(chronoField3)).longValue() % 1000);
                    AEQbTJ(chronoField2, chronoField3, java.lang.Long.valueOf(jLongValue));
                    this.OLrzqt.remove(chronoField3);
                    map = this.OLrzqt;
                    chronoField = ChronoField.NANO_OF_SECOND;
                } else {
                    map = this.OLrzqt;
                    chronoField = ChronoField.NANO_OF_SECOND;
                    j = 1000000;
                }
                map.put(chronoField, java.lang.Long.valueOf(jLongValue * j));
            } else {
                java.util.Map map4 = this.OLrzqt;
                ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                if (map4.containsKey(chronoField4)) {
                    this.OLrzqt.put(ChronoField.NANO_OF_SECOND, java.lang.Long.valueOf(((java.lang.Long) this.OLrzqt.remove(chronoField4)).longValue() * 1000));
                }
            }
            java.util.Map map5 = this.OLrzqt;
            ChronoField chronoField5 = ChronoField.HOUR_OF_DAY;
            java.lang.Long l = (java.lang.Long) map5.get(chronoField5);
            if (l != null) {
                java.util.Map map6 = this.OLrzqt;
                ChronoField chronoField6 = ChronoField.MINUTE_OF_HOUR;
                java.lang.Long l2 = (java.lang.Long) map6.get(chronoField6);
                java.util.Map map7 = this.OLrzqt;
                ChronoField chronoField7 = ChronoField.SECOND_OF_MINUTE;
                java.lang.Long l3 = (java.lang.Long) map7.get(chronoField7);
                java.util.Map map8 = this.OLrzqt;
                ChronoField chronoField8 = ChronoField.NANO_OF_SECOND;
                java.lang.Long l4 = (java.lang.Long) map8.get(chronoField8);
                if (l2 == null && (l3 != null || l4 != null)) {
                    return;
                }
                if (l2 != null && l3 == null && l4 != null) {
                    return;
                }
                EZpvd(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                this.OLrzqt.remove(chronoField5);
                this.OLrzqt.remove(chronoField6);
                this.OLrzqt.remove(chronoField7);
                this.OLrzqt.remove(chronoField8);
            }
        }
        if (this.djBIcL == ResolverStyle.LENIENT || this.OLrzqt.size() <= 0) {
            return;
        }
        for (Map.Entry entry : this.OLrzqt.entrySet()) {
            InterfaceC56372yCy interfaceC56372yCy = (InterfaceC56372yCy) entry.getKey();
            if ((interfaceC56372yCy instanceof ChronoField) && interfaceC56372yCy.isTimeBased()) {
                ((ChronoField) interfaceC56372yCy).checkValidValue(((java.lang.Long) entry.getValue()).longValue());
            }
        }
    }

    private void AhwBna() {
        InterfaceC56372yCy interfaceC56372yCy;
        java.lang.Long lValueOf;
        java.util.Map map = this.OLrzqt;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(chronoField)) {
            long jLongValue = ((java.lang.Long) this.OLrzqt.remove(chronoField)).longValue();
            ResolverStyle resolverStyle = this.djBIcL;
            if (resolverStyle == ResolverStyle.STRICT || (resolverStyle == ResolverStyle.SMART && jLongValue != 0)) {
                chronoField.checkValidValue(jLongValue);
            }
            InterfaceC56372yCy interfaceC56372yCy2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            AEQbTJ(chronoField, interfaceC56372yCy2, java.lang.Long.valueOf(jLongValue));
        }
        java.util.Map map2 = this.OLrzqt;
        ChronoField chronoField2 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(chronoField2)) {
            long jLongValue2 = ((java.lang.Long) this.OLrzqt.remove(chronoField2)).longValue();
            ResolverStyle resolverStyle2 = this.djBIcL;
            if (resolverStyle2 == ResolverStyle.STRICT || (resolverStyle2 == ResolverStyle.SMART && jLongValue2 != 0)) {
                chronoField2.checkValidValue(jLongValue2);
            }
            AEQbTJ(chronoField2, ChronoField.HOUR_OF_AMPM, java.lang.Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        java.util.Map map3 = this.OLrzqt;
        ChronoField chronoField3 = ChronoField.AMPM_OF_DAY;
        if (map3.containsKey(chronoField3)) {
            java.util.Map map4 = this.OLrzqt;
            ChronoField chronoField4 = ChronoField.HOUR_OF_AMPM;
            if (map4.containsKey(chronoField4)) {
                long jLongValue3 = ((java.lang.Long) this.OLrzqt.remove(chronoField3)).longValue();
                long jLongValue4 = ((java.lang.Long) this.OLrzqt.remove(chronoField4)).longValue();
                if (this.djBIcL == ResolverStyle.LENIENT) {
                    interfaceC56372yCy = ChronoField.HOUR_OF_DAY;
                    lValueOf = java.lang.Long.valueOf(java.lang.Math.addExact(java.lang.Math.multiplyExact(jLongValue3, 12L), jLongValue4));
                } else {
                    chronoField3.checkValidValue(jLongValue3);
                    chronoField4.checkValidValue(jLongValue3);
                    interfaceC56372yCy = ChronoField.HOUR_OF_DAY;
                    lValueOf = java.lang.Long.valueOf((jLongValue3 * 12) + jLongValue4);
                }
                AEQbTJ(chronoField3, interfaceC56372yCy, lValueOf);
            }
        }
        java.util.Map map5 = this.OLrzqt;
        ChronoField chronoField5 = ChronoField.NANO_OF_DAY;
        if (map5.containsKey(chronoField5)) {
            long jLongValue5 = ((java.lang.Long) this.OLrzqt.remove(chronoField5)).longValue();
            if (this.djBIcL != ResolverStyle.LENIENT) {
                chronoField5.checkValidValue(jLongValue5);
            }
            AEQbTJ(chronoField5, ChronoField.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue5 / 3600000000000L));
            AEQbTJ(chronoField5, ChronoField.MINUTE_OF_HOUR, java.lang.Long.valueOf((jLongValue5 / 60000000000L) % 60));
            AEQbTJ(chronoField5, ChronoField.SECOND_OF_MINUTE, java.lang.Long.valueOf((jLongValue5 / com.google.android.exoplayer2.C.NANOS_PER_SECOND) % 60));
            AEQbTJ(chronoField5, ChronoField.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue5 % com.google.android.exoplayer2.C.NANOS_PER_SECOND));
        }
        java.util.Map map6 = this.OLrzqt;
        ChronoField chronoField6 = ChronoField.MICRO_OF_DAY;
        if (map6.containsKey(chronoField6)) {
            long jLongValue6 = ((java.lang.Long) this.OLrzqt.remove(chronoField6)).longValue();
            if (this.djBIcL != ResolverStyle.LENIENT) {
                chronoField6.checkValidValue(jLongValue6);
            }
            AEQbTJ(chronoField6, ChronoField.SECOND_OF_DAY, java.lang.Long.valueOf(jLongValue6 / 1000000));
            AEQbTJ(chronoField6, ChronoField.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue6 % 1000000));
        }
        java.util.Map map7 = this.OLrzqt;
        ChronoField chronoField7 = ChronoField.MILLI_OF_DAY;
        if (map7.containsKey(chronoField7)) {
            long jLongValue7 = ((java.lang.Long) this.OLrzqt.remove(chronoField7)).longValue();
            if (this.djBIcL != ResolverStyle.LENIENT) {
                chronoField7.checkValidValue(jLongValue7);
            }
            AEQbTJ(chronoField7, ChronoField.SECOND_OF_DAY, java.lang.Long.valueOf(jLongValue7 / 1000));
            AEQbTJ(chronoField7, ChronoField.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue7 % 1000));
        }
        java.util.Map map8 = this.OLrzqt;
        ChronoField chronoField8 = ChronoField.SECOND_OF_DAY;
        if (map8.containsKey(chronoField8)) {
            long jLongValue8 = ((java.lang.Long) this.OLrzqt.remove(chronoField8)).longValue();
            if (this.djBIcL != ResolverStyle.LENIENT) {
                chronoField8.checkValidValue(jLongValue8);
            }
            AEQbTJ(chronoField8, ChronoField.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue8 / 3600));
            AEQbTJ(chronoField8, ChronoField.MINUTE_OF_HOUR, java.lang.Long.valueOf((jLongValue8 / 60) % 60));
            AEQbTJ(chronoField8, ChronoField.SECOND_OF_MINUTE, java.lang.Long.valueOf(jLongValue8 % 60));
        }
        java.util.Map map9 = this.OLrzqt;
        ChronoField chronoField9 = ChronoField.MINUTE_OF_DAY;
        if (map9.containsKey(chronoField9)) {
            long jLongValue9 = ((java.lang.Long) this.OLrzqt.remove(chronoField9)).longValue();
            if (this.djBIcL != ResolverStyle.LENIENT) {
                chronoField9.checkValidValue(jLongValue9);
            }
            AEQbTJ(chronoField9, ChronoField.HOUR_OF_DAY, java.lang.Long.valueOf(jLongValue9 / 60));
            AEQbTJ(chronoField9, ChronoField.MINUTE_OF_HOUR, java.lang.Long.valueOf(jLongValue9 % 60));
        }
        java.util.Map map10 = this.OLrzqt;
        ChronoField chronoField10 = ChronoField.NANO_OF_SECOND;
        if (map10.containsKey(chronoField10)) {
            long jLongValue10 = ((java.lang.Long) this.OLrzqt.get(chronoField10)).longValue();
            ResolverStyle resolverStyle3 = this.djBIcL;
            ResolverStyle resolverStyle4 = ResolverStyle.LENIENT;
            if (resolverStyle3 != resolverStyle4) {
                chronoField10.checkValidValue(jLongValue10);
            }
            java.util.Map map11 = this.OLrzqt;
            ChronoField chronoField11 = ChronoField.MICRO_OF_SECOND;
            if (map11.containsKey(chronoField11)) {
                long jLongValue11 = ((java.lang.Long) this.OLrzqt.remove(chronoField11)).longValue();
                if (this.djBIcL != resolverStyle4) {
                    chronoField11.checkValidValue(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                AEQbTJ(chronoField11, chronoField10, java.lang.Long.valueOf(jLongValue10));
            }
            java.util.Map map12 = this.OLrzqt;
            ChronoField chronoField12 = ChronoField.MILLI_OF_SECOND;
            if (map12.containsKey(chronoField12)) {
                long jLongValue12 = ((java.lang.Long) this.OLrzqt.remove(chronoField12)).longValue();
                if (this.djBIcL != resolverStyle4) {
                    chronoField12.checkValidValue(jLongValue12);
                }
                AEQbTJ(chronoField12, chronoField10, java.lang.Long.valueOf((jLongValue12 * 1000000) + (jLongValue10 % 1000000)));
            }
        }
        java.util.Map map13 = this.OLrzqt;
        ChronoField chronoField13 = ChronoField.HOUR_OF_DAY;
        if (map13.containsKey(chronoField13)) {
            java.util.Map map14 = this.OLrzqt;
            ChronoField chronoField14 = ChronoField.MINUTE_OF_HOUR;
            if (map14.containsKey(chronoField14)) {
                java.util.Map map15 = this.OLrzqt;
                ChronoField chronoField15 = ChronoField.SECOND_OF_MINUTE;
                if (map15.containsKey(chronoField15) && this.OLrzqt.containsKey(chronoField10)) {
                    EZpvd(((java.lang.Long) this.OLrzqt.remove(chronoField13)).longValue(), ((java.lang.Long) this.OLrzqt.remove(chronoField14)).longValue(), ((java.lang.Long) this.OLrzqt.remove(chronoField15)).longValue(), ((java.lang.Long) this.OLrzqt.remove(chronoField10)).longValue());
                }
            }
        }
    }

    private void EZpvd(long j, long j2, long j3, long j4) {
        LocalTime localTimeOf;
        Period periodOfDays;
        if (this.djBIcL == ResolverStyle.LENIENT) {
            long jAddExact = java.lang.Math.addExact(java.lang.Math.addExact(java.lang.Math.addExact(java.lang.Math.multiplyExact(j, 3600000000000L), java.lang.Math.multiplyExact(j2, 60000000000L)), java.lang.Math.multiplyExact(j3, com.google.android.exoplayer2.C.NANOS_PER_SECOND)), j4);
            int iFloorDiv = (int) java.lang.Math.floorDiv(jAddExact, 86400000000000L);
            localTimeOf = LocalTime.ofNanoOfDay(java.lang.Math.floorMod(jAddExact, 86400000000000L));
            periodOfDays = Period.ofDays(iFloorDiv);
        } else {
            int iCheckValidIntValue = ChronoField.MINUTE_OF_HOUR.checkValidIntValue(j2);
            int iCheckValidIntValue2 = ChronoField.NANO_OF_SECOND.checkValidIntValue(j4);
            if (this.djBIcL == ResolverStyle.SMART && j == 24 && iCheckValidIntValue == 0 && j3 == 0 && iCheckValidIntValue2 == 0) {
                localTimeOf = LocalTime.MIDNIGHT;
                periodOfDays = Period.ofDays(1);
            } else {
                localTimeOf = LocalTime.of(ChronoField.HOUR_OF_DAY.checkValidIntValue(j), iCheckValidIntValue, ChronoField.SECOND_OF_MINUTE.checkValidIntValue(j3), iCheckValidIntValue2);
                periodOfDays = Period.ZERO;
            }
        }
        EZpvd(localTimeOf, periodOfDays);
    }

    private void djBIcL() {
        if (this.valueOf == null || this.AYXKKw == null || this.KWHzl.isZero()) {
            return;
        }
        this.valueOf = this.valueOf.plus(this.KWHzl);
        this.KWHzl = Period.ZERO;
    }

    private void OLrzqt(ZoneId zoneId) {
        java.util.Map map = this.OLrzqt;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        KWHzl(this.EZpvd.zonedDateTime(Instant.ofEpochSecond(((java.lang.Long) map.remove(chronoField)).longValue()), zoneId).toLocalDate());
        AEQbTJ(chronoField, ChronoField.SECOND_OF_DAY, java.lang.Long.valueOf(r5.toLocalTime().toSecondOfDay()));
    }

    private void valueOf() {
        if (this.OLrzqt.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneIdOfTotalSeconds = this.copydefault;
            if (zoneIdOfTotalSeconds == null) {
                java.lang.Long l = (java.lang.Long) this.OLrzqt.get(ChronoField.OFFSET_SECONDS);
                if (l == null) {
                    return;
                } else {
                    zoneIdOfTotalSeconds = ZoneOffset.ofTotalSeconds(l.intValue());
                }
            }
            OLrzqt(zoneIdOfTotalSeconds);
        }
    }

    private void AYXKKw() {
        LocalTime localTime;
        InterfaceC56353yCf interfaceC56353yCfAtZone;
        yBW ybw = this.valueOf;
        if (ybw == null || (localTime = this.AYXKKw) == null) {
            return;
        }
        if (this.copydefault != null) {
            interfaceC56353yCfAtZone = ybw.atTime(localTime).atZone(this.copydefault);
        } else {
            java.lang.Long l = (java.lang.Long) this.OLrzqt.get(ChronoField.OFFSET_SECONDS);
            if (l == null) {
                return;
            } else {
                interfaceC56353yCfAtZone = this.valueOf.atTime(this.AYXKKw).atZone(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        this.OLrzqt.put(chronoField, java.lang.Long.valueOf(interfaceC56353yCfAtZone.getLong(chronoField)));
    }

    private void EZpvd() {
        if (this.AYXKKw == null) {
            if (this.OLrzqt.containsKey(ChronoField.INSTANT_SECONDS) || this.OLrzqt.containsKey(ChronoField.SECOND_OF_DAY) || this.OLrzqt.containsKey(ChronoField.SECOND_OF_MINUTE)) {
                java.util.Map map = this.OLrzqt;
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                if (map.containsKey(chronoField)) {
                    long jLongValue = ((java.lang.Long) this.OLrzqt.get(chronoField)).longValue();
                    this.OLrzqt.put(ChronoField.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue / 1000));
                    this.OLrzqt.put(ChronoField.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue / 1000000));
                } else {
                    this.OLrzqt.put(chronoField, 0L);
                    this.OLrzqt.put(ChronoField.MICRO_OF_SECOND, 0L);
                    this.OLrzqt.put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
        }
    }

    private void KWHzl() {
        valueOf();
        copydefault();
        AhwBna();
        if (this.OLrzqt.size() > 0) {
            int i = 0;
            loop0: while (i < 50) {
                java.util.Iterator it = this.OLrzqt.entrySet().iterator();
                while (it.hasNext()) {
                    InterfaceC56372yCy interfaceC56372yCy = (InterfaceC56372yCy) ((Map.Entry) it.next()).getKey();
                    InterfaceC56365yCr interfaceC56365yCrResolve = interfaceC56372yCy.resolve(this.OLrzqt, this, this.djBIcL);
                    if (interfaceC56365yCrResolve != null) {
                        if (interfaceC56365yCrResolve instanceof InterfaceC56353yCf) {
                            InterfaceC56353yCf interfaceC56353yCf = (InterfaceC56353yCf) interfaceC56365yCrResolve;
                            ZoneId zoneId = this.copydefault;
                            if (zoneId == null) {
                                this.copydefault = interfaceC56353yCf.getZone();
                            } else if (!zoneId.equals(interfaceC56353yCf.getZone())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.copydefault);
                            }
                            interfaceC56365yCrResolve = interfaceC56353yCf.toLocalDateTime();
                        }
                        if (interfaceC56365yCrResolve instanceof InterfaceC56349yCb) {
                            InterfaceC56349yCb interfaceC56349yCb = (InterfaceC56349yCb) interfaceC56365yCrResolve;
                            EZpvd(interfaceC56349yCb.toLocalTime(), Period.ZERO);
                            KWHzl(interfaceC56349yCb.toLocalDate());
                        } else if (interfaceC56365yCrResolve instanceof yBW) {
                            KWHzl((yBW) interfaceC56365yCrResolve);
                        } else {
                            if (!(interfaceC56365yCrResolve instanceof LocalTime)) {
                                throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                            EZpvd((LocalTime) interfaceC56365yCrResolve, Period.ZERO);
                        }
                    } else if (!this.OLrzqt.containsKey(interfaceC56372yCy)) {
                        break;
                    }
                    i++;
                }
            }
            if (i == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i > 0) {
                valueOf();
                copydefault();
                AhwBna();
            }
        }
    }

    private void copydefault() {
        KWHzl(this.EZpvd.resolveDate(this.OLrzqt, this.djBIcL));
    }

    private void KWHzl(InterfaceC56365yCr interfaceC56365yCr) {
        java.util.Iterator it = this.OLrzqt.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC56372yCy interfaceC56372yCy = (InterfaceC56372yCy) entry.getKey();
            if (interfaceC56365yCr.isSupported(interfaceC56372yCy)) {
                try {
                    long j = interfaceC56365yCr.getLong(interfaceC56372yCy);
                    long jLongValue = ((java.lang.Long) entry.getValue()).longValue();
                    if (j != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + interfaceC56372yCy + " " + j + " differs from " + interfaceC56372yCy + " " + jLongValue + " derived from " + interfaceC56365yCr);
                    }
                    it.remove();
                } catch (java.lang.RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void OLrzqt() {
        yBW ybw = this.valueOf;
        if (ybw != null) {
            KWHzl((InterfaceC56365yCr) ybw);
        }
        LocalTime localTime = this.AYXKKw;
        if (localTime != null) {
            KWHzl(localTime);
            if (this.valueOf == null || this.OLrzqt.size() <= 0) {
                return;
            }
            KWHzl(this.valueOf.atTime(this.AYXKKw));
        }
    }

    C56363yCp() {
    }
}
