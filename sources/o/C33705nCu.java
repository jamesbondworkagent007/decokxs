package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.conversation.message.provider.ShareReceiveMessageViewProvider$handleViewLongClick$1;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKShareMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC37218opg;
import o.C33758nEt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33705nCu extends oAE<OKShareMessage, nMY> {
    public final int AEQbTJ = C35342ntX.AEQbTJ;
    public final int OLrzqt = C35399nuc.Dialog.DIIpTV;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKShareMessage> KWHzl() {
        return OKShareMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44111sDt, nMY>) oac, c35254nrp, (OKShareMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKShareMessage oKShareMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKShareMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + C33070mpX.AYXKKw(C35399nuc.LoaderManager.OfWYUE) + "] " + oKShareMessage.getMessagePreview();
    }

    public void KWHzl(@NotNull oAC<AbstractC44111sDt, nMY> oac, @NotNull final C35254nrp c35254nrp, @NotNull final OKShareMessage oKShareMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKShareMessage, "");
        super.copydefault(oac, c35254nrp, oKShareMessage);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("IMChat_Card_Card_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33705nCu.KWHzl(oKShareMessage, c35254nrp, (EventParamsList) obj);
            }
        });
        nMY nmy = (nMY) oac.EZpvd();
        EZpvd(nmy, oKShareMessage.getImage());
        KWHzl(nmy, c35254nrp, oKShareMessage);
        AEQbTJ(nmy, oKShareMessage);
        EZpvd(nmy, oKShareMessage, c35254nrp.OLrzqt());
        android.widget.LinearLayout linearLayout = ((nMY) oac.EZpvd()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AEQbTJ(c35254nrp, linearLayout);
    }

    public static final Unit KWHzl(OKShareMessage oKShareMessage, C35254nrp c35254nrp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("cta_name", C33758nEt.copydefault.EZpvd(oKShareMessage.getCtaType()).EZpvd(), true);
        java.lang.String bizName = oKShareMessage.getBizName();
        EventParamsList.put$default(eventParamsList, "bizline", bizName == null ? "" : bizName, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", c35254nrp.OLrzqt().getTargetId(), false, 4, null);
        java.lang.String senderUserId = c35254nrp.OLrzqt().getSenderUserId();
        EventParamsList.put$default(eventParamsList, "sender_id", senderUserId == null ? "" : senderUserId, false, 4, null);
        java.lang.String bizName2 = oKShareMessage.getBizName();
        if (bizName2 != null) {
            eventParamsList.put("bizline", bizName2, false);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(nMY nmy, OKImageMessage oKImageMessage) {
        boolean zKWHzl = KWHzl(oKImageMessage);
        android.view.View root = nmy.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        } else if (!zKWHzl) {
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(root.getContext(), "");
            int iEZpvd = yII.EZpvd(c33566myq.EZpvd(r2) * 0.65f);
            int iDp2px$default = C55298xhM.dp2px$default(280.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(210.0f, null, 1, null);
            if (iEZpvd >= iDp2px$default) {
                iEZpvd = iDp2px$default;
            } else if (iEZpvd <= iDp2px$default2) {
                iEZpvd = iDp2px$default2;
            }
            layoutParams.width = iEZpvd;
        }
        root.setLayoutParams(layoutParams);
    }

    public final void AEQbTJ(nMY nmy, OKShareMessage oKShareMessage) {
        android.widget.TextView textView = nmy.gEmmrt;
        java.lang.String tagLine = oKShareMessage.getTagLine();
        if (tagLine == null) {
            tagLine = "";
        }
        textView.setText(tagLine);
        Intrinsics.copydefault(textView);
        int i = 0;
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) oKShareMessage.getTagLine()) ? 0 : 8);
        android.widget.TextView textView2 = nmy.AhwBna;
        java.lang.String title = oKShareMessage.getTitle();
        if (title == null) {
            title = "";
        }
        textView2.setText(title);
        Intrinsics.copydefault(textView2);
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) oKShareMessage.getTitle()) ? 0 : 8);
        android.widget.TextView textView3 = nmy.djBIcL;
        java.lang.String content = oKShareMessage.getContent();
        if (content == null) {
            content = "";
        }
        textView3.setText(content);
        Intrinsics.copydefault(textView3);
        textView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) oKShareMessage.getContent()) ? 0 : 8);
        android.widget.LinearLayout linearLayout = nmy.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.widget.TextView textView4 = nmy.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        if (textView4.getVisibility() != 0) {
            android.widget.TextView textView5 = nmy.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            if (textView5.getVisibility() != 0) {
                android.widget.TextView textView6 = nmy.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                if (textView6.getVisibility() != 0) {
                    i = 8;
                }
            }
        }
        linearLayout.setVisibility(i);
    }

    public final void EZpvd(nMY nmy, OKShareMessage oKShareMessage, OKMessage oKMessage) {
        C52794wYp c52794wYp = nmy.KWHzl;
        C33758nEt.Application applicationEZpvd = C33758nEt.copydefault.EZpvd(oKShareMessage.getCtaType());
        java.lang.String strCopydefault = applicationEZpvd.copydefault();
        java.lang.String strKWHzl = applicationEZpvd.KWHzl();
        c52794wYp.setText(strCopydefault);
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(C33129mqd.OLrzqt(c52794wYp.getText()) ? 0 : 8);
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, oKShareMessage, strKWHzl, oKMessage, c52794wYp, nmy, this));
    }

    /* JADX INFO: renamed from: o.nCu$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ OKMessage OLrzqt;
        public final /* synthetic */ OKShareMessage copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.String str, OKShareMessage oKShareMessage, OKMessage oKMessage) {
            this.AEQbTJ = str;
            this.copydefault = oKShareMessage;
            this.OLrzqt = oKMessage;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("cta_name", this.AEQbTJ, true);
            java.lang.String bizName = this.copydefault.getBizName();
            EventParamsList.put$default(eventParamsList, "bizline", bizName == null ? "" : bizName, false, 4, null);
            java.util.Map<java.lang.String, java.lang.String> shareExtra = this.copydefault.getShareExtra();
            java.lang.String str = shareExtra != null ? shareExtra.get("token_label") : null;
            EventParamsList.put$default(eventParamsList, "token_label", str == null ? "" : str, false, 4, null);
            EventParamsList.put$default(eventParamsList, "chat_id", this.OLrzqt.getTargetId(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "channel_type", sNN.copydefault(this.OLrzqt.getConversationType()), false, 4, null);
            java.lang.String senderUserId = this.OLrzqt.getSenderUserId();
            EventParamsList.put$default(eventParamsList, "sender_id", senderUserId == null ? "" : senderUserId, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.nCu$TaskDescription */
    public static final class TaskDescription implements Function1<AbstractC43238rlX, Unit> {
        public static final TaskDescription KWHzl = new TaskDescription();

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

    /* JADX INFO: renamed from: o.nCu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ OKShareMessage AEQbTJ;
        public final /* synthetic */ android.view.View AYXKKw;
        public final /* synthetic */ long AhwBna;
        public final /* synthetic */ nMY EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ C52794wYp OLrzqt;
        public final /* synthetic */ OKMessage copydefault;
        public final /* synthetic */ C33705nCu djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, OKShareMessage oKShareMessage, java.lang.String str, OKMessage oKMessage, C52794wYp c52794wYp, nMY nmy, C33705nCu c33705nCu) {
            this.AYXKKw = view;
            this.AhwBna = j;
            this.AEQbTJ = oKShareMessage;
            this.KWHzl = str;
            this.copydefault = oKMessage;
            this.OLrzqt = c52794wYp;
            this.EZpvd = nmy;
            this.djBIcL = c33705nCu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AYXKKw) > this.AhwBna || (this.AYXKKw instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AYXKKw, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("IMChat_Card_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new ActionBar(this.KWHzl, this.AEQbTJ, this.copydefault));
                java.lang.String strEZpvd = C37723ozH.OLrzqt.EZpvd(this.AEQbTJ.getTag(), this.AEQbTJ.getDeeplink());
                if (strEZpvd != null) {
                    if (C34703nhO.AhwBna(this.OLrzqt.getContext())) {
                        C55326xho.toast$default("Deeplink: " + strEZpvd, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    }
                    android.content.Context contextOLrzqt = C58196ywi.OLrzqt(this.EZpvd.getRoot().getContext());
                    android.app.Activity activity = contextOLrzqt instanceof android.app.Activity ? (android.app.Activity) contextOLrzqt : null;
                    if (activity != null) {
                        oGV.processDeeplink$default(oGV.EZpvd, activity, strEZpvd, null, this.djBIcL.fIwbmz(), TaskDescription.KWHzl, 4, null);
                    }
                }
            }
        }
    }

    public final void KWHzl(final nMY nmy, final C35254nrp c35254nrp, final OKShareMessage oKShareMessage) {
        java.lang.Integer height;
        java.lang.Integer width;
        if (KWHzl(oKShareMessage.getImage())) {
            final ShapeableImageView shapeableImageView = nmy.EZpvd;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            ShapeableImageView shapeableImageView2 = nmy.EZpvd;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
            ViewGroup.LayoutParams layoutParams = shapeableImageView2.getLayoutParams();
            if (layoutParams != null) {
                nPJ npj = nPJ.OLrzqt;
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                C34059nPx c34059nPxEjfBZ = iMImageHelper.ejfBZ();
                OKImageMessage image = oKShareMessage.getImage();
                int iIntValue = (image == null || (width = image.getWidth()) == null) ? 0 : width.intValue();
                OKImageMessage image2 = oKShareMessage.getImage();
                nPB npbEZpvd = npj.EZpvd(c34059nPxEjfBZ, iIntValue, (image2 == null || (height = image2.getHeight()) == null) ? 0 : height.intValue());
                layoutParams.height = npbEZpvd.copydefault();
                int iCopydefault = npbEZpvd.copydefault();
                OKImageMessage image3 = oKShareMessage.getImage();
                java.lang.Integer height2 = image3 != null ? image3.getHeight() : null;
                int iOLrzqt = npbEZpvd.OLrzqt();
                OKImageMessage image4 = oKShareMessage.getImage();
                pUU.KWHzl("Image_height", "dimensions.height = " + iCopydefault + ", content.height = " + height2 + ", dimensions.width = " + iOLrzqt + ", content.width = " + (image4 != null ? image4.getWidth() : null));
                shapeableImageView2.setLayoutParams(layoutParams);
                OKImageMessage image5 = oKShareMessage.getImage();
                if (image5 != null) {
                    iMImageHelper.AEQbTJ(shapeableImageView, nPA.AEQbTJ(image5), iMImageHelper.ejfBZ());
                }
                shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: o.nCx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C33705nCu.OLrzqt(oKShareMessage, shapeableImageView, c35254nrp, view);
                    }
                });
                shapeableImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nCC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return C33705nCu.KWHzl(nmy, view);
                    }
                });
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        CardView cardView = nmy.copydefault;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setVisibility(KWHzl(oKShareMessage.getImage()) ? 0 : 8);
    }

    public static final void OLrzqt(OKShareMessage oKShareMessage, ShapeableImageView shapeableImageView, C35254nrp c35254nrp, android.view.View view) {
        if (oKShareMessage.getImage() != null) {
            ActivityC37218opg.Application application = ActivityC37218opg.Companion;
            android.content.Context context = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            shapeableImageView.getContext().startActivity(application.EZpvd(context, c35254nrp.OLrzqt()), application.OLrzqt(shapeableImageView, c35254nrp.OLrzqt()));
        }
    }

    public static final boolean KWHzl(nMY nmy, android.view.View view) {
        return nmy.getRoot().performLongClick();
    }

    public final boolean KWHzl(OKImageMessage oKImageMessage) {
        return (oKImageMessage != null ? oKImageMessage.getRemoteUri() : null) != null;
    }

    private final boolean EZpvd(C35254nrp c35254nrp, ViewBinding viewBinding) {
        if (!getFieldNames()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new ShareReceiveMessageViewProvider$handleViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKShareMessage oKShareMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKShareMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        return EZpvd(c35254nrp, viewBinding);
    }
}
