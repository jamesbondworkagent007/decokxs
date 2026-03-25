package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexui.main.swap.route.adapter.SmartRouteBridgeSleBinder$1;
import com.okinc.business.domain.model.PathRouterUi;
import com.okinc.business.domain.model.PathType;
import com.okinc.core.ktx.MatchPattern;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24400idC extends AbstractC25436iwg<PathRouterUi, hAB> {
    public final AbstractC23101hrq AEQbTJ;
    public Function2<? super java.lang.Integer, ? super PathRouterUi, Unit> EZpvd;
    public Function1<? super PathRouterUi, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24400idC AEQbTJ(Function2<? super java.lang.Integer, ? super PathRouterUi, Unit> function2) {
        this.EZpvd = function2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24400idC copydefault(Function1<? super PathRouterUi, Unit> function1) {
        this.OLrzqt = function1;
        return this;
    }

    public C24400idC(AbstractC23101hrq abstractC23101hrq) {
        super(SmartRouteBridgeSleBinder$1.INSTANCE);
        this.AEQbTJ = abstractC23101hrq;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hAB> c25435iwf, @NotNull final PathRouterUi pathRouterUi) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(pathRouterUi, "");
        hAB hab = (hAB) c25435iwf.EZpvd();
        if (pathRouterUi.AhwBna() == PathType.SWAP) {
            EZpvd(c25435iwf, pathRouterUi);
        } else {
            KWHzl(c25435iwf, pathRouterUi);
        }
        android.widget.ImageView imageView = hab.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadImageWithBorder$default(imageView, pathRouterUi.AEQbTJ(), null, 2, null);
        hab.fIwbmz.setText(pathRouterUi.gEmmrt());
        C55251xgS c55251xgS = hab.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(pathRouterUi.EZpvd() == 1 ? 0 : 8);
        if (pathRouterUi.AkhnZx()) {
            C55251xgS c55251xgS2 = hab.fetchVPNInfo;
            android.content.Context context = ((hAB) c25435iwf.EZpvd()).getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55251xgS2.setTextColor(C25382ivf.KWHzl(context, C52761wXj.ActionBar.DCUTEI));
            hab.fetchVPNInfo.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.LocalActivityResultRegistryOwner));
        } else {
            hab.fetchVPNInfo.setText(pathRouterUi.copydefault());
            hab.fetchVPNInfo.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.Dmq));
        }
        C25352ivB.setOnDoubleCheckClickListener$default(hab.AhwBna, 0L, new Function1() { // from class: o.idF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24400idC.KWHzl(this.copydefault, pathRouterUi, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(hab.OLrzqt, 0L, new Function1() { // from class: o.idB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24400idC.EZpvd(this.OLrzqt, pathRouterUi, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C24400idC c24400idC, PathRouterUi pathRouterUi, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super PathRouterUi, Unit> function1 = c24400idC.OLrzqt;
        if (function1 != null) {
            function1.invoke(pathRouterUi);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24400idC c24400idC, PathRouterUi pathRouterUi, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super java.lang.Integer, ? super PathRouterUi, Unit> function2 = c24400idC.EZpvd;
        if (function2 != null) {
            java.util.List<?> items = c24400idC.getAdapter().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            function2.invoke(java.lang.Integer.valueOf(CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends PathRouterUi>) ((java.util.List<? extends java.lang.Object>) items), pathRouterUi)), pathRouterUi);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C25435iwf<hAB> c25435iwf, PathRouterUi pathRouterUi) {
        final hAB hab = (hAB) c25435iwf.EZpvd();
        if (pathRouterUi.DbNXlk()) {
            android.widget.ImageView imageView = hab.AEQbTJ;
            imageView.setVisibility(0);
            C25352ivB.setOnDoubleCheckClickListener$default(imageView, 0L, new Function1() { // from class: o.idE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24400idC.EZpvd(hab, (android.view.View) obj);
                }
            }, 1, null);
            Intrinsics.copydefault(imageView);
        } else {
            hab.AEQbTJ.setVisibility(8);
        }
        hab.copydefault.setVisibility(8);
        hab.fJNWhG.setVisibility(8);
        hab.values.setVisibility(8);
        hab.djBIcL.setVisibility(8);
        hab.isConnected.setVisibility(8);
        hab.AkhnZx.setVisibility(0);
        if (c25435iwf.getLayoutPosition() == 0) {
            hab.AhwBna.setVisibility(0);
            hab.AkhnZx.setOKDSStyle(7);
            hab.AkhnZx.setText(c25435iwf.itemView.getContext().getResources().getString(C23274hvD.Fragment.getFlagsValues));
            copydefault(hab, pathRouterUi);
        } else if (C23313hvq.copydefault(pathRouterUi.AYXKKw(), "0")) {
            hab.AkhnZx.setText(C23311hvo.formatPercent$default(pathRouterUi.AYXKKw(), false, 0, 2, null, null, 27, null));
            hab.AkhnZx.setOKDSStyle(6);
            hab.AhwBna.setVisibility(8);
            hab.gEmmrt.setVisibility(8);
        } else {
            hab.AkhnZx.setText(C23311hvo.formatPercent$default(pathRouterUi.AYXKKw(), false, 0, 2, null, null, 27, null));
            if (C33512mxp.AEQbTJ.isConnected() == 0) {
                hab.AkhnZx.setOKDSStyle(13);
            } else {
                hab.AkhnZx.setOKDSStyle(14);
            }
            hab.AhwBna.setVisibility(8);
            hab.gEmmrt.setVisibility(8);
        }
        hab.fetchVPNInfo.setText(pathRouterUi.copydefault());
    }

    public static final Unit EZpvd(hAB hab, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = hab.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, "", C33070mpX.AYXKKw(C23274hvD.Fragment.getCallerInput), C23274hvD.Fragment.buildRccMetadata);
        return Unit.INSTANCE;
    }

    public final void KWHzl(C25435iwf<hAB> c25435iwf, final PathRouterUi pathRouterUi) {
        java.lang.String tokenSymbol;
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        DexMultiTokenInfoBean token;
        final hAB hab = (hAB) c25435iwf.EZpvd();
        int i = 0;
        if (pathRouterUi.isConnected()) {
            hab.OLrzqt.setBackgroundResource(C23274hvD.ActionBar.AhwBna);
            hab.copydefault.setVisibility(0);
        } else {
            hab.OLrzqt.setBackgroundResource(C23274hvD.ActionBar.AYXKKw);
            hab.copydefault.setVisibility(8);
        }
        AppCompatTextView appCompatTextView = hab.ejfBZ;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String strKWHzl = pathRouterUi.KWHzl();
        AbstractC23101hrq abstractC23101hrq = this.AEQbTJ;
        if (abstractC23101hrq == null || (quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh()) == null || (token = quotePriceResAxsJAYsNCnLh.toToken()) == null || (tokenSymbol = token.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        appCompatTextView.setText(C23271hvA.getSwapFormatAmountWithSymbol$default(c23271hvA, strKWHzl, tokenSymbol, null, 4, null));
        hab.fJNWhG.setText(C33129mqd.OLrzqt((java.lang.CharSequence) pathRouterUi.values()) ? C23311hvo.setCountDownText$default(C33129mqd.AhwBna(pathRouterUi.values()), false, 2, null) : "--");
        C55251xgS c55251xgS = hab.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55251xgS c55251xgS2 = hab.isConnected;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        C55251xgS c55251xgS3 = hab.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
        C25352ivB.EZpvd(c55251xgS, c55251xgS2, c55251xgS3, pathRouterUi.djBIcL(), true);
        hab.fetchVPNInfo.setText(pathRouterUi.copydefault());
        hab.values.setVisibility(0);
        hab.values.setText(java.lang.String.valueOf(pathRouterUi.fetchVPNInfo().size()));
        hab.AEQbTJ.setVisibility(8);
        C55251xgS c55251xgS4 = hab.values;
        Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
        if (!pathRouterUi.fetchVPNInfo().isEmpty()) {
            C25352ivB.setOnDoubleCheckClickListener$default(hab.values, 0L, new Function1() { // from class: o.idJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24400idC.copydefault(this.OLrzqt, hab, pathRouterUi, (android.view.View) obj);
                }
            }, 1, null);
        } else {
            i = 8;
        }
        c55251xgS4.setVisibility(i);
        copydefault(hab, pathRouterUi);
    }

    public static final Unit copydefault(C24400idC c24400idC, hAB hab, PathRouterUi pathRouterUi, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = hab.values.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c24400idC.AEQbTJ(context, pathRouterUi.fetchVPNInfo());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.content.Context context, java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(pTD.EZpvd(context, C23274hvD.FragmentManager.valueOf, list.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(list.size())))));
        for (java.lang.String str : list) {
            sb.append("\n");
            sb.append(str);
        }
        sb.append("\n\n");
        sb.append(context.getString(C23274hvD.Fragment.RkASWs));
        C25352ivB.OLrzqt(context, C33070mpX.AYXKKw(C23274hvD.Fragment.RZNAhV), sb.toString(), C23274hvD.Fragment.buildRccMetadata);
    }

    public final void copydefault(final hAB hab, PathRouterUi pathRouterUi) {
        MutableLiveData<java.util.List<PathSelectionRouterItem>> mutableLiveDataGasjUx;
        java.util.List<PathSelectionRouterItem> value;
        java.lang.String strValueOf = pathRouterUi.valueOf();
        java.lang.String showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, strValueOf, false, false, RoundingMode.DOWN, false, 20, null);
        java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ActivityResultCallerLauncherresultContract21, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", showDataWithPrefix$default)));
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(14, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(14, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        hab.fARcdN.setCompoundDrawables(null, null, drawableKWHzl, null);
        hab.AuCTel.setText(C33061mpO.setupSpanStyles$default(strKWHzl, new java.lang.String[]{showDataWithPrefix$default}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.idD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24400idC.EZpvd(hab, (java.util.List) obj);
            }
        }, 10, null));
        AbstractC23101hrq abstractC23101hrq = this.AEQbTJ;
        if ((abstractC23101hrq != null && (mutableLiveDataGasjUx = abstractC23101hrq.gasjUx()) != null && (value = mutableLiveDataGasjUx.getValue()) != null && value.size() == 1) || strValueOf.length() == 0 || !C33129mqd.copydefault(strValueOf, "0.1")) {
            hab.gEmmrt.setVisibility(8);
        } else {
            hab.gEmmrt.setVisibility(0);
        }
    }

    public static final Unit EZpvd(hAB hab, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = hab.AuCTel.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null)));
        return Unit.INSTANCE;
    }
}
