package o;

import com.okinc.business.market.features.smart_money.signal.domain.GetSmartMoneyAddressesUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29510kux {
    public final C27634jyr AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC29466kuF KWHzl;
    public final C29470kuJ OLrzqt;
    public final jAH copydefault;

    @yCM
    public C29510kux(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29470kuJ c29470kuJ, @NotNull C27634jyr c27634jyr, @NotNull jAH jah, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29470kuJ, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC29466kuF;
        this.OLrzqt = c29470kuJ;
        this.AEQbTJ = c27634jyr;
        this.copydefault = jah;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super Result<? extends java.util.List<C29626kxG>>> continuation) {
        GetSmartMoneyAddressesUseCase$invoke$1 getSmartMoneyAddressesUseCase$invoke$1;
        if (continuation instanceof GetSmartMoneyAddressesUseCase$invoke$1) {
            getSmartMoneyAddressesUseCase$invoke$1 = (GetSmartMoneyAddressesUseCase$invoke$1) continuation;
            int i = getSmartMoneyAddressesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSmartMoneyAddressesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSmartMoneyAddressesUseCase$invoke$1 = new GetSmartMoneyAddressesUseCase$invoke$1(this, continuation);
            }
        }
        GetSmartMoneyAddressesUseCase$invoke$1 getSmartMoneyAddressesUseCase$invoke$12 = getSmartMoneyAddressesUseCase$invoke$1;
        java.lang.Object objWithContext = getSmartMoneyAddressesUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSmartMoneyAddressesUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 getSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1 = new GetSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1(null, str, str2, str3, str4, str5, this);
            getSmartMoneyAddressesUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSmartMoneyAddressesUseCase$invokehUnOzRk$$inlined$dexRunCatching$1, getSmartMoneyAddressesUseCase$invoke$12);
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
