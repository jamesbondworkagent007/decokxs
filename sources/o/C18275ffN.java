package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.api.bean.ChartType;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchChartData$1;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchChartType$1;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchKLineExpandState$1;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchKLineState$1;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$toggleIsKlineExpanded$1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC18281ffT;
import o.C10614brl;
import o.C18039faq;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18275ffN extends AbstractC33073mpa {
    public final StateFlow<AbstractC18281ffT> AYXKKw;
    public final StateFlow<java.lang.Integer> AhwBna;
    public final C12827cuN AkhnZx;
    public final xWV DbNXlk;
    public boolean EZpvd;
    public final MutableStateFlow<AbstractC18281ffT> OLrzqt;
    public final MutableStateFlow<java.lang.Boolean> copydefault;
    public final InterfaceC9852bdR djBIcL;
    public final C13934dbu fetchVPNInfo;
    public final StateFlow<java.lang.Boolean> gEmmrt;
    public final WalletUpdateWorker isConnected;
    public final C18039faq valueOf;
    public final C10614brl values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final int AEQbTJ = 500003;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18275ffN() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Integer> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC18281ffT> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0068: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x000c: INVOKE 
  (wrap:o.dKx:0x0008: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0006: SGET  A[WRAPPED] (LINE:38) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:38))
 INTERFACE call: o.dKx.DTwDnp():o.dbu A[MD:():o.dbu (m), WRAPPED] (LINE:38)) : (r6v0 o.dbu))
  (wrap:o.cuN:0x001e: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x001a: INVOKE 
  (wrap:o.dKx:0x0016: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0014: SGET  A[WRAPPED] (LINE:39) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:39))
 INTERFACE call: o.dKx.OcIXYQ():o.cuN A[MD:():o.cuN (m), WRAPPED] (LINE:39)) : (r7v0 o.cuN))
  (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker:0x0029: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker:0x0025: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application:0x0023: SGET  A[WRAPPED] (LINE:40) com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Companion com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Application.getInstance$default(com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application, android.content.Context, int, java.lang.Object):com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker A[MD:(com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application, android.content.Context, int, java.lang.Object):com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker (m), WRAPPED] (LINE:40)) : (r8v0 com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker))
  (wrap:o.xWV:0x0037: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xWV:0x0035: CHECK_CAST (o.xWV) (wrap:o.rlC:0x0030: INVOKE (wrap:java.lang.Class:0x002e: CONST_CLASS  A[WRAPPED] (LINE:41) o.xWV.class) STATIC call: o.rlk.copydefault(java.lang.Class):o.rlC A[MD:<S extends o.rlC>:(java.lang.Class<S extends o.rlC>):S extends o.rlC (m), WRAPPED] (LINE:41))) : (r9v0 o.xWV))
  (wrap:o.faq:0x0042: TERNARY null = ((wrap:int:0x0038: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.faq:0x003e: INVOKE 
  (wrap:o.faq$StateListAnimator:0x003c: SGET  A[WRAPPED] (LINE:44) o.faq.Companion o.faq$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.faq.StateListAnimator.getInstance$default(o.faq$StateListAnimator, android.content.Context, int, java.lang.Object):o.faq A[MD:(o.faq$StateListAnimator, android.content.Context, int, java.lang.Object):o.faq (m), WRAPPED] (LINE:44)) : (r10v0 o.faq))
  (wrap:o.brl:0x004d: TERNARY null = ((wrap:int:0x0043: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.brl:0x0049: INVOKE 
  (wrap:o.brl$TaskDescription:0x0047: SGET  A[WRAPPED] (LINE:45) o.brl.Companion o.brl$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.brl.TaskDescription.getInstance$default(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl A[MD:(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl (m), WRAPPED] (LINE:45)) : (r11v0 o.brl))
  (wrap:o.bdR:?: TERNARY null = ((wrap:int:0x004e: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bdR:0x005d: CHECK_CAST (o.bdR) (wrap:o.rlB:0x0058: INVOKE 
  (wrap:o.yJo:0x0054: INVOKE (wrap:java.lang.Class:0x0052: CONST_CLASS  A[WRAPPED] (LINE:46) o.bdR.class) STATIC call: o.yIo.AEQbTJ(java.lang.Class):o.yJo A[MD:(java.lang.Class):o.yJo (m), WRAPPED] (LINE:46))
 STATIC call: o.rlk.OLrzqt(o.yJo):o.rlB A[MD:<S extends o.rlB>:(o.yJo<S extends o.rlB>):S extends o.rlB (m), WRAPPED] (LINE:46))) : (r12v0 o.bdR))
 A[MD:(o.dbu, o.cuN, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.xWV, o.faq, o.brl, o.bdR):void (m)] (LINE:37) call: o.ffN.<init>(o.dbu, o.cuN, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.xWV, o.faq, o.brl, o.bdR):void type: THIS */
    public /* synthetic */ C18275ffN(C13934dbu c13934dbu, C12827cuN c12827cuN, WalletUpdateWorker walletUpdateWorker, xWV xwv, C18039faq c18039faq, C10614brl c10614brl, InterfaceC9852bdR interfaceC9852bdR, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp() : c13934dbu, (i & 2) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).OcIXYQ() : c12827cuN, (i & 4) != 0 ? WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null) : walletUpdateWorker, (i & 8) != 0 ? (xWV) C43251rlk.copydefault(xWV.class) : xwv, (i & 16) != 0 ? C18039faq.StateListAnimator.getInstance$default(C18039faq.Companion, null, 1, null) : c18039faq, (i & 32) != 0 ? C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null) : c10614brl, (i & 64) != 0 ? (InterfaceC9852bdR) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC9852bdR.class)) : interfaceC9852bdR);
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted$Companion, long, long, int, java.lang.Object):kotlinx.coroutines.flow.SharingStarted */
    public C18275ffN(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull WalletUpdateWorker walletUpdateWorker, @NotNull xWV xwv, @NotNull C18039faq c18039faq, @NotNull C10614brl c10614brl, InterfaceC9852bdR interfaceC9852bdR) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(walletUpdateWorker, "");
        Intrinsics.checkNotNullParameter(xwv, "");
        Intrinsics.checkNotNullParameter(c18039faq, "");
        Intrinsics.checkNotNullParameter(c10614brl, "");
        this.fetchVPNInfo = c13934dbu;
        this.AkhnZx = c12827cuN;
        this.isConnected = walletUpdateWorker;
        this.DbNXlk = xwv;
        this.valueOf = c18039faq;
        this.values = c10614brl;
        this.djBIcL = interfaceC9852bdR;
        MutableStateFlow<AbstractC18281ffT> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC18281ffT.Application.AEQbTJ);
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.copydefault = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        this.AhwBna = FlowKt.stateIn(c18039faq.copydefault(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), java.lang.Integer.valueOf(c18039faq.OLrzqt()));
    }

    public final java.util.List<ChartType> OLrzqt() {
        return this.valueOf.EZpvd();
    }

    public final java.lang.String AEQbTJ() {
        return this.valueOf.KWHzl();
    }

    /* JADX INFO: renamed from: o.ffN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ffN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ void fetchKLineState$default(C18275ffN c18275ffN, InterfaceC18271ffJ interfaceC18271ffJ, AbstractC12782ctV abstractC12782ctV, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            abstractC12782ctV = null;
        }
        c18275ffN.AEQbTJ(interfaceC18271ffJ, abstractC12782ctV);
    }

    public final void AEQbTJ(@NotNull InterfaceC18271ffJ interfaceC18271ffJ, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(interfaceC18271ffJ, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletHomeKlineViewModel$fetchKLineState$1(abstractC12782ctV, this, interfaceC18271ffJ, null), 3, null);
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletHomeKlineViewModel$fetchChartData$1(this, abstractC12782ctV, null), 3, null);
    }

    public static final AbstractC18281ffT OLrzqt(AbstractC18281ffT abstractC18281ffT) {
        Intrinsics.checkNotNullParameter(abstractC18281ffT, "");
        return AbstractC18281ffT.TaskDescription.KWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        KWHzl(new Function1() { // from class: o.ffL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18275ffN.OLrzqt((AbstractC18281ffT) obj);
            }
        });
        this.EZpvd = false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ffV.AEQbTJ(java.util.List, com.okinc.business.defi.api.bean.ChartData):java.util.List */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC18281ffT.Activity EZpvd(java.util.List<ChartData> list, ChartData chartData) {
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalMultiply;
        java.util.Iterator<T> it;
        boolean z;
        java.util.List<ChartData> listKWHzl = C18283ffV.KWHzl(list, chartData);
        if (listKWHzl.isEmpty()) {
            bigDecimalSubtract = BigDecimal.ZERO;
        } else {
            bigDecimalSubtract = C33129mqd.EZpvd(((ChartData) CollectionsKt___CollectionsKt.AubY(listKWHzl)).getAssetAmount()).subtract(C33129mqd.EZpvd(((ChartData) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)).getAssetAmount()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        }
        BigDecimal bigDecimal2 = bigDecimalSubtract;
        boolean zAEQbTJ = AEQbTJ(listKWHzl);
        if (listKWHzl.isEmpty()) {
            bigDecimalMultiply = BigDecimal.ZERO;
        } else {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(((ChartData) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)).getAssetAmount());
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            if (bigDecimalEZpvd.compareTo(bigDecimal3) == 0) {
                bigDecimalEZpvd = null;
            }
            if (bigDecimalEZpvd != null) {
                Intrinsics.copydefault(bigDecimal2);
                BigDecimal bigDecimalDivide = bigDecimal2.divide(bigDecimalEZpvd, RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
                bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(100));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
                if (bigDecimalMultiply != null) {
                }
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    z = true;
                } else {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (java.lang.Float.parseFloat(((ChartData) it.next()).getAssetAmount()) != 0.0f) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                }
                return new AbstractC18281ffT.Activity(java.lang.Boolean.valueOf(zAEQbTJ), bigDecimal2, bigDecimal, list, chartData, java.lang.Boolean.valueOf(z));
            }
            bigDecimal = bigDecimal3;
            if (list instanceof java.util.Collection) {
                it = list.iterator();
                while (it.hasNext()) {
                }
                z = true;
            }
            return new AbstractC18281ffT.Activity(java.lang.Boolean.valueOf(zAEQbTJ), bigDecimal2, bigDecimal, list, chartData, java.lang.Boolean.valueOf(z));
        }
        bigDecimal = bigDecimalMultiply;
        if (list instanceof java.util.Collection) {
        }
        return new AbstractC18281ffT.Activity(java.lang.Boolean.valueOf(zAEQbTJ), bigDecimal2, bigDecimal, list, chartData, java.lang.Boolean.valueOf(z));
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletHomeKlineViewModel$fetchChartType$1(this, abstractC12782ctV, null), 3, null);
    }

    public final boolean AEQbTJ(java.util.List<ChartData> list) {
        Sequence sequenceQVAiDq;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null || (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(list)) == null) {
            return false;
        }
        java.util.Iterator it = sequenceQVAiDq.iterator();
        while (it.hasNext()) {
            if (java.lang.Float.parseFloat(((ChartData) it.next()).getAssetAmount()) != 0.0f) {
                return C33129mqd.gEmmrt(new BigDecimal(((ChartData) C59467zhb.AubY(sequenceQVAiDq)).getAssetAmount()), new BigDecimal(((ChartData) C59467zhb.zsXlph(sequenceQVAiDq)).getAssetAmount()));
            }
        }
        return true;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletHomeKlineViewModel$toggleIsKlineExpanded$1(this, str, null), 2, null);
    }

    public final void AEQbTJ(AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new WalletHomeKlineViewModel$fetchKLineExpandState$1(abstractC12782ctV, this, null), 2, null);
    }

    public final void OLrzqt(int i) {
        java.lang.Object next;
        this.valueOf.OLrzqt(i);
        C18039faq c18039faq = this.valueOf;
        java.util.Iterator<T> it = OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ChartType) next).getChartTypeId() == i) {
                    break;
                }
            }
        }
        ChartType chartType = (ChartType) next;
        java.lang.String chartTypeMsg = chartType != null ? chartType.getChartTypeMsg() : null;
        if (chartTypeMsg == null) {
            chartTypeMsg = "";
        }
        c18039faq.KWHzl(chartTypeMsg);
    }

    public void KWHzl(@NotNull Function1<? super AbstractC18281ffT, ? extends AbstractC18281ffT> function1) {
        AbstractC18281ffT value;
        Intrinsics.checkNotNullParameter(function1, "");
        MutableStateFlow<AbstractC18281ffT> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, function1.invoke(value)));
    }
}
