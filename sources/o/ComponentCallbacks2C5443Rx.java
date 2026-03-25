package o;

/* JADX INFO: renamed from: o.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacks2C5443Rx implements InterfaceC5440Ru, android.content.ComponentCallbacks2 {
    @Override // o.InterfaceC5440Ru
    public void KWHzl(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }
}
