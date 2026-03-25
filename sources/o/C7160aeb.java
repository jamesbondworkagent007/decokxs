package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.text.CurrencyPluralInfo;

/* JADX INFO: renamed from: o.aeb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7160aeb implements InterfaceC7102adW {
    public final C7181aew[] copydefault = new C7181aew[StandardPlural.COUNT];

    public C7160aeb(CurrencyPluralInfo currencyPluralInfo, DecimalFormatProperties decimalFormatProperties) {
        DecimalFormatProperties decimalFormatProperties2 = new DecimalFormatProperties();
        decimalFormatProperties2.copyFrom(decimalFormatProperties);
        for (StandardPlural standardPlural : StandardPlural.VALUES) {
            C7173aeo.copydefault(currencyPluralInfo.getCurrencyPluralPattern(standardPlural.getKeyword()), decimalFormatProperties2);
            this.copydefault[standardPlural.ordinal()] = new C7181aew(decimalFormatProperties2);
        }
    }

    @Override // o.InterfaceC7102adW
    public char OLrzqt(int i, int i2) {
        return this.copydefault[i & 255].OLrzqt(i, i2);
    }

    @Override // o.InterfaceC7102adW
    public int OLrzqt(int i) {
        return this.copydefault[i & 255].OLrzqt(i);
    }

    @Override // o.InterfaceC7102adW
    public java.lang.String KWHzl(int i) {
        return this.copydefault[i & 255].KWHzl(i);
    }

    @Override // o.InterfaceC7102adW
    public boolean AEQbTJ() {
        return this.copydefault[StandardPlural.OTHER.ordinal()].AEQbTJ();
    }

    @Override // o.InterfaceC7102adW
    public boolean OLrzqt() {
        return this.copydefault[StandardPlural.OTHER.ordinal()].OLrzqt();
    }

    @Override // o.InterfaceC7102adW
    public boolean copydefault() {
        return this.copydefault[StandardPlural.OTHER.ordinal()].copydefault();
    }

    @Override // o.InterfaceC7102adW
    public boolean KWHzl() {
        return this.copydefault[StandardPlural.OTHER.ordinal()].KWHzl();
    }

    @Override // o.InterfaceC7102adW
    public boolean copydefault(int i) {
        return this.copydefault[StandardPlural.OTHER.ordinal()].copydefault(i);
    }

    @Override // o.InterfaceC7102adW
    public boolean EZpvd() {
        return this.copydefault[StandardPlural.OTHER.ordinal()].EZpvd();
    }
}
