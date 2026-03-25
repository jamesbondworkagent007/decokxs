package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import o.C58113yvE;
import o.C58114yvF;
import o.C58192ywe;
import o.C58200ywm;
import o.InterfaceC58115yvG;
import o.InterfaceC58119yvK;
import o.InterfaceC58130yvV;
import o.InterfaceC58206yws;

/* JADX INFO: loaded from: classes12.dex */
public final class ActivityRetainedComponentManager implements InterfaceC58206yws<InterfaceC58119yvK> {
    public final ViewModelStoreOwner EZpvd;
    public final Object KWHzl = new Object();
    public volatile InterfaceC58119yvK OLrzqt;
    public final Context copydefault;

    public interface StateListAnimator {
        InterfaceC58130yvV dPkBzA();
    }

    public interface TaskDescription {
        InterfaceC58115yvG EZpvd();
    }

    public static final class Application extends ViewModel {
        public final C58200ywm AEQbTJ;
        public final InterfaceC58119yvK EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C58200ywm EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC58119yvK copydefault() {
            return this.EZpvd;
        }

        public Application(InterfaceC58119yvK interfaceC58119yvK, C58200ywm c58200ywm) {
            this.EZpvd = interfaceC58119yvK;
            this.AEQbTJ = c58200ywm;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((C58192ywe) ((TaskDescription) C58113yvE.copydefault(this.EZpvd, TaskDescription.class)).EZpvd()).AEQbTJ();
        }
    }

    public ActivityRetainedComponentManager(ComponentActivity componentActivity) {
        this.EZpvd = componentActivity;
        this.copydefault = componentActivity;
    }

    public final ViewModelProvider KWHzl(ViewModelStoreOwner viewModelStoreOwner, final Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.5
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(@NonNull Class<T> cls, CreationExtras creationExtras) {
                C58200ywm c58200ywm = new C58200ywm(creationExtras);
                return new Application(((StateListAnimator) C58114yvF.OLrzqt(context, StateListAnimator.class)).dPkBzA().AEQbTJ(c58200ywm).EZpvd(), c58200ywm);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: aA_()Ljava/lang/Object; */
    @Override // o.InterfaceC58206yws
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC58119yvK aA_() {
        if (this.OLrzqt == null) {
            synchronized (this.KWHzl) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = EZpvd();
                }
            }
        }
        return this.OLrzqt;
    }

    public C58200ywm OLrzqt() {
        return ((Application) KWHzl(this.EZpvd, this.copydefault).get(Application.class)).EZpvd();
    }

    public final InterfaceC58119yvK EZpvd() {
        return ((Application) KWHzl(this.EZpvd, this.copydefault).get(Application.class)).copydefault();
    }

    public static abstract class LifecycleModule {
        public static InterfaceC58115yvG KWHzl() {
            return new C58192ywe();
        }
    }
}
