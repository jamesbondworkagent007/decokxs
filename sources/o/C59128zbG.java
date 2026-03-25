package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59128zbG extends C56707yPi implements InterfaceC59131zbJ {
    public final InterfaceC59145zbX AwvSrB;
    public final ProtoBuf.Constructor AxsJAY;
    public final yWX QKVWgx;
    public final yWS gHZMYf;
    public final yWW sSMYrx;

    @Override // o.AbstractC56718yPt, o.yNG
    public boolean AxsJAY() {
        return false;
    }

    @Override // o.AbstractC56718yPt, o.yNG
    public boolean EZpvd() {
        return false;
    }

    @Override // o.AbstractC56718yPt, o.yNG
    public boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public InterfaceC59145zbX OcIXYQ() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWS QKVWgx() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: QUSxYX()Lo/yXQ; */
    @Override // o.InterfaceC59144zbW
    /* JADX INFO: renamed from: QVAiDq, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Constructor QUSxYX() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yWX QbewEr() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWW RJOkX() {
        return this.sSMYrx;
    }

    @Override // o.AbstractC56718yPt, o.yNJ
    public boolean zsXlph() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r14v0 o.yNn)
  (r15v0 o.yNp)
  (r16v0 o.yOL)
  (r17v0 boolean)
  (r18v0 kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind)
  (r19v0 kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor)
  (r20v0 o.yWS)
  (r21v0 o.yWW)
  (r22v0 o.yWX)
  (r23v0 o.zbX)
  (wrap:o.yOo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null o.yOo) : (r24v0 o.yOo))
 A[MD:(o.yNn, o.yNp, o.yOL, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, o.yWS, o.yWW, o.yWX, o.zbX, o.yOo):void (m)] (LINE:117) call: o.zbG.<init>(o.yNn, o.yNp, o.yOL, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, o.yWS, o.yWW, o.yWX, o.zbX, o.yOo):void type: THIS */
    public /* synthetic */ C59128zbG(InterfaceC56658yNn interfaceC56658yNn, InterfaceC56660yNp interfaceC56660yNp, yOL yol, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, yWS yws, yWW yww, yWX ywx, InterfaceC59145zbX interfaceC59145zbX, InterfaceC56686yOo interfaceC56686yOo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC56658yNn, interfaceC56660yNp, yol, z, kind, constructor, yws, yww, ywx, interfaceC59145zbX, (i & 1024) != 0 ? null : interfaceC56686yOo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59128zbG(@NotNull InterfaceC56658yNn interfaceC56658yNn, InterfaceC56660yNp interfaceC56660yNp, @NotNull yOL yol, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Constructor constructor, @NotNull yWS yws, @NotNull yWW yww, @NotNull yWX ywx, InterfaceC59145zbX interfaceC59145zbX, InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56658yNn, interfaceC56660yNp, yol, z, kind, interfaceC56686yOo == null ? InterfaceC56686yOo.copydefault : interfaceC56686yOo);
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(constructor, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywx, "");
        this.AxsJAY = constructor;
        this.gHZMYf = yws;
        this.sSMYrx = yww;
        this.QKVWgx = ywx;
        this.AwvSrB = interfaceC59145zbX;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yNu;Lo/yNG;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lo/yXu;Lo/yOL;Lo/yOo;)Lo/yPi; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/yNu;Lo/yNG;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lo/yXu;Lo/yOL;Lo/yOo;)Lo/yPt; */
    @Override // o.C56707yPi, o.AbstractC56718yPt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C59128zbG KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        C59128zbG c59128zbG = new C59128zbG((InterfaceC56658yNn) interfaceC56665yNu, (InterfaceC56660yNp) yng, yol, this.EZpvd, kind, QUSxYX(), QKVWgx(), RJOkX(), QbewEr(), OcIXYQ(), interfaceC56686yOo);
        c59128zbG.EZpvd(DTwDnp());
        return c59128zbG;
    }
}
