package o;

import aws.smithy.kotlin.runtime.awsprotocol.xml.Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C54481xK {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull byte[] bArr, @NotNull Continuation<? super C56239xz> continuation) throws java.lang.Throwable {
        Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1 ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1;
        if (continuation instanceof Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1) {
            ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1 = (Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1) continuation;
            int i = ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1 = new Ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1(continuation);
            }
        }
        java.lang.Object objCopydefault = ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C54454xJ c54454xJ = C54454xJ.copydefault;
            C5116Fi c5116Fi = new C5116Fi(bArr, true);
            ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1.label = 1;
            objCopydefault = c54454xJ.copydefault(c5116Fi, ec2QueryErrorDeserializerKt$parseEc2QueryErrorResponse$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C54508xL c54508xL = (C54508xL) objCopydefault;
        C54373xG c54373xG = (C54373xG) CollectionsKt___CollectionsKt.firstOrNull(c54508xL.copydefault());
        return new C56239xz(c54373xG != null ? c54373xG.copydefault() : null, c54373xG != null ? c54373xG.AEQbTJ() : null, c54508xL.EZpvd());
    }
}
