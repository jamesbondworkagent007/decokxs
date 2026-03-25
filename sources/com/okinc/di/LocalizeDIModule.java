package com.okinc.di;

import android.content.Context;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.KeysLog;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C38311pUb;
import o.C38313pUd;
import o.C38319pUj;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.pSN;
import o.pTE;
import o.pTJ;
import o.pTM;
import o.pTQ;
import o.pTU;
import o.pTX;
import o.pUA;
import o.pUE;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalizeDIModule {
    public static final LocalizeDIModule KWHzl = new LocalizeDIModule();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ngP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LocalizeDIModule.AhwBna();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ngS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LocalizeDIModule.valueOf();
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ngQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LocalizeDIModule.EZpvd();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ngT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LocalizeDIModule.AYXKKw();
        }
    });
    public static final int AEQbTJ = 8;

    public interface Activity {
        pTQ AxsJAYaxsJAY();

        pTU gkJEwt();
    }

    public interface Application {
        pTJ AxsJAYsNCnLh();

        C38319pUj DAIeex();

        pUA RlQdEF();

        pUE accept();

        LanguagesListRepository iRxXKY();

        C38313pUd iZzfmt();
    }

    public interface StateListAnimator {
        C38311pUb hUfVAv();
    }

    public interface TaskDescription {
        pTM QKudOq();
    }

    private LocalizeDIModule() {
    }

    public final pSN fetchVPNInfo() {
        return (pSN) OLrzqt.getValue();
    }

    public static final pSN AhwBna() {
        return new pSN();
    }

    public final pSN DbNXlk() {
        return (pSN) AYXKKw.getValue();
    }

    public static final pSN valueOf() {
        return new pSN();
    }

    public final pSN djBIcL() {
        return (pSN) EZpvd.getValue();
    }

    public static final pSN EZpvd() {
        return new pSN();
    }

    public final pSN gEmmrt() {
        return (pSN) copydefault.getValue();
    }

    public static final pSN AYXKKw() {
        return new pSN();
    }

    @yCR
    public final C38313pUd KWHzl(@NotNull Context context, @NotNull C38311pUb c38311pUb, @NotNull LanguagesListRepository languagesListRepository, @NotNull pTX ptx, @NotNull pTE pte, @NotNull C38319pUj c38319pUj, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(languagesListRepository, "");
        Intrinsics.checkNotNullParameter(ptx, "");
        Intrinsics.checkNotNullParameter(pte, "");
        Intrinsics.checkNotNullParameter(c38319pUj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        return new C38313pUd(context, fetchVPNInfo(), DbNXlk(), djBIcL(), gEmmrt(), c38311pUb, languagesListRepository, ptx, pte, c38319pUj, coroutineDispatcher, coroutineDispatcher2);
    }

    @yCR
    public final pUA AEQbTJ(@NotNull C38311pUb c38311pUb, @NotNull KeysLog keysLog) {
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(keysLog, "");
        return new pUA(fetchVPNInfo(), DbNXlk(), djBIcL(), gEmmrt(), c38311pUb, keysLog);
    }
}
