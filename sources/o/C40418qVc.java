package o;

import com.okinc.market.ticker.repo.IndexTickersRepository;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.qVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40418qVc implements InterfaceC58162ywA<IndexTickersRepository> {
    public final InterfaceC58164ywC<C40414qUz> KWHzl;
    public final InterfaceC58164ywC<qUT> OLrzqt;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public IndexTickersRepository get() {
        IndexTickersRepository indexTickersRepositoryOLrzqt = OLrzqt(this.copydefault.get(), this.KWHzl.get());
        C40416qVa.AEQbTJ(indexTickersRepositoryOLrzqt, this.OLrzqt.get());
        return indexTickersRepositoryOLrzqt;
    }

    public static IndexTickersRepository OLrzqt(CoroutineDispatcher coroutineDispatcher, C40414qUz c40414qUz) {
        return new IndexTickersRepository(coroutineDispatcher, c40414qUz);
    }
}
