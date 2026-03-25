package com.okinc.im.imui.group.announcement.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35789oDt;
import o.C35791oDv;
import o.C35793oDx;
import o.C37721ozF;
import o.C44157sFk;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateEditNoticeViewModel extends ViewModel {
    public final C35791oDv AYXKKw;
    public final MutableSharedFlow<GroupAnnouncementInfo> AhwBna;
    public final SharedFlow<String> AkhnZx;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<Integer> copydefault;
    public final SharedFlow<Integer> djBIcL;
    public final SharedFlow<Unit> ejfBZ;
    public final C35793oDx fetchVPNInfo;
    public final C35789oDt gEmmrt;
    public final SharedFlow<GroupAnnouncementInfo> isConnected;
    public final MutableSharedFlow<Unit> valueOf;
    public final SharedFlow<Unit> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<GroupAnnouncementInfo> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.ejfBZ;
    }

    @yCM
    public CreateEditNoticeViewModel(@NotNull C35789oDt c35789oDt, @NotNull C35791oDv c35791oDv, @NotNull C35793oDx c35793oDx) {
        Intrinsics.checkNotNullParameter(c35789oDt, "");
        Intrinsics.checkNotNullParameter(c35791oDv, "");
        Intrinsics.checkNotNullParameter(c35793oDx, "");
        this.gEmmrt = c35789oDt;
        this.AYXKKw = c35791oDv;
        this.fetchVPNInfo = c35793oDx;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.OLrzqt = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.KWHzl = mutableSharedFlowAEQbTJ;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableSharedFlow<GroupAnnouncementInfo> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.AhwBna = mutableSharedFlowAEQbTJ2;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.valueOf = mutableSharedFlowAEQbTJ3;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        MutableSharedFlow<Integer> mutableSharedFlowAEQbTJ4 = C37721ozF.AEQbTJ();
        this.copydefault = mutableSharedFlowAEQbTJ4;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ4);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ5 = C37721ozF.AEQbTJ();
        this.EZpvd = mutableSharedFlowAEQbTJ5;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ5);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.announcement.viewmodel.CreateEditNoticeViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.tryEmit(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreateEditNoticeViewModel$createNotice$1(this, str, str2, null), 3, null);
    }

    public static /* synthetic */ void editNotice$default(CreateEditNoticeViewModel createEditNoticeViewModel, String str, long j, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createEditNoticeViewModel.copydefault(str, j, str2);
    }

    public final void copydefault(@NotNull String str, long j, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.tryEmit(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreateEditNoticeViewModel$editNotice$1(this, str, j, str2, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreateEditNoticeViewModel$checkAnnouncementCount$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(Throwable th) {
        Integer numOLrzqt = C44157sFk.OLrzqt(th);
        if (numOLrzqt != null && numOLrzqt.intValue() == 2028) {
            this.EZpvd.tryEmit(Unit.INSTANCE);
            return;
        }
        String message = th.getMessage();
        if (message != null) {
            this.KWHzl.tryEmit(message);
        }
    }
}
