package o;

import com.okinc.business.invest_biz.di.FeatureFlagModule;

/* JADX INFO: loaded from: classes6.dex */
public final class iNA implements InterfaceC58162ywA<iFC> {
    public final InterfaceC58164ywC<iFB> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public iFC get() {
        return KWHzl(this.EZpvd.get());
    }

    public static iFC KWHzl(iFB ifb) {
        return (iFC) C58165ywD.KWHzl(FeatureFlagModule.EZpvd.copydefault(ifb));
    }
}
