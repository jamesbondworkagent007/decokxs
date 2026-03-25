package o;

import com.okinc.share.bean.ShareBizCondition;
import com.okinc.share.bean.ShareData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49004ugP {
    public static boolean KWHzl;
    public static final C49004ugP OLrzqt = new C49004ugP();
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ugS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49004ugP.KWHzl();
        }
    });
    public static final java.util.HashSet<InterfaceC49001ugM> AhwBna = new java.util.HashSet<>();
    public static final java.util.HashSet<java.lang.String> copydefault = new java.util.HashSet<>();
    public static InterfaceC49001ugM AEQbTJ = new C49008ugT();
    public static final int EZpvd = 8;

    private C49004ugP() {
    }

    public static final InterfaceC33171mrS KWHzl() {
        return (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
    }

    public final InterfaceC33171mrS djBIcL() {
        return (InterfaceC33171mrS) djBIcL.getValue();
    }

    public final java.lang.String copydefault(InterfaceC49001ugM interfaceC49001ugM) {
        return interfaceC49001ugM.getClass().getName() + "@" + interfaceC49001ugM.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull InterfaceC49001ugM interfaceC49001ugM) {
        boolean z;
        Intrinsics.checkNotNullParameter(interfaceC49001ugM, "");
        AhwBna.add(interfaceC49001ugM);
        java.lang.String strCopydefault = copydefault(interfaceC49001ugM);
        if (KWHzl) {
            java.util.HashSet<java.lang.String> hashSet = copydefault;
            if (hashSet.contains(strCopydefault)) {
                z = false;
            } else {
                interfaceC49001ugM.OLrzqt(C32979mnm.EZpvd.OLrzqt());
                hashSet.add(strCopydefault);
                z = true;
            }
        }
        pUU.EZpvd("ShareDataProviderManager", "registerShareDataProvider->" + strCopydefault + " initWhenRegister:" + z);
    }

    public final InterfaceC49001ugM AYXKKw() {
        java.lang.Object next;
        C48984ufw c48984ufwOLrzqt = OLrzqt();
        java.util.Iterator<T> it = AhwBna.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC49001ugM) next).OLrzqt(c48984ufwOLrzqt)) {
                break;
            }
        }
        InterfaceC49001ugM interfaceC49001ugM = (InterfaceC49001ugM) next;
        if (interfaceC49001ugM == null) {
            interfaceC49001ugM = AEQbTJ;
        }
        pUU.KWHzl("ShareDataProviderManager", "getCurrentShareDataProvider->" + copydefault(interfaceC49001ugM) + "  appModeInfo:" + c48984ufwOLrzqt);
        return interfaceC49001ugM;
    }

    public final ShareData copydefault() {
        return AYXKKw().AkhnZx();
    }

    public final ShareBizCondition EZpvd() {
        return AYXKKw().values();
    }

    public final C48984ufw OLrzqt() {
        return new C48984ufw(djBIcL().isConnected().getValue().intValue());
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        for (InterfaceC49001ugM interfaceC49001ugM : AhwBna) {
            interfaceC49001ugM.OLrzqt(context);
            java.lang.String strCopydefault = OLrzqt.copydefault(interfaceC49001ugM);
            copydefault.add(strCopydefault);
            pUU.KWHzl("ShareDataProviderManager", "initRegisteredProviders->" + strCopydefault);
        }
        KWHzl = true;
        pUU.EZpvd("ShareDataProviderManager", "initRegisteredProviders->mFirstInitCompleted");
    }
}
