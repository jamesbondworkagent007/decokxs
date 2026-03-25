package com.okinc.business.defi.wallet.eip7702.ui.bottomsheet;

import android.view.View;
import android.widget.Checkable;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C15290eCw;
import o.C33070mpX;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.wYF;

/* JADX INFO: loaded from: classes5.dex */
public final class EIP7702UpgradeBottomSheet$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15290eCw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702UpgradeBottomSheet$onViewCreated$1(C15290eCw c15290eCw, Continuation<? super EIP7702UpgradeBottomSheet$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c15290eCw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EIP7702UpgradeBottomSheet$onViewCreated$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EIP7702UpgradeBottomSheet$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$onViewCreated$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<EIP7702ChainStatusResp.ChainStatusItem, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15290eCw this$0;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$onViewCreated$1$1$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[EIP7702ChainStatus.values().length];
                try {
                    iArr[EIP7702ChainStatus.NeedUpgrade.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EIP7702ChainStatus.UpgradedNonOKX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EIP7702ChainStatus.Upgrading.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EIP7702ChainStatus.Revoking.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EIP7702ChainStatus.UpgradedOKX.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15290eCw c15290eCw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15290eCw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EIP7702ChainStatusResp.ChainStatusItem chainStatusItem, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(chainStatusItem, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EIP7702ChainStatusResp.ChainStatusItem chainStatusItem = (EIP7702ChainStatusResp.ChainStatusItem) this.L$0;
                wYF wyf = this.this$0.OLrzqt;
                if (wyf != null) {
                    C15290eCw c15290eCw = this.this$0;
                    int i = TaskDescription.KWHzl[EIP7702ChainStatus.Companion.copydefault(C56443yFo.AEQbTJ(chainStatusItem.getStatus())).ordinal()];
                    if (i == 1 || i == 2) {
                        C52794wYp c52794wYpCopydefault = wyf.copydefault();
                        if (c52794wYpCopydefault != null) {
                            c52794wYpCopydefault.fIwbmz();
                        }
                        wyf.setType(14);
                        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl1));
                        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
                        if (c52794wYpCopydefault2 != null) {
                            c52794wYpCopydefault2.setGravity(17);
                        }
                        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
                        if (c52794wYpCopydefault3 != null) {
                            c52794wYpCopydefault3.setOnClickListener(new ActionBar(c52794wYpCopydefault3, 1000L, c15290eCw));
                        }
                        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh));
                        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
                        if (c52794wYpAEQbTJ != null) {
                            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, c15290eCw));
                        }
                    } else if (i == 3 || i == 4) {
                        wyf.setType(5);
                        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.accept));
                        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
                        if (c52794wYpCopydefault4 != null) {
                            c52794wYpCopydefault4.OLrzqt(0L);
                        }
                    } else if (i == 5) {
                        c15290eCw.KWHzl(false);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$onViewCreated$1$1$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ C15290eCw KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(View view, long j, C15290eCw c15290eCw) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.KWHzl = c15290eCw;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.KWHzl.KWHzl(true);
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.eip7702.ui.bottomsheet.EIP7702UpgradeBottomSheet$onViewCreated$1$1$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C15290eCw EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(View view, long j, C15290eCw c15290eCw) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = c15290eCw;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.EZpvd.KWHzl();
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<EIP7702ChainStatusResp.ChainStatusItem> sharedFlowCopydefault = this.this$0.AEQbTJ().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowCopydefault, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
