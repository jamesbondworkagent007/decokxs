package o;

import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.util.MeasureUnit;

/* JADX INFO: renamed from: o.aet, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7178aet implements InterfaceC7171aem {
    public final InterfaceC7171aem AEQbTJ;
    public C7214afc EZpvd;
    public MeasureUnit KWHzl;

    public C7178aet(MeasureUnit measureUnit, MeasureUnit measureUnit2, InterfaceC7171aem interfaceC7171aem) {
        this.KWHzl = measureUnit2;
        this.AEQbTJ = interfaceC7171aem;
        this.EZpvd = new C7214afc(MeasureUnitImpl.EZpvd(measureUnit.getIdentifier()), MeasureUnitImpl.EZpvd(measureUnit2.getIdentifier()), new C7216afe().KWHzl());
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.AEQbTJ.EZpvd(interfaceC7163aee);
        interfaceC7163aee.djBIcL();
        java.util.List<C7254agP> listOLrzqt = this.EZpvd.OLrzqt(interfaceC7163aee.AhwBna(), c7169aekEZpvd.AkhnZx);
        c7169aekEZpvd.DbNXlk = this.KWHzl;
        C7182aex.KWHzl(listOLrzqt, interfaceC7163aee, c7169aekEZpvd);
        return c7169aekEZpvd;
    }
}
