package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: o.ywn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58201ywn implements InterfaceC58206yws<java.lang.Object> {
    public final boolean AEQbTJ;
    public final android.view.View KWHzl;
    public volatile java.lang.Object OLrzqt;
    public final java.lang.Object copydefault;

    /* JADX INFO: renamed from: o.ywn$Activity */
    public interface Activity {
        InterfaceC58129yvU isConnected();
    }

    /* JADX INFO: renamed from: o.ywn$Application */
    public interface Application {
        InterfaceC58188ywa AxsJAY();
    }

    @Override // o.InterfaceC58206yws
    public java.lang.Object aA_() {
        if (this.OLrzqt == null) {
            synchronized (this.copydefault) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = OLrzqt();
                }
            }
        }
        return this.OLrzqt;
    }

    private java.lang.Object OLrzqt() {
        InterfaceC58206yws<?> interfaceC58206ywsEZpvd = EZpvd(false);
        if (this.AEQbTJ) {
            return ((Application) C58113yvE.copydefault(interfaceC58206ywsEZpvd, Application.class)).AxsJAY().KWHzl(this.KWHzl).KWHzl();
        }
        return ((Activity) C58113yvE.copydefault(interfaceC58206ywsEZpvd, Activity.class)).isConnected().OLrzqt(this.KWHzl).AEQbTJ();
    }

    public final InterfaceC58206yws<?> EZpvd(boolean z) {
        if (this.AEQbTJ) {
            android.content.Context contextCopydefault = copydefault(ActionBar.class, z);
            if (contextCopydefault instanceof ActionBar) {
                return (InterfaceC58206yws) ((ActionBar) contextCopydefault).AEQbTJ();
            }
            if (z) {
                return null;
            }
            C58209ywv.copydefault(!(r4 instanceof InterfaceC58206yws), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.KWHzl.getClass(), copydefault(InterfaceC58206yws.class, z).getClass().getName());
        } else {
            java.lang.Object objCopydefault = copydefault(InterfaceC58206yws.class, z);
            if (objCopydefault instanceof InterfaceC58206yws) {
                return (InterfaceC58206yws) objCopydefault;
            }
            if (z) {
                return null;
            }
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.KWHzl.getClass()));
    }

    public final android.content.Context copydefault(java.lang.Class<?> cls, boolean z) {
        android.content.Context contextOLrzqt = OLrzqt(this.KWHzl.getContext(), cls);
        if (contextOLrzqt != C58124yvP.EZpvd(contextOLrzqt.getApplicationContext())) {
            return contextOLrzqt;
        }
        C58209ywv.copydefault(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.KWHzl.getClass());
        return null;
    }

    public static android.content.Context OLrzqt(android.content.Context context, java.lang.Class<?> cls) {
        while ((context instanceof android.content.ContextWrapper) && !cls.isInstance(context)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* JADX INFO: renamed from: o.ywn$ActionBar */
    public static final class ActionBar extends android.content.ContextWrapper {
        public android.view.LayoutInflater AEQbTJ;
        public android.view.LayoutInflater EZpvd;
        public androidx.fragment.app.Fragment OLrzqt;
        public final LifecycleEventObserver copydefault;

        public ActionBar(android.content.Context context, androidx.fragment.app.Fragment fragment) {
            super((android.content.Context) C58209ywv.OLrzqt(context));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.KWHzl.OLrzqt = null;
                        this.KWHzl.AEQbTJ = null;
                        this.KWHzl.EZpvd = null;
                    }
                }
            };
            this.copydefault = lifecycleEventObserver;
            this.AEQbTJ = null;
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) C58209ywv.OLrzqt(fragment);
            this.OLrzqt = fragment2;
            fragment2.getLifecycle().addObserver(lifecycleEventObserver);
        }

        public ActionBar(android.view.LayoutInflater layoutInflater, androidx.fragment.app.Fragment fragment) {
            super((android.content.Context) C58209ywv.OLrzqt(((android.view.LayoutInflater) C58209ywv.OLrzqt(layoutInflater)).getContext()));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        this.KWHzl.OLrzqt = null;
                        this.KWHzl.AEQbTJ = null;
                        this.KWHzl.EZpvd = null;
                    }
                }
            };
            this.copydefault = lifecycleEventObserver;
            this.AEQbTJ = layoutInflater;
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) C58209ywv.OLrzqt(fragment);
            this.OLrzqt = fragment2;
            fragment2.getLifecycle().addObserver(lifecycleEventObserver);
        }

        public androidx.fragment.app.Fragment AEQbTJ() {
            C58209ywv.OLrzqt(this.OLrzqt, "The fragment has already been destroyed.");
            return this.OLrzqt;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.EZpvd == null) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = (android.view.LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.EZpvd = this.AEQbTJ.cloneInContext(this);
            }
            return this.EZpvd;
        }

        @Override // android.content.ContextWrapper
        public void attachBaseContext(android.content.Context context) {
            super.attachBaseContext(context);
        }
    }
}
