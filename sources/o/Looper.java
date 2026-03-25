package o;

import aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$namedProviders$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$region$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$toCredentialsProvider$1;
import aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$toCredentialsProvider$2;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C5173Hn;
import o.FileInputStream;
import o.InterfaceC5148Go;
import o.InterruptedIOException;
import o.Looper;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public final class Looper implements InterfaceC52778wY {
    public final java.lang.String AEQbTJ;
    public final ObjectOutput EZpvd;
    public final InterfaceC3972Aw KWHzl;
    public final HL OLrzqt;
    public final java.util.Map<java.lang.String, InterfaceC52805wZ> copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Looper() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HL AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3972Aw KWHzl() {
        return this.KWHzl;
    }

    public Looper(java.lang.String str, java.lang.String str2, @NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw, ObjectOutput objectOutput) {
        Intrinsics.checkNotNullParameter(hl, "");
        this.AEQbTJ = str;
        this.gEmmrt = str2;
        this.OLrzqt = hl;
        this.KWHzl = interfaceC3972Aw;
        this.EZpvd = objectOutput;
        this.copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt("Environment", new Environment(new ProfileCredentialsProvider$namedProviders$1(hl))), C56390yDp.OLrzqt("Ec2InstanceMetadata", new IBinder(str, C56392yDr.copydefault(new Function0<InterruptedIOException>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$namedProviders$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterruptedIOException invoke() {
                InterruptedIOException.ActionBar actionBar = InterruptedIOException.copydefault;
                final Looper looper = this.this$0;
                return actionBar.KWHzl(new Function1<InterruptedIOException.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$namedProviders$2.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterruptedIOException.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterruptedIOException.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        activity.AEQbTJ(looper.AEQbTJ());
                        activity.KWHzl(looper.KWHzl());
                    }
                });
            }
        }), hl, null, 8, null)), C56390yDp.OLrzqt("EcsContainer", new MediaController(hl, interfaceC3972Aw)));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:o.HL:0x0019: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HL:0x0015: INVOKE (wrap:o.HL$TaskDescription:0x0013: SGET  A[WRAPPED] (LINE:83) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:83)) : (r7v0 o.HL))
  (wrap:o.Aw:?: TERNARY null = ((wrap:int:0x001a: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.Aw) : (r8v0 o.Aw))
  (wrap:o.ObjectOutput:?: TERNARY null = ((wrap:int:0x0021: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.ObjectOutput) : (r9v0 o.ObjectOutput))
 A[MD:(java.lang.String, java.lang.String, o.HL, o.Aw, o.ObjectOutput):void (m)] (LINE:80) call: o.Looper.<init>(java.lang.String, java.lang.String, o.HL, o.Aw, o.ObjectOutput):void type: THIS */
    public /* synthetic */ Looper(java.lang.String str, java.lang.String str2, HL hl, InterfaceC3972Aw interfaceC3972Aw, ObjectOutput objectOutput, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 8) != 0 ? null : interfaceC3972Aw, (i & 16) != 0 ? null : objectOutput);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [102=6] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v33, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01be -> B:51:0x01bf). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        ProfileCredentialsProvider$resolve$1 profileCredentialsProvider$resolve$1;
        Looper looper;
        InterfaceC57843yq interfaceC57843yq2;
        InterfaceC5148Go interfaceC5148Go;
        java.lang.Object obj;
        final Looper looper2;
        InterfaceC5148Go interfaceC5148Go2;
        HH<java.lang.String> hh;
        java.lang.Object obj2;
        final FileWriter fileWriter;
        InterfaceC57843yq interfaceC57843yq3;
        final Ref.ObjectRef objectRef;
        java.lang.Object objResolve;
        HH<java.lang.String> hh2;
        Ref.ObjectRef objectRef2;
        T t;
        java.util.Iterator it;
        java.lang.Object obj3;
        HH<java.lang.String> hh3;
        java.util.Iterator it2;
        Ref.ObjectRef objectRef3;
        java.lang.Object objResolve2;
        if (continuation instanceof ProfileCredentialsProvider$resolve$1) {
            profileCredentialsProvider$resolve$1 = (ProfileCredentialsProvider$resolve$1) continuation;
            int i = profileCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                profileCredentialsProvider$resolve$1 = new ProfileCredentialsProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object obj4 = profileCredentialsProvider$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = profileCredentialsProvider$resolve$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj4);
            CoroutineContext context = profileCredentialsProvider$resolve$1.getContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Looper.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
            HL hl = this.OLrzqt;
            java.lang.String str = this.AEQbTJ;
            ObjectOutput objectOutput = this.EZpvd;
            profileCredentialsProvider$resolve$1.L$0 = this;
            profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq;
            profileCredentialsProvider$resolve$1.L$2 = interfaceC5148GoOLrzqt;
            profileCredentialsProvider$resolve$1.label = 1;
            java.lang.Object objEZpvd = ObjectInput.EZpvd(hl, str, objectOutput, profileCredentialsProvider$resolve$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            looper = this;
            interfaceC57843yq2 = interfaceC57843yq;
            interfaceC5148Go = interfaceC5148GoOLrzqt;
            obj = objEZpvd;
        } else if (i2 == 1) {
            interfaceC5148Go = (InterfaceC5148Go) profileCredentialsProvider$resolve$1.L$2;
            interfaceC57843yq2 = (InterfaceC57843yq) profileCredentialsProvider$resolve$1.L$1;
            looper = (Looper) profileCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            obj = obj4;
        } else if (i2 == 2) {
            hh = (HH) profileCredentialsProvider$resolve$1.L$4;
            FileWriter fileWriter2 = (FileWriter) profileCredentialsProvider$resolve$1.L$3;
            InterfaceC5148Go interfaceC5148Go3 = (InterfaceC5148Go) profileCredentialsProvider$resolve$1.L$2;
            InterfaceC57843yq interfaceC57843yq4 = (InterfaceC57843yq) profileCredentialsProvider$resolve$1.L$1;
            Looper looper3 = (Looper) profileCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            looper2 = looper3;
            interfaceC57843yq3 = interfaceC57843yq4;
            interfaceC5148Go2 = interfaceC5148Go3;
            fileWriter = fileWriter2;
            obj2 = obj4;
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go2, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Resolving credentials from " + this.this$0.AEQbTJ(fileWriter.AEQbTJ());
                }
            }, 1, null);
            objectRef = new Ref.ObjectRef();
            profileCredentialsProvider$resolve$1.L$0 = looper2;
            profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq3;
            profileCredentialsProvider$resolve$1.L$2 = interfaceC5148Go2;
            profileCredentialsProvider$resolve$1.L$3 = fileWriter;
            profileCredentialsProvider$resolve$1.L$4 = hh;
            profileCredentialsProvider$resolve$1.L$5 = objectRef;
            profileCredentialsProvider$resolve$1.L$6 = objectRef;
            profileCredentialsProvider$resolve$1.label = 3;
            objResolve = ((InterfaceC52805wZ) obj2).resolve(interfaceC57843yq3, profileCredentialsProvider$resolve$1);
            if (objResolve != objCopydefault) {
                return objCopydefault;
            }
            hh2 = hh;
            objectRef2 = objectRef;
            t = objResolve;
            objectRef2.element = t;
            it = fileWriter.EZpvd().iterator();
            if (!it.hasNext()) {
            }
        } else if (i2 == 3) {
            objectRef2 = (Ref.ObjectRef) profileCredentialsProvider$resolve$1.L$6;
            objectRef = (Ref.ObjectRef) profileCredentialsProvider$resolve$1.L$5;
            hh2 = (HH) profileCredentialsProvider$resolve$1.L$4;
            fileWriter = (FileWriter) profileCredentialsProvider$resolve$1.L$3;
            interfaceC5148Go2 = (InterfaceC5148Go) profileCredentialsProvider$resolve$1.L$2;
            interfaceC57843yq3 = (InterfaceC57843yq) profileCredentialsProvider$resolve$1.L$1;
            looper2 = (Looper) profileCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            t = obj4;
            objectRef2.element = t;
            it = fileWriter.EZpvd().iterator();
            if (!it.hasNext()) {
            }
        } else if (i2 == 4) {
            it = (java.util.Iterator) profileCredentialsProvider$resolve$1.L$5;
            objectRef = (Ref.ObjectRef) profileCredentialsProvider$resolve$1.L$4;
            hh2 = (HH) profileCredentialsProvider$resolve$1.L$3;
            InterfaceC5148Go interfaceC5148Go4 = (InterfaceC5148Go) profileCredentialsProvider$resolve$1.L$2;
            InterfaceC57843yq interfaceC57843yq5 = (InterfaceC57843yq) profileCredentialsProvider$resolve$1.L$1;
            Looper looper4 = (Looper) profileCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            looper2 = looper4;
            interfaceC57843yq3 = interfaceC57843yq5;
            interfaceC5148Go2 = interfaceC5148Go4;
            obj3 = obj4;
            hh3 = hh2;
            Ref.ObjectRef objectRef4 = objectRef;
            it2 = it;
            objectRef3 = objectRef4;
            profileCredentialsProvider$resolve$1.L$0 = looper2;
            profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq3;
            profileCredentialsProvider$resolve$1.L$2 = interfaceC5148Go2;
            profileCredentialsProvider$resolve$1.L$3 = hh3;
            profileCredentialsProvider$resolve$1.L$4 = objectRef3;
            profileCredentialsProvider$resolve$1.L$5 = it2;
            profileCredentialsProvider$resolve$1.L$6 = objectRef3;
            profileCredentialsProvider$resolve$1.label = 5;
            objResolve2 = ((InterfaceC52805wZ) obj3).resolve(interfaceC57843yq3, profileCredentialsProvider$resolve$1);
            if (objResolve2 != objCopydefault) {
            }
        } else {
            if (i2 != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef3 = (Ref.ObjectRef) profileCredentialsProvider$resolve$1.L$6;
            it2 = (java.util.Iterator) profileCredentialsProvider$resolve$1.L$5;
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) profileCredentialsProvider$resolve$1.L$4;
            hh3 = (HH) profileCredentialsProvider$resolve$1.L$3;
            interfaceC5148Go2 = (InterfaceC5148Go) profileCredentialsProvider$resolve$1.L$2;
            interfaceC57843yq3 = (InterfaceC57843yq) profileCredentialsProvider$resolve$1.L$1;
            looper2 = (Looper) profileCredentialsProvider$resolve$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            T t2 = obj4;
            objectRef3.element = t2;
            it = it2;
            objectRef = objectRef5;
            hh2 = hh3;
            if (!it.hasNext()) {
                final FileReader fileReader = (FileReader) it.next();
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go2, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$4$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Assuming role `" + fileReader.AEQbTJ() + '`';
                    }
                }, 1, null);
                InterfaceC52697wV interfaceC52697wV = (InterfaceC52697wV) objectRef.element;
                profileCredentialsProvider$resolve$1.L$0 = looper2;
                profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq3;
                profileCredentialsProvider$resolve$1.L$2 = interfaceC5148Go2;
                profileCredentialsProvider$resolve$1.L$3 = hh2;
                profileCredentialsProvider$resolve$1.L$4 = objectRef;
                profileCredentialsProvider$resolve$1.L$5 = it;
                profileCredentialsProvider$resolve$1.L$6 = null;
                profileCredentialsProvider$resolve$1.label = 4;
                java.lang.Object objOLrzqt = looper2.OLrzqt(fileReader, interfaceC52697wV, hh2, profileCredentialsProvider$resolve$1);
                obj3 = objOLrzqt;
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                hh3 = hh2;
                Ref.ObjectRef objectRef42 = objectRef;
                it2 = it;
                objectRef3 = objectRef42;
                profileCredentialsProvider$resolve$1.L$0 = looper2;
                profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq3;
                profileCredentialsProvider$resolve$1.L$2 = interfaceC5148Go2;
                profileCredentialsProvider$resolve$1.L$3 = hh3;
                profileCredentialsProvider$resolve$1.L$4 = objectRef3;
                profileCredentialsProvider$resolve$1.L$5 = it2;
                profileCredentialsProvider$resolve$1.L$6 = objectRef3;
                profileCredentialsProvider$resolve$1.label = 5;
                objResolve2 = ((InterfaceC52805wZ) obj3).resolve(interfaceC57843yq3, profileCredentialsProvider$resolve$1);
                if (objResolve2 != objCopydefault) {
                    return objCopydefault;
                }
                objectRef5 = objectRef3;
                t2 = objResolve2;
                objectRef3.element = t2;
                it = it2;
                objectRef = objectRef5;
                hh2 = hh3;
                if (!it.hasNext()) {
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go2, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$5
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Obtained credentials from profile; expiration=");
                            C5173Hn c5173HnAEQbTJ = objectRef.element.AEQbTJ();
                            sb.append(c5173HnAEQbTJ != null ? c5173HnAEQbTJ.OLrzqt(TimestampFormat.ISO_8601) : null);
                            return sb.toString();
                        }
                    }, 1, null);
                    return objectRef.element;
                }
            }
        }
        final ObjectOutputStream objectOutputStream = (ObjectOutputStream) obj;
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Loading credentials from profile `" + objectOutputStream.OLrzqt().OLrzqt() + '`';
            }
        }, 1, null);
        FileWriter fileWriterOLrzqt = FileWriter.AEQbTJ.OLrzqt(objectOutputStream);
        java.lang.String str2 = looper.AEQbTJ;
        HH<java.lang.String> hhAEQbTJ = HE.AEQbTJ(new ProfileCredentialsProvider$resolve$region$1(looper, str2 != null ? objectOutputStream.copydefault().get(str2) : null, interfaceC57843yq2, null));
        FileInputStream fileInputStreamAEQbTJ = fileWriterOLrzqt.AEQbTJ();
        profileCredentialsProvider$resolve$1.L$0 = looper;
        profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq2;
        profileCredentialsProvider$resolve$1.L$2 = interfaceC5148Go;
        profileCredentialsProvider$resolve$1.L$3 = fileWriterOLrzqt;
        profileCredentialsProvider$resolve$1.L$4 = hhAEQbTJ;
        profileCredentialsProvider$resolve$1.label = 2;
        java.lang.Object objCopydefault2 = looper.copydefault(fileInputStreamAEQbTJ, hhAEQbTJ, profileCredentialsProvider$resolve$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        looper2 = looper;
        interfaceC5148Go2 = interfaceC5148Go;
        hh = hhAEQbTJ;
        obj2 = objCopydefault2;
        fileWriter = fileWriterOLrzqt;
        interfaceC57843yq3 = interfaceC57843yq2;
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go2, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider$resolve$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Resolving credentials from " + this.this$0.AEQbTJ(fileWriter.AEQbTJ());
            }
        }, 1, null);
        objectRef = new Ref.ObjectRef();
        profileCredentialsProvider$resolve$1.L$0 = looper2;
        profileCredentialsProvider$resolve$1.L$1 = interfaceC57843yq3;
        profileCredentialsProvider$resolve$1.L$2 = interfaceC5148Go2;
        profileCredentialsProvider$resolve$1.L$3 = fileWriter;
        profileCredentialsProvider$resolve$1.L$4 = hh;
        profileCredentialsProvider$resolve$1.L$5 = objectRef;
        profileCredentialsProvider$resolve$1.L$6 = objectRef;
        profileCredentialsProvider$resolve$1.label = 3;
        objResolve = ((InterfaceC52805wZ) obj2).resolve(interfaceC57843yq3, profileCredentialsProvider$resolve$1);
        if (objResolve != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(FileInputStream fileInputStream, HH<java.lang.String> hh, Continuation<? super InterfaceC52805wZ> continuation) throws java.lang.Throwable {
        ProfileCredentialsProvider$toCredentialsProvider$1 profileCredentialsProvider$toCredentialsProvider$1;
        Looper looper;
        java.lang.String str;
        java.lang.String str2;
        if (continuation instanceof ProfileCredentialsProvider$toCredentialsProvider$1) {
            profileCredentialsProvider$toCredentialsProvider$1 = (ProfileCredentialsProvider$toCredentialsProvider$1) continuation;
            int i = profileCredentialsProvider$toCredentialsProvider$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileCredentialsProvider$toCredentialsProvider$1.label = i - Integer.MIN_VALUE;
            } else {
                profileCredentialsProvider$toCredentialsProvider$1 = new ProfileCredentialsProvider$toCredentialsProvider$1(this, continuation);
            }
        }
        java.lang.Object obj = profileCredentialsProvider$toCredentialsProvider$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = profileCredentialsProvider$toCredentialsProvider$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (fileInputStream instanceof FileInputStream.Activity) {
                FileInputStream.Activity activity = (FileInputStream.Activity) fileInputStream;
                InterfaceC52805wZ interfaceC52805wZ = this.copydefault.get(activity.KWHzl());
                if (interfaceC52805wZ != null) {
                    return interfaceC52805wZ;
                }
                throw new ProviderConfigurationException("unknown credentials source: " + activity.KWHzl(), null, 2, null);
            }
            if (fileInputStream instanceof FileInputStream.StateListAnimator) {
                return new UserHandle(((FileInputStream.StateListAnimator) fileInputStream).AEQbTJ());
            }
            if (fileInputStream instanceof FileInputStream.PendingIntent) {
                FileInputStream.PendingIntent pendingIntent = (FileInputStream.PendingIntent) fileInputStream;
                java.lang.String strAEQbTJ = pendingIntent.AEQbTJ();
                java.lang.String strOLrzqt = pendingIntent.OLrzqt();
                profileCredentialsProvider$toCredentialsProvider$1.L$0 = this;
                profileCredentialsProvider$toCredentialsProvider$1.L$1 = fileInputStream;
                profileCredentialsProvider$toCredentialsProvider$1.L$2 = strAEQbTJ;
                profileCredentialsProvider$toCredentialsProvider$1.L$3 = strOLrzqt;
                profileCredentialsProvider$toCredentialsProvider$1.label = 1;
                java.lang.Object objKWHzl = hh.KWHzl(profileCredentialsProvider$toCredentialsProvider$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                looper = this;
                str = strAEQbTJ;
                str2 = strOLrzqt;
                obj = objKWHzl;
            } else {
                if (fileInputStream instanceof FileInputStream.Application) {
                    FileInputStream.Application application = (FileInputStream.Application) fileInputStream;
                    return new GetChars(application.copydefault(), application.KWHzl(), application.OLrzqt(), application.AEQbTJ(), application.EZpvd(), this.KWHzl, this.OLrzqt, null, 128, null);
                }
                if (fileInputStream instanceof FileInputStream.TaskDescription) {
                    FileInputStream.TaskDescription taskDescription = (FileInputStream.TaskDescription) fileInputStream;
                    return new GetChars(taskDescription.OLrzqt(), taskDescription.AEQbTJ(), taskDescription.copydefault(), taskDescription.EZpvd(), null, this.KWHzl, this.OLrzqt, null, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, null);
                }
                if (fileInputStream instanceof FileInputStream.ActionBar) {
                    return new Parcel(((FileInputStream.ActionBar) fileInputStream).OLrzqt(), null, 0L, 0L, 14, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str3 = (java.lang.String) profileCredentialsProvider$toCredentialsProvider$1.L$3;
            java.lang.String str4 = (java.lang.String) profileCredentialsProvider$toCredentialsProvider$1.L$2;
            FileInputStream fileInputStream2 = (FileInputStream) profileCredentialsProvider$toCredentialsProvider$1.L$1;
            looper = (Looper) profileCredentialsProvider$toCredentialsProvider$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str3;
            fileInputStream = fileInputStream2;
            str = str4;
        }
        return new ParcelableSpan(str, str2, (java.lang.String) obj, ((FileInputStream.PendingIntent) fileInputStream).EZpvd(), 0L, looper.OLrzqt, looper.KWHzl, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(FileReader fileReader, InterfaceC52697wV interfaceC52697wV, HH<java.lang.String> hh, Continuation<? super InterfaceC52805wZ> continuation) throws java.lang.Throwable {
        ProfileCredentialsProvider$toCredentialsProvider$2 profileCredentialsProvider$toCredentialsProvider$2;
        Looper looper;
        java.lang.String str;
        InterfaceC52805wZ interfaceC52805wZ;
        if (continuation instanceof ProfileCredentialsProvider$toCredentialsProvider$2) {
            profileCredentialsProvider$toCredentialsProvider$2 = (ProfileCredentialsProvider$toCredentialsProvider$2) continuation;
            int i = profileCredentialsProvider$toCredentialsProvider$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileCredentialsProvider$toCredentialsProvider$2.label = i - Integer.MIN_VALUE;
            } else {
                profileCredentialsProvider$toCredentialsProvider$2 = new ProfileCredentialsProvider$toCredentialsProvider$2(this, continuation);
            }
        }
        java.lang.Object obj = profileCredentialsProvider$toCredentialsProvider$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = profileCredentialsProvider$toCredentialsProvider$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            UserHandle userHandle = new UserHandle(interfaceC52697wV);
            java.lang.String strAEQbTJ = fileReader.AEQbTJ();
            profileCredentialsProvider$toCredentialsProvider$2.L$0 = this;
            profileCredentialsProvider$toCredentialsProvider$2.L$1 = fileReader;
            profileCredentialsProvider$toCredentialsProvider$2.L$2 = userHandle;
            profileCredentialsProvider$toCredentialsProvider$2.L$3 = strAEQbTJ;
            profileCredentialsProvider$toCredentialsProvider$2.label = 1;
            java.lang.Object objKWHzl = hh.KWHzl(profileCredentialsProvider$toCredentialsProvider$2);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            looper = this;
            str = strAEQbTJ;
            interfaceC52805wZ = userHandle;
            obj = objKWHzl;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) profileCredentialsProvider$toCredentialsProvider$2.L$3;
            InterfaceC52805wZ interfaceC52805wZ2 = (InterfaceC52805wZ) profileCredentialsProvider$toCredentialsProvider$2.L$2;
            FileReader fileReader2 = (FileReader) profileCredentialsProvider$toCredentialsProvider$2.L$1;
            looper = (Looper) profileCredentialsProvider$toCredentialsProvider$2.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str2;
            interfaceC52805wZ = interfaceC52805wZ2;
            fileReader = fileReader2;
        }
        return new Layout(interfaceC52805wZ, str, (java.lang.String) obj, fileReader.OLrzqt(), fileReader.copydefault(), 0L, looper.KWHzl, 32, null);
    }

    public final java.lang.String AEQbTJ(FileInputStream fileInputStream) {
        if (fileInputStream instanceof FileInputStream.Activity) {
            return "named source " + ((FileInputStream.Activity) fileInputStream).KWHzl();
        }
        if (fileInputStream instanceof FileInputStream.StateListAnimator) {
            return "static credentials";
        }
        if (fileInputStream instanceof FileInputStream.PendingIntent) {
            return "web identity token";
        }
        if (fileInputStream instanceof FileInputStream.Application) {
            return "single sign-on (session)";
        }
        if (fileInputStream instanceof FileInputStream.TaskDescription) {
            return "single sign-on (legacy)";
        }
        if (fileInputStream instanceof FileInputStream.ActionBar) {
            return "process";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.util.Iterator<Map.Entry<java.lang.String, InterfaceC52805wZ>> it = this.copydefault.entrySet().iterator();
        while (it.hasNext()) {
            CB.copydefault(it.next().getValue());
        }
    }
}
