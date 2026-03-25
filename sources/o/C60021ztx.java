package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C60053zuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60021ztx implements ViewModelProvider.Factory {
    public final InterfaceC59997ztZ AEQbTJ;
    public final C60060zuj KWHzl;
    public final InterfaceC56551yJo<? extends ViewModel> OLrzqt;
    public final Function0<C60053zuc> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
    /* JADX WARN: Multi-variable type inference failed */
    public C60021ztx(@NotNull InterfaceC56551yJo<? extends ViewModel> interfaceC56551yJo, @NotNull C60060zuj c60060zuj, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        this.OLrzqt = interfaceC56551yJo;
        this.KWHzl = c60060zuj;
        this.AEQbTJ = interfaceC59997ztZ;
        this.copydefault = function0;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls, @NotNull CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(creationExtras, "");
        final C60019ztv c60019ztv = new C60019ztv(this.copydefault, creationExtras);
        return (T) this.KWHzl.AEQbTJ(this.OLrzqt, this.AEQbTJ, new Function0<C60053zuc>() { // from class: org.koin.androidx.viewmodel.factory.KoinViewModelFactory$create$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final C60053zuc invoke() {
                return c60019ztv;
            }
        });
    }
}
