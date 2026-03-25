package com.okinc.im.imui.conversationlist.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.remote.GroupRecommendations;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C35748oCf;
import o.C35775oDf;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44177sGd;
import o.nGA;
import o.nGS;
import o.sGF;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TrendingGroupListViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final InterfaceC44177sGd AhwBna;
    public final StateFlow<ActionBar> DbNXlk;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableLiveData<C32989mnw<nGA>> copydefault;
    public final C35748oCf djBIcL;
    public final C35775oDf gEmmrt;
    public final sGF valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> KWHzl() {
        return this.DbNXlk;
    }

    @yCM
    public TrendingGroupListViewModel(@NotNull sGF sgf, @NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull C35775oDf c35775oDf, @NotNull C35748oCf c35748oCf) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(c35775oDf, "");
        Intrinsics.checkNotNullParameter(c35748oCf, "");
        this.valueOf = sgf;
        this.AhwBna = interfaceC44177sGd;
        this.gEmmrt = c35775oDf;
        this.djBIcL = c35748oCf;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.AEQbTJ = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow2;
        this.DbNXlk = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, MutableStateFlow2, new TrendingGroupListViewModel$uiState$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), ActionBar.Activity.OLrzqt);
        this.copydefault = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.KWHzl = mutableLiveData;
        this.AYXKKw = mutableLiveData;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.TrendingGroupListViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.TrendingGroupListViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends ActionBar {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        private ActionBar() {
        }

        public static final class Application extends ActionBar {
            public static final Application EZpvd = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.TrendingGroupListViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0410ActionBar extends ActionBar {
            public static final C0410ActionBar KWHzl = new C0410ActionBar();

            private C0410ActionBar() {
                super(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0031, B:23:0x0077, B:25:0x007d, B:27:0x0097, B:28:0x00af, B:29:0x00b8, B:31:0x00be, B:33:0x00ca, B:35:0x00d0, B:37:0x00d8, B:39:0x00df, B:44:0x00eb, B:46:0x00f1, B:48:0x00fa, B:52:0x0105, B:54:0x010f, B:56:0x0118, B:58:0x0126, B:60:0x012f, B:63:0x0137, B:65:0x013e), top: B:71:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0031, B:23:0x0077, B:25:0x007d, B:27:0x0097, B:28:0x00af, B:29:0x00b8, B:31:0x00be, B:33:0x00ca, B:35:0x00d0, B:37:0x00d8, B:39:0x00df, B:44:0x00eb, B:46:0x00f1, B:48:0x00fa, B:52:0x0105, B:54:0x010f, B:56:0x0118, B:58:0x0126, B:60:0x012f, B:63:0x0137, B:65:0x013e), top: B:71:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super List<nGS>> continuation) throws Throwable {
        TrendingGroupListViewModel$fetchTrendingGroups$1 trendingGroupListViewModel$fetchTrendingGroups$1;
        TrendingGroupListViewModel trendingGroupListViewModel;
        Object objM8701invoke0E7RQCE$default;
        Throwable thM7380exceptionOrNullimpl;
        nGS ngs;
        if (continuation instanceof TrendingGroupListViewModel$fetchTrendingGroups$1) {
            trendingGroupListViewModel$fetchTrendingGroups$1 = (TrendingGroupListViewModel$fetchTrendingGroups$1) continuation;
            int i = trendingGroupListViewModel$fetchTrendingGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trendingGroupListViewModel$fetchTrendingGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                trendingGroupListViewModel$fetchTrendingGroups$1 = new TrendingGroupListViewModel$fetchTrendingGroups$1(this, continuation);
            }
        }
        TrendingGroupListViewModel$fetchTrendingGroups$1 trendingGroupListViewModel$fetchTrendingGroups$12 = trendingGroupListViewModel$fetchTrendingGroups$1;
        Object obj = trendingGroupListViewModel$fetchTrendingGroups$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trendingGroupListViewModel$fetchTrendingGroups$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trendingGroupListViewModel = (TrendingGroupListViewModel) trendingGroupListViewModel$fetchTrendingGroups$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM8701invoke0E7RQCE$default = ((Result) obj).m7386unboximpl();
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8701invoke0E7RQCE$default);
                if (thM7380exceptionOrNullimpl != null) {
                    List<GroupRecommendations> list = (List) objM8701invoke0E7RQCE$default;
                    trendingGroupListViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(false));
                    trendingGroupListViewModel.OLrzqt.setValue(C56443yFo.KWHzl(false));
                    if (list.isEmpty()) {
                        trendingGroupListViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(false));
                        trendingGroupListViewModel.OLrzqt.setValue(C56443yFo.KWHzl(true));
                        return yDY.AhwBna();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (GroupRecommendations groupRecommendations : list) {
                        if (groupRecommendations.getGroupId() == null || groupRecommendations.getGroupName() == null) {
                            ngs = null;
                        } else {
                            Long groupId = groupRecommendations.getGroupId();
                            long jLongValue = groupId != null ? groupId.longValue() : 0L;
                            String groupName = groupRecommendations.getGroupName();
                            String str = groupName == null ? "" : groupName;
                            Integer memberCount = groupRecommendations.getMemberCount();
                            int iIntValue = memberCount != null ? memberCount.intValue() : 0;
                            String groupDescription = groupRecommendations.getGroupDescription();
                            String str2 = groupDescription == null ? "" : groupDescription;
                            String groupAvatar = groupRecommendations.getGroupAvatar();
                            Boolean boolIsPaidGroup = groupRecommendations.isPaidGroup();
                            boolean zBooleanValue = boolIsPaidGroup != null ? boolIsPaidGroup.booleanValue() : false;
                            Integer maxMemberCount = groupRecommendations.getMaxMemberCount();
                            String invitationId = groupRecommendations.getInvitationId();
                            Boolean boolIsOfficialGroup = groupRecommendations.isOfficialGroup();
                            ngs = new nGS(jLongValue, str, iIntValue, str2, groupAvatar, zBooleanValue, maxMemberCount, invitationId, boolIsOfficialGroup != null ? boolIsOfficialGroup.booleanValue() : false);
                        }
                        if (ngs != null) {
                            arrayList.add(ngs);
                        }
                    }
                    return arrayList;
                }
                trendingGroupListViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(false));
                trendingGroupListViewModel.OLrzqt.setValue(C56443yFo.KWHzl(true));
                C44124sEe.KWHzl("Failed to fetch trending groups", thM7380exceptionOrNullimpl);
                return yDY.AhwBna();
            } catch (Exception e) {
                e = e;
                trendingGroupListViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(false));
                trendingGroupListViewModel.OLrzqt.setValue(C56443yFo.KWHzl(true));
                C44124sEe.KWHzl("Failed to fetch trending groups", e);
                return yDY.AhwBna();
            }
        }
        C56391yDq.AEQbTJ(obj);
        this.AEQbTJ.setValue(C56443yFo.KWHzl(true));
        this.OLrzqt.setValue(C56443yFo.KWHzl(false));
        boolean zKWHzl = this.djBIcL.KWHzl();
        try {
            C35775oDf c35775oDf = this.gEmmrt;
            Boolean boolKWHzl = C56443yFo.KWHzl(!zKWHzl);
            trendingGroupListViewModel$fetchTrendingGroups$12.L$0 = this;
            trendingGroupListViewModel$fetchTrendingGroups$12.label = 1;
            objM8701invoke0E7RQCE$default = C35775oDf.m8701invoke0E7RQCE$default(c35775oDf, boolKWHzl, null, trendingGroupListViewModel$fetchTrendingGroups$12, 2, null);
            if (objM8701invoke0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            trendingGroupListViewModel = this;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8701invoke0E7RQCE$default);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } catch (Exception e2) {
            e = e2;
            trendingGroupListViewModel = this;
            trendingGroupListViewModel.AEQbTJ.setValue(C56443yFo.KWHzl(false));
            trendingGroupListViewModel.OLrzqt.setValue(C56443yFo.KWHzl(true));
            C44124sEe.KWHzl("Failed to fetch trending groups", e);
            return yDY.AhwBna();
        }
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
