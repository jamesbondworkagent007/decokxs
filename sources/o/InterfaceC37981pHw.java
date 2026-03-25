package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.kyc.api.biz.bean.BannerModelBean;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC37981pHw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC37981pHw extends InterfaceC43217rlC {
    Flow<KycInfoListBean> AEQbTJ();

    Flow<KycInfoListBean> EZpvd();

    void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super KycInfoListBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12);

    java.lang.Object OLrzqt(long j, @NotNull Continuation<? super BannerModelBean> continuation);

    void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super KycInfoListBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12);

    /* JADX INFO: renamed from: o.pHw$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static Unit OLrzqt(KycInfoListBean kycInfoListBean) {
            Intrinsics.checkNotNullParameter(kycInfoListBean, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getKycInfo$default(InterfaceC37981pHw interfaceC37981pHw, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKycInfo");
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.pHz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC37981pHw.Application.OLrzqt((KycInfoListBean) obj2);
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1() { // from class: o.pHC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC37981pHw.Application.EZpvd((java.lang.String) obj2);
                    }
                };
            }
            interfaceC37981pHw.copydefault(lifecycleOwner, function1, function12);
        }

        public static Unit EZpvd(java.lang.String str) {
            return Unit.INSTANCE;
        }

        public static Unit EZpvd(KycInfoListBean kycInfoListBean) {
            Intrinsics.checkNotNullParameter(kycInfoListBean, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getKycInfoFromCache$default(InterfaceC37981pHw interfaceC37981pHw, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKycInfoFromCache");
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.pHA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC37981pHw.Application.EZpvd((KycInfoListBean) obj2);
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1() { // from class: o.pHB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC37981pHw.Application.KWHzl((java.lang.String) obj2);
                    }
                };
            }
            interfaceC37981pHw.EZpvd(lifecycleOwner, function1, function12);
        }

        public static Unit KWHzl(java.lang.String str) {
            return Unit.INSTANCE;
        }
    }
}
