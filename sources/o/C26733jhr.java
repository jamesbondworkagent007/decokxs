package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26733jhr extends AbstractC27115jpB<InterfaceC24178iXu.PendingIntent, InterfaceC26732jhq> {
    public final boolean KWHzl;
    public final Function1<InvestTransactionLossInfo, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26733jhr() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, kotlin.Unit>, boolean):void (m)] (LINE:17) call: o.jhr.<init>(kotlin.jvm.functions.Function1, boolean):void type: THIS */
    public /* synthetic */ C26733jhr(Function1 function1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? false : z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26733jhr(Function1<? super InvestTransactionLossInfo, Unit> function1, final boolean z) {
        super(new yHO() { // from class: o.jhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C26733jhr.AEQbTJ(z, (android.view.LayoutInflater) obj, (android.view.ViewGroup) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        this.copydefault = function1;
        this.KWHzl = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC26732jhq AEQbTJ(boolean z, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z2) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        if (z) {
            C23795iJp c23795iJpAEQbTJ = C23795iJp.AEQbTJ(layoutInflater, viewGroup, z2);
            Intrinsics.checkNotNullExpressionValue(c23795iJpAEQbTJ, "");
            return new C26692jhC(c23795iJpAEQbTJ);
        }
        C23788iJi c23788iJiEZpvd = C23788iJi.EZpvd(layoutInflater, viewGroup, z2);
        Intrinsics.checkNotNullExpressionValue(c23788iJiEZpvd, "");
        return new C26690jhA(c23788iJiEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull InterfaceC26732jhq interfaceC26732jhq, @NotNull InterfaceC24178iXu.PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(interfaceC26732jhq, "");
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        android.content.Context context = interfaceC26732jhq.getRoot().getContext();
        interfaceC26732jhq.OLrzqt().setText(context.getString(C25493ixk.FragmentManager.zzQwtT));
        interfaceC26732jhq.OLrzqt().setHelperLabelType(this.KWHzl ? 1 : 0);
        interfaceC26732jhq.OLrzqt().setUnderlineStyle(0);
        C55258xgZ c55258xgZOLrzqt = interfaceC26732jhq.OLrzqt();
        c55258xgZOLrzqt.setOnClickListener(new ActionBar(c55258xgZOLrzqt, 1000L, context));
        interfaceC26732jhq.EZpvd().setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, pendingIntent.KWHzl().getTotalTransactionLoss(), null, null, null, 14, null));
        interfaceC26732jhq.copydefault().setVisibility(0);
        interfaceC26732jhq.EZpvd().setTextColor(C33070mpX.copydefault(C25544iyi.getLossEntryTextViewColor$default(pendingIntent.KWHzl(), 0, 1, null)));
        android.widget.TextView textViewEZpvd = interfaceC26732jhq.EZpvd();
        textViewEZpvd.setOnClickListener(new Activity(textViewEZpvd, 1000L, this, pendingIntent));
        android.widget.ImageView imageViewCopydefault = interfaceC26732jhq.copydefault();
        imageViewCopydefault.setOnClickListener(new Application(imageViewCopydefault, 1000L, this, pendingIntent));
    }

    /* JADX INFO: renamed from: o.jhr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.content.Context context) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C27496jwL c27496jwL = C27496jwL.EZpvd;
                Intrinsics.copydefault(this.AEQbTJ);
                android.content.Context context = this.AEQbTJ;
                C27496jwL.showDialog$default(c27496jwL, context, context.getString(C25493ixk.FragmentManager.ggKfIT), this.AEQbTJ.getString(C25493ixk.FragmentManager.DQzvGNdrmXxudrmXxu), null, false, false, this.AEQbTJ.getString(C25493ixk.FragmentManager.gwwfep), null, null, null, false, 1976, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.jhr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C26733jhr AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ InterfaceC24178iXu.PendingIntent copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C26733jhr c26733jhr, InterfaceC24178iXu.PendingIntent pendingIntent) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c26733jhr;
            this.copydefault = pendingIntent;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.AEQbTJ.copydefault;
                if (function1 != null) {
                    function1.invoke(this.copydefault.KWHzl());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jhr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26733jhr EZpvd;
        public final /* synthetic */ InterfaceC24178iXu.PendingIntent OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26733jhr c26733jhr, InterfaceC24178iXu.PendingIntent pendingIntent) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c26733jhr;
            this.OLrzqt = pendingIntent;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt.KWHzl());
                }
            }
        }
    }
}
