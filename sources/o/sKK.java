package o;

import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMAuthService;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMUserService;
import dagger.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sKK implements sHZ {
    public final CoroutineScope AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final sIC AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final sHU KWHzl;
    public final InHouseIMAuthService OLrzqt;
    public final sFU copydefault;
    public final sGH djBIcL;
    public final InterfaceC56387yDm fIwbmz;
    public final sKD fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final Lazy<C44127sEh> isConnected;
    public final InterfaceC44505sSh valueOf;
    public final InHouseIMUserService values;

    @yCM
    public sKK(@NotNull sFU sfu, @NotNull sHU shu, @NotNull sIC sic, @NotNull sKD skd, @NotNull InterfaceC44505sSh interfaceC44505sSh, @NotNull sGH sgh, @NotNull InHouseIMUserService inHouseIMUserService, @NotNull InHouseIMAuthService inHouseIMAuthService, @NotNull Lazy<C44127sEh> lazy, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(shu, "");
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(skd, "");
        Intrinsics.checkNotNullParameter(interfaceC44505sSh, "");
        Intrinsics.checkNotNullParameter(sgh, "");
        Intrinsics.checkNotNullParameter(inHouseIMUserService, "");
        Intrinsics.checkNotNullParameter(inHouseIMAuthService, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = sfu;
        this.KWHzl = shu;
        this.AhwBna = sic;
        this.fetchVPNInfo = skd;
        this.valueOf = interfaceC44505sSh;
        this.djBIcL = sgh;
        this.values = inHouseIMUserService;
        this.OLrzqt = inHouseIMAuthService;
        this.isConnected = lazy;
        this.gEmmrt = coroutineDispatcher;
        this.AEQbTJ = coroutineScope;
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.sKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sKK.gEmmrt(this.copydefault);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sKK.djBIcL(this.KWHzl);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.sKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sKK.AhwBna(this.EZpvd);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.sKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sKK.valueOf(this.KWHzl);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sKK.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final C44138sEs gEmmrt(sKK skk) {
        return skk.valueOf();
    }

    @Override // o.sHZ
    public InterfaceC44285sKd KWHzl() {
        return (InterfaceC44285sKd) this.AkhnZx.getValue();
    }

    public static final C44126sEg djBIcL(sKK skk) {
        return skk.AhwBna();
    }

    @Override // o.sHZ
    public InterfaceC44282sKa OLrzqt() {
        return (InterfaceC44282sKa) this.EZpvd.getValue();
    }

    public static final C44136sEq AhwBna(sKK skk) {
        return skk.AYXKKw();
    }

    @Override // o.sHZ
    public InterfaceC44375sNm EZpvd() {
        return (InterfaceC44375sNm) this.DbNXlk.getValue();
    }

    public static final sEA valueOf(sKK skk) {
        return skk.isConnected();
    }

    @Override // o.sHZ
    public sNF djBIcL() {
        return (sNF) this.fIwbmz.getValue();
    }

    @Override // o.sHZ
    public sIR copydefault() {
        C44127sEh c44127sEh = this.isConnected.get();
        Intrinsics.checkNotNullExpressionValue(c44127sEh, "");
        return c44127sEh;
    }

    public static final C44128sEi AYXKKw(sKK skk) {
        return skk.gEmmrt();
    }

    @Override // o.sHZ
    public InterfaceC44177sGd AEQbTJ() {
        return (InterfaceC44177sGd) this.AYXKKw.getValue();
    }

    public final C44128sEi gEmmrt() {
        sHU shu = this.KWHzl;
        InHouseIMUserService inHouseIMUserService = this.values;
        InHouseIMAuthService inHouseIMAuthService = this.OLrzqt;
        return new C44128sEi(this.gEmmrt, shu, this.copydefault, inHouseIMUserService, inHouseIMAuthService, this.AhwBna, this.djBIcL);
    }

    public final C44138sEs valueOf() {
        return new C44138sEs(this.KWHzl, this.copydefault, this.fetchVPNInfo, this.valueOf, this.gEmmrt, this.AEQbTJ);
    }

    public final C44126sEg AhwBna() {
        sHU shu = this.KWHzl;
        return new C44126sEg(shu, shu.AkhnZx());
    }

    public final C44136sEq AYXKKw() {
        return new C44136sEq(this.KWHzl, this.copydefault, this.AhwBna, this.AEQbTJ);
    }

    public final sEA isConnected() {
        return new sEA(this.KWHzl, this.copydefault, this.gEmmrt, this.AEQbTJ);
    }
}
