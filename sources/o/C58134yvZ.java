package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.yvZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58134yvZ {

    /* JADX INFO: renamed from: o.yvZ$Activity */
    public interface Activity {
        ActionBar hDKMBd();
    }

    /* JADX INFO: renamed from: o.yvZ$TaskDescription */
    public interface TaskDescription {
        ActionBar AYXKKw();
    }

    public static ViewModelProvider.Factory AEQbTJ(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((TaskDescription) C58113yvE.copydefault(componentActivity, TaskDescription.class)).AYXKKw().AEQbTJ(componentActivity, factory);
    }

    public static ViewModelProvider.Factory OLrzqt(androidx.fragment.app.Fragment fragment, ViewModelProvider.Factory factory) {
        return ((Activity) C58113yvE.copydefault(fragment, Activity.class)).hDKMBd().OLrzqt(fragment, factory);
    }

    /* JADX INFO: renamed from: o.yvZ$ActionBar */
    public static final class ActionBar {
        public final InterfaceC58128yvT EZpvd;
        public final java.util.Map<java.lang.Class<?>, java.lang.Boolean> OLrzqt;

        @yCM
        public ActionBar(java.util.Map<java.lang.Class<?>, java.lang.Boolean> map, InterfaceC58128yvT interfaceC58128yvT) {
            this.OLrzqt = map;
            this.EZpvd = interfaceC58128yvT;
        }

        public ViewModelProvider.Factory AEQbTJ(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return KWHzl(factory);
        }

        public ViewModelProvider.Factory OLrzqt(androidx.fragment.app.Fragment fragment, ViewModelProvider.Factory factory) {
            return KWHzl(factory);
        }

        public final ViewModelProvider.Factory KWHzl(ViewModelProvider.Factory factory) {
            return new C58190ywc(this.OLrzqt, (ViewModelProvider.Factory) C58209ywv.OLrzqt(factory), this.EZpvd);
        }
    }

    private C58134yvZ() {
    }
}
