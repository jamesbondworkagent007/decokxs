package o;

import com.okinc.business.defi.biz.net.bean.AAAddressCheck;
import com.okinc.business.defi.biz.net.bean.AABook;
import com.okinc.business.defi.wallet.connect.AAAddressCheckUseCase$aaAddressCheck$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16035ecN {
    public final C13934dbu OLrzqt;

    public C16035ecN(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<AAAddressCheck>> continuation) {
        AAAddressCheckUseCase$aaAddressCheck$1 aAAddressCheckUseCase$aaAddressCheck$1;
        if (continuation instanceof AAAddressCheckUseCase$aaAddressCheck$1) {
            aAAddressCheckUseCase$aaAddressCheck$1 = (AAAddressCheckUseCase$aaAddressCheck$1) continuation;
            int i = aAAddressCheckUseCase$aaAddressCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aAAddressCheckUseCase$aaAddressCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                aAAddressCheckUseCase$aaAddressCheck$1 = new AAAddressCheckUseCase$aaAddressCheck$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = aAAddressCheckUseCase$aaAddressCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aAAddressCheckUseCase$aaAddressCheck$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C13934dbu c13934dbu = this.OLrzqt;
            aAAddressCheckUseCase$aaAddressCheck$1.L$0 = str;
            aAAddressCheckUseCase$aaAddressCheck$1.label = 1;
            objOLrzqt = c13934dbu.OLrzqt(str, aAAddressCheckUseCase$aaAddressCheck$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) aAAddressCheckUseCase$aaAddressCheck$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            java.lang.Boolean boolIsSmartContract = ((AABook) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).isSmartContract();
            return Result.m7377constructorimpl(new AAAddressCheck(str, boolIsSmartContract != null ? boolIsSmartContract.booleanValue() : false));
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
    }
}
