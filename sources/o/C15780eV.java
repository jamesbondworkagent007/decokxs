package o;

import aws.sdk.kotlin.services.rekognition.serde.DescribeProjectVersionsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15780eV implements BB<ListAdapter> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ListAdapter> continuation) throws java.lang.Throwable {
        DescribeProjectVersionsOperationDeserializer$deserialize$1 describeProjectVersionsOperationDeserializer$deserialize$1;
        ListAdapter.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DescribeProjectVersionsOperationDeserializer$deserialize$1) {
            describeProjectVersionsOperationDeserializer$deserialize$1 = (DescribeProjectVersionsOperationDeserializer$deserialize$1) continuation;
            int i = describeProjectVersionsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeProjectVersionsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeProjectVersionsOperationDeserializer$deserialize$1 = new DescribeProjectVersionsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeProjectVersionsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeProjectVersionsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ListAdapter.StateListAnimator) describeProjectVersionsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C15807eW.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.OLrzqt();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeProjectVersionsOperationDeserializer$deserialize$1.label = 1;
            if (C15807eW.AEQbTJ(dt, c58859zS, describeProjectVersionsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new ListAdapter.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeProjectVersionsOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        describeProjectVersionsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeProjectVersionsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.OLrzqt();
        return stateListAnimator.copydefault();
    }
}
