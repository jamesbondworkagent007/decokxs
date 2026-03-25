package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import o.AbstractC56615yLy;
import o.InterfaceC56561yJy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56609yLs<D, E, V> extends AbstractC56615yLy<V> implements InterfaceC56561yJy<D, E, V> {
    public final InterfaceC56387yDm<java.lang.reflect.Member> AYXKKw;
    public final InterfaceC56387yDm<ActionBar<D, E, V>> gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56609yLs(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        super(kDeclarationContainerImpl, str, str2, CallableReference.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.gEmmrt = C56392yDr.EZpvd(lazyThreadSafetyMode, new yLB(this));
        this.AYXKKw = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56614yLx(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56609yLs(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(kDeclarationContainerImpl, interfaceC56676yOe);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.gEmmrt = C56392yDr.EZpvd(lazyThreadSafetyMode, new yLB(this));
        this.AYXKKw = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56614yLx(this));
    }

    public static final ActionBar EZpvd(C56609yLs c56609yLs) {
        return new ActionBar(c56609yLs);
    }

    /* JADX DEBUG: Method merged with bridge method: getGetter()Lo/yJA$StateListAnimator; */
    /* JADX DEBUG: Method merged with bridge method: getGetter()Lo/yJy$Activity; */
    /* JADX DEBUG: Method merged with bridge method: isConnected()Lo/yLy$ActionBar; */
    @Override // o.AbstractC56615yLy
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public ActionBar<D, E, V> isConnected() {
        return this.gEmmrt.getValue();
    }

    @Override // o.InterfaceC56561yJy
    public V get(D d, E e) {
        return isConnected().call(d, e);
    }

    public static final java.lang.reflect.Member AEQbTJ(C56609yLs c56609yLs) {
        return c56609yLs.DbNXlk();
    }

    @Override // o.InterfaceC56561yJy
    public java.lang.Object getDelegate(D d, E e) {
        return AEQbTJ(this.AYXKKw.getValue(), d, e);
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D d, E e) {
        return get(d, e);
    }

    /* JADX INFO: renamed from: o.yLs$ActionBar */
    public static final class ActionBar<D, E, V> extends AbstractC56615yLy.ActionBar<V> implements InterfaceC56561yJy.Activity<D, E, V> {
        public final C56609yLs<D, E, V> AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yJA; */
        /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/yLy; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public C56609yLs<D, E, V> fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yLs<D, E, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C56609yLs<D, E, ? extends V> c56609yLs) {
            Intrinsics.checkNotNullParameter(c56609yLs, "");
            this.AYXKKw = c56609yLs;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D d, E e) {
            return fetchVPNInfo().get(d, e);
        }
    }
}
