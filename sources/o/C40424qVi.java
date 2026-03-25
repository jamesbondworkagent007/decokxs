package o;

import com.okinc.market.ticker.repo.PairTickersRepository;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.qVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40424qVi implements InterfaceC58162ywA<PairTickersRepository> {
    public final InterfaceC58164ywC<qUR> AEQbTJ;
    public final InterfaceC58164ywC<C40414qUz> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<qUB> OLrzqt;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public PairTickersRepository get() {
        PairTickersRepository pairTickersRepositoryKWHzl = KWHzl(this.copydefault.get(), this.KWHzl.get(), this.EZpvd.get(), this.OLrzqt.get());
        C40422qVg.OLrzqt(pairTickersRepositoryKWHzl, this.AEQbTJ.get());
        return pairTickersRepositoryKWHzl;
    }

    public static PairTickersRepository KWHzl(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C40414qUz c40414qUz, qUB qub) {
        return new PairTickersRepository(coroutineDispatcher, coroutineDispatcher2, c40414qUz, qub);
    }
}
