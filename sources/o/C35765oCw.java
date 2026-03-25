package o;

import com.okinc.im.usecase.chatsettings.UpdateChatSettingsUseCase$updateChatSettings$1;
import com.okinc.im.usecase.chatsettings.UpdateChatSettingsUseCase$updateChatSettings$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35765oCw {
    public final sFU AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC44177sGd copydefault;

    @yCM
    public C35765oCw(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull sFU sfu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC44177sGd;
        this.AEQbTJ = sfu;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, boolean z, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UpdateChatSettingsUseCase$updateChatSettings$1 updateChatSettingsUseCase$updateChatSettings$1;
        if (continuation instanceof UpdateChatSettingsUseCase$updateChatSettings$1) {
            updateChatSettingsUseCase$updateChatSettings$1 = (UpdateChatSettingsUseCase$updateChatSettings$1) continuation;
            int i2 = updateChatSettingsUseCase$updateChatSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateChatSettingsUseCase$updateChatSettings$1.label = i2 - Integer.MIN_VALUE;
            } else {
                updateChatSettingsUseCase$updateChatSettings$1 = new UpdateChatSettingsUseCase$updateChatSettings$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateChatSettingsUseCase$updateChatSettings$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = updateChatSettingsUseCase$updateChatSettings$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                UpdateChatSettingsUseCase$updateChatSettings$2 updateChatSettingsUseCase$updateChatSettings$2 = new UpdateChatSettingsUseCase$updateChatSettings$2(this, i, z, null);
                updateChatSettingsUseCase$updateChatSettings$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, updateChatSettingsUseCase$updateChatSettings$2, updateChatSettingsUseCase$updateChatSettings$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            return ((Result) objWithContext).m7386unboximpl();
        } catch (java.lang.Exception e) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
    }

    public final void KWHzl(int i, boolean z) {
        com.okinc.okimcore.model.remote.UserInfo userInfoOLrzqt = this.AEQbTJ.OLrzqt();
        if (userInfoOLrzqt != null) {
            if (i == 1) {
                this.AEQbTJ.EZpvd(userInfoOLrzqt.copy((524287 & 1) != 0 ? userInfoOLrzqt.identifyId : null, (524287 & 2) != 0 ? userInfoOLrzqt.avatar : null, (524287 & 4) != 0 ? userInfoOLrzqt.avatarStatus : null, (524287 & 8) != 0 ? userInfoOLrzqt.petname : null, (524287 & 16) != 0 ? userInfoOLrzqt.enPetname : null, (524287 & 32) != 0 ? userInfoOLrzqt.rcToken : null, (524287 & 64) != 0 ? userInfoOLrzqt.sign : null, (524287 & 128) != 0 ? userInfoOLrzqt.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoOLrzqt.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoOLrzqt.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoOLrzqt.groupStatus : null, (524287 & 2048) != 0 ? userInfoOLrzqt.allowContactDiscovery : z ? "1" : "0", (524287 & 4096) != 0 ? userInfoOLrzqt.timestamp : null, (524287 & 8192) != 0 ? userInfoOLrzqt.officialTag : null, (524287 & 16384) != 0 ? userInfoOLrzqt.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoOLrzqt.allowCreateGroup : null, (524287 & 65536) != 0 ? userInfoOLrzqt.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoOLrzqt.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoOLrzqt.allowInAppNotification : null, (524287 & 524288) != 0 ? userInfoOLrzqt.allowChatViaProfile : null));
                return;
            }
            if (i == 3) {
                this.AEQbTJ.EZpvd(userInfoOLrzqt.copy((524287 & 1) != 0 ? userInfoOLrzqt.identifyId : null, (524287 & 2) != 0 ? userInfoOLrzqt.avatar : null, (524287 & 4) != 0 ? userInfoOLrzqt.avatarStatus : null, (524287 & 8) != 0 ? userInfoOLrzqt.petname : null, (524287 & 16) != 0 ? userInfoOLrzqt.enPetname : null, (524287 & 32) != 0 ? userInfoOLrzqt.rcToken : null, (524287 & 64) != 0 ? userInfoOLrzqt.sign : null, (524287 & 128) != 0 ? userInfoOLrzqt.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoOLrzqt.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoOLrzqt.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoOLrzqt.groupStatus : null, (524287 & 2048) != 0 ? userInfoOLrzqt.allowContactDiscovery : null, (524287 & 4096) != 0 ? userInfoOLrzqt.timestamp : null, (524287 & 8192) != 0 ? userInfoOLrzqt.officialTag : null, (524287 & 16384) != 0 ? userInfoOLrzqt.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoOLrzqt.allowCreateGroup : java.lang.Boolean.valueOf(z), (524287 & 65536) != 0 ? userInfoOLrzqt.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoOLrzqt.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoOLrzqt.allowInAppNotification : null, (524287 & 524288) != 0 ? userInfoOLrzqt.allowChatViaProfile : null));
            } else if (i == 4) {
                this.AEQbTJ.EZpvd(userInfoOLrzqt.copy((524287 & 1) != 0 ? userInfoOLrzqt.identifyId : null, (524287 & 2) != 0 ? userInfoOLrzqt.avatar : null, (524287 & 4) != 0 ? userInfoOLrzqt.avatarStatus : null, (524287 & 8) != 0 ? userInfoOLrzqt.petname : null, (524287 & 16) != 0 ? userInfoOLrzqt.enPetname : null, (524287 & 32) != 0 ? userInfoOLrzqt.rcToken : null, (524287 & 64) != 0 ? userInfoOLrzqt.sign : null, (524287 & 128) != 0 ? userInfoOLrzqt.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoOLrzqt.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoOLrzqt.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoOLrzqt.groupStatus : null, (524287 & 2048) != 0 ? userInfoOLrzqt.allowContactDiscovery : null, (524287 & 4096) != 0 ? userInfoOLrzqt.timestamp : null, (524287 & 8192) != 0 ? userInfoOLrzqt.officialTag : null, (524287 & 16384) != 0 ? userInfoOLrzqt.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoOLrzqt.allowCreateGroup : null, (524287 & 65536) != 0 ? userInfoOLrzqt.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoOLrzqt.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoOLrzqt.allowInAppNotification : java.lang.Integer.valueOf(z ? 1 : 0), (524287 & 524288) != 0 ? userInfoOLrzqt.allowChatViaProfile : null));
            } else {
                if (i != 5) {
                    return;
                }
                this.AEQbTJ.EZpvd(userInfoOLrzqt.copy((524287 & 1) != 0 ? userInfoOLrzqt.identifyId : null, (524287 & 2) != 0 ? userInfoOLrzqt.avatar : null, (524287 & 4) != 0 ? userInfoOLrzqt.avatarStatus : null, (524287 & 8) != 0 ? userInfoOLrzqt.petname : null, (524287 & 16) != 0 ? userInfoOLrzqt.enPetname : null, (524287 & 32) != 0 ? userInfoOLrzqt.rcToken : null, (524287 & 64) != 0 ? userInfoOLrzqt.sign : null, (524287 & 128) != 0 ? userInfoOLrzqt.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoOLrzqt.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoOLrzqt.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoOLrzqt.groupStatus : null, (524287 & 2048) != 0 ? userInfoOLrzqt.allowContactDiscovery : null, (524287 & 4096) != 0 ? userInfoOLrzqt.timestamp : null, (524287 & 8192) != 0 ? userInfoOLrzqt.officialTag : null, (524287 & 16384) != 0 ? userInfoOLrzqt.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoOLrzqt.allowCreateGroup : null, (524287 & 65536) != 0 ? userInfoOLrzqt.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoOLrzqt.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoOLrzqt.allowInAppNotification : null, (524287 & 524288) != 0 ? userInfoOLrzqt.allowChatViaProfile : java.lang.Integer.valueOf(z ? 1 : 0)));
            }
        }
    }
}
