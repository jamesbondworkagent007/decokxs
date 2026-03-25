package o;

import androidx.lifecycle.MediatorLiveData;
import com.okinc.core.arch.data.StatefulData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.mnT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32960mnT<T> extends MediatorLiveData<StatefulData<T>> implements InterfaceC32953mnM {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final StateListAnimator djBIcL = new StateListAnimator(this, android.os.Looper.getMainLooper());
    public boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AEQbTJ = z;
    }

    public abstract boolean copydefault();

    /* JADX INFO: renamed from: o.mnT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mnT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.mnT$StateListAnimator */
    public static final class StateListAnimator extends android.os.Handler {
        public final /* synthetic */ AbstractC32960mnT<T> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(AbstractC32960mnT<T> abstractC32960mnT, android.os.Looper looper) {
            super(looper);
            this.KWHzl = abstractC32960mnT;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            this.KWHzl.KWHzl(message.arg1 == 1);
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        if (this.AEQbTJ) {
            KWHzl(false);
        }
    }

    @Override // o.InterfaceC32953mnM
    public boolean KWHzl(boolean z) {
        java.lang.String simpleName = getClass().getSimpleName();
        StatefulData statefulData = (StatefulData) getValue();
        C33495mxY.KWHzl("StatefulRxLiveData", simpleName + ".reload(forceReload=" + z + ")--> current:" + (statefulData != null ? statefulData.AEQbTJ() : null));
        StatefulData<T> statefulData2 = (StatefulData) getValue();
        if (!KWHzl(statefulData2, z)) {
            return false;
        }
        if (AEQbTJ(statefulData2, z)) {
            setValue(StatefulData.StateListAnimator.loading$default(StatefulData.Companion, null, 1, null));
        }
        return copydefault();
    }

    public boolean KWHzl(StatefulData<T> statefulData, boolean z) {
        return z || statefulData == null || statefulData.valueOf();
    }

    public boolean AEQbTJ(StatefulData<T> statefulData, boolean z) {
        return statefulData == null || !statefulData.AYXKKw();
    }

    /* JADX DEBUG: Method merged with bridge method: setValue(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.core.arch.data.StatefulData<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void setValue(StatefulData<T> statefulData) {
        super.setValue(statefulData);
        C33495mxY.KWHzl("StatefulRxLiveData", getClass().getSimpleName() + ".setValue=" + (statefulData != 0 ? statefulData.AEQbTJ() : null));
    }
}
