package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMK extends AbstractC59095zaa {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public static final C56935yXu copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yMK(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
        super(interfaceC59187zcM, interfaceC56658yNn);
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
    }

    @Override // o.AbstractC59095zaa
    public java.util.List<yNG> copydefault() {
        yPK ypkKWHzl = yPK.KWHzl(djBIcL(), yOL.KWHzl.OLrzqt(), copydefault, CallableMemberDescriptor.Kind.DECLARATION, InterfaceC56686yOo.copydefault);
        ypkKWHzl.AEQbTJ(null, djBIcL().DTwDnp(), yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna(), yZE.AEQbTJ(djBIcL()).AhwBna(), Modality.OPEN, C56669yNy.isConnected);
        return C56402yEa.EZpvd(ypkKWHzl);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C56935yXu EZpvd() {
            return yMK.copydefault;
        }
    }

    static {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ("clone");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        copydefault = c56935yXuAEQbTJ;
    }
}
