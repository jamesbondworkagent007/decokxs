package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import o.AbstractC56615yLy;
import o.InterfaceC56560yJx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56611yLu<T, V> extends AbstractC56615yLy<V> implements InterfaceC56560yJx<T, V> {
    public final InterfaceC56387yDm<java.lang.reflect.Member> AhwBna;
    public final InterfaceC56387yDm<Application<T, V>> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56611yLu(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.valueOf = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56610yLt(this));
        this.AhwBna = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56613yLw(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56611yLu(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(kDeclarationContainerImpl, interfaceC56676yOe);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.valueOf = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56610yLt(this));
        this.AhwBna = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56613yLw(this));
    }

    public static final Application OLrzqt(C56611yLu c56611yLu) {
        return new Application(c56611yLu);
    }

    /* JADX DEBUG: Method merged with bridge method: getGetter()Lo/yJA$StateListAnimator; */
    /* JADX DEBUG: Method merged with bridge method: getGetter()Lo/yJx$StateListAnimator; */
    /* JADX DEBUG: Method merged with bridge method: isConnected()Lo/yLy$ActionBar; */
    @Override // o.AbstractC56615yLy
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public Application<T, V> isConnected() {
        return this.valueOf.getValue();
    }

    @Override // o.InterfaceC56560yJx
    public V get(T t) {
        return isConnected().call(t);
    }

    public static final java.lang.reflect.Member copydefault(C56611yLu c56611yLu) {
        return c56611yLu.DbNXlk();
    }

    @Override // o.InterfaceC56560yJx
    public java.lang.Object getDelegate(T t) {
        return AEQbTJ(this.AhwBna.getValue(), t, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T t) {
        return get(t);
    }

    /* JADX INFO: renamed from: o.yLu$Application */
    public static final class Application<T, V> extends AbstractC56615yLy.ActionBar<V> implements InterfaceC56560yJx.StateListAnimator<T, V> {
        public final C56611yLu<T, V> AhwBna;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yJA; */
        /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/yLy; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public C56611yLu<T, V> fetchVPNInfo() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yLu<T, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull C56611yLu<T, ? extends V> c56611yLu) {
            Intrinsics.checkNotNullParameter(c56611yLu, "");
            this.AhwBna = c56611yLu;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T t) {
            return fetchVPNInfo().get(t);
        }
    }
}
