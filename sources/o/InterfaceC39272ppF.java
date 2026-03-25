package o;

import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC39272ppF {
    void AEQbTJ(@NotNull KlineQuickOrderBottomSheetBehavior.States states, boolean z);

    void EZpvd();

    void EZpvd(int i);

    void EZpvd(@NotNull android.content.Context context, @NotNull android.view.View view, @NotNull C36109oPp c36109oPp, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0, Function0<Unit> function02);

    void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, Function0<Unit> function0, Function0<Unit> function02);

    KlineQuickOrderBottomSheetBehavior.States djBIcL();

    boolean valueOf();

    /* JADX INFO: renamed from: o.ppF$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void setState$default(InterfaceC39272ppF interfaceC39272ppF, KlineQuickOrderBottomSheetBehavior.States states, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setState");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC39272ppF.AEQbTJ(states, z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.ppF */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showFragment$default(InterfaceC39272ppF interfaceC39272ppF, androidx.fragment.app.Fragment fragment, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFragment");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function02 = null;
            }
            interfaceC39272ppF.KWHzl(fragment, function0, function02);
        }
    }
}
