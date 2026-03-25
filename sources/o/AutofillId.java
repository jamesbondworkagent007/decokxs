package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.endpoints.internal.EndpointResolverAdapter$resolve$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillId implements BD {
    public final WindowInsets.ActionBar copydefault;

    public AutofillId(@NotNull WindowInsets.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
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
            CompletionInfo completionInfoOLrzqt = AutofillValue.OLrzqt(this.copydefault, bx);
            CorrectionInfo correctionInfoAhwBna = this.copydefault.AhwBna();
            endpointResolverAdapter$resolve$1.label = 1;
            objResolveEndpoint = correctionInfoAhwBna.resolveEndpoint(completionInfoOLrzqt, endpointResolverAdapter$resolve$1);
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
