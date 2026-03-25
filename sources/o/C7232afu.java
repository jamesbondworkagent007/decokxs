package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.LocalizedNumberFormatterAsFormat;
import java.text.Format;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: renamed from: o.afu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7232afu extends AbstractC7229afr<C7232afu> {
    public static final AtomicLongFieldUpdater<C7232afu> EZpvd = AtomicLongFieldUpdater.newUpdater(C7232afu.class, "AEQbTJ");
    public volatile long AEQbTJ;
    public volatile C7231aft KWHzl;

    public C7232afu(AbstractC7229afr<?> abstractC7229afr, int i, java.lang.Object obj) {
        super(abstractC7229afr, i, obj);
    }

    public C7225afn KWHzl(double d) {
        return OLrzqt(new C7167aei(d));
    }

    public C7225afn EZpvd(java.lang.Number number) {
        return OLrzqt(new C7167aei(number));
    }

    public Format OLrzqt() {
        return new LocalizedNumberFormatterAsFormat(this, AEQbTJ().copydefault);
    }

    public final C7225afn OLrzqt(InterfaceC7163aee interfaceC7163aee) {
        C7020abU c7020abU = new C7020abU();
        return new C7225afn(c7020abU, interfaceC7163aee, KWHzl(interfaceC7163aee, c7020abU).DbNXlk);
    }

    @java.lang.Deprecated
    public C7169aek KWHzl(InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU) {
        if (KWHzl()) {
            return this.KWHzl.OLrzqt(interfaceC7163aee, c7020abU);
        }
        return C7231aft.AEQbTJ(AEQbTJ(), interfaceC7163aee, c7020abU);
    }

    @java.lang.Deprecated
    public java.lang.String EZpvd(boolean z, boolean z2) {
        int iCopydefault;
        C7020abU c7020abU = new C7020abU();
        byte b = (byte) (z2 ? -1 : 1);
        StandardPlural standardPlural = StandardPlural.OTHER;
        if (KWHzl()) {
            iCopydefault = this.KWHzl.KWHzl(b, standardPlural, c7020abU);
        } else {
            iCopydefault = C7231aft.copydefault(AEQbTJ(), b, standardPlural, c7020abU);
        }
        if (z) {
            return c7020abU.subSequence(0, iCopydefault).toString();
        }
        return c7020abU.subSequence(iCopydefault, c7020abU.length()).toString();
    }

    public final boolean KWHzl() {
        C7168aej c7168aejAEQbTJ = AEQbTJ();
        if (EZpvd.incrementAndGet(this) != c7168aejAEQbTJ.values.longValue()) {
            return this.KWHzl != null;
        }
        this.KWHzl = new C7231aft(c7168aejAEQbTJ);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(ILjava/lang/Object;)Lo/afr; */
    @Override // o.AbstractC7229afr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7232afu AEQbTJ(int i, java.lang.Object obj) {
        return new C7232afu(this, i, obj);
    }
}
