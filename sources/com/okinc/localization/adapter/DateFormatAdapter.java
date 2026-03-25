package com.okinc.localization.adapter;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class DateFormatAdapter {
    public static final Map<String, SimpleDateFormat> EZpvd;
    public static final Map<String, com.ibm.icu.text.SimpleDateFormat> KWHzl;
    public SimpleDateFormat AEQbTJ;
    public final DateFormatType AYXKKw;
    public final Locale AhwBna;
    public com.ibm.icu.text.SimpleDateFormat copydefault;
    public final String gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;

    public DateFormatAdapter(@NotNull String str, @NotNull Locale locale, @NotNull DateFormatType dateFormatType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(dateFormatType, "");
        this.gEmmrt = str;
        this.AhwBna = locale;
        this.AYXKKw = dateFormatType;
        AEQbTJ();
    }

    public final String OLrzqt(@NotNull Date date) {
        String str;
        Intrinsics.checkNotNullParameter(date, "");
        SimpleDateFormat simpleDateFormat = this.AEQbTJ;
        if (simpleDateFormat != null && (str = simpleDateFormat.format(date)) != null) {
            return str;
        }
        com.ibm.icu.text.SimpleDateFormat simpleDateFormat2 = this.copydefault;
        String str2 = simpleDateFormat2 != null ? simpleDateFormat2.format(date) : null;
        return str2 == null ? "" : str2;
    }

    public final String KWHzl() {
        String localizedPattern;
        SimpleDateFormat simpleDateFormat = this.AEQbTJ;
        if (simpleDateFormat != null && (localizedPattern = simpleDateFormat.toLocalizedPattern()) != null) {
            return localizedPattern;
        }
        com.ibm.icu.text.SimpleDateFormat simpleDateFormat2 = this.copydefault;
        String localizedPattern2 = simpleDateFormat2 != null ? simpleDateFormat2.toLocalizedPattern() : null;
        return localizedPattern2 == null ? "" : localizedPattern2;
    }

    public final void AEQbTJ() {
        if (this.AYXKKw == DateFormatType.ANDROID_LIB) {
            this.AEQbTJ = Companion.copydefault(this.gEmmrt, this.AhwBna);
        } else {
            this.copydefault = Companion.OLrzqt(this.gEmmrt, this.AhwBna);
        }
    }

    public final void AEQbTJ(@NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "");
        SimpleDateFormat simpleDateFormat = this.AEQbTJ;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(android.icu.util.TimeZone.getTimeZone(timeZone.getID()));
            return;
        }
        com.ibm.icu.text.SimpleDateFormat simpleDateFormat2 = this.copydefault;
        if (simpleDateFormat2 != null) {
            simpleDateFormat2.setTimeZone(com.ibm.icu.util.TimeZone.getTimeZone(timeZone.getID()));
        }
    }

    public final DateFormatAdapter copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SimpleDateFormat simpleDateFormat = this.AEQbTJ;
        if (simpleDateFormat != null) {
            simpleDateFormat.applyLocalizedPattern(str);
        } else {
            com.ibm.icu.text.SimpleDateFormat simpleDateFormat2 = this.copydefault;
            if (simpleDateFormat2 != null) {
                simpleDateFormat2.applyLocalizedPattern(str);
            }
        }
        return this;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DateFormatType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DateFormatType[] $VALUES;
        public static final DateFormatType ANDROID_LIB = new DateFormatType("ANDROID_LIB", 0);
        public static final DateFormatType ICU_LIB = new DateFormatType("ICU_LIB", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DateFormatType[] $values() {
            return new DateFormatType[]{ANDROID_LIB, ICU_LIB};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DateFormatType> getEntries() {
            return $ENTRIES;
        }

        private DateFormatType(String str, int i) {
        }

        static {
            DateFormatType[] dateFormatTypeArr$values = $values();
            $VALUES = dateFormatTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dateFormatTypeArr$values);
        }

        public static DateFormatType valueOf(String str) {
            return (DateFormatType) Enum.valueOf(DateFormatType.class, str);
        }

        public static DateFormatType[] values() {
            return (DateFormatType[]) $VALUES.clone();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization.adapter.DateFormatAdapter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String AEQbTJ(String str, Locale locale) {
            return str + "_" + locale.toLanguageTag();
        }

        public final SimpleDateFormat copydefault(String str, Locale locale) {
            String strAEQbTJ = AEQbTJ(str, locale);
            Map map = DateFormatAdapter.EZpvd;
            Object obj = map.get(strAEQbTJ);
            if (obj == null) {
                Object instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
                Intrinsics.copydefault(instanceForSkeleton, "");
                obj = (SimpleDateFormat) instanceForSkeleton;
                map.put(strAEQbTJ, obj);
            }
            return (SimpleDateFormat) obj;
        }

        public final com.ibm.icu.text.SimpleDateFormat OLrzqt(String str, Locale locale) {
            String strAEQbTJ = AEQbTJ(str, locale);
            Map map = DateFormatAdapter.KWHzl;
            Object obj = map.get(strAEQbTJ);
            if (obj == null) {
                Object instanceForSkeleton = com.ibm.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
                Intrinsics.copydefault(instanceForSkeleton, "");
                obj = (com.ibm.icu.text.SimpleDateFormat) instanceForSkeleton;
                map.put(strAEQbTJ, obj);
            }
            return (com.ibm.icu.text.SimpleDateFormat) obj;
        }
    }

    static {
        Map<String, SimpleDateFormat> mapSynchronizedMap = Collections.synchronizedMap(new SimpleLRUMap(128, 0, 0.0f, 6, null));
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "");
        EZpvd = mapSynchronizedMap;
        Map<String, com.ibm.icu.text.SimpleDateFormat> mapSynchronizedMap2 = Collections.synchronizedMap(new SimpleLRUMap(128, 0, 0.0f, 6, null));
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap2, "");
        KWHzl = mapSynchronizedMap2;
    }
}
