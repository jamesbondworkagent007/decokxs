package com.okinc.dexkline.trade.features.home.ui.cefi.kline;

import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.dexkline.trade.features.home.advanced.viewmodel.AdvancedKLineVM;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC34688ngn;
import o.C32278mWb;
import o.C34695ngu;
import o.C34698ngx;
import o.C49418uoF;
import o.C55296xhK;
import o.C56132xwz;
import o.C56391yDq;
import o.C56442yFn;
import o.oOV;

/* JADX INFO: loaded from: classes23.dex */
public final class AdvancedKLineFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oOV $binding;
    int label;
    final /* synthetic */ C34695ngu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedKLineFragment$initView$1(C34695ngu c34695ngu, oOV oov, Continuation<? super AdvancedKLineFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c34695ngu;
        this.$binding = oov;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedKLineFragment$initView$1(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedKLineFragment$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56132xwz c56132xwz;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AdvancedKLineVM advancedKLineVMDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = advancedKLineVMDjBIcL.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.copydefault(this.$binding, AbstractC34688ngn.TaskDescription.copydefault);
        } else {
            this.$binding.KWHzl.setCallback$OKKLine_kline_impl(this.this$0);
            C34695ngu c34695ngu = this.this$0;
            FragmentActivity activity = c34695ngu.getActivity();
            if (activity != null) {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.this$0.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                c56132xwz = (C56132xwz) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C56132xwz.class);
            } else {
                c56132xwz = null;
            }
            c34695ngu.djBIcL = c56132xwz;
            this.this$0.valueOf();
            this.this$0.ejfBZ();
        }
        C34698ngx c34698ngx = this.$binding.KWHzl;
        C34695ngu c34695ngu2 = this.this$0;
        Intrinsics.copydefault(c34698ngx);
        c34695ngu2.OLrzqt(c34698ngx);
        LinearLayoutCompat linearLayoutCompatOLrzqt = c34698ngx.OLrzqt();
        if (linearLayoutCompatOLrzqt != null) {
            linearLayoutCompatOLrzqt.setOnClickListener(new ActionBar(linearLayoutCompatOLrzqt, 1000L, c34695ngu2));
        }
        RelativeLayout relativeLayoutCopydefault = c34698ngx.copydefault();
        if (relativeLayoutCopydefault != null) {
            relativeLayoutCopydefault.setOnClickListener(new Activity(relativeLayoutCopydefault, 1000L, c34695ngu2, c34698ngx));
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements Function0<Unit> {
        public final /* synthetic */ C34698ngx copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C34698ngx c34698ngx) {
            this.copydefault = c34698ngx;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            ImageView imageViewValueOf = this.copydefault.valueOf();
            if (imageViewValueOf != null) {
                imageViewValueOf.setSelected(false);
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C34695ngu EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, C34695ngu c34695ngu) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c34695ngu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.djBIcL().valueOf();
                RxBus.AEQbTJ(new C49418uoF(""));
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C34695ngu KWHzl;
        public final /* synthetic */ C34698ngx OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, C34695ngu c34695ngu, C34698ngx c34698ngx) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c34695ngu;
            this.OLrzqt = c34698ngx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32278mWb c32278mWbOLrzqt = C32278mWb.Companion.OLrzqt(this.KWHzl.AhwBna, new Application(this.OLrzqt));
                FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c32278mWbOLrzqt.show(childFragmentManager);
                ImageView imageViewValueOf = this.OLrzqt.valueOf();
                if (imageViewValueOf != null) {
                    imageViewValueOf.setSelected(true);
                }
            }
        }
    }
}
