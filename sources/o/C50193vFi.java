package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47978uAl;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vFi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50193vFi extends AppCompatTextView {
    public androidx.fragment.app.FragmentManager AEQbTJ;
    public Function1<? super TradeMenuItemBean, Unit> EZpvd;
    public java.util.List<TradeMenuItemBean> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50193vFi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C49511upt.TaskDescription.AhwBna);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        } else {
            drawableKWHzl = null;
        }
        setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
        setCompoundDrawablePadding(C55298xhM.dp2px$default(7.0f, null, 1, null));
        setOnClickListener(new TaskDescription(this, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vFi$Activity */
    public static final class Activity implements C47978uAl.StateListAnimator {
        public Activity() {
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            java.util.List<TradeMenuItemBean> list = C50193vFi.this.OLrzqt;
            if (list != null) {
                for (TradeMenuItemBean tradeMenuItemBean2 : list) {
                    tradeMenuItemBean2.setSelect(Intrinsics.EZpvd((java.lang.Object) tradeMenuItemBean2.getTitle(), (java.lang.Object) tradeMenuItemBean.getTitle()));
                }
            }
            C50193vFi.this.setText(tradeMenuItemBean.getTitle());
            Function1 function1 = C50193vFi.this.EZpvd;
            if (function1 != null) {
                function1.invoke(tradeMenuItemBean);
            }
            C50193vFi.this.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: o.vFi$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C50193vFi.this.setSelected(false);
        }
    }

    public final void setData(@NotNull java.util.List<TradeMenuItemBean> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super TradeMenuItemBean, Unit> function1) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = list;
        this.AEQbTJ = fragmentManager;
        this.EZpvd = function1;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TradeMenuItemBean) next).isSelect()) {
                    break;
                }
            }
        }
        TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) next;
        setText(tradeMenuItemBean != null ? tradeMenuItemBean.getTitle() : null);
    }

    /* JADX INFO: renamed from: o.vFi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50193vFi AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50193vFi c50193vFi) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c50193vFi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.util.List list = this.AEQbTJ.OLrzqt;
                if (list == null || list.isEmpty()) {
                    return;
                }
                this.AEQbTJ.setSelected(true);
                C47978uAl.Application application = C47978uAl.Companion;
                java.util.List listAhwBna = this.AEQbTJ.OLrzqt;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(application, listAhwBna, null, false, null, 0, 30, null);
                c47978uAlNewInstance$default.KWHzl(this.AEQbTJ.new Activity());
                c47978uAlNewInstance$default.copydefault(this.AEQbTJ.new StateListAnimator());
                androidx.fragment.app.FragmentManager fragmentManager = this.AEQbTJ.AEQbTJ;
                if (fragmentManager == null) {
                    return;
                }
                c47978uAlNewInstance$default.show(fragmentManager, "BotSelectTypeTextView");
            }
        }
    }
}
