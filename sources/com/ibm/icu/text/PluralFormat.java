package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import com.ibm.icu.text.MessagePattern;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o.C7225afn;
import o.C7232afu;
import o.InterfaceC7280agp;

/* JADX INFO: loaded from: classes3.dex */
public class PluralFormat extends UFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 1;
    private transient MessagePattern msgPattern;
    private NumberFormat numberFormat;
    private transient double offset;
    private Map<String, String> parsedValues;
    private String pattern;
    private PluralRules pluralRules;
    private transient ActionBar pluralRulesWrapper;
    private ULocale ulocale;

    public interface TaskDescription {
        String copydefault(Object obj, double d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toPattern() {
        return this.pattern;
    }

    public PluralFormat() {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, PluralRules.PluralType.CARDINAL, ULocale.getDefault(ULocale.Category.FORMAT), null);
    }

    public PluralFormat(ULocale uLocale) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, PluralRules.PluralType.CARDINAL, uLocale, null);
    }

    public PluralFormat(Locale locale) {
        this(ULocale.forLocale(locale));
    }

    public PluralFormat(PluralRules pluralRules) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(pluralRules, PluralRules.PluralType.CARDINAL, ULocale.getDefault(ULocale.Category.FORMAT), null);
    }

    public PluralFormat(ULocale uLocale, PluralRules pluralRules) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(pluralRules, PluralRules.PluralType.CARDINAL, uLocale, null);
    }

    public PluralFormat(Locale locale, PluralRules pluralRules) {
        this(ULocale.forLocale(locale), pluralRules);
    }

    public PluralFormat(ULocale uLocale, PluralRules.PluralType pluralType) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, pluralType, uLocale, null);
    }

    public PluralFormat(Locale locale, PluralRules.PluralType pluralType) {
        this(ULocale.forLocale(locale), pluralType);
    }

    public PluralFormat(String str) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, PluralRules.PluralType.CARDINAL, ULocale.getDefault(ULocale.Category.FORMAT), null);
        applyPattern(str);
    }

    public PluralFormat(ULocale uLocale, String str) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, PluralRules.PluralType.CARDINAL, uLocale, null);
        applyPattern(str);
    }

    public PluralFormat(PluralRules pluralRules, String str) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(pluralRules, PluralRules.PluralType.CARDINAL, ULocale.getDefault(ULocale.Category.FORMAT), null);
        applyPattern(str);
    }

    public PluralFormat(ULocale uLocale, PluralRules pluralRules, String str) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(pluralRules, PluralRules.PluralType.CARDINAL, uLocale, null);
        applyPattern(str);
    }

    public PluralFormat(ULocale uLocale, PluralRules.PluralType pluralType, String str) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, pluralType, uLocale, null);
        applyPattern(str);
    }

    public PluralFormat(ULocale uLocale, PluralRules.PluralType pluralType, String str, NumberFormat numberFormat) {
        this.ulocale = null;
        this.pluralRules = null;
        this.pattern = null;
        this.parsedValues = null;
        this.numberFormat = null;
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.pluralRulesWrapper = new ActionBar();
        init(null, pluralType, uLocale, numberFormat);
        applyPattern(str);
    }

    private void init(PluralRules pluralRules, PluralRules.PluralType pluralType, ULocale uLocale, NumberFormat numberFormat) {
        this.ulocale = uLocale;
        if (pluralRules == null) {
            pluralRules = PluralRules.forLocale(uLocale, pluralType);
        }
        this.pluralRules = pluralRules;
        resetPattern();
        if (numberFormat == null) {
            numberFormat = NumberFormat.getInstance(this.ulocale);
        }
        this.numberFormat = numberFormat;
    }

    private void resetPattern() {
        this.pattern = null;
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern != null) {
            messagePattern.EZpvd();
        }
        this.offset = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public void applyPattern(String str) {
        this.pattern = str;
        if (this.msgPattern == null) {
            this.msgPattern = new MessagePattern();
        }
        try {
            this.msgPattern.OLrzqt(str);
            this.offset = this.msgPattern.AhwBna(0);
        } catch (RuntimeException e) {
            resetPattern();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int findSubMessage(MessagePattern messagePattern, int i, TaskDescription taskDescription, Object obj, double d) {
        double dKWHzl;
        int iKWHzl;
        int iOLrzqt = messagePattern.OLrzqt();
        MessagePattern.Part partEZpvd = messagePattern.EZpvd(i);
        if (partEZpvd.copydefault().hasNumericValue()) {
            dKWHzl = messagePattern.KWHzl(partEZpvd);
            iKWHzl = i + 1;
        } else {
            dKWHzl = AudioStats.AUDIO_AMPLITUDE_NONE;
            iKWHzl = i;
        }
        int i2 = 0;
        String strCopydefault = null;
        boolean z = false;
        do {
            int i3 = iKWHzl + 1;
            MessagePattern.Part partEZpvd2 = messagePattern.EZpvd(iKWHzl);
            if (partEZpvd2.copydefault() == MessagePattern.Part.Type.ARG_LIMIT) {
                break;
            }
            if (messagePattern.AEQbTJ(i3).hasNumericValue()) {
                int i4 = iKWHzl + 2;
                if (d == messagePattern.KWHzl(messagePattern.EZpvd(i3))) {
                    return i4;
                }
                i3 = i4;
            } else if (!z) {
                if (!messagePattern.copydefault(partEZpvd2, "other")) {
                    if (strCopydefault == null) {
                        strCopydefault = taskDescription.copydefault(obj, d - dKWHzl);
                        if (i2 != 0 && strCopydefault.equals("other")) {
                            z = true;
                        }
                    }
                    if (!z && messagePattern.copydefault(partEZpvd2, strCopydefault)) {
                        i2 = i3;
                        z = true;
                    }
                } else if (i2 == 0) {
                    if (strCopydefault == null || !strCopydefault.equals("other")) {
                        i2 = i3;
                    } else {
                        i2 = i3;
                        z = true;
                    }
                }
            }
            iKWHzl = messagePattern.KWHzl(i3) + 1;
        } while (iKWHzl < iOLrzqt);
        return i2;
    }

    public final class ActionBar implements TaskDescription {
        public ActionBar() {
        }

        @Override // com.ibm.icu.text.PluralFormat.TaskDescription
        public String copydefault(Object obj, double d) {
            return PluralFormat.this.pluralRules.select((PluralRules.TaskDescription) obj);
        }
    }

    public final String format(double d) {
        return format(Double.valueOf(d), d);
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!(obj instanceof Number)) {
            throw new IllegalArgumentException("'" + obj + "' is not a Number");
        }
        Number number = (Number) obj;
        stringBuffer.append(format(number, number.doubleValue()));
        return stringBuffer;
    }

    private String format(Number number, double d) {
        String str;
        String string;
        PluralRules.TaskDescription fixedDecimal;
        int iOLrzqt;
        C7225afn c7225afnKWHzl;
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern == null || messagePattern.OLrzqt() == 0) {
            return this.numberFormat.format(number);
        }
        double d2 = this.offset;
        double d3 = d - d2;
        NumberFormat numberFormat = this.numberFormat;
        if (numberFormat instanceof DecimalFormat) {
            C7232afu numberFormatter = ((DecimalFormat) numberFormat).toNumberFormatter();
            if (this.offset == AudioStats.AUDIO_AMPLITUDE_NONE) {
                c7225afnKWHzl = numberFormatter.EZpvd(number);
            } else {
                c7225afnKWHzl = numberFormatter.KWHzl(d3);
            }
            string = c7225afnKWHzl.toString();
            fixedDecimal = c7225afnKWHzl.EZpvd();
        } else {
            if (d2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                str = numberFormat.format(number);
            } else {
                str = numberFormat.format(d3);
            }
            string = str;
            fixedDecimal = new PluralRules.FixedDecimal(d3);
        }
        int iFindSubMessage = findSubMessage(this.msgPattern, 0, this.pluralRulesWrapper, fixedDecimal, d);
        int iEZpvd = this.msgPattern.EZpvd(iFindSubMessage).EZpvd();
        StringBuilder sb = null;
        while (true) {
            iFindSubMessage++;
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(iFindSubMessage);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            iOLrzqt = partEZpvd.OLrzqt();
            if (typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                break;
            }
            MessagePattern.Part.Type type = MessagePattern.Part.Type.REPLACE_NUMBER;
            if (typeCopydefault == type || (typeCopydefault == MessagePattern.Part.Type.SKIP_SYNTAX && this.msgPattern.valueOf())) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) this.pattern, iEZpvd, iOLrzqt);
                if (typeCopydefault == type) {
                    sb.append(string);
                }
                iEZpvd = partEZpvd.EZpvd();
            } else if (typeCopydefault == MessagePattern.Part.Type.ARG_START) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) this.pattern, iEZpvd, iOLrzqt);
                iFindSubMessage = this.msgPattern.KWHzl(iFindSubMessage);
                iEZpvd = this.msgPattern.EZpvd(iFindSubMessage).EZpvd();
                MessagePattern.OLrzqt(this.pattern, iOLrzqt, iEZpvd, sb);
            }
        }
        if (sb == null) {
            return this.pattern.substring(iEZpvd, iOLrzqt);
        }
        sb.append((CharSequence) this.pattern, iEZpvd, iOLrzqt);
        return sb.toString();
    }

    public Number parse(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public String parseType(String str, InterfaceC7280agp interfaceC7280agp, FieldPosition fieldPosition) {
        int iIndexOf;
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern == null || messagePattern.OLrzqt() == 0) {
            fieldPosition.setBeginIndex(-1);
            fieldPosition.setEndIndex(-1);
            return null;
        }
        int iOLrzqt = this.msgPattern.OLrzqt();
        int beginIndex = fieldPosition.getBeginIndex();
        char c = 0;
        if (beginIndex < 0) {
            beginIndex = 0;
        }
        int i = 0;
        String strSubstring = null;
        int i2 = -1;
        String str2 = null;
        while (i < iOLrzqt) {
            int i3 = i + 1;
            if (this.msgPattern.EZpvd(i).copydefault() != MessagePattern.Part.Type.ARG_SELECTOR) {
                i = i3;
            } else {
                int i4 = i + 2;
                MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i3);
                if (partEZpvd.copydefault() != MessagePattern.Part.Type.MSG_START) {
                    i = i4;
                } else {
                    i += 3;
                    MessagePattern.Part partEZpvd2 = this.msgPattern.EZpvd(i4);
                    if (partEZpvd2.copydefault() == MessagePattern.Part.Type.MSG_LIMIT) {
                        String strSubstring2 = this.pattern.substring(partEZpvd.EZpvd(), partEZpvd2.OLrzqt());
                        if (interfaceC7280agp != null) {
                            iIndexOf = str.indexOf(strSubstring2, beginIndex);
                            if (iIndexOf < 0) {
                                iIndexOf = interfaceC7280agp.copydefault(str, strSubstring2, beginIndex)[c];
                            }
                        } else {
                            iIndexOf = str.indexOf(strSubstring2, beginIndex);
                        }
                        if (iIndexOf >= 0 && iIndexOf >= i2 && (str2 == null || strSubstring2.length() > str2.length())) {
                            strSubstring = this.pattern.substring(partEZpvd.EZpvd(), partEZpvd2.OLrzqt());
                            str2 = strSubstring2;
                            i2 = iIndexOf;
                        }
                        c = 0;
                    }
                }
            }
        }
        if (strSubstring != null) {
            fieldPosition.setBeginIndex(i2);
            fieldPosition.setEndIndex(i2 + str2.length());
            return strSubstring;
        }
        fieldPosition.setBeginIndex(-1);
        fieldPosition.setEndIndex(-1);
        return null;
    }

    @Deprecated
    public void setLocale(ULocale uLocale) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault(ULocale.Category.FORMAT);
        }
        init(null, PluralRules.PluralType.CARDINAL, uLocale, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluralFormat pluralFormat = (PluralFormat) obj;
        return Objects.equals(this.ulocale, pluralFormat.ulocale) && Objects.equals(this.pluralRules, pluralFormat.pluralRules) && Objects.equals(this.msgPattern, pluralFormat.msgPattern) && Objects.equals(this.numberFormat, pluralFormat.numberFormat);
    }

    public boolean equals(PluralFormat pluralFormat) {
        return equals((Object) pluralFormat);
    }

    public int hashCode() {
        return this.pluralRules.hashCode() ^ this.parsedValues.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("locale=" + this.ulocale);
        sb.append(", rules='" + this.pluralRules + "'");
        sb.append(", pattern='" + this.pattern + "'");
        sb.append(", format='" + this.numberFormat + "'");
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.pluralRulesWrapper = new ActionBar();
        this.parsedValues = null;
        String str = this.pattern;
        if (str != null) {
            applyPattern(str);
        }
    }
}
