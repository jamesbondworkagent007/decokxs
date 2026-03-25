package o;

import com.okinc.business.defi.biz.net.bean.AddressCheckRes;
import com.okinc.business.defi.wallet.connect.AddressCheckUseCase$addressCheck$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16032ecK {
    public final C13934dbu KWHzl;
    public final C10948byA copydefault;

    public C16032ecK(@NotNull C13934dbu c13934dbu, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.KWHzl = c13934dbu;
        this.copydefault = c10948byA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<AddressCheckRes>> continuation) {
        AddressCheckUseCase$addressCheck$1 addressCheckUseCase$addressCheck$1;
        java.util.List<java.lang.Long> listEZpvd;
        if (continuation instanceof AddressCheckUseCase$addressCheck$1) {
            addressCheckUseCase$addressCheck$1 = (AddressCheckUseCase$addressCheck$1) continuation;
            int i = addressCheckUseCase$addressCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressCheckUseCase$addressCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                addressCheckUseCase$addressCheck$1 = new AddressCheckUseCase$addressCheck$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = addressCheckUseCase$addressCheck$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = addressCheckUseCase$addressCheck$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C10854bwM c10854bwMKWHzl = this.copydefault.KWHzl(j);
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ()) {
                java.util.List<C10854bwM> listDbNXlk = this.copydefault.DbNXlk();
                listEZpvd = new java.util.ArrayList<>(C56403yEb.AYXKKw(listDbNXlk, 10));
                java.util.Iterator<T> it = listDbNXlk.iterator();
                while (it.hasNext()) {
                    listEZpvd.add(C56443yFo.KWHzl(((C10854bwM) it.next()).AhwBna()));
                }
            } else {
                listEZpvd = C56402yEa.EZpvd(C56443yFo.KWHzl(j));
            }
            C13934dbu c13934dbu = this.KWHzl;
            addressCheckUseCase$addressCheck$1.L$0 = str;
            addressCheckUseCase$addressCheck$1.J$0 = j;
            addressCheckUseCase$addressCheck$1.label = 1;
            objCopydefault = c13934dbu.copydefault(str, listEZpvd, addressCheckUseCase$addressCheck$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = addressCheckUseCase$addressCheck$1.J$0;
            str = (java.lang.String) addressCheckUseCase$addressCheck$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(new AddressCheckRes(str, j, true));
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
    }
}
