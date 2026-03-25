package com.okinc.im.imui.search.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.SearchResultData;
import com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33129mqd;
import o.C35399nuc;
import o.C36561odL;
import o.C44169sFw;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC36569odT;
import o.InterfaceC37420otW;
import o.sKO;
import o.sKR;
import o.sKT;
import o.sQU;
import o.sQY;
import o.sSM;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<List<sQU>> AEQbTJ;
    public final MutableStateFlow<InterfaceC37420otW> AYXKKw;
    public final MutableStateFlow<List<sQY>> AhwBna;
    public final StateFlow<InterfaceC37420otW> AkhnZx;
    public final C36561odL DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public long djBIcL;
    public final SavedStateHandle fetchVPNInfo;
    public final StateFlow<Boolean> gEmmrt;
    public final sKO isConnected;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC37420otW> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.gEmmrt;
    }

    @yCM
    public GlobalSearchViewModel(@NotNull InterfaceC36569odT interfaceC36569odT, @NotNull SavedStateHandle savedStateHandle, @NotNull sKO sko) {
        Intrinsics.checkNotNullParameter(interfaceC36569odT, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(sko, "");
        this.fetchVPNInfo = savedStateHandle;
        this.isConnected = sko;
        this.AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.djBIcL = Long.MAX_VALUE;
        Boolean bool = Boolean.FALSE;
        this.OLrzqt = StateFlowKt.MutableStateFlow(bool);
        this.EZpvd = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC37420otW> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow2;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow2);
        this.DbNXlk = interfaceC36569odT.copydefault(300L);
        this.valueOf = "";
        KWHzl();
    }

    public final void AEQbTJ(@NotNull final String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.OLrzqt(new Function0() { // from class: o.ovw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GlobalSearchViewModel.OLrzqt(this.KWHzl, str, i);
            }
        });
    }

    public static final Unit OLrzqt(GlobalSearchViewModel globalSearchViewModel, String str, int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(globalSearchViewModel), null, null, new GlobalSearchViewModel$search$1$1(globalSearchViewModel, str, i, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.DbNXlk.OLrzqt(new Function0() { // from class: o.ovy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GlobalSearchViewModel.EZpvd(this.KWHzl, activity);
            }
        });
    }

    public static final Unit EZpvd(GlobalSearchViewModel globalSearchViewModel, Activity activity) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(globalSearchViewModel), null, null, new GlobalSearchViewModel$chatsAndContactsLoadMore$1$1(globalSearchViewModel, activity, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Application application = new Application(str, 100);
        this.DbNXlk.OLrzqt(new Function0() { // from class: o.ovv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GlobalSearchViewModel.AEQbTJ(this.copydefault, application);
            }
        });
    }

    public static final Unit AEQbTJ(GlobalSearchViewModel globalSearchViewModel, Application application) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(globalSearchViewModel), null, null, new GlobalSearchViewModel$messagesLoadMore$1$1(globalSearchViewModel, application, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GlobalSearchViewModel$fetchNextMessagePage$1(this, new Application(str, 100), null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Application application, Continuation<? super Unit> continuation) throws Throwable {
        GlobalSearchViewModel$appendMessagesToFlow$1 globalSearchViewModel$appendMessagesToFlow$1;
        GlobalSearchViewModel globalSearchViewModel;
        List<sQY> list;
        List list2;
        MutableStateFlow<Boolean> mutableStateFlow;
        Boolean boolKWHzl;
        if (continuation instanceof GlobalSearchViewModel$appendMessagesToFlow$1) {
            globalSearchViewModel$appendMessagesToFlow$1 = (GlobalSearchViewModel$appendMessagesToFlow$1) continuation;
            int i = globalSearchViewModel$appendMessagesToFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                globalSearchViewModel$appendMessagesToFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                globalSearchViewModel$appendMessagesToFlow$1 = new GlobalSearchViewModel$appendMessagesToFlow$1(this, continuation);
            }
        }
        Object obj = globalSearchViewModel$appendMessagesToFlow$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = globalSearchViewModel$appendMessagesToFlow$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            List<sQY> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.AhwBna.getValue());
            globalSearchViewModel$appendMessagesToFlow$1.L$0 = this;
            globalSearchViewModel$appendMessagesToFlow$1.L$1 = listFJNWhG;
            globalSearchViewModel$appendMessagesToFlow$1.label = 1;
            Object objCopydefault2 = copydefault(application, globalSearchViewModel$appendMessagesToFlow$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            globalSearchViewModel = this;
            obj = objCopydefault2;
            list = listFJNWhG;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                list2 = (List) globalSearchViewModel$appendMessagesToFlow$1.L$1;
                globalSearchViewModel = (GlobalSearchViewModel) globalSearchViewModel$appendMessagesToFlow$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = globalSearchViewModel.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(list2.size() >= 100);
                globalSearchViewModel$appendMessagesToFlow$1.L$0 = null;
                globalSearchViewModel$appendMessagesToFlow$1.L$1 = null;
                globalSearchViewModel$appendMessagesToFlow$1.label = 3;
                if (mutableStateFlow.emit(boolKWHzl, globalSearchViewModel$appendMessagesToFlow$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            list = (List) globalSearchViewModel$appendMessagesToFlow$1.L$1;
            globalSearchViewModel = (GlobalSearchViewModel) globalSearchViewModel$appendMessagesToFlow$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list3 = (List) obj;
        list.addAll(list3);
        MutableStateFlow<List<sQY>> mutableStateFlow2 = globalSearchViewModel.AhwBna;
        globalSearchViewModel$appendMessagesToFlow$1.L$0 = globalSearchViewModel;
        globalSearchViewModel$appendMessagesToFlow$1.L$1 = list3;
        globalSearchViewModel$appendMessagesToFlow$1.label = 2;
        if (mutableStateFlow2.emit(list, globalSearchViewModel$appendMessagesToFlow$1) == objCopydefault) {
            return objCopydefault;
        }
        list2 = list3;
        mutableStateFlow = globalSearchViewModel.EZpvd;
        boolKWHzl = C56443yFo.KWHzl(list2.size() >= 100);
        globalSearchViewModel$appendMessagesToFlow$1.L$0 = null;
        globalSearchViewModel$appendMessagesToFlow$1.L$1 = null;
        globalSearchViewModel$appendMessagesToFlow$1.label = 3;
        if (mutableStateFlow.emit(boolKWHzl, globalSearchViewModel$appendMessagesToFlow$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final Object EZpvd(Activity activity, Continuation<? super List<sQU>> continuation) {
        return this.isConnected.OLrzqt(new sKR(activity.EZpvd(), activity.OLrzqt()), true, continuation);
    }

    public final Object copydefault(Application application, Continuation<? super List<sQY>> continuation) {
        return this.isConnected.KWHzl(new sKT(application.AEQbTJ(), null, C33129mqd.AhwBna(application.EZpvd()), C56443yFo.KWHzl(this.djBIcL)), continuation);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GlobalSearchViewModel$observeFlows$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GlobalSearchViewModel$observeFlows$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GlobalSearchViewModel$observeFlows$3(this, null), 3, null);
    }

    public final List<SearchResultData> KWHzl(List<sQU> list, List<sQY> list2) {
        ArrayList arrayList = new ArrayList();
        String str = (String) this.fetchVPNInfo.get("SAVED_STATE_KEY_SEARCH_KEY_WORD");
        if (!list.isEmpty()) {
            arrayList.add(new SearchResultData.Header(C35399nuc.LoaderManager.zMXLsR));
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (sQU squ : list) {
                InHouseIMConversationEntity inHouseIMConversationEntityCopydefault = squ.copydefault();
                OKConversation oKConversationOLrzqt = inHouseIMConversationEntityCopydefault != null ? C44169sFw.OLrzqt(inHouseIMConversationEntityCopydefault) : null;
                sSM ssm = sSM.AEQbTJ;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt = squ.OLrzqt();
                arrayList2.add(new SearchResultData.ChatAndContact(oKConversationOLrzqt, ssm.OLrzqt(inHouseIMContactInfoEntityOLrzqt != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityOLrzqt) : null), squ.KWHzl(), str == null ? "" : str));
            }
            arrayList.addAll(arrayList2);
            if (list.size() == 5 && Intrinsics.EZpvd(this.fetchVPNInfo.get("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE"), Boolean.FALSE)) {
                arrayList.add(SearchResultData.LoadMore.CHAT_AND_CONTACT);
            }
        }
        if (!list2.isEmpty()) {
            arrayList.add(new SearchResultData.Header(C35399nuc.LoaderManager.DVmcag));
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (sQY sqy : list2) {
                OKMessage oKMessageAEQbTJ = C44169sFw.AEQbTJ(sqy.copydefault());
                OKConversation oKConversationOLrzqt2 = C44169sFw.OLrzqt(sqy.OLrzqt());
                sSM ssm2 = sSM.AEQbTJ;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityKWHzl = sqy.KWHzl();
                RelationInfo relationInfoOLrzqt = ssm2.OLrzqt(inHouseIMContactInfoEntityKWHzl != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityKWHzl) : null);
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityAEQbTJ = sqy.AEQbTJ();
                arrayList3.add(new SearchResultData.Message(oKMessageAEQbTJ, oKConversationOLrzqt2, relationInfoOLrzqt, ssm2.OLrzqt(inHouseIMContactInfoEntityAEQbTJ != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityAEQbTJ) : null), sqy.EZpvd()));
            }
            arrayList.addAll(arrayList3);
            if (list2.size() == 5 && Intrinsics.EZpvd(this.fetchVPNInfo.get("SAVED_STATE_KEY_MESSAGES_LOAD_MORE"), Boolean.FALSE)) {
                arrayList.add(SearchResultData.LoadMore.MESSAGE);
            }
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final String EZpvd;
        public final Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                num = activity.copydefault;
            }
            return activity.copydefault(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull String str, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            Integer num = this.copydefault;
            return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchParams(keyword=" + this.EZpvd + ", querySize=" + this.copydefault + ")";
        }

        public Activity(@NotNull String str, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.copydefault = num;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final String EZpvd;
        public final Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                num = application.copydefault;
            }
            return application.KWHzl(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull String str, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            Integer num = this.copydefault;
            return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SearchMessageParams(keyword=" + this.EZpvd + ", querySize=" + this.copydefault + ")";
        }

        public Application(@NotNull String str, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.copydefault = num;
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
