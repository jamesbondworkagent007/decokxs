package o;

import android.view.View;

/* JADX INFO: renamed from: o.avd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8061avd extends AbstractC58247yxg<java.lang.Object> {
    public final android.view.View AEQbTJ;

    public C8061avd(android.view.View view) {
        this.AEQbTJ = view;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super java.lang.Object> interfaceC58256yxp) {
        if (C8058ava.EZpvd(interfaceC58256yxp)) {
            TaskDescription taskDescription = new TaskDescription(this.AEQbTJ, interfaceC58256yxp);
            interfaceC58256yxp.onSubscribe(taskDescription);
            this.AEQbTJ.setOnClickListener(taskDescription);
        }
    }

    /* JADX INFO: renamed from: o.avd$TaskDescription */
    public static final class TaskDescription extends AbstractC58265yxy implements View.OnClickListener {
        public final InterfaceC58256yxp<? super java.lang.Object> AEQbTJ;
        public final android.view.View EZpvd;

        public TaskDescription(android.view.View view, InterfaceC58256yxp<? super java.lang.Object> interfaceC58256yxp) {
            this.EZpvd = view;
            this.AEQbTJ = interfaceC58256yxp;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (isDisposed()) {
                return;
            }
            this.AEQbTJ.onNext(com.jakewharton.rxbinding2.internal.Notification.INSTANCE);
        }

        @Override // o.AbstractC58265yxy
        public void OLrzqt() {
            this.EZpvd.setOnClickListener(null);
        }
    }
}
