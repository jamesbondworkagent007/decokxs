package o;

import com.okinc.business.dex.dynamic.di.CommonDependencyProvider$marketRepository$2$1$getMarketInfo$2;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC9859bdY;

/* JADX INFO: renamed from: o.gLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19691gLt {
    public static final C19691gLt KWHzl = new C19691gLt();
    public static final CoroutineDispatcher copydefault = Dispatchers.getIO();
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gLu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.values();
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gLv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.AkhnZx();
        }
    });
    public static final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.gLA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.AuCTel();
        }
    });
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.gLz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.ejfBZ();
        }
    });
    public static final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.gLx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.fARcdN();
        }
    });
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.gLw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.fJNWhG();
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gLy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.isConnected();
        }
    });
    public static final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.gLB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.fIwbmz();
        }
    });
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.gLD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.fetchVPNInfo();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.gLE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19691gLt.DbNXlk();
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher uzCIH() {
        return copydefault;
    }

    private C19691gLt() {
    }

    public final InterfaceC27595jyE getFieldNames() {
        return (InterfaceC27595jyE) gEmmrt.getValue();
    }

    public static final InterfaceC27595jyE values() {
        return (InterfaceC27595jyE) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC27595jyE.class), C23222huE.AEQbTJ);
    }

    public static final InterfaceC23229huL AkhnZx() {
        return (InterfaceC23229huL) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC23229huL.class), C23222huE.AEQbTJ);
    }

    public final InterfaceC9859bdY wlaJM() {
        return (InterfaceC9859bdY) values.getValue();
    }

    public static final InterfaceC9859bdY AuCTel() {
        return (InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class);
    }

    public final C57567ykp AuCTelauCTel() {
        return (C57567ykp) valueOf.getValue();
    }

    public static final C57567ykp ejfBZ() {
        return InterfaceC9859bdY.Application.walletPublicConnection$default(KWHzl.wlaJM(), false, 1, null);
    }

    public final C27640jyx zLjUOn() {
        return (C27640jyx) AkhnZx.getValue();
    }

    public static final C27640jyx fARcdN() {
        return new C27640jyx(KWHzl.AuCTelauCTel());
    }

    public final InterfaceC9852bdR AubY() {
        return (InterfaceC9852bdR) djBIcL.getValue();
    }

    public static final InterfaceC9852bdR fJNWhG() {
        return (InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class);
    }

    public final kKC iwGUEr() {
        return (kKC) EZpvd.getValue();
    }

    public static final kKC isConnected() {
        return new kKC(KWHzl.AubY(), copydefault);
    }

    public final kKG zsXlph() {
        return (kKG) DbNXlk.getValue();
    }

    public static final kKG fIwbmz() {
        return new kKG(KWHzl.iwGUEr(), copydefault);
    }

    public final InterfaceC27628jyl hDKMBd() {
        return (InterfaceC27628jyl) AhwBna.getValue();
    }

    public static final Activity fetchVPNInfo() {
        return new Activity();
    }

    /* JADX INFO: renamed from: o.gLt$Activity */
    public static final class Activity implements InterfaceC27628jyl {
        @Override // o.InterfaceC27628jyl
        public java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation) {
            return kAB.EZpvd(new CommonDependencyProvider$marketRepository$2$1$getMarketInfo$2(str, str2, str3, null), continuation);
        }
    }

    public final C27629jym getNewProxyInstance() {
        return (C27629jym) AYXKKw.getValue();
    }

    public static final C27629jym DbNXlk() {
        C19691gLt c19691gLt = KWHzl;
        return new C27629jym(c19691gLt.zsXlph(), c19691gLt.hDKMBd(), copydefault);
    }
}
