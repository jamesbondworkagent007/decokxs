package o;

import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewAddressesUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29506kut {
    public final CoroutineDispatcher AEQbTJ;
    public final jAH KWHzl;
    public final C27634jyr OLrzqt;
    public final InterfaceC29466kuF copydefault;

    @yCM
    public C29506kut(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C27634jyr c27634jyr, @NotNull jAH jah, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC29466kuF;
        this.OLrzqt = c27634jyr;
        this.KWHzl = jah;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super Result<? extends java.util.List<C29468kuH>>> continuation) throws java.lang.Throwable {
        GetSignalOverviewAddressesUseCase$invoke$1 getSignalOverviewAddressesUseCase$invoke$1;
        if (continuation instanceof GetSignalOverviewAddressesUseCase$invoke$1) {
            getSignalOverviewAddressesUseCase$invoke$1 = (GetSignalOverviewAddressesUseCase$invoke$1) continuation;
            int i = getSignalOverviewAddressesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewAddressesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewAddressesUseCase$invoke$1 = new GetSignalOverviewAddressesUseCase$invoke$1(this, continuation);
            }
        }
        GetSignalOverviewAddressesUseCase$invoke$1 getSignalOverviewAddressesUseCase$invoke$12 = getSignalOverviewAddressesUseCase$invoke$1;
        java.lang.Object objWithContext = getSignalOverviewAddressesUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewAddressesUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1 getSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1 = new GetSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1(null, this, str, str2, str3, str4, str6, str5);
            getSignalOverviewAddressesUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalOverviewAddressesUseCase$invokebMdYcbs$$inlined$dexRunCatching$1, getSignalOverviewAddressesUseCase$invoke$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
