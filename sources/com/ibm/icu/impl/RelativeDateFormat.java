package com.ibm.icu.impl;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DisplayContext;
import com.ibm.icu.text.MessageFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.MissingResourceException;
import o.AbstractC7192afG;
import o.C7043acQ;
import o.C7223afl;

/* JADX INFO: loaded from: classes3.dex */
public class RelativeDateFormat extends DateFormat {
    private static final long serialVersionUID = 1131984966440549435L;
    private MessageFormat fCombinedFormat;
    private DateFormat fDateFormat;
    private String fDatePattern;
    int fDateStyle;
    private SimpleDateFormat fDateTimeFormat;
    ULocale fLocale;
    private DateFormat fTimeFormat;
    private String fTimePattern;
    int fTimeStyle;
    private transient List<TaskDescription> fDates = null;
    private boolean combinedFormatHasDateAtStart = false;
    private boolean capitalizationInfoIsSet = false;
    private boolean capitalizationOfRelativeUnitsForListOrMenu = false;
    private boolean capitalizationOfRelativeUnitsForStandAlone = false;
    private transient AbstractC7192afG capitalizationBrkIter = null;

    public static class TaskDescription {
        public String OLrzqt;
        public int copydefault;

        public TaskDescription(int i, String str) {
            this.copydefault = i;
            this.OLrzqt = str;
        }
    }

