package o;

import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;

/* JADX INFO: renamed from: o.ael, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7170ael implements InterfaceC7171aem {
    public java.util.List<StateListAnimator> AEQbTJ;
    public final InterfaceC7171aem EZpvd;
    public java.util.List<MeasureUnit> KWHzl;

    /* JADX INFO: renamed from: o.ael$StateListAnimator */
    public interface StateListAnimator {
        C7169aek OLrzqt(InterfaceC7163aee interfaceC7163aee, C7169aek c7169aek);
    }

    public C7170ael(InterfaceC7171aem interfaceC7171aem) {
        this.EZpvd = interfaceC7171aem;
    }

    public static C7170ael OLrzqt(ULocale uLocale, java.util.List<MeasureUnit> list, NumberFormatter.UnitWidth unitWidth, PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        C7170ael c7170ael = new C7170ael(interfaceC7171aem);
        c7170ael.KWHzl = new java.util.ArrayList();
        c7170ael.AEQbTJ = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            MeasureUnit measureUnit = list.get(i);
            c7170ael.KWHzl.add(measureUnit);
            if (measureUnit.getComplexity() == MeasureUnit.Complexity.MIXED) {
                c7170ael.AEQbTJ.add(C7172aen.KWHzl(uLocale, measureUnit, unitWidth, pluralRules, null));
            } else {
                c7170ael.AEQbTJ.add(C7165aeg.copydefault(uLocale, measureUnit, C7257agS.AEQbTJ, unitWidth, pluralRules, null));
            }
        }
        return c7170ael;
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.EZpvd.EZpvd(interfaceC7163aee);
        for (int i = 0; i < this.AEQbTJ.size(); i++) {
            if (this.KWHzl.get(i).equals(c7169aekEZpvd.DbNXlk)) {
                return this.AEQbTJ.get(i).OLrzqt(interfaceC7163aee, c7169aekEZpvd);
            }
        }
        throw new java.lang.AssertionError(" We shouldn't receive any outputUnit for which we haven't already got a LongNameHandler");
    }
}
