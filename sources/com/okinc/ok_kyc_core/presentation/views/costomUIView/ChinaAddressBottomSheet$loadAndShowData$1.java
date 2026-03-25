package com.okinc.ok_kyc_core.presentation.views.costomUIView;

import android.view.View;
import android.widget.Checkable;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean;
import com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressBottomSheet$loadAndShowData$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43837rwn;
import o.C41976rBt;
import o.C42414rRz;
import o.C43746rvB;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43709ruR;
import o.pUU;
import o.rAP;

/* JADX INFO: loaded from: classes23.dex */
public final class ChinaAddressBottomSheet$loadAndShowData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $level;
    final /* synthetic */ String $parentId;
    Object L$0;
    int label;
    final /* synthetic */ C42414rRz this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChinaAddressType.values().length];
            try {
                iArr[ChinaAddressType.province.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChinaAddressType.city.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChinaAddressType.district.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChinaAddressBottomSheet$loadAndShowData$1(String str, String str2, C42414rRz c42414rRz, Continuation<? super ChinaAddressBottomSheet$loadAndShowData$1> continuation) {
        super(2, continuation);
        this.$level = str;
        this.$parentId = str2;
        this.this$0 = c42414rRz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChinaAddressBottomSheet$loadAndShowData$1(this.$level, this.$parentId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChinaAddressBottomSheet$loadAndShowData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C42414rRz OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, C42414rRz c42414rRz, String str, String str2) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c42414rRz;
            this.AEQbTJ = str;
            this.EZpvd = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(this.AEQbTJ, this.EZpvd);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        ChinaAddressBean chinaAddressBean;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        AbstractC43837rwn abstractC43837rwn = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ChinaAddressBottomSheet", "loadData->level=" + this.$level + "  parentId=" + this.$parentId);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.$level, this.$parentId, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43837rwn abstractC43837rwn2 = this.this$0.KWHzl;
        if (abstractC43837rwn2 == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn2 = null;
        }
        abstractC43837rwn2.copydefault.copydefault();
        final int i2 = 0;
        if (((ArrayList) objectRef.element).isEmpty()) {
            AbstractC43837rwn abstractC43837rwn3 = this.this$0.KWHzl;
            if (abstractC43837rwn3 == null) {
                Intrinsics.gEmmrt("");
                abstractC43837rwn3 = null;
            }
            C52794wYp c52794wYp = abstractC43837rwn3.OLrzqt.KWHzl;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this.this$0, this.$level, this.$parentId));
            AbstractC43837rwn abstractC43837rwn4 = this.this$0.KWHzl;
            if (abstractC43837rwn4 == null) {
                Intrinsics.gEmmrt("");
                abstractC43837rwn4 = null;
            }
            abstractC43837rwn4.OLrzqt.getRoot().setVisibility(0);
            AbstractC43837rwn abstractC43837rwn5 = this.this$0.KWHzl;
            if (abstractC43837rwn5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC43837rwn = abstractC43837rwn5;
            }
            abstractC43837rwn.AEQbTJ.setVisibility(8);
        } else {
            AbstractC43837rwn abstractC43837rwn6 = this.this$0.KWHzl;
            if (abstractC43837rwn6 == null) {
                Intrinsics.gEmmrt("");
                abstractC43837rwn6 = null;
            }
            abstractC43837rwn6.OLrzqt.getRoot().setVisibility(8);
            AbstractC43837rwn abstractC43837rwn7 = this.this$0.KWHzl;
            if (abstractC43837rwn7 == null) {
                Intrinsics.gEmmrt("");
                abstractC43837rwn7 = null;
            }
            abstractC43837rwn7.AEQbTJ.setVisibility(0);
            this.this$0.copydefault.setItems((List) objectRef.element);
            int i3 = StateListAnimator.KWHzl[this.this$0.djBIcL.ordinal()];
            if (i3 == 1) {
                chinaAddressBean = this.this$0.AYXKKw;
            } else if (i3 == 2) {
                chinaAddressBean = this.this$0.AhwBna;
            } else if (i3 == 3) {
                chinaAddressBean = this.this$0.gEmmrt;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it = ((List) objectRef.element).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.EZpvd((Object) ((ChinaAddressBean) it.next()).getId(), (Object) (chinaAddressBean != null ? chinaAddressBean.getId() : null))) {
                    break;
                }
                i2++;
            }
            this.this$0.copydefault.notifyDataSetChanged();
            if (i2 > 0) {
                AbstractC43837rwn abstractC43837rwn8 = this.this$0.KWHzl;
                if (abstractC43837rwn8 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC43837rwn = abstractC43837rwn8;
                }
                RecyclerView recyclerView = abstractC43837rwn.AEQbTJ;
                final C42414rRz c42414rRz = this.this$0;
                recyclerView.post(new Runnable() { // from class: o.rRG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChinaAddressBottomSheet$loadAndShowData$1.invokeSuspend$lambda$2(c42414rRz, i2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressBottomSheet$loadAndShowData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $level;
        final /* synthetic */ Ref.ObjectRef<ArrayList<ChinaAddressBean>> $list;
        final /* synthetic */ String $parentId;
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<ArrayList<ChinaAddressBean>> objectRef, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$list = objectRef;
            this.$level = str;
            this.$parentId = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$list, this.$level, this.$parentId, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef<ArrayList<ChinaAddressBean>> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ("", new HashMap<>()), null, 4, null);
                Ref.ObjectRef<ArrayList<ChinaAddressBean>> objectRef2 = this.$list;
                C41976rBt c41976rBt = new C41976rBt(c43746rvB);
                String str = this.$level;
                String str2 = this.$parentId;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objAEQbTJ = c41976rBt.AEQbTJ(str, str2, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                t = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(C42414rRz c42414rRz, int i) {
        AbstractC43837rwn abstractC43837rwn = c42414rRz.KWHzl;
        if (abstractC43837rwn == null) {
            Intrinsics.gEmmrt("");
            abstractC43837rwn = null;
        }
        abstractC43837rwn.AEQbTJ.smoothScrollToPosition(i);
    }
}
