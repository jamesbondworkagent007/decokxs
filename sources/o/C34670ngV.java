package o;

import com.okinc.di.LocalizeDIModule;
import com.okinc.localization2.KeysLog;

/* JADX INFO: renamed from: o.ngV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34670ngV implements InterfaceC58162ywA<pUA> {
    public final InterfaceC58164ywC<C38311pUb> OLrzqt;
    public final InterfaceC58164ywC<KeysLog> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public pUA get() {
        return AEQbTJ(this.OLrzqt.get(), this.copydefault.get());
    }

    public static pUA AEQbTJ(C38311pUb c38311pUb, KeysLog keysLog) {
        return (pUA) C58165ywD.KWHzl(LocalizeDIModule.KWHzl.AEQbTJ(c38311pUb, keysLog));
    }
}
