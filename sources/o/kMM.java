package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kMM extends C59534zip {
    public final AsyncListDiffer<kMU> KWHzl = new AsyncListDiffer<>(this, kMH.OLrzqt);

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kMM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(kMM kmm, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.kMP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kMM.gEmmrt();
                }
            };
        }
        kmm.AEQbTJ(list, function0);
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends kMU> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.submitList(list, new java.lang.Runnable() { // from class: o.kMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kMM.OLrzqt(this.OLrzqt, function0);
            }
        });
    }

    public static final void OLrzqt(kMM kmm, Function0 function0) {
        super.setItems(kmm.KWHzl.getCurrentList());
        function0.invoke();
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kMM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void forceReset$default(kMM kmm, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.kMK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kMM.AEQbTJ();
                }
            };
        }
        kmm.EZpvd(list, function0);
    }

    public final void EZpvd(@NotNull final java.util.List<? extends kMU> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.submitList(null, new java.lang.Runnable() { // from class: o.kML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kMM.OLrzqt(this.copydefault, list, function0);
            }
        });
    }

    public static final void OLrzqt(final kMM kmm, final java.util.List list, final Function0 function0) {
        kmm.KWHzl.submitList(list, new java.lang.Runnable() { // from class: o.kMN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kMM.KWHzl(this.OLrzqt, list, function0);
            }
        });
    }

    public static final void KWHzl(kMM kmm, java.util.List list, Function0 function0) {
        super.setItems(list);
        function0.invoke();
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kMM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void forceUpdate$default(kMM kmm, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.kMJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kMM.copydefault();
                }
            };
        }
        kmm.OLrzqt((java.util.List<? extends kMU>) list, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull java.util.List<? extends kMU> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.submitList(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), new java.lang.Runnable() { // from class: o.kMQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kMM.copydefault(function0);
            }
        });
    }

    public static final void copydefault(Function0 function0) {
        function0.invoke();
    }
}
