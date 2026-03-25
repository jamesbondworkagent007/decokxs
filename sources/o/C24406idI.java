package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.route.SmartRoutingViewModel;
import com.okinc.business.dexui.main.swap.route.SmartRoutingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24406idI extends AbstractC59533zio<DexQuoteBridgeVO, TaskDescription> {
    public final Function2<DexQuoteBridgeVO, java.lang.String, Unit> EZpvd;
    public final java.lang.Object KWHzl;
    public final SmartRoutingViewModel OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.dexlogic.bean.DexQuoteBridgeVO, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C24406idI(@NotNull SmartRoutingViewModel smartRoutingViewModel, @NotNull Function2<? super DexQuoteBridgeVO, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(smartRoutingViewModel, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = smartRoutingViewModel;
        this.EZpvd = function2;
        this.KWHzl = new java.lang.Object();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DPhTBN, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final DexQuoteBridgeVO dexQuoteBridgeVO) {
        DexMultiTokenInfoBean crossToToken;
        DexMultiTokenInfoBean crossFromToken;
        java.lang.String tokenLogoUrl;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(dexQuoteBridgeVO, "");
        C24484ieh c24484iehKWHzl = taskDescription.KWHzl();
        java.lang.String tokenLogoUrl2 = null;
        if (c24484iehKWHzl != null && (crossFromToken = dexQuoteBridgeVO.getCrossFromToken()) != null) {
            SmartRoutingData smartRoutingDataAhwBna = this.OLrzqt.AhwBna();
            if (Intrinsics.EZpvd((java.lang.Object) (smartRoutingDataAhwBna != null ? smartRoutingDataAhwBna.AEQbTJ() : null), (java.lang.Object) "2")) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl = this.OLrzqt.KWHzl();
                tokenLogoUrl = dexMultiTokenInfoBeanKWHzl != null ? dexMultiTokenInfoBeanKWHzl.getTokenLogoUrl() : null;
            } else {
                tokenLogoUrl = crossFromToken.getTokenLogoUrl();
            }
            if (tokenLogoUrl == null) {
                tokenLogoUrl = "";
            }
            c24484iehKWHzl.EZpvd(tokenLogoUrl, crossFromToken.getChainLogoUrl());
        }
        android.widget.TextView textViewEZpvd = taskDescription.EZpvd();
        if (textViewEZpvd != null) {
            if (dexQuoteBridgeVO.getPercent().length() > 0) {
                textViewEZpvd.setVisibility(0);
                textViewEZpvd.setText(C23311hvo.formatPercent$default(dexQuoteBridgeVO.getPercent(), false, 0, 0, null, null, 30, null));
            } else {
                textViewEZpvd.setVisibility(4);
            }
        }
        C55390xiz c55390xizOLrzqt = taskDescription.OLrzqt();
        if (c55390xizOLrzqt != null) {
            c55390xizOLrzqt.setText(dexQuoteBridgeVO.getFromPoolName());
            C25352ivB.setOnDoubleCheckClickListener$default(c55390xizOLrzqt, 0L, new Function1() { // from class: o.idG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24406idI.AEQbTJ(this.EZpvd, dexQuoteBridgeVO, (android.view.View) obj);
                }
            }, 1, null);
        }
        C55390xiz c55390xizAEQbTJ = taskDescription.AEQbTJ();
        if (c55390xizAEQbTJ != null) {
            c55390xizAEQbTJ.setText(dexQuoteBridgeVO.getToPoolName());
            C25352ivB.setOnDoubleCheckClickListener$default(c55390xizAEQbTJ, 0L, new Function1() { // from class: o.idH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24406idI.KWHzl(this.KWHzl, dexQuoteBridgeVO, (android.view.View) obj);
                }
            }, 1, null);
        }
        C24484ieh c24484iehCopydefault = taskDescription.copydefault();
        if (c24484iehCopydefault == null || (crossToToken = dexQuoteBridgeVO.getCrossToToken()) == null) {
            return;
        }
        SmartRoutingData smartRoutingDataAhwBna2 = this.OLrzqt.AhwBna();
        if (Intrinsics.EZpvd((java.lang.Object) (smartRoutingDataAhwBna2 != null ? smartRoutingDataAhwBna2.AEQbTJ() : null), (java.lang.Object) "2")) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanDbNXlk = this.OLrzqt.DbNXlk();
            if (dexMultiTokenInfoBeanDbNXlk != null) {
                tokenLogoUrl2 = dexMultiTokenInfoBeanDbNXlk.getTokenLogoUrl();
            }
        } else {
            tokenLogoUrl2 = crossToToken.getTokenLogoUrl();
        }
        c24484iehCopydefault.EZpvd(tokenLogoUrl2 != null ? tokenLogoUrl2 : "", crossToToken.getChainLogoUrl());
    }

    public static final Unit AEQbTJ(C24406idI c24406idI, DexQuoteBridgeVO dexQuoteBridgeVO, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24406idI.EZpvd.invoke(dexQuoteBridgeVO, QuotePriceRes.FROM_POOL);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C24406idI c24406idI, DexQuoteBridgeVO dexQuoteBridgeVO, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24406idI.EZpvd.invoke(dexQuoteBridgeVO, QuotePriceRes.TO_POOL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.idI$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C55390xiz AEQbTJ;
        public final C55390xiz EZpvd;
        public final C24484ieh KWHzl;
        public final C24484ieh OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55390xiz AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24484ieh KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55390xiz OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C24484ieh copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (C24484ieh) view.findViewById(C23274hvD.Application.HJWChPRGtXKC);
            this.copydefault = (android.widget.TextView) view.findViewById(C23274hvD.Application.AppCompatDelegateImplActionBarMenuCallback);
            this.EZpvd = (C55390xiz) view.findViewById(C23274hvD.Application.ixgjPv);
            this.AEQbTJ = (C55390xiz) view.findViewById(C23274hvD.Application.WS);
            this.OLrzqt = (C24484ieh) view.findViewById(C23274hvD.Application.ikIEnW);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.onViewDetachedFromWindow(taskDescription);
        C33050mpD.OLrzqt(this.KWHzl);
    }
}
