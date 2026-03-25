package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.response.HealthRate;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.binder.DeFiTokenModelExpandableItemBinder$1;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC24232iZu;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.iZv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24233iZv extends AbstractC27119jpF<C24234iZw, C23771iIs> {
    public final Function1<C24234iZw, Unit> AEQbTJ;
    public final Function0<Unit> KWHzl;
    public final java.util.Map<android.view.View, android.animation.ValueAnimator> OLrzqt;
    public final InterfaceC27287jsO copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.iZw, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24233iZv(@NotNull Function1<? super C24234iZw, Unit> function1, InterfaceC27287jsO interfaceC27287jsO, Function0<Unit> function0) {
        super(DeFiTokenModelExpandableItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        this.copydefault = interfaceC27287jsO;
        this.KWHzl = function0;
        this.OLrzqt = new LinkedHashMap();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23771iIs c23771iIs, @NotNull final C24234iZw c24234iZw) {
        HealthRateLevel healthRateLevelCopydefault;
        HealthRateLevel healthRateLevelCopydefault2;
        Intrinsics.checkNotNullParameter(c23771iIs, "");
        Intrinsics.checkNotNullParameter(c24234iZw, "");
        C24236iZy c24236iZyCopydefault = c24234iZw.copydefault();
        iZH izhEZpvd = iZM.EZpvd(c24236iZyCopydefault, c24234iZw.AEQbTJ(), true);
        C23800iJu c23800iJu = c23771iIs.AEQbTJ;
        c23800iJu.DbNXlk.setText(c24236iZyCopydefault.fIwbmz());
        c23800iJu.copydefault.setText(c24236iZyCopydefault.DbNXlk());
        c23800iJu.EZpvd.setText(C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(new BigDecimal(c24236iZyCopydefault.AEQbTJ()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null)));
        if (izhEZpvd.OLrzqt()) {
            LinearLayoutCompat linearLayoutCompat = c23771iIs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            OLrzqt(linearLayoutCompat, c24236iZyCopydefault, c24234iZw);
        }
        android.widget.ImageView imageView = c23800iJu.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        iZM.copydefault(imageView, izhEZpvd, c24234iZw.KWHzl());
        android.widget.ImageView imageView2 = c23800iJu.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(izhEZpvd.copydefault() ? 0 : 8);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = c23800iJu.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27569jxf.EZpvd(context, c23800iJu.valueOf, c24236iZyCopydefault.copydefault(c24236iZyCopydefault), C25493ixk.TaskDescription.OLrzqt, 0.1f);
        C27127jpN c27127jpN = c23800iJu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27127jpN, "");
        c27127jpN.setVisibility(c24234iZw.copydefault().OLrzqt() != null ? 0 : 8);
        C55251xgS c55251xgS = c23800iJu.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
        if (c24234iZw.copydefault().OLrzqt() != null) {
            C27127jpN c27127jpN2 = c23800iJu.AEQbTJ;
            HealthRate healthRateOLrzqt = c24234iZw.copydefault().OLrzqt();
            if (healthRateOLrzqt == null || (healthRateLevelCopydefault2 = healthRateOLrzqt.copydefault()) == null) {
                healthRateLevelCopydefault2 = HealthRateLevel.Unknown;
            }
            HealthRate healthRateOLrzqt2 = c24234iZw.copydefault().OLrzqt();
            c27127jpN2.setHealthRate(healthRateLevelCopydefault2, healthRateOLrzqt2 != null ? healthRateOLrzqt2.KWHzl() : null);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) c24236iZyCopydefault.AkhnZx())) {
            c23800iJu.AYXKKw.setText(c24236iZyCopydefault.AkhnZx());
            C55251xgS c55251xgS2 = c23800iJu.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(0);
        } else {
            C55251xgS c55251xgS3 = c23800iJu.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(8);
        }
        C27127jpN c27127jpN3 = c23800iJu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27127jpN3, "");
        c27127jpN3.setVisibility(c24234iZw.copydefault().OLrzqt() != null ? 0 : 8);
        C27127jpN c27127jpN4 = c23800iJu.AEQbTJ;
        HealthRate healthRateOLrzqt3 = c24234iZw.copydefault().OLrzqt();
        if (healthRateOLrzqt3 == null || (healthRateLevelCopydefault = healthRateOLrzqt3.copydefault()) == null) {
            healthRateLevelCopydefault = HealthRateLevel.Unknown;
        }
        HealthRate healthRateOLrzqt4 = c24234iZw.copydefault().OLrzqt();
        c27127jpN4.setHealthRate(healthRateLevelCopydefault, healthRateOLrzqt4 != null ? healthRateOLrzqt4.KWHzl() : null);
        if (izhEZpvd.OLrzqt()) {
            LinearLayoutCompat linearLayoutCompat2 = c23771iIs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            iZM.AEQbTJ(linearLayoutCompat2, c24234iZw.KWHzl(), izhEZpvd);
        } else {
            LinearLayoutCompat linearLayoutCompat3 = c23771iIs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility(8);
            c23771iIs.OLrzqt.getLayoutParams().height = 0;
        }
        if (izhEZpvd.copydefault()) {
            ConstraintLayout root = c23771iIs.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            Function0 function0 = new Function0() { // from class: o.iZx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C24233iZv.KWHzl(c24234iZw));
                }
            };
            android.widget.ImageView imageView3 = c23771iIs.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            LinearLayoutCompat linearLayoutCompat4 = c23771iIs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            iZM.AEQbTJ(root, izhEZpvd, function0, c24236iZyCopydefault, imageView3, linearLayoutCompat4, this.copydefault, this.KWHzl, this.OLrzqt, new Function1() { // from class: o.iZE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24233iZv.AEQbTJ(c24234iZw, this, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final boolean KWHzl(C24234iZw c24234iZw) {
        return c24234iZw.KWHzl();
    }

    public static final Unit AEQbTJ(C24234iZw c24234iZw, C24233iZv c24233iZv, boolean z) {
        c24234iZw.EZpvd(z);
        Function1<C24234iZw, Unit> function1OLrzqt = c24234iZw.OLrzqt();
        if (function1OLrzqt != null) {
            function1OLrzqt.invoke(c24234iZw);
        }
        c24233iZv.AEQbTJ.invoke(c24234iZw);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.view.ViewGroup viewGroup, C24236iZy c24236iZy, C24234iZw c24234iZw) {
        viewGroup.removeAllViews();
        android.content.Context context = viewGroup.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(context);
        arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
        C24230iZs c24230iZsKWHzl = c24236iZy.KWHzl();
        AbstractC24232iZu abstractC24232iZuCopydefault = c24230iZsKWHzl != null ? C24231iZt.copydefault(c24230iZsKWHzl, c24236iZy.values(), c24236iZy.copydefault()) : null;
        if (abstractC24232iZuCopydefault instanceof AbstractC24232iZu.StateListAnimator) {
            AbstractC24232iZu.StateListAnimator stateListAnimator = (AbstractC24232iZu.StateListAnimator) abstractC24232iZuCopydefault;
            int i = 0;
            for (java.lang.Object obj : stateListAnimator.EZpvd()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C24224iZm c24224iZm = (C24224iZm) obj;
                if (i > 0) {
                    arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
                }
                iZM.KWHzl(context, c24224iZm, arrayList, C55298xhM.dp2px$default(16.0f, null, 1, null));
                i++;
            }
            C24229iZr c24229iZrAEQbTJ = stateListAnimator.AEQbTJ();
            if (c24229iZrAEQbTJ != null) {
                arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
                KWHzl(context, c24229iZrAEQbTJ, arrayList);
            }
            java.lang.String strKWHzl = stateListAnimator.KWHzl();
            if (strKWHzl != null) {
                arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
                AEQbTJ(context, strKWHzl, arrayList);
            }
            java.lang.String strCopydefault = stateListAnimator.copydefault();
            if (strCopydefault != null) {
                arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
                OLrzqt(context, strCopydefault, arrayList);
            }
            java.util.List<C24228iZq> listOLrzqt = stateListAnimator.OLrzqt();
            if (listOLrzqt != null) {
                for (C24228iZq c24228iZq : listOLrzqt) {
                    arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
                    AEQbTJ(context, c24228iZq, arrayList);
                }
            }
            iZM.copydefault(context, c24236iZy, this.copydefault, arrayList, this.KWHzl);
            arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(16.0f, null, 1, null)));
            if (c24234iZw.AEQbTJ() && !c24234iZw.AhwBna()) {
                arrayList.add(iZM.EZpvd(context));
                arrayList.add(iZM.EZpvd(context, C55298xhM.dp2px$default(8.0f, null, 1, null)));
            }
        }
        iZM.copydefault(viewGroup, arrayList);
    }

    public final void KWHzl(android.content.Context context, C24229iZr c24229iZr, java.util.List<android.view.View> list) {
        iZR izr = new iZR(context, null, 0, 6, null);
        iZR.setSingleValueData$default(izr, c24229iZr.copydefault(), C27488jwD.copydefault.KWHzl(c24229iZr.AEQbTJ()), null, 4, null);
        list.add(izr);
    }

    public final void AEQbTJ(android.content.Context context, C24228iZq c24228iZq, java.util.List<android.view.View> list) {
        iZR izr = new iZR(context, null, 0, 6, null);
        iZR.setSingleValueData$default(izr, c24228iZq.AEQbTJ(), C27488jwD.copydefault.KWHzl(c24228iZq.KWHzl()), null, 4, null);
        list.add(izr);
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str, java.util.List<android.view.View> list) {
        iZR izr = new iZR(context, null, 0, 6, null);
        iZR.setSingleValueData$default(izr, C33070mpX.AYXKKw(C25493ixk.FragmentManager.gGvvIC), C27488jwD.copydefault.KWHzl(str), null, 4, null);
        list.add(izr);
    }

    public final void OLrzqt(android.content.Context context, java.lang.String str, java.util.List<android.view.View> list) {
        java.lang.String str2 = C33129mqd.AEQbTJ(str) > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : C33129mqd.AEQbTJ(str) < AudioStats.AUDIO_AMPLITUDE_NONE ? "-" : "";
        java.lang.String strKWHzl = C27488jwD.copydefault.KWHzl(str2 + C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.AEQbTJ(str)))), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null));
        iZR izr = new iZR(context, null, 0, 6, null);
        iZR.setSingleValueData$default(izr, C33070mpX.AYXKKw(C25493ixk.FragmentManager.flVtFt), strKWHzl, null, 4, null);
        izr.setValueTextColor(C27569jxf.getAssetColor$default(C27569jxf.OLrzqt, context, str, 0, 2, null));
        list.add(izr);
    }
}
