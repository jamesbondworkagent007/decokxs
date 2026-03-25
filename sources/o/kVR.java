package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.usecase.MemeQuickModePreloadUseCase$preload$configResultsTask$1;
import com.okinc.business.trade.features.home.meme.usecase.MemeQuickModePreloadUseCase$preload$tokenPairTask$1;
import com.okinc.business.trade.features.home.meme.usecase.MemeQuickModePreloadUseCase$preloadCache$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class kVR {
    public static long AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final kVU AYXKKw;
    public final MemeQuickModePreloadUseCase$preloadCache$1 AhwBna;
    public final kKG DbNXlk;
    public final kVV EZpvd;
    public final kVP KWHzl;
    public final java.lang.Object copydefault;
    public final C28296kWd djBIcL;
    public final C22311hcv fetchVPNInfo;
    public final C28297kWe gEmmrt;
    public final CoroutineScope valueOf;

    @yCM
    public kVR(@NotNull kVU kvu, @NotNull kVP kvp, @NotNull C28296kWd c28296kWd, @NotNull kVV kvv, @NotNull C28297kWe c28297kWe, @NotNull C22311hcv c22311hcv, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kvu, "");
        Intrinsics.checkNotNullParameter(kvp, "");
        Intrinsics.checkNotNullParameter(c28296kWd, "");
        Intrinsics.checkNotNullParameter(kvv, "");
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        Intrinsics.checkNotNullParameter(c22311hcv, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.AYXKKw = kvu;
        this.KWHzl = kvp;
        this.djBIcL = c28296kWd;
        this.EZpvd = kvv;
        this.gEmmrt = c28297kWe;
        this.fetchVPNInfo = c22311hcv;
        this.DbNXlk = kkg;
        this.copydefault = new java.lang.Object();
        this.AhwBna = new MemeQuickModePreloadUseCase$preloadCache$1();
        this.valueOf = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kVR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final class StateListAnimator {
        public final long AEQbTJ;
        public final Deferred<Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> KWHzl;
        public final Deferred<kXM> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kVR$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Deferred deferred, Deferred deferred2, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deferred = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                deferred2 = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                j = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(deferred, deferred2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Deferred<kXM> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Deferred<Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull Deferred<Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> deferred, @NotNull Deferred<kXM> deferred2, long j) {
            Intrinsics.checkNotNullParameter(deferred, "");
            Intrinsics.checkNotNullParameter(deferred2, "");
            return new StateListAnimator(deferred, deferred2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PreloadData(tokenPairTask=" + this.KWHzl + ", configResultsTask=" + this.copydefault + ", timestamp=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull Deferred<Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> deferred, @NotNull Deferred<kXM> deferred2, long j) {
            Intrinsics.checkNotNullParameter(deferred, "");
            Intrinsics.checkNotNullParameter(deferred2, "");
            this.KWHzl = deferred;
            this.copydefault = deferred2;
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 kotlinx.coroutines.Deferred)
  (r2v0 kotlinx.coroutines.Deferred)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:61)) : (r3v0 long))
 A[MD:(kotlinx.coroutines.Deferred<kotlin.Result<kotlin.Pair<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>>>, kotlinx.coroutines.Deferred<o.kXM>, long):void (m)] (LINE:58) call: o.kVR.StateListAnimator.<init>(kotlinx.coroutines.Deferred, kotlinx.coroutines.Deferred, long):void type: THIS */
        public /* synthetic */ StateListAnimator(Deferred deferred, Deferred deferred2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deferred, deferred2, (i & 4) != 0 ? java.lang.System.currentTimeMillis() : j);
        }

        public final void copydefault() {
            if (this.KWHzl.isActive()) {
                Job.DefaultImpls.cancel$default((Job) this.KWHzl, (CancellationException) null, 1, (java.lang.Object) null);
            }
            if (this.copydefault.isActive()) {
                Job.DefaultImpls.cancel$default((Job) this.copydefault, (CancellationException) null, 1, (java.lang.Object) null);
            }
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        java.lang.String chainId = tokenBase.getChainId();
        java.lang.String tokenContractAddress = tokenBase.getTokenContractAddress();
        java.lang.String strAEQbTJ = AEQbTJ(chainId, tokenContractAddress);
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.valueOf, null, null, new MemeQuickModePreloadUseCase$preload$tokenPairTask$1(this, chainId, tokenContractAddress, this.fetchVPNInfo.AEQbTJ(chainId), null), 3, null);
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(this.valueOf, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1(this, chainId, null), 3, null);
        synchronized (this.copydefault) {
            StateListAnimator stateListAnimator = (StateListAnimator) this.AhwBna.remove((java.lang.Object) strAEQbTJ);
            if (stateListAnimator != null) {
                stateListAnimator.copydefault();
            }
            this.AhwBna.put(strAEQbTJ, new StateListAnimator(deferredAsync$default, deferredAsync$default2, 0L, 4, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ = AEQbTJ(str, str2);
        synchronized (this.copydefault) {
            StateListAnimator stateListAnimator = (StateListAnimator) this.AhwBna.get((java.lang.Object) strAEQbTJ);
            if (stateListAnimator == null) {
                return null;
            }
            if (java.lang.System.currentTimeMillis() - stateListAnimator.KWHzl() <= 300000) {
                return stateListAnimator;
            }
            StateListAnimator stateListAnimator2 = (StateListAnimator) this.AhwBna.remove((java.lang.Object) strAEQbTJ);
            if (stateListAnimator2 != null) {
                stateListAnimator2.copydefault();
            }
            return null;
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public final void EZpvd() {
        AEQbTJ = java.lang.System.currentTimeMillis();
    }

    public final void OLrzqt(final boolean z, int i) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - AEQbTJ;
        pUU.KWHzl("MemePerformance", "User perspective time consumption statistics: duration=" + jCurrentTimeMillis + "ms, isCached=" + z + ", style=" + C31172lox.OLrzqt(i));
        C32866mlf.onEvent$default("DEXTrade_Home_LoadPerformance_View", (TrackChannel[]) null, new Function1() { // from class: o.kVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kVR.KWHzl(z, jCurrentTimeMillis, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(boolean z, long j, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("if_cache", z ? "yes" : "no", true);
        eventParamsList.put("time_spend", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), true);
        return Unit.INSTANCE;
    }
}
