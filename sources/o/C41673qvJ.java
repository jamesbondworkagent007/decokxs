package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55470xkZ;
import o.C43035rhg;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41673qvJ extends AbstractC40510qYn<AbstractC55470xkZ.ActionBar, C42853reJ> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl;
    public final Function1<C55525xlb, Unit> OLrzqt;
    public InterfaceC34987nmn copydefault;

    /* JADX INFO: renamed from: o.qvJ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AbstractC55470xkZ.ActionBar EZpvd;
        public final /* synthetic */ C41673qvJ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C41673qvJ c41673qvJ, AbstractC55470xkZ.ActionBar actionBar) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c41673qvJ;
            this.EZpvd = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.OLrzqt;
                if (function1 != null) {
                    AbstractC55470xkZ.ActionBar actionBar = this.EZpvd;
                    actionBar.EZpvd("new-coin-rank");
                    function1.invoke(actionBar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qvJ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qvJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.xlb, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41673qvJ(@NotNull java.lang.String str, boolean z, InterfaceC34987nmn interfaceC34987nmn, Function1<? super C55525xlb, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = z;
        this.copydefault = interfaceC34987nmn;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42853reJ AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42853reJ c42853reJAEQbTJ = C42853reJ.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42853reJAEQbTJ, "");
        return c42853reJAEQbTJ;
    }

    public static final Unit OLrzqt(android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42853reJ c42853reJ, final int i, @NotNull final AbstractC55470xkZ.ActionBar actionBar) {
        java.lang.Object objM7377constructorimpl;
        kotlin.Pair pairOLrzqt;
        java.lang.String strCopydefault;
        java.util.List list;
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(c42853reJ, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        C41431qqg.AEQbTJ(c42853reJ.valueOf, false, (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41673qvJ.OLrzqt((android.widget.TextView) obj);
            }
        });
        java.lang.String strKWHzl = C55297xhL.KWHzl(actionBar.valueOf(), C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
        if (strKWHzl != null) {
            AppCompatImageView appCompatImageView = c42853reJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, strKWHzl, qZH.Activity.AhwBna);
        }
        int i2 = 5;
        if (actionBar.fetchVPNInfo()) {
            C55071xcy c55071xcy = c42853reJ.EZpvd;
            c55071xcy.setStyle(5);
            c55071xcy.setText("--");
        } else {
            C55071xcy c55071xcy2 = c42853reJ.EZpvd;
            if (C33129mqd.AEQbTJ(actionBar.values(), 0)) {
                i2 = 3;
            } else if (C33129mqd.gEmmrt(actionBar.values(), 0)) {
                i2 = 4;
            }
            c55071xcy2.setStyleWithTheme(i2);
            c55071xcy2.setText(pTF.KWHzl.AEQbTJ(C34984nmk.EZpvd(actionBar.values())));
        }
        if (this.AEQbTJ) {
            pairOLrzqt = C56390yDp.OLrzqt(actionBar.OLrzqt(), actionBar.EZpvd());
        } else {
            try {
                Result.Application application = Result.Companion;
                if (Intrinsics.EZpvd((java.lang.Object) actionBar.AYXKKw(), (java.lang.Object) "PREMARKET")) {
                    strCopydefault = C33069mpW.copydefault(C43035rhg.Application.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", actionBar.OLrzqt() + actionBar.EZpvd())));
                } else {
                    strCopydefault = actionBar.OLrzqt() + actionBar.EZpvd();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(strCopydefault);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = "";
            }
            pairOLrzqt = C56390yDp.OLrzqt((java.lang.String) objM7377constructorimpl, "");
        }
        kotlin.Pair pair = pairOLrzqt;
        boolean z = Intrinsics.EZpvd((java.lang.Object) actionBar.AYXKKw(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) actionBar.AYXKKw(), (java.lang.Object) "PERPETUAL");
        java.lang.String strFJNWhG = actionBar.fJNWhG();
        boolean z2 = strFJNWhG != null && C59449zhJ.gEmmrt(strFJNWhG, "pre_market", true);
        java.lang.String strFJNWhG2 = actionBar.fJNWhG();
        boolean z3 = strFJNWhG2 != null && C59449zhJ.gEmmrt(strFJNWhG2, "rebase_contract", true);
        C42989rgn c42989rgn = c42853reJ.copydefault;
        if (z) {
            if (z2) {
                listEZpvd = yDY.gEmmrt(this.KWHzl, C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
            } else if (z3) {
                listEZpvd = yDY.gEmmrt(this.KWHzl, C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
            } else {
                listEZpvd = C56402yEa.EZpvd(this.KWHzl);
            }
            list = listEZpvd;
        } else {
            list = null;
        }
        java.lang.String strAkhnZx = actionBar.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
        c42989rgn.setData(pair, list, strAkhnZx, actionBar.fetchVPNInfo() ? "--" : actionBar.AhwBna(), "", (1920 & 32) != 0 ? null : z ? java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD) : null, (1920 & 64) != 0 ? null : z ? java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ) : null, (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        c42853reJ.copydefault.setPriceLayoutVisible(true, false);
        c42853reJ.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41673qvJ.EZpvd(this.KWHzl, i, actionBar, c42853reJ, view);
            }
        });
        C40499qYc root = c42853reJ.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, actionBar));
    }

    public static final boolean EZpvd(C41673qvJ c41673qvJ, int i, AbstractC55470xkZ.ActionBar actionBar, C42853reJ c42853reJ, android.view.View view) {
        InterfaceC34987nmn interfaceC34987nmn = c41673qvJ.copydefault;
        if (interfaceC34987nmn != null) {
            Intrinsics.copydefault(view);
            interfaceC34987nmn.OLrzqt(view, i, actionBar);
            return true;
        }
        C40499qYc root = c42853reJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        C40499qYc root2 = c42853reJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.EZpvd(root2, actionBar, i);
        return true;
    }
}
