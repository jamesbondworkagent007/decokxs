package o;

import com.okinc.business.dexui.widget.DexEmptyData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19855gRv extends C43316rmw {
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public Function1<? super C20064gZo, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super C20064gZo, Unit> function1) {
        this.copydefault = function1;
    }

    public final void EZpvd() {
        register(C20064gZo.class, new gRO(new Function1() { // from class: o.gRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19855gRv.KWHzl(this.EZpvd, (C20064gZo) obj);
            }
        }));
        register(C19858gRy.class, new gRL());
        register(C22264hcA.class, new C22314hcy(0, 0, 0, new Function0() { // from class: o.gRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19855gRv.OLrzqt(this.EZpvd);
            }
        }));
        register(DexEmptyData.class, new C25449iwt(new Function0() { // from class: o.gRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19855gRv.KWHzl(this.KWHzl);
            }
        }));
    }

    public static final Unit KWHzl(C19855gRv c19855gRv, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        Function1<? super C20064gZo, Unit> function1 = c19855gRv.copydefault;
        if (function1 != null) {
            function1.invoke(c20064gZo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C19855gRv c19855gRv) {
        Function0<Unit> function0 = c19855gRv.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C19855gRv c19855gRv) {
        Function0<Unit> function0 = c19855gRv.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
        notifyDataSetChanged();
    }

    public final void KWHzl(boolean z) {
        if (z) {
            setItems(C56402yEa.EZpvd(new C22264hcA(C33070mpX.AYXKKw(C23274hvD.Fragment.RFmUsE), null, 2, null)));
        } else {
            setItems(C56402yEa.EZpvd(new DexEmptyData(8, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt), C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 32, null)));
        }
        notifyDataSetChanged();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setItems(C56402yEa.EZpvd(new C19858gRy(str)));
        notifyDataSetChanged();
    }
}
