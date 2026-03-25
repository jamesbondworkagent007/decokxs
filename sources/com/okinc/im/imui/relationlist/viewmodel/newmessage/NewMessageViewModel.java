package com.okinc.im.imui.relationlist.viewmodel.newmessage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.affiliate.bean.AffiliateIMPermission;
import com.okinc.im.imui.relationlist.model.ListButton;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.utils.UiText;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.remote.UserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC37253oqO;
import o.C32989mnw;
import o.C35399nuc;
import o.C35744oCb;
import o.C35748oCf;
import o.C35856oGf;
import o.C35865oGo;
import o.C35866oGp;
import o.C35869oGs;
import o.C35871oGu;
import o.C37243oqE;
import o.C37246oqH;
import o.C37248oqJ;
import o.C37249oqK;
import o.C37251oqM;
import o.oFP;
import o.oGO;
import o.sDN;
import o.sKN;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class NewMessageViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<List<C37246oqH>> AEQbTJ;
    public final MutableStateFlow<List<C37246oqH>> AYXKKw;
    public final MutableStateFlow<AffiliateIMPermission> AhwBna;
    public final C35856oGf AkhnZx;
    public final C35865oGo AuCTel;
    public UserInfo DbNXlk;
    public final MutableLiveData<C32989mnw<ActionBar>> EZpvd;
    public final MutableLiveData<List<Object>> KWHzl;
    public final MutableStateFlow<List<RelationInfo>> OLrzqt;
    public final C35748oCf djBIcL;
    public final C35871oGu ejfBZ;
    public final sKN fARcdN;
    public final C35869oGs fIwbmz;
    public final oGO fJNWhG;
    public final oFP fetchVPNInfo;
    public final MutableStateFlow<List<C37248oqJ>> gEmmrt;
    public final MutableStateFlow<VipManagerRelationInfo> hDKMBd;
    public final C35744oCb isConnected;
    public final MutableStateFlow<Boolean> iwGUEr;
    public final MutableLiveData<Boolean> valueOf;
    public final C35866oGp values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Object>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ActionBar>> EZpvd() {
        return this.EZpvd;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public NewMessageViewModel(@NotNull C35871oGu c35871oGu, @NotNull C35869oGs c35869oGs, @NotNull C35744oCb c35744oCb, @NotNull oGO ogo, @NotNull C35866oGp c35866oGp, @NotNull C35865oGo c35865oGo, @NotNull oFP ofp, @NotNull C35856oGf c35856oGf, @NotNull sKN skn, @NotNull C35748oCf c35748oCf) {
        Intrinsics.checkNotNullParameter(c35871oGu, "");
        Intrinsics.checkNotNullParameter(c35869oGs, "");
        Intrinsics.checkNotNullParameter(c35744oCb, "");
        Intrinsics.checkNotNullParameter(ogo, "");
        Intrinsics.checkNotNullParameter(c35866oGp, "");
        Intrinsics.checkNotNullParameter(c35865oGo, "");
        Intrinsics.checkNotNullParameter(ofp, "");
        Intrinsics.checkNotNullParameter(c35856oGf, "");
        Intrinsics.checkNotNullParameter(skn, "");
        Intrinsics.checkNotNullParameter(c35748oCf, "");
        this.ejfBZ = c35871oGu;
        this.fIwbmz = c35869oGs;
        this.isConnected = c35744oCb;
        this.fJNWhG = ogo;
        this.values = c35866oGp;
        this.AuCTel = c35865oGo;
        this.fetchVPNInfo = ofp;
        this.AkhnZx = c35856oGf;
        this.fARcdN = skn;
        this.djBIcL = c35748oCf;
        this.AhwBna = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.iwGUEr = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.hDKMBd = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.gEmmrt = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.KWHzl = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0475ActionBar extends ActionBar {
            public final String KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0475ActionBar copy$default(C0475ActionBar c0475ActionBar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0475ActionBar.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str2 = c0475ActionBar.KWHzl;
                }
                return c0475ActionBar.KWHzl(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0475ActionBar KWHzl(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0475ActionBar(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0475ActionBar)) {
                    return false;
                }
                C0475ActionBar c0475ActionBar = (C0475ActionBar) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) c0475ActionBar.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) c0475ActionBar.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.OLrzqt.hashCode();
                String str = this.KWHzl;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NavigateChatScreen(relationId=" + this.OLrzqt + ", channelId=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0475ActionBar(@NotNull String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
                this.KWHzl = str2;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends ActionBar {
            public final ReferralData EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, ReferralData referralData, int i, Object obj) {
                if ((i & 1) != 0) {
                    referralData = activity.EZpvd;
                }
                return activity.AEQbTJ(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull ReferralData referralData) {
                Intrinsics.checkNotNullParameter(referralData, "");
                return new Activity(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReferralData copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InviteUser(referralData=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull ReferralData referralData) {
                super(null);
                Intrinsics.checkNotNullParameter(referralData, "");
                this.EZpvd = referralData;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends ActionBar {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                return stateListAnimator.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ToastWithFail(message=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        public static final class TaskDescription extends ActionBar {
            public final C37246oqH AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C37246oqH c37246oqH, int i, Object obj) {
                if ((i & 1) != 0) {
                    c37246oqH = taskDescription.AEQbTJ;
                }
                return taskDescription.KWHzl(c37246oqH);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull C37246oqH c37246oqH) {
                Intrinsics.checkNotNullParameter(c37246oqH, "");
                return new TaskDescription(c37246oqH);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C37246oqH OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowLocalRelationSelectionBottomSheet(groupedLocalRelation=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull C37246oqH c37246oqH) {
                super(null);
                Intrinsics.checkNotNullParameter(c37246oqH, "");
                this.AEQbTJ = c37246oqH;
            }
        }
    }

    public final boolean AhwBna() {
        return this.djBIcL.KWHzl();
    }

    public final void OLrzqt(boolean z) {
        copydefault();
        AkhnZx();
        KWHzl(z);
        KWHzl();
        values();
        djBIcL();
        valueOf();
        gEmmrt();
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$observeSyncPhoneState$1(this, null), 3, null);
    }

    public final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$observeMessageList$1(this, null), 3, null);
    }

    public final List<Object> KWHzl(List<? extends ListButton> list, List<C37248oqJ> list2, List<C37246oqH> list3, boolean z, VipManagerRelationInfo vipManagerRelationInfo) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(C37251oqM.KWHzl);
        }
        arrayList.addAll(list);
        if (!list.isEmpty()) {
            arrayList.add(C37249oqK.EZpvd);
        }
        if (vipManagerRelationInfo != null) {
            arrayList.add(new AbstractC37253oqO.Application(new UiText.DynamicString(vipManagerRelationInfo.getTitle())));
            arrayList.add(vipManagerRelationInfo);
        }
        if (!list2.isEmpty()) {
            arrayList.add(new AbstractC37253oqO.TaskDescription(null, 1, null));
            arrayList.addAll(list2);
        }
        if (!list3.isEmpty()) {
            arrayList.add(new AbstractC37253oqO.StateListAnimator(null, 1, null));
            arrayList.addAll(list3);
        }
        if (list2.isEmpty() && list3.isEmpty()) {
            if (!z) {
                arrayList.add(new C37243oqE(C35399nuc.LoaderManager.DsL, C35399nuc.LoaderManager.getSessionID, 0, 4, null));
            } else {
                arrayList.add(new C37243oqE(C35399nuc.LoaderManager.jh, C35399nuc.LoaderManager.DcMfJKDcMfJK, C35399nuc.LoaderManager.YqksP));
            }
        }
        return arrayList;
    }

    public final void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$updateSyncPermission$1(this, z, null), 3, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$getAffiliateIMPermission$1(this, null), 3, null);
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$observeFriendList$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$getLocalRelationList$1(this, null), 3, null);
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$observeAndConstructFriendRelationList$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$observeAndFilterPhoneContactList$1(this, null), 3, null);
    }

    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$syncFriendList$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull C37246oqH c37246oqH) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        if (c37246oqH.OLrzqt().size() == 1) {
            OLrzqt((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt()));
        } else {
            this.EZpvd.setValue(new C32989mnw<>(new ActionBar.TaskDescription(c37246oqH)));
        }
    }

    public final void OLrzqt(@NotNull PhoneRelation phoneRelation) {
        Intrinsics.checkNotNullParameter(phoneRelation, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$checkLocalRelation$1(this, phoneRelation, null), 3, null);
    }

    public final void copydefault(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$fetchReferralData$1(this, str, str2, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewMessageViewModel$getVipManagerInfo$1(this, null), 3, null);
    }

    public final Object OLrzqt(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new NewMessageViewModel$checkPay$2(null), continuation);
    }
}
