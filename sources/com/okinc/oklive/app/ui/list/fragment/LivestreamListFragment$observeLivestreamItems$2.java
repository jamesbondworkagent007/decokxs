package com.okinc.oklive.app.ui.list.fragment;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeLivestreamItems$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44569sUu;
import o.C44565sUq;
import o.C44573sUy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44530sTh;
import o.sWg;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamListFragment$observeLivestreamItems$2 extends SuspendLambda implements Function2<List<? extends AbstractC44569sUu>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44573sUy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListFragment$observeLivestreamItems$2(C44573sUy c44573sUy, Continuation<? super LivestreamListFragment$observeLivestreamItems$2> continuation) {
        super(2, continuation);
        this.this$0 = c44573sUy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamListFragment$observeLivestreamItems$2 livestreamListFragment$observeLivestreamItems$2 = new LivestreamListFragment$observeLivestreamItems$2(this.this$0, continuation);
        livestreamListFragment$observeLivestreamItems$2.L$0 = obj;
        return livestreamListFragment$observeLivestreamItems$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AbstractC44569sUu> list, Continuation<? super Unit> continuation) {
        return ((LivestreamListFragment$observeLivestreamItems$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final boolean z;
        final boolean z2;
        final Integer num;
        RecyclerView recyclerView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            List<AbstractC44569sUu> currentList = this.this$0.OLrzqt().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "");
            int iIntValue = 0;
            if ((currentList instanceof Collection) && currentList.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = currentList.iterator();
                while (it.hasNext()) {
                    if (((AbstractC44569sUu) it.next()) instanceof AbstractC44569sUu.Activity) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if ((list instanceof Collection) && list.isEmpty()) {
                z2 = false;
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((AbstractC44569sUu) it2.next()) instanceof AbstractC44569sUu.Activity) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            if (z != z2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof AbstractC44569sUu.Activity) {
                        arrayList.add(obj2);
                    }
                }
                AbstractC44569sUu.Activity activity = (AbstractC44569sUu.Activity) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                String strOLrzqt = activity != null ? activity.OLrzqt() : null;
                InterfaceC44530sTh interfaceC44530sThKWHzl = this.this$0.KWHzl();
                if (interfaceC44530sThKWHzl != null) {
                    interfaceC44530sThKWHzl.copydefault(z2, strOLrzqt);
                }
            }
            this.this$0.OLrzqt().EZpvd(z2 && this.this$0.AkhnZx().valueOf());
            sWg swgAEQbTJ = this.this$0.AEQbTJ();
            RecyclerView.LayoutManager layoutManager = (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) ? null : recyclerView.getLayoutManager();
            final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                Integer numAEQbTJ = C56443yFo.AEQbTJ(linearLayoutManager.findFirstVisibleItemPosition());
                num = numAEQbTJ.intValue() != -1 ? numAEQbTJ : null;
            }
            if (num != null) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(num.intValue());
                Integer numAEQbTJ2 = viewFindViewByPosition != null ? C56443yFo.AEQbTJ(viewFindViewByPosition.getTop()) : null;
                if (numAEQbTJ2 != null) {
                    iIntValue = numAEQbTJ2.intValue();
                }
            }
            final int i = iIntValue;
            C44565sUq c44565sUqOLrzqt = this.this$0.OLrzqt();
            final C44573sUy c44573sUy = this.this$0;
            c44565sUqOLrzqt.submitList(list, new Runnable() { // from class: o.sUQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    LivestreamListFragment$observeLivestreamItems$2.invokeSuspend$lambda$4(c44573sUy, z, z2, num, linearLayoutManager, i);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(C44573sUy c44573sUy, boolean z, boolean z2, Integer num, LinearLayoutManager linearLayoutManager, int i) {
        RecyclerView recyclerView;
        if (!c44573sUy.valueOf || z || !z2) {
            if (num == null || linearLayoutManager == null) {
                return;
            }
            linearLayoutManager.scrollToPositionWithOffset(num.intValue(), i);
            return;
        }
        sWg swgAEQbTJ = c44573sUy.AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }
}
