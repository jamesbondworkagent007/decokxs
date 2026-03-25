package o;

import android.support.v4.media.session.PlaybackStateCompat;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1;
import aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1;
import aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$rollingHash$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.JobKt;
import o.InterfaceC5148Go;
import o.InterfaceC54725xT;
import o.InterfaceC59908zr;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4436Be<I> implements InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> {
    public java.lang.String AEQbTJ;
    public final Function1<I, java.lang.String> copydefault;

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public java.lang.Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        return InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
    public java.lang.Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX, @NotNull Continuation<? super InterfaceC5039Cj> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX, (Continuation) continuation);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya, @NotNull Continuation<? super java.lang.Object> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC54887xZ, continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ, continuation);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterAttempt(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterDeserialization(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterExecution(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.EZpvd(this, interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterTransmit(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeAttempt(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeDeserialization(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
        InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeExecution(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya) {
        InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya) {
        InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC56995ya);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeTransmit(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterSerialization(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        this.AEQbTJ = this.copydefault.invoke((I) interfaceC54887xZ.OLrzqt());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC54725xT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) throws java.lang.Throwable {
        FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1 flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1;
        C5036Cg c5036CgEZpvd;
        InterfaceC59908zr interfaceC59908zr;
        C5036Cg c5036Cg;
        java.lang.String str;
        C5036Cg c5036Cg2;
        java.lang.String str2;
        java.lang.String strOLrzqt;
        if (continuation instanceof FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1) {
            flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1 = (FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1) continuation;
            int i = flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1 = new FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1(this, continuation);
            }
        }
        FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1 flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12 = flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$1;
        java.lang.Object objCopydefault = flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            CoroutineContext context = flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.getContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C4436Be.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
            if (this.AEQbTJ == null) {
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$2$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "no checksum algorithm specified, skipping flexible checksums processing";
                    }
                }, 1, null);
                return interfaceC54887xZ.AEQbTJ();
            }
            c5036CgEZpvd = C5043Cn.EZpvd(interfaceC54887xZ.AEQbTJ());
            if (!(!(interfaceC54887xZ.AEQbTJ().KWHzl() instanceof zP.StateListAnimator))) {
                throw new java.lang.IllegalStateException("Can't calculate the checksum of an empty body".toString());
            }
            final java.lang.String lowerCase = ("x-amz-checksum-" + this.AEQbTJ).toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Resolved checksum header name: " + lowerCase;
                }
            }, 1, null);
            copydefault(c5036CgEZpvd.AEQbTJ(), lowerCase);
            java.lang.String str3 = this.AEQbTJ;
            Intrinsics.copydefault((java.lang.Object) str3);
            InterfaceC59908zr interfaceC59908zrCopydefault = C59971zt.copydefault(str3);
            if (interfaceC59908zrCopydefault == null) {
                throw new ClientException("Could not parse checksum algorithm " + this.AEQbTJ);
            }
            if (!KWHzl(interfaceC59908zrCopydefault)) {
                throw new ClientException("Checksum algorithm " + this.AEQbTJ + " is not supported for flexible checksums");
            }
            if (OLrzqt(c5036CgEZpvd.KWHzl())) {
                C5034Ce.EZpvd(c5036CgEZpvd, "x-amz-trailer", lowerCase);
                CompletableDeferred<java.lang.String> CompletableDeferred = CompletableDeferredKt.CompletableDeferred(JobKt.getJob(interfaceC54887xZ.KWHzl().getCoroutineContext()));
                if (c5036CgEZpvd.AEQbTJ().EZpvd(lowerCase) != null) {
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$5
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "User supplied a checksum, skipping asynchronous calculation";
                        }
                    }, 1, null);
                    java.lang.String strEZpvd = c5036CgEZpvd.AEQbTJ().EZpvd(lowerCase);
                    Intrinsics.copydefault((java.lang.Object) strEZpvd);
                    c5036CgEZpvd.AEQbTJ().copydefault(lowerCase);
                    CompletableDeferred.complete(strEZpvd);
                } else {
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$6
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Calculating checksum asynchronously";
                        }
                    }, 1, null);
                    c5036CgEZpvd.EZpvd(AEQbTJ(C58752zO.copydefault(c5036CgEZpvd.KWHzl(), interfaceC59908zrCopydefault, c5036CgEZpvd.KWHzl().AEQbTJ()), CompletableDeferred));
                }
                c5036CgEZpvd.AhwBna().OLrzqt(lowerCase, CompletableDeferred);
            } else if (c5036CgEZpvd.AEQbTJ().EZpvd(lowerCase) == null) {
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.interceptors.FlexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Calculating checksum";
                    }
                }, 1, null);
                if (c5036CgEZpvd.KWHzl().AEQbTJ() == null && !c5036CgEZpvd.KWHzl().b_()) {
                    CS sdkByteReadChannel$default = C58752zO.toSdkByteReadChannel$default(c5036CgEZpvd.KWHzl(), null, 1, null);
                    Intrinsics.copydefault(sdkByteReadChannel$default);
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$0 = c5036CgEZpvd;
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$1 = lowerCase;
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.label = 1;
                    objCopydefault = rollingHash$default(this, sdkByteReadChannel$default, interfaceC59908zrCopydefault, 0L, flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12, 2, null);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c5036Cg2 = c5036CgEZpvd;
                    str2 = lowerCase;
                    strOLrzqt = C5162Hc.OLrzqt((byte[]) objCopydefault);
                    c5036CgEZpvd = c5036Cg2;
                } else {
                    zP zPVarKWHzl = c5036CgEZpvd.KWHzl();
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$0 = c5036CgEZpvd;
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$1 = lowerCase;
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$2 = interfaceC59908zrCopydefault;
                    flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.label = 2;
                    objCopydefault = C58752zO.copydefault(zPVarKWHzl, flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    interfaceC59908zr = interfaceC59908zrCopydefault;
                    c5036Cg = c5036CgEZpvd;
                    str = lowerCase;
                    Intrinsics.copydefault(objCopydefault);
                    byte[] bArr = (byte[]) objCopydefault;
                    c5036Cg.EZpvd(C58752zO.copydefault(bArr));
                    strOLrzqt = C5162Hc.OLrzqt(C59971zt.OLrzqt(bArr, interfaceC59908zr));
                    str2 = str;
                    c5036CgEZpvd = c5036Cg;
                }
            }
            return c5036CgEZpvd.copydefault();
        }
        if (i2 == 1) {
            str2 = (java.lang.String) flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$1;
            c5036Cg2 = (C5036Cg) flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            strOLrzqt = C5162Hc.OLrzqt((byte[]) objCopydefault);
            c5036CgEZpvd = c5036Cg2;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC59908zr = (InterfaceC59908zr) flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$2;
            str = (java.lang.String) flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$1;
            c5036Cg = (C5036Cg) flexibleChecksumsRequestInterceptor$modifyBeforeRetryLoop$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            Intrinsics.copydefault(objCopydefault);
            byte[] bArr2 = (byte[]) objCopydefault;
            c5036Cg.EZpvd(C58752zO.copydefault(bArr2));
            strOLrzqt = C5162Hc.OLrzqt(C59971zt.OLrzqt(bArr2, interfaceC59908zr));
            str2 = str;
            c5036CgEZpvd = c5036Cg;
        }
        C5034Ce.EZpvd(c5036CgEZpvd, str2, strOLrzqt);
        return c5036CgEZpvd.copydefault();
    }

    public final boolean OLrzqt(zP zPVar) {
        if (((zPVar instanceof zP.Application) || (zPVar instanceof zP.Activity)) && zPVar.AEQbTJ() != null) {
            if (!zPVar.b_()) {
                java.lang.Long lAEQbTJ = zPVar.AEQbTJ();
                Intrinsics.copydefault(lAEQbTJ);
                if (lAEQbTJ.longValue() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean KWHzl(InterfaceC59908zr interfaceC59908zr) {
        if ((interfaceC59908zr instanceof C59598zk) || (interfaceC59908zr instanceof C59863zp) || (interfaceC59908zr instanceof C60243zz)) {
            return true;
        }
        return interfaceC59908zr instanceof C60190zy;
    }

    public final void copydefault(C58617zJ c58617zJ, java.lang.String str) {
        for (java.lang.String str2 : c58617zJ.KWHzl()) {
            if (C59449zhJ.startsWith$default(str2, "x-amz-checksum-", false, 2, null) && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str)) {
                c58617zJ.copydefault(str2);
            }
        }
    }

    public final zP AEQbTJ(zP zPVar, CompletableDeferred<java.lang.String> completableDeferred) {
        if (zPVar instanceof zP.Application) {
            InterfaceC5060De interfaceC5060DeCopydefault = ((zP.Application) zPVar).copydefault();
            Intrinsics.copydefault(interfaceC5060DeCopydefault, "");
            return C58752zO.OLrzqt(new StateListAnimator(completableDeferred, (CM) interfaceC5060DeCopydefault), zPVar.AEQbTJ());
        }
        if (!(zPVar instanceof zP.Activity)) {
            throw new ClientException("HttpBody type is not supported");
        }
        CS csCopydefault = ((zP.Activity) zPVar).copydefault();
        Intrinsics.copydefault(csCopydefault, "");
        return C58752zO.KWHzl(new ActionBar(completableDeferred, (CE) csCopydefault), zPVar.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.Be$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5060De {
        public final CompletableDeferred<java.lang.String> EZpvd;
        public final CM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.copydefault.close();
        }

        public StateListAnimator(@NotNull CompletableDeferred<java.lang.String> completableDeferred, @NotNull CM cm) {
            Intrinsics.checkNotNullParameter(completableDeferred, "");
            Intrinsics.checkNotNullParameter(cm, "");
            this.EZpvd = completableDeferred;
            this.copydefault = cm;
        }

        @Override // o.InterfaceC5060De
        public long KWHzl(@NotNull CQ cq, long j) throws java.io.IOException {
            Intrinsics.checkNotNullParameter(cq, "");
            long jKWHzl = this.copydefault.KWHzl(cq, j);
            if (jKWHzl == -1) {
                this.EZpvd.complete(C5162Hc.OLrzqt(this.copydefault.KWHzl()));
            }
            return jKWHzl;
        }
    }

    /* JADX INFO: renamed from: o.Be$ActionBar */
    public static final class ActionBar implements CS {
        public final CE EZpvd;
        public final CompletableDeferred<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.CS
        public int AEQbTJ() {
            return this.EZpvd.AEQbTJ();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.CS
        public java.lang.Throwable EZpvd() {
            return this.EZpvd.EZpvd();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.CS
        public boolean KWHzl() {
            return this.EZpvd.KWHzl();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.CS
        public boolean OLrzqt(java.lang.Throwable th) {
            return this.EZpvd.OLrzqt(th);
        }

        public ActionBar(@NotNull CompletableDeferred<java.lang.String> completableDeferred, @NotNull CE ce) {
            Intrinsics.checkNotNullParameter(completableDeferred, "");
            Intrinsics.checkNotNullParameter(ce, "");
            this.copydefault = completableDeferred;
            this.EZpvd = ce;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.CS
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object copydefault(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
            FlexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1 flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1;
            ActionBar actionBar;
            if (continuation instanceof FlexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1) {
                flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1 = (FlexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1) continuation;
                int i = flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.label = i - Integer.MIN_VALUE;
                } else {
                    flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1 = new FlexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1(this, continuation);
                }
            }
            java.lang.Object objCopydefault = flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                CE ce = this.EZpvd;
                flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.L$0 = this;
                flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.label = 1;
                objCopydefault = ce.copydefault(cq, j, flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                actionBar = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionBar = (ActionBar) flexibleChecksumsRequestInterceptor$CompletingByteReadChannel$read$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            if (((java.lang.Number) objCopydefault).longValue() == -1) {
                actionBar.copydefault.complete(C5162Hc.OLrzqt(actionBar.EZpvd.OLrzqt()));
            }
            return objCopydefault;
        }
    }

    public static /* synthetic */ java.lang.Object rollingHash$default(C4436Be c4436Be, CS cs, InterfaceC59908zr interfaceC59908zr, long j, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return c4436Be.copydefault(cs, interfaceC59908zr, j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b0 -> B:27:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(CS cs, InterfaceC59908zr interfaceC59908zr, long j, Continuation<? super byte[]> continuation) throws java.lang.Throwable {
        FlexibleChecksumsRequestInterceptor$rollingHash$1 flexibleChecksumsRequestInterceptor$rollingHash$1;
        long j2;
        CQ cq;
        FlexibleChecksumsRequestInterceptor$rollingHash$1 flexibleChecksumsRequestInterceptor$rollingHash$12;
        CS cs2;
        InterfaceC59908zr interfaceC59908zr2;
        CS cs3;
        CQ cq2;
        InterfaceC59908zr interfaceC59908zr3;
        if (continuation instanceof FlexibleChecksumsRequestInterceptor$rollingHash$1) {
            flexibleChecksumsRequestInterceptor$rollingHash$1 = (FlexibleChecksumsRequestInterceptor$rollingHash$1) continuation;
            int i = flexibleChecksumsRequestInterceptor$rollingHash$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flexibleChecksumsRequestInterceptor$rollingHash$1.label = i - Integer.MIN_VALUE;
            } else {
                flexibleChecksumsRequestInterceptor$rollingHash$1 = new FlexibleChecksumsRequestInterceptor$rollingHash$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = flexibleChecksumsRequestInterceptor$rollingHash$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = flexibleChecksumsRequestInterceptor$rollingHash$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            j2 = j;
            cq = new CQ();
            flexibleChecksumsRequestInterceptor$rollingHash$12 = flexibleChecksumsRequestInterceptor$rollingHash$1;
            cs2 = cs;
            interfaceC59908zr2 = interfaceC59908zr;
            if (!cs2.KWHzl()) {
            }
        } else if (i2 == 1) {
            j2 = flexibleChecksumsRequestInterceptor$rollingHash$1.J$0;
            CQ cq3 = (CQ) flexibleChecksumsRequestInterceptor$rollingHash$1.L$2;
            InterfaceC59908zr interfaceC59908zr4 = (InterfaceC59908zr) flexibleChecksumsRequestInterceptor$rollingHash$1.L$1;
            cs3 = (CS) flexibleChecksumsRequestInterceptor$rollingHash$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            cq2 = cq3;
            interfaceC59908zr3 = interfaceC59908zr4;
            flexibleChecksumsRequestInterceptor$rollingHash$1.L$0 = cs3;
            flexibleChecksumsRequestInterceptor$rollingHash$1.L$1 = interfaceC59908zr3;
            flexibleChecksumsRequestInterceptor$rollingHash$1.L$2 = cq2;
            flexibleChecksumsRequestInterceptor$rollingHash$1.L$3 = interfaceC59908zr3;
            flexibleChecksumsRequestInterceptor$rollingHash$1.J$0 = j2;
            flexibleChecksumsRequestInterceptor$rollingHash$1.label = 2;
            objKWHzl = C5062Dg.KWHzl(cq2, flexibleChecksumsRequestInterceptor$rollingHash$1);
            if (objKWHzl != objCopydefault) {
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = flexibleChecksumsRequestInterceptor$rollingHash$1.J$0;
            InterfaceC59908zr interfaceC59908zr5 = (InterfaceC59908zr) flexibleChecksumsRequestInterceptor$rollingHash$1.L$3;
            CQ cq4 = (CQ) flexibleChecksumsRequestInterceptor$rollingHash$1.L$2;
            InterfaceC59908zr interfaceC59908zr6 = (InterfaceC59908zr) flexibleChecksumsRequestInterceptor$rollingHash$1.L$1;
            CS cs4 = (CS) flexibleChecksumsRequestInterceptor$rollingHash$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            flexibleChecksumsRequestInterceptor$rollingHash$12 = flexibleChecksumsRequestInterceptor$rollingHash$1;
            interfaceC59908zr2 = interfaceC59908zr6;
            cs3 = cs4;
            InterfaceC59908zr interfaceC59908zr7 = interfaceC59908zr5;
            cq = cq4;
            InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr7, (byte[]) objKWHzl, 0, 0, 6, null);
            cs2 = cs3;
            if (!cs2.KWHzl()) {
                flexibleChecksumsRequestInterceptor$rollingHash$12.L$0 = cs2;
                flexibleChecksumsRequestInterceptor$rollingHash$12.L$1 = interfaceC59908zr2;
                flexibleChecksumsRequestInterceptor$rollingHash$12.L$2 = cq;
                flexibleChecksumsRequestInterceptor$rollingHash$12.L$3 = null;
                flexibleChecksumsRequestInterceptor$rollingHash$12.J$0 = j2;
                flexibleChecksumsRequestInterceptor$rollingHash$12.label = 1;
                if (cs2.copydefault(cq, j2, flexibleChecksumsRequestInterceptor$rollingHash$12) == objCopydefault) {
                    return objCopydefault;
                }
                cs3 = cs2;
                CQ cq5 = cq;
                interfaceC59908zr3 = interfaceC59908zr2;
                flexibleChecksumsRequestInterceptor$rollingHash$1 = flexibleChecksumsRequestInterceptor$rollingHash$12;
                cq2 = cq5;
                flexibleChecksumsRequestInterceptor$rollingHash$1.L$0 = cs3;
                flexibleChecksumsRequestInterceptor$rollingHash$1.L$1 = interfaceC59908zr3;
                flexibleChecksumsRequestInterceptor$rollingHash$1.L$2 = cq2;
                flexibleChecksumsRequestInterceptor$rollingHash$1.L$3 = interfaceC59908zr3;
                flexibleChecksumsRequestInterceptor$rollingHash$1.J$0 = j2;
                flexibleChecksumsRequestInterceptor$rollingHash$1.label = 2;
                objKWHzl = C5062Dg.KWHzl(cq2, flexibleChecksumsRequestInterceptor$rollingHash$1);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                interfaceC59908zr7 = interfaceC59908zr3;
                cq = cq2;
                flexibleChecksumsRequestInterceptor$rollingHash$12 = flexibleChecksumsRequestInterceptor$rollingHash$1;
                interfaceC59908zr2 = interfaceC59908zr7;
                InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr7, (byte[]) objKWHzl, 0, 0, 6, null);
                cs2 = cs3;
                if (!cs2.KWHzl()) {
                    return interfaceC59908zr2.AEQbTJ();
                }
            }
        }
    }
}
