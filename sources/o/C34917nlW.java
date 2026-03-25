package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.unify_trade.biz.CountDownType;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55470xkZ;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34917nlW extends AbstractC59533zio<AbstractC55470xkZ.StateListAnimator, ActionBar> {
    public Function1<? super AbstractC55470xkZ.StateListAnimator, Unit> AEQbTJ;
    public InterfaceC34987nmn OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34917nlW() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:o.nmn:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.nmn) : (r4v0 o.nmn))
 A[MD:(kotlin.jvm.functions.Function1<? super o.xkZ$StateListAnimator, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, o.nmn):void (m)] (LINE:484) call: o.nlW.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, o.nmn):void type: THIS */
    public /* synthetic */ C34917nlW(Function1 function1, Function0 function0, InterfaceC34987nmn interfaceC34987nmn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : interfaceC34987nmn);
    }

    public C34917nlW(Function1<? super AbstractC55470xkZ.StateListAnimator, Unit> function1, Function0<Unit> function0, InterfaceC34987nmn interfaceC34987nmn) {
        this.AEQbTJ = function1;
        this.copydefault = function0;
        this.OLrzqt = interfaceC34987nmn;
    }

    /* JADX INFO: renamed from: o.nlW$ActionBar */
    public static final class ActionBar extends C34914nlT {
        public final C42872rec copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42872rec OLrzqt() {
            return this.copydefault;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ActionBar(@NotNull C42872rec c42872rec) {
            Intrinsics.checkNotNullParameter(c42872rec, "");
            android.widget.FrameLayout root = c42872rec.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = c42872rec;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42872rec c42872recCopydefault = C42872rec.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42872recCopydefault, "");
        return new ActionBar(c42872recCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull final AbstractC55470xkZ.StateListAnimator stateListAnimator) {
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C42872rec c42872recOLrzqt = actionBar.OLrzqt();
        java.lang.String str = stateListAnimator.OLrzqt() + stateListAnimator.EZpvd();
        java.lang.String strIsConnected = stateListAnimator.isConnected();
        if (strIsConnected != null && C59449zhJ.gEmmrt(strIsConnected, "rebase_contract", true)) {
            listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
        } else {
            listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
        }
        java.util.List list = listEZpvd;
        AppCompatImageView appCompatImageView = c42872recOLrzqt.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, stateListAnimator.djBIcL());
        if (Intrinsics.EZpvd((java.lang.Object) stateListAnimator.fetchVPNInfo(), (java.lang.Object) "0")) {
            c42872recOLrzqt.EZpvd.EZpvd.setData(C56390yDp.OLrzqt(C33129mqd.gEmmrt(str), ""), list, pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(stateListAnimator.AhwBna())), null, 1, null), "", "", (1920 & 32) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (1920 & 64) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
            c42872recOLrzqt.KWHzl.setDeadlineTime(CountDownType.SHOW_COUNT_DOWN, C33070mpX.AYXKKw(qZH.PendingIntent.getSessionID), stateListAnimator.AYXKKw(), new Function1() { // from class: o.nlX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34917nlW.OLrzqt(this.AEQbTJ, ((java.lang.Long) obj).longValue());
                }
            });
        } else {
            c42872recOLrzqt.EZpvd.EZpvd.setData(C56390yDp.OLrzqt(C33129mqd.gEmmrt(str), ""), list, "", "", "", (1920 & 32) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (1920 & 64) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
            C40492qXw c40492qXw = c42872recOLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
            c40492qXw.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c42872recOLrzqt.KWHzl, CountDownType.SHOW_EXPECT, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf), 0L, null, 8, null);
        }
        actionBar.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34917nlW.OLrzqt(this.copydefault, stateListAnimator, view);
            }
        });
        actionBar.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34917nlW.EZpvd(this.OLrzqt, actionBar, stateListAnimator, view);
            }
        });
    }

    public static final Unit OLrzqt(C34917nlW c34917nlW, long j) {
        Function0<Unit> function0 = c34917nlW.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C34917nlW c34917nlW, AbstractC55470xkZ.StateListAnimator stateListAnimator, android.view.View view) {
        Function1<? super AbstractC55470xkZ.StateListAnimator, Unit> function1 = c34917nlW.AEQbTJ;
        if (function1 != null) {
            function1.invoke(stateListAnimator);
        }
    }

    public static final boolean EZpvd(C34917nlW c34917nlW, ActionBar actionBar, AbstractC55470xkZ.StateListAnimator stateListAnimator, android.view.View view) {
        InterfaceC34987nmn interfaceC34987nmn = c34917nlW.OLrzqt;
        if (interfaceC34987nmn == null || view == null) {
            return true;
        }
        Intrinsics.copydefault(interfaceC34987nmn);
        interfaceC34987nmn.OLrzqt(view, actionBar.getBindingAdapterPosition(), stateListAnimator);
        return true;
    }
}
