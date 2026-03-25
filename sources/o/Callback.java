package o;

import aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProviderKt$throwCredentialsResponseException$1;
import aws.sdk.kotlin.runtime.auth.credentials.EcsCredentialsProviderKt$tryParseErrorResponse$1;
import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import aws.smithy.kotlin.runtime.http.HttpStatusCode;
import com.google.common.base.Ascii;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C52427wL;
import o.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class Callback {
    public static final java.util.Set<DJ> AEQbTJ;
    public static final DH EZpvd;
    public static final DG KWHzl;
    public static final DH copydefault;

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(InterfaceC5039Cj interfaceC5039Cj, Continuation<?> continuation) throws java.lang.Throwable {
        EcsCredentialsProviderKt$throwCredentialsResponseException$1 ecsCredentialsProviderKt$throwCredentialsResponseException$1;
        java.lang.String str;
        if (continuation instanceof EcsCredentialsProviderKt$throwCredentialsResponseException$1) {
            ecsCredentialsProviderKt$throwCredentialsResponseException$1 = (EcsCredentialsProviderKt$throwCredentialsResponseException$1) continuation;
            int i = ecsCredentialsProviderKt$throwCredentialsResponseException$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecsCredentialsProviderKt$throwCredentialsResponseException$1.label = i - Integer.MIN_VALUE;
            } else {
                ecsCredentialsProviderKt$throwCredentialsResponseException$1 = new EcsCredentialsProviderKt$throwCredentialsResponseException$1(continuation);
            }
        }
        java.lang.Object objKWHzl = ecsCredentialsProviderKt$throwCredentialsResponseException$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ecsCredentialsProviderKt$throwCredentialsResponseException$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            ecsCredentialsProviderKt$throwCredentialsResponseException$1.L$0 = interfaceC5039Cj;
            ecsCredentialsProviderKt$throwCredentialsResponseException$1.label = 1;
            objKWHzl = KWHzl(interfaceC5039Cj, ecsCredentialsProviderKt$throwCredentialsResponseException$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC5039Cj = (InterfaceC5039Cj) ecsCredentialsProviderKt$throwCredentialsResponseException$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        LocaleList.Application application = (LocaleList.Application) objKWHzl;
        if (application != null) {
            str = "code=" + application.OLrzqt() + "; message=" + application.AEQbTJ();
            if (str == null) {
                str = "HTTP " + interfaceC5039Cj.OLrzqt();
            }
        }
        CredentialsProviderException credentialsProviderException = new CredentialsProviderException("Error retrieving credentials from container service: " + str, null, 2, null);
        InterfaceC56293yA interfaceC56293yAOLrzqt = credentialsProviderException.getSdkErrorMetadata().OLrzqt();
        C52427wL.Application application2 = C52427wL.KWHzl;
        interfaceC56293yAOLrzqt.OLrzqt(application2.EZpvd(), C56443yFo.KWHzl(Intrinsics.EZpvd(interfaceC5039Cj.OLrzqt(), HttpStatusCode.KWHzl.UeEOUB())));
        InterfaceC56293yA interfaceC56293yAOLrzqt2 = credentialsProviderException.getSdkErrorMetadata().OLrzqt();
        C57737yo<java.lang.Boolean> c57737yoOLrzqt = application2.OLrzqt();
        if (!credentialsProviderException.getSdkErrorMetadata().AEQbTJ() && zT.AEQbTJ(interfaceC5039Cj.OLrzqt()) != HttpStatusCode.Category.SERVER_ERROR) {
            z = false;
        }
        interfaceC56293yAOLrzqt2.OLrzqt(c57737yoOLrzqt, C56443yFo.KWHzl(z));
        throw credentialsProviderException;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(InterfaceC5039Cj interfaceC5039Cj, Continuation<? super LocaleList.Application> continuation) throws java.lang.Throwable {
        EcsCredentialsProviderKt$tryParseErrorResponse$1 ecsCredentialsProviderKt$tryParseErrorResponse$1;
        if (continuation instanceof EcsCredentialsProviderKt$tryParseErrorResponse$1) {
            ecsCredentialsProviderKt$tryParseErrorResponse$1 = (EcsCredentialsProviderKt$tryParseErrorResponse$1) continuation;
            int i = ecsCredentialsProviderKt$tryParseErrorResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecsCredentialsProviderKt$tryParseErrorResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                ecsCredentialsProviderKt$tryParseErrorResponse$1 = new EcsCredentialsProviderKt$tryParseErrorResponse$1(continuation);
            }
        }
        java.lang.Object objCopydefault = ecsCredentialsProviderKt$tryParseErrorResponse$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = ecsCredentialsProviderKt$tryParseErrorResponse$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (!Intrinsics.EZpvd((java.lang.Object) interfaceC5039Cj.AEQbTJ().copydefault("Content-Type"), (java.lang.Object) "application/json")) {
                return null;
            }
            zP zPVarEZpvd = interfaceC5039Cj.EZpvd();
            ecsCredentialsProviderKt$tryParseErrorResponse$1.label = 1;
            objCopydefault = C58752zO.copydefault(zPVarEZpvd, ecsCredentialsProviderKt$tryParseErrorResponse$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                if (objCopydefault instanceof LocaleList.Application) {
                    return null;
                }
                return (LocaleList.Application) objCopydefault;
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        byte[] bArr = (byte[]) objCopydefault;
        if (bArr == null) {
            return null;
        }
        EL el = new EL(bArr);
        ecsCredentialsProviderKt$tryParseErrorResponse$1.label = 2;
        objCopydefault = Creator.KWHzl(el, ecsCredentialsProviderKt$tryParseErrorResponse$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        if (objCopydefault instanceof LocaleList.Application) {
        }
    }

    static {
        DH dh = new DH((byte) -87, (byte) -2, (byte) -86, (byte) 2, null);
        copydefault = dh;
        DH dh2 = new DH((byte) -87, (byte) -2, (byte) -86, Ascii.ETB, null);
        EZpvd = dh2;
        DG dg = new DG((short) -768, (short) 3778, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 35, null, 256, null);
        KWHzl = dg;
        AEQbTJ = yEE.AhwBna(DH.EZpvd.copydefault(), DG.KWHzl.copydefault(), dh, dh2, dg);
    }
}
