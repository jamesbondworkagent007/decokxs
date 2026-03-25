package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33259mtA {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mty
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33259mtA.copydefault();
        }
    });
    public final java.lang.String[] OLrzqt = {"pay_home", "pay_rewards", "pay_pay", "pay_chat", "pay_activity"};
    public final java.lang.String[] KWHzl = {"pro_exchange_home", "pro_exchange_discover", "pro_exchange_trade", "pro_exchange_finance", "pro_exchange_assets"};

    @yCM
    public C33259mtA() {
    }

    /* JADX INFO: renamed from: o.mtA$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mtA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.util.List<InterfaceC33248msq> AEQbTJ() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List copydefault() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33251mst.class));
        return listKWHzl == null ? yDY.AhwBna() : listKWHzl;
    }

    public final java.lang.String[] KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "pro_pay") ? this.OLrzqt : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "pro_exchange") ? this.KWHzl : new java.lang.String[0];
    }

    public final java.util.List<InterfaceC33248msq> OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String[] strArrKWHzl = KWHzl(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArrKWHzl) {
            java.util.Iterator<T> it = AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC33248msq) next).OLrzqt(), (java.lang.Object) str2)) {
                    break;
                }
            }
            InterfaceC33248msq interfaceC33248msq = (InterfaceC33248msq) next;
            if (interfaceC33248msq != null) {
                arrayList.add(interfaceC33248msq);
            }
        }
        return arrayList;
    }
}
