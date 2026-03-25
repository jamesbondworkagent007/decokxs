package com.okinc.im.di;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C36647oes;
import o.C37708oyt;
import o.oBS;
import o.yCL;

/* JADX INFO: loaded from: classes8.dex */
public final class TrackerModule {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.di.TrackerModule.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCL(AEQbTJ = "TrackerMessageListUseCase")
    public final C37708oyt EZpvd() {
        C37708oyt c37708oyt = new C37708oyt();
        c37708oyt.OLrzqt(oBS.copydefault());
        return c37708oyt;
    }

    @yCL(AEQbTJ = "TrackerChatActivityViewModel")
    public final C37708oyt OLrzqt() {
        C37708oyt c37708oyt = new C37708oyt();
        c37708oyt.OLrzqt(C36647oes.OLrzqt());
        return c37708oyt;
    }
}
