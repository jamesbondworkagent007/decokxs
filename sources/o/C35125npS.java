package o;

import android.widget.RemoteViewsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.npS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35125npS extends android.widget.RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
        android.content.Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return new C35115npI(applicationContext, intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
