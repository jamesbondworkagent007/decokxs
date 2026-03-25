package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.databinding.ViewDataBinding;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C33570myu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC54119wyO<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC54505xKx<Binding, Presenter> implements mAS {
    public ViewTreeObserver.OnGlobalLayoutListener AEQbTJ;
    public java.lang.Integer AYXKKw;
    public C33570myu.ActionBar EZpvd;
    public android.view.ViewTreeObserver djBIcL;

    public float AEQbTJ() {
        return 448.0f;
    }

    @Override // o.mAS
    public float AYXKKw() {
        return C33570myu.AEQbTJ();
    }

    @Override // o.mAS
    public float EZpvd() {
        return this.AYXKKw != null ? r0.intValue() : C33518mxv.EZpvd(C32979mnm.EZpvd.OLrzqt(), AEQbTJ());
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (ViewCompat.isAttachedToWindow(view)) {
            this.EZpvd = new TaskDescription(this);
            KWHzl(this.EZpvd);
        } else {
            view.addOnAttachStateChangeListener(new Activity(view, this));
        }
    }

    /* JADX INFO: renamed from: o.wyO$TaskDescription */
    public static final class TaskDescription implements C33570myu.ActionBar {
        public final /* synthetic */ AbstractC54119wyO<Binding, Presenter> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AbstractC54119wyO<Binding, Presenter> abstractC54119wyO) {
            this.copydefault = abstractC54119wyO;
        }

        @Override // o.C33570myu.ActionBar
        public final boolean AEQbTJ(android.view.View view) {
            int height = view.getHeight();
            if (height == 0) {
                return false;
            }
            java.lang.Integer num = this.copydefault.AYXKKw;
            if (num != null && height == num.intValue()) {
                return false;
            }
            this.copydefault.AYXKKw = java.lang.Integer.valueOf(height);
            java.lang.String tag = this.copydefault.getTAG();
            java.lang.Integer num2 = this.copydefault.AYXKKw;
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            Intrinsics.copydefault(this.copydefault.AYXKKw);
            pUU.KWHzl(tag, "EVENT_REQUEST_LAYOUT -> height:" + num2 + "--->dp:" + C33518mxv.KWHzl(applicationOLrzqt, r2.intValue()));
            this.copydefault.KWHzl();
            return false;
        }
    }

    /* JADX INFO: renamed from: o.wyO$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ AbstractC54119wyO<Binding, Presenter> KWHzl;
        public final /* synthetic */ C33570myu.ActionBar copydefault;

        public ActionBar(AbstractC54119wyO<Binding, Presenter> abstractC54119wyO, C33570myu.ActionBar actionBar) {
            this.KWHzl = abstractC54119wyO;
            this.copydefault = actionBar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C33570myu.ActionBar actionBar;
            android.view.ViewTreeObserver viewTreeObserver;
            if (this.KWHzl.getView() == null || (actionBar = this.copydefault) == null || !actionBar.AEQbTJ(this.KWHzl.getView()) || (viewTreeObserver = this.KWHzl.djBIcL) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public final void KWHzl(C33570myu.ActionBar actionBar) {
        android.view.View view = getView();
        this.djBIcL = view != null ? view.getViewTreeObserver() : null;
        ActionBar actionBar2 = new ActionBar(this, actionBar);
        this.AEQbTJ = actionBar2;
        android.view.ViewTreeObserver viewTreeObserver = this.djBIcL;
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(actionBar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        android.view.ViewTreeObserver viewTreeObserver2 = this.djBIcL;
        if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
            android.view.View view = getView();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.AEQbTJ);
            }
        } else {
            android.view.ViewTreeObserver viewTreeObserver3 = this.djBIcL;
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.removeOnGlobalLayoutListener(this.AEQbTJ);
            }
        }
        this.AEQbTJ = null;
        this.djBIcL = null;
        this.EZpvd = null;
    }

    public void KWHzl() {
        RxBus.KWHzl("event_update_layout");
    }

    /* JADX INFO: renamed from: o.wyO$Activity */
    public static final class Activity implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ AbstractC54119wyO KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity(android.view.View view, AbstractC54119wyO abstractC54119wyO) {
            this.EZpvd = view;
            this.KWHzl = abstractC54119wyO;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.removeOnAttachStateChangeListener(this);
            AbstractC54119wyO abstractC54119wyO = this.KWHzl;
            abstractC54119wyO.EZpvd = new TaskDescription(abstractC54119wyO);
            AbstractC54119wyO abstractC54119wyO2 = this.KWHzl;
            abstractC54119wyO2.KWHzl(abstractC54119wyO2.EZpvd);
        }
    }
}
