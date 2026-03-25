package o;

import aws.sdk.kotlin.services.rekognition.serde.DescribeCollectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.HeterogeneousExpandableList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C15537eM implements BB<HeterogeneousExpandableList> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super HeterogeneousExpandableList> continuation) throws java.lang.Throwable {
        DescribeCollectionOperationDeserializer$deserialize$1 describeCollectionOperationDeserializer$deserialize$1;
        HeterogeneousExpandableList.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DescribeCollectionOperationDeserializer$deserialize$1) {
            describeCollectionOperationDeserializer$deserialize$1 = (DescribeCollectionOperationDeserializer$deserialize$1) continuation;
            int i = describeCollectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeCollectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeCollectionOperationDeserializer$deserialize$1 = new DescribeCollectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeCollectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeCollectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (HeterogeneousExpandableList.StateListAnimator) describeCollectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C15618eP.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeCollectionOperationDeserializer$deserialize$1.label = 1;
            if (C15618eP.EZpvd(dt, c58859zS, describeCollectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new HeterogeneousExpandableList.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeCollectionOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        describeCollectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeCollectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.KWHzl();
    }
}
