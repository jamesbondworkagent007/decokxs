package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: o.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5614Ym {
    public static java.lang.Object OLrzqt(JavaType javaType) {
        java.lang.Class<?> rawClass = javaType.getRawClass();
        java.lang.Class<?> clsHDKMBd = C5619Yr.hDKMBd(rawClass);
        if (clsHDKMBd != null) {
            return C5619Yr.copydefault(clsHDKMBd);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == java.lang.String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public static java.lang.String AEQbTJ(JavaType javaType) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String name = javaType.getRawClass().getName();
        if (AEQbTJ(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!OLrzqt(name)) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return java.lang.String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, C5619Yr.copydefault(javaType), str2);
    }

    public static boolean AEQbTJ(java.lang.String str) {
        return str.startsWith("java.time.");
    }

    public static boolean OLrzqt(java.lang.String str) {
        return str.startsWith("org.joda.time.");
    }
}
