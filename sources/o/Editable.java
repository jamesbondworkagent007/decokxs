package o;

import aws.sdk.kotlin.runtime.auth.credentials.InvalidSsoTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$attemptRefresh$1;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$attemptRefresh$4$1;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$getToken$1;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$refreshToken$1;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$resolve$2;
import aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$writeToken$1;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C59462zhW;
import o.Factory2;
import o.InterfaceC5168Hi;
import o.OnContextClickListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Editable implements InterfaceC3073Af {
    public final InterfaceC5168Hi AEQbTJ;
    public final java.lang.String AYXKKw;
    public final HL EZpvd;
    public final HQ<PersistableBundle> KWHzl;
    public final InterfaceC3972Aw OLrzqt;
    public final long copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 long)
  (r6v0 o.Aw)
  (r7v0 o.HL)
  (r8v0 o.Hi)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, o.Aw, o.HL, o.Hi):void (m)] call: o.Editable.<init>(java.lang.String, java.lang.String, java.lang.String, long, o.Aw, o.HL, o.Hi):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Editable(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, InterfaceC3972Aw interfaceC3972Aw, HL hl, InterfaceC5168Hi interfaceC5168Hi, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, interfaceC3972Aw, hl, interfaceC5168Hi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3972Aw EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    public Editable(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, InterfaceC3972Aw interfaceC3972Aw, HL hl, InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.AYXKKw = str;
        this.valueOf = str2;
        this.djBIcL = str3;
        this.copydefault = j;
        this.OLrzqt = interfaceC3972Aw;
        this.EZpvd = hl;
        this.AEQbTJ = interfaceC5168Hi;
        this.KWHzl = new HQ<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Editable(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, InterfaceC3972Aw interfaceC3972Aw, HL hl, InterfaceC5168Hi interfaceC5168Hi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jEZpvd;
        if ((i & 8) != 0) {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(300, DurationUnit.SECONDS);
        } else {
            jEZpvd = j;
        }
        this(str, str2, str3, jEZpvd, (i & 16) != 0 ? null : interfaceC3972Aw, (i & 32) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 64) != 0 ? InterfaceC5168Hi.Activity.AEQbTJ : interfaceC5168Hi, null);
    }

    @Override // o.InterfaceC3073Af, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super zZ> continuation) {
        return this.KWHzl.KWHzl(new SsoTokenProvider$resolve$2(this, interfaceC57843yq, null), continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.Factory.EZpvd(o.PersistableBundle):boolean */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(InterfaceC57843yq interfaceC57843yq, Continuation<? super PersistableBundle> continuation) throws java.lang.Throwable {
        SsoTokenProvider$getToken$1 ssoTokenProvider$getToken$1;
        final Editable editable;
        if (continuation instanceof SsoTokenProvider$getToken$1) {
            ssoTokenProvider$getToken$1 = (SsoTokenProvider$getToken$1) continuation;
            int i = ssoTokenProvider$getToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoTokenProvider$getToken$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoTokenProvider$getToken$1 = new SsoTokenProvider$getToken$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = ssoTokenProvider$getToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoTokenProvider$getToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String str = this.AYXKKw;
            HL hl = this.EZpvd;
            ssoTokenProvider$getToken$1.L$0 = this;
            ssoTokenProvider$getToken$1.label = 1;
            objOLrzqt = Factory.OLrzqt(str, hl, ssoTokenProvider$getToken$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            editable = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            editable = (Editable) ssoTokenProvider$getToken$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        final PersistableBundle persistableBundle = (PersistableBundle) objOLrzqt;
        if (editable.AEQbTJ.EZpvd().compareTo(persistableBundle.AEQbTJ().KWHzl(editable.copydefault)) >= 0) {
            if (Factory.OLrzqt(persistableBundle)) {
                ssoTokenProvider$getToken$1.L$0 = null;
                ssoTokenProvider$getToken$1.label = 2;
                objOLrzqt = editable.EZpvd(persistableBundle, ssoTokenProvider$getToken$1);
                return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
            }
            if (editable.AEQbTJ.EZpvd().compareTo(persistableBundle.AEQbTJ()) >= 0) {
                persistableBundle = null;
            }
            if (persistableBundle != null) {
                CoroutineContext context = ssoTokenProvider$getToken$1.getContext();
                Function0<java.lang.String> function0 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$getToken$4$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "cached token is not refreshable but still valid until " + persistableBundle.AEQbTJ() + " for sso-session: " + editable.KWHzl();
                    }
                };
                LogLevel logLevel = LogLevel.Debug;
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(context, logLevel, strGEmmrt, null, function0);
                return persistableBundle;
            }
            throwTokenExpired$default(editable, null, 1, null);
            throw new KotlinNothingValueException();
        }
        CoroutineContext context2 = ssoTokenProvider$getToken$1.getContext();
        Function0<java.lang.String> function02 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$getToken$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "using cached token for sso-session: " + this.this$0.KWHzl();
            }
        };
        LogLevel logLevel2 = LogLevel.Debug;
        java.lang.String strGEmmrt2 = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
        if (strGEmmrt2 == null) {
            throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        C5141Gh.copydefault(context2, logLevel2, strGEmmrt2, null, function02);
        return persistableBundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(PersistableBundle persistableBundle, Continuation<? super PersistableBundle> continuation) throws java.lang.Throwable {
        SsoTokenProvider$attemptRefresh$1 ssoTokenProvider$attemptRefresh$1;
        final Editable editable;
        java.lang.Object objM7377constructorimpl;
        final PersistableBundle persistableBundle2;
        java.lang.Object obj;
        PersistableBundle persistableBundle3;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SsoTokenProvider$attemptRefresh$1) {
            ssoTokenProvider$attemptRefresh$1 = (SsoTokenProvider$attemptRefresh$1) continuation;
            int i = ssoTokenProvider$attemptRefresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoTokenProvider$attemptRefresh$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoTokenProvider$attemptRefresh$1 = new SsoTokenProvider$attemptRefresh$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = ssoTokenProvider$attemptRefresh$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoTokenProvider$attemptRefresh$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            CoroutineContext context = ssoTokenProvider$attemptRefresh$1.getContext();
            Function0<java.lang.String> function0 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$attemptRefresh$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "attempting to refresh token for sso-session: " + this.this$0.KWHzl();
                }
            };
            LogLevel logLevel = LogLevel.Debug;
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            C5141Gh.copydefault(context, logLevel, strGEmmrt, null, function0);
            try {
                Result.Application application = Result.Companion;
                ssoTokenProvider$attemptRefresh$1.L$0 = this;
                ssoTokenProvider$attemptRefresh$1.L$1 = persistableBundle;
                ssoTokenProvider$attemptRefresh$1.label = 1;
                objKWHzl = KWHzl(persistableBundle, ssoTokenProvider$attemptRefresh$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                editable = this;
            } catch (java.lang.Throwable th) {
                th = th;
                editable = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = ssoTokenProvider$attemptRefresh$1.L$2;
                persistableBundle3 = (PersistableBundle) ssoTokenProvider$attemptRefresh$1.L$1;
                editable = (Editable) ssoTokenProvider$attemptRefresh$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                persistableBundle2 = persistableBundle3;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                    return obj;
                }
                if (editable.AEQbTJ.EZpvd().compareTo(persistableBundle2.AEQbTJ()) >= 0) {
                    CoroutineContext context2 = ssoTokenProvider$attemptRefresh$1.getContext();
                    SsoTokenProvider$attemptRefresh$4$1 ssoTokenProvider$attemptRefresh$4$1 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$attemptRefresh$4$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "token refresh failed";
                        }
                    };
                    LogLevel logLevel2 = LogLevel.Error;
                    java.lang.String strGEmmrt2 = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
                    if (strGEmmrt2 == null) {
                        throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    C5141Gh.copydefault(context2, logLevel2, strGEmmrt2, thM7380exceptionOrNullimpl, ssoTokenProvider$attemptRefresh$4$1);
                    editable.copydefault(thM7380exceptionOrNullimpl);
                    throw new KotlinNothingValueException();
                }
                CoroutineContext context3 = ssoTokenProvider$attemptRefresh$1.getContext();
                Function0<java.lang.String> function02 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$attemptRefresh$4$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "refresh token failed, original token is still valid until " + persistableBundle2.AEQbTJ() + " for sso-session: " + editable.KWHzl() + ", re-using";
                    }
                };
                LogLevel logLevel3 = LogLevel.Debug;
                java.lang.String strGEmmrt3 = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
                if (strGEmmrt3 == null) {
                    throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(context3, logLevel3, strGEmmrt3, null, function02);
                return persistableBundle2;
            }
            persistableBundle = (PersistableBundle) ssoTokenProvider$attemptRefresh$1.L$1;
            editable = (Editable) ssoTokenProvider$attemptRefresh$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((PersistableBundle) objKWHzl);
        java.lang.Object obj2 = objM7377constructorimpl;
        persistableBundle2 = persistableBundle;
        obj = obj2;
        if (Result.m7384isSuccessimpl(obj)) {
            ssoTokenProvider$attemptRefresh$1.L$0 = editable;
            ssoTokenProvider$attemptRefresh$1.L$1 = persistableBundle2;
            ssoTokenProvider$attemptRefresh$1.L$2 = obj;
            ssoTokenProvider$attemptRefresh$1.label = 2;
            if (editable.copydefault((PersistableBundle) obj, ssoTokenProvider$attemptRefresh$1) == objCopydefault) {
                return objCopydefault;
            }
            persistableBundle3 = persistableBundle2;
            persistableBundle2 = persistableBundle3;
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        if (thM7380exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(PersistableBundle persistableBundle, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SsoTokenProvider$writeToken$1 ssoTokenProvider$writeToken$1;
        java.lang.Exception e;
        final java.lang.String str;
        java.lang.String strGEmmrt;
        if (continuation instanceof SsoTokenProvider$writeToken$1) {
            ssoTokenProvider$writeToken$1 = (SsoTokenProvider$writeToken$1) continuation;
            int i = ssoTokenProvider$writeToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoTokenProvider$writeToken$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoTokenProvider$writeToken$1 = new SsoTokenProvider$writeToken$1(this, continuation);
            }
        }
        java.lang.Object obj = ssoTokenProvider$writeToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoTokenProvider$writeToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strAEQbTJ = ObjectInput.AEQbTJ(Factory.OLrzqt(this.EZpvd, "~", ".aws", "sso", "cache", Factory.KWHzl(this.AYXKKw)), this.EZpvd);
            try {
                byte[] bArrCopydefault = Factory.copydefault(persistableBundle);
                HL hl = this.EZpvd;
                ssoTokenProvider$writeToken$1.L$0 = strAEQbTJ;
                ssoTokenProvider$writeToken$1.label = 1;
                if (hl.KWHzl(strAEQbTJ, bArrCopydefault, ssoTokenProvider$writeToken$1) == objCopydefault) {
                    return objCopydefault;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                str = strAEQbTJ;
                CoroutineContext context = ssoTokenProvider$writeToken$1.getContext();
                Function0<java.lang.String> function0 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$writeToken$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "failed to write refreshed token back to disk at " + str;
                    }
                };
                LogLevel logLevel = LogLevel.Debug;
                strGEmmrt = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
                if (strGEmmrt != null) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) ssoTokenProvider$writeToken$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Exception e3) {
                e = e3;
                CoroutineContext context2 = ssoTokenProvider$writeToken$1.getContext();
                Function0<java.lang.String> function02 = new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$writeToken$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "failed to write refreshed token back to disk at " + str;
                    }
                };
                LogLevel logLevel2 = LogLevel.Debug;
                strGEmmrt = C56524yIo.AEQbTJ(Editable.class).gEmmrt();
                if (strGEmmrt != null) {
                    throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(context2, logLevel2, strGEmmrt, e, function02);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Void throwTokenExpired$default(Editable editable, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return editable.copydefault(th);
    }

    public final java.lang.Void copydefault(java.lang.Throwable th) {
        throw new InvalidSsoTokenException("SSO token for sso-session: " + this.AYXKKw + " is expired", th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(PersistableBundle persistableBundle, Continuation<? super PersistableBundle> continuation) throws java.lang.Throwable {
        SsoTokenProvider$refreshToken$1 ssoTokenProvider$refreshToken$1;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        PersistableBundle persistableBundle2;
        Editable editable;
        if (continuation instanceof SsoTokenProvider$refreshToken$1) {
            ssoTokenProvider$refreshToken$1 = (SsoTokenProvider$refreshToken$1) continuation;
            int i = ssoTokenProvider$refreshToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoTokenProvider$refreshToken$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoTokenProvider$refreshToken$1 = new SsoTokenProvider$refreshToken$1(this, continuation);
            }
        }
        java.lang.Object obj = ssoTokenProvider$refreshToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoTokenProvider$refreshToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            final FZ fzKWHzl = FX.KWHzl(ssoTokenProvider$refreshToken$1.getContext());
            Factory2 factory2Copydefault = Factory2.gEmmrt.copydefault(new Function1<Factory2.Application.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoTokenProvider$refreshToken$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Factory2.Application.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Factory2.Application.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    activity.OLrzqt(this.this$0.OLrzqt());
                    activity.KWHzl(this.this$0.EZpvd());
                    activity.copydefault(fzKWHzl);
                }
            });
            try {
                OnContextClickListener.StateListAnimator stateListAnimator = new OnContextClickListener.StateListAnimator();
                stateListAnimator.KWHzl(persistableBundle.EZpvd());
                stateListAnimator.copydefault(persistableBundle.KWHzl());
                stateListAnimator.EZpvd(persistableBundle.copydefault());
                stateListAnimator.OLrzqt("refresh_token");
                OnContextClickListener onContextClickListenerAEQbTJ = stateListAnimator.AEQbTJ();
                ssoTokenProvider$refreshToken$1.L$0 = this;
                ssoTokenProvider$refreshToken$1.L$1 = persistableBundle;
                ssoTokenProvider$refreshToken$1.L$2 = factory2Copydefault;
                ssoTokenProvider$refreshToken$1.I$0 = 0;
                ssoTokenProvider$refreshToken$1.label = 1;
                java.lang.Object objEZpvd = factory2Copydefault.EZpvd(onContextClickListenerAEQbTJ, ssoTokenProvider$refreshToken$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                persistableBundle2 = persistableBundle;
                closeable = factory2Copydefault;
                obj = objEZpvd;
                editable = this;
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeable = factory2Copydefault;
                closeable.close();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) ssoTokenProvider$refreshToken$1.L$2;
            persistableBundle2 = (PersistableBundle) ssoTokenProvider$refreshToken$1.L$1;
            editable = (Editable) ssoTokenProvider$refreshToken$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    closeable.close();
                } catch (java.lang.Throwable th4) {
                    C56379yDe.EZpvd(th, th4);
                }
                throw th;
            }
        }
        PersistableBundle persistableBundleKWHzl = Factory.KWHzl((OnCapturedPointerListener) obj, persistableBundle2, editable.AEQbTJ);
        closeable.close();
        return persistableBundleKWHzl;
    }
}
