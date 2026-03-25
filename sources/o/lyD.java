package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.buysell.domain.BuyCryptoListUseCase$getBuyCryptoAndDexListCache$2;
import com.okinc.buysell.domain.BuyCryptoListUseCase$getBuyCryptoList$2;
import com.okinc.buysell.domain.BuyCryptoListUseCase$getBuyCryptoListCache$2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyD {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC31764mDa copydefault;

    @yCM
    public lyD(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = interfaceC31764mDa;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<CryptoListModel, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new BuyCryptoListUseCase$getBuyCryptoList$2(this, null), continuation);
    }

    public static /* synthetic */ java.lang.Object getBuyCryptoListCache$default(lyD lyd, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = RemoteMessageConst.DEFAULT_TTL;
        }
        return lyd.copydefault(i, continuation);
    }

    public final java.lang.Object copydefault(int i, @NotNull Continuation<? super AbstractC43419rot<CryptoListModel, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new BuyCryptoListUseCase$getBuyCryptoListCache$2(this, i, null), continuation);
    }

    public static /* synthetic */ java.lang.Object getBuyCryptoAndDexListCache$default(lyD lyd, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = RemoteMessageConst.DEFAULT_TTL;
        }
        return lyd.AEQbTJ(i, continuation);
    }

    public final java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super AbstractC43419rot<CryptoListModel, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new BuyCryptoListUseCase$getBuyCryptoAndDexListCache$2(this, i, null), continuation);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lyD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
