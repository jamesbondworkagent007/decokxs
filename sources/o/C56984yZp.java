package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56984yZp extends AbstractC56975yZg<ActionBar> {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.yZp$ActionBar */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yZp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.yZp$ActionBar$Activity */
        public static final class Activity extends ActionBar {
            public final C56977yZi EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C56977yZi AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NormalClass(value=" + this.EZpvd + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull C56977yZi c56977yZi) {
                super(null);
                Intrinsics.checkNotNullParameter(c56977yZi, "");
                this.EZpvd = c56977yZi;
            }

            public final C56929yXo KWHzl() {
                return this.EZpvd.KWHzl();
            }

            public final int OLrzqt() {
                return this.EZpvd.EZpvd();
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.yZp$ActionBar$Application */
        public static final class Application extends ActionBar {
            public final AbstractC59233zdF EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC59233zdF AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "LocalClass(type=" + this.EZpvd + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull AbstractC59233zdF abstractC59233zdF) {
                super(null);
                Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
                this.EZpvd = abstractC59233zdF;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56984yZp(@NotNull ActionBar actionBar) {
        super(actionBar);
        Intrinsics.checkNotNullParameter(actionBar, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56984yZp(@NotNull C56977yZi c56977yZi) {
        this(new ActionBar.Activity(c56977yZi));
        Intrinsics.checkNotNullParameter(c56977yZi, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56984yZp(@NotNull C56929yXo c56929yXo, int i) {
        this(new C56977yZi(c56929yXo, i));
        Intrinsics.checkNotNullParameter(c56929yXo, "");
    }

    @Override // o.AbstractC56975yZg
    public AbstractC59233zdF OLrzqt(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        C59308zeb c59308zebCopydefault = C59308zeb.OLrzqt.copydefault();
        InterfaceC56658yNn interfaceC56658yNnFARcdN = ynp.AEQbTJ().fARcdN();
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnFARcdN, "");
        return C59231zdD.KWHzl(c59308zebCopydefault, interfaceC56658yNnFARcdN, C56402yEa.EZpvd(new C59323zeq(AEQbTJ(ynp))));
    }

    public final AbstractC59233zdF AEQbTJ(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        ActionBar actionBarKWHzl = KWHzl();
        if (actionBarKWHzl instanceof ActionBar.Application) {
            return ((ActionBar.Application) KWHzl()).AEQbTJ();
        }
        if (!(actionBarKWHzl instanceof ActionBar.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        C56977yZi c56977yZiAEQbTJ = ((ActionBar.Activity) KWHzl()).AEQbTJ();
        C56929yXo c56929yXoCopydefault = c56977yZiAEQbTJ.copydefault();
        int iAEQbTJ = c56977yZiAEQbTJ.AEQbTJ();
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynp, c56929yXoCopydefault);
        if (interfaceC56658yNnCopydefault == null) {
            return C59370zfk.EZpvd(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, c56929yXoCopydefault.toString(), java.lang.String.valueOf(iAEQbTJ));
        }
        AbstractC59242zdO abstractC59242zdOBQ_ = interfaceC56658yNnCopydefault.bQ_();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
        AbstractC59233zdF abstractC59233zdFIsConnected = C59336zfC.isConnected(abstractC59242zdOBQ_);
        for (int i = 0; i < iAEQbTJ; i++) {
            abstractC59233zdFIsConnected = ynp.AEQbTJ().AEQbTJ(Variance.INVARIANT, abstractC59233zdFIsConnected);
        }
        return abstractC59233zdFIsConnected;
    }

    /* JADX INFO: renamed from: o.yZp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yZp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AbstractC56975yZg<?> OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            if (C59238zdK.AEQbTJ(abstractC59233zdF)) {
                return null;
            }
            AbstractC59233zdF abstractC59233zdFOLrzqt = abstractC59233zdF;
            int i = 0;
            while (AbstractC56640yMw.OLrzqt(abstractC59233zdFOLrzqt)) {
                abstractC59233zdFOLrzqt = ((InterfaceC59317zek) CollectionsKt___CollectionsKt.gHZMYf(abstractC59233zdFOLrzqt.bY_())).OLrzqt();
                i++;
            }
            InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdFOLrzqt.djBIcL().OLrzqt();
            if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
                C56929yXo c56929yXoEZpvd = yZE.EZpvd(interfaceC56663yNsKWHzl);
                return c56929yXoEZpvd == null ? new C56984yZp(new ActionBar.Application(abstractC59233zdF)) : new C56984yZp(c56929yXoEZpvd, i);
            }
            if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
                return new C56984yZp(C56929yXo.AEQbTJ.KWHzl(yMB.Application.isConnected.djBIcL()), 0);
            }
            return null;
        }
    }
}
