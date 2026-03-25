package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.provider.ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1;
import com.okinc.im.imui.search.provider.ConversationSearchResultMessageProvider$launchAsync$job$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C37417otT;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.otT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37417otT implements InterfaceC35897oHt<SearchResultData> {
    public final Function1<SearchResultData.Message, Unit> EZpvd;
    public final Function0<java.lang.String> KWHzl;
    public final LifecycleOwner OLrzqt;
    public java.util.HashMap<java.lang.Integer, Job> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.bean.SearchResultData$Message, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37417otT(@NotNull Function0<java.lang.String> function0, @NotNull Function1<? super SearchResultData.Message, Unit> function1, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.KWHzl = function0;
        this.EZpvd = function1;
        this.OLrzqt = lifecycleOwner;
        this.copydefault = new java.util.HashMap<>();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    public final Job OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), sDN.copydefault.copydefault(), null, new ConversationSearchResultMessageProvider$launchAsync$job$1(function2, null), 2, null);
        this.copydefault.put(java.lang.Integer.valueOf(viewHolder.getBindingAdapterPosition()), jobLaunch$default);
        return jobLaunch$default;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNN nnnEZpvd = nNN.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnnEZpvd, "");
        return new TaskDescription(this, nnnEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if ((c35895oHr instanceof TaskDescription) && (searchResultData instanceof SearchResultData.Message)) {
            ((TaskDescription) c35895oHr).copydefault((SearchResultData.Message) searchResultData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.Message;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        Job job = this.copydefault.get(java.lang.Integer.valueOf(c35895oHr.getBindingAdapterPosition()));
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.otT$TaskDescription */
    public final class TaskDescription extends C35895oHr {
        public final /* synthetic */ C37417otT AEQbTJ;
        public final nNN OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37417otT c37417otT, nNN nnn) {
            super(nnn.getRoot().getContext(), nnn.getRoot());
            Intrinsics.checkNotNullParameter(nnn, "");
            this.AEQbTJ = c37417otT;
            this.OLrzqt = nnn;
        }

        public final void copydefault(@NotNull final SearchResultData.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            PhoneRelationEntity phoneRelation = message.getPhoneRelation();
            boolean zAEQbTJ = C44170sFx.AEQbTJ(message.getConversation());
            if (phoneRelation != null) {
                this.OLrzqt.gEmmrt.setText(phoneRelation.getName());
            } else {
                this.AEQbTJ.OLrzqt(this, new ConversationSearchResultMessageProvider$SearchResultItemViewHolder$bind$1(message, this, zAEQbTJ, null));
            }
            AEQbTJ(message);
            android.widget.TextView textView = this.OLrzqt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            nDD ndd = nDD.OLrzqt;
            android.content.Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OKMessage message2 = message.getMessage();
            C55307xhV.AEQbTJ(textView, ndd.EZpvd(context, C33129mqd.valueOf(message2 != null ? java.lang.Long.valueOf(message2.getSentTime()) : null)));
            android.view.View view = this.itemView;
            final C37417otT c37417otT = this.AEQbTJ;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.otZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C37417otT.TaskDescription.OLrzqt(c37417otT, message, view2);
                }
            });
        }

        public static final void OLrzqt(C37417otT c37417otT, SearchResultData.Message message, android.view.View view) {
            c37417otT.EZpvd.invoke(message);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.oqC.handleKeywordHighlight$default(o.oqC, androidx.recyclerview.widget.RecyclerView$ViewHolder, android.widget.TextView, java.lang.String, java.lang.String, boolean, int, java.lang.Object):void */
        public final void AEQbTJ(SearchResultData.Message message) {
            OKTextMessage oKTextMessageObtain;
            OKMessage message2 = message.getMessage();
            OKMessageContent content = message2 != null ? message2.getContent() : null;
            if (content instanceof OKTextMessage) {
                oKTextMessageObtain = (OKTextMessage) content;
            } else {
                oKTextMessageObtain = content instanceof OKReferenceMessage ? OKTextMessage.CREATOR.obtain(((OKReferenceMessage) content).getContent()) : null;
            }
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            android.widget.TextView textView = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C37241oqC.handleKeywordHighlight$default(c37241oqC, this, textView, java.lang.String.valueOf(oKTextMessageObtain != null ? oKTextMessageObtain.getAliasedContent() : null), (java.lang.String) this.AEQbTJ.KWHzl.invoke(), false, 16, null);
        }

        public final void KWHzl(C44461sQr c44461sQr) {
            C35893oHp c35893oHp = this.OLrzqt.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.AEQbTJ(c35893oHp, c44461sQr);
        }
    }
}
