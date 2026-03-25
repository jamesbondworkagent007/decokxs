package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.binder.DeFiTokenModelPositionBinder$1;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC24232iZu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZB extends AbstractC27119jpF<C24237iZz, C23796iJq> {
    public final InterfaceC27287jsO EZpvd;
    public final java.util.Map<android.view.View, android.animation.ValueAnimator> KWHzl;
    public final Function1<C24237iZz, Unit> OLrzqt;
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.iZz, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iZB(@NotNull Function1<? super C24237iZz, Unit> function1, InterfaceC27287jsO interfaceC27287jsO, Function0<Unit> function0) {
        super(DeFiTokenModelPositionBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.EZpvd = interfaceC27287jsO;
        this.copydefault = function0;
        this.KWHzl = new LinkedHashMap();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull C23796iJq c23796iJq, @NotNull final C24237iZz c24237iZz) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c23796iJq, "");
        Intrinsics.checkNotNullParameter(c24237iZz, "");
        C24236iZy c24236iZyCopydefault = c24237iZz.copydefault();
        iZH izhEZpvd = iZM.EZpvd(c24236iZyCopydefault, c24237iZz.AEQbTJ(), false);
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairAEQbTJ = C27288jsP.KWHzl.AEQbTJ(c24236iZyCopydefault.copydefault(), c24236iZyCopydefault.fetchVPNInfo());
        java.lang.Integer numComponent1 = pairAEQbTJ.component1();
        java.lang.Integer numComponent2 = pairAEQbTJ.component2();
        if (numComponent1 == null || (strAYXKKw = C33070mpX.AYXKKw(numComponent1.intValue())) == null) {
            strAYXKKw = "";
        }
        c23796iJq.AhwBna.setText(strAYXKKw);
        if (numComponent2 != null) {
            c23796iJq.AhwBna.setOKDSStyle(numComponent2.intValue());
        }
        java.lang.String strValueOf = c24236iZyCopydefault.valueOf();
        if (strValueOf == null) {
            strValueOf = c24236iZyCopydefault.DbNXlk();
        }
        c23796iJq.AEQbTJ.setText(strValueOf);
        android.widget.TextView textView = c23796iJq.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(strValueOf.length() > 0 ? 0 : 8);
        c23796iJq.AYXKKw.setText(C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(c24236iZyCopydefault.AEQbTJ()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null)));
        java.lang.String strAhwBna = c24236iZyCopydefault.AhwBna();
        if (strAhwBna == null) {
            strAhwBna = c24236iZyCopydefault.fIwbmz();
        }
        c23796iJq.valueOf.setText(strAhwBna);
        android.widget.TextView textView2 = c23796iJq.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(strAhwBna.length() > 0 ? 0 : 8);
        if (izhEZpvd.OLrzqt()) {
            LinearLayoutCompat linearLayoutCompat = c23796iJq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            KWHzl(linearLayoutCompat, c24236iZyCopydefault, c24237iZz);
        }
        wYC wyc = c23796iJq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        iZM.copydefault(wyc, izhEZpvd, c24237iZz.EZpvd());
        wYC wyc2 = c23796iJq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc2, "");
        wyc2.setVisibility(izhEZpvd.copydefault() ? 0 : 8);
        if (izhEZpvd.OLrzqt()) {
            LinearLayoutCompat linearLayoutCompat2 = c23796iJq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            iZM.AEQbTJ(linearLayoutCompat2, c24237iZz.EZpvd(), izhEZpvd);
        } else {
            LinearLayoutCompat linearLayoutCompat3 = c23796iJq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility(8);
            c23796iJq.EZpvd.getLayoutParams().height = 0;
        }
        if (izhEZpvd.copydefault()) {
            ConstraintLayout root = c23796iJq.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            Function0 function0 = new Function0() { // from class: o.iZD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(iZB.AEQbTJ(c24237iZz));
                }
            };
            wYC wyc3 = c23796iJq.KWHzl;
            Intrinsics.checkNotNullExpressionValue(wyc3, "");
            LinearLayoutCompat linearLayoutCompat4 = c23796iJq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            iZM.AEQbTJ(root, izhEZpvd, function0, c24236iZyCopydefault, wyc3, linearLayoutCompat4, this.EZpvd, this.copydefault, this.KWHzl, new Function1() { // from class: o.iZA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iZB.KWHzl(c24237iZz, this, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final boolean AEQbTJ(C24237iZz c24237iZz) {
        return c24237iZz.EZpvd();
    }

    public static final Unit KWHzl(C24237iZz c24237iZz, iZB izb, boolean z) {
        c24237iZz.copydefault(z);
        Function1<C24237iZz, Unit> function1KWHzl = c24237iZz.KWHzl();
        if (function1KWHzl != null) {
            function1KWHzl.invoke(c24237iZz);
        }
        izb.OLrzqt.invoke(c24237iZz);
        return Unit.INSTANCE;
    }

    public final void KWHzl(android.view.ViewGroup viewGroup, C24236iZy c24236iZy, C24237iZz c24237iZz) {
        viewGroup.removeAllViews();
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C24230iZs c24230iZsKWHzl = c24236iZy.KWHzl();
        AbstractC24232iZu abstractC24232iZuCopydefault = c24230iZsKWHzl != null ? C24231iZt.copydefault(c24230iZsKWHzl, c24236iZy.values(), c24236iZy.copydefault()) : null;
        Intrinsics.copydefault(context);
        arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(8.0f, null, 1, null)));
        if (abstractC24232iZuCopydefault instanceof AbstractC24232iZu.Activity) {
            AbstractC24232iZu.Activity activity = (AbstractC24232iZu.Activity) abstractC24232iZuCopydefault;
            java.util.Iterator<T> it = activity.AEQbTJ().iterator();
            while (it.hasNext()) {
                iZM.addAssetsSection$default(context, (C24224iZm) it.next(), arrayList, 0, 8, null);
            }
            C24224iZm c24224iZmCopydefault = activity.copydefault();
            if (c24224iZmCopydefault != null) {
                arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(8.0f, null, 1, null)));
                iZM.addAssetsSection$default(context, c24224iZmCopydefault, arrayList, 0, 8, null);
            }
        } else if (abstractC24232iZuCopydefault instanceof AbstractC24232iZu.Application) {
            java.util.Iterator<T> it2 = ((AbstractC24232iZu.Application) abstractC24232iZuCopydefault).OLrzqt().iterator();
            while (it2.hasNext()) {
                iZM.addAssetsSection$default(context, (C24224iZm) it2.next(), arrayList, 0, 8, null);
            }
        }
        iZM.copydefault(context, c24236iZy, this.EZpvd, arrayList, this.copydefault);
        if (c24237iZz.AEQbTJ() && !c24237iZz.valueOf()) {
            arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(8.0f, null, 1, null)));
            arrayList.add(iZM.EZpvd(context));
        }
        iZM.copydefault(viewGroup, arrayList);
    }
}
