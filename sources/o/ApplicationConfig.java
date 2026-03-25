package o;

import aws.sdk.kotlin.services.comprehend.serde.CreateEndpointOperationDeserializer$deserialize$1;
import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WebAddress;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApplicationConfig implements BB<WebAddress> {
    private static final byte[] $$a = {4, -46, 125, 98, -26, 0, 65, -73, Ascii.VT, -11, 57, -65, -8, -9, 4, -1, -9, 60, -73, 10, -17, -8, 9, 2, -6, -18, 65, -57, -16, -2, -7, -6, 9, -7, -1, -13, 6, 50, -73, 10, -17, 10, -5, 51, -25, -51, 9, 0, -23, Ascii.VT, Ascii.FS, -45, 6, -16, -3, 2, -9, -10, 33, -37, 7, -17, Ascii.CR, -23, 7, -10, -3, 38, -37, -18, 10, -17, 5, 4, -15, -1, -21, 17, -17, 74, -68, -5, -18, 10, -17, 5, 4, -15, -1, -21, 17, 61, -17};
    private static final int $$b = WalletImportError.ERROR_CODE_AA_EXIST;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:10:0x0029) to fix multi-entry loop: BACK_EDGE: B:9:0x0027 -> B:10:0x0029 */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = s2 * 2;
        int i3 = (s * 4) + 97;
        int i4 = 4 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[90 - i2];
        int i5 = 89 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i5)) - 4;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i4])) - 4;
                i4++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WebAddress> continuation) {
        CreateEndpointOperationDeserializer$deserialize$1 createEndpointOperationDeserializer$deserialize$1;
        WebAddress.Activity activity;
        byte[] bArr;
        byte b = $$a[5];
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(continuation)) {
            createEndpointOperationDeserializer$deserialize$1 = (CreateEndpointOperationDeserializer$deserialize$1) continuation;
            int i = createEndpointOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createEndpointOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createEndpointOperationDeserializer$deserialize$1 = new CreateEndpointOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createEndpointOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createEndpointOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (WebAddress.Activity) createEndpointOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                X509CertificateParsingUtils.EZpvd(activity, bArr);
            }
            activity.AEQbTJ();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createEndpointOperationDeserializer$deserialize$1.label = 1;
            if (X509CertificateParsingUtils.AEQbTJ(dt, c58859zS, createEndpointOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new WebAddress.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createEndpointOperationDeserializer$deserialize$1.L$0 = activity;
        createEndpointOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createEndpointOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.AEQbTJ();
        return activity.OLrzqt();
    }
}
