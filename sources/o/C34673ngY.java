package o;

import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.ngY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34673ngY implements InterfaceC58162ywA<C38313pUd> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<pTE> AhwBna;
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<android.content.Context> KWHzl;
    public final InterfaceC58164ywC<LanguagesListRepository> OLrzqt;
    public final InterfaceC58164ywC<pTX> copydefault;
    public final InterfaceC58164ywC<C38311pUb> djBIcL;
    public final InterfaceC58164ywC<C38319pUj> gEmmrt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C38313pUd get() {
        return KWHzl(this.KWHzl.get(), this.djBIcL.get(), this.OLrzqt.get(), this.copydefault.get(), this.AhwBna.get(), this.gEmmrt.get(), this.AEQbTJ.get(), this.EZpvd.get());
    }

    public static C38313pUd KWHzl(android.content.Context context, C38311pUb c38311pUb, LanguagesListRepository languagesListRepository, pTX ptx, pTE pte, C38319pUj c38319pUj, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        return (C38313pUd) C58165ywD.KWHzl(LocalizeDIModule.KWHzl.KWHzl(context, c38311pUb, languagesListRepository, ptx, pte, c38319pUj, coroutineDispatcher, coroutineDispatcher2));
    }
}
