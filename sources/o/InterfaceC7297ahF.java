package o;

import android.view.View;

/* JADX INFO: renamed from: o.ahF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7297ahF {

    /* JADX INFO: renamed from: o.ahF$Application */
    public interface Application {
        void setRetryListener(View.OnClickListener onClickListener);
    }

    <T extends android.view.View & Application> T AEQbTJ(android.content.Context context);
}
