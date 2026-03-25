package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import o.AbstractC56615yLy;
import o.InterfaceC56554yJr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yKZ<T, V> extends C56611yLu<T, V> implements InterfaceC56554yJr<T, V> {
    public final InterfaceC56387yDm<StateListAnimator<T, V>> AYXKKw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yKZ(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56595yLe(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yKZ(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(kDeclarationContainerImpl, interfaceC56676yOe);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        this.AYXKKw = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56595yLe(this));
    }

    public static final StateListAnimator copydefault(yKZ ykz) {
        return new StateListAnimator(ykz);
    }

    /* JADX DEBUG: Method merged with bridge method: getSetter()Lo/yJr$Application; */
    /* JADX DEBUG: Method merged with bridge method: getSetter()Lo/yJv$StateListAnimator; */
    @Override // o.InterfaceC56558yJv, o.InterfaceC56557yJu
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator<T, V> getSetter() {
        return this.AYXKKw.getValue();
    }

    @Override // o.InterfaceC56554yJr
    public void set(T t, V v) throws IllegalCallableAccessException {
        getSetter().call(t, v);
    }

    public static final class StateListAnimator<T, V> extends AbstractC56615yLy.TaskDescription<V> implements InterfaceC56554yJr.Application<T, V> {
        public final yKZ<T, V> AhwBna;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yJA; */
        /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/yLy; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public yKZ<T, V> fetchVPNInfo() {
            return this.AhwBna;
        }

        public StateListAnimator(@NotNull yKZ<T, V> ykz) {
            Intrinsics.checkNotNullParameter(ykz, "");
            this.AhwBna = ykz;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Object obj, java.lang.Object obj2) throws IllegalCallableAccessException {
            KWHzl(obj, obj2);
            return Unit.INSTANCE;
        }

        public void KWHzl(T t, V v) throws IllegalCallableAccessException {
            fetchVPNInfo().set(t, v);
        }
    }
}
