package o;

import aws.sdk.kotlin.runtime.config.imds.EndpointMode;
import aws.sdk.kotlin.runtime.config.imds.ImdsEndpointProvider$activeProfile$1;
import aws.sdk.kotlin.runtime.config.imds.ImdsEndpointProvider$loadEndpointFromProfile$1;
import aws.sdk.kotlin.runtime.config.imds.ImdsEndpointProvider$loadEndpointModeFromProfile$1;
import aws.sdk.kotlin.runtime.config.imds.ImdsEndpointProvider$resolveEndpointFromConfig$1;
import aws.sdk.kotlin.runtime.config.imds.ImdsEndpointProvider$resolvedEndpoint$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InputStreamReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class InvalidClassException implements BD {
    public final HH<ObjectStreamField> AEQbTJ;
    public final HL EZpvd;
    public final HH<C57631ym> OLrzqt;
    public final InputStreamReader copydefault;

    public InvalidClassException(@NotNull HL hl, @NotNull InputStreamReader inputStreamReader) {
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(inputStreamReader, "");
        this.EZpvd = hl;
        this.copydefault = inputStreamReader;
        this.OLrzqt = HE.AEQbTJ(new ImdsEndpointProvider$resolvedEndpoint$1(this));
        this.AEQbTJ = HE.AEQbTJ(new ImdsEndpointProvider$activeProfile$1(this, null));
    }

    @Override // o.BD
    public java.lang.Object EZpvd(@NotNull BX bx, @NotNull Continuation<? super C57631ym> continuation) {
        return OLrzqt(continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super C57631ym> continuation) {
        return this.OLrzqt.KWHzl(continuation);
    }

    public final java.lang.Object KWHzl(Continuation<? super C57631ym> continuation) {
        InputStreamReader inputStreamReader = this.copydefault;
        return inputStreamReader instanceof InputStreamReader.Activity ? ((InputStreamReader.Activity) inputStreamReader).KWHzl() : EZpvd(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super C57631ym> continuation) throws java.lang.Throwable {
        ImdsEndpointProvider$resolveEndpointFromConfig$1 imdsEndpointProvider$resolveEndpointFromConfig$1;
        C57631ym c57631ymEZpvd;
        InvalidClassException invalidClassException;
        EndpointMode endpointModeCopydefault;
        if (continuation instanceof ImdsEndpointProvider$resolveEndpointFromConfig$1) {
            imdsEndpointProvider$resolveEndpointFromConfig$1 = (ImdsEndpointProvider$resolveEndpointFromConfig$1) continuation;
            int i = imdsEndpointProvider$resolveEndpointFromConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imdsEndpointProvider$resolveEndpointFromConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                imdsEndpointProvider$resolveEndpointFromConfig$1 = new ImdsEndpointProvider$resolveEndpointFromConfig$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = imdsEndpointProvider$resolveEndpointFromConfig$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = imdsEndpointProvider$resolveEndpointFromConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            c57631ymEZpvd = EZpvd();
            if (c57631ymEZpvd != null) {
                invalidClassException = this;
                if (c57631ymEZpvd == null) {
                    return c57631ymEZpvd;
                }
                InputStreamReader inputStreamReader = invalidClassException.copydefault;
                if (inputStreamReader instanceof InputStreamReader.StateListAnimator) {
                    endpointModeCopydefault = ((InputStreamReader.StateListAnimator) inputStreamReader).copydefault();
                } else {
                    endpointModeCopydefault = invalidClassException.copydefault();
                    if (endpointModeCopydefault == null) {
                        imdsEndpointProvider$resolveEndpointFromConfig$1.L$0 = null;
                        imdsEndpointProvider$resolveEndpointFromConfig$1.label = 2;
                        objCopydefault = invalidClassException.AEQbTJ(imdsEndpointProvider$resolveEndpointFromConfig$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        endpointModeCopydefault = (EndpointMode) objCopydefault;
                        if (endpointModeCopydefault == null) {
                        }
                    }
                }
                return endpointModeCopydefault.getDefaultEndpoint$aws_config();
            }
            imdsEndpointProvider$resolveEndpointFromConfig$1.L$0 = this;
            imdsEndpointProvider$resolveEndpointFromConfig$1.label = 1;
            objCopydefault = copydefault(imdsEndpointProvider$resolveEndpointFromConfig$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            invalidClassException = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                endpointModeCopydefault = (EndpointMode) objCopydefault;
                if (endpointModeCopydefault == null) {
                    endpointModeCopydefault = EndpointMode.IPv4;
                }
                return endpointModeCopydefault.getDefaultEndpoint$aws_config();
            }
            invalidClassException = (InvalidClassException) imdsEndpointProvider$resolveEndpointFromConfig$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        c57631ymEZpvd = (C57631ym) objCopydefault;
        if (c57631ymEZpvd == null) {
        }
    }

    public final C57631ym EZpvd() {
        java.lang.String str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.AkhnZx(), this.EZpvd);
        if (str != null) {
            return InputStream.AEQbTJ(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super C57631ym> continuation) throws java.lang.Throwable {
        ImdsEndpointProvider$loadEndpointFromProfile$1 imdsEndpointProvider$loadEndpointFromProfile$1;
        if (continuation instanceof ImdsEndpointProvider$loadEndpointFromProfile$1) {
            imdsEndpointProvider$loadEndpointFromProfile$1 = (ImdsEndpointProvider$loadEndpointFromProfile$1) continuation;
            int i = imdsEndpointProvider$loadEndpointFromProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imdsEndpointProvider$loadEndpointFromProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                imdsEndpointProvider$loadEndpointFromProfile$1 = new ImdsEndpointProvider$loadEndpointFromProfile$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = imdsEndpointProvider$loadEndpointFromProfile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = imdsEndpointProvider$loadEndpointFromProfile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            HH<ObjectStreamField> hh = this.AEQbTJ;
            imdsEndpointProvider$loadEndpointFromProfile$1.label = 1;
            objKWHzl = hh.KWHzl(imdsEndpointProvider$loadEndpointFromProfile$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default((ObjectStreamField) objKWHzl, "ec2_metadata_service_endpoint", null, 2, null);
        if (orNull$default != null) {
            return InputStream.AEQbTJ(orNull$default);
        }
        return null;
    }

    public final EndpointMode copydefault() {
        java.lang.String str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.values(), this.EZpvd);
        if (str != null) {
            return EndpointMode.Companion.AEQbTJ(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super EndpointMode> continuation) throws java.lang.Throwable {
        ImdsEndpointProvider$loadEndpointModeFromProfile$1 imdsEndpointProvider$loadEndpointModeFromProfile$1;
        if (continuation instanceof ImdsEndpointProvider$loadEndpointModeFromProfile$1) {
            imdsEndpointProvider$loadEndpointModeFromProfile$1 = (ImdsEndpointProvider$loadEndpointModeFromProfile$1) continuation;
            int i = imdsEndpointProvider$loadEndpointModeFromProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imdsEndpointProvider$loadEndpointModeFromProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                imdsEndpointProvider$loadEndpointModeFromProfile$1 = new ImdsEndpointProvider$loadEndpointModeFromProfile$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = imdsEndpointProvider$loadEndpointModeFromProfile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = imdsEndpointProvider$loadEndpointModeFromProfile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            HH<ObjectStreamField> hh = this.AEQbTJ;
            imdsEndpointProvider$loadEndpointModeFromProfile$1.label = 1;
            objKWHzl = hh.KWHzl(imdsEndpointProvider$loadEndpointModeFromProfile$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default((ObjectStreamField) objKWHzl, "ec2_metadata_service_endpoint_mode", null, 2, null);
        if (orNull$default != null) {
            return EndpointMode.Companion.AEQbTJ(orNull$default);
        }
        return null;
    }
}
