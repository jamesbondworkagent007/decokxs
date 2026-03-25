package o;

import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import java.math.BigDecimal;
import o.C7222afk;

/* JADX INFO: renamed from: o.aex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7182aex implements InterfaceC7171aem {
    public final InterfaceC7171aem EZpvd;
    public C7222afk OLrzqt;

    public C7182aex(ULocale uLocale, MeasureUnit measureUnit, java.lang.String str, InterfaceC7171aem interfaceC7171aem) {
        this.EZpvd = interfaceC7171aem;
        this.OLrzqt = new C7222afk(MeasureUnitImpl.EZpvd(measureUnit.getIdentifier()), uLocale.getCountry(), str);
    }

    public static void KWHzl(java.util.List<C7254agP> list, InterfaceC7163aee interfaceC7163aee, C7169aek c7169aek) {
        c7169aek.gEmmrt = new java.util.ArrayList();
        if (list.size() > 1) {
            int size = list.size();
            for (int i = 0; i < size - 1; i++) {
                c7169aek.gEmmrt.add(list.get(i));
            }
        }
        interfaceC7163aee.AEQbTJ((BigDecimal) list.get(list.size() - 1).OLrzqt());
    }

    public java.util.List<MeasureUnit> EZpvd() {
        return this.OLrzqt.EZpvd();
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.EZpvd.EZpvd(interfaceC7163aee);
        interfaceC7163aee.djBIcL();
        C7222afk.Application applicationEZpvd = this.OLrzqt.EZpvd(interfaceC7163aee.AhwBna(), c7169aekEZpvd);
        java.util.List<C7254agP> list = applicationEZpvd.AEQbTJ;
        c7169aekEZpvd.DbNXlk = applicationEZpvd.EZpvd.AEQbTJ();
        KWHzl(list, interfaceC7163aee, c7169aekEZpvd);
        return c7169aekEZpvd;
    }
}
