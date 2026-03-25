package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.usecase.phonerelations.GetPhoneRelationGroupsUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44513sSp {
    public final C44358sMw copydefault;

    @yCM
    public C44513sSp(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.copydefault = c44358sMw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<PhoneRelationGroup>> continuation) throws java.lang.Exception {
        GetPhoneRelationGroupsUseCase$execute$1 getPhoneRelationGroupsUseCase$execute$1;
        if (continuation instanceof GetPhoneRelationGroupsUseCase$execute$1) {
            getPhoneRelationGroupsUseCase$execute$1 = (GetPhoneRelationGroupsUseCase$execute$1) continuation;
            int i = getPhoneRelationGroupsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPhoneRelationGroupsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getPhoneRelationGroupsUseCase$execute$1 = new GetPhoneRelationGroupsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object phoneRelations = getPhoneRelationGroupsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getPhoneRelationGroupsUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(phoneRelations);
            C44358sMw c44358sMw = this.copydefault;
            getPhoneRelationGroupsUseCase$execute$1.label = 1;
            phoneRelations = c44358sMw.getPhoneRelations(getPhoneRelationGroupsUseCase$execute$1);
            if (phoneRelations == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(phoneRelations);
        }
        return C44523sSz.copydefault((java.util.List) phoneRelations);
    }
}
