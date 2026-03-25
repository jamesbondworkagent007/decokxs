package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import o.AbstractC56615yLy;
import o.InterfaceC56562yJz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56608yLr<V> extends AbstractC56615yLy<V> implements InterfaceC56562yJz<V> {
    public final InterfaceC56387yDm<ActionBar<V>> AYXKKw;
    public final InterfaceC56387yDm<java.lang.Object> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56608yLr(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(kDeclarationContainerImpl, interfaceC56676yOe);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.AYXKKw = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56606yLp(this));
        this.valueOf = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56612yLv(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56608yLr(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.AYXKKw = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56606yLp(this));
        this.valueOf = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56612yLv(this));
    }

    public static final ActionBar EZpvd(C56608yLr c56608yLr) {
        return new ActionBar(c56608yLr);
    }

    /* JADX DEBUG: Method merged with bridge method: getGetter()Lo/yJA$StateListAnimator; */
    /* JADX DEBUG: Method merged with bridge method: getGetter()Lo/yJz$ActionBar; */
    /* JADX DEBUG: Method merged with bridge method: isConnected()Lo/yLy$ActionBar; */
    @Override // o.AbstractC56615yLy
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionBar<V> isConnected() {
        return this.AYXKKw.getValue();
    }

    @Override // o.InterfaceC56562yJz
    public V get() {
        return getGetter().call(new java.lang.Object[0]);
    }

    public static final java.lang.Object copydefault(C56608yLr c56608yLr) {
        return c56608yLr.AEQbTJ(c56608yLr.DbNXlk(), null, null);
    }

    @Override // o.InterfaceC56562yJz
    public java.lang.Object getDelegate() {
        return this.valueOf.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public V invoke() {
        return get();
    }

    /* JADX INFO: renamed from: o.yLr$ActionBar */
    public static final class ActionBar<R> extends AbstractC56615yLy.ActionBar<R> implements InterfaceC56562yJz.ActionBar<R> {
        public final C56608yLr<R> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yJA; */
        /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/yLy; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C56608yLr<R> fetchVPNInfo() {
            return this.valueOf;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yLr<? extends R> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C56608yLr<? extends R> c56608yLr) {
            Intrinsics.checkNotNullParameter(c56608yLr, "");
            this.valueOf = c56608yLr;
        }

        @Override // kotlin.jvm.functions.Function0
        public R invoke() {
            return copydefault().get();
        }
    }
}
