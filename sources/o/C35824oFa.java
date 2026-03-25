package o;

import com.okinc.im.usecase.messagelistmodel.InitMessageListModelUseCase$execute$1;
import com.okinc.im.usecase.messagelistmodel.LoadMessageListModelUseCaseV2;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35824oFa {
    public final C35805oEi AEQbTJ;
    public final oCE EZpvd;
    public final LoadMessageListModelUseCaseV2 copydefault;

    @yCM
    public C35824oFa(@NotNull C35805oEi c35805oEi, @NotNull oCE oce, @NotNull LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV2) {
        Intrinsics.checkNotNullParameter(c35805oEi, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(loadMessageListModelUseCaseV2, "");
        this.AEQbTJ = c35805oEi;
        this.EZpvd = oce;
        this.copydefault = loadMessageListModelUseCaseV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[PHI: r14
  0x00c8: PHI (r14v13 java.lang.Object) = (r14v10 java.lang.Object), (r14v1 java.lang.Object) binds: [B:35:0x00c5, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.Long l, java.lang.String str2, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        InitMessageListModelUseCase$execute$1 initMessageListModelUseCase$execute$1;
        C35824oFa c35824oFa;
        java.lang.String str3;
        java.lang.Long l2;
        java.lang.String str4;
        OKConversation oKConversation;
        java.lang.String str5;
        OKMessage oKMessage;
        C35824oFa c35824oFa2;
        java.lang.String str6;
        if (continuation instanceof InitMessageListModelUseCase$execute$1) {
            initMessageListModelUseCase$execute$1 = (InitMessageListModelUseCase$execute$1) continuation;
            int i = initMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                initMessageListModelUseCase$execute$1 = new InitMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        InitMessageListModelUseCase$execute$1 initMessageListModelUseCase$execute$12 = initMessageListModelUseCase$execute$1;
        java.lang.Object objOLrzqt = initMessageListModelUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = initMessageListModelUseCase$execute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (str != null) {
                oCE oce = this.EZpvd;
                initMessageListModelUseCase$execute$12.L$0 = this;
                initMessageListModelUseCase$execute$12.L$1 = str;
                initMessageListModelUseCase$execute$12.L$2 = l;
                initMessageListModelUseCase$execute$12.L$3 = str2;
                initMessageListModelUseCase$execute$12.label = 1;
                objOLrzqt = oce.OLrzqt(str, initMessageListModelUseCase$execute$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c35824oFa = this;
            } else {
                c35824oFa = this;
                str3 = str2;
                l2 = l;
                str4 = str;
                oKConversation = null;
                if (oKConversation != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                if (l2 != null) {
                    l2.longValue();
                    C35805oEi c35805oEi = c35824oFa.AEQbTJ;
                    long jLongValue = l2.longValue();
                    initMessageListModelUseCase$execute$12.L$0 = c35824oFa;
                    initMessageListModelUseCase$execute$12.L$1 = str3;
                    initMessageListModelUseCase$execute$12.L$2 = oKConversation;
                    initMessageListModelUseCase$execute$12.L$3 = null;
                    initMessageListModelUseCase$execute$12.label = 2;
                    java.lang.Object objOLrzqt2 = c35805oEi.OLrzqt(str4, jLongValue, initMessageListModelUseCase$execute$12);
                    if (objOLrzqt2 == objCopydefault) {
                        return objCopydefault;
                    }
                    c35824oFa2 = c35824oFa;
                    java.lang.String str7 = str3;
                    objOLrzqt = objOLrzqt2;
                    str6 = str7;
                    str5 = str6;
                    c35824oFa = c35824oFa2;
                    oKMessage = (OKMessage) objOLrzqt;
                    LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV2 = c35824oFa.copydefault;
                    LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario = LoadMessageListModelUseCaseV2.ExecuteScenario.INIT;
                    initMessageListModelUseCase$execute$12.L$0 = null;
                    initMessageListModelUseCase$execute$12.L$1 = null;
                    initMessageListModelUseCase$execute$12.L$2 = null;
                    initMessageListModelUseCase$execute$12.L$3 = null;
                    initMessageListModelUseCase$execute$12.label = 3;
                    objOLrzqt = loadMessageListModelUseCaseV2.EZpvd(oKConversation, oKMessage, str5, executeScenario, initMessageListModelUseCase$execute$12);
                    if (objOLrzqt == objCopydefault) {
                    }
                } else {
                    str5 = str3;
                    oKMessage = null;
                    LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV22 = c35824oFa.copydefault;
                    LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario2 = LoadMessageListModelUseCaseV2.ExecuteScenario.INIT;
                    initMessageListModelUseCase$execute$12.L$0 = null;
                    initMessageListModelUseCase$execute$12.L$1 = null;
                    initMessageListModelUseCase$execute$12.L$2 = null;
                    initMessageListModelUseCase$execute$12.L$3 = null;
                    initMessageListModelUseCase$execute$12.label = 3;
                    objOLrzqt = loadMessageListModelUseCaseV22.EZpvd(oKConversation, oKMessage, str5, executeScenario2, initMessageListModelUseCase$execute$12);
                    if (objOLrzqt == objCopydefault) {
                    }
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objOLrzqt);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oKConversation = (OKConversation) initMessageListModelUseCase$execute$12.L$2;
                str6 = (java.lang.String) initMessageListModelUseCase$execute$12.L$1;
                c35824oFa2 = (C35824oFa) initMessageListModelUseCase$execute$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str5 = str6;
                c35824oFa = c35824oFa2;
                oKMessage = (OKMessage) objOLrzqt;
                LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV222 = c35824oFa.copydefault;
                LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario22 = LoadMessageListModelUseCaseV2.ExecuteScenario.INIT;
                initMessageListModelUseCase$execute$12.L$0 = null;
                initMessageListModelUseCase$execute$12.L$1 = null;
                initMessageListModelUseCase$execute$12.L$2 = null;
                initMessageListModelUseCase$execute$12.L$3 = null;
                initMessageListModelUseCase$execute$12.label = 3;
                objOLrzqt = loadMessageListModelUseCaseV222.EZpvd(oKConversation, oKMessage, str5, executeScenario22, initMessageListModelUseCase$execute$12);
                return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
            }
            str2 = (java.lang.String) initMessageListModelUseCase$execute$12.L$3;
            l = (java.lang.Long) initMessageListModelUseCase$execute$12.L$2;
            str = (java.lang.String) initMessageListModelUseCase$execute$12.L$1;
            c35824oFa = (C35824oFa) initMessageListModelUseCase$execute$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.lang.Long l3 = l;
        str4 = str;
        oKConversation = (OKConversation) objOLrzqt;
        str3 = str2;
        l2 = l3;
        if (oKConversation != null) {
        }
    }
}
