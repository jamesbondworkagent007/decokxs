package com.okinc.im.imui.relationlist.viewmodel.searchrelation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel;
import com.okinc.im.utils.UiText;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC37253oqO;
import o.C32989mnw;
import o.C33129mqd;
import o.C35856oGf;
import o.C35865oGo;
import o.C35866oGp;
import o.C35869oGs;
import o.C37244oqF;
import o.C37245oqG;
import o.C37246oqH;
import o.C37247oqI;
import o.C56403yEb;
import o.oFP;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchRelationViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<List<Object>> AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final oFP AhwBna;
    public MutableStateFlow<String> DbNXlk;
    public final MutableLiveData<C32989mnw<Activity>> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableStateFlow<List<C37246oqH>> copydefault;
    public final C35856oGf djBIcL;
    public final MutableStateFlow<VipManagerRelationInfo> fetchVPNInfo;
    public final C35866oGp gEmmrt;
    public final C35869oGs isConnected;
    public final C35865oGo valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Object>> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Activity>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.AYXKKw;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public SearchRelationViewModel(@NotNull C35869oGs c35869oGs, @NotNull C35866oGp c35866oGp, @NotNull C35856oGf c35856oGf, @NotNull C35865oGo c35865oGo, @NotNull oFP ofp) {
        Intrinsics.checkNotNullParameter(c35869oGs, "");
        Intrinsics.checkNotNullParameter(c35866oGp, "");
        Intrinsics.checkNotNullParameter(c35856oGf, "");
        Intrinsics.checkNotNullParameter(c35865oGo, "");
        Intrinsics.checkNotNullParameter(ofp, "");
        this.isConnected = c35869oGs;
        this.gEmmrt = c35866oGp;
        this.djBIcL = c35856oGf;
        this.valueOf = c35865oGo;
        this.AhwBna = ofp;
        this.KWHzl = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.DbNXlk = StateFlowKt.MutableStateFlow(null);
        this.fetchVPNInfo = StateFlowKt.MutableStateFlow(null);
        this.copydefault = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AYXKKw = Transformations.map(AEQbTJ(), new Function1() { // from class: o.otI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SearchRelationViewModel.KWHzl(this.copydefault, (java.util.List) obj));
            }
        });
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends Activity {
            public final String EZpvd;
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = actionBar.KWHzl;
                }
                return actionBar.copydefault(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str, str2);
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
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                String str = this.KWHzl;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NavigateChatScreen(relationId=" + this.EZpvd + ", channelId=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
                this.KWHzl = str2;
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Activity {
            public final ReferralData copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ReferralData referralData, int i, Object obj) {
                if ((i & 1) != 0) {
                    referralData = taskDescription.copydefault;
                }
                return taskDescription.copydefault(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReferralData EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull ReferralData referralData) {
                Intrinsics.checkNotNullParameter(referralData, "");
                return new TaskDescription(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InviteUser(referralData=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull ReferralData referralData) {
                super(null);
                Intrinsics.checkNotNullParameter(referralData, "");
                this.copydefault = referralData;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0476Activity extends Activity {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0476Activity copy$default(C0476Activity c0476Activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0476Activity.OLrzqt;
                }
                return c0476Activity.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0476Activity copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0476Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0476Activity) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((C0476Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ToastWithFail(message=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0476Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        public static final class StateListAnimator extends Activity {
            public final C37246oqH KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C37246oqH c37246oqH, int i, Object obj) {
                if ((i & 1) != 0) {
                    c37246oqH = stateListAnimator.KWHzl;
                }
                return stateListAnimator.copydefault(c37246oqH);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C37246oqH OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull C37246oqH c37246oqH) {
                Intrinsics.checkNotNullParameter(c37246oqH, "");
                return new StateListAnimator(c37246oqH);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowLocalRelationSelectionBottomSheet(groupedLocalRelation=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull C37246oqH c37246oqH) {
                super(null);
                Intrinsics.checkNotNullParameter(c37246oqH, "");
                this.KWHzl = c37246oqH;
            }
        }
    }

    public static final boolean KWHzl(SearchRelationViewModel searchRelationViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty() && C33129mqd.OLrzqt((CharSequence) searchRelationViewModel.DbNXlk.getValue());
    }

    public final void OLrzqt() {
        valueOf();
        AhwBna();
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchRelationViewModel$getLocalRelationList$1(this, null), 3, null);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchRelationViewModel$getVipManagerInfo$1(this, null), 3, null);
    }

    public final void EZpvd(String str) {
        this.DbNXlk.setValue(str);
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchRelationViewModel$observeDataList$1(this, null), 3, null);
    }

    public final List<Object> KWHzl(List<C37244oqF> list, List<C37246oqH> list2, VipManagerRelationInfo vipManagerRelationInfo, String str) {
        ArrayList arrayList = new ArrayList();
        if (vipManagerRelationInfo != null) {
            C37245oqG c37245oqG = new C37245oqG(vipManagerRelationInfo, str);
            arrayList.add(new AbstractC37253oqO.Application(new UiText.DynamicString(vipManagerRelationInfo.getTitle())));
            arrayList.add(c37245oqG);
        }
        if (!list.isEmpty()) {
            arrayList.add(new AbstractC37253oqO.TaskDescription(null, 1, null));
            arrayList.addAll(list);
        }
        if (!list2.isEmpty()) {
            arrayList.add(new AbstractC37253oqO.StateListAnimator(null, 1, null));
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C37247oqI((C37246oqH) it.next(), str));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull C37246oqH c37246oqH) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        if (c37246oqH.OLrzqt().size() == 1) {
            KWHzl((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt()));
        } else {
            this.KWHzl.setValue(new C32989mnw<>(new Activity.StateListAnimator(c37246oqH)));
        }
    }

    public final void KWHzl(@NotNull PhoneRelation phoneRelation) {
        Intrinsics.checkNotNullParameter(phoneRelation, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchRelationViewModel$checkLocalRelation$1(this, phoneRelation, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchRelationViewModel$fetchReferralData$1(this, str, str2, null), 3, null);
    }
}
