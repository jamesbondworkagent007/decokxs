package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.dapp.utils.DappRpcPreLoader$preloadDefaultRpc$1;
import com.okinc.dapp.bean.RpcUrl;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: renamed from: o.dyt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15152dyt {
    public static ConcurrentHashMap<java.lang.String, java.lang.String> AEQbTJ;
    public static java.util.List<RpcUrl> OLrzqt;
    public static final C15152dyt EZpvd = new C15152dyt();
    public static final int copydefault = 8;

    /* JADX INFO: renamed from: o.dyt$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.List<? extends RpcUrl>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<RpcUrl> EZpvd() {
        return OLrzqt;
    }

    private C15152dyt() {
    }

    public final void KWHzl() {
        ((InterfaceC9846bdL) C43251rlk.copydefault(InterfaceC9846bdL.class)).EZpvd(new Function1() { // from class: o.dyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15152dyt.copydefault((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.dyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15152dyt.EZpvd((java.lang.String) obj);
            }
        });
        copydefault();
    }

    public static final Unit copydefault(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            OLrzqt = (java.util.List) new Gson().fromJson(str, new TaskDescription().getType());
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            OLrzqt = null;
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt = null;
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new DappRpcPreLoader$preloadDefaultRpc$1(null), 2, null);
    }

    public final java.lang.String KWHzl(long j) {
        java.lang.String str;
        ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = AEQbTJ;
        if (concurrentHashMap == null) {
            copydefault();
        } else if (concurrentHashMap != null && (str = concurrentHashMap.get(java.lang.String.valueOf(j))) != null) {
            return str;
        }
        return "";
    }
}
