package o;

import com.okinc.business.trade.di.EventTrackModule;

/* JADX INFO: renamed from: o.kPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28124kPu implements InterfaceC58162ywA<InterfaceC30614leV> {
    public final InterfaceC58164ywC<C19700gMb> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC30614leV get() {
        return AEQbTJ(this.OLrzqt.get());
    }

    public static InterfaceC30614leV AEQbTJ(C19700gMb c19700gMb) {
        return (InterfaceC30614leV) C58165ywD.KWHzl(EventTrackModule.OLrzqt.copydefault(c19700gMb));
    }
}
