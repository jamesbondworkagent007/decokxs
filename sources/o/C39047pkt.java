package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39047pkt extends ViewModel {
    public final java.util.HashMap<java.lang.String, ViewModelStore> EZpvd = new java.util.HashMap<>();
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final ViewModelProvider.Factory AEQbTJ = new StateListAnimator();

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ViewModelStore viewModelStore = this.EZpvd.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.EZpvd.remove(str);
        }
    }

    /* JADX INFO: renamed from: o.pkt$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pkt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.pkt$StateListAnimator */
    public static final class StateListAnimator implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C39047pkt();
        }
    }
}
