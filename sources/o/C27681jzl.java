package o;

import com.okinc.business.market.di.JwtRepoModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27681jzl implements InterfaceC58162ywA<C27612jyV> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<C27670jza> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C27612jyV get() {
        return EZpvd(this.OLrzqt.get(), this.AEQbTJ.get());
    }

    public static C27612jyV EZpvd(C27670jza c27670jza, CoroutineDispatcher coroutineDispatcher) {
        return (C27612jyV) C58165ywD.KWHzl(JwtRepoModule.KWHzl.OLrzqt(c27670jza, coroutineDispatcher));
    }
}
