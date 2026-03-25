package o;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import aws.sdk.kotlin.runtime.config.imds.TokenMiddleware$getToken$1;
import aws.sdk.kotlin.runtime.config.imds.TokenMiddleware$getToken$2;
import aws.sdk.kotlin.runtime.config.imds.TokenMiddleware$modifyRequest$1;
import aws.sdk.kotlin.runtime.config.imds.TokenMiddleware$modifyRequest$token$1;
import aws.smithy.kotlin.runtime.http.HttpMethod;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import aws.smithy.kotlin.runtime.io.middleware.Phase;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LineNumberInputStream implements BI {
    public final long AEQbTJ;
    public C5182Hw<LineNumberReader> EZpvd;
    public final InvalidClassException KWHzl;
    public final InterfaceC5168Hi OLrzqt;
    public final zU copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.zU), (r2v0 o.InvalidClassException), (r3v0 long), (r5v0 o.Hi) A[MD:(o.zU, o.InvalidClassException, long, o.Hi):void (m)] call: o.LineNumberInputStream.<init>(o.zU, o.InvalidClassException, long, o.Hi):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LineNumberInputStream(zU zUVar, InvalidClassException invalidClassException, long j, InterfaceC5168Hi interfaceC5168Hi, DefaultConstructorMarker defaultConstructorMarker) {
        this(zUVar, invalidClassException, j, interfaceC5168Hi);
    }

    public LineNumberInputStream(zU zUVar, InvalidClassException invalidClassException, long j, InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(zUVar, "");
        Intrinsics.checkNotNullParameter(invalidClassException, "");
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.copydefault = zUVar;
        this.KWHzl = invalidClassException;
        this.AEQbTJ = j;
        this.OLrzqt = interfaceC5168Hi;
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        this.EZpvd = new C5182Hw<>(null, C59519zia.EZpvd(120, DurationUnit.SECONDS), interfaceC5168Hi, null);
    }

    @Override // o.BI
    public void copydefault(@NotNull BY<?, ?> by) {
        Intrinsics.checkNotNullParameter(by, "");
        Phase.register$default(by.copydefault().KWHzl(), this, (Phase.Order) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5076Du
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super BP<C5036Cg>> continuation) throws java.lang.Throwable {
        TokenMiddleware$modifyRequest$1 tokenMiddleware$modifyRequest$1;
        if (continuation instanceof TokenMiddleware$modifyRequest$1) {
            tokenMiddleware$modifyRequest$1 = (TokenMiddleware$modifyRequest$1) continuation;
            int i = tokenMiddleware$modifyRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenMiddleware$modifyRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenMiddleware$modifyRequest$1 = new TokenMiddleware$modifyRequest$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = tokenMiddleware$modifyRequest$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tokenMiddleware$modifyRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C5182Hw<LineNumberReader> c5182Hw = this.EZpvd;
            TokenMiddleware$modifyRequest$token$1 tokenMiddleware$modifyRequest$token$1 = new TokenMiddleware$modifyRequest$token$1(this, bp, null);
            tokenMiddleware$modifyRequest$1.L$0 = bp;
            tokenMiddleware$modifyRequest$1.label = 1;
            objCopydefault = c5182Hw.copydefault(tokenMiddleware$modifyRequest$token$1, tokenMiddleware$modifyRequest$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bp = (BP) tokenMiddleware$modifyRequest$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        bp.EZpvd().AEQbTJ().OLrzqt("x-aws-ec2-metadata-token", C59449zhJ.copydefault(((LineNumberReader) objCopydefault).AEQbTJ()));
        return bp;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0123 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:20:0x005e, B:45:0x0150, B:47:0x0154, B:53:0x0178, B:54:0x017f, B:37:0x010f, B:39:0x0123, B:41:0x0133, B:55:0x0180, B:56:0x0187, B:57:0x0188, B:61:0x019f, B:62:0x01b0), top: B:71:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #0 {all -> 0x01b1, blocks: (B:20:0x005e, B:45:0x0150, B:47:0x0154, B:53:0x0178, B:54:0x017f, B:37:0x010f, B:39:0x0123, B:41:0x0133, B:55:0x0180, B:56:0x0187, B:57:0x0188, B:61:0x019f, B:62:0x01b0), top: B:71:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178 A[Catch: all -> 0x01b1, TRY_ENTER, TryCatch #0 {all -> 0x01b1, blocks: (B:20:0x005e, B:45:0x0150, B:47:0x0154, B:53:0x0178, B:54:0x017f, B:37:0x010f, B:39:0x0123, B:41:0x0133, B:55:0x0180, B:56:0x0187, B:57:0x0188, B:61:0x019f, B:62:0x01b0), top: B:71:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0188 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #0 {all -> 0x01b1, blocks: (B:20:0x005e, B:45:0x0150, B:47:0x0154, B:53:0x0178, B:54:0x017f, B:37:0x010f, B:39:0x0123, B:41:0x0133, B:55:0x0180, B:56:0x0187, B:57:0x0188, B:61:0x019f, B:62:0x01b0), top: B:71:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, o.zS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC5168Hi interfaceC5168Hi, BP<C5036Cg> bp, Continuation<? super LineNumberReader> continuation) throws java.lang.Throwable {
        TokenMiddleware$getToken$1 tokenMiddleware$getToken$1;
        C5036Cg c5036Cg;
        InterfaceC5168Hi interfaceC5168Hi2;
        LineNumberInputStream lineNumberInputStream;
        C58859zS c58859zS;
        HttpStatusCode httpStatusCodeOLrzqt;
        HttpStatusCode.TaskDescription taskDescription;
        long j;
        InterfaceC5168Hi interfaceC5168Hi3;
        byte[] bArr;
        if (continuation instanceof TokenMiddleware$getToken$1) {
            tokenMiddleware$getToken$1 = (TokenMiddleware$getToken$1) continuation;
            int i = tokenMiddleware$getToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenMiddleware$getToken$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenMiddleware$getToken$1 = new TokenMiddleware$getToken$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = tokenMiddleware$getToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r4 = tokenMiddleware$getToken$1.label;
        try {
            if (r4 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                CoroutineContext context = tokenMiddleware$getToken$1.getContext();
                TokenMiddleware$getToken$2 tokenMiddleware$getToken$2 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.config.imds.TokenMiddleware$getToken$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "refreshing IMDS token";
                    }
                };
                LogLevel logLevel = LogLevel.Trace;
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(LineNumberInputStream.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(context, logLevel, strGEmmrt, null, tokenMiddleware$getToken$2);
                c5036Cg = new C5036Cg();
                c5036Cg.KWHzl(HttpMethod.PUT);
                c5036Cg.AEQbTJ().OLrzqt("x-aws-ec2-metadata-token-ttl-seconds", java.lang.String.valueOf(C59462zhW.DbNXlk(this.AEQbTJ)));
                java.lang.String strEZpvd = bp.EZpvd().AEQbTJ().EZpvd("User-Agent");
                if (strEZpvd != null) {
                    c5036Cg.AEQbTJ().OLrzqt("User-Agent", strEZpvd);
                }
                c5036Cg.djBIcL().AYXKKw().EZpvd("/latest/api/token");
                InvalidClassException invalidClassException = this.KWHzl;
                tokenMiddleware$getToken$1.L$0 = this;
                interfaceC5168Hi2 = interfaceC5168Hi;
                tokenMiddleware$getToken$1.L$1 = interfaceC5168Hi2;
                tokenMiddleware$getToken$1.L$2 = c5036Cg;
                tokenMiddleware$getToken$1.label = 1;
                objOLrzqt = invalidClassException.OLrzqt(tokenMiddleware$getToken$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                lineNumberInputStream = this;
            } else if (r4 == 1) {
                c5036Cg = (C5036Cg) tokenMiddleware$getToken$1.L$2;
                InterfaceC5168Hi interfaceC5168Hi4 = (InterfaceC5168Hi) tokenMiddleware$getToken$1.L$1;
                LineNumberInputStream lineNumberInputStream2 = (LineNumberInputStream) tokenMiddleware$getToken$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC5168Hi2 = interfaceC5168Hi4;
                lineNumberInputStream = lineNumberInputStream2;
            } else {
                if (r4 != 2) {
                    if (r4 != 3) {
                        if (r4 == 4) {
                            LineNumberReader lineNumberReader = (LineNumberReader) tokenMiddleware$getToken$1.L$0;
                            C56391yDq.AEQbTJ(objOLrzqt);
                            return lineNumberReader;
                        }
                        if (r4 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th = (java.lang.Throwable) tokenMiddleware$getToken$1.L$0;
                        C56391yDq.AEQbTJ(objOLrzqt);
                        throw th;
                    }
                    j = tokenMiddleware$getToken$1.J$0;
                    c58859zS = (C58859zS) tokenMiddleware$getToken$1.L$1;
                    interfaceC5168Hi3 = (InterfaceC5168Hi) tokenMiddleware$getToken$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    bArr = (byte[]) objOLrzqt;
                    if (bArr != null) {
                        throw new EC2MetadataError(200, "No token provided in IMDS response");
                    }
                    C5173Hn c5173HnEZpvd = interfaceC5168Hi3.EZpvd();
                    C59462zhW.Activity activity = C59462zhW.OLrzqt;
                    LineNumberReader lineNumberReader2 = new LineNumberReader(bArr, c5173HnEZpvd.copydefault(C59519zia.AEQbTJ(j, DurationUnit.SECONDS)));
                    tokenMiddleware$getToken$1.L$0 = lineNumberReader2;
                    tokenMiddleware$getToken$1.L$1 = null;
                    tokenMiddleware$getToken$1.label = 4;
                    return C58805zQ.EZpvd(c58859zS, tokenMiddleware$getToken$1) == objCopydefault ? objCopydefault : lineNumberReader2;
                }
                InterfaceC5168Hi interfaceC5168Hi5 = (InterfaceC5168Hi) tokenMiddleware$getToken$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                interfaceC5168Hi2 = interfaceC5168Hi5;
                c58859zS = (C58859zS) objOLrzqt;
                httpStatusCodeOLrzqt = c58859zS.AEQbTJ().OLrzqt();
                taskDescription = HttpStatusCode.KWHzl;
                if (!Intrinsics.EZpvd(httpStatusCodeOLrzqt, taskDescription.zsXlph())) {
                    java.lang.String strCopydefault = c58859zS.AEQbTJ().AEQbTJ().copydefault("x-aws-ec2-metadata-token-ttl-seconds");
                    if (strCopydefault == null) {
                        throw new EC2MetadataError(200, "No TTL provided in IMDS response");
                    }
                    long j2 = java.lang.Long.parseLong(strCopydefault);
                    zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                    tokenMiddleware$getToken$1.L$0 = interfaceC5168Hi2;
                    tokenMiddleware$getToken$1.L$1 = c58859zS;
                    tokenMiddleware$getToken$1.J$0 = j2;
                    tokenMiddleware$getToken$1.label = 3;
                    objOLrzqt = C58752zO.copydefault(zPVarEZpvd, tokenMiddleware$getToken$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    j = j2;
                    interfaceC5168Hi3 = interfaceC5168Hi2;
                    bArr = (byte[]) objOLrzqt;
                    if (bArr != null) {
                    }
                } else {
                    throw new EC2MetadataError(c58859zS.AEQbTJ().OLrzqt().flVtFt(), Intrinsics.EZpvd(c58859zS.AEQbTJ().OLrzqt(), taskDescription.djBIcL()) ? "Request forbidden: IMDS is disabled or the caller has insufficient permissions." : "Failed to retrieve IMDS token");
                }
            }
            BL.OLrzqt(new BP(c5036Cg), (C57631ym) objOLrzqt);
            zU zUVar = lineNumberInputStream.copydefault;
            tokenMiddleware$getToken$1.L$0 = interfaceC5168Hi2;
            tokenMiddleware$getToken$1.L$1 = null;
            tokenMiddleware$getToken$1.L$2 = null;
            tokenMiddleware$getToken$1.label = 2;
            objOLrzqt = zUVar.AEQbTJ(c5036Cg, tokenMiddleware$getToken$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c58859zS = (C58859zS) objOLrzqt;
            httpStatusCodeOLrzqt = c58859zS.AEQbTJ().OLrzqt();
            taskDescription = HttpStatusCode.KWHzl;
            if (!Intrinsics.EZpvd(httpStatusCodeOLrzqt, taskDescription.zsXlph())) {
            }
        } catch (java.lang.Throwable th2) {
            tokenMiddleware$getToken$1.L$0 = th2;
            tokenMiddleware$getToken$1.L$1 = null;
            tokenMiddleware$getToken$1.label = 5;
            if (C58805zQ.EZpvd(r4, tokenMiddleware$getToken$1) == objCopydefault) {
                return objCopydefault;
            }
            throw th2;
        }
    }
}
