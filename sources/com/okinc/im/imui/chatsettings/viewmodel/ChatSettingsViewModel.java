package com.okinc.im.imui.chatsettings.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.imui.privacy.SecurityType;
import com.okinc.im.imui.privacy.SettingType;
import com.okinc.im.utils.UiText;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserProfile;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C35399nuc;
import o.C35501nwZ;
import o.C35765oCw;
import o.C35767oCy;
import o.C37199opN;
import o.C37201opP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC47278tmy;
import o.InterfaceC8108awX;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatSettingsViewModel extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<ChatSettingsResult> AEQbTJ;
    public final StateFlow<C35501nwZ> AYXKKw;
    public final InterfaceC8108awX AhwBna;
    public final StateFlow<C32989mnw<ChatSettingsResult>> AkhnZx;
    public final C35765oCw DbNXlk;
    public final MutableStateFlow<C35501nwZ> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<C32989mnw<Unit>> djBIcL;
    public final InterfaceC47278tmy fJNWhG;
    public final StateFlow<Application> fetchVPNInfo;
    public final StateFlow<ChatSettingsResult> gEmmrt;
    public final StateFlow<C32989mnw<Unit>> isConnected;
    public final MutableStateFlow<C32989mnw<ChatSettingsResult>> valueOf;
    public final C35767oCy values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ChatSettingsResult> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C35501nwZ> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C32989mnw<Unit>> gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C32989mnw<ChatSettingsResult>> valueOf() {
        return this.AkhnZx;
    }

    @yCM
    public ChatSettingsViewModel(@NotNull C35767oCy c35767oCy, @NotNull C35765oCw c35765oCw, @NotNull InterfaceC8108awX interfaceC8108awX, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c35767oCy, "");
        Intrinsics.checkNotNullParameter(c35765oCw, "");
        Intrinsics.checkNotNullParameter(interfaceC8108awX, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.values = c35767oCy;
        this.DbNXlk = c35765oCw;
        this.AhwBna = interfaceC8108awX;
        this.fJNWhG = interfaceC47278tmy;
        MutableStateFlow<ChatSettingsResult> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.gEmmrt = MutableStateFlow;
        MutableStateFlow<C35501nwZ> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow2;
        this.AYXKKw = MutableStateFlow2;
        MutableStateFlow<C32989mnw<Unit>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = MutableStateFlow3;
        this.isConnected = MutableStateFlow3;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.KWHzl = MutableStateFlow4;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow5;
        MutableStateFlow<C32989mnw<ChatSettingsResult>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow6;
        this.AkhnZx = MutableStateFlow6;
        this.fetchVPNInfo = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, MutableStateFlow5, new ChatSettingsViewModel$uiState$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), Application.StateListAnimator.OLrzqt);
    }

    public final void AhwBna() {
        AEQbTJ(true);
    }

    public final void AEQbTJ(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatSettingsViewModel$fetchAllData$1(z, this, null), 3, null);
    }

    public final void EZpvd(int i, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatSettingsViewModel$updateChatSettings$1(this, i, z, null), 3, null);
    }

    public final void EZpvd() {
        this.djBIcL.setValue(null);
    }

    public final void AEQbTJ() {
        this.valueOf.setValue(null);
    }

    public final Object EZpvd(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ChatSettingsViewModel$getFetchingJob$2(this, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void OLrzqt(int i, boolean z) {
        MutableStateFlow<ChatSettingsResult> mutableStateFlow = this.AEQbTJ;
        ChatSettingsResult value = mutableStateFlow.getValue();
        if (value == null) {
            value = null;
        } else if (i == 1) {
            value = ChatSettingsResult.copy$default(value, z, false, false, false, null, 30, null);
        } else if (i == 3) {
            value = ChatSettingsResult.copy$default(value, false, false, z, false, null, 27, null);
        } else if (i == 4) {
            value = ChatSettingsResult.copy$default(value, false, false, false, z, null, 23, null);
        }
        mutableStateFlow.setValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Unit> continuation) throws Exception {
        ChatSettingsViewModel$loadAvatarInfo$1 chatSettingsViewModel$loadAvatarInfo$1;
        ChatSettingsViewModel chatSettingsViewModel;
        C35501nwZ value;
        String strGEmmrt;
        UiText.DynamicString dynamicString;
        if (continuation instanceof ChatSettingsViewModel$loadAvatarInfo$1) {
            chatSettingsViewModel$loadAvatarInfo$1 = (ChatSettingsViewModel$loadAvatarInfo$1) continuation;
            int i = chatSettingsViewModel$loadAvatarInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatSettingsViewModel$loadAvatarInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                chatSettingsViewModel$loadAvatarInfo$1 = new ChatSettingsViewModel$loadAvatarInfo$1(this, continuation);
            }
        }
        Object objCopydefault = chatSettingsViewModel$loadAvatarInfo$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = chatSettingsViewModel$loadAvatarInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC8108awX interfaceC8108awX = this.AhwBna;
                chatSettingsViewModel$loadAvatarInfo$1.L$0 = this;
                chatSettingsViewModel$loadAvatarInfo$1.label = 1;
                objCopydefault = interfaceC8108awX.copydefault(true, chatSettingsViewModel$loadAvatarInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                chatSettingsViewModel = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chatSettingsViewModel = (ChatSettingsViewModel) chatSettingsViewModel$loadAvatarInfo$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            UserProfile userProfile = (UserProfile) objCopydefault;
            String profilePictureUrl = userProfile != null ? userProfile.getProfilePictureUrl() : null;
            if (profilePictureUrl != null) {
                MutableStateFlow<C35501nwZ> mutableStateFlow = chatSettingsViewModel.EZpvd;
                do {
                    value = mutableStateFlow.getValue();
                    C35501nwZ c35501nwZ = value;
                    strGEmmrt = chatSettingsViewModel.fJNWhG.gEmmrt();
                    if (chatSettingsViewModel.fJNWhG.DbNXlk()) {
                        User userOLrzqt = chatSettingsViewModel.fJNWhG.OLrzqt();
                        dynamicString = new UiText.DynamicString(userOLrzqt != null ? userOLrzqt.getSubAccountType() : null);
                    } else {
                        User userOLrzqt2 = chatSettingsViewModel.fJNWhG.OLrzqt();
                        dynamicString = new UiText.DynamicString(userOLrzqt2 != null ? userOLrzqt2.getNameDesc() : null);
                    }
                } while (!mutableStateFlow.compareAndSet(value, new C35501nwZ(profilePictureUrl, strGEmmrt, dynamicString)));
                return Unit.INSTANCE;
            }
            throw new Exception();
        } catch (Exception e) {
            pUU.copydefault("ChatSettingsViewModel", "forceLoadRemoteUserProfile returns error: " + e);
            throw e;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation<? super Unit> continuation) throws Throwable {
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            ChatSettingsViewModel chatSettingsViewModel = ChatSettingsViewModel.this;
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                chatSettingsViewModel.AEQbTJ.setValue((ChatSettingsResult) objM7386unboximpl);
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("ChatSettingsViewModel", "Error in fetchChatSettings: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                throw thM7380exceptionOrNullimpl;
            }
            return Unit.INSTANCE;
        }
    }

    public final Object AEQbTJ(Continuation<? super Unit> continuation) {
        Object objCollect = this.values.KWHzl().collect(new Activity(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object KWHzl(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Throwable {
        ChatSettingsViewModel$executeWithLoading$1 chatSettingsViewModel$executeWithLoading$1;
        Throwable th;
        ChatSettingsViewModel chatSettingsViewModel;
        Exception e;
        if (continuation instanceof ChatSettingsViewModel$executeWithLoading$1) {
            chatSettingsViewModel$executeWithLoading$1 = (ChatSettingsViewModel$executeWithLoading$1) continuation;
            int i = chatSettingsViewModel$executeWithLoading$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatSettingsViewModel$executeWithLoading$1.label = i - Integer.MIN_VALUE;
            } else {
                chatSettingsViewModel$executeWithLoading$1 = new ChatSettingsViewModel$executeWithLoading$1(this, continuation);
            }
        }
        Object objInvoke = chatSettingsViewModel$executeWithLoading$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chatSettingsViewModel$executeWithLoading$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chatSettingsViewModel = (ChatSettingsViewModel) chatSettingsViewModel$executeWithLoading$1.L$0;
            try {
                try {
                    C56391yDq.AEQbTJ(objInvoke);
                    chatSettingsViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    chatSettingsViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                pUU.copydefault("ChatSettingsViewModel", "Error: " + e);
                chatSettingsViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
                return null;
            }
        }
        C56391yDq.AEQbTJ(objInvoke);
        this.KWHzl.setValue(C56443yFo.KWHzl(true));
        try {
            chatSettingsViewModel$executeWithLoading$1.L$0 = this;
            chatSettingsViewModel$executeWithLoading$1.label = 1;
            objInvoke = function1.invoke(chatSettingsViewModel$executeWithLoading$1);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
            chatSettingsViewModel = this;
            chatSettingsViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
            return objInvoke;
        } catch (Exception e3) {
            e = e3;
            chatSettingsViewModel = this;
            pUU.copydefault("ChatSettingsViewModel", "Error: " + e);
            chatSettingsViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
            return null;
        } catch (Throwable th3) {
            th = th3;
            chatSettingsViewModel = this;
            chatSettingsViewModel.KWHzl.setValue(C56443yFo.KWHzl(false));
            throw th;
        }
    }

    public final List<Object> copydefault() {
        return yDY.gEmmrt(new C37201opP(SecurityType.IM_GROUP_SEARCH_ADD, DbNXlk(C35399nuc.LoaderManager.IPostMessageServiceStubProxy), null, false, 4, null), new C37201opP(SecurityType.IM_CONTACT_DISCOVERY, DbNXlk(C35399nuc.LoaderManager.RjCdvpRjCdvp), null, false, 4, null), new C37201opP(SecurityType.IM_RECEIVE_INAPP_NOTIFICATION, DbNXlk(C35399nuc.LoaderManager.getUriFromString), DbNXlk(C35399nuc.LoaderManager.DRtzUu), false), new C37199opN(SettingType.BLOCK_LIST, DbNXlk(C35399nuc.LoaderManager.IPostMessageServiceStub), false, null, null, 28, null), new C37199opN(SettingType.AUTO_DOWNLOAD_MEDIA, DbNXlk(C35399nuc.LoaderManager.dPaqAf), false, null, null, 28, null));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends Application {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class TaskDescription extends Application {
            public static final TaskDescription KWHzl = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.chatsettings.viewmodel.ChatSettingsViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0400Application extends Application {
            public static final C0400Application AEQbTJ = new C0400Application();

            private C0400Application() {
                super(null);
            }
        }
    }
}
