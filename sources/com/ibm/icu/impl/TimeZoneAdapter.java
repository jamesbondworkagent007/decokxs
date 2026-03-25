package com.ibm.icu.impl;

import j$.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;
import o.yBY;
import o.yCN;

/* JADX INFO: loaded from: classes14.dex */
public class TimeZoneAdapter extends TimeZone {
    static final long serialVersionUID = -2040072218820018557L;
    private com.ibm.icu.util.TimeZone zone;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.TimeZone
    public /* synthetic */ ZoneId toZoneId() {
        return yCN.AEQbTJ(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.TimeZone
    public /* synthetic */ java.time.ZoneId toZoneId() {
        return yBY.dR_(toZoneId());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public com.ibm.icu.util.TimeZone unwrap() {
        return this.zone;
    }

    public static TimeZone wrap(com.ibm.icu.util.TimeZone timeZone) {
        return new TimeZoneAdapter(timeZone);
    }

    public TimeZoneAdapter(com.ibm.icu.util.TimeZone timeZone) {
        this.zone = timeZone;
        super.setID(timeZone.getID());
    }

    @Override // java.util.TimeZone
    public void setID(String str) {
        super.setID(str);
        this.zone.setID(str);
    }

    @Override // java.util.TimeZone
    public boolean hasSameRules(TimeZone timeZone) {
        return (timeZone instanceof TimeZoneAdapter) && this.zone.hasSameRules(((TimeZoneAdapter) timeZone).zone);
    }

    @Override // java.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.zone.getOffset(i, i2, i3, i4, i5, i6);
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.zone.getRawOffset();
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i) {
        this.zone.setRawOffset(i);
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return this.zone.useDaylightTime();
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return this.zone.inDaylightTime(date);
    }

    @Override // java.util.TimeZone
    public Object clone() {
        return new TimeZoneAdapter((com.ibm.icu.util.TimeZone) this.zone.clone());
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this) {
            iHashCode = this.zone.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeZoneAdapter)) {
            return false;
        }
        return this.zone.equals(((TimeZoneAdapter) obj).zone);
    }

    public String toString() {
        return "TimeZoneAdapter: " + this.zone.toString();
    }
}
