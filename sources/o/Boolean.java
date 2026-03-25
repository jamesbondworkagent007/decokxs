package o;

import aws.sdk.kotlin.runtime.region.RegionProviderChain$resolveRegion$1;
import aws.sdk.kotlin.runtime.region.RegionProviderChain$resolvedRegion$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5148Go;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class Boolean implements AssertionError {
    public final HH<java.lang.String> AEQbTJ;
    public final AssertionError[] KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssertionError[] AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AssertionError
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) {
        return EZpvd(this, continuation);
    }

    public Boolean(@NotNull AssertionError... assertionErrorArr) {
        Intrinsics.checkNotNullParameter(assertionErrorArr, "");
        this.KWHzl = assertionErrorArr;
        this.AEQbTJ = HE.AEQbTJ(new RegionProviderChain$resolvedRegion$1(this));
        if (!(!(assertionErrorArr.length == 0))) {
            throw new java.lang.IllegalArgumentException("at least one provider must be in the chain".toString());
        }
    }

    public java.lang.String toString() {
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.util.Collection) C56402yEa.EZpvd(this), (java.lang.Object[]) this.KWHzl);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(C56524yIo.AEQbTJ(((AssertionError) it.next()).getClass()).valueOf());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ java.lang.Object EZpvd(Boolean r0, Continuation<? super java.lang.String> continuation) {
        return r0.AEQbTJ.KWHzl(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0036, B:26:0x007a, B:28:0x007e, B:30:0x0087, B:23:0x0067), top: B:37:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0036, B:26:0x007a, B:28:0x007e, B:30:0x0087, B:23:0x0067), top: B:37:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:26:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        RegionProviderChain$resolveRegion$1 regionProviderChain$resolveRegion$1;
        InterfaceC5148Go interfaceC5148Go;
        AssertionError[] assertionErrorArr;
        int length;
        int i;
        if (continuation instanceof RegionProviderChain$resolveRegion$1) {
            regionProviderChain$resolveRegion$1 = (RegionProviderChain$resolveRegion$1) continuation;
            int i2 = regionProviderChain$resolveRegion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                regionProviderChain$resolveRegion$1.label = i2 - Integer.MIN_VALUE;
            } else {
                regionProviderChain$resolveRegion$1 = new RegionProviderChain$resolveRegion$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = regionProviderChain$resolveRegion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = regionProviderChain$resolveRegion$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            CoroutineContext context = regionProviderChain$resolveRegion$1.getContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(Boolean.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
            AssertionError[] assertionErrorArr2 = this.KWHzl;
            interfaceC5148Go = interfaceC5148GoOLrzqt;
            assertionErrorArr = assertionErrorArr2;
            length = assertionErrorArr2.length;
            i = 0;
            if (i >= length) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = regionProviderChain$resolveRegion$1.I$1;
            i = regionProviderChain$resolveRegion$1.I$0;
            final AssertionError assertionError = (AssertionError) regionProviderChain$resolveRegion$1.L$2;
            assertionErrorArr = (AssertionError[]) regionProviderChain$resolveRegion$1.L$1;
            interfaceC5148Go = (InterfaceC5148Go) regionProviderChain$resolveRegion$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Exception e) {
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.region.RegionProviderChain$resolveRegion$4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "unable to load region from " + assertionError + ": " + e.getMessage();
                    }
                }, 1, null);
                i++;
                if (i >= length) {
                }
            }
            final java.lang.String str = (java.lang.String) objKWHzl;
            if (str == null) {
                InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.region.RegionProviderChain$resolveRegion$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "resolved region (" + str + ") from " + assertionError + ' ';
                    }
                }, 1, null);
                return str;
            }
            InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.sdk.kotlin.runtime.region.RegionProviderChain$resolveRegion$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "failed to resolve region from " + assertionError;
                }
            }, 1, null);
            i++;
            if (i >= length) {
                return null;
            }
            assertionError = assertionErrorArr[i];
            regionProviderChain$resolveRegion$1.L$0 = interfaceC5148Go;
            regionProviderChain$resolveRegion$1.L$1 = assertionErrorArr;
            regionProviderChain$resolveRegion$1.L$2 = assertionError;
            regionProviderChain$resolveRegion$1.I$0 = i;
            regionProviderChain$resolveRegion$1.I$1 = length;
            regionProviderChain$resolveRegion$1.label = 1;
            objKWHzl = assertionError.KWHzl(regionProviderChain$resolveRegion$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            final java.lang.String str2 = (java.lang.String) objKWHzl;
            if (str2 == null) {
            }
        }
    }
}
