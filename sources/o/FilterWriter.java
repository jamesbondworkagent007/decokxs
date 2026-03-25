package o;

import aws.sdk.kotlin.runtime.config.endpoints.AccountIdEndpointMode;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveAccountIdEndpointMode$1;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveAccountIdEndpointMode$2;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveEndpointUrl$1;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveIgnoreEndpointUrls$1;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveUseDualStack$1;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveUseDualStack$2;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveUseFips$1;
import aws.sdk.kotlin.runtime.config.endpoints.ResolversKt$resolveUseFips$2;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class FilterWriter {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ResolversKt$resolveUseFips$1 resolversKt$resolveUseFips$1;
        if (continuation instanceof ResolversKt$resolveUseFips$1) {
            resolversKt$resolveUseFips$1 = (ResolversKt$resolveUseFips$1) continuation;
            int i = resolversKt$resolveUseFips$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolversKt$resolveUseFips$1.label = i - Integer.MIN_VALUE;
            } else {
                resolversKt$resolveUseFips$1 = new ResolversKt$resolveUseFips$1(continuation);
            }
        }
        java.lang.Object objKWHzl = resolversKt$resolveUseFips$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolversKt$resolveUseFips$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.Boolean bool = (java.lang.Boolean) C59333zf.AEQbTJ(IOException.zsXlph.zsXlph(), hl);
            if (bool != null) {
                return bool;
            }
            resolversKt$resolveUseFips$1.label = 1;
            objKWHzl = hh.KWHzl(resolversKt$resolveUseFips$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ObjectInputValidation.isConnected((ObjectStreamField) objKWHzl);
    }

    public static /* synthetic */ java.lang.Object resolveUseFips$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        if ((i & 2) != 0) {
            hh = HE.AEQbTJ(new ResolversKt$resolveUseFips$2(hl, null));
        }
        return KWHzl(hl, hh, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ResolversKt$resolveUseDualStack$1 resolversKt$resolveUseDualStack$1;
        if (continuation instanceof ResolversKt$resolveUseDualStack$1) {
            resolversKt$resolveUseDualStack$1 = (ResolversKt$resolveUseDualStack$1) continuation;
            int i = resolversKt$resolveUseDualStack$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolversKt$resolveUseDualStack$1.label = i - Integer.MIN_VALUE;
            } else {
                resolversKt$resolveUseDualStack$1 = new ResolversKt$resolveUseDualStack$1(continuation);
            }
        }
        java.lang.Object objKWHzl = resolversKt$resolveUseDualStack$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolversKt$resolveUseDualStack$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.lang.Boolean bool = (java.lang.Boolean) C59333zf.AEQbTJ(IOException.zsXlph.AubY(), hl);
            if (bool != null) {
                return bool;
            }
            resolversKt$resolveUseDualStack$1.label = 1;
            objKWHzl = hh.KWHzl(resolversKt$resolveUseDualStack$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ObjectInputValidation.values((ObjectStreamField) objKWHzl);
    }

    public static /* synthetic */ java.lang.Object resolveUseDualStack$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        if ((i & 2) != 0) {
            hh = HE.AEQbTJ(new ResolversKt$resolveUseDualStack$2(hl, null));
        }
        return EZpvd(hl, hh, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull HH<ObjectOutputStream> hh, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull HL hl, @NotNull Continuation<? super DL> continuation) throws java.lang.Throwable {
        ResolversKt$resolveEndpointUrl$1 resolversKt$resolveEndpointUrl$1;
        java.lang.String str4;
        if (continuation instanceof ResolversKt$resolveEndpointUrl$1) {
            resolversKt$resolveEndpointUrl$1 = (ResolversKt$resolveEndpointUrl$1) continuation;
            int i = resolversKt$resolveEndpointUrl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolversKt$resolveEndpointUrl$1.label = i - Integer.MIN_VALUE;
            } else {
                resolversKt$resolveEndpointUrl$1 = new ResolversKt$resolveEndpointUrl$1(continuation);
            }
        }
        java.lang.Object objOLrzqt = resolversKt$resolveEndpointUrl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolversKt$resolveEndpointUrl$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            resolversKt$resolveEndpointUrl$1.L$0 = hh;
            resolversKt$resolveEndpointUrl$1.L$1 = str;
            resolversKt$resolveEndpointUrl$1.L$2 = str2;
            resolversKt$resolveEndpointUrl$1.L$3 = str3;
            resolversKt$resolveEndpointUrl$1.L$4 = hl;
            resolversKt$resolveEndpointUrl$1.label = 1;
            objOLrzqt = OLrzqt(hl, hh, resolversKt$resolveEndpointUrl$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (java.lang.String) resolversKt$resolveEndpointUrl$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                return ObjectInputStream.KWHzl((ObjectOutputStream) objOLrzqt, str4);
            }
            hl = (HL) resolversKt$resolveEndpointUrl$1.L$4;
            str3 = (java.lang.String) resolversKt$resolveEndpointUrl$1.L$3;
            str2 = (java.lang.String) resolversKt$resolveEndpointUrl$1.L$2;
            str = (java.lang.String) resolversKt$resolveEndpointUrl$1.L$1;
            hh = (HH) resolversKt$resolveEndpointUrl$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        if (((java.lang.Boolean) objOLrzqt).booleanValue()) {
            return null;
        }
        DL dlOLrzqt = Flushable.OLrzqt(IOException.zsXlph, hl, str, str2);
        if (dlOLrzqt != null) {
            return dlOLrzqt;
        }
        resolversKt$resolveEndpointUrl$1.L$0 = str3;
        resolversKt$resolveEndpointUrl$1.L$1 = null;
        resolversKt$resolveEndpointUrl$1.L$2 = null;
        resolversKt$resolveEndpointUrl$1.L$3 = null;
        resolversKt$resolveEndpointUrl$1.L$4 = null;
        resolversKt$resolveEndpointUrl$1.label = 2;
        objOLrzqt = hh.KWHzl(resolversKt$resolveEndpointUrl$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        str4 = str3;
        return ObjectInputStream.KWHzl((ObjectOutputStream) objOLrzqt, str4);
    }

    public static /* synthetic */ java.lang.Object resolveEndpointUrl$default(HH hh, java.lang.String str, java.lang.String str2, java.lang.String str3, HL hl, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        return OLrzqt(hh, str, str2, str3, hl, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(HL hl, HH<ObjectOutputStream> hh, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ResolversKt$resolveIgnoreEndpointUrls$1 resolversKt$resolveIgnoreEndpointUrls$1;
        java.lang.Boolean boolOLrzqt;
        if (continuation instanceof ResolversKt$resolveIgnoreEndpointUrls$1) {
            resolversKt$resolveIgnoreEndpointUrls$1 = (ResolversKt$resolveIgnoreEndpointUrls$1) continuation;
            int i = resolversKt$resolveIgnoreEndpointUrls$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolversKt$resolveIgnoreEndpointUrls$1.label = i - Integer.MIN_VALUE;
            } else {
                resolversKt$resolveIgnoreEndpointUrls$1 = new ResolversKt$resolveIgnoreEndpointUrls$1(continuation);
            }
        }
        java.lang.Object objKWHzl = resolversKt$resolveIgnoreEndpointUrls$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolversKt$resolveIgnoreEndpointUrls$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            boolOLrzqt = (java.lang.Boolean) C59333zf.AEQbTJ(IOException.zsXlph.DbNXlk(), hl);
            if (boolOLrzqt == null) {
                resolversKt$resolveIgnoreEndpointUrls$1.label = 1;
                objKWHzl = hh.KWHzl(resolversKt$resolveIgnoreEndpointUrls$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objKWHzl);
        boolOLrzqt = ObjectInputValidation.OLrzqt(((ObjectOutputStream) objKWHzl).OLrzqt());
        boolean zBooleanValue = boolOLrzqt != null ? boolOLrzqt.booleanValue() : false;
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull HL hl, @NotNull HH<ObjectStreamField> hh, @NotNull Continuation<? super AccountIdEndpointMode> continuation) throws java.lang.Throwable {
        ResolversKt$resolveAccountIdEndpointMode$1 resolversKt$resolveAccountIdEndpointMode$1;
        if (continuation instanceof ResolversKt$resolveAccountIdEndpointMode$1) {
            resolversKt$resolveAccountIdEndpointMode$1 = (ResolversKt$resolveAccountIdEndpointMode$1) continuation;
            int i = resolversKt$resolveAccountIdEndpointMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolversKt$resolveAccountIdEndpointMode$1.label = i - Integer.MIN_VALUE;
            } else {
                resolversKt$resolveAccountIdEndpointMode$1 = new ResolversKt$resolveAccountIdEndpointMode$1(continuation);
            }
        }
        java.lang.Object objKWHzl = resolversKt$resolveAccountIdEndpointMode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resolversKt$resolveAccountIdEndpointMode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            AccountIdEndpointMode accountIdEndpointMode = (AccountIdEndpointMode) C59333zf.AEQbTJ(IOException.zsXlph.KWHzl(), hl);
            if (accountIdEndpointMode != null) {
                return accountIdEndpointMode;
            }
            resolversKt$resolveAccountIdEndpointMode$1.label = 1;
            objKWHzl = hh.KWHzl(resolversKt$resolveAccountIdEndpointMode$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        AccountIdEndpointMode accountIdEndpointModeAEQbTJ = ObjectInputValidation.AEQbTJ((ObjectStreamField) objKWHzl);
        return accountIdEndpointModeAEQbTJ == null ? AccountIdEndpointMode.PREFERRED : accountIdEndpointModeAEQbTJ;
    }

    public static /* synthetic */ java.lang.Object resolveAccountIdEndpointMode$default(HL hl, HH hh, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hl = HL.OLrzqt.copydefault();
        }
        if ((i & 2) != 0) {
            hh = HE.AEQbTJ(new ResolversKt$resolveAccountIdEndpointMode$2(hl, null));
        }
        return AEQbTJ(hl, hh, continuation);
    }
}
