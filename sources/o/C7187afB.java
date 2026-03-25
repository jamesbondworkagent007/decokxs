package o;

import com.ibm.icu.util.ULocale;

/* JADX INFO: renamed from: o.afB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7187afB extends AbstractC7229afr<C7187afB> {
    public C7187afB() {
        super(null, 14, new java.lang.Long(3L));
    }

    public C7187afB(AbstractC7229afr<?> abstractC7229afr, int i, java.lang.Object obj) {
        super(abstractC7229afr, i, obj);
    }

    public C7232afu copydefault(java.util.Locale locale) {
        return new C7232afu(this, 1, ULocale.forLocale(locale));
    }

    public C7232afu EZpvd(ULocale uLocale) {
        return new C7232afu(this, 1, uLocale);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(ILjava/lang/Object;)Lo/afr; */
    @Override // o.AbstractC7229afr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7187afB AEQbTJ(int i, java.lang.Object obj) {
        return new C7187afB(this, i, obj);
    }
}
