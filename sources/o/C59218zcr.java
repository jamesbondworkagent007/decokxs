package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59218zcr extends yPI implements InterfaceC59131zbJ {
    public final yWX AxsJAY;
    public final yWW gHZMYf;
    public final yWS wlaJM;
    public final InterfaceC59145zbX zsXlph;
    public final ProtoBuf.Property zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: QUSxYX()Lo/yXQ; */
    @Override // o.InterfaceC59144zbW
    /* JADX INFO: renamed from: DTwDnp, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Property QUSxYX() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yWX ORxRYg() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public InterfaceC59145zbX OcIXYQ() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWS QKVWgx() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWW RJOkX() {
        return this.gHZMYf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59218zcr(@NotNull InterfaceC56665yNu interfaceC56665yNu, InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull ProtoBuf.Property property, @NotNull yWS yws, @NotNull yWW yww, @NotNull yWX ywx, InterfaceC59145zbX interfaceC59145zbX) {
        super(interfaceC56665yNu, interfaceC56676yOe, yol, modality, ync, z, c56935yXu, kind, InterfaceC56686yOo.copydefault, z2, z3, z6, false, z4, z5);
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(modality, "");
        Intrinsics.checkNotNullParameter(ync, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywx, "");
        this.zuBGHE = property;
        this.wlaJM = yws;
        this.gHZMYf = yww;
        this.AxsJAY = ywx;
        this.zsXlph = interfaceC59145zbX;
    }

    @Override // o.yPI
    public yPI AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull Modality modality, @NotNull yNC ync, InterfaceC56676yOe interfaceC56676yOe, @NotNull CallableMemberDescriptor.Kind kind, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(modality, "");
        Intrinsics.checkNotNullParameter(ync, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        return new C59218zcr(interfaceC56665yNu, interfaceC56676yOe, copydefault(), modality, ync, AubY(), c56935yXu, kind, AuCTelauCTel(), wlaJM(), zsXlph(), sSMYrx(), zLjUOn(), QUSxYX(), QKVWgx(), RJOkX(), ORxRYg(), OcIXYQ());
    }

    @Override // o.yPI, o.yNJ
    public boolean zsXlph() {
        java.lang.Boolean boolKWHzl = yWP.AuCTel.KWHzl(QUSxYX().getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }
}
