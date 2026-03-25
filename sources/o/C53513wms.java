package o;

import android.graphics.Paint;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53513wms extends AppCompatTextView {
    public boolean AEQbTJ;
    public Function1<? super java.util.List<SmartRecommendResp>, Unit> EZpvd;
    public boolean KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.wms$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53513wms(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53513wms(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHedging(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.wms.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53513wms(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53513wms(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C56280xzo c56280xzoOLrzqt;
        C56109xwc<java.lang.Exception> c56109xwcAhwBna;
        C56111xwe<java.util.List<SmartRecommendResp>> c56111xweAEQbTJ;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53513wms.OLrzqt(this.KWHzl);
            }
        });
        setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        setCompoundDrawableTintList(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, context)));
        if (ViewCompat.isAttachedToWindow(this)) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
            if (lifecycleOwner != null) {
                BotRecommendPresenter botRecommendPresenterCopydefault = copydefault();
                if (botRecommendPresenterCopydefault != null && (c56111xweAEQbTJ = botRecommendPresenterCopydefault.AEQbTJ()) != null) {
                    c56111xweAEQbTJ.observe(lifecycleOwner, new ActionBar(new Activity()));
                }
                BotRecommendPresenter botRecommendPresenterCopydefault2 = copydefault();
                if (botRecommendPresenterCopydefault2 == null || (c56280xzoOLrzqt = botRecommendPresenterCopydefault2.OLrzqt()) == null || (c56109xwcAhwBna = c56280xzoOLrzqt.AhwBna()) == null) {
                    return;
                }
                c56109xwcAhwBna.observe(lifecycleOwner, new ActionBar(new TaskDescription()));
                return;
            }
            return;
        }
        addOnAttachStateChangeListener(new Application(this, this));
    }

    public final void setClear(boolean z) {
        java.lang.String strOLrzqt;
        android.graphics.Rect bounds;
        this.KWHzl = z;
        if (z) {
            strOLrzqt = C33070mpX.OLrzqt(C55688xof.Application.getMediaMetadata, getContext());
        } else if (C56071xvr.gEmmrt.ejfBZ()) {
            strOLrzqt = C33070mpX.OLrzqt(C55688xof.Application.KWHzl, getContext());
        } else {
            strOLrzqt = C33070mpX.OLrzqt(C55688xof.Application.getText, getContext());
        }
        setText(strOLrzqt);
        int i = z ? C52761wXj.TaskDescription.dTTfOR : C48033uCm.ActionBar.hDKMBd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, context);
        if (drawableEZpvd != null) {
            drawableEZpvd.setAutoMirrored(false);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault = C55298xhM.copydefault(16.0f, context2);
            drawableEZpvd.setBounds(0, 0, iCopydefault, iCopydefault);
        }
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int iHeight = (int) (((fontMetrics.bottom - fontMetrics.top) - ((drawableEZpvd == null || (bounds = drawableEZpvd.getBounds()) == null) ? 0 : bounds.height())) / 2);
        setCompoundDrawablesRelative(drawableEZpvd, null, null, null);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context3));
        getPaint().setTextAlign(Paint.Align.LEFT);
        setIncludeFontPadding(false);
        setCompoundDrawables(drawableEZpvd, null, null, null);
        android.graphics.drawable.Drawable[] compoundDrawables = getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) yDV.zsXlph(compoundDrawables);
        if (drawable != null) {
            drawable.setBounds(drawable.getBounds().left, iHeight, drawable.getBounds().right, drawable.getBounds().height() + iHeight);
        }
    }

    public final BotRecommendPresenter copydefault() {
        return (BotRecommendPresenter) this.copydefault.getValue();
    }

    public static final BotRecommendPresenter OLrzqt(C53513wms c53513wms) {
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(c53513wms);
        if (viewModelStoreOwner != null) {
            return (BotRecommendPresenter) new ViewModelProvider(viewModelStoreOwner).get(BotRecommendPresenter.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.wms$Application */
    public static final class Application implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53513wms KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Application(android.view.View view, C53513wms c53513wms) {
            this.AEQbTJ = view;
            this.KWHzl = c53513wms;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            C56280xzo c56280xzoOLrzqt;
            C56109xwc<java.lang.Exception> c56109xwcAhwBna;
            C56111xwe<java.util.List<SmartRecommendResp>> c56111xweAEQbTJ;
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.KWHzl);
            if (lifecycleOwner != null) {
                BotRecommendPresenter botRecommendPresenterCopydefault = this.KWHzl.copydefault();
                if (botRecommendPresenterCopydefault != null && (c56111xweAEQbTJ = botRecommendPresenterCopydefault.AEQbTJ()) != null) {
                    c56111xweAEQbTJ.observe(lifecycleOwner, new ActionBar(this.KWHzl.new Activity()));
                }
                BotRecommendPresenter botRecommendPresenterCopydefault2 = this.KWHzl.copydefault();
                if (botRecommendPresenterCopydefault2 == null || (c56280xzoOLrzqt = botRecommendPresenterCopydefault2.OLrzqt()) == null || (c56109xwcAhwBna = c56280xzoOLrzqt.AhwBna()) == null) {
                    return;
                }
                c56109xwcAhwBna.observe(lifecycleOwner, new ActionBar(this.KWHzl.new TaskDescription()));
            }
        }
    }

    /* JADX INFO: renamed from: o.wms$Activity */
    public static final class Activity implements Function1<java.util.List<? extends SmartRecommendResp>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.util.List<? extends SmartRecommendResp> list) {
            OLrzqt(list);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.util.List<SmartRecommendResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C53513wms.this.AEQbTJ();
            if (!list.isEmpty()) {
                Function1 function1 = C53513wms.this.EZpvd;
                if (function1 != null) {
                    function1.invoke(list);
                    return;
                }
                return;
            }
            C55326xho.toast$default(C55688xof.Application.IMediaControllerCallback, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.wms$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.Exception, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Exception exc) {
            OLrzqt(exc);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            C53513wms.this.AEQbTJ();
            C55326xho.toast$default(C55688xof.Application.IMediaControllerCallback, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.wms */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCallBack$default(C53513wms c53513wms, java.lang.String str, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c53513wms.setCallBack(str, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt() {
        try {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
            Intrinsics.copydefault(appCompatActivityCopydefault, "");
            ((AbstractActivityC33041mov) appCompatActivityCopydefault).showLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        try {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
            Intrinsics.copydefault(appCompatActivityCopydefault, "");
            ((AbstractActivityC33041mov) appCompatActivityCopydefault).dismissLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("BotPlaceOrder_Top_SmartParm_Click", (TrackChannel[]) null, new Function1() { // from class: o.wmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53513wms.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wms$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53513wms EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53513wms c53513wms, Function0 function0, java.lang.String str) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c53513wms;
            this.KWHzl = function0;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.EZpvd.EZpvd()) {
                    Function0 function0 = this.KWHzl;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                this.EZpvd.OLrzqt();
                BotRecommendPresenter botRecommendPresenterCopydefault = this.EZpvd.copydefault();
                if (botRecommendPresenterCopydefault != null) {
                    BotRecommendPresenter.queryRecommendList$default(botRecommendPresenterCopydefault, this.OLrzqt, null, this.EZpvd.KWHzl(), 2, null);
                }
                this.EZpvd.AEQbTJ(this.OLrzqt);
            }
        }
    }

    public final void setCallBack(@NotNull java.lang.String str, Function1<? super java.util.List<SmartRecommendResp>, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = function1;
        setOnClickListener(new StateListAnimator(this, 1000L, this, function0, str));
    }
}
