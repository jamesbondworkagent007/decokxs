package o;

import com.okinc.market.ticker.repo.MarkPriceTickersRepository;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.qVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40417qVb implements InterfaceC58162ywA<MarkPriceTickersRepository> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC46557tYt> AYXKKw;
    public final InterfaceC58164ywC<qUB> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<qUQ> OLrzqt;
    public final InterfaceC58164ywC<C40414qUz> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public MarkPriceTickersRepository get() {
        MarkPriceTickersRepository markPriceTickersRepositoryEZpvd = EZpvd(this.KWHzl.get(), this.AEQbTJ.get(), this.AYXKKw.get(), this.copydefault.get(), this.EZpvd.get());
        C40420qVe.copydefault(markPriceTickersRepositoryEZpvd, this.OLrzqt.get());
        return markPriceTickersRepositoryEZpvd;
    }

    public static MarkPriceTickersRepository EZpvd(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, InterfaceC46557tYt interfaceC46557tYt, C40414qUz c40414qUz, qUB qub) {
        return new MarkPriceTickersRepository(coroutineDispatcher, coroutineDispatcher2, interfaceC46557tYt, c40414qUz, qub);
    }
}
