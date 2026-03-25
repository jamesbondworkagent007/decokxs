package com.okinc.business.defi.wallet.custom;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.okinc.business.defi.wallet.custom.CustomTokenFragment$observeData$1;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C16178eey;
import o.C16263egd;
import o.C16483ekl;
import o.C52761wXj;
import o.C55001xbh;
import o.C55018xby;
import o.C56391yDq;
import o.C56442yFn;
import o.C6980aZc;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomTokenFragment$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C16178eey this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTokenFragment$observeData$1(C16178eey c16178eey, Continuation<? super CustomTokenFragment$observeData$1> continuation) {
        super(2, continuation);
        this.this$0 = c16178eey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CustomTokenFragment$observeData$1 customTokenFragment$observeData$1 = new CustomTokenFragment$observeData$1(this.this$0, continuation);
        customTokenFragment$observeData$1.L$0 = obj;
        return customTokenFragment$observeData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomTokenFragment$observeData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            StateFlow<C16263egd> stateFlowKWHzl = this.this$0.fetchVPNInfo().KWHzl();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, coroutineScope);
            this.label = 1;
            if (stateFlowKWHzl.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.custom.CustomTokenFragment$observeData$1$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ CoroutineScope AEQbTJ;
        public final /* synthetic */ C16178eey OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(C16178eey c16178eey, CoroutineScope coroutineScope) {
            this.OLrzqt = c16178eey;
            this.AEQbTJ = coroutineScope;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(C16263egd c16263egd, Continuation<? super Unit> continuation) {
            C55018xby c55018xby;
            C55018xby c55018xby2;
            FrameLayout frameLayout;
            RelativeLayout relativeLayout;
            FrameLayout frameLayout2;
            FrameLayout frameLayout3;
            FrameLayout frameLayout4;
            RelativeLayout relativeLayout2;
            pUU.OLrzqt(">>>chain observeData:" + c16263egd);
            pUU.OLrzqt(">>>chain observeData: protocolList:" + c16263egd.KWHzl());
            this.OLrzqt.dismissLoading();
            if (c16263egd.copydefault()) {
                C16483ekl c16483ekl = this.OLrzqt.OLrzqt;
                if (c16483ekl != null && (relativeLayout2 = c16483ekl.AhwBna) != null) {
                    relativeLayout2.setVisibility(8);
                }
                C16483ekl c16483ekl2 = this.OLrzqt.OLrzqt;
                if (c16483ekl2 != null && (frameLayout4 = c16483ekl2.AYXKKw) != null) {
                    frameLayout4.setVisibility(0);
                }
                C16483ekl c16483ekl3 = this.OLrzqt.OLrzqt;
                if (c16483ekl3 != null && (frameLayout3 = c16483ekl3.AYXKKw) != null) {
                    final C16178eey c16178eey = this.OLrzqt;
                    String string = c16178eey.getString(C13754dXa.FragmentManager.OhcwxsRkSIEV);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = c16178eey.getString(C13754dXa.FragmentManager.OFhtUX);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    C6980aZc.AEQbTJ(c16178eey, frameLayout3, string, string2, (16 & 8) != 0 ? null : c16178eey.getString(C13754dXa.FragmentManager.QbewEr), (16 & 16) != 0 ? C52761wXj.TaskDescription.getSerial : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.efS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return CustomTokenFragment$observeData$1.AnonymousClass4.AEQbTJ(c16178eey);
                        }
                    });
                }
                rVN.reportFullyDrawn$default((Fragment) this.OLrzqt, false, (String) null, 2, (Object) null);
            } else {
                C16483ekl c16483ekl4 = this.OLrzqt.OLrzqt;
                if (c16483ekl4 != null && (frameLayout2 = c16483ekl4.AYXKKw) != null) {
                    C6980aZc.OLrzqt(this.OLrzqt, frameLayout2);
                }
                C16483ekl c16483ekl5 = this.OLrzqt.OLrzqt;
                if (c16483ekl5 != null && (relativeLayout = c16483ekl5.AhwBna) != null) {
                    relativeLayout.setVisibility(0);
                }
                C16483ekl c16483ekl6 = this.OLrzqt.OLrzqt;
                if (c16483ekl6 != null && (frameLayout = c16483ekl6.AYXKKw) != null) {
                    frameLayout.setVisibility(8);
                }
                C16483ekl c16483ekl7 = this.OLrzqt.OLrzqt;
                if (c16483ekl7 != null && (c55018xby2 = c16483ekl7.KWHzl) != null) {
                    c55018xby2.setVisibility(c16263egd.AEQbTJ() ? 0 : 8);
                }
                C16483ekl c16483ekl8 = this.OLrzqt.OLrzqt;
                if (c16483ekl8 != null && (c55018xby = c16483ekl8.KWHzl) != null) {
                    c55018xby.setText("");
                }
                this.OLrzqt.copydefault(c16263egd.gEmmrt());
                rVN.reportFullyDrawn$default((Fragment) this.OLrzqt, true, (String) null, 2, (Object) null);
                if (c16263egd.AEQbTJ()) {
                    this.OLrzqt.fIwbmz.clear();
                    this.OLrzqt.fIwbmz.addAll(c16263egd.KWHzl());
                    if (!c16263egd.OLrzqt()) {
                        this.OLrzqt.gEmmrt();
                    } else if (c16263egd.EZpvd() != null) {
                        this.OLrzqt.copydefault(c16263egd.EZpvd());
                    } else {
                        C16178eey c16178eey2 = this.OLrzqt;
                        C55001xbh c55001xbhValues = c16178eey2.values();
                        if (c55001xbhValues != null) {
                            c55001xbhValues.setText("");
                        }
                        C55001xbh c55001xbhValues2 = c16178eey2.values();
                        if (c55001xbhValues2 != null) {
                            c55001xbhValues2.clearFocus();
                        }
                        C55001xbh c55001xbhDbNXlk = c16178eey2.DbNXlk();
                        if (c55001xbhDbNXlk != null) {
                            c55001xbhDbNXlk.setCompoundDrawablesRelative(null, null, null, null);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C16178eey c16178eey) {
            c16178eey.fetchVPNInfo().OLrzqt();
            return Unit.INSTANCE;
        }
    }
}
