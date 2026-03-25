package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eIR implements eIT {
    public final Function1<TxRecord, C15491eKh> copydefault = new Function1() { // from class: o.eIP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return eIR.gEmmrt((TxRecord) obj);
        }
    };
    public final Function1<TxRecord, C15494eKk> AEQbTJ = new Function1() { // from class: o.eIS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return eIR.djBIcL((TxRecord) obj);
        }
    };
    public final Function1<TxRecord, C15492eKi> KWHzl = new Function1() { // from class: o.eIQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return eIR.AYXKKw((TxRecord) obj);
        }
    };
    public final Function1<TxRecord, C15493eKj> OLrzqt = new Function1() { // from class: o.eIU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return eIR.isConnected((TxRecord) obj);
        }
    };
    public final Function1<TxRecord, C15500eKq> AYXKKw = new Function1() { // from class: o.eIW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return eIR.fetchVPNInfo((TxRecord) obj);
        }
    };
    public final Function1<TxRecord, C15499eKp> AhwBna = new Function1() { // from class: o.eIX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return eIR.values((TxRecord) obj);
        }
    };
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.eIV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eIR.AEQbTJ(this.EZpvd);
        }
    });

    public static final C15491eKh gEmmrt(TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return new C15491eKh(txRecord);
    }

    public static final C15494eKk djBIcL(TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return new C15494eKk(txRecord);
    }

    public static final C15492eKi AYXKKw(TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return new C15492eKi(txRecord);
    }

    public static final C15493eKj isConnected(TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return new C15493eKj(txRecord);
    }

    public static final C15500eKq fetchVPNInfo(TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return new C15500eKq(txRecord);
    }

    public static final C15499eKp values(TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        return new C15499eKp(txRecord);
    }

    public final java.util.HashMap<java.lang.Integer, Function1<TxRecord, C15489eKf>> OLrzqt() {
        return (java.util.HashMap) this.EZpvd.getValue();
    }

    public static final java.util.HashMap AEQbTJ(eIR eir) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(1, eir.copydefault);
        map.put(2, eir.copydefault);
        map.put(3, eir.AEQbTJ);
        map.put(80, eir.AEQbTJ);
        map.put(4, eir.AEQbTJ);
        map.put(5, eir.AhwBna);
        map.put(7, eir.AEQbTJ);
        map.put(8, eir.copydefault);
        map.put(10, eir.copydefault);
        map.put(9, eir.copydefault);
        map.put(11, eir.AEQbTJ);
        map.put(12, eir.copydefault);
        map.put(6, eir.AEQbTJ);
        map.put(20, eir.AYXKKw);
        map.put(21, eir.AYXKKw);
        map.put(22, eir.AYXKKw);
        map.put(23, eir.AYXKKw);
        map.put(24, eir.AYXKKw);
        map.put(25, eir.AYXKKw);
        map.put(30, eir.KWHzl);
        map.put(31, eir.KWHzl);
        map.put(32, eir.OLrzqt);
        map.put(26, eir.AYXKKw);
        map.put(27, eir.AEQbTJ);
        map.put(40, eir.AhwBna);
        map.put(41, eir.AhwBna);
        map.put(42, eir.AhwBna);
        map.put(43, eir.copydefault);
        map.put(44, eir.copydefault);
        map.put(45, eir.copydefault);
        map.put(53, eir.copydefault);
        map.put(54, eir.copydefault);
        map.put(52, eir.AhwBna);
        map.put(51, eir.copydefault);
        map.put(50, eir.AhwBna);
        map.put(60, eir.AhwBna);
        map.put(61, eir.AhwBna);
        map.put(62, eir.AhwBna);
        map.put(33, eir.KWHzl);
        map.put(34, eir.KWHzl);
        map.put(35, eir.OLrzqt);
        map.put(36, eir.AhwBna);
        map.put(56, eir.copydefault);
        map.put(57, eir.copydefault);
        map.put(58, eir.copydefault);
        map.put(59, eir.AhwBna);
        map.put(65, eir.copydefault);
        map.put(72, eir.copydefault);
        map.put(74, eir.AhwBna);
        map.put(66, eir.AhwBna);
        map.put(67, eir.AhwBna);
        map.put(68, eir.AhwBna);
        map.put(84, eir.copydefault);
        map.put(85, eir.copydefault);
        map.put(87, eir.copydefault);
        return map;
    }

    @Override // o.eIT
    public C15489eKf KWHzl(@NotNull TxRecord txRecord) {
        C15489eKf c15489eKfInvoke;
        Intrinsics.checkNotNullParameter(txRecord, "");
        Function1<TxRecord, C15489eKf> function1 = OLrzqt().get(java.lang.Integer.valueOf(txRecord.getTxType()));
        return (function1 == null || (c15489eKfInvoke = function1.invoke(txRecord)) == null) ? this.AEQbTJ.invoke(txRecord) : c15489eKfInvoke;
    }
}
