package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9740bbL {

    /* JADX INFO: renamed from: o.bbL$TaskDescription */
    public interface TaskDescription {
        void EZpvd();

        void copydefault();
    }

    C9746bbR AEQbTJ(android.content.Context context, @NotNull InterfaceC9752bbX interfaceC9752bbX);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9730bbB interfaceC9730bbB, int i, Function1<? super java.lang.Boolean, Unit> function1);

    <T extends AbstractC9836bdB> java.lang.Object EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.util.List<? extends T> list, boolean z, @NotNull Continuation<? super Result<C9843bdI<T>>> continuation);

    java.lang.String EZpvd(@NotNull InterfaceC9734bbF interfaceC9734bbF);

    AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> EZpvd(@NotNull SignDataArgs<?> signDataArgs);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9730bbB interfaceC9730bbB, Function1<? super android.os.Bundle, Unit> function1);

    AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> OLrzqt(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9734bbF interfaceC9734bbF, Function0<Unit> function0);

    java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull AbstractC9832bcy abstractC9832bcy, @NotNull InterfaceC9734bbF interfaceC9734bbF);

    AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9734bbF interfaceC9734bbF, @NotNull TaskDescription taskDescription);

    AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9734bbF interfaceC9734bbF, @NotNull TaskDescription taskDescription, boolean z);

    AbstractC58260yxt<ResponseData<C9748bbT>> copydefault(@NotNull SignDataArgs<?> signDataArgs, boolean z, @NotNull FragmentActivity fragmentActivity, @NotNull TaskDescription taskDescription);

    /* JADX INFO: renamed from: o.bbL$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static /* synthetic */ AbstractC58260yxt teeSignTransactionWithMessage$default(InterfaceC9740bbL interfaceC9740bbL, SignDataArgs signDataArgs, boolean z, FragmentActivity fragmentActivity, TaskDescription taskDescription, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: teeSignTransactionWithMessage");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return interfaceC9740bbL.copydefault((SignDataArgs<?>) signDataArgs, z, fragmentActivity, taskDescription);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bbL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC58260yxt buildContractTransaction$default(InterfaceC9740bbL interfaceC9740bbL, DappInteractionArgs dappInteractionArgs, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildContractTransaction");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return interfaceC9740bbL.OLrzqt(dappInteractionArgs, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bbL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openTransactionFeePage$default(InterfaceC9740bbL interfaceC9740bbL, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9734bbF interfaceC9734bbF, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openTransactionFeePage");
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            interfaceC9740bbL.OLrzqt(fragmentManager, interfaceC9734bbF, function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bbL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openApprovePage$default(InterfaceC9740bbL interfaceC9740bbL, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9730bbB interfaceC9730bbB, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openApprovePage");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC9740bbL.EZpvd(fragmentManager, interfaceC9730bbB, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bbL */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openApproveAmountPage$default(InterfaceC9740bbL interfaceC9740bbL, FragmentActivity fragmentActivity, InterfaceC9730bbB interfaceC9730bbB, int i, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openApproveAmountPage");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            interfaceC9740bbL.AEQbTJ(fragmentActivity, interfaceC9730bbB, i, function1);
        }
    }
}
