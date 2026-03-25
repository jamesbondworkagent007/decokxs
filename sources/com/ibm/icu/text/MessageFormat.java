package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amplifyframework.core.model.ModelIdentifier;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.MessagePattern;
import com.ibm.icu.text.PluralFormat;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.CharacterIterator;
import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7070acr;

/* JADX INFO: loaded from: classes3.dex */
public class MessageFormat extends UFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char CURLY_BRACE_LEFT = '{';
    private static final char CURLY_BRACE_RIGHT = '}';
    private static final int DATE_MODIFIER_EMPTY = 0;
    private static final int DATE_MODIFIER_FULL = 4;
    private static final int DATE_MODIFIER_LONG = 3;
    private static final int DATE_MODIFIER_MEDIUM = 2;
    private static final int DATE_MODIFIER_SHORT = 1;
    private static final int MODIFIER_CURRENCY = 1;
    private static final int MODIFIER_EMPTY = 0;
    private static final int MODIFIER_INTEGER = 3;
    private static final int MODIFIER_PERCENT = 2;
    private static final char SINGLE_QUOTE = '\'';
    private static final int STATE_INITIAL = 0;
    private static final int STATE_IN_QUOTE = 2;
    private static final int STATE_MSG_ELEMENT = 3;
    private static final int STATE_SINGLE_QUOTE = 1;
    private static final int TYPE_DATE = 1;
    private static final int TYPE_DURATION = 5;
    private static final int TYPE_NUMBER = 0;
    private static final int TYPE_ORDINAL = 4;
    private static final int TYPE_SPELLOUT = 3;
    private static final int TYPE_TIME = 2;
    static final long serialVersionUID = 7136212545847378652L;
    private transient Map<Integer, Format> cachedFormatters;
    private transient Set<Integer> customFormatArgStarts;
    private transient MessagePattern msgPattern;
    private transient Application ordinalProvider;
    private transient Application pluralProvider;
    private transient DateFormat stockDateFormatter;
    private transient NumberFormat stockNumberFormatter;
    private transient ULocale ulocale;
    private static final String[] typeList = {DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, "date", CrashHianalyticsData.TIME, "spellout", "ordinal", "duration"};
    private static final String[] modifierList = {"", "currency", "percent", TypedValues.Custom.S_INT};
    private static final String[] dateModifierList = {"", "short", "medium", "long", "full"};
    private static final Locale rootLocale = new Locale("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ULocale getULocale() {
        return this.ulocale;
    }

    public MessageFormat(String str) {
        this.ulocale = ULocale.getDefault(ULocale.Category.FORMAT);
        applyPattern(str);
    }

    public MessageFormat(String str, Locale locale) {
        this(str, ULocale.forLocale(locale));
    }

    public MessageFormat(String str, ULocale uLocale) {
        this.ulocale = uLocale;
        applyPattern(str);
    }

    public void setLocale(Locale locale) {
        setLocale(ULocale.forLocale(locale));
    }

    public void setLocale(ULocale uLocale) {
        String pattern = toPattern();
        this.ulocale = uLocale;
        this.stockDateFormatter = null;
        this.stockNumberFormatter = null;
        this.pluralProvider = null;
        this.ordinalProvider = null;
        applyPattern(pattern);
    }

    public Locale getLocale() {
        return this.ulocale.toLocale();
    }

    public void applyPattern(String str) {
        try {
            MessagePattern messagePattern = this.msgPattern;
            if (messagePattern == null) {
                this.msgPattern = new MessagePattern(str);
            } else {
                messagePattern.AEQbTJ(str);
            }
            cacheExplicitFormats();
        } catch (RuntimeException e) {
            resetPattern();
            throw e;
        }
    }

    public void applyPattern(String str, MessagePattern.ApostropheMode apostropheMode) {
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern == null) {
            this.msgPattern = new MessagePattern(apostropheMode);
        } else if (apostropheMode != messagePattern.AEQbTJ()) {
            this.msgPattern.copydefault(apostropheMode);
        }
        applyPattern(str);
    }

    public MessagePattern.ApostropheMode getApostropheMode() {
        if (this.msgPattern == null) {
            this.msgPattern = new MessagePattern();
        }
        return this.msgPattern.AEQbTJ();
    }

    public String toPattern() {
        String strDjBIcL;
        if (this.customFormatArgStarts != null) {
            throw new IllegalStateException("toPattern() is not supported after custom Format objects have been set via setFormat() or similar APIs");
        }
        MessagePattern messagePattern = this.msgPattern;
        return (messagePattern == null || (strDjBIcL = messagePattern.djBIcL()) == null) ? "" : strDjBIcL;
    }

    private int nextTopLevelArgStart(int i) {
        MessagePattern.Part.Type typeAEQbTJ;
        if (i != 0) {
            i = this.msgPattern.KWHzl(i);
        }
        do {
            i++;
            typeAEQbTJ = this.msgPattern.AEQbTJ(i);
            if (typeAEQbTJ == MessagePattern.Part.Type.ARG_START) {
                return i;
            }
        } while (typeAEQbTJ != MessagePattern.Part.Type.MSG_LIMIT);
        return -1;
    }

    private boolean argNameMatches(int i, String str, int i2) {
        MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i);
        if (partEZpvd.copydefault() == MessagePattern.Part.Type.ARG_NAME) {
            return this.msgPattern.copydefault(partEZpvd, str);
        }
        return partEZpvd.KWHzl() == i2;
    }

    private String getArgName(int i) {
        MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i);
        if (partEZpvd.copydefault() == MessagePattern.Part.Type.ARG_NAME) {
            return this.msgPattern.copydefault(partEZpvd);
        }
        return Integer.toString(partEZpvd.KWHzl());
    }

    public void setFormatsByArgumentIndex(Format[] formatArr) {
        if (this.msgPattern.gEmmrt()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                return;
            }
            int iKWHzl = this.msgPattern.EZpvd(iNextTopLevelArgStart + 1).KWHzl();
            if (iKWHzl < formatArr.length) {
                setCustomArgStartFormat(iNextTopLevelArgStart, formatArr[iKWHzl]);
            }
        }
    }

    public void setFormatsByArgumentName(Map<String, Format> map) {
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                return;
            }
            String argName = getArgName(iNextTopLevelArgStart + 1);
            if (map.containsKey(argName)) {
                setCustomArgStartFormat(iNextTopLevelArgStart, map.get(argName));
            }
        }
    }

    public void setFormats(Format[] formatArr) {
        int iNextTopLevelArgStart = 0;
        for (int i = 0; i < formatArr.length && (iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart)) >= 0; i++) {
            setCustomArgStartFormat(iNextTopLevelArgStart, formatArr[i]);
        }
    }

    public void setFormatByArgumentIndex(int i, Format format) {
        if (this.msgPattern.gEmmrt()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                return;
            }
            if (this.msgPattern.EZpvd(iNextTopLevelArgStart + 1).KWHzl() == i) {
                setCustomArgStartFormat(iNextTopLevelArgStart, format);
            }
        }
    }

    public void setFormatByArgumentName(String str, Format format) {
        int iCopydefault = MessagePattern.copydefault(str);
        if (iCopydefault < -1) {
            return;
        }
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                return;
            }
            if (argNameMatches(iNextTopLevelArgStart + 1, str, iCopydefault)) {
                setCustomArgStartFormat(iNextTopLevelArgStart, format);
            }
        }
    }

    public void setFormat(int i, Format format) {
        int iNextTopLevelArgStart = 0;
        int i2 = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            if (i2 == i) {
                setCustomArgStartFormat(iNextTopLevelArgStart, format);
                return;
            }
            i2++;
        }
    }

    public Format[] getFormatsByArgumentIndex() {
        Format format;
        if (this.msgPattern.gEmmrt()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        ArrayList arrayList = new ArrayList();
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart >= 0) {
                int iKWHzl = this.msgPattern.EZpvd(iNextTopLevelArgStart + 1).KWHzl();
                while (true) {
                    format = null;
                    if (iKWHzl < arrayList.size()) {
                        break;
                    }
                    arrayList.add(null);
                }
                Map<Integer, Format> map = this.cachedFormatters;
                if (map != null) {
                    format = map.get(Integer.valueOf(iNextTopLevelArgStart));
                }
                arrayList.set(iKWHzl, format);
            } else {
                return (Format[]) arrayList.toArray(new Format[arrayList.size()]);
            }
        }
    }

    public Format[] getFormats() {
        ArrayList arrayList = new ArrayList();
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart >= 0) {
                Map<Integer, Format> map = this.cachedFormatters;
                arrayList.add(map == null ? null : map.get(Integer.valueOf(iNextTopLevelArgStart)));
            } else {
                return (Format[]) arrayList.toArray(new Format[arrayList.size()]);
            }
        }
    }

    public Set<String> getArgumentNames() {
        HashSet hashSet = new HashSet();
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                return hashSet;
            }
            hashSet.add(getArgName(iNextTopLevelArgStart + 1));
        }
    }

    public Format getFormatByArgumentName(String str) {
        int iCopydefault;
        if (this.cachedFormatters == null || (iCopydefault = MessagePattern.copydefault(str)) < -1) {
            return null;
        }
        int iNextTopLevelArgStart = 0;
        do {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                return null;
            }
        } while (!argNameMatches(iNextTopLevelArgStart + 1, str, iCopydefault));
        return this.cachedFormatters.get(Integer.valueOf(iNextTopLevelArgStart));
    }

    public final StringBuffer format(Object[] objArr, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        format(objArr, null, new TaskDescription(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public final StringBuffer format(Map<String, Object> map, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        format(null, map, new TaskDescription(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public static String format(String str, Object... objArr) {
        return new MessageFormat(str).format(objArr);
    }

    public static String format(String str, Map<String, Object> map) {
        return new MessageFormat(str).format(map);
    }

    public boolean usesNamedArguments() {
        return this.msgPattern.gEmmrt();
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        format(obj, new TaskDescription(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        TaskDescription taskDescription = new TaskDescription(sb);
        taskDescription.copydefault();
        format(obj, taskDescription, (FieldPosition) null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (Activity activity : taskDescription.KWHzl) {
            attributedString.addAttribute(activity.copydefault, activity.OLrzqt, activity.AEQbTJ, activity.EZpvd);
        }
        return attributedString.getIterator();
    }

    public Object[] parse(String str, ParsePosition parsePosition) {
        if (this.msgPattern.gEmmrt()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use named argument.");
        }
        int i = -1;
        int iNextTopLevelArgStart = 0;
        while (true) {
            iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
            if (iNextTopLevelArgStart < 0) {
                break;
            }
            int iKWHzl = this.msgPattern.EZpvd(iNextTopLevelArgStart + 1).KWHzl();
            if (iKWHzl > i) {
                i = iKWHzl;
            }
        }
        Object[] objArr = new Object[i + 1];
        int index = parsePosition.getIndex();
        parse(0, str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index) {
            return null;
        }
        return objArr;
    }

    public Map<String, Object> parseToMap(String str, ParsePosition parsePosition) {
        HashMap map = new HashMap();
        int index = parsePosition.getIndex();
        parse(0, str, parsePosition, null, map);
        if (parsePosition.getIndex() == index) {
            return null;
        }
        return map;
    }

    public Object[] parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Object[] objArr = parse(str, parsePosition);
        if (parsePosition.getIndex() != 0) {
            return objArr;
        }
        throw new ParseException("MessageFormat parse error!", parsePosition.getErrorIndex());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: java.util.Map<java.lang.String, java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parse(int i, String str, ParsePosition parsePosition, Object[] objArr, Map<String, Object> map) {
        String string;
        Object objValueOf;
        int iKWHzl;
        Object obj;
        int length;
        boolean z;
        int i2;
        Object objValueOf2;
        Map<Integer, Format> map2;
        int index;
        Format format;
        if (str == null) {
            return;
        }
        String strDjBIcL = this.msgPattern.djBIcL();
        int iEZpvd = this.msgPattern.EZpvd(i).EZpvd();
        int index2 = parsePosition.getIndex();
        int i3 = 0;
        ParsePosition parsePosition2 = new ParsePosition(0);
        int i4 = i + 1;
        while (true) {
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i4);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            int iOLrzqt = partEZpvd.OLrzqt() - iEZpvd;
            if (iOLrzqt != 0 && !strDjBIcL.regionMatches(iEZpvd, str, index2, iOLrzqt)) {
                parsePosition.setErrorIndex(index2);
                return;
            }
            index2 += iOLrzqt;
            if (typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                parsePosition.setIndex(index2);
                return;
            }
            if (typeCopydefault == MessagePattern.Part.Type.SKIP_SYNTAX || typeCopydefault == MessagePattern.Part.Type.INSERT_CHAR) {
                iEZpvd = partEZpvd.EZpvd();
            } else {
                int iKWHzl2 = this.msgPattern.KWHzl(i4);
                MessagePattern.ArgType argTypeAEQbTJ = partEZpvd.AEQbTJ();
                MessagePattern.Part partEZpvd2 = this.msgPattern.EZpvd(i4 + 1);
                if (objArr != null) {
                    iKWHzl = partEZpvd2.KWHzl();
                    objValueOf = Integer.valueOf(iKWHzl);
                    obj = null;
                } else {
                    if (partEZpvd2.copydefault() == MessagePattern.Part.Type.ARG_NAME) {
                        string = this.msgPattern.copydefault(partEZpvd2);
                    } else {
                        string = Integer.toString(partEZpvd2.KWHzl());
                    }
                    objValueOf = string;
                    iKWHzl = i3;
                    obj = objValueOf;
                }
                Map<Integer, Format> map3 = this.cachedFormatters;
                if (map3 != null && (format = map3.get(Integer.valueOf(i4))) != null) {
                    parsePosition2.setIndex(index2);
                    objValueOf2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index2) {
                        parsePosition.setErrorIndex(index2);
                        return;
                    }
                    index = parsePosition2.getIndex();
                } else if (argTypeAEQbTJ == MessagePattern.ArgType.NONE || ((map2 = this.cachedFormatters) != null && map2.containsKey(Integer.valueOf(i4)))) {
                    String literalStringUntilNextArgument = getLiteralStringUntilNextArgument(iKWHzl2);
                    if (literalStringUntilNextArgument.length() != 0) {
                        length = str.indexOf(literalStringUntilNextArgument, index2);
                    } else {
                        length = str.length();
                    }
                    if (length < 0) {
                        parsePosition.setErrorIndex(index2);
                        return;
                    }
                    String strSubstring = str.substring(index2, length);
                    boolean zEquals = strSubstring.equals("{" + objValueOf.toString() + "}");
                    Object obj2 = !zEquals ? strSubstring : null;
                    z = !zEquals;
                    i2 = length;
                    objValueOf2 = obj2;
                    if (z) {
                        if (objArr != null) {
                            objArr[iKWHzl] = objValueOf2;
                        } else if (map != 0) {
                            map.put(obj, objValueOf2);
                        }
                    }
                    index2 = i2;
                    iEZpvd = this.msgPattern.EZpvd(iKWHzl2).EZpvd();
                    i4 = iKWHzl2;
                } else if (argTypeAEQbTJ == MessagePattern.ArgType.CHOICE) {
                    parsePosition2.setIndex(index2);
                    double choiceArgument = parseChoiceArgument(this.msgPattern, i4 + 2, str, parsePosition2);
                    if (parsePosition2.getIndex() == index2) {
                        parsePosition.setErrorIndex(index2);
                        return;
                    } else {
                        objValueOf2 = Double.valueOf(choiceArgument);
                        index = parsePosition2.getIndex();
                    }
                } else {
                    if (argTypeAEQbTJ.hasPluralStyle() || argTypeAEQbTJ == MessagePattern.ArgType.SELECT) {
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    throw new IllegalStateException("unexpected argType " + argTypeAEQbTJ);
                }
                i2 = index;
                z = true;
                if (z) {
                }
                index2 = i2;
                iEZpvd = this.msgPattern.EZpvd(iKWHzl2).EZpvd();
                i4 = iKWHzl2;
            }
            i4++;
            i3 = 0;
        }
    }

    public Map<String, Object> parseToMap(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        HashMap map = new HashMap();
        parse(0, str, parsePosition, null, map);
        if (parsePosition.getIndex() != 0) {
            return map;
        }
        throw new ParseException("MessageFormat parse error!", parsePosition.getErrorIndex());
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        if (!this.msgPattern.gEmmrt()) {
            return parse(str, parsePosition);
        }
        return parseToMap(str, parsePosition);
    }

    @Override // java.text.Format
    public Object clone() {
        MessageFormat messageFormat = (MessageFormat) super.clone();
        if (this.customFormatArgStarts != null) {
            messageFormat.customFormatArgStarts = new HashSet();
            Iterator<Integer> it = this.customFormatArgStarts.iterator();
            while (it.hasNext()) {
                messageFormat.customFormatArgStarts.add(it.next());
            }
        } else {
            messageFormat.customFormatArgStarts = null;
        }
        if (this.cachedFormatters != null) {
            messageFormat.cachedFormatters = new HashMap();
            for (Map.Entry<Integer, Format> entry : this.cachedFormatters.entrySet()) {
                messageFormat.cachedFormatters.put(entry.getKey(), entry.getValue());
            }
        } else {
            messageFormat.cachedFormatters = null;
        }
        MessagePattern messagePattern = this.msgPattern;
        messageFormat.msgPattern = messagePattern == null ? null : (MessagePattern) messagePattern.clone();
        DateFormat dateFormat = this.stockDateFormatter;
        messageFormat.stockDateFormatter = dateFormat == null ? null : (DateFormat) dateFormat.clone();
        NumberFormat numberFormat = this.stockNumberFormatter;
        messageFormat.stockNumberFormatter = numberFormat == null ? null : (NumberFormat) numberFormat.clone();
        messageFormat.pluralProvider = null;
        messageFormat.ordinalProvider = null;
        return messageFormat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MessageFormat messageFormat = (MessageFormat) obj;
        return Objects.equals(this.ulocale, messageFormat.ulocale) && Objects.equals(this.msgPattern, messageFormat.msgPattern) && Objects.equals(this.cachedFormatters, messageFormat.cachedFormatters) && Objects.equals(this.customFormatArgStarts, messageFormat.customFormatArgStarts);
    }

    public int hashCode() {
        return this.msgPattern.djBIcL().hashCode();
    }

    public static class Field extends Format.Field {
        public static final Field ARGUMENT = new Field("message argument field");
        private static final long serialVersionUID = 7510380454602616157L;

        public Field(String str) {
            super(str);
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        public Object readResolve() throws InvalidObjectException {
            if (getClass() != Field.class) {
                throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
            }
            String name = getName();
            Field field = ARGUMENT;
            if (name.equals(field.getName())) {
                return field;
            }
            throw new InvalidObjectException("Unknown attribute name.");
        }
    }

    private DateFormat getStockDateFormatter() {
        if (this.stockDateFormatter == null) {
            this.stockDateFormatter = DateFormat.getDateTimeInstance(3, 3, this.ulocale);
        }
        return this.stockDateFormatter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NumberFormat getStockNumberFormatter() {
        if (this.stockNumberFormatter == null) {
            this.stockNumberFormatter = NumberFormat.getInstance(this.ulocale);
        }
        return this.stockNumberFormatter;
    }

    private void format(int i, StateListAnimator stateListAnimator, Object[] objArr, Map<String, Object> map, TaskDescription taskDescription, FieldPosition fieldPosition) {
        Object obj;
        int i2;
        Object obj2;
        int i3;
        FieldPosition fieldPosition2;
        CharSequence charSequence;
        TaskDescription taskDescription2;
        Map<Integer, Format> map2;
        Application application;
        int i4;
        TaskDescription taskDescription3;
        Object obj3;
        Format format;
        Map<String, Object> map3 = map;
        TaskDescription taskDescription4 = taskDescription;
        CharSequence charSequenceDjBIcL = this.msgPattern.djBIcL();
        int iEZpvd = this.msgPattern.EZpvd(i).EZpvd();
        int i5 = i + 1;
        FieldPosition fieldPosition3 = fieldPosition;
        while (true) {
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i5);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            taskDescription4.AEQbTJ(charSequenceDjBIcL, iEZpvd, partEZpvd.OLrzqt());
            if (typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                return;
            }
            iEZpvd = partEZpvd.EZpvd();
            if (typeCopydefault == MessagePattern.Part.Type.REPLACE_NUMBER) {
                if (stateListAnimator.EZpvd) {
                    taskDescription4.copydefault(stateListAnimator.AEQbTJ, stateListAnimator.KWHzl, stateListAnimator.AYXKKw);
                } else {
                    taskDescription4.OLrzqt(getStockNumberFormatter(), stateListAnimator.KWHzl);
                }
            } else {
                if (typeCopydefault == MessagePattern.Part.Type.ARG_START) {
                    int iKWHzl = this.msgPattern.KWHzl(i5);
                    MessagePattern.ArgType argTypeAEQbTJ = partEZpvd.AEQbTJ();
                    MessagePattern.Part partEZpvd2 = this.msgPattern.EZpvd(i5 + 1);
                    String strCopydefault = this.msgPattern.copydefault(partEZpvd2);
                    boolean z = false;
                    Object obj4 = null;
                    if (objArr != null) {
                        int iKWHzl2 = partEZpvd2.KWHzl();
                        Object objValueOf = taskDescription.KWHzl != null ? Integer.valueOf(iKWHzl2) : null;
                        if (iKWHzl2 < 0 || iKWHzl2 >= objArr.length) {
                            z = true;
                        } else {
                            obj4 = objArr[iKWHzl2];
                        }
                        obj = objValueOf;
                    } else if (map3 == null || !map3.containsKey(strCopydefault)) {
                        obj = strCopydefault;
                        z = true;
                    } else {
                        obj4 = map3.get(strCopydefault);
                        obj = strCopydefault;
                    }
                    int i6 = i5 + 2;
                    int i7 = taskDescription.AEQbTJ;
                    if (z) {
                        taskDescription4.EZpvd("{" + strCopydefault + "}");
                    } else if (obj4 == null) {
                        taskDescription4.EZpvd(AbstractJsonLexerKt.NULL);
                    } else if (stateListAnimator == null || stateListAnimator.copydefault != i5) {
                        Map<Integer, Format> map4 = this.cachedFormatters;
                        i2 = iKWHzl;
                        if (map4 != null && (format = map4.get(Integer.valueOf(i5))) != null) {
                            if ((format instanceof ChoiceFormat) || (format instanceof PluralFormat) || (format instanceof SelectFormat)) {
                                String str = format.format(obj4);
                                if (str.indexOf(123) >= 0 || (str.indexOf(39) >= 0 && !this.msgPattern.valueOf())) {
                                    obj2 = obj;
                                    new MessageFormat(str, this.ulocale).format(0, null, objArr, map, taskDescription, null);
                                    i3 = i2;
                                    i7 = i7;
                                    fieldPosition2 = fieldPosition3;
                                    charSequence = charSequenceDjBIcL;
                                    taskDescription2 = taskDescription4;
                                } else {
                                    if (taskDescription.KWHzl == null) {
                                        taskDescription4.EZpvd(str);
                                    } else {
                                        taskDescription4.OLrzqt(format, obj4);
                                    }
                                    fieldPosition2 = fieldPosition3;
                                    charSequence = charSequenceDjBIcL;
                                    taskDescription2 = taskDescription4;
                                    obj2 = obj;
                                    i3 = i2;
                                }
                            } else {
                                taskDescription4.OLrzqt(format, obj4);
                                fieldPosition2 = fieldPosition3;
                                charSequence = charSequenceDjBIcL;
                                taskDescription2 = taskDescription4;
                                obj3 = obj;
                                i3 = i2;
                                FieldPosition fieldPositionUpdateMetaData = updateMetaData(taskDescription2, i7, fieldPosition2, obj3);
                                iEZpvd = this.msgPattern.EZpvd(i3).EZpvd();
                                fieldPosition3 = fieldPositionUpdateMetaData;
                                i5 = i3;
                            }
                        } else {
                            obj2 = obj;
                            if (argTypeAEQbTJ == MessagePattern.ArgType.NONE || ((map2 = this.cachedFormatters) != null && map2.containsKey(Integer.valueOf(i5)))) {
                                i3 = i2;
                                i7 = i7;
                                fieldPosition2 = fieldPosition3;
                                charSequence = charSequenceDjBIcL;
                                taskDescription2 = taskDescription4;
                                if (obj4 instanceof Number) {
                                    taskDescription2.OLrzqt(getStockNumberFormatter(), obj4);
                                } else if (obj4 instanceof Date) {
                                    taskDescription2.OLrzqt(getStockDateFormatter(), obj4);
                                } else {
                                    taskDescription2.EZpvd(obj4.toString());
                                }
                            } else {
                                if (argTypeAEQbTJ == MessagePattern.ArgType.CHOICE) {
                                    if (!(obj4 instanceof Number)) {
                                        throw new IllegalArgumentException("'" + obj4 + "' is not a Number");
                                    }
                                    int iFindChoiceSubMessage = findChoiceSubMessage(this.msgPattern, i6, ((Number) obj4).doubleValue());
                                    i3 = i2;
                                    charSequence = charSequenceDjBIcL;
                                    taskDescription3 = taskDescription4;
                                    formatComplexSubMessage(iFindChoiceSubMessage, null, objArr, map, taskDescription);
                                    fieldPosition2 = fieldPosition3;
                                    i4 = i7;
                                } else {
                                    i3 = i2;
                                    charSequence = charSequenceDjBIcL;
                                    TaskDescription taskDescription5 = taskDescription4;
                                    FieldPosition fieldPosition4 = fieldPosition3;
                                    if (argTypeAEQbTJ.hasPluralStyle()) {
                                        if (!(obj4 instanceof Number)) {
                                            throw new IllegalArgumentException("'" + obj4 + "' is not a Number");
                                        }
                                        if (argTypeAEQbTJ == MessagePattern.ArgType.PLURAL) {
                                            if (this.pluralProvider == null) {
                                                this.pluralProvider = new Application(this, PluralRules.PluralType.CARDINAL);
                                            }
                                            application = this.pluralProvider;
                                        } else {
                                            if (this.ordinalProvider == null) {
                                                this.ordinalProvider = new Application(this, PluralRules.PluralType.ORDINAL);
                                            }
                                            application = this.ordinalProvider;
                                        }
                                        Number number = (Number) obj4;
                                        StateListAnimator stateListAnimator2 = new StateListAnimator(i6, strCopydefault, number, this.msgPattern.AhwBna(i6));
                                        int iFindSubMessage = PluralFormat.findSubMessage(this.msgPattern, i6, application, stateListAnimator2, number.doubleValue());
                                        fieldPosition2 = fieldPosition4;
                                        i4 = i7;
                                        taskDescription3 = taskDescription5;
                                        formatComplexSubMessage(iFindSubMessage, stateListAnimator2, objArr, map, taskDescription);
                                    } else {
                                        fieldPosition2 = fieldPosition4;
                                        i7 = i7;
                                        taskDescription2 = taskDescription5;
                                        if (argTypeAEQbTJ == MessagePattern.ArgType.SELECT) {
                                            formatComplexSubMessage(SelectFormat.findSubMessage(this.msgPattern, i6, obj4.toString()), null, objArr, map, taskDescription);
                                        } else {
                                            throw new IllegalStateException("unexpected argType " + argTypeAEQbTJ);
                                        }
                                    }
                                }
                                i7 = i4;
                                taskDescription2 = taskDescription3;
                            }
                        }
                        obj3 = obj2;
                        FieldPosition fieldPositionUpdateMetaData2 = updateMetaData(taskDescription2, i7, fieldPosition2, obj3);
                        iEZpvd = this.msgPattern.EZpvd(i3).EZpvd();
                        fieldPosition3 = fieldPositionUpdateMetaData2;
                        i5 = i3;
                    } else if (stateListAnimator.valueOf == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        taskDescription4.copydefault(stateListAnimator.AEQbTJ, stateListAnimator.KWHzl, stateListAnimator.AYXKKw);
                    } else {
                        taskDescription4.OLrzqt(stateListAnimator.AEQbTJ, obj4);
                    }
                    i2 = iKWHzl;
                    fieldPosition2 = fieldPosition3;
                    charSequence = charSequenceDjBIcL;
                    taskDescription2 = taskDescription4;
                    obj3 = obj;
                    i3 = i2;
                    FieldPosition fieldPositionUpdateMetaData22 = updateMetaData(taskDescription2, i7, fieldPosition2, obj3);
                    iEZpvd = this.msgPattern.EZpvd(i3).EZpvd();
                    fieldPosition3 = fieldPositionUpdateMetaData22;
                    i5 = i3;
                }
                i5++;
                map3 = map;
                taskDescription4 = taskDescription2;
                charSequenceDjBIcL = charSequence;
            }
            charSequence = charSequenceDjBIcL;
            taskDescription2 = taskDescription4;
            i5++;
            map3 = map;
            taskDescription4 = taskDescription2;
            charSequenceDjBIcL = charSequence;
        }
    }

    private void formatComplexSubMessage(int i, StateListAnimator stateListAnimator, Object[] objArr, Map<String, Object> map, TaskDescription taskDescription) {
        int iOLrzqt;
        String string;
        if (!this.msgPattern.valueOf()) {
            format(i, stateListAnimator, objArr, map, taskDescription, null);
            return;
        }
        String strDjBIcL = this.msgPattern.djBIcL();
        int iEZpvd = this.msgPattern.EZpvd(i).EZpvd();
        StringBuilder sb = null;
        while (true) {
            i++;
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            iOLrzqt = partEZpvd.OLrzqt();
            if (typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                break;
            }
            MessagePattern.Part.Type type = MessagePattern.Part.Type.REPLACE_NUMBER;
            if (typeCopydefault == type || typeCopydefault == MessagePattern.Part.Type.SKIP_SYNTAX) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) strDjBIcL, iEZpvd, iOLrzqt);
                if (typeCopydefault == type) {
                    if (stateListAnimator.EZpvd) {
                        sb.append(stateListAnimator.AYXKKw);
                    } else {
                        sb.append(getStockNumberFormatter().format(stateListAnimator.KWHzl));
                    }
                }
                iEZpvd = partEZpvd.EZpvd();
            } else if (typeCopydefault == MessagePattern.Part.Type.ARG_START) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) strDjBIcL, iEZpvd, iOLrzqt);
                i = this.msgPattern.KWHzl(i);
                iEZpvd = this.msgPattern.EZpvd(i).EZpvd();
                MessagePattern.OLrzqt(strDjBIcL, iOLrzqt, iEZpvd, sb);
            }
        }
        if (sb == null) {
            string = strDjBIcL.substring(iEZpvd, iOLrzqt);
        } else {
            sb.append((CharSequence) strDjBIcL, iEZpvd, iOLrzqt);
            string = sb.toString();
        }
        if (string.indexOf(123) >= 0) {
            MessageFormat messageFormat = new MessageFormat("", this.ulocale);
            messageFormat.applyPattern(string, MessagePattern.ApostropheMode.DOUBLE_REQUIRED);
            messageFormat.format(0, null, objArr, map, taskDescription, null);
            return;
        }
        taskDescription.EZpvd(string);
    }

    private String getLiteralStringUntilNextArgument(int i) {
        StringBuilder sb = new StringBuilder();
        String strDjBIcL = this.msgPattern.djBIcL();
        int iEZpvd = this.msgPattern.EZpvd(i).EZpvd();
        while (true) {
            i++;
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            sb.append((CharSequence) strDjBIcL, iEZpvd, partEZpvd.OLrzqt());
            if (typeCopydefault == MessagePattern.Part.Type.ARG_START || typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                break;
            }
            iEZpvd = partEZpvd.EZpvd();
        }
        return sb.toString();
    }

    private FieldPosition updateMetaData(TaskDescription taskDescription, int i, FieldPosition fieldPosition, Object obj) {
        if (taskDescription.KWHzl != null && i < taskDescription.AEQbTJ) {
            taskDescription.KWHzl.add(new Activity(obj, i, taskDescription.AEQbTJ));
        }
        if (fieldPosition == null || !Field.ARGUMENT.equals(fieldPosition.getFieldAttribute())) {
            return fieldPosition;
        }
        fieldPosition.setBeginIndex(i);
        fieldPosition.setEndIndex(taskDescription.AEQbTJ);
        return null;
    }

    private static int findChoiceSubMessage(MessagePattern messagePattern, int i, double d) {
        int iOLrzqt = messagePattern.OLrzqt();
        int i2 = i + 2;
        while (true) {
            int iKWHzl = messagePattern.KWHzl(i2);
            int i3 = iKWHzl + 1;
            if (i3 >= iOLrzqt) {
                break;
            }
            MessagePattern.Part partEZpvd = messagePattern.EZpvd(i3);
            if (partEZpvd.copydefault() == MessagePattern.Part.Type.ARG_LIMIT) {
                break;
            }
            double dKWHzl = messagePattern.KWHzl(partEZpvd);
            if (messagePattern.djBIcL().charAt(messagePattern.copydefault(iKWHzl + 2)) == '<') {
                if (d <= dKWHzl) {
                    break;
                }
                i2 = iKWHzl + 3;
            } else {
                if (d < dKWHzl) {
                    break;
                }
                i2 = iKWHzl + 3;
            }
        }
        return i2;
    }

    private static double parseChoiceArgument(MessagePattern messagePattern, int i, String str, ParsePosition parsePosition) {
        int i2;
        int index = parsePosition.getIndex();
        double d = Double.NaN;
        int i3 = index;
        while (true) {
            if (messagePattern.AEQbTJ(i) == MessagePattern.Part.Type.ARG_LIMIT) {
                break;
            }
            double dKWHzl = messagePattern.KWHzl(messagePattern.EZpvd(i));
            int i4 = i + 2;
            int iKWHzl = messagePattern.KWHzl(i4);
            int iMatchStringUntilLimitPart = matchStringUntilLimitPart(messagePattern, i4, iKWHzl, str, index);
            if (iMatchStringUntilLimitPart >= 0 && (i2 = iMatchStringUntilLimitPart + index) > i3) {
                i3 = i2;
                if (i2 == str.length()) {
                    d = dKWHzl;
                    break;
                }
                d = dKWHzl;
            }
            i = iKWHzl + 1;
        }
        if (i3 == index) {
            parsePosition.setErrorIndex(index);
        } else {
            parsePosition.setIndex(i3);
        }
        return d;
    }

    private static int matchStringUntilLimitPart(MessagePattern messagePattern, int i, int i2, String str, int i3) {
        String strDjBIcL = messagePattern.djBIcL();
        int iEZpvd = messagePattern.EZpvd(i).EZpvd();
        int i4 = 0;
        while (true) {
            i++;
            MessagePattern.Part partEZpvd = messagePattern.EZpvd(i);
            if (i == i2 || partEZpvd.copydefault() == MessagePattern.Part.Type.SKIP_SYNTAX) {
                int iOLrzqt = partEZpvd.OLrzqt() - iEZpvd;
                if (iOLrzqt != 0 && !str.regionMatches(i3, strDjBIcL, iEZpvd, iOLrzqt)) {
                    return -1;
                }
                i4 += iOLrzqt;
                if (i == i2) {
                    return i4;
                }
                iEZpvd = partEZpvd.EZpvd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findOtherSubMessage(int i) {
        int iOLrzqt = this.msgPattern.OLrzqt();
        if (this.msgPattern.EZpvd(i).copydefault().hasNumericValue()) {
            i++;
        }
        do {
            int i2 = i + 1;
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i);
            if (partEZpvd.copydefault() == MessagePattern.Part.Type.ARG_LIMIT) {
                return 0;
            }
            if (this.msgPattern.copydefault(partEZpvd, "other")) {
                return i2;
            }
            if (this.msgPattern.AEQbTJ(i2).hasNumericValue()) {
                i2 = i + 2;
            }
            i = this.msgPattern.KWHzl(i2) + 1;
        } while (i < iOLrzqt);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findFirstPluralNumberArg(int i, String str) {
        while (true) {
            int i2 = i + 1;
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i2);
            MessagePattern.Part.Type typeCopydefault = partEZpvd.copydefault();
            if (typeCopydefault == MessagePattern.Part.Type.MSG_LIMIT) {
                return 0;
            }
            if (typeCopydefault == MessagePattern.Part.Type.REPLACE_NUMBER) {
                return -1;
            }
            if (typeCopydefault == MessagePattern.Part.Type.ARG_START) {
                MessagePattern.ArgType argTypeAEQbTJ = partEZpvd.AEQbTJ();
                if (str.length() != 0 && (argTypeAEQbTJ == MessagePattern.ArgType.NONE || argTypeAEQbTJ == MessagePattern.ArgType.SIMPLE)) {
                    if (this.msgPattern.copydefault(this.msgPattern.EZpvd(i + 2), str)) {
                        return i2;
                    }
                }
                i = this.msgPattern.KWHzl(i2);
            } else {
                i = i2;
            }
        }
    }

    public static final class StateListAnimator {
        public Format AEQbTJ;
        public String AYXKKw;
        public int AhwBna;
        public boolean EZpvd;
        public Number KWHzl;
        public String OLrzqt;
        public int copydefault;
        public double valueOf;

        public StateListAnimator(int i, String str, Number number, double d) {
            this.AhwBna = i;
            this.OLrzqt = str;
            if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.KWHzl = number;
            } else {
                this.KWHzl = Double.valueOf(number.doubleValue() - d);
            }
            this.valueOf = d;
        }

        public String toString() {
            throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
        }
    }

    public static final class Application implements PluralFormat.TaskDescription {
        public MessageFormat EZpvd;
        public PluralRules.PluralType KWHzl;
        public PluralRules OLrzqt;

        public Application(MessageFormat messageFormat, PluralRules.PluralType pluralType) {
            this.EZpvd = messageFormat;
            this.KWHzl = pluralType;
        }

        @Override // com.ibm.icu.text.PluralFormat.TaskDescription
        public String copydefault(Object obj, double d) {
            if (this.OLrzqt == null) {
                this.OLrzqt = PluralRules.forLocale(this.EZpvd.ulocale, this.KWHzl);
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            int iFindFirstPluralNumberArg = this.EZpvd.findFirstPluralNumberArg(this.EZpvd.findOtherSubMessage(stateListAnimator.AhwBna), stateListAnimator.OLrzqt);
            stateListAnimator.copydefault = iFindFirstPluralNumberArg;
            if (iFindFirstPluralNumberArg > 0 && this.EZpvd.cachedFormatters != null) {
                stateListAnimator.AEQbTJ = (Format) this.EZpvd.cachedFormatters.get(Integer.valueOf(stateListAnimator.copydefault));
            }
            if (stateListAnimator.AEQbTJ == null) {
                stateListAnimator.AEQbTJ = this.EZpvd.getStockNumberFormatter();
                stateListAnimator.EZpvd = true;
            }
            stateListAnimator.AYXKKw = stateListAnimator.AEQbTJ.format(stateListAnimator.KWHzl);
            Format format = stateListAnimator.AEQbTJ;
            if (format instanceof DecimalFormat) {
                return this.OLrzqt.select(((DecimalFormat) format).getFixedDecimal(d));
            }
            return this.OLrzqt.select(d);
        }
    }

    private void format(Object obj, TaskDescription taskDescription, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            format(null, (Map) obj, taskDescription, fieldPosition);
        } else {
            format((Object[]) obj, null, taskDescription, fieldPosition);
        }
    }

    private void format(Object[] objArr, Map<String, Object> map, TaskDescription taskDescription, FieldPosition fieldPosition) {
        if (objArr != null && this.msgPattern.gEmmrt()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        format(0, null, objArr, map, taskDescription, fieldPosition);
    }

    private void resetPattern() {
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern != null) {
            messagePattern.EZpvd();
        }
        Map<Integer, Format> map = this.cachedFormatters;
        if (map != null) {
            map.clear();
        }
        this.customFormatArgStarts = null;
    }

    public Format dateTimeFormatForPatternOrSkeleton(String str) {
        int iKWHzl = C7070acr.KWHzl(str, 0);
        if (str.regionMatches(iKWHzl, "::", 0, 2)) {
            return DateFormat.getInstanceForSkeleton(str.substring(iKWHzl + 2), this.ulocale);
        }
        return new SimpleDateFormat(str, this.ulocale);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x0011 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.text.Format] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.text.Format] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    private Format createAppropriateFormat(String str, String str2) {
        int iFindKeyword = findKeyword(str, typeList);
        if (iFindKeyword == 0) {
            int iFindKeyword2 = findKeyword(str2, modifierList);
            if (iFindKeyword2 == 0) {
                return NumberFormat.getInstance(this.ulocale);
            }
            if (iFindKeyword2 == 1) {
                return NumberFormat.getCurrencyInstance(this.ulocale);
            }
            if (iFindKeyword2 == 2) {
                return NumberFormat.getPercentInstance(this.ulocale);
            }
            if (iFindKeyword2 == 3) {
                return NumberFormat.getIntegerInstance(this.ulocale);
            }
            int iKWHzl = C7070acr.KWHzl(str2, 0);
            if (str2.regionMatches(iKWHzl, "::", 0, 2)) {
                return NumberFormatter.KWHzl(str2.substring(iKWHzl + 2)).EZpvd(this.ulocale).OLrzqt();
            }
            return new DecimalFormat(str2, new DecimalFormatSymbols(this.ulocale));
        }
        if (iFindKeyword == 1) {
            int iFindKeyword3 = findKeyword(str2, dateModifierList);
            if (iFindKeyword3 == 0) {
                return DateFormat.getDateInstance(2, this.ulocale);
            }
            if (iFindKeyword3 == 1) {
                return DateFormat.getDateInstance(3, this.ulocale);
            }
            if (iFindKeyword3 == 2) {
                return DateFormat.getDateInstance(2, this.ulocale);
            }
            if (iFindKeyword3 == 3) {
                return DateFormat.getDateInstance(1, this.ulocale);
            }
            if (iFindKeyword3 == 4) {
                return DateFormat.getDateInstance(0, this.ulocale);
            }
            return dateTimeFormatForPatternOrSkeleton(str2);
        }
        if (iFindKeyword == 2) {
            int iFindKeyword4 = findKeyword(str2, dateModifierList);
            if (iFindKeyword4 == 0) {
                return DateFormat.getTimeInstance(2, this.ulocale);
            }
            if (iFindKeyword4 == 1) {
                return DateFormat.getTimeInstance(3, this.ulocale);
            }
            if (iFindKeyword4 == 2) {
                return DateFormat.getTimeInstance(2, this.ulocale);
            }
            if (iFindKeyword4 == 3) {
                return DateFormat.getTimeInstance(1, this.ulocale);
            }
            if (iFindKeyword4 == 4) {
                return DateFormat.getTimeInstance(0, this.ulocale);
            }
            return dateTimeFormatForPatternOrSkeleton(str2);
        }
        try {
            if (iFindKeyword == 3) {
                RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat(this.ulocale, 1);
                String strTrim = str2.trim();
                if (strTrim.length() == 0) {
                    return ruleBasedNumberFormat;
                }
                ruleBasedNumberFormat.setDefaultRuleSet(strTrim);
                str = ruleBasedNumberFormat;
            } else if (iFindKeyword == 4) {
                RuleBasedNumberFormat ruleBasedNumberFormat2 = new RuleBasedNumberFormat(this.ulocale, 2);
                String strTrim2 = str2.trim();
                if (strTrim2.length() == 0) {
                    return ruleBasedNumberFormat2;
                }
                ruleBasedNumberFormat2.setDefaultRuleSet(strTrim2);
                str = ruleBasedNumberFormat2;
            } else if (iFindKeyword == 5) {
                RuleBasedNumberFormat ruleBasedNumberFormat3 = new RuleBasedNumberFormat(this.ulocale, 3);
                String strTrim3 = str2.trim();
                if (strTrim3.length() == 0) {
                    return ruleBasedNumberFormat3;
                }
                ruleBasedNumberFormat3.setDefaultRuleSet(strTrim3);
                str = ruleBasedNumberFormat3;
            } else {
                throw new IllegalArgumentException("Unknown format type \"" + ((String) str) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    private static final int findKeyword(String str, String[] strArr) {
        String lowerCase = C7070acr.copydefault(str).toLowerCase(rootLocale);
        for (int i = 0; i < strArr.length; i++) {
            if (lowerCase.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.ulocale.toLanguageTag());
        if (this.msgPattern == null) {
            this.msgPattern = new MessagePattern();
        }
        objectOutputStream.writeObject(this.msgPattern.AEQbTJ());
        objectOutputStream.writeObject(this.msgPattern.djBIcL());
        Set<Integer> set = this.customFormatArgStarts;
        if (set == null || set.isEmpty()) {
            objectOutputStream.writeInt(0);
        } else {
            objectOutputStream.writeInt(this.customFormatArgStarts.size());
            int iNextTopLevelArgStart = 0;
            int i = 0;
            while (true) {
                iNextTopLevelArgStart = nextTopLevelArgStart(iNextTopLevelArgStart);
                if (iNextTopLevelArgStart < 0) {
                    break;
                }
                if (this.customFormatArgStarts.contains(Integer.valueOf(iNextTopLevelArgStart))) {
                    objectOutputStream.writeInt(i);
                    objectOutputStream.writeObject(this.cachedFormatters.get(Integer.valueOf(iNextTopLevelArgStart)));
                }
                i++;
            }
        }
        objectOutputStream.writeInt(0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.ulocale = ULocale.forLanguageTag((String) objectInputStream.readObject());
        MessagePattern.ApostropheMode apostropheMode = (MessagePattern.ApostropheMode) objectInputStream.readObject();
        MessagePattern messagePattern = this.msgPattern;
        if (messagePattern == null || apostropheMode != messagePattern.AEQbTJ()) {
            this.msgPattern = new MessagePattern(apostropheMode);
        }
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            applyPattern(str);
        }
        for (int i = objectInputStream.readInt(); i > 0; i--) {
            setFormat(objectInputStream.readInt(), (Format) objectInputStream.readObject());
        }
        for (int i2 = objectInputStream.readInt(); i2 > 0; i2--) {
            objectInputStream.readInt();
            objectInputStream.readObject();
        }
    }

    private void cacheExplicitFormats() {
        int i;
        String strCopydefault;
        Map<Integer, Format> map = this.cachedFormatters;
        if (map != null) {
            map.clear();
        }
        this.customFormatArgStarts = null;
        int iOLrzqt = this.msgPattern.OLrzqt();
        int i2 = 1;
        while (i2 < iOLrzqt - 2) {
            MessagePattern.Part partEZpvd = this.msgPattern.EZpvd(i2);
            if (partEZpvd.copydefault() == MessagePattern.Part.Type.ARG_START && partEZpvd.AEQbTJ() == MessagePattern.ArgType.SIMPLE) {
                MessagePattern messagePattern = this.msgPattern;
                int i3 = i2 + 3;
                String strCopydefault2 = messagePattern.copydefault(messagePattern.EZpvd(i2 + 2));
                MessagePattern.Part partEZpvd2 = this.msgPattern.EZpvd(i3);
                if (partEZpvd2.copydefault() == MessagePattern.Part.Type.ARG_STYLE) {
                    strCopydefault = this.msgPattern.copydefault(partEZpvd2);
                    i = i2 + 4;
                } else {
                    i = i3;
                    strCopydefault = "";
                }
                setArgStartFormat(i2, createAppropriateFormat(strCopydefault2, strCopydefault));
                i2 = i;
            }
            i2++;
        }
    }

    private void setArgStartFormat(int i, Format format) {
        if (this.cachedFormatters == null) {
            this.cachedFormatters = new HashMap();
        }
        this.cachedFormatters.put(Integer.valueOf(i), format);
    }

    private void setCustomArgStartFormat(int i, Format format) {
        setArgStartFormat(i, format);
        if (this.customFormatArgStarts == null) {
            this.customFormatArgStarts = new HashSet();
        }
        this.customFormatArgStarts.add(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[PHI: r6
  0x0046: PHI (r6v4 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v6 int) binds: [B:21:0x003a, B:24:0x0040, B:19:0x0037, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String autoQuoteApostrophe(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int length = str.length();
        char c = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            if (cCharAt == '{') {
                                i++;
                            } else if (cCharAt == '}' && i - 1 == 0) {
                                c = 0;
                            }
                        }
                    } else if (cCharAt != '\'') {
                    }
                } else if (cCharAt != '\'') {
                    if (cCharAt == '{' || cCharAt == '}') {
                        c = 2;
                    } else {
                        sb.append(SINGLE_QUOTE);
                        c = 0;
                    }
                }
            } else if (cCharAt == '\'') {
                c = 1;
            } else if (cCharAt == '{') {
                i++;
                c = 3;
            }
            sb.append(cCharAt);
        }
        if (c == 1 || c == 2) {
            sb.append(SINGLE_QUOTE);
        }
        return new String(sb);
    }

    public static final class TaskDescription {
        public int AEQbTJ;
        public List<Activity> KWHzl = null;
        public Appendable copydefault;

        public TaskDescription(StringBuilder sb) {
            this.copydefault = sb;
            this.AEQbTJ = sb.length();
        }

        public TaskDescription(StringBuffer stringBuffer) {
            this.copydefault = stringBuffer;
            this.AEQbTJ = stringBuffer.length();
        }

        public void copydefault() {
            this.KWHzl = new ArrayList();
        }

        public void EZpvd(CharSequence charSequence) {
            try {
                this.copydefault.append(charSequence);
                this.AEQbTJ += charSequence.length();
            } catch (IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }

        public void AEQbTJ(CharSequence charSequence, int i, int i2) {
            try {
                this.copydefault.append(charSequence, i, i2);
                this.AEQbTJ += i2 - i;
            } catch (IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }

        public void OLrzqt(CharacterIterator characterIterator) {
            this.AEQbTJ += copydefault(this.copydefault, characterIterator);
        }

        public static int copydefault(Appendable appendable, CharacterIterator characterIterator) {
            try {
                int beginIndex = characterIterator.getBeginIndex();
                int endIndex = characterIterator.getEndIndex();
                if (beginIndex < endIndex) {
                    appendable.append(characterIterator.first());
                    int i = beginIndex;
                    while (true) {
                        i++;
                        if (i >= endIndex) {
                            break;
                        }
                        appendable.append(characterIterator.next());
                    }
                }
                return endIndex - beginIndex;
            } catch (IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }

        public void OLrzqt(Format format, Object obj) {
            if (this.KWHzl == null) {
                EZpvd(format.format(obj));
                return;
            }
            AttributedCharacterIterator toCharacterIterator = format.formatToCharacterIterator(obj);
            int i = this.AEQbTJ;
            OLrzqt(toCharacterIterator);
            toCharacterIterator.first();
            int index = toCharacterIterator.getIndex();
            int endIndex = toCharacterIterator.getEndIndex();
            int i2 = i - index;
            while (index < endIndex) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = toCharacterIterator.getAttributes();
                int runLimit = toCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.KWHzl.add(new Activity(entry.getKey(), entry.getValue(), i2 + index, i2 + runLimit));
                    }
                }
                toCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        }

        public void copydefault(Format format, Object obj, String str) {
            if (this.KWHzl == null && str != null) {
                EZpvd(str);
            } else {
                OLrzqt(format, obj);
            }
        }
    }

    public static final class Activity {
        public int AEQbTJ;
        public int EZpvd;
        public Object OLrzqt;
        public AttributedCharacterIterator.Attribute copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
            this.copydefault = attribute;
            this.OLrzqt = obj;
            this.AEQbTJ = i;
            this.EZpvd = i2;
        }

        public Activity(Object obj, int i, int i2) {
            OLrzqt(Field.ARGUMENT, obj, i, i2);
        }

        public Activity(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
            OLrzqt(attribute, obj, i, i2);
        }
    }
}
