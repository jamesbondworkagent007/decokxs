package o;

import aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$loadAuthToken$1;
import aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$loadAuthTokenFromFile$1;
import aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.BY;
import o.C5173Hn;
import o.DB;
import o.DL;
import o.InterfaceC5148Go;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MediaController implements InterfaceC52778wY {
    public final HL KWHzl;
    public final InterfaceC3972Aw OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaController() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MediaController(@NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw) {
        Intrinsics.checkNotNullParameter(hl, "");
        this.KWHzl = hl;
        this.copydefault = interfaceC3972Aw == null;
        this.OLrzqt = interfaceC3972Aw == null ? C3919Av.DefaultHttpEngine$default(null, 1, null) : interfaceC3972Aw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:o.HL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HL:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:66) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:66)) : (r1v0 o.HL))
  (wrap:o.Aw:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.Aw) : (r2v0 o.Aw))
 A[MD:(o.HL, o.Aw):void (m)] (LINE:65) call: o.MediaController.<init>(o.HL, o.Aw):void type: THIS */
    public /* synthetic */ MediaController(HL hl, InterfaceC3972Aw interfaceC3972Aw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 2) != 0 ? null : interfaceC3972Aw);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Exception {
        EcsCredentialsProvider$resolve$1 ecsCredentialsProvider$resolve$1;
        MediaController mediaController;
        InterfaceC5148Go interfaceC5148Go;
        java.lang.String str;
        java.lang.String str2;
        InterfaceC5148Go interfaceC5148Go2;
        DL dlCopydefault;
        java.lang.Exception e;
        InterfaceC5148Go interfaceC5148Go3;
        if (continuation instanceof EcsCredentialsProvider$resolve$1) {
            ecsCredentialsProvider$resolve$1 = (EcsCredentialsProvider$resolve$1) continuation;
            int i = ecsCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecsCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                ecsCredentialsProvider$resolve$1 = new EcsCredentialsProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = ecsCredentialsProvider$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ecsCredentialsProvider$resolve$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            CoroutineContext context = ecsCredentialsProvider$resolve$1.getContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(MediaController.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
            ecsCredentialsProvider$resolve$1.L$0 = this;
            ecsCredentialsProvider$resolve$1.L$1 = interfaceC5148GoOLrzqt;
            ecsCredentialsProvider$resolve$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(ecsCredentialsProvider$resolve$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            mediaController = this;
            interfaceC5148Go = interfaceC5148GoOLrzqt;
            objEZpvd = objKWHzl;
        } else if (i2 == 1) {
            interfaceC5148Go = (InterfaceC5148Go) ecsCredentialsProvider$resolve$1.L$1;
            mediaController = (MediaController) ecsCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5148Go3 = (InterfaceC5148Go) ecsCredentialsProvider$resolve$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    final InterfaceC52697wV interfaceC52697wV = (InterfaceC52697wV) objEZpvd;
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go3, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder sb = new StringBuilder();
                            sb.append("obtained credentials from container metadata service; expiration=");
                            C5173Hn c5173HnAEQbTJ = interfaceC52697wV.AEQbTJ();
                            sb.append(c5173HnAEQbTJ != null ? c5173HnAEQbTJ.OLrzqt(TimestampFormat.ISO_8601) : null);
                            return sb.toString();
                        }
                    }, 1, null);
                    return interfaceC52697wV;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    interfaceC5148Go = interfaceC5148Go3;
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$creds$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "failed to obtain credentials from container metadata service";
                        }
                    }, 1, null);
                    if (e instanceof CredentialsProviderException) {
                        throw new CredentialsProviderException("Failed to get credentials from container metadata service", e);
                    }
                    throw e;
                }
            }
            str2 = (java.lang.String) ecsCredentialsProvider$resolve$1.L$2;
            interfaceC5148Go2 = (InterfaceC5148Go) ecsCredentialsProvider$resolve$1.L$1;
            mediaController = (MediaController) ecsCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC5148Go interfaceC5148Go4 = interfaceC5148Go2;
            dlCopydefault = (DL) objEZpvd;
            str = str2;
            interfaceC5148Go = interfaceC5148Go4;
            BY.Activity activity = BY.KWHzl;
            BV bv = new BV(C56524yIo.AEQbTJ(Unit.class), C56524yIo.AEQbTJ(InterfaceC52697wV.class));
            bv.EZpvd(new Bundle(str));
            bv.OLrzqt(new C5515Uri());
            bv.AEQbTJ("EcsCredentialsProvider");
            bv.EZpvd("EcsContainerMetadata");
            bv.AEQbTJ().OLrzqt(new StateListAnimator(dlCopydefault));
            BY byOLrzqt = bv.OLrzqt();
            byOLrzqt.copydefault().AEQbTJ(new Typeface());
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "retrieving container credentials";
                }
            }, 1, null);
            zU zUVar = new zU(mediaController.OLrzqt);
            try {
                Unit unit = Unit.INSTANCE;
                ecsCredentialsProvider$resolve$1.L$0 = interfaceC5148Go;
                ecsCredentialsProvider$resolve$1.L$1 = null;
                ecsCredentialsProvider$resolve$1.L$2 = null;
                ecsCredentialsProvider$resolve$1.label = 3;
                objEZpvd = C5030Ca.EZpvd(byOLrzqt, zUVar, unit, ecsCredentialsProvider$resolve$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC5148Go3 = interfaceC5148Go;
                final InterfaceC52697wV interfaceC52697wV2 = (InterfaceC52697wV) objEZpvd;
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go3, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("obtained credentials from container metadata service; expiration=");
                        C5173Hn c5173HnAEQbTJ = interfaceC52697wV2.AEQbTJ();
                        sb.append(c5173HnAEQbTJ != null ? c5173HnAEQbTJ.OLrzqt(TimestampFormat.ISO_8601) : null);
                        return sb.toString();
                    }
                }, 1, null);
                return interfaceC52697wV2;
            } catch (java.lang.Exception e3) {
                e = e3;
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$creds$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "failed to obtain credentials from container metadata service";
                    }
                }, 1, null);
                if (e instanceof CredentialsProviderException) {
                }
            }
        }
        str = (java.lang.String) objEZpvd;
        IOException iOException = IOException.zsXlph;
        java.lang.String str3 = (java.lang.String) C59333zf.AEQbTJ(iOException.valueOf(), mediaController.KWHzl);
        java.lang.String str4 = (java.lang.String) C59333zf.AEQbTJ(iOException.AYXKKw(), mediaController.KWHzl);
        if (str3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            if (str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
                throw new ProviderConfigurationException("Container credentials URI not set", null, 2, null);
            }
            ecsCredentialsProvider$resolve$1.L$0 = mediaController;
            ecsCredentialsProvider$resolve$1.L$1 = interfaceC5148Go;
            ecsCredentialsProvider$resolve$1.L$2 = str;
            ecsCredentialsProvider$resolve$1.label = 2;
            java.lang.Object objAEQbTJ = mediaController.AEQbTJ(str4, ecsCredentialsProvider$resolve$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            InterfaceC5148Go interfaceC5148Go5 = interfaceC5148Go;
            str2 = str;
            objEZpvd = objAEQbTJ;
            interfaceC5148Go2 = interfaceC5148Go5;
            InterfaceC5148Go interfaceC5148Go42 = interfaceC5148Go2;
            dlCopydefault = (DL) objEZpvd;
            str = str2;
            interfaceC5148Go = interfaceC5148Go42;
            BY.Activity activity2 = BY.KWHzl;
            BV bv2 = new BV(C56524yIo.AEQbTJ(Unit.class), C56524yIo.AEQbTJ(InterfaceC52697wV.class));
            bv2.EZpvd(new Bundle(str));
            bv2.OLrzqt(new C5515Uri());
            bv2.AEQbTJ("EcsCredentialsProvider");
            bv2.EZpvd("EcsContainerMetadata");
            bv2.AEQbTJ().OLrzqt(new StateListAnimator(dlCopydefault));
            BY byOLrzqt2 = bv2.OLrzqt();
            byOLrzqt2.copydefault().AEQbTJ(new Typeface());
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "retrieving container credentials";
                }
            }, 1, null);
            zU zUVar2 = new zU(mediaController.OLrzqt);
            Unit unit2 = Unit.INSTANCE;
            ecsCredentialsProvider$resolve$1.L$0 = interfaceC5148Go;
            ecsCredentialsProvider$resolve$1.L$1 = null;
            ecsCredentialsProvider$resolve$1.L$2 = null;
            ecsCredentialsProvider$resolve$1.label = 3;
            objEZpvd = C5030Ca.EZpvd(byOLrzqt2, zUVar2, unit2, ecsCredentialsProvider$resolve$1);
            if (objEZpvd == objCopydefault) {
            }
        } else {
            dlCopydefault = mediaController.copydefault(str3);
            BY.Activity activity22 = BY.KWHzl;
            BV bv22 = new BV(C56524yIo.AEQbTJ(Unit.class), C56524yIo.AEQbTJ(InterfaceC52697wV.class));
            bv22.EZpvd(new Bundle(str));
            bv22.OLrzqt(new C5515Uri());
            bv22.AEQbTJ("EcsCredentialsProvider");
            bv22.EZpvd("EcsContainerMetadata");
            bv22.AEQbTJ().OLrzqt(new StateListAnimator(dlCopydefault));
            BY byOLrzqt22 = bv22.OLrzqt();
            byOLrzqt22.copydefault().AEQbTJ(new Typeface());
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProvider$resolve$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "retrieving container credentials";
                }
            }, 1, null);
            zU zUVar22 = new zU(mediaController.OLrzqt);
            Unit unit22 = Unit.INSTANCE;
            ecsCredentialsProvider$resolve$1.L$0 = interfaceC5148Go;
            ecsCredentialsProvider$resolve$1.L$1 = null;
            ecsCredentialsProvider$resolve$1.L$2 = null;
            ecsCredentialsProvider$resolve$1.label = 3;
            objEZpvd = C5030Ca.EZpvd(byOLrzqt22, zUVar22, unit22, ecsCredentialsProvider$resolve$1);
            if (objEZpvd == objCopydefault) {
            }
        }
    }

    public static final class StateListAnimator implements BD {
        public final /* synthetic */ DL KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(DL dl) {
            this.KWHzl = dl;
        }

        @Override // o.BD
        public final java.lang.Object EZpvd(@NotNull BX bx, @NotNull Continuation<? super C57631ym> continuation) {
            return new C57631ym(this.KWHzl, null, 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        EcsCredentialsProvider$loadAuthToken$1 ecsCredentialsProvider$loadAuthToken$1;
        MediaController mediaController;
        java.lang.String str;
        if (continuation instanceof EcsCredentialsProvider$loadAuthToken$1) {
            ecsCredentialsProvider$loadAuthToken$1 = (EcsCredentialsProvider$loadAuthToken$1) continuation;
            int i = ecsCredentialsProvider$loadAuthToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecsCredentialsProvider$loadAuthToken$1.label = i - Integer.MIN_VALUE;
            } else {
                ecsCredentialsProvider$loadAuthToken$1 = new EcsCredentialsProvider$loadAuthToken$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = ecsCredentialsProvider$loadAuthToken$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = ecsCredentialsProvider$loadAuthToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.lang.String str2 = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.gEmmrt(), this.KWHzl);
            if (str2 == null) {
                mediaController = this;
                str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.AhwBna(), mediaController.KWHzl);
                if (str == null) {
                    return null;
                }
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\r\n", false, 2, (java.lang.Object) null)) {
                    return str;
                }
                throw new CredentialsProviderException("Token contains illegal line break sequence.", null, 2, null);
            }
            ecsCredentialsProvider$loadAuthToken$1.L$0 = this;
            ecsCredentialsProvider$loadAuthToken$1.label = 1;
            objCopydefault = copydefault(str2, ecsCredentialsProvider$loadAuthToken$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            mediaController = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaController = (MediaController) ecsCredentialsProvider$loadAuthToken$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        str = (java.lang.String) objCopydefault;
        if (str == null) {
            str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.AhwBna(), mediaController.KWHzl);
            if (str == null) {
            }
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\r\n", false, 2, (java.lang.Object) null)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        EcsCredentialsProvider$loadAuthTokenFromFile$1 ecsCredentialsProvider$loadAuthTokenFromFile$1;
        java.lang.String strCopydefault;
        if (continuation instanceof EcsCredentialsProvider$loadAuthTokenFromFile$1) {
            ecsCredentialsProvider$loadAuthTokenFromFile$1 = (EcsCredentialsProvider$loadAuthTokenFromFile$1) continuation;
            int i = ecsCredentialsProvider$loadAuthTokenFromFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecsCredentialsProvider$loadAuthTokenFromFile$1.label = i - Integer.MIN_VALUE;
            } else {
                ecsCredentialsProvider$loadAuthTokenFromFile$1 = new EcsCredentialsProvider$loadAuthTokenFromFile$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = ecsCredentialsProvider$loadAuthTokenFromFile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ecsCredentialsProvider$loadAuthTokenFromFile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            HL hl = this.KWHzl;
            ecsCredentialsProvider$loadAuthTokenFromFile$1.label = 1;
            objKWHzl = hl.KWHzl(str, ecsCredentialsProvider$loadAuthTokenFromFile$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        byte[] bArr = (byte[]) objKWHzl;
        if (bArr == null || (strCopydefault = C59449zhJ.copydefault(bArr)) == null) {
            throw new CredentialsProviderException("Could not read token file.", null, 2, null);
        }
        return strCopydefault;
    }

    public final DL copydefault(java.lang.String str) {
        try {
            return DL.StateListAnimator.parse$default(DL.AEQbTJ, "http://169.254.170.2" + str, null, 2, null);
        } catch (java.lang.Exception e) {
            throw new ProviderConfigurationException("Invalid relativeUri `" + str + '`', e);
        }
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super DL> continuation) {
        try {
            DL dl = DL.StateListAnimator.parse$default(DL.AEQbTJ, str, null, 2, null);
            if (Intrinsics.EZpvd(dl.AhwBna(), DI.EZpvd.OLrzqt())) {
                return dl;
            }
            DB dbOLrzqt = dl.OLrzqt();
            if (dbOLrzqt instanceof DB.TaskDescription) {
                java.util.Set set = Callback.AEQbTJ;
                DB dbOLrzqt2 = dl.OLrzqt();
                Intrinsics.copydefault(dbOLrzqt2, "");
                if (set.contains(((DB.TaskDescription) dbOLrzqt2).OLrzqt())) {
                    return dl;
                }
                throw new ProviderConfigurationException("The container credentials full URI (" + str + ") has an invalid host. Host can only be one of [" + CollectionsKt___CollectionsKt.joinToString$default(Callback.AEQbTJ, null, null, null, 0, null, null, 63, null) + "].", null, 2, null);
            }
            if (!(dbOLrzqt instanceof DB.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new ProviderConfigurationException("The container credentials full URI (" + str + ") is specified via hostname which is not currently supported.", null, 2, null);
        } catch (java.lang.Exception e) {
            throw new ProviderConfigurationException("Invalid fullUri `" + str + '`', e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.copydefault) {
            CB.copydefault(this.OLrzqt);
        }
    }
}
