package o;

import com.okinc.business.defi.wallet.home.usdgActivity.domain.usecase.CheckUsdgCountryLimitUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18180fdY {
    public final C13934dbu EZpvd;

    @yCM
    public C18180fdY(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        CheckUsdgCountryLimitUseCase$invoke$1 checkUsdgCountryLimitUseCase$invoke$1;
        if (continuation instanceof CheckUsdgCountryLimitUseCase$invoke$1) {
            checkUsdgCountryLimitUseCase$invoke$1 = (CheckUsdgCountryLimitUseCase$invoke$1) continuation;
            int i = checkUsdgCountryLimitUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkUsdgCountryLimitUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkUsdgCountryLimitUseCase$invoke$1 = new CheckUsdgCountryLimitUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = checkUsdgCountryLimitUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkUsdgCountryLimitUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.EZpvd;
        checkUsdgCountryLimitUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = c13934dbu.copydefault(str, checkUsdgCountryLimitUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
