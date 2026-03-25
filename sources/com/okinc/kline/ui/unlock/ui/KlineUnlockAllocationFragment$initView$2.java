package com.okinc.kline.ui.unlock.ui;

import android.content.Context;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.okinc.kline.ui.unlock.ui.KlineUnlockAllocationFragment$initView$2;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C33061mpO;
import o.C35964oKf;
import o.C36094oPa;
import o.C39708pxT;
import o.C39713pxY;
import o.C39729pxo;
import o.C39737pxw;
import o.C39773pyf;
import o.C39774pyg;
import o.C52761wXj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.pTB;
import o.pTD;
import o.rVN;

/* JADX INFO: loaded from: classes23.dex */
public final class KlineUnlockAllocationFragment$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ C39729pxo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineUnlockAllocationFragment$initView$2(C39729pxo c39729pxo, View view, Continuation<? super KlineUnlockAllocationFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c39729pxo;
        this.$view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineUnlockAllocationFragment$initView$2(this.this$0, this.$view, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineUnlockAllocationFragment$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.KlineUnlockAllocationFragment$initView$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends C39708pxT>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $view;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C39729pxo this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C39729pxo c39729pxo, View view, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c39729pxo;
            this.$view = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$view, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends C39708pxT>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<? extends List<C39708pxT>>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<? extends List<C39708pxT>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AppCompatTextView appCompatTextView;
            AppCompatTextView appCompatTextView2;
            AppCompatTextView appCompatTextView3;
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            C39774pyg c39774pyg;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    C36094oPa c36094oPaAYXKKw = this.this$0.AYXKKw();
                    if (c36094oPaAYXKKw != null && (c39774pyg = c36094oPaAYXKKw.djBIcL) != null) {
                        C39729pxo c39729pxo = this.this$0;
                        C39773pyf c39773pyf = C39773pyf.OLrzqt;
                        Context contextRequireContext = c39729pxo.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        c39774pyg.setData(c39773pyf.KWHzl(contextRequireContext, (List) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault(), c39774pyg));
                        c39774pyg.highlightValues(null);
                        c39729pxo.KWHzl().AEQbTJ().setValue("");
                        c39774pyg.notifyDataSetChanged();
                        c39774pyg.animateY(c39729pxo.AhwBna());
                    }
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    if (!((Collection) activity.copydefault()).isEmpty()) {
                        C39729pxo.TaskDescription taskDescription = this.this$0.gEmmrt;
                        Iterable iterable = (Iterable) activity.copydefault();
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C39737pxw<>((C39708pxT) it.next(), false, 2, null));
                        }
                        taskDescription.EZpvd(arrayList);
                        C36094oPa c36094oPaAYXKKw2 = this.this$0.AYXKKw();
                        if (c36094oPaAYXKKw2 != null && (linearLayout2 = c36094oPaAYXKKw2.OLrzqt) != null) {
                            final C39729pxo c39729pxo2 = this.this$0;
                            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.pxn
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    KlineUnlockAllocationFragment$initView$2.AnonymousClass2.invokeSuspend$lambda$2(c39729pxo2, view);
                                }
                            });
                        }
                    }
                    C36094oPa c36094oPaAYXKKw3 = this.this$0.AYXKKw();
                    if (c36094oPaAYXKKw3 != null && (linearLayout = c36094oPaAYXKKw3.OLrzqt) != null) {
                        linearLayout.setVisibility(((List) activity.copydefault()).size() > 5 ? 0 : 8);
                    }
                    C39708pxT c39708pxT = (C39708pxT) CollectionsKt___CollectionsKt.firstOrNull((List) activity.copydefault());
                    long jEZpvd = c39708pxT != null ? c39708pxT.EZpvd() : 0L;
                    if (jEZpvd == 0) {
                        C36094oPa c36094oPaAYXKKw4 = this.this$0.AYXKKw();
                        if (c36094oPaAYXKKw4 != null && (appCompatTextView3 = c36094oPaAYXKKw4.AYXKKw) != null) {
                            appCompatTextView3.setVisibility(8);
                        }
                    } else {
                        C36094oPa c36094oPaAYXKKw5 = this.this$0.AYXKKw();
                        if (c36094oPaAYXKKw5 != null && (appCompatTextView2 = c36094oPaAYXKKw5.AYXKKw) != null) {
                            appCompatTextView2.setVisibility(0);
                        }
                        String iCUCompact$default = pTB.formatICUCompact$default(C56443yFo.KWHzl(jEZpvd), RoundingMode.HALF_UP, null, null, null, 14, null);
                        String strCopydefault = pTD.copydefault(this.this$0, C35964oKf.Fragment.zEkrwr, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", iCUCompact$default)));
                        C36094oPa c36094oPaAYXKKw6 = this.this$0.AYXKKw();
                        if (c36094oPaAYXKKw6 != null && (appCompatTextView = c36094oPaAYXKKw6.AYXKKw) != null) {
                            String[] strArr = {iCUCompact$default};
                            final C39729pxo c39729pxo3 = this.this$0;
                            appCompatTextView.setText(C33061mpO.setupSpanStyles$default(strCopydefault, strArr, 0, null, false, new Function1() { // from class: o.pxs
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return KlineUnlockAllocationFragment$initView$2.AnonymousClass2.invokeSuspend$lambda$3(c39729pxo3, (java.util.List) obj2);
                                }
                            }, 14, null));
                        }
                    }
                    this.$view.setVisibility(0);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    this.$view.setVisibility(8);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(C39729pxo c39729pxo, View view) {
            c39729pxo.KWHzl().copydefault().setValue(Boolean.valueOf(!c39729pxo.KWHzl().copydefault().getValue().booleanValue()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(C39729pxo c39729pxo, List list) {
            list.add(new TextAppearanceSpan(c39729pxo.getContext(), C52761wXj.LoaderManager.gHZMYf));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39729pxo c39729pxo = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c39729pxo, c39729pxo.valueOf(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.KlineUnlockAllocationFragment$initView$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).AYXKKw();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).OLrzqt((InterfaceC49371unL<? extends List<C39708pxT>>) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, this.$view, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
