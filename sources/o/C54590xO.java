package o;

import aws.smithy.kotlin.runtime.awsprotocol.xml.RestXmlErrorDeserializerKt$parseRestXmlErrorResponse$1;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54590xO {
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull byte[] bArr, @NotNull Continuation<? super C56239xz> continuation) throws java.lang.Throwable {
        RestXmlErrorDeserializerKt$parseRestXmlErrorResponse$1 restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1;
        InterfaceC54563xN interfaceC54563xN;
        if (continuation instanceof RestXmlErrorDeserializerKt$parseRestXmlErrorResponse$1) {
            restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1 = (RestXmlErrorDeserializerKt$parseRestXmlErrorResponse$1) continuation;
            int i = restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1 = new RestXmlErrorDeserializerKt$parseRestXmlErrorResponse$1(continuation);
            }
        }
        java.lang.Object objCopydefault = restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C54535xM c54535xM = C54535xM.KWHzl;
            C5116Fi c5116Fi = new C5116Fi(bArr, true);
            restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.L$0 = bArr;
            restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.label = 1;
            objCopydefault = c54535xM.copydefault(c5116Fi, restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                interfaceC54563xN = (C54671xR) objCopydefault;
                if (interfaceC54563xN == null) {
                    throw new DeserializationException("Unable to deserialize RestXml error.");
                }
                return new C56239xz(interfaceC54563xN.copydefault(), interfaceC54563xN.AEQbTJ(), interfaceC54563xN.KWHzl());
            }
            bArr = (byte[]) restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        interfaceC54563xN = (C54644xQ) objCopydefault;
        if (interfaceC54563xN == null) {
            C54617xP c54617xP = C54617xP.EZpvd;
            C5116Fi c5116Fi2 = new C5116Fi(bArr, true);
            restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.L$0 = null;
            restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1.label = 2;
            objCopydefault = c54617xP.OLrzqt(c5116Fi2, restXmlErrorDeserializerKt$parseRestXmlErrorResponse$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            interfaceC54563xN = (C54671xR) objCopydefault;
            if (interfaceC54563xN == null) {
            }
        }
        return new C56239xz(interfaceC54563xN.copydefault(), interfaceC54563xN.AEQbTJ(), interfaceC54563xN.KWHzl());
    }
}
