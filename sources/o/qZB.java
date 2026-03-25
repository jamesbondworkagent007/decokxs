package o;

import android.view.View;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import o.C33570myu;
import o.qZD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qZB implements qZD {
    public static final int KWHzl = 8;
    public final float AEQbTJ;
    public java.lang.Integer OLrzqt;

    public qZB(float f) {
        this.AEQbTJ = f;
    }

    @Override // o.mAS
    public float AYXKKw() {
        return qZD.TaskDescription.OLrzqt(this);
    }

    @Override // o.mAS
    public float EZpvd() {
        return this.OLrzqt != null ? r0.intValue() : C33518mxv.EZpvd(C32979mnm.EZpvd.OLrzqt(), this.AEQbTJ);
    }

    public void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(view, new C33570myu.ActionBar() { // from class: o.qZF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33570myu.ActionBar
            public final boolean AEQbTJ(android.view.View view2) {
                return qZB.EZpvd(this.OLrzqt, view2);
            }
        });
    }

    public static final boolean EZpvd(qZB qzb, android.view.View view) {
        int height = view.getHeight();
        if (height == 0) {
            return false;
        }
        java.lang.Integer num = qzb.OLrzqt;
        if (num != null && height == num.intValue()) {
            return false;
        }
        qzb.OLrzqt = java.lang.Integer.valueOf(height);
        java.lang.String simpleName = qZB.class.getSimpleName();
        java.lang.Integer num2 = qzb.OLrzqt;
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        Intrinsics.copydefault(qzb.OLrzqt);
        pUU.KWHzl("TransformViewPager", simpleName + "-->post->EVENT_REQUEST_LAYOUT->height:" + num2 + "--->dp:" + C33518mxv.KWHzl(applicationOLrzqt, r2.intValue()));
        qzb.OLrzqt();
        return false;
    }

    public static final class Application implements View.OnLayoutChangeListener {
        public final /* synthetic */ C33570myu.ActionBar EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        public Application(C33570myu.ActionBar actionBar, android.view.View view) {
            this.EZpvd = actionBar;
            this.copydefault = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.EZpvd.AEQbTJ(this.copydefault)) {
                this.copydefault.removeOnLayoutChangeListener(this);
            }
        }
    }

    private final void EZpvd(android.view.View view, C33570myu.ActionBar actionBar) {
        view.addOnLayoutChangeListener(new Application(actionBar, view));
    }

    private final void OLrzqt() {
        RxBus.KWHzl("event_update_layout");
    }
}
