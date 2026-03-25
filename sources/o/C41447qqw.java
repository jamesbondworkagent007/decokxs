package o;

import com.okinc.market.quotation.data.repository.PeriodTickersRepository;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.qqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41447qqw implements InterfaceC58162ywA<PeriodTickersRepository> {
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<C41446qqv> KWHzl;
    public final InterfaceC58164ywC<InterfaceC41441qqq> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public PeriodTickersRepository get() {
        PeriodTickersRepository periodTickersRepositoryCopydefault = copydefault(this.EZpvd.get(), this.OLrzqt.get());
        C41399qqA.EZpvd(periodTickersRepositoryCopydefault, this.KWHzl.get());
        return periodTickersRepositoryCopydefault;
    }

    public static PeriodTickersRepository copydefault(CoroutineDispatcher coroutineDispatcher, InterfaceC41441qqq interfaceC41441qqq) {
        return new PeriodTickersRepository(coroutineDispatcher, interfaceC41441qqq);
    }
}
