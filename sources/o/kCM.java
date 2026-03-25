package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28415kaO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kCM {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kCM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleResult$default(kCM kcm, InterfaceC28415kaO interfaceC28415kaO, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.kCK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kCM.KWHzl();
                }
            };
        }
        kcm.OLrzqt(interfaceC28415kaO, function0);
    }

    public final void OLrzqt(@NotNull InterfaceC28415kaO interfaceC28415kaO, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(interfaceC28415kaO, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (interfaceC28415kaO instanceof InterfaceC28415kaO.StateListAnimator) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.getCurrentControllerInfo), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (interfaceC28415kaO instanceof InterfaceC28415kaO.Application) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C23274hvD.Fragment.ensureClassLoader), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (interfaceC28415kaO instanceof InterfaceC28415kaO.LoaderManager) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.newSessionWithExtras), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 500, (java.lang.Integer) null, 0, 0, 56, (java.lang.Object) null);
            function0.invoke();
            return;
        }
        if (interfaceC28415kaO instanceof InterfaceC28415kaO.ActionBar) {
            InterfaceC28415kaO.ActionBar actionBar = (InterfaceC28415kaO.ActionBar) interfaceC28415kaO;
            C55328xhq.show$default(C55328xhq.OLrzqt, actionBar.copydefault().size() > 1 ? C33070mpX.AYXKKw(C23274hvD.Fragment.addOnActiveChangeListener) : C33069mpW.copydefault(C23274hvD.Fragment.getController, C56423yEv.EZpvd(C56390yDp.OLrzqt("groupName", ((CommonGroupData) CollectionsKt___CollectionsKt.AuCTelauCTel(actionBar.copydefault())).AEQbTJ()))), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 500, (java.lang.Integer) null, 0, 0, 56, (java.lang.Object) null);
            function0.invoke();
        } else if (interfaceC28415kaO instanceof InterfaceC28415kaO.Fragment) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.addOnActiveChangeListener), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 500, (java.lang.Integer) null, 0, 0, 56, (java.lang.Object) null);
            function0.invoke();
        } else if (interfaceC28415kaO instanceof InterfaceC28415kaO.Dialog) {
            C31200lpY.throwIfDebug$default(null, 1, null);
        } else {
            if (interfaceC28415kaO instanceof InterfaceC28415kaO.Activity) {
                return;
            }
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C23274hvD.Fragment.UscePu), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
    }
}
