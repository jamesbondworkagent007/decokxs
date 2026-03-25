package o;

import com.okinc.business.market.features.meme.token_detail_sheet.domain.repository.TokenDetailModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.khM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28784khM implements InterfaceC58162ywA<InterfaceC28780khI> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC28780khI get() {
        return KWHzl(this.AEQbTJ.get(), this.KWHzl.get());
    }

    public static InterfaceC28780khI KWHzl(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28780khI) C58165ywD.KWHzl(TokenDetailModule.copydefault.OLrzqt(interfaceC27595jyE, coroutineDispatcher));
    }
}
