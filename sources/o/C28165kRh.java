package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchAdvancedChainList$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchAdvancedChainListIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchCoreLimitChainList$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchLimitChainList$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchMainConfig$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C28165kRh {
    public final InterfaceC28150kQt AhwBna;
    public final MutableStateFlow<java.util.List<DefiChainInfo>> EZpvd;
    public final C2149AAq KWHzl;
    public final MutableStateFlow<java.util.List<DefiChainInfo>> OLrzqt;
    public final MutableStateFlow<java.util.List<AdvancedMainConfig>> copydefault;
    public final CoroutineDispatcher djBIcL;
    public final StateFlow<java.util.List<DefiChainInfo>> gEmmrt;
    public final InterfaceC25414iwK valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<DefiChainInfo>> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public C28165kRh(@NotNull InterfaceC28150kQt interfaceC28150kQt, @NotNull C2149AAq c2149AAq, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28150kQt, "");
        Intrinsics.checkNotNullParameter(c2149AAq, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = interfaceC28150kQt;
        this.KWHzl = c2149AAq;
        this.valueOf = interfaceC25414iwK;
        this.djBIcL = coroutineDispatcher;
        this.copydefault = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        MutableStateFlow<java.util.List<DefiChainInfo>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: renamed from: o.kRh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kRh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<? extends java.util.List<AdvancedMainConfig>>> continuation) throws java.lang.Throwable {
        AdvancedMainConfigUseCase$fetchMainConfig$1 advancedMainConfigUseCase$fetchMainConfig$1;
        if (continuation instanceof AdvancedMainConfigUseCase$fetchMainConfig$1) {
            advancedMainConfigUseCase$fetchMainConfig$1 = (AdvancedMainConfigUseCase$fetchMainConfig$1) continuation;
            int i = advancedMainConfigUseCase$fetchMainConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMainConfigUseCase$fetchMainConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMainConfigUseCase$fetchMainConfig$1 = new AdvancedMainConfigUseCase$fetchMainConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMainConfigUseCase$fetchMainConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMainConfigUseCase$fetchMainConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1 advancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1 = new AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1(null, this);
            advancedMainConfigUseCase$fetchMainConfig$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1, advancedMainConfigUseCase$fetchMainConfig$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends java.util.List<DefiChainInfo>>> continuation) throws java.lang.Throwable {
        AdvancedMainConfigUseCase$fetchAdvancedChainList$1 advancedMainConfigUseCase$fetchAdvancedChainList$1;
        if (continuation instanceof AdvancedMainConfigUseCase$fetchAdvancedChainList$1) {
            advancedMainConfigUseCase$fetchAdvancedChainList$1 = (AdvancedMainConfigUseCase$fetchAdvancedChainList$1) continuation;
            int i = advancedMainConfigUseCase$fetchAdvancedChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMainConfigUseCase$fetchAdvancedChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMainConfigUseCase$fetchAdvancedChainList$1 = new AdvancedMainConfigUseCase$fetchAdvancedChainList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMainConfigUseCase$fetchAdvancedChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMainConfigUseCase$fetchAdvancedChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            AdvancedMainConfigUseCase$fetchAdvancedChainListIoAF18A$$inlined$dexRunCatching$1 advancedMainConfigUseCase$fetchAdvancedChainListIoAF18A$$inlined$dexRunCatching$1 = new AdvancedMainConfigUseCase$fetchAdvancedChainListIoAF18A$$inlined$dexRunCatching$1(null, this);
            advancedMainConfigUseCase$fetchAdvancedChainList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMainConfigUseCase$fetchAdvancedChainListIoAF18A$$inlined$dexRunCatching$1, advancedMainConfigUseCase$fetchAdvancedChainList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object EZpvd(Continuation<? super java.util.List<DefiChainInfo>> continuation) {
        return BuildersKt.withContext(this.djBIcL, new AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2(this, null), continuation);
    }

    public final boolean KWHzl() {
        return this.EZpvd.getValue().isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends java.util.List<DefiChainInfo>>> continuation) throws java.lang.Throwable {
        AdvancedMainConfigUseCase$fetchLimitChainList$1 advancedMainConfigUseCase$fetchLimitChainList$1;
        if (continuation instanceof AdvancedMainConfigUseCase$fetchLimitChainList$1) {
            advancedMainConfigUseCase$fetchLimitChainList$1 = (AdvancedMainConfigUseCase$fetchLimitChainList$1) continuation;
            int i = advancedMainConfigUseCase$fetchLimitChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMainConfigUseCase$fetchLimitChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMainConfigUseCase$fetchLimitChainList$1 = new AdvancedMainConfigUseCase$fetchLimitChainList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMainConfigUseCase$fetchLimitChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMainConfigUseCase$fetchLimitChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1 advancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1 = new AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1(null, this);
            advancedMainConfigUseCase$fetchLimitChainList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1, advancedMainConfigUseCase$fetchLimitChainList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object KWHzl(Continuation<? super java.util.List<DefiChainInfo>> continuation) {
        return BuildersKt.withContext(this.djBIcL, new AdvancedMainConfigUseCase$fetchCoreLimitChainList$2(this, null), continuation);
    }

    public final void EZpvd(@NotNull java.util.List<AdvancedMainConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.setValue(list);
    }

    public final void copydefault(@NotNull java.util.List<DefiChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.setValue(list);
    }

    public final java.util.List<AdvancedMainConfig> AEQbTJ() {
        return this.copydefault.getValue();
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.valueOf.copydefault()) {
            boolean zEZpvd = this.KWHzl.EZpvd(str);
            pUU.KWHzl("AdvancedMainConfigUseCase", "advanced limit (core), chainId=" + str + ", supportLimitU=" + zEZpvd);
            return zEZpvd;
        }
        java.util.Iterator<T> it = this.EZpvd.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        pUU.KWHzl("AdvancedMainConfigUseCase", "advanced limit, chainId=" + str + ", supportLimitU=" + (defiChainInfo != null ? java.lang.Boolean.valueOf(defiChainInfo.getSupportLimitU()) : null));
        java.util.List<DefiChainInfo> value = this.EZpvd.getValue();
        if (!(value instanceof java.util.Collection) || !value.isEmpty()) {
            for (DefiChainInfo defiChainInfo2 : value) {
                if (Intrinsics.EZpvd((java.lang.Object) defiChainInfo2.getChainId(), (java.lang.Object) str) && defiChainInfo2.getSupportLimitU()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.valueOf.copydefault()) {
            boolean zOLrzqt = this.KWHzl.OLrzqt(str);
            pUU.KWHzl("AdvancedMainConfigUseCase", "advanced market (core), chainId=" + str + ", supportTpSl=" + zOLrzqt);
            return zOLrzqt;
        }
        java.util.Iterator<T> it = this.EZpvd.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        pUU.KWHzl("AdvancedMainConfigUseCase", "advanced market, chainId=" + str + ", supportTpSl=" + (defiChainInfo != null ? java.lang.Boolean.valueOf(defiChainInfo.getSupportTpSl()) : null));
        java.util.List<DefiChainInfo> value = this.EZpvd.getValue();
        if (!(value instanceof java.util.Collection) || !value.isEmpty()) {
            for (DefiChainInfo defiChainInfo2 : value) {
                if (Intrinsics.EZpvd((java.lang.Object) defiChainInfo2.getChainId(), (java.lang.Object) str) && defiChainInfo2.getSupportTpSl()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        pUU.KWHzl("AdvancedMainConfigUseCase", "advanced market, chainId=" + str + ", supportSmartAccount=" + (defiChainInfo != null ? java.lang.Boolean.valueOf(defiChainInfo.getSupportSmartAccount()) : null));
        java.util.List<DefiChainInfo> value = this.OLrzqt.getValue();
        if (!(value instanceof java.util.Collection) || !value.isEmpty()) {
            for (DefiChainInfo defiChainInfo2 : value) {
                if (Intrinsics.EZpvd((java.lang.Object) defiChainInfo2.getChainId(), (java.lang.Object) str) && defiChainInfo2.getSupportSmartAccount()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AdvancedMainConfig KWHzl(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.copydefault.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AdvancedMainConfig) next).getChainId(), (java.lang.Object) C33129mqd.gEmmrt(str))) {
                break;
            }
        }
        return (AdvancedMainConfig) next;
    }

    public final DefiChainInfo EZpvd(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DefiChainInfo defiChainInfo = (DefiChainInfo) next;
            if (Intrinsics.EZpvd((java.lang.Object) defiChainInfo.getChainId(), (java.lang.Object) C33129mqd.gEmmrt(str)) && defiChainInfo.getSupportCefiMode()) {
                break;
            }
        }
        return (DefiChainInfo) next;
    }
}
