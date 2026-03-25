package o;

import androidx.lifecycle.ViewModel;
import com.okinc.planet.biz_home.feed_tab.FeedPage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC47907tyv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47906tyu extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final StateFlow<C47908tyw> AEQbTJ;
    public final InterfaceC46387tSl EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final MutableStateFlow<C47908tyw> OLrzqt;
    public final InterfaceC47278tmy valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47906tyu() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C47908tyw> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:17)) : (r1v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tSl:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tSl:0x000e: INVOKE (wrap:o.tPF:0x000c: SGET  A[WRAPPED] (LINE:18) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:18)) : (r2v0 o.tSl))
  (wrap:o.tmy:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tmy:0x001c: CHECK_CAST (o.tmy) (wrap:o.rlC:0x0018: INVOKE (wrap:java.lang.Class:0x0016: CONST_CLASS  A[WRAPPED] (LINE:19) o.tmy.class) STATIC call: o.rlk.copydefault(java.lang.Class):o.rlC A[MD:<S extends o.rlC>:(java.lang.Class<S extends o.rlC>):S extends o.rlC (m), WRAPPED] (LINE:19))) : (r3v0 o.tmy))
 A[MD:(kotlinx.coroutines.CoroutineDispatcher, o.tSl, o.tmy):void (m)] (LINE:16) call: o.tyu.<init>(kotlinx.coroutines.CoroutineDispatcher, o.tSl, o.tmy):void type: THIS */
    public /* synthetic */ C47906tyu(CoroutineDispatcher coroutineDispatcher, InterfaceC46387tSl interfaceC46387tSl, InterfaceC47278tmy interfaceC47278tmy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, (i & 2) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl, (i & 4) != 0 ? (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class) : interfaceC47278tmy);
    }

    public C47906tyu(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC46387tSl;
        this.valueOf = interfaceC47278tmy;
        MutableStateFlow<C47908tyw> MutableStateFlow = StateFlowKt.MutableStateFlow(new C47908tyw(null, 0, false, 7, null));
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: renamed from: o.tyu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void AEQbTJ(@NotNull AbstractC47907tyv abstractC47907tyv) {
        Intrinsics.checkNotNullParameter(abstractC47907tyv, "");
        if ((abstractC47907tyv instanceof AbstractC47907tyv.Activity) || (abstractC47907tyv instanceof AbstractC47907tyv.ActionBar)) {
            return;
        }
        if (!(abstractC47907tyv instanceof AbstractC47907tyv.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        EZpvd(((AbstractC47907tyv.Application) abstractC47907tyv).AEQbTJ());
    }

    public final void EZpvd(int i) {
        C47908tyw value = this.OLrzqt.getValue();
        if (value.AEQbTJ() != i) {
            this.OLrzqt.setValue(C47908tyw.copy$default(value, null, i, false, 5, null));
            pUU.EZpvd("PlanetFeedContainerViewModel", "Feed container page changed to: " + i);
        }
    }

    public final void KWHzl(int i) {
        java.util.List<FeedPage> listEZpvd = EZpvd();
        MutableStateFlow<C47908tyw> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(C47908tyw.copy$default(mutableStateFlow.getValue(), listEZpvd, i, false, 4, null));
        pUU.EZpvd("PlanetFeedContainerViewModel", "Feed pages initialized: " + listEZpvd.size() + " pages");
    }

    public final java.util.List<FeedPage> EZpvd() {
        return yDY.gEmmrt(FeedPage.FOR_YOU, FeedPage.NEWS, FeedPage.FOLLOWING);
    }
}
