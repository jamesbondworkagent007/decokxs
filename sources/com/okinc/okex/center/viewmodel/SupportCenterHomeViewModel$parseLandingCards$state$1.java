package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.okex.center.bean.ContactInfoBean;
import com.okinc.okex.center.bean.DisplayControl;
import com.okinc.okex.center.bean.PopupAnnouncementInfoBean;
import com.okinc.okex.center.bean.PopupAnnouncements;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.SupportLandingResponse;
import com.okinc.okex.center.bean.TollFreeCallBean;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.RecommendSection;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C44854sel;
import o.C45065sik;
import o.C45067sim;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel$parseLandingCards$state$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SupportCenterHomeViewModel.StateListAnimator.Activity>, Object> {
    final /* synthetic */ SupportLandingResponse $cards;
    int label;
    final /* synthetic */ SupportCenterHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterHomeViewModel$parseLandingCards$state$1(SupportLandingResponse supportLandingResponse, SupportCenterHomeViewModel supportCenterHomeViewModel, Continuation<? super SupportCenterHomeViewModel$parseLandingCards$state$1> continuation) {
        super(2, continuation);
        this.$cards = supportLandingResponse;
        this.this$0 = supportCenterHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportCenterHomeViewModel$parseLandingCards$state$1(this.$cards, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SupportCenterHomeViewModel.StateListAnimator.Activity> continuation) {
        return ((SupportCenterHomeViewModel$parseLandingCards$state$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChatbotEntryDisplayModel chatbotEntryDisplayModelCopy$default;
        PopupAnnouncementInfoBean popupAnnouncementInfoBean;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            DisplayControl displayControl = this.$cards.getDisplayControl();
            List<RecommendCardDisplayModel.CommonDisplayModel> listKWHzl = this.this$0.KWHzl(displayControl, this.$cards.getRecommendationCards());
            Pair<Boolean, Integer> pairKWHzl = this.this$0.KWHzl(displayControl, this.$cards.getRecentActivities());
            List<TopicListItem> listOLrzqt = this.this$0.OLrzqt(displayControl, this.$cards.getTopTopics());
            SupportCenterHomeViewModel supportCenterHomeViewModel = this.this$0;
            SelfServiceTools selfServiceTools = this.$cards.getSelfServiceTools();
            List<SelfServiceDisplayModel> listOLrzqt2 = supportCenterHomeViewModel.OLrzqt(displayControl, selfServiceTools != null ? selfServiceTools.getList() : null);
            boolean zOLrzqt = C44854sel.OLrzqt(displayControl, RecommendSection.SEARCH_BAR);
            SavedStateHandle savedStateHandle = this.this$0.AhwBna;
            TollFreeCallBean contactUs = this.$cards.getContactUs();
            savedStateHandle.set("KEY_TOLL_FREE_NUMBER", contactUs != null ? contactUs.getPhoneNumber() : null);
            boolean zFARcdN = StringsKt__StringsKt.fARcdN((CharSequence) this.this$0.gEmmrt());
            ContactInfoBean contactInformation = this.$cards.getContactInformation();
            ChatbotEntryDisplayModel chatbotEntryDisplayModelAEQbTJ = contactInformation != null ? C45067sim.AEQbTJ(contactInformation) : null;
            SavedStateHandle savedStateHandle2 = this.this$0.AhwBna;
            if (chatbotEntryDisplayModelAEQbTJ != null) {
                String contextualBot = chatbotEntryDisplayModelAEQbTJ.getContextualBot();
                if (StringsKt__StringsKt.fARcdN((CharSequence) contextualBot)) {
                    contextualBot = "cg_support-center-landing-page";
                }
                chatbotEntryDisplayModelCopy$default = ChatbotEntryDisplayModel.copy$default(chatbotEntryDisplayModelAEQbTJ, false, null, null, null, null, null, contextualBot, 63, null);
            } else {
                chatbotEntryDisplayModelCopy$default = null;
            }
            savedStateHandle2.set("KEY_CHATBOT_ATTRIBUTES", chatbotEntryDisplayModelCopy$default);
            PopupAnnouncements popupAnnouncements = this.$cards.getPopupAnnouncements();
            List<PopupAnnouncementInfoBean> list = popupAnnouncements != null ? popupAnnouncements.getList() : null;
            return new SupportCenterHomeViewModel.StateListAnimator.Activity(listKWHzl, pairKWHzl, listOLrzqt, listOLrzqt2, chatbotEntryDisplayModelAEQbTJ, !zFARcdN, zOLrzqt, C44854sel.OLrzqt(displayControl, RecommendSection.TOP_TOPICS_VIEW_ALL), (list == null || list.isEmpty() || (popupAnnouncementInfoBean = (PopupAnnouncementInfoBean) CollectionsKt___CollectionsKt.firstOrNull(this.$cards.getPopupAnnouncements().getList())) == null) ? null : C45065sik.OLrzqt(popupAnnouncementInfoBean));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
