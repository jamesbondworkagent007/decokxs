package o;

import com.okinc.im.di.CoreModule;

/* JADX INFO: renamed from: o.ntz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35370ntz implements InterfaceC58162ywA<InterfaceC44375sNm> {
    public final InterfaceC58164ywC<sHZ> EZpvd;
    public final CoreModule KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC44375sNm get() {
        return EZpvd(this.KWHzl, this.EZpvd.get());
    }

    public static InterfaceC44375sNm EZpvd(CoreModule coreModule, sHZ shz) {
        return (InterfaceC44375sNm) C58165ywD.KWHzl(coreModule.EZpvd(shz));
    }
}
