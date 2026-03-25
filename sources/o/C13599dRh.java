package o;

import com.okinc.business.defi.jwt.AddressLoginRequest;
import com.okinc.business.defi.jwt.AddressLoginResponse;
import com.okinc.business.defi.jwt.domain.AddressLoginUseCase$login$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13599dRh {
    public final C13594dRc OLrzqt;
    public final InterfaceC13914dba copydefault;

    @yCM
    public C13599dRh(@NotNull InterfaceC13914dba interfaceC13914dba, @NotNull C13594dRc c13594dRc) {
        Intrinsics.checkNotNullParameter(interfaceC13914dba, "");
        Intrinsics.checkNotNullParameter(c13594dRc, "");
        this.copydefault = interfaceC13914dba;
        this.OLrzqt = c13594dRc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(AddressLoginRequest addressLoginRequest, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        AddressLoginUseCase$login$1 addressLoginUseCase$login$1;
        C13599dRh c13599dRh;
        if (continuation instanceof AddressLoginUseCase$login$1) {
            addressLoginUseCase$login$1 = (AddressLoginUseCase$login$1) continuation;
            int i = addressLoginUseCase$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressLoginUseCase$login$1.label = i - Integer.MIN_VALUE;
            } else {
                addressLoginUseCase$login$1 = new AddressLoginUseCase$login$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = addressLoginUseCase$login$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressLoginUseCase$login$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                InterfaceC13914dba interfaceC13914dba = this.copydefault;
                addressLoginUseCase$login$1.L$0 = this;
                addressLoginUseCase$login$1.L$1 = addressLoginRequest;
                addressLoginUseCase$login$1.label = 1;
                objOLrzqt = interfaceC13914dba.OLrzqt(addressLoginRequest, addressLoginUseCase$login$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c13599dRh = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                addressLoginRequest = (AddressLoginRequest) addressLoginUseCase$login$1.L$1;
                c13599dRh = (C13599dRh) addressLoginUseCase$login$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            AddressLoginResponse addressLoginResponse = (AddressLoginResponse) ((ResponseData) objOLrzqt).getData();
            java.lang.Boolean boolKWHzl = null;
            if (addressLoginResponse != null) {
                C13594dRc c13594dRc = c13599dRh.OLrzqt;
                java.lang.String strKWHzl = addressLoginRequest != null ? addressLoginRequest.KWHzl() : null;
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                boolKWHzl = C56443yFo.KWHzl(c13594dRc.EZpvd(strKWHzl, addressLoginResponse));
            }
            return Result.m7377constructorimpl(boolKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
