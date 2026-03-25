package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchBridgeChains$1;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchBridgeChains$2;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchBridgeChains$3;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchBridgeChains$4;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchBridgeChains$5;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchStrategyChains$1;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchStrategyChains$2;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchStrategyChains$3;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchStrategyChains$4;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchStrategyChains$5;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchSwapChains$1;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchSwapChains$2;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchSwapChains$3;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchSwapChains$4;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$fetchSwapChains$5;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetChainListUseCase$invoke$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.DexStrategyBizMode;

/* JADX INFO: loaded from: classes7.dex */
public final class kUH {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final kUL AEQbTJ;
    public final kUK AYXKKw;
    public final kUP AhwBna;
    public final C2149AAq KWHzl;
    public final InterfaceC25414iwK OLrzqt;
    public final kUI copydefault;
    public final kUQ djBIcL;
    public final kYD fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final kUO valueOf;
    public final kYC values;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainBizType.values().length];
            try {
                iArr[ChainBizType.Single.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainBizType.Bridge.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainBizType.Limit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChainBizType.AllSupported.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ChainBizType.CopyTrading.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ChainBizType.Market.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DexStrategyBizMode.values().length];
            try {
                iArr2[DexStrategyBizMode.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[DexStrategyBizMode.COPY_TRADE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr2;
        }
    }

    @yCM
    public kUH(@NotNull kYC kyc, @NotNull kUI kui, @NotNull kUP kup, @NotNull kUO kuo, @NotNull kUL kul, @NotNull kUK kuk, @NotNull kUQ kuq, @NotNull C2149AAq c2149AAq, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kui, "");
        Intrinsics.checkNotNullParameter(kup, "");
        Intrinsics.checkNotNullParameter(kuo, "");
        Intrinsics.checkNotNullParameter(kul, "");
        Intrinsics.checkNotNullParameter(kuk, "");
        Intrinsics.checkNotNullParameter(kuq, "");
        Intrinsics.checkNotNullParameter(c2149AAq, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(kyd, "");
        this.values = kyc;
        this.copydefault = kui;
        this.AhwBna = kup;
        this.valueOf = kuo;
        this.AEQbTJ = kul;
        this.AYXKKw = kuk;
        this.djBIcL = kuq;
        this.KWHzl = c2149AAq;
        this.OLrzqt = interfaceC25414iwK;
        this.gEmmrt = coroutineDispatcher;
        this.fetchVPNInfo = kyd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kUH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.Object EZpvd(@NotNull ChainBizType chainBizType, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        if (!this.OLrzqt.copydefault()) {
            return EZpvd(chainBizType).KWHzl(continuation);
        }
        return BuildersKt.withContext(this.gEmmrt, new GetChainListUseCase$invoke$2(this, chainBizType, null), continuation);
    }

    public final java.util.List<DefiChainInfo> AEQbTJ(@NotNull ChainBizType chainBizType) {
        Intrinsics.checkNotNullParameter(chainBizType, "");
        return EZpvd(chainBizType).AEQbTJ();
    }

    public final InterfaceC28245kUg KWHzl(@NotNull C28243kUe c28243kUe) {
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.values.copydefault();
        if (interfaceC9738bbJCopydefault != null && interfaceC9738bbJCopydefault.getFieldNames() && !c28243kUe.copydefault().isSupportAAWallet()) {
            return InterfaceC28245kUg.StateListAnimator.OLrzqt;
        }
        return EZpvd(c28243kUe.OLrzqt()).EZpvd(c28243kUe);
    }

    public final java.lang.Object copydefault(ChainBizType chainBizType, Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        switch (StateListAnimator.AEQbTJ[chainBizType.ordinal()]) {
            case 1:
                return copydefault(continuation);
            case 2:
                return OLrzqt(continuation);
            case 3:
                return EZpvd(DexStrategyBizMode.NORMAL, continuation);
            case 4:
                return EZpvd(chainBizType).KWHzl(continuation);
            case 5:
                return EZpvd(DexStrategyBizMode.COPY_TRADE, continuation);
            case 6:
                return this.djBIcL.KWHzl(continuation);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        GetChainListUseCase$fetchSwapChains$1 getChainListUseCase$fetchSwapChains$1;
        java.lang.Object objAEQbTJ;
        kUH kuh;
        if (continuation instanceof GetChainListUseCase$fetchSwapChains$1) {
            getChainListUseCase$fetchSwapChains$1 = (GetChainListUseCase$fetchSwapChains$1) continuation;
            int i = getChainListUseCase$fetchSwapChains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChainListUseCase$fetchSwapChains$1.label = i - Integer.MIN_VALUE;
            } else {
                getChainListUseCase$fetchSwapChains$1 = new GetChainListUseCase$fetchSwapChains$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getChainListUseCase$fetchSwapChains$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getChainListUseCase$fetchSwapChains$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            AFB afbEZpvd = this.KWHzl.EZpvd();
            C33077mpe c33077mpe = new C33077mpe(new GetChainListUseCase$fetchSwapChains$2(afbEZpvd), new GetChainListUseCase$fetchSwapChains$3(afbEZpvd), new GetChainListUseCase$fetchSwapChains$4(afbEZpvd), new GetChainListUseCase$fetchSwapChains$5(afbEZpvd), this.gEmmrt);
            getChainListUseCase$fetchSwapChains$1.L$0 = this;
            getChainListUseCase$fetchSwapChains$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(getChainListUseCase$fetchSwapChains$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            kuh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return (AbstractC43419rot) objKWHzl;
            }
            kuh = (kUH) getChainListUseCase$fetchSwapChains$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            objAEQbTJ = ((Result) objKWHzl).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl == null) {
            java.util.List list = (java.util.List) objAEQbTJ;
            pUU.KWHzl("GetChainListUseCase", "fetchSwapChains core success, size=" + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kTY.EZpvd((AGK) it.next()));
            }
            kuh.fetchVPNInfo.AEQbTJ(arrayList);
            return new AbstractC43419rot.StateListAnimator(arrayList);
        }
        pUU.AEQbTJ("GetChainListUseCase", "fetchSwapChains core failed", thM7380exceptionOrNullimpl);
        C6777aVl.Companion.EZpvd(thM7380exceptionOrNullimpl);
        kUP kup = kuh.AhwBna;
        getChainListUseCase$fetchSwapChains$1.L$0 = null;
        getChainListUseCase$fetchSwapChains$1.label = 2;
        objKWHzl = kup.KWHzl(getChainListUseCase$fetchSwapChains$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        return (AbstractC43419rot) objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        GetChainListUseCase$fetchBridgeChains$1 getChainListUseCase$fetchBridgeChains$1;
        java.lang.Object objAEQbTJ;
        kUH kuh;
        if (continuation instanceof GetChainListUseCase$fetchBridgeChains$1) {
            getChainListUseCase$fetchBridgeChains$1 = (GetChainListUseCase$fetchBridgeChains$1) continuation;
            int i = getChainListUseCase$fetchBridgeChains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChainListUseCase$fetchBridgeChains$1.label = i - Integer.MIN_VALUE;
            } else {
                getChainListUseCase$fetchBridgeChains$1 = new GetChainListUseCase$fetchBridgeChains$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getChainListUseCase$fetchBridgeChains$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getChainListUseCase$fetchBridgeChains$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C2204ACt c2204ACtAEQbTJ = this.KWHzl.AEQbTJ();
            C33077mpe c33077mpe = new C33077mpe(new GetChainListUseCase$fetchBridgeChains$2(c2204ACtAEQbTJ), new GetChainListUseCase$fetchBridgeChains$3(c2204ACtAEQbTJ), new GetChainListUseCase$fetchBridgeChains$4(c2204ACtAEQbTJ), new GetChainListUseCase$fetchBridgeChains$5(c2204ACtAEQbTJ), this.gEmmrt);
            getChainListUseCase$fetchBridgeChains$1.L$0 = this;
            getChainListUseCase$fetchBridgeChains$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(getChainListUseCase$fetchBridgeChains$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            kuh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return (AbstractC43419rot) objKWHzl;
            }
            kuh = (kUH) getChainListUseCase$fetchBridgeChains$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            objAEQbTJ = ((Result) objKWHzl).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl == null) {
            java.util.List list = (java.util.List) objAEQbTJ;
            pUU.KWHzl("GetChainListUseCase", "fetchBridgeChains core success, size=" + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kTY.KWHzl((C4132AzA) it.next()));
            }
            kuh.fetchVPNInfo.OLrzqt(arrayList);
            return new AbstractC43419rot.StateListAnimator(arrayList);
        }
        pUU.AEQbTJ("GetChainListUseCase", "fetchBridgeChains core failed", thM7380exceptionOrNullimpl);
        C6777aVl.Companion.EZpvd(thM7380exceptionOrNullimpl);
        kUL kul = kuh.AEQbTJ;
        getChainListUseCase$fetchBridgeChains$1.L$0 = null;
        getChainListUseCase$fetchBridgeChains$1.label = 2;
        objKWHzl = kul.KWHzl(getChainListUseCase$fetchBridgeChains$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        return (AbstractC43419rot) objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(DexStrategyBizMode dexStrategyBizMode, Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        GetChainListUseCase$fetchStrategyChains$1 getChainListUseCase$fetchStrategyChains$1;
        java.lang.Object objAEQbTJ;
        kUH kuh;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof GetChainListUseCase$fetchStrategyChains$1) {
            getChainListUseCase$fetchStrategyChains$1 = (GetChainListUseCase$fetchStrategyChains$1) continuation;
            int i = getChainListUseCase$fetchStrategyChains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChainListUseCase$fetchStrategyChains$1.label = i - Integer.MIN_VALUE;
            } else {
                getChainListUseCase$fetchStrategyChains$1 = new GetChainListUseCase$fetchStrategyChains$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getChainListUseCase$fetchStrategyChains$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getChainListUseCase$fetchStrategyChains$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            AEX aexCopydefault = this.KWHzl.copydefault(dexStrategyBizMode, (java.lang.String) null);
            C33077mpe c33077mpe = new C33077mpe(new GetChainListUseCase$fetchStrategyChains$2(aexCopydefault), new GetChainListUseCase$fetchStrategyChains$3(aexCopydefault), new GetChainListUseCase$fetchStrategyChains$4(aexCopydefault), new GetChainListUseCase$fetchStrategyChains$5(aexCopydefault), this.gEmmrt);
            getChainListUseCase$fetchStrategyChains$1.L$0 = this;
            getChainListUseCase$fetchStrategyChains$1.L$1 = dexStrategyBizMode;
            getChainListUseCase$fetchStrategyChains$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(getChainListUseCase$fetchStrategyChains$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            kuh = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    abstractC43419rot = (AbstractC43419rot) objKWHzl;
                    return abstractC43419rot;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                abstractC43419rot = (AbstractC43419rot) objKWHzl;
                return abstractC43419rot;
            }
            dexStrategyBizMode = (DexStrategyBizMode) getChainListUseCase$fetchStrategyChains$1.L$1;
            kuh = (kUH) getChainListUseCase$fetchStrategyChains$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            objAEQbTJ = ((Result) objKWHzl).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl == null) {
            java.util.List list = (java.util.List) objAEQbTJ;
            pUU.KWHzl("GetChainListUseCase", "fetchStrategyChains core success, size=" + list.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kTY.KWHzl((AGE) it.next()));
            }
            kuh.fetchVPNInfo.copydefault(arrayList, dexStrategyBizMode);
            return new AbstractC43419rot.StateListAnimator(arrayList);
        }
        pUU.AEQbTJ("GetChainListUseCase", "fetchStrategyChains core failed", thM7380exceptionOrNullimpl);
        C6777aVl.Companion.EZpvd(thM7380exceptionOrNullimpl);
        int i3 = StateListAnimator.KWHzl[dexStrategyBizMode.ordinal()];
        if (i3 == 1) {
            kUO kuo = kuh.valueOf;
            getChainListUseCase$fetchStrategyChains$1.L$0 = null;
            getChainListUseCase$fetchStrategyChains$1.L$1 = null;
            getChainListUseCase$fetchStrategyChains$1.label = 2;
            objKWHzl = kuo.KWHzl(getChainListUseCase$fetchStrategyChains$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot = (AbstractC43419rot) objKWHzl;
            return abstractC43419rot;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        kUK kuk = kuh.AYXKKw;
        getChainListUseCase$fetchStrategyChains$1.L$0 = null;
        getChainListUseCase$fetchStrategyChains$1.L$1 = null;
        getChainListUseCase$fetchStrategyChains$1.label = 3;
        objKWHzl = kuk.KWHzl(getChainListUseCase$fetchStrategyChains$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) objKWHzl;
        return abstractC43419rot;
    }

    public final kUJ EZpvd(ChainBizType chainBizType) {
        switch (StateListAnimator.AEQbTJ[chainBizType.ordinal()]) {
            case 1:
                return this.AhwBna;
            case 2:
                return this.AEQbTJ;
            case 3:
                return this.valueOf;
            case 4:
                return this.copydefault;
            case 5:
                return this.AYXKKw;
            case 6:
                return this.djBIcL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
