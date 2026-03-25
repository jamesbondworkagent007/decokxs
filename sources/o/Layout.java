package o;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.sdk.kotlin.runtime.auth.credentials.StsAssumeRoleCredentialsProvider$resolve$1;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.RegionDisabledException;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.AbstractC54779xV;
import o.C57578yl;
import o.C59462zhW;
import o.InterfaceC5148Go;
import o.TextClassifier;
import o.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Layout implements InterfaceC52805wZ {
    public final InterfaceC3972Aw AEQbTJ;
    public final Matrix EZpvd;
    public final java.lang.String KWHzl;
    public final InterfaceC52805wZ copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 o.wZ)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 long)
  (r8v0 o.Aw)
 A[MD:(o.wZ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, o.Aw):void (m)] call: o.Layout.<init>(o.wZ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, o.Aw):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Layout(InterfaceC52805wZ interfaceC52805wZ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, InterfaceC3972Aw interfaceC3972Aw, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC52805wZ, str, str2, str3, str4, j, interfaceC3972Aw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Matrix AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC52805wZ EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3972Aw KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public Layout(@NotNull InterfaceC52805wZ interfaceC52805wZ, @NotNull Matrix matrix, java.lang.String str, InterfaceC3972Aw interfaceC3972Aw) {
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        Intrinsics.checkNotNullParameter(matrix, "");
        this.copydefault = interfaceC52805wZ;
        this.EZpvd = matrix;
        this.KWHzl = str;
        this.AEQbTJ = interfaceC3972Aw;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Layout(InterfaceC52805wZ interfaceC52805wZ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, InterfaceC3972Aw interfaceC3972Aw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jEZpvd;
        java.lang.String str5 = (i & 4) != 0 ? null : str2;
        java.lang.String str6 = (i & 8) != 0 ? null : str3;
        java.lang.String str7 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(900, DurationUnit.SECONDS);
        } else {
            jEZpvd = j;
        }
        this(interfaceC52805wZ, str, str5, str6, str7, jEZpvd, (i & 64) != 0 ? null : interfaceC3972Aw, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Layout(InterfaceC52805wZ interfaceC52805wZ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, InterfaceC3972Aw interfaceC3972Aw) {
        this(interfaceC52805wZ, new Matrix(str, str3, str4, j, null, null, null, null, null, null, null, 2032, null), str2, interfaceC3972Aw);
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.yq */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[Catch: all -> 0x0138, TryCatch #1 {all -> 0x0138, blocks: (B:12:0x002e, B:28:0x00e8, B:45:0x013b, B:47:0x0144, B:48:0x0167, B:49:0x0168, B:50:0x016f, B:21:0x006f, B:23:0x008c, B:24:0x0090), top: B:57:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168 A[Catch: all -> 0x0138, TryCatch #1 {all -> 0x0138, blocks: (B:12:0x002e, B:28:0x00e8, B:45:0x013b, B:47:0x0144, B:48:0x0167, B:49:0x0168, B:50:0x016f, B:21:0x006f, B:23:0x008c, B:24:0x0090), top: B:57:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull final InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        StsAssumeRoleCredentialsProvider$resolve$1 stsAssumeRoleCredentialsProvider$resolve$1;
        InterfaceC5148Go interfaceC5148GoOLrzqt;
        WindowInsets windowInsetsCopydefault;
        InterfaceC5148Go interfaceC5148Go;
        java.lang.String strOLrzqt;
        if (continuation instanceof StsAssumeRoleCredentialsProvider$resolve$1) {
            stsAssumeRoleCredentialsProvider$resolve$1 = (StsAssumeRoleCredentialsProvider$resolve$1) continuation;
            int i = stsAssumeRoleCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stsAssumeRoleCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                stsAssumeRoleCredentialsProvider$resolve$1 = new StsAssumeRoleCredentialsProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object obj = stsAssumeRoleCredentialsProvider$resolve$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = stsAssumeRoleCredentialsProvider$resolve$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineContext context = stsAssumeRoleCredentialsProvider$resolve$1.getContext();
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Layout.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsAssumeRoleCredentialsProvider$resolve$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "retrieving assumed credentials";
                    }
                }, 1, null);
                final FZ fzKWHzl = FX.KWHzl(stsAssumeRoleCredentialsProvider$resolve$1.getContext());
                windowInsetsCopydefault = WindowInsets.valueOf.copydefault(new Function1<WindowInsets.ActionBar.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsAssumeRoleCredentialsProvider$resolve$client$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets.ActionBar.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull WindowInsets.ActionBar.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        String strOLrzqt2 = this.$provider.OLrzqt();
                        if (strOLrzqt2 == null) {
                            strOLrzqt2 = "aws-global";
                        }
                        activity.OLrzqt(strOLrzqt2);
                        activity.AEQbTJ(this.$provider.EZpvd());
                        activity.copydefault(this.$provider.KWHzl());
                        activity.OLrzqt(fzKWHzl);
                        activity.KWHzl((AbstractC54779xV) interfaceC57843yq.OLrzqt(C57578yl.EZpvd.EZpvd()));
                    }
                });
                try {
                    TextClassifier.TaskDescription taskDescription = new TextClassifier.TaskDescription();
                    Matrix matrixAEQbTJ = AEQbTJ();
                    taskDescription.EZpvd(matrixAEQbTJ.valueOf());
                    taskDescription.OLrzqt(matrixAEQbTJ.EZpvd());
                    java.lang.String strAhwBna = matrixAEQbTJ.AhwBna();
                    if (strAhwBna == null) {
                        strAhwBna = NoCopySpan.defaultSessionName$default(null, 1, null);
                    }
                    taskDescription.KWHzl(strAhwBna);
                    taskDescription.EZpvd(C56443yFo.AEQbTJ((int) C59462zhW.DbNXlk(matrixAEQbTJ.AEQbTJ())));
                    taskDescription.copydefault(matrixAEQbTJ.OLrzqt());
                    taskDescription.copydefault(matrixAEQbTJ.copydefault());
                    taskDescription.EZpvd(matrixAEQbTJ.KWHzl());
                    taskDescription.KWHzl(matrixAEQbTJ.DbNXlk());
                    taskDescription.AEQbTJ(matrixAEQbTJ.AYXKKw());
                    taskDescription.djBIcL(matrixAEQbTJ.gEmmrt());
                    taskDescription.AYXKKw(matrixAEQbTJ.djBIcL());
                    TextClassifier textClassifierEZpvd = taskDescription.EZpvd();
                    stsAssumeRoleCredentialsProvider$resolve$1.L$0 = interfaceC5148GoOLrzqt;
                    stsAssumeRoleCredentialsProvider$resolve$1.L$1 = windowInsetsCopydefault;
                    stsAssumeRoleCredentialsProvider$resolve$1.label = 1;
                    java.lang.Object objAEQbTJ = windowInsetsCopydefault.AEQbTJ(textClassifierEZpvd, stsAssumeRoleCredentialsProvider$resolve$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    interfaceC5148Go = interfaceC5148GoOLrzqt;
                    obj = objAEQbTJ;
                } catch (java.lang.Exception e) {
                    e = e;
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsAssumeRoleCredentialsProvider$resolve$resp$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "sts refused to grant assumed role credentials";
                        }
                    }, 1, null);
                    if (!(e instanceof RegionDisabledException)) {
                        throw new ProviderConfigurationException("STS is not activated in the requested region (" + windowInsetsCopydefault.OLrzqt().AkhnZx() + "). Please check your configuration and activate STS in the target region if necessary", e);
                    }
                    throw new CredentialsProviderException("failed to assume role from STS", e);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                windowInsetsCopydefault = (WindowInsets) stsAssumeRoleCredentialsProvider$resolve$1.L$1;
                interfaceC5148Go = (InterfaceC5148Go) stsAssumeRoleCredentialsProvider$resolve$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (java.lang.Exception e2) {
                    InterfaceC5148Go interfaceC5148Go2 = interfaceC5148Go;
                    e = e2;
                    interfaceC5148GoOLrzqt = interfaceC5148Go2;
                    InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsAssumeRoleCredentialsProvider$resolve$resp$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "sts refused to grant assumed role credentials";
                        }
                    }, 1, null);
                    if (!(e instanceof RegionDisabledException)) {
                    }
                }
            }
            ExtractedText extractedText = (ExtractedText) obj;
            windowInsetsCopydefault.close();
            final OnEditorActionListener onEditorActionListenerOLrzqt = extractedText.OLrzqt();
            if (onEditorActionListenerOLrzqt == null) {
                throw new CredentialsProviderException("STS credentials must not be null", null, 2, null);
            }
            TextView textViewAEQbTJ = extractedText.AEQbTJ();
            java.lang.String strCopydefault = (textViewAEQbTJ == null || (strOLrzqt = textViewAEQbTJ.OLrzqt()) == null) ? null : Mode.OLrzqt.EZpvd(strOLrzqt).copydefault();
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsAssumeRoleCredentialsProvider$resolve$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "obtained assumed credentials; expiration=" + onEditorActionListenerOLrzqt.EZpvd().OLrzqt(TimestampFormat.ISO_8601);
                }
            }, 1, null);
            return Spanned.AEQbTJ(onEditorActionListenerOLrzqt.KWHzl(), onEditorActionListenerOLrzqt.OLrzqt(), onEditorActionListenerOLrzqt.copydefault(), onEditorActionListenerOLrzqt.EZpvd(), "AssumeRoleProvider", strCopydefault);
        } catch (java.lang.Throwable th) {
            interfaceC57843yq.close();
            throw th;
        }
    }
}
