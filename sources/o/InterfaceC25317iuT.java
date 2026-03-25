package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC25317iuT {
    boolean AEQbTJ();

    void EZpvd(@NotNull C25301iuD c25301iuD);

    void KWHzl(@NotNull java.lang.String str, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull FixedParam fixedParam, boolean z);

    void KWHzl(boolean z, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull FixedParam fixedParam);

    void copydefault(@NotNull java.lang.String str, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull DynamicParam dynamicParam);

    /* JADX INFO: renamed from: o.iuT$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        public static boolean AEQbTJ(@NotNull InterfaceC25317iuT interfaceC25317iuT) {
            return true;
        }

        public static /* synthetic */ void onFixedTextChanged$default(InterfaceC25317iuT interfaceC25317iuT, java.lang.String str, C25308iuK c25308iuK, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, FixedParam fixedParam, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFixedTextChanged");
            }
            if ((i & 32) != 0) {
                z = false;
            }
            interfaceC25317iuT.KWHzl(str, c25308iuK, c55008xbo, appCompatTextView, fixedParam, z);
        }
    }
}
