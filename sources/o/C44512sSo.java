package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.usecase.phonerelations.GetPhoneRelationGroupsByHashesUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44512sSo {
    public final C44358sMw copydefault;

    @yCM
    public C44512sSo(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.copydefault = c44358sMw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.List<PhoneRelationGroup>> continuation) throws java.lang.Throwable {
        GetPhoneRelationGroupsByHashesUseCase$execute$1 getPhoneRelationGroupsByHashesUseCase$execute$1;
        if (continuation instanceof GetPhoneRelationGroupsByHashesUseCase$execute$1) {
            getPhoneRelationGroupsByHashesUseCase$execute$1 = (GetPhoneRelationGroupsByHashesUseCase$execute$1) continuation;
            int i = getPhoneRelationGroupsByHashesUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPhoneRelationGroupsByHashesUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getPhoneRelationGroupsByHashesUseCase$execute$1 = new GetPhoneRelationGroupsByHashesUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object phoneRelationsByHashes = getPhoneRelationGroupsByHashesUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getPhoneRelationGroupsByHashesUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(phoneRelationsByHashes);
            C44358sMw c44358sMw = this.copydefault;
            getPhoneRelationGroupsByHashesUseCase$execute$1.label = 1;
            phoneRelationsByHashes = c44358sMw.getPhoneRelationsByHashes(set, getPhoneRelationGroupsByHashesUseCase$execute$1);
            if (phoneRelationsByHashes == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(phoneRelationsByHashes);
        }
        return C44523sSz.copydefault((java.util.List) phoneRelationsByHashes);
    }
}
