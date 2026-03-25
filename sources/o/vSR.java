package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.bot.grid.viewmodel.CopyTradingViewInfoPresenter;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vSR extends AbstractC49945uyC<AbstractC48356uOl, CopyTradingViewInfoPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC48356uOl gEmmrt;
    public BotWebHook valueOf;
    public float djBIcL = 0.92f;
    public boolean AYXKKw = true;
    public boolean OLrzqt = true;
    public boolean AEQbTJ = true;
    public java.lang.String KWHzl = "";

    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.RdAHlO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.djBIcL;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vSR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ vSR newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return stateListAnimator.AEQbTJ(str, z, z2);
        }

        public final vSR AEQbTJ(java.lang.String str, boolean z, boolean z2) {
            vSR vsr = new vSR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putBoolean("param_copy_start_enable", z);
            bundle.putBoolean("param_copy_stop_enable", z2);
            vsr.setArguments(bundle);
            return vsr;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        isConnected();
        copydefault();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.AlertControllerAlertParams1));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Fragment(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.gEmmrt = values();
        fIwbmz();
        OLrzqt().KWHzl().observe(this, new Dialog(new Function1() { // from class: o.vST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vSR.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(vSR vsr, kotlin.Pair pair) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(pair, "");
        vsr.EZpvd();
        AbstractC48356uOl abstractC48356uOl = null;
        if (pair.getSecond() != null) {
            BotWebHook botWebHook = (BotWebHook) pair.getSecond();
            vsr.valueOf = botWebHook;
            if (!vsr.OLrzqt) {
                z = false;
                vsr.OLrzqt = z;
                if (vsr.AEQbTJ) {
                    BotWebHook botWebHook2 = vsr.valueOf;
                    if ((botWebHook2 != null ? botWebHook2.getStopCondition() : null) != null) {
                        z2 = true;
                    }
                    vsr.AEQbTJ = z2;
                    if (vsr.OLrzqt) {
                        vsr.AYXKKw = !vsr.OLrzqt || z2;
                        vsr.AuCTel();
                    }
                } else {
                    z2 = false;
                    vsr.AEQbTJ = z2;
                    vsr.AYXKKw = !vsr.OLrzqt || z2;
                    vsr.AuCTel();
                }
            } else {
                if ((botWebHook != null ? botWebHook.getStartCondition() : null) != null) {
                    z = true;
                }
                vsr.OLrzqt = z;
                if (vsr.AEQbTJ) {
                }
            }
        } else {
            AbstractC48356uOl abstractC48356uOl2 = vsr.gEmmrt;
            if (abstractC48356uOl2 == null) {
                Intrinsics.gEmmrt("");
                abstractC48356uOl2 = null;
            }
            C55173xeu c55173xeu = abstractC48356uOl2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(0);
            java.lang.String str = (java.lang.String) pair.getFirst();
            if (str != null) {
                AbstractC48356uOl abstractC48356uOl3 = vsr.gEmmrt;
                if (abstractC48356uOl3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC48356uOl = abstractC48356uOl3;
                }
                abstractC48356uOl.OLrzqt.setSubTitle((java.lang.CharSequence) str);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uyC.showLoading$default(o.uyC, long, int, java.lang.Object):void */
    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        AbstractC49945uyC.showLoading$default(this, 0L, 1, null);
        OLrzqt().KWHzl(this.KWHzl);
    }

    private final void isConnected() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("id")) == null) {
            string = "";
        }
        this.KWHzl = string;
        android.os.Bundle arguments2 = getArguments();
        boolean z = true;
        this.OLrzqt = arguments2 != null ? arguments2.getBoolean("param_copy_start_enable") : true;
        android.os.Bundle arguments3 = getArguments();
        boolean z2 = arguments3 != null ? arguments3.getBoolean("param_copy_stop_enable") : true;
        this.AEQbTJ = z2;
        if (!this.OLrzqt && !z2) {
            z = false;
        }
        this.AYXKKw = z;
    }

    private final void fIwbmz() {
        AbstractC48356uOl abstractC48356uOl = this.gEmmrt;
        AbstractC48356uOl abstractC48356uOl2 = null;
        if (abstractC48356uOl == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl = null;
        }
        abstractC48356uOl.OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityApi33Impl));
        AbstractC48356uOl abstractC48356uOl3 = this.gEmmrt;
        if (abstractC48356uOl3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl3 = null;
        }
        abstractC48356uOl3.OLrzqt.setRetry(C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq));
        AbstractC48356uOl abstractC48356uOl4 = this.gEmmrt;
        if (abstractC48356uOl4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl4 = null;
        }
        abstractC48356uOl4.OLrzqt.setRetryClickListener(new PendingIntent());
        AbstractC48356uOl abstractC48356uOl5 = this.gEmmrt;
        if (abstractC48356uOl5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl5 = null;
        }
        C55376xil c55376xil = abstractC48356uOl5.values;
        c55376xil.setOnClickListener(new TaskDescription(c55376xil, 1000L, this));
        AbstractC48356uOl abstractC48356uOl6 = this.gEmmrt;
        if (abstractC48356uOl6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl6 = null;
        }
        C55376xil c55376xil2 = abstractC48356uOl6.AYXKKw;
        c55376xil2.setOnClickListener(new Activity(c55376xil2, 1000L, this));
        AbstractC48356uOl abstractC48356uOl7 = this.gEmmrt;
        if (abstractC48356uOl7 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl7 = null;
        }
        C55376xil c55376xil3 = abstractC48356uOl7.valueOf;
        c55376xil3.setOnClickListener(new ActionBar(c55376xil3, 1000L, this));
        AbstractC48356uOl abstractC48356uOl8 = this.gEmmrt;
        if (abstractC48356uOl8 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl8 = null;
        }
        android.widget.TextView textView = abstractC48356uOl8.KWHzl;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        AbstractC48356uOl abstractC48356uOl9 = this.gEmmrt;
        if (abstractC48356uOl9 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl9 = null;
        }
        C52794wYp c52794wYp = abstractC48356uOl9.djBIcL;
        c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
        AbstractC48356uOl abstractC48356uOl10 = this.gEmmrt;
        if (abstractC48356uOl10 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl10 = null;
        }
        abstractC48356uOl10.DbNXlk.post(new java.lang.Runnable() { // from class: o.vSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vSR.KWHzl(this.copydefault);
            }
        });
        AbstractC48356uOl abstractC48356uOl11 = this.gEmmrt;
        if (abstractC48356uOl11 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl11 = null;
        }
        android.widget.TextView textView2 = abstractC48356uOl11.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        EZpvd(textView2, C33070mpX.AYXKKw(C55688xof.Application.newView), 0);
        AbstractC48356uOl abstractC48356uOl12 = this.gEmmrt;
        if (abstractC48356uOl12 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48356uOl2 = abstractC48356uOl12;
        }
        android.widget.TextView textView3 = abstractC48356uOl2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        EZpvd(textView3, C33070mpX.AYXKKw(C55688xof.Application.bindView), 1);
    }

    public static final class PendingIntent implements View.OnClickListener {
        public PendingIntent() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            AbstractC48356uOl abstractC48356uOl = vSR.this.gEmmrt;
            if (abstractC48356uOl == null) {
                Intrinsics.gEmmrt("");
                abstractC48356uOl = null;
            }
            C55173xeu c55173xeu = abstractC48356uOl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            vSR.this.copydefault();
        }
    }

    public static final void KWHzl(vSR vsr) {
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context contextRequireContext = vsr.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iEZpvd = c33566myq.EZpvd(contextRequireContext);
        android.content.Context contextRequireContext2 = vsr.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iCopydefault = C55298xhM.copydefault(32.0f, contextRequireContext2);
        android.content.Context contextRequireContext3 = vsr.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        int iCopydefault2 = (iEZpvd - iCopydefault) - C55298xhM.copydefault(30.0f, contextRequireContext3);
        AbstractC48356uOl abstractC48356uOl = vsr.gEmmrt;
        AbstractC48356uOl abstractC48356uOl2 = null;
        if (abstractC48356uOl == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl = null;
        }
        abstractC48356uOl.DbNXlk.setMaxWidth(iCopydefault2);
        AbstractC48356uOl abstractC48356uOl3 = vsr.gEmmrt;
        if (abstractC48356uOl3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48356uOl2 = abstractC48356uOl3;
        }
        abstractC48356uOl2.AEQbTJ.setMaxWidth(iCopydefault2);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ vSR AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vSR vsr) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = vsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                vSR vsr = this.AEQbTJ;
                AbstractC48356uOl abstractC48356uOl = vsr.gEmmrt;
                if (abstractC48356uOl == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48356uOl = null;
                }
                vsr.KWHzl(abstractC48356uOl.gEmmrt.getText().toString());
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vSR AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vSR vsr) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = vsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                vSR vsr = this.AEQbTJ;
                AbstractC48356uOl abstractC48356uOl = vsr.gEmmrt;
                if (abstractC48356uOl == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48356uOl = null;
                }
                vsr.KWHzl(abstractC48356uOl.AhwBna.getText().toString());
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ vSR EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vSR vsr) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = vsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.createListView)));
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity != null) {
                    WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, bundleBundleOf, null, 4, null);
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ vSR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, vSR vsr) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = vsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vSR KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, vSR vsr) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = vsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C33569myt.copydefault(this.KWHzl.requireContext(), android.net.Uri.parse(C33070mpX.AYXKKw(C55688xof.Application.getView)));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vSR KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vSR vsr) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = vsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                vSR vsr = this.KWHzl;
                AbstractC48356uOl abstractC48356uOl = vsr.gEmmrt;
                if (abstractC48356uOl == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48356uOl = null;
                }
                vsr.KWHzl(abstractC48356uOl.values.getText().toString());
            }
        }
    }

    public final void EZpvd(android.widget.TextView textView, java.lang.String str, int i) {
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.v);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(requireContext(), C52761wXj.Activity.Dff));
        } else {
            drawable = null;
        }
        if (drawable != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iCopydefault = C55298xhM.copydefault(16.0f, contextRequireContext);
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            drawable.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, contextRequireContext2));
        }
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(str);
        spannableStringBuilderValueOf.append((java.lang.CharSequence) "  ");
        spannableStringBuilderValueOf.setSpan(drawable != null ? new android.text.style.ImageSpan(drawable, 2) : null, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 17);
        spannableStringBuilderValueOf.setSpan(new LoaderManager(i, this), spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 17);
        textView.setText(spannableStringBuilderValueOf);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static final class LoaderManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ vSR OLrzqt;

        public LoaderManager(int i, vSR vsr) {
            this.EZpvd = i;
            this.OLrzqt = vsr;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            vSQ.Companion.EZpvd(this.EZpvd).show(this.OLrzqt.getChildFragmentManager(), "TradingViewInfoGuideDialog");
        }
    }

    private final void AuCTel() {
        AbstractC48356uOl abstractC48356uOl = this.gEmmrt;
        AbstractC48356uOl abstractC48356uOl2 = null;
        if (abstractC48356uOl == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl = null;
        }
        C55376xil c55376xil = abstractC48356uOl.values;
        BotWebHook botWebHook = this.valueOf;
        c55376xil.setText(botWebHook != null ? botWebHook.getWebhookUrl() : null);
        AbstractC48356uOl abstractC48356uOl3 = this.gEmmrt;
        if (abstractC48356uOl3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl3 = null;
        }
        LinearLayoutCompat linearLayoutCompat = abstractC48356uOl3.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        BotWebHook botWebHook2 = this.valueOf;
        linearLayoutCompat.setVisibility((botWebHook2 != null ? botWebHook2.getStartCondition() : null) != null ? 0 : 8);
        AbstractC48356uOl abstractC48356uOl4 = this.gEmmrt;
        if (abstractC48356uOl4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl4 = null;
        }
        LinearLayoutCompat linearLayoutCompat2 = abstractC48356uOl4.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        BotWebHook botWebHook3 = this.valueOf;
        linearLayoutCompat2.setVisibility((botWebHook3 != null ? botWebHook3.getStopCondition() : null) != null ? 0 : 8);
        AbstractC48356uOl abstractC48356uOl5 = this.gEmmrt;
        if (abstractC48356uOl5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl5 = null;
        }
        android.widget.TextView textView = abstractC48356uOl5.AhwBna;
        BotWebHook botWebHook4 = this.valueOf;
        textView.setText(botWebHook4 != null ? botWebHook4.getStartCondition() : null);
        AbstractC48356uOl abstractC48356uOl6 = this.gEmmrt;
        if (abstractC48356uOl6 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl6 = null;
        }
        android.widget.TextView textView2 = abstractC48356uOl6.gEmmrt;
        BotWebHook botWebHook5 = this.valueOf;
        textView2.setText(botWebHook5 != null ? botWebHook5.getStopCondition() : null);
        AbstractC48356uOl abstractC48356uOl7 = this.gEmmrt;
        if (abstractC48356uOl7 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl7 = null;
        }
        C55376xil c55376xil2 = abstractC48356uOl7.values;
        Intrinsics.checkNotNullExpressionValue(c55376xil2, "");
        KWHzl(c55376xil2, this.AYXKKw);
        AbstractC48356uOl abstractC48356uOl8 = this.gEmmrt;
        if (abstractC48356uOl8 == null) {
            Intrinsics.gEmmrt("");
            abstractC48356uOl8 = null;
        }
        C55376xil c55376xil3 = abstractC48356uOl8.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55376xil3, "");
        KWHzl(c55376xil3, this.OLrzqt);
        AbstractC48356uOl abstractC48356uOl9 = this.gEmmrt;
        if (abstractC48356uOl9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48356uOl2 = abstractC48356uOl9;
        }
        C55376xil c55376xil4 = abstractC48356uOl2.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55376xil4, "");
        KWHzl(c55376xil4, this.AEQbTJ);
    }

    public final void KWHzl(android.widget.TextView textView, boolean z) {
        textView.setEnabled(z);
        TextViewCompat.setCompoundDrawableTintList(textView, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(z ? C32113mPz.ActionBar.zLjUOn : C32113mPz.ActionBar.iwGUEr)));
    }

    public final void KWHzl(java.lang.String str) {
        C33570myu.EZpvd(getContext(), str);
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.addQueueItem), 0, 1, (java.lang.Object) null);
    }
}
