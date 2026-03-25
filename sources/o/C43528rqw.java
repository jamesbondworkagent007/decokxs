package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C57554ykc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C43528rqw {
    public java.util.ArrayList<InterfaceC57559ykh> AEQbTJ;
    public C57567ykp copydefault;
    public java.lang.String OLrzqt = "";
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rqx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43528rqw.EZpvd();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rqz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43528rqw.KWHzl();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.rqy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43528rqw.EZpvd(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(C57567ykp c57567ykp) {
        this.copydefault = c57567ykp;
    }

    public final java.util.ArrayList<InterfaceC43490rqK<java.lang.String>> gEmmrt() {
        return (java.util.ArrayList) this.EZpvd.getValue();
    }

    public static final java.util.ArrayList EZpvd() {
        return new java.util.ArrayList();
    }

    public final java.util.HashMap<java.lang.String, InterfaceC43490rqK<java.lang.String>> djBIcL() {
        return (java.util.HashMap) this.KWHzl.getValue();
    }

    public static final java.util.HashMap KWHzl() {
        return new java.util.HashMap();
    }

    public AbstractC57556yke valueOf() {
        return (AbstractC57556yke) this.AhwBna.getValue();
    }

    public static final AbstractC57556yke EZpvd(final C43528rqw c43528rqw) {
        if (c43528rqw.copydefault == null && C57601ylW.AEQbTJ()) {
            throw new java.lang.RuntimeException("must set OKWSConnection first");
        }
        C57554ykc.Application application = C57554ykc.Companion;
        java.lang.String strAYXKKw = c43528rqw.AYXKKw();
        C57567ykp c57567ykp = c43528rqw.copydefault;
        Intrinsics.copydefault(c57567ykp);
        java.util.ArrayList<InterfaceC57559ykh> arrayListCopydefault = c43528rqw.AEQbTJ;
        if (arrayListCopydefault != null) {
            Intrinsics.copydefault(arrayListCopydefault);
        } else {
            arrayListCopydefault = yDY.copydefault(new WsArgV5(c43528rqw.AYXKKw(), null, null, null, null, null, null, null, 254, null));
        }
        return application.AEQbTJ(strAYXKKw, c57567ykp, arrayListCopydefault, new Function2() { // from class: o.rqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C43528rqw.KWHzl(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit KWHzl(C43528rqw c43528rqw, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        java.lang.Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        c43528rqw.AEQbTJ((java.lang.String) payload);
        java.lang.Object payload2 = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload2, "");
        c43528rqw.KWHzl((java.lang.String) payload2);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str) {
        java.util.Iterator<T> it = gEmmrt().iterator();
        while (it.hasNext()) {
            ((InterfaceC43490rqK) it.next()).AEQbTJ(str);
        }
    }

    public final void OLrzqt() {
        if (valueOf().KWHzl()) {
            return;
        }
        valueOf().AhwBna();
    }

    public final void isConnected() {
        valueOf().djBIcL();
        gEmmrt().clear();
        djBIcL().clear();
    }

    public void AhwBna() {
        isConnected();
    }
}
