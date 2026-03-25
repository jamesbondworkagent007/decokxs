package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.domain.usecase.QueryAddressRegisterStatusUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18181fdZ {
    public final C18174fdS AEQbTJ;

    @yCM
    public C18181fdZ(@NotNull C18174fdS c18174fdS) {
        Intrinsics.checkNotNullParameter(c18174fdS, "");
        this.AEQbTJ = c18174fdS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C18236feb c18236feb, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        QueryAddressRegisterStatusUseCase$invoke$1 queryAddressRegisterStatusUseCase$invoke$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof QueryAddressRegisterStatusUseCase$invoke$1) {
            queryAddressRegisterStatusUseCase$invoke$1 = (QueryAddressRegisterStatusUseCase$invoke$1) continuation;
            int i = queryAddressRegisterStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                queryAddressRegisterStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                queryAddressRegisterStatusUseCase$invoke$1 = new QueryAddressRegisterStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = queryAddressRegisterStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = queryAddressRegisterStatusUseCase$invoke$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C18174fdS c18174fdS = this.AEQbTJ;
            long jKWHzl = c18236feb.KWHzl();
            java.util.List<AddressRegisterBean> listOLrzqt = c18236feb.OLrzqt();
            queryAddressRegisterStatusUseCase$invoke$1.label = 1;
            objOLrzqt = c18174fdS.OLrzqt(jKWHzl, listOLrzqt, queryAddressRegisterStatusUseCase$invoke$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            Result.Application application = Result.Companion;
            java.util.List<C18178fdW> list = (java.util.List) objOLrzqt;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                for (C18178fdW c18178fdW : list) {
                    if (c18178fdW.OLrzqt() == AddressRegisterStatus.STATUS_UNACTIVATED || c18178fdW.OLrzqt() == AddressRegisterStatus.STATUS_DEACTIVATED) {
                        z = false;
                        break;
                    }
                }
            }
            objOLrzqt = C56443yFo.KWHzl(z);
        }
        return Result.m7377constructorimpl(objOLrzqt);
    }
}
