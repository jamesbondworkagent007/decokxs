package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24178iXu;

/* JADX INFO: renamed from: o.jgn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26676jgn extends iSE<InterfaceC24178iXu> {
    public final Function0<Unit> AYXKKw;
    public final boolean AhwBna;
    public final Function1<java.lang.String, Unit> EZpvd;
    public final Function1<InterfaceC24178iXu.TaskDescription, Unit> KWHzl;
    public final Function1<InterfaceC24178iXu.ComponentCallbacks2, Unit> copydefault;
    public final Function1<InterfaceC24178iXu.SharedElementCallback, Unit> djBIcL;
    public final Function1<InvestTransactionLossInfo, Unit> gEmmrt;
    public final Function1<InvestSubscriptionReceiveInfoUIBean, Unit> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Application AEQbTJ = new Application();

    public static final boolean OLrzqt() {
        return false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r12v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r13v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r14v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0016: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r15v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001d: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r16v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0025: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r17v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x002d: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r18v0 kotlin.jvm.functions.Function1))
  (r19v0 boolean)
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.iXu$SharedElementCallback, kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.iXu$TaskDescription, kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.iXu$ComponentCallbacks2, kotlin.Unit>, boolean):void (m)] (LINE:26) call: o.jgn.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void type: THIS */
    public /* synthetic */ C26676jgn(Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? null : function14, (i & 32) != 0 ? null : function15, (i & 64) != 0 ? null : function16, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super o.iXu$SharedElementCallback, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super o.iXu$TaskDescription, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super o.iXu$ComponentCallbacks2, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26676jgn(Function1<? super InvestTransactionLossInfo, Unit> function1, Function1<? super InvestSubscriptionReceiveInfoUIBean, Unit> function12, Function1<? super java.lang.String, Unit> function13, Function0<Unit> function0, Function1<? super InterfaceC24178iXu.SharedElementCallback, Unit> function14, Function1<? super InterfaceC24178iXu.TaskDescription, Unit> function15, Function1<? super InterfaceC24178iXu.ComponentCallbacks2, Unit> function16, boolean z) {
        super(AEQbTJ);
        this.gEmmrt = function1;
        this.valueOf = function12;
        this.EZpvd = function13;
        this.AYXKKw = function0;
        this.djBIcL = function14;
        this.KWHzl = function15;
        this.copydefault = function16;
        this.AhwBna = z;
        register(InterfaceC24178iXu.TaskStackBuilder.class, new C26725jhj());
        register(InterfaceC24178iXu.SharedElementCallback.class, new C26697jhH(function14));
        register(InterfaceC24178iXu.ComponentCallbacks2.class, new C26727jhl(function16));
        register(InterfaceC24178iXu.AssistContent.class, new C26723jhh());
        register(InterfaceC24178iXu.StateListAnimator.class, new C26717jhb(z));
        register(InterfaceC24178iXu.Dialog.class, new C26719jhd(function0, z));
        register(InterfaceC24178iXu.TaskDescription.class, new C26728jhm(function15, z));
        register(InterfaceC24178iXu.PendingIntent.class, new C26733jhr(function1, z));
        register(InterfaceC24178iXu.VoiceInteractor.class, new C26739jhx(function12, z));
        register(InterfaceC24178iXu.LoaderManager.class, new C26730jho(function13, z));
        register(InterfaceC24178iXu.Activity.class, new C26660jgX(function13, z));
        register(InterfaceC24178iXu.Application.class, new C26716jha(new Function0() { // from class: o.jgq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C26676jgn.OLrzqt());
            }
        }));
        register(InterfaceC24178iXu.Fragment.class, new C26729jhn());
        register(InterfaceC24178iXu.FragmentManager.class, new C26721jhf());
        register(InterfaceC24178iXu.PictureInPictureParams.class, new C26736jhu());
        register(InterfaceC24178iXu.ActionBar.class, new C26734jhs());
    }

    /* JADX INFO: renamed from: o.jgn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jgn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jgn$Application */
    public static final class Application extends DiffUtil.ItemCallback<InterfaceC24178iXu> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC24178iXu interfaceC24178iXu, InterfaceC24178iXu interfaceC24178iXu2) {
            Intrinsics.checkNotNullParameter(interfaceC24178iXu, "");
            Intrinsics.checkNotNullParameter(interfaceC24178iXu2, "");
            return Intrinsics.EZpvd(interfaceC24178iXu.getClass(), interfaceC24178iXu2.getClass());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC24178iXu interfaceC24178iXu, InterfaceC24178iXu interfaceC24178iXu2) {
            Intrinsics.checkNotNullParameter(interfaceC24178iXu, "");
            Intrinsics.checkNotNullParameter(interfaceC24178iXu2, "");
            return Intrinsics.EZpvd(interfaceC24178iXu, interfaceC24178iXu2);
        }
    }
}
