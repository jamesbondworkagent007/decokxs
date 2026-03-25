package o;

import j$.time.chrono.IsoChronology;
import j$.time.format.TextStyle;
import j$.time.temporal.ChronoField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: o.yCm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56360yCm {
    private static final ConcurrentMap copydefault = new ConcurrentHashMap(16, 0.75f, 2);
    private static final java.util.Comparator KWHzl = new java.util.Comparator() { // from class: o.yCm.2
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((java.lang.String) entry2.getKey()).length() - ((java.lang.String) entry.getKey()).length();
        }
    };

    public java.util.Iterator copydefault(InterfaceC56372yCy interfaceC56372yCy, TextStyle textStyle, java.util.Locale locale) {
        java.lang.Object objKWHzl = KWHzl(interfaceC56372yCy, locale);
        if (objKWHzl instanceof ActionBar) {
            return ((ActionBar) objKWHzl).copydefault(textStyle);
        }
        return null;
    }

    public java.util.Iterator copydefault(InterfaceC56351yCd interfaceC56351yCd, InterfaceC56372yCy interfaceC56372yCy, TextStyle textStyle, java.util.Locale locale) {
        if (interfaceC56351yCd == IsoChronology.INSTANCE || !(interfaceC56372yCy instanceof ChronoField)) {
            return copydefault(interfaceC56372yCy, textStyle, locale);
        }
        return null;
    }

    public java.lang.String KWHzl(InterfaceC56372yCy interfaceC56372yCy, long j, TextStyle textStyle, java.util.Locale locale) {
        java.lang.Object objKWHzl = KWHzl(interfaceC56372yCy, locale);
        if (objKWHzl instanceof ActionBar) {
            return ((ActionBar) objKWHzl).EZpvd(j, textStyle);
        }
        return null;
    }

    public java.lang.String AEQbTJ(InterfaceC56351yCd interfaceC56351yCd, InterfaceC56372yCy interfaceC56372yCy, long j, TextStyle textStyle, java.util.Locale locale) {
        if (interfaceC56351yCd == IsoChronology.INSTANCE || !(interfaceC56372yCy instanceof ChronoField)) {
            return KWHzl(interfaceC56372yCy, j, textStyle, locale);
        }
        return null;
    }

    public static C56360yCm OLrzqt() {
        return new C56360yCm();
    }

    private static java.lang.String OLrzqt(java.lang.String str) {
        return str.substring(0, java.lang.Character.charCount(str.codePointAt(0)));
    }

    private java.lang.Object KWHzl(InterfaceC56372yCy interfaceC56372yCy, java.util.Locale locale) {
        Map.Entry entryCopydefault = copydefault(interfaceC56372yCy, locale);
        ConcurrentMap concurrentMap = copydefault;
        java.lang.Object obj = concurrentMap.get(entryCopydefault);
        if (obj != null) {
            return obj;
        }
        concurrentMap.putIfAbsent(entryCopydefault, OLrzqt(interfaceC56372yCy, locale));
        return concurrentMap.get(entryCopydefault);
    }

    private java.lang.Object OLrzqt(InterfaceC56372yCy interfaceC56372yCy, java.util.Locale locale) {
        java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        if (interfaceC56372yCy == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            java.lang.String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(java.lang.Long.valueOf(j), eras[i]);
                    map3.put(java.lang.Long.valueOf(j), OLrzqt(eras[i]));
                }
                i++;
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            return new ActionBar(map);
        }
        if (interfaceC56372yCy == ChronoField.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            java.util.HashMap map4 = new java.util.HashMap();
            java.util.HashMap map5 = new java.util.HashMap();
            java.lang.String[] months = dateFormatSymbols2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = ((long) i2) + 1;
                    map4.put(java.lang.Long.valueOf(j2), months[i2]);
                    map5.put(java.lang.Long.valueOf(j2), OLrzqt(months[i2]));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.NARROW, map5);
            }
            java.util.HashMap map6 = new java.util.HashMap();
            java.lang.String[] shortMonths = dateFormatSymbols2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    map6.put(java.lang.Long.valueOf(((long) i) + 1), shortMonths[i]);
                }
                i++;
            }
            if (!map6.isEmpty()) {
                map.put(TextStyle.SHORT, map6);
            }
            return new ActionBar(map);
        }
        if (interfaceC56372yCy != ChronoField.DAY_OF_WEEK) {
            if (interfaceC56372yCy != ChronoField.AMPM_OF_DAY) {
                return "";
            }
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            java.util.HashMap map7 = new java.util.HashMap();
            java.util.HashMap map8 = new java.util.HashMap();
            java.lang.String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            while (i < amPmStrings.length) {
                if (!amPmStrings[i].isEmpty()) {
                    long j3 = i;
                    map7.put(java.lang.Long.valueOf(j3), amPmStrings[i]);
                    map8.put(java.lang.Long.valueOf(j3), OLrzqt(amPmStrings[i]));
                }
                i++;
            }
            if (!map7.isEmpty()) {
                map.put(TextStyle.FULL, map7);
                map.put(TextStyle.SHORT, map7);
                map.put(TextStyle.NARROW, map8);
            }
            return new ActionBar(map);
        }
        DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
        java.util.HashMap map9 = new java.util.HashMap();
        java.lang.String[] weekdays = dateFormatSymbols4.getWeekdays();
        map9.put(1L, weekdays[2]);
        map9.put(2L, weekdays[3]);
        map9.put(3L, weekdays[4]);
        map9.put(4L, weekdays[5]);
        map9.put(5L, weekdays[6]);
        map9.put(6L, weekdays[7]);
        map9.put(7L, weekdays[1]);
        map.put(TextStyle.FULL, map9);
        java.util.HashMap map10 = new java.util.HashMap();
        map10.put(1L, OLrzqt(weekdays[2]));
        map10.put(2L, OLrzqt(weekdays[3]));
        map10.put(3L, OLrzqt(weekdays[4]));
        map10.put(4L, OLrzqt(weekdays[5]));
        map10.put(5L, OLrzqt(weekdays[6]));
        map10.put(6L, OLrzqt(weekdays[7]));
        map10.put(7L, OLrzqt(weekdays[1]));
        map.put(TextStyle.NARROW, map10);
        java.util.HashMap map11 = new java.util.HashMap();
        java.lang.String[] shortWeekdays = dateFormatSymbols4.getShortWeekdays();
        map11.put(1L, shortWeekdays[2]);
        map11.put(2L, shortWeekdays[3]);
        map11.put(3L, shortWeekdays[4]);
        map11.put(4L, shortWeekdays[5]);
        map11.put(5L, shortWeekdays[6]);
        map11.put(6L, shortWeekdays[7]);
        map11.put(7L, shortWeekdays[1]);
        map.put(TextStyle.SHORT, map11);
        return new ActionBar(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry copydefault(java.lang.Object obj, java.lang.Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX INFO: renamed from: o.yCm$ActionBar */
    public static final class ActionBar {
        private final java.util.Map EZpvd;
        private final java.util.Map OLrzqt;

        public java.util.Iterator copydefault(TextStyle textStyle) {
            java.util.List list = (java.util.List) this.OLrzqt.get(textStyle);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }

        public java.lang.String EZpvd(long j, TextStyle textStyle) {
            java.util.Map map = (java.util.Map) this.EZpvd.get(textStyle);
            if (map != null) {
                return (java.lang.String) map.get(java.lang.Long.valueOf(j));
            }
            return null;
        }

        public ActionBar(java.util.Map map) {
            this.EZpvd = map;
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                java.util.HashMap map3 = new java.util.HashMap();
                for (Map.Entry entry2 : ((java.util.Map) entry.getValue()).entrySet()) {
                    map3.put((java.lang.String) entry2.getValue(), C56360yCm.copydefault((java.lang.String) entry2.getValue(), (java.lang.Long) entry2.getKey()));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(map3.values());
                Collections.sort(arrayList2, C56360yCm.KWHzl);
                map2.put((TextStyle) entry.getKey(), arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, C56360yCm.KWHzl);
            this.OLrzqt = map2;
        }
    }
}
