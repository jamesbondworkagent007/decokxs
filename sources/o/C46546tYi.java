package o;

import com.okinc.preference.hilt.PreferenceHiltModule;

/* JADX INFO: renamed from: o.tYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46546tYi implements InterfaceC58162ywA<C4718Bol> {
    public final InterfaceC58164ywC<pTU> EZpvd;
    public final PreferenceHiltModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C4718Bol get() {
        return OLrzqt(this.OLrzqt, this.EZpvd.get());
    }

    public static C4718Bol OLrzqt(PreferenceHiltModule preferenceHiltModule, pTU ptu) {
        return (C4718Bol) C58165ywD.KWHzl(preferenceHiltModule.copydefault(ptu));
    }
}
