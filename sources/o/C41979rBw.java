package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.domain.usecase.GetOKXGroupUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41979rBw {
    public final InterfaceC41969rBm copydefault;

    public C41979rBw(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.copydefault = interfaceC41969rBm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super java.util.List<? extends UIComponentAppModel>> continuation) throws java.lang.Throwable {
        GetOKXGroupUseCase$invoke$1 getOKXGroupUseCase$invoke$1;
        java.lang.String str2;
        if (continuation instanceof GetOKXGroupUseCase$invoke$1) {
            getOKXGroupUseCase$invoke$1 = (GetOKXGroupUseCase$invoke$1) continuation;
            int i = getOKXGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOKXGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getOKXGroupUseCase$invoke$1 = new GetOKXGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getOKXGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOKXGroupUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC41969rBm interfaceC41969rBm = this.copydefault;
                getOKXGroupUseCase$invoke$1.label = 1;
                objOLrzqt = interfaceC41969rBm.OLrzqt(str, map, getOKXGroupUseCase$invoke$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return C43747rvC.copydefault(((GroupList) ((AbstractC43728ruk) objOLrzqt).copydefault()).getContentList());
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str2 = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str2 = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("GetOKXGroupUseCase", str2);
            return null;
        }
    }
}
