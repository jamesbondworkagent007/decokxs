package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59221zcu extends yPK implements InterfaceC59131zbJ {
    public final yWX AwvSrB;
    public final yWS AxsJAY;
    public final InterfaceC59145zbX EZpvd;
    public final ProtoBuf.Function gHZMYf;
    public final yWW sSMYrx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public InterfaceC59145zbX OcIXYQ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWS QKVWgx() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWW RJOkX() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yWX ejfBZ() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: QUSxYX()Lo/yXQ; */
    @Override // o.InterfaceC59144zbW
    /* JADX INFO: renamed from: fIwbmz, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Function QUSxYX() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r14v0 o.yNu)
  (r15v0 o.yOp)
  (r16v0 o.yOL)
  (r17v0 o.yXu)
  (r18v0 kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind)
  (r19v0 kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function)
  (r20v0 o.yWS)
  (r21v0 o.yWW)
  (r22v0 o.yWX)
  (r23v0 o.zbX)
  (wrap:o.yOo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null o.yOo) : (r24v0 o.yOo))
 A[MD:(o.yNu, o.yOp, o.yOL, o.yXu, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, o.yWS, o.yWW, o.yWX, o.zbX, o.yOo):void (m)] (LINE:41) call: o.zcu.<init>(o.yNu, o.yOp, o.yOL, o.yXu, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, o.yWS, o.yWW, o.yWX, o.zbX, o.yOo):void type: THIS */
    public /* synthetic */ C59221zcu(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56687yOp interfaceC56687yOp, yOL yol, C56935yXu c56935yXu, CallableMemberDescriptor.Kind kind, ProtoBuf.Function function, yWS yws, yWW yww, yWX ywx, InterfaceC59145zbX interfaceC59145zbX, InterfaceC56686yOo interfaceC56686yOo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC56665yNu, interfaceC56687yOp, yol, c56935yXu, kind, function, yws, yww, ywx, interfaceC59145zbX, (i & 1024) != 0 ? null : interfaceC56686yOo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59221zcu(@NotNull InterfaceC56665yNu interfaceC56665yNu, InterfaceC56687yOp interfaceC56687yOp, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Function function, @NotNull yWS yws, @NotNull yWW yww, @NotNull yWX ywx, InterfaceC59145zbX interfaceC59145zbX, InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56665yNu, interfaceC56687yOp, yol, c56935yXu, kind, interfaceC56686yOo == null ? InterfaceC56686yOo.copydefault : interfaceC56686yOo);
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(function, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywx, "");
        this.gHZMYf = function;
        this.AxsJAY = yws;
        this.sSMYrx = yww;
        this.AwvSrB = ywx;
        this.EZpvd = interfaceC59145zbX;
    }

    @Override // o.yPK, o.AbstractC56718yPt
    public AbstractC56718yPt KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        C56935yXu c56935yXu2;
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) yng;
        if (c56935yXu == null) {
            C56935yXu c56935yXuBR_ = bR_();
            Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
            c56935yXu2 = c56935yXuBR_;
        } else {
            c56935yXu2 = c56935yXu;
        }
        C59221zcu c59221zcu = new C59221zcu(interfaceC56665yNu, interfaceC56687yOp, yol, c56935yXu2, kind, QUSxYX(), QKVWgx(), RJOkX(), ejfBZ(), OcIXYQ(), interfaceC56686yOo);
        c59221zcu.EZpvd(DTwDnp());
        return c59221zcu;
    }
}
