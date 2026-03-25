package com.okinc.im.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.okinc.p2p.api.OTCService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36600ody;
import o.C43251rlk;
import o.C58113yvE;
import o.InterfaceC31257lqc;
import o.InterfaceC35180nqU;
import o.InterfaceC37981pHw;
import o.InterfaceC44375sNm;
import o.InterfaceC47230tmC;
import o.InterfaceC47278tmy;
import o.InterfaceC6804aWL;
import o.InterfaceC8171axh;
import o.sHZ;
import o.sIR;
import o.sNF;
import o.tWL;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CoreModule {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.di.CoreModule.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Handler copydefault() {
        return new Handler(Looper.getMainLooper());
    }

    @yCL(AEQbTJ = "IMSharePreference")
    public final SharedPreferences copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("config", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return sharedPreferences;
    }

    public final C36600ody valueOf() {
        return C36600ody.Companion.OLrzqt();
    }

    public final InterfaceC44375sNm EZpvd(@NotNull sHZ shz) {
        Intrinsics.checkNotNullParameter(shz, "");
        return shz.EZpvd();
    }

    public final sIR copydefault(@NotNull sHZ shz) {
        Intrinsics.checkNotNullParameter(shz, "");
        return shz.copydefault();
    }

    public final sNF AEQbTJ(@NotNull sHZ shz) {
        Intrinsics.checkNotNullParameter(shz, "");
        return shz.djBIcL();
    }

    @yCL(AEQbTJ = "IMUserManager")
    public final InterfaceC47278tmy AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC47230tmC) C58113yvE.copydefault(context, InterfaceC47230tmC.class)).fmB();
    }

    @yCL(AEQbTJ = "IMAffiliateService")
    public final InterfaceC8171axh EZpvd() {
        return (InterfaceC8171axh) C43251rlk.OLrzqt(InterfaceC8171axh.class);
    }

    @yCL(AEQbTJ = "IMBroadcastMessageIdGenerator")
    public final AtomicInteger KWHzl() {
        return new AtomicInteger(0);
    }

    @yCL(AEQbTJ = "IMOnlineServiceService")
    public final InterfaceC6804aWL AEQbTJ() {
        return (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
    }

    @yCL(AEQbTJ = "IMComplianceService")
    public final InterfaceC37981pHw OLrzqt() {
        return (InterfaceC37981pHw) C43251rlk.OLrzqt(InterfaceC37981pHw.class);
    }

    public final InterfaceC35180nqU AYXKKw() {
        return (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
    }

    public final OTCService AhwBna() {
        return (OTCService) C43251rlk.OLrzqt(OTCService.class);
    }

    @yCL(AEQbTJ = "IMPlanetService")
    public final tWL gEmmrt() {
        return (tWL) C43251rlk.copydefault(tWL.class);
    }

    @yCL(AEQbTJ = "IMWeb3PayService")
    public final InterfaceC31257lqc djBIcL() {
        return (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
    }
}
