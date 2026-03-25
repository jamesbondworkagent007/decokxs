package com.okinc.im.imui.conversationlist.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.yCM;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListActivityViewModel extends AbstractC33073mpa {
    public final MutableLiveData<C32989mnw<Activity>> copydefault = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Activity>> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public ConversationListActivityViewModel() {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.viewmodel.ConversationListActivityViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.ConversationListActivityViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0408Activity extends Activity {
            public static final C0408Activity EZpvd = new C0408Activity();

            private C0408Activity() {
                super(null);
            }
        }

        private Activity() {
        }
    }
}