    public RelativeDateFormat(int i, int i2, ULocale uLocale, Calendar calendar) {
        this.fDateTimeFormat = null;
        this.fDatePattern = null;
        this.fTimePattern = null;
        this.calendar = calendar;
        this.fLocale = uLocale;
        this.fTimeStyle = i;
        this.fDateStyle = i2;
        if (i2 != -1) {
            DateFormat dateInstance = DateFormat.getDateInstance(i2 & (-129), uLocale);
            if (dateInstance instanceof SimpleDateFormat) {
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) dateInstance;
                this.fDateTimeFormat = simpleDateFormat;
                this.fDatePattern = simpleDateFormat.toPattern();
                int i3 = this.fTimeStyle;
                if (i3 != -1) {
                    DateFormat timeInstance = DateFormat.getTimeInstance(i3 & (-129), uLocale);
                    if (timeInstance instanceof SimpleDateFormat) {
                        this.fTimePattern = ((SimpleDateFormat) timeInstance).toPattern();
                    }
                }
            } else {
                throw new IllegalArgumentException("Can't create SimpleDateFormat for date style");
            }
        } else {
            DateFormat timeInstance2 = DateFormat.getTimeInstance(i & (-129), uLocale);
            if (timeInstance2 instanceof SimpleDateFormat) {
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) timeInstance2;
                this.fDateTimeFormat = simpleDateFormat2;
                this.fTimePattern = simpleDateFormat2.toPattern();
            } else {
                throw new IllegalArgumentException("Can't create SimpleDateFormat for time style");
            }
        }
        initializeCalendar(null, this.fLocale);
        loadDates();
        initializeCombinedFormat(this.calendar, this.fLocale);
    }

    @Override // com.ibm.icu.text.DateFormat
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String str;
        DisplayContext context = getContext(DisplayContext.Type.CAPITALIZATION);
        String stringForDay = this.fDateStyle != -1 ? getStringForDay(dayDifference(calendar)) : null;
        SimpleDateFormat simpleDateFormat = this.fDateTimeFormat;
        if (simpleDateFormat != null) {
            if (stringForDay != null && this.fDatePattern != null && (this.fTimePattern == null || this.fCombinedFormat == null || this.combinedFormatHasDateAtStart)) {
                if (stringForDay.length() > 0 && C7223afl.fetchVPNInfo(stringForDay.codePointAt(0)) && (context == DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE || ((context == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU && this.capitalizationOfRelativeUnitsForListOrMenu) || (context == DisplayContext.CAPITALIZATION_FOR_STANDALONE && this.capitalizationOfRelativeUnitsForStandAlone)))) {
                    if (this.capitalizationBrkIter == null) {
                        this.capitalizationBrkIter = AbstractC7192afG.copydefault(this.fLocale);
                    }
                    stringForDay = C7223afl.AEQbTJ(this.fLocale, stringForDay, this.capitalizationBrkIter, 768);
                }
                this.fDateTimeFormat.setContext(DisplayContext.CAPITALIZATION_NONE);
            } else {
                simpleDateFormat.setContext(context);
            }
        }
        SimpleDateFormat simpleDateFormat2 = this.fDateTimeFormat;
        if (simpleDateFormat2 == null || ((str = this.fDatePattern) == null && this.fTimePattern == null)) {
            DateFormat dateFormat = this.fDateFormat;
            if (dateFormat != null) {
                if (stringForDay != null) {
                    stringBuffer.append(stringForDay);
                } else {
                    dateFormat.format(calendar, stringBuffer, fieldPosition);
                }
            }
        } else if (str == null) {
            simpleDateFormat2.applyPattern(this.fTimePattern);
            this.fDateTimeFormat.format(calendar, stringBuffer, fieldPosition);
        } else if (this.fTimePattern != null) {
            if (stringForDay != null) {
                str = "'" + stringForDay.replace("'", "''") + "'";
            }
            StringBuffer stringBuffer2 = new StringBuffer("");
            this.fCombinedFormat.format(new Object[]{this.fTimePattern, str}, stringBuffer2, new FieldPosition(0));
            this.fDateTimeFormat.applyPattern(stringBuffer2.toString());
            this.fDateTimeFormat.format(calendar, stringBuffer, fieldPosition);
        } else if (stringForDay != null) {
            stringBuffer.append(stringForDay);
        } else {
            simpleDateFormat2.applyPattern(str);
            this.fDateTimeFormat.format(calendar, stringBuffer, fieldPosition);
        }
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.DateFormat
    public void parse(String str, Calendar calendar, ParsePosition parsePosition) {
        throw new UnsupportedOperationException("Relative Date parse is not implemented yet");
    }

    @Override // com.ibm.icu.text.DateFormat
    public void setContext(DisplayContext displayContext) {
        super.setContext(displayContext);
        if (!this.capitalizationInfoIsSet && (displayContext == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU || displayContext == DisplayContext.CAPITALIZATION_FOR_STANDALONE)) {
            initCapitalizationContextInfo(this.fLocale);
            this.capitalizationInfoIsSet = true;
        }
        if (this.capitalizationBrkIter == null) {
            if (displayContext == DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE || ((displayContext == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU && this.capitalizationOfRelativeUnitsForListOrMenu) || (displayContext == DisplayContext.CAPITALIZATION_FOR_STANDALONE && this.capitalizationOfRelativeUnitsForStandAlone))) {
                this.capitalizationBrkIter = AbstractC7192afG.copydefault(this.fLocale);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getStringForDay(int i) {
        if (this.fDates == null) {
            loadDates();
        }
        for (TaskDescription taskDescription : this.fDates) {
            if (taskDescription.copydefault == i) {
                return taskDescription.OLrzqt;
            }
        }
        return null;
    }

    public final class Application extends C7043acQ.ActionBar {
        public Application() {
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            if (taskDescription.AhwBna() == 3) {
                return;
            }
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                try {
                    int i2 = Integer.parseInt(application.toString());
                    if (RelativeDateFormat.this.getStringForDay(i2) == null) {
                        RelativeDateFormat.this.fDates.add(new TaskDescription(i2, taskDescription.djBIcL()));
                    }
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
    }

    private void loadDates() {
        synchronized (this) {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", this.fLocale);
            this.fDates = new ArrayList();
            iCUResourceBundle.copydefault("fields/day/relative", new Application());
        }
    }

    private void initCapitalizationContextInfo(ULocale uLocale) {
        try {
            int[] iArrUzCIH = ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale)).valueOf("contextTransforms/relative").uzCIH();
            if (iArrUzCIH.length >= 2) {
                this.capitalizationOfRelativeUnitsForListOrMenu = iArrUzCIH[0] != 0;
                this.capitalizationOfRelativeUnitsForStandAlone = iArrUzCIH[1] != 0;
            }
        } catch (MissingResourceException unused) {
        }
    }

    private static int dayDifference(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        Date date = new Date(System.currentTimeMillis());
        calendar2.clear();
        calendar2.setTime(date);
        return calendar.get(20) - calendar2.get(20);
    }

    private Calendar initializeCalendar(TimeZone timeZone, ULocale uLocale) {
        if (this.calendar == null) {
            if (timeZone == null) {
                this.calendar = Calendar.getInstance(uLocale);
            } else {
                this.calendar = Calendar.getInstance(timeZone, uLocale);
            }
        }
        return this.calendar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MessageFormat initializeCombinedFormat(Calendar calendar, ULocale uLocale) {
        String strCopydefault;
        int i;
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/" + calendar.getType() + "/DateTimePatterns");
        if (iCUResourceBundleGEmmrt == null && !calendar.getType().equals("gregorian")) {
            iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/gregorian/DateTimePatterns");
        }
        if (iCUResourceBundleGEmmrt == null || iCUResourceBundleGEmmrt.fARcdN() < 9) {
            strCopydefault = "{1} {0}";
        } else if (iCUResourceBundleGEmmrt.fARcdN() < 13) {
            i = 8;
            if (iCUResourceBundleGEmmrt.KWHzl(i).AuCTel() != 8) {
                strCopydefault = iCUResourceBundleGEmmrt.KWHzl(i).copydefault(0);
            } else {
                strCopydefault = iCUResourceBundleGEmmrt.copydefault(i);
            }
        } else {
            int i2 = this.fDateStyle;
            if (i2 >= 0 && i2 <= 3) {
                i = i2 + 9;
            } else if (i2 >= 128 && i2 <= 131) {
                i = i2 - 119;
            }
            if (iCUResourceBundleGEmmrt.KWHzl(i).AuCTel() != 8) {
            }
        }
        this.combinedFormatHasDateAtStart = strCopydefault.startsWith("{1}");
        MessageFormat messageFormat = new MessageFormat(strCopydefault, uLocale);
        this.fCombinedFormat = messageFormat;
        return messageFormat;
    }
}
