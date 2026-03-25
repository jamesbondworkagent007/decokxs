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
import com.okinc.im.imui.conversation.message.provider.ContractAddressReceiveMessageViewProvider$handleViewLongClick$1;
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
public final class nAO extends oAE<OKContractAddressMessage, nLY> {
    public final int OLrzqt = C35342ntX.AEQbTJ;
    public final int KWHzl = C35399nuc.Dialog.iPSTqm;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nAV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(nAO.djBIcL());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKContractAddressMessage> KWHzl() {
        return OKContractAddressMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        AEQbTJ((oAC<AbstractC44111sDt, nLY>) oac, c35254nrp, (OKContractAddressMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.OLrzqt);
    }

    public final boolean AYXKKw() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean djBIcL() {
        return C33758nEt.copydefault.copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKContractAddressMessage oKContractAddressMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.OfWYUE);
        java.lang.String tokenSymbol = oKContractAddressMessage.getTokenSymbol();
        return "[" + strAYXKKw + "] " + (tokenSymbol != null ? tokenSymbol : "");
    }

    public void AEQbTJ(@NotNull oAC<AbstractC44111sDt, nLY> oac, @NotNull final C35254nrp c35254nrp, @NotNull final OKContractAddressMessage oKContractAddressMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        super.copydefault(oac, c35254nrp, oKContractAddressMessage);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Card_Card_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nAO.copydefault(oKContractAddressMessage, c35254nrp, (EventParamsList) obj);
            }
        });
        nLY nly = (nLY) oac.EZpvd();
        OLrzqt(nly);
        EZpvd(nly, oKContractAddressMessage);
        copydefault(nly, oKContractAddressMessage);
        copydefault(nly, oKContractAddressMessage, c35254nrp);
        android.widget.LinearLayout linearLayout = ((nLY) oac.EZpvd()).values;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AEQbTJ(c35254nrp, linearLayout);
    }

    public static final Unit copydefault(OKContractAddressMessage oKContractAddressMessage, C35254nrp c35254nrp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String bizName = oKContractAddressMessage.getBizName();
        EventParamsList.put$default(eventParamsList, "bizline", bizName == null ? "" : bizName, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", c35254nrp.OLrzqt().getTargetId(), false, 4, null);
        java.lang.String senderUserId = c35254nrp.OLrzqt().getSenderUserId();
        EventParamsList.put$default(eventParamsList, "sender_id", senderUserId == null ? "" : senderUserId, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(nLY nly) {
        android.view.View root = nly.getRoot();
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

    public final void EZpvd(nLY nly, final OKContractAddressMessage oKContractAddressMessage) {
        java.lang.String tokenLogo = oKContractAddressMessage.getTokenLogo();
        if (tokenLogo != null && tokenLogo.length() != 0) {
            Intrinsics.copydefault(Glide.AEQbTJ(nly.fJNWhG.getContext()).EZpvd(oKContractAddressMessage.getTokenLogo()).KWHzl(C52761wXj.TaskDescription.vLaW).copydefault(C52761wXj.TaskDescription.vLaW).gEmmrt().EZpvd(nly.fJNWhG));
        } else {
            nly.fJNWhG.setImageResource(C52761wXj.TaskDescription.vLaW);
        }
        java.lang.String chainLogo = oKContractAddressMessage.getChainLogo();
        if (chainLogo != null && chainLogo.length() != 0) {
            Intrinsics.copydefault(Glide.AEQbTJ(nly.gEmmrt.getContext()).EZpvd(oKContractAddressMessage.getChainLogo()).KWHzl(C52761wXj.TaskDescription.RSDDiY).copydefault(C52761wXj.TaskDescription.RSDDiY).gEmmrt().EZpvd(nly.gEmmrt));
        } else {
            nly.gEmmrt.setImageResource(C52761wXj.TaskDescription.RSDDiY);
        }
        android.widget.TextView textView = nly.iwGUEr;
        java.lang.String tokenSymbol = oKContractAddressMessage.getTokenSymbol();
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        textView.setText(tokenSymbol);
        java.lang.String contractAddress = oKContractAddressMessage.getContractAddress();
        java.lang.String address$default = contractAddress != null ? sSQ.formatAddress$default(sSQ.KWHzl, contractAddress, 4, 4, null, 4, null) : null;
        android.widget.TextView textView2 = nly.ejfBZ;
        if (address$default == null) {
            address$default = "";
        }
        textView2.setText(address$default);
        nly.djBIcL.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.RIuxYh, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, "1"))));
        java.util.List<ConversationIcon> icons = oKContractAddressMessage.getIcons();
        if (icons != null && !icons.isEmpty()) {
            oIV oiv = nly.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(oiv, "");
            oiv.setVisibility(0);
            oIV.setIcons$default(nly.AYXKKw, oKContractAddressMessage.getIcons(), false, true, false, 10, null);
        } else {
            oIV oiv2 = nly.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(oiv2, "");
            oiv2.setVisibility(8);
        }
        C55251xgS c55251xgS = nly.fARcdN;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(Intrinsics.EZpvd(oKContractAddressMessage.isDexListed(), java.lang.Boolean.TRUE) ? 0 : 8);
        nly.fARcdN.setBgColor(C33070mpX.copydefault(C52761wXj.Activity.GFUIi));
        nly.fARcdN.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        nly.fARcdN.setTextSize(10.0f);
        Function0 function0 = new Function0() { // from class: o.nAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nAO.AEQbTJ(oKContractAddressMessage);
            }
        };
        android.widget.ImageView imageView = nly.copydefault;
        imageView.setOnClickListener(new Dialog(imageView, 1000L, function0));
        android.widget.TextView textView3 = nly.ejfBZ;
        textView3.setOnClickListener(new FragmentManager(textView3, 1000L, function0));
        android.widget.ImageView imageView2 = nly.AuCTel;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(AYXKKw() ? 0 : 8);
        android.widget.ImageView imageView3 = nly.AuCTel;
        imageView3.setOnClickListener(new PendingIntent(imageView3, 1000L, this, oKContractAddressMessage, nly));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ OKContractAddressMessage EZpvd;
        public final /* synthetic */ C35254nrp KWHzl;
        public final /* synthetic */ nLY OLrzqt;
        public final /* synthetic */ C52794wYp copydefault;
        public final /* synthetic */ nAO djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, nAO nao, C52794wYp c52794wYp, OKContractAddressMessage oKContractAddressMessage, nLY nly, C35254nrp c35254nrp) {
            this.AEQbTJ = view;
            this.AYXKKw = j;
            this.djBIcL = nao;
            this.copydefault = c52794wYp;
            this.EZpvd = oKContractAddressMessage;
            this.OLrzqt = nly;
            this.KWHzl = c35254nrp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.AYXKKw || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.AEQbTJ;
                if (!C33758nEt.copydefault.OLrzqt()) {
                    nAO nao = this.djBIcL;
                    android.content.Context context = this.copydefault.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    nao.AEQbTJ(context);
                    return;
                }
                if (C34703nhO.AhwBna(this.copydefault.getContext())) {
                    C55326xho.toast$default("Deeplink: " + c52794wYp, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
                java.lang.String deeplinkForCA$default = sSQ.getDeeplinkForCA$default(sSQ.KWHzl, this.djBIcL.AYXKKw(), this.EZpvd, false, 4, null);
                oGV ogv = oGV.EZpvd;
                android.content.Context context2 = this.OLrzqt.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                oGV.processDeeplink$default(ogv, context2, deeplinkForCA$default, null, this.djBIcL.fIwbmz(), Application.AEQbTJ, 4, null);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("IMChat_Card_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new ActionBar(this.KWHzl));
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ OKContractAddressMessage KWHzl;
        public final /* synthetic */ nAO OLrzqt;
        public final /* synthetic */ nLY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, nAO nao, OKContractAddressMessage oKContractAddressMessage, nLY nly) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = nao;
            this.KWHzl = oKContractAddressMessage;
            this.copydefault = nly;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.lang.String strEZpvd = sSQ.KWHzl.EZpvd(this.OLrzqt.AYXKKw(), this.KWHzl, true);
                oGV ogv = oGV.EZpvd;
                android.content.Context context = this.copydefault.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                oGV.processDeeplink$default(ogv, context, strEZpvd, null, this.OLrzqt.fIwbmz(), Fragment.OLrzqt, 4, null);
            }
        }
    }

    public static final Unit AEQbTJ(OKContractAddressMessage oKContractAddressMessage) {
        sSQ ssq = sSQ.KWHzl;
        java.lang.String contractAddress = oKContractAddressMessage.getContractAddress();
        if (contractAddress == null) {
            contractAddress = "";
        }
        ssq.gEmmrt(contractAddress);
        C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.zzQwtT, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final class Fragment implements Function1<AbstractC43238rlX, Unit> {
        public static final Fragment OLrzqt = new Fragment();

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

    public final void copydefault(nLY nly, OKContractAddressMessage oKContractAddressMessage) {
        java.lang.String fiatSymbolWithSubscriptStyle$default;
        java.lang.String iCUPercent$default;
        int color;
        java.lang.Double dAuCTel;
        android.widget.TextView textView = nly.getFieldNames;
        java.lang.Double currentPrice = oKContractAddressMessage.getCurrentPrice();
        if (currentPrice == null || (fiatSymbolWithSubscriptStyle$default = C38305pTw.formatFiatSymbolWithSubscriptStyle$default(currentPrice, "USD", null, C38307pTy.Companion.copydefault(1, 5), null, null, 26, null)) == null) {
            fiatSymbolWithSubscriptStyle$default = "$0.00";
        }
        textView.setText(fiatSymbolWithSubscriptStyle$default);
        android.widget.TextView textView2 = nly.EZpvd;
        if (Intrinsics.EZpvd(oKContractAddressMessage.getChange1h(), AudioStats.AUDIO_AMPLITUDE_NONE)) {
            iCUPercent$default = "-";
        } else {
            java.lang.Double change1h = oKContractAddressMessage.getChange1h();
            iCUPercent$default = change1h != null ? pTB.formatICUPercent$default(change1h, null, null, DisplaySign.EXCEPT_ZERO, null, null, 27, null) : null;
        }
        textView2.setText(iCUPercent$default);
        if (C33512mxp.AEQbTJ.isConnected() == 0) {
            java.lang.Double change1h2 = oKContractAddressMessage.getChange1h();
            if ((change1h2 != null ? change1h2.doubleValue() : 0.0d) < AudioStats.AUDIO_AMPLITUDE_NONE) {
                int i = C52761wXj.ActionBar.OuxcSI;
                android.content.Context context = nly.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                color = C55366xib.KWHzl(i, context);
            } else {
                java.lang.Double change1h3 = oKContractAddressMessage.getChange1h();
                if ((change1h3 != null ? change1h3.doubleValue() : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    int i2 = C52761wXj.ActionBar.DCUTEI;
                    android.content.Context context2 = nly.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    color = C55366xib.KWHzl(i2, context2);
                } else {
                    color = ContextCompat.getColor(nly.getRoot().getContext(), C52761wXj.Activity.aUsmxb);
                }
            }
        } else {
            java.lang.Double change1h4 = oKContractAddressMessage.getChange1h();
            if ((change1h4 != null ? change1h4.doubleValue() : 0.0d) < AudioStats.AUDIO_AMPLITUDE_NONE) {
                int i3 = C52761wXj.ActionBar.DCUTEI;
                android.content.Context context3 = nly.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                color = C55366xib.KWHzl(i3, context3);
            } else {
                java.lang.Double change1h5 = oKContractAddressMessage.getChange1h();
                if ((change1h5 != null ? change1h5.doubleValue() : 0.0d) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    int i4 = C52761wXj.ActionBar.OuxcSI;
                    android.content.Context context4 = nly.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    color = C55366xib.KWHzl(i4, context4);
                } else {
                    color = ContextCompat.getColor(nly.getRoot().getContext(), C52761wXj.Activity.aUsmxb);
                }
            }
        }
        nly.EZpvd.setTextColor(color);
        android.widget.TextView textView3 = nly.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        java.lang.String marketCap = oKContractAddressMessage.getMarketCap();
        textView3.setVisibility((marketCap == null || marketCap.length() == 0) ^ true ? 0 : 8);
        java.lang.String marketCap2 = oKContractAddressMessage.getMarketCap();
        if (marketCap2 != null && (dAuCTel = C59443zhD.AuCTel(marketCap2)) != null) {
            nly.AkhnZx.setText(C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(dAuCTel.doubleValue()), "USD", null, C38307pTy.Companion.EZpvd(2), null, Notation.COMPACT_SHORT, null, 42, null));
        }
        OLrzqt(nly, oKContractAddressMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x02de, TryCatch #1 {all -> 0x02de, blocks: (B:3:0x0004, B:5:0x000d, B:6:0x0016, B:8:0x001c, B:13:0x0046, B:16:0x004d, B:18:0x0051, B:12:0x003c, B:19:0x0055, B:22:0x005f, B:25:0x0070, B:30:0x02d9, B:26:0x01a9, B:28:0x01b0, B:29:0x02cf, B:21:0x005b, B:9:0x0022), top: B:40:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(nLY nly, OKContractAddressMessage oKContractAddressMessage) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objValueOf;
        java.lang.Object objM7377constructorimpl2;
        C55159xeg c55159xeg = nly.OLrzqt;
        try {
            Result.Application application = Result.Companion;
            java.util.List<OKContractAddressMessage.PriceChartPoint> priceChart = oKContractAddressMessage.getPriceChart();
            if (priceChart != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (OKContractAddressMessage.PriceChartPoint priceChartPoint : priceChart) {
                    try {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(new TaskDescription(new BigDecimal(priceChartPoint.AEQbTJ()), priceChartPoint.KWHzl()));
                    } catch (java.lang.Throwable th) {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        objM7377constructorimpl2 = null;
                    }
                    TaskDescription taskDescription = (TaskDescription) objM7377constructorimpl2;
                    if (taskDescription != null) {
                        arrayList.add(taskDescription);
                    }
                }
                final java.util.List listAhwBna = CollectionsKt___CollectionsKt.gkJEwt(arrayList);
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                final StateListAnimator stateListAnimator = new StateListAnimator();
                if (listAhwBna.size() >= 2) {
                    android.content.Context context = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C59462zhW.Activity activity = C59462zhW.OLrzqt;
                    long jKWHzl = activity.KWHzl();
                    android.content.Context context2 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    int iCopydefault = C55298xhM.copydefault(0.0f, context2);
                    android.content.Context context3 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    int iCopydefault2 = C55298xhM.copydefault(0.0f, context3);
                    android.content.Context context4 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    int iCopydefault3 = C55298xhM.copydefault(0.0f, context4);
                    android.content.Context context5 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    Insets insetsOf = Insets.of(iCopydefault, iCopydefault2, iCopydefault3, C55298xhM.copydefault(0.0f, context5));
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    android.content.Context context6 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context6, 0.0f, 2, null);
                    android.content.Context context7 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context7, 0.0f, 2, null);
                    android.content.Context context8 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "");
                    int iCopydefault4 = C55298xhM.copydefault(1.0f, context8);
                    android.content.Context context9 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    C55159xeg.TaskDescription taskDescription2 = new C55159xeg.TaskDescription(iTradeRiseGraph$default, iTradeFallGraph$default, iCopydefault4, C55298xhM.copydefault(1.0f, context9));
                    android.content.Context context10 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "");
                    int iTradeRiseGraph$default2 = C33512mxp.tradeRiseGraph$default(c33512mxp, context10, 0.0f, 2, null);
                    android.content.Context context11 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context11, "");
                    int iTradeFallGraph$default2 = C33512mxp.tradeFallGraph$default(c33512mxp, context11, 0.0f, 2, null);
                    int color = ContextCompat.getColor(c55159xeg.getContext(), C55386xiv.ActionBar.KWHzl);
                    int color2 = ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.ORxRYg);
                    int color3 = ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.htlTjW);
                    android.content.Context context12 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context12, "");
                    int iTradeRiseGraph$default3 = C33512mxp.tradeRiseGraph$default(c33512mxp, context12, 0.0f, 2, null);
                    android.content.Context context13 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context13, "");
                    c55159xeg.setConfig(new C55098xdY(context, new C55159xeg.Application(iTradeRiseGraph$default2, iTradeFallGraph$default2, color, color2, color3, iTradeRiseGraph$default3, C33512mxp.tradeFallGraph$default(c33512mxp, context13, 0.0f, 2, null)), null, java.lang.Float.valueOf(0.0f), C59462zhW.KWHzl(activity.KWHzl()), insetsOf, new C55159xeg.StateListAnimator(java.lang.Integer.valueOf(C52761wXj.LoaderManager.fARcdN), java.lang.Float.valueOf(0.0f), 0, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aBDePw))), C59462zhW.KWHzl(jKWHzl), null, null, null, null, java.lang.Boolean.FALSE, null, taskDescription2, java.lang.Boolean.TRUE, 12036, null).KWHzl());
                    c55159xeg.setAdapter(stateListAnimator);
                    Intrinsics.copydefault(c55159xeg);
                    c55159xeg.setVisibility(0);
                    objValueOf = java.lang.Boolean.valueOf(c55159xeg.post(new java.lang.Runnable() { // from class: o.nAR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            nAO.KWHzl(stateListAnimator, listAhwBna);
                        }
                    }));
                } else if (listAhwBna.size() == 1) {
                    TaskDescription taskDescription3 = (TaskDescription) CollectionsKt___CollectionsKt.AuCTelauCTel(listAhwBna);
                    final java.util.List listGEmmrt = yDY.gEmmrt(taskDescription3, TaskDescription.copy$default(taskDescription3, null, taskDescription3.AEQbTJ() + ((long) 1000), 1, null));
                    android.content.Context context14 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context14, "");
                    C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                    long jKWHzl2 = activity2.KWHzl();
                    android.content.Context context15 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context15, "");
                    int iCopydefault5 = C55298xhM.copydefault(0.0f, context15);
                    android.content.Context context16 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context16, "");
                    int iCopydefault6 = C55298xhM.copydefault(0.0f, context16);
                    android.content.Context context17 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context17, "");
                    int iCopydefault7 = C55298xhM.copydefault(0.0f, context17);
                    android.content.Context context18 = c55159xeg.getContext();
                    Intrinsics.checkNotNullExpressionValue(context18, "");
                    Insets insetsOf2 = Insets.of(iCopydefault5, iCopydefault6, iCopydefault7, C55298xhM.copydefault(0.0f, context18));
                    C55159xeg.Application application4 = new C55159xeg.Application(ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.ORxRYg), ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.ORxRYg), ContextCompat.getColor(c55159xeg.getContext(), C55386xiv.ActionBar.KWHzl), ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.ORxRYg), ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.htlTjW), ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.ORxRYg), ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.ORxRYg));
                    long jKWHzl3 = activity2.KWHzl();
                    C55159xeg.StateListAnimator stateListAnimator2 = new C55159xeg.StateListAnimator(java.lang.Integer.valueOf(C52761wXj.LoaderManager.fARcdN), java.lang.Float.valueOf(0.0f), 0, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aBDePw)));
                    C59462zhW c59462zhWKWHzl = C59462zhW.KWHzl(jKWHzl3);
                    C59462zhW c59462zhWKWHzl2 = C59462zhW.KWHzl(jKWHzl2);
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    c55159xeg.setConfig(new C55098xdY(context14, application4, null, java.lang.Float.valueOf(0.0f), c59462zhWKWHzl, insetsOf2, stateListAnimator2, c59462zhWKWHzl2, null, null, null, null, bool, null, null, bool, 28420, null).KWHzl());
                    c55159xeg.setAdapter(stateListAnimator);
                    Intrinsics.copydefault(c55159xeg);
                    c55159xeg.setVisibility(0);
                    objValueOf = java.lang.Boolean.valueOf(c55159xeg.post(new java.lang.Runnable() { // from class: o.nAT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            nAO.copydefault(stateListAnimator, listGEmmrt);
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

    public static final void KWHzl(StateListAnimator stateListAnimator, java.util.List list) {
        stateListAnimator.KWHzl(list, false);
    }

    public static final void copydefault(StateListAnimator stateListAnimator, java.util.List list) {
        stateListAnimator.KWHzl(list, false);
    }

    public final void copydefault(nLY nly, OKContractAddressMessage oKContractAddressMessage, C35254nrp c35254nrp) {
        C52794wYp c52794wYp = nly.KWHzl;
        C33758nEt.Application applicationEZpvd = C33758nEt.copydefault.EZpvd(oKContractAddressMessage.getCtaType());
        java.lang.String strCopydefault = applicationEZpvd.copydefault();
        applicationEZpvd.KWHzl();
        c52794wYp.setText(strCopydefault);
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(C33129mqd.OLrzqt(c52794wYp.getText()) ? 0 : 8);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, c52794wYp, oKContractAddressMessage, nly, c35254nrp));
    }

    public static final class Application implements Function1<AbstractC43238rlX, Unit> {
        public static final Application AEQbTJ = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            EZpvd(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ C35254nrp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C35254nrp c35254nrp) {
            this.OLrzqt = c35254nrp;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "channel_id", this.OLrzqt.OLrzqt().getTargetId(), false, 4, null);
            java.lang.String senderUserId = this.OLrzqt.OLrzqt().getSenderUserId();
            EventParamsList.put$default(eventParamsList, "sender_id", senderUserId == null ? "" : senderUserId, false, 4, null);
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCJXGO));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DXXBbs));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCUTEI), new View.OnClickListener() { // from class: o.nAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nAO.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean copydefault(C35254nrp c35254nrp, ViewBinding viewBinding) {
        if (!getFieldNames()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new ContractAddressReceiveMessageViewProvider$handleViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKContractAddressMessage oKContractAddressMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return copydefault(c35254nrp, viewBinding);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final class StateListAnimator extends C55159xeg.ActionBar<TaskDescription> {
        @Override // o.C55159xeg.ActionBar
        public float AEQbTJ() {
            return 1.0f;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        @Override // o.C55159xeg.ActionBar
        public C55170xer OLrzqt() {
            return C55170xer.Companion.copydefault();
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/xeq;)Z */
        @Override // o.C55159xeg.ActionBar
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean OLrzqt(TaskDescription taskDescription) {
            java.lang.Object objM7377constructorimpl;
            TaskDescription taskDescription2;
            BigDecimal bigDecimalKWHzl;
            try {
                Result.Application application = Result.Companion;
                java.util.List<TaskDescription> listKWHzl = KWHzl();
                boolean z = true;
                if (!listKWHzl.isEmpty() && listKWHzl.size() != 1) {
                    if ((taskDescription != null || (taskDescription = (TaskDescription) CollectionsKt___CollectionsKt.wlaJM(listKWHzl)) != null) && (taskDescription2 = (TaskDescription) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null && (bigDecimalKWHzl = taskDescription2.KWHzl()) != null) {
                        if (taskDescription.KWHzl().compareTo(bigDecimalKWHzl) <= 0) {
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
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.lang.String EZpvd(@NotNull TaskDescription taskDescription) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C38305pTw.formatFiatSymbol$default(taskDescription.KWHzl(), "USD", null, null, null, null, null, 62, null));
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
        public java.lang.String AEQbTJ(@NotNull TaskDescription taskDescription) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(pTA.format$default(new Date(taskDescription.AEQbTJ()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return (java.lang.String) (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : "");
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements InterfaceC55169xeq<BigDecimal> {
        public final BigDecimal KWHzl;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, BigDecimal bigDecimal, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                j = taskDescription.OLrzqt;
            }
            return taskDescription.copydefault(bigDecimal, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Number; */
        @Override // o.InterfaceC55169xeq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public BigDecimal KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull BigDecimal bigDecimal, long j) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return new TaskDescription(bigDecimal, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChartDataPointImpl(value=" + this.KWHzl + ", timestamp=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull BigDecimal bigDecimal, long j) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.KWHzl = bigDecimal;
            this.OLrzqt = j;
        }
    }
}
