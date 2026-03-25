package o;

import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.AddressProfileActivitiesUseCase$getAddressProfileActivitiesList$1;
import com.okinc.business.defi.wallet.home.bean.WalletAddressActivityInfo;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWY {
    public final InterfaceC13914dba AEQbTJ;

    @yCM
    public eWY(@NotNull InterfaceC13914dba interfaceC13914dba) {
        Intrinsics.checkNotNullParameter(interfaceC13914dba, "");
        this.AEQbTJ = interfaceC13914dba;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.Boolean bool, boolean z, @NotNull Continuation<? super Result<WalletAddressActivityInfo>> continuation) throws java.lang.Throwable {
        AddressProfileActivitiesUseCase$getAddressProfileActivitiesList$1 addressProfileActivitiesUseCase$getAddressProfileActivitiesList$1;
        if (continuation instanceof AddressProfileActivitiesUseCase$getAddressProfileActivitiesList$1) {
            addressProfileActivitiesUseCase$getAddressProfileActivitiesList$1 = (AddressProfileActivitiesUseCase$getAddressProfileActivitiesList$1) continuation;
            int i = addressProfileActivitiesUseCase$getAddressProfileActivitiesList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileActivitiesUseCase$getAddressProfileActivitiesList$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileActivitiesUseCase$getAddressProfileActivitiesList$1 = new AddressProfileActivitiesUseCase$getAddressProfileActivitiesList$1(this, continuation);
            }
        }
        AddressProfileActivitiesUseCase$getAddressProfileActivitiesList$1 addressProfileActivitiesUseCase$getAddressProfileActivitiesList$12 = addressProfileActivitiesUseCase$getAddressProfileActivitiesList$1;
        java.lang.Object objCopydefault = addressProfileActivitiesUseCase$getAddressProfileActivitiesList$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = addressProfileActivitiesUseCase$getAddressProfileActivitiesList$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.AEQbTJ;
                addressProfileActivitiesUseCase$getAddressProfileActivitiesList$12.label = 1;
                objCopydefault = interfaceC13914dba.copydefault(str, str2, str3, str4, num, str5, bool, z, addressProfileActivitiesUseCase$getAddressProfileActivitiesList$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return Result.m7377constructorimpl((WalletAddressActivityInfo) ((ResponseData) objCopydefault).getData());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
