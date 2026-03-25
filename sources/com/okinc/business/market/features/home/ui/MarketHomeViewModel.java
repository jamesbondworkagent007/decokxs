package com.okinc.business.market.features.home.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C25625jAi;
import o.C25983jNp;
import o.C27633jyq;
import o.C27634jyr;
import o.C28404kaD;
import o.C28446kat;
import o.C29709kyk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28403kaC;
import o.InterfaceC9738bbJ;
import o.jRP;
import o.jRQ;
import o.kKG;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketHomeViewModel extends ViewModel {
    public boolean AYXKKw;
    public final C28446kat AhwBna;
    public Integer AkhnZx;
    public final StateFlow<InterfaceC28403kaC> DbNXlk;
    public final MutableStateFlow<InterfaceC28403kaC> EZpvd;
    public final MutableStateFlow<C28404kaD> KWHzl;
    public List<String> OLrzqt;
    public final jRQ copydefault;
    public final C27634jyr djBIcL;
    public final kKG fJNWhG;
    public final C27633jyq fetchVPNInfo;
    public final C25983jNp gEmmrt;
    public final StateFlow<C28404kaD> isConnected;
    public final C29709kyk valueOf;
    public final C25625jAi values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28404kaD> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28403kaC> copydefault() {
        return this.DbNXlk;
    }

    @yCM
    public MarketHomeViewModel(@NotNull C25983jNp c25983jNp, @NotNull C28446kat c28446kat, @NotNull C27633jyq c27633jyq, @NotNull C29709kyk c29709kyk, @NotNull jRQ jrq, @NotNull kKG kkg, @NotNull C25625jAi c25625jAi, @NotNull C27634jyr c27634jyr) {
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(c28446kat, "");
        Intrinsics.checkNotNullParameter(c27633jyq, "");
        Intrinsics.checkNotNullParameter(c29709kyk, "");
        Intrinsics.checkNotNullParameter(jrq, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c25625jAi, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        this.gEmmrt = c25983jNp;
        this.AhwBna = c28446kat;
        this.fetchVPNInfo = c27633jyq;
        this.valueOf = c29709kyk;
        this.copydefault = jrq;
        this.fJNWhG = kkg;
        this.values = c25625jAi;
        this.djBIcL = c27634jyr;
        MutableStateFlow<InterfaceC28403kaC> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28403kaC.ActionBar.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C28404kaD> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C28404kaD(false, false, 3, null));
        this.KWHzl = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        this.OLrzqt = yDY.AhwBna();
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketHomeViewModel$loadData$1(this, str, null), 3, null);
    }

    public final void AhwBna() {
        this.EZpvd.setValue(InterfaceC28403kaC.TaskDescription.AEQbTJ);
    }

    public final int EZpvd() {
        Integer num = this.AkhnZx;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void EZpvd(int i) {
        this.AkhnZx = Integer.valueOf(i);
    }

    public final void OLrzqt() {
        C28404kaD value;
        if (this.values.copydefault()) {
            djBIcL();
            return;
        }
        MutableStateFlow<C28404kaD> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.EZpvd(false, false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Unit> continuation) throws Throwable {
        MarketHomeViewModel$fetchBannerTokens$1 marketHomeViewModel$fetchBannerTokens$1;
        Object objCopydefault;
        MarketHomeViewModel marketHomeViewModel;
        if (continuation instanceof MarketHomeViewModel$fetchBannerTokens$1) {
            marketHomeViewModel$fetchBannerTokens$1 = (MarketHomeViewModel$fetchBannerTokens$1) continuation;
            int i = marketHomeViewModel$fetchBannerTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomeViewModel$fetchBannerTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomeViewModel$fetchBannerTokens$1 = new MarketHomeViewModel$fetchBannerTokens$1(this, continuation);
            }
        }
        Object obj = marketHomeViewModel$fetchBannerTokens$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketHomeViewModel$fetchBannerTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jRQ jrq = this.copydefault;
            marketHomeViewModel$fetchBannerTokens$1.L$0 = this;
            marketHomeViewModel$fetchBannerTokens$1.label = 1;
            objCopydefault = jrq.copydefault(marketHomeViewModel$fetchBannerTokens$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            marketHomeViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            marketHomeViewModel = (MarketHomeViewModel) marketHomeViewModel$fetchBannerTokens$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            List list = (List) objCopydefault;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((jRP) it.next()).AYXKKw());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            marketHomeViewModel.OLrzqt = arrayList2;
        }
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            marketHomeViewModel.OLrzqt = yDY.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public final Flow<Float> copydefault(long j) {
        return FlowKt.callbackFlow(new MarketHomeViewModel$translationAnimation$1(j, null));
    }

    public final void djBIcL() {
        C28404kaD value;
        C28404kaD value2;
        if (this.fJNWhG.valueOf() != null) {
            MutableStateFlow<C28404kaD> mutableStateFlow = this.KWHzl;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, value2.EZpvd(true, !this.AYXKKw)));
        } else {
            MutableStateFlow<C28404kaD> mutableStateFlow2 = this.KWHzl;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, value.EZpvd(false, false)));
        }
    }

    public final String gEmmrt() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.fJNWhG.valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.DbNXlk();
        }
        return null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.home.ui.MarketHomeViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void valueOf() {
        C28404kaD value;
        this.AYXKKw = true;
        MutableStateFlow<C28404kaD> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C28404kaD.copy$default(value, false, false, 1, null)));
    }
}
