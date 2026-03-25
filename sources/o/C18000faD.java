package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListResp;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean;
import com.okinc.business.defi.wallet.home.escapebind.ui.OKWEscapeBindAccountViewModel$subPush$1$onReceiveData$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C12827cuN;
import o.InterfaceC13426dKx;
import o.Point;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18000faD extends ViewModel {
    public final StateFlow<EscapeBindAccountListUIBean> AEQbTJ;
    public final java.util.List<java.lang.String> AhwBna;
    public final MutableStateFlow<Point<java.util.List<EscapeBindAccountListUIBean>>> EZpvd;
    public final MutableStateFlow<EscapeBindAccountListUIBean> KWHzl;
    public java.lang.String OLrzqt;
    public final StateFlow<Point<java.util.List<EscapeBindAccountListUIBean>>> copydefault;
    public final C12827cuN djBIcL;
    public final C13934dbu gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18000faD() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<EscapeBindAccountListUIBean> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<java.util.List<EscapeBindAccountListUIBean>>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0006: SGET  A[WRAPPED] (LINE:20) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:20)) : (r3v0 o.cuN))
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0016: INVOKE 
  (wrap:o.dKx:0x0012: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0010: SGET  A[WRAPPED] (LINE:21) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:21))
 INTERFACE call: o.dKx.DTwDnp():o.dbu A[MD:():o.dbu (m), WRAPPED] (LINE:21)) : (r4v0 o.dbu))
 A[MD:(o.cuN, o.dbu):void (m)] (LINE:19) call: o.faD.<init>(o.cuN, o.dbu):void type: THIS */
    public /* synthetic */ C18000faD(C12827cuN c12827cuN, C13934dbu c13934dbu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp() : c13934dbu);
    }

    public C18000faD(@NotNull C12827cuN c12827cuN, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.djBIcL = c12827cuN;
        this.gEmmrt = c13934dbu;
        MutableStateFlow<Point<java.util.List<EscapeBindAccountListUIBean>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.copydefault = MutableStateFlow;
        MutableStateFlow<EscapeBindAccountListUIBean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
        this.AhwBna = new java.util.ArrayList();
        this.OLrzqt = "";
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String str = this.valueOf;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void KWHzl() {
        this.EZpvd.setValue(new Point.StateListAnimator(null, 1, null));
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.djBIcL.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.faI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18000faD.KWHzl(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.faG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18000faD.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.faN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18000faD.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.faM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18000faD.gEmmrt(function12, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final C18000faD c18000faD, AbstractC12782ctV abstractC12782ctV) {
        c18000faD.valueOf = abstractC12782ctV.DbNXlk();
        AbstractC58185ywX abstractC58185ywXKWHzl = C33527myD.KWHzl(c18000faD.gEmmrt.KWHzl(abstractC12782ctV.DbNXlk(), abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), abstractC12782ctV.DbNXlk()));
        final Function1 function1 = new Function1() { // from class: o.faB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18000faD.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.faE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18000faD.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.faF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18000faD.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.faH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18000faD.AhwBna(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C18000faD c18000faD, java.lang.Throwable th) {
        c18000faD.EZpvd.setValue(new Point.TaskDescription(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C18000faD c18000faD, java.lang.Throwable th) {
        c18000faD.EZpvd.setValue(new Point.TaskDescription(th.getMessage()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final EscapeBindAccountListUIBean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        Point<java.util.List<EscapeBindAccountListUIBean>> value = this.EZpvd.getValue();
        EscapeBindAccountListUIBean escapeBindAccountListUIBean = null;
        java.lang.Object obj = null;
        if (value == null) {
            return null;
        }
        if (value instanceof Point.Application) {
            java.util.Iterator it = ((java.lang.Iterable) ((Point.Application) value).copydefault()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((EscapeBindAccountListUIBean) next).getAaAccountId(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            escapeBindAccountListUIBean = (EscapeBindAccountListUIBean) obj;
            if (escapeBindAccountListUIBean != null) {
                copydefault(escapeBindAccountListUIBean);
            }
        }
        this.KWHzl.setValue(escapeBindAccountListUIBean);
        return escapeBindAccountListUIBean;
    }

    /* JADX INFO: renamed from: o.faD$Activity */
    public static final class Activity extends WalletCoinAssetSubManager.TaskDescription {
        public Activity() {
            super("cedefi-escape", null, null, true, 6, null);
        }

        @Override // com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager.TaskDescription, o.xZF.TaskDescription
        public void copydefault(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            super.copydefault(list);
            C18000faD c18000faD = C18000faD.this;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) c18000faD.AhwBna), ((WalletCoinAssetSubManager.SubResponse) next).getAddress())) {
                    break;
                }
            }
            if (next != null) {
                C18000faD.this.KWHzl();
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(C18000faD.this), null, null, new OKWEscapeBindAccountViewModel$subPush$1$onReceiveData$2(C18000faD.this, null), 3, null);
            }
        }
    }

    public final void copydefault(EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().AEQbTJ(new Activity());
        if (this.AhwBna.size() > 0) {
            c11205cFp.OLrzqt(this.AhwBna, EZpvd());
        }
        this.AhwBna.clear();
        java.util.List<java.lang.String> list = this.AhwBna;
        java.util.List<EscapeAccountDetailUIBean> tokens = escapeBindAccountListUIBean.getTokens();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(tokens, 10));
        java.util.Iterator<T> it = tokens.iterator();
        while (it.hasNext()) {
            arrayList.add(((EscapeAccountDetailUIBean) it.next()).getAddress());
        }
        list.addAll(CollectionsKt___CollectionsKt.QbewEr(arrayList));
        C11205cFp.EZpvd.copydefault(this.AhwBna, EZpvd());
    }

    public final void djBIcL() {
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.OLrzqt(this.AhwBna, EZpvd());
        c11205cFp.zLjUOn().OLrzqt("cedefi-escape");
    }

    public final java.util.List<java.lang.String> EZpvd() {
        java.util.ArrayList<ChainAddress> arrayListIsConnected = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(this.djBIcL.copydefault())).isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
        java.util.Iterator<T> it = arrayListIsConnected.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChainAddress) it.next()).getAddress());
        }
        return arrayList;
    }

    public static final Unit copydefault(C18000faD c18000faD, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            MutableStateFlow<Point<java.util.List<EscapeBindAccountListUIBean>>> mutableStateFlow = c18000faD.EZpvd;
            java.util.List listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(((EscapeAccountListResp) it.next()).toUIBean());
            }
            mutableStateFlow.setValue(new Point.Application(arrayList));
        } else {
            c18000faD.EZpvd.setValue(new Point.TaskDescription(null, 1, null));
        }
        return Unit.INSTANCE;
    }
}
