package com.ibm.icu.impl.duration;

import androidx.camera.video.AudioStats;
import com.ibm.icu.text.DurationFormat;
import com.ibm.icu.util.ULocale;
import java.text.FieldPosition;
import java.util.Date;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.Duration;
import o.C7080adA;
import o.C7125adt;
import o.C7126adu;
import o.InterfaceC7082adC;
import o.InterfaceC7124ads;
import o.InterfaceC7127adv;

/* JADX INFO: loaded from: classes22.dex */
public class BasicDurationFormat extends DurationFormat {
    private static final long serialVersionUID = -3146984141909457700L;
    transient InterfaceC7124ads formatter;
    transient InterfaceC7127adv pformatter;
    transient InterfaceC7082adC pfs;

    public static BasicDurationFormat getInstance(ULocale uLocale) {
        return new BasicDurationFormat(uLocale);
    }

    @Override // com.ibm.icu.text.DurationFormat, java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Long) {
            stringBuffer.append(formatDurationFromNow(((Long) obj).longValue()));
            return stringBuffer;
        }
        if (obj instanceof Date) {
            stringBuffer.append(formatDurationFromNowTo((Date) obj));
            return stringBuffer;
        }
        if (obj instanceof Duration) {
            stringBuffer.append(formatDuration(obj));
            return stringBuffer;
        }
        throw new IllegalArgumentException("Cannot format given Object as a Duration");
    }

    public BasicDurationFormat() {
        this.pfs = null;
        C7125adt c7125adtKWHzl = C7125adt.KWHzl();
        this.pfs = c7125adtKWHzl;
        this.formatter = c7125adtKWHzl.AEQbTJ().EZpvd();
        this.pformatter = this.pfs.EZpvd().OLrzqt(false).AEQbTJ();
    }

    public BasicDurationFormat(ULocale uLocale) {
        super(uLocale);
        this.pfs = null;
        C7125adt c7125adtKWHzl = C7125adt.KWHzl();
        this.pfs = c7125adtKWHzl;
        this.formatter = c7125adtKWHzl.AEQbTJ().copydefault(uLocale.getName()).EZpvd();
        this.pformatter = this.pfs.EZpvd().OLrzqt(false).KWHzl(uLocale.getName()).AEQbTJ();
    }

    @Override // com.ibm.icu.text.DurationFormat
    public String formatDurationFrom(long j, long j2) {
        return this.formatter.copydefault(j, j2);
    }

    @Override // com.ibm.icu.text.DurationFormat
    public String formatDurationFromNow(long j) {
        return this.formatter.copydefault(j);
    }

    @Override // com.ibm.icu.text.DurationFormat
    public String formatDurationFromNowTo(Date date) {
        return this.formatter.AEQbTJ(date);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String formatDuration(Object obj) {
        boolean z;
        C7126adu c7126aduKWHzl;
        float f;
        C7080adA c7080adA;
        C7126adu c7126aduOLrzqt;
        DatatypeConstants.Field[] fieldArr = {DatatypeConstants.YEARS, DatatypeConstants.MONTHS, DatatypeConstants.DAYS, DatatypeConstants.HOURS, DatatypeConstants.MINUTES, DatatypeConstants.SECONDS};
        C7080adA[] c7080adAArr = {C7080adA.valueOf, C7080adA.OLrzqt, C7080adA.copydefault, C7080adA.EZpvd, C7080adA.KWHzl, C7080adA.gEmmrt};
        Duration durationNegate = (Duration) obj;
        if (durationNegate.getSign() < 0) {
            durationNegate = durationNegate.negate();
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        C7126adu c7126adu = null;
        for (int i = 0; i < 6; i++) {
            if (durationNegate.isSet(fieldArr[i])) {
                Number field = durationNegate.getField(fieldArr[i]);
                if (field.intValue() != 0 || z2) {
                    float fFloatValue = field.floatValue();
                    if (c7080adAArr[i] == C7080adA.gEmmrt) {
                        double d = fFloatValue;
                        double dFloor = Math.floor(d);
                        double d2 = (d - dFloor) * 1000.0d;
                        if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                            float f2 = (float) d2;
                            c7080adA = C7080adA.AEQbTJ;
                            fFloatValue = (float) dFloor;
                            f = f2;
                        } else {
                            f = 0.0f;
                            c7080adA = null;
                        }
                        if (c7126adu == null) {
                            c7126aduOLrzqt = C7126adu.copydefault(fFloatValue, c7080adAArr[i]);
                        } else {
                            c7126aduOLrzqt = c7126adu.OLrzqt(fFloatValue, c7080adAArr[i]);
                        }
                        if (c7080adA != null) {
                            c7126aduOLrzqt = c7126aduOLrzqt.OLrzqt(f, c7080adA);
                        }
                        c7126adu = c7126aduOLrzqt;
                        z2 = true;
                    }
                }
            }
        }
        if (c7126adu == null) {
            return formatDurationFromNow(0L);
        }
        if (z) {
            c7126aduKWHzl = c7126adu.EZpvd();
        } else {
            c7126aduKWHzl = c7126adu.KWHzl();
        }
        return this.pformatter.OLrzqt(c7126aduKWHzl);
    }
}
