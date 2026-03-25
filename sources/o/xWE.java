package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWE extends InterfaceC43217rlC {
    void KWHzl(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, java.lang.String str, Function1<? super android.os.Bundle, Unit> function1);

    boolean KWHzl(long j, boolean z);

    java.lang.String OLrzqt(long j);

    void copydefault(@NotNull android.content.Context context, @NotNull DappInteractionArgs dappInteractionArgs, java.lang.String str, Function1<? super android.os.Bundle, Unit> function1);

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWE */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addCustomEvmChain$default(xWE xwe, android.content.Context context, DappInteractionArgs dappInteractionArgs, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomEvmChain");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            xwe.KWHzl(context, dappInteractionArgs, str, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWE */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void watchEvmAsset$default(xWE xwe, android.content.Context context, DappInteractionArgs dappInteractionArgs, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: watchEvmAsset");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            xwe.copydefault(context, dappInteractionArgs, str, function1);
        }

        public static /* synthetic */ boolean isCustomNetwork$default(xWE xwe, long j, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCustomNetwork");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return xwe.KWHzl(j, z);
        }
    }
}
