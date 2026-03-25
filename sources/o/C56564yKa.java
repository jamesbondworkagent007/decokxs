package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yKa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56564yKa extends C56713yPo<AbstractC56573yKj<?>, Unit> {
    public final KDeclarationContainerImpl KWHzl;

    public C56564yKa(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        this.KWHzl = kDeclarationContainerImpl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yOe;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.C56713yPo, o.InterfaceC56667yNw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC56573yKj<?> AEQbTJ(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        Intrinsics.checkNotNullParameter(unit, "");
        int i = (interfaceC56676yOe.AEQbTJ() != null ? 1 : 0) + (interfaceC56676yOe.djBIcL() != null ? 1 : 0);
        if (interfaceC56676yOe.AubY()) {
            if (i == 0) {
                return new C56591yLa(this.KWHzl, interfaceC56676yOe);
            }
            if (i == 1) {
                return new yKZ(this.KWHzl, interfaceC56676yOe);
            }
            if (i == 2) {
                return new C56596yLf(this.KWHzl, interfaceC56676yOe);
            }
        } else {
            if (i == 0) {
                return new C56608yLr(this.KWHzl, interfaceC56676yOe);
            }
            if (i == 1) {
                return new C56611yLu(this.KWHzl, interfaceC56676yOe);
            }
            if (i == 2) {
                return new C56609yLs(this.KWHzl, interfaceC56676yOe);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + interfaceC56676yOe);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yNG;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.C56713yPo, o.InterfaceC56667yNw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC56573yKj<?> AEQbTJ(@NotNull yNG yng, @NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(yng, "");
        Intrinsics.checkNotNullParameter(unit, "");
        return new yKT(this.KWHzl, yng);
    }
}
