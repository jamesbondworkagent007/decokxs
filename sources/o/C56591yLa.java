package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import o.AbstractC56615yLy;
import o.InterfaceC56557yJu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56591yLa<V> extends C56608yLr<V> implements InterfaceC56557yJu<V> {
    public final InterfaceC56387yDm<ActionBar<V>> AhwBna;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56591yLa(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        super(kDeclarationContainerImpl, interfaceC56676yOe);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        this.AhwBna = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yKY(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56591yLa(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AhwBna = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yKY(this));
    }

    public static final ActionBar KWHzl(C56591yLa c56591yLa) {
        return new ActionBar(c56591yLa);
    }

    /* JADX DEBUG: Method merged with bridge method: getSetter()Lo/yJu$StateListAnimator; */
    /* JADX DEBUG: Method merged with bridge method: getSetter()Lo/yJv$StateListAnimator; */
    @Override // o.InterfaceC56558yJv, o.InterfaceC56557yJu
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar<V> getSetter() {
        return this.AhwBna.getValue();
    }

    @Override // o.InterfaceC56557yJu
    public void set(V v) throws IllegalCallableAccessException {
        getSetter().call(v);
    }

    /* JADX INFO: renamed from: o.yLa$ActionBar */
    public static final class ActionBar<R> extends AbstractC56615yLy.TaskDescription<R> implements InterfaceC56557yJu.StateListAnimator<R> {
        public final C56591yLa<R> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yJA; */
        /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/yLy; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public C56591yLa<R> fetchVPNInfo() {
            return this.gEmmrt;
        }

        public ActionBar(@NotNull C56591yLa<R> c56591yLa) {
            Intrinsics.checkNotNullParameter(c56591yLa, "");
            this.gEmmrt = c56591yLa;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Object obj) throws IllegalCallableAccessException {
            AEQbTJ(obj);
            return Unit.INSTANCE;
        }

        public void AEQbTJ(R r) throws IllegalCallableAccessException {
            fetchVPNInfo().set(r);
        }
    }
}
