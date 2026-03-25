package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC49363unD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC39282ppP extends C57662yme implements View.OnClickListener, InterfaceC49363unD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public InterfaceC35983oKy KWHzl;
    public AbstractC36037oMy copydefault;
    public java.lang.String AhwBna = "";
    public java.lang.String djBIcL = "";
    public int AEQbTJ = C55298xhM.dp2px$default(24.0f, null, 1, null);
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ppR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ViewOnClickListenerC39282ppP.AEQbTJ(this.copydefault));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC35983oKy interfaceC35983oKy) {
        Intrinsics.checkNotNullParameter(interfaceC35983oKy, "");
        this.KWHzl = interfaceC35983oKy;
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49361unB
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestOnLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49364unE
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>> java.lang.Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, state, function2, continuation);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, state, function2);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        return InterfaceC49363unD.ActionBar.AEQbTJ(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        return InterfaceC49363unD.ActionBar.OLrzqt(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        return InterfaceC49363unD.ActionBar.EZpvd(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
    }

    @Override // o.InterfaceC49370unK
    public <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        return InterfaceC49363unD.ActionBar.KWHzl(this, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
    }

    @Override // o.InterfaceC49362unC
    public <T extends InterfaceC49369unJ<T>> Flow<T> uiStateFlow(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        return InterfaceC49363unD.ActionBar.copydefault(this, abstractC49411unz);
    }

    /* JADX INFO: renamed from: o.ppP$Application */
    public static final class Application implements View.OnLayoutChangeListener {
        public Application() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            AbstractC36037oMy abstractC36037oMy = ViewOnClickListenerC39282ppP.this.copydefault;
            if (abstractC36037oMy != null) {
                for (android.widget.TextView textView : yDY.gEmmrt(abstractC36037oMy.fJNWhG, abstractC36037oMy.AkhnZx, abstractC36037oMy.isConnected, abstractC36037oMy.EZpvd, abstractC36037oMy.values)) {
                    Intrinsics.copydefault(textView);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = ViewOnClickListenerC39282ppP.this.AEQbTJ();
                        textView.setLayoutParams(layoutParams);
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            }
        }
    }

    public final int AEQbTJ() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int AEQbTJ(ViewOnClickListenerC39282ppP viewOnClickListenerC39282ppP) {
        return (C33570myu.AEQbTJ() - (viewOnClickListenerC39282ppP.AEQbTJ * 3)) / 4;
    }

    /* JADX INFO: renamed from: o.ppP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ppP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ViewOnClickListenerC39282ppP copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("inst_id", str);
            bundle.putString("instType", str2);
            ViewOnClickListenerC39282ppP viewOnClickListenerC39282ppP = new ViewOnClickListenerC39282ppP();
            viewOnClickListenerC39282ppP.setArguments(bundle);
            return viewOnClickListenerC39282ppP;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QOLQEE, viewGroup, false);
        this.copydefault = (AbstractC36037oMy) DataBindingUtil.bind(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        android.view.View root;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        android.widget.TextView textView10;
        android.widget.TextView textView11;
        android.widget.TextView textView12;
        android.widget.TextView textView13;
        android.widget.TextView textView14;
        android.widget.TextView textView15;
        java.lang.String string2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("inst_id")) == null) {
            string = "";
        }
        this.djBIcL = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("instType")) != null) {
            str = string2;
        }
        this.AhwBna = str;
        if (SPUtils.getBoolean("hide_kline_drawing_data", false)) {
            copydefault(true);
        } else {
            copydefault(false);
        }
        AbstractC36037oMy abstractC36037oMy = this.copydefault;
        if (abstractC36037oMy != null && (textView15 = abstractC36037oMy.DbNXlk) != null) {
            textView15.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy2 = this.copydefault;
        if (abstractC36037oMy2 != null && (textView14 = abstractC36037oMy2.copydefault) != null) {
            textView14.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy3 = this.copydefault;
        if (abstractC36037oMy3 != null && (textView13 = abstractC36037oMy3.fJNWhG) != null) {
            textView13.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy4 = this.copydefault;
        if (abstractC36037oMy4 != null && (textView12 = abstractC36037oMy4.AkhnZx) != null) {
            textView12.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy5 = this.copydefault;
        if (abstractC36037oMy5 != null && (textView11 = abstractC36037oMy5.values) != null) {
            textView11.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy6 = this.copydefault;
        if (abstractC36037oMy6 != null && (textView10 = abstractC36037oMy6.isConnected) != null) {
            textView10.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy7 = this.copydefault;
        if (abstractC36037oMy7 != null && (textView9 = abstractC36037oMy7.EZpvd) != null) {
            textView9.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy8 = this.copydefault;
        if (abstractC36037oMy8 != null && (textView8 = abstractC36037oMy8.AhwBna) != null) {
            textView8.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy9 = this.copydefault;
        if (abstractC36037oMy9 != null && (textView7 = abstractC36037oMy9.AYXKKw) != null) {
            textView7.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy10 = this.copydefault;
        if (abstractC36037oMy10 != null && (textView6 = abstractC36037oMy10.gEmmrt) != null) {
            textView6.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy11 = this.copydefault;
        if (abstractC36037oMy11 != null && (textView5 = abstractC36037oMy11.fetchVPNInfo) != null) {
            textView5.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy12 = this.copydefault;
        if (abstractC36037oMy12 != null && (textView4 = abstractC36037oMy12.KWHzl) != null) {
            textView4.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy13 = this.copydefault;
        if (abstractC36037oMy13 != null && (textView3 = abstractC36037oMy13.valueOf) != null) {
            textView3.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy14 = this.copydefault;
        if (abstractC36037oMy14 != null && (textView2 = abstractC36037oMy14.AEQbTJ) != null) {
            textView2.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy15 = this.copydefault;
        if (abstractC36037oMy15 != null && (textView = abstractC36037oMy15.djBIcL) != null) {
            textView.setOnClickListener(this);
        }
        AbstractC36037oMy abstractC36037oMy16 = this.copydefault;
        if (abstractC36037oMy16 != null && (root = abstractC36037oMy16.getRoot()) != null) {
            if (ViewCompat.isLaidOut(root) && !root.isLayoutRequested()) {
                AbstractC36037oMy abstractC36037oMy17 = this.copydefault;
                if (abstractC36037oMy17 != null) {
                    for (android.widget.TextView textView16 : yDY.gEmmrt(abstractC36037oMy17.fJNWhG, abstractC36037oMy17.AkhnZx, abstractC36037oMy17.isConnected, abstractC36037oMy17.EZpvd, abstractC36037oMy17.values)) {
                        Intrinsics.copydefault(textView16);
                        ViewGroup.LayoutParams layoutParams = textView16.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = AEQbTJ();
                            textView16.setLayoutParams(layoutParams);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                }
            } else {
                root.addOnLayoutChangeListener(new Application());
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.ppT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC39282ppP.AYXKKw(this.copydefault);
            }
        });
    }

    public static final void AYXKKw(ViewOnClickListenerC39282ppP viewOnClickListenerC39282ppP) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC39282ppP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault(boolean z) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        if (z) {
            AbstractC36037oMy abstractC36037oMy = this.copydefault;
            if (abstractC36037oMy != null && (textView4 = abstractC36037oMy.DbNXlk) != null) {
                textView4.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.fERRXa));
            }
            AbstractC36037oMy abstractC36037oMy2 = this.copydefault;
            if (abstractC36037oMy2 == null || (textView3 = abstractC36037oMy2.DbNXlk) == null) {
                return;
            }
            pFQ.AEQbTJ(textView3, C52761wXj.TaskDescription.invokespecialgBtXYZ);
            return;
        }
        AbstractC36037oMy abstractC36037oMy3 = this.copydefault;
        if (abstractC36037oMy3 != null && (textView2 = abstractC36037oMy3.DbNXlk) != null) {
            textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.fjfviF));
        }
        AbstractC36037oMy abstractC36037oMy4 = this.copydefault;
        if (abstractC36037oMy4 == null || (textView = abstractC36037oMy4.DbNXlk) == null) {
            return;
        }
        pFQ.AEQbTJ(textView, C52761wXj.TaskDescription.ODCBUN);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaItemFlags;
        if (numValueOf != null && numValueOf.intValue() == i) {
            if (SPUtils.getBoolean("hide_kline_drawing_data", false)) {
                copydefault(false);
            } else {
                copydefault(true);
            }
            InterfaceC35983oKy interfaceC35983oKy = this.KWHzl;
            if (interfaceC35983oKy != null) {
                interfaceC35983oKy.OLrzqt();
                return;
            }
            return;
        }
        int i2 = C35964oKf.StateListAnimator.getMediaId;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            InterfaceC35983oKy interfaceC35983oKy2 = this.KWHzl;
            if (interfaceC35983oKy2 != null) {
                interfaceC35983oKy2.KWHzl();
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ppV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC39282ppP.EZpvd((EventParamsList) obj);
                }
            });
            return;
        }
        int i3 = C35964oKf.StateListAnimator.putCallback;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            dismiss();
            DrawLineData.LineType lineType = DrawLineData.LineType.SEGMENT;
            AEQbTJ(lineType);
            OLrzqt(lineType);
            return;
        }
        int i4 = C35964oKf.StateListAnimator.getMediaItem;
        if (numValueOf != null && numValueOf.intValue() == i4) {
            dismiss();
            DrawLineData.LineType lineType2 = DrawLineData.LineType.INFO_SEGMENT;
            AEQbTJ(lineType2);
            OLrzqt(lineType2);
            return;
        }
        int i5 = C35964oKf.StateListAnimator.registerCallbackMessenger;
        if (numValueOf != null && numValueOf.intValue() == i5) {
            dismiss();
            DrawLineData.LineType lineType3 = DrawLineData.LineType.LINE;
            AEQbTJ(lineType3);
            OLrzqt(lineType3);
            return;
        }
        int i6 = C35964oKf.StateListAnimator.unregisterCallbackMessenger;
        if (numValueOf != null && numValueOf.intValue() == i6) {
            dismiss();
            DrawLineData.LineType lineType4 = DrawLineData.LineType.RADIAL;
            AEQbTJ(lineType4);
            OLrzqt(lineType4);
            return;
        }
        int i7 = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserServiceCallbackImpl;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            dismiss();
            DrawLineData.LineType lineType5 = DrawLineData.LineType.ARROW;
            AEQbTJ(lineType5);
            OLrzqt(lineType5);
            return;
        }
        int i8 = C35964oKf.StateListAnimator.onSearchResult;
        if (numValueOf != null && numValueOf.intValue() == i8) {
            dismiss();
            DrawLineData.LineType lineType6 = DrawLineData.LineType.H_SEGMENT;
            AEQbTJ(lineType6);
            OLrzqt(lineType6);
            return;
        }
        int i9 = C35964oKf.StateListAnimator.MediaBrowserCompatSearchResultReceiver;
        if (numValueOf != null && numValueOf.intValue() == i9) {
            dismiss();
            DrawLineData.LineType lineType7 = DrawLineData.LineType.H_LINE;
            AEQbTJ(lineType7);
            OLrzqt(lineType7);
            return;
        }
        int i10 = C35964oKf.StateListAnimator.MediaBrowserCompatSearchCallback;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            dismiss();
            DrawLineData.LineType lineType8 = DrawLineData.LineType.H_RADIAL;
            AEQbTJ(lineType8);
            OLrzqt(lineType8);
            return;
        }
        int i11 = C35964oKf.StateListAnimator.MediaBrowserCompatSubscription;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            dismiss();
            DrawLineData.LineType lineType9 = DrawLineData.LineType.PRICE_LINE;
            AEQbTJ(lineType9);
            OLrzqt(lineType9);
            return;
        }
        int i12 = C35964oKf.StateListAnimator.isPlayable;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            dismiss();
            DrawLineData.LineType lineType10 = DrawLineData.LineType.FIBONACCI;
            AEQbTJ(lineType10);
            OLrzqt(lineType10);
            return;
        }
        int i13 = C35964oKf.StateListAnimator.createFromParcel;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            dismiss();
            DrawLineData.LineType lineType11 = DrawLineData.LineType.G_RECTANGLE;
            AEQbTJ(lineType11);
            OLrzqt(lineType11);
            return;
        }
        int i14 = C35964oKf.StateListAnimator.MediaBrowserCompatMediaItem1;
        if (numValueOf != null && numValueOf.intValue() == i14) {
            dismiss();
            DrawLineData.LineType lineType12 = DrawLineData.LineType.G_CIRCLE;
            AEQbTJ(lineType12);
            OLrzqt(lineType12);
            return;
        }
        int i15 = C35964oKf.StateListAnimator.writeToParcel;
        if (numValueOf != null && numValueOf.intValue() == i15) {
            dismiss();
            DrawLineData.LineType lineType13 = DrawLineData.LineType.G_TRIANGLE;
            AEQbTJ(lineType13);
            OLrzqt(lineType13);
        }
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", RequestParameters.SUBRESOURCE_DELETE, true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final DrawLineData.LineType lineType) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ppQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC39282ppP.AEQbTJ(lineType, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(DrawLineData.LineType lineType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", lineType.getStrName(), true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("chart_layout", "fullscreen", true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(DrawLineData.LineType lineType) {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(lineType);
        if (lineType == DrawLineData.LineType.G_TRIANGLE || lineType == DrawLineData.LineType.G_RECTANGLE || lineType == DrawLineData.LineType.G_CIRCLE) {
            drawLineData.copydefault(SPUtils.getString("draw_fill_color", "#262862FF"));
        }
        InterfaceC35983oKy interfaceC35983oKy = this.KWHzl;
        if (interfaceC35983oKy != null) {
            interfaceC35983oKy.copydefault();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
