package o;

import aws.sdk.kotlin.runtime.region.ProfileRegionProvider$1;
import aws.sdk.kotlin.runtime.region.ProfileRegionProvider$getRegion$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayStoreException implements AssertionError {
    public final HH<ObjectStreamField> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayStoreException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ArrayStoreException(@NotNull HH<ObjectStreamField> hh) {
        Intrinsics.checkNotNullParameter(hh, "");
        this.KWHzl = hh;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:o.HH:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HH:0x000a: INVOKE 
  (wrap:aws.sdk.kotlin.runtime.region.ProfileRegionProvider$1:0x0007: CONSTRUCTOR (null kotlin.coroutines.Continuation) A[MD:(kotlin.coroutines.Continuation<? super aws.sdk.kotlin.runtime.region.ProfileRegionProvider$1>):void (m), WRAPPED] (LINE:19) call: aws.sdk.kotlin.runtime.region.ProfileRegionProvider$1.<init>(kotlin.coroutines.Continuation):void type: CONSTRUCTOR)
 STATIC call: o.HE.AEQbTJ(kotlin.jvm.functions.Function1):o.HH A[MD:<T>:(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object>):o.HH<T> (m), WRAPPED] (LINE:19)) : (r1v0 o.HH))
 A[MD:(o.HH<o.ObjectStreamField>):void (m)] (LINE:18) call: o.ArrayStoreException.<init>(o.HH):void type: THIS */
    public /* synthetic */ ArrayStoreException(HH hh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HE.AEQbTJ(new ProfileRegionProvider$1(null)) : hh);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AssertionError
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        ProfileRegionProvider$getRegion$1 profileRegionProvider$getRegion$1;
        if (continuation instanceof ProfileRegionProvider$getRegion$1) {
            profileRegionProvider$getRegion$1 = (ProfileRegionProvider$getRegion$1) continuation;
            int i = profileRegionProvider$getRegion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileRegionProvider$getRegion$1.label = i - Integer.MIN_VALUE;
            } else {
                profileRegionProvider$getRegion$1 = new ProfileRegionProvider$getRegion$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = profileRegionProvider$getRegion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = profileRegionProvider$getRegion$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            HH<ObjectStreamField> hh = this.KWHzl;
            profileRegionProvider$getRegion$1.label = 1;
            objKWHzl = hh.KWHzl(profileRegionProvider$getRegion$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ObjectInputValidation.AhwBna((ObjectStreamField) objKWHzl);
    }
}
