package o;

import android.view.View;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import o.C47978uAl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48157uHb extends C57635ymD {
    public Function1<? super FutureGroupInfo, Unit> AEQbTJ;
    public java.util.List<FutureGroupInfo> EZpvd;
    public androidx.fragment.app.FragmentManager OLrzqt;
    public FutureGroupInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.FutureGroupInfo, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.unify_trade.biz.FutureGroupInfo, kotlin.Unit> */
    public final Function1<FutureGroupInfo, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemSelectCallback(Function1<? super FutureGroupInfo, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48157uHb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        setOnClickListener(new View.OnClickListener() { // from class: o.uHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48157uHb.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(C48157uHb c48157uHb, android.view.View view) {
        java.util.List<TradeMenuItemBean> listEZpvd = c48157uHb.EZpvd();
        if (listEZpvd.isEmpty()) {
            return;
        }
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, listEZpvd, null, false, null, 0, 30, null);
        c47978uAlNewInstance$default.KWHzl(c48157uHb.new Application());
        androidx.fragment.app.FragmentManager fragmentManager = c48157uHb.OLrzqt;
        if (fragmentManager == null) {
            return;
        }
        c47978uAlNewInstance$default.show(fragmentManager, "");
    }

    /* JADX INFO: renamed from: o.uHb$Application */
    public static final class Application implements C47978uAl.StateListAnimator {
        public Application() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            C48157uHb.this.setText(tradeMenuItemBean.getTitle());
            C48157uHb c48157uHb = C48157uHb.this;
            java.lang.Object data = tradeMenuItemBean.getData();
            c48157uHb.copydefault = data instanceof FutureGroupInfo ? (FutureGroupInfo) data : null;
            Function1<FutureGroupInfo, Unit> function1Copydefault = C48157uHb.this.copydefault();
            if (function1Copydefault != null) {
                function1Copydefault.invoke(C48157uHb.this.copydefault);
            }
        }
    }

    public final void setShowList(java.util.List<FutureGroupInfo> list, androidx.fragment.app.FragmentManager fragmentManager) {
        this.EZpvd = list;
        this.OLrzqt = fragmentManager;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C35966oKh.Activity.AYXKKw, 0);
            setDrawableSize(C57681ymx.OLrzqt(this, 8.0f), C57681ymx.OLrzqt(this, 6.0f));
            FutureGroupInfo futureGroupInfo = list != null ? (FutureGroupInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list) : null;
            this.copydefault = futureGroupInfo;
            setText(futureGroupInfo != null ? futureGroupInfo.getText() : null);
        }
    }

    public final java.util.List<TradeMenuItemBean> EZpvd() {
        java.util.List<FutureGroupInfo> list = this.EZpvd;
        if (list == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (FutureGroupInfo futureGroupInfo : list) {
            java.lang.String text = futureGroupInfo.getText();
            if (text == null) {
                text = "";
            }
            arrayList.add(new TradeMenuItemBean(text, Intrinsics.EZpvd(futureGroupInfo, this.copydefault), futureGroupInfo, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }
}
