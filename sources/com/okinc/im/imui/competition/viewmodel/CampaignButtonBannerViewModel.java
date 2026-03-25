package com.okinc.im.imui.competition.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.CtaInfo;
import com.okinc.okimcore.model.other.GroupCampaignInfo;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CampaignButtonBannerViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<List<CtaInfo>> AEQbTJ;
    public final LiveData<String> AYXKKw;
    public final MutableLiveData<OKConversation> AhwBna;
    public final MutableLiveData<String> KWHzl;
    public final MutableLiveData<String> OLrzqt;
    public final MutableLiveData<GroupInfo> copydefault;
    public final oDA djBIcL;
    public final LiveData<List<CtaInfo>> gEmmrt;
    public final LiveData<GroupInfo> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<CtaInfo>> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> KWHzl() {
        return this.AYXKKw;
    }

    @yCM
    public CampaignButtonBannerViewModel(@NotNull oDA oda) {
        Intrinsics.checkNotNullParameter(oda, "");
        this.djBIcL = oda;
        this.OLrzqt = new MutableLiveData<>(null);
        this.AhwBna = new MutableLiveData<>(null);
        MutableLiveData<GroupInfo> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.valueOf = mutableLiveData;
        MutableLiveData<List<CtaInfo>> mutableLiveData2 = new MutableLiveData<>(yDY.AhwBna());
        this.AEQbTJ = mutableLiveData2;
        this.gEmmrt = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData3;
        this.AYXKKw = mutableLiveData3;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.competition.viewmodel.CampaignButtonBannerViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void copydefault(OKConversation oKConversation, IMPageType iMPageType) {
        if (oKConversation == null) {
            pUU.valueOf("CampaignButtonBannerViewModel", "Conversation is null, cannot initialize");
            return;
        }
        this.OLrzqt.setValue(oKConversation.getTargetId());
        this.AhwBna.setValue(oKConversation);
        if (oKConversation.getConversationType() == OKConversationType.GROUP) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CampaignButtonBannerViewModel$init$1(this, oKConversation, null), 3, null);
        } else {
            pUU.EZpvd("CampaignButtonBannerViewModel", "Not a group conversation, skipping CTA fetch");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, Continuation<? super Unit> continuation) throws Throwable {
        CampaignButtonBannerViewModel$fetchGroupInfo$1 campaignButtonBannerViewModel$fetchGroupInfo$1;
        CampaignButtonBannerViewModel campaignButtonBannerViewModel;
        GroupInfo groupInfo;
        MutableLiveData<GroupInfo> mutableLiveData;
        List<CtaInfo> ctas;
        if (continuation instanceof CampaignButtonBannerViewModel$fetchGroupInfo$1) {
            campaignButtonBannerViewModel$fetchGroupInfo$1 = (CampaignButtonBannerViewModel$fetchGroupInfo$1) continuation;
            int i = campaignButtonBannerViewModel$fetchGroupInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                campaignButtonBannerViewModel$fetchGroupInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                campaignButtonBannerViewModel$fetchGroupInfo$1 = new CampaignButtonBannerViewModel$fetchGroupInfo$1(this, continuation);
            }
        }
        Object objCopydefault = campaignButtonBannerViewModel$fetchGroupInfo$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = campaignButtonBannerViewModel$fetchGroupInfo$1.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("CampaignButtonBannerViewModel", "Failed to fetch group info: " + e.getMessage());
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            OKConversation value = this.AhwBna.getValue();
            if ((value != null ? value.getConversationType() : null) == OKConversationType.GROUP) {
                oDA oda = this.djBIcL;
                campaignButtonBannerViewModel$fetchGroupInfo$1.L$0 = this;
                campaignButtonBannerViewModel$fetchGroupInfo$1.label = 1;
                objCopydefault = oda.copydefault(str, campaignButtonBannerViewModel$fetchGroupInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                campaignButtonBannerViewModel = this;
                groupInfo = (GroupInfo) objCopydefault;
                mutableLiveData = campaignButtonBannerViewModel.copydefault;
                campaignButtonBannerViewModel$fetchGroupInfo$1.L$0 = campaignButtonBannerViewModel;
                campaignButtonBannerViewModel$fetchGroupInfo$1.L$1 = groupInfo;
                campaignButtonBannerViewModel$fetchGroupInfo$1.label = 2;
                if (C36588odm.KWHzl(mutableLiveData, groupInfo, campaignButtonBannerViewModel$fetchGroupInfo$1) == objCopydefault2) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            CampaignButtonBannerViewModel campaignButtonBannerViewModel2 = (CampaignButtonBannerViewModel) campaignButtonBannerViewModel$fetchGroupInfo$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            campaignButtonBannerViewModel = campaignButtonBannerViewModel2;
            groupInfo = (GroupInfo) objCopydefault;
            mutableLiveData = campaignButtonBannerViewModel.copydefault;
            campaignButtonBannerViewModel$fetchGroupInfo$1.L$0 = campaignButtonBannerViewModel;
            campaignButtonBannerViewModel$fetchGroupInfo$1.L$1 = groupInfo;
            campaignButtonBannerViewModel$fetchGroupInfo$1.label = 2;
            if (C36588odm.KWHzl(mutableLiveData, groupInfo, campaignButtonBannerViewModel$fetchGroupInfo$1) == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return Unit.INSTANCE;
            }
            groupInfo = (GroupInfo) campaignButtonBannerViewModel$fetchGroupInfo$1.L$1;
            campaignButtonBannerViewModel = (CampaignButtonBannerViewModel) campaignButtonBannerViewModel$fetchGroupInfo$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (groupInfo != null && (ctas = groupInfo.getCtas()) != null) {
            MutableLiveData<String> mutableLiveData2 = campaignButtonBannerViewModel.KWHzl;
            GroupCampaignInfo groupCampaign = groupInfo.getGroupCampaign();
            mutableLiveData2.setValue(groupCampaign != null ? groupCampaign.getMinAppVersion() : null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : ctas) {
                arrayList.add(obj);
            }
            MutableLiveData<List<CtaInfo>> mutableLiveData3 = campaignButtonBannerViewModel.AEQbTJ;
            campaignButtonBannerViewModel$fetchGroupInfo$1.L$0 = null;
            campaignButtonBannerViewModel$fetchGroupInfo$1.L$1 = null;
            campaignButtonBannerViewModel$fetchGroupInfo$1.label = 3;
            if (C36588odm.KWHzl(mutableLiveData3, arrayList, campaignButtonBannerViewModel$fetchGroupInfo$1) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        return Unit.INSTANCE;
    }
}
