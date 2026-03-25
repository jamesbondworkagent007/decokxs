package com.okinc.okimcore.notify.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44477sRg;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class OKNotifyJumpReceiver extends BroadcastReceiver {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.notify.utility.OKNotifyJumpReceiver.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !Intrinsics.EZpvd((Object) intent.getAction(), (Object) "com.okinc.okimcore.notify.utility.OKNotifyJumpReceiver")) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("conversation");
        OKConversation oKConversation = parcelableExtra instanceof OKConversation ? (OKConversation) parcelableExtra : null;
        String stringExtra = intent.getStringExtra("pushData");
        boolean booleanExtra = intent.getBooleanExtra("isIMChatMsg", false);
        boolean booleanExtra2 = intent.getBooleanExtra("isIMSysRouterMsg", false);
        if (oKConversation == null && (stringExtra == null || stringExtra.length() == 0)) {
            pUU.copydefault("OKNotifyJumpReceiver", "conversation and pushData is null，Conversation:" + parcelableExtra);
            return;
        }
        C44477sRg.copydefault.AEQbTJ(stringExtra, oKConversation, booleanExtra, booleanExtra2, false);
    }
}
