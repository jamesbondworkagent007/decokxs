package o;

import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertInfoApiModel;
import kotlin.Result;
import kotlinx.serialization.DeserializationStrategy;

/* JADX INFO: renamed from: o.lsp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31376lsp {
    public static final C31376lsp copydefault = new C31376lsp();

    private C31376lsp() {
    }

    public final ConvertInfoApiModel OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj = null;
        if (str == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((ConvertInfoApiModel) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) ConvertInfoApiModel.Companion.serializer(), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("ConvertInfoTypeConverter", "error while decodeFromString", thM7380exceptionOrNullimpl);
        }
        return (ConvertInfoApiModel) obj;
    }
}
