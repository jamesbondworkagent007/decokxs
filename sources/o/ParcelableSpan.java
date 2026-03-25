package o;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import aws.sdk.kotlin.runtime.auth.credentials.StsWebIdentityCredentialsProvider$resolve$1;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
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
import o.InputConnection;
import o.InterfaceC5148Go;
import o.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelableSpan implements InterfaceC52805wZ {
    public static final Application copydefault = new Application(null);
    public final HL AEQbTJ;
    public final InterfaceC3972Aw EZpvd;
    public final java.lang.String KWHzl;
    public final Paint OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 long)
  (r7v0 o.HL)
  (r8v0 o.Aw)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, o.HL, o.Aw):void (m)] call: o.ParcelableSpan.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, o.HL, o.Aw):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParcelableSpan(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, HL hl, InterfaceC3972Aw interfaceC3972Aw, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, hl, interfaceC3972Aw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HL AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3972Aw EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    public ParcelableSpan(@NotNull Paint paint, java.lang.String str, @NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw) {
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(hl, "");
        this.OLrzqt = paint;
        this.KWHzl = str;
        this.AEQbTJ = hl;
        this.EZpvd = interfaceC3972Aw;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParcelableSpan(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, HL hl, InterfaceC3972Aw interfaceC3972Aw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jEZpvd;
        java.lang.String str5 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(900, DurationUnit.SECONDS);
        } else {
            jEZpvd = j;
        }
        this(str, str2, str3, str5, jEZpvd, (i & 32) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 64) != 0 ? null : interfaceC3972Aw, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ParcelableSpan(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, HL hl, InterfaceC3972Aw interfaceC3972Aw) {
        this(new Paint(str, str2, str4, j, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), str3, hl, interfaceC3972Aw);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(hl, "");
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ParcelableSpan.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX INFO: renamed from: fromEnvironment-TUY-ock$default, reason: not valid java name */
        public static /* synthetic */ ParcelableSpan m8551fromEnvironmentTUYock$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, HL hl, InterfaceC3972Aw interfaceC3972Aw, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                j = C59519zia.EZpvd(900, DurationUnit.SECONDS);
            }
            if ((i & 32) != 0) {
                hl = HL.OLrzqt.copydefault();
            }
            if ((i & 64) != 0) {
                interfaceC3972Aw = null;
            }
            return application.OLrzqt(str, str2, str3, str4, j, hl, interfaceC3972Aw);
        }

        public final ParcelableSpan OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, @NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw) {
            java.lang.Object objAEQbTJ;
            java.lang.Object objAEQbTJ2;
            Intrinsics.checkNotNullParameter(hl, "");
            IOException iOException = IOException.zsXlph;
            C59492zi<java.lang.String> c59492ziIwGUEr = iOException.iwGUEr();
            if (str == null) {
                objAEQbTJ = C59333zf.AEQbTJ(c59492ziIwGUEr, hl);
                if (objAEQbTJ == null) {
                    throw new ProviderConfigurationException("Required field `roleArn` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `" + c59492ziIwGUEr.OLrzqt() + "`, or set the JVM system property `" + c59492ziIwGUEr.EZpvd() + '`', null, 2, null);
                }
            } else {
                objAEQbTJ = str;
            }
            java.lang.String str5 = (java.lang.String) objAEQbTJ;
            C59492zi<java.lang.String> c59492ziAuCTelauCTel = iOException.AuCTelauCTel();
            if (str2 == null) {
                objAEQbTJ2 = C59333zf.AEQbTJ(c59492ziAuCTelauCTel, hl);
                if (objAEQbTJ2 == null) {
                    throw new ProviderConfigurationException("Required field `webIdentityTokenFilePath` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `" + c59492ziAuCTelauCTel.OLrzqt() + "`, or set the JVM system property `" + c59492ziAuCTelauCTel.EZpvd() + '`', null, 2, null);
                }
            } else {
                objAEQbTJ2 = str2;
            }
            return new ParcelableSpan(str5, (java.lang.String) objAEQbTJ2, str3 == null ? (java.lang.String) C59333zf.AEQbTJ(iOException.ejfBZ(), hl) : str3, str4, j, hl, interfaceC3972Aw, null);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0162 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, o.WindowInsets] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) throws java.lang.Throwable {
        StsWebIdentityCredentialsProvider$resolve$1 stsWebIdentityCredentialsProvider$resolve$1;
        WindowInsets windowInsetsCopydefault;
        java.lang.Throwable th;
        InterfaceC5148Go interfaceC5148GoOLrzqt;
        ParcelableSpan parcelableSpan;
        final InterfaceC57843yq interfaceC57843yq2;
        Paint paint;
        final ParcelableSpan parcelableSpan2;
        java.lang.String strCopydefault;
        java.lang.Exception e;
        ?? r13;
        InterfaceC5148Go interfaceC5148Go;
        final OnEditorActionListener onEditorActionListenerCopydefault;
        java.lang.String strOLrzqt;
        Mode modeEZpvd;
        if (continuation instanceof StsWebIdentityCredentialsProvider$resolve$1) {
            stsWebIdentityCredentialsProvider$resolve$1 = (StsWebIdentityCredentialsProvider$resolve$1) continuation;
            int i = stsWebIdentityCredentialsProvider$resolve$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stsWebIdentityCredentialsProvider$resolve$1.label = i - Integer.MIN_VALUE;
            } else {
                stsWebIdentityCredentialsProvider$resolve$1 = new StsWebIdentityCredentialsProvider$resolve$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stsWebIdentityCredentialsProvider$resolve$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stsWebIdentityCredentialsProvider$resolve$1.label;
        java.lang.String strCopydefault2 = null;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                CoroutineContext context = stsWebIdentityCredentialsProvider$resolve$1.getContext();
                java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Layout.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsWebIdentityCredentialsProvider$resolve$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "retrieving assumed credentials via web identity";
                    }
                }, 1, null);
                Paint paint2 = this.OLrzqt;
                HL hl = this.AEQbTJ;
                java.lang.String strGEmmrt2 = paint2.gEmmrt();
                stsWebIdentityCredentialsProvider$resolve$1.L$0 = this;
                stsWebIdentityCredentialsProvider$resolve$1.L$1 = interfaceC57843yq;
                stsWebIdentityCredentialsProvider$resolve$1.L$2 = interfaceC5148GoOLrzqt;
                stsWebIdentityCredentialsProvider$resolve$1.L$3 = this;
                stsWebIdentityCredentialsProvider$resolve$1.L$4 = paint2;
                stsWebIdentityCredentialsProvider$resolve$1.label = 1;
                java.lang.Object objKWHzl = hl.KWHzl(strGEmmrt2, stsWebIdentityCredentialsProvider$resolve$1);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                parcelableSpan = this;
                interfaceC57843yq2 = interfaceC57843yq;
                paint = paint2;
                objCopydefault = objKWHzl;
                parcelableSpan2 = parcelableSpan;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    WindowInsets windowInsets = (WindowInsets) stsWebIdentityCredentialsProvider$resolve$1.L$1;
                    interfaceC5148Go = (InterfaceC5148Go) stsWebIdentityCredentialsProvider$resolve$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                        r13 = windowInsets;
                        ExtractedTextRequest extractedTextRequest = (ExtractedTextRequest) objCopydefault;
                        r13.close();
                        onEditorActionListenerCopydefault = extractedTextRequest.copydefault();
                        if (onEditorActionListenerCopydefault != null) {
                            throw new CredentialsProviderException("STS credentials must not be null", null, 2, null);
                        }
                        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsWebIdentityCredentialsProvider$resolve$3
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                super(0);
                            }

                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "obtained assumed credentials via web identity; expiration=" + onEditorActionListenerCopydefault.EZpvd().OLrzqt(TimestampFormat.ISO_8601);
                            }
                        }, 1, null);
                        TextView textViewOLrzqt = extractedTextRequest.OLrzqt();
                        if (textViewOLrzqt != null && (strOLrzqt = textViewOLrzqt.OLrzqt()) != null && (modeEZpvd = Mode.OLrzqt.EZpvd(strOLrzqt)) != null) {
                            strCopydefault2 = modeEZpvd.copydefault();
                        }
                        return Spanned.AEQbTJ(onEditorActionListenerCopydefault.KWHzl(), onEditorActionListenerCopydefault.OLrzqt(), onEditorActionListenerCopydefault.copydefault(), onEditorActionListenerCopydefault.EZpvd(), "WebIdentityToken", strCopydefault2);
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        interfaceC5148GoOLrzqt = interfaceC5148Go;
                        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsWebIdentityCredentialsProvider$resolve$resp$2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "sts refused to grant assumed role credentials from web identity";
                            }
                        }, 1, null);
                        throw new CredentialsProviderException("STS failed to assume role from web identity", e);
                    }
                }
                paint = (Paint) stsWebIdentityCredentialsProvider$resolve$1.L$4;
                parcelableSpan2 = (ParcelableSpan) stsWebIdentityCredentialsProvider$resolve$1.L$3;
                interfaceC5148GoOLrzqt = (InterfaceC5148Go) stsWebIdentityCredentialsProvider$resolve$1.L$2;
                interfaceC57843yq2 = (InterfaceC57843yq) stsWebIdentityCredentialsProvider$resolve$1.L$1;
                parcelableSpan = (ParcelableSpan) stsWebIdentityCredentialsProvider$resolve$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            byte[] bArr = (byte[]) objCopydefault;
            if (bArr == null || (strCopydefault = C59449zhJ.copydefault(bArr)) == null) {
                throw new CredentialsProviderException("failed to read webIdentityToken from " + paint.gEmmrt(), null, 2, null);
            }
            final FZ fzKWHzl = FX.KWHzl(stsWebIdentityCredentialsProvider$resolve$1.getContext());
            windowInsetsCopydefault = WindowInsets.valueOf.copydefault(new Function1<WindowInsets.ActionBar.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsWebIdentityCredentialsProvider$resolve$client$1
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
                    activity.OLrzqt(this.$provider.KWHzl());
                    activity.copydefault(this.$provider.EZpvd());
                    activity.OLrzqt(fzKWHzl);
                    activity.KWHzl((AbstractC54779xV) interfaceC57843yq2.OLrzqt(C57578yl.EZpvd.EZpvd()));
                }
            });
            try {
                InputConnection.Application application = new InputConnection.Application();
                application.OLrzqt(paint.OLrzqt());
                application.KWHzl(strCopydefault);
                application.AEQbTJ(C56443yFo.AEQbTJ((int) C59462zhW.DbNXlk(paint.AEQbTJ())));
                java.lang.String strValueOf = paint.valueOf();
                if (strValueOf == null) {
                    strValueOf = NoCopySpan.OLrzqt(parcelableSpan.AEQbTJ());
                }
                application.copydefault(strValueOf);
                application.AEQbTJ(paint.KWHzl());
                application.AEQbTJ(paint.EZpvd());
                application.EZpvd(paint.copydefault());
                InputConnection inputConnectionKWHzl = application.KWHzl();
                stsWebIdentityCredentialsProvider$resolve$1.L$0 = interfaceC5148GoOLrzqt;
                stsWebIdentityCredentialsProvider$resolve$1.L$1 = windowInsetsCopydefault;
                stsWebIdentityCredentialsProvider$resolve$1.L$2 = null;
                stsWebIdentityCredentialsProvider$resolve$1.L$3 = null;
                stsWebIdentityCredentialsProvider$resolve$1.L$4 = null;
                stsWebIdentityCredentialsProvider$resolve$1.label = 2;
                objCopydefault = windowInsetsCopydefault.copydefault(inputConnectionKWHzl, stsWebIdentityCredentialsProvider$resolve$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                r13 = windowInsetsCopydefault;
                interfaceC5148Go = interfaceC5148GoOLrzqt;
                ExtractedTextRequest extractedTextRequest2 = (ExtractedTextRequest) objCopydefault;
                r13.close();
                onEditorActionListenerCopydefault = extractedTextRequest2.copydefault();
                if (onEditorActionListenerCopydefault != null) {
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.StsWebIdentityCredentialsProvider$resolve$resp$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "sts refused to grant assumed role credentials from web identity";
                    }
                }, 1, null);
                throw new CredentialsProviderException("STS failed to assume role from web identity", e);
            } catch (java.lang.Throwable th2) {
                th = th2;
                windowInsetsCopydefault.close();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            windowInsetsCopydefault = interfaceC57843yq;
            th = th3;
        }
    }
}
