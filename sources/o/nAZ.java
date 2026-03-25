package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.conversation.message.provider.ContractAddressSendMessageViewProvider$handleViewLongClick$1;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33758nEt;
import o.C35399nuc;
import o.C52761wXj;
import o.C55159xeg;
import o.C55386xiv;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nAZ extends oAA<OKContractAddressMessage, AbstractC33955nMa> {
    public final int KWHzl = C35342ntX.AEQbTJ;
    public final int AEQbTJ = C35399nuc.Dialog.sTzBva;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nBb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(nAZ.AYXKKw());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKContractAddressMessage> KWHzl() {
        return OKContractAddressMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44112sDu, AbstractC33955nMa>) oac, c35254nrp, (OKContractAddressMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.KWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AYXKKw() {
        return C33758nEt.copydefault.copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKContractAddressMessage oKContractAddressMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.OfWYUE);
        java.lang.String tokenSymbol = oKContractAddressMessage.getTokenSymbol();
        return "[" + strAYXKKw + "] " + (tokenSymbol != null ? tokenSymbol : "");
    }

    public final android.content.Context AEQbTJ(android.content.Context context) {
        return C55374xij.AEQbTJ(context, 32);
    }

    public void KWHzl(@NotNull oAC<AbstractC44112sDu, AbstractC33955nMa> oac, @NotNull final C35254nrp c35254nrp, @NotNull final OKContractAddressMessage oKContractAddressMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        super.copydefault(oac, c35254nrp, oKContractAddressMessage);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Card_Card_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nAZ.EZpvd(oKContractAddressMessage, c35254nrp, (EventParamsList) obj);
            }
        });
        AbstractC33955nMa abstractC33955nMa = (AbstractC33955nMa) oac.EZpvd();
        KWHzl(abstractC33955nMa);
        EZpvd(abstractC33955nMa, oKContractAddressMessage);
        OLrzqt(abstractC33955nMa, oKContractAddressMessage);
        KWHzl(abstractC33955nMa, oKContractAddressMessage, c35254nrp);
        android.widget.LinearLayout linearLayout = ((AbstractC33955nMa) oac.EZpvd()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AEQbTJ(c35254nrp, linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(OKContractAddressMessage oKContractAddressMessage, C35254nrp c35254nrp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String bizName = oKContractAddressMessage.getBizName();
        EventParamsList.put$default(eventParamsList, "bizline", bizName == null ? "" : bizName, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", c35254nrp.OLrzqt().getTargetId(), false, 4, null);
        java.lang.String senderUserId = c35254nrp.OLrzqt().getSenderUserId();
        EventParamsList.put$default(eventParamsList, "sender_id", senderUserId == null ? "" : senderUserId, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractC33955nMa abstractC33955nMa) {
        android.view.View root = abstractC33955nMa.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r3) * 0.65f);
            int iDp2px$default = C55298xhM.dp2px$default(280.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(210.0f, null, 1, null);
            if (iEZpvd >= iDp2px$default) {
                iEZpvd = iDp2px$default;
            } else if (iEZpvd <= iDp2px$default2) {
                iEZpvd = iDp2px$default2;
            }
            layoutParams.width = iEZpvd;
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
    }

    public final void EZpvd(AbstractC33955nMa abstractC33955nMa, final OKContractAddressMessage oKContractAddressMessage) {
        java.lang.String tokenLogo = oKContractAddressMessage.getTokenLogo();
        if (tokenLogo != null && tokenLogo.length() != 0) {
            Intrinsics.copydefault(Glide.AEQbTJ(abstractC33955nMa.AuCTel.getContext()).EZpvd(oKContractAddressMessage.getTokenLogo()).KWHzl(C52761wXj.TaskDescription.vLaW).copydefault(C52761wXj.TaskDescription.vLaW).gEmmrt().EZpvd(abstractC33955nMa.AuCTel));
        } else {
            abstractC33955nMa.AuCTel.setImageResource(C52761wXj.TaskDescription.vLaW);
        }
        java.lang.String chainLogo = oKContractAddressMessage.getChainLogo();
        if (chainLogo != null && chainLogo.length() != 0) {
            Intrinsics.copydefault(Glide.AEQbTJ(abstractC33955nMa.AYXKKw.getContext()).EZpvd(oKContractAddressMessage.getChainLogo()).KWHzl(C52761wXj.TaskDescription.RSDDiY).copydefault(C52761wXj.TaskDescription.RSDDiY).gEmmrt().EZpvd(abstractC33955nMa.AYXKKw));
        } else {
            abstractC33955nMa.AYXKKw.setImageResource(C52761wXj.TaskDescription.RSDDiY);
        }
        android.widget.TextView textView = abstractC33955nMa.hDKMBd;
        java.lang.String tokenSymbol = oKContractAddressMessage.getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        textView.setText(tokenSymbol);
        java.lang.String contractAddress = oKContractAddressMessage.getContractAddress();
        java.lang.String address$default = contractAddress != null ? sSQ.formatAddress$default(sSQ.KWHzl, contractAddress, 4, 4, null, 4, null) : null;
        android.widget.TextView textView2 = abstractC33955nMa.fJNWhG;
        if (address$default == null) {
            address$default = "";
        }
        textView2.setText(address$default);
        abstractC33955nMa.gEmmrt.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.RIuxYh, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, "1"))));
        java.util.List<ConversationIcon> icons = oKContractAddressMessage.getIcons();
        if (icons != null && !icons.isEmpty()) {
            oIV oiv = abstractC33955nMa.AhwBna;
            Intrinsics.checkNotNullExpressionValue(oiv, "");
            oiv.setVisibility(0);
            oIV.setIcons$default(abstractC33955nMa.AhwBna, oKContractAddressMessage.getIcons(), false, true, true, 2, null);
        } else {
            oIV oiv2 = abstractC33955nMa.AhwBna;
            Intrinsics.checkNotNullExpressionValue(oiv2, "");
            oiv2.setVisibility(8);
        }
        C55251xgS c55251xgS = abstractC33955nMa.fARcdN;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(Intrinsics.EZpvd(oKContractAddressMessage.isDexListed(), java.lang.Boolean.TRUE) ? 0 : 8);
        abstractC33955nMa.fARcdN.setBgColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialaGOrKO));
        abstractC33955nMa.fARcdN.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.spnCvw));
        Function0 function0 = new Function0() { // from class: o.nAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nAZ.EZpvd(oKContractAddressMessage);
            }
        };
        android.widget.ImageView imageView = abstractC33955nMa.AEQbTJ;
        imageView.setOnClickListener(new PendingIntent(imageView, 1000L, function0));
        android.widget.TextView textView3 = abstractC33955nMa.fJNWhG;
        textView3.setOnClickListener(new Fragment(textView3, 1000L, function0));
        android.widget.ImageView imageView2 = abstractC33955nMa.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(gEmmrt() ? 0 : 8);
        android.widget.ImageView imageView3 = abstractC33955nMa.ejfBZ;
        imageView3.setOnClickListener(new FragmentManager(imageView3, 1000L, this, oKContractAddressMessage, abstractC33955nMa));
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ OKContractAddressMessage AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ nAZ OLrzqt;
        public final /* synthetic */ AbstractC33955nMa copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, nAZ naz, OKContractAddressMessage oKContractAddressMessage, AbstractC33955nMa abstractC33955nMa) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = naz;
            this.AEQbTJ = oKContractAddressMessage;
            this.copydefault = abstractC33955nMa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.lang.String strEZpvd = sSQ.KWHzl.EZpvd(this.OLrzqt.gEmmrt(), this.AEQbTJ, true);
                oGV ogv = oGV.EZpvd;
                android.content.Context context = this.copydefault.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                oGV.processDeeplink$default(ogv, context, strEZpvd, null, this.OLrzqt.fIwbmz(), Dialog.OLrzqt, 4, null);
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ AbstractC33955nMa AEQbTJ;
        public final /* synthetic */ C52794wYp EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ OKContractAddressMessage OLrzqt;
        public final /* synthetic */ C35254nrp copydefault;
        public final /* synthetic */ long gEmmrt;
        public final /* synthetic */ nAZ valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, nAZ naz, C52794wYp c52794wYp, OKContractAddressMessage oKContractAddressMessage, AbstractC33955nMa abstractC33955nMa, C35254nrp c35254nrp) {
            this.KWHzl = view;
            this.gEmmrt = j;
            this.valueOf = naz;
            this.EZpvd = c52794wYp;
            this.OLrzqt = oKContractAddressMessage;
            this.AEQbTJ = abstractC33955nMa;
            this.copydefault = c35254nrp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.gEmmrt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.KWHzl;
                if (!C33758nEt.copydefault.OLrzqt()) {
                    nAZ naz = this.valueOf;
                    android.content.Context context = this.EZpvd.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    naz.EZpvd(context);
                    return;
                }
                if (C34703nhO.AhwBna(this.EZpvd.getContext())) {
                    C55326xho.toast$default("Deeplink: " + c52794wYp, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
                java.lang.String deeplinkForCA$default = sSQ.getDeeplinkForCA$default(sSQ.KWHzl, this.valueOf.gEmmrt(), this.OLrzqt, false, 4, null);
                oGV ogv = oGV.EZpvd;
                android.content.Context context2 = this.AEQbTJ.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                oGV.processDeeplink$default(ogv, context2, deeplinkForCA$default, null, this.valueOf.fIwbmz(), Application.copydefault, 4, null);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("IMChat_Card_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new TaskDescription(this.copydefault));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(OKContractAddressMessage oKContractAddressMessage) {
        sSQ ssq = sSQ.KWHzl;
        java.lang.String contractAddress = oKContractAddressMessage.getContractAddress();
        if (contractAddress == null) {
            contractAddress = "";
        }
        ssq.gEmmrt(contractAddress);
        C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.zzQwtT, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final class Dialog implements Function1<AbstractC43238rlX, Unit> {
        public static final Dialog OLrzqt = new Dialog();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            copydefault(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(AbstractC33955nMa abstractC33955nMa, OKContractAddressMessage oKContractAddressMessage) {
        java.lang.String fiatSymbolWithSubscriptStyle$default;
        java.lang.String iCUPercent$default;
        int iKWHzl;
        java.lang.Double dAuCTel;
        android.content.Context context = abstractC33955nMa.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Context contextAEQbTJ = AEQbTJ(context);
        android.widget.TextView textView = abstractC33955nMa.getFieldNames;
        java.lang.Double currentPrice = oKContractAddressMessage.getCurrentPrice();
        if (currentPrice == null || (fiatSymbolWithSubscriptStyle$default = C38305pTw.formatFiatSymbolWithSubscriptStyle$default(currentPrice, "USD", null, C38307pTy.Companion.copydefault(1, 5), null, null, 26, null)) == null) {
            fiatSymbolWithSubscriptStyle$default = "$0.00";
        }
        textView.setText(fiatSymbolWithSubscriptStyle$default);
        android.widget.TextView textView2 = abstractC33955nMa.EZpvd;
        java.lang.Double change1h = oKContractAddressMessage.getChange1h();
        if (change1h == null || !java.lang.Double.isNaN(change1h.doubleValue())) {
            java.lang.Double change1h2 = oKContractAddressMessage.getChange1h();
            iCUPercent$default = change1h2 != null ? pTB.formatICUPercent$default(change1h2, null, null, DisplaySign.EXCEPT_ZERO, null, null, 27, null) : null;
        } else {
            iCUPercent$default = "-";
        }
        textView2.setText(iCUPercent$default);
        if (C33512mxp.AEQbTJ.isConnected() == 0) {
            java.lang.Double change1h3 = oKContractAddressMessage.getChange1h();
            if ((change1h3 != null ? change1h3.doubleValue() : 0.0d) < AudioStats.AUDIO_AMPLITUDE_NONE) {
                iKWHzl = C55366xib.KWHzl(C52761wXj.ActionBar.OuxcSI, contextAEQbTJ);
            } else {
                java.lang.Double change1h4 = oKContractAddressMessage.getChange1h();
                iKWHzl = (change1h4 != null ? change1h4.doubleValue() : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE ? C55366xib.KWHzl(C52761wXj.ActionBar.DCUTEI, contextAEQbTJ) : ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.aUsmxb);
            }
        } else {
            java.lang.Double change1h5 = oKContractAddressMessage.getChange1h();
            if ((change1h5 != null ? change1h5.doubleValue() : 0.0d) < AudioStats.AUDIO_AMPLITUDE_NONE) {
                iKWHzl = C55366xib.KWHzl(C52761wXj.ActionBar.DCUTEI, contextAEQbTJ);
            } else {
                java.lang.Double change1h6 = oKContractAddressMessage.getChange1h();
                iKWHzl = (change1h6 != null ? change1h6.doubleValue() : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE ? C55366xib.KWHzl(C52761wXj.ActionBar.OuxcSI, contextAEQbTJ) : ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.aUsmxb);
            }
        }
        abstractC33955nMa.EZpvd.setTextColor(iKWHzl);
        android.widget.TextView textView3 = abstractC33955nMa.values;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        java.lang.String marketCap = oKContractAddressMessage.getMarketCap();
        textView3.setVisibility((marketCap == null || marketCap.length() == 0) ^ true ? 0 : 8);
        java.lang.String marketCap2 = oKContractAddressMessage.getMarketCap();
        if (marketCap2 != null && (dAuCTel = C59443zhD.AuCTel(marketCap2)) != null) {
            abstractC33955nMa.values.setText(C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(dAuCTel.doubleValue()), "USD", null, C38307pTy.Companion.EZpvd(2), null, Notation.COMPACT_SHORT, null, 42, null));
        }
        copydefault(abstractC33955nMa, oKContractAddressMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:3:0x0013, B:5:0x001c, B:6:0x0025, B:8:0x002b, B:13:0x0055, B:16:0x005c, B:18:0x0060, B:12:0x004b, B:19:0x0064, B:22:0x006e, B:24:0x007b, B:29:0x023f, B:25:0x0155, B:27:0x015d, B:28:0x0235, B:21:0x006a, B:9:0x0031), top: B:37:0x0013, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(AbstractC33955nMa abstractC33955nMa, OKContractAddressMessage oKContractAddressMessage) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objValueOf;
        java.lang.Object objM7377constructorimpl2;
        C55159xeg c55159xeg = abstractC33955nMa.KWHzl;
        android.content.Context context = c55159xeg.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Context contextAEQbTJ = AEQbTJ(context);
        try {
            Result.Application application = Result.Companion;
            java.util.List<OKContractAddressMessage.PriceChartPoint> priceChart = oKContractAddressMessage.getPriceChart();
            if (priceChart != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (OKContractAddressMessage.PriceChartPoint priceChartPoint : priceChart) {
                    try {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(new Activity(new BigDecimal(priceChartPoint.AEQbTJ()), priceChartPoint.KWHzl()));
                    } catch (java.lang.Throwable th) {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        objM7377constructorimpl2 = null;
                    }
                    Activity activity = (Activity) objM7377constructorimpl2;
                    if (activity != null) {
                        arrayList.add(activity);
                    }
                }
                final java.util.List listAhwBna = CollectionsKt___CollectionsKt.gkJEwt(arrayList);
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                final ActionBar actionBar = new ActionBar();
                if (listAhwBna.size() >= 2) {
                    C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                    long jKWHzl = activity2.KWHzl();
                    Insets insetsOf = Insets.of(C55298xhM.copydefault(0.0f, contextAEQbTJ), C55298xhM.copydefault(0.0f, contextAEQbTJ), C55298xhM.copydefault(0.0f, contextAEQbTJ), C55298xhM.copydefault(0.0f, contextAEQbTJ));
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    C55159xeg.TaskDescription taskDescription = new C55159xeg.TaskDescription(C33512mxp.tradeRiseGraph$default(c33512mxp, contextAEQbTJ, 0.0f, 2, null), C33512mxp.tradeFallGraph$default(c33512mxp, contextAEQbTJ, 0.0f, 2, null), C55298xhM.copydefault(1.0f, contextAEQbTJ), C55298xhM.copydefault(1.0f, contextAEQbTJ));
                    c55159xeg.setConfig(new C55098xdY(contextAEQbTJ, new C55159xeg.Application(C33512mxp.tradeRiseGraph$default(c33512mxp, contextAEQbTJ, 0.0f, 2, null), C33512mxp.tradeFallGraph$default(c33512mxp, contextAEQbTJ, 0.0f, 2, null), ContextCompat.getColor(contextAEQbTJ, C55386xiv.ActionBar.KWHzl), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.ORxRYg), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.htlTjW), C33512mxp.tradeRiseGraph$default(c33512mxp, contextAEQbTJ, 0.0f, 2, null), C33512mxp.tradeFallGraph$default(c33512mxp, contextAEQbTJ, 0.0f, 2, null)), null, java.lang.Float.valueOf(0.0f), C59462zhW.KWHzl(activity2.KWHzl()), insetsOf, new C55159xeg.StateListAnimator(java.lang.Integer.valueOf(C52761wXj.LoaderManager.fARcdN), java.lang.Float.valueOf(0.0f), 0, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aBDePw))), C59462zhW.KWHzl(jKWHzl), null, null, null, null, java.lang.Boolean.FALSE, null, taskDescription, java.lang.Boolean.TRUE, 12036, null).KWHzl());
                    c55159xeg.setAdapter(actionBar);
                    Intrinsics.copydefault(c55159xeg);
                    c55159xeg.setVisibility(0);
                    objValueOf = java.lang.Boolean.valueOf(c55159xeg.post(new java.lang.Runnable() { // from class: o.nBc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            nAZ.KWHzl(actionBar, listAhwBna);
                        }
                    }));
                } else if (listAhwBna.size() == 1) {
                    Activity activity3 = (Activity) CollectionsKt___CollectionsKt.AuCTelauCTel(listAhwBna);
                    final java.util.List listGEmmrt = yDY.gEmmrt(activity3, Activity.copy$default(activity3, null, activity3.EZpvd() + ((long) 1000), 1, null));
                    C59462zhW.Activity activity4 = C59462zhW.OLrzqt;
                    long jKWHzl2 = activity4.KWHzl();
                    Insets insetsOf2 = Insets.of(C55298xhM.copydefault(0.0f, contextAEQbTJ), C55298xhM.copydefault(0.0f, contextAEQbTJ), C55298xhM.copydefault(0.0f, contextAEQbTJ), C55298xhM.copydefault(0.0f, contextAEQbTJ));
                    C55159xeg.Application application4 = new C55159xeg.Application(ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.ORxRYg), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.ORxRYg), ContextCompat.getColor(contextAEQbTJ, C55386xiv.ActionBar.KWHzl), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.ORxRYg), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.htlTjW), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.ORxRYg), ContextCompat.getColor(contextAEQbTJ, C52761wXj.Activity.ORxRYg));
                    long jKWHzl3 = activity4.KWHzl();
                    C55159xeg.StateListAnimator stateListAnimator = new C55159xeg.StateListAnimator(java.lang.Integer.valueOf(C52761wXj.LoaderManager.fARcdN), java.lang.Float.valueOf(0.0f), 0, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aBDePw)));
                    C59462zhW c59462zhWKWHzl = C59462zhW.KWHzl(jKWHzl3);
                    C59462zhW c59462zhWKWHzl2 = C59462zhW.KWHzl(jKWHzl2);
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    c55159xeg.setConfig(new C55098xdY(contextAEQbTJ, application4, null, java.lang.Float.valueOf(0.0f), c59462zhWKWHzl, insetsOf2, stateListAnimator, c59462zhWKWHzl2, null, null, null, null, bool, null, null, bool, 28420, null).KWHzl());
                    c55159xeg.setAdapter(actionBar);
                    Intrinsics.copydefault(c55159xeg);
                    c55159xeg.setVisibility(0);
                    objValueOf = java.lang.Boolean.valueOf(c55159xeg.post(new java.lang.Runnable() { // from class: o.nBe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            nAZ.copydefault(actionBar, listGEmmrt);
                        }
                    }));
                } else {
                    Intrinsics.copydefault(c55159xeg);
                    c55159xeg.setVisibility(8);
                    objValueOf = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(objValueOf);
            }
        } catch (java.lang.Throwable th2) {
            Result.Application application5 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
            Intrinsics.copydefault(c55159xeg);
            c55159xeg.setVisibility(8);
        }
    }

    public static final void KWHzl(ActionBar actionBar, java.util.List list) {
        actionBar.KWHzl(list, false);
    }

    public static final void copydefault(ActionBar actionBar, java.util.List list) {
        actionBar.KWHzl(list, false);
    }

    public final void KWHzl(AbstractC33955nMa abstractC33955nMa, OKContractAddressMessage oKContractAddressMessage, C35254nrp c35254nrp) {
        C52794wYp c52794wYp = abstractC33955nMa.copydefault;
        C33758nEt.Application applicationEZpvd = C33758nEt.copydefault.EZpvd(oKContractAddressMessage.getCtaType());
        java.lang.String strCopydefault = applicationEZpvd.copydefault();
        applicationEZpvd.KWHzl();
        c52794wYp.setText(strCopydefault);
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(C33129mqd.OLrzqt(c52794wYp.getText()) ? 0 : 8);
        C37716ozA.AEQbTJ(c52794wYp);
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, c52794wYp, oKContractAddressMessage, abstractC33955nMa, c35254nrp));
    }

    public static final class Application implements Function1<AbstractC43238rlX, Unit> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            KWHzl(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ C35254nrp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C35254nrp c35254nrp) {
            this.copydefault = c35254nrp;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "channel_id", this.copydefault.OLrzqt().getTargetId(), false, 4, null);
            java.lang.String senderUserId = this.copydefault.OLrzqt().getSenderUserId();
            EventParamsList.put$default(eventParamsList, "sender_id", senderUserId == null ? "" : senderUserId, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCJXGO));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DXXBbs));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCUTEI), new View.OnClickListener() { // from class: o.nAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nAZ.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final boolean copydefault(C35254nrp c35254nrp, ViewBinding viewBinding) {
        if (!getFieldNames()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new ContractAddressSendMessageViewProvider$handleViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKContractAddressMessage oKContractAddressMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return copydefault(c35254nrp, viewBinding);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final class ActionBar extends C55159xeg.ActionBar<Activity> {
        @Override // o.C55159xeg.ActionBar
        public float AEQbTJ() {
            return 1.0f;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        @Override // o.C55159xeg.ActionBar
        public C55170xer OLrzqt() {
            return C55170xer.Companion.copydefault();
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/xeq;)Z */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean OLrzqt(Activity activity) {
            java.lang.Object objM7377constructorimpl;
            Activity activity2;
            BigDecimal bigDecimalKWHzl;
            try {
                Result.Application application = Result.Companion;
                java.util.List<Activity> listKWHzl = KWHzl();
                boolean z = true;
                if (!listKWHzl.isEmpty() && listKWHzl.size() != 1) {
                    if ((activity != null || (activity = (Activity) CollectionsKt___CollectionsKt.wlaJM(listKWHzl)) != null) && (activity2 = (Activity) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null && (bigDecimalKWHzl = activity2.KWHzl()) != null) {
                        if (activity.KWHzl().compareTo(bigDecimalKWHzl) <= 0) {
                            z = false;
                        }
                    }
                    return true;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = java.lang.Boolean.TRUE;
            }
            return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/xeq;)Ljava/lang/String; */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.String EZpvd(@NotNull Activity activity) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(activity, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C38305pTw.formatFiatSymbol$default(activity.KWHzl(), "USD", null, null, null, null, null, 62, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = "$0.00";
            }
            return (java.lang.String) objM7377constructorimpl;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/xeq;)Ljava/lang/String; */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.String AEQbTJ(@NotNull Activity activity) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(activity, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(pTA.format$default(new Date(activity.EZpvd()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return (java.lang.String) (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : "");
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements InterfaceC55169xeq<BigDecimal> {
        public final BigDecimal KWHzl;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, BigDecimal bigDecimal, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                j = activity.OLrzqt;
            }
            return activity.copydefault(bigDecimal, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Number; */
        @Override // o.InterfaceC55169xeq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public BigDecimal KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull BigDecimal bigDecimal, long j) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return new Activity(bigDecimal, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChartDataPointImpl(value=" + this.KWHzl + ", timestamp=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull BigDecimal bigDecimal, long j) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.KWHzl = bigDecimal;
            this.OLrzqt = j;
        }
    }
}
