package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisColumnarBean;
import com.okinc.localization.util.format.OKDateEnum;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.drc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14764drc extends ConstraintLayout {
    public final AbstractC16929etG AEQbTJ;
    public java.lang.String AhwBna;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14764drc(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14764drc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnShareClickListener(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.drc.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14764drc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14764drc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.HJWChPQdUnVm, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC16929etG abstractC16929etG = (AbstractC16929etG) viewDataBindingInflate;
        this.AEQbTJ = abstractC16929etG;
        this.EZpvd = true;
        abstractC16929etG.copydefault.setOnTouchListener(new Function1() { // from class: o.dra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14764drc.KWHzl(this.copydefault, (WalletPnlAnalysisColumnarBean) obj);
            }
        });
        abstractC16929etG.copydefault.setOnTouchCancelListener(new Function0() { // from class: o.drf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14764drc.AEQbTJ(this.OLrzqt);
            }
        });
        AppCompatTextView appCompatTextView = abstractC16929etG.gEmmrt;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        AppCompatImageView appCompatImageView = abstractC16929etG.AEQbTJ;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
    }

    public static final Unit KWHzl(C14764drc c14764drc, WalletPnlAnalysisColumnarBean walletPnlAnalysisColumnarBean) {
        if (c14764drc.OLrzqt) {
            return Unit.INSTANCE;
        }
        C14724dqp.EZpvd.AEQbTJ(C18095fbt.Companion.KWHzl());
        c14764drc.setProfitAndRoi(walletPnlAnalysisColumnarBean != null ? walletPnlAnalysisColumnarBean.getProfit() : null, null, walletPnlAnalysisColumnarBean != null ? walletPnlAnalysisColumnarBean.getTimestamp() : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C14764drc c14764drc) {
        if (c14764drc.OLrzqt) {
            return Unit.INSTANCE;
        }
        c14764drc.setProfitAndRoi(c14764drc.KWHzl, c14764drc.AhwBna, null);
        return Unit.INSTANCE;
    }

    public final void setData(java.lang.String str, java.lang.String str2, java.util.List<WalletPnlAnalysisColumnarBean> list, boolean z) {
        this.KWHzl = str;
        this.AhwBna = str2;
        this.EZpvd = z;
        setProfitAndRoi(str, str2, null);
        KWHzl(list);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setProfitAndRoi(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        android.content.Context context = appCompatTextView.getContext();
        java.lang.String str4 = "";
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setTextColor(C14770dri.getChartPnlTextColor$default(str, context, null, 2, null));
        java.lang.String str5 = C33129mqd.AEQbTJ(str, BigDecimal.ZERO) ? Marker.ANY_NON_NULL_MARKER : "";
        java.lang.String valuation$default = (str == null || str.length() == 0) ? "--" : C54880xYt.formatValuation$default(C33129mqd.EZpvd(str), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
        if (str2 != null && str2.length() != 0) {
            str4 = " (" + C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(str2), 0, 0, false, null, null, 31, null) + ")";
        }
        java.lang.String strKWHzl = str5 + valuation$default + str4;
        if (this.EZpvd) {
            strKWHzl = C13821dZn.EZpvd.KWHzl(strKWHzl);
        }
        appCompatTextView.setText(strKWHzl);
        AppCompatTextView appCompatTextView2 = this.AEQbTJ.KWHzl;
        Intrinsics.copydefault(appCompatTextView2);
        appCompatTextView2.setVisibility((str3 == null || str3.length() == 0) ? 4 : 0);
        appCompatTextView2.setText(pTA.formatDate$default(new Date(C33129mqd.valueOf(str3)), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(java.util.List<WalletPnlAnalysisColumnarBean> list) {
        boolean z;
        java.util.ArrayList arrayList;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            if (list != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!C33129mqd.OLrzqt((java.lang.Object) ((WalletPnlAnalysisColumnarBean) obj).getProfit(), (java.lang.Object) 0)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                z = true;
            }
        } else {
            z = false;
        }
        this.OLrzqt = z;
        if (z) {
            this.AEQbTJ.OLrzqt.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
            this.AEQbTJ.OLrzqt.setEnabled(false);
            this.AEQbTJ.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            this.AEQbTJ.EZpvd.setText(C54880xYt.formatValuation$default(C33129mqd.EZpvd("0"), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null));
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((WalletPnlAnalysisColumnarBean) it.next()).setProfit("300");
                }
            }
        } else {
            this.AEQbTJ.OLrzqt.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            this.AEQbTJ.OLrzqt.setEnabled(true);
        }
        this.AEQbTJ.copydefault.setData(list, this.EZpvd, this.OLrzqt);
        AppCompatImageView appCompatImageView = this.AEQbTJ.OLrzqt;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
    }

    public final void OLrzqt() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.onServiceDisconnected);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.UUsvzUhTFPAC);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.zeUJxr, new View.OnClickListener() { // from class: o.dqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14764drc.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.drc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C14764drc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C14764drc c14764drc) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c14764drc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.drc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C14764drc KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C14764drc c14764drc) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c14764drc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.drc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C14764drc EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C14764drc c14764drc) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c14764drc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
