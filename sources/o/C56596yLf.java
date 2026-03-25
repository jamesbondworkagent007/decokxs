package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import o.AbstractC56615yLy;
import o.InterfaceC56556yJt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56596yLf<D, E, V> extends C56609yLs<D, E, V> implements InterfaceC56556yJt<D, E, V> {
    public final InterfaceC56387yDm<StateListAnimator<D, E, V>> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56596yLf(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        super(kDeclarationContainerImpl, str, str2);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56597yLg(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56596yLf(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(kDeclarationContainerImpl, interfaceC56676yOe);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        this.valueOf = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56597yLg(this));
    }

    public static final StateListAnimator EZpvd(C56596yLf c56596yLf) {
        return new StateListAnimator(c56596yLf);
    }

    /* JADX DEBUG: Method merged with bridge method: getSetter()Lo/yJt$StateListAnimator; */
    /* JADX DEBUG: Method merged with bridge method: getSetter()Lo/yJv$StateListAnimator; */
    @Override // o.InterfaceC56558yJv, o.InterfaceC56557yJu
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator<D, E, V> getSetter() {
        return this.valueOf.getValue();
    }

    public void copydefault(D d, E e, V v) throws IllegalCallableAccessException {
        getSetter().call(d, e, v);
    }

    /* JADX INFO: renamed from: o.yLf$StateListAnimator */
    public static final class StateListAnimator<D, E, V> extends AbstractC56615yLy.TaskDescription<V> implements InterfaceC56556yJt.StateListAnimator<D, E, V> {
        public final C56596yLf<D, E, V> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yJA; */
        /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/yLy; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public C56596yLf<D, E, V> fetchVPNInfo() {
            return this.gEmmrt;
        }

        public StateListAnimator(@NotNull C56596yLf<D, E, V> c56596yLf) {
            Intrinsics.checkNotNullParameter(c56596yLf, "");
            this.gEmmrt = c56596yLf;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws IllegalCallableAccessException {
            OLrzqt(obj, obj2, obj3);
            return Unit.INSTANCE;
        }

        public void OLrzqt(D d, E e, V v) throws IllegalCallableAccessException {
            fetchVPNInfo().copydefault(d, e, v);
        }
    }
}
