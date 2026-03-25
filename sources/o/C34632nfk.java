package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34632nfk extends C59534zip {
    public final AsyncListDiffer<InterfaceC34635nfn> KWHzl = new AsyncListDiffer<>(this, C34626nfe.EZpvd);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nfk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C34632nfk c34632nfk, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.nfj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34632nfk.AYXKKw();
                }
            };
        }
        c34632nfk.EZpvd((java.util.List<? extends InterfaceC34635nfn>) list, (Function0<Unit>) function0);
    }

    public final void EZpvd(@NotNull java.util.List<? extends InterfaceC34635nfn> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.submitList(list, new java.lang.Runnable() { // from class: o.nfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C34632nfk.EZpvd(this.EZpvd, function0);
            }
        });
    }

    public static final void EZpvd(C34632nfk c34632nfk, Function0 function0) {
        super.setItems(c34632nfk.KWHzl.getCurrentList());
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nfk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void forceReset$default(C34632nfk c34632nfk, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.nfl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34632nfk.EZpvd();
                }
            };
        }
        c34632nfk.AEQbTJ(list, function0);
    }

    public final void AEQbTJ(@NotNull final java.util.List<? extends InterfaceC34635nfn> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.submitList(null, new java.lang.Runnable() { // from class: o.nfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C34632nfk.KWHzl(this.EZpvd, list, function0);
            }
        });
    }

    public static final void KWHzl(final C34632nfk c34632nfk, final java.util.List list, final Function0 function0) {
        c34632nfk.KWHzl.submitList(list, new java.lang.Runnable() { // from class: o.nfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C34632nfk.AEQbTJ(this.copydefault, list, function0);
            }
        });
    }

    public static final void AEQbTJ(C34632nfk c34632nfk, java.util.List list, Function0 function0) {
        super.setItems(list);
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nfk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void forceUpdate$default(C34632nfk c34632nfk, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.nfm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34632nfk.copydefault();
                }
            };
        }
        c34632nfk.OLrzqt(list, function0);
    }

    public final void OLrzqt(@NotNull java.util.List<? extends InterfaceC34635nfn> list, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.submitList(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), new java.lang.Runnable() { // from class: o.nfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C34632nfk.OLrzqt(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function0 function0) {
        function0.invoke();
    }
}
