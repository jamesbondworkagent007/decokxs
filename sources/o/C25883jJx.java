package o;

import androidx.camera.video.AudioStats;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeeInfoPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.domain.usecase.FundFeeOverViewUseCase$onExecute$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25883jJx extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends FundingFeeInfoPo>, ? extends ValuationCurrency>, C25904jKr> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC54577xNn EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<? extends java.util.List<FundingFeeInfoPo>, ValuationCurrency>) obj, (Continuation<? super C25904jKr>) continuation);
    }

    @yCM
    public C25883jJx(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
    }

    /* JADX INFO: renamed from: o.jJx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jJx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[LOOP:0: B:34:0x00ac->B:36:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<FundingFeeInfoPo>, ValuationCurrency> pair, @NotNull Continuation<? super C25904jKr> continuation) throws java.lang.Throwable {
        FundFeeOverViewUseCase$onExecute$1 fundFeeOverViewUseCase$onExecute$1;
        kotlin.Pair<? extends java.util.List<FundingFeeInfoPo>, ValuationCurrency> pair2;
        C25883jJx c25883jJx;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.Object objEZpvd;
        kotlin.Pair<? extends java.util.List<FundingFeeInfoPo>, ValuationCurrency> pair3;
        C25883jJx c25883jJx2;
        java.util.Iterator<T> it;
        double dAEQbTJ;
        java.lang.String titleByIdAndType$default;
        C25908jKv c25908jKv;
        if (continuation instanceof FundFeeOverViewUseCase$onExecute$1) {
            fundFeeOverViewUseCase$onExecute$1 = (FundFeeOverViewUseCase$onExecute$1) continuation;
            int i = fundFeeOverViewUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fundFeeOverViewUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                fundFeeOverViewUseCase$onExecute$1 = new FundFeeOverViewUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = fundFeeOverViewUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fundFeeOverViewUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn2 = this.EZpvd;
            if (interfaceC54577xNn2 != null) {
                xNE xne = new xNE();
                fundFeeOverViewUseCase$onExecute$1.L$0 = this;
                pair2 = pair;
                fundFeeOverViewUseCase$onExecute$1.L$1 = pair2;
                fundFeeOverViewUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, xne, fundFeeOverViewUseCase$onExecute$1, 1, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c25883jJx = this;
            } else {
                pair2 = pair;
                c25883jJx = this;
                interfaceC54577xNn = c25883jJx.EZpvd;
                if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                    fundFeeOverViewUseCase$onExecute$1.L$0 = c25883jJx;
                    fundFeeOverViewUseCase$onExecute$1.L$1 = pair2;
                    fundFeeOverViewUseCase$onExecute$1.label = 2;
                    objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", fundFeeOverViewUseCase$onExecute$1);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    pair3 = pair2;
                    obj = objEZpvd;
                    c25883jJx2 = c25883jJx;
                    c25883jJx = c25883jJx2;
                    pair2 = pair3;
                }
                it = pair2.getFirst().iterator();
                dAEQbTJ = 0.0d;
                while (it.hasNext()) {
                }
                if (dAEQbTJ == AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pair3 = (kotlin.Pair) fundFeeOverViewUseCase$onExecute$1.L$1;
                c25883jJx2 = (C25883jJx) fundFeeOverViewUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c25883jJx = c25883jJx2;
                pair2 = pair3;
                it = pair2.getFirst().iterator();
                dAEQbTJ = 0.0d;
                while (it.hasNext()) {
                    dAEQbTJ += C33129mqd.AEQbTJ(((FundingFeeInfoPo) it.next()).getFundingFee());
                }
                if (dAEQbTJ == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    return new C25904jKr(yDY.AhwBna());
                }
                java.util.List<FundingFeeInfoPo> first = pair2.getFirst();
                java.util.ArrayList<C25908jKv> arrayList = new java.util.ArrayList();
                for (FundingFeeInfoPo fundingFeeInfoPo : first) {
                    if (Intrinsics.EZpvd((java.lang.Object) fundingFeeInfoPo.getInstId(), (java.lang.Object) "0")) {
                        titleByIdAndType$default = C33070mpX.AYXKKw(qZH.PendingIntent.fARcdN);
                    } else {
                        titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, fundingFeeInfoPo.getInstId(), "SWAP", false, false, false, 24, null);
                        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) titleByIdAndType$default)) {
                            c25908jKv = null;
                        }
                        if (c25908jKv == null) {
                            arrayList.add(c25908jKv);
                        }
                    }
                    double dAEQbTJ2 = C33129mqd.AEQbTJ(fundingFeeInfoPo.getFundingFee());
                    c25908jKv = new C25908jKv((float) (dAEQbTJ2 / dAEQbTJ), titleByIdAndType$default, dAEQbTJ2);
                    if (c25908jKv == null) {
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (C25908jKv c25908jKv2 : arrayList) {
                    if (arrayList2.size() >= 6) {
                        arrayList2.set(5, c25883jJx.OLrzqt((C25908jKv) arrayList2.get(5), c25908jKv2));
                    } else {
                        C56443yFo.KWHzl(arrayList2.add(c25908jKv2));
                    }
                }
                return new C25904jKr(arrayList2);
            }
            kotlin.Pair<? extends java.util.List<FundingFeeInfoPo>, ValuationCurrency> pair4 = (kotlin.Pair) fundFeeOverViewUseCase$onExecute$1.L$1;
            c25883jJx = (C25883jJx) fundFeeOverViewUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
            pair2 = pair4;
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54577xNn = c25883jJx.EZpvd;
        if (interfaceC54577xNn != null) {
            fundFeeOverViewUseCase$onExecute$1.L$0 = c25883jJx;
            fundFeeOverViewUseCase$onExecute$1.L$1 = pair2;
            fundFeeOverViewUseCase$onExecute$1.label = 2;
            objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", fundFeeOverViewUseCase$onExecute$1);
            if (objEZpvd != objCopydefault) {
            }
        }
        it = pair2.getFirst().iterator();
        dAEQbTJ = 0.0d;
        while (it.hasNext()) {
        }
        if (dAEQbTJ == AudioStats.AUDIO_AMPLITUDE_NONE) {
        }
    }

    public final C25908jKv OLrzqt(@NotNull C25908jKv c25908jKv, @NotNull C25908jKv c25908jKv2) {
        Intrinsics.checkNotNullParameter(c25908jKv, "");
        Intrinsics.checkNotNullParameter(c25908jKv2, "");
        return new C25908jKv(c25908jKv.KWHzl() + c25908jKv2.KWHzl(), C33070mpX.AYXKKw(qZH.PendingIntent.fARcdN), c25908jKv.EZpvd() + c25908jKv2.EZpvd());
    }
}
