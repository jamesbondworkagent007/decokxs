package com.okinc.planet.biz_positions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_positions.EcoSelectionBottomSheetV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;
import o.C33070mpX;
import o.C46068tGq;
import o.C46374tRz;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.tGB;
import o.tLY;
import o.tPF;
import o.tQX;
import o.tRM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsHistoryViewModel extends tLY<Unit> {
    public String AEQbTJ;
    public final StateFlow<AbstractC46197tLk<tQX.TaskDescription<C46068tGq>>> AYXKKw;
    public final tGB AhwBna;
    public String EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final MutableStateFlow<AbstractC46197tLk<tQX.TaskDescription<C46068tGq>>> OLrzqt;
    public final /* synthetic */ tRM copydefault;
    public final int djBIcL;
    public final SavedStateHandle gEmmrt;
    public SortType valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.copydefault.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<tQX.TaskDescription<C46068tGq>>> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tGB:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tGB:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:25) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.spnCvw():o.tGB A[MD:():o.tGB (m), WRAPPED] (LINE:25)) : (r2v0 o.tGB))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000e: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:26)) : (r3v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tGB, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:23) call: com.okinc.planet.biz_positions.ProfilePositionsHistoryViewModel.<init>(androidx.lifecycle.SavedStateHandle, o.tGB, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ ProfilePositionsHistoryViewModel(SavedStateHandle savedStateHandle, tGB tgb, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.spnCvw() : tgb, (i & 4) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }

    public ProfilePositionsHistoryViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull tGB tgb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(tgb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = new tRM(savedStateHandle);
        this.gEmmrt = savedStateHandle;
        this.AhwBna = tgb;
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<AbstractC46197tLk<tQX.TaskDescription<C46068tGq>>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        this.djBIcL = 20;
        this.valueOf = SortType.RECENTLY_CLOSED;
    }

    public final List<EcoSelectionBottomSheetV2.Selection<SortType>> OLrzqt() {
        SortType[] sortTypeArrValues = SortType.values();
        ArrayList arrayList = new ArrayList(sortTypeArrValues.length);
        int length = sortTypeArrValues.length;
        for (int i = 0; i < length; i++) {
            SortType sortType = sortTypeArrValues[i];
            arrayList.add(new EcoSelectionBottomSheetV2.Selection(C33070mpX.AYXKKw(sortType.getTitleRes()), sortType, null, sortType == this.valueOf, false, 20, null));
        }
        return arrayList;
    }

    public static /* synthetic */ void loadData$default(ProfilePositionsHistoryViewModel profilePositionsHistoryViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        profilePositionsHistoryViewModel.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        List<C46068tGq> listOLrzqt;
        C46068tGq c46068tGq;
        String strKWHzl = KWHzl();
        if (strKWHzl == null) {
            return;
        }
        tQX.TaskDescription<C46068tGq> taskDescriptionCopydefault = this.OLrzqt.getValue().copydefault();
        String paginationId = z ? (taskDescriptionCopydefault == null || (listOLrzqt = taskDescriptionCopydefault.OLrzqt()) == null || (c46068tGq = (C46068tGq) CollectionsKt___CollectionsKt.wlaJM(listOLrzqt)) == null) ? null : c46068tGq.getPaginationId() : null;
        this.OLrzqt.setValue(AbstractC46197tLk.TaskDescription.loading$default(AbstractC46197tLk.Companion, false, 1, null));
        C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.KWHzl, null, new ProfilePositionsHistoryViewModel$loadData$1(this, strKWHzl, paginationId, z, null), 2, null);
    }

    public final void OLrzqt(@NotNull SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        this.valueOf = sortType;
        loadData$default(this, false, 1, null);
    }

    public final void AEQbTJ(String str, String str2) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
        loadData$default(this, false, 1, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SortType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final Parcelable.Creator<SortType> CREATOR;
        private final int titleRes;
        public static final SortType RECENTLY_CLOSED = new SortType("RECENTLY_CLOSED", 0, C55688xof.Application.ActivityResultContractsRequestMultiplePermissions);
        public static final SortType HIGHEST_PROFIT_RATIO = new SortType("HIGHEST_PROFIT_RATIO", 1, C55688xof.Application.ActivityResultContractsPickVisualMediaVideoOnly);
        public static final SortType LOWEST_PROFIT_RATIO = new SortType("LOWEST_PROFIT_RATIO", 2, C55688xof.Application.ActivityResultContractsPickVisualMediaSingleMimeType);

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<SortType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SortType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return SortType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SortType[] newArray(int i) {
                return new SortType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SortType[] $values() {
            return new SortType[]{RECENTLY_CLOSED, HIGHEST_PROFIT_RATIO, LOWEST_PROFIT_RATIO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SortType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private SortType(@StringRes String str, int i, int i2) {
            this.titleRes = i2;
        }

        static {
            SortType[] sortTypeArr$values = $values();
            $VALUES = sortTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sortTypeArr$values);
            CREATOR = new Creator();
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }
    }
}
