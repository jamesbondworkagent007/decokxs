package o;

import aws.sdk.kotlin.runtime.auth.credentials.CredentialsNotLoadedException;
import aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$loadProfile$1;
import aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$loadProfile$2;
import aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$resolve$1;
import aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$resolve$3;
import aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$useCachedCredentials$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C59462zhW;
import o.InterfaceC5168Hi;
import o.InterruptedIOException;
import o.LocaleList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class IBinder implements InterfaceC52778wY {
    public C5173Hn AEQbTJ;
    public final InterfaceC5168Hi EZpvd;
    public final HM KWHzl;
    public final Mutex OLrzqt;
    public final InterfaceC56387yDm<NotSerializableException> copydefault;
    public InterfaceC52697wV gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IBinder() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yDm<? extends o.NotSerializableException> */
    /* JADX WARN: Multi-variable type inference failed */
    public IBinder(java.lang.String str, @NotNull InterfaceC56387yDm<? extends NotSerializableException> interfaceC56387yDm, @NotNull HM hm, @NotNull InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(hm, "");
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.valueOf = str;
        this.copydefault = interfaceC56387yDm;
        this.KWHzl = hm;
        this.EZpvd = interfaceC5168Hi;
        this.OLrzqt = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x000b: INVOKE 
  (wrap:aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$1:0x0009: SGET  A[WRAPPED] (LINE:54) aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$1.INSTANCE aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$1)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:54)) : (r2v0 o.yDm))
  (wrap:o.HM:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HM:0x0015: INVOKE (wrap:o.HL$TaskDescription:0x0013: SGET  A[WRAPPED] (LINE:55) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:55)) : (r3v0 o.HM))
  (wrap:o.Hi:?: TERNARY null = ((wrap:int:0x0019: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Hi:0x001d: SGET  A[WRAPPED] (LINE:56) o.Hi.Activity.AEQbTJ o.Hi$Activity) : (r4v0 o.Hi))
 A[MD:(java.lang.String, o.yDm<? extends o.NotSerializableException>, o.HM, o.Hi):void (m)] (LINE:52) call: o.IBinder.<init>(java.lang.String, o.yDm, o.HM, o.Hi):void type: THIS */
    public /* synthetic */ IBinder(java.lang.String str, InterfaceC56387yDm interfaceC56387yDm, HM hm, InterfaceC5168Hi interfaceC5168Hi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C56392yDr.copydefault(new Function0<InterruptedIOException>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterruptedIOException invoke() {
                return new InterruptedIOException();
            }
        }) : interfaceC56387yDm, (i & 4) != 0 ? HL.OLrzqt.copydefault() : hm, (i & 8) != 0 ? InterfaceC5168Hi.Activity.AEQbTJ : interfaceC5168Hi);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x0026 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v25, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v26, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v31, resolved type: o.IBinder */
    /* JADX DEBUG: Multi-variable search result rejected for r4v32, resolved type: o.IBinder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[Catch: all -> 0x026f, TRY_LEAVE, TryCatch #1 {all -> 0x026f, blocks: (B:33:0x00b5, B:35:0x00b9, B:37:0x00bd, B:42:0x00cd), top: B:116:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:22:0x0071, B:51:0x00ea, B:46:0x00d9, B:48:0x00dd), top: B:114:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        ImdsCredentialsProvider$resolve$1 imdsCredentialsProvider$resolve$1;
        java.lang.Exception exc;
        java.lang.Exception exc2;
        Mutex mutex;
        IBinder iBinder;
        java.lang.String str;
        C5173Hn c5173Hn;
        IBinder iBinder2;
        IBinder iBinder3;
        LocaleList localeList;
        C5173Hn c5173HnCopydefault;
        IBinder iBinder4;
        Mutex mutex2;
        InterfaceC52697wV interfaceC52697wV;
        InterfaceC52697wV interfaceC52697wV2;
        if (continuation instanceof ImdsCredentialsProvider$resolve$1) {
            imdsCredentialsProvider$resolve$1 = (ImdsCredentialsProvider$resolve$1) continuation;
            int i = imdsCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imdsCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                imdsCredentialsProvider$resolve$1 = new ImdsCredentialsProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = imdsCredentialsProvider$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        IBinder iBinder5 = imdsCredentialsProvider$resolve$1.label;
        try {
            try {
            } catch (java.lang.Exception e) {
                imdsCredentialsProvider$resolve$1.L$0 = e;
                imdsCredentialsProvider$resolve$1.L$1 = null;
                imdsCredentialsProvider$resolve$1.label = 5;
                java.lang.Object objEZpvd2 = iBinder5.EZpvd(e, imdsCredentialsProvider$resolve$1);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                exc = e;
                objEZpvd = objEZpvd2;
            }
        } catch (java.lang.Exception e2) {
            imdsCredentialsProvider$resolve$1.L$0 = e2;
            imdsCredentialsProvider$resolve$1.L$1 = null;
            imdsCredentialsProvider$resolve$1.label = 3;
            java.lang.Object objEZpvd3 = iBinder5.EZpvd(e2, imdsCredentialsProvider$resolve$1);
            if (objEZpvd3 == objCopydefault) {
                return objCopydefault;
            }
            exc2 = e2;
            objEZpvd = objEZpvd3;
        }
        switch (iBinder5) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd);
                if (Intrinsics.EZpvd(C59333zf.AEQbTJ(IOException.zsXlph.fetchVPNInfo(), this.KWHzl), C56443yFo.KWHzl(true))) {
                    throw new CredentialsNotLoadedException("AWS EC2 metadata is explicitly disabled; credentials not loaded", null, 2, null);
                }
                Mutex mutex3 = this.OLrzqt;
                imdsCredentialsProvider$resolve$1.L$0 = this;
                imdsCredentialsProvider$resolve$1.L$1 = mutex3;
                imdsCredentialsProvider$resolve$1.label = 1;
                if (mutex3.lock(null, imdsCredentialsProvider$resolve$1) == objCopydefault) {
                    return objCopydefault;
                }
                mutex = mutex3;
                iBinder = this;
                try {
                    if (iBinder.gEmmrt != null && (c5173Hn = iBinder.AEQbTJ) != null) {
                        if (iBinder.EZpvd.EZpvd().compareTo(c5173Hn) < 0) {
                            c5173Hn = null;
                        }
                        if (c5173Hn != null) {
                            InterfaceC52697wV interfaceC52697wV3 = iBinder.gEmmrt;
                            Intrinsics.copydefault(interfaceC52697wV3);
                            return interfaceC52697wV3;
                        }
                    }
                    str = iBinder.valueOf;
                    iBinder2 = iBinder;
                    if (str == null) {
                        imdsCredentialsProvider$resolve$1.L$0 = iBinder;
                        imdsCredentialsProvider$resolve$1.L$1 = null;
                        imdsCredentialsProvider$resolve$1.label = 2;
                        objEZpvd = iBinder.EZpvd(imdsCredentialsProvider$resolve$1);
                        iBinder5 = iBinder;
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        str = (java.lang.String) objEZpvd;
                        iBinder2 = iBinder5;
                        break;
                    }
                    imdsCredentialsProvider$resolve$1.L$0 = iBinder2;
                    imdsCredentialsProvider$resolve$1.L$1 = null;
                    imdsCredentialsProvider$resolve$1.label = 4;
                    objEZpvd = iBinder2.copydefault.getValue().KWHzl("/latest/meta-data/iam/security-credentials/" + str, imdsCredentialsProvider$resolve$1);
                    iBinder5 = iBinder2;
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    EL el = new EL(C59449zhJ.getNewProxyInstance((java.lang.String) objEZpvd));
                    imdsCredentialsProvider$resolve$1.L$0 = iBinder5;
                    imdsCredentialsProvider$resolve$1.label = 6;
                    objEZpvd = Creator.KWHzl(el, imdsCredentialsProvider$resolve$1);
                    iBinder3 = iBinder5;
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    localeList = (LocaleList) objEZpvd;
                    if (localeList instanceof LocaleList.TaskDescription) {
                        LocaleList.TaskDescription taskDescription = (LocaleList.TaskDescription) localeList;
                        if (taskDescription.AEQbTJ() == null || taskDescription.AEQbTJ().compareTo(iBinder3.EZpvd.EZpvd()) >= 0) {
                            c5173HnCopydefault = null;
                        } else {
                            CoroutineContext context = imdsCredentialsProvider$resolve$1.getContext();
                            ImdsCredentialsProvider$resolve$3 imdsCredentialsProvider$resolve$3 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$resolve$3
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return "Attempting credential expiration extension due to a credential service availability issue. A refresh of these credentials will be attempted again in 15 minutes.";
                                }
                            };
                            LogLevel logLevel = LogLevel.Warning;
                            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(IBinder.class).gEmmrt();
                            if (strGEmmrt == null) {
                                throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                            }
                            C5141Gh.copydefault(context, logLevel, strGEmmrt, null, imdsCredentialsProvider$resolve$3);
                            C5173Hn c5173HnEZpvd = iBinder3.EZpvd.EZpvd();
                            C59462zhW.Activity activity = C59462zhW.OLrzqt;
                            c5173HnCopydefault = c5173HnEZpvd.copydefault(C59519zia.EZpvd(900, DurationUnit.SECONDS));
                        }
                        iBinder3.AEQbTJ = c5173HnCopydefault;
                        InterfaceC52697wV interfaceC52697wVCopydefault = InterfaceC52697wV.copydefault.copydefault(taskDescription.KWHzl(), taskDescription.copydefault(), (16 & 4) != 0 ? null : taskDescription.EZpvd(), (16 & 8) != 0 ? null : taskDescription.AEQbTJ(), (16 & 16) != 0 ? null : "IMDSv2", (16 & 32) != 0 ? null : null);
                        Mutex mutex4 = iBinder3.OLrzqt;
                        imdsCredentialsProvider$resolve$1.L$0 = iBinder3;
                        imdsCredentialsProvider$resolve$1.L$1 = interfaceC52697wVCopydefault;
                        imdsCredentialsProvider$resolve$1.L$2 = interfaceC52697wVCopydefault;
                        imdsCredentialsProvider$resolve$1.L$3 = mutex4;
                        imdsCredentialsProvider$resolve$1.label = 7;
                        if (mutex4.lock(null, imdsCredentialsProvider$resolve$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        iBinder4 = iBinder3;
                        mutex2 = mutex4;
                        interfaceC52697wV = interfaceC52697wVCopydefault;
                        interfaceC52697wV2 = interfaceC52697wV;
                        try {
                            iBinder4.gEmmrt = interfaceC52697wV;
                            Unit unit = Unit.INSTANCE;
                            return interfaceC52697wV2;
                        } finally {
                        }
                    }
                    if (!(localeList instanceof LocaleList.Application)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LocaleList.Application application = (LocaleList.Application) localeList;
                    if (!Intrinsics.EZpvd((java.lang.Object) application.OLrzqt(), (java.lang.Object) "AssumeRoleUnauthorizedAccess")) {
                        throw new CredentialsProviderException("Error retrieving credentials from IMDS: code=" + application.OLrzqt() + "; " + application.AEQbTJ(), null, 2, null);
                    }
                    throw new ProviderConfigurationException("Incorrect IMDS/IAM configuration: [" + application.OLrzqt() + "] " + application.AEQbTJ() + ". Hint: Does this role have a trust relationship with EC2?", null, 2, null);
                } finally {
                }
            case 1:
                Mutex mutex5 = (Mutex) imdsCredentialsProvider$resolve$1.L$1;
                IBinder iBinder6 = (IBinder) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                mutex = mutex5;
                iBinder = iBinder6;
                if (iBinder.gEmmrt != null) {
                    if (iBinder.EZpvd.EZpvd().compareTo(c5173Hn) < 0) {
                    }
                    if (c5173Hn != null) {
                    }
                }
                str = iBinder.valueOf;
                iBinder2 = iBinder;
                if (str == null) {
                }
                imdsCredentialsProvider$resolve$1.L$0 = iBinder2;
                imdsCredentialsProvider$resolve$1.L$1 = null;
                imdsCredentialsProvider$resolve$1.label = 4;
                objEZpvd = iBinder2.copydefault.getValue().KWHzl("/latest/meta-data/iam/security-credentials/" + str, imdsCredentialsProvider$resolve$1);
                iBinder5 = iBinder2;
                if (objEZpvd == objCopydefault) {
                }
                EL el2 = new EL(C59449zhJ.getNewProxyInstance((java.lang.String) objEZpvd));
                imdsCredentialsProvider$resolve$1.L$0 = iBinder5;
                imdsCredentialsProvider$resolve$1.label = 6;
                objEZpvd = Creator.KWHzl(el2, imdsCredentialsProvider$resolve$1);
                iBinder3 = iBinder5;
                if (objEZpvd == objCopydefault) {
                }
                localeList = (LocaleList) objEZpvd;
                if (localeList instanceof LocaleList.TaskDescription) {
                }
                break;
            case 2:
                IBinder iBinder7 = (IBinder) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                iBinder5 = iBinder7;
                str = (java.lang.String) objEZpvd;
                iBinder2 = iBinder5;
                imdsCredentialsProvider$resolve$1.L$0 = iBinder2;
                imdsCredentialsProvider$resolve$1.L$1 = null;
                imdsCredentialsProvider$resolve$1.label = 4;
                objEZpvd = iBinder2.copydefault.getValue().KWHzl("/latest/meta-data/iam/security-credentials/" + str, imdsCredentialsProvider$resolve$1);
                iBinder5 = iBinder2;
                if (objEZpvd == objCopydefault) {
                }
                EL el22 = new EL(C59449zhJ.getNewProxyInstance((java.lang.String) objEZpvd));
                imdsCredentialsProvider$resolve$1.L$0 = iBinder5;
                imdsCredentialsProvider$resolve$1.label = 6;
                objEZpvd = Creator.KWHzl(el22, imdsCredentialsProvider$resolve$1);
                iBinder3 = iBinder5;
                if (objEZpvd == objCopydefault) {
                }
                localeList = (LocaleList) objEZpvd;
                if (localeList instanceof LocaleList.TaskDescription) {
                }
                break;
            case 3:
                exc2 = (java.lang.Exception) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC52697wV interfaceC52697wV4 = (InterfaceC52697wV) objEZpvd;
                if (interfaceC52697wV4 != null) {
                    return interfaceC52697wV4;
                }
                throw new CredentialsProviderException("failed to load instance profile", exc2);
            case 4:
                IBinder iBinder8 = (IBinder) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                iBinder5 = iBinder8;
                EL el222 = new EL(C59449zhJ.getNewProxyInstance((java.lang.String) objEZpvd));
                imdsCredentialsProvider$resolve$1.L$0 = iBinder5;
                imdsCredentialsProvider$resolve$1.label = 6;
                objEZpvd = Creator.KWHzl(el222, imdsCredentialsProvider$resolve$1);
                iBinder3 = iBinder5;
                if (objEZpvd == objCopydefault) {
                }
                localeList = (LocaleList) objEZpvd;
                if (localeList instanceof LocaleList.TaskDescription) {
                }
                break;
            case 5:
                exc = (java.lang.Exception) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC52697wV interfaceC52697wV5 = (InterfaceC52697wV) objEZpvd;
                if (interfaceC52697wV5 != null) {
                    return interfaceC52697wV5;
                }
                throw new CredentialsProviderException("failed to load credentials", exc);
            case 6:
                IBinder iBinder9 = (IBinder) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                iBinder3 = iBinder9;
                localeList = (LocaleList) objEZpvd;
                if (localeList instanceof LocaleList.TaskDescription) {
                }
                break;
            case 7:
                mutex2 = (Mutex) imdsCredentialsProvider$resolve$1.L$3;
                interfaceC52697wV = (InterfaceC52697wV) imdsCredentialsProvider$resolve$1.L$2;
                interfaceC52697wV2 = (InterfaceC52697wV) imdsCredentialsProvider$resolve$1.L$1;
                IBinder iBinder10 = (IBinder) imdsCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                iBinder4 = iBinder10;
                iBinder4.gEmmrt = interfaceC52697wV;
                Unit unit2 = Unit.INSTANCE;
                return interfaceC52697wV2;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.copydefault.isInitialized()) {
            this.copydefault.getValue().close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        ImdsCredentialsProvider$loadProfile$1 imdsCredentialsProvider$loadProfile$1;
        if (continuation instanceof ImdsCredentialsProvider$loadProfile$1) {
            imdsCredentialsProvider$loadProfile$1 = (ImdsCredentialsProvider$loadProfile$1) continuation;
            int i = imdsCredentialsProvider$loadProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imdsCredentialsProvider$loadProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                imdsCredentialsProvider$loadProfile$1 = new ImdsCredentialsProvider$loadProfile$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = imdsCredentialsProvider$loadProfile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = imdsCredentialsProvider$loadProfile$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                NotSerializableException value = this.copydefault.getValue();
                imdsCredentialsProvider$loadProfile$1.label = 1;
                objKWHzl = value.KWHzl("/latest/meta-data/iam/security-credentials", imdsCredentialsProvider$loadProfile$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return (java.lang.String) objKWHzl;
        } catch (EC2MetadataError e) {
            if (e.getStatusCode() == HttpStatusCode.KWHzl.AubY().flVtFt()) {
                CoroutineContext context = imdsCredentialsProvider$loadProfile$1.getContext();
                ImdsCredentialsProvider$loadProfile$2 imdsCredentialsProvider$loadProfile$2 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ImdsCredentialsProvider$loadProfile$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Received 404 from IMDS when loading profile information. Hint: This instance may not have an IAM role associated.";
                    }
                };
                LogLevel logLevel = LogLevel.Info;
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(IBinder.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(context, logLevel, strGEmmrt, null, imdsCredentialsProvider$loadProfile$2);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.Exception exc, Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        ImdsCredentialsProvider$useCachedCredentials$1 imdsCredentialsProvider$useCachedCredentials$1;
        Mutex mutex;
        IBinder iBinder;
        if (continuation instanceof ImdsCredentialsProvider$useCachedCredentials$1) {
            imdsCredentialsProvider$useCachedCredentials$1 = (ImdsCredentialsProvider$useCachedCredentials$1) continuation;
            int i = imdsCredentialsProvider$useCachedCredentials$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imdsCredentialsProvider$useCachedCredentials$1.label = i - Integer.MIN_VALUE;
            } else {
                imdsCredentialsProvider$useCachedCredentials$1 = new ImdsCredentialsProvider$useCachedCredentials$1(this, continuation);
            }
        }
        java.lang.Object obj = imdsCredentialsProvider$useCachedCredentials$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = imdsCredentialsProvider$useCachedCredentials$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!(exc instanceof java.io.IOException) && (!(exc instanceof EC2MetadataError) || ((EC2MetadataError) exc).getStatusCode() != HttpStatusCode.KWHzl.AkhnZx().flVtFt())) {
                return null;
            }
            mutex = this.OLrzqt;
            imdsCredentialsProvider$useCachedCredentials$1.L$0 = this;
            imdsCredentialsProvider$useCachedCredentials$1.L$1 = mutex;
            imdsCredentialsProvider$useCachedCredentials$1.label = 1;
            if (mutex.lock(null, imdsCredentialsProvider$useCachedCredentials$1) == objCopydefault) {
                return objCopydefault;
            }
            iBinder = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) imdsCredentialsProvider$useCachedCredentials$1.L$1;
            iBinder = (IBinder) imdsCredentialsProvider$useCachedCredentials$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            InterfaceC52697wV interfaceC52697wV = iBinder.gEmmrt;
            if (interfaceC52697wV != null) {
                C5173Hn c5173HnEZpvd = iBinder.EZpvd.EZpvd();
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                iBinder.AEQbTJ = c5173HnEZpvd.copydefault(C59519zia.EZpvd(900, DurationUnit.SECONDS));
            } else {
                interfaceC52697wV = null;
            }
            mutex.unlock(null);
            return interfaceC52697wV;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
