package o;

import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.efU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC16201efU {
    java.lang.Object EZpvd(long j, boolean z, @NotNull Continuation<? super ResponseData<java.util.List<CoinProtocol>>> continuation);

    Flow<java.util.List<C13924dbk>> OLrzqt();
}
