package o;

import com.okinc.market.ticker.repo.CupTickersRepository;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes9.dex */
public final class qUZ implements InterfaceC58162ywA<CupTickersRepository> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<qUS> KWHzl;
    public final InterfaceC58164ywC<C40414qUz> OLrzqt;
    public final InterfaceC58164ywC<qUB> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CupTickersRepository get() {
        CupTickersRepository cupTickersRepositoryKWHzl = KWHzl(this.EZpvd.get(), this.AEQbTJ.get(), this.OLrzqt.get(), this.copydefault.get());
        qUW.EZpvd(cupTickersRepositoryKWHzl, this.KWHzl.get());
        return cupTickersRepositoryKWHzl;
    }

    public static CupTickersRepository KWHzl(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C40414qUz c40414qUz, qUB qub) {
        return new CupTickersRepository(coroutineDispatcher, coroutineDispatcher2, c40414qUz, qub);
    }
}
