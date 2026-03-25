package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.arch.data.StatefulData;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.productmatrix.api.bean.StringPair;
import com.okinc.productmatrix.biz.bean.ProductMatrixInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tZZ extends AbstractC32952mnL<ProductMatrixInfo> {
    public ProductMatrixScene AYXKKw;
    public final LifecycleOwner AhwBna;
    public java.util.List<StringPair> copydefault;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.valueOf = z;
    }

    public tZZ(@NotNull LifecycleOwner lifecycleOwner, @NotNull ProductMatrixScene productMatrixScene, java.util.List<StringPair> list) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        this.AhwBna = lifecycleOwner;
        this.AYXKKw = productMatrixScene;
        this.copydefault = list;
    }

    @Override // o.AbstractC32952mnL
    public InterfaceC58217yxC EZpvd(long j) {
        if (this.valueOf) {
            this.valueOf = false;
            return AEQbTJ(j);
        }
        return copydefault(j);
    }

    public final InterfaceC58217yxC AEQbTJ(final long j) {
        AbstractC58185ywX<ProductMatrixInfo> abstractC58185ywXCopydefault = tZW.OLrzqt.copydefault(CacheStrategy.ONLY_CACHE, this.AYXKKw, this.copydefault, this.AhwBna);
        final Function1 function1 = new Function1() { // from class: o.uae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZZ.KWHzl(this.EZpvd, j, (ProductMatrixInfo) obj);
            }
        };
        InterfaceC58227yxM<? super ProductMatrixInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uag
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tZZ.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZZ.KWHzl(this.EZpvd, j, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ual
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tZZ.valueOf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(tZZ tzz, long j, ProductMatrixInfo productMatrixInfo) {
        tzz.setValue(StatefulData.Companion.EZpvd(productMatrixInfo));
        tzz.copydefault(j);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(tZZ tzz, long j, java.lang.Throwable th) {
        tzz.copydefault(j);
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(final long j) {
        AbstractC58185ywX<ProductMatrixInfo> abstractC58185ywXCopydefault = tZW.OLrzqt.copydefault(CacheStrategy.NO_CACHE, this.AYXKKw, this.copydefault, this.AhwBna);
        final Function1 function1 = new Function1() { // from class: o.uac
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZZ.copydefault(this.EZpvd, j, (ProductMatrixInfo) obj);
            }
        };
        InterfaceC58227yxM<? super ProductMatrixInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tZZ.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uaf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZZ.copydefault(this.AEQbTJ, j, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tZZ.gEmmrt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(tZZ tzz, long j, ProductMatrixInfo productMatrixInfo) {
        tzz.EZpvd(StatefulData.Companion.EZpvd(productMatrixInfo), j);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(tZZ tzz, long j, java.lang.Throwable th) {
        StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
        Intrinsics.copydefault(th);
        tzz.EZpvd(StatefulData.StateListAnimator.error$default(stateListAnimator, th, null, 2, null), j);
        return Unit.INSTANCE;
    }
}
