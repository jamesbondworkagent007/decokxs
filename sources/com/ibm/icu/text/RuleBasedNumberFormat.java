package com.ibm.icu.text;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.math.BigDecimal;
import com.ibm.icu.text.DisplayContext;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import o.AbstractC7192afG;
import o.C7060ach;
import o.C7070acr;
import o.C7223afl;
import o.C7260agV;
import o.C7277agm;
import o.C7279ago;
import o.InterfaceC7280agp;
import o.InterfaceC7282agr;
import o.InterfaceC7283ags;

/* JADX INFO: loaded from: classes3.dex */
public class RuleBasedNumberFormat extends NumberFormat {
    public static final int DURATION = 3;
    public static final int NUMBERING_SYSTEM = 4;
    public static final int ORDINAL = 2;
    public static final int SPELLOUT = 1;
    static final long serialVersionUID = -7664252765575395068L;
    private transient AbstractC7192afG capitalizationBrkIter;
    private boolean capitalizationForListOrMenu;
    private boolean capitalizationForStandAlone;
    private boolean capitalizationInfoIsSet;
    private transient DecimalFormat decimalFormat;
    private transient DecimalFormatSymbols decimalFormatSymbols;
    private transient C7277agm defaultInfinityRule;
    private transient C7277agm defaultNaNRule;
    private transient C7279ago defaultRuleSet;
    private boolean lenientParse;
    private transient String lenientParseRules;
    private ULocale locale;
    private transient boolean lookedForScanner;
    private transient String postProcessRules;
    private transient InterfaceC7282agr postProcessor;
    private String[] publicRuleSetNames;
    private int roundingMode;
    private Map<String, String[]> ruleSetDisplayNames;
    private transient C7279ago[] ruleSets;
    private transient Map<String, C7279ago> ruleSetsMap;
    private transient InterfaceC7283ags scannerProvider;
    private static final boolean DEBUG = C7060ach.AEQbTJ("rbnf");
    private static final String[] rulenames = {"SpelloutRules", "OrdinalRules", "DurationRules", "NumberingSystemRules"};
    private static final String[] locnames = {"SpelloutLocalizations", "OrdinalLocalizations", "DurationLocalizations", "NumberingSystemLocalizations"};
    private static final BigDecimal MAX_VALUE = BigDecimal.valueOf(Long.MAX_VALUE);
    private static final BigDecimal MIN_VALUE = BigDecimal.valueOf(Long.MIN_VALUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7279ago getDefaultRuleSet() {
        return this.defaultRuleSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.text.NumberFormat
    public int getRoundingMode() {
        return this.roundingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean lenientParseEnabled() {
        return this.lenientParse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLenientParseMode(boolean z) {
        this.lenientParse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLenientScannerProvider(InterfaceC7283ags interfaceC7283ags) {
        this.scannerProvider = interfaceC7283ags;
    }

    public RuleBasedNumberFormat(String str) {
        this.ruleSets = null;
        this.ruleSetsMap = null;
        this.defaultRuleSet = null;
        this.locale = null;
        this.roundingMode = 7;
        this.scannerProvider = null;
        this.decimalFormatSymbols = null;
        this.decimalFormat = null;
        this.defaultInfinityRule = null;
        this.defaultNaNRule = null;
        this.lenientParse = false;
        this.capitalizationInfoIsSet = false;
        this.capitalizationForListOrMenu = false;
        this.capitalizationForStandAlone = false;
        this.capitalizationBrkIter = null;
        this.locale = ULocale.getDefault(ULocale.Category.FORMAT);
        init(str, null);
    }

    public RuleBasedNumberFormat(String str, String[][] strArr) {
        this.ruleSets = null;
        this.ruleSetsMap = null;
        this.defaultRuleSet = null;
        this.locale = null;
        this.roundingMode = 7;
        this.scannerProvider = null;
        this.decimalFormatSymbols = null;
        this.decimalFormat = null;
        this.defaultInfinityRule = null;
        this.defaultNaNRule = null;
        this.lenientParse = false;
        this.capitalizationInfoIsSet = false;
        this.capitalizationForListOrMenu = false;
        this.capitalizationForStandAlone = false;
        this.capitalizationBrkIter = null;
        this.locale = ULocale.getDefault(ULocale.Category.FORMAT);
        init(str, strArr);
    }

    public RuleBasedNumberFormat(String str, Locale locale) {
        this(str, ULocale.forLocale(locale));
    }

    public RuleBasedNumberFormat(String str, ULocale uLocale) {
        this.ruleSets = null;
        this.ruleSetsMap = null;
        this.defaultRuleSet = null;
        this.roundingMode = 7;
        this.scannerProvider = null;
        this.decimalFormatSymbols = null;
        this.decimalFormat = null;
        this.defaultInfinityRule = null;
        this.defaultNaNRule = null;
        this.lenientParse = false;
        this.capitalizationInfoIsSet = false;
        this.capitalizationForListOrMenu = false;
        this.capitalizationForStandAlone = false;
        this.capitalizationBrkIter = null;
        this.locale = uLocale;
        init(str, null);
    }

    public RuleBasedNumberFormat(String str, String[][] strArr, ULocale uLocale) {
        this.ruleSets = null;
        this.ruleSetsMap = null;
        this.defaultRuleSet = null;
        this.roundingMode = 7;
        this.scannerProvider = null;
        this.decimalFormatSymbols = null;
        this.decimalFormat = null;
        this.defaultInfinityRule = null;
        this.defaultNaNRule = null;
        this.lenientParse = false;
        this.capitalizationInfoIsSet = false;
        this.capitalizationForListOrMenu = false;
        this.capitalizationForStandAlone = false;
        this.capitalizationBrkIter = null;
        this.locale = uLocale;
        init(str, strArr);
    }

    public RuleBasedNumberFormat(Locale locale, int i) {
        this(ULocale.forLocale(locale), i);
    }

    public RuleBasedNumberFormat(ULocale uLocale, int i) {
        String[][] strArr = null;
        this.ruleSets = null;
        this.ruleSetsMap = null;
        this.defaultRuleSet = null;
        this.roundingMode = 7;
        this.scannerProvider = null;
        this.decimalFormatSymbols = null;
        this.decimalFormat = null;
        this.defaultInfinityRule = null;
        this.defaultNaNRule = null;
        this.lenientParse = false;
        this.capitalizationInfoIsSet = false;
        this.capitalizationForListOrMenu = false;
        this.capitalizationForStandAlone = false;
        this.capitalizationBrkIter = null;
        this.locale = uLocale;
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/rbnf", uLocale);
        ULocale uLocaleFetchVPNInfo = iCUResourceBundle.fetchVPNInfo();
        setLocale(uLocaleFetchVPNInfo, uLocaleFetchVPNInfo);
        StringBuilder sb = new StringBuilder();
        try {
            C7260agV newProxyInstance = iCUResourceBundle.valueOf("RBNFRules/" + rulenames[i - 1]).getNewProxyInstance();
            while (newProxyInstance.EZpvd()) {
                sb.append(newProxyInstance.OLrzqt());
            }
        } catch (MissingResourceException unused) {
        }
        ICUResourceBundle iCUResourceBundleOLrzqt = iCUResourceBundle.OLrzqt(locnames[i - 1]);
        if (iCUResourceBundleOLrzqt != null) {
            int iFARcdN = iCUResourceBundleOLrzqt.fARcdN();
            strArr = new String[iFARcdN][];
            for (int i2 = 0; i2 < iFARcdN; i2++) {
                strArr[i2] = iCUResourceBundleOLrzqt.KWHzl(i2).isConnected();
            }
        }
        init(sb.toString(), strArr);
    }

    public RuleBasedNumberFormat(int i) {
        this(ULocale.getDefault(ULocale.Category.FORMAT), i);
    }

    @Override // com.ibm.icu.text.NumberFormat, java.text.Format
    public Object clone() {
        return super.clone();
    }

    @Override // com.ibm.icu.text.NumberFormat
    public boolean equals(Object obj) {
        if (!(obj instanceof RuleBasedNumberFormat)) {
            return false;
        }
        RuleBasedNumberFormat ruleBasedNumberFormat = (RuleBasedNumberFormat) obj;
        if (!this.locale.equals(ruleBasedNumberFormat.locale) || this.lenientParse != ruleBasedNumberFormat.lenientParse || this.ruleSets.length != ruleBasedNumberFormat.ruleSets.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C7279ago[] c7279agoArr = this.ruleSets;
            if (i >= c7279agoArr.length) {
                return true;
            }
            if (!c7279agoArr[i].equals(ruleBasedNumberFormat.ruleSets[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C7279ago c7279ago : this.ruleSets) {
            sb.append(c7279ago.toString());
        }
        return sb.toString();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(toString());
        objectOutputStream.writeObject(this.locale);
        objectOutputStream.writeInt(this.roundingMode);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        ULocale uLocale;
        String utf = objectInputStream.readUTF();
        try {
            uLocale = (ULocale) objectInputStream.readObject();
        } catch (Exception unused) {
            uLocale = ULocale.getDefault(ULocale.Category.FORMAT);
        }
        try {
            this.roundingMode = objectInputStream.readInt();
        } catch (Exception unused2) {
        }
        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat(utf, uLocale);
        this.ruleSets = ruleBasedNumberFormat.ruleSets;
        this.ruleSetsMap = ruleBasedNumberFormat.ruleSetsMap;
        this.defaultRuleSet = ruleBasedNumberFormat.defaultRuleSet;
        this.publicRuleSetNames = ruleBasedNumberFormat.publicRuleSetNames;
        this.decimalFormatSymbols = ruleBasedNumberFormat.decimalFormatSymbols;
        this.decimalFormat = ruleBasedNumberFormat.decimalFormat;
        this.locale = ruleBasedNumberFormat.locale;
        this.defaultInfinityRule = ruleBasedNumberFormat.defaultInfinityRule;
        this.defaultNaNRule = ruleBasedNumberFormat.defaultNaNRule;
    }

    public String[] getRuleSetNames() {
        return (String[]) this.publicRuleSetNames.clone();
    }

    public ULocale[] getRuleSetDisplayNameLocales() {
        Map<String, String[]> map = this.ruleSetDisplayNames;
        if (map == null) {
            return null;
        }
        Set<String> setKeySet = map.keySet();
        String[] strArr = (String[]) setKeySet.toArray(new String[setKeySet.size()]);
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        ULocale[] uLocaleArr = new ULocale[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            uLocaleArr[i] = new ULocale(strArr[i]);
        }
        return uLocaleArr;
    }

    private String[] getNameListForLocale(ULocale uLocale) {
        if (uLocale == null || this.ruleSetDisplayNames == null) {
            return null;
        }
        String[] strArr = {uLocale.getBaseName(), ULocale.getDefault(ULocale.Category.DISPLAY).getBaseName()};
        for (int i = 0; i < 2; i++) {
            for (String fallback = strArr[i]; fallback.length() > 0; fallback = ULocale.getFallback(fallback)) {
                String[] strArr2 = this.ruleSetDisplayNames.get(fallback);
                if (strArr2 != null) {
                    return strArr2;
                }
            }
        }
        return null;
    }

    public String[] getRuleSetDisplayNames(ULocale uLocale) {
        String[] nameListForLocale = getNameListForLocale(uLocale);
        if (nameListForLocale != null) {
            return (String[]) nameListForLocale.clone();
        }
        String[] ruleSetNames = getRuleSetNames();
        for (int i = 0; i < ruleSetNames.length; i++) {
            ruleSetNames[i] = ruleSetNames[i].substring(1);
        }
        return ruleSetNames;
    }

    public String[] getRuleSetDisplayNames() {
        return getRuleSetDisplayNames(ULocale.getDefault(ULocale.Category.DISPLAY));
    }

    public String getRuleSetDisplayName(String str, ULocale uLocale) {
        String[] strArr = this.publicRuleSetNames;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                String[] nameListForLocale = getNameListForLocale(uLocale);
                if (nameListForLocale != null) {
                    return nameListForLocale[i];
                }
                return strArr[i].substring(1);
            }
        }
        throw new IllegalArgumentException("unrecognized rule set name: " + str);
    }

    public String getRuleSetDisplayName(String str) {
        return getRuleSetDisplayName(str, ULocale.getDefault(ULocale.Category.DISPLAY));
    }

    public String format(double d, String str) throws IllegalArgumentException {
        if (str.startsWith("%%")) {
            throw new IllegalArgumentException("Can't use internal rule set");
        }
        return adjustForContext(format(d, findRuleSet(str)));
    }

    public String format(long j, String str) throws IllegalArgumentException {
        if (str.startsWith("%%")) {
            throw new IllegalArgumentException("Can't use internal rule set");
        }
        return adjustForContext(format(j, findRuleSet(str)));
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(double d, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (stringBuffer.length() == 0) {
            stringBuffer.append(adjustForContext(format(d, this.defaultRuleSet)));
        } else {
            stringBuffer.append(format(d, this.defaultRuleSet));
        }
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(long j, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (stringBuffer.length() == 0) {
            stringBuffer.append(adjustForContext(format(j, this.defaultRuleSet)));
        } else {
            stringBuffer.append(format(j, this.defaultRuleSet));
        }
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return format(new BigDecimal(bigInteger), stringBuffer, fieldPosition);
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(java.math.BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return format(new BigDecimal(bigDecimal), stringBuffer, fieldPosition);
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (MIN_VALUE.compareTo(bigDecimal) > 0 || MAX_VALUE.compareTo(bigDecimal) < 0) {
            return getDecimalFormat().format(bigDecimal, stringBuffer, fieldPosition);
        }
        if (bigDecimal.scale() == 0) {
            return format(bigDecimal.longValue(), stringBuffer, fieldPosition);
        }
        return format(bigDecimal.doubleValue(), stringBuffer, fieldPosition);
    }

    @Override // com.ibm.icu.text.NumberFormat
    public Number parse(String str, ParsePosition parsePosition) {
        String strSubstring = str.substring(parsePosition.getIndex());
        ParsePosition parsePosition2 = new ParsePosition(0);
        Long l = C7277agm.EZpvd;
        ParsePosition parsePosition3 = new ParsePosition(parsePosition2.getIndex());
        Number number = l;
        for (int length = this.ruleSets.length - 1; length >= 0; length--) {
            if (this.ruleSets[length].AEQbTJ() && this.ruleSets[length].OLrzqt()) {
                Number numberOLrzqt = this.ruleSets[length].OLrzqt(strSubstring, parsePosition2, Double.MAX_VALUE, 0);
                if (parsePosition2.getIndex() > parsePosition3.getIndex()) {
                    parsePosition3.setIndex(parsePosition2.getIndex());
                    number = numberOLrzqt;
                }
                if (parsePosition3.getIndex() == strSubstring.length()) {
                    break;
                }
                parsePosition2.setIndex(0);
            }
        }
        parsePosition.setIndex(parsePosition.getIndex() + parsePosition3.getIndex());
        return number;
    }

    public InterfaceC7283ags getLenientScannerProvider() {
        if (this.scannerProvider == null && this.lenientParse && !this.lookedForScanner) {
            try {
                this.lookedForScanner = true;
                setLenientScannerProvider((InterfaceC7283ags) Class.forName("o.aeY").newInstance());
            } catch (Exception unused) {
            }
        }
        return this.scannerProvider;
    }

    public void setDefaultRuleSet(String str) {
        String strCopydefault;
        if (str == null) {
            String[] strArr = this.publicRuleSetNames;
            if (strArr.length > 0) {
                this.defaultRuleSet = findRuleSet(strArr[0]);
                return;
            }
            this.defaultRuleSet = null;
            int length = this.ruleSets.length;
            do {
                length--;
                if (length >= 0) {
                    strCopydefault = this.ruleSets[length].copydefault();
                    if (strCopydefault.equals("%spellout-numbering") || strCopydefault.equals("%digits-ordinal")) {
                        break;
                    }
                } else {
                    int length2 = this.ruleSets.length;
                    do {
                        length2--;
                        if (length2 < 0) {
                            return;
                        }
                    } while (!this.ruleSets[length2].AEQbTJ());
                    this.defaultRuleSet = this.ruleSets[length2];
                    return;
                }
            } while (!strCopydefault.equals("%duration"));
            this.defaultRuleSet = this.ruleSets[length];
            return;
        }
        if (str.startsWith("%%")) {
            throw new IllegalArgumentException("cannot use private rule set: " + str);
        }
        this.defaultRuleSet = findRuleSet(str);
    }

    public String getDefaultRuleSetName() {
        C7279ago c7279ago = this.defaultRuleSet;
        return (c7279ago == null || !c7279ago.AEQbTJ()) ? "" : this.defaultRuleSet.copydefault();
    }

    public void setDecimalFormatSymbols(DecimalFormatSymbols decimalFormatSymbols) {
        if (decimalFormatSymbols != null) {
            DecimalFormatSymbols decimalFormatSymbols2 = (DecimalFormatSymbols) decimalFormatSymbols.clone();
            this.decimalFormatSymbols = decimalFormatSymbols2;
            DecimalFormat decimalFormat = this.decimalFormat;
            if (decimalFormat != null) {
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols2);
            }
            if (this.defaultInfinityRule != null) {
                this.defaultInfinityRule = null;
                getDefaultInfinityRule();
            }
            if (this.defaultNaNRule != null) {
                this.defaultNaNRule = null;
                getDefaultNaNRule();
            }
            for (C7279ago c7279ago : this.ruleSets) {
                c7279ago.copydefault(this.decimalFormatSymbols);
            }
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setContext(DisplayContext displayContext) {
        super.setContext(displayContext);
        if (!this.capitalizationInfoIsSet && (displayContext == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU || displayContext == DisplayContext.CAPITALIZATION_FOR_STANDALONE)) {
            initCapitalizationContextInfo(this.locale);
            this.capitalizationInfoIsSet = true;
        }
        if (this.capitalizationBrkIter == null) {
            if (displayContext == DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE || ((displayContext == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU && this.capitalizationForListOrMenu) || (displayContext == DisplayContext.CAPITALIZATION_FOR_STANDALONE && this.capitalizationForStandAlone))) {
                this.capitalizationBrkIter = AbstractC7192afG.copydefault(this.locale);
            }
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setRoundingMode(int i) {
        if (i >= 0 && i <= 7) {
            this.roundingMode = i;
            return;
        }
        throw new IllegalArgumentException("Invalid rounding mode: " + i);
    }

    public InterfaceC7280agp getLenientScanner() {
        InterfaceC7283ags lenientScannerProvider;
        if (!this.lenientParse || (lenientScannerProvider = getLenientScannerProvider()) == null) {
            return null;
        }
        return lenientScannerProvider.copydefault(this.locale, this.lenientParseRules);
    }

    public DecimalFormatSymbols getDecimalFormatSymbols() {
        if (this.decimalFormatSymbols == null) {
            this.decimalFormatSymbols = new DecimalFormatSymbols(this.locale);
        }
        return this.decimalFormatSymbols;
    }

    public DecimalFormat getDecimalFormat() {
        if (this.decimalFormat == null) {
            this.decimalFormat = new DecimalFormat(NumberFormat.getPattern(this.locale, 0), getDecimalFormatSymbols());
        }
        return this.decimalFormat;
    }

    public PluralFormat createPluralFormat(PluralRules.PluralType pluralType, String str) {
        return new PluralFormat(this.locale, pluralType, str, getDecimalFormat());
    }

    public C7277agm getDefaultInfinityRule() {
        if (this.defaultInfinityRule == null) {
            this.defaultInfinityRule = new C7277agm(this, "Inf: " + getDecimalFormatSymbols().getInfinity());
        }
        return this.defaultInfinityRule;
    }

    public C7277agm getDefaultNaNRule() {
        if (this.defaultNaNRule == null) {
            this.defaultNaNRule = new C7277agm(this, "NaN: " + getDecimalFormatSymbols().getNaN());
        }
        return this.defaultNaNRule;
    }

    private String extractSpecial(StringBuilder sb, String str) {
        int iIndexOf = sb.indexOf(str);
        if (iIndexOf == -1 || !(iIndexOf == 0 || sb.charAt(iIndexOf - 1) == ';')) {
            return null;
        }
        int iIndexOf2 = sb.indexOf(";%", iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = sb.length() - 1;
        }
        int length = str.length() + iIndexOf;
        while (length < iIndexOf2 && C7070acr.AEQbTJ(sb.charAt(length))) {
            length++;
        }
        String strSubstring = sb.substring(length, iIndexOf2);
        sb.delete(iIndexOf, iIndexOf2 + 1);
        return strSubstring;
    }

    private void init(String str, String[][] strArr) {
        C7279ago[] c7279agoArr;
        C7279ago[] c7279agoArr2;
        initLocalizations(strArr);
        StringBuilder sbStripWhitespace = stripWhitespace(str);
        this.lenientParseRules = extractSpecial(sbStripWhitespace, "%%lenient-parse:");
        this.postProcessRules = extractSpecial(sbStripWhitespace, "%%post-process:");
        int i = 1;
        int i2 = 0;
        while (true) {
            int iIndexOf = sbStripWhitespace.indexOf(";%", i2);
            if (iIndexOf == -1) {
                break;
            }
            i++;
            i2 = iIndexOf + 2;
        }
        this.ruleSets = new C7279ago[i];
        this.ruleSetsMap = new HashMap((i * 2) + 1);
        this.defaultRuleSet = null;
        String[] strArr2 = new String[i];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            c7279agoArr = this.ruleSets;
            if (i3 >= c7279agoArr.length) {
                break;
            }
            int iIndexOf2 = sbStripWhitespace.indexOf(";%", i4);
            if (iIndexOf2 < 0) {
                iIndexOf2 = sbStripWhitespace.length() - 1;
            }
            int i6 = iIndexOf2 + 1;
            strArr2[i3] = sbStripWhitespace.substring(i4, i6);
            C7279ago c7279ago = new C7279ago(this, strArr2, i3);
            this.ruleSets[i3] = c7279ago;
            String strCopydefault = c7279ago.copydefault();
            this.ruleSetsMap.put(strCopydefault, c7279ago);
            if (!strCopydefault.startsWith("%%")) {
                i5++;
                if ((this.defaultRuleSet == null && strCopydefault.equals("%spellout-numbering")) || strCopydefault.equals("%digits-ordinal") || strCopydefault.equals("%duration")) {
                    this.defaultRuleSet = c7279ago;
                }
            }
            i3++;
            i4 = i6;
        }
        if (this.defaultRuleSet == null) {
            int length = c7279agoArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (!this.ruleSets[length].copydefault().startsWith("%%")) {
                    this.defaultRuleSet = this.ruleSets[length];
                    break;
                }
                length--;
            }
        }
        if (this.defaultRuleSet == null) {
            C7279ago[] c7279agoArr3 = this.ruleSets;
            this.defaultRuleSet = c7279agoArr3[c7279agoArr3.length - 1];
        }
        int i7 = 0;
        while (true) {
            c7279agoArr2 = this.ruleSets;
            if (i7 >= c7279agoArr2.length) {
                break;
            }
            c7279agoArr2[i7].KWHzl(strArr2[i7]);
            i7++;
        }
        String[] strArr3 = new String[i5];
        int i8 = 0;
        for (int length2 = c7279agoArr2.length - 1; length2 >= 0; length2--) {
            if (!this.ruleSets[length2].copydefault().startsWith("%%")) {
                strArr3[i8] = this.ruleSets[length2].copydefault();
                i8++;
            }
        }
        if (this.publicRuleSetNames == null) {
            this.publicRuleSetNames = strArr3;
            return;
        }
        int i9 = 0;
        while (true) {
            String[] strArr4 = this.publicRuleSetNames;
            if (i9 < strArr4.length) {
                String str2 = strArr4[i9];
                for (int i10 = 0; i10 < i5; i10++) {
                    if (str2.equals(strArr3[i10])) {
                        break;
                    }
                }
                throw new IllegalArgumentException("did not find public rule set: " + str2);
            }
            this.defaultRuleSet = findRuleSet(strArr4[0]);
            return;
            i9++;
        }
    }

    private void initLocalizations(String[][] strArr) {
        if (strArr != null) {
            this.publicRuleSetNames = (String[]) strArr[0].clone();
            HashMap map = new HashMap();
            for (int i = 1; i < strArr.length; i++) {
                String[] strArr2 = strArr[i];
                String str = strArr2[0];
                int length = strArr2.length - 1;
                String[] strArr3 = new String[length];
                if (length != this.publicRuleSetNames.length) {
                    throw new IllegalArgumentException("public name length: " + this.publicRuleSetNames.length + " != localized names[" + i + "] length: " + length);
                }
                System.arraycopy(strArr2, 1, strArr3, 0, length);
                map.put(str, strArr3);
            }
            if (map.isEmpty()) {
                return;
            }
            this.ruleSetDisplayNames = map;
        }
    }

    private void initCapitalizationContextInfo(ULocale uLocale) {
        try {
            int[] iArrUzCIH = ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale)).valueOf("contextTransforms/number-spellout").uzCIH();
            if (iArrUzCIH.length >= 2) {
                this.capitalizationForListOrMenu = iArrUzCIH[0] != 0;
                this.capitalizationForStandAlone = iArrUzCIH[1] != 0;
            }
        } catch (MissingResourceException unused) {
        }
    }

    private StringBuilder stripWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            while (i < length && C7070acr.AEQbTJ(str.charAt(i))) {
                i++;
            }
            if (i >= length || str.charAt(i) != ';') {
                int iIndexOf = str.indexOf(59, i);
                if (iIndexOf != -1) {
                    if (iIndexOf >= length) {
                        break;
                    }
                    int i2 = iIndexOf + 1;
                    sb.append(str.substring(i, i2));
                    i = i2;
                } else {
                    sb.append(str.substring(i));
                    break;
                }
            } else {
                i++;
            }
        }
        return sb;
    }

    private String format(double d, C7279ago c7279ago) {
        StringBuilder sb = new StringBuilder();
        if (getRoundingMode() != 7 && !Double.isNaN(d) && !Double.isInfinite(d)) {
            d = new BigDecimal(Double.toString(d)).setScale(getMaximumFractionDigits(), this.roundingMode).doubleValue();
        }
        c7279ago.KWHzl(d, sb, 0, 0);
        postProcess(sb, c7279ago);
        return sb.toString();
    }

    private String format(long j, C7279ago c7279ago) {
        StringBuilder sb = new StringBuilder();
        if (j == Long.MIN_VALUE) {
            sb.append(getDecimalFormat().format(Long.MIN_VALUE));
        } else {
            c7279ago.AEQbTJ(j, sb, 0, 0);
        }
        postProcess(sb, c7279ago);
        return sb.toString();
    }

    private void postProcess(StringBuilder sb, C7279ago c7279ago) {
        String str = this.postProcessRules;
        if (str != null) {
            if (this.postProcessor == null) {
                int iIndexOf = str.indexOf(";");
                if (iIndexOf == -1) {
                    iIndexOf = this.postProcessRules.length();
                }
                String strTrim = this.postProcessRules.substring(0, iIndexOf).trim();
                try {
                    InterfaceC7282agr interfaceC7282agr = (InterfaceC7282agr) Class.forName(strTrim).newInstance();
                    this.postProcessor = interfaceC7282agr;
                    interfaceC7282agr.EZpvd(this, this.postProcessRules);
                } catch (Exception e) {
                    if (DEBUG) {
                        System.out.println("could not locate " + strTrim + ", error " + e.getClass().getName() + ", " + e.getMessage());
                    }
                    this.postProcessor = null;
                    this.postProcessRules = null;
                    return;
                }
            }
            this.postProcessor.KWHzl(sb, c7279ago);
        }
    }

    private String adjustForContext(String str) {
        DisplayContext context = getContext(DisplayContext.Type.CAPITALIZATION);
        if (context == DisplayContext.CAPITALIZATION_NONE || str == null || str.length() <= 0 || !C7223afl.fetchVPNInfo(str.codePointAt(0))) {
            return str;
        }
        if (context != DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE && ((context != DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU || !this.capitalizationForListOrMenu) && (context != DisplayContext.CAPITALIZATION_FOR_STANDALONE || !this.capitalizationForStandAlone))) {
            return str;
        }
        if (this.capitalizationBrkIter == null) {
            this.capitalizationBrkIter = AbstractC7192afG.copydefault(this.locale);
        }
        return C7223afl.AEQbTJ(this.locale, str, this.capitalizationBrkIter, 768);
    }

    public C7279ago findRuleSet(String str) throws IllegalArgumentException {
        C7279ago c7279ago = this.ruleSetsMap.get(str);
        if (c7279ago != null) {
            return c7279ago;
        }
        throw new IllegalArgumentException("No rule set named " + str);
    }
}
