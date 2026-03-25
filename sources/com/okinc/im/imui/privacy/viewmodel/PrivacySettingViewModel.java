package com.okinc.im.imui.privacy.viewmodel;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C35765oCw;
import o.C35767oCy;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivacySettingViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final StateFlow<ChatSettingsResult> AEQbTJ;
    public final C35765oCw EZpvd;
    public final MutableStateFlow<ChatSettingsResult> OLrzqt;
    public final C35767oCy copydefault;

    @yCM
    public PrivacySettingViewModel(@NotNull C35767oCy c35767oCy, @NotNull C35765oCw c35765oCw) {
        Intrinsics.checkNotNullParameter(c35767oCy, "");
        Intrinsics.checkNotNullParameter(c35765oCw, "");
        this.copydefault = c35767oCy;
        this.EZpvd = c35765oCw;
        MutableStateFlow<ChatSettingsResult> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(int i, boolean z) {
        MutableStateFlow<ChatSettingsResult> mutableStateFlow = this.OLrzqt;
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

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.privacy.viewmodel.PrivacySettingViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
