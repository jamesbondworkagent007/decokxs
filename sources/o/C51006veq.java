package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47978uAl;
import o.C54790xVk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.veq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51006veq extends AppCompatTextView {
    public BizInstrument AEQbTJ;
    public Function0<Unit> EZpvd;
    public androidx.fragment.app.FragmentManager KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51006veq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51006veq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFm(androidx.fragment.app.FragmentManager fragmentManager) {
        this.KWHzl = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDepthLevelSelectedCallback(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.veq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51006veq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51006veq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOnClickListener(new View.OnClickListener() { // from class: o.ves
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51006veq.EZpvd(this.OLrzqt, view);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uAl.Application.newInstance$default(o.uAl$Application, java.util.List, java.lang.String, boolean, java.lang.String, int, int, java.lang.Object):o.uAl */
    public static final void EZpvd(C51006veq c51006veq, android.view.View view) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrument;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.util.ArrayList arrayList = null;
        if (interfaceC54581xNrOLrzqt != null) {
            BizInstrument bizInstrument2 = c51006veq.AEQbTJ;
            if (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (abstractC54531xLwOLrzqt == null || (bizInstrument = c51006veq.AEQbTJ) == null) {
            return;
        }
        java.util.List<java.lang.String> listKWHzl = abstractC54531xLwOLrzqt.KWHzl(bizInstrument);
        if (listKWHzl != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (java.lang.String str : listKWHzl) {
                xMR xmr = xMR.copydefault;
                arrayList.add(new TradeMenuItemBean(xmr.copydefault(str), Intrinsics.EZpvd((java.lang.Object) c51006veq.getText(), (java.lang.Object) xmr.copydefault(str)), null, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32764, null));
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, arrayList2, null, false, null, 0, 30, null);
        c47978uAlNewInstance$default.KWHzl(c51006veq.new ActionBar());
        androidx.fragment.app.FragmentManager fragmentManager = c51006veq.KWHzl;
        if (fragmentManager == null) {
            return;
        }
        c47978uAlNewInstance$default.show(fragmentManager, "OptionsSelectUlyView");
    }

    /* JADX INFO: renamed from: o.veq$ActionBar */
    public static final class ActionBar implements C47978uAl.StateListAnimator {
        public ActionBar() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            C51006veq.this.setText(tradeMenuItemBean.getTitle());
            Function0<Unit> function0Copydefault = C51006veq.this.copydefault();
            if (function0Copydefault != null) {
                function0Copydefault.invoke();
            }
        }
    }

    public static /* synthetic */ void onVisible$default(C51006veq c51006veq, BizInstrument bizInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = null;
        }
        c51006veq.OLrzqt(bizInstrument);
    }

    public final void OLrzqt(BizInstrument bizInstrument) {
        this.AEQbTJ = bizInstrument;
        setLevel();
    }

    public final java.lang.String KWHzl() {
        java.lang.CharSequence text = getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void EZpvd() {
        setLevel();
    }

    public final void setLevel() {
        java.lang.String instId;
        java.lang.String instType;
        BizInstrument bizInstrument = this.AEQbTJ;
        xMR xmr = xMR.copydefault;
        C54790xVk.Application application = C54790xVk.Companion;
        java.lang.String str = "";
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
            str = instType;
        }
        setText(xmr.copydefault(application.AEQbTJ(instId, str)));
    }
}
