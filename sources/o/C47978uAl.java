package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C47978uAl extends AbstractC52792wYn {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public boolean AhwBna;
    public boolean EZpvd;
    public Function0<Unit> OLrzqt;
    public C55198xfS djBIcL;
    public StateListAnimator gEmmrt;
    public int valueOf;
    public final java.util.ArrayList<TradeMenuItemBean> KWHzl = new java.util.ArrayList<>();
    public java.lang.String AYXKKw = "";

    /* JADX INFO: renamed from: o.uAl$StateListAnimator */
    public interface StateListAnimator {
        void copydefault(@NotNull TradeMenuItemBean tradeMenuItemBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<TradeMenuItemBean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return "OKTradeBottomSelectFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(StateListAnimator stateListAnimator) {
        this.gEmmrt = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX INFO: renamed from: o.uAl$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uAl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C47978uAl newInstance$default(Application application, java.util.List list, java.lang.String str, boolean z, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            java.lang.String str3 = str;
            boolean z2 = (i2 & 4) != 0 ? false : z;
            if ((i2 & 8) != 0) {
                str2 = null;
            }
            return application.OLrzqt(list, str3, z2, str2, (i2 & 16) != 0 ? 0 : i);
        }

        public final C47978uAl OLrzqt(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull java.lang.String str, boolean z, java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C47978uAl c47978uAl = new C47978uAl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putBoolean("isHideTitleAndCancel", z);
            if (str2 != null) {
                bundle.putString("footerText", str2);
            }
            bundle.putInt("selectionType", i);
            c47978uAl.setArguments(bundle);
            c47978uAl.AEQbTJ().clear();
            c47978uAl.AEQbTJ().addAll(list);
            return c47978uAl;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.unk.registerTradeFragmentTrack$default(androidx.fragment.app.Fragment, java.lang.String, kotlin.Pair[], kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments != null && (string = arguments.getString("title", "")) != null) {
            str = string;
        }
        this.AYXKKw = str;
        android.os.Bundle arguments2 = getArguments();
        this.EZpvd = arguments2 != null ? arguments2.getBoolean("isHideTitleAndCancel", false) : false;
        android.os.Bundle arguments3 = getArguments();
        this.AEQbTJ = arguments3 != null ? arguments3.getString("footerText") : null;
        android.os.Bundle arguments4 = getArguments();
        this.valueOf = arguments4 != null ? arguments4.getInt("selectionType") : 0;
        C49396unk.registerTradeFragmentTrack$default(this, KWHzl(), new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        constraintLayout.removeAllViews();
        android.view.View view = new android.view.View(getContext());
        view.setId(android.view.View.generateViewId());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, C55298xhM.dp2px$default(8.0f, null, 1, null));
        layoutParams.topToTop = 0;
        constraintLayout.addView(view, layoutParams);
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setText(str);
            textView.setGravity(8388611);
            textView.setPadding(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
            textView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            textView.setLineSpacing(6.0f, 1.0f);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams2.topToBottom = view.getId();
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            constraintLayout.addView(textView, layoutParams2);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw) && !this.EZpvd) {
            wxq.AEQbTJ().setVisibility(8);
            wxq.setDividerVisibility(true);
            wxq.setCloseVisibility(true);
            wxq.setStyle(1);
            wxq.setTitle(this.AYXKKw);
            android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
            imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
            return;
        }
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.djBIcL = c55198xfS;
        c55198xfS.setType(this.valueOf);
        java.util.ArrayList<TradeMenuItemBean> arrayList = this.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) obj;
            arrayList2.add(new C55276xgr(tradeMenuItemBean.getTitle(), java.lang.Integer.valueOf(i), tradeMenuItemBean.getDescription(), tradeMenuItemBean.isSelect(), tradeMenuItemBean.getEnable(), tradeMenuItemBean.getImageInfo(), null, 64, null));
            i++;
        }
        c55198xfS.setSingleOneColumnData(arrayList2, new yHO() { // from class: o.uAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C47978uAl.AEQbTJ(this.copydefault, (C55276xgr) obj2, (C55276xgr) obj3, (C55276xgr) obj4);
            }
        });
    }

    public static final Unit AEQbTJ(C47978uAl c47978uAl, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        java.lang.Integer num = objOLrzqt instanceof java.lang.Integer ? (java.lang.Integer) objOLrzqt : null;
        if (num != null) {
            int iIntValue = num.intValue();
            int size = c47978uAl.KWHzl.size();
            for (int i = 0; i < size; i++) {
                c47978uAl.KWHzl.get(i).setSelect(false);
            }
            c47978uAl.KWHzl.get(iIntValue).setSelect(true);
            StateListAnimator stateListAnimator = c47978uAl.gEmmrt;
            if (stateListAnimator != null) {
                TradeMenuItemBean tradeMenuItemBean = c47978uAl.KWHzl.get(iIntValue);
                Intrinsics.checkNotNullExpressionValue(tradeMenuItemBean, "");
                stateListAnimator.copydefault(tradeMenuItemBean);
            }
            c47978uAl.AhwBna = true;
            c47978uAl.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uAl$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C47978uAl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C47978uAl c47978uAl) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c47978uAl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!this.AhwBna && (function0 = this.OLrzqt) != null) {
            function0.invoke();
        }
        this.AhwBna = false;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt = null;
        this.gEmmrt = null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        try {
            if (isAdded()) {
                dismiss();
            } else {
                super.show(fragmentManager, str);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
