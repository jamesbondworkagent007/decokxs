package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.home_token_list.ui.binder.HomeTokenListItemBinder$3;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.business.market.widget.tag.TagEventSource;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28528kcV extends AbstractC25436iwg<HomeToken, hCJ> {
    public final androidx.fragment.app.FragmentManager AEQbTJ;
    public final Function1<HomeToken, Unit> AYXKKw;
    public final Function1<HomeToken, Unit> AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final Function0<android.content.Context> copydefault;
    public final Function2<kotlin.Pair<java.lang.Integer, java.lang.Integer>, HomeToken, Unit> djBIcL;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl() {
        return "--";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends android.content.Context> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.home_token_list.domain.HomeToken, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super com.okinc.business.market.features.home_token_list.domain.HomeToken, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.home_token_list.domain.HomeToken, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28528kcV(@NotNull Function0<? extends android.content.Context> function0, @NotNull Function1<? super HomeToken, Unit> function1, @NotNull Function2<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super HomeToken, Unit> function2, @NotNull Function1<? super HomeToken, Unit> function12, @NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        super(HomeTokenListItemBinder$3.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.copydefault = function0;
        this.AhwBna = function1;
        this.djBIcL = function2;
        this.AYXKKw = function12;
        this.OLrzqt = str;
        this.AEQbTJ = fragmentManager;
        this.valueOf = C25382ivf.copydefault(C52761wXj.ActionBar.getPostValueLengthLimit, (android.content.Context) function0.invoke());
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.KWHzl = C33512mxp.tradeRiseDefault$default(c33512mxp, (android.content.Context) function0.invoke(), 0.0f, 2, null);
        this.EZpvd = C33512mxp.tradeFallDefault$default(c33512mxp, (android.content.Context) function0.invoke(), 0.0f, 2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCJ> c25435iwf, @NotNull final HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(homeToken, "");
        hCJ hcj = (hCJ) c25435iwf.EZpvd();
        android.widget.ImageView imageView = hcj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.KWHzl(imageView, homeToken.djBIcL(), new C25385ivi(C33070mpX.KWHzl(C52761wXj.TaskDescription.aHXSQp), null, 0.0f, 0, 14, null));
        hcj.AYXKKw.setVisibility(0);
        android.widget.ImageView imageView2 = hcj.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.KWHzl(imageView2, homeToken.KWHzl(), new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
        android.widget.TextView textView = hcj.AkhnZx;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strFetchVPNInfo = homeToken.fetchVPNInfo();
        RoundingMode roundingMode = RoundingMode.DOWN;
        textView.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strFetchVPNInfo, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        hcj.isConnected.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, homeToken.copydefault(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        hcj.AEQbTJ.setText(homeToken.values());
        C28067kNr.setTags$default(hcj.KWHzl, homeToken.AhwBna(), false, homeToken.valueOf() == RiskControlLevel.HIGH, new Function1() { // from class: o.kcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28528kcV.KWHzl(this.AEQbTJ, homeToken, (java.util.List) obj);
            }
        }, new Function1() { // from class: o.kcW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28528kcV.EZpvd(this.OLrzqt, homeToken, (TagWrapper) obj);
            }
        }, 2, null);
        hcj.djBIcL.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, homeToken.gEmmrt(), false, roundingMode, false, true, false, false, null, false, false, 501, null));
        kotlin.Pair<java.lang.Integer, java.lang.String> pairKWHzl = KWHzl(homeToken.AEQbTJ());
        int iIntValue = pairKWHzl.component1().intValue();
        hcj.valueOf.setText(pairKWHzl.component2());
        hcj.valueOf.setTextColor(iIntValue);
        ConstraintLayout root = hcj.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, homeToken));
        hcj.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.kcY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C28528kcV.EZpvd(this.KWHzl, homeToken, view);
            }
        });
        int bindingAdapterPosition = c25435iwf.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            hcj.getRoot().setContentDescription(null);
            return;
        }
        hcj.getRoot().setContentDescription("web3_dex_market_home_tokens_list_item_" + bindingAdapterPosition);
    }

    public static final Unit EZpvd(C28528kcV c28528kcV, HomeToken homeToken, TagWrapper tagWrapper) {
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "launchpool")) {
            c28528kcV.AYXKKw.invoke(homeToken);
        }
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(C28528kcV c28528kcV, HomeToken homeToken, android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        c28528kcV.djBIcL.invoke(new kotlin.Pair<>(java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1])), homeToken);
        return true;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.String> KWHzl(java.lang.String str) {
        kotlin.Pair pairOLrzqt;
        if (str.length() == 0) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.valueOf), "");
        } else if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) || AEQbTJ(str)) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.valueOf), "0");
        } else if (C23313hvq.OLrzqt(str, 0) && C23313hvq.EZpvd(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null), 1)) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.KWHzl), str);
        } else if (C23313hvq.KWHzl(str, 0) && C33129mqd.valueOf(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null), -1)) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.EZpvd), str);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.valueOf), "");
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? kLY.formatPercentage$default(str2, DisplaySign.EXCEPT_ZERO, false, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), 2, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.kdb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28528kcV.KWHzl();
            }
        }));
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return (C23313hvq.KWHzl(str, 0) && C23313hvq.KWHzl(C23313hvq.mulCheckS$default(C23311hvo.copydefault(str), 100, null, null, null, 14, null), 1)) || (C23313hvq.EZpvd(str, 0) && C23313hvq.KWHzl(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null), 1));
    }

    /* JADX INFO: renamed from: o.kcV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C28528kcV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ HomeToken KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28528kcV c28528kcV, HomeToken homeToken) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c28528kcV;
            this.KWHzl = homeToken;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna.invoke(this.KWHzl);
            }
        }
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        C32866mlf.onEvent$default("DEXMarket_Home_TokenLabel_Click", (TrackChannel[]) null, new Function1() { // from class: o.kcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28528kcV.KWHzl(str2, str4, str, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "list_key", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28528kcV c28528kcV, HomeToken homeToken, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C29694kyV.AEQbTJ.OLrzqt(((TagWrapper) it.next()).OLrzqt()));
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((java.lang.String) next).length() > 0) {
                break;
            }
        }
        java.lang.String str = (java.lang.String) next;
        c28528kcV.KWHzl(str != null ? str : "", c28528kcV.OLrzqt, homeToken.OLrzqt(), homeToken.values());
        C29717kys.Companion.EZpvd(new TagExplanationBottomSheetParams(homeToken.OLrzqt(), homeToken.AYXKKw(), false, null, TagEventSource.HOMEPAGE, false, 44, null)).show(c28528kcV.AEQbTJ);
        return Unit.INSTANCE;
    }
}
