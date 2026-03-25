package o;

import aws.sdk.kotlin.services.cognitoidentity.endpoints.internal.EndpointResolverAdapter$resolve$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.Character;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Cloneable implements BD {
    public final Character.Activity EZpvd;

    public Cloneable(@NotNull Character.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull BX bx, @NotNull Continuation<? super C57631ym> continuation) throws java.lang.Throwable {
        EndpointResolverAdapter$resolve$1 endpointResolverAdapter$resolve$1;
        if (continuation instanceof EndpointResolverAdapter$resolve$1) {
            endpointResolverAdapter$resolve$1 = (EndpointResolverAdapter$resolve$1) continuation;
            int i = endpointResolverAdapter$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                endpointResolverAdapter$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                endpointResolverAdapter$resolve$1 = new EndpointResolverAdapter$resolve$1(this, continuation);
            }
        }
        java.lang.Object objResolveEndpoint = endpointResolverAdapter$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = endpointResolverAdapter$resolve$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objResolveEndpoint);
            ClassCastException classCastExceptionKWHzl = ClassLoader.KWHzl(this.EZpvd, bx);
            UnicodeScript unicodeScriptGEmmrt = this.EZpvd.gEmmrt();
            endpointResolverAdapter$resolve$1.label = 1;
            objResolveEndpoint = unicodeScriptGEmmrt.resolveEndpoint(classCastExceptionKWHzl, endpointResolverAdapter$resolve$1);
            if (objResolveEndpoint == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objResolveEndpoint);
        }
        return (C57631ym) objResolveEndpoint;
    }
}
