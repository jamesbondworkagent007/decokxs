package com.okinc.buysell.ui.recurring.legacy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanStatus;
import com.okinc.buysell.ui.recurring.detail.mapper.RecurringBuyPlanDetailModelMapper;
import com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C31655lzc;
import o.C31943mJr;
import o.C32866mlf;
import o.C32989mnw;
import o.InterfaceC30225lQm;
import o.InterfaceC30234lQv;
import o.lQE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanDetailLegacyViewModel extends C31943mJr {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableLiveData<C32989mnw<Unit>> AEQbTJ;
    public final MutableLiveData<C32989mnw<InterfaceC30234lQv>> AYXKKw;
    public boolean AhwBna;
    public final LiveData<C32989mnw<Unit>> AkhnZx;
    public String DbNXlk;
    public final MutableLiveData<C32989mnw<Unit>> EZpvd;
    public final MutableLiveData<C32989mnw<Unit>> KWHzl;
    public final MutableLiveData<C32989mnw<InterfaceC30225lQm>> copydefault;
    public final LiveData<C32989mnw<Unit>> djBIcL;
    public final LiveData<C32989mnw<InterfaceC30234lQv>> fARcdN;
    public final C31655lzc fIwbmz;
    public final LiveData<C32989mnw<InterfaceC30225lQm>> fetchVPNInfo;
    public RecurringBuyPlanStatus gEmmrt;
    public final LiveData<C32989mnw<Unit>> isConnected;
    public lQE valueOf;
    public final RecurringBuyPlanDetailModelMapper values;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyPlanStatus.values().length];
            try {
                iArr[RecurringBuyPlanStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyPlanStatus.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringBuyPlanStatus.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<InterfaceC30234lQv>> AhwBna() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<InterfaceC30225lQm>> valueOf() {
        return this.fetchVPNInfo;
    }

    @yCM
    public RecurringBuyPlanDetailLegacyViewModel(@NotNull C31655lzc c31655lzc, @NotNull RecurringBuyPlanDetailModelMapper recurringBuyPlanDetailModelMapper) {
        Intrinsics.checkNotNullParameter(c31655lzc, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailModelMapper, "");
        this.fIwbmz = c31655lzc;
        this.values = recurringBuyPlanDetailModelMapper;
        this.DbNXlk = "";
        MutableLiveData<C32989mnw<InterfaceC30234lQv>> mutableLiveData = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData;
        this.fARcdN = mutableLiveData;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.djBIcL = mutableLiveData2;
        MutableLiveData<C32989mnw<InterfaceC30225lQm>> mutableLiveData3 = new MutableLiveData<>();
        this.copydefault = mutableLiveData3;
        this.fetchVPNInfo = mutableLiveData3;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData4 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData4;
        this.isConnected = mutableLiveData4;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData5 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData5;
        this.AkhnZx = mutableLiveData5;
    }

    public final void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecurringBuyPlanDetailLegacyViewModel$loadPlanDetails$1(z, this, null), 3, null);
    }

    public static /* synthetic */ void onPlanEvent$default(RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel, InterfaceC30225lQm interfaceC30225lQm, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        recurringBuyPlanDetailLegacyViewModel.KWHzl(interfaceC30225lQm, str, str2);
    }

    public final void KWHzl(@NotNull InterfaceC30225lQm interfaceC30225lQm, String str, String str2) {
        Intrinsics.checkNotNullParameter(interfaceC30225lQm, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecurringBuyPlanDetailLegacyViewModel$onPlanEvent$1(str, str2, this, interfaceC30225lQm, null), 3, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC30225lQm interfaceC30225lQmEZpvd = EZpvd();
        if (interfaceC30225lQmEZpvd == null) {
            return;
        }
        onPlanEvent$default(this, interfaceC30225lQmEZpvd, str, null, 4, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC30225lQm interfaceC30225lQmEZpvd = EZpvd();
        if (interfaceC30225lQmEZpvd == null) {
            return;
        }
        onPlanEvent$default(this, interfaceC30225lQmEZpvd, null, str, 2, null);
    }

    public final InterfaceC30225lQm EZpvd() {
        RecurringBuyPlanStatus recurringBuyPlanStatus = this.gEmmrt;
        int i = recurringBuyPlanStatus == null ? -1 : StateListAnimator.AEQbTJ[recurringBuyPlanStatus.ordinal()];
        if (i == 1) {
            return InterfaceC30225lQm.TaskDescription.AEQbTJ;
        }
        if (i != 2) {
            return null;
        }
        return InterfaceC30225lQm.Application.EZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecurringBuyPlanDetailLegacyViewModel$loadData$1(this, str, null), 3, null);
    }

    public final void OLrzqt(final InterfaceC30225lQm interfaceC30225lQm) {
        C32866mlf.onEvent$default("Simpletrade_RecurringBuy_PlanDetailsPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.lRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailLegacyViewModel.EZpvd(interfaceC30225lQm, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit EZpvd(InterfaceC30225lQm interfaceC30225lQm, EventParamsList eventParamsList) {
        String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (Intrinsics.EZpvd(interfaceC30225lQm, InterfaceC30225lQm.ActionBar.AEQbTJ)) {
            str = "Cancel";
        } else if (Intrinsics.EZpvd(interfaceC30225lQm, InterfaceC30225lQm.TaskDescription.AEQbTJ)) {
            str = "Pause";
        } else {
            if (!Intrinsics.EZpvd(interfaceC30225lQm, InterfaceC30225lQm.Application.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Resume";
        }
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Simpletrade_RecurringBuy_PlanDetailsPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.lRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyPlanDetailLegacyViewModel.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit KWHzl(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanDetailLegacyViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
