package o;

import o.C58201ywn;

/* JADX INFO: renamed from: o.ywi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58196ywi implements InterfaceC58206yws<java.lang.Object> {
    public volatile java.lang.Object AEQbTJ;
    public final androidx.fragment.app.Fragment OLrzqt;
    public final java.lang.Object copydefault = new java.lang.Object();

    /* JADX INFO: renamed from: o.ywi$TaskDescription */
    public interface TaskDescription {
        InterfaceC58132yvX djBIcL();
    }

    public void OLrzqt(androidx.fragment.app.Fragment fragment) {
    }

    public C58196ywi(androidx.fragment.app.Fragment fragment) {
        this.OLrzqt = fragment;
    }

    @Override // o.InterfaceC58206yws
    public java.lang.Object aA_() {
        if (this.AEQbTJ == null) {
            synchronized (this.copydefault) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = KWHzl();
                }
            }
        }
        return this.AEQbTJ;
    }

    private java.lang.Object KWHzl() {
        C58209ywv.OLrzqt(this.OLrzqt.getHost(), "Hilt Fragments must be attached before creating the component.");
        C58209ywv.copydefault(this.OLrzqt.getHost() instanceof InterfaceC58206yws, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.OLrzqt.getHost().getClass());
        OLrzqt(this.OLrzqt);
        return ((TaskDescription) C58113yvE.copydefault(this.OLrzqt.getHost(), TaskDescription.class)).djBIcL().EZpvd(this.OLrzqt).KWHzl();
    }

    public static final android.content.Context OLrzqt(android.content.Context context) {
        while ((context instanceof android.content.ContextWrapper) && !(context instanceof android.app.Activity)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static android.content.ContextWrapper EZpvd(android.content.Context context, androidx.fragment.app.Fragment fragment) {
        return new C58201ywn.ActionBar(context, fragment);
    }

    public static android.content.ContextWrapper copydefault(android.view.LayoutInflater layoutInflater, androidx.fragment.app.Fragment fragment) {
        return new C58201ywn.ActionBar(layoutInflater, fragment);
    }
}
