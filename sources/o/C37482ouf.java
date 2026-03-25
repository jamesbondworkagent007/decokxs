package o;

import android.view.View;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.provider.SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C37482ouf;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ouf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37482ouf implements InterfaceC35897oHt<SearchResultData> {
    public final Function0<java.lang.String> AEQbTJ;
    public final Function1<SearchResultData.GroupResult, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.bean.SearchResultData$GroupResult, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37482ouf(@NotNull Function0<java.lang.String> function0, @NotNull Function1<? super SearchResultData.GroupResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function0;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNM nnmKWHzl = nNM.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnmKWHzl, "");
        return new ActionBar(this, nnmKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if ((c35895oHr instanceof ActionBar) && (searchResultData instanceof SearchResultData.GroupResult)) {
            ((ActionBar) c35895oHr).AEQbTJ((SearchResultData.GroupResult) searchResultData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.GroupResult;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if (c35895oHr instanceof ActionBar) {
            ((ActionBar) c35895oHr).AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.ouf$ActionBar */
    public final class ActionBar extends C35895oHr {
        public final /* synthetic */ C37482ouf AEQbTJ;
        public final nNM EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C37482ouf c37482ouf, nNM nnm) {
            super(nnm.getRoot().getContext(), nnm.getRoot());
            Intrinsics.checkNotNullParameter(nnm, "");
            this.AEQbTJ = c37482ouf;
            this.EZpvd = nnm;
        }

        public final void AEQbTJ(@NotNull final SearchResultData.GroupResult groupResult) {
            Intrinsics.checkNotNullParameter(groupResult, "");
            KWHzl(groupResult);
            copydefault(groupResult);
            OLrzqt(groupResult);
            EZpvd(groupResult);
            android.widget.TextView textView = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            OKConversation conversation = groupResult.getConversation();
            C37716ozA.updateTagViewWithTagInfo$default(textView, conversation != null ? conversation.getOfficialTagInfo() : null, 0, null, false, false, false, 62, null);
            android.view.View view = this.itemView;
            final C37482ouf c37482ouf = this.AEQbTJ;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.ouh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C37482ouf.ActionBar.AEQbTJ(c37482ouf, groupResult, view2);
                }
            });
        }

        public static final void AEQbTJ(C37482ouf c37482ouf, SearchResultData.GroupResult groupResult, android.view.View view) {
            c37482ouf.copydefault.invoke(groupResult);
        }

        public final void KWHzl(SearchResultData.GroupResult groupResult) {
            OKConversation conversation = groupResult.getConversation();
            if (conversation != null) {
                C35893oHp c35893oHp = this.EZpvd.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                c35893oHp.setVisibility(0);
                C35893oHp c35893oHp2 = this.EZpvd.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
                C35891oHn.AEQbTJ(c35893oHp2, conversation);
            }
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            C35893oHp c35893oHp3 = this.EZpvd.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp3, "");
            iMImageHelper.AEQbTJ(c35893oHp3, 32);
        }

        public final void copydefault(SearchResultData.GroupResult groupResult) {
            java.lang.String conversationTitle;
            OKConversation conversation = groupResult.getConversation();
            if (conversation == null || (conversationTitle = conversation.getConversationTitle()) == null) {
                conversationTitle = "";
            }
            C37730ozO.OLrzqt.AEQbTJ(this, new SearchResultGroupProvider$SearchResultGroupViewHolder$handleTitle$1(this, conversationTitle, this.AEQbTJ, null));
        }

        public final void OLrzqt(SearchResultData.GroupResult groupResult) {
            java.lang.String groupName;
            java.lang.String bizGroupName;
            OKConversation conversation = groupResult.getConversation();
            java.lang.String str = (conversation == null || (groupName = conversation.getGroupName()) == null || (bizGroupName = conversation.getBizGroupName()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizGroupName) || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) groupName) ^ true)) ? null : groupName;
            if (str == null) {
                android.widget.TextView textView = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                C55307xhV.AEQbTJ(textView, null);
                return;
            }
            android.widget.TextView textView2 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView3 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView3, str, (java.lang.String) this.AEQbTJ.AEQbTJ.invoke(), false, 16, null);
        }

        public final void EZpvd(SearchResultData.GroupResult groupResult) {
            java.lang.Integer groupEntityType;
            OKConversation conversation = groupResult.getConversation();
            android.widget.ImageView imageView = this.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility((conversation == null || (groupEntityType = conversation.getGroupEntityType()) == null || groupEntityType.intValue() != 12) ? 8 : 0);
        }

        public final void AEQbTJ() {
            android.widget.TextView textView = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, null);
        }
    }
}
