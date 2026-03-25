package com.okinc.im.imui.group.groupentry;

import androidx.annotation.StringRes;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import com.okinc.okimcore.model.remote.GroupEntryCurrency;
import com.okinc.okimcore.model.remote.GroupEntryCurrencyListResponse;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC44412sOw;
import o.AbstractC44413sOx;
import o.AbstractC44414sOy;
import o.C33129mqd;
import o.C35399nuc;
import o.C35790oDu;
import o.C35795oDz;
import o.C37721ozF;
import o.C55276xgr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDC;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupEntryConfigurationViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<GroupEntryAssetVerification> AEQbTJ;
    public final Flow<StateListAnimator> AYXKKw;
    public final List<ActionBar> AhwBna;
    public final StateFlow<Boolean> AkhnZx;
    public final SavedStateHandle DbNXlk;
    public final MutableStateFlow<GroupEntryCurrencyListResponse> EZpvd;
    public String KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<GroupEntryCreateVerificationRequestResponse> djBIcL;
    public final SharedFlow<Application> fARcdN;
    public final StateFlow<Fragment> fIwbmz;
    public final C35790oDu fetchVPNInfo;
    public final MutableSharedFlow<Application> gEmmrt;
    public final C35795oDz isConnected;
    public final MutableStateFlow<Fragment> valueOf;
    public final oDC values;

    public final /* synthetic */ class FragmentManager {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupEntryAssetVerificationType.values().length];
            try {
                iArr[GroupEntryAssetVerificationType.ASSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupEntryAssetVerificationType.TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<StateListAnimator> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> KWHzl() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActionBar> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Fragment> copydefault() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> djBIcL() {
        return this.AkhnZx;
    }

    @yCM
    public GroupEntryConfigurationViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDC odc, @NotNull C35790oDu c35790oDu, @NotNull C35795oDz c35795oDz) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odc, "");
        Intrinsics.checkNotNullParameter(c35790oDu, "");
        Intrinsics.checkNotNullParameter(c35795oDz, "");
        this.DbNXlk = savedStateHandle;
        this.values = odc;
        this.fetchVPNInfo = c35790oDu;
        this.isConnected = c35795oDz;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<GroupEntryCreateVerificationRequestResponse> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = MutableStateFlow2;
        MutableStateFlow<GroupEntryCurrencyListResponse> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow3;
        MutableStateFlow<GroupEntryAssetVerification> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow4;
        MutableStateFlow<Fragment> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow5;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow5);
        MutableSharedFlow<Application> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.gEmmrt = mutableSharedFlowAEQbTJ;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        this.KWHzl = "";
        this.AYXKKw = FlowKt.combine(MutableStateFlow2, MutableStateFlow4, MutableStateFlow3, new GroupEntryConfigurationViewModel$assetsConfigDetail$1(this, null));
        this.AhwBna = yDY.gEmmrt(new ActionBar(GroupEntryAssetVerificationType.ASSET, C35399nuc.LoaderManager.ddhgMB), new ActionBar(GroupEntryAssetVerificationType.TOKEN, C35399nuc.LoaderManager.AkhnZx));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long gEmmrt() {
        Long l = (Long) this.DbNXlk.get("GROUP_ID");
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupEntryConfigurationViewModel$init$1(this, null), 3, null);
    }

    public final GroupEntryCurrency AEQbTJ(GroupEntryAssetVerification groupEntryAssetVerification) {
        Object next;
        List<GroupEntryCurrency> listOLrzqt = OLrzqt(groupEntryAssetVerification != null ? groupEntryAssetVerification.getAssetVerificationType() : null);
        if (this.AEQbTJ.getValue() == null) {
            if (listOLrzqt != null) {
                return (GroupEntryCurrency) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt);
            }
            return null;
        }
        if (listOLrzqt != null) {
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer currencyId = ((GroupEntryCurrency) next).getCurrencyId();
                GroupEntryAssetVerification value = this.AEQbTJ.getValue();
                if (Intrinsics.EZpvd(currencyId, value != null ? value.getCurrencyId() : null)) {
                    break;
                }
            }
            GroupEntryCurrency groupEntryCurrency = (GroupEntryCurrency) next;
            if (groupEntryCurrency != null) {
                return groupEntryCurrency;
            }
        }
        GroupEntryAssetVerification value2 = this.AEQbTJ.getValue();
        String currencyCode = value2 != null ? value2.getCurrencyCode() : null;
        GroupEntryAssetVerification value3 = this.AEQbTJ.getValue();
        return new GroupEntryCurrency(currencyCode, value3 != null ? value3.getCurrencyId() : null, "", "", "", 0, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(AbstractC44412sOw abstractC44412sOw, AbstractC44413sOx abstractC44413sOx, Continuation<? super Unit> continuation) throws Throwable {
        GroupEntryConfigurationViewModel$handleVerificationResult$1 groupEntryConfigurationViewModel$handleVerificationResult$1;
        GroupEntryCurrencyListResponse groupEntryCurrencyListResponseEZpvd;
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel;
        GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse;
        GroupEntryCurrencyListResponse groupEntryCurrencyListResponse;
        Fragment.StateListAnimator stateListAnimator;
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModel2;
        String strGEmmrt;
        if (continuation instanceof GroupEntryConfigurationViewModel$handleVerificationResult$1) {
            groupEntryConfigurationViewModel$handleVerificationResult$1 = (GroupEntryConfigurationViewModel$handleVerificationResult$1) continuation;
            int i = groupEntryConfigurationViewModel$handleVerificationResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupEntryConfigurationViewModel$handleVerificationResult$1.label = i - Integer.MIN_VALUE;
            } else {
                groupEntryConfigurationViewModel$handleVerificationResult$1 = new GroupEntryConfigurationViewModel$handleVerificationResult$1(this, continuation);
            }
        }
        Object obj = groupEntryConfigurationViewModel$handleVerificationResult$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupEntryConfigurationViewModel$handleVerificationResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (abstractC44412sOw instanceof AbstractC44412sOw.Activity) {
                GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponseKWHzl = ((AbstractC44412sOw.Activity) abstractC44412sOw).KWHzl();
                GroupEntryAssetVerification assetVerification = groupEntryCreateVerificationRequestResponseKWHzl.getAssetVerification();
                boolean z = (assetVerification != null ? assetVerification.getAssetVerificationStatus() : null) == GroupEntryAssetsVerificationStatus.ENABLED;
                if (abstractC44413sOx instanceof AbstractC44413sOx.TaskDescription) {
                    groupEntryCurrencyListResponseEZpvd = ((AbstractC44413sOx.TaskDescription) abstractC44413sOx).EZpvd();
                } else {
                    if (!(abstractC44413sOx instanceof AbstractC44413sOx.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    groupEntryCurrencyListResponseEZpvd = null;
                }
                MutableStateFlow<Boolean> mutableStateFlow = this.OLrzqt;
                Boolean boolKWHzl = C56443yFo.KWHzl(z);
                groupEntryConfigurationViewModel$handleVerificationResult$1.L$0 = this;
                groupEntryConfigurationViewModel$handleVerificationResult$1.L$1 = groupEntryCreateVerificationRequestResponseKWHzl;
                groupEntryConfigurationViewModel$handleVerificationResult$1.L$2 = groupEntryCurrencyListResponseEZpvd;
                groupEntryConfigurationViewModel$handleVerificationResult$1.label = 1;
                if (mutableStateFlow.emit(boolKWHzl, groupEntryConfigurationViewModel$handleVerificationResult$1) == objCopydefault) {
                    return objCopydefault;
                }
                groupEntryConfigurationViewModel = this;
                GroupEntryCurrencyListResponse groupEntryCurrencyListResponse2 = groupEntryCurrencyListResponseEZpvd;
                groupEntryCreateVerificationRequestResponse = groupEntryCreateVerificationRequestResponseKWHzl;
                groupEntryCurrencyListResponse = groupEntryCurrencyListResponse2;
                stateListAnimator = Fragment.StateListAnimator.copydefault;
                groupEntryConfigurationViewModel$handleVerificationResult$1.L$0 = groupEntryConfigurationViewModel;
                groupEntryConfigurationViewModel$handleVerificationResult$1.L$1 = groupEntryCreateVerificationRequestResponse;
                groupEntryConfigurationViewModel$handleVerificationResult$1.L$2 = groupEntryCurrencyListResponse;
                groupEntryConfigurationViewModel$handleVerificationResult$1.label = 2;
                if (groupEntryConfigurationViewModel.AEQbTJ(stateListAnimator, groupEntryConfigurationViewModel$handleVerificationResult$1) != objCopydefault) {
                }
            } else {
                if (!(abstractC44412sOw instanceof AbstractC44412sOw.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC44412sOw.TaskDescription taskDescription = (AbstractC44412sOw.TaskDescription) abstractC44412sOw;
                pUU.KWHzl("GroupEntryConfigurationViewModel", taskDescription.OLrzqt() + ": " + taskDescription.KWHzl());
                Fragment.Activity activity = Fragment.Activity.copydefault;
                groupEntryConfigurationViewModel$handleVerificationResult$1.label = 3;
                if (AEQbTJ(activity, groupEntryConfigurationViewModel$handleVerificationResult$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else if (i2 == 1) {
            groupEntryCurrencyListResponse = (GroupEntryCurrencyListResponse) groupEntryConfigurationViewModel$handleVerificationResult$1.L$2;
            groupEntryCreateVerificationRequestResponse = (GroupEntryCreateVerificationRequestResponse) groupEntryConfigurationViewModel$handleVerificationResult$1.L$1;
            groupEntryConfigurationViewModel = (GroupEntryConfigurationViewModel) groupEntryConfigurationViewModel$handleVerificationResult$1.L$0;
            C56391yDq.AEQbTJ(obj);
            stateListAnimator = Fragment.StateListAnimator.copydefault;
            groupEntryConfigurationViewModel$handleVerificationResult$1.L$0 = groupEntryConfigurationViewModel;
            groupEntryConfigurationViewModel$handleVerificationResult$1.L$1 = groupEntryCreateVerificationRequestResponse;
            groupEntryConfigurationViewModel$handleVerificationResult$1.L$2 = groupEntryCurrencyListResponse;
            groupEntryConfigurationViewModel$handleVerificationResult$1.label = 2;
            if (groupEntryConfigurationViewModel.AEQbTJ(stateListAnimator, groupEntryConfigurationViewModel$handleVerificationResult$1) != objCopydefault) {
                return objCopydefault;
            }
            groupEntryConfigurationViewModel2 = groupEntryConfigurationViewModel;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            groupEntryCurrencyListResponse = (GroupEntryCurrencyListResponse) groupEntryConfigurationViewModel$handleVerificationResult$1.L$2;
            groupEntryCreateVerificationRequestResponse = (GroupEntryCreateVerificationRequestResponse) groupEntryConfigurationViewModel$handleVerificationResult$1.L$1;
            groupEntryConfigurationViewModel2 = (GroupEntryConfigurationViewModel) groupEntryConfigurationViewModel$handleVerificationResult$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        groupEntryConfigurationViewModel2.djBIcL.setValue(groupEntryCreateVerificationRequestResponse);
        groupEntryConfigurationViewModel2.AEQbTJ.setValue(groupEntryCreateVerificationRequestResponse.getAssetVerification());
        groupEntryConfigurationViewModel2.EZpvd.setValue(groupEntryCurrencyListResponse);
        GroupEntryCurrency groupEntryCurrencyAEQbTJ = groupEntryConfigurationViewModel2.AEQbTJ(groupEntryConfigurationViewModel2.AEQbTJ.getValue());
        GroupEntryAssetVerification assetVerification2 = groupEntryCreateVerificationRequestResponse.getAssetVerification();
        if (C33129mqd.OLrzqt((CharSequence) (assetVerification2 != null ? assetVerification2.getAssetAmount() : null))) {
            GroupEntryAssetVerification assetVerification3 = groupEntryCreateVerificationRequestResponse.getAssetVerification();
            strGEmmrt = assetVerification3 != null ? assetVerification3.getAssetAmount() : null;
            if (strGEmmrt == null) {
                strGEmmrt = "";
            }
        } else {
            strGEmmrt = C33129mqd.gEmmrt(groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getMinAmount() : null);
        }
        groupEntryConfigurationViewModel2.KWHzl = strGEmmrt;
        return Unit.INSTANCE;
    }

    public final List<GroupEntryCurrency> OLrzqt(GroupEntryAssetVerificationType groupEntryAssetVerificationType) {
        int i = groupEntryAssetVerificationType == null ? -1 : FragmentManager.EZpvd[groupEntryAssetVerificationType.ordinal()];
        if (i == 1) {
            GroupEntryCurrencyListResponse value = this.EZpvd.getValue();
            if (value != null) {
                return value.getAssetList();
            }
        } else if (i == 2) {
            GroupEntryCurrencyListResponse value2 = this.EZpvd.getValue();
            if (value2 != null) {
                return value2.getTokenList();
            }
        } else {
            GroupEntryCurrencyListResponse value3 = this.EZpvd.getValue();
            if (value3 != null) {
                return value3.getAssetList();
            }
        }
        return null;
    }

    public final void OLrzqt(boolean z) {
        this.OLrzqt.setValue(Boolean.valueOf(z));
    }

    public final void AEQbTJ(GroupEntryAssetVerificationType groupEntryAssetVerificationType) {
        GroupEntryCurrency groupEntryCurrency;
        GroupEntryCurrency groupEntryCurrency2;
        GroupEntryCurrency groupEntryCurrency3;
        List<GroupEntryCurrency> listOLrzqt = OLrzqt(groupEntryAssetVerificationType);
        this.KWHzl = "";
        MutableStateFlow<GroupEntryAssetVerification> mutableStateFlow = this.AEQbTJ;
        GroupEntryAssetVerification value = mutableStateFlow.getValue();
        String currencyCode = null;
        GroupEntryAssetsVerificationStatus assetVerificationStatus = value != null ? value.getAssetVerificationStatus() : null;
        Integer currencyId = (listOLrzqt == null || (groupEntryCurrency3 = (GroupEntryCurrency) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null) ? null : groupEntryCurrency3.getCurrencyId();
        String minAmount = (listOLrzqt == null || (groupEntryCurrency2 = (GroupEntryCurrency) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) == null) ? null : groupEntryCurrency2.getMinAmount();
        if (listOLrzqt != null && (groupEntryCurrency = (GroupEntryCurrency) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt)) != null) {
            currencyCode = groupEntryCurrency.getCurrencyCode();
        }
        mutableStateFlow.setValue(new GroupEntryAssetVerification(assetVerificationStatus, groupEntryAssetVerificationType, currencyId, minAmount, currencyCode));
    }

    public final void KWHzl(GroupEntryCurrency groupEntryCurrency) {
        this.KWHzl = "";
        MutableStateFlow<GroupEntryAssetVerification> mutableStateFlow = this.AEQbTJ;
        GroupEntryAssetVerification value = mutableStateFlow.getValue();
        GroupEntryAssetsVerificationStatus assetVerificationStatus = value != null ? value.getAssetVerificationStatus() : null;
        GroupEntryAssetVerification value2 = this.AEQbTJ.getValue();
        mutableStateFlow.setValue(new GroupEntryAssetVerification(assetVerificationStatus, value2 != null ? value2.getAssetVerificationType() : null, groupEntryCurrency != null ? groupEntryCurrency.getCurrencyId() : null, groupEntryCurrency != null ? groupEntryCurrency.getMinAmount() : null, groupEntryCurrency != null ? groupEntryCurrency.getCurrencyCode() : null));
    }

    public final void AEQbTJ(GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, String str3, String str4) {
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str3);
        if (C33129mqd.gEmmrt(bigDecimalEZpvd.toPlainString(), str) || C33129mqd.AEQbTJ(bigDecimalEZpvd.toPlainString(), str2)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupEntryConfigurationViewModel$saveJoinRequirement$1(this, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupEntryConfigurationViewModel$saveJoinRequirement$2(this, new GroupEntryAssetVerification(GroupEntryAssetsVerificationStatus.ENABLED, groupEntryAssetVerificationType, num, str3, str4), null), 3, null);
        }
    }

    public final void KWHzl(GroupEntryAssetVerification groupEntryAssetVerification) {
        this.djBIcL.setValue(new GroupEntryCreateVerificationRequestResponse(Long.valueOf(gEmmrt()), (Integer) 1, groupEntryAssetVerification, (GroupEntryBillingModel) null, 8, (DefaultConstructorMarker) null));
        MutableStateFlow<GroupEntryAssetVerification> mutableStateFlow = this.AEQbTJ;
        GroupEntryCreateVerificationRequestResponse value = this.djBIcL.getValue();
        mutableStateFlow.setValue(value != null ? value.getAssetVerification() : null);
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupEntryConfigurationViewModel$turnOffJoinRequirement$1(this, null), 3, null);
    }

    public final Object AEQbTJ(Fragment fragment, Continuation<? super Unit> continuation) {
        Object objEmit = this.valueOf.emit(fragment, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        public final GroupEntryAssetVerification EZpvd;
        public final List<C55276xgr> OLrzqt;
        public final Activity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, GroupEntryAssetVerification groupEntryAssetVerification, Activity activity, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                groupEntryAssetVerification = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                activity = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                list = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(groupEntryAssetVerification, activity, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(GroupEntryAssetVerification groupEntryAssetVerification, Activity activity, List<C55276xgr> list) {
            return new StateListAnimator(groupEntryAssetVerification, activity, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<C55276xgr> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryAssetVerification copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            GroupEntryAssetVerification groupEntryAssetVerification = this.EZpvd;
            int iHashCode = groupEntryAssetVerification == null ? 0 : groupEntryAssetVerification.hashCode();
            Activity activity = this.copydefault;
            int iHashCode2 = activity == null ? 0 : activity.hashCode();
            List<C55276xgr> list = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AssetsConfigDetail(verificationDetails=" + this.EZpvd + ", selectedAssets=" + this.copydefault + ", currencyList=" + this.OLrzqt + ")";
        }

        public StateListAnimator(GroupEntryAssetVerification groupEntryAssetVerification, Activity activity, List<C55276xgr> list) {
            this.EZpvd = groupEntryAssetVerification;
            this.copydefault = activity;
            this.OLrzqt = list;
        }
    }

    public static final class Activity {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final String AhwBna;
        public final String EZpvd;
        public final String KWHzl;
        public final GroupEntryAssetVerificationType OLrzqt;
        public final GroupEntryAssetsVerificationStatus copydefault;
        public final Integer gEmmrt;
        public final Integer valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(Integer num, GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, String str, String str2, String str3, String str4, String str5, Integer num2) {
            return new Activity(num, groupEntryAssetsVerificationStatus, groupEntryAssetVerificationType, str, str2, str3, str4, str5, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryAssetVerificationType KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer OLrzqt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.AYXKKw;
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
            return Intrinsics.EZpvd(this.valueOf, activity.valueOf) && this.copydefault == activity.copydefault && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) activity.AhwBna) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) activity.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, activity.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.valueOf;
            int iHashCode = num == null ? 0 : num.hashCode();
            GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus = this.copydefault;
            int iHashCode2 = groupEntryAssetsVerificationStatus == null ? 0 : groupEntryAssetsVerificationStatus.hashCode();
            GroupEntryAssetVerificationType groupEntryAssetVerificationType = this.OLrzqt;
            int iHashCode3 = groupEntryAssetVerificationType == null ? 0 : groupEntryAssetVerificationType.hashCode();
            String str = this.EZpvd;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AEQbTJ;
            int iHashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.AhwBna;
            int iHashCode7 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.AYXKKw;
            int iHashCode8 = str5 == null ? 0 : str5.hashCode();
            Integer num2 = this.gEmmrt;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectedAssetsDisplayModel(currencyId=" + this.valueOf + ", assetVerificationStatus=" + this.copydefault + ", assetVerificationType=" + this.OLrzqt + ", assetAmount=" + this.EZpvd + ", currencyCode=" + this.KWHzl + ", currencyFullName=" + this.AEQbTJ + ", minAmount=" + this.AhwBna + ", maxAmount=" + this.AYXKKw + ", decimalPoint=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.AhwBna;
        }

        public Activity(Integer num, GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, String str, String str2, String str3, String str4, String str5, Integer num2) {
            this.valueOf = num;
            this.copydefault = groupEntryAssetsVerificationStatus;
            this.OLrzqt = groupEntryAssetVerificationType;
            this.EZpvd = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
            this.AhwBna = str4;
            this.AYXKKw = str5;
            this.gEmmrt = num2;
        }
    }

    public static final class ActionBar {
        public final int KWHzl;
        public final GroupEntryAssetVerificationType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, GroupEntryAssetVerificationType groupEntryAssetVerificationType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                groupEntryAssetVerificationType = actionBar.copydefault;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.KWHzl;
            }
            return actionBar.OLrzqt(groupEntryAssetVerificationType, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryAssetVerificationType AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull GroupEntryAssetVerificationType groupEntryAssetVerificationType, @StringRes int i) {
            Intrinsics.checkNotNullParameter(groupEntryAssetVerificationType, "");
            return new ActionBar(groupEntryAssetVerificationType, i);
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
            return this.copydefault == actionBar.copydefault && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AssetsSelectionListModel(assetVerificationType=" + this.copydefault + ", resInt=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull GroupEntryAssetVerificationType groupEntryAssetVerificationType, @StringRes int i) {
            Intrinsics.checkNotNullParameter(groupEntryAssetVerificationType, "");
            this.copydefault = groupEntryAssetVerificationType;
            this.KWHzl = i;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Fragment {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel.Fragment.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Fragment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Fragment {
            public static final Application copydefault = new Application();

            private Application() {
                super(null);
            }
        }

        private Fragment() {
        }

        public static final class StateListAnimator extends Fragment {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        public static final class Activity extends Fragment {
            public static final Activity copydefault = new Activity();

            private Activity() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0419Application extends Application {
            public static final int EZpvd = AbstractC44414sOy.EZpvd;
            public final AbstractC44414sOy KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0419Application copy$default(C0419Application c0419Application, AbstractC44414sOy abstractC44414sOy, int i, Object obj) {
                if ((i & 1) != 0) {
                    abstractC44414sOy = c0419Application.KWHzl;
                }
                return c0419Application.AEQbTJ(abstractC44414sOy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0419Application AEQbTJ(@NotNull AbstractC44414sOy abstractC44414sOy) {
                Intrinsics.checkNotNullParameter(abstractC44414sOy, "");
                return new C0419Application(abstractC44414sOy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC44414sOy copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0419Application) && Intrinsics.EZpvd(this.KWHzl, ((C0419Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SaveConfigResult(apiResult=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0419Application(@NotNull AbstractC44414sOy abstractC44414sOy) {
                super(null);
                Intrinsics.checkNotNullParameter(abstractC44414sOy, "");
                this.KWHzl = abstractC44414sOy;
            }
        }

        private Application() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends Application {
            public static final int copydefault = AbstractC44414sOy.EZpvd;
            public final AbstractC44414sOy AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AbstractC44414sOy abstractC44414sOy, int i, Object obj) {
                if ((i & 1) != 0) {
                    abstractC44414sOy = actionBar.AEQbTJ;
                }
                return actionBar.AEQbTJ(abstractC44414sOy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull AbstractC44414sOy abstractC44414sOy) {
                Intrinsics.checkNotNullParameter(abstractC44414sOy, "");
                return new ActionBar(abstractC44414sOy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC44414sOy AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TurnOffConfig(apiResult=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull AbstractC44414sOy abstractC44414sOy) {
                super(null);
                Intrinsics.checkNotNullParameter(abstractC44414sOy, "");
                this.AEQbTJ = abstractC44414sOy;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Activity extends Application {
            public static final Activity KWHzl = new Activity();

            private Activity() {
                super(null);
            }
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
