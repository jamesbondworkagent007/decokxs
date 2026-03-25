package o;

import com.okinc.okimcore.usecase.phonerelations.HasPhoneRelationUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44519sSv {
    public final C44358sMw copydefault;

    @yCM
    public C44519sSv(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.copydefault = c44358sMw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        HasPhoneRelationUseCase$execute$1 hasPhoneRelationUseCase$execute$1;
        if (continuation instanceof HasPhoneRelationUseCase$execute$1) {
            hasPhoneRelationUseCase$execute$1 = (HasPhoneRelationUseCase$execute$1) continuation;
            int i = hasPhoneRelationUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hasPhoneRelationUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                hasPhoneRelationUseCase$execute$1 = new HasPhoneRelationUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object phoneRelationsCount = hasPhoneRelationUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = hasPhoneRelationUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(phoneRelationsCount);
            C44358sMw c44358sMw = this.copydefault;
            hasPhoneRelationUseCase$execute$1.label = 1;
            phoneRelationsCount = c44358sMw.getPhoneRelationsCount(hasPhoneRelationUseCase$execute$1);
            if (phoneRelationsCount == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(phoneRelationsCount);
        }
        return C56443yFo.KWHzl(((java.lang.Number) phoneRelationsCount).intValue() != 0);
    }
}
