package o;

import aws.sdk.kotlin.services.translate.serde.DescribeTextTranslationJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C46909tg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C49995uz implements BB<C46909tg> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C46909tg> continuation) throws java.lang.Throwable {
        DescribeTextTranslationJobOperationDeserializer$deserialize$1 describeTextTranslationJobOperationDeserializer$deserialize$1;
        C46909tg.Activity activity;
        byte[] bArr;
        if (continuation instanceof DescribeTextTranslationJobOperationDeserializer$deserialize$1) {
            describeTextTranslationJobOperationDeserializer$deserialize$1 = (DescribeTextTranslationJobOperationDeserializer$deserialize$1) continuation;
            int i = describeTextTranslationJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeTextTranslationJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeTextTranslationJobOperationDeserializer$deserialize$1 = new DescribeTextTranslationJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeTextTranslationJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeTextTranslationJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (C46909tg.Activity) describeTextTranslationJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C47966uA.OLrzqt(activity, bArr);
            }
            activity.EZpvd();
            return activity.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeTextTranslationJobOperationDeserializer$deserialize$1.label = 1;
            if (C47966uA.AEQbTJ(dt, c58859zS, describeTextTranslationJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new C46909tg.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeTextTranslationJobOperationDeserializer$deserialize$1.L$0 = activity;
        describeTextTranslationJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeTextTranslationJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.OLrzqt();
    }
}
