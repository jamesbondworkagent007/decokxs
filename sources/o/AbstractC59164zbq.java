package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59164zbq {
    public final yWS EZpvd;
    public final InterfaceC56686yOo OLrzqt;
    public final yWW copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.yWS), (r2v0 o.yWW), (r3v0 o.yOo) A[MD:(o.yWS, o.yWW, o.yOo):void (m)] call: o.zbq.<init>(o.yWS, o.yWW, o.yOo):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59164zbq(yWS yws, yWW yww, InterfaceC56686yOo interfaceC56686yOo, DefaultConstructorMarker defaultConstructorMarker) {
        this(yws, yww, interfaceC56686yOo);
    }

    public abstract C56933yXs AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWW KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWS OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56686yOo copydefault() {
        return this.OLrzqt;
    }

    public AbstractC59164zbq(yWS yws, yWW yww, InterfaceC56686yOo interfaceC56686yOo) {
        this.EZpvd = yws;
        this.copydefault = yww;
        this.OLrzqt = interfaceC56686yOo;
    }

    /* JADX INFO: renamed from: o.zbq$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59164zbq {
        public final ProtoBuf.Class AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final C56929yXo KWHzl;
        public final StateListAnimator djBIcL;
        public final ProtoBuf.Class.Kind gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProtoBuf.Class djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProtoBuf.Class.Kind gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator valueOf() {
            return this.djBIcL;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ProtoBuf.Class r3, @NotNull yWS yws, @NotNull yWW yww, InterfaceC56686yOo interfaceC56686yOo, StateListAnimator stateListAnimator) {
            super(yws, yww, interfaceC56686yOo, null);
            Intrinsics.checkNotNullParameter(r3, "");
            Intrinsics.checkNotNullParameter(yws, "");
            Intrinsics.checkNotNullParameter(yww, "");
            this.AEQbTJ = r3;
            this.djBIcL = stateListAnimator;
            this.KWHzl = C59160zbm.EZpvd(yws, r3.getFqName());
            ProtoBuf.Class.Kind kindKWHzl = yWP.EZpvd.KWHzl(r3.getFlags());
            this.gEmmrt = kindKWHzl == null ? ProtoBuf.Class.Kind.CLASS : kindKWHzl;
            java.lang.Boolean boolKWHzl = yWP.zsXlph.KWHzl(r3.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
            this.AhwBna = boolKWHzl.booleanValue();
            java.lang.Boolean boolKWHzl2 = yWP.isConnected.KWHzl(r3.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolKWHzl2, "");
            this.AYXKKw = boolKWHzl2.booleanValue();
        }

        @Override // o.AbstractC59164zbq
        public C56933yXs AEQbTJ() {
            return this.KWHzl.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.zbq$TaskDescription */
    public static final class TaskDescription extends AbstractC59164zbq {
        public final C56933yXs KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59164zbq
        public C56933yXs AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C56933yXs c56933yXs, @NotNull yWS yws, @NotNull yWW yww, InterfaceC56686yOo interfaceC56686yOo) {
            super(yws, yww, interfaceC56686yOo, null);
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            Intrinsics.checkNotNullParameter(yws, "");
            Intrinsics.checkNotNullParameter(yww, "");
            this.KWHzl = c56933yXs;
        }
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + ": " + AEQbTJ();
    }
}
