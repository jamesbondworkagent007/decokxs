package o;

import com.ibm.icu.impl.number.CustomSymbolCurrency;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;

/* JADX INFO: renamed from: o.aeJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7142aeJ {
    public final java.util.List<InterfaceC7141aeI> AEQbTJ = new java.util.ArrayList();
    public boolean EZpvd = false;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.EZpvd = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7142aeJ OLrzqt(DecimalFormatProperties decimalFormatProperties, DecimalFormatSymbols decimalFormatSymbols, boolean z) {
        int i;
        int i2;
        C7142aeJ c7142aeJ;
        DecimalFormatProperties.ParseMode parseMode;
        java.lang.String padString;
        C7235afx c7235afxOLrzqt;
        ULocale uLocale = decimalFormatSymbols.getULocale();
        InterfaceC7102adW interfaceC7102adWOLrzqt = C7181aew.OLrzqt(decimalFormatProperties);
        Currency currencyResolve = CustomSymbolCurrency.resolve(decimalFormatProperties.getCurrency(), uLocale, decimalFormatSymbols);
        DecimalFormatProperties.ParseMode parseMode2 = decimalFormatProperties.getParseMode();
        if (parseMode2 == null) {
            parseMode2 = DecimalFormatProperties.ParseMode.LENIENT;
        }
        C7166aeh c7166aehAEQbTJ = C7166aeh.AEQbTJ(decimalFormatProperties);
        boolean z2 = true;
        int i3 = !decimalFormatProperties.getParseCaseSensitive() ? 1 : 0;
        if (decimalFormatProperties.getParseIntegerOnly()) {
            i3 |= 16;
        }
        if (decimalFormatProperties.getParseToBigDecimal()) {
            i3 |= 4096;
        }
        if (decimalFormatProperties.getSignAlwaysShown()) {
            i3 |= 1024;
        }
        if (parseMode2 == DecimalFormatProperties.ParseMode.JAVA_COMPATIBILITY) {
            i2 = 66308;
        } else {
            if (parseMode2 != DecimalFormatProperties.ParseMode.STRICT) {
                i = i3 | 128;
                if (c7166aehAEQbTJ.AEQbTJ() <= 0) {
                    i |= 32;
                }
                if (!z || interfaceC7102adWOLrzqt.KWHzl()) {
                    i |= 2;
                }
                if (!z) {
                    i |= 8192;
                }
                c7142aeJ = new C7142aeJ(i);
                C7139aeG c7139aeGOLrzqt = C7139aeG.OLrzqt(i);
                C7135aeC c7135aeC = new C7135aeC();
                c7135aeC.EZpvd = currencyResolve;
                c7135aeC.OLrzqt = decimalFormatSymbols;
                c7135aeC.copydefault = c7139aeGOLrzqt;
                c7135aeC.AEQbTJ = uLocale;
                c7135aeC.KWHzl = i;
                C7133aeA.OLrzqt(interfaceC7102adWOLrzqt, c7142aeJ, c7135aeC, c7139aeGOLrzqt, i);
                if (!z || interfaceC7102adWOLrzqt.KWHzl()) {
                    c7142aeJ.OLrzqt(C7183aey.KWHzl(currencyResolve, decimalFormatSymbols, i));
                }
                parseMode = DecimalFormatProperties.ParseMode.LENIENT;
                if (parseMode2 == parseMode && interfaceC7102adWOLrzqt.copydefault(-3)) {
                    c7142aeJ.OLrzqt(C7148aeP.AEQbTJ(decimalFormatSymbols));
                }
                if (parseMode2 == parseMode && interfaceC7102adWOLrzqt.copydefault(-4)) {
                    c7142aeJ.OLrzqt(C7146aeN.AEQbTJ(decimalFormatSymbols));
                }
                if (parseMode2 == parseMode) {
                    c7142aeJ.OLrzqt(C7147aeO.KWHzl(decimalFormatSymbols, false));
                    c7142aeJ.OLrzqt(C7138aeF.OLrzqt(decimalFormatSymbols, false));
                }
                c7142aeJ.OLrzqt(C7144aeL.copydefault(decimalFormatSymbols, i));
                c7142aeJ.OLrzqt(C7140aeH.OLrzqt(decimalFormatSymbols));
                padString = decimalFormatProperties.getPadString();
                if (padString != null && !c7139aeGOLrzqt.EZpvd().OLrzqt((java.lang.CharSequence) padString)) {
                    c7142aeJ.OLrzqt(C7143aeK.copydefault(padString));
                }
                c7142aeJ.OLrzqt(c7139aeGOLrzqt);
                c7142aeJ.OLrzqt(C7136aeD.OLrzqt(decimalFormatSymbols, c7166aehAEQbTJ, i));
                if (decimalFormatProperties.getParseNoExponent() || decimalFormatProperties.getMinimumExponentDigits() > 0) {
                    c7142aeJ.OLrzqt(C7151aeS.KWHzl(decimalFormatSymbols, c7166aehAEQbTJ));
                }
                c7142aeJ.OLrzqt(new C7152aeT());
                if (parseMode2 != parseMode) {
                    c7142aeJ.OLrzqt(new C7149aeQ());
                }
                if (z) {
                    c7142aeJ.OLrzqt(new C7153aeU());
                }
                if (decimalFormatProperties.getDecimalPatternMatchRequired()) {
                    if (!decimalFormatProperties.getDecimalSeparatorAlwaysShown() && decimalFormatProperties.getMaximumFractionDigits() == 0) {
                        z2 = false;
                    }
                    c7142aeJ.OLrzqt(C7154aeV.OLrzqt(z2));
                }
                c7235afxOLrzqt = C7180aev.OLrzqt(decimalFormatProperties);
                if (c7235afxOLrzqt != null) {
                    c7142aeJ.OLrzqt(new C7137aeE(c7235afxOLrzqt));
                }
                c7142aeJ.EZpvd();
                return c7142aeJ;
            }
            i2 = 33548;
        }
        i = i3 | i2;
        if (c7166aehAEQbTJ.AEQbTJ() <= 0) {
        }
        if (!z) {
            i |= 2;
        }
        if (!z) {
        }
        c7142aeJ = new C7142aeJ(i);
        C7139aeG c7139aeGOLrzqt2 = C7139aeG.OLrzqt(i);
        C7135aeC c7135aeC2 = new C7135aeC();
        c7135aeC2.EZpvd = currencyResolve;
        c7135aeC2.OLrzqt = decimalFormatSymbols;
        c7135aeC2.copydefault = c7139aeGOLrzqt2;
        c7135aeC2.AEQbTJ = uLocale;
        c7135aeC2.KWHzl = i;
        C7133aeA.OLrzqt(interfaceC7102adWOLrzqt, c7142aeJ, c7135aeC2, c7139aeGOLrzqt2, i);
        if (!z) {
            c7142aeJ.OLrzqt(C7183aey.KWHzl(currencyResolve, decimalFormatSymbols, i));
        }
        parseMode = DecimalFormatProperties.ParseMode.LENIENT;
        if (parseMode2 == parseMode) {
            c7142aeJ.OLrzqt(C7148aeP.AEQbTJ(decimalFormatSymbols));
        }
        if (parseMode2 == parseMode) {
            c7142aeJ.OLrzqt(C7146aeN.AEQbTJ(decimalFormatSymbols));
        }
        if (parseMode2 == parseMode) {
        }
        c7142aeJ.OLrzqt(C7144aeL.copydefault(decimalFormatSymbols, i));
        c7142aeJ.OLrzqt(C7140aeH.OLrzqt(decimalFormatSymbols));
        padString = decimalFormatProperties.getPadString();
        if (padString != null) {
            c7142aeJ.OLrzqt(C7143aeK.copydefault(padString));
        }
        c7142aeJ.OLrzqt(c7139aeGOLrzqt2);
        c7142aeJ.OLrzqt(C7136aeD.OLrzqt(decimalFormatSymbols, c7166aehAEQbTJ, i));
        if (decimalFormatProperties.getParseNoExponent()) {
            c7142aeJ.OLrzqt(C7151aeS.KWHzl(decimalFormatSymbols, c7166aehAEQbTJ));
        }
        c7142aeJ.OLrzqt(new C7152aeT());
        if (parseMode2 != parseMode) {
        }
        if (z) {
        }
        if (decimalFormatProperties.getDecimalPatternMatchRequired()) {
        }
        c7235afxOLrzqt = C7180aev.OLrzqt(decimalFormatProperties);
        if (c7235afxOLrzqt != null) {
        }
        c7142aeJ.EZpvd();
        return c7142aeJ;
    }

    public C7142aeJ(int i) {
        this.copydefault = i;
    }

    public void OLrzqt(InterfaceC7141aeI interfaceC7141aeI) {
        this.AEQbTJ.add(interfaceC7141aeI);
    }

    public void OLrzqt(java.util.Collection<? extends InterfaceC7141aeI> collection) {
        this.AEQbTJ.addAll(collection);
    }

    public void AEQbTJ(java.lang.String str, int i, boolean z, C7145aeM c7145aeM) {
        C7031acE c7031acE = new C7031acE(str, (this.copydefault & 1) != 0);
        c7031acE.EZpvd(i);
        if (z) {
            KWHzl(c7031acE, c7145aeM);
        } else if ((this.copydefault & 16384) != 0) {
            copydefault(c7031acE, c7145aeM, 1);
        } else {
            copydefault(c7031acE, c7145aeM, -100);
        }
        java.util.Iterator<InterfaceC7141aeI> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            it.next().KWHzl(c7145aeM);
        }
        c7145aeM.KWHzl();
    }

    public final void KWHzl(C7031acE c7031acE, C7145aeM c7145aeM) {
        while (true) {
            for (int i = 0; i < this.AEQbTJ.size() && c7031acE.length() != 0; i++) {
                InterfaceC7141aeI interfaceC7141aeI = this.AEQbTJ.get(i);
                if (interfaceC7141aeI.OLrzqt(c7031acE)) {
                    int iAEQbTJ = c7031acE.AEQbTJ();
                    interfaceC7141aeI.AEQbTJ(c7031acE, c7145aeM);
                    if (c7031acE.AEQbTJ() != iAEQbTJ) {
                        break;
                    }
                }
            }
            return;
        }
    }

    public final void copydefault(C7031acE c7031acE, C7145aeM c7145aeM, int i) {
        if (c7031acE.length() == 0 || i == 0) {
            return;
        }
        C7145aeM c7145aeM2 = new C7145aeM();
        c7145aeM2.EZpvd(c7145aeM);
        C7145aeM c7145aeM3 = new C7145aeM();
        int iAEQbTJ = c7031acE.AEQbTJ();
        for (int i2 = 0; i2 < this.AEQbTJ.size(); i2++) {
            InterfaceC7141aeI interfaceC7141aeI = this.AEQbTJ.get(i2);
            if (interfaceC7141aeI.OLrzqt(c7031acE)) {
                int iCharCount = 0;
                while (iCharCount < c7031acE.length()) {
                    iCharCount += java.lang.Character.charCount(c7031acE.KWHzl(iCharCount));
                    c7145aeM3.EZpvd(c7145aeM2);
                    c7031acE.OLrzqt(iCharCount);
                    boolean zAEQbTJ = interfaceC7141aeI.AEQbTJ(c7031acE, c7145aeM3);
                    c7031acE.OLrzqt();
                    if (c7031acE.AEQbTJ() - iAEQbTJ == iCharCount) {
                        copydefault(c7031acE, c7145aeM3, i + 1);
                        if (c7145aeM3.copydefault(c7145aeM)) {
                            c7145aeM.EZpvd(c7145aeM3);
                        }
                    }
                    c7031acE.AEQbTJ(iAEQbTJ);
                    if (!zAEQbTJ) {
                        break;
                    }
                }
            }
        }
    }

    public java.lang.String toString() {
        return "<NumberParserImpl matchers=" + this.AEQbTJ.toString() + ">";
    }
}
