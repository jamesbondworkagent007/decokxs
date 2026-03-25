package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.model.SelectionStatus;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32989mnw;
import o.C35856oGf;
import o.C35866oGp;
import o.C35869oGs;
import o.C37244oqF;
import o.C37246oqH;
import o.C37248oqJ;
import o.C56403yEb;
import o.oDU;
import o.oDW;
import o.pUU;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiSelectRelationViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final MutableLiveData<Boolean> AEQbTJ;
    public final MutableLiveData<Integer> AYXKKw;
    public final MutableLiveData<List<RelationInfo>> AhwBna;
    public final oDW AkhnZx;
    public Activity AuCTel;
    public final C35866oGp DbNXlk;
    public final MutableStateFlow<List<C37246oqH>> EZpvd;
    public final MutableLiveData<C32989mnw<StateListAnimator>> KWHzl;
    public final MutableLiveData<List<Object>> copydefault;
    public final LiveData<Boolean> djBIcL;
    public MutableStateFlow<String> ejfBZ;
    public final C35869oGs fARcdN;
    public boolean fIwbmz;
    public final LiveData<Integer> fJNWhG;
    public String fetchVPNInfo;
    public final MutableStateFlow<Set<String>> gEmmrt;
    public SelectionActionType getFieldNames;
    public final C35856oGf isConnected;
    public final StateFlow<Set<String>> iwGUEr;
    public SelectRelationActivityViewModel valueOf;
    public final oDU values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<StateListAnimator>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull SelectRelationActivityViewModel selectRelationActivityViewModel) {
        Intrinsics.checkNotNullParameter(selectRelationActivityViewModel, "");
        this.valueOf = selectRelationActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Set<String>> EZpvd() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.fIwbmz = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity KWHzl() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<Object>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> gEmmrt() {
        return this.AEQbTJ;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @yCM
    public MultiSelectRelationViewModel(@NotNull C35869oGs c35869oGs, @NotNull C35866oGp c35866oGp, @NotNull C35856oGf c35856oGf, @NotNull oDU odu, @NotNull oDW odw) {
        Intrinsics.checkNotNullParameter(c35869oGs, "");
        Intrinsics.checkNotNullParameter(c35866oGp, "");
        Intrinsics.checkNotNullParameter(c35856oGf, "");
        Intrinsics.checkNotNullParameter(odu, "");
        Intrinsics.checkNotNullParameter(odw, "");
        this.fARcdN = c35869oGs;
        this.DbNXlk = c35866oGp;
        this.isConnected = c35856oGf;
        this.values = odu;
        this.AkhnZx = odw;
        this.AuCTel = Activity.Application.copydefault;
        this.copydefault = new MutableLiveData<>();
        this.ejfBZ = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<Set<String>> MutableStateFlow = StateFlowKt.MutableStateFlow(yEE.copydefault());
        this.gEmmrt = MutableStateFlow;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AhwBna = new MutableLiveData<>();
        this.djBIcL = Transformations.map(copydefault(), new Function1() { // from class: o.otM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(MultiSelectRelationViewModel.AEQbTJ((java.util.List) obj));
            }
        });
        this.KWHzl = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData;
        this.fJNWhG = mutableLiveData;
        this.getFieldNames = SelectionActionType.UNKNOWN;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends StateListAnimator {
            public final ReferralData copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, ReferralData referralData, int i, Object obj) {
                if ((i & 1) != 0) {
                    referralData = activity.copydefault;
                }
                return activity.KWHzl(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReferralData KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull ReferralData referralData) {
                Intrinsics.checkNotNullParameter(referralData, "");
                return new Activity(referralData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
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
            public Activity(@NotNull ReferralData referralData) {
                super(null);
                Intrinsics.checkNotNullParameter(referralData, "");
                this.copydefault = referralData;
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends StateListAnimator {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.EZpvd;
                }
                return application.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ToastWithFail(msg=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        public static final class Application extends Activity {
            public static final Application copydefault = new Application();

            private Application() {
                super(null);
            }
        }
    }

    public final LiveData<List<RelationInfo>> djBIcL() {
        return Transformations.distinctUntilChanged(this.AhwBna);
    }

    public static final boolean AEQbTJ(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty();
    }

    public final void EZpvd(String str, @NotNull List<String> list, @NotNull SelectionActionType selectionActionType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(selectionActionType, "");
        this.fetchVPNInfo = str;
        pUU.EZpvd("MultiSelectRelationViewModel", "Set groupId: " + str);
        this.getFieldNames = selectionActionType;
        this.AuCTel = Activity.StateListAnimator.copydefault;
        copydefault(str);
        OLrzqt(list);
        valueOf();
        values();
        AhwBna();
        AhwBna();
    }

    public final void copydefault(String str) {
        this.AYXKKw.setValue(3000);
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectRelationViewModel$loadMaxNumberAsync$1(this, str, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectRelationViewModel$loadMaxNumberAsync$2(this, null), 3, null);
        }
        pUU.EZpvd("MultiSelectRelationViewModel", "Get max number: " + this.AYXKKw.getValue());
    }

    public final void OLrzqt(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt.setValue(CollectionsKt___CollectionsKt.OqFWZa(list));
    }

    public final void OLrzqt(String str) {
        this.ejfBZ.setValue(str);
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectRelationViewModel$observeDataList$1(this, null), 3, null);
    }

    public final List<Object> copydefault(List<C37248oqJ> list, Set<String> set, Set<String> set2, String str) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            ArrayList<C37248oqJ> arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!set2.contains(((C37248oqJ) obj).OLrzqt().getContactsId())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (C37248oqJ c37248oqJ : arrayList2) {
                arrayList3.add(new C37244oqF(c37248oqJ.OLrzqt(), c37248oqJ.KWHzl(), str, OLrzqt(set, set2, c37248oqJ.OLrzqt())));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectRelationViewModel$observeSelectedFriendList$1(this, null), 3, null);
    }

    public final SelectionStatus OLrzqt(Set<String> set, Set<String> set2, RelationInfo relationInfo) {
        Object next;
        boolean zContains = set2.contains(relationInfo.getContactsId());
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) relationInfo.getContactsId(), next)) {
                break;
            }
        }
        boolean z = next != null;
        int size = set.size();
        int size2 = set2.size();
        Integer value = this.fJNWhG.getValue();
        Intrinsics.copydefault(value);
        boolean z2 = size + size2 >= value.intValue();
        if (zContains) {
            return SelectionStatus.COMPLETED;
        }
        if (z) {
            return SelectionStatus.SELECTED;
        }
        if (!z2) {
            return SelectionStatus.UNSELECTED;
        }
        return SelectionStatus.DISABLED;
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectRelationViewModel$getLocalRelationList$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Set<String> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(this.gEmmrt.getValue());
        if (z) {
            int size = setDXXBbs.size();
            Integer value = this.fJNWhG.getValue();
            Intrinsics.copydefault(value);
            if (size >= value.intValue()) {
                pUU.AEQbTJ("Update relation Selection: Reached selection limit");
                return;
            } else {
                this.AuCTel = Activity.StateListAnimator.copydefault;
                setDXXBbs.add(str);
            }
        } else {
            this.AuCTel = Activity.Application.copydefault;
            setDXXBbs.remove(str);
        }
        this.gEmmrt.setValue(setDXXBbs);
    }

    public final void OLrzqt(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MultiSelectRelationViewModel$fetchReferralData$1(this, str, str2, null), 3, null);
    }

    public final void AYXKKw() {
        this.AuCTel = Activity.Application.copydefault;
    }
}
