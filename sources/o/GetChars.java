package o;

import aws.sdk.kotlin.runtime.auth.credentials.CredentialsNotLoadedException;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.sdk.kotlin.runtime.auth.credentials.SsoCredentialsProvider$legacyLoadTokenFile$1;
import aws.sdk.kotlin.runtime.auth.credentials.SsoCredentialsProvider$resolve$1;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54779xV;
import o.C57578yl;
import o.InterfaceC5148Go;
import o.InterfaceC5168Hi;
import o.MovementMethod;
import o.SparseArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class GetChars implements InterfaceC52805wZ {
    public final InterfaceC5168Hi AEQbTJ;
    public final Editable AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final InterfaceC3972Aw KWHzl;
    public final java.lang.String OLrzqt;
    public final HL copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3972Aw AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public GetChars(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, InterfaceC3972Aw interfaceC3972Aw, @NotNull HL hl, @NotNull InterfaceC5168Hi interfaceC5168Hi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(interfaceC5168Hi, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.gEmmrt = str3;
        this.valueOf = str4;
        this.AhwBna = str5;
        this.KWHzl = interfaceC3972Aw;
        this.copydefault = hl;
        this.AEQbTJ = interfaceC5168Hi;
        this.AYXKKw = str5 != null ? new Editable(str5, str3, str4, 0L, interfaceC3972Aw, hl, interfaceC5168Hi, 8, null) : null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:o.Aw:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.Aw) : (r18v0 o.Aw))
  (wrap:o.HL:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: INVOKE (wrap:o.HL$TaskDescription:0x0017: SGET  A[WRAPPED] (LINE:81) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:81)) : (r19v0 o.HL))
  (wrap:o.Hi:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: SGET  A[WRAPPED] (LINE:82) o.Hi.Activity.AEQbTJ o.Hi$Activity) : (r20v0 o.Hi))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.Aw, o.HL, o.Hi):void (m)] (LINE:74) call: o.GetChars.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.Aw, o.HL, o.Hi):void type: THIS */
    public /* synthetic */ GetChars(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, InterfaceC3972Aw interfaceC3972Aw, HL hl, InterfaceC5168Hi interfaceC5168Hi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : interfaceC3972Aw, (i & 64) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 128) != 0 ? InterfaceC5168Hi.Activity.AEQbTJ : interfaceC5168Hi);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, o.yq] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [o.yq] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.io.Closeable] */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        SsoCredentialsProvider$resolve$1 ssoCredentialsProvider$resolve$1;
        final GetChars getChars;
        ?? r14;
        zZ zZVar;
        final ?? r142;
        GetChars getChars2;
        ?? r143;
        Size sizeCopydefault;
        if (continuation instanceof SsoCredentialsProvider$resolve$1) {
            ssoCredentialsProvider$resolve$1 = (SsoCredentialsProvider$resolve$1) continuation;
            int i = ssoCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoCredentialsProvider$resolve$1 = new SsoCredentialsProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = ssoCredentialsProvider$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoCredentialsProvider$resolve$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objEZpvd);
                    CoroutineContext context = ssoCredentialsProvider$resolve$1.getContext();
                    java.lang.String strGEmmrt = C56524yIo.AEQbTJ(GetChars.class).gEmmrt();
                    if (strGEmmrt == null) {
                        throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                    }
                    InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
                    if (this.AYXKKw != null) {
                        InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoCredentialsProvider$resolve$token$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Attempting to load token using token provider for sso-session: `" + this.this$0.KWHzl() + '`';
                            }
                        }, 1, null);
                        Editable editable = this.AYXKKw;
                        ssoCredentialsProvider$resolve$1.L$0 = this;
                        ssoCredentialsProvider$resolve$1.L$1 = interfaceC57843yq;
                        ssoCredentialsProvider$resolve$1.label = 1;
                        objEZpvd = editable.resolve(interfaceC57843yq, ssoCredentialsProvider$resolve$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        getChars = this;
                        r14 = interfaceC57843yq;
                        zZVar = (zZ) objEZpvd;
                        r142 = r14;
                    } else {
                        InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoCredentialsProvider$resolve$token$2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Attempting to load token from file using legacy format";
                            }
                        }, 1, null);
                        ssoCredentialsProvider$resolve$1.L$0 = this;
                        ssoCredentialsProvider$resolve$1.L$1 = interfaceC57843yq;
                        ssoCredentialsProvider$resolve$1.label = 2;
                        objEZpvd = EZpvd(ssoCredentialsProvider$resolve$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        getChars = this;
                        r143 = interfaceC57843yq;
                        zZVar = (zZ) objEZpvd;
                        r142 = r143;
                    }
                } else if (i2 == 1) {
                    InterfaceC57843yq interfaceC57843yq2 = (InterfaceC57843yq) ssoCredentialsProvider$resolve$1.L$1;
                    getChars = (GetChars) ssoCredentialsProvider$resolve$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    r14 = interfaceC57843yq2;
                    zZVar = (zZ) objEZpvd;
                    r142 = r14;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        MovementMethod movementMethod = (MovementMethod) ssoCredentialsProvider$resolve$1.L$1;
                        getChars2 = (GetChars) ssoCredentialsProvider$resolve$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd);
                        interfaceC57843yq = movementMethod;
                        AttributeSet attributeSet = (AttributeSet) objEZpvd;
                        interfaceC57843yq.close();
                        sizeCopydefault = attributeSet.copydefault();
                        if (sizeCopydefault != null) {
                            throw new CredentialsProviderException("Expected SSO roleCredentials to not be null", null, 2, null);
                        }
                        java.lang.String strAEQbTJ = sizeCopydefault.AEQbTJ();
                        if (strAEQbTJ == null) {
                            throw new java.lang.IllegalStateException("Expected accessKeyId in SSO roleCredentials response".toString());
                        }
                        java.lang.String strEZpvd = sizeCopydefault.EZpvd();
                        if (strEZpvd != null) {
                            return Spanned.AEQbTJ(strAEQbTJ, strEZpvd, sizeCopydefault.OLrzqt(), C5172Hm.AEQbTJ(C5173Hn.AEQbTJ, sizeCopydefault.copydefault()), "SSO", getChars2.EZpvd);
                        }
                        throw new java.lang.IllegalStateException("Expected secretAccessKey in SSO roleCredentials response".toString());
                    }
                    InterfaceC57843yq interfaceC57843yq3 = (InterfaceC57843yq) ssoCredentialsProvider$resolve$1.L$1;
                    getChars = (GetChars) ssoCredentialsProvider$resolve$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    r143 = interfaceC57843yq3;
                    zZVar = (zZ) objEZpvd;
                    r142 = r143;
                }
                final FZ fzKWHzl = FX.KWHzl(ssoCredentialsProvider$resolve$1.getContext());
                MovementMethod movementMethodCopydefault = MovementMethod.AYXKKw.copydefault(new Function1<MovementMethod.TaskDescription.StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.SsoCredentialsProvider$resolve$client$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(MovementMethod.TaskDescription.StateListAnimator stateListAnimator) {
                        invoke2(stateListAnimator);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull MovementMethod.TaskDescription.StateListAnimator stateListAnimator) {
                        Intrinsics.checkNotNullParameter(stateListAnimator, "");
                        stateListAnimator.OLrzqt(this.this$0.EZpvd());
                        stateListAnimator.AEQbTJ(this.this$0.AEQbTJ());
                        stateListAnimator.OLrzqt(fzKWHzl);
                        stateListAnimator.KWHzl((AbstractC54779xV) r142.OLrzqt(C57578yl.EZpvd.EZpvd()));
                    }
                });
                SparseArray.Application application = new SparseArray.Application();
                application.copydefault(getChars.copydefault());
                application.OLrzqt(getChars.OLrzqt());
                application.KWHzl(zZVar.valueOf());
                SparseArray sparseArrayEZpvd = application.EZpvd();
                ssoCredentialsProvider$resolve$1.L$0 = getChars;
                ssoCredentialsProvider$resolve$1.L$1 = movementMethodCopydefault;
                ssoCredentialsProvider$resolve$1.label = 3;
                objEZpvd = movementMethodCopydefault.copydefault(sparseArrayEZpvd, ssoCredentialsProvider$resolve$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                getChars2 = getChars;
                interfaceC57843yq = movementMethodCopydefault;
                AttributeSet attributeSet2 = (AttributeSet) objEZpvd;
                interfaceC57843yq.close();
                sizeCopydefault = attributeSet2.copydefault();
                if (sizeCopydefault != null) {
                }
            } catch (java.lang.Exception e) {
                throw new CredentialsNotLoadedException("GetRoleCredentials operation failed", e);
            }
        } catch (java.lang.Throwable th) {
            interfaceC57843yq.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super PersistableBundle> continuation) throws java.lang.Throwable {
        SsoCredentialsProvider$legacyLoadTokenFile$1 ssoCredentialsProvider$legacyLoadTokenFile$1;
        GetChars getChars;
        if (continuation instanceof SsoCredentialsProvider$legacyLoadTokenFile$1) {
            ssoCredentialsProvider$legacyLoadTokenFile$1 = (SsoCredentialsProvider$legacyLoadTokenFile$1) continuation;
            int i = ssoCredentialsProvider$legacyLoadTokenFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssoCredentialsProvider$legacyLoadTokenFile$1.label = i - Integer.MIN_VALUE;
            } else {
                ssoCredentialsProvider$legacyLoadTokenFile$1 = new SsoCredentialsProvider$legacyLoadTokenFile$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = ssoCredentialsProvider$legacyLoadTokenFile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ssoCredentialsProvider$legacyLoadTokenFile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String str = this.gEmmrt;
            HL hl = this.copydefault;
            ssoCredentialsProvider$legacyLoadTokenFile$1.L$0 = this;
            ssoCredentialsProvider$legacyLoadTokenFile$1.label = 1;
            objOLrzqt = Factory.OLrzqt(str, hl, ssoCredentialsProvider$legacyLoadTokenFile$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            getChars = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getChars = (GetChars) ssoCredentialsProvider$legacyLoadTokenFile$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        PersistableBundle persistableBundle = (PersistableBundle) objOLrzqt;
        if (getChars.AEQbTJ.EZpvd().compareTo(persistableBundle.AEQbTJ()) <= 0) {
            return persistableBundle;
        }
        throw new ProviderConfigurationException("The SSO session has expired. To refresh this SSO session run `aws sso login` with the corresponding profile.", null, 2, null);
    }
}
