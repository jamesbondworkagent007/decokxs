package o;

import com.okinc.core.arch.data.StatefulData;
import com.okinc.im.imui.group.management.AdministratorsLiveData$asyncLoad$1$1;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34198nVb extends AbstractC32952mnL<java.util.List<? extends GroupMemberInfo>> {
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    public C34198nVb(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    @Override // o.AbstractC32952mnL
    public InterfaceC58217yxC EZpvd(long j) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null) {
            return null;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C44525sTa.copydefault.EZpvd(new AdministratorsLiveData$asyncLoad$1$1(interfaceC35180nqU, this, null)));
        final Function1 function1 = new Function1() { // from class: o.nVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34198nVb.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C34198nVb.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.nUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34198nVb.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nVc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C34198nVb.OLrzqt(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C34198nVb c34198nVb, java.util.List list) {
        pUU.KWHzl("AdminManage", "setSuccess->size:" + list.size());
        c34198nVb.setValue(StatefulData.Companion.EZpvd(list));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C34198nVb c34198nVb, java.lang.Throwable th) {
        pUU.KWHzl("AdminManage", "setError->msg:" + th.getMessage());
        StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
        Intrinsics.copydefault(th);
        c34198nVb.setValue(StatefulData.StateListAnimator.error$default(stateListAnimator, th, null, 2, null));
        return Unit.INSTANCE;
    }
}
