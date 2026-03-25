package o;

import android.view.View;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.provider.GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C37422otY;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.otY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37422otY implements InterfaceC35897oHt<SearchResultData> {
    public final Function1<SearchResultData.Message, Unit> EZpvd;
    public final Function0<java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.bean.SearchResultData$Message, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37422otY(@NotNull Function0<java.lang.String> function0, @NotNull Function1<? super SearchResultData.Message, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function0;
        this.EZpvd = function1;
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public void AEQbTJ2(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oHr, java.lang.Object, java.util.List] */
    @Override // o.InterfaceC35897oHt
    public /* bridge */ /* synthetic */ void AEQbTJ(C35895oHr c35895oHr, SearchResultData searchResultData, java.util.List list) {
        AEQbTJ2(c35895oHr, searchResultData, (java.util.List<? extends java.lang.Object>) list);
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNN nnnEZpvd = nNN.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnnEZpvd, "");
        return new Activity(this, nnnEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if ((c35895oHr instanceof Activity) && (searchResultData instanceof SearchResultData.Message)) {
            ((Activity) c35895oHr).OLrzqt((SearchResultData.Message) searchResultData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.Message;
    }

    /* JADX INFO: renamed from: o.otY$Activity */
    public final class Activity extends C35895oHr {
        public final nNN OLrzqt;
        public final /* synthetic */ C37422otY copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C37422otY c37422otY, nNN nnn) {
            super(nnn.getRoot().getContext(), nnn.getRoot());
            Intrinsics.checkNotNullParameter(nnn, "");
            this.copydefault = c37422otY;
            this.OLrzqt = nnn;
        }

        public final void OLrzqt(@NotNull final SearchResultData.Message message) {
            java.lang.String conversationTitle;
            Intrinsics.checkNotNullParameter(message, "");
            KWHzl(message);
            EZpvd(message);
            copydefault(message);
            PhoneRelationEntity phoneRelation = message.getPhoneRelation();
            android.widget.TextView textView = this.OLrzqt.gEmmrt;
            if (phoneRelation != null) {
                conversationTitle = phoneRelation.getName();
            } else {
                conversationTitle = message.getConversation().getConversationTitle();
            }
            textView.setText(conversationTitle);
            android.widget.TextView textView2 = this.OLrzqt.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView2, message.getConversation().getOfficialTagInfo(), 0, null, false, false, false, 62, null);
            android.widget.TextView textView3 = this.OLrzqt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            nDD ndd = nDD.OLrzqt;
            android.content.Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OKMessage message2 = message.getMessage();
            C55307xhV.AEQbTJ(textView3, ndd.EZpvd(context, C33129mqd.valueOf(message2 != null ? java.lang.Long.valueOf(message2.getSentTime()) : null)));
            android.view.View view = this.itemView;
            final C37422otY c37422otY = this.copydefault;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.oua
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C37422otY.Activity.OLrzqt(c37422otY, message, view2);
                }
            });
        }

        public static final void OLrzqt(C37422otY c37422otY, SearchResultData.Message message, android.view.View view) {
            c37422otY.EZpvd.invoke(message);
        }

        public final void KWHzl(SearchResultData.Message message) {
            C35893oHp c35893oHp = this.OLrzqt.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.AEQbTJ(c35893oHp, message.getConversation());
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            C35893oHp c35893oHp2 = this.OLrzqt.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            iMImageHelper.AEQbTJ(c35893oHp2, 32);
        }

        private final void EZpvd(SearchResultData.Message message) {
            OKMessage message2 = message.getMessage();
            OKTextMessage oKTextMessageObtain = null;
            OKMessageContent content = message2 != null ? message2.getContent() : null;
            if (content instanceof OKTextMessage) {
                oKTextMessageObtain = (OKTextMessage) content;
            } else if (content instanceof OKReferenceMessage) {
                oKTextMessageObtain = OKTextMessage.CREATOR.obtain(((OKReferenceMessage) content).getContent());
            }
            C37730ozO.OLrzqt.AEQbTJ(this, new GlobalSearchResultMessageProvider$SearchResultItemViewHolder$handleContent$1(message, this, oKTextMessageObtain, this.copydefault, null));
        }

        public final void copydefault(SearchResultData.Message message) {
            OKConversation conversation = message.getConversation();
            android.widget.ImageView imageView = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.Integer groupEntityType = conversation.getGroupEntityType();
            imageView.setVisibility((groupEntityType != null && groupEntityType.intValue() == 12) ? 0 : 8);
        }
    }
}
