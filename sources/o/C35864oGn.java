package o;

import com.okinc.im.usecase.relationinfo.GetRelationInfoUseCase$execute$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35864oGn {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC44177sGd EZpvd;

    @yCM
    public C35864oGn(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.EZpvd = interfaceC44177sGd;
    }

    /* JADX INFO: renamed from: o.oGn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        GetRelationInfoUseCase$execute$1 getRelationInfoUseCase$execute$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetRelationInfoUseCase$execute$1) {
            getRelationInfoUseCase$execute$1 = (GetRelationInfoUseCase$execute$1) continuation;
            int i = getRelationInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRelationInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRelationInfoUseCase$execute$1 = new GetRelationInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getRelationInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getRelationInfoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                    return null;
                }
                Result.Application application = Result.Companion;
                InterfaceC44177sGd interfaceC44177sGd = this.EZpvd;
                getRelationInfoUseCase$execute$1.label = 1;
                objCopydefault = interfaceC44177sGd.copydefault(str, getRelationInfoUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((RelationInfo) objCopydefault);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("GetRelationInfoUseCase", "getRelationInfo failed: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return (RelationInfo) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
