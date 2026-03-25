package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.ListFormatter;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import o.C7170ael;

/* JADX INFO: renamed from: o.aen, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7172aen implements InterfaceC7171aem, InterfaceC7176aer, C7170ael.StateListAnimator {
    public ListFormatter AEQbTJ;
    public C7232afu EZpvd;
    public java.util.List<java.lang.String[]> KWHzl;
    public final PluralRules OLrzqt;
    public final InterfaceC7171aem copydefault;

    public C7172aen(PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        this.OLrzqt = pluralRules;
        this.copydefault = interfaceC7171aem;
    }

    public static C7172aen KWHzl(ULocale uLocale, MeasureUnit measureUnit, NumberFormatter.UnitWidth unitWidth, PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        C7172aen c7172aen = new C7172aen(pluralRules, interfaceC7171aem);
        java.util.List<MeasureUnit> listSplitToSingleUnits = measureUnit.splitToSingleUnits();
        c7172aen.KWHzl = new java.util.ArrayList();
        for (int i = 0; i < listSplitToSingleUnits.size(); i++) {
            java.lang.String[] strArr = new java.lang.String[C7165aeg.AEQbTJ];
            C7165aeg.copydefault(uLocale, listSplitToSingleUnits.get(i), unitWidth, strArr);
            c7172aen.KWHzl.add(strArr);
        }
        ListFormatter.Width width = ListFormatter.Width.SHORT;
        if (unitWidth == NumberFormatter.UnitWidth.NARROW) {
            width = ListFormatter.Width.NARROW;
        } else if (unitWidth == NumberFormatter.UnitWidth.FULL_NAME) {
            width = ListFormatter.Width.WIDE;
        }
        c7172aen.AEQbTJ = ListFormatter.KWHzl(uLocale, ListFormatter.Type.UNITS, width);
        c7172aen.EZpvd = NumberFormatter.AEQbTJ(uLocale);
        return c7172aen;
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.copydefault.EZpvd(interfaceC7163aee);
        c7169aekEZpvd.AYXKKw = copydefault(interfaceC7163aee, c7169aekEZpvd);
        return c7169aekEZpvd;
    }

    @Override // o.C7170ael.StateListAnimator
    public C7169aek OLrzqt(InterfaceC7163aee interfaceC7163aee, C7169aek c7169aek) {
        c7169aek.AYXKKw = copydefault(interfaceC7163aee, c7169aek);
        return c7169aek;
    }

    public final Modifier copydefault(InterfaceC7163aee interfaceC7163aee, C7169aek c7169aek) {
        if (c7169aek.gEmmrt.size() == 0) {
            throw new java.lang.UnsupportedOperationException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < c7169aek.gEmmrt.size(); i++) {
            C7167aei c7167aei = new C7167aei(c7169aek.gEmmrt.get(i).OLrzqt());
            if (i > 0 && c7167aei.copydefault()) {
                c7167aei.gEmmrt();
            }
            C7288agx c7288agxOLrzqt = C7288agx.OLrzqt(C7165aeg.copydefault(this.KWHzl.get(i), c7167aei.OLrzqt(this.OLrzqt)), 0, 1);
            C7020abU c7020abU = new C7020abU();
            this.EZpvd.KWHzl(c7167aei, c7020abU);
            arrayList.add(c7288agxOLrzqt.EZpvd(c7020abU.toString()));
        }
        if (interfaceC7163aee.copydefault()) {
            interfaceC7163aee.gEmmrt();
        }
        java.util.List<java.lang.String[]> list = this.KWHzl;
        java.lang.String[] strArr = list.get(list.size() - 1);
        StandardPlural standardPluralEZpvd = C7180aev.EZpvd(c7169aek.AkhnZx, this.OLrzqt, interfaceC7163aee);
        arrayList.add(C7288agx.OLrzqt(C7165aeg.copydefault(strArr, standardPluralEZpvd), 0, 1).EZpvd("{0}"));
        java.lang.String strOLrzqt = C7028acB.OLrzqt(this.AEQbTJ.AEQbTJ(arrayList), new java.lang.StringBuilder(), 0, 1);
        Modifier.TaskDescription taskDescription = new Modifier.TaskDescription();
        taskDescription.EZpvd = this;
        taskDescription.AEQbTJ = Modifier.Signum.POS_ZERO;
        taskDescription.OLrzqt = standardPluralEZpvd;
        return new C7179aeu(strOLrzqt, null, false, taskDescription);
    }
}
