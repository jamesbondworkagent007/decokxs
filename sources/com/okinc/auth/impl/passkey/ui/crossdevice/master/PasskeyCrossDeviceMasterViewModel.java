package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterActivity;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterViewModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C56392yDr;
import o.C5691aBJ;
import o.C58761zOi;
import o.C58893zTh;
import o.InterfaceC56387yDm;
import o.InterfaceC58765zOm;
import o.InterfaceC58767zOo;
import o.pTA;
import o.pUU;
import o.yCM;
import o.zAT;
import o.zOZ;
import org.jetbrains.annotations.NotNull;
import uniffi.account.CrossAuthorizationSyncClick;
import uniffi.account.PasskeyVerifyType;
import uniffi.account.TriggerPlatform;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceMasterViewModel extends AbstractC33073mpa implements InterfaceC58767zOo {
    public final InterfaceC58765zOm AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final C5691aBJ AkhnZx;
    public final SavedStateHandle AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final MutableLiveData<Boolean> EZpvd;
    public final MutableSharedFlow<C58761zOi> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<Unit> djBIcL;
    public final C58893zTh ejfBZ;
    public C58761zOi fARcdN;
    public final SharedFlow<Unit> fIwbmz;
    public boolean fJNWhG;
    public final zOZ fetchVPNInfo;
    public final LiveData<Boolean> gEmmrt;
    public final SharedFlow<Unit> isConnected;
    public final SharedFlow<Unit> iwGUEr;
    public final SharedFlow<C58761zOi> valueOf;
    public boolean values;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final String AEQbTJ = "PasskeyCrossDeviceMasterViewModel";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58761zOi AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AhwBna() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C58761zOi> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.fIwbmz;
    }

    @yCM
    public PasskeyCrossDeviceMasterViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5691aBJ c5691aBJ, @NotNull zOZ zoz, @NotNull InterfaceC58765zOm interfaceC58765zOm, @NotNull C58893zTh c58893zTh) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5691aBJ, "");
        Intrinsics.checkNotNullParameter(zoz, "");
        Intrinsics.checkNotNullParameter(interfaceC58765zOm, "");
        Intrinsics.checkNotNullParameter(c58893zTh, "");
        this.AuCTel = savedStateHandle;
        this.AkhnZx = c5691aBJ;
        this.fetchVPNInfo = zoz;
        this.AYXKKw = interfaceC58765zOm;
        this.ejfBZ = c58893zTh;
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.aIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeyCrossDeviceMasterViewModel.fetchVPNInfo(this.copydefault);
            }
        });
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default2;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<C58761zOi> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default4;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        this.fJNWhG = true;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.gEmmrt = mutableLiveData;
    }

    public final PasskeyCrossDeviceMasterActivity.Input copydefault() {
        return (PasskeyCrossDeviceMasterActivity.Input) this.DbNXlk.getValue();
    }

    public static final PasskeyCrossDeviceMasterActivity.Input fetchVPNInfo(PasskeyCrossDeviceMasterViewModel passkeyCrossDeviceMasterViewModel) {
        Object obj = passkeyCrossDeviceMasterViewModel.AuCTel.get("KEY_INPUT");
        if (obj != null) {
            return (PasskeyCrossDeviceMasterActivity.Input) obj;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void valueOf() {
        this.AYXKKw.OLrzqt(this);
    }

    public final Job isConnected() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceMasterViewModel$startConnecting$1(this, null), 3, null);
    }

    public final Job fetchVPNInfo() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceMasterViewModel$startApprove$1(this, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        this.values = z;
        DbNXlk();
    }

    public final Job DbNXlk() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceMasterViewModel$updateApproveButtonState$1(this, null), 3, null);
    }

    public final boolean copydefault(C58761zOi c58761zOi) {
        boolean zOLrzqt = c58761zOi.OLrzqt();
        return c58761zOi.KWHzl().EZpvd() ? zOLrzqt : zOLrzqt && this.values;
    }

    public final void EZpvd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceMasterViewModel$approve$1(this, context, null), 3, null);
    }

    public final Job AEQbTJ() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceMasterViewModel$close$1(this, null), 3, null);
    }

    @Override // o.InterfaceC58767zOo
    public void KWHzl(@NotNull C58761zOi c58761zOi) {
        Intrinsics.checkNotNullParameter(c58761zOi, "");
        pUU.KWHzl(AEQbTJ, "onChanged(AuthenticateState) state: " + c58761zOi);
        this.fARcdN = c58761zOi;
        DbNXlk();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceMasterViewModel$onChanged$1(this, c58761zOi, null), 3, null);
    }

    public final String AEQbTJ(Long l) {
        return (l == null || l.longValue() <= 0) ? "-" : pTA.formatSimpleDateTime$default(new Date(l.longValue()), null, 1, null);
    }

    public final void gEmmrt() {
        this.ejfBZ.EZpvd(copydefault().AEQbTJ() ? PasskeyVerifyType.SYNC : PasskeyVerifyType.CROSS_DEVICE_VERIFY, copydefault().EZpvd() instanceof zAT.Activity ? TriggerPlatform.WEB : TriggerPlatform.APP);
    }

    public final void AkhnZx() {
        this.ejfBZ.AEQbTJ(copydefault().AEQbTJ() ? PasskeyVerifyType.SYNC : PasskeyVerifyType.CROSS_DEVICE_VERIFY, copydefault().EZpvd() instanceof zAT.Activity ? TriggerPlatform.WEB : TriggerPlatform.APP);
    }

    public final void EZpvd(boolean z) {
        CrossAuthorizationSyncClick crossAuthorizationSyncClick;
        PasskeyVerifyType passkeyVerifyType;
        boolean z2 = copydefault().EZpvd() instanceof zAT.Activity;
        if (z2) {
            crossAuthorizationSyncClick = CrossAuthorizationSyncClick.WEB;
        } else if (this.fJNWhG || copydefault().AEQbTJ()) {
            crossAuthorizationSyncClick = CrossAuthorizationSyncClick.APP_YES;
        } else {
            crossAuthorizationSyncClick = CrossAuthorizationSyncClick.APP_NO;
        }
        if (copydefault().AEQbTJ()) {
            passkeyVerifyType = PasskeyVerifyType.SYNC;
        } else if (z) {
            passkeyVerifyType = PasskeyVerifyType.CROSS_DEVICE_IP_DOES_NOT_MATCH;
        } else {
            passkeyVerifyType = PasskeyVerifyType.CROSS_DEVICE_VERIFY;
        }
        this.ejfBZ.EZpvd(crossAuthorizationSyncClick, passkeyVerifyType, z2 ? TriggerPlatform.WEB : TriggerPlatform.APP);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.AYXKKw.OLrzqt();
        this.fetchVPNInfo.KWHzl();
        super.onCleared();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
