package com.ibm.icu.util;

import com.ibm.icu.util.MeasureUnit;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;

/* JADX INFO: loaded from: classes3.dex */
public class TimeUnit extends MeasureUnit {
    private static final long serialVersionUID = -2839973855554750484L;
    private final int index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TimeUnit[] values() {
        return new TimeUnit[]{MeasureUnit.SECOND, MeasureUnit.MINUTE, MeasureUnit.HOUR, MeasureUnit.DAY, MeasureUnit.WEEK, MeasureUnit.MONTH, MeasureUnit.YEAR};
    }

    public TimeUnit(String str, String str2) {
        super(str, str2);
        this.index = 0;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new MeasureUnit.MeasureUnitProxy(this.type, this.subType);
    }

    private Object readResolve() throws ObjectStreamException {
        switch (this.index) {
            case 0:
                return MeasureUnit.YEAR;
            case 1:
                return MeasureUnit.MONTH;
            case 2:
                return MeasureUnit.WEEK;
            case 3:
                return MeasureUnit.DAY;
            case 4:
                return MeasureUnit.HOUR;
            case 5:
                return MeasureUnit.MINUTE;
            case 6:
                return MeasureUnit.SECOND;
            default:
                throw new InvalidObjectException("Bad index: " + this.index);
        }
    }
}
