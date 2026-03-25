package o;

import aws.sdk.kotlin.runtime.config.useragent.ResolveUserAgentKt$resolveUserAgentAppId$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class OptionalDataException {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        ResolveUserAgentKt$resolveUserAgentAppId$1 resolveUserAgentKt$resolveUserAgentAppId$1;
        if (continuation instanceof ResolveUserAgentKt$resolveUserAgentAppId$1) {
            resolveUserAgentKt$resolveUserAgentAppId$1 = (ResolveUserAgentKt$resolveUserAgentAppId$1) continuation;
            int i = resolveUserAgentKt$resolveUserAgentAppId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolveUserAgentKt$resolveUserAgentAppId$1.label = i - Integer.MIN_VALUE;
            } else {
                resolveUserAgentKt$resolveUserAgentAppId$1 = new ResolveUserAgentKt$resolveUserAgentAppId$1(continuation);
            }
        }
        java.lang.Object objKWHzl = resolveUserAgentKt$resolveUserAgentAppId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolveUserAgentKt$resolveUserAgentAppId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.String str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.EZpvd(), hl);
            if (str != null) {
                return str;
            }
            resolveUserAgentKt$resolveUserAgentAppId$1.label = 1;
            objKWHzl = hh.KWHzl(resolveUserAgentKt$resolveUserAgentAppId$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ObjectInputValidation.gEmmrt((ObjectStreamField) objKWHzl);
    }

    public static /* synthetic */ java.lang.Object resolveUserAgentAppId$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        return EZpvd(hl, hh, continuation);
    }
}
