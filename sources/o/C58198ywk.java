package o;

/* JADX INFO: renamed from: o.ywk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58198ywk implements InterfaceC58206yws<java.lang.Object> {
    public final android.app.Service OLrzqt;
    public java.lang.Object copydefault;

    /* JADX INFO: renamed from: o.ywk$TaskDescription */
    /* JADX INFO: loaded from: classes12.dex */
    public interface TaskDescription {
        InterfaceC58131yvW FQNKFG();
    }

    public C58198ywk(android.app.Service service) {
        this.OLrzqt = service;
    }

    @Override // o.InterfaceC58206yws
    public java.lang.Object aA_() {
        if (this.copydefault == null) {
            this.copydefault = EZpvd();
        }
        return this.copydefault;
    }

    private java.lang.Object EZpvd() {
        android.app.Application application = this.OLrzqt.getApplication();
        C58209ywv.copydefault(application instanceof InterfaceC58206yws, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((TaskDescription) C58113yvE.copydefault(application, TaskDescription.class)).FQNKFG().copydefault(this.OLrzqt).EZpvd();
    }
}
